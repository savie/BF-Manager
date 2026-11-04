package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: KARX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1308 extends AbstractC16969 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14709 f4705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10256 f4706;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4707;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4708;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4709;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25351[] f4710;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4711;

    @Override // l.AbstractC16969
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4767() {
        C10256 c10256 = this.f4706;
        c10256.f32752 = -1;
        c10256.f32754 = 0;
        c10256.f32751 = -1;
        c10256.f32753 = null;
        this.f4707 = -1;
        this.f4709 = 1;
        this.f4711 = 0;
        this.f4708 = 0;
    }

    public C1308(AbstractC14709 abstractC14709, C11002 c11002, C25351[] c25351Arr, C6485 c6485) {
        super(c11002, c6485);
        this.f4707 = -1;
        this.f4709 = 1;
        this.f4711 = 0;
        this.f4708 = 0;
        C10256 c10256 = new C10256();
        c10256.f32752 = -1;
        c10256.f32754 = 0;
        c10256.f32751 = -1;
        this.f4706 = c10256;
        this.f4710 = c25351Arr;
        this.f4705 = abstractC14709;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4764(InterfaceC17693 interfaceC17693, int i) {
        this.f4708 = i;
        int iMo11529 = interfaceC17693.mo11529();
        try {
            this.f4707 = interfaceC17693.index();
            C10256 c10256 = this.f4706;
            c10256.f32752 = -1;
            c10256.f32754 = 0;
            c10256.f32751 = -1;
            c10256.f32753 = null;
            C25351 c25351 = this.f4710[i];
            if (c25351.f81862 == null) {
                return m4772(interfaceC17693);
            }
            return m4765(interfaceC17693, c25351.f81862);
        } finally {
            interfaceC17693.mo11533(iMo11529);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4772(InterfaceC17693 interfaceC17693) {
        AbstractC17715 abstractC17715 = (AbstractC17715) this.f55481.f34754.get(this.f4708);
        C18461 c18461 = C18461.f60086;
        C25131 c25131 = new C25131();
        int i = 0;
        while (i < abstractC17715.f58208.size()) {
            int i2 = i + 1;
            m4770(interfaceC17693, new C19207(abstractC17715.m41478(i).f20405, i2, c18461), c25131, false, false, false);
            i = i2;
        }
        boolean z = c25131.f19857;
        c25131.f19857 = false;
        C16399 c16399M4766 = m4766(c25131);
        if (!z) {
            this.f4710[this.f4708].f81862 = c16399M4766;
        }
        return m4765(interfaceC17693, c16399M4766);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4765(InterfaceC17693 interfaceC17693, C16399 c16399) throws Throwable {
        C16399 c16399M4766;
        C22937 c22937;
        boolean z = c16399.f53212;
        C10256 c10256 = this.f4706;
        if (z) {
            c10256.f32752 = interfaceC17693.index();
            c10256.f32754 = this.f4709;
            c10256.f32751 = this.f4711;
            c10256.f32753 = c16399;
        }
        C16399 c163910 = c16399;
        int iMo11537 = interfaceC17693.mo11537(1);
        C1308 c1308 = this;
        InterfaceC17693 interfaceC17694 = interfaceC17693;
        while (true) {
            C16399[] c16399Arr = c163910.f53216;
            C16399 c163911 = (c16399Arr == null || iMo11537 < 0 || iMo11537 > 127) ? null : c16399Arr[iMo11537];
            C16399 c163912 = AbstractC16969.f55480;
            if (c163911 == null) {
                C25131 c25131 = new C25131();
                int i = 0;
                for (C22937 c22938 : c163910.f53210.f19856) {
                    int i2 = c22938.f74512;
                    AbstractC17715 abstractC17715 = c22938.f74514;
                    boolean z2 = i2 == i;
                    if (!z2 || !((C19207) c22938).m44522()) {
                        int size = abstractC17715.f58208.size();
                        int i3 = 0;
                        while (i3 < size) {
                            AbstractC5959 abstractC5959M41478 = abstractC17715.m41478(i3);
                            InterfaceC17693 interfaceC17695 = interfaceC17694;
                            AbstractC17715 abstractC17716 = abstractC5959M41478.mo2569(iMo11537, 1114111) ? abstractC5959M41478.f20405 : null;
                            if (abstractC17716 != null) {
                                C19207 c19207 = (C19207) c22938;
                                C2799 c2799M44520 = c19207.m44520();
                                if (c2799M44520 != null) {
                                    c2799M44520 = c2799M44520.m9261(interfaceC17693.index() - c1308.f4707);
                                }
                                c22937 = c22938;
                                if (m4770(interfaceC17693, new C19207(c19207, abstractC17716, c2799M44520), c25131, z2, true, iMo11537 == -1)) {
                                    i = c22937.f74512;
                                    interfaceC17694 = interfaceC17693;
                                    c1308 = this;
                                    break;
                                }
                                c1308 = this;
                                interfaceC17694 = interfaceC17693;
                            } else {
                                c22937 = c22938;
                                interfaceC17694 = interfaceC17695;
                            }
                            i3++;
                            c22938 = c22937;
                            size = size;
                            abstractC17715 = abstractC17715;
                        }
                    }
                }
                if (c25131.f19856.isEmpty()) {
                    if (!c25131.f19857) {
                        m4763(c163910, iMo11537, c163912);
                    }
                    c16399M4766 = c163912;
                } else {
                    boolean z3 = c25131.f19857;
                    c25131.f19857 = false;
                    c16399M4766 = c1308.m4766(c25131);
                    if (!z3) {
                        m4763(c163910, iMo11537, c16399M4766);
                    }
                }
                c163910 = c16399M4766;
            } else {
                c163910 = c163911;
            }
            if (c163910 == c163912) {
                break;
            }
            if (iMo11537 != -1) {
                m4769(interfaceC17693);
            }
            if (c163910.f53212) {
                c10256.f32752 = interfaceC17694.index();
                c10256.f32754 = c1308.f4709;
                c10256.f32751 = c1308.f4711;
                c10256.f32753 = c163910;
                if (iMo11537 == -1) {
                    break;
                }
            }
            iMo11537 = interfaceC17694.mo11537(1);
        }
        C16399 c163913 = c10256.f32753;
        AbstractC14709 abstractC14709 = c1308.f4705;
        if (c163913 != null) {
            C2799 c2799 = c163913.f53217;
            int i4 = c1308.f4707;
            int i5 = c10256.f32752;
            int i6 = c10256.f32754;
            int i7 = c10256.f32751;
            interfaceC17694.mo11530(i5);
            c1308.f4709 = i6;
            c1308.f4711 = i7;
            if (c2799 != null) {
                c2799.m9262(abstractC14709, interfaceC17694, i4);
            }
            return c10256.f32753.f53214;
        }
        if (iMo11537 == -1 && interfaceC17694.index() == c1308.f4707) {
            return -1;
        }
        throw new C21423(abstractC14709, interfaceC17694, c1308.f4707);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[PHI: r2
      0x015b: PHI (r2v2 l.ۖܺۨ) = (r2v1 l.ۖܺۨ), (r2v1 l.ۖܺۨ), (r2v1 l.ۖܺۨ), (r2v5 l.ۖܺۨ) binds: [B:42:0x00ac, B:63:0x013e, B:65:0x0148, B:57:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4770(InterfaceC17693 interfaceC17693, C19207 c19207, C25131 c25131, boolean z, boolean z2, boolean z3) {
        C2777 c2777;
        C19207 c19208;
        boolean zMo6650;
        C19207 c19209;
        C2777 c2778;
        C25131 c25132 = c25131;
        AbstractC17715 abstractC17715 = c19207.f74514;
        boolean z4 = abstractC17715 instanceof C0518;
        C2777 c2779 = null;
        C11002 c11002 = this.f55481;
        boolean z5 = true;
        if (!z4) {
            if (!abstractC17715.f58210 && (!z || !c19207.m44522())) {
                c25132.m16885(c19207, null);
            }
            boolean zM4770 = z;
            int i = 0;
            while (i < abstractC17715.f58208.size()) {
                AbstractC5959 abstractC5959M41478 = abstractC17715.m41478(i);
                int iMo2568 = abstractC5959M41478.mo2568();
                if (iMo2568 == 10) {
                    throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
                }
                switch (iMo2568) {
                    case 1:
                        c2778 = c2779;
                        c19209 = new C19207(c19207, abstractC5959M41478.f20405);
                        c2777 = c2778;
                        c19208 = c19209;
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && abstractC5959M41478.mo2569(-1, 1114111)) {
                            c2778 = c2779;
                            c19209 = new C19207(c19207, abstractC5959M41478.f20405);
                            c2777 = c2778;
                            c19208 = c19209;
                        } else {
                            c2779 = c2779;
                            C2777 c27710 = c2779;
                            c2777 = c27710;
                            c19208 = c27710;
                        }
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                    case 3:
                        c2777 = c2779;
                        c19208 = new C19207(c19207, abstractC5959M41478.f20405, C5213.m15677(c19207.f74515, ((C7976) abstractC5959M41478).f26510.f58209));
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                    case 4:
                        C20655 c20655 = (C20655) abstractC5959M41478;
                        c25132.f19857 = z5;
                        int i2 = c20655.f66240;
                        int i3 = c20655.f66241;
                        AbstractC14709 abstractC14709 = this.f4705;
                        if (!z2) {
                            zMo6650 = abstractC14709.mo6650(c2779, i2, i3);
                        } else {
                            int i4 = this.f4711;
                            int i5 = this.f4709;
                            int iIndex = interfaceC17693.index();
                            int iMo11529 = interfaceC17693.mo11529();
                            try {
                                m4769(interfaceC17693);
                                zMo6650 = abstractC14709.mo6650(null, i2, i3);
                                this.f4711 = i4;
                                this.f4709 = i5;
                                interfaceC17693.mo11530(iIndex);
                                interfaceC17693.mo11533(iMo11529);
                                c2779 = null;
                            } catch (Throwable th) {
                                this.f4711 = i4;
                                this.f4709 = i5;
                                interfaceC17693.mo11530(iIndex);
                                interfaceC17693.mo11533(iMo11529);
                                throw th;
                            }
                        }
                        if (zMo6650) {
                            c2779 = c2779;
                            c2778 = c2779;
                            c19209 = new C19207(c19207, abstractC5959M41478.f20405);
                            c2777 = c2778;
                            c19208 = c19209;
                        } else {
                            c2779 = c2779;
                            C2777 c27711 = c2779;
                            c2777 = c27711;
                            c19208 = c27711;
                        }
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                    case 6:
                        AbstractC12450 abstractC12450 = c19207.f74515;
                        if (abstractC12450 == null || abstractC12450.m30921()) {
                            c19209 = new C19207(c19207, abstractC5959M41478.f20405, C2799.m9260(c19207.m44520(), c11002.f34751[((C3545) abstractC5959M41478).f12160]));
                            c2778 = c2779;
                        } else {
                            c2778 = c2779;
                            c19209 = new C19207(c19207, abstractC5959M41478.f20405);
                        }
                        c2777 = c2778;
                        c19208 = c19209;
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                    default:
                        c2779 = c2779;
                        C2777 c27712 = c2779;
                        c2777 = c27712;
                        c19208 = c27712;
                        if (c19208 != 0) {
                            zM4770 = m4770(interfaceC17693, c19208, c25131, zM4770, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c2779 = c2777;
                        c25132 = c25131;
                        break;
                }
            }
            return zM4770;
        }
        AbstractC12450 abstractC12451 = c19207.f74515;
        if (abstractC12451 == null || abstractC12451.m30921()) {
            AbstractC12450 abstractC12452 = c19207.f74515;
            if (abstractC12452 == null || abstractC12452.mo30922()) {
                c25132.m16885(c19207, null);
                return true;
            }
            c25132.m16885(new C19207(c19207, abstractC17715, C18461.f60086), null);
        } else {
            z5 = z;
        }
        AbstractC12450 abstractC12453 = c19207.f74515;
        if (abstractC12453 == null || abstractC12453.mo30922()) {
            return z5;
        }
        boolean zM4771 = z5;
        for (int i6 = 0; i6 < c19207.f74515.mo15679(); i6++) {
            if (c19207.f74515.mo15680(i6) != Integer.MAX_VALUE) {
                zM4771 = m4770(interfaceC17693, new C19207(c19207, (AbstractC17715) c11002.f34748.get(c19207.f74515.mo15680(i6)), c19207.f74515.mo15678(i6)), c25131, zM4771, z2, z3);
            }
        }
        return zM4771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4763(C16399 c16399, int i, C16399 c163910) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c16399) {
            if (c16399.f53216 == null) {
                c16399.f53216 = new C16399[128];
            }
            c16399.f53216[i] = c163910;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 m4766(C25131 c25131) {
        C22937 c22937;
        C16399 c16399 = new C16399(c25131);
        Iterator it = c25131.f19856.iterator();
        do {
            if (!it.hasNext()) {
                c22937 = null;
                break;
            }
            c22937 = (C22937) it.next();
        } while (!(c22937.f74514 instanceof C0518));
        if (c22937 != null) {
            c16399.f53212 = true;
            c16399.f53217 = ((C19207) c22937).m44520();
            c16399.f53214 = this.f55481.f34750[c22937.f74514.f58211];
        }
        C25351 c25351 = this.f4710[this.f4708];
        synchronized (c25351.f81860) {
            C16399 c163910 = (C16399) c25351.f81860.get(c16399);
            if (c163910 != null) {
                return c163910;
            }
            c16399.f53211 = c25351.f81860.size();
            c25131.m16886();
            c16399.f53210 = c25131;
            c25351.f81860.put(c16399, c16399);
            return c16399;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m4774(InterfaceC17693 interfaceC17693) {
        return interfaceC17693.mo19728(C4467.m14163(this.f4707, interfaceC17693.index() - 1));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4771() {
        return this.f4709;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4775(int i) {
        this.f4709 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4773() {
        return this.f4711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4768(int i) {
        this.f4711 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4769(InterfaceC17693 interfaceC17693) {
        if (interfaceC17693.mo11537(1) == 10) {
            this.f4709++;
            this.f4711 = 0;
        } else {
            this.f4711++;
        }
        interfaceC17693.mo11538();
    }
}
