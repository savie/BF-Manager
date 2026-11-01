package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C12602 extends AbstractDialogInterfaceOnClickListenerC17341 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.isEmpty()) {
            m40364();
        } else if (C23186.m51200(strM40352)) {
            m40365(R.string.MT_Protector);
        } else {
            C23186.m51182(strM40352);
            m40364();
        }
    }
}
