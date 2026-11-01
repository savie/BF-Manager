package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 91JR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15781 extends C23542 {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f51111;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public int f51123;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public C3079 f51109 = new C3079(this);

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public C11941 f51116 = new C11941(this);

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9431 f51115 = null;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f51122 = false;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C5196 f51117 = new C5196();

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f51110 = 0;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public int f51118 = 0;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public C18602[] f51121 = new C18602[4];

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C18602[] f51106 = new C18602[4];

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f51108 = 257;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public boolean f51119 = false;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public boolean f51114 = false;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f51120 = null;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f51107 = null;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f51112 = null;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f51113 = null;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C1668 f51105 = new C1668();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37525(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f51111 = i6;
        this.f51123 = i7;
        this.f51109.m9265(this, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final void m37539() {
        this.f51109.m9264(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37527(InterfaceC9431 interfaceC9431) {
        this.f51115 = interfaceC9431;
        this.f51116.m29740(interfaceC9431);
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9431 m37534() {
        return this.f51115;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m37522() {
        this.f51117.getClass();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m37531(int i) {
        this.f51108 = i;
        C5196.f18013 = m37532(512);
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int m37524() {
        return this.f51108;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m37532(int i) {
        return (this.f51108 & i) == i;
    }

    @Override // l.C23542, l.C20719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo37523() {
        this.f51117.m14370();
        this.f51111 = 0;
        this.f51123 = 0;
        super.mo37523();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37540() {
        return this.f51119;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37542() {
        return this.f51114;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37533(C8725 c8725) {
        WeakReference weakReference = this.f51120;
        if (weakReference == null || weakReference.get() == null || c8725.m22579() > ((C8725) this.f51120.get()).m22579()) {
            this.f51120 = new WeakReference(c8725);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37536(C8725 c8725) {
        WeakReference weakReference = this.f51112;
        if (weakReference == null || weakReference.get() == null || c8725.m22579() > ((C8725) this.f51112.get()).m22579()) {
            this.f51112 = new WeakReference(c8725);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37526(C8725 c8725) {
        WeakReference weakReference = this.f51113;
        if (weakReference == null || weakReference.get() == null || c8725.m22579() > ((C8725) this.f51113.get()).m22579()) {
            this.f51113 = new WeakReference(c8725);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37535(C5196 c5196) {
        boolean zM37532 = m37532(64);
        mo1744(c5196, zM37532);
        int size = this.f76249.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C20719 c20719 = (C20719) this.f76249.get(i);
            c20719.m46587(0, false);
            c20719.m46587(1, false);
            if (c20719 instanceof C21424) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C20719 c207110 = (C20719) this.f76249.get(i2);
                if (c207110 instanceof C21424) {
                    ((C21424) c207110).m48000();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C20719 c207111 = (C20719) this.f76249.get(i3);
            c207111.getClass();
            if ((c207111 instanceof C10842) || (c207111 instanceof C12253)) {
                c207111.mo1744(c5196, zM37532);
            }
        }
        if (C5196.f18013) {
            HashSet<C20719> hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C20719 c207112 = (C20719) this.f76249.get(i4);
                c207112.getClass();
                if (!(c207112 instanceof C10842) && !(c207112 instanceof C12253)) {
                    hashSet.add(c207112);
                }
            }
            m46594(this, c5196, hashSet, this.f67434[0] == EnumC7313.WRAP_CONTENT ? 0 : 1, false);
            for (C20719 c207113 : hashSet) {
                C5902.m16169(this, c5196, c207113);
                c207113.mo1744(c5196, zM37532);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C20719 c207114 = (C20719) this.f76249.get(i5);
                if (c207114 instanceof C15781) {
                    EnumC7313[] enumC7313Arr = c207114.f67434;
                    EnumC7313 enumC7313 = enumC7313Arr[0];
                    EnumC7313 enumC7314 = enumC7313Arr[1];
                    EnumC7313 enumC7315 = EnumC7313.WRAP_CONTENT;
                    if (enumC7313 == enumC7315) {
                        c207114.m46591(EnumC7313.FIXED);
                    }
                    if (enumC7314 == enumC7315) {
                        c207114.m46626(EnumC7313.FIXED);
                    }
                    c207114.mo1744(c5196, zM37532);
                    if (enumC7313 == enumC7315) {
                        c207114.m46591(enumC7313);
                    }
                    if (enumC7314 == enumC7315) {
                        c207114.m46626(enumC7314);
                    }
                } else {
                    C5902.m16169(this, c5196, c207114);
                    if (!(c207114 instanceof C10842) && !(c207114 instanceof C12253)) {
                        c207114.mo1744(c5196, zM37532);
                    }
                }
            }
        }
        if (this.f51110 > 0) {
            C17896.m41527(this, c5196, null, 0);
        }
        if (this.f51118 > 0) {
            C17896.m41527(this, c5196, null, 1);
        }
    }

    @Override // l.C20719
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37529(boolean z, boolean z2) {
        super.mo37529(z, z2);
        int size = this.f76249.size();
        for (int i = 0; i < size; i++) {
            ((C20719) this.f76249.get(i)).mo37529(z, z2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37537(boolean z) {
        this.f51122 = z;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37538() {
        return this.f51122;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02af  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x0319 A[PHI: r0 r8
      0x0319: PHI (r0v18 boolean) = (r0v17 boolean), (r0v22 boolean) binds: [B:140:0x02d6, B:154:0x0318] A[DONT_GENERATE, DONT_INLINE]
      0x0319: PHI (r8v13 boolean) = (r8v12 boolean), (r8v15 boolean) binds: [B:140:0x02d6, B:154:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    @Override // l.C23542
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37541() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int iMax;
        int iMax2;
        EnumC7313 enumC7313;
        EnumC7313 enumC7314;
        boolean z4;
        ?? r0;
        EnumC7313 enumC7315;
        int i2 = 0;
        this.f67372 = 0;
        this.f67415 = 0;
        this.f51119 = false;
        this.f51114 = false;
        int size = this.f76249.size();
        int iMax3 = Math.max(0, m46640());
        int iMax4 = Math.max(0, m46619());
        EnumC7313[] enumC7313Arr = this.f67434;
        EnumC7313 enumC7316 = enumC7313Arr[1];
        EnumC7313 enumC7317 = enumC7313Arr[0];
        if (C5902.m16170(this.f51108, 1)) {
            C1356.m4790(this, this.f51115);
            for (int i3 = 0; i3 < size; i3++) {
                C20719 c20719 = (C20719) this.f76249.get(i3);
                if (c20719.m46613() && !(c20719 instanceof C12253) && !(c20719 instanceof C21424) && !(c20719 instanceof C10842) && !c20719.m46603()) {
                    EnumC7313 enumC7313M46621 = c20719.m46621(0);
                    EnumC7313 enumC7313M46622 = c20719.m46621(1);
                    EnumC7313 enumC7318 = EnumC7313.MATCH_CONSTRAINT;
                    if (enumC7313M46621 != enumC7318 || c20719.f67395 == 1 || enumC7313M46622 != enumC7318 || c20719.f67375 == 1) {
                        m37521(c20719, this.f51115, new C1668());
                    }
                }
            }
        }
        if (size <= 2 || !((enumC7317 == (enumC7315 = EnumC7313.WRAP_CONTENT) || enumC7316 == enumC7315) && C5902.m16170(this.f51108, 1024) && C13352.m32851(this, this.f51115))) {
            z = false;
        } else {
            if (enumC7317 == enumC7315) {
                if (iMax3 < m46640() && iMax3 > 0) {
                    m46608(iMax3);
                    this.f51119 = true;
                } else {
                    iMax3 = m46640();
                }
            }
            if (enumC7316 == enumC7315) {
                if (iMax4 < m46619() && iMax4 > 0) {
                    m46620(iMax4);
                    this.f51114 = true;
                } else {
                    iMax4 = m46619();
                }
            }
            z = true;
        }
        boolean z5 = m37532(64) || m37532(128);
        C5196 c5196 = this.f51117;
        c5196.getClass();
        c5196.f18025 = false;
        if (this.f51108 != 0 && z5) {
            c5196.f18025 = true;
        }
        ArrayList arrayList = this.f76249;
        EnumC7313[] enumC7313Arr2 = this.f67434;
        EnumC7313 enumC7319 = enumC7313Arr2[0];
        EnumC7313 enumC73110 = EnumC7313.WRAP_CONTENT;
        boolean z6 = enumC7319 == enumC73110 || enumC7313Arr2[1] == enumC73110;
        this.f51110 = 0;
        this.f51118 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C20719 c207110 = (C20719) this.f76249.get(i4);
            if (c207110 instanceof C23542) {
                ((C23542) c207110).mo37541();
            }
        }
        boolean zM37532 = m37532(64);
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            i5++;
            try {
                c5196.m14370();
                this.f51110 = i2;
                this.f51118 = i2;
                m46590(c5196);
                for (int i6 = 0; i6 < size; i6++) {
                    ((C20719) this.f76249.get(i6)).m46590(c5196);
                }
                m37535(c5196);
                try {
                    WeakReference weakReference = this.f51120;
                    if (weakReference != null && weakReference.get() != null) {
                        c5196.m14374(c5196.m14364((C8725) this.f51120.get()), c5196.m14364(this.f67392), i2, 5);
                        this.f51120 = null;
                    }
                    WeakReference weakReference2 = this.f51112;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c5196.m14374(c5196.m14364(this.f67387), c5196.m14364((C8725) this.f51112.get()), i2, 5);
                        this.f51112 = null;
                    }
                    WeakReference weakReference3 = this.f51107;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        c5196.m14374(c5196.m14364((C8725) this.f51107.get()), c5196.m14364(this.f67385), i2, 5);
                        this.f51107 = null;
                    }
                    WeakReference weakReference4 = this.f51113;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        c5196.m14374(c5196.m14364(this.f67421), c5196.m14364((C8725) this.f51113.get()), i2, 5);
                        this.f51113 = null;
                    }
                    c5196.m14361();
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    z7 = true;
                    System.out.println("EXCEPTION : " + e);
                    z2 = z7;
                }
            } catch (Exception e2) {
                e = e2;
            }
            boolean[] zArr = C5902.f20140;
            if (z2) {
                zArr[2] = false;
                boolean zM37533 = m37532(64);
                mo30468(c5196, zM37533);
                int i7 = 0;
                for (int size2 = this.f76249.size(); i7 < size2; size2 = size2) {
                    ((C20719) this.f76249.get(i7)).mo30468(c5196, zM37533);
                    i7++;
                }
            } else {
                mo30468(c5196, zM37532);
                for (int i8 = 0; i8 < size; i8++) {
                    ((C20719) this.f76249.get(i8)).mo30468(c5196, zM37532);
                }
            }
            if (z6 && i5 < 8 && zArr[2]) {
                int i9 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i9 < size) {
                    C20719 c207111 = (C20719) this.f76249.get(i9);
                    iMax5 = Math.max(iMax5, c207111.m46640() + c207111.f67372);
                    iMax6 = Math.max(iMax6, c207111.m46619() + c207111.f67415);
                    i9++;
                    size = size;
                }
                i = size;
                int iMax7 = Math.max(this.f67380, iMax5);
                int iMax8 = Math.max(this.f67405, iMax6);
                EnumC7313 enumC73111 = EnumC7313.WRAP_CONTENT;
                if (enumC7317 != enumC73111 || m46640() >= iMax7) {
                    z3 = false;
                } else {
                    m46608(iMax7);
                    this.f67434[0] = enumC73111;
                    z3 = true;
                    z = true;
                }
                if (enumC7316 == enumC73111 && m46619() < iMax8) {
                    m46620(iMax8);
                    this.f67434[1] = enumC73111;
                    z3 = true;
                    z = true;
                }
                iMax = Math.max(this.f67380, m46640());
                if (iMax > m46640()) {
                    m46608(iMax);
                    this.f67434[0] = EnumC7313.FIXED;
                    z3 = true;
                    z = true;
                }
                iMax2 = Math.max(this.f67405, m46619());
                if (iMax2 > m46619()) {
                    m46620(iMax2);
                    this.f67434[1] = EnumC7313.FIXED;
                    z3 = true;
                    z = true;
                }
                if (z) {
                    z7 = z3;
                } else {
                    enumC7313 = this.f67434[0];
                    enumC7314 = EnumC7313.WRAP_CONTENT;
                    if (enumC7313 == enumC7314 || iMax3 <= 0 || m46640() <= iMax3) {
                        z4 = z3;
                        r0 = 1;
                    } else {
                        r0 = 1;
                        this.f51119 = true;
                        this.f67434[0] = EnumC7313.FIXED;
                        m46608(iMax3);
                        z4 = true;
                        z = true;
                    }
                    if (this.f67434[r0] == enumC7314 || iMax4 <= 0 || m46619() <= iMax4) {
                        z3 = z4;
                        z7 = z3;
                    } else {
                        this.f51114 = r0;
                        this.f67434[r0] = EnumC7313.FIXED;
                        m46620(iMax4);
                        z = true;
                        z7 = true;
                    }
                }
                i2 = 0;
                size = i;
            } else {
                i = size;
                z3 = false;
            }
            z = z;
            iMax = Math.max(this.f67380, m46640());
            if (iMax > m46640()) {
                m46608(iMax);
                this.f67434[0] = EnumC7313.FIXED;
                z3 = true;
                z = true;
            }
            iMax2 = Math.max(this.f67405, m46619());
            if (iMax2 > m46619()) {
                m46620(iMax2);
                this.f67434[1] = EnumC7313.FIXED;
                z3 = true;
                z = true;
            }
            if (z) {
                enumC7313 = this.f67434[0];
                enumC7314 = EnumC7313.WRAP_CONTENT;
                if (enumC7313 == enumC7314) {
                    z4 = z3;
                    r0 = 1;
                } else {
                    z4 = z3;
                    r0 = 1;
                }
                if (this.f67434[r0] == enumC7314) {
                }
                z3 = z4;
                z7 = z3;
            } else {
                z7 = z3;
            }
            i2 = 0;
            size = i;
        }
        boolean z8 = z;
        this.f76249 = arrayList;
        if (z8) {
            EnumC7313[] enumC7313Arr3 = this.f67434;
            enumC7313Arr3[0] = enumC7317;
            enumC7313Arr3[1] = enumC7316;
        }
        mo46593(c5196.m14371());
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C5196 m37530() {
        return this.f51117;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37528(C20719 c20719, int i) {
        if (i == 0) {
            int i2 = this.f51110 + 1;
            C18602[] c18602Arr = this.f51106;
            if (i2 >= c18602Arr.length) {
                this.f51106 = (C18602[]) Arrays.copyOf(c18602Arr, c18602Arr.length * 2);
            }
            C18602[] c18602Arr2 = this.f51106;
            int i3 = this.f51110;
            c18602Arr2[i3] = new C18602(c20719, 0, this.f51122);
            this.f51110 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f51118 + 1;
            C18602[] c18602Arr3 = this.f51121;
            if (i4 >= c18602Arr3.length) {
                this.f51121 = (C18602[]) Arrays.copyOf(c18602Arr3, c18602Arr3.length * 2);
            }
            C18602[] c18602Arr4 = this.f51121;
            int i5 = this.f51118;
            c18602Arr4[i5] = new C18602(c20719, 1, this.f51122);
            this.f51118 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37521(C20719 c20719, InterfaceC9431 interfaceC9431, C1668 c1668) {
        int i;
        int i2;
        if (interfaceC9431 == null) {
            return;
        }
        EnumC7313[] enumC7313Arr = c20719.f67434;
        int[] iArr = c20719.f67419;
        c1668.f6645 = enumC7313Arr[0];
        c1668.f6644 = enumC7313Arr[1];
        c1668.f6650 = c20719.m46640();
        c1668.f6647 = c20719.m46619();
        c1668.f6642 = false;
        c1668.f6648 = 0;
        EnumC7313 enumC7313 = c1668.f6645;
        EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
        boolean z = enumC7313 == enumC7314;
        boolean z2 = c1668.f6644 == enumC7314;
        boolean z3 = z && c20719.f67422 > 0.0f;
        boolean z4 = z2 && c20719.f67422 > 0.0f;
        if (z && c20719.m46601(0) && c20719.f67395 == 0 && !z3) {
            c1668.f6645 = EnumC7313.WRAP_CONTENT;
            if (z2 && c20719.f67375 == 0) {
                c1668.f6645 = EnumC7313.FIXED;
            }
            z = false;
        }
        if (z2 && c20719.m46601(1) && c20719.f67375 == 0 && !z4) {
            c1668.f6644 = EnumC7313.WRAP_CONTENT;
            if (z && c20719.f67395 == 0) {
                c1668.f6644 = EnumC7313.FIXED;
            }
            z2 = false;
        }
        if (c20719.mo30473()) {
            c1668.f6645 = EnumC7313.FIXED;
            z = false;
        }
        if (c20719.mo30469()) {
            c1668.f6644 = EnumC7313.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c1668.f6645 = EnumC7313.FIXED;
            } else if (!z2) {
                EnumC7313 enumC7315 = c1668.f6644;
                EnumC7313 enumC7316 = EnumC7313.FIXED;
                if (enumC7315 == enumC7316) {
                    i2 = c1668.f6647;
                } else {
                    c1668.f6645 = EnumC7313.WRAP_CONTENT;
                    interfaceC9431.mo8094(c20719, c1668);
                    i2 = c1668.f6651;
                }
                c1668.f6645 = enumC7316;
                int i3 = c20719.f67393;
                if (i3 == 0 || i3 == -1) {
                    c1668.f6650 = (int) (c20719.f67422 * i2);
                } else {
                    c1668.f6650 = (int) (c20719.f67422 / i2);
                }
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c1668.f6644 = EnumC7313.FIXED;
            } else if (!z) {
                EnumC7313 enumC7317 = c1668.f6645;
                EnumC7313 enumC7318 = EnumC7313.FIXED;
                if (enumC7317 == enumC7318) {
                    i = c1668.f6650;
                } else {
                    c1668.f6644 = EnumC7313.WRAP_CONTENT;
                    interfaceC9431.mo8094(c20719, c1668);
                    i = c1668.f6649;
                }
                c1668.f6644 = enumC7318;
                int i4 = c20719.f67393;
                if (i4 == 0 || i4 == -1) {
                    c1668.f6647 = (int) (i / c20719.f67422);
                } else {
                    c1668.f6647 = (int) (i * c20719.f67422);
                }
            }
        }
        interfaceC9431.mo8094(c20719, c1668);
        c20719.m46608(c1668.f6649);
        c20719.m46620(c1668.f6651);
        c20719.m46598(c1668.f6646);
        c20719.m46644(c1668.f6643);
        c1668.f6648 = 0;
    }
}
