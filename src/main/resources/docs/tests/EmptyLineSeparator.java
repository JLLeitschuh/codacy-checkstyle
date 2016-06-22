//#Patterns: EmptyLineSeparator
//#Issue: {"severity": "Info", "line": 6, "patternId": "EmptyLineSeparator"}
//#Issue: {"severity": "Info", "line": 12, "patternId": "EmptyLineSeparator"}

package org.example.EmptyLineSeparator;
import java.io.Serializable;

public class Something {
    private int fieldStandalone;

    private int fieldCoupled1;
    private String fieldCoupled2;


    public float fieldAfterMultipleEmptyLines;

    private void BarFoo() {

        System.out.print("This private method is NOT called!");
    } // unused

    private static final void ___FooBar() {


        System.out.print("This class member multiple empty lines.");
    }

           public void doSomething() {
        bar();
    }
}
