/*
 * This file is generated by jOOQ.
 */
package com.jooqpostliquibase.jooqpostliquibasedemo.generated.db.tables.records;


import com.jooqpostliquibase.jooqpostliquibasedemo.generated.db.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user.firstname</code>.
     */
    public void setFirstname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.lastname</code>.
     */
    public void setLastname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user.lastname</code>.
     */
    public String getLastname() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.FIRSTNAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.LASTNAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstname();
    }

    @Override
    public String component3() {
        return getLastname();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstname();
    }

    @Override
    public String value3() {
        return getLastname();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String firstname, String lastname) {
        super(User.USER);

        setId(id);
        setFirstname(firstname);
        setLastname(lastname);
    }
}
