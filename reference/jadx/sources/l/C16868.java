package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes5.dex */
public final class C16868 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f55184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16868(C23582 c23582, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f55184 = c23582;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        try {
            if (!this.f55184.f76571.m54017(Integer.parseInt(m22914()) - 1)) {
                m22952(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        m22951();
    }
}
