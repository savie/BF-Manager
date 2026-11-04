package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public class C23740 extends C19987 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int f76945;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int f76946;

    public C23740(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10401.f33071);
        this.f76945 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f76946 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        setFastScrollEnabled(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53008(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f76946, getPaddingRight(), z2 ? getPaddingBottom() : this.f76945);
    }
}
