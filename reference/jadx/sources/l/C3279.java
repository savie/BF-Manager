package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3279 extends AbstractC15037 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f10666;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10667;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f10668;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f10669;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10736 f10670;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f10671;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f10673;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f10674;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f10675 = C21179.m48328((Object[]) null);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f10676;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f10677;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public List f10678;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List[] f10679;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f10680;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f10681;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f10682;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f10683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List[] f10684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f10685;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f10686;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f10687;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f10688;

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10806() {
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10810() {
    }

    public C3279(int i, String str, String str2) {
        this.f10672 = i;
        this.f10683 = str;
        this.f10677 = str2;
        if ((i & 1024) == 0) {
            this.f10678 = new ArrayList(5);
        }
        this.f10671 = new ArrayList();
        this.f10670 = new C10736();
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10812(int i, String str) {
        if (this.f10674 == null) {
            this.f10674 = new ArrayList(5);
        }
        ArrayList arrayList = this.f10674;
        C12228 c12228 = new C12228();
        c12228.f39356 = str;
        c12228.f39355 = i;
        arrayList.add(c12228);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10782() {
        return new C2359(new C23417(this));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10786(String str, boolean z) {
        C2359 c2359 = new C2359(str);
        if (z) {
            this.f10669 = C21179.m48329(this.f10669, c2359);
            return c2359;
        }
        this.f10673 = C21179.m48329(this.f10673, c2359);
        return c2359;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10805(int i, C20259 c20259, String str, boolean z) {
        C4025 c4025 = new C4025(i, c20259, str);
        if (z) {
            this.f10681 = C21179.m48329(this.f10681, c4025);
            return c4025;
        }
        this.f10680 = C21179.m48329(this.f10680, c4025);
        return c4025;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10794(int i, boolean z) {
        if (z) {
            this.f10687 = i;
        } else {
            this.f10667 = i;
        }
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10783(int i, String str, boolean z) {
        C2359 c2359 = new C2359(str);
        String str2 = this.f10677;
        if (z) {
            if (this.f10684 == null) {
                this.f10684 = new List[C3105.m10128(str2)];
            }
            List[] listArr = this.f10684;
            listArr[i] = C21179.m48329(listArr[i], c2359);
            return c2359;
        }
        if (this.f10679 == null) {
            this.f10679 = new List[C3105.m10128(str2)];
        }
        List[] listArr2 = this.f10679;
        listArr2[i] = C21179.m48329(listArr2[i], c2359);
        return c2359;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10804(C24185 c24185) {
        this.f10682 = C21179.m48329(this.f10682, c24185);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10789(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = new Object[objArr.length];
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object objM10781 = objArr[i4];
                if (objM10781 instanceof C10562) {
                    objM10781 = m10781((C10562) objM10781);
                }
                objArr3[i4] = objM10781;
            }
        }
        if (objArr2 == null) {
            objArr4 = null;
        } else {
            objArr4 = new Object[objArr2.length];
            int length2 = objArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                Object objM10782 = objArr2[i5];
                if (objM10782 instanceof C10562) {
                    objM10782 = m10781((C10562) objM10782);
                }
                objArr4[i5] = objM10782;
            }
        }
        C6834 c6834 = new C6834(-1);
        c6834.f22704 = i;
        if (i == -1 || i == 0) {
            c6834.f22706 = C21179.m48326(i2, objArr3);
            c6834.f22705 = C21179.m48326(i3, objArr4);
        } else if (i == 1) {
            c6834.f22706 = C21179.m48326(i2, objArr3);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i6 = 0; i6 < i2; i6++) {
                arrayList.add(null);
            }
            c6834.f22706 = arrayList;
        } else if (i != 3) {
            if (i == 4) {
                c6834.f22705 = C21179.m48326(1, objArr4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        this.f10670.m27341(c6834);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10787(int i) {
        this.f10670.m27341(new C22671(i));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10811(int i, int i2) {
        C19687 c19687 = new C19687(i);
        c19687.f63413 = i2;
        this.f10670.m27341(c19687);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo10814(int i, int i2) {
        C18195 c18195 = new C18195(i);
        c18195.f59435 = i2;
        this.f10670.m27341(c18195);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10808(int i, String str) {
        C14465 c14465 = new C14465(i);
        c14465.f45517 = str;
        this.f10670.m27341(c14465);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10796(String str, int i, String str2, String str3) {
        C8325 c8325 = new C8325(i);
        c8325.f27307 = str;
        c8325.f27308 = str2;
        c8325.f27309 = str3;
        this.f10670.m27341(c8325);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10792(int i, String str, String str2, String str3, boolean z) {
        if (this.f49089 >= 327680 || (i & 256) != 0) {
            C15957 c15957 = new C15957(i & (-257));
            c15957.f51812 = str;
            c15957.f51810 = str2;
            c15957.f51813 = str3;
            c15957.f51811 = z;
            this.f10670.m27341(c15957);
            return;
        }
        super.mo10792(i, str, str2, str3, z);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10798(String str, String str2, C4597 c4597, Object... objArr) {
        C15211 c15211 = new C15211(186);
        c15211.f49644 = str;
        c15211.f49642 = str2;
        c15211.f49645 = c4597;
        c15211.f49643 = objArr;
        this.f10670.m27341(c15211);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10793(int i, C10562 c10562) {
        C5517 c5517M10781 = m10781(c10562);
        C12974 c12974 = new C12974(i);
        c12974.f41598 = c5517M10781;
        this.f10670.m27341(c12974);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10800(C10562 c10562) {
        this.f10670.m27341(m10781(c10562));
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10795(Object obj) {
        C1788 c1788 = new C1788(18);
        c1788.f6104 = obj;
        this.f10670.m27341(c1788);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10788(int i, int i2) {
        C13545 c13545 = new C13545(132);
        c13545.f43026 = i;
        c13545.f43027 = i2;
        this.f10670.m27341(c13545);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10790(int i, int i2, C10562 c10562, C10562... c10562Arr) {
        C5517 c5517M10781 = m10781(c10562);
        C5517[] c5517ArrM10780 = m10780(c10562Arr);
        C6263 c6263 = new C6263(170);
        c6263.f21238 = i;
        c6263.f21236 = i2;
        c6263.f21239 = c5517M10781;
        c6263.f21237 = C21179.m48328(c5517ArrM10780);
        this.f10670.m27341(c6263);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10802(C10562 c10562, int[] iArr, C10562[] c10562Arr) {
        C5517 c5517M10781 = m10781(c10562);
        C5517[] c5517ArrM10780 = m10780(c10562Arr);
        C17449 c17449 = new C17449(171);
        c17449.f56755 = c5517M10781;
        c17449.f56754 = C21179.m48327(iArr);
        c17449.f56753 = C21179.m48328(c5517ArrM10780);
        this.f10670.m27341(c17449);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10791(int i, String str) {
        C20433 c20433 = new C20433(197);
        c20433.f65446 = str;
        c20433.f65445 = i;
        this.f10670.m27341(c20433);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10784(int i, C20259 c20259, String str, boolean z) {
        AbstractC9070 last = this.f10670.getLast();
        while (last.f29488 == -1) {
            last = last.f29486;
        }
        C4025 c4025 = new C4025(i, c20259, str);
        if (z) {
            last.f29485 = C21179.m48329(last.f29485, c4025);
            return c4025;
        }
        last.f29487 = C21179.m48329(last.f29487, c4025);
        return c4025;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10801(C10562 c10562, C10562 c10563, C10562 c10564, String str) {
        C5517 c5517M10781 = m10781(c10562);
        C5517 c5517M10782 = m10781(c10563);
        C5517 c5517M10783 = m10781(c10564);
        C24163 c24163 = new C24163();
        c24163.f78183 = c5517M10781;
        c24163.f78178 = c5517M10782;
        c24163.f78182 = c5517M10783;
        c24163.f78181 = str;
        this.f10671 = C21179.m48329(this.f10671, c24163);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10809(int i, C20259 c20259, String str, boolean z) {
        C24163 c24163 = (C24163) this.f10671.get((16776960 & i) >> 8);
        C4025 c4025 = new C4025(i, c20259, str);
        if (z) {
            c24163.f78180 = C21179.m48329(c24163.f78180, c4025);
            return c4025;
        }
        c24163.f78179 = C21179.m48329(c24163.f78179, c4025);
        return c4025;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10797(String str, String str2, String str3, C10562 c10562, C10562 c10563, int i) {
        C5517 c5517M10781 = m10781(c10562);
        C5517 c5517M10782 = m10781(c10563);
        C16703 c16703 = new C16703();
        c16703.f53964 = str;
        c16703.f53959 = str2;
        c16703.f53962 = str3;
        c16703.f53961 = c5517M10781;
        c16703.f53963 = c5517M10782;
        c16703.f53960 = i;
        this.f10678 = C21179.m48329(this.f10678, c16703);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo10785(int i, C20259 c20259, C10562[] c10562Arr, C10562[] c10562Arr2, int[] iArr, String str, boolean z) {
        C5517[] c5517ArrM10780 = m10780(c10562Arr);
        C5517[] c5517ArrM10781 = m10780(c10562Arr2);
        C24909 c24909 = new C24909(i, c20259, str, 0);
        c24909.f80619 = C21179.m48328(c5517ArrM10780);
        c24909.f80621 = C21179.m48328(c5517ArrM10781);
        c24909.f80620 = C21179.m48327(iArr);
        if (z) {
            this.f10676 = C21179.m48329(this.f10676, c24909);
            return c24909;
        }
        this.f10688 = C21179.m48329(this.f10688, c24909);
        return c24909;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10813(int i, C10562 c10562) {
        C5517 c5517M10781 = m10781(c10562);
        C11482 c11482 = new C11482(-1);
        c11482.f36123 = i;
        c11482.f36122 = c5517M10781;
        this.f10670.m27341(c11482);
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10807(int i, int i2) {
        this.f10668 = i;
        this.f10686 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5517 m10781(C10562 c10562) {
        if (!C1402.m5130(c10562.f33570)) {
            c10562.f33570 = new C5517();
        }
        return c10562.f33570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5517[] m10780(C10562[] c10562Arr) {
        C5517[] c5517Arr = new C5517[c10562Arr.length];
        int length = c10562Arr.length;
        for (int i = 0; i < length; i++) {
            c5517Arr[i] = m10781(c10562Arr[i]);
        }
        return c5517Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10799(C0318 c0318) {
        ArrayList arrayList = this.f10675;
        String[] strArr = arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
        m10803(c0318.mo1999(this.f10672, this.f10683, this.f10677, (String) null, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10803(AbstractC15037 abstractC15037) {
        ArrayList arrayList = this.f10674;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C12228 c12228 = (C12228) this.f10674.get(i);
                abstractC15037.mo10812(c12228.f39355, c12228.f39356);
            }
        }
        if (this.f10685 != null) {
            AbstractC3301 abstractC3301Mo10782 = abstractC15037.mo10782();
            C2359.m7992(abstractC3301Mo10782, (String) null, this.f10685);
            if (abstractC3301Mo10782 != null) {
                abstractC3301Mo10782.mo7995();
            }
        }
        List list = this.f10669;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2359 c2359 = (C2359) this.f10669.get(i2);
                c2359.m7998(abstractC15037.mo10786(c2359.f7610, true));
            }
        }
        List list2 = this.f10673;
        if (list2 != null) {
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C2359 c23510 = (C2359) this.f10673.get(i3);
                c23510.m7998(abstractC15037.mo10786(c23510.f7610, false));
            }
        }
        List list3 = this.f10681;
        if (list3 != null) {
            int size4 = list3.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C4025 c4025 = (C4025) this.f10681.get(i4);
                c4025.m7998(abstractC15037.mo10805(c4025.f13732, c4025.f13733, c4025.f7610, true));
            }
        }
        List list4 = this.f10680;
        if (list4 != null) {
            int size5 = list4.size();
            for (int i5 = 0; i5 < size5; i5++) {
                C4025 c4026 = (C4025) this.f10680.get(i5);
                c4026.m7998(abstractC15037.mo10805(c4026.f13732, c4026.f13733, c4026.f7610, false));
            }
        }
        int i6 = this.f10687;
        if (i6 > 0) {
            abstractC15037.mo10794(i6, true);
        }
        List[] listArr = this.f10684;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                List list5 = this.f10684[i7];
                if (list5 != null) {
                    int size6 = list5.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        C2359 c23511 = (C2359) list5.get(i8);
                        c23511.m7998(abstractC15037.mo10783(i7, c23511.f7610, true));
                    }
                }
            }
        }
        int i9 = this.f10667;
        if (i9 > 0) {
            abstractC15037.mo10794(i9, false);
        }
        List[] listArr2 = this.f10679;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                List list6 = this.f10679[i10];
                if (list6 != null) {
                    int size7 = list6.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        C2359 c23512 = (C2359) list6.get(i11);
                        c23512.m7998(abstractC15037.mo10783(i10, c23512.f7610, false));
                    }
                }
            }
        }
        boolean z = this.f10666;
        C10736 c10736 = this.f10670;
        if (z) {
            c10736.m27345();
        }
        List list7 = this.f10682;
        if (list7 != null) {
            int size8 = list7.size();
            for (int i12 = 0; i12 < size8; i12++) {
                abstractC15037.mo10804((C24185) this.f10682.get(i12));
            }
        }
        if (c10736.size() > 0) {
            abstractC15037.mo10810();
            List list8 = this.f10671;
            if (list8 != null) {
                int size9 = list8.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    C24163 c24163 = (C24163) this.f10671.get(i13);
                    int i14 = (i13 << 8) | 1107296256;
                    List list9 = c24163.f78180;
                    if (list9 != null) {
                        int size10 = list9.size();
                        for (int i15 = 0; i15 < size10; i15++) {
                            ((C4025) c24163.f78180.get(i15)).f13732 = i14;
                        }
                    }
                    List list10 = c24163.f78179;
                    if (list10 != null) {
                        int size11 = list10.size();
                        for (int i16 = 0; i16 < size11; i16++) {
                            ((C4025) c24163.f78179.get(i16)).f13732 = i14;
                        }
                    }
                    C24163 c24164 = (C24163) this.f10671.get(i13);
                    C10562 c10562M16430 = c24164.f78183.m16430();
                    C10562 c10562M16431 = c24164.f78178.m16430();
                    C5517 c5517 = c24164.f78182;
                    abstractC15037.mo10801(c10562M16430, c10562M16431, c5517 == null ? null : c5517.m16430(), c24164.f78181);
                    List list11 = c24164.f78180;
                    if (list11 != null) {
                        int size12 = list11.size();
                        for (int i17 = 0; i17 < size12; i17++) {
                            C4025 c4027 = (C4025) c24164.f78180.get(i17);
                            c4027.m7998(abstractC15037.mo10809(c4027.f13732, c4027.f13733, c4027.f7610, true));
                        }
                    }
                    List list12 = c24164.f78179;
                    if (list12 != null) {
                        int size13 = list12.size();
                        for (int i18 = 0; i18 < size13; i18++) {
                            C4025 c4028 = (C4025) c24164.f78179.get(i18);
                            c4028.m7998(abstractC15037.mo10809(c4028.f13732, c4028.f13733, c4028.f7610, false));
                        }
                    }
                }
            }
            c10736.m27343(abstractC15037);
            List list13 = this.f10678;
            if (list13 != null) {
                int size14 = list13.size();
                for (int i19 = 0; i19 < size14; i19++) {
                    C16703 c16703 = (C16703) this.f10678.get(i19);
                    abstractC15037.mo10797(c16703.f53964, c16703.f53959, c16703.f53962, c16703.f53961.m16430(), c16703.f53963.m16430(), c16703.f53960);
                }
            }
            List list14 = this.f10676;
            if (list14 != null) {
                int size15 = list14.size();
                for (int i20 = 0; i20 < size15; i20++) {
                    ((C24909) this.f10676.get(i20)).m55493(abstractC15037, true);
                }
            }
            List list15 = this.f10688;
            if (list15 != null) {
                int size16 = list15.size();
                for (int i21 = 0; i21 < size16; i21++) {
                    ((C24909) this.f10688.get(i21)).m55493(abstractC15037, false);
                }
            }
            abstractC15037.mo10807(this.f10668, this.f10686);
            this.f10666 = true;
        }
        abstractC15037.mo10806();
    }
}
