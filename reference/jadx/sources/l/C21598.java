package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes.dex */
public final class C21598 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18614 f69001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21598(C18614 c18614, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f69001 = c18614;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (!C17394.m40858(strTrim)) {
            m22952(R.string.MT_Protector);
            return;
        }
        C17394.m40860(strTrim);
        this.f69001.mo7306();
        m22951();
    }
}
