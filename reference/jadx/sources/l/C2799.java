package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TASN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2799 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f9208;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9510[] f9209;

    public C2799(InterfaceC9510[] interfaceC9510Arr) {
        this.f9209 = interfaceC9510Arr;
        int iM19445 = 0;
        for (InterfaceC9510 interfaceC9510 : interfaceC9510Arr) {
            iM19445 = C7103.m19445(iM19445, interfaceC9510);
        }
        this.f9208 = C7103.m19444(iM19445, interfaceC9510Arr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2799 m9260(C2799 c2799, InterfaceC9510 interfaceC9510) {
        if (c2799 == null) {
            return new C2799(new InterfaceC9510[]{interfaceC9510});
        }
        InterfaceC9510[] interfaceC9510Arr = c2799.f9209;
        InterfaceC9510[] interfaceC9510Arr2 = (InterfaceC9510[]) Arrays.copyOf(interfaceC9510Arr, interfaceC9510Arr.length + 1);
        interfaceC9510Arr2[interfaceC9510Arr2.length - 1] = interfaceC9510;
        return new C2799(interfaceC9510Arr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2799 m9261(int i) {
        InterfaceC9510[] interfaceC9510Arr = null;
        int i2 = 0;
        while (true) {
            InterfaceC9510[] interfaceC9510Arr2 = this.f9209;
            if (i2 >= interfaceC9510Arr2.length) {
                break;
            }
            if (interfaceC9510Arr2[i2].mo15211() && !(interfaceC9510Arr2[i2] instanceof C4993)) {
                if (interfaceC9510Arr == null) {
                    interfaceC9510Arr = (InterfaceC9510[]) interfaceC9510Arr2.clone();
                }
                interfaceC9510Arr[i2] = new C4993(i, interfaceC9510Arr2[i2]);
            }
            i2++;
        }
        return interfaceC9510Arr == null ? this : new C2799(interfaceC9510Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9262(AbstractC14709 abstractC14709, InterfaceC17693 interfaceC17693, int i) throws Throwable {
        int iIndex = interfaceC17693.index();
        boolean z = false;
        try {
            InterfaceC9510[] interfaceC9510Arr = this.f9209;
            int length = interfaceC9510Arr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC9510 interfaceC9510M15213 = interfaceC9510Arr[i2];
                    if (interfaceC9510M15213 instanceof C4993) {
                        int iM15212 = ((C4993) interfaceC9510M15213).m15212() + i;
                        interfaceC17693.mo11530(iM15212);
                        interfaceC9510M15213 = ((C4993) interfaceC9510M15213).m15213();
                        z2 = iM15212 != iIndex;
                    } else if (interfaceC9510M15213.mo15211()) {
                        interfaceC17693.mo11530(iIndex);
                    }
                    interfaceC9510M15213.mo15210(abstractC14709);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC17693.mo11530(iIndex);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC17693.mo11530(iIndex);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        return this.f9208;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2799)) {
            return false;
        }
        C2799 c2799 = (C2799) obj;
        return this.f9208 == c2799.f9208 && Arrays.equals(this.f9209, c2799.f9209);
    }
}
