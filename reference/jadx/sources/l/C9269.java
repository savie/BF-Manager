package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9269 implements InterfaceC16966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2917 f31508;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f31509;

    public C9269(ViewOnClickListenerC2917 viewOnClickListenerC2917, C1777 c1777) {
        this.f31508 = viewOnClickListenerC2917;
        this.f31509 = c1777;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16477() {
        return this.f31509.m5824();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo16479() {
        return this.f31508.f10974;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16481(int i) {
        this.f31509.m5840(i);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16475(int i) {
        this.f31509.m5832(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16476(C10617 c10617) {
        ViewOnClickListenerC2917 viewOnClickListenerC2917 = this.f31508;
        viewOnClickListenerC2917.f10964.m42638(c10617, viewOnClickListenerC2917.f10968);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16480() {
        this.f31509.m5825();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo16478() {
        return new C11322(this.f31508.f10974).m28381();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۖ */
    public final void mo16474() {
        C15829.m37618(R.string.MT_Protector);
    }
}
