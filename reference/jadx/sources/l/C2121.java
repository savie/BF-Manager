package l;

import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.֫ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C2121 extends AbstractC7217 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6116 f7000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7001;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7308(int i) {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void mo7312() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2121(C17036 c17036, boolean z, InterfaceC6116 interfaceC6116) {
        super(c17036);
        this.f7001 = z;
        this.f7000 = interfaceC6116;
    }

    @Override // l.AbstractC7217, l.InterfaceC2742
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7310() {
        return this.f7001;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo7311() {
        return new C0747(this.f7000);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo7313() {
        this.f7000.mo17646();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f7000.mo924();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7309(int i) {
        this.f7000.mo17643(i);
    }
}
