package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

/* JADX INFO: renamed from: l.ۘ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4449 extends DefaultHandler2 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15917;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Document f15919;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f15920;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15922;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Locator f15924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15925;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15923 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f15918 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f15921 = new StringBuilder();

    public C4449(String str) {
        this.f15920 = str;
        Document documentNewDocument = C21603.f69014.newDocumentBuilder().newDocument();
        this.f15919 = documentNewDocument;
        documentNewDocument.setUserData("contents", str, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Document m14146() {
        m14145();
        return this.f15919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14145() {
        m14143();
        while (true) {
            ArrayList arrayList = this.f15918;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C18011.m41990(arrayList, 1);
            ((C14889) element.getUserData("offsets")).m35840(m14144());
            m14142(element);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f15924 = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Document document = this.f15919;
        try {
            m14143();
            Element elementCreateElementNS = document.createElementNS(str, str3);
            for (int i = 0; i < attributes.getLength(); i++) {
                if (attributes.getURI(i) != null && !attributes.getURI(i).isEmpty()) {
                    Attr attrCreateAttributeNS = document.createAttributeNS(attributes.getURI(i), attributes.getQName(i));
                    attrCreateAttributeNS.setValue(attributes.getValue(i));
                    elementCreateElementNS.setAttributeNodeNS(attrCreateAttributeNS);
                } else {
                    Attr attrCreateAttribute = document.createAttribute(attributes.getQName(i));
                    attrCreateAttribute.setValue(attributes.getValue(i));
                    elementCreateElementNS.setAttributeNode(attrCreateAttribute);
                }
            }
            elementCreateElementNS.setUserData("offsets", m14141(m14144()), null);
            this.f15918.add(elementCreateElementNS);
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        m14143();
        Element element = (Element) C18011.m41990(this.f15918, 1);
        ((C14889) element.getUserData("offsets")).m35840(m14144());
        m14142(element);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        m14143();
        Comment commentCreateComment = this.f15919.createComment(new String(cArr, i, i2));
        C14889 c14889M14144 = m14144();
        C14889 c14889M14141 = m14141(c14889M14144);
        c14889M14141.m35840(c14889M14144);
        commentCreateComment.setUserData("offsets", c14889M14141, null);
        m14142(commentCreateComment);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14142(Node node) {
        ArrayList arrayList = this.f15918;
        if (arrayList.isEmpty()) {
            this.f15919.appendChild(node);
        } else {
            ((Element) j$$ExternalSyntheticOutline0.m(arrayList, 1)).appendChild(node);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14889 m14141(C14889 c14889) {
        String str;
        int iM35844 = c14889.m35844();
        do {
            iM35844--;
            if (iM35844 < 0) {
                return c14889;
            }
            str = this.f15920;
        } while (str.charAt(iM35844) != '<');
        int iM35841 = c14889.m35841();
        int iM35845 = c14889.m35844();
        for (int i = iM35844; i < iM35845; i++) {
            if (str.charAt(i) == '\n') {
                iM35841--;
            }
        }
        int i2 = iM35844 - 1;
        int i3 = 0;
        while (i2 >= 0 && str.charAt(i2) != '\n') {
            i2--;
            i3++;
        }
        return new C14889(iM35841, i3, iM35844);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C14889 m14144() {
        int i;
        int i2;
        int lineNumber = this.f15924.getLineNumber() - 1;
        int columnNumber = this.f15924.getColumnNumber() - 1;
        String str = this.f15920;
        int length = str.length();
        while (this.f15923 < lineNumber && (i = this.f15917) < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\r' || (i2 = this.f15917) >= length - 1) {
                if (cCharAt == '\n') {
                    this.f15923++;
                    this.f15925 = 0;
                } else {
                    this.f15925++;
                }
            } else if (str.charAt(i2 + 1) != '\n') {
                this.f15923++;
                this.f15925 = 0;
            }
            this.f15917++;
        }
        for (int i3 = this.f15925; i3 < columnNumber; i3++) {
            int i4 = this.f15917;
            if (i4 == length || str.charAt(i4) == '\n') {
                break;
            }
            this.f15917++;
        }
        if (this.f15917 >= length) {
            this.f15917 = length;
        }
        this.f15925 = columnNumber;
        return new C14889(this.f15923, columnNumber, this.f15917);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void startCDATA() {
        m14143();
        this.f15922 = true;
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void endCDATA() {
        m14143();
        this.f15922 = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f15921.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m14143() {
        StringBuilder sb = this.f15921;
        if (sb.length() > 0 || this.f15922) {
            ArrayList arrayList = this.f15918;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            boolean z = this.f15922;
            Document document = this.f15919;
            element.appendChild(z ? document.createCDATASection(sb.toString()) : document.createTextNode(sb.toString()));
            sb.setLength(0);
        }
    }
}
