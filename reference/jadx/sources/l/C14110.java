package l;

import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M37V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14110 extends C4936 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f46347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC23282 f46348;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f46349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 m34151(C11038 c11038) {
        String strM27826;
        ArrayList arrayList;
        AbstractC23282 c2819;
        AbstractC23282 abstractC23282M34150;
        ArrayList arrayList2;
        if (this.f46348 == null) {
            if (c11038 == null) {
                strM27826 = this.f17267;
            } else {
                strM27826 = c11038.m27826(this.f17268, new C0827(2, this));
            }
            this.f46349 = strM27826;
            this.f46347 = 0;
            ArrayList arrayList3 = null;
            if (strM27826.charAt(0) == '<') {
                this.f46347++;
                arrayList = new ArrayList();
                while (this.f46349.charAt(this.f46347) != '>') {
                    int iIndexOf = this.f46349.indexOf(":", this.f46347);
                    String strSubstring = this.f46349.substring(this.f46347, iIndexOf);
                    int i = iIndexOf + 1;
                    this.f46347 = i;
                    if (this.f46349.charAt(i) != ':') {
                        abstractC23282M34150 = m34150();
                        arrayList2 = null;
                    } else {
                        abstractC23282M34150 = null;
                        arrayList2 = null;
                    }
                    while (this.f46349.charAt(this.f46347) == ':') {
                        this.f46347++;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m34150());
                    }
                    arrayList.add(new C13404(strSubstring, abstractC23282M34150, arrayList2));
                }
                this.f46347++;
            } else {
                arrayList = null;
            }
            if (strM27826.charAt(this.f46347) == '(') {
                ArrayList arrayListM34149 = m34149(')');
                AbstractC23282 abstractC23282M34151 = m34150();
                while (this.f46347 < strM27826.length() && strM27826.charAt(this.f46347) == '^') {
                    this.f46347++;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(m34150());
                }
                c2819 = new C22576(arrayList, arrayListM34149, abstractC23282M34151, arrayList3);
            } else {
                AbstractC23282 abstractC23282M34152 = m34150();
                if (arrayList == null && this.f46347 == strM27826.length()) {
                    c2819 = abstractC23282M34152;
                } else {
                    while (this.f46347 < strM27826.length()) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m34150());
                    }
                    c2819 = new C2819(arrayList, abstractC23282M34152, arrayList3);
                }
            }
            this.f46348 = c2819;
        }
        return this.f46348;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23282 m34150() {
        char cCharAt;
        char cCharAt2 = this.f46349.charAt(this.f46347);
        if (cCharAt2 == '*') {
            this.f46347++;
            return new C7053(EnumC4230.UNBOUNDED, null);
        }
        if (cCharAt2 == '+') {
            this.f46347++;
            return new C7053(EnumC4230.EXTENDS, m34150());
        }
        if (cCharAt2 == '-') {
            this.f46347++;
            return new C7053(EnumC4230.SUPER, m34150());
        }
        if (cCharAt2 == 'F') {
            this.f46347++;
            return new C1408(ClassTransform.FLOAT);
        }
        if (cCharAt2 == 'L') {
            this.f46347++;
            StringBuilder sb = new StringBuilder();
            C5642 c5642 = null;
            ArrayList arrayListM34149 = null;
            do {
                cCharAt = this.f46349.charAt(this.f46347);
                if (cCharAt == '.' || cCharAt == ';') {
                    this.f46347++;
                    C5642 c5643 = new C5642(c5642, sb.toString(), arrayListM34149);
                    sb.setLength(0);
                    arrayListM34149 = null;
                    c5642 = c5643;
                } else if (cCharAt == '<') {
                    arrayListM34149 = m34149('>');
                } else {
                    this.f46347++;
                    sb.append(cCharAt);
                }
            } while (cCharAt != ';');
            return c5642;
        }
        if (cCharAt2 == 'V') {
            this.f46347++;
            return new C1408(ClassTransform.VOID);
        }
        if (cCharAt2 == 'I') {
            this.f46347++;
            return new C1408(ClassTransform.INTEGER);
        }
        if (cCharAt2 == 'J') {
            this.f46347++;
            return new C1408(ClassTransform.LONG);
        }
        if (cCharAt2 == 'S') {
            this.f46347++;
            return new C1408(ClassTransform.SHORT);
        }
        if (cCharAt2 == 'T') {
            int i = this.f46347 + 1;
            this.f46347 = i;
            int iIndexOf = this.f46349.indexOf(59, i);
            C1408 c1408 = new C1408(this.f46349.substring(this.f46347, iIndexOf));
            this.f46347 = iIndexOf + 1;
            return c1408;
        }
        if (cCharAt2 == 'Z') {
            this.f46347++;
            return new C1408(ClassTransform.BOOLEAN);
        }
        if (cCharAt2 != '[') {
            switch (cCharAt2) {
                case 'B':
                    this.f46347++;
                    return new C1408(ClassTransform.BYTE);
                case 'C':
                    this.f46347++;
                    return new C1408(ClassTransform.CHARACTER);
                case 'D':
                    this.f46347++;
                    return new C1408(ClassTransform.DOUBLE);
                default:
                    throw new IllegalStateException(this.f46349.substring(0, this.f46347) + "!" + this.f46349.charAt(this.f46347) + "!" + this.f46349.substring(this.f46347 + 1));
            }
        }
        this.f46347++;
        return new C11993(m34150());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m34149(char c) {
        this.f46347++;
        ArrayList arrayList = new ArrayList();
        while (this.f46349.charAt(this.f46347) != c) {
            arrayList.add(m34150());
        }
        this.f46347++;
        return arrayList;
    }
}
