package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65V2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2281 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f7427;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f7428;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17700 f7429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7430;

    public C2281(int i, int i2, String str, byte[] bArr) {
        this.f7430 = i;
        this.f7428 = str;
        this.f7427 = ByteBuffer.wrap(bArr);
        this.f7429 = new C17700(new C12479(this, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7726(C22815 c22815) {
        C17700 c17700 = this.f7429;
        int iM41455 = c17700.m41455();
        if (iM41455 == 0) {
            return;
        }
        C12479 c12479 = new C12479(this, c17700.m41459());
        C11733 c11733 = new C11733(c12479, new C6514(c12479.m30987(), c12479.m30987()));
        for (int i = 0; i < iM41455; i++) {
            c22815.accept(c11733);
            c12479.m31010();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m7725() {
        return this.f7427;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17700 m7728() {
        return this.f7429;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m7727() {
        return this.f7428;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m7729() {
        return this.f7430;
    }

    public final String toString() {
        return this.f7428;
    }
}
