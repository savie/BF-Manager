package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.۬ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB0L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12900 extends C3726 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12900 m31973(ByteBuffer byteBuffer) {
        C12900 c12900 = new C12900();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        c12900.m10908(byteBuffer, byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()));
        return c12900;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31976() {
        int iM10907 = m10907(4);
        if (iM10907 != 0) {
            return this.f13534.getInt(iM10907 + this.f13536);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31975(C0904 c0904, int i) {
        int iM10907 = m10907(6);
        if (iM10907 != 0) {
            int i2 = iM10907 + this.f13536;
            int i3 = (i * 4) + this.f13534.getInt(i2) + i2 + 4;
            c0904.m10908(this.f13534, this.f13534.getInt(i3) + i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31974() {
        int iM10907 = m10907(6);
        if (iM10907 == 0) {
            return 0;
        }
        int i = iM10907 + this.f13536;
        return this.f13534.getInt(this.f13534.getInt(i) + i);
    }
}
