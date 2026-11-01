package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final class C9973 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f34083;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9973(C20556 c20556, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f34083 = c20556;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        try {
            if (!this.f34083.f66562.m17058(Integer.parseInt(m40352()) - 1)) {
                m40365(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        m40364();
    }
}
