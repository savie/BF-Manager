package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3227 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4783 f12033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3227(C4783 c4783, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f12033 = c4783;
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
            long j = Long.parseLong(strTrim);
            if (j < 100000 || j > 1000000000) {
                m40365(R.string.MT_Protector);
                return;
            }
            C4783 c4783 = this.f12033;
            c4783.m42292().edit().putInt(c4783.m13157(), (int) j).apply();
            m40364();
        } catch (NumberFormatException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
