package l;

import bin.mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۜᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7339 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22124 f24156;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7339(C22124 c22124, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f24156 = c22124;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C22124 c22124 = this.f24156;
        try {
            int iM50083 = C22124.m50083(m22914());
            c22124.m12566((Serializable) Integer.valueOf(iM50083));
            c22124.m29658().edit().putInt(c22124.m12557(), iM50083).apply();
            c22124.m50084(iM50083);
            m22951();
        } catch (ArithmeticException | IllegalArgumentException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
