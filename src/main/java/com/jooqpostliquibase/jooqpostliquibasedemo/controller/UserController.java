package com.jooqpostliquibase.jooqpostliquibasedemo.controller;

import com.jooqpostliquibase.jooqpostliquibasedemo.entity.MyUser;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.jooqpostliquibase.jooqpostliquibasedemo.generated.db.Tables.USER;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.row;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private DSLContext dslContext;

    @GetMapping("/user")
    @ResponseBody
    public List<MyUser> getUsers() {
        return dslContext.selectFrom(USER).fetchInto(MyUser.class);
    }

    @GetMapping("/user/{userId}")
    public void getUser(@PathVariable int userId, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        dslContext.select(USER.ID,USER.FIRSTNAME, USER.LASTNAME).from(USER).where(USER.ID.eq(userId)).fetch()
                .formatJSON(httpServletResponse.getOutputStream());

    }

    @GetMapping("/count")
    public void getUserCount(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        dslContext.select(count(USER.ID)).from(USER).fetch()
                .formatJSON(httpServletResponse.getOutputStream());
    }


    @GetMapping("/test/{newName}")
    @ResponseBody
    public String test(@PathVariable String newName) {
        dslContext.update(USER).set(row(USER.FIRSTNAME), row(newName))
                .where(USER.ID.eq(1)).execute();

        // creation and returning native SQL query
        return dslContext.update(USER).set(row(USER.FIRSTNAME), row(newName))
                .where(USER.ID.eq(1)).getSQL();
    }


}

