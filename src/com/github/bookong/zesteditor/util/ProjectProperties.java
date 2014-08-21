package com.github.bookong.zesteditor.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangxu
 *
 */
public class ProjectProperties {
	private static ProjectProperties instance = null;
	private Map propertyMap = new HashMap();

	private ProjectProperties() {
	}

	public static ProjectProperties getInstance() {
		if (ProjectProperties.instance == null) {
			ProjectProperties.instance = new ProjectProperties();
		}
		return ProjectProperties.instance;
	}
	
//	public void loadAllProperty(IWorkspace workspace) {
//		IProject[] projects = workspace.getRoot().getProjects();
//		for (int i = 0; i < projects.length; i++) {
//			IProject project = projects[i];
//			if (project.isOpen()) {
//				loadProjectProperties(project);
//			}
//		}
//	}
}
