package l;

import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9981 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18145 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("trash");
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("trash");
        int iM47975 = c21422.m47975();
        Button buttonM44373 = m12943(c21422, R.string.MT_Protector, iM47975 == 1 ? C16737.m39264(R.string.MT_Protector, c21422.m47981().mo7963()) : C16737.m39264(R.string.MT_Protector, Integer.valueOf(iM47975))).m44373();
        buttonM44373.setClickable(false);
        C16737.m39267(300L, new RunnableC20410(2, buttonM44373));
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C21673.class);
        c10142.m25776(c21422.m47979());
        c10142.m25777(c21422);
        c10142.m25768("deleteFrom", c21422.m47976());
        c10142.m25769("recycle", false);
        c10142.m25769("speedMode", false);
        c10142.m25764(0, "minTotal");
        c10142.m25763();
    }
}
