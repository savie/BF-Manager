package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51Z */
/* JADX INFO: loaded from: classes4.dex */
public class C17046 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54436;

    public C17046(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54436 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12108.f40527);
        this.f54436 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C17046(C17046 c17046) {
        super((ViewGroup.MarginLayoutParams) c17046);
        this.f54436 = 0;
        this.f54436 = c17046.f54436;
    }

    public C17046(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f54436 = 0;
    }
}
