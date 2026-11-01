package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۙۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public class C4606 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f16308 = {R.attr.layout_weight};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16309;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f16310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16311;

    public C4606() {
        super(-1, -1);
        this.f16310 = 0.0f;
    }

    public C4606(int i) {
        super(i, -1);
        this.f16310 = 0.0f;
    }

    public C4606(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16310 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16308);
        this.f16310 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
