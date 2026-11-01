package l;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8K8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17847 extends AbstractC8676 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Pair mo31995(C21375 c21375, int[][][] iArr, int[] iArr2, C15274 c15274, AbstractC16511 abstractC16511);

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۙ */
    public final void mo22493(Object obj) {
    }

    @Override // l.AbstractC8676
    /* JADX INFO: renamed from: ۙ */
    public final C10087 mo22491(InterfaceC2667[] interfaceC2667Arr, C23679 c23679, C15274 c15274, AbstractC16511 abstractC16511) {
        boolean z;
        int[] iArr;
        C23679 c236710 = c23679;
        int[] iArr2 = new int[interfaceC2667Arr.length + 1];
        int length = interfaceC2667Arr.length + 1;
        C17216[][] c17216Arr = new C17216[length][];
        int[][][] iArr3 = new int[interfaceC2667Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c236710.f76614;
            c17216Arr[i] = new C17216[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC2667Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC2667Arr[i3].mo8213();
        }
        int i4 = 0;
        while (i4 < c236710.f76614) {
            C17216 c17216M52136 = c236710.m52136(i4);
            int i5 = c17216M52136.f54866;
            int i6 = c17216M52136.f54864;
            boolean z2 = i5 == 5;
            int length3 = interfaceC2667Arr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z3 = true;
            while (i7 < interfaceC2667Arr.length) {
                InterfaceC2667 interfaceC2667 = interfaceC2667Arr[i7];
                int iMax = 0;
                int i9 = 0;
                while (i9 < i6) {
                    iMax = Math.max(iMax, interfaceC2667.mo8212(c17216M52136.m40159(i9)) & 7);
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
            if (length3 == interfaceC2667Arr.length) {
                iArr = new int[i6];
            } else {
                InterfaceC2667 interfaceC2668 = interfaceC2667Arr[length3];
                int[] iArr7 = new int[i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    iArr7[i10] = interfaceC2668.mo8212(c17216M52136.m40159(i10));
                }
                iArr = iArr7;
            }
            int i11 = iArr2[length3];
            c17216Arr[length3][i11] = c17216M52136;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = i11 + 1;
            i4++;
            c236710 = c23679;
            iArr4 = iArr6;
        }
        int[] iArr8 = iArr4;
        C23679[] c23679Arr = new C23679[interfaceC2667Arr.length];
        String[] strArr = new String[interfaceC2667Arr.length];
        int[] iArr9 = new int[interfaceC2667Arr.length];
        for (int i12 = 0; i12 < interfaceC2667Arr.length; i12++) {
            int i13 = iArr2[i12];
            c23679Arr[i12] = new C23679((C17216[]) C17983.m41846(i13, c17216Arr[i12]));
            iArr3[i12] = (int[][]) C17983.m41846(i13, iArr3[i12]);
            strArr[i12] = interfaceC2667Arr[i12].getName();
            iArr9[i12] = ((AbstractC16862) interfaceC2667Arr[i12]).mo13272();
        }
        C21375 c21375 = new C21375(iArr9, c23679Arr, iArr8, iArr3, new C23679((C17216[]) C17983.m41846(iArr2[interfaceC2667Arr.length], c17216Arr[interfaceC2667Arr.length])));
        Pair pairMo31995 = mo31995(c21375, iArr3, iArr8, c15274, abstractC16511);
        InterfaceC18553[] interfaceC18553Arr = (InterfaceC18553[]) pairMo31995.second;
        List[] listArr = new List[interfaceC18553Arr.length];
        for (int i14 = 0; i14 < interfaceC18553Arr.length; i14++) {
            InterfaceC18553 interfaceC18553 = interfaceC18553Arr[i14];
            listArr[i14] = interfaceC18553 != null ? AbstractC22433.of((Object) interfaceC18553) : AbstractC22433.of();
        }
        C4793 c4793 = new C4793();
        for (int i15 = 0; i15 < c21375.m47908(); i15++) {
            C23679 c23679M47913 = c21375.m47913(i15);
            List list = listArr[i15];
            for (int i16 = 0; i16 < c23679M47913.f76614; i16++) {
                C17216 c17216M52137 = c23679M47913.m52136(i16);
                boolean z5 = c21375.m47910(i15, i16) != 0;
                int i17 = c17216M52137.f54864;
                int[] iArr10 = new int[i17];
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 < c17216M52137.f54864; i18++) {
                    iArr10[i18] = c21375.m47911(i15, i16, i18);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC18553 interfaceC18554 = (InterfaceC18553) list.get(i19);
                        if (interfaceC18554.mo37959().equals(c17216M52137) && interfaceC18554.indexOf(i18) != -1) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                    zArr[i18] = z;
                }
                c4793.m52163(new C1693(c17216M52137, z5, iArr10, zArr));
            }
        }
        C23679 c23679M47912 = c21375.m47912();
        for (int i20 = 0; i20 < c23679M47912.f76614; i20++) {
            C17216 c17216M52138 = c23679M47912.m52136(i20);
            int[] iArr11 = new int[c17216M52138.f54864];
            Arrays.fill(iArr11, 0);
            c4793.m52163(new C1693(c17216M52138, false, iArr11, new boolean[c17216M52138.f54864]));
        }
        return new C10087((C5490[]) pairMo31995.first, (InterfaceC6558[]) pairMo31995.second, new C9456(c4793.m13309()), c21375);
    }
}
