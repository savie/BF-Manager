package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5075 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f17675;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2668 f17676;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f17677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f17678;

    public C5075(C7898 c7898, String str, C2668 c2668) {
        this.f17675 = c7898;
        this.f17677 = str;
        this.f17676 = c2668;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777((AbstractActivityC12483) this.f17675.requireActivity());
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f17678 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String str = this.f17677;
        C7898 c7898 = this.f17675;
        c7898.f25963 = str;
        if (c7898.f25965 == null || c7898.f25965.length < c7898.f25968.size()) {
            c7898.f25965 = new int[c7898.f25968.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c7898.f25968.size(); i2++) {
            if (this.f17676.m8214(((C0841) c7898.f25968.get(i2)).m3454())) {
                c7898.f25965[i] = i2;
                i++;
            }
            this.f17678.m5840((i * 100) / c7898.f25968.size());
            if (this.f17678.m5824()) {
                return;
            }
        }
        c7898.f25969 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f17678.m5824()) {
            return;
        }
        C7898 c7898 = this.f17675;
        c7898.f25964 = true;
        C7898.m20898(c7898);
        c7898.f25967.notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f17675.f25962.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f17678.m5825();
    }
}
