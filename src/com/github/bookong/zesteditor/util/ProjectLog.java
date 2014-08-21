package com.github.bookong.zesteditor.util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.github.bookong.zesteditor.ZestEditorPlugin;

/**
 * @author jiangxu
 *
 */
public class ProjectLog {
	
	public static void info(String msg) {
		IStatus status = new Status(IStatus.INFO, ZestEditorPlugin.PLUGIN_ID, IStatus.OK, msg, null);
		ILog log = ZestEditorPlugin.getDefault().getLog();
		log.log(status);
	}
	
}
