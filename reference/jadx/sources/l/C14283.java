package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PAGY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14283 implements InterfaceC1581 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Charset f46809;

    public C14283(Charset charset) {
        this.f46809 = charset;
    }

    @Override // l.InterfaceC1581
    /* JADX INFO: renamed from: ۙ */
    public final String mo5388(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, this.f46809);
    }

    @Override // l.InterfaceC1581
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo5389(String str) {
        return str.getBytes(this.f46809);
    }
}
