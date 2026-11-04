package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.֫᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2194 implements InterfaceC9147, InterfaceC0945 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11385 f7200;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean[] f7201;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3356 f7202;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17933 f7203;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f7204;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9147[] f7205;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0945 f7206;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9147[] f7208;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7207 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f7209 = new HashMap();

    @Override // l.InterfaceC22002
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7501(InterfaceC10813 interfaceC10813) {
        InterfaceC0945 interfaceC0945 = this.f7206;
        interfaceC0945.getClass();
        interfaceC0945.mo7501((InterfaceC10813) this);
    }

    public C2194(C17933 c17933, long[] jArr, InterfaceC9147... interfaceC9147Arr) {
        this.f7203 = c17933;
        this.f7205 = interfaceC9147Arr;
        c17933.getClass();
        this.f7200 = new C11385(AbstractC1928.of(), AbstractC1928.of());
        this.f7204 = new IdentityHashMap();
        this.f7208 = new InterfaceC9147[0];
        this.f7201 = new boolean[interfaceC9147Arr.length];
        for (int i = 0; i < interfaceC9147Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f7201[i] = true;
                this.f7205[i] = new C16034(interfaceC9147Arr[i], j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9147 m7500(int i) {
        boolean z = this.f7201[i];
        InterfaceC9147[] interfaceC9147Arr = this.f7205;
        if (z) {
            return ((C16034) interfaceC9147Arr[i]).m38194();
        }
        return interfaceC9147Arr[i];
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6409(InterfaceC0945 interfaceC0945, long j) {
        this.f7206 = interfaceC0945;
        ArrayList arrayList = this.f7207;
        InterfaceC9147[] interfaceC9147Arr = this.f7205;
        Collections.addAll(arrayList, interfaceC9147Arr);
        for (InterfaceC9147 interfaceC9147 : interfaceC9147Arr) {
            interfaceC9147.mo6409(this, j);
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ᩴ */
    public final void mo6412() {
        for (InterfaceC9147 interfaceC9147 : this.f7205) {
            interfaceC9147.mo6412();
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۫ */
    public final C3356 mo6411() {
        C3356 c3356 = this.f7202;
        c3356.getClass();
        return c3356;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6403(InterfaceC1470[] interfaceC1470Arr, boolean[] zArr, InterfaceC4848[] interfaceC4848Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        C2194 c2194 = this;
        InterfaceC4848[] interfaceC4848Arr2 = interfaceC4848Arr;
        int[] iArr = new int[interfaceC1470Arr.length];
        int[] iArr2 = new int[interfaceC1470Arr.length];
        int i = 0;
        while (true) {
            int length = interfaceC1470Arr.length;
            identityHashMap = c2194.f7204;
            if (i >= length) {
                break;
            }
            InterfaceC4848 interfaceC4848 = interfaceC4848Arr2[i];
            Integer num = interfaceC4848 == null ? null : (Integer) identityHashMap.get(interfaceC4848);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC1470 interfaceC1470 = interfaceC1470Arr[i];
            if (interfaceC1470 != null) {
                String str = interfaceC1470.mo17236().f53564;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC1470Arr.length;
        InterfaceC4848[] interfaceC4848Arr3 = new InterfaceC4848[length2];
        InterfaceC4848[] interfaceC4848Arr4 = new InterfaceC4848[interfaceC1470Arr.length];
        InterfaceC1470[] interfaceC1470Arr2 = new InterfaceC1470[interfaceC1470Arr.length];
        InterfaceC9147[] interfaceC9147Arr = c2194.f7205;
        ArrayList arrayList = new ArrayList(interfaceC9147Arr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC9147Arr.length) {
            int i3 = 0;
            while (i3 < interfaceC1470Arr.length) {
                interfaceC4848Arr4[i3] = iArr[i3] == i2 ? interfaceC4848Arr2[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC1470 interfaceC1471 = interfaceC1470Arr[i3];
                    interfaceC1471.getClass();
                    C16549 c16549 = (C16549) c2194.f7209.get(interfaceC1471.mo17236());
                    c16549.getClass();
                    interfaceC1470Arr2[i3] = new C5923(interfaceC1471, c16549);
                } else {
                    interfaceC1470Arr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC9147[] interfaceC9147Arr2 = interfaceC9147Arr;
            InterfaceC1470[] interfaceC1470Arr3 = interfaceC1470Arr2;
            long jMo6403 = interfaceC9147Arr[i2].mo6403(interfaceC1470Arr2, zArr, interfaceC4848Arr4, zArr2, j2);
            if (i4 == 0) {
                j2 = jMo6403;
            } else if (jMo6403 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC1470Arr.length; i5++) {
                if (iArr2[i5] == i4) {
                    InterfaceC4848 interfaceC4849 = interfaceC4848Arr4[i5];
                    interfaceC4849.getClass();
                    interfaceC4848Arr3[i5] = interfaceC4848Arr4[i5];
                    identityHashMap.put(interfaceC4849, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    C20782.m47568(interfaceC4848Arr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC9147Arr2[i4]);
            }
            i2 = i4 + 1;
            interfaceC4848Arr2 = interfaceC4848Arr;
            arrayList = arrayList2;
            interfaceC1470Arr2 = interfaceC1470Arr3;
            interfaceC9147Arr = interfaceC9147Arr2;
            c2194 = this;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC4848Arr3, 0, interfaceC4848Arr, 0, length2);
        this.f7208 = (InterfaceC9147[]) arrayList3.toArray(new InterfaceC9147[0]);
        AbstractList abstractListM14373 = C4583.m14373(arrayList3, new C12225(3));
        this.f7203.getClass();
        this.f7200 = new C11385(arrayList3, abstractListM14373);
        return j2;
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final void mo6405(long j, boolean z) {
        for (InterfaceC9147 interfaceC9147 : this.f7208) {
            interfaceC9147.mo6405(j, z);
        }
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
        this.f7200.mo6054(j);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        ArrayList arrayList = this.f7207;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC9147) arrayList.get(i)).mo6051(c20191);
            }
            return false;
        }
        return this.f7200.mo6051(c20191);
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        return this.f7200.mo6050();
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        return this.f7200.mo6053();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۤ */
    public final long mo6410() {
        long j = -9223372036854775807L;
        for (InterfaceC9147 interfaceC9147 : this.f7208) {
            long jMo6410 = interfaceC9147.mo6410();
            if (jMo6410 == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC9147.mo6401(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC9147 interfaceC9148 : this.f7208) {
                    if (interfaceC9148 == interfaceC9147) {
                        break;
                    }
                    if (interfaceC9148.mo6401(jMo6410) != jMo6410) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jMo6410;
            } else if (jMo6410 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        return this.f7200.mo6052();
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6401(long j) {
        long jMo6401 = this.f7208[0].mo6401(j);
        int i = 1;
        while (true) {
            InterfaceC9147[] interfaceC9147Arr = this.f7208;
            if (i >= interfaceC9147Arr.length) {
                return jMo6401;
            }
            if (interfaceC9147Arr[i].mo6401(jMo6401) != jMo6401) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // l.InterfaceC9147
    /* JADX INFO: renamed from: ۙ */
    public final long mo6402(long j, C9221 c9221) {
        InterfaceC9147[] interfaceC9147Arr = this.f7208;
        return (interfaceC9147Arr.length > 0 ? interfaceC9147Arr[0] : this.f7205[0]).mo6402(j, c9221);
    }

    @Override // l.InterfaceC0945
    /* JADX INFO: renamed from: ۙ */
    public final void mo3768(InterfaceC9147 interfaceC9147) {
        ArrayList arrayList = this.f7207;
        arrayList.remove(interfaceC9147);
        if (arrayList.isEmpty()) {
            InterfaceC9147[] interfaceC9147Arr = this.f7205;
            int i = 0;
            for (InterfaceC9147 interfaceC9148 : interfaceC9147Arr) {
                i += interfaceC9148.mo6411().f10965;
            }
            C16549[] c16549Arr = new C16549[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC9147Arr.length; i3++) {
                C3356 c3356Mo6411 = interfaceC9147Arr[i3].mo6411();
                int i4 = c3356Mo6411.f10965;
                int i5 = 0;
                while (i5 < i4) {
                    C16549 c16549M11056 = c3356Mo6411.m11056(i5);
                    C15648[] c15648Arr = new C15648[c16549M11056.f53567];
                    for (int i6 = 0; i6 < c16549M11056.f53567; i6++) {
                        C15648 c15648M39194 = c16549M11056.m39194(i6);
                        C20124 c20124M37397 = c15648M39194.m37397();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = c15648M39194.f50817;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c20124M37397.m46309(sb.toString());
                        c15648Arr[i6] = c20124M37397.m46295();
                    }
                    C16549 c16549 = new C16549(i3 + ":" + c16549M11056.f53564, c15648Arr);
                    this.f7209.put(c16549, c16549M11056);
                    c16549Arr[i2] = c16549;
                    i5++;
                    i2++;
                }
            }
            this.f7202 = new C3356(c16549Arr);
            InterfaceC0945 interfaceC0945 = this.f7206;
            interfaceC0945.getClass();
            interfaceC0945.mo3768((InterfaceC9147) this);
        }
    }
}
