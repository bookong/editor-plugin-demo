package com.github.bookong.zesteditor.plugin.views;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.part.ViewPart;

/**
 * 导航视图
 * 
 * @author jiangxu
 *
 */
public class NavigatorView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite topComp = new Composite(parent, SWT.NONE);
		topComp.setLayout(new FillLayout());
		List list = new List(topComp, SWT.BORDER);
//		list.add("中国");
//		list.add("美国");
		
//		IWorkbench iWorkbench = ZestEditorPlugin.getDefault().getWorkbench();
		
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			for (IProject project : root.getProjects()) {
				IProjectDescription projectDesc = project.getDescription();
				if (projectDesc.hasNature("org.eclipse.jdt.core.javanature")
						&& projectDesc.hasNature("org.eclipse.m2e.core.maven2Nature") 
						&& project.isAccessible()) {
					// 判断由性质扩展id指定的项目性质是否已经添加到该项目中。
					// 必须是打开的项目，且必须是 maven 的 java 项目
					list.add(project.getName());
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
