package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩶ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20213 implements InterfaceC6806, InterfaceC3983 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806[] f65579;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65580;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2641 f65581;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23679 f65582;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC3983 f65583;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0187 f65584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC6806[] f65585;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f65587;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f65578 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f65586 = new HashMap();

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        InterfaceC3983 interfaceC3983 = this.f65583;
        interfaceC3983.getClass();
        interfaceC3983.mo2532((InterfaceC19445) this);
    }

    public C20213(C2641 c2641, long[] jArr, InterfaceC6806... interfaceC6806Arr) {
        this.f65581 = c2641;
        this.f65579 = interfaceC6806Arr;
        c2641.getClass();
        this.f65584 = new C0187(AbstractC22433.of(), AbstractC22433.of());
        this.f65587 = new IdentityHashMap();
        this.f65585 = new InterfaceC6806[0];
        this.f65580 = new boolean[interfaceC6806Arr.length];
        for (int i = 0; i < interfaceC6806Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f65580[i] = true;
                this.f65579[i] = new C6039(interfaceC6806Arr[i], j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6806 m45666(int i) {
        boolean z = this.f65580[i];
        InterfaceC6806[] interfaceC6806Arr = this.f65579;
        if (z) {
            return ((C6039) interfaceC6806Arr[i]).m16378();
        }
        return interfaceC6806Arr[i];
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7689(InterfaceC3983 interfaceC3983, long j) {
        this.f65583 = interfaceC3983;
        ArrayList arrayList = this.f65578;
        InterfaceC6806[] interfaceC6806Arr = this.f65579;
        Collections.addAll(arrayList, interfaceC6806Arr);
        for (InterfaceC6806 interfaceC6806 : interfaceC6806Arr) {
            interfaceC6806.mo7689(this, j);
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۚ */
    public final void mo7692() {
        for (InterfaceC6806 interfaceC6806 : this.f65579) {
            interfaceC6806.mo7692();
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ֨ */
    public final C23679 mo7675() {
        C23679 c23679 = this.f65582;
        c23679.getClass();
        return c23679;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7682(InterfaceC6558[] interfaceC6558Arr, boolean[] zArr, InterfaceC18739[] interfaceC18739Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        C20213 c20213 = this;
        InterfaceC18739[] interfaceC18739Arr2 = interfaceC18739Arr;
        int[] iArr = new int[interfaceC6558Arr.length];
        int[] iArr2 = new int[interfaceC6558Arr.length];
        int i = 0;
        while (true) {
            int length = interfaceC6558Arr.length;
            identityHashMap = c20213.f65587;
            if (i >= length) {
                break;
            }
            InterfaceC18739 interfaceC18739 = interfaceC18739Arr2[i];
            Integer num = interfaceC18739 == null ? null : (Integer) identityHashMap.get(interfaceC18739);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC6558 interfaceC6558 = interfaceC6558Arr[i];
            if (interfaceC6558 != null) {
                String str = interfaceC6558.mo37959().f54867;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC6558Arr.length;
        InterfaceC18739[] interfaceC18739Arr3 = new InterfaceC18739[length2];
        InterfaceC18739[] interfaceC18739Arr4 = new InterfaceC18739[interfaceC6558Arr.length];
        InterfaceC6558[] interfaceC6558Arr2 = new InterfaceC6558[interfaceC6558Arr.length];
        InterfaceC6806[] interfaceC6806Arr = c20213.f65579;
        ArrayList arrayList = new ArrayList(interfaceC6806Arr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC6806Arr.length) {
            int i3 = 0;
            while (i3 < interfaceC6558Arr.length) {
                interfaceC18739Arr4[i3] = iArr[i3] == i2 ? interfaceC18739Arr2[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC6558 interfaceC6559 = interfaceC6558Arr[i3];
                    interfaceC6559.getClass();
                    C17216 c17216 = (C17216) c20213.f65586.get(interfaceC6559.mo37959());
                    c17216.getClass();
                    interfaceC6558Arr2[i3] = new C15980(interfaceC6559, c17216);
                } else {
                    interfaceC6558Arr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC6806[] interfaceC6806Arr2 = interfaceC6806Arr;
            InterfaceC6558[] interfaceC6558Arr3 = interfaceC6558Arr2;
            long jMo7682 = interfaceC6806Arr[i2].mo7682(interfaceC6558Arr2, zArr, interfaceC18739Arr4, zArr2, j2);
            if (i4 == 0) {
                j2 = jMo7682;
            } else if (jMo7682 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC6558Arr.length; i5++) {
                if (iArr2[i5] == i4) {
                    InterfaceC18739 interfaceC187310 = interfaceC18739Arr4[i5];
                    interfaceC187310.getClass();
                    interfaceC18739Arr3[i5] = interfaceC18739Arr4[i5];
                    identityHashMap.put(interfaceC187310, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    C2023.m6510(interfaceC18739Arr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC6806Arr2[i4]);
            }
            i2 = i4 + 1;
            interfaceC18739Arr2 = interfaceC18739Arr;
            arrayList = arrayList2;
            interfaceC6558Arr2 = interfaceC6558Arr3;
            interfaceC6806Arr = interfaceC6806Arr2;
            c20213 = this;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC18739Arr3, 0, interfaceC18739Arr, 0, length2);
        this.f65585 = (InterfaceC6806[]) arrayList3.toArray(new InterfaceC6806[0]);
        AbstractList abstractListM9144 = C3051.m9144(arrayList3, new C5038(5));
        this.f65581.getClass();
        this.f65584 = new C0187(arrayList3, abstractListM9144);
        return j2;
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final void mo7685(long j, boolean z) {
        for (InterfaceC6806 interfaceC6806 : this.f65585) {
            interfaceC6806.mo7685(j, z);
        }
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final void mo1393(long j) {
        this.f65584.mo1393(j);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1390(C14643 c14643) {
        ArrayList arrayList = this.f65578;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6806) arrayList.get(i)).mo1390(c14643);
            }
            return false;
        }
        return this.f65584.mo1390(c14643);
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1389() {
        return this.f65584.mo1389();
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ܰ */
    public final long mo1392() {
        return this.f65584.mo1392();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۨ */
    public final long mo7694() {
        long j = -9223372036854775807L;
        for (InterfaceC6806 interfaceC6806 : this.f65585) {
            long jMo7694 = interfaceC6806.mo7694();
            if (jMo7694 == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC6806.mo7680(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC6806 interfaceC6807 : this.f65585) {
                    if (interfaceC6807 == interfaceC6806) {
                        break;
                    }
                    if (interfaceC6807.mo7680(jMo7694) != jMo7694) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo7694;
            } else if (jMo7694 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // l.InterfaceC19445
    /* JADX INFO: renamed from: ۬ */
    public final long mo1391() {
        return this.f65584.mo1391();
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7680(long j) {
        long jMo7680 = this.f65585[0].mo7680(j);
        int i = 1;
        while (true) {
            InterfaceC6806[] interfaceC6806Arr = this.f65585;
            if (i >= interfaceC6806Arr.length) {
                return jMo7680;
            }
            if (interfaceC6806Arr[i].mo7680(jMo7680) != jMo7680) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // l.InterfaceC6806
    /* JADX INFO: renamed from: ۙ */
    public final long mo7681(long j, C6901 c6901) {
        InterfaceC6806[] interfaceC6806Arr = this.f65585;
        return (interfaceC6806Arr.length > 0 ? interfaceC6806Arr[0] : this.f65579[0]).mo7681(j, c6901);
    }

    @Override // l.InterfaceC3983
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(InterfaceC6806 interfaceC6806) {
        ArrayList arrayList = this.f65578;
        arrayList.remove(interfaceC6806);
        if (arrayList.isEmpty()) {
            InterfaceC6806[] interfaceC6806Arr = this.f65579;
            int i = 0;
            for (InterfaceC6806 interfaceC6807 : interfaceC6806Arr) {
                i += interfaceC6807.mo7675().f76614;
            }
            C17216[] c17216Arr = new C17216[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC6806Arr.length; i3++) {
                C23679 c23679Mo7675 = interfaceC6806Arr[i3].mo7675();
                int i4 = c23679Mo7675.f76614;
                int i5 = 0;
                while (i5 < i4) {
                    C17216 c17216M52136 = c23679Mo7675.m52136(i5);
                    C7648[] c7648Arr = new C7648[c17216M52136.f54864];
                    for (int i6 = 0; i6 < c17216M52136.f54864; i6++) {
                        C7648 c7648M40159 = c17216M52136.m40159(i6);
                        C10471 c10471M20201 = c7648M40159.m20201();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = c7648M40159.f25275;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c10471M20201.m26516(sb.toString());
                        c7648Arr[i6] = c10471M20201.m26497();
                    }
                    C17216 c17216 = new C17216(i3 + ":" + c17216M52136.f54867, c7648Arr);
                    this.f65586.put(c17216, c17216M52136);
                    c17216Arr[i2] = c17216;
                    i5++;
                    i2++;
                }
            }
            this.f65582 = new C23679(c17216Arr);
            InterfaceC3983 interfaceC3983 = this.f65583;
            interfaceC3983.getClass();
            interfaceC3983.mo2529((InterfaceC6806) this);
        }
    }
}
