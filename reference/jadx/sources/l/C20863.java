package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TAAW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20863 extends AbstractC3709 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47689(C9444 c9444) throws IOException {
        AbstractC3709.m12069(c9444);
        AbstractC8699 abstractC8699M24818 = c9444.m24818();
        if (abstractC8699M24818 != null) {
            try {
                InputStream inputStreamM23391 = abstractC8699M24818.m23391();
                try {
                    do {
                    } while (inputStreamM23391.read(new byte[1024]) >= 0);
                    inputStreamM23391.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM23391.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    abstractC8699M24818.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (abstractC8699M24818 != null) {
            abstractC8699M24818.close();
        }
    }
}
