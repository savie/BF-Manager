package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes.dex */
public class C24556 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79592;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f79593;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f79594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79595;

    public C24556(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79592 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8147.f26866);
        this.f79592 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
