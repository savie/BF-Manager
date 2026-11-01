package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K8BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14223 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f46618;

    public C14223(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f46618 = str;
        m12944();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        return c21422.m47974(this.f46618) && c11545M47970.m28814("local") && !c11545M47970.m28794();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c21422.m47963(this.f46618);
        c11545M47970.m28775("local");
        m12943(c21422, R.string.MT_Protector, AbstractC4674.m12940(c21422, R.string.MT_Protector));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        c11545M47970.m28775("local");
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c11545M47970.m28798(), new String[0]);
        if (!abstractC20745M15313.mo33975() || abstractC20745M15313.mo8447()) {
            List listM47979 = c21422.m47979();
            int i = C20725.f67443;
            C10142 c10142 = new C10142(C23395.class);
            c10142.m25779(listM47979);
            c10142.m25780(c21422);
            c10142.m25773(c21422.m47960());
            c10142.m25768("targetPath", c11545M47970.m28798());
            c10142.m25763();
            return;
        }
        c21422.m47980().m31000(C16737.m39264(R.string.MT_Protector, c11545M47970.m28798()), false);
    }
}
