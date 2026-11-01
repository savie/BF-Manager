package l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܶ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NF */
/* JADX INFO: loaded from: classes5.dex */
public class C15492 extends C15760 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50470;

    public C15492(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50469 = true;
    }

    public C15492(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50469 = true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f50469;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37081(boolean z) {
        this.f50469 = z;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f50470 = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public final int getThreshold() {
        return this.f50470;
    }
}
