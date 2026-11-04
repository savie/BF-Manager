package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18716 implements InterfaceC0817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f60847;

    @Override // l.InterfaceC0817
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo3286() {
        return C9765.m25437(this);
    }

    @Override // l.InterfaceC0817
    public final InputStream getInputStream() {
        return new C11000(this.f60847);
    }

    public C18716(byte[] bArr) {
        this.f60847 = bArr;
    }

    @Override // l.InterfaceC0817
    public final long length() {
        return this.f60847.length;
    }
}
