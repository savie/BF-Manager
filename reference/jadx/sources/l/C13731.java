package l;

/* JADX INFO: renamed from: l.۬۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13731 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m33555(C20348 c20348, AbstractC22044 abstractC22044) {
        String strM33554;
        int iM46744 = c20348.m46744();
        try {
            if (c20348.m46746(-249340294)) {
                c20348.skipBytes(4);
                strM33554 = m33553(c20348, 0) ? m33554(c20348, abstractC22044) : "";
            } else {
                strM33554 = m33554(c20348, abstractC22044);
            }
            return strM33554;
        } finally {
            c20348.seek(iM46744);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2310 m33551(C20348 c20348, AbstractC22044 abstractC22044) {
        String strM33554;
        String strM46756;
        int iM46744 = c20348.m46744();
        byte[] bArr = c20348.f65270;
        try {
            if (c20348.m46746(-249340294)) {
                c20348.skipBytes(4);
                if (m33553(c20348, 0)) {
                    strM33554 = m33554(c20348, abstractC22044);
                    c20348.skipBytes(4);
                } else {
                    strM33554 = "";
                }
                strM46756 = m33553(c20348, 4) ? c20348.m46756() : "\n";
            } else {
                strM33554 = m33554(c20348, abstractC22044);
                c20348.skipBytes(28);
                c20348.skipBytes(3);
                C24132.m53833(c20348, bArr.length);
                C24132.m53833(c20348, bArr.length);
                if (c20348.m46746(-1568513661)) {
                    int iM46749 = c20348.m46749();
                    for (int i = 0; i < iM46749; i++) {
                        c20348.skipBytes(8);
                    }
                }
                if (c20348.m46746(-1568513661)) {
                    int iM467410 = c20348.m46749();
                    for (int i2 = 0; i2 < iM467410; i2++) {
                        c20348.skipBytes(8);
                    }
                }
                strM46756 = c20348.m46756();
            }
            return new C2310(strM33554, strM46756);
        } finally {
            c20348.seek(iM46744);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33552(C20348 c20348) {
        int i;
        int iM46744 = c20348.m46744();
        byte[] bArr = c20348.f65270;
        try {
            if (c20348.m46746(-249340294)) {
                c20348.skipBytes(4);
                if (!m33553(c20348, 1)) {
                    c20348.seek(iM46744);
                    return;
                }
                c20348.skipBytes(4);
            } else {
                if (c20348.m46759() == -131647720) {
                    c20348.skipBytes(4);
                    c20348.skipBytes(1);
                    i = c20348.readInt();
                } else {
                    i = c20348.readInt();
                }
                c20348.skipBytes(i);
                c20348.skipBytes(20);
            }
            C6929.m19210(c20348.m46744(), C6929.m19208(c20348.m46744() + 4, bArr), bArr);
            long j = iM46744;
            c20348.seek(j);
            if (c20348.m46746(-249340294)) {
                c20348.skipBytes(4);
                if (m33553(c20348, 10)) {
                    int iM46745 = c20348.m46744();
                    c20348.skipBytes(8);
                    C6929.m19211(c20348.readLong(), iM46745, bArr);
                }
            }
            c20348.seek(j);
        } catch (Throwable th) {
            c20348.seek(iM46744);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m33554(C20348 c20348, AbstractC22044 abstractC22044) {
        if (c20348.m46759() == -500018348) {
            return C24238.m54220(c20348, abstractC22044);
        }
        int iM46759 = c20348.m46759();
        if (iM46759 == -500019884 || iM46759 == -483177132) {
            if (c20348.m46759() == -500019884) {
                return new String(C13378.m32980(c20348, c20348.m46744() + ((int) c20348.available())));
            }
            if (c20348.readInt() != -483177132) {
                throw new IllegalArgumentException("Invalid memory session state");
            }
            C16759 c16759M41051 = C17505.m41051(c20348);
            try {
                C7305 c7305M39571 = c16759M41051.m39571();
                try {
                    String string = c7305M39571.toString();
                    c7305M39571.close();
                    c16759M41051.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        c7305M39571.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c16759M41051.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (c20348.m46759() == -131647720) {
            return C8272.m22327(c20348, abstractC22044 == null ? null : new C7020(abstractC22044)).m7788();
        }
        return c20348.m46756();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33553(C20348 c20348, int i) {
        int iM46744 = c20348.m46744();
        while (true) {
            byte b = c20348.readByte();
            if (b != -1) {
                int i2 = c20348.readInt();
                if (b == i) {
                    return true;
                }
                c20348.skipBytes(i2);
            } else {
                c20348.seek(iM46744);
                return false;
            }
        }
    }
}
