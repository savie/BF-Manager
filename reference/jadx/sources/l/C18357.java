package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18357 implements InterfaceC11379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f59835;

    public C18357(ActivityC22568 activityC22568) {
        this.f59835 = activityC22568;
    }

    @Override // l.InterfaceC11379
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28705() {
        return this.f59835.m50828();
    }

    @Override // l.InterfaceC11379
    /* JADX INFO: renamed from: ۙ */
    public final void mo28704(boolean z) {
        ActivityC22568 activityC22568 = this.f59835;
        activityC22568.f72944 = z;
        activityC22568.m40418(R.id.MT_Protector).setAlpha(z ? 1.0f : 0.3f);
        if (z) {
            activityC22568.m50817();
        } else {
            activityC22568.mo44746();
        }
    }
}
