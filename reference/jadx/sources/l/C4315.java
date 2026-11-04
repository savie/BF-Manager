package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4315 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15642;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5061 f15643;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4315(AbstractActivityC17204 abstractActivityC17204, C5061 c5061, int i) {
        super(abstractActivityC17204, -1);
        this.f15643 = c5061;
        this.f15642 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.isEmpty() || strM22914.equals(this.f15643.m15318())) {
            m22951();
        } else if (C22961.m51816(strM22914)) {
            m22952(R.string.MT_Protector);
        } else {
            C22961.m51791(this.f15642, strM22914);
            m22951();
        }
    }
}
