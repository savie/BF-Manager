package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6432 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f21662;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f21663;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f21664;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f21665;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f21666;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18208(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4421);
        this.f21665 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f21662 = typedArrayObtainStyledAttributes.getFloat(index, this.f21662);
            } else if (index == 0) {
                this.f21664 = typedArrayObtainStyledAttributes.getInt(index, this.f21664);
                this.f21664 = C4194.f15339[this.f21664];
            } else if (index == 4) {
                this.f21666 = typedArrayObtainStyledAttributes.getInt(index, this.f21666);
            } else if (index == 3) {
                this.f21663 = typedArrayObtainStyledAttributes.getFloat(index, this.f21663);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
