package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public final class C22594 extends AbstractC9781 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19610 f73042;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22594(C19610 c19610, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204);
        this.f73042 = c19610;
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo5156() {
        C23255 c23255M25509;
        try {
            int i = Integer.parseInt(m25509(0).m54021().toString());
            try {
                int i2 = Integer.parseInt(m25509(1).m54021().toString());
                int i3 = C24832.f80322;
                if (i < 1) {
                    i = 1;
                }
                if (i2 < i) {
                    i2 = i;
                }
                ApplicationC17729.f58258.edit().mo3486(i, "text_function_min_line").mo3486(i2, "text_function_max_line").apply();
                C24832.m55358();
                this.f73042.m45260();
                return true;
            } catch (NumberFormatException unused) {
                C22673.m51152(R.string.MT_Protector);
                c23255M25509 = m25509(1);
                c23255M25509.mo52316(0, c23255M25509.m54099());
                c23255M25509.requestFocus();
                return false;
            }
        } catch (NumberFormatException unused2) {
            C22673.m51152(R.string.MT_Protector);
            c23255M25509 = m25509(0);
        }
    }
}
