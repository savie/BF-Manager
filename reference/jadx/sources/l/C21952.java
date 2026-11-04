package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes.dex */
public final class C21952 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10567 f70858;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21952(AbstractActivityC17204 abstractActivityC17204, C10567 c10567) {
        super(abstractActivityC17204, -1);
        this.f70858 = c10567;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (!strTrim.isEmpty()) {
            C10567 c10567 = this.f70858;
            String str = c10567.f33581;
            int i = c10567.f33580;
            if (!strTrim.equals(str)) {
                if (C19518.m45051(i, strTrim)) {
                    m22952(R.string.MT_Protector);
                    return;
                } else {
                    C19518.m45061(i, strTrim);
                    m22951();
                    return;
                }
            }
        }
        m22951();
    }
}
