package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: KARX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17727 extends AbstractC14822 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f56259;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f56260;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC1415 f56261;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23724[] f56262;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f56263;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21255 f56264;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56265;

    @Override // l.AbstractC14822
    /* JADX INFO: renamed from: ۙ */
    public final void mo5172() {
        C21255 c21255 = this.f56264;
        c21255.f69223 = -1;
        c21255.f69221 = 0;
        c21255.f69222 = -1;
        c21255.f69224 = null;
        this.f56263 = -1;
        this.f56265 = 1;
        this.f56260 = 0;
        this.f56259 = 0;
    }

    public C17727(AbstractC1415 abstractC1415, C16233 c16233, C23724[] c23724Arr, C2555 c2555) {
        super(c16233, c2555);
        this.f56263 = -1;
        this.f56265 = 1;
        this.f56260 = 0;
        this.f56259 = 0;
        C21255 c21255 = new C21255();
        c21255.f69223 = -1;
        c21255.f69221 = 0;
        c21255.f69222 = -1;
        this.f56264 = c21255;
        this.f56262 = c23724Arr;
        this.f56261 = abstractC1415;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41268(InterfaceC1623 interfaceC1623, int i) {
        this.f56259 = i;
        int iMo11328 = interfaceC1623.mo11328();
        try {
            this.f56263 = interfaceC1623.index();
            C21255 c21255 = this.f56264;
            c21255.f69223 = -1;
            c21255.f69221 = 0;
            c21255.f69222 = -1;
            c21255.f69224 = null;
            C23724 c23724 = this.f56262[i];
            if (c23724.f76772 == null) {
                return m41275(interfaceC1623);
            }
            return m41269(interfaceC1623, c23724.f76772);
        } finally {
            interfaceC1623.mo11331(iMo11328);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m41275(InterfaceC1623 interfaceC1623) {
        AbstractC2120 abstractC2120 = (AbstractC2120) this.f48446.f52367.get(this.f56259);
        C3615 c3615 = C3615.f13295;
        C23373 c23373 = new C23373();
        int i = 0;
        while (i < abstractC2120.f7778.size()) {
            int i2 = i + 1;
            m41273(interfaceC1623, new C14906(abstractC2120.m6671(i).f55272, i2, c3615), c23373, false, false, false);
            i = i2;
        }
        boolean z = c23373.f56080;
        c23373.f56080 = false;
        C9613 c9613M41270 = m41270(c23373);
        if (!z) {
            this.f56262[this.f56259].f76772 = c9613M41270;
        }
        return m41269(interfaceC1623, c9613M41270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41269(InterfaceC1623 interfaceC1623, C9613 c9613) throws Throwable {
        C9613 c9613M41270;
        C20466 c20466;
        boolean z = c9613.f32384;
        C21255 c21255 = this.f56264;
        if (z) {
            c21255.f69223 = interfaceC1623.index();
            c21255.f69221 = this.f56265;
            c21255.f69222 = this.f56260;
            c21255.f69224 = c9613;
        }
        C9613 c9614 = c9613;
        int iMo11332 = interfaceC1623.mo11332(1);
        C17727 c17727 = this;
        InterfaceC1623 interfaceC1624 = interfaceC1623;
        while (true) {
            C9613[] c9613Arr = c9614.f32386;
            C9613 c9615 = (c9613Arr == null || iMo11332 < 0 || iMo11332 > 127) ? null : c9613Arr[iMo11332];
            C9613 c9616 = AbstractC14822.f48445;
            if (c9615 == null) {
                C23373 c23373 = new C23373();
                int i = 0;
                for (C20466 c20467 : c9614.f32382.f56084) {
                    int i2 = c20467.f66405;
                    AbstractC2120 abstractC2120 = c20467.f66406;
                    boolean z2 = i2 == i;
                    if (!z2 || !((C14906) c20467).m35655()) {
                        int size = abstractC2120.f7778.size();
                        int i3 = 0;
                        while (i3 < size) {
                            AbstractC17373 abstractC17373M6671 = abstractC2120.m6671(i3);
                            InterfaceC1623 interfaceC1625 = interfaceC1624;
                            AbstractC2120 abstractC2121 = abstractC17373M6671.mo12147(iMo11332, 1114111) ? abstractC17373M6671.f55272 : null;
                            if (abstractC2121 != null) {
                                C14906 c14906 = (C14906) c20467;
                                C7850 c7850M35653 = c14906.m35653();
                                if (c7850M35653 != null) {
                                    c7850M35653 = c7850M35653.m20745(interfaceC1623.index() - c17727.f56263);
                                }
                                c20466 = c20467;
                                if (m41273(interfaceC1623, new C14906(c14906, abstractC2121, c7850M35653), c23373, z2, true, iMo11332 == -1)) {
                                    i = c20466.f66405;
                                    interfaceC1624 = interfaceC1623;
                                    c17727 = this;
                                    break;
                                }
                                c17727 = this;
                                interfaceC1624 = interfaceC1623;
                            } else {
                                c20466 = c20467;
                                interfaceC1624 = interfaceC1625;
                            }
                            i3++;
                            c20467 = c20466;
                            size = size;
                            abstractC2120 = abstractC2120;
                        }
                    }
                }
                if (c23373.f56084.isEmpty()) {
                    if (!c23373.f56080) {
                        m41267(c9614, iMo11332, c9616);
                    }
                    c9613M41270 = c9616;
                } else {
                    boolean z3 = c23373.f56080;
                    c23373.f56080 = false;
                    c9613M41270 = c17727.m41270(c23373);
                    if (!z3) {
                        m41267(c9614, iMo11332, c9613M41270);
                    }
                }
                c9614 = c9613M41270;
            } else {
                c9614 = c9615;
            }
            if (c9614 == c9616) {
                break;
            }
            if (iMo11332 != -1) {
                m41272(interfaceC1623);
            }
            if (c9614.f32384) {
                c21255.f69223 = interfaceC1624.index();
                c21255.f69221 = c17727.f56265;
                c21255.f69222 = c17727.f56260;
                c21255.f69224 = c9614;
                if (iMo11332 == -1) {
                    break;
                }
            }
            iMo11332 = interfaceC1624.mo11332(1);
        }
        C9613 c9617 = c21255.f69224;
        AbstractC1415 abstractC1415 = c17727.f56261;
        if (c9617 != null) {
            C7850 c7850 = c9617.f32381;
            int i4 = c17727.f56263;
            int i5 = c21255.f69223;
            int i6 = c21255.f69221;
            int i7 = c21255.f69222;
            interfaceC1624.mo11329(i5);
            c17727.f56265 = i6;
            c17727.f56260 = i7;
            if (c7850 != null) {
                c7850.m20746(abstractC1415, interfaceC1624, i4);
            }
            return c21255.f69224.f32387;
        }
        if (iMo11332 == -1 && interfaceC1624.index() == c17727.f56263) {
            return -1;
        }
        throw new C13411(abstractC1415, interfaceC1624, c17727.f56263);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[PHI: r2
      0x015b: PHI (r2v2 l.۠᩹᩵) = (r2v1 l.۠᩹᩵), (r2v1 l.۠᩹᩵), (r2v1 l.۠᩹᩵), (r2v5 l.۠᩹᩵) binds: [B:42:0x00ac, B:63:0x013e, B:65:0x0148, B:57:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final boolean m41273(InterfaceC1623 interfaceC1623, C14906 c14906, C23373 c23373, boolean z, boolean z2, boolean z3) {
        C8472 c8472;
        C14906 c14907;
        boolean zMo23677;
        C14906 c14908;
        C8472 c8473;
        C23373 c23374 = c23373;
        AbstractC2120 abstractC2120 = c14906.f66406;
        boolean z4 = abstractC2120 instanceof C6789;
        C8472 c8474 = null;
        C16233 c16233 = this.f48446;
        boolean z5 = true;
        if (!z4) {
            if (!abstractC2120.f7777 && (!z || !c14906.m35655())) {
                c23374.m41115(c14906, null);
            }
            boolean zM41273 = z;
            int i = 0;
            while (i < abstractC2120.f7778.size()) {
                AbstractC17373 abstractC17373M6671 = abstractC2120.m6671(i);
                int iMo12146 = abstractC17373M6671.mo12146();
                if (iMo12146 == 10) {
                    throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
                }
                switch (iMo12146) {
                    case 1:
                        c8473 = c8474;
                        c14908 = new C14906(c14906, abstractC17373M6671.f55272);
                        c8472 = c8473;
                        c14907 = c14908;
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && abstractC17373M6671.mo12147(-1, 1114111)) {
                            c8473 = c8474;
                            c14908 = new C14906(c14906, abstractC17373M6671.f55272);
                            c8472 = c8473;
                            c14907 = c14908;
                        } else {
                            c8474 = c8474;
                            C8472 c8475 = c8474;
                            c8472 = c8475;
                            c14907 = c8475;
                        }
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                    case 3:
                        c8472 = c8474;
                        c14907 = new C14906(c14906, abstractC17373M6671.f55272, C7495.m19996(c14906.f66408, ((C23018) abstractC17373M6671).f74809.f7775));
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                    case 4:
                        C13846 c13846 = (C13846) abstractC17373M6671;
                        c23374.f56080 = z5;
                        int i2 = c13846.f45678;
                        int i3 = c13846.f45677;
                        AbstractC1415 abstractC1415 = this.f56261;
                        if (!z2) {
                            zMo23677 = abstractC1415.mo23677(c8474, i2, i3);
                        } else {
                            int i4 = this.f56260;
                            int i5 = this.f56265;
                            int iIndex = interfaceC1623.index();
                            int iMo11328 = interfaceC1623.mo11328();
                            try {
                                m41272(interfaceC1623);
                                zMo23677 = abstractC1415.mo23677(null, i2, i3);
                                this.f56260 = i4;
                                this.f56265 = i5;
                                interfaceC1623.mo11329(iIndex);
                                interfaceC1623.mo11331(iMo11328);
                                c8474 = null;
                            } catch (Throwable th) {
                                this.f56260 = i4;
                                this.f56265 = i5;
                                interfaceC1623.mo11329(iIndex);
                                interfaceC1623.mo11331(iMo11328);
                                throw th;
                            }
                        }
                        if (zMo23677) {
                            c8474 = c8474;
                            c8473 = c8474;
                            c14908 = new C14906(c14906, abstractC17373M6671.f55272);
                            c8472 = c8473;
                            c14907 = c14908;
                        } else {
                            c8474 = c8474;
                            C8472 c8476 = c8474;
                            c8472 = c8476;
                            c14907 = c8476;
                        }
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                    case 6:
                        AbstractC11729 abstractC11729 = c14906.f66408;
                        if (abstractC11729 == null || abstractC11729.m29312()) {
                            c14908 = new C14906(c14906, abstractC17373M6671.f55272, C7850.m20744(c14906.m35653(), c16233.f52368[((C4321) abstractC17373M6671).f15511]));
                            c8473 = c8474;
                        } else {
                            c8473 = c8474;
                            c14908 = new C14906(c14906, abstractC17373M6671.f55272);
                        }
                        c8472 = c8473;
                        c14907 = c14908;
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                    default:
                        c8474 = c8474;
                        C8472 c8477 = c8474;
                        c8472 = c8477;
                        c14907 = c8477;
                        if (c14907 != 0) {
                            zM41273 = m41273(interfaceC1623, c14907, c23373, zM41273, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c8474 = c8472;
                        c23374 = c23373;
                        break;
                }
            }
            return zM41273;
        }
        AbstractC11729 abstractC117210 = c14906.f66408;
        if (abstractC117210 == null || abstractC117210.m29312()) {
            AbstractC11729 abstractC117211 = c14906.f66408;
            if (abstractC117211 == null || abstractC117211.mo10719()) {
                c23374.m41115(c14906, null);
                return true;
            }
            c23374.m41115(new C14906(c14906, abstractC2120, C3615.f13295), null);
        } else {
            z5 = z;
        }
        AbstractC11729 abstractC117212 = c14906.f66408;
        if (abstractC117212 == null || abstractC117212.mo10719()) {
            return z5;
        }
        boolean zM41274 = z5;
        for (int i6 = 0; i6 < c14906.f66408.mo10717(); i6++) {
            if (c14906.f66408.mo10718(i6) != Integer.MAX_VALUE) {
                zM41274 = m41273(interfaceC1623, new C14906(c14906, (AbstractC2120) c16233.f52365.get(c14906.f66408.mo10718(i6)), c14906.f66408.mo10716(i6)), c23373, zM41274, z2, z3);
            }
        }
        return zM41274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41267(C9613 c9613, int i, C9613 c9614) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c9613) {
            if (c9613.f32386 == null) {
                c9613.f32386 = new C9613[128];
            }
            c9613.f32386[i] = c9614;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9613 m41270(C23373 c23373) {
        C20466 c20466;
        C9613 c9613 = new C9613(c23373);
        Iterator it = c23373.f56084.iterator();
        do {
            if (!it.hasNext()) {
                c20466 = null;
                break;
            }
            c20466 = (C20466) it.next();
        } while (!(c20466.f66406 instanceof C6789));
        if (c20466 != null) {
            c9613.f32384 = true;
            c9613.f32381 = ((C14906) c20466).m35653();
            c9613.f32387 = this.f48446.f52369[c20466.f66406.f7773];
        }
        C23724 c23724 = this.f56262[this.f56259];
        synchronized (c23724.f76774) {
            C9613 c9614 = (C9613) c23724.f76774.get(c9613);
            if (c9614 != null) {
                return c9614;
            }
            c9613.f32385 = c23724.f76774.size();
            c23373.m41116();
            c9613.f32382 = c23373;
            c23724.f76774.put(c9613, c9613);
            return c9613;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m41277(InterfaceC1623 interfaceC1623) {
        return interfaceC1623.mo5499(C22043.m48958(this.f56263, interfaceC1623.index() - 1));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m41274() {
        return this.f56265;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41278(int i) {
        this.f56265 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41276() {
        return this.f56260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41271(int i) {
        this.f56260 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41272(InterfaceC1623 interfaceC1623) {
        if (interfaceC1623.mo11332(1) == 10) {
            this.f56265++;
            this.f56260 = 0;
        } else {
            this.f56260++;
        }
        interfaceC1623.mo11333();
    }
}
