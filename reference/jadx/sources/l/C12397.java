package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12397 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f39882;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39883;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f39885;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f39886;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39887;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f39888;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f39889;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30868(C12397 c12397) {
        this.f39888 = c12397.f39888;
        this.f39883 = c12397.f39883;
        this.f39885 = c12397.f39885;
        this.f39887 = c12397.f39887;
        this.f39884 = c12397.f39884;
        this.f39886 = c12397.f39886;
        this.f39889 = c12397.f39889;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39882 = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30867(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4432);
        this.f39888 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f39882.get(index)) {
                case 1:
                    this.f39886 = typedArrayObtainStyledAttributes.getFloat(index, this.f39886);
                    break;
                case 2:
                    this.f39887 = typedArrayObtainStyledAttributes.getInt(index, this.f39887);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f39885 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f39885 = C12573.f40368[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f39884 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f39883 = C4194.m13384(typedArrayObtainStyledAttributes, index, this.f39883);
                    break;
                case 6:
                    this.f39889 = typedArrayObtainStyledAttributes.getFloat(index, this.f39889);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
