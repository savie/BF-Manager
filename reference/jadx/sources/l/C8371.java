package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8371 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11273 f27460;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27461;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f27462;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f27463;

    public C8371(C1965 c1965, String str, C11273 c11273) {
        this.f27462 = c1965;
        this.f27461 = str;
        this.f27460 = c11273;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745((AbstractActivityC17204) this.f27462.requireActivity());
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f27463 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str = this.f27461;
        C1965 c1965 = this.f27462;
        c1965.f6594 = str;
        if (c1965.f6591 == null || c1965.f6591.length < c1965.f6596.size()) {
            c1965.f6591 = new int[c1965.f6596.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c1965.f6596.size(); i2++) {
            if (this.f27460.m28527(((C13591) c1965.f6596.get(i2)).m33319())) {
                c1965.f6591[i] = i2;
                i++;
            }
            this.f27463.m27403((i * 100) / c1965.f6596.size());
            if (this.f27463.m27399()) {
                return;
            }
        }
        c1965.f6597 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f27463.m27399()) {
            return;
        }
        C1965 c1965 = this.f27462;
        c1965.f6589 = true;
        C1965.m6764(c1965);
        c1965.f6595.notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f27462.f6592.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f27463.m27405();
    }
}
