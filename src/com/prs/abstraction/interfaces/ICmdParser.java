package com.prs.abstraction.interfaces;

import com.prs.abstraction.enumic.ConstraintTypes;

public interface ICmdParser extends IParse {

     IOptioned AddOption(String name, Class<? extends Object> type, ConstraintTypes constraint) throws Exception;

     IFlagged AddFlag(String name) throws Exception;

     IKeyValuePaired AddKeyValuePair(String expression,String valueSeparator, Class<? extends Object> dataType, ConstraintTypes consTypee);
}
