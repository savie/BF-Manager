package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23007 implements InterfaceC16261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f74768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f74769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f74770;

    public C23007(C20890 c20890, C1777 c1777, ActivityC5677 activityC5677) {
        this.f74768 = c20890;
        this.f74769 = c1777;
        this.f74770 = activityC5677;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15792() {
        return this.f74769.m5824();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo15793() {
        return this.f74770;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15795(int i) {
        this.f74769.m5840(i);
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final void mo15791(int i, int i2) {
        this.f74770.m30997(R.string.MT_Protector, C16737.m39264(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C20890 c20890 = this.f74768;
        for (C15246 c15246 : c20890.f67864) {
            if (c15246.f49711) {
                c15246.f49712 = c15246.f49710;
                c15246.f49711 = false;
            }
        }
        c20890.f67873 = false;
        c20890.m46996();
        c20890.f67870.notifyDataSetChanged();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15794() {
        this.f74769.m5825();
    }
}
