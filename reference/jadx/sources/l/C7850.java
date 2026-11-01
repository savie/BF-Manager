package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TASN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7850 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25829;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18433[] f25830;

    public C7850(InterfaceC18433[] interfaceC18433Arr) {
        this.f25830 = interfaceC18433Arr;
        int iM13214 = 0;
        for (InterfaceC18433 interfaceC18433 : interfaceC18433Arr) {
            iM13214 = C4758.m13214(iM13214, interfaceC18433);
        }
        this.f25829 = C4758.m13213(iM13214, interfaceC18433Arr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7850 m20744(C7850 c7850, InterfaceC18433 interfaceC18433) {
        if (c7850 == null) {
            return new C7850(new InterfaceC18433[]{interfaceC18433});
        }
        InterfaceC18433[] interfaceC18433Arr = c7850.f25830;
        InterfaceC18433[] interfaceC18433Arr2 = (InterfaceC18433[]) Arrays.copyOf(interfaceC18433Arr, interfaceC18433Arr.length + 1);
        interfaceC18433Arr2[interfaceC18433Arr2.length - 1] = interfaceC18433;
        return new C7850(interfaceC18433Arr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7850 m20745(int i) {
        InterfaceC18433[] interfaceC18433Arr = null;
        int i2 = 0;
        while (true) {
            InterfaceC18433[] interfaceC18433Arr2 = this.f25830;
            if (i2 >= interfaceC18433Arr2.length) {
                break;
            }
            if (interfaceC18433Arr2[i2].mo1029() && !(interfaceC18433Arr2[i2] instanceof C7144)) {
                if (interfaceC18433Arr == null) {
                    interfaceC18433Arr = (InterfaceC18433[]) interfaceC18433Arr2.clone();
                }
                interfaceC18433Arr[i2] = new C7144(i, interfaceC18433Arr2[i2]);
            }
            i2++;
        }
        return interfaceC18433Arr == null ? this : new C7850(interfaceC18433Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20746(AbstractC1415 abstractC1415, InterfaceC1623 interfaceC1623, int i) throws Throwable {
        int iIndex = interfaceC1623.index();
        boolean z = false;
        try {
            InterfaceC18433[] interfaceC18433Arr = this.f25830;
            int length = interfaceC18433Arr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC18433 interfaceC18433M19050 = interfaceC18433Arr[i2];
                    if (interfaceC18433M19050 instanceof C7144) {
                        int iM19049 = ((C7144) interfaceC18433M19050).m19049() + i;
                        interfaceC1623.mo11329(iM19049);
                        interfaceC18433M19050 = ((C7144) interfaceC18433M19050).m19050();
                        z2 = iM19049 != iIndex;
                    } else if (interfaceC18433M19050.mo1029()) {
                        interfaceC1623.mo11329(iIndex);
                    }
                    interfaceC18433M19050.mo1028(abstractC1415);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC1623.mo11329(iIndex);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC1623.mo11329(iIndex);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        return this.f25829;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7850)) {
            return false;
        }
        C7850 c7850 = (C7850) obj;
        return this.f25829 == c7850.f25829 && Arrays.equals(this.f25830, c7850.f25830);
    }
}
