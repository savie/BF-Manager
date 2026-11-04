package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class XpathUtils {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Log f843 = LogFactory.m296(XpathUtils.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static DocumentBuilderFactory f842 = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Document m795(String str) throws SAXException, IOException {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f834)));
        Document document = f842.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return document;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m794(String str, Document document) {
        if (document == null) {
            return null;
        }
        if (".".equals(str) || ((Node) XPathFactory.newInstance().newXPath().evaluate(str, document, XPathConstants.NODE)) != null) {
            return XPathFactory.newInstance().newXPath().evaluate(str, document).trim();
        }
        return null;
    }
}
