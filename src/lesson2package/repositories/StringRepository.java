package lesson2package.repositories;

public class StringRepository {

    private String array[][];

    public StringRepository(){
        array = new String[][]{
                {"34", "123", "1212", "231"},
                {"3234", "12423", "1422", "1324"},
                {"324", "1213", "e1212", "12531"},
                {"314", "1423", "1215552", "2341"},
        };
    }

    public String[][] getArray(){
        return array;
    }

}
