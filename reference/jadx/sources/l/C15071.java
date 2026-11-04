package l;

/* JADX INFO: renamed from: l.ܳۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15071 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49214;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f49215;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18251 f49216;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20334 f49217;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.f49214 - 1;
        this.f49214 = i;
        if (i == 0) {
            this.f49217 = null;
            this.f49215 = null;
            C18251 c18251 = this.f49216;
            if (c18251 != null) {
                c18251.close();
                this.f49216 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m36333() {
        int i = this.f49214;
        if (i == 0) {
            throw new IllegalStateException("Fragment search is closed");
        }
        this.f49214 = i + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15071 m36330(C21785 c21785, C22531 c22531, int i, C7305 c7305) throws Throwable {
        byte[] bArrM49405 = c21785.m49405();
        int i2 = c22531.f72876;
        int i3 = c22531.f72875;
        long jM46721 = C20334.m46721(i2, bArrM49405, i3, i);
        C18251 c18251M19990 = c7305.m19990((5 * jM46721) + 256);
        boolean z = false;
        try {
            C18251 c18251M19991 = c7305.m19990((jM46721 * 8) + 8192);
            try {
                C20334 c20334M46720 = C20334.m46720(c22531.f72876, c21785.m49405(), i3, i);
                byte[] bArrM46723 = c20334M46720.m46723();
                C15071 c15071 = new C15071();
                c15071.f49214 = 1;
                c15071.f49215 = bArrM46723;
                c15071.f49217 = c20334M46720;
                c15071.f49216 = c18251M19990;
                if (c18251M19991 == null) {
                    return c15071;
                }
                try {
                    c18251M19991.close();
                    return c15071;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c18251M19990 != null) {
                        c18251M19990.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c18251M19991 != null) {
                    try {
                        c18251M19991.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
                c18251M19990.close();
            }
            throw th;
        }
    }
}
