package l;

import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۜ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7103 extends AbstractC4306 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12086 f23794;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23795;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ */
    public final void mo11186(int i) {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶ */
    public final void mo11193() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7103(C21920 c21920, boolean z, InterfaceC12086 interfaceC12086) {
        super(c21920);
        this.f23795 = z;
        this.f23794 = interfaceC12086;
    }

    @Override // l.AbstractC4306, l.InterfaceC9868
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo10347() {
        return this.f23795;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final ISequentialOutStream mo11194() {
        return new C21778(4, this.f23794);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۨ */
    public final void mo10349() {
        this.f23794.mo30077();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f23794.mo2357();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo10348(int i) {
        this.f23794.mo30074(i);
    }
}
