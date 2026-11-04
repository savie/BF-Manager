package l;

import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9981 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6093 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("trash");
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("trash");
        int iM31981 = c12915.m31981();
        Button buttonM22436 = m25620(c12915, R.string.MT_Protector, iM31981 == 1 ? C21576.m49059(R.string.MT_Protector, c12915.m31989().mo8100()) : C21576.m49059(R.string.MT_Protector, Integer.valueOf(iM31981))).m22436();
        buttonM22436.setClickable(false);
        C21576.m49062(300L, new RunnableC8518(3, buttonM22436));
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C12058.class);
        c8458.m22727(c12915.m31982());
        c8458.m22728(c12915);
        c8458.m22719("deleteFrom", c12915.m31980());
        c8458.m22720("recycle", false);
        c8458.m22720("speedMode", false);
        c8458.m22715(0, "minTotal");
        c8458.m22714();
    }
}
