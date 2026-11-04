package l;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20905 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23889 f66908 = new C17921();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3751 f66909;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f66910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f66911 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14307 f66912 = new C14307();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f66913;

    public C20905(ArrayList arrayList, List list) {
        this.f66910 = list;
        this.f66913 = arrayList;
        int size = list.size();
        int iM12188 = Integer.MIN_VALUE;
        C3751 c3751 = null;
        for (int i = 0; i < size; i++) {
            C3751 c3752 = (C3751) list.get(i);
            if (c3752.m12188() > iM12188) {
                iM12188 = c3752.m12188();
                c3751 = c3752;
            }
        }
        this.f66909 = c3751;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3751 m47764(C12700 c12700) {
        return (C3751) this.f66912.get(c12700);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3751 m47766() {
        return this.f66909;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47767() {
        C3751 c3751 = this.f66909;
        if (c3751 != null) {
            return c3751.m12187();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47765() {
        int i;
        List list = this.f66913;
        int size = list.size();
        int i2 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.f66911;
            if (i2 < size) {
                C12700 c12700 = (C12700) list.get(i2);
                float[] fArr = c12700.f40685;
                float[] fArr2 = c12700.f40686;
                float f = 0.0f;
                for (float f2 : fArr) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
                if (f != 0.0f) {
                    int length = fArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        float f3 = fArr[i3];
                        if (f3 > 0.0f) {
                            fArr[i3] = f3 / f;
                        }
                    }
                }
                List list2 = this.f66910;
                int size2 = list2.size();
                C3751 c3751 = null;
                int i4 = 0;
                float f4 = 0.0f;
                while (i4 < size2) {
                    C3751 c3752 = (C3751) list2.get(i4);
                    float[] fArrM12186 = c3752.m12186();
                    float f5 = fArrM12186[1];
                    List list3 = list;
                    float[] fArr3 = c12700.f40684;
                    if (f5 < fArr2[0] || f5 > fArr2[2]) {
                        i = size;
                    } else {
                        float f6 = fArrM12186[2];
                        if (f6 < fArr3[0] || f6 > fArr3[2] || sparseBooleanArray.get(c3752.m12187())) {
                            i = size;
                        } else {
                            float[] fArrM12187 = c3752.m12186();
                            C3751 c3753 = this.f66909;
                            int iM12188 = c3753 != null ? c3753.m12188() : 1;
                            i = size;
                            float[] fArr4 = c12700.f40685;
                            float f7 = fArr4[0];
                            float fAbs = f7 > 0.0f ? (1.0f - Math.abs(fArrM12187[1] - fArr2[1])) * f7 : 0.0f;
                            float f8 = fArr4[1];
                            float fAbs2 = f8 > 0.0f ? (1.0f - Math.abs(fArrM12187[2] - fArr3[1])) * f8 : 0.0f;
                            float f9 = fArr4[2];
                            float fM12188 = fAbs + fAbs2 + (f9 > 0.0f ? (c3752.m12188() / iM12188) * f9 : 0.0f);
                            if (c3751 == null || fM12188 > f4) {
                                c3751 = c3752;
                                f4 = fM12188;
                            }
                        }
                    }
                    i4++;
                    list = list3;
                    size = i;
                }
                List list4 = list;
                int i5 = size;
                if (c3751 != null) {
                    sparseBooleanArray.append(c3751.m12187(), true);
                }
                this.f66912.put(c12700, c3751);
                i2++;
                list = list4;
                size = i5;
            } else {
                sparseBooleanArray.clear();
                return;
            }
        }
    }
}
