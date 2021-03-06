package com.pataniqa.example;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

import org.fluentlenium.adapter.FluentTest;

public class ExampleTest extends FluentTest {
    @Test
    public void title_of_bing_should_contain_search_query_name() {
        goTo("http://www.bing.com");
        fill("#sb_form_q").with("FluentLenium");
        submit("#sb_form_go");
        assertThat(title()).contains("FluentLenium");
    }
}
