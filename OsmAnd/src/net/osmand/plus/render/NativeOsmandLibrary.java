package net.osmand.plus.render;


import net.osmand.binary.BinaryMapDataObject;
import net.osmand.plus.render.OsmandRenderer.RenderingContext;
import net.osmand.render.RenderingRuleSearchRequest;
import android.graphics.Bitmap;

public class NativeOsmandLibrary {
	
	static {
		System.loadLibrary("osmand");
	}
	
	public static native String generateRendering(RenderingContext rc, BinaryMapDataObject[] objects, Bitmap bmp, 
			boolean useEnglishNames, RenderingRuleSearchRequest render, int defaultColor);
	
}