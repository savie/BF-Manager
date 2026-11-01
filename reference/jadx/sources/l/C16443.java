package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16443 implements InterfaceC22230, InterfaceC5296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16524 f52872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52873;

    @Override // l.InterfaceC22230
    public final InterfaceC5296 create() {
        return this;
    }

    public C16443(int i) {
        this.f52873 = i * 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38710(C16524 c16524) {
        this.f52872 = c16524;
    }

    @Override // l.InterfaceC22230
    /* JADX INFO: renamed from: ۙ */
    public final Set mo26660() {
        Object[] objArr = {'$', '\\'};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        return C0561.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:184:0x027d  */
    /* JADX WARN: Code duplicated, block: B:189:0x029b  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:210:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0045 A[SYNTHETIC] */
    @Override // l.InterfaceC5296
    /* JADX INFO: renamed from: ۙ */
    public final C16854 mo14672(C1706 c1706) {
        boolean zM18136;
        String str;
        String str2;
        char cM18135;
        String str3;
        boolean z;
        char cCharAt;
        C3884 c3884M18139;
        C2473 c2473M18130;
        boolean z2;
        C6707 c6707M5679 = c1706.m5679();
        int iM18134 = c6707M5679.m18134();
        boolean zM18137 = c6707M5679.m18136('$');
        if (zM18137) {
            zM18136 = c6707M5679.m18136('$');
            str = zM18136 ? "$$" : "$";
            if (!zM18136 && (Character.isWhitespace(c6707M5679.m18135()) || Character.isDigit(iM18134) || iM18134 == 36)) {
                return null;
            }
            str2 = str;
        } else {
            c6707M5679.m18138();
            char cM18136 = c6707M5679.m18135();
            if (cM18136 != '(' && cM18136 != '[') {
                return null;
            }
            zM18136 = cM18136 == '[';
            str = zM18136 ? "\\[" : "\\(";
            str2 = zM18136 ? "\\]" : "\\)";
            c6707M5679.m18138();
        }
        C3884 c3884M181310 = c6707M5679.m18139();
        int length = 0;
        boolean z3 = false;
        char c = 0;
        while (length <= 4096 && this.f52873 > 0 && (cM18135 = c6707M5679.m18135()) != 0 && cM18135 != '\n') {
            if (cM18135 == '`' && !z3) {
                return null;
            }
            if (z3 || cM18135 != '<') {
                str3 = str;
            } else {
                C6707 c6707M56710 = c1706.m5679();
                C3884 c3884M181311 = c6707M56710.m18139();
                try {
                    boolean z4 = new C16149().mo14672(c1706) != null;
                    m38709(c3884M181311, c6707M56710);
                    if (z4) {
                        return null;
                    }
                    if (this.f52873 <= 0) {
                        str3 = str;
                    } else {
                        C6707 c6707M56711 = c1706.m5679();
                        C3884 c3884M181312 = c6707M56711.m18139();
                        try {
                            c6707M56711.m18138();
                            while (true) {
                                str3 = str;
                                if (c6707M56711.m18135() <= ' ' || c6707M56711.m18135() == '<' || c6707M56711.m18135() == '>') {
                                    break;
                                }
                                c6707M56711.m18138();
                                str = str3;
                            }
                            if (c6707M56711.m18135() == '>') {
                                m38709(c3884M181312, c6707M56711);
                                if (this.f52873 > 0) {
                                    z2 = new C15444().mo14672(c1706) != null;
                                    m38709(c3884M181312, c6707M56711);
                                }
                                if (z2) {
                                    return null;
                                }
                            }
                            m38709(c3884M181312, c6707M56711);
                        } catch (Throwable th) {
                            m38709(c3884M181312, c6707M56711);
                            throw th;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    m38709(c3884M181311, c6707M56710);
                    throw th2;
                }
            }
            if (z3 || cM18135 != ']') {
                C3884 c3884M181313 = c6707M5679.m18139();
                if (z3 && c6707M5679.m18133(str2)) {
                    if (length > 0 && (!zM18137 || zM18136 || (!Character.isWhitespace(c) && !Character.isDigit(c6707M5679.m18135()) && c6707M5679.m18135() != '$'))) {
                        String strM7583 = c6707M5679.m18130(c3884M181310, c3884M181313).m7583();
                        if (zM18137 && !zM18136) {
                            boolean z5 = false;
                            if (Character.isDigit(strM7583.charAt(0))) {
                                int i = 0;
                                while (i < strM7583.length() && (Character.isDigit(strM7583.charAt(i)) || strM7583.charAt(i) == '.' || strM7583.charAt(i) == ',')) {
                                    i++;
                                }
                                if (i != strM7583.length()) {
                                    char cCharAt2 = strM7583.charAt(i);
                                    if (cCharAt2 == ';' || cCharAt2 == ':' || cCharAt2 == '!' || cCharAt2 == '?') {
                                        z5 = true;
                                    } else if (Character.isWhitespace(cCharAt2)) {
                                        while (i < strM7583.length() && Character.isWhitespace(strM7583.charAt(i))) {
                                            i++;
                                        }
                                        if (i == strM7583.length() || "+-=*/^_\\<>$".indexOf(strM7583.charAt(i)) < 0) {
                                            z5 = true;
                                        }
                                    }
                                }
                            }
                            if (z5) {
                                return null;
                            }
                        }
                        return new C16854(new C0214(strM7583, C1679.m5594(str3, strM7583, str2), zM18136), c6707M5679.m18139());
                    }
                    c6707M5679.m18131(c3884M181313);
                }
                if (cM18135 == '\\' || z3) {
                    z = false;
                } else {
                    z = true;
                }
                c6707M5679.m18138();
                z3 = z;
                cCharAt = cM18135;
            } else {
                C3884 c3884M181314 = c6707M5679.m18139();
                try {
                    c6707M5679.m18138();
                    if (c6707M5679.m18136('[')) {
                        C3884 c3884M181315 = c6707M5679.m18139();
                        if (C3335.m9936(c6707M5679)) {
                            C3884 c3884M181316 = c6707M5679.m18139();
                            if (c6707M5679.m18136(']')) {
                                String strM7584 = c6707M5679.m18130(c3884M181315, c3884M181316).m7583();
                                if (strM7584.isEmpty() || strM7584.length() > 999 || this.f52872.m38895(strM7584) == null) {
                                    c3884M18139 = null;
                                } else {
                                    c3884M18139 = c6707M5679.m18139();
                                }
                                m38709(c3884M181314, c6707M5679);
                                if (c3884M18139 != null) {
                                    c2473M18130 = c6707M5679.m18130(c6707M5679.m18139(), c3884M18139);
                                    if (c2473M18130.m7586().size() != 1) {
                                        return null;
                                    }
                                    CharSequence charSequenceM29102 = ((C11647) c2473M18130.m7586().get(0)).m29102();
                                    length += charSequenceM29102.length() - 1;
                                    c6707M5679.m18131(c3884M18139);
                                    cCharAt = charSequenceM29102.charAt(charSequenceM29102.length() - 1);
                                    str3 = str3;
                                } else {
                                    C3884 c3884M181317 = c6707M5679.m18139();
                                    if (z3) {
                                    }
                                    if (cM18135 == '\\') {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    c6707M5679.m18138();
                                    z3 = z;
                                    cCharAt = cM18135;
                                }
                            }
                        }
                        m38709(c3884M181314, c6707M5679);
                        c3884M18139 = null;
                        if (c3884M18139 != null) {
                            c2473M18130 = c6707M5679.m18130(c6707M5679.m18139(), c3884M18139);
                            if (c2473M18130.m7586().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM29103 = ((C11647) c2473M18130.m7586().get(0)).m29102();
                            length += charSequenceM29103.length() - 1;
                            c6707M5679.m18131(c3884M18139);
                            cCharAt = charSequenceM29103.charAt(charSequenceM29103.length() - 1);
                            str3 = str3;
                        } else {
                            C3884 c3884M181318 = c6707M5679.m18139();
                            if (z3) {
                            }
                            if (cM18135 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c6707M5679.m18138();
                            z3 = z;
                            cCharAt = cM18135;
                        }
                    } else {
                        if (c6707M5679.m18136('(')) {
                            c6707M5679.m18126();
                            if (C3335.m9933(c6707M5679)) {
                                if (c6707M5679.m18126() > 0 && C3335.m9935(c6707M5679)) {
                                    c6707M5679.m18126();
                                }
                                if (c6707M5679.m18136(')')) {
                                    c3884M18139 = c6707M5679.m18139();
                                } else {
                                    c3884M18139 = null;
                                }
                                m38709(c3884M181314, c6707M5679);
                            }
                            if (c3884M18139 != null) {
                                c2473M18130 = c6707M5679.m18130(c6707M5679.m18139(), c3884M18139);
                                if (c2473M18130.m7586().size() != 1) {
                                    return null;
                                }
                                CharSequence charSequenceM29104 = ((C11647) c2473M18130.m7586().get(0)).m29102();
                                length += charSequenceM29104.length() - 1;
                                c6707M5679.m18131(c3884M18139);
                                cCharAt = charSequenceM29104.charAt(charSequenceM29104.length() - 1);
                                str3 = str3;
                            } else {
                                C3884 c3884M181319 = c6707M5679.m18139();
                                if (z3) {
                                }
                                if (cM18135 == '\\') {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                c6707M5679.m18138();
                                z3 = z;
                                cCharAt = cM18135;
                            }
                        }
                        m38709(c3884M181314, c6707M5679);
                        c3884M18139 = null;
                        if (c3884M18139 != null) {
                            c2473M18130 = c6707M5679.m18130(c6707M5679.m18139(), c3884M18139);
                            if (c2473M18130.m7586().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM29105 = ((C11647) c2473M18130.m7586().get(0)).m29102();
                            length += charSequenceM29105.length() - 1;
                            c6707M5679.m18131(c3884M18139);
                            cCharAt = charSequenceM29105.charAt(charSequenceM29105.length() - 1);
                            str3 = str3;
                        } else {
                            C3884 c3884M1813110 = c6707M5679.m18139();
                            if (z3) {
                            }
                            if (cM18135 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c6707M5679.m18138();
                            z3 = z;
                            cCharAt = cM18135;
                        }
                    }
                } catch (Throwable th3) {
                    m38709(c3884M181314, c6707M5679);
                    throw th3;
                }
            }
            length++;
            this.f52873--;
            String str4 = str3;
            c = cCharAt;
            str = str4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38709(C3884 c3884, C6707 c6707) {
        Iterator it = c6707.m18130(c3884, c6707.m18139()).m7586().iterator();
        while (it.hasNext()) {
            this.f52873 -= ((C11647) it.next()).m29102().length() + 1;
        }
        c6707.m18131(c3884);
    }
}
