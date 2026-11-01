package l;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14383 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceC10855 f47128 = new C17204();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f47129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23555 f47130;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f47132;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f47131 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21445 f47133 = new C21445();

    public C14383(List list, ArrayList arrayList) {
        this.f47132 = list;
        this.f47129 = arrayList;
        int size = list.size();
        int iM51920 = Integer.MIN_VALUE;
        C23555 c23555 = null;
        for (int i = 0; i < size; i++) {
            C23555 c23556 = (C23555) list.get(i);
            if (c23556.m51920() > iM51920) {
                iM51920 = c23556.m51920();
                c23555 = c23556;
            }
        }
        this.f47130 = c23555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23555 m34612(C1681 c1681) {
        return (C23555) this.f47133.getOrDefault(c1681, null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23555 m34614() {
        return this.f47130;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m34615() {
        C23555 c23555 = this.f47130;
        if (c23555 != null) {
            return c23555.m51919();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34613() {
        int i;
        List list = this.f47129;
        int size = list.size();
        int i2 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.f47131;
            if (i2 < size) {
                C1681 c1681 = (C1681) list.get(i2);
                float[] fArr = c1681.f6673;
                float[] fArr2 = c1681.f6674;
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
                List list2 = this.f47132;
                int size2 = list2.size();
                C23555 c23555 = null;
                int i4 = 0;
                float f4 = 0.0f;
                while (i4 < size2) {
                    C23555 c23556 = (C23555) list2.get(i4);
                    float[] fArrM51918 = c23556.m51918();
                    float f5 = fArrM51918[1];
                    List list3 = list;
                    float[] fArr3 = c1681.f6672;
                    if (f5 < fArr2[0] || f5 > fArr2[2]) {
                        i = size;
                    } else {
                        float f6 = fArrM51918[2];
                        if (f6 < fArr3[0] || f6 > fArr3[2] || sparseBooleanArray.get(c23556.m51919())) {
                            i = size;
                        } else {
                            float[] fArrM51919 = c23556.m51918();
                            C23555 c23557 = this.f47130;
                            int iM51920 = c23557 != null ? c23557.m51920() : 1;
                            i = size;
                            float[] fArr4 = c1681.f6673;
                            float f7 = fArr4[0];
                            float fAbs = f7 > 0.0f ? (1.0f - Math.abs(fArrM51919[1] - fArr2[1])) * f7 : 0.0f;
                            float f8 = fArr4[1];
                            float fAbs2 = f8 > 0.0f ? (1.0f - Math.abs(fArrM51919[2] - fArr3[1])) * f8 : 0.0f;
                            float f9 = fArr4[2];
                            float fM51920 = fAbs + fAbs2 + (f9 > 0.0f ? (c23556.m51920() / iM51920) * f9 : 0.0f);
                            if (c23555 == null || fM51920 > f4) {
                                c23555 = c23556;
                                f4 = fM51920;
                            }
                        }
                    }
                    i4++;
                    list = list3;
                    size = i;
                }
                List list4 = list;
                int i5 = size;
                if (c23555 != null) {
                    sparseBooleanArray.append(c23555.m51919(), true);
                }
                this.f47133.put(c1681, c23555);
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
