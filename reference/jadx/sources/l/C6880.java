package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880 implements InterfaceC16793 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f22839;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f22840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f22841;

    public C6880(C1965 c1965, C10745 c10745, ActivityC0848 activityC0848) {
        this.f22839 = c1965;
        this.f22840 = c10745;
        this.f22841 = activityC0848;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13593() {
        return this.f22840.m27399();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo13594() {
        return this.f22841;
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13596(int i) {
        this.f22840.m27403(i);
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ۙ */
    public final void mo13592(int i, int i2) {
        this.f22841.m40397(R.string.MT_Protector, C21576.m49059(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C1965 c1965 = this.f22839;
        for (C13591 c13591 : c1965.f6596) {
            if (c13591.f43170) {
                c13591.f43171 = c13591.f43169;
                c13591.f43170 = false;
            }
        }
        c1965.f6598 = false;
        c1965.m6772();
        c1965.f6595.notifyDataSetChanged();
    }

    @Override // l.InterfaceC16793
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13595() {
        this.f22840.m27405();
    }
}
