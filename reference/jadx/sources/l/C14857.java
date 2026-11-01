package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14857 implements InterfaceC1179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1179 f48555;

    public C14857(InterfaceC1179 interfaceC1179) {
        this.f48555 = interfaceC1179;
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final C11392 mo4314() {
        C11392 c11392Mo4314 = this.f48555.mo4314();
        C20659.m46512().getClass();
        return C16737.m39288(R.string.MT_Protector).equals(c11392Mo4314.m28501()) ? new C11392("", c11392Mo4314.m28499(), c11392Mo4314.m28502(), c11392Mo4314.m28500()) : c11392Mo4314;
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4317() {
        return C6824.m18428(((C6389) this.f48555).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo4313() {
        return C6824.m18430(((C6389) this.f48555).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۚ */
    public final C15721 mo4316() {
        return C6824.m18431(((C6389) this.f48555).f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final void mo4315(Runnable runnable) {
        ((C6389) this.f48555).mo4315(runnable);
    }
}
