package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes5.dex */
public final class C21526 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17998 f69933;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21526(C17998 c17998, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f69933 = c17998;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        try {
            boolean[] zArrM33381 = C13672.m33381(Integer.parseInt(m40352(), 8));
            int i = 0;
            while (true) {
                C17998 c17998 = this.f69933;
                if (i < 12) {
                    c17998.f57542[i] = zArrM33381[i];
                    c17998.f57539[i].setChecked(zArrM33381[i]);
                    i++;
                } else {
                    c17998.m41906();
                    m40364();
                    return;
                }
            }
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
