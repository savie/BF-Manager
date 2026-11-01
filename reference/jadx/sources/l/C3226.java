package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.ۗ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3226 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final UUID f12029;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20990 f12030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1254 f12031;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f12032;

    public C3226(C1254 c1254, C20990 c20990, UUID uuid, long j) {
        this.f12031 = c1254;
        this.f12030 = c20990;
        this.f12029 = uuid;
        this.f12032 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m9677() {
        long j;
        synchronized (this.f12031) {
            j = m9674().f68348;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final UUID m9675() {
        UUID uuid;
        synchronized (this.f12031) {
            m9674();
            uuid = this.f12029;
        }
        return uuid;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m9676() {
        byte[] bArr;
        synchronized (this.f12031) {
            bArr = (byte[]) m9674().f68351.f70014.clone();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6276 m9679() {
        C6276 c6276;
        synchronized (this.f12031) {
            C6276 c6277 = m9674().f68349;
            c6276 = new C6276(c6277.m40840(), c6277.m17352());
        }
        return c6276;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m9678(byte[] bArr) {
        long j;
        synchronized (this.f12031) {
            this.f12031.m4491();
            this.f12031.m4520();
            C20990 c20990M9674 = m9674();
            if (c20990M9674.f68348 <= this.f12031.f5465) {
                throw new IllegalStateException("Checkpoint has been superseded");
            }
            C21571 c21571M48288 = C21571.m48288(this.f12031.f5467 == null ? null : this.f12031.f5467.f51982, bArr);
            try {
                C6276 c6276 = new C6276(c20990M9674.f68349.m40840(), c20990M9674.f68349.m17352());
                try {
                    this.f12031.f5471.m28027(new C20990(c6276, c21571M48288, c20990M9674.f68350, c20990M9674.f68352, c20990M9674.f68348), Math.max(1L, Math.max(this.f12032, bArr.length)));
                    this.f12031.f5465 = c20990M9674.f68348;
                    if (this.f12031.f5469 == c20990M9674.f68348) {
                        C21571 c21571 = this.f12031.f5451;
                        C1254 c1254 = this.f12031;
                        c21571M48288.m48290();
                        c1254.f5451 = c21571M48288;
                        c21571.close();
                        this.f12031.f5446 = 0L;
                    }
                    j = c20990M9674.f68348;
                    close();
                    c21571M48288.close();
                } catch (Error | RuntimeException e) {
                    c6276.close();
                    throw e;
                }
            } catch (Throwable th) {
                c21571M48288.close();
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C20990 m9674() {
        C20990 c20990 = this.f12030;
        if (c20990 != null) {
            return c20990;
        }
        throw new IllegalStateException("Checkpoint is closed or already published");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12031) {
            C20990 c20990 = this.f12030;
            this.f12030 = null;
            if (c20990 != null) {
                c20990.close();
            }
        }
    }
}
