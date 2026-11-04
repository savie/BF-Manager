package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۧۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11448 extends AbstractC24129 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CRC32 f35969;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11448(InterfaceC7509 interfaceC7509, CRC32 crc32) {
        super(interfaceC7509);
        this.f35969 = crc32;
    }

    @Override // l.AbstractC24129
    /* JADX INFO: renamed from: ۙ */
    public final void mo6198(byte[] bArr, int i, int i2) {
        this.f35969.update(bArr, i, i2);
    }
}
