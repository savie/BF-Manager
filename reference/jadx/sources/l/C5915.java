package l;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5915 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f20168;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f20169;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f20170;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f20171;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20172;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f20173;

    public C5915(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f20173 = arrayList;
        this.f20171 = 16;
        this.f20168 = 12544;
        this.f20170 = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f20172 = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C14383.f47128);
        this.f20169 = bitmap;
        arrayList.add(C1681.f6666);
        arrayList.add(C1681.f6668);
        arrayList.add(C1681.f6669);
        arrayList.add(C1681.f6671);
        arrayList.add(C1681.f6670);
        arrayList.add(C1681.f6667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14383 m16179() {
        int iMax;
        Bitmap bitmap = this.f20169;
        if (bitmap == null) {
            throw new AssertionError();
        }
        double dSqrt = -1.0d;
        int i = this.f20168;
        if (i > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i) {
                dSqrt = Math.sqrt(((double) i) / ((double) height));
            }
        } else {
            int i2 = this.f20170;
            if (i2 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i2) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        ArrayList arrayList = this.f20172;
        C12266 c12266 = new C12266(iArr, this.f20171, arrayList.isEmpty() ? null : (InterfaceC10855[]) arrayList.toArray(new InterfaceC10855[arrayList.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        C14383 c14383 = new C14383(c12266.f41025, this.f20173);
        c14383.m34613();
        return c14383;
    }
}
