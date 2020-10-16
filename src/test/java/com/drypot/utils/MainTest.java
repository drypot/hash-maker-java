package com.drypot.utils;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void shouldSuccess() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        assertThat(Main.makeHash("1")).isEqualTo("555BjkhiNWnXXip7Ca6I7Zt3sSakRbn/ncaYmgjvoHk=");
    }
}
