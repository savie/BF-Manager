package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֫ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3IR */
/* JADX INFO: loaded from: classes2.dex */
public class C2115 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f6993;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f6994;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f6995;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6996;

    public C2115() {
        C5596.m16574();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7294(int i) {
        if (i < this.f6994) {
            return this.f6993.getShort(this.f6996 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7295(ByteBuffer byteBuffer, int i) {
        this.f6993 = byteBuffer;
        if (byteBuffer != null) {
            this.f6995 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f6996 = i2;
            this.f6994 = this.f6993.getShort(i2);
            return;
        }
        this.f6995 = 0;
        this.f6996 = 0;
        this.f6994 = 0;
    }
}
