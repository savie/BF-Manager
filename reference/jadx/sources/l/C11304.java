package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ISU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11304 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35636;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f35637 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35638 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35639;

    static {
        C16980.m40037(C11304.class);
    }

    public C11304(String str) {
        this.f35639 = str;
        this.f35636 = str.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11304 m28566(AbstractC12531 abstractC12531) {
        C14834 c14834 = (C14834) abstractC12531.mo17862(C25278.f81636);
        String strM35753 = c14834 == null ? null : c14834.m35753();
        if (strM35753 == null) {
            return null;
        }
        return new C11304(strM35753);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private char m28568() {
        int i = this.f35637 + 1;
        this.f35637 = i;
        if (i >= this.f35636) {
            return (char) 0;
        }
        return this.f35639.charAt(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m28570(char c) {
        int i = this.f35637 + 1;
        return i < this.f35636 && this.f35639.charAt(i) == c;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m28565(boolean z) {
        char cM28568;
        int i;
        String strReplace;
        AbstractC1566 abstractC1566M28575;
        String strM28569;
        this.f35638 = this.f35637;
        do {
            if (z && m28570('.')) {
                return AbstractC1566.m5538(m28569());
            }
            cM28568 = m28568();
            if (cM28568 != 0) {
                if (cM28568 == '<') {
                    break;
                }
            } else {
                return null;
            }
        } while (cM28568 != ';');
        String str = this.f35639;
        if (cM28568 != ';') {
            int i2 = this.f35638;
            i = i2 != -1 ? i2 : 0;
            int i3 = this.f35637;
            String strSubstring = i < i3 ? str.substring(i, i3) : "";
            if (!z) {
                strReplace = strSubstring + ';';
            } else {
                strReplace = strSubstring.replace('/', '.');
            }
            ArrayList arrayList = new ArrayList();
            do {
                if (m28570('*')) {
                    m28568();
                    abstractC1566M28575 = AbstractC1566.m5537();
                } else if (m28570('+')) {
                    m28568();
                    abstractC1566M28575 = AbstractC1566.m5531(m28575(), EnumC12752.EXTENDS);
                } else if (m28570('-')) {
                    m28568();
                    abstractC1566M28575 = AbstractC1566.m5531(m28575(), EnumC12752.SUPER);
                } else {
                    abstractC1566M28575 = m28575();
                }
                if (abstractC1566M28575 != null) {
                    arrayList.add(abstractC1566M28575);
                }
                if (abstractC1566M28575 == null) {
                    break;
                }
            } while (!m28570('>'));
            m28567('>');
            AbstractC1566 abstractC1566M5527 = AbstractC1566.m5527(strReplace, arrayList);
            if (!m28570('.')) {
                m28567(';');
                return abstractC1566M5527;
            }
            m28567('.');
            m28568();
            AbstractC1566 abstractC1566M28565 = m28565(true);
            if (abstractC1566M28565 == null) {
                throw new C8597("No inner type found: " + m28571());
            }
            while (m28570('.')) {
                abstractC1566M5527 = AbstractC1566.m5530(abstractC1566M5527, abstractC1566M28565);
                m28567('.');
                m28568();
                abstractC1566M28565 = m28565(true);
                if (abstractC1566M28565 == null) {
                    throw new C8597("Unexpected inner type found: " + m28571());
                }
            }
            return AbstractC1566.m5530(abstractC1566M5527, abstractC1566M28565);
        }
        if (z) {
            int i4 = this.f35638;
            i = i4 != -1 ? i4 : 0;
            int i5 = this.f35637;
            strM28569 = (i < i5 ? str.substring(i, i5) : "").replace('/', '.');
        } else {
            strM28569 = m28569();
        }
        return AbstractC1566.m5538(strM28569);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m28569() {
        int i = this.f35638;
        if (i == -1) {
            i = 0;
        }
        int i2 = this.f35637 + 1;
        return i >= i2 ? "" : this.f35639.substring(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28567(char c) {
        char cM28568 = m28568();
        if (c == cM28568) {
            return;
        }
        throw new C8597("Consume wrong char: '" + cM28568 + "' != '" + c + "', sign: " + m28571());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m28575() {
        char cM28568 = m28568();
        String strM28569 = null;
        if (cM28568 == 0) {
            return null;
        }
        if (cM28568 == 'L') {
            AbstractC1566 abstractC1566M28565 = m28565(false);
            if (abstractC1566M28565 != null) {
                return abstractC1566M28565;
            }
        } else if (cM28568 == 'T') {
            m28568();
            int i = this.f35637;
            this.f35638 = i;
            while (true) {
                if (!m28570(';')) {
                    if (m28568() == 0) {
                        this.f35637 = i;
                        break;
                    }
                } else {
                    strM28569 = m28569();
                    break;
                }
            }
            if (strM28569 != null) {
                m28567(';');
                if (strM28569.contains(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    throw new C8597("Bad name for type variable: ".concat(strM28569));
                }
                return AbstractC1566.m5526(strM28569);
            }
        } else {
            if (cM28568 == '[') {
                return AbstractC1566.m5528(m28575());
            }
            AbstractC1566 abstractC1566M5524 = AbstractC1566.m5524(cM28568);
            if (abstractC1566M5524 != null) {
                return abstractC1566M5524;
            }
        }
        throw new C8597("Can't parse type: " + m28571() + ", unexpected: " + cM28568);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m28572() {
        String strM28569;
        boolean zM28570;
        if (!m28570('<')) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        m28567('<');
        while (!m28570('>') && m28568() != 0) {
            int i = this.f35637;
            this.f35638 = i;
            while (true) {
                if (!m28570(':')) {
                    if (m28568() == 0) {
                        this.f35637 = i;
                        strM28569 = null;
                        break;
                    }
                } else {
                    strM28569 = m28569();
                    break;
                }
            }
            if (strM28569 == null) {
                throw new C8597("Failed to parse generic types map");
            }
            m28567(':');
            if (m28570(':')) {
                m28568();
            }
            List arrayList2 = Collections.EMPTY_LIST;
            do {
                AbstractC1566 abstractC1566M28575 = m28575();
                if (abstractC1566M28575 == null) {
                    throw new C8597("Unexpected end of signature");
                }
                if (!abstractC1566M28575.equals(AbstractC1566.f5426)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(abstractC1566M28575);
                }
                zM28570 = m28570(':');
                if (zM28570) {
                    m28567(':');
                }
            } while (zM28570);
            arrayList.add(AbstractC1566.m5539(strM28569, arrayList2));
        }
        m28567('>');
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m28573(int i) {
        m28567('(');
        if (m28570(')')) {
            m28567(')');
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = i + 10;
        do {
            AbstractC1566 abstractC1566M28575 = m28575();
            if (abstractC1566M28575 == null) {
                throw new C8597("Unexpected end of signature");
            }
            arrayList.add(abstractC1566M28575);
            if (arrayList.size() > i2) {
                throw new C8597("Arguments count limit reached: " + arrayList.size());
            }
        } while (!m28570(')'));
        m28567(')');
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m28574() {
        return this.f35639;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m28571() {
        int i = this.f35637;
        String str = this.f35639;
        if (i >= str.length()) {
            return str;
        }
        return str + " at position " + this.f35637 + " ('" + str.charAt(this.f35637) + "')";
    }

    public final String toString() {
        int i = this.f35637;
        String str = this.f35639;
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, this.f35638));
        sb.append('{');
        sb.append(str.substring(this.f35638, this.f35637));
        sb.append('}');
        return ExternalValue$$ExternalSyntheticOutline0.m(this.f35637, str, sb);
    }
}
