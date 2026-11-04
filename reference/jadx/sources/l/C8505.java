package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8505 extends C12234 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f27810;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f27811;

    @Override // l.C12234
    /* JADX INFO: renamed from: ۙ */
    public final void mo3948(C7760 c7760) throws IOException {
        if (this.f27811 == null) {
            throw new IllegalStateException("Invalid stub: " + this.f27811);
        }
        m30523((short) ((m30520().contains(EnumC14471.OBJECT_UUID) ? 40 : 24) + this.f27811.length));
        super.mo3948(c7760);
        byte[] bArr = this.f27811;
        c7760.m21136(bArr.length);
        c7760.m21135(0);
        c7760.m21135(this.f27810);
        c7760.m21134(bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22821(short s) {
        this.f27810 = s;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22820(byte[] bArr) {
        this.f27811 = bArr;
    }
}
