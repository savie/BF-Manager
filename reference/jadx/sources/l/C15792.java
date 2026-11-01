package l;

/* JADX INFO: renamed from: l.ܺ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15792 {
    /* JADX WARN: Code duplicated, block: B:91:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x00eb A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m37549(int r8, boolean r9, l.C7324 r10, int r11, java.lang.CharSequence r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15792.m37549(int, boolean, l.۟۟ۨ, int, java.lang.CharSequence):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37551(C12285 c12285, C7324 c7324, int i, CharSequence charSequence) {
        boolean zM37550;
        int i2;
        int i3 = c7324.f24342;
        int length = c7324.f24340;
        if (c7324.f24325) {
            length = c7324.f24345.length();
            i3 = 0;
        }
        boolean zM37551 = i > i3 ? m37550(c12285, c7324, Character.codePointBefore(charSequence, i), i - 1, charSequence) : false;
        if (i < length) {
            zM37550 = m37550(c12285, c7324, Character.codePointAt(charSequence, i), i, charSequence);
        } else {
            c7324.f24346 = true;
            c7324.f24338 = true;
            zM37550 = false;
        }
        if (zM37551 ^ zM37550) {
            i2 = zM37550 ? 1 : 2;
        } else {
            i2 = 4;
        }
        return (c12285.f41082 & i2) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086 A[LOOP:0: B:37:0x005e->B:53:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0089 A[EDGE_INSN: B:60:0x0089->B:54:0x0089 BREAK  A[LOOP:0: B:37:0x005e->B:53:0x0086], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37550(C12285 c12285, C7324 c7324, int i, int i2, CharSequence charSequence) {
        boolean zIsLetterOrDigit;
        int i3;
        boolean z;
        int iCodePointAt;
        boolean zIsLetterOrDigit2;
        if (i < 128) {
            return (i >= 97 && i <= 122) || (i >= 65 && i <= 90) || ((i >= 48 && i <= 57) || i == 95);
        }
        if (!c12285.f41083) {
            int i4 = C4312.f15487;
            if (i > 127) {
                zIsLetterOrDigit = Character.isLetterOrDigit(i);
            } else {
                zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
            }
            if (!zIsLetterOrDigit) {
                if (C4312.m12113(i) == 6) {
                    if (c7324.f24325) {
                        i3 = 0;
                    } else {
                        i3 = c7324.f24342;
                    }
                    while (i2 >= i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                        int i5 = C4312.f15487;
                        if (iCodePointAt > 127) {
                            zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                        } else if (97 > iCodePointAt) {
                        }
                        if (zIsLetterOrDigit2) {
                            if (C4312.m12113(iCodePointAt) == 6) {
                                break;
                                break;
                            }
                            i2--;
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
        } else if (!c12285.f41084.mo1813(i)) {
            if (C4312.m12113(i) == 6) {
                if (c7324.f24325) {
                    i3 = 0;
                } else {
                    i3 = c7324.f24342;
                }
                while (i2 >= i3) {
                    iCodePointAt = Character.codePointAt(charSequence, i2);
                    int i6 = C4312.f15487;
                    if (iCodePointAt > 127) {
                        zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                    } else {
                        zIsLetterOrDigit2 = (97 > iCodePointAt && iCodePointAt <= 122) || (65 <= iCodePointAt && iCodePointAt <= 90) || (48 <= iCodePointAt && iCodePointAt <= 57);
                    }
                    if (zIsLetterOrDigit2) {
                        if (C4312.m12113(iCodePointAt) == 6) {
                            break;
                        }
                        i2--;
                    } else {
                        z = true;
                    }
                    if (z) {
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
    }
}
