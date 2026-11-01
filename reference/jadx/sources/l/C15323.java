package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15323 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f49908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f49909;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f49910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f49911;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f49912;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36684(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51898);
        this.f49912 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f49909 = typedArrayObtainStyledAttributes.getFloat(index, this.f49909);
            } else if (index == 0) {
                this.f49910 = typedArrayObtainStyledAttributes.getInt(index, this.f49910);
                this.f49910 = C18144.f58022[this.f49910];
            } else if (index == 4) {
                this.f49908 = typedArrayObtainStyledAttributes.getInt(index, this.f49908);
            } else if (index == 3) {
                this.f49911 = typedArrayObtainStyledAttributes.getFloat(index, this.f49911);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
