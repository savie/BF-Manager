package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes5.dex */
public class C21362 extends C6606 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int f69489;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int f69490;

    public C21362(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12108.f40529);
        this.f69489 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f69490 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        setFastScrollEnabled(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47894(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f69490, getPaddingRight(), z2 ? getPaddingBottom() : this.f69489);
    }
}
