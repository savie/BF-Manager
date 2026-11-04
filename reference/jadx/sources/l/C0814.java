package l;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.֨֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0814 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21697 m3281(Reader reader, C10046 c10046, int i, C9762 c9762) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy text length limit");
        }
        C16254 c16254 = new C16254(c10046);
        int iMin = Math.min(1024, c10046.f32213);
        C10508 c10508 = new C10508(c10046, iMin);
        try {
            char[] cArrM26971 = c10508.m26971();
            while (true) {
                int i2 = reader.read(cArrM26971, 0, iMin);
                if (i2 == -1) {
                    C21697 c21697M38569 = c16254.m38569();
                    c10508.close();
                    return c21697M38569;
                }
                if (i2 <= 0 || i2 > iMin) {
                    throw new IOException("Legacy text reader made invalid progress");
                }
                if (((long) c16254.m38572()) + ((long) i2) > i) {
                    throw new IOException("Legacy text exceeds migration coordinate limit");
                }
                if (c9762 != null) {
                    c9762.m25436(cArrM26971, i2);
                }
                c16254.m38570(cArrM26971, i2);
            }
        } catch (Throwable th) {
            try {
                c10508.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
