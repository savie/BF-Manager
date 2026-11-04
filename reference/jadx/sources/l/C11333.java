package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAGY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11333 implements InterfaceC24760 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Charset f35706;

    public C11333(Charset charset) {
        this.f35706 = charset;
    }

    @Override // l.InterfaceC24760
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo28621(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, this.f35706);
    }

    @Override // l.InterfaceC24760
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo28622(String str) {
        return str.getBytes(this.f35706);
    }
}
