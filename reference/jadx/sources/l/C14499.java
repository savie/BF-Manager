package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܳۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5UC */
/* JADX INFO: loaded from: classes4.dex */
public class C14499 extends ListView {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f47497;

    public C14499(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C14499(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34915(int i) {
        this.f47497 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34914() {
        return this.f47497;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f47497 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f47497;
            if (size > i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
    }
}
