package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۢܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9643 extends AbstractC3624 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CRC32 f32443;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9643(InterfaceC5614 interfaceC5614, CRC32 crc32) {
        super(interfaceC5614);
        this.f32443 = crc32;
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final void mo6131(byte[] bArr, int i, int i2) {
        this.f32443.update(bArr, i, i2);
    }
}
