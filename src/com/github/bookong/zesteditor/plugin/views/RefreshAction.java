package com.github.bookong.zesteditor.plugin.views;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.internal.IWorkbenchGraphicConstants;
import org.eclipse.ui.internal.WorkbenchImages;

/**
 * @author jiangxu
 *
 */
public class RefreshAction extends Action {

	public RefreshAction() {
		ImageDescriptor imageDesc = WorkbenchImages.getImageDescriptor("IMG_ETOOL_HOME_NAV");
		setHoverImageDescriptor(imageDesc);
		setText("Refresh");
	}
	
	@Override
	public void run() {
		
	}
}
