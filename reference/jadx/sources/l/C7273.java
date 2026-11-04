package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7273 implements InterfaceC16793 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f23963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f23964;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f23965;

    public C7273(C2009 c2009, C10745 c10745, ActivityC0848 activityC0848) {
        this.f23963 = c2009;
        this.f23964 = c10745;
        this.f23965 = activityC0848;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13593() {
        return this.f23964.m27399();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo13594() {
        return this.f23965;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13596(int i) {
        this.f23964.m27403(i);
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final void mo13592(int i, int i2) {
        this.f23965.m40397(R.string.MT_Protector, C21576.m49059(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C2009 c2009 = this.f23963;
        for (C13984 c13984 : c2009.f6682) {
            if (c13984.f44335) {
                c13984.f44336 = c13984.f44334;
                c13984.f44335 = false;
            }
        }
        c2009.f6690 = false;
        c2009.m6891();
        c2009.f6689.notifyDataSetChanged();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13595() {
        this.f23964.m27405();
    }
}
