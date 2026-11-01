package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2680 implements InterfaceC19595 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f10351;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f10352;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f10353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13265[] f10354;

    public C2680(int i, ArrayList arrayList, HashMap map) {
        this.f10350 = i;
        this.f10352 = arrayList;
        this.f10353 = map;
        this.f10354 = new C13265[i];
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6323(Object obj, Object obj2, AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        C13265[] c13265Arr = (C13265[]) obj;
        C13265[] c13265Arr2 = (C13265[]) obj2;
        int i = 0;
        int i2 = this.f10350;
        if (c13265Arr2 != null) {
            while (i < i2) {
                C13265 c13265 = c13265Arr[i];
                C13265 c13266 = c13265Arr2[i];
                if (c13265 != null && c13266 != null) {
                    if (c13266.f44047 == null) {
                        c13266.f44047 = new HashSet();
                    }
                    c13266.f44047.add(c13265);
                }
                i++;
            }
            return c13265Arr2;
        }
        C13265[] c13265Arr3 = new C13265[i2];
        while (i < i2) {
            C13265 c13267 = c13265Arr[i];
            if (c13267 != null) {
                C13265 c13268 = new C13265(c13267.f44048);
                this.f10352.add(c13268);
                c13268.f44045 = c13267.f44045;
                c13268.f44044 = c13267;
                c13268.f44046 = (BitSet) c13267.f44046.clone();
                c13265Arr3[i] = c13268;
            }
            i++;
        }
        return c13265Arr3;
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6324(Object obj, AbstractC4777 abstractC4777) {
        this.f10351 = abstractC4777;
        int i = this.f10350;
        C13265[] c13265Arr = this.f10354;
        System.arraycopy((C13265[]) obj, 0, c13265Arr, 0, i);
        EnumC2890 enumC2890 = abstractC4777.f16795;
        if (enumC2890 == EnumC2890.FILL_ARRAY_DATA) {
            if (abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                int i2 = ((C2184) abstractC4777.mo13244()).f7921;
                if (i2 >= 0) {
                    C13265 c13265 = c13265Arr[i2];
                    c13265.f44046.set(0, Array.getLength(((C14760) abstractC4777.mo13245()).f48276));
                    return c13265Arr;
                }
            } else {
                m8218(abstractC4777.mo13244());
                return c13265Arr;
            }
        } else {
            EnumC2890 enumC2891 = EnumC2890.ASSIGN;
            if (enumC2890 == enumC2891 && abstractC4777.mo13244().f23823 == EnumC9947.ARRAY) {
                m8218(abstractC4777.mo13245());
                C6292 c6292 = (C6292) abstractC4777.mo13244();
                AbstractC7124 abstractC7124 = c6292.f61770;
                if (abstractC7124.f23823 == EnumC9947.LOCAL) {
                    C2184 c2184 = (C2184) abstractC7124;
                    if (c2184.f7921 >= 0) {
                        c13265Arr[c2184.f7921].f44046.set(((Number) ((C14760) c6292.f61771).f48276).intValue());
                        return c13265Arr;
                    }
                    m8218(c6292);
                    return c13265Arr;
                }
                m8218(c6292);
                return c13265Arr;
            }
            if (enumC2890 == enumC2891 && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                C2184 c2185 = (C2184) abstractC4777.mo13244();
                m8218(abstractC4777.mo13245());
                if (c2185.f7921 >= 0) {
                    C13265 c13266 = new C13265(c2185);
                    c13266.f44045 = (C1269) this.f10353.get(c2185);
                    c13266.f44046 = new BitSet();
                    this.f10352.add(c13266);
                    c13265Arr[c2185.f7921] = c13266;
                    return c13265Arr;
                }
            } else {
                int i3 = C22437.f73219[abstractC4777.f16801.ordinal()];
                if (i3 == 2) {
                    m8218(abstractC4777.mo5126());
                    return c13265Arr;
                }
                if (i3 == 3) {
                    m8218(abstractC4777.mo13244());
                    m8218(abstractC4777.mo13245());
                    return c13265Arr;
                }
                if (i3 == 4) {
                    throw new RuntimeException();
                }
            }
        }
        return c13265Arr;
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6322() {
        return new C13265[this.f10350];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8218(AbstractC7124 abstractC7124) {
        int i;
        int i2 = C22437.f73219[abstractC7124.f23822.ordinal()];
        if (i2 == 1) {
            if (abstractC7124.f23823 != EnumC9947.LOCAL || (i = ((C2184) abstractC7124).f7921) < 0) {
                return;
            }
            C13265 c13265 = this.f10354[i];
            c13265.f44045.f5496.add(this.f10351);
            c13265.f44049 = true;
            return;
        }
        if (i2 == 2) {
            m8218(abstractC7124.mo19020());
            return;
        }
        if (i2 == 3) {
            m8218(abstractC7124.mo19024());
            m8218(abstractC7124.mo19019());
        } else {
            if (i2 != 4) {
                return;
            }
            for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
                m8218(abstractC7125);
            }
        }
    }
}
