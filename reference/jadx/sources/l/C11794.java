package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11794 implements InterfaceC13911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f39597;

    @Override // l.InterfaceC13911
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo10545() {
        return C4737.m13105(this);
    }

    public C11794(AbstractC20745 abstractC20745) {
        this.f39597 = abstractC20745;
    }

    @Override // l.InterfaceC13911
    public final InputStream getInputStream() {
        return this.f39597.mo33970();
    }

    @Override // l.InterfaceC13911
    public final long length() {
        return this.f39597.mo33964();
    }
}
