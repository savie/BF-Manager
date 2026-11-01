package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17775 implements InterfaceC16966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC18481 f56364;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f56365;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f56366;

    public C17775(ViewOnClickListenerC18481 viewOnClickListenerC18481, C1777 c1777, ActivityC5677 activityC5677) {
        this.f56364 = viewOnClickListenerC18481;
        this.f56365 = c1777;
        this.f56366 = activityC5677;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16477() {
        return this.f56365.m5824();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo16479() {
        return this.f56366;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16481(int i) {
        this.f56365.m5840(i);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16475(int i) {
        this.f56365.m5832(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16476(C10617 c10617) {
        this.f56364.f58897.f25962.m42638(c10617, false);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16480() {
        this.f56365.m5825();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo16478() {
        return new C11322(this.f56366).m28381();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۖ */
    public final void mo16474() {
        C15829.m37618(R.string.MT_Protector);
    }
}
