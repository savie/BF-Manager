package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes.dex */
public final class C23466 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3328 f75924;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23466(C3328 c3328, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f75924 = c3328;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        try {
            boolean[] zArrM18972 = C6790.m18972(Integer.parseInt(m22914(), 8));
            int i = 0;
            while (true) {
                C3328 c3328 = this.f75924;
                if (i < 12) {
                    c3328.f10891[i] = zArrM18972[i];
                    c3328.f10893[i].setChecked(zArrM18972[i]);
                    i++;
                } else {
                    c3328.m10965();
                    m22951();
                    return;
                }
            }
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
