package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14647 extends AbstractC20521 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f47889;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f47890 = C2526.m7898((Object[]) null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f47891;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47892;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f47893;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f47894;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f47895;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f47896;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f47897;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f47898;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f47899;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9003 f47900;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public List[] f47901;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f47902;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47903;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f47904;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f47905;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f47906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List[] f47907;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f47908;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f47909;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f47910;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List f47911;

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo35169() {
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo35171() {
    }

    public C14647(int i, String str, String str2) {
        this.f47899 = i;
        this.f47906 = str;
        this.f47910 = str2;
        if ((i & 1024) == 0) {
            this.f47904 = new ArrayList(5);
        }
        this.f47898 = new ArrayList();
        this.f47900 = new C9003();
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo35173(int i, String str) {
        if (this.f47897 == null) {
            this.f47897 = new ArrayList(5);
        }
        ArrayList arrayList = this.f47897;
        C9708 c9708 = new C9708();
        c9708.f32699 = str;
        c9708.f32698 = i;
        arrayList.add(c9708);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo33776() {
        return new C15353(new C23819(this));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo33781(String str, boolean z) {
        C15353 c15353 = new C15353(str);
        if (z) {
            this.f47908 = C2526.m7899(this.f47908, c15353);
            return c15353;
        }
        this.f47894 = C2526.m7899(this.f47894, c15353);
        return c15353;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC9812 mo33789(int i, C1470 c1470, String str, boolean z) {
        C13817 c13817 = new C13817(i, c1470, str);
        if (z) {
            this.f47889 = C2526.m7899(this.f47889, c13817);
            return c13817;
        }
        this.f47909 = C2526.m7899(this.f47909, c13817);
        return c13817;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35163(int i, boolean z) {
        if (z) {
            this.f47895 = i;
        } else {
            this.f47892 = i;
        }
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo33777(int i, String str, boolean z) {
        C15353 c15353 = new C15353(str);
        String str2 = this.f47910;
        if (z) {
            if (this.f47907 == null) {
                this.f47907 = new List[C14172.m34259(str2)];
            }
            List[] listArr = this.f47907;
            listArr[i] = C2526.m7899(listArr[i], c15353);
            return c15353;
        }
        if (this.f47901 == null) {
            this.f47901 = new List[C14172.m34259(str2)];
        }
        List[] listArr2 = this.f47901;
        listArr2[i] = C2526.m7899(listArr2[i], c15353);
        return c15353;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35166(C11349 c11349) {
        this.f47893 = C2526.m7899(this.f47893, c11349);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33782(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = new Object[objArr.length];
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object objM35157 = objArr[i4];
                if (objM35157 instanceof C9938) {
                    objM35157 = m35157((C9938) objM35157);
                }
                objArr3[i4] = objM35157;
            }
        }
        if (objArr2 == null) {
            objArr4 = null;
        } else {
            objArr4 = new Object[objArr2.length];
            int length2 = objArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                Object objM35158 = objArr2[i5];
                if (objM35158 instanceof C9938) {
                    objM35158 = m35157((C9938) objM35158);
                }
                objArr4[i5] = objM35158;
            }
        }
        C18174 c18174 = new C18174(-1);
        c18174.f58071 = i;
        if (i == -1 || i == 0) {
            c18174.f58070 = C2526.m7896(i2, objArr3);
            c18174.f58072 = C2526.m7896(i3, objArr4);
        } else if (i == 1) {
            c18174.f58070 = C2526.m7896(i2, objArr3);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i6 = 0; i6 < i2; i6++) {
                arrayList.add(null);
            }
            c18174.f58070 = arrayList;
        } else if (i != 3) {
            if (i == 4) {
                c18174.f58072 = C2526.m7896(1, objArr4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        this.f47900.m23315(c18174);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35159(int i) {
        this.f47900.m23315(new C10414(i));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo35172(int i, int i2) {
        C7591 c7591 = new C7591(i);
        c7591.f25135 = i2;
        this.f47900.m23315(c7591);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo35158(int i, int i2) {
        C5349 c5349 = new C5349(i);
        c5349.f18477 = i2;
        this.f47900.m23315(c5349);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ */
    public final void mo33790(int i, String str) {
        C11700 c11700 = new C11700(i);
        c11700.f39326 = str;
        this.f47900.m23315(c11700);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33785(String str, int i, String str2, String str3) {
        C21702 c21702 = new C21702(i);
        c21702.f70392 = str;
        c21702.f70393 = str2;
        c21702.f70391 = str3;
        this.f47900.m23315(c21702);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33784(int i, String str, String str2, String str3, boolean z) {
        if (this.f66497 >= 327680 || (i & 256) != 0) {
            C11119 c11119 = new C11119(i & (-257));
            c11119.f37741 = str;
            c11119.f37740 = str2;
            c11119.f37739 = str3;
            c11119.f37742 = z;
            this.f47900.m23315(c11119);
            return;
        }
        super.mo33784(i, str, str2, str3, z);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33787(String str, String str2, C19110 c19110, Object... objArr) {
        C20996 c20996 = new C20996(186);
        c20996.f68367 = str;
        c20996.f68366 = str2;
        c20996.f68365 = c19110;
        c20996.f68368 = objArr;
        this.f47900.m23315(c20996);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35162(int i, C9938 c9938) {
        C20291 c20291M35157 = m35157(c9938);
        C16058 c16058 = new C16058(i);
        c16058.f51951 = c20291M35157;
        this.f47900.m23315(c16058);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35164(C9938 c9938) {
        this.f47900.m23315(m35157(c9938));
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo8457(Object obj) {
        C0534 c0534 = new C0534(18);
        c0534.f2284 = obj;
        this.f47900.m23315(c0534);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35160(int i, int i2) {
        C18880 c18880 = new C18880(132);
        c18880.f61151 = i;
        c18880.f61150 = i2;
        this.f47900.m23315(c18880);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35161(int i, int i2, C9938 c9938, C9938... c9938Arr) {
        C20291 c20291M35157 = m35157(c9938);
        C20291[] c20291ArrM35156 = m35156(c9938Arr);
        C3356 c3356 = new C3356(170);
        c3356.f12427 = i;
        c3356.f12426 = i2;
        c3356.f12425 = c20291M35157;
        c3356.f12428 = C2526.m7898(c20291ArrM35156);
        this.f47900.m23315(c3356);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35165(C9938 c9938, int[] iArr, C9938[] c9938Arr) {
        C20291 c20291M35157 = m35157(c9938);
        C20291[] c20291ArrM35156 = m35156(c9938Arr);
        C6179 c6179 = new C6179(171);
        c6179.f21047 = c20291M35157;
        c6179.f21049 = C2526.m7897(iArr);
        c6179.f21048 = C2526.m7898(c20291ArrM35156);
        this.f47900.m23315(c6179);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33783(int i, String str) {
        C1945 c1945 = new C1945(197);
        c1945.f7327 = str;
        c1945.f7328 = i;
        this.f47900.m23315(c1945);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo33778(int i, C1470 c1470, String str, boolean z) {
        AbstractC23114 last = this.f47900.getLast();
        while (last.f75073 == -1) {
            last = last.f75075;
        }
        C13817 c13817 = new C13817(i, c1470, str);
        if (z) {
            last.f75078 = C2526.m7899(last.f75078, c13817);
            return c13817;
        }
        last.f75077 = C2526.m7899(last.f75077, c13817);
        return c13817;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33788(C9938 c9938, C9938 c9939, C9938 c99310, String str) {
        C20291 c20291M35157 = m35157(c9938);
        C20291 c20291M35158 = m35157(c9939);
        C20291 c20291M35159 = m35157(c99310);
        C4643 c4643 = new C4643();
        c4643.f16397 = c20291M35157;
        c4643.f16398 = c20291M35158;
        c4643.f16401 = c20291M35159;
        c4643.f16399 = str;
        this.f47898 = C2526.m7899(this.f47898, c4643);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC9812 mo33791(int i, C1470 c1470, String str, boolean z) {
        C4643 c4643 = (C4643) this.f47898.get((16776960 & i) >> 8);
        C13817 c13817 = new C13817(i, c1470, str);
        if (z) {
            c4643.f16402 = C2526.m7899(c4643.f16402, c13817);
            return c13817;
        }
        c4643.f16400 = C2526.m7899(c4643.f16400, c13817);
        return c13817;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final void mo33786(String str, String str2, String str3, C9938 c9938, C9938 c9939, int i) {
        C20291 c20291M35157 = m35157(c9938);
        C20291 c20291M35158 = m35157(c9939);
        C17468 c17468 = new C17468();
        c17468.f55579 = str;
        c17468.f55580 = str2;
        c17468.f55581 = str3;
        c17468.f55584 = c20291M35157;
        c17468.f55583 = c20291M35158;
        c17468.f55582 = i;
        this.f47904 = C2526.m7899(this.f47904, c17468);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo33779(int i, C1470 c1470, C9938[] c9938Arr, C9938[] c9938Arr2, int[] iArr, String str, boolean z) {
        C20291[] c20291ArrM35156 = m35156(c9938Arr);
        C20291[] c20291ArrM35157 = m35156(c9938Arr2);
        C12530 c12530 = new C12530(i, c1470, str, 0);
        c12530.f41948 = C2526.m7898(c20291ArrM35156);
        c12530.f41947 = C2526.m7898(c20291ArrM35157);
        c12530.f41949 = C2526.m7897(iArr);
        if (z) {
            this.f47902 = C2526.m7899(this.f47902, c12530);
            return c12530;
        }
        this.f47911 = C2526.m7899(this.f47911, c12530);
        return c12530;
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo35174(int i, C9938 c9938) {
        C20291 c20291M35157 = m35157(c9938);
        C16763 c16763 = new C16763(-1);
        c16763.f53653 = i;
        c16763.f53654 = c20291M35157;
        this.f47900.m23315(c16763);
    }

    @Override // l.AbstractC20521
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo35170(int i, int i2) {
        this.f47896 = i;
        this.f47905 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20291 m35157(C9938 c9938) {
        if (!C6009.m16315(c9938.f33928)) {
            c9938.f33928 = new C20291();
        }
        return c9938.f33928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20291[] m35156(C9938[] c9938Arr) {
        C20291[] c20291Arr = new C20291[c9938Arr.length];
        int length = c9938Arr.length;
        for (int i = 0; i < length; i++) {
            c20291Arr[i] = m35157(c9938Arr[i]);
        }
        return c20291Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35167(C12760 c12760) {
        ArrayList arrayList = this.f47890;
        String[] strArr = arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
        m35168(c12760.mo3283(this.f47899, this.f47906, this.f47910, (String) null, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35168(AbstractC20521 abstractC20521) {
        ArrayList arrayList = this.f47897;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C9708 c9708 = (C9708) this.f47897.get(i);
                abstractC20521.mo35173(c9708.f32698, c9708.f32699);
            }
        }
        if (this.f47891 != null) {
            AbstractC9812 abstractC9812Mo33776 = abstractC20521.mo33776();
            C15353.m36799(abstractC9812Mo33776, (String) null, this.f47891);
            if (abstractC9812Mo33776 != null) {
                abstractC9812Mo33776.mo10177();
            }
        }
        List list = this.f47908;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C15353 c15353 = (C15353) this.f47908.get(i2);
                c15353.m36800(abstractC20521.mo33781(c15353.f50028, true));
            }
        }
        List list2 = this.f47894;
        if (list2 != null) {
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C15353 c15354 = (C15353) this.f47894.get(i3);
                c15354.m36800(abstractC20521.mo33781(c15354.f50028, false));
            }
        }
        List list3 = this.f47889;
        if (list3 != null) {
            int size4 = list3.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C13817 c13817 = (C13817) this.f47889.get(i4);
                c13817.m36800(abstractC20521.mo33789(c13817.f45603, c13817.f45602, c13817.f50028, true));
            }
        }
        List list4 = this.f47909;
        if (list4 != null) {
            int size5 = list4.size();
            for (int i5 = 0; i5 < size5; i5++) {
                C13817 c13818 = (C13817) this.f47909.get(i5);
                c13818.m36800(abstractC20521.mo33789(c13818.f45603, c13818.f45602, c13818.f50028, false));
            }
        }
        int i6 = this.f47895;
        if (i6 > 0) {
            abstractC20521.mo35163(i6, true);
        }
        List[] listArr = this.f47907;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                List list5 = this.f47907[i7];
                if (list5 != null) {
                    int size6 = list5.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        C15353 c15355 = (C15353) list5.get(i8);
                        c15355.m36800(abstractC20521.mo33777(i7, c15355.f50028, true));
                    }
                }
            }
        }
        int i9 = this.f47892;
        if (i9 > 0) {
            abstractC20521.mo35163(i9, false);
        }
        List[] listArr2 = this.f47901;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                List list6 = this.f47901[i10];
                if (list6 != null) {
                    int size7 = list6.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        C15353 c15356 = (C15353) list6.get(i11);
                        c15356.m36800(abstractC20521.mo33777(i10, c15356.f50028, false));
                    }
                }
            }
        }
        boolean z = this.f47903;
        C9003 c9003 = this.f47900;
        if (z) {
            c9003.m23318();
        }
        List list7 = this.f47893;
        if (list7 != null) {
            int size8 = list7.size();
            for (int i12 = 0; i12 < size8; i12++) {
                abstractC20521.mo35166((C11349) this.f47893.get(i12));
            }
        }
        if (c9003.size() > 0) {
            abstractC20521.mo35171();
            List list8 = this.f47898;
            if (list8 != null) {
                int size9 = list8.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    C4643 c4643 = (C4643) this.f47898.get(i13);
                    int i14 = (i13 << 8) | 1107296256;
                    List list9 = c4643.f16402;
                    if (list9 != null) {
                        int size10 = list9.size();
                        for (int i15 = 0; i15 < size10; i15++) {
                            ((C13817) c4643.f16402.get(i15)).f45603 = i14;
                        }
                    }
                    List list10 = c4643.f16400;
                    if (list10 != null) {
                        int size11 = list10.size();
                        for (int i16 = 0; i16 < size11; i16++) {
                            ((C13817) c4643.f16400.get(i16)).f45603 = i14;
                        }
                    }
                    C4643 c4644 = (C4643) this.f47898.get(i13);
                    C9938 c9938M45782 = c4644.f16397.m45782();
                    C9938 c9938M45783 = c4644.f16398.m45782();
                    C20291 c20291 = c4644.f16401;
                    abstractC20521.mo33788(c9938M45782, c9938M45783, c20291 == null ? null : c20291.m45782(), c4644.f16399);
                    List list11 = c4644.f16402;
                    if (list11 != null) {
                        int size12 = list11.size();
                        for (int i17 = 0; i17 < size12; i17++) {
                            C13817 c13819 = (C13817) c4644.f16402.get(i17);
                            c13819.m36800(abstractC20521.mo33791(c13819.f45603, c13819.f45602, c13819.f50028, true));
                        }
                    }
                    List list12 = c4644.f16400;
                    if (list12 != null) {
                        int size13 = list12.size();
                        for (int i18 = 0; i18 < size13; i18++) {
                            C13817 c138110 = (C13817) c4644.f16400.get(i18);
                            c138110.m36800(abstractC20521.mo33791(c138110.f45603, c138110.f45602, c138110.f50028, false));
                        }
                    }
                }
            }
            c9003.m23314(abstractC20521);
            List list13 = this.f47904;
            if (list13 != null) {
                int size14 = list13.size();
                for (int i19 = 0; i19 < size14; i19++) {
                    C17468 c17468 = (C17468) this.f47904.get(i19);
                    abstractC20521.mo33786(c17468.f55579, c17468.f55580, c17468.f55581, c17468.f55584.m45782(), c17468.f55583.m45782(), c17468.f55582);
                }
            }
            List list14 = this.f47902;
            if (list14 != null) {
                int size15 = list14.size();
                for (int i20 = 0; i20 < size15; i20++) {
                    ((C12530) this.f47902.get(i20)).m31147(abstractC20521, true);
                }
            }
            List list15 = this.f47911;
            if (list15 != null) {
                int size16 = list15.size();
                for (int i21 = 0; i21 < size16; i21++) {
                    ((C12530) this.f47911.get(i21)).m31147(abstractC20521, false);
                }
            }
            abstractC20521.mo35170(this.f47896, this.f47905);
            this.f47903 = true;
        }
        abstractC20521.mo35169();
    }
}
