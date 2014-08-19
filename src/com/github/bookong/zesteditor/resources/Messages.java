package com.github.bookong.zesteditor.resources;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.github.bookong.zesteditor.resources.messages"; //$NON-NLS-1$
	public static String SampleAction_0;
	public static String SampleAction_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
