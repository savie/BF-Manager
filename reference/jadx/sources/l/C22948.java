package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77E4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22948 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24027 f74582;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f74583;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f74584;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C13173 f74585;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74586;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public HashMap f74587;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74588;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C13173 f74589;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C24027 f74590;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C3564 f74591;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3564 f74592;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3564 f74593;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C3564 f74594;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f74595;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public C3564 f74596;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C3564 f74597;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23051 f74598;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9398 f74599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18111 f74600;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C14585 f74601;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C23051 f74602;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashMap f74603;

    /* JADX WARN: Illegal instructions before constructor call */
    public C22948(C14585 c14585, int i, C13173 c13173, C13173 c13174) {
        C12738 c12738 = c14585.f20884;
        super(c12738, EnumC16783.f53732);
        this.f74595 = 0;
        this.f74584 = 0L;
        this.f74583 = new ArrayList();
        this.f74591 = null;
        this.f74593 = null;
        this.f74601 = c14585;
        this.f74599 = c14585.f47729;
        C18111 c18111 = (C18111) c14585.m17095();
        this.f74600 = c18111;
        this.f74589 = c13173;
        this.f74585 = c13174;
        this.f74586 = new ArrayList(Collections.nCopies(c13174 != null ? c13174.f43854 : i, null));
        this.f74588 = new ArrayList(Collections.nCopies(c13174 != null ? c13174.f43854 : i, null));
        C23051 c23051 = new C23051(c14585, c18111);
        this.f74602 = c23051;
        this.f74598 = c23051;
        this.f74590 = new C24027(0);
        C24027 c24027 = new C24027();
        this.f74582 = c24027;
        if (c18111.m2161()) {
            C3564 c3564 = new C3564(c12738, EnumC16783.f53722);
            this.f74592 = c3564;
            c24027.m52871(c3564);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50790(ArrayList arrayList, boolean z) {
        C3564 c3564 = z ? this.f74594 : this.f74597;
        if (c3564 == null) {
            c3564 = new C3564(this.f74601.f20884, z ? EnumC16783.f53719 : EnumC16783.f53734);
            this.f74582.m52871(c3564);
        }
        c3564.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50789(ArrayList arrayList) {
        if (this.f74596 == null) {
            C5308 c5308 = new C5308();
            C24027 c24027 = this.f74582;
            C3564 c3564 = (C3564) c24027.m52870(c5308).orElse(null);
            if (c3564 == null) {
                C9398 c9398 = this.f74599;
                C3564 c3565 = new C3564(c9398.f20884, c9398.f31849.m45846() ? EnumC16783.f53716 : EnumC16783.f53748);
                this.f74596 = c3565;
                c24027.m52871(c3565);
            } else {
                this.f74596 = c3564;
            }
        }
        this.f74596.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6719 m50786(long j, String str) {
        C6719 c6719;
        HashMap map = this.f74587;
        if (map == null) {
            this.f74587 = new HashMap(10);
            c6719 = null;
        } else {
            c6719 = (C6719) map.get(str);
        }
        if (c6719 != null) {
            return c6719;
        }
        C6719 c67110 = new C6719(str);
        c67110.f22647 = -1;
        c67110.f22648 = -1;
        c67110.f22649 = j;
        this.f74587.put(str, c67110);
        return c67110;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50792() {
        HashMap map = this.f74587;
        C18111 c18111 = this.f74600;
        if (map != null) {
            for (C6719 c6719 : map.values()) {
                if (!c6719.f14564) {
                    c18111.mo2164(c6719.f22649, "No <catch {0}> declared", c6719.f14565);
                }
            }
            for (C2588 c2588 : this.f74590.f77846) {
                C6719 c67110 = c2588.f10174;
                long j = c2588.f10172;
                int i = c67110.f22647;
                String str = c67110.f14565;
                if (i == -1) {
                    c18111.mo2149(j, "No <try {0}> found", str);
                }
                if (c67110.f22648 == -1) {
                    c18111.mo2149(j, "No <endtry {0}> found", str);
                }
            }
        }
        m50791(EnumC20562.f66842);
        m50791(EnumC20562.f66711);
        HashMap map2 = this.f74603;
        if (map2 != null) {
            for (C13070 c13070 : map2.values()) {
                if (!c13070.f14566) {
                    c18111.mo2150("Label {0} not declared", c13070.f14565);
                }
            }
        }
        C3564 c3564 = this.f74591;
        C24027 c24027 = this.f74582;
        if (c3564 != null) {
            c24027.m52871(c3564);
        }
        C3564 c3565 = this.f74593;
        if (c3565 != null) {
            c24027.m52871(c3565);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13070 m50787(String str) {
        C13070 c13070;
        HashMap map = this.f74603;
        if (map == null) {
            this.f74603 = new HashMap(10);
            c13070 = null;
        } else {
            c13070 = (C13070) map.get(str);
        }
        if (c13070 != null) {
            return c13070;
        }
        C13070 c13071 = new C13070(str);
        this.f74603.put(str, c13071);
        return c13071;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50791(EnumC20562 enumC20562) {
        ArrayList arrayList = enumC20562 == EnumC20562.f66842 ? this.f74586 : this.f74588;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                ((C12468) arrayList.get(i)).m30973(this.f74595);
                C18111 c18111 = this.f74600;
                c18111.mo2164(c18111.m42173(), enumC20562 == EnumC20562.f66842 ? "endvar {0}; expected for the local variable" : "endtype {0}; expected for the local variable", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7903 m50793() {
        ArrayList arrayList = this.f74583;
        int size = arrayList.size();
        if (size != 0) {
            return (C7903) arrayList.get(size - 1);
        }
        C7903 c7903 = new C7903(this.f74600, this.f74599.f31849.m45846());
        arrayList.add(c7903);
        return c7903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50788(long j, EnumC20562 enumC20562, C13173 c13173, Object obj) {
        int i;
        int i2;
        int i3;
        C7903 c7903;
        C22948 c22948;
        C15187 c15187;
        EnumC16971 enumC16971;
        C14585 c14585 = this.f74601;
        C18111 c18111 = this.f74600;
        C23051 c23051 = new C23051(c14585, c18111);
        c23051.m50989(this.f74595, c18111.m42173(), enumC20562, c13173, obj);
        this.f74598.f74897 = c23051;
        this.f74598 = c23051;
        int iM46392 = enumC20562.m46392();
        int i4 = C1074.f4926[enumC20562.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                C8609 c8609 = (C8609) obj;
                int i5 = this.f74595;
                c8609.f29725 = i5;
                int i6 = (3 - i5) & 3;
                c8609.f29719 = i6;
                int size = i6 + 1 + ((c8609.f29720.size() + 1) * 8);
                if (c8609.f29722 == null) {
                    c8609.f29722 = new C13173(i5 + size);
                }
                int i7 = C19857.f63686;
                if (size >= 16384) {
                    c18111.mo2149(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC20562.f66852.m46393(), Integer.valueOf(size), 16384);
                }
                iM46392 = size;
            } else if (i4 == 3) {
                C15187 c15188 = (C15187) c13173;
                EnumC16971 enumC16972 = EnumC16971.LDC;
                if (c15188.f49577.f54307 > enumC16972.f54307) {
                    c15188.f49577 = enumC16972;
                }
            } else if ((c13173 instanceof C15187) && (enumC16971 = (c15187 = (C15187) c13173).f49577) != EnumC16971.LDC) {
                EnumC16971 enumC16973 = EnumC16971.ANY;
                if (enumC16971.f54307 > enumC16973.f54307) {
                    c15187.f49577 = enumC16973;
                }
            }
            c7903 = null;
        } else {
            C8609 c86010 = (C8609) obj;
            int i8 = this.f74595;
            C18111 c18112 = c86010.f29726;
            int size2 = c86010.f29720.size();
            if (size2 > 0) {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < size2; i9++) {
                    int iIntValue = ((Integer) c86010.f29720.get(i9)).intValue();
                    if (iIntValue > i3) {
                        i3 = iIntValue;
                    }
                    if (iIntValue < i2) {
                        i2 = iIntValue;
                    }
                }
                i = (i3 - i2) + 1;
            } else {
                i = 0;
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            c18112.m2146(String.format("  recalcTableSwitch: low=%d high=%d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            c86010.f29725 = i8;
            int i10 = (3 - i8) & 3;
            c86010.f29719 = i10;
            int iM1692 = C0252.m1692(i, 3, 4, i10 + 1);
            if (c86010.f29722 == null) {
                c86010.f29722 = new C13173(i8 + iM1692);
            }
            C13173[] c13173Arr = new C13173[i];
            for (int i11 = 0; i11 < i; i11++) {
                c13173Arr[i11] = c86010.f29722;
            }
            int i12 = 0;
            while (i12 < size2) {
                c18112.m2146(String.format("   keys.data[%d]=%s", Integer.valueOf(i12), c86010.f29720.get(i12)), new Object[0]);
                c13173Arr[((Integer) c86010.f29720.get(i12)).intValue() - i2] = (C13173) c86010.f29723.get(i12);
                i12++;
                size2 = size2;
            }
            c86010.f29721 = c13173Arr;
            c7903 = null;
            c86010.f29723 = null;
            c86010.f29720 = null;
            c86010.f29724 = i3;
            c86010.f29727 = i2;
            int i13 = C19857.f63686;
            if (iM1692 >= 16384) {
                c18111.mo2149(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC20562.f66733.m46393(), Integer.valueOf(iM1692), 16384);
            }
            iM46392 = iM1692;
        }
        if (c18111.m2161()) {
            long jM42171 = c18111.m42171(j);
            c22948 = this;
            if (jM42171 != c22948.f74584) {
                c22948.f74592.m10556(new C0472(c22948.f74595, jM42171));
                c22948.f74584 = jM42171;
            }
        } else {
            c22948 = this;
        }
        ArrayList<C7903> arrayList = c22948.f74583;
        if (!arrayList.isEmpty()) {
            C3564 c3564 = c22948.f74596;
            if (c3564 == null) {
                C9398 c9398 = c22948.f74599;
                C3564 c3565 = new C3564(c9398.f20884, c9398.f31849.m45846() ? EnumC16783.f53716 : EnumC16783.f53748);
                c22948.f74596 = c3565;
                c22948.f74582.m52871(c3565);
            } else {
                int size3 = c3564.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    C7903 c7904 = (C7903) c22948.f74596.get(size3);
                    if (!c7904.m20915()) {
                        c7903 = c7904;
                        break;
                    }
                }
            }
            for (C7903 c7905 : arrayList) {
                if (!c7905.m20915()) {
                    c7905.m20918(c22948.f74595);
                    c7905.m20914(c7903);
                }
            }
            c22948.f74596.addAll(arrayList);
            arrayList.clear();
        }
        c22948.f74595 += iM46392;
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return this.f74582.m52873() + this.f74590.m52873() + this.f74595 + 8;
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C13173 c13173 = this.f74589;
        int i = c13173 != null ? c13173.f43854 : 0;
        C13173 c13174 = this.f74585;
        int iMax = c13174 != null ? c13174.f43854 : Math.max(this.f74586.size(), this.f74588.size());
        super.mo2341(interfaceC19275);
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(i);
        c23509.m51770(iMax);
        c23509.m51771(this.f74595);
        C23051 c23051 = this.f74602;
        while (true) {
            c23051 = c23051.f74897;
            if (c23051 != null) {
                c23051.m50990(c23509);
            } else {
                this.f74590.m52872(c23509);
                this.f74582.m52872(c23509);
                return;
            }
        }
    }
}
