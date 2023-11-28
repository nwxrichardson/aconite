package uk.ac.york.aconite.util;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

public class SDScore {
	
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
		return URI.createPlatformResourceURI(currentTxt.replace(".ecore", ".odesign"), true);
	}
	
	public static URI getGenEcoreURI(IFile eclipseFile) {
		String currentTxt = eclipseFile.getFullPath().toString();
		return URI.createPlatformResourceURI(currentTxt.replace(".ecore", "_GEN.ecore"), true);
	}
	
}
