package Designpattern.Behavioral.Interpreter;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class Contexts {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Context {

    private static Map<String, List<Row>> tables = new HashMap<>();

    private String table;
    private String column;

    static {
        List<Row> list = new ArrayList<>();
        list.add(new Row("Abbass", "Cena"));
        list.add(new Row("John", "Travolta"));
        list.add(new Row("Liam", "Neeson"));

        tables.put("people", list);
    }

    private int colIndex = -1;

    private static final Predicate<String> matchAnyString = s -> s.length() > 0;
    private static final Function<String, Stream<? extends String>> matchAllColumns = Stream::of;

    private Predicate<String> whereFilter = matchAnyString;
    private Function<String, Stream<? extends String>> columnMapper = matchAllColumns;

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    void setTable(String table) {
        this.table = table;
    }

    void setFilter(Predicate<String> filter) {
        whereFilter = filter;
    }

    void clear() {
        column = "";
        columnMapper = matchAllColumns;
        whereFilter = matchAnyString;
    }

    List<String> search() {
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .flatMap(columnMapper)
                .filter(whereFilter)
                .collect(Collectors.toList());

        clear();
        return result;
    }

    private void setColumnMapper() {
        switch (column) {
            case "*":
                colIndex = -1;
                break;

            case "name":
                colIndex = 0;
                break;
            case "lastName":
                colIndex = 1;
                break;
        }

        if (colIndex != -1) {
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
        }
    }

}

interface Expression {
    List<String> interpret(Context ctx);
}

class From implements Expression {
    private String table;
    private Where where;

    public From(String table) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context ctx) {

        ctx.setTable(table);
        if (where == null) {
            return ctx.search();
        }

        return where.interpret(ctx);
    }
}

class Row {

    private String name;
    private String lastName;

    public Row(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}

class Select implements Expression {

    private String column;
    private From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx);
    }
}

class Where implements Expression {
    private Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setFilter(filter);
        return ctx.search();
    }
}