package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBI4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13596 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11204 f43175;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43178;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5239[] f43180;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f43181;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f43182;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f43183;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43184;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10918 f43185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC8550 f43186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6994 f43187;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C25377 f43188;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43176 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f43177 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15000 f43179 = new C15000();

    public C13596(C25377 c25377, C11204 c11204, C10918 c10918, int i, int i2, boolean z, C18181 c18181) {
        this.f43188 = c25377;
        this.f43175 = c11204;
        this.f43185 = c10918;
        this.f43187 = c18181.m51054();
        this.f43181 = z;
        this.f43178 = i;
        this.f43184 = i2;
        this.f43180 = new C5239[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33324(int i, String str) {
        if (this.f43183 != null) {
            str = C8947.m23910(new StringBuilder(), this.f43183, str);
        }
        InterfaceC8550 interfaceC8550 = this.f43186;
        if (interfaceC8550 != null) {
            if (!this.f43182) {
                i = 0;
            }
            ((C15000) interfaceC8550).m36111(i, str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33332() {
        try {
            return m33331();
        } catch (IOException e) {
            throw C3880.m12507("...while encoding debug info", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33333(String str, InterfaceC8550 interfaceC8550, boolean z) {
        this.f43183 = str;
        this.f43186 = interfaceC8550;
        this.f43182 = z;
        return m33332();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private byte[] m33331() {
        char c;
        C10918 c10918;
        C9976 c9976;
        C5239 c5239;
        C25377 c25377 = this.f43188;
        int size = c25377 == null ? 0 : c25377.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(c25377.m31614get(i));
        }
        Collections.sort(arrayList, new C8376());
        C6994 c6994 = this.f43187;
        ArrayList<C5239> arrayList2 = new ArrayList(c6994.m19309().size());
        int iM33501 = c6994.m19309().m33501();
        int i2 = this.f43184;
        boolean z = this.f43181;
        int i3 = (i2 - iM33501) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C11204 c11204 = this.f43175;
        int size2 = c11204.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C5239 c5239M31610get = c11204.m31610get(i4);
            int iM15745 = c5239M31610get.m15745();
            if (iM15745 >= i3) {
                int i5 = iM15745 - i3;
                if (!bitSet.get(i5)) {
                    bitSet.set(i5);
                    arrayList2.add(c5239M31610get);
                }
            }
        }
        Collections.sort(arrayList2, new C6885());
        boolean z2 = this.f43186 != null;
        C15000 c15000 = this.f43179;
        int iM36122 = c15000.m36122();
        if (arrayList.size() > 0) {
            this.f43177 = ((C11950) arrayList.get(0)).m29923().m24067();
        }
        c15000.m36117(this.f43177);
        if (z2) {
            m33324(c15000.m36122() - iM36122, "line_start: " + this.f43177);
        }
        int iM33502 = (i2 - c6994.m19309().m33501()) - (!z ? 1 : 0);
        C13705 c13705M19309 = c6994.m19309();
        int size3 = c13705M19309.size();
        C5239[] c5239Arr = this.f43180;
        if (!z) {
            for (C5239 c52310 : arrayList2) {
                if (iM33502 == c52310.m15745()) {
                    c5239Arr[iM33502] = c52310;
                    break;
                }
            }
            iM33502++;
        }
        int iM36123 = c15000.m36122();
        c15000.m36117(size3);
        if (z2) {
            m33324(c15000.m36122() - iM36123, String.format("parameters_size: %04x", Integer.valueOf(size3)));
        }
        for (int i6 = 0; i6 < size3; i6++) {
            C5085 c5085M31609get = c13705M19309.m31609get(i6);
            int iM36124 = c15000.m36122();
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c9976 = null;
                    c5239 = null;
                    break;
                }
                c5239 = (C5239) it.next();
                if (iM33502 == c5239.m15745()) {
                    if (c5239.getSignature() != null) {
                        c9976 = null;
                        m33326((C9976) null);
                    } else {
                        c9976 = null;
                        m33326(c5239.getName());
                    }
                    c5239Arr[iM33502] = c5239;
                    break;
                }
            }
            if (c5239 == null) {
                m33326(c9976);
            }
            if (z2) {
                m33324(c15000.m36122() - iM36124, "parameter " + ((c5239 == null || c5239.getSignature() != null) ? "<unnamed>" : c5239.getName().mo1843()) + " v" + iM33502);
            }
            iM33502 += c5085M31609get.m15371();
        }
        char c2 = 0;
        for (C5239 c52311 : c5239Arr) {
            if (c52311 != null && c52311.getSignature() != null) {
                m33325(c52311);
            }
        }
        if (this.f43186 != null) {
            m33324(1, String.format("%04x: prologue end", Integer.valueOf(this.f43176)));
        }
        int size4 = arrayList.size();
        int size5 = c11204.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int size6 = c11204.size();
            while (i7 < size6 && c11204.m31610get(i7).m15740() == this.f43176) {
                int i9 = i7 + 1;
                C5239 c5239M31610get2 = c11204.m31610get(i7);
                int iM15746 = c5239M31610get2.m15745();
                C5239 c52312 = c5239Arr[iM15746];
                if (c5239M31610get2 != c52312) {
                    c5239Arr[iM15746] = c5239M31610get2;
                    if (c5239M31610get2.m15739()) {
                        if (c52312 != null && c5239M31610get2.m15746(c52312)) {
                            if (c52312.m15739()) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int iM36125 = c15000.m36122();
                            c15000.m36129(6);
                            m33328(c5239M31610get2.m15745());
                            if (this.f43186 != null) {
                                int iM36126 = c15000.m36122() - iM36125;
                                Integer numValueOf = Integer.valueOf(this.f43176);
                                String strM33329 = m33329(c5239M31610get2);
                                Object[] objArr = new Object[2];
                                objArr[c2] = numValueOf;
                                objArr[1] = strM33329;
                                m33324(iM36126, String.format("%04x: +local restart %s", objArr));
                            }
                        } else if (c5239M31610get2.getSignature() != null) {
                            m33325(c5239M31610get2);
                        } else {
                            int iM36127 = c15000.m36122();
                            c15000.m36129(3);
                            m33328(c5239M31610get2.m15745());
                            m33326(c5239M31610get2.getName());
                            C1028 type = c5239M31610get2.getType();
                            if (type == null || (c10918 = this.f43185) == null) {
                                c = 0;
                                c15000.m36117(0);
                            } else {
                                c15000.m36117(c10918.m27694().m46183(type) + 1);
                                c = 0;
                            }
                            if (this.f43186 != null) {
                                int iM36128 = c15000.m36122() - iM36127;
                                Integer numValueOf2 = Integer.valueOf(this.f43176);
                                String strM333210 = m33329(c5239M31610get2);
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = numValueOf2;
                                objArr2[1] = strM333210;
                                m33324(iM36128, String.format("%04x: +local %s", objArr2));
                            }
                        }
                    } else if (c5239M31610get2.m15747() != EnumC13662.END_REPLACED) {
                        int iM36129 = c15000.m36122();
                        c15000.m36129(5);
                        c15000.m36117(c5239M31610get2.m15745());
                        if (this.f43186 != null) {
                            m33324(c15000.m36122() - iM36129, String.format("%04x: -local %s", Integer.valueOf(this.f43176), m33329(c5239M31610get2)));
                        }
                    }
                }
                c2 = 0;
                i7 = i9;
            }
            int size7 = arrayList.size();
            while (i8 < size7 && ((C11950) arrayList.get(i8)).m29922() == this.f43176) {
                m33327((C11950) arrayList.get(i8));
                i8++;
            }
            int iM15740 = i7 < size5 ? c11204.m31610get(i7).m15740() : Integer.MAX_VALUE;
            int iM29922 = i8 < size4 ? ((C11950) arrayList.get(i8)).m29922() : Integer.MAX_VALUE;
            int iMin = Math.min(iM29922, iM15740);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f43178 && iM15740 == Integer.MAX_VALUE && iM29922 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM29922) {
                m33327((C11950) arrayList.get(i8));
                i8++;
            } else {
                m33330(iMin - this.f43176);
            }
            c2 = 0;
        }
        c15000.m36129(0);
        if (this.f43186 != null) {
            m33324(1, "end sequence");
        }
        return c15000.m36121();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m33329(C5239 c5239) {
        StringBuilder sb = new StringBuilder(am.aE);
        sb.append(c5239.m15745());
        sb.append(' ');
        C9976 name = c5239.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.mo1843());
        }
        sb.append(' ');
        C1028 type = c5239.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.mo1843());
        }
        C9976 signature = c5239.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.mo1843());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33326(C9976 c9976) {
        C10918 c10918;
        C15000 c15000 = this.f43179;
        if (c9976 == null || (c10918 = this.f43185) == null) {
            c15000.m36117(0);
        } else {
            c15000.m36117(c10918.m27714().m28065(c9976) + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33325(C5239 c5239) {
        C10918 c10918;
        C15000 c15000 = this.f43179;
        int iM36122 = c15000.m36122();
        c15000.m36129(4);
        m33328(c5239.m15745());
        m33326(c5239.getName());
        C1028 type = c5239.getType();
        if (type == null || (c10918 = this.f43185) == null) {
            c15000.m36117(0);
        } else {
            c15000.m36117(c10918.m27694().m46183(type) + 1);
        }
        m33326(c5239.getSignature());
        if (this.f43186 == null) {
            return;
        }
        m33324(c15000.m36122() - iM36122, String.format("%04x: +localx %s", Integer.valueOf(this.f43176), m33329(c5239)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33327(C11950 c11950) {
        int iM24067 = c11950.m29923().m24067();
        int iM29922 = c11950.m29922();
        int i = iM24067 - this.f43177;
        int i2 = iM29922 - this.f43176;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            m33323(i);
            i = 0;
        }
        int iM33322 = m33322(i, i2);
        if ((iM33322 & (-256)) > 0) {
            m33330(i2);
            iM33322 = m33322(i, 0);
            if ((iM33322 & (-256)) > 0) {
                m33323(i);
                iM33322 = m33322(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.f43179.m36129(iM33322);
        this.f43177 += i;
        int i3 = this.f43176 + i2;
        this.f43176 = i3;
        if (this.f43186 == null) {
            return;
        }
        m33324(1, String.format("%04x: line %d", Integer.valueOf(i3), Integer.valueOf(this.f43177)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33322(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return C12669.m31436(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33323(int i) {
        C15000 c15000 = this.f43179;
        int iM36122 = c15000.m36122();
        c15000.m36129(2);
        c15000.m36120(i);
        this.f43177 += i;
        if (this.f43186 == null) {
            return;
        }
        m33324(c15000.m36122() - iM36122, String.format("line = %d", Integer.valueOf(this.f43177)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33330(int i) {
        C15000 c15000 = this.f43179;
        int iM36122 = c15000.m36122();
        c15000.m36129(1);
        c15000.m36117(i);
        this.f43176 += i;
        if (this.f43186 == null) {
            return;
        }
        m33324(c15000.m36122() - iM36122, String.format("%04x: advance pc", Integer.valueOf(this.f43176)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33328(int i) {
        if (i < 0) {
            throw new RuntimeException(C13645.m33382(i, "Signed value where unsigned required: "));
        }
        this.f43179.m36117(i);
    }
}
