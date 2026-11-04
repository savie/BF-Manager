package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C24453 extends AbstractDialogInterfaceOnClickListenerC8552 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            m22951();
        } else if (C22961.m51816(strM22914)) {
            m22952(R.string.MT_Protector);
        } else {
            C22961.m51793(strM22914);
            m22951();
        }
    }
}
