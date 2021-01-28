


# The final exam description

The final exam consists of a single problem that has two parts. First, you will create a semantically meaningless but syntactically correct object-oriented functional Java program that implements specific language constructs from the Java Language Specification 14 (JLS14) as indicated below. Your program will be semantically meaningless in the sense that you will not realize in it any concrete algorithms or real-world models. However, your program should pass the Java compilation and run for different values of the input variables, if you have ones. Second, you will explain the behavior of your program using the rules of JLS14 for all appropriate groups of input values that exercise as many execution paths in your program as possible to cover all ranges of the program's behavior. The total grade for this final exam is 25% and points will be taken away from this grade for missing key required language constructs and constraints from your program and for missing or incorrect explanations of its behavior. Missing references to JLS14 in your explanations will also result in losing grade points.

Consider the following Java program below.

public class ExamScopes {
    public int VALUE = 10;
    protected static int OBJVALUE;

    static {
        ExamScopes.OBJVALUE = new ExamScopes(3).VALUE * 10;
    }

    public ExamScopes(int v) {
        VALUE = v;
    }

    public ExamScopes() {
        VALUE = 1;
    }

    static {
        ExamScopes.OBJVALUE *= 2;
    }

    public static class ChildScope {
        protected static int OBJVALUE;
        interface SomeName {
            public void m(Integer a);
        }

        static {
            OBJVALUE = ExamScopes.OBJVALUE - 5;
        }

    }

    public static void main(String[] arg) {
        final int i = 1;
        ChildScope.SomeName f = (Integer x12) -> {
            int j = 0;
            label1:
            for (; j < x12+i; j++ ) {
                label2:
                if (OBJVALUE < 70) {
                    System.out.println(OBJVALUE += new ExamScopes(5).VALUE);
                    if (OBJVALUE < 100)
                        break label2;
                    else break label1;
                }
            }
        };
        f.m(15);
        System.out.println(ExamScopes.OBJVALUE);
    }
}
This program exercises a number of language constructs from JLS14 like many similar programs that we studied in this class: static scopes and variables, inner classes and various levels of scope nesting, variable shadowing, lambda functions, functional interfaces, recursion and various expression types. You will create a similar in spirit but your own program using the guidance of the JLS14. Below are the sections and paragraph of the specification that describe specific language constructs that you must instantiate in your program.

- Chapter 3, Lexical Structure.
 - use unicode (par 1) in identifiers (par 3.8) and literals (par 3.10.1 to 3.10.5)
 - use the null literal (par 3.10.7)

- Chapter 8, Classes.
 - use all paragraphs to create classes and their members (enums in par 8.9 only for grad students)
 - multiple level of inheritance and multiple nesting levels combined with overridden methods whose invocation will require dynamic dispatch (par 8.4.8 and more)
 - make some classes and some methods parameterized.
 - use all forms of polymorphism.

- Chapter 9: Interfaces.
 - create and use interfaces in conjunction with classes except for annotations (i.e., exclude paragraphs 9.6 and 9.7)

- Chapter 16: Assignments
 - undergrads skip 16.2.14 and 16.3-16.9
 - grad students skip 16.2.14 and 16.5

- Chapter 15: Expressions
 - undergrads skip 15.4

- Chapter 10: Arrays - only for grad students

- Chapter 11: Exceptions - only for grad students

- Functional programming
 - use paragraphs 9.8 and 9.9.
 - implement lambda functions that return lambda functions that your code will invoke at some point later.
 - implement one function that take lists of some other functions and composes them into a function that it returns and will be invoked in your code.

- Chapter 14: Blocks and Statements:
 - skip 14.19, 14.21 and 14.22
 - undergrads skip 14.10

- Chapter 6, Names.
 - use different access controls (par 6.6)
 - use shadowing and obscuring (par 6.4)
 - show the need to use fully qualified names (par 6.7)
