package com.devenbawale.lqmtotxt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;

public class LqmToTxtApplicationTest {

    private PrintStream console;

    private final String EOL = System.getProperty("line.separator");

    @Before
    public void saveConsole() {
        this.console = System.out;
    }

    @Test
    public void testMain() throws Exception {
        //Setup the fixture
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        LqmToTxtApplication lqmToTxtApplication = spy(new LqmToTxtApplication());
        System.setOut(new PrintStream(bytes));
        String[] args = new String[1];

        //Execute the SUT
        lqmToTxtApplication.main(args);

        //Validation
        assertThat(bytes.toString(), is(equalTo(String.format("Test%s", EOL))));
    }

    @Test
    public void testMain_tooFewArguments() throws Exception {
        //Setup the fixture
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        LqmToTxtApplication lqmToTxtApplication = spy(new LqmToTxtApplication());
        System.setOut(new PrintStream(bytes));
        String[] args = new String[0];

        //Execute the SUT
        lqmToTxtApplication.main(args);

        //Validation
        assertThat(bytes.toString(), is(equalTo(String.format("Incorrect number of arguments\n. Usage: lqmtotxtapplication <filename.lqm>%s", EOL))));
    }

    @Test
    public void testMain_tooManyArguments() throws Exception {
        //Setup the fixture
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        LqmToTxtApplication lqmToTxtApplication = spy(new LqmToTxtApplication());
        System.setOut(new PrintStream(bytes));
        String[] args = new String[2];

        //Execute the SUT
        lqmToTxtApplication.main(args);

        //Validation
        assertThat(bytes.toString(), is(equalTo(String.format("Incorrect number of arguments\n. Usage: lqmtotxtapplication <filename.lqm>%s", EOL))));
    }

    @After
    public void restoreConsole() {
        System.setOut(console);
    }
}
