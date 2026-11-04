package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.۠֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8272 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2306 m22327(C20348 c20348, InterfaceC19459 interfaceC19459) {
        if (c20348.m46759() == -131647720) {
            c20348.skipBytes(4);
            if (c20348.m46753()) {
                if (interfaceC19459 == null) {
                    interfaceC19459 = InterfaceC19459.f62864;
                }
                try {
                    C20205 c20205M46475 = C20205.m46475(C6429.of(interfaceC19459.mo19331(c20348.m46756()).mo4294(), new String[0]), new C0352(1048576L));
                    try {
                        StringBuilder sb = new StringBuilder(c20205M46475.length());
                        char[] cArr = new char[8192];
                        while (true) {
                            int i = c20205M46475.read(cArr, 0, 8192);
                            if (i == -1) {
                                C2306 c2306 = new C2306(sb.toString(), c20205M46475.m46479());
                                c20205M46475.close();
                                return c2306;
                            }
                            sb.append(cArr, 0, i);
                            throw new UncheckedIOException(e);
                        }
                    } catch (Throwable th) {
                        try {
                            c20205M46475.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        }
        String strM46756 = c20348.m46756();
        C9762 c9762 = new C9762();
        int iMin = Math.min(8192, strM46756.length());
        char[] cArr2 = new char[iMin];
        int i2 = 0;
        while (i2 < strM46756.length()) {
            int iMin2 = Math.min(iMin, strM46756.length() - i2);
            int i3 = i2 + iMin2;
            strM46756.getChars(i2, i3, cArr2, 0);
            c9762.m25436(cArr2, iMin2);
            i2 = i3;
        }
        return new C2306(strM46756, c9762.m25435(strM46756.length()));
    }
}
