package com.gradwyn.mason;

import android.util.Log;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Perception;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test() {
        Amplify.DataStore.query(
                Perception.class,
                Where.matches(Perception.NAME.eq("ceshi")),
                items -> {
                    while (items.hasNext()) {
                        Perception table = items.next();
                        System.out.println(table.toString());
                    }
                },
                failure -> Log.e("error", "Query failed.", failure)
        );
    }
}