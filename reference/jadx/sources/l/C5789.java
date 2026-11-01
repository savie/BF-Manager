package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۛۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C9LQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5789 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f19675;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f19676 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f19674 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Rect f19677 = new Rect();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15963() {
        ArrayList<C16373> arrayList = this.f19676;
        int size = (arrayList.size() * 8) + 32;
        ArrayList<C16373> arrayList2 = this.f19674;
        C11018 c11018 = new C11018((this.f19675.length * 4) + (arrayList2.size() * 8) + size);
        c11018.writeByte(0);
        c11018.writeByte(arrayList.size() * 2);
        c11018.writeByte(arrayList2.size() * 2);
        c11018.writeByte(this.f19675.length);
        c11018.writeInt(32);
        c11018.writeInt((arrayList.size() * 8) + 32);
        Rect rect = this.f19677;
        c11018.m27790(rect.left);
        c11018.m27790(rect.right);
        c11018.m27790(rect.top);
        c11018.m27790(rect.bottom);
        c11018.writeInt((arrayList2.size() * 8) + (arrayList.size() * 8) + 32);
        for (C16373 c16373 : arrayList) {
            c11018.m27790(c16373.f52692);
            c11018.m27790(c16373.f52691);
        }
        for (C16373 c16374 : arrayList2) {
            c11018.m27790(c16374.f52692);
            c11018.m27790(c16374.f52691);
        }
        for (int i : this.f19675) {
            c11018.m27790(i);
        }
        return c11018.m27788();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15962(Bitmap bitmap) {
        m15961(this.f19676, bitmap.getWidth());
        m15961(this.f19674, bitmap.getHeight());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15961(ArrayList arrayList, int i) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            i2 = 0;
            if (size < 0) {
                break;
            }
            C16373 c16373 = (C16373) arrayList.get(size);
            int i3 = c16373.f52692;
            int i4 = c16373.f52691;
            if (i3 >= i4) {
                arrayList.remove(size);
            } else {
                if (i3 < 0) {
                    c16373.f52692 = 0;
                }
                if (i4 > i) {
                    c16373.f52691 = i;
                }
            }
        }
        Collections.sort(arrayList);
        while (i2 < arrayList.size() - 1) {
            C16373 c16374 = (C16373) arrayList.get(i2);
            int i5 = i2 + 1;
            C16373 c16375 = (C16373) arrayList.get(i5);
            int i6 = c16375.f52692;
            int i7 = c16374.f52691;
            if (i6 <= i7) {
                c16374.f52691 = Math.max(i7, c16375.f52691);
                arrayList.remove(i5);
            } else {
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15964(Bitmap bitmap) {
        ArrayList<C16373> arrayListM15960 = m15960(this.f19676, bitmap.getWidth());
        ArrayList<C16373> arrayListM15961 = m15960(this.f19674, bitmap.getHeight());
        int[] iArr = new int[arrayListM15961.size() * arrayListM15960.size()];
        int i = 0;
        for (C16373 c16373 : arrayListM15961) {
            for (C16373 c16374 : arrayListM15960) {
                int i2 = c16374.f52692;
                int i3 = c16374.f52691;
                int i4 = c16373.f52692;
                int i5 = c16373.f52691;
                int pixel = bitmap.getPixel(i2, i4);
                while (true) {
                    if (i2 >= i3) {
                        int pixel2 = bitmap.getPixel(c16374.f52692, c16373.f52692);
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
        this.f19675 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15960(ArrayList arrayList, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && arrayList.size() != 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C16373 c16373 = (C16373) arrayList.get(i4);
                if (i4 == 0 && (i3 = c16373.f52692) != 0) {
                    arrayList2.add(new C16373(0, i3));
                } else if (i4 > 0) {
                    arrayList2.add(new C16373(((C16373) arrayList.get(i4 - 1)).f52691, c16373.f52692));
                }
                arrayList2.add(new C16373(c16373.f52692, c16373.f52691));
                if (i4 == arrayList.size() - 1 && (i2 = c16373.f52691) < i) {
                    arrayList2.add(new C16373(i2, i));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rect m15959(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Rect rect = new Rect();
        if (!arrayList.isEmpty()) {
            rect.left = ((C16373) arrayList.get(0)).f52692;
            rect.right = i - ((C16373) C19084.m43861(arrayList, 1)).f52691;
        }
        if (!arrayList2.isEmpty()) {
            rect.top = ((C16373) arrayList2.get(0)).f52692;
            rect.bottom = i2 - ((C16373) C19084.m43861(arrayList2, 1)).f52691;
        }
        return rect;
    }

    public final String toString() {
        return "NinePatchChunk{xDivs=" + this.f19676 + ", yDivs=" + this.f19674 + ", padding=" + this.f19677 + ", colors=" + C20318.stream(this.f19675).mapToObj(new C9297(1)).collect(C1890.toList()) + '}';
    }
}
