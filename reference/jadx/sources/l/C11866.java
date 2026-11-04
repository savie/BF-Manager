package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۧ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O5UO */
/* JADX INFO: loaded from: classes3.dex */
public class C11866 extends ImageView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38249;

    public C11866(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C11866(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38249 = Integer.MAX_VALUE;
        this.f38248 = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30600, i, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i) {
        this.f38249 = i;
        super.setMaxWidth(i);
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.f38249;
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i) {
        this.f38248 = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.f38248;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f38249;
            if (i3 != Integer.MAX_VALUE && (i3 < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.f38248;
            if (i4 != Integer.MAX_VALUE && (i4 < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
