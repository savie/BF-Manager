package l;

/* JADX INFO: renamed from: l.ۚ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5345 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5345 f18457;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f18458;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f18459;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18460;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f18461;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2667[] f18462;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Object f18463;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22279 f18464;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f18465;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f18466;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18739[] f18467;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC8676 f18468;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10087 f18469;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23679 f18470;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12402 f18471;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f18472;

    public C5345(InterfaceC2667[] interfaceC2667Arr, long j, AbstractC8676 abstractC8676, InterfaceC15732 interfaceC15732, C12402 c12402, C22279 c22279, C10087 c10087) {
        this.f18462 = interfaceC2667Arr;
        this.f18472 = j;
        this.f18468 = abstractC8676;
        this.f18471 = c12402;
        C15274 c15274 = c22279.f72815;
        this.f18463 = c15274.f49778;
        this.f18464 = c22279;
        this.f18470 = C23679.f76611;
        this.f18469 = c10087;
        this.f18467 = new InterfaceC18739[interfaceC2667Arr.length];
        this.f18458 = new boolean[interfaceC2667Arr.length];
        long j2 = c22279.f72814;
        long j3 = c22279.f72817;
        boolean z = c22279.f72816;
        InterfaceC6806 interfaceC6806M30846 = c12402.m30846(c15274, interfaceC15732, j2);
        this.f18461 = j3 != -9223372036854775807L ? new C17826(interfaceC6806M30846, !z, 0L, j3) : interfaceC6806M30846;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m14833(long j) {
        return j + this.f18472;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m14844() {
        return this.f18472;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m14845(long j) {
        return j - this.f18472;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14849(long j) {
        this.f18472 = j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m14832() {
        return this.f18464.f72814 + this.f18472;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m14831() {
        if (this.f18459) {
            return !this.f18466 || this.f18461.mo1391() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m14846() {
        if (this.f18459) {
            return m14831() || m14835() - this.f18464.f72814 >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14835() {
        if (!this.f18459) {
            return this.f18464.f72814;
        }
        long jMo1391 = this.f18466 ? this.f18461.mo1391() : Long.MIN_VALUE;
        return jMo1391 == Long.MIN_VALUE ? this.f18464.f72812 : jMo1391;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14838(float f, AbstractC16511 abstractC16511, boolean z) {
        this.f18459 = true;
        this.f18470 = this.f18461.mo7675();
        C10087 c10087M14848 = m14848(f, abstractC16511, z);
        C22279 c22279 = this.f18464;
        long jMax = c22279.f72814;
        long j = c22279.f72812;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM14836 = m14836(c10087M14848, jMax);
        long j2 = this.f18472;
        C22279 c222710 = this.f18464;
        this.f18472 = (c222710.f72814 - jM14836) + j2;
        this.f18464 = c222710.m49453(jM14836);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14836(C10087 c10087, long j) {
        return m14837(c10087, j, false, new boolean[this.f18462.length]);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14837(C10087 c10087, long j, boolean z, boolean[] zArr) {
        InterfaceC2667[] interfaceC2667Arr;
        InterfaceC18739[] interfaceC18739Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c10087.f34444) {
                break;
            }
            if (z || !c10087.m25497(this.f18469, i)) {
                z2 = false;
            }
            this.f18458[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            interfaceC2667Arr = this.f18462;
            int length = interfaceC2667Arr.length;
            interfaceC18739Arr = this.f18467;
            if (i2 >= length) {
                break;
            }
            if (((AbstractC16862) interfaceC2667Arr[i2]).mo13272() == -2) {
                interfaceC18739Arr[i2] = null;
            }
            i2++;
        }
        m14830();
        this.f18469 = c10087;
        m14829();
        long jMo7682 = this.f18461.mo7682(c10087.f34440, this.f18458, this.f18467, zArr, j);
        for (int i3 = 0; i3 < interfaceC2667Arr.length; i3++) {
            if (((AbstractC16862) interfaceC2667Arr[i3]).mo13272() == -2 && this.f18469.m25496(i3)) {
                interfaceC18739Arr[i3] = new C6730();
            }
        }
        this.f18466 = false;
        for (int i4 = 0; i4 < interfaceC18739Arr.length; i4++) {
            if (interfaceC18739Arr[i4] != null) {
                C2023.m6510(c10087.m25496(i4));
                if (((AbstractC16862) interfaceC2667Arr[i4]).mo13272() != -2) {
                    this.f18466 = true;
                }
            } else {
                C2023.m6510(c10087.f34440[i4] == null);
            }
        }
        return jMo7682;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14834() {
        m14830();
        ?? r0 = this.f18461;
        try {
            boolean z = r0 instanceof C17826;
            C12402 c12402 = this.f18471;
            if (z) {
                c12402.m30853(((C17826) r0).f56459);
            } else {
                c12402.m30853((InterfaceC6806) r0);
            }
        } catch (RuntimeException e) {
            C0303.m1854("Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14840(C5345 c5345) {
        if (c5345 == this.f18457) {
            return;
        }
        m14830();
        this.f18457 = c5345;
        m14829();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5345 m14847() {
        return this.f18457;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23679 m14842() {
        return this.f18470;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10087 m14848(float f, AbstractC16511 abstractC16511, boolean z) {
        InterfaceC6558[] interfaceC6558Arr;
        C23679 c23679 = this.f18470;
        C15274 c15274 = this.f18464.f72815;
        AbstractC8676 abstractC8676 = this.f18468;
        InterfaceC2667[] interfaceC2667Arr = this.f18462;
        C10087 c10087Mo22491 = abstractC8676.mo22491(interfaceC2667Arr, c23679, c15274, abstractC16511);
        int i = 0;
        while (true) {
            int i2 = c10087Mo22491.f34444;
            interfaceC6558Arr = c10087Mo22491.f34440;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (c10087Mo22491.m25496(i)) {
                if (interfaceC6558Arr[i] == null && ((AbstractC16862) interfaceC2667Arr[i]).mo13272() != -2) {
                    z2 = false;
                }
                C2023.m6510(z2);
            } else {
                C2023.m6510(interfaceC6558Arr[i] == null);
            }
            i++;
        }
        for (InterfaceC6558 interfaceC6558 : interfaceC6558Arr) {
            if (interfaceC6558 != null) {
                interfaceC6558.mo17788(f);
                interfaceC6558.mo17790(z);
            }
        }
        return c10087Mo22491;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10087 m14850() {
        return this.f18469;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14843() {
        Object obj = this.f18461;
        if (obj instanceof C17826) {
            long j = this.f18464.f72817;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C17826) obj).m41401(j);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m14829() {
        if (this.f18457 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C10087 c10087 = this.f18469;
            if (i >= c10087.f34444) {
                return;
            }
            boolean zM25496 = c10087.m25496(i);
            InterfaceC6558 interfaceC6558 = this.f18469.f34440[i];
            if (zM25496 && interfaceC6558 != null) {
                interfaceC6558.mo17798();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m14830() {
        if (this.f18457 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C10087 c10087 = this.f18469;
            if (i >= c10087.f34444) {
                return;
            }
            boolean zM25496 = c10087.m25496(i);
            InterfaceC6558 interfaceC6558 = this.f18469.f34440[i];
            if (zM25496 && interfaceC6558 != null) {
                interfaceC6558.mo17784();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14839(long j) {
        C2023.m6510(this.f18457 == null);
        if (this.f18459) {
            this.f18461.mo1393(j - this.f18472);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14841(C14643 c14643) {
        C2023.m6510(this.f18457 == null);
        this.f18461.mo1390(c14643);
    }
}
