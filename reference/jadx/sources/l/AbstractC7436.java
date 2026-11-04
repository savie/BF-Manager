package l;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7436 extends AbstractC11076 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Pair mo20379(C8927 c8927, int[][][] iArr, int[] iArr2, C8402 c8402, AbstractC24755 abstractC24755);

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20381(Object obj) {
    }

    @Override // l.AbstractC11076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23011 mo20380(InterfaceC18172[] interfaceC18172Arr, C3356 c3356, C8402 c8402, AbstractC24755 abstractC24755) {
        boolean z;
        int[] iArr;
        C3356 c3357 = c3356;
        int[] iArr2 = new int[interfaceC18172Arr.length + 1];
        int length = interfaceC18172Arr.length + 1;
        C16549[][] c16549Arr = new C16549[length][];
        int[][][] iArr3 = new int[interfaceC18172Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c3357.f10965;
            c16549Arr[i] = new C16549[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC18172Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC18172Arr[i3].mo11268();
        }
        int i4 = 0;
        while (i4 < c3357.f10965) {
            C16549 c16549M11056 = c3357.m11056(i4);
            int i5 = c16549M11056.f53565;
            int i6 = c16549M11056.f53567;
            boolean z2 = i5 == 5;
            int length3 = interfaceC18172Arr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z3 = true;
            while (i7 < interfaceC18172Arr.length) {
                InterfaceC18172 interfaceC18172 = interfaceC18172Arr[i7];
                int iMax = 0;
                int i9 = 0;
                while (i9 < i6) {
                    iMax = Math.max(iMax, interfaceC18172.mo11185(c16549M11056.m39194(i9)) & 7);
                    i9++;
                    iArr4 = iArr4;
                }
                int[] iArr5 = iArr4;
                boolean z4 = iArr2[i7] == 0;
                if (iMax > i8 || (iMax == i8 && z2 && !z3 && z4)) {
                    z3 = z4;
                    length3 = i7;
                    i8 = iMax;
                }
                i7++;
                iArr4 = iArr5;
            }
            int[] iArr6 = iArr4;
            if (length3 == interfaceC18172Arr.length) {
                iArr = new int[i6];
            } else {
                InterfaceC18172 interfaceC18173 = interfaceC18172Arr[length3];
                int[] iArr7 = new int[i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    iArr7[i10] = interfaceC18173.mo11185(c16549M11056.m39194(i10));
                }
                iArr = iArr7;
            }
            int i11 = iArr2[length3];
            c16549Arr[length3][i11] = c16549M11056;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = i11 + 1;
            i4++;
            c3357 = c3356;
            iArr4 = iArr6;
        }
        int[] iArr8 = iArr4;
        C3356[] c3356Arr = new C3356[interfaceC18172Arr.length];
        String[] strArr = new String[interfaceC18172Arr.length];
        int[] iArr9 = new int[interfaceC18172Arr.length];
        for (int i12 = 0; i12 < interfaceC18172Arr.length; i12++) {
            int i13 = iArr2[i12];
            c3356Arr[i12] = new C3356((C16549[]) C7116.m19493(i13, c16549Arr[i12]));
            iArr3[i12] = (int[][]) C7116.m19493(i13, iArr3[i12]);
            strArr[i12] = interfaceC18172Arr[i12].getName();
            iArr9[i12] = ((AbstractC25280) interfaceC18172Arr[i12]).mo12952();
        }
        C8927 c8927 = new C8927(iArr9, c3356Arr, iArr8, iArr3, new C3356((C16549[]) C7116.m19493(iArr2[interfaceC18172Arr.length], c16549Arr[interfaceC18172Arr.length])));
        Pair pairMo20379 = mo20379(c8927, iArr3, iArr8, c8402, abstractC24755);
        InterfaceC14147[] interfaceC14147Arr = (InterfaceC14147[]) pairMo20379.second;
        List[] listArr = new List[interfaceC14147Arr.length];
        for (int i14 = 0; i14 < interfaceC14147Arr.length; i14++) {
            InterfaceC14147 interfaceC14147 = interfaceC14147Arr[i14];
            listArr[i14] = interfaceC14147 != null ? AbstractC1928.of((Object) interfaceC14147) : AbstractC1928.of();
        }
        C22811 c22811 = new C22811();
        for (int i15 = 0; i15 < c8927.m23834(); i15++) {
            C3356 c3356M23839 = c8927.m23839(i15);
            List list = listArr[i15];
            for (int i16 = 0; i16 < c3356M23839.f10965; i16++) {
                C16549 c16549M11057 = c3356M23839.m11056(i16);
                boolean z5 = c8927.m23836(i15, i16) != 0;
                int i17 = c16549M11057.f53567;
                int[] iArr10 = new int[i17];
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 < c16549M11057.f53567; i18++) {
                    iArr10[i18] = c8927.m23837(i15, i16, i18);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC14147 interfaceC14148 = (InterfaceC14147) list.get(i19);
                        if (interfaceC14148.mo17236().equals(c16549M11057) && interfaceC14148.indexOf(i18) != -1) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                    zArr[i18] = z;
                }
                c22811.m19807(new C20279(c16549M11057, z5, iArr10, zArr));
            }
        }
        C3356 c3356M23838 = c8927.m23838();
        for (int i20 = 0; i20 < c3356M23838.f10965; i20++) {
            C16549 c16549M11058 = c3356M23838.m11056(i20);
            int[] iArr11 = new int[c16549M11058.f53567];
            Arrays.fill(iArr11, 0);
            c22811.m19807(new C20279(c16549M11058, false, iArr11, new boolean[c16549M11058.f53567]));
        }
        return new C23011((C0273[]) pairMo20379.first, (InterfaceC1470[]) pairMo20379.second, new C12074(c22811.m51441()), c8927);
    }
}
