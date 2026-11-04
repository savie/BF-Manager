package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.ܳۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15267 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17505 f49911;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7745 f49912;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final UUID f49913;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f49914;

    public C15267(C17505 c17505, C7745 c7745, UUID uuid, long j) {
        this.f49911 = c17505;
        this.f49912 = c7745;
        this.f49913 = uuid;
        this.f49914 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m36627() {
        long j;
        synchronized (this.f49911) {
            j = m36623().f25504;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID m36625() {
        UUID uuid;
        synchronized (this.f49911) {
            m36623();
            uuid = this.f49913;
        }
        return uuid;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36624() {
        byte[] bArr;
        synchronized (this.f49911) {
            bArr = (byte[]) m36623().f25501.f40313.clone();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7305 m36626() {
        C7305 c7305;
        synchronized (this.f49911) {
            C7305 c7306 = m36623().f25502;
            c7305 = new C7305(c7306.m23622(), c7306.m19989());
        }
        return c7305;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m36628(byte[] bArr) {
        long j;
        synchronized (this.f49911) {
            this.f49911.m41047();
            this.f49911.m41074();
            C7745 c7745M36623 = m36623();
            if (c7745M36623.f25504 <= this.f49911.f56891) {
                throw new IllegalStateException("Checkpoint has been superseded");
            }
            C12547 c12547M31220 = C12547.m31220(this.f49911.f56908 == null ? null : this.f49911.f56908.f32208, bArr);
            try {
                C7305 c7305 = new C7305(c7745M36623.f25502.m23622(), c7745M36623.f25502.m19989());
                try {
                    this.f49911.f56917.m33519(new C7745(c7305, c12547M31220, c7745M36623.f25503, c7745M36623.f25505, c7745M36623.f25504), Math.max(1L, Math.max(this.f49914, bArr.length)));
                    this.f49911.f56891 = c7745M36623.f25504;
                    if (this.f49911.f56910 == c7745M36623.f25504) {
                        C12547 c12547 = this.f49911.f56893;
                        C17505 c17505 = this.f49911;
                        c12547M31220.m31223();
                        c17505.f56893 = c12547M31220;
                        c12547.close();
                        this.f49911.f56911 = 0L;
                    }
                    j = c7745M36623.f25504;
                    close();
                    c12547M31220.close();
                } catch (Error | RuntimeException e) {
                    c7305.close();
                    throw e;
                }
            } catch (Throwable th) {
                c12547M31220.close();
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C7745 m36623() {
        C7745 c7745 = this.f49912;
        if (c7745 != null) {
            return c7745;
        }
        throw new IllegalStateException("Checkpoint is closed or already published");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f49911) {
            C7745 c7745 = this.f49912;
            this.f49912 = null;
            if (c7745 != null) {
                c7745.close();
            }
        }
    }
}
