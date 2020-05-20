package com.company.data;

import java.sql.ResultSet;

public interface EntityBase {
    static String getSelectSql() {
        return null;
    }
    static EntityBase getEntity(ResultSet rs) {
        return null;
    }

}
