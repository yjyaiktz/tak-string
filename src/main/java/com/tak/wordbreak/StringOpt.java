package com.tak.wordbreak;

import java.util.List;

public interface StringOpt<T extends OptBase>{

    List<String> wordBreak(T t);

}
