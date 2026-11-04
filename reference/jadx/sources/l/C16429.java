package l;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16429 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f53307;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f53308;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53309;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53310;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f53311;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53312;

    public C16429(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f53309 = arrayList;
        this.f53308 = 16;
        this.f53312 = 12544;
        this.f53310 = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f53311 = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C20905.f66908);
        this.f53307 = bitmap;
        arrayList.add(C12700.f40680);
        arrayList.add(C12700.f40678);
        arrayList.add(C12700.f40682);
        arrayList.add(C12700.f40681);
        arrayList.add(C12700.f40679);
        arrayList.add(C12700.f40683);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20905 m38992() {
        int iMax;
        Bitmap bitmap = this.f53307;
        if (bitmap == null) {
            throw new AssertionError();
        }
        double dSqrt = -1.0d;
        int i = this.f53312;
        if (i > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i) {
                dSqrt = Math.sqrt(((double) i) / ((double) height));
            }
        } else {
            int i2 = this.f53310;
            if (i2 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i2) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        ArrayList arrayList = this.f53311;
        C17175 c17175 = new C17175(iArr, this.f53308, arrayList.isEmpty() ? null : (InterfaceC23889[]) arrayList.toArray(new InterfaceC23889[arrayList.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        C20905 c20905 = new C20905(this.f53309, c17175.f55989);
        c20905.m47765();
        return c20905;
    }
}
