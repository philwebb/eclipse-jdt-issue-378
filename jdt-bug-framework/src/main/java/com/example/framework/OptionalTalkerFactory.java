package com.example.framework;

import com.example.lib.Talker;
import com.example.optionallib.SecondOptionalTalker;
import com.example.optionallib.FirstOptionalTalker;

public class OptionalTalkerFactory {

	public Talker create(Type type) {
		if (type == null) {
			return null;
		}
		return Boolean.getBoolean("talker.mode") ? new FirstOptionalTalker()
				: new SecondOptionalTalker();
	}

	public static enum Type {

		DEFAULT, OPTIONAL;

	}

}
