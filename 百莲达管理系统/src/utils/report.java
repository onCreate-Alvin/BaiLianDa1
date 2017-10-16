package situ.bld.util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.TableModel;

import org.jfree.report.CustomPageDefinition;
import org.jfree.report.Element;
import org.jfree.report.ElementAlignment;
import org.jfree.report.ItemBand;
import org.jfree.report.JFreeReport;
import org.jfree.report.JFreeReportBoot;
import org.jfree.report.PageDefinition;
import org.jfree.report.PageHeader;
import org.jfree.report.ReportHeader;
import org.jfree.report.ReportProcessingException;
import org.jfree.report.ShapeElement;
import org.jfree.report.SimplePageDefinition;
import org.jfree.report.elementfactory.ComponentFieldElementFactory;
import org.jfree.report.elementfactory.LabelElementFactory;
import org.jfree.report.elementfactory.ShapeElementFactory;
import org.jfree.report.elementfactory.StaticDrawableElementFactory;
import org.jfree.report.elementfactory.StaticImageElementFactory;
import org.jfree.report.elementfactory.StaticShapeElementFactory;
import org.jfree.report.elementfactory.TextFieldElementFactory;
import org.jfree.report.modules.gui.base.PreviewDialog;
import org.jfree.ui.FloatDimension;

import situ.bld.bill.publicvalues;
import situ.bld.controls.ColumnInfo;

public class report {
	static{
		 JFreeReportBoot.getInstance().start();
	}
public static void ShowPreviewWindow(String title, TableModel data,ArrayList<ColumnInfo> colinfos){
	PreviewDialog preview=null;
	try {
		preview = new PreviewDialog(GetReport(title, data, colinfos));
	} catch (ReportProcessingException e) {
	}
    preview.pack();
    preview.setVisible(true);
}

public static int pagewidth=400;
public static int pageheight=1200;
public static int pageheaderheight=120;
public static boolean showline=true;
public static int bindjg=-3;
public static int bindleft=50;
public static int bindright=50;

public static int titlefontsize=25;
public static int txtfontsize=15;
public static int datafontsize=15;
public static int rowheight=25;
public static int headerheight=40;
private static JFreeReport GetReport(String title, TableModel data,ArrayList<ColumnInfo> colinfos){
	JFreeReport report = new JFreeReport();
	
	
	PageFormat f=new PageFormat();
	Paper p=new Paper();
	p.setSize(pagewidth, pageheight);
	p.setImageableArea(0, 0, pagewidth, pageheight);
	f.setPaper(p);
	f.setOrientation(PageFormat.LANDSCAPE);
	
	SimplePageDefinition  d=new SimplePageDefinition(f);
	
	report.setPageDefinition(d);
    report.setName(title);
    report.setReportHeader(new ReportHeader());
    report.setPageHeader(GetPageHeader(title, colinfos));
    report.setItemBand(GetItemBand(data, colinfos));
    report.setData(data);
	return report;
}

private static PageHeader GetPageHeader(String title, ArrayList<ColumnInfo> colinfos){
	PageHeader h=new PageHeader();
	int s= title.length()*titlefontsize;
     h.addElement(GetHeaderText(titlefontsize, Color.black, 0, 0,0, titlefontsize,title,ElementAlignment.MIDDLE));
     h.addElement(GetHeaderText(15, Color.black, 0, 35,0, 15,"制表日期:"+publicvalues.GetDate(0),ElementAlignment.LEFT));
     int x=bindleft;
 	for(ColumnInfo info:colinfos){
 		if(info.hide) continue;
 		if(!info.visible) continue;
 		
 		ShapeElement  c1=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(x+bindjg,pageheaderheight-headerheight,x+bindjg,pageheaderheight));
 		
 		if(x+bindright+info.width>pageheight) break;
 		 LabelElementFactory f = new LabelElementFactory();
 	     
 	     f.setAbsolutePosition(new Point2D.Float(x, pageheaderheight-headerheight));
 	     f.setMinimumSize(new FloatDimension(info.width, headerheight));
 	    x+=info.width;
 	     f.setColor(Color.black);
 	     f.setFontSize(txtfontsize);
 	     f.setHorizontalAlignment(ElementAlignment.CENTER);
 	     f.setVerticalAlignment(ElementAlignment.MIDDLE);
 	     f.setText(info.text);
 	     h.addElement(f.createElement());
 	    if(showline)h.addElement(c1);
 	}
 	 if(showline){
	ShapeElement  c2=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(x+bindjg,pageheaderheight-headerheight,x+bindjg,pageheaderheight));
	ShapeElement  e1=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(bindleft+bindjg,pageheaderheight-headerheight,x+bindjg,pageheaderheight-headerheight));
	ShapeElement  e2=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(bindleft+bindjg,pageheaderheight,x+bindjg,pageheaderheight));
	h.addElement(c2);
 	 h.addElement(e1);
 	h.addElement(e2);
    }
 
	return h;
}
private static ItemBand GetItemBand( TableModel data, ArrayList<ColumnInfo> colinfos){
	ItemBand b=new ItemBand();
	int x=bindleft;
	for(ColumnInfo info:colinfos){
		if(info.hide) continue;
		if(!info.visible) continue;
		ShapeElement  c1=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(x+bindjg,0,x+bindjg,rowheight));
 		
		if(x+bindright+info.width>pageheight) break;
	TextFieldElementFactory factory = new TextFieldElementFactory();
      factory.setAbsolutePosition(new Point2D.Float(x, 0));
      factory.setMinimumSize(new FloatDimension(info.width, rowheight));
      x+=info.width;
      factory.setColor(Color.black);
      factory.setFontSize(datafontsize);
      factory.setHorizontalAlignment(ElementAlignment.LEFT);
      factory.setVerticalAlignment(ElementAlignment.MIDDLE);
      factory.setNullString("-");
      factory.setFieldname(info.text);
     b.addElement(factory.createElement());
     if(showline)b.addElement(c1);
	}
	 if(showline){
			ShapeElement  c2=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(x+bindjg,0,x+bindjg,rowheight));
			ShapeElement  e1=StaticShapeElementFactory.createLineShapeElement("",Color.black, new BasicStroke(1),new Line2D.Float(bindleft+bindjg,rowheight,x+bindjg,rowheight));
			b.addElement(c2);
		 	 b.addElement(e1);
		    }
	return b;
}

private static Element GetHeaderText(int fontsize,Color txtColor,int x,int y,int w,int h,String txt,ElementAlignment ali){
	LabelElementFactory factory = new LabelElementFactory();
	int lx=0;
	int s= txt.length()*fontsize;
	if(x==0){
	if(ali.equals(ElementAlignment.MIDDLE)){
		lx=(pageheight-bindleft-bindright-s)/2;
	}else if(ali.equals(ElementAlignment.RIGHT)){
		lx=pageheight-bindleft-bindright-s;
	}else{
		lx=bindleft;
	}
	}else{
		lx=x;
	}
	if(w==0){
		w=s;
	}
	
    factory.setAbsolutePosition(new Point2D.Float(lx,y));
    factory.setMinimumSize(new FloatDimension(w,h));
    factory.setColor(txtColor);
    factory.setFontSize(fontsize);
    factory.setHorizontalAlignment(ElementAlignment.CENTER);
    factory.setVerticalAlignment(ElementAlignment.MIDDLE);
    factory.setText(txt);
    return factory.createElement();
}
 
}
