package l;

/* JADX INFO: renamed from: l.᩵᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20895 {
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
    public static boolean m47760(int r8, boolean r9, l.C23879 r10, int r11, java.lang.CharSequence r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20895.m47760(int, boolean, l.᩹᩺ۤ, int, java.lang.CharSequence):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47762(C3874 c3874, C23879 c23879, int i, CharSequence charSequence) {
        boolean zM47761;
        int i2;
        int i3 = c23879.f77318;
        int length = c23879.f77326;
        if (c23879.f77344) {
            length = c23879.f77313.length();
            i3 = 0;
        }
        boolean zM47762 = i > i3 ? m47761(c3874, c23879, Character.codePointBefore(charSequence, i), i - 1, charSequence) : false;
        if (i < length) {
            zM47761 = m47761(c3874, c23879, Character.codePointAt(charSequence, i), i, charSequence);
        } else {
            c23879.f77334 = true;
            c23879.f77311 = true;
            zM47761 = false;
        }
        if (zM47762 ^ zM47761) {
            i2 = zM47761 ? 1 : 2;
        } else {
            i2 = 4;
        }
        return (c3874.f13218 & i2) > 0;
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
    public static boolean m47761(C3874 c3874, C23879 c23879, int i, int i2, CharSequence charSequence) {
        boolean zIsLetterOrDigit;
        int i3;
        boolean z;
        int iCodePointAt;
        boolean zIsLetterOrDigit2;
        if (i < 128) {
            return (i >= 97 && i <= 122) || (i >= 65 && i <= 90) || ((i >= 48 && i <= 57) || i == 95);
        }
        if (!c3874.f13219) {
            int i4 = C18446.f60051;
            if (i > 127) {
                zIsLetterOrDigit = Character.isLetterOrDigit(i);
            } else {
                zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
            }
            if (!zIsLetterOrDigit) {
                if (C18446.m42976(i) == 6) {
                    if (c23879.f77344) {
                        i3 = 0;
                    } else {
                        i3 = c23879.f77318;
                    }
                    while (i2 >= i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                        int i5 = C18446.f60051;
                        if (iCodePointAt > 127) {
                            zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                        } else if (97 > iCodePointAt) {
                        }
                        if (zIsLetterOrDigit2) {
                            if (C18446.m42976(iCodePointAt) == 6) {
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
        } else if (!c3874.f13220.mo1303(i)) {
            if (C18446.m42976(i) == 6) {
                if (c23879.f77344) {
                    i3 = 0;
                } else {
                    i3 = c23879.f77318;
                }
                while (i2 >= i3) {
                    iCodePointAt = Character.codePointAt(charSequence, i2);
                    int i6 = C18446.f60051;
                    if (iCodePointAt > 127) {
                        zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                    } else {
                        zIsLetterOrDigit2 = (97 > iCodePointAt && iCodePointAt <= 122) || (65 <= iCodePointAt && iCodePointAt <= 90) || (48 <= iCodePointAt && iCodePointAt <= 57);
                    }
                    if (zIsLetterOrDigit2) {
                        if (C18446.m42976(iCodePointAt) == 6) {
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
