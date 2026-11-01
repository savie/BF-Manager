package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21672 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f70280;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f70281;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f70282;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f70283;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f70284;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f70285;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f70286;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f70287;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f70288;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f70289;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f70290;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f70291;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f70292;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f70293;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48404(C21672 c21672) {
        this.f70287 = c21672.f70287;
        this.f70282 = c21672.f70282;
        this.f70285 = c21672.f70285;
        this.f70292 = c21672.f70292;
        this.f70281 = c21672.f70281;
        this.f70288 = c21672.f70288;
        this.f70283 = c21672.f70283;
        this.f70286 = c21672.f70286;
        this.f70293 = c21672.f70293;
        this.f70290 = c21672.f70290;
        this.f70291 = c21672.f70291;
        this.f70284 = c21672.f70284;
        this.f70289 = c21672.f70289;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f70280 = sparseIntArray;
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
    public final void m48403(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51876);
        this.f70287 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f70280.get(index)) {
                case 1:
                    this.f70282 = typedArrayObtainStyledAttributes.getFloat(index, this.f70282);
                    break;
                case 2:
                    this.f70285 = typedArrayObtainStyledAttributes.getFloat(index, this.f70285);
                    break;
                case 3:
                    this.f70292 = typedArrayObtainStyledAttributes.getFloat(index, this.f70292);
                    break;
                case 4:
                    this.f70281 = typedArrayObtainStyledAttributes.getFloat(index, this.f70281);
                    break;
                case 5:
                    this.f70288 = typedArrayObtainStyledAttributes.getFloat(index, this.f70288);
                    break;
                case 6:
                    this.f70283 = typedArrayObtainStyledAttributes.getDimension(index, this.f70283);
                    break;
                case 7:
                    this.f70286 = typedArrayObtainStyledAttributes.getDimension(index, this.f70286);
                    break;
                case 8:
                    this.f70293 = typedArrayObtainStyledAttributes.getDimension(index, this.f70293);
                    break;
                case 9:
                    this.f70290 = typedArrayObtainStyledAttributes.getDimension(index, this.f70290);
                    break;
                case 10:
                    this.f70291 = typedArrayObtainStyledAttributes.getDimension(index, this.f70291);
                    break;
                case 11:
                    this.f70284 = true;
                    this.f70289 = typedArrayObtainStyledAttributes.getDimension(index, this.f70289);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
