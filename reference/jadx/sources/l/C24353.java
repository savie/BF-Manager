package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24353 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21369 f78967;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78968;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24353(ActivityC21369 activityC21369, AbstractActivityC17204 abstractActivityC17204, int i) {
        super(abstractActivityC17204, -1);
        this.f78967 = activityC21369;
        this.f78968 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        int i;
        try {
            i = Integer.parseInt(m22914());
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            m22951();
        } else if (i > this.f78968) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C6453(this, i).m8197();
        }
    }
}
