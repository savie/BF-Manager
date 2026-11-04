package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܿܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18453 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f60073;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f60074 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f60076 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Rect f60075 = new Rect();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43002() {
        ArrayList<C24421> arrayList = this.f60074;
        int size = (arrayList.size() * 8) + 32;
        ArrayList<C24421> arrayList2 = this.f60076;
        C6178 c6178 = new C6178((this.f60073.length * 4) + (arrayList2.size() * 8) + size);
        c6178.writeByte(0);
        c6178.writeByte(arrayList.size() * 2);
        c6178.writeByte(arrayList2.size() * 2);
        c6178.writeByte(this.f60073.length);
        c6178.writeInt(32);
        c6178.writeInt((arrayList.size() * 8) + 32);
        Rect rect = this.f60075;
        c6178.m17802(rect.left);
        c6178.m17802(rect.right);
        c6178.m17802(rect.top);
        c6178.m17802(rect.bottom);
        c6178.writeInt((arrayList2.size() * 8) + (arrayList.size() * 8) + 32);
        for (C24421 c24421 : arrayList) {
            c6178.m17802(c24421.f79289);
            c6178.m17802(c24421.f79288);
        }
        for (C24421 c24422 : arrayList2) {
            c6178.m17802(c24422.f79289);
            c6178.m17802(c24422.f79288);
        }
        for (int i : this.f60073) {
            c6178.m17802(i);
        }
        return c6178.m17808();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43001(Bitmap bitmap) {
        m43000(this.f60074, bitmap.getWidth());
        m43000(this.f60076, bitmap.getHeight());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43000(ArrayList arrayList, int i) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            i2 = 0;
            if (size < 0) {
                break;
            }
            C24421 c24421 = (C24421) arrayList.get(size);
            int i3 = c24421.f79289;
            int i4 = c24421.f79288;
            if (i3 >= i4) {
                arrayList.remove(size);
            } else {
                if (i3 < 0) {
                    c24421.f79289 = 0;
                }
                if (i4 > i) {
                    c24421.f79288 = i;
                }
            }
        }
        Collections.sort(arrayList);
        while (i2 < arrayList.size() - 1) {
            C24421 c24422 = (C24421) arrayList.get(i2);
            int i5 = i2 + 1;
            C24421 c24423 = (C24421) arrayList.get(i5);
            int i6 = c24423.f79289;
            int i7 = c24422.f79288;
            if (i6 <= i7) {
                c24422.f79288 = Math.max(i7, c24423.f79288);
                arrayList.remove(i5);
            } else {
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43003(Bitmap bitmap) {
        ArrayList<C24421> arrayListM42999 = m42999(this.f60074, bitmap.getWidth());
        ArrayList<C24421> arrayListM429910 = m42999(this.f60076, bitmap.getHeight());
        int[] iArr = new int[arrayListM429910.size() * arrayListM42999.size()];
        int i = 0;
        for (C24421 c24421 : arrayListM429910) {
            for (C24421 c24422 : arrayListM42999) {
                int i2 = c24422.f79289;
                int i3 = c24422.f79288;
                int i4 = c24421.f79289;
                int i5 = c24421.f79288;
                int pixel = bitmap.getPixel(i2, i4);
                while (true) {
                    if (i2 >= i3) {
                        int pixel2 = bitmap.getPixel(c24422.f79289, c24421.f79289);
                        if (Color.alpha(pixel2) == 0) {
                            pixel2 = 0;
                        }
                        iArr[i] = pixel2;
                        break;
                    }
                    for (int i6 = i4; i6 < i5; i6++) {
                        if (pixel != bitmap.getPixel(i2, i6)) {
                            iArr[i] = 1;
                            break;
                        }
                    }
                    i2++;
                }
                i++;
            }
        }
        this.f60073 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42999(ArrayList arrayList, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && arrayList.size() != 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C24421 c24421 = (C24421) arrayList.get(i4);
                if (i4 == 0 && (i3 = c24421.f79289) != 0) {
                    arrayList2.add(new C24421(0, i3));
                } else if (i4 > 0) {
                    arrayList2.add(new C24421(((C24421) arrayList.get(i4 - 1)).f79288, c24421.f79289));
                }
                arrayList2.add(new C24421(c24421.f79289, c24421.f79288));
                if (i4 == arrayList.size() - 1 && (i2 = c24421.f79288) < i) {
                    arrayList2.add(new C24421(i2, i));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m42998(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Rect rect = new Rect();
        if (!arrayList.isEmpty()) {
            rect.left = ((C24421) arrayList.get(0)).f79289;
            rect.right = i - ((C24421) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f79288;
        }
        if (!arrayList2.isEmpty()) {
            rect.top = ((C24421) arrayList2.get(0)).f79289;
            rect.bottom = i2 - ((C24421) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).f79288;
        }
        return rect;
    }

    public final String toString() {
        return "NinePatchChunk{xDivs=" + this.f60074 + ", yDivs=" + this.f60076 + ", padding=" + this.f60075 + ", colors=" + C13847.stream(this.f60073).mapToObj(new C21437(0)).collect(C2025.toList()) + '}';
    }
}
