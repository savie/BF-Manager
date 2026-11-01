package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAAW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2181 extends AbstractC11355 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6778(C18485 c18485) throws IOException {
        AbstractC11355.m28436(c18485);
        AbstractC19191 abstractC19191M42860 = c18485.m42860();
        if (abstractC19191M42860 != null) {
            try {
                InputStream inputStreamM44051 = abstractC19191M42860.m44051();
                try {
                    do {
                    } while (inputStreamM44051.read(new byte[1024]) >= 0);
                    inputStreamM44051.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM44051.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    abstractC19191M42860.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (abstractC19191M42860 != null) {
            abstractC19191M42860.close();
        }
    }
}
