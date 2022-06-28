package com.example;

public class DictionaryValue {

        int id;
        int intKey;
        String stringKey;
        String name;
        String value;

    public DictionaryValue(int id, int intKey, String stringKey, String name, String value) {
        this.id = id;
        this.intKey = intKey;
        this.stringKey = stringKey;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntKey() {
        return intKey;
    }

    public void setIntKey(int intKey) {
        this.intKey = intKey;
    }

    public String getStringKey() {
        return stringKey;
    }

    public void setStringKey(String stringKey) {
        this.stringKey = stringKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
