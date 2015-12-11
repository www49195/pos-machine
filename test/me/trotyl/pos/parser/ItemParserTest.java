package me.trotyl.pos.parser;

import me.trotyl.pos.model.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ItemParserTest {

    private ItemParser parser;

    @Before
    public void setUp() throws Exception {
        parser = new ItemParser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void parse_should_have_proper_result() {
        List<String> inputs = asList("ITEM000001:40", "ITEM000003:50", "ITEM000005:60");

        List<Item> items = parser.parse(inputs);

        assertThat(items.size(), is(3));
        assertThat(items.get(0).getBarcode(), is("ITEM000001"));
        assertThat(items.get(0).getPrice(), is(40.0));
        assertThat(items.get(1).getBarcode(), is("ITEM000003"));
        assertThat(items.get(1).getPrice(), is(50.0));
        assertThat(items.get(2).getBarcode(), is("ITEM000005"));
        assertThat(items.get(2).getPrice(), is(60.0));
    }
}
