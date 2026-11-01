package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۘۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3IR */
/* JADX INFO: loaded from: classes2.dex */
public class C3726 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f13534;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13535;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13536;

    public C3726() {
        C6549.m17780();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10907(int i) {
        if (i < this.f13535) {
            return this.f13534.getShort(this.f13533 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10908(ByteBuffer byteBuffer, int i) {
        this.f13534 = byteBuffer;
        if (byteBuffer != null) {
            this.f13536 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f13533 = i2;
            this.f13535 = this.f13534.getShort(i2);
            return;
        }
        this.f13536 = 0;
        this.f13533 = 0;
        this.f13535 = 0;
    }
}
