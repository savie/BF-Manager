package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24332 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f78912;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f78913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f78914;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f78915;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f78916;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f78917;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f78918;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f78919;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f78920;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f78921;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f78922;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f78923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f78924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f78925;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54378(C24332 c24332) {
        this.f78916 = c24332.f78916;
        this.f78924 = c24332.f78924;
        this.f78922 = c24332.f78922;
        this.f78919 = c24332.f78919;
        this.f78918 = c24332.f78918;
        this.f78915 = c24332.f78915;
        this.f78913 = c24332.f78913;
        this.f78917 = c24332.f78917;
        this.f78925 = c24332.f78925;
        this.f78920 = c24332.f78920;
        this.f78921 = c24332.f78921;
        this.f78914 = c24332.f78914;
        this.f78923 = c24332.f78923;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f78912 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54377(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4435);
        this.f78916 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f78912.get(index)) {
                case 1:
                    this.f78924 = typedArrayObtainStyledAttributes.getFloat(index, this.f78924);
                    break;
                case 2:
                    this.f78922 = typedArrayObtainStyledAttributes.getFloat(index, this.f78922);
                    break;
                case 3:
                    this.f78919 = typedArrayObtainStyledAttributes.getFloat(index, this.f78919);
                    break;
                case 4:
                    this.f78918 = typedArrayObtainStyledAttributes.getFloat(index, this.f78918);
                    break;
                case 5:
                    this.f78915 = typedArrayObtainStyledAttributes.getFloat(index, this.f78915);
                    break;
                case 6:
                    this.f78913 = typedArrayObtainStyledAttributes.getDimension(index, this.f78913);
                    break;
                case 7:
                    this.f78917 = typedArrayObtainStyledAttributes.getDimension(index, this.f78917);
                    break;
                case 8:
                    this.f78925 = typedArrayObtainStyledAttributes.getDimension(index, this.f78925);
                    break;
                case 9:
                    this.f78920 = typedArrayObtainStyledAttributes.getDimension(index, this.f78920);
                    break;
                case 10:
                    this.f78921 = typedArrayObtainStyledAttributes.getDimension(index, this.f78921);
                    break;
                case 11:
                    this.f78914 = true;
                    this.f78923 = typedArrayObtainStyledAttributes.getDimension(index, this.f78923);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
