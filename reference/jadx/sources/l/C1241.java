package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1241 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9443 f4490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241(C9443 c9443, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f4490 = c9443;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            m22951();
            return;
        }
        try {
            long j = Long.parseLong(strTrim);
            if (j < 100000 || j > 1000000000) {
                m22952(R.string.MT_Protector);
                return;
            }
            C9443 c9443 = this.f4490;
            c9443.m29658().edit().putInt(c9443.m12557(), (int) j).apply();
            m22951();
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
