package l;

/* JADX INFO: renamed from: l.۬ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13167 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m32559(C17367 c17367, AbstractC20745 abstractC20745) {
        String strM32558;
        int iM40445 = c17367.m40445();
        try {
            if (c17367.m40447(-249340294)) {
                c17367.skipBytes(4);
                strM32558 = m32557(c17367, 0) ? m32558(c17367, abstractC20745) : "";
            } else {
                strM32558 = m32558(c17367, abstractC20745);
            }
            return strM32558;
        } finally {
            c17367.seek(iM40445);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10946 m32555(C17367 c17367, AbstractC20745 abstractC20745) {
        String strM32558;
        String strM40442;
        int iM40445 = c17367.m40445();
        byte[] bArr = c17367.f55260;
        try {
            if (c17367.m40447(-249340294)) {
                c17367.skipBytes(4);
                if (m32557(c17367, 0)) {
                    strM32558 = m32558(c17367, abstractC20745);
                    c17367.skipBytes(4);
                } else {
                    strM32558 = "";
                }
                strM40442 = m32557(c17367, 4) ? c17367.m40442() : "\n";
            } else {
                strM32558 = m32558(c17367, abstractC20745);
                c17367.skipBytes(28);
                c17367.skipBytes(3);
                C6111.m16749(c17367, bArr.length);
                C6111.m16749(c17367, bArr.length);
                if (c17367.m40447(-1568513661)) {
                    int iM40462 = c17367.m40462();
                    for (int i = 0; i < iM40462; i++) {
                        c17367.skipBytes(8);
                    }
                }
                if (c17367.m40447(-1568513661)) {
                    int iM40463 = c17367.m40462();
                    for (int i2 = 0; i2 < iM40463; i2++) {
                        c17367.skipBytes(8);
                    }
                }
                strM40442 = c17367.m40442();
            }
            return new C10946(strM32558, strM40442);
        } finally {
            c17367.seek(iM40445);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32556(C17367 c17367) {
        int i;
        int iM40445 = c17367.m40445();
        byte[] bArr = c17367.f55260;
        try {
            if (c17367.m40447(-249340294)) {
                c17367.skipBytes(4);
                if (!m32557(c17367, 1)) {
                    c17367.seek(iM40445);
                    return;
                }
                c17367.skipBytes(4);
            } else {
                if (c17367.m40449() == -131647720) {
                    c17367.skipBytes(4);
                    c17367.skipBytes(1);
                    i = c17367.readInt();
                } else {
                    i = c17367.readInt();
                }
                c17367.skipBytes(i);
                c17367.skipBytes(20);
            }
            C15157.m36338(c17367.m40445(), C15157.m36336(c17367.m40445() + 4, bArr), bArr);
            long j = iM40445;
            c17367.seek(j);
            if (c17367.m40447(-249340294)) {
                c17367.skipBytes(4);
                if (m32557(c17367, 10)) {
                    int iM40446 = c17367.m40445();
                    c17367.skipBytes(8);
                    C15157.m36340(c17367.readLong(), iM40446, bArr);
                }
            }
            c17367.seek(j);
        } catch (Throwable th) {
            c17367.seek(iM40445);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m32558(C17367 c17367, AbstractC20745 abstractC20745) {
        if (c17367.m40449() == -500018348) {
            return C23464.m51705(c17367, abstractC20745);
        }
        int iM40449 = c17367.m40449();
        if (iM40449 == -500019884 || iM40449 == -483177132) {
            if (c17367.m40449() == -500019884) {
                return new String(C19186.m44042(c17367, c17367.m40445() + ((int) c17367.available())));
            }
            if (c17367.readInt() != -483177132) {
                throw new IllegalArgumentException("Invalid memory session state");
            }
            C22422 c22422M4498 = C1254.m4498(c17367);
            try {
                C6276 c6276M49746 = c22422M4498.m49746();
                try {
                    String string = c6276M49746.toString();
                    c6276M49746.close();
                    c22422M4498.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        c6276M49746.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c22422M4498.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (c17367.m40449() == -131647720) {
            return C16986.m39773(c17367, abstractC20745 == null ? null : new C1171(abstractC20745)).m29944();
        }
        return c17367.m40442();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32557(C17367 c17367, int i) {
        int iM40445 = c17367.m40445();
        while (true) {
            byte b = c17367.readByte();
            if (b != -1) {
                int i2 = c17367.readInt();
                if (b == i) {
                    return true;
                }
                c17367.skipBytes(i2);
            } else {
                c17367.seek(iM40445);
                return false;
            }
        }
    }
}
