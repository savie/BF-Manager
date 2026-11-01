package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֨ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B0Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0904 extends C3726 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m3598() {
        int iM10907 = m10907(4);
        if (iM10907 != 0) {
            return this.f13534.getInt(iM10907 + this.f13536);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m3603() {
        int iM10907 = m10907(6);
        return (iM10907 == 0 || this.f13534.get(iM10907 + this.f13536) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short m3600() {
        int iM10907 = m10907(8);
        if (iM10907 != 0) {
            return this.f13534.getShort(iM10907 + this.f13536);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final short m3604() {
        int iM10907 = m10907(12);
        if (iM10907 != 0) {
            return this.f13534.getShort(iM10907 + this.f13536);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short m3601() {
        int iM10907 = m10907(14);
        if (iM10907 != 0) {
            return this.f13534.getShort(iM10907 + this.f13536);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m3602(int i) {
        int iM10907 = m10907(16);
        if (iM10907 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f13534;
        int i2 = iM10907 + this.f13536;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3599() {
        int iM10907 = m10907(16);
        if (iM10907 == 0) {
            return 0;
        }
        int i = iM10907 + this.f13536;
        return this.f13534.getInt(this.f13534.getInt(i) + i);
    }
}
