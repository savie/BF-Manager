package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩷ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes4.dex */
public class C20909 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f67942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67943;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f67944;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f67945;

    public C20909(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67943 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17381.f55283);
        this.f67943 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
