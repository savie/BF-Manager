package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15585 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0061 f50697;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0176 f50698;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50699;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15585(ActivityC0061 activityC0061, AbstractActivityC12483 abstractActivityC12483, String str, C0176 c0176) {
        super(abstractActivityC12483, -1);
        this.f50697 = activityC0061;
        this.f50699 = str;
        this.f50698 = c0176;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.length() == 0 || strM40352.equalsIgnoreCase(this.f50699)) {
            m40364();
            return;
        }
        AbstractC20745 abstractC20745M1379 = this.f50698.m1379();
        AbstractC20745 abstractC20745M46706 = abstractC20745M1379.m46706(strM40352.concat(".mtd"));
        if (abstractC20745M46706.mo33975()) {
            m40365(R.string.MT_Protector);
            return;
        }
        abstractC20745M1379.mo24646(abstractC20745M46706);
        ActivityC0061.m972(this.f50697);
        m40364();
    }
}
