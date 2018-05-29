package hello;

/**
 * Klasa reprezentująca wynik wyszukiwania frazy w algorytmnie indeksowania
 * String table - nazwa tebeli
 * String countryName- nazwa państwa
 * String column - nazwa kolumny w tabeli
 * String result - wpis z bazy danych
 */
public class Result {

    private String table;
    private String countryName;
    private String column;
    private String result;

    Result(String table, String countryName, String column, String result){
        this.table=table;
        this.countryName=countryName;
        this.column=column;
        this.result=result;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString(){
        return table + " " + column + " " + countryName + " -> " + result + "\n";
    }
}
