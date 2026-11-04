package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۧᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11813 extends C3906 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2388(AbstractActivityC17204 abstractActivityC17204);

    public AbstractC11813(Context context) {
        super(context);
    }

    public AbstractC11813(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC11813(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractC11813(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ֨ */
    public final void mo12556() {
        mo2388((AbstractActivityC17204) C3200.m10534(m12560()));
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m29658() {
        SharedPreferences sharedPreferencesM12608 = m12608();
        C17359.requireNonNull(sharedPreferencesM12608);
        return sharedPreferencesM12608;
    }
}
