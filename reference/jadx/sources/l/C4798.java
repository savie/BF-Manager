package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4798 extends AbstractDialogInterfaceOnClickListenerC8552 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (!strTrim.isEmpty()) {
            if (C19518.m45051(-1, strTrim)) {
                m22952(R.string.MT_Protector);
                return;
            } else {
                C19518.m45045(strTrim);
                m22951();
                return;
            }
        }
        m22951();
    }
}
