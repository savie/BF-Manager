package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W51Z */
/* JADX INFO: loaded from: classes2.dex */
public class C1453 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5085;

    public C1453(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5085 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10401.f33081);
        this.f5085 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1453(C1453 c1453) {
        super((ViewGroup.MarginLayoutParams) c1453);
        this.f5085 = 0;
        this.f5085 = c1453.f5085;
    }

    public C1453(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5085 = 0;
    }
}
