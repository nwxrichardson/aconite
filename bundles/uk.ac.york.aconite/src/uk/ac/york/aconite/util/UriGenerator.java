/*********************************************************************
* Copyright (c) 2024 University of York, Rolls-Royce Controls
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package uk.ac.york.aconite.util;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;

public class UriGenerator {
	
	public static String getETLPlatform (IFile ecslipseFile) {
		String txt = ecslipseFile.getLocation().toString();
		txt = txt.replace("ecore","etl");
		return txt;
	}
	
	public static URI getPlatformURI(File eclipseFile) {
		return URI.createPlatformResourceURI(eclipseFile.getPath(), true);
	}
	
	public static URI getPlatformURI(IFile eclipseFile) {
		return URI.createPlatformResourceURI(eclipseFile.getFullPath().toOSString(), true);
	}
	
	public static URI getSuperPlatformURI(IFile eclipseFile) {
		String currentTxt = eclipseFile.getFullPath().toString();
		String[] splitTxt = currentTxt.split("/");
		splitTxt[splitTxt.length-1] = "super" + splitTxt[splitTxt.length-1];
		currentTxt = "";
		for (String i : splitTxt) {
			currentTxt += "/" + i;
		}
		return URI.createPlatformResourceURI(currentTxt, true);
	}
	public static URI getSuperPlatformURI(URI ecore) {
		String currentTxt = ecore.toString();
		String[] splitTxt = currentTxt.split("/");
		splitTxt[splitTxt.length-1] = "super" + splitTxt[splitTxt.length-1];
		currentTxt = "";
		for (String i : splitTxt) {
			currentTxt += "/" + i;
		}
		//TODO Remove work around
		currentTxt = currentTxt.replace("/platform:/resource", "");
		return URI.createPlatformResourceURI(currentTxt, true);
	}
	
	public static URI getMatchPlatformURI(IFile eclipseFile) {
		String currentTxt = eclipseFile.getFullPath().toString();
		String[] splitTxt = currentTxt.split("/");
		splitTxt[splitTxt.length-1] = "match" + splitTxt[splitTxt.length-1];
		currentTxt = "";
		for (String i : splitTxt) {
			currentTxt += "/" + i;
		}
		return URI.createPlatformResourceURI(currentTxt, true);
	}
	
	public static URI getOdesignURI(IFile eclipseFile) {
		String currentTxt = eclipseFile.getFullPath().toString();
		URI rtn = URI.createPlatformResourceURI(currentTxt,true);
		return rtn.trimFileExtension().appendFileExtension("odesign");
	}
	
	public static URI getGenEcoreURI(IFile eclipseFile) {
		String currentTxt = eclipseFile.getFullPath().toString();
		return URI.createPlatformResourceURI(currentTxt.replace(".ecore", "_GEN.ecore"), true);
	}
	
	public static URI getNewProjectURI(IFile eclipseFile) {
		IPath newProjectPath = IPath.ROOT;
		IPath currentTxt = eclipseFile.getFullPath();
		newProjectPath = newProjectPath.append(currentTxt.segment(0)+".design/description")
			.append(currentTxt.removeFirstSegments(1))
			.removeFileExtension()
			.addFileExtension("odesign");
		System.out.println(newProjectPath);
		return URI.createPlatformResourceURI(newProjectPath.toString(), true);
	}
	
}
