package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B0Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C13301 extends C2115 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m32846() {
        int iM7294 = m7294(4);
        if (iM7294 != 0) {
            return this.f6993.getInt(iM7294 + this.f6995);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32845() {
        int iM7294 = m7294(6);
        return (iM7294 == 0 || this.f6993.get(iM7294 + this.f6995) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final short m32843() {
        int iM7294 = m7294(8);
        if (iM7294 != 0) {
            return this.f6993.getShort(iM7294 + this.f6995);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final short m32842() {
        int iM7294 = m7294(12);
        if (iM7294 != 0) {
            return this.f6993.getShort(iM7294 + this.f6995);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short m32841() {
        int iM7294 = m7294(14);
        if (iM7294 != 0) {
            return this.f6993.getShort(iM7294 + this.f6995);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m32844(int i) {
        int iM7294 = m7294(16);
        if (iM7294 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f6993;
        int i2 = iM7294 + this.f6995;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32840() {
        int iM7294 = m7294(16);
        if (iM7294 == 0) {
            return 0;
        }
        int i = iM7294 + this.f6995;
        return this.f6993.getInt(this.f6993.getInt(i) + i);
    }
}
