package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0389 implements InterfaceC0059, InterfaceC17958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11858 f1934;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1935;

    @Override // l.InterfaceC0059
    public final InterfaceC17958 create() {
        return this;
    }

    public C0389(int i) {
        this.f1935 = i * 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2197(C11858 c11858) {
        this.f1934 = c11858;
    }

    @Override // l.InterfaceC0059
    /* JADX INFO: renamed from: ۙ */
    public final Set mo978() {
        Object[] objArr = {'$', '\\'};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        return C4681.unmodifiableSet(hashSet);
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
    @Override // l.InterfaceC17958
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2076 mo2196(C3655 c3655) {
        boolean zM3235;
        String str;
        String str2;
        char cM3234;
        String str3;
        boolean z;
        char cCharAt;
        C9753 c9753M3237;
        C20942 c20942M3230;
        boolean z2;
        C0805 c0805M11850 = c3655.m11850();
        int iM3238 = c0805M11850.m3238();
        boolean zM3236 = c0805M11850.m3235('$');
        if (zM3236) {
            zM3235 = c0805M11850.m3235('$');
            str = zM3235 ? "$$" : "$";
            if (!zM3235 && (Character.isWhitespace(c0805M11850.m3234()) || Character.isDigit(iM3238) || iM3238 == 36)) {
                return null;
            }
            str2 = str;
        } else {
            c0805M11850.m3240();
            char cM3235 = c0805M11850.m3234();
            if (cM3235 != '(' && cM3235 != '[') {
                return null;
            }
            zM3235 = cM3235 == '[';
            str = zM3235 ? "\\[" : "\\(";
            str2 = zM3235 ? "\\]" : "\\)";
            c0805M11850.m3240();
        }
        C9753 c9753M3238 = c0805M11850.m3237();
        int length = 0;
        boolean z3 = false;
        char c = 0;
        while (length <= 4096 && this.f1935 > 0 && (cM3234 = c0805M11850.m3234()) != 0 && cM3234 != '\n') {
            if (cM3234 == '`' && !z3) {
                return null;
            }
            if (z3 || cM3234 != '<') {
                str3 = str;
            } else {
                C0805 c0805M11851 = c3655.m11850();
                C9753 c9753M3239 = c0805M11851.m3237();
                try {
                    boolean z4 = new C15499().mo2196(c3655) != null;
                    m2195(c9753M3239, c0805M11851);
                    if (z4) {
                        return null;
                    }
                    if (this.f1935 <= 0) {
                        str3 = str;
                    } else {
                        C0805 c0805M11852 = c3655.m11850();
                        C9753 c9753M32310 = c0805M11852.m3237();
                        try {
                            c0805M11852.m3240();
                            while (true) {
                                str3 = str;
                                if (c0805M11852.m3234() <= ' ' || c0805M11852.m3234() == '<' || c0805M11852.m3234() == '>') {
                                    break;
                                }
                                c0805M11852.m3240();
                                str = str3;
                            }
                            if (c0805M11852.m3234() == '>') {
                                m2195(c9753M32310, c0805M11852);
                                if (this.f1935 > 0) {
                                    z2 = new C9620().mo2196(c3655) != null;
                                    m2195(c9753M32310, c0805M11852);
                                }
                                if (z2) {
                                    return null;
                                }
                            }
                            m2195(c9753M32310, c0805M11852);
                        } catch (Throwable th) {
                            m2195(c9753M32310, c0805M11852);
                            throw th;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    m2195(c9753M3239, c0805M11851);
                    throw th2;
                }
            }
            if (z3 || cM3234 != ']') {
                C9753 c9753M32311 = c0805M11850.m3237();
                if (z3 && c0805M11850.m3233(str2)) {
                    if (length > 0 && (!zM3236 || zM3235 || (!Character.isWhitespace(c) && !Character.isDigit(c0805M11850.m3234()) && c0805M11850.m3234() != '$'))) {
                        String strM47873 = c0805M11850.m3230(c9753M3238, c9753M32311).m47873();
                        if (zM3236 && !zM3235) {
                            boolean z5 = false;
                            if (Character.isDigit(strM47873.charAt(0))) {
                                int i = 0;
                                while (i < strM47873.length() && (Character.isDigit(strM47873.charAt(i)) || strM47873.charAt(i) == '.' || strM47873.charAt(i) == ',')) {
                                    i++;
                                }
                                if (i != strM47873.length()) {
                                    char cCharAt2 = strM47873.charAt(i);
                                    if (cCharAt2 == ';' || cCharAt2 == ':' || cCharAt2 == '!' || cCharAt2 == '?') {
                                        z5 = true;
                                    } else if (Character.isWhitespace(cCharAt2)) {
                                        while (i < strM47873.length() && Character.isWhitespace(strM47873.charAt(i))) {
                                            i++;
                                        }
                                        if (i == strM47873.length() || "+-=*/^_\\<>$".indexOf(strM47873.charAt(i)) < 0) {
                                            z5 = true;
                                        }
                                    }
                                }
                            }
                            if (z5) {
                                return null;
                            }
                        }
                        return new C2076(new C18288(strM47873, C20196.m46451(str3, strM47873, str2), zM3235), c0805M11850.m3237());
                    }
                    c0805M11850.m3231(c9753M32311);
                }
                if (cM3234 == '\\' || z3) {
                    z = false;
                } else {
                    z = true;
                }
                c0805M11850.m3240();
                z3 = z;
                cCharAt = cM3234;
            } else {
                C9753 c9753M32312 = c0805M11850.m3237();
                try {
                    c0805M11850.m3240();
                    if (c0805M11850.m3235('[')) {
                        C9753 c9753M32313 = c0805M11850.m3237();
                        if (C12295.m30692(c0805M11850)) {
                            C9753 c9753M32314 = c0805M11850.m3237();
                            if (c0805M11850.m3235(']')) {
                                String strM47874 = c0805M11850.m3230(c9753M32313, c9753M32314).m47873();
                                if (strM47874.isEmpty() || strM47874.length() > 999 || this.f1934.m29711(strM47874) == null) {
                                    c9753M3237 = null;
                                } else {
                                    c9753M3237 = c0805M11850.m3237();
                                }
                                m2195(c9753M32312, c0805M11850);
                                if (c9753M3237 != null) {
                                    c20942M3230 = c0805M11850.m3230(c0805M11850.m3237(), c9753M3237);
                                    if (c20942M3230.m47876().size() != 1) {
                                        return null;
                                    }
                                    CharSequence charSequenceM34537 = ((C14228) c20942M3230.m47876().get(0)).m34537();
                                    length += charSequenceM34537.length() - 1;
                                    c0805M11850.m3231(c9753M3237);
                                    cCharAt = charSequenceM34537.charAt(charSequenceM34537.length() - 1);
                                    str3 = str3;
                                } else {
                                    C9753 c9753M32315 = c0805M11850.m3237();
                                    if (z3) {
                                    }
                                    if (cM3234 == '\\') {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    c0805M11850.m3240();
                                    z3 = z;
                                    cCharAt = cM3234;
                                }
                            }
                        }
                        m2195(c9753M32312, c0805M11850);
                        c9753M3237 = null;
                        if (c9753M3237 != null) {
                            c20942M3230 = c0805M11850.m3230(c0805M11850.m3237(), c9753M3237);
                            if (c20942M3230.m47876().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM34538 = ((C14228) c20942M3230.m47876().get(0)).m34537();
                            length += charSequenceM34538.length() - 1;
                            c0805M11850.m3231(c9753M3237);
                            cCharAt = charSequenceM34538.charAt(charSequenceM34538.length() - 1);
                            str3 = str3;
                        } else {
                            C9753 c9753M32316 = c0805M11850.m3237();
                            if (z3) {
                            }
                            if (cM3234 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c0805M11850.m3240();
                            z3 = z;
                            cCharAt = cM3234;
                        }
                    } else {
                        if (c0805M11850.m3235('(')) {
                            c0805M11850.m3236();
                            if (C12295.m30689(c0805M11850)) {
                                if (c0805M11850.m3236() > 0 && C12295.m30691(c0805M11850)) {
                                    c0805M11850.m3236();
                                }
                                if (c0805M11850.m3235(')')) {
                                    c9753M3237 = c0805M11850.m3237();
                                } else {
                                    c9753M3237 = null;
                                }
                                m2195(c9753M32312, c0805M11850);
                            }
                            if (c9753M3237 != null) {
                                c20942M3230 = c0805M11850.m3230(c0805M11850.m3237(), c9753M3237);
                                if (c20942M3230.m47876().size() != 1) {
                                    return null;
                                }
                                CharSequence charSequenceM34539 = ((C14228) c20942M3230.m47876().get(0)).m34537();
                                length += charSequenceM34539.length() - 1;
                                c0805M11850.m3231(c9753M3237);
                                cCharAt = charSequenceM34539.charAt(charSequenceM34539.length() - 1);
                                str3 = str3;
                            } else {
                                C9753 c9753M32317 = c0805M11850.m3237();
                                if (z3) {
                                }
                                if (cM3234 == '\\') {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                c0805M11850.m3240();
                                z3 = z;
                                cCharAt = cM3234;
                            }
                        }
                        m2195(c9753M32312, c0805M11850);
                        c9753M3237 = null;
                        if (c9753M3237 != null) {
                            c20942M3230 = c0805M11850.m3230(c0805M11850.m3237(), c9753M3237);
                            if (c20942M3230.m47876().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM345310 = ((C14228) c20942M3230.m47876().get(0)).m34537();
                            length += charSequenceM345310.length() - 1;
                            c0805M11850.m3231(c9753M3237);
                            cCharAt = charSequenceM345310.charAt(charSequenceM345310.length() - 1);
                            str3 = str3;
                        } else {
                            C9753 c9753M32318 = c0805M11850.m3237();
                            if (z3) {
                            }
                            if (cM3234 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c0805M11850.m3240();
                            z3 = z;
                            cCharAt = cM3234;
                        }
                    }
                } catch (Throwable th3) {
                    m2195(c9753M32312, c0805M11850);
                    throw th3;
                }
            }
            length++;
            this.f1935--;
            String str4 = str3;
            c = cCharAt;
            str = str4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2195(C9753 c9753, C0805 c0805) {
        Iterator it = c0805.m3230(c9753, c0805.m3237()).m47876().iterator();
        while (it.hasNext()) {
            this.f1935 -= ((C14228) it.next()).m34537().length() + 1;
        }
        c0805.m3231(c9753);
    }
}
