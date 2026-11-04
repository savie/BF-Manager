package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9020 implements InterfaceC0817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f29374;

    @Override // l.InterfaceC0817
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo3286() {
        return C9765.m25437(this);
    }

    public C9020(AbstractC22044 abstractC22044) {
        this.f29374 = abstractC22044;
    }

    @Override // l.InterfaceC0817
    public final InputStream getInputStream() {
        return this.f29374.mo4290();
    }

    @Override // l.InterfaceC0817
    public final long length() {
        return this.f29374.mo4285();
    }
}
