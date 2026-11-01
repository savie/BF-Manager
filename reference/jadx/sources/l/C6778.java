package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6778 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f22880;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2668 f22881;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f22882;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f22883;

    public C6778(C20890 c20890, String str, C2668 c2668) {
        this.f22880 = c20890;
        this.f22882 = str;
        this.f22881 = c2668;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777((AbstractActivityC12483) this.f22880.requireActivity());
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f22883 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String str = this.f22882;
        C20890 c20890 = this.f22880;
        c20890.f67866 = str;
        if (c20890.f67868 == null || c20890.f67868.length < c20890.f67864.size()) {
            c20890.f67868 = new int[c20890.f67864.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c20890.f67864.size(); i2++) {
            if (this.f22881.m8214(((C15246) c20890.f67864.get(i2)).m36517())) {
                c20890.f67868[i] = i2;
                i++;
            }
            this.f22883.m5840((i * 100) / c20890.f67864.size());
            if (this.f22883.m5824()) {
                return;
            }
        }
        c20890.f67872 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f22883.m5824()) {
            return;
        }
        C20890 c20890 = this.f22880;
        c20890.f67867 = true;
        C20890.m46991(c20890);
        c20890.f67870.notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f22880.f67865.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f22883.m5825();
    }
}
