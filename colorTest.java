package com.lightcrafts.ui;

import static org.junit.Assert.*;

import org.junit.Test;


public class colorTest {

	@Test
	// Avoids dark colors
public void colorTest(){
	
	LightZoneSkin.Colors t = new LightZoneSkin.Colors();
	
	//Prevents colors from being sharp
	
	assertTrue("FrameBackground",252 > t.FrameBackground.getRed());
	assertTrue("ToolPanesBackground",252 > t.ToolPanesBackground.getRed());
	assertTrue("LabelForeground",252 > t.LabelForeground.getRed());
	assertTrue("ToolsBackground",252 > t.ToolsBackground .getRed());
	assertTrue("ToolTitleTextColor", 252 > t.ToolTitleTextColor.getRed());
	assertTrue("ToolPanesForeground",252 > t.ToolPanesForeground.getRed());
	assertTrue("BrowserSelectHighlight",252 > t.BrowserSelectHighlight .getRed());
	assertTrue("BrowserLabelBackground",252 > t.BrowserLabelBackground.getRed());
	assertTrue("BrowserLabelForeground",252 > t.BrowserLabelForeground.getRed());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getRed());
	assertTrue("BrowserImageTypeLabelBackground",252 > t. BrowserImageTypeLabelBackground.getRed());
	assertTrue("LZOrange",252 > t.LZOrange.getRed());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getRed());
	
	assertTrue("FrameBackground failed",252 > t.FrameBackground.getGreen());
	assertTrue("ToolPanesBackground",252 > t.ToolPanesBackground.getGreen());
	assertTrue("LabelForeground",252 > t.LabelForeground.getGreen());
	assertTrue("ToolsBackground",252 > t.ToolsBackground .getGreen());
	assertTrue("ToolTitleTextColor", 252 > t.ToolTitleTextColor.getGreen());
	assertTrue("ToolPanesForeground",252 > t.ToolPanesForeground.getGreen());
	assertTrue("BrowserSelectHighlight",252 > t.BrowserSelectHighlight .getGreen());
	assertTrue("BrowserLabelBackground",252 > t.BrowserLabelBackground.getGreen());
	assertTrue("BrowserLabelForeground",252 > t.BrowserLabelForeground.getGreen());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getGreen());
	assertTrue("BrowserImageTypeLabelBackground",252 > t. BrowserImageTypeLabelBackground.getGreen());
	assertTrue("LZOrange",252 > t.LZOrange.getGreen());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getGreen());
	
	assertTrue("FrameBackground failed",252 > t.FrameBackground.getBlue());
	assertTrue("ToolPanesBackground",252 > t.ToolPanesBackground.getBlue());
	assertTrue("LabelForeground",252 > t.LabelForeground.getBlue());
	assertTrue("ToolsBackground",252 > t.ToolsBackground .getBlue());
	assertTrue("ToolTitleTextColor", 252 > t.ToolTitleTextColor.getBlue());
	assertTrue("ToolPanesForeground",252 > t.ToolPanesForeground.getBlue());
	assertTrue("BrowserSelectHighlight",252 > t.BrowserSelectHighlight .getBlue());
	assertTrue("BrowserLabelBackground",252 > t.BrowserLabelBackground.getBlue());
	assertTrue("BrowserLabelForeground",252 > t.BrowserLabelForeground.getBlue());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getBlue());
	assertTrue("BrowserImageTypeLabelBackground",252 > t. BrowserImageTypeLabelBackground.getBlue());
	assertTrue("LZOrange",252 > t.LZOrange.getBlue());
	assertTrue("BrowserGroupColor",252 > t.BrowserGroupColor.getBlue());
	

	assertTrue("FrameBackground",3< t.FrameBackground.getRed());
	assertTrue("ToolPanesBackground",3< t.ToolPanesBackground.getRed());
	assertTrue("LabelForeground",3< t.LabelForeground.getRed());
	assertTrue("ToolsBackground",3< t.ToolsBackground .getRed());
	assertTrue("ToolTitleTextColor", 3< t.ToolTitleTextColor.getRed());
	assertTrue("ToolPanesForeground",3< t.ToolPanesForeground.getRed());
	assertTrue("BrowserSelectHighlight",3< t.BrowserSelectHighlight .getRed());
	assertTrue("BrowserLabelBackground",3< t.BrowserLabelBackground.getRed());
	assertTrue("BrowserLabelForeground",3< t.BrowserLabelForeground.getRed());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getRed());
	assertTrue("BrowserImageTypeLabelBackground",3< t. BrowserImageTypeLabelBackground.getRed());
	assertTrue("LZOrange",3< t.LZOrange.getRed());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getRed());
	
	assertTrue("FrameBackground failed",3< t.FrameBackground.getGreen());
	assertTrue("ToolPanesBackground",3< t.ToolPanesBackground.getGreen());
	assertTrue("LabelForeground",3< t.LabelForeground.getGreen());
	assertTrue("ToolsBackground",3< t.ToolsBackground .getGreen());
	assertTrue("ToolTitleTextColor", 3< t.ToolTitleTextColor.getGreen());
	assertTrue("ToolPanesForeground",3< t.ToolPanesForeground.getGreen());
	assertTrue("BrowserSelectHighlight",3< t.BrowserSelectHighlight .getGreen());
	assertTrue("BrowserLabelBackground",3< t.BrowserLabelBackground.getGreen());
	assertTrue("BrowserLabelForeground",3< t.BrowserLabelForeground.getGreen());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getGreen());
	assertTrue("BrowserImageTypeLabelBackground",3< t. BrowserImageTypeLabelBackground.getGreen());
	assertTrue("LZOrange",3< t.LZOrange.getGreen());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getGreen());
	
	assertTrue("FrameBackground failed",3< t.FrameBackground.getBlue());
	assertTrue("ToolPanesBackground",3< t.ToolPanesBackground.getBlue());
	assertTrue("LabelForeground",3< t.LabelForeground.getBlue());
	assertTrue("ToolsBackground",3< t.ToolsBackground .getBlue());
	assertTrue("ToolTitleTextColor", 3< t.ToolTitleTextColor.getBlue());
	assertTrue("ToolPanesForeground",3< t.ToolPanesForeground.getBlue());
	assertTrue("BrowserSelectHighlight",3< t.BrowserSelectHighlight .getBlue());
	assertTrue("BrowserLabelBackground",3< t.BrowserLabelBackground.getBlue());
	assertTrue("BrowserLabelForeground",3< t.BrowserLabelForeground.getBlue());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getBlue());
	assertTrue("BrowserImageTypeLabelBackground",3< t. BrowserImageTypeLabelBackground.getBlue());
	assertTrue("LZOrange",3< t.LZOrange.getBlue());
	assertTrue("BrowserGroupColor",3< t.BrowserGroupColor.getBlue());
}

}
