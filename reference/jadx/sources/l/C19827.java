package l;

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

/* JADX INFO: renamed from: l.᩶֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19827 extends DefaultHandler2 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Document f63636;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f63637;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63638;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Locator f63639;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63640;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f63641;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f63633 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63635 = new ArrayList();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f63634 = new StringBuilder();

    public C19827(String str) {
        this.f63641 = str;
        Document documentNewDocument = C16299.f52500.newDocumentBuilder().newDocument();
        this.f63636 = documentNewDocument;
        documentNewDocument.setUserData("contents", str, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Document m45078() {
        m45077();
        return this.f63636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45077() {
        m45076();
        while (true) {
            ArrayList arrayList = this.f63635;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C17745.m41308(arrayList, 1);
            ((C0070) element.getUserData("offsets")).m989(m45073());
            m45075(element);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f63639 = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Document document = this.f63636;
        try {
            m45076();
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
            elementCreateElementNS.setUserData("offsets", m45074(m45073()), null);
            this.f63635.add(elementCreateElementNS);
        } catch (Exception e) {
            throw new SAXException(e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        m45076();
        Element element = (Element) C17745.m41308(this.f63635, 1);
        ((C0070) element.getUserData("offsets")).m989(m45073());
        m45075(element);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        m45076();
        Comment commentCreateComment = this.f63636.createComment(new String(cArr, i, i2));
        C0070 c0070M45073 = m45073();
        C0070 c0070M45074 = m45074(c0070M45073);
        c0070M45074.m989(c0070M45073);
        commentCreateComment.setUserData("offsets", c0070M45074, null);
        m45075(commentCreateComment);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45075(Node node) {
        ArrayList arrayList = this.f63635;
        if (arrayList.isEmpty()) {
            this.f63636.appendChild(node);
        } else {
            ((Element) C19084.m43861(arrayList, 1)).appendChild(node);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0070 m45074(C0070 c0070) {
        String str;
        int iM987 = c0070.m987();
        do {
            iM987--;
            if (iM987 < 0) {
                return c0070;
            }
            str = this.f63641;
        } while (str.charAt(iM987) != '<');
        int iM991 = c0070.m991();
        int iM988 = c0070.m987();
        for (int i = iM987; i < iM988; i++) {
            if (str.charAt(i) == '\n') {
                iM991--;
            }
        }
        int i2 = iM987 - 1;
        int i3 = 0;
        while (i2 >= 0 && str.charAt(i2) != '\n') {
            i2--;
            i3++;
        }
        return new C0070(iM991, i3, iM987);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C0070 m45073() {
        int i;
        int i2;
        int lineNumber = this.f63639.getLineNumber() - 1;
        int columnNumber = this.f63639.getColumnNumber() - 1;
        String str = this.f63641;
        int length = str.length();
        while (this.f63633 < lineNumber && (i = this.f63638) < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\r' || (i2 = this.f63638) >= length - 1) {
                if (cCharAt == '\n') {
                    this.f63633++;
                    this.f63640 = 0;
                } else {
                    this.f63640++;
                }
            } else if (str.charAt(i2 + 1) != '\n') {
                this.f63633++;
                this.f63640 = 0;
            }
            this.f63638++;
        }
        for (int i3 = this.f63640; i3 < columnNumber; i3++) {
            int i4 = this.f63638;
            if (i4 == length || str.charAt(i4) == '\n') {
                break;
            }
            this.f63638++;
        }
        if (this.f63638 >= length) {
            this.f63638 = length;
        }
        this.f63640 = columnNumber;
        return new C0070(this.f63633, columnNumber, this.f63638);
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void startCDATA() {
        m45076();
        this.f63637 = true;
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void endCDATA() {
        m45076();
        this.f63637 = false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.f63634.append(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m45076() {
        StringBuilder sb = this.f63634;
        if (sb.length() > 0 || this.f63637) {
            ArrayList arrayList = this.f63635;
            if (arrayList.isEmpty()) {
                return;
            }
            Element element = (Element) C19084.m43861(arrayList, 1);
            boolean z = this.f63637;
            Document document = this.f63636;
            element.appendChild(z ? document.createCDATASection(sb.toString()) : document.createTextNode(sb.toString()));
            sb.setLength(0);
        }
    }
}
