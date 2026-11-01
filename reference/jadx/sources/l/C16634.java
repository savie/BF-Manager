package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AJZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16634 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12401 f53363;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16634(C12401 c12401, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f53363 = c12401;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (strTrim.isEmpty()) {
            m40364();
            return;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (i < 0) {
                throw new NumberFormatException();
            }
            C12401 c12401 = this.f53363;
            c12401.m42292().edit().putInt(c12401.m13157(), i).apply();
            m40364();
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
