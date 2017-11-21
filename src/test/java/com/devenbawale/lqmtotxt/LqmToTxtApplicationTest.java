package com.devenbawale.lqmtotxt;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.mockito.Mockito.spy;

public class LqmToTxtApplicationTest {

    @Test
    public void testIntegerToString() throws Exception {
        //Setup the fixture
        LqmToTxtApplication lqmToTxtApplication = spy(new LqmToTxtApplication());

        //Execute the SUT
        String result = lqmToTxtApplication.integerToString(2);

        //Validation
        assertThat(result, is(not(nullValue())));
        assertThat(result, is(equalTo("2")));


    }

    @Test
    public void testLongToString() throws Exception {
        //Setup the fixture
        LqmToTxtApplication lqmToTxtApplication = spy(new LqmToTxtApplication());

        //Execute the SUT
        String result = lqmToTxtApplication.longToString(2L);

        //Validation
        assertThat(result, is(not(nullValue())));
        assertThat(result, is(equalTo("2")));
    }
}
