package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۚᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB0L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5844 extends C2115 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5844 m17027(ByteBuffer byteBuffer) {
        C5844 c5844 = new C5844();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        c5844.m7295(byteBuffer, byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()));
        return c5844;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m17030() {
        int iM7294 = m7294(4);
        if (iM7294 != 0) {
            return this.f6993.getInt(iM7294 + this.f6995);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17029(C13301 c13301, int i) {
        int iM7294 = m7294(6);
        if (iM7294 != 0) {
            int i2 = iM7294 + this.f6995;
            int i3 = (i * 4) + this.f6993.getInt(i2) + i2 + 4;
            c13301.m7295(this.f6993, this.f6993.getInt(i3) + i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17028() {
        int iM7294 = m7294(6);
        if (iM7294 == 0) {
            return 0;
        }
        int i = iM7294 + this.f6995;
        return this.f6993.getInt(this.f6993.getInt(i) + i);
    }
}
