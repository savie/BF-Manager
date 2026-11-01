package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22009 implements InterfaceC16261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f71358;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f71359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f71360;

    public C22009(C7898 c7898, C1777 c1777, ActivityC5677 activityC5677) {
        this.f71358 = c7898;
        this.f71359 = c1777;
        this.f71360 = activityC5677;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15792() {
        return this.f71359.m5824();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo15793() {
        return this.f71360;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15795(int i) {
        this.f71359.m5840(i);
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final void mo15791(int i, int i2) {
        this.f71360.m30997(R.string.MT_Protector, C16737.m39264(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C7898 c7898 = this.f71358;
        for (C0841 c0841 : c7898.f25968) {
            if (c0841.f3484) {
                c0841.f3485 = c0841.f3483;
                c0841.f3484 = false;
            }
        }
        c7898.f25961 = false;
        c7898.m20904();
        c7898.f25967.notifyDataSetChanged();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15794() {
        this.f71359.m5825();
    }
}
