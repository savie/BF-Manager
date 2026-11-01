package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBI4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1496 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9383[] f6037;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1909 f6038;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4940 f6039;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4669 f6041;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f6043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC23865 f6045;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f6046;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6047;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f6048;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f6049;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C4234 f6050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f6040 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f6044 = 1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2718 f6042 = new C2718();

    public C1496(C4234 c4234, C4940 c4940, C4669 c4669, int i, int i2, boolean z, C20255 c20255) {
        this.f6050 = c4234;
        this.f6039 = c4940;
        this.f6041 = c4669;
        this.f6038 = c20255.m29454();
        this.f6049 = z;
        this.f6043 = i;
        this.f6048 = i2;
        this.f6037 = new C9383[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5146(int i, String str) {
        if (this.f6046 != null) {
            str = C22697.m50267(new StringBuilder(), this.f6046, str);
        }
        InterfaceC23865 interfaceC23865 = this.f6045;
        if (interfaceC23865 != null) {
            if (!this.f6047) {
                i = 0;
            }
            ((C2718) interfaceC23865).m8283(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m5154() {
        try {
            return m5153();
        } catch (IOException e) {
            throw C7513.m20020("...while encoding debug info", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m5155(String str, InterfaceC23865 interfaceC23865, boolean z) {
        this.f6046 = str;
        this.f6045 = interfaceC23865;
        this.f6047 = z;
        return m5154();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private byte[] m5153() {
        char c;
        C4669 c4669;
        C17432 c17432;
        C9383 c9383;
        C4234 c4234 = this.f6050;
        int size = c4234 == null ? 0 : c4234.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(c4234.m15272get(i));
        }
        Collections.sort(arrayList, new C23370());
        C1909 c1909 = this.f6038;
        ArrayList<C9383> arrayList2 = new ArrayList(c1909.m6222().size());
        int iM24602 = c1909.m6222().m24602();
        int i2 = this.f6048;
        boolean z = this.f6049;
        int i3 = (i2 - iM24602) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C4940 c4940 = this.f6039;
        int size2 = c4940.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9383 c9383M15266get = c4940.m15266get(i4);
            int iM24069 = c9383M15266get.m24069();
            if (iM24069 >= i3) {
                int i5 = iM24069 - i3;
                if (!bitSet.get(i5)) {
                    bitSet.set(i5);
                    arrayList2.add(c9383M15266get);
                }
            }
        }
        Collections.sort(arrayList2, new C14198());
        boolean z2 = this.f6045 != null;
        C2718 c2718 = this.f6042;
        int iM8296 = c2718.m8296();
        if (arrayList.size() > 0) {
            this.f6044 = ((C13408) arrayList.get(0)).m32899().m28312();
        }
        c2718.m8293(this.f6044);
        if (z2) {
            m5146(c2718.m8296() - iM8296, "line_start: " + this.f6044);
        }
        int iM24603 = (i2 - c1909.m6222().m24602()) - (!z ? 1 : 0);
        C9672 c9672M6222 = c1909.m6222();
        int size3 = c9672M6222.size();
        C9383[] c9383Arr = this.f6037;
        if (!z) {
            for (C9383 c9384 : arrayList2) {
                if (iM24603 == c9384.m24069()) {
                    c9383Arr[iM24603] = c9384;
                    break;
                }
            }
            iM24603++;
        }
        int iM8297 = c2718.m8296();
        c2718.m8293(size3);
        if (z2) {
            m5146(c2718.m8296() - iM8297, String.format("parameters_size: %04x", Integer.valueOf(size3)));
        }
        for (int i6 = 0; i6 < size3; i6++) {
            C3320 c3320M15264get = c9672M6222.m15264get(i6);
            int iM8298 = c2718.m8296();
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c17432 = null;
                    c9383 = null;
                    break;
                }
                c9383 = (C9383) it.next();
                if (iM24603 == c9383.m24069()) {
                    if (c9383.getSignature() != null) {
                        c17432 = null;
                        m5149((C17432) null);
                    } else {
                        c17432 = null;
                        m5149(c9383.getName());
                    }
                    c9383Arr[iM24603] = c9383;
                    break;
                }
            }
            if (c9383 == null) {
                m5149(c17432);
            }
            if (z2) {
                m5146(c2718.m8296() - iM8298, "parameter " + ((c9383 == null || c9383.getSignature() != null) ? "<unnamed>" : c9383.getName().mo2376()) + " v" + iM24603);
            }
            iM24603 += c3320M15264get.m9830();
        }
        char c2 = 0;
        for (C9383 c9385 : c9383Arr) {
            if (c9385 != null && c9385.getSignature() != null) {
                m5147(c9385);
            }
        }
        if (this.f6045 != null) {
            m5146(1, String.format("%04x: prologue end", Integer.valueOf(this.f6040)));
        }
        int size4 = arrayList.size();
        int size5 = c4940.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int size6 = c4940.size();
            while (i7 < size6 && c4940.m15266get(i7).m24065() == this.f6040) {
                int i9 = i7 + 1;
                C9383 c9383M15266get2 = c4940.m15266get(i7);
                int iM240610 = c9383M15266get2.m24069();
                C9383 c9386 = c9383Arr[iM240610];
                if (c9383M15266get2 != c9386) {
                    c9383Arr[iM240610] = c9383M15266get2;
                    if (c9383M15266get2.m24064()) {
                        if (c9386 != null && c9383M15266get2.m24071(c9386)) {
                            if (c9386.m24064()) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int iM8299 = c2718.m8296();
                            c2718.m8280(6);
                            m5150(c9383M15266get2.m24069());
                            if (this.f6045 != null) {
                                int iM82910 = c2718.m8296() - iM8299;
                                Integer numValueOf = Integer.valueOf(this.f6040);
                                String strM5151 = m5151(c9383M15266get2);
                                Object[] objArr = new Object[2];
                                objArr[c2] = numValueOf;
                                objArr[1] = strM5151;
                                m5146(iM82910, String.format("%04x: +local restart %s", objArr));
                            }
                        } else if (c9383M15266get2.getSignature() != null) {
                            m5147(c9383M15266get2);
                        } else {
                            int iM82911 = c2718.m8296();
                            c2718.m8280(3);
                            m5150(c9383M15266get2.m24069());
                            m5149(c9383M15266get2.getName());
                            C6143 type = c9383M15266get2.getType();
                            if (type == null || (c4669 = this.f6041) == null) {
                                c = 0;
                                c2718.m8293(0);
                            } else {
                                c2718.m8293(c4669.m12877().m28601(type) + 1);
                                c = 0;
                            }
                            if (this.f6045 != null) {
                                int iM82912 = c2718.m8296() - iM82911;
                                Integer numValueOf2 = Integer.valueOf(this.f6040);
                                String strM5152 = m5151(c9383M15266get2);
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = numValueOf2;
                                objArr2[1] = strM5152;
                                m5146(iM82912, String.format("%04x: +local %s", objArr2));
                            }
                        }
                    } else if (c9383M15266get2.m24070() != EnumC1620.END_REPLACED) {
                        int iM82913 = c2718.m8296();
                        c2718.m8280(5);
                        c2718.m8293(c9383M15266get2.m24069());
                        if (this.f6045 != null) {
                            m5146(c2718.m8296() - iM82913, String.format("%04x: -local %s", Integer.valueOf(this.f6040), m5151(c9383M15266get2)));
                        }
                    }
                }
                c2 = 0;
                i7 = i9;
            }
            int size7 = arrayList.size();
            while (i8 < size7 && ((C13408) arrayList.get(i8)).m32898() == this.f6040) {
                m5148((C13408) arrayList.get(i8));
                i8++;
            }
            int iM24065 = i7 < size5 ? c4940.m15266get(i7).m24065() : Integer.MAX_VALUE;
            int iM32898 = i8 < size4 ? ((C13408) arrayList.get(i8)).m32898() : Integer.MAX_VALUE;
            int iMin = Math.min(iM32898, iM24065);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f6043 && iM24065 == Integer.MAX_VALUE && iM32898 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM32898) {
                m5148((C13408) arrayList.get(i8));
                i8++;
            } else {
                m5152(iMin - this.f6040);
            }
            c2 = 0;
        }
        c2718.m8280(0);
        if (this.f6045 != null) {
            m5146(1, "end sequence");
        }
        return c2718.m8278();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m5151(C9383 c9383) {
        StringBuilder sb = new StringBuilder(am.aE);
        sb.append(c9383.m24069());
        sb.append(' ');
        C17432 name = c9383.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.mo2376());
        }
        sb.append(' ');
        C6143 type = c9383.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.mo2376());
        }
        C17432 signature = c9383.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.mo2376());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5149(C17432 c17432) {
        C4669 c4669;
        C2718 c2718 = this.f6042;
        if (c17432 == null || (c4669 = this.f6041) == null) {
            c2718.m8293(0);
        } else {
            c2718.m8293(c4669.m12886().m12264(c17432) + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5147(C9383 c9383) {
        C4669 c4669;
        C2718 c2718 = this.f6042;
        int iM8296 = c2718.m8296();
        c2718.m8280(4);
        m5150(c9383.m24069());
        m5149(c9383.getName());
        C6143 type = c9383.getType();
        if (type == null || (c4669 = this.f6041) == null) {
            c2718.m8293(0);
        } else {
            c2718.m8293(c4669.m12877().m28601(type) + 1);
        }
        m5149(c9383.getSignature());
        if (this.f6045 == null) {
            return;
        }
        m5146(c2718.m8296() - iM8296, String.format("%04x: +localx %s", Integer.valueOf(this.f6040), m5151(c9383)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5148(C13408 c13408) {
        int iM28312 = c13408.m32899().m28312();
        int iM32898 = c13408.m32898();
        int i = iM28312 - this.f6044;
        int i2 = iM32898 - this.f6040;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            m5145(i);
            i = 0;
        }
        int iM5144 = m5144(i, i2);
        if ((iM5144 & (-256)) > 0) {
            m5152(i2);
            iM5144 = m5144(i, 0);
            if ((iM5144 & (-256)) > 0) {
                m5145(i);
                iM5144 = m5144(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.f6042.m8280(iM5144);
        this.f6044 += i;
        int i3 = this.f6040 + i2;
        this.f6040 = i3;
        if (this.f6045 == null) {
            return;
        }
        m5146(1, String.format("%04x: line %d", Integer.valueOf(i3), Integer.valueOf(this.f6044)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5144(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return C1694.m5620(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5145(int i) {
        C2718 c2718 = this.f6042;
        int iM8296 = c2718.m8296();
        c2718.m8280(2);
        c2718.m8277(i);
        this.f6044 += i;
        if (this.f6045 == null) {
            return;
        }
        m5146(c2718.m8296() - iM8296, String.format("line = %d", Integer.valueOf(this.f6044)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m5152(int i) {
        C2718 c2718 = this.f6042;
        int iM8296 = c2718.m8296();
        c2718.m8280(1);
        c2718.m8293(i);
        this.f6040 += i;
        if (this.f6045 == null) {
            return;
        }
        m5146(c2718.m8296() - iM8296, String.format("%04x: advance pc", Integer.valueOf(this.f6040)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m5150(int i) {
        if (i < 0) {
            throw new RuntimeException(C8479.m22141(i, "Signed value where unsigned required: "));
        }
        this.f6042.m8293(i);
    }
}
