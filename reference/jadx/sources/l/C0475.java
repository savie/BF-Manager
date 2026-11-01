package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0475 f2151 = new C0475();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2343(int i, int i2) throws IOException {
        if (i <= 0 || i2 <= 0 || i > 1000000 || i2 > 1000000 || ((long) i) * ((long) i2) > 268435456) {
            throw new IOException("Image dimensions exceed safe decode limits");
        }
    }
}
