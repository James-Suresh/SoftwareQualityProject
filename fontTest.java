package com.lightcrafts.ui;

import static org.junit.Assert.*;

import org.junit.Test;


public class fontTest {

	@Test
	// Avoids dark colors
public void fontTest(){
	
	LightZoneSkin.LightZoneFontSet  t = new LightZoneSkin.LightZoneFontSet();
	
	assertTrue("FrameBackground",3 < t.controlFont.getSize());
	assertTrue("menuFont",3 < t.menuFont.getSize());
	assertTrue("titleFont",3 < t.titleFont.getSize());
	assertTrue("windowTitleFont",3 < t.windowTitleFont.getSize());
	assertTrue("smallFont",3 < t.smallFont.getSize());
	
	assertTrue("FrameBackground",30 > t.controlFont.getSize());
	assertTrue("menuFont",30 > t.menuFont.getSize());
	assertTrue("titleFont",30 > t.titleFont.getSize());
	assertTrue("windowTitleFont",30 > t.windowTitleFont.getSize());
	assertTrue("smallFont",30 > t.smallFont.getSize());
	
	
	
	
	

}
	
}
