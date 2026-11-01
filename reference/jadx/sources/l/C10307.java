package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10307 implements InterfaceC16966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7484 f35347;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f35348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f35349;

    public C10307(ViewOnClickListenerC7484 viewOnClickListenerC7484, C1777 c1777, ActivityC5677 activityC5677) {
        this.f35347 = viewOnClickListenerC7484;
        this.f35348 = c1777;
        this.f35349 = activityC5677;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16477() {
        return this.f35348.m5824();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo16479() {
        return this.f35349;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16481(int i) {
        this.f35348.m5840(i);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16475(int i) {
        this.f35348.m5832(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16476(C10617 c10617) {
        this.f35347.f24930.f67865.m42654(c10617, false);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16480() {
        this.f35348.m5825();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo16478() {
        return new C11322(this.f35349).m28381();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۖ */
    public final void mo16474() {
        C15829.m37618(R.string.MT_Protector);
    }
}
