package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩶ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes5.dex */
public class C21234 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f67758 = {R.attr.layout_weight};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f67759;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f67760;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f67761;

    public C21234() {
        super(-1, -1);
        this.f67760 = 0.0f;
    }

    public C21234(int i) {
        super(i, -1);
        this.f67760 = 0.0f;
    }

    public C21234(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67760 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f67758);
        this.f67760 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
