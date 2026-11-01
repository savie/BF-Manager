package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54F8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10193 extends C5253 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short f34822;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f34823;

    @Override // l.C5253
    /* JADX INFO: renamed from: ۙ */
    public final void mo14522(C21481 c21481) throws IOException {
        if (this.f34823 == null) {
            throw new IllegalStateException("Invalid stub: " + this.f34823);
        }
        m14523((short) ((m14517().contains(EnumC3841.OBJECT_UUID) ? 40 : 24) + this.f34823.length));
        super.mo14522(c21481);
        byte[] bArr = this.f34823;
        c21481.m48099(bArr.length);
        c21481.m48098(0);
        c21481.m48098(this.f34822);
        c21481.m48097(bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25970(short s) {
        this.f34822 = s;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25969(byte[] bArr) {
        this.f34823 = bArr;
    }
}
