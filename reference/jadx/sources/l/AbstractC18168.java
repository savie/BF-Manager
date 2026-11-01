package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ᩳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18168 extends C4751 {
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo950(AbstractActivityC12483 abstractActivityC12483);

    public AbstractC18168(Context context) {
        super(context);
    }

    public AbstractC18168(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC18168(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AbstractC18168(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ᩻ */
    public final void mo8454() {
        mo950((AbstractActivityC12483) C8703.m22527(m13133()));
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m42292() {
        SharedPreferences sharedPreferencesM13177 = m13177();
        C13638.requireNonNull(sharedPreferencesM13177);
        return sharedPreferencesM13177;
    }
}
