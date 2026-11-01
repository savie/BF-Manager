package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9450 extends AbstractDialogInterfaceOnClickListenerC17341 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (!strTrim.isEmpty()) {
            if (C4757.m13203(-1, strTrim)) {
                m40365(R.string.MT_Protector);
                return;
            } else {
                C4757.m13197(strTrim);
                m40364();
                return;
            }
        }
        m40364();
    }
}
