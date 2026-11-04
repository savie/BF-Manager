package l;

import android.text.Editable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25325 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC24228 f81784;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f81785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f81786;

    public C25325(C1626 c1626, RunnableC24228 runnableC24228, C23255 c23255) {
        this.f81786 = c1626;
        this.f81784 = runnableC24228;
        this.f81785 = c23255;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1626 c1626 = this.f81786;
        RunnableC24228 runnableC24228 = this.f81784;
        c1626.removeCallbacks(runnableC24228);
        runnableC24228.run();
        Integer numM43756 = C18856.m43756(this.f81785.m54021().toString());
        boolean z = false;
        if (numM43756 == null) {
            c1626.m5768(C21576.m49088(R.string.MT_Protector));
        } else {
            c1626.m5768((CharSequence) null);
            c1626.m5769(false);
        }
        if (numM43756 != null && numM43756.intValue() != C0492.m2384()) {
            z = true;
        }
        c1626.m5763(z);
    }
}
