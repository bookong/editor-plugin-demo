package com.github.bookong.zesteditor.plugin.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionGroup;

/**
 * @author jiangxu
 *
 */
public class NavigatorActionGroup extends ActionGroup {

	/** 加入按钮 */
	public void fillActionBars(IActionBars actionBars) {
		if (actionBars == null) {
			return;
		}
		
		IToolBarManager toolBar = actionBars.getToolBarManager();
		toolBar.add(new RefreshAction());
	}
}
