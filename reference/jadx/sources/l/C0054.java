package l;

/* JADX INFO: renamed from: l.֡֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0054 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f914;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Object f915;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f916;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f917;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7512 f918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18172[] f919;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0054 f920;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16680 f921;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC11076 f922;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4848[] f923;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3356 f924;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f925;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f927;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23011 f928;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f929;

    public C0054(InterfaceC18172[] interfaceC18172Arr, long j, AbstractC11076 abstractC11076, InterfaceC13314 interfaceC13314, C16680 c16680, C7512 c7512, C23011 c23011) {
        this.f919 = interfaceC18172Arr;
        this.f929 = j;
        this.f922 = abstractC11076;
        this.f921 = c16680;
        C8402 c8402 = c7512.f24821;
        this.f915 = c8402.f27520;
        this.f918 = c7512;
        this.f924 = C3356.f10962;
        this.f928 = c23011;
        this.f923 = new InterfaceC4848[interfaceC18172Arr.length];
        this.f927 = new boolean[interfaceC18172Arr.length];
        long j2 = c7512.f24822;
        long j3 = c7512.f24826;
        boolean z = c7512.f24820;
        InterfaceC9147 interfaceC9147M39431 = c16680.m39431(c8402, interfaceC13314, j2);
        this.f925 = j3 != -9223372036854775807L ? new C13870(interfaceC9147M39431, !z, 0L, j3) : interfaceC9147M39431;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m957() {
        return this.f929;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m958(long j) {
        return j - this.f929;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m967(long j) {
        return j + this.f929;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m965(long j) {
        this.f929 = j;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m966() {
        return this.f918.f24822 + this.f929;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m960() {
        if (this.f914) {
            return !this.f926 || this.f925.mo6052() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m956() {
        if (this.f914) {
            return m960() || m949() - this.f918.f24822 >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m949() {
        if (!this.f914) {
            return this.f918.f24822;
        }
        long jMo6052 = this.f926 ? this.f925.mo6052() : Long.MIN_VALUE;
        return jMo6052 == Long.MIN_VALUE ? this.f918.f24819 : jMo6052;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m952(float f, AbstractC24755 abstractC24755, boolean z) {
        this.f914 = true;
        this.f924 = this.f925.mo6411();
        C23011 c23011M964 = m964(f, abstractC24755, z);
        C7512 c7512 = this.f918;
        long jMax = c7512.f24822;
        long j = c7512.f24819;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM950 = m950(c23011M964, jMax);
        long j2 = this.f929;
        C7512 c7513 = this.f918;
        this.f929 = (c7513.f24822 - jM950) + j2;
        this.f918 = c7513.m20570(jM950);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m950(C23011 c23011, long j) {
        return m951(c23011, j, false, new boolean[this.f919.length]);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l.ۡۙ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m951(C23011 c23011, long j, boolean z, boolean[] zArr) {
        InterfaceC18172[] interfaceC18172Arr;
        InterfaceC4848[] interfaceC4848Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c23011.f74676) {
                break;
            }
            if (z || !c23011.m51903(this.f928, i)) {
                z2 = false;
            }
            this.f927[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            interfaceC18172Arr = this.f919;
            int length = interfaceC18172Arr.length;
            interfaceC4848Arr = this.f923;
            if (i2 >= length) {
                break;
            }
            if (((AbstractC25280) interfaceC18172Arr[i2]).mo12952() == -2) {
                interfaceC4848Arr[i2] = null;
            }
            i2++;
        }
        m947();
        this.f928 = c23011;
        m946();
        long jMo6403 = this.f925.mo6403(c23011.f74677, this.f927, this.f923, zArr, j);
        for (int i3 = 0; i3 < interfaceC18172Arr.length; i3++) {
            if (((AbstractC25280) interfaceC18172Arr[i3]).mo12952() == -2 && this.f928.m51902(i3)) {
                interfaceC4848Arr[i3] = new C5306();
            }
        }
        this.f926 = false;
        for (int i4 = 0; i4 < interfaceC4848Arr.length; i4++) {
            if (interfaceC4848Arr[i4] != null) {
                C20782.m47568(c23011.m51902(i4));
                if (((AbstractC25280) interfaceC18172Arr[i4]).mo12952() != -2) {
                    this.f926 = true;
                }
            } else {
                C20782.m47568(c23011.f74677[i4] == null);
            }
        }
        return jMo6403;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ۡۙ᩷] */
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m948() {
        m947();
        ?? r0 = this.f925;
        try {
            boolean z = r0 instanceof C13870;
            C16680 c16680 = this.f921;
            if (z) {
                c16680.m39439(((C13870) r0).f43993);
            } else {
                c16680.m39439((InterfaceC9147) r0);
            }
        } catch (RuntimeException e) {
            C1896.m6516("Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m954(C0054 c0054) {
        if (c0054 == this.f920) {
            return;
        }
        m947();
        this.f920 = c0054;
        m946();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0054 m963() {
        return this.f920;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3356 m962() {
        return this.f924;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23011 m964(float f, AbstractC24755 abstractC24755, boolean z) {
        InterfaceC1470[] interfaceC1470Arr;
        C3356 c3356 = this.f924;
        C8402 c8402 = this.f918.f24821;
        AbstractC11076 abstractC11076 = this.f922;
        InterfaceC18172[] interfaceC18172Arr = this.f919;
        C23011 c23011Mo20380 = abstractC11076.mo20380(interfaceC18172Arr, c3356, c8402, abstractC24755);
        int i = 0;
        while (true) {
            int i2 = c23011Mo20380.f74676;
            interfaceC1470Arr = c23011Mo20380.f74677;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (c23011Mo20380.m51902(i)) {
                if (interfaceC1470Arr[i] == null && ((AbstractC25280) interfaceC18172Arr[i]).mo12952() != -2) {
                    z2 = false;
                }
                C20782.m47568(z2);
            } else {
                C20782.m47568(interfaceC1470Arr[i] == null);
            }
            i++;
        }
        for (InterfaceC1470 interfaceC1470 : interfaceC1470Arr) {
            if (interfaceC1470 != null) {
                interfaceC1470.mo5249(f);
                interfaceC1470.mo5251(z);
            }
        }
        return c23011Mo20380;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23011 m961() {
        return this.f928;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m959() {
        Object obj = this.f925;
        if (obj instanceof C13870) {
            long j = this.f918.f24826;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C13870) obj).m33811(j);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m946() {
        if (this.f920 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C23011 c23011 = this.f928;
            if (i >= c23011.f74676) {
                return;
            }
            boolean zM51902 = c23011.m51902(i);
            InterfaceC1470 interfaceC1470 = this.f928.f74677[i];
            if (zM51902 && interfaceC1470 != null) {
                interfaceC1470.mo5258();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m947() {
        if (this.f920 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C23011 c23011 = this.f928;
            if (i >= c23011.f74676) {
                return;
            }
            boolean zM51902 = c23011.m51902(i);
            InterfaceC1470 interfaceC1470 = this.f928.f74677[i];
            if (zM51902 && interfaceC1470 != null) {
                interfaceC1470.mo5261();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m953(long j) {
        C20782.m47568(this.f920 == null);
        if (this.f914) {
            this.f925.mo6054(j - this.f929);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.ۤۤ᩷] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m955(C20191 c20191) {
        C20782.m47568(this.f920 == null);
        this.f925.mo6051(c20191);
    }
}
