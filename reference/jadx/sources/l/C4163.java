package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۘ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4163 implements InterfaceC14054 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f14136;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f14137;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f14138;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0434[] f14139;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14140;

    public C4163(int i, ArrayList arrayList, HashMap map) {
        this.f14140 = i;
        this.f14138 = arrayList;
        this.f14137 = map;
        this.f14139 = new C0434[i];
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6602(Object obj, Object obj2, AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        C0434[] c0434Arr = (C0434[]) obj;
        C0434[] c0434Arr2 = (C0434[]) obj2;
        int i = 0;
        int i2 = this.f14140;
        if (c0434Arr2 != null) {
            while (i < i2) {
                C0434 c0434 = c0434Arr[i];
                C0434 c0435 = c0434Arr2[i];
                if (c0434 != null && c0435 != null) {
                    if (c0435.f1996 == null) {
                        c0435.f1996 = new HashSet();
                    }
                    c0435.f1996.add(c0434);
                }
                i++;
            }
            return c0434Arr2;
        }
        C0434[] c0434Arr3 = new C0434[i2];
        while (i < i2) {
            C0434 c0436 = c0434Arr[i];
            if (c0436 != null) {
                C0434 c0437 = new C0434(c0436.f1999);
                this.f14138.add(c0437);
                c0437.f1995 = c0436.f1995;
                c0437.f2000 = c0436;
                c0437.f1998 = (BitSet) c0436.f1998.clone();
                c0434Arr3[i] = c0437;
            }
            i++;
        }
        return c0434Arr3;
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo13332(Object obj, AbstractC12563 abstractC12563) {
        this.f14136 = abstractC12563;
        int i = this.f14140;
        C0434[] c0434Arr = this.f14139;
        System.arraycopy((C0434[]) obj, 0, c0434Arr, 0, i);
        EnumC20768 enumC20768 = abstractC12563.f40344;
        if (enumC20768 == EnumC20768.FILL_ARRAY_DATA) {
            if (abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                int i2 = ((C4448) abstractC12563.mo11730()).f15916;
                if (i2 >= 0) {
                    C0434 c0434 = c0434Arr[i2];
                    c0434.f1998.set(0, Array.getLength(((C16380) abstractC12563.mo11728()).f53172));
                    return c0434Arr;
                }
            } else {
                m13330(abstractC12563.mo11730());
                return c0434Arr;
            }
        } else {
            EnumC20768 enumC20769 = EnumC20768.ASSIGN;
            if (enumC20768 == enumC20769 && abstractC12563.mo11730().f34921 == EnumC22260.ARRAY) {
                m13330(abstractC12563.mo11728());
                C25332 c25332 = (C25332) abstractC12563.mo11730();
                AbstractC11071 abstractC11071 = c25332.f44724;
                if (abstractC11071.f34921 == EnumC22260.LOCAL) {
                    C4448 c4448 = (C4448) abstractC11071;
                    if (c4448.f15916 >= 0) {
                        c0434Arr[c4448.f15916].f1998.set(((Number) ((C16380) c25332.f44725).f53172).intValue());
                        return c0434Arr;
                    }
                    m13330(c25332);
                    return c0434Arr;
                }
                m13330(c25332);
                return c0434Arr;
            }
            if (enumC20768 == enumC20769 && abstractC12563.mo11730().f34921 == EnumC22260.LOCAL) {
                C4448 c4449 = (C4448) abstractC12563.mo11730();
                m13330(abstractC12563.mo11728());
                if (c4449.f15916 >= 0) {
                    C0434 c0435 = new C0434(c4449);
                    c0435.f1995 = (C18333) this.f14137.get(c4449);
                    c0435.f1998 = new BitSet();
                    this.f14138.add(c0435);
                    c0434Arr[c4449.f15916] = c0435;
                    return c0434Arr;
                }
            } else {
                int i3 = C21317.f67927[abstractC12563.f40352.ordinal()];
                if (i3 == 2) {
                    m13330(abstractC12563.mo31271());
                    return c0434Arr;
                }
                if (i3 == 3) {
                    m13330(abstractC12563.mo11730());
                    m13330(abstractC12563.mo11728());
                    return c0434Arr;
                }
                if (i3 == 4) {
                    throw new RuntimeException();
                }
            }
        }
        return c0434Arr;
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo13331() {
        return new C0434[this.f14140];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13330(AbstractC11071 abstractC11071) {
        int i;
        int i2 = C21317.f67927[abstractC11071.f34922.ordinal()];
        if (i2 == 1) {
            if (abstractC11071.f34921 != EnumC22260.LOCAL || (i = ((C4448) abstractC11071).f15916) < 0) {
                return;
            }
            C0434 c0434 = this.f14139[i];
            c0434.f1995.f59799.add(this.f14136);
            c0434.f1997 = true;
            return;
        }
        if (i2 == 2) {
            m13330(abstractC11071.mo20366());
            return;
        }
        if (i2 == 3) {
            m13330(abstractC11071.mo27979());
            m13330(abstractC11071.mo27977());
        } else {
            if (i2 != 4) {
                return;
            }
            for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
                m13330(abstractC11072);
            }
        }
    }
}
