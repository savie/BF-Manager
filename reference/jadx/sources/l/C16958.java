package l;

import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܺܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M37V */
/* JADX INFO: loaded from: classes5.dex */
public final class C16958 extends C25164 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f55394;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC4280 f55395;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f55396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 m39939(C1606 c1606) {
        String strM5640;
        ArrayList arrayList;
        AbstractC4280 c16212;
        AbstractC4280 abstractC4280M39938;
        ArrayList arrayList2;
        if (this.f55395 == null) {
            if (c1606 == null) {
                strM5640 = this.f81354;
            } else {
                strM5640 = c1606.m5640(this.f81355, new C11737(0, this));
            }
            this.f55394 = strM5640;
            this.f55396 = 0;
            ArrayList arrayList3 = null;
            if (strM5640.charAt(0) == '<') {
                this.f55396++;
                arrayList = new ArrayList();
                while (this.f55394.charAt(this.f55396) != '>') {
                    int iIndexOf = this.f55394.indexOf(":", this.f55396);
                    String strSubstring = this.f55394.substring(this.f55396, iIndexOf);
                    int i = iIndexOf + 1;
                    this.f55396 = i;
                    if (this.f55394.charAt(i) != ':') {
                        abstractC4280M39938 = m39938();
                        arrayList2 = null;
                    } else {
                        abstractC4280M39938 = null;
                        arrayList2 = null;
                    }
                    while (this.f55394.charAt(this.f55396) == ':') {
                        this.f55396++;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m39938());
                    }
                    arrayList.add(new C12483(strSubstring, abstractC4280M39938, arrayList2));
                }
                this.f55396++;
            } else {
                arrayList = null;
            }
            if (strM5640.charAt(this.f55396) == '(') {
                ArrayList arrayListM39937 = m39937(')');
                AbstractC4280 abstractC4280M39939 = m39938();
                while (this.f55396 < strM5640.length() && strM5640.charAt(this.f55396) == '^') {
                    this.f55396++;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(m39938());
                }
                c16212 = new C3534(arrayList, arrayListM39937, abstractC4280M39939, arrayList3);
            } else {
                AbstractC4280 abstractC4280M399310 = m39938();
                if (arrayList == null && this.f55396 == strM5640.length()) {
                    c16212 = abstractC4280M399310;
                } else {
                    while (this.f55396 < strM5640.length()) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m39938());
                    }
                    c16212 = new C16212(arrayList, abstractC4280M399310, arrayList3);
                }
            }
            this.f55395 = c16212;
        }
        return this.f55395;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC4280 m39938() {
        char cCharAt;
        char cCharAt2 = this.f55394.charAt(this.f55396);
        if (cCharAt2 == '*') {
            this.f55396++;
            return new C24418(EnumC6518.UNBOUNDED, null);
        }
        if (cCharAt2 == '+') {
            this.f55396++;
            return new C24418(EnumC6518.EXTENDS, m39938());
        }
        if (cCharAt2 == '-') {
            this.f55396++;
            return new C24418(EnumC6518.SUPER, m39938());
        }
        if (cCharAt2 == 'F') {
            this.f55396++;
            return new C20688(ClassTransform.FLOAT);
        }
        if (cCharAt2 == 'L') {
            this.f55396++;
            StringBuilder sb = new StringBuilder();
            C23672 c23672 = null;
            ArrayList arrayListM39937 = null;
            do {
                cCharAt = this.f55394.charAt(this.f55396);
                if (cCharAt == '.' || cCharAt == ';') {
                    this.f55396++;
                    C23672 c23673 = new C23672(c23672, sb.toString(), arrayListM39937);
                    sb.setLength(0);
                    arrayListM39937 = null;
                    c23672 = c23673;
                } else if (cCharAt == '<') {
                    arrayListM39937 = m39937('>');
                } else {
                    this.f55396++;
                    sb.append(cCharAt);
                }
            } while (cCharAt != ';');
            return c23672;
        }
        if (cCharAt2 == 'V') {
            this.f55396++;
            return new C20688(ClassTransform.VOID);
        }
        if (cCharAt2 == 'I') {
            this.f55396++;
            return new C20688(ClassTransform.INTEGER);
        }
        if (cCharAt2 == 'J') {
            this.f55396++;
            return new C20688(ClassTransform.LONG);
        }
        if (cCharAt2 == 'S') {
            this.f55396++;
            return new C20688(ClassTransform.SHORT);
        }
        if (cCharAt2 == 'T') {
            int i = this.f55396 + 1;
            this.f55396 = i;
            int iIndexOf = this.f55394.indexOf(59, i);
            C20688 c20688 = new C20688(this.f55394.substring(this.f55396, iIndexOf));
            this.f55396 = iIndexOf + 1;
            return c20688;
        }
        if (cCharAt2 == 'Z') {
            this.f55396++;
            return new C20688(ClassTransform.BOOLEAN);
        }
        if (cCharAt2 != '[') {
            switch (cCharAt2) {
                case 'B':
                    this.f55396++;
                    return new C20688(ClassTransform.BYTE);
                case 'C':
                    this.f55396++;
                    return new C20688(ClassTransform.CHARACTER);
                case 'D':
                    this.f55396++;
                    return new C20688(ClassTransform.DOUBLE);
                default:
                    throw new IllegalStateException(this.f55394.substring(0, this.f55396) + "!" + this.f55394.charAt(this.f55396) + "!" + this.f55394.substring(this.f55396 + 1));
            }
        }
        this.f55396++;
        return new C17704(m39938());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m39937(char c) {
        this.f55396++;
        ArrayList arrayList = new ArrayList();
        while (this.f55394.charAt(this.f55396) != c) {
            arrayList.add(m39938());
        }
        this.f55396++;
        return arrayList;
    }
}
