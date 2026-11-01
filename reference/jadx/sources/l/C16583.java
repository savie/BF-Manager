package l;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ܽۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public final class C16583 implements Attributes {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public XmlPullParser f53225;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    public C16583(XmlPullParser xmlPullParser) {
        this.f53225 = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f53225.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.f53225.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.f53225.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.f53225;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.f53225.getAttributeValue(i);
    }
}
