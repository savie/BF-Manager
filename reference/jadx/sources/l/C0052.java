package l;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.֡֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0052 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14744 m949(Reader reader, C16072 c16072, int i, C19809 c19809) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy text length limit");
        }
        C13333 c13333 = new C13333(c16072);
        int iMin = Math.min(1024, c16072.f51978);
        C2042 c2042 = new C2042(c16072, iMin);
        try {
            char[] cArrM6538 = c2042.m6538();
            while (true) {
                int i2 = reader.read(cArrM6538, 0, iMin);
                if (i2 == -1) {
                    C14744 c14744M32839 = c13333.m32839();
                    c2042.close();
                    return c14744M32839;
                }
                if (i2 <= 0 || i2 > iMin) {
                    throw new IOException("Legacy text reader made invalid progress");
                }
                if (((long) c13333.m32842()) + ((long) i2) > i) {
                    throw new IOException("Legacy text exceeds migration coordinate limit");
                }
                if (c19809 != null) {
                    c19809.m45044(cArrM6538, i2);
                }
                c13333.m32840(cArrM6538, i2);
            }
        } catch (Throwable th) {
            try {
                c2042.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
