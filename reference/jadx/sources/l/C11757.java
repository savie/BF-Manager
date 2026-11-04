package l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۧܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NF */
/* JADX INFO: loaded from: classes4.dex */
public class C11757 extends C18277 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38006;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38007;

    public C11757(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38006 = true;
    }

    public C11757(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38006 = true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f38006;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29524(boolean z) {
        this.f38006 = z;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f38007 = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public final int getThreshold() {
        return this.f38007;
    }
}
