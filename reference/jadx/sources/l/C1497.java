package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91JR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1497 extends C10600 {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public int f5213;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public int f5225;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public C12838 f5209 = new C12838(this);

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public C11346 f5222 = new C11346(this);

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC15075 f5210 = null;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f5216 = false;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C17158 f5218 = new C17158();

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f5220 = 0;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public int f5217 = 0;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C14920[] f5219 = new C14920[4];

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C14920[] f5223 = new C14920[4];

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f5207 = 257;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f5224 = false;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public boolean f5212 = false;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f5221 = null;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f5215 = null;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f5208 = null;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f5211 = null;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C19551 f5214 = new C19551();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5332(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f5213 = i6;
        this.f5225 = i7;
        this.f5209.m31885(this, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m5344() {
        this.f5209.m31884(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5335(InterfaceC15075 interfaceC15075) {
        this.f5210 = interfaceC15075;
        this.f5222.m28650(interfaceC15075);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15075 m5337() {
        return this.f5210;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m5342() {
        this.f5218.getClass();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m5350(int i) {
        this.f5207 = i;
        C17158.f55932 = m5338(512);
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final int m5331() {
        return this.f5207;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m5338(int i) {
        return (this.f5207 & i) == i;
    }

    @Override // l.C10600, l.C10445
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void mo5339() {
        this.f5218.m40327();
        this.f5213 = 0;
        this.f5225 = 0;
        super.mo5339();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5346() {
        return this.f5224;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5351() {
        return this.f5212;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5340(C0751 c0751) {
        WeakReference weakReference = this.f5221;
        if (weakReference == null || weakReference.get() == null || c0751.m3114() > ((C0751) this.f5221.get()).m3114()) {
            this.f5221 = new WeakReference(c0751);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5347(C0751 c0751) {
        WeakReference weakReference = this.f5208;
        if (weakReference == null || weakReference.get() == null || c0751.m3114() > ((C0751) this.f5208.get()).m3114()) {
            this.f5208 = new WeakReference(c0751);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5333(C0751 c0751) {
        WeakReference weakReference = this.f5211;
        if (weakReference == null || weakReference.get() == null || c0751.m3114() > ((C0751) this.f5211.get()).m3114()) {
            this.f5211 = new WeakReference(c0751);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5348(C17158 c17158) {
        boolean zM5338 = m5338(64);
        mo9736(c17158, zM5338);
        int size = this.f33652.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C10445 c10445 = (C10445) this.f33652.get(i);
            c10445.m26810(0, false);
            c10445.m26810(1, false);
            if (c10445 instanceof C24618) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C10445 c10446 = (C10445) this.f33652.get(i2);
                if (c10446 instanceof C24618) {
                    ((C24618) c10446).m54951();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C10445 c10447 = (C10445) this.f33652.get(i3);
            c10447.getClass();
            if ((c10447 instanceof C21789) || (c10447 instanceof C7463)) {
                c10447.mo9736(c17158, zM5338);
            }
        }
        if (C17158.f55932) {
            HashSet<C10445> hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C10445 c10448 = (C10445) this.f33652.get(i4);
                c10448.getClass();
                if (!(c10448 instanceof C21789) && !(c10448 instanceof C7463)) {
                    hashSet.add(c10448);
                }
            }
            m26814(this, c17158, hashSet, this.f33210[0] == EnumC19396.WRAP_CONTENT ? 0 : 1, false);
            for (C10445 c10449 : hashSet) {
                C4635.m14459(this, c17158, c10449);
                c10449.mo9736(c17158, zM5338);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C10445 c104410 = (C10445) this.f33652.get(i5);
                if (c104410 instanceof C1497) {
                    EnumC19396[] enumC19396Arr = c104410.f33210;
                    EnumC19396 enumC19396 = enumC19396Arr[0];
                    EnumC19396 enumC19397 = enumC19396Arr[1];
                    EnumC19396 enumC19398 = EnumC19396.WRAP_CONTENT;
                    if (enumC19396 == enumC19398) {
                        c104410.m26820(EnumC19396.FIXED);
                    }
                    if (enumC19397 == enumC19398) {
                        c104410.m26862(EnumC19396.FIXED);
                    }
                    c104410.mo9736(c17158, zM5338);
                    if (enumC19396 == enumC19398) {
                        c104410.m26820(enumC19396);
                    }
                    if (enumC19397 == enumC19398) {
                        c104410.m26862(enumC19397);
                    }
                } else {
                    C4635.m14459(this, c17158, c104410);
                    if (!(c104410 instanceof C21789) && !(c104410 instanceof C7463)) {
                        c104410.mo9736(c17158, zM5338);
                    }
                }
            }
        }
        if (this.f5220 > 0) {
            C4480.m14184(this, c17158, null, 0);
        }
        if (this.f5217 > 0) {
            C4480.m14184(this, c17158, null, 1);
        }
    }

    @Override // l.C10445
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5336(boolean z, boolean z2) {
        super.mo5336(z, z2);
        int size = this.f33652.size();
        for (int i = 0; i < size; i++) {
            ((C10445) this.f33652.get(i)).mo5336(z, z2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5349(boolean z) {
        this.f5216 = z;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5345() {
        return this.f5216;
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
    @Override // l.C10600
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void mo5343() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int iMax;
        int iMax2;
        EnumC19396 enumC19396;
        EnumC19396 enumC19397;
        boolean z4;
        ?? r0;
        EnumC19396 enumC19398;
        int i2 = 0;
        this.f33234 = 0;
        this.f33189 = 0;
        this.f5224 = false;
        this.f5212 = false;
        int size = this.f33652.size();
        int iMax3 = Math.max(0, m26806());
        int iMax4 = Math.max(0, m26823());
        EnumC19396[] enumC19396Arr = this.f33210;
        EnumC19396 enumC19399 = enumC19396Arr[1];
        EnumC19396 enumC193910 = enumC19396Arr[0];
        if (C4635.m14460(this.f5207, 1)) {
            C15821.m37744(this, this.f5210);
            for (int i3 = 0; i3 < size; i3++) {
                C10445 c10445 = (C10445) this.f33652.get(i3);
                if (c10445.m26801() && !(c10445 instanceof C7463) && !(c10445 instanceof C24618) && !(c10445 instanceof C21789) && !c10445.m26828()) {
                    EnumC19396 enumC19396M26857 = c10445.m26857(0);
                    EnumC19396 enumC19396M26858 = c10445.m26857(1);
                    EnumC19396 enumC193911 = EnumC19396.MATCH_CONSTRAINT;
                    if (enumC19396M26857 != enumC193911 || c10445.f33206 == 1 || enumC19396M26858 != enumC193911 || c10445.f33209 == 1) {
                        m5330(c10445, this.f5210, new C19551());
                    }
                }
            }
        }
        if (size <= 2 || !((enumC193910 == (enumC19398 = EnumC19396.WRAP_CONTENT) || enumC19399 == enumC19398) && C4635.m14460(this.f5207, 1024) && C23281.m52399(this, this.f5210))) {
            z = false;
        } else {
            if (enumC193910 == enumC19398) {
                if (iMax3 < m26806() && iMax3 > 0) {
                    m26805(iMax3);
                    this.f5224 = true;
                } else {
                    iMax3 = m26806();
                }
            }
            if (enumC19399 == enumC19398) {
                if (iMax4 < m26823() && iMax4 > 0) {
                    m26824(iMax4);
                    this.f5212 = true;
                } else {
                    iMax4 = m26823();
                }
            }
            z = true;
        }
        boolean z5 = m5338(64) || m5338(128);
        C17158 c17158 = this.f5218;
        c17158.getClass();
        c17158.f55946 = false;
        if (this.f5207 != 0 && z5) {
            c17158.f55946 = true;
        }
        ArrayList arrayList = this.f33652;
        EnumC19396[] enumC19396Arr2 = this.f33210;
        EnumC19396 enumC193912 = enumC19396Arr2[0];
        EnumC19396 enumC193913 = EnumC19396.WRAP_CONTENT;
        boolean z6 = enumC193912 == enumC193913 || enumC19396Arr2[1] == enumC193913;
        this.f5220 = 0;
        this.f5217 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C10445 c10446 = (C10445) this.f33652.get(i4);
            if (c10446 instanceof C10600) {
                ((C10600) c10446).mo5343();
            }
        }
        boolean zM5338 = m5338(64);
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            i5++;
            try {
                c17158.m40327();
                this.f5220 = i2;
                this.f5217 = i2;
                m26817(c17158);
                for (int i6 = 0; i6 < size; i6++) {
                    ((C10445) this.f33652.get(i6)).m26817(c17158);
                }
                m5348(c17158);
                try {
                    WeakReference weakReference = this.f5221;
                    if (weakReference != null && weakReference.get() != null) {
                        c17158.m40329(c17158.m40319((C0751) this.f5221.get()), c17158.m40319(this.f33197), i2, 5);
                        this.f5221 = null;
                    }
                    WeakReference weakReference2 = this.f5208;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        c17158.m40329(c17158.m40319(this.f33216), c17158.m40319((C0751) this.f5208.get()), i2, 5);
                        this.f5208 = null;
                    }
                    WeakReference weakReference3 = this.f5215;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        c17158.m40329(c17158.m40319((C0751) this.f5215.get()), c17158.m40319(this.f33212), i2, 5);
                        this.f5215 = null;
                    }
                    WeakReference weakReference4 = this.f5211;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        c17158.m40329(c17158.m40319(this.f33248), c17158.m40319((C0751) this.f5211.get()), i2, 5);
                        this.f5211 = null;
                    }
                    c17158.m40330();
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
            boolean[] zArr = C4635.f16415;
            if (z2) {
                zArr[2] = false;
                boolean zM5339 = m5338(64);
                mo20505(c17158, zM5339);
                int i7 = 0;
                for (int size2 = this.f33652.size(); i7 < size2; size2 = size2) {
                    ((C10445) this.f33652.get(i7)).mo20505(c17158, zM5339);
                    i7++;
                }
            } else {
                mo20505(c17158, zM5338);
                for (int i8 = 0; i8 < size; i8++) {
                    ((C10445) this.f33652.get(i8)).mo20505(c17158, zM5338);
                }
            }
            if (z6 && i5 < 8 && zArr[2]) {
                int i9 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i9 < size) {
                    C10445 c10447 = (C10445) this.f33652.get(i9);
                    iMax5 = Math.max(iMax5, c10447.m26806() + c10447.f33234);
                    iMax6 = Math.max(iMax6, c10447.m26823() + c10447.f33189);
                    i9++;
                    size = size;
                }
                i = size;
                int iMax7 = Math.max(this.f33193, iMax5);
                int iMax8 = Math.max(this.f33203, iMax6);
                EnumC19396 enumC193914 = EnumC19396.WRAP_CONTENT;
                if (enumC193910 != enumC193914 || m26806() >= iMax7) {
                    z3 = false;
                } else {
                    m26805(iMax7);
                    this.f33210[0] = enumC193914;
                    z3 = true;
                    z = true;
                }
                if (enumC19399 == enumC193914 && m26823() < iMax8) {
                    m26824(iMax8);
                    this.f33210[1] = enumC193914;
                    z3 = true;
                    z = true;
                }
                iMax = Math.max(this.f33193, m26806());
                if (iMax > m26806()) {
                    m26805(iMax);
                    this.f33210[0] = EnumC19396.FIXED;
                    z3 = true;
                    z = true;
                }
                iMax2 = Math.max(this.f33203, m26823());
                if (iMax2 > m26823()) {
                    m26824(iMax2);
                    this.f33210[1] = EnumC19396.FIXED;
                    z3 = true;
                    z = true;
                }
                if (z) {
                    z7 = z3;
                } else {
                    enumC19396 = this.f33210[0];
                    enumC19397 = EnumC19396.WRAP_CONTENT;
                    if (enumC19396 == enumC19397 || iMax3 <= 0 || m26806() <= iMax3) {
                        z4 = z3;
                        r0 = 1;
                    } else {
                        r0 = 1;
                        this.f5224 = true;
                        this.f33210[0] = EnumC19396.FIXED;
                        m26805(iMax3);
                        z4 = true;
                        z = true;
                    }
                    if (this.f33210[r0] == enumC19397 || iMax4 <= 0 || m26823() <= iMax4) {
                        z3 = z4;
                        z7 = z3;
                    } else {
                        this.f5212 = r0;
                        this.f33210[r0] = EnumC19396.FIXED;
                        m26824(iMax4);
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
            iMax = Math.max(this.f33193, m26806());
            if (iMax > m26806()) {
                m26805(iMax);
                this.f33210[0] = EnumC19396.FIXED;
                z3 = true;
                z = true;
            }
            iMax2 = Math.max(this.f33203, m26823());
            if (iMax2 > m26823()) {
                m26824(iMax2);
                this.f33210[1] = EnumC19396.FIXED;
                z3 = true;
                z = true;
            }
            if (z) {
                enumC19396 = this.f33210[0];
                enumC19397 = EnumC19396.WRAP_CONTENT;
                if (enumC19396 == enumC19397) {
                    z4 = z3;
                    r0 = 1;
                } else {
                    z4 = z3;
                    r0 = 1;
                }
                if (this.f33210[r0] == enumC19397) {
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
        this.f33652 = arrayList;
        if (z8) {
            EnumC19396[] enumC19396Arr3 = this.f33210;
            enumC19396Arr3[0] = enumC193910;
            enumC19396Arr3[1] = enumC19399;
        }
        mo26816(c17158.m40325());
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C17158 m5341() {
        return this.f5218;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5334(C10445 c10445, int i) {
        if (i == 0) {
            int i2 = this.f5220 + 1;
            C14920[] c14920Arr = this.f5223;
            if (i2 >= c14920Arr.length) {
                this.f5223 = (C14920[]) Arrays.copyOf(c14920Arr, c14920Arr.length * 2);
            }
            C14920[] c14920Arr2 = this.f5223;
            int i3 = this.f5220;
            c14920Arr2[i3] = new C14920(c10445, 0, this.f5216);
            this.f5220 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f5217 + 1;
            C14920[] c14920Arr3 = this.f5219;
            if (i4 >= c14920Arr3.length) {
                this.f5219 = (C14920[]) Arrays.copyOf(c14920Arr3, c14920Arr3.length * 2);
            }
            C14920[] c14920Arr4 = this.f5219;
            int i5 = this.f5217;
            c14920Arr4[i5] = new C14920(c10445, 1, this.f5216);
            this.f5217 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5330(C10445 c10445, InterfaceC15075 interfaceC15075, C19551 c19551) {
        int i;
        int i2;
        if (interfaceC15075 == null) {
            return;
        }
        EnumC19396[] enumC19396Arr = c10445.f33210;
        int[] iArr = c10445.f33228;
        c19551.f63050 = enumC19396Arr[0];
        c19551.f63049 = enumC19396Arr[1];
        c19551.f63057 = c10445.m26806();
        c19551.f63053 = c10445.m26823();
        c19551.f63054 = false;
        c19551.f63052 = 0;
        EnumC19396 enumC19396 = c19551.f63050;
        EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
        boolean z = enumC19396 == enumC19397;
        boolean z2 = c19551.f63049 == enumC19397;
        boolean z3 = z && c10445.f33239 > 0.0f;
        boolean z4 = z2 && c10445.f33239 > 0.0f;
        if (z && c10445.m26852(0) && c10445.f33206 == 0 && !z3) {
            c19551.f63050 = EnumC19396.WRAP_CONTENT;
            if (z2 && c10445.f33209 == 0) {
                c19551.f63050 = EnumC19396.FIXED;
            }
            z = false;
        }
        if (z2 && c10445.m26852(1) && c10445.f33209 == 0 && !z4) {
            c19551.f63049 = EnumC19396.WRAP_CONTENT;
            if (z && c10445.f33206 == 0) {
                c19551.f63049 = EnumC19396.FIXED;
            }
            z2 = false;
        }
        if (c10445.mo20499()) {
            c19551.f63050 = EnumC19396.FIXED;
            z = false;
        }
        if (c10445.mo20493()) {
            c19551.f63049 = EnumC19396.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c19551.f63050 = EnumC19396.FIXED;
            } else if (!z2) {
                EnumC19396 enumC19398 = c19551.f63049;
                EnumC19396 enumC19399 = EnumC19396.FIXED;
                if (enumC19398 == enumC19399) {
                    i2 = c19551.f63053;
                } else {
                    c19551.f63050 = EnumC19396.WRAP_CONTENT;
                    interfaceC15075.mo36336(c10445, c19551);
                    i2 = c19551.f63055;
                }
                c19551.f63050 = enumC19399;
                int i3 = c10445.f33218;
                if (i3 == 0 || i3 == -1) {
                    c19551.f63057 = (int) (c10445.f33239 * i2);
                } else {
                    c19551.f63057 = (int) (c10445.f33239 / i2);
                }
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c19551.f63049 = EnumC19396.FIXED;
            } else if (!z) {
                EnumC19396 enumC193910 = c19551.f63050;
                EnumC19396 enumC193911 = EnumC19396.FIXED;
                if (enumC193910 == enumC193911) {
                    i = c19551.f63057;
                } else {
                    c19551.f63049 = EnumC19396.WRAP_CONTENT;
                    interfaceC15075.mo36336(c10445, c19551);
                    i = c19551.f63051;
                }
                c19551.f63049 = enumC193911;
                int i4 = c10445.f33218;
                if (i4 == 0 || i4 == -1) {
                    c19551.f63053 = (int) (i / c10445.f33239);
                } else {
                    c19551.f63053 = (int) (i * c10445.f33239);
                }
            }
        }
        interfaceC15075.mo36336(c10445, c19551);
        c10445.m26805(c19551.f63051);
        c10445.m26824(c19551.f63055);
        c10445.m26821(c19551.f63056);
        c10445.m26842(c19551.f63058);
        c19551.f63052 = 0;
    }
}
