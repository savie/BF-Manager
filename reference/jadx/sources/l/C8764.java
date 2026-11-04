package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8764 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11273 f28485;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28486;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f28487;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f28488;

    public C8764(C2009 c2009, String str, C11273 c11273) {
        this.f28487 = c2009;
        this.f28486 = str;
        this.f28485 = c11273;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745((AbstractActivityC17204) this.f28487.requireActivity());
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f28488 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str = this.f28486;
        C2009 c2009 = this.f28487;
        c2009.f6688 = str;
        if (c2009.f6685 == null || c2009.f6685.length < c2009.f6682.size()) {
            c2009.f6685 = new int[c2009.f6682.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c2009.f6682.size(); i2++) {
            if (this.f28485.m28527(((C13984) c2009.f6682.get(i2)).m34072())) {
                c2009.f6685[i] = i2;
                i++;
            }
            this.f28488.m27403((i * 100) / c2009.f6682.size());
            if (this.f28488.m27399()) {
                return;
            }
        }
        c2009.f6691 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f28488.m27399()) {
            return;
        }
        C2009 c2009 = this.f28487;
        c2009.f6683 = true;
        C2009.m6883(c2009);
        c2009.f6689.notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f28487.f6686.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f28488.m27405();
    }
}
