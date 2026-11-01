package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ܿ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16986 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12048 m39773(C17367 c17367, InterfaceC3453 interfaceC3453) {
        if (c17367.m40449() == -131647720) {
            c17367.skipBytes(4);
            if (c17367.m40461()) {
                if (interfaceC3453 == null) {
                    interfaceC3453 = InterfaceC3453.f12707;
                }
                try {
                    C14870 c14870M35557 = C14870.m35557(C12974.of(interfaceC3453.mo4306(c17367.m40442()).mo33986(), new String[0]), new C10428(1048576L));
                    try {
                        StringBuilder sb = new StringBuilder(c14870M35557.length());
                        char[] cArr = new char[8192];
                        while (true) {
                            int i = c14870M35557.read(cArr, 0, 8192);
                            if (i == -1) {
                                C12048 c12048 = new C12048(sb.toString(), c14870M35557.m35561());
                                c14870M35557.close();
                                return c12048;
                            }
                            sb.append(cArr, 0, i);
                            throw new UncheckedIOException(e);
                        }
                    } catch (Throwable th) {
                        try {
                            c14870M35557.close();
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
        String strM40442 = c17367.m40442();
        C19809 c19809 = new C19809();
        int iMin = Math.min(8192, strM40442.length());
        char[] cArr2 = new char[iMin];
        int i2 = 0;
        while (i2 < strM40442.length()) {
            int iMin2 = Math.min(iMin, strM40442.length() - i2);
            int i3 = i2 + iMin2;
            strM40442.getChars(i2, i3, cArr2, 0);
            c19809.m45044(cArr2, iMin2);
            i2 = i3;
        }
        return new C12048(strM40442, c19809.m45043(strM40442.length()));
    }
}
