package l;

/* JADX INFO: renamed from: l.ۘۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3834 implements InterfaceC9190 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f14207 = C13488.m32997(C3834.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3396 f14208;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17987 f14209;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22180 f14210;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14211;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f14212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1985 f14213;

    public C3834(C17241 c17241, C17987 c17987) throws Exception {
        C2464 c2464 = c17241.f54929;
        boolean z = c2464.m7566() == 2;
        this.f14212 = z;
        if (c2464.m7563().getHost().isEmpty()) {
            this.f14213 = new C1985(c17987.m41882(), c17987.m41874(), Integer.MIN_VALUE);
            this.f14208 = new C3396(c17987.m41882());
        } else if (z) {
            this.f14213 = new C1985(c17987.m41882(), c2464.m7563().getHost(), -1);
            this.f14208 = new C3396(c17987.m41882());
        } else {
            throw new C12303("The requested list operations is invalid: " + c2464.m7563());
        }
        c17987.m41869();
        this.f14209 = c17987;
        try {
            c17987.m41868(this.f14213, this.f14208, new EnumC19358[0]);
            m11127();
            InterfaceC22180 interfaceC22180M11126 = m11126();
            if (interfaceC22180M11126 == null) {
                c17987.m41879();
                this.f14210 = null;
            }
            this.f14210 = interfaceC22180M11126;
        } catch (Exception e) {
            this.f14209.m41879();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m11127() throws C12303 {
        int iM15238 = this.f14208.m15238();
        if (iM15238 == 2184) {
            throw new C19399();
        }
        if (iM15238 != 0 && iM15238 != 234) {
            throw new C12303(iM15238, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC22180 m11126() throws C12303 {
        C3396 c3396 = this.f14208;
        if (this.f14211 < (c3396.m15238() == 234 ? c3396.m15237() - 1 : c3396.m15237())) {
            InterfaceC22180[] interfaceC22180ArrM15240 = c3396.m15240();
            int i = this.f14211;
            InterfaceC22180 interfaceC22180 = interfaceC22180ArrM15240[i];
            this.f14211 = i + 1;
            interfaceC22180.getClass();
            return interfaceC22180;
        }
        if (!this.f14212 || c3396.m15238() != 234) {
            return null;
        }
        String strM10068 = c3396.m10068();
        C1985 c1985 = this.f14213;
        c1985.m6400(0, strM10068);
        c3396.reset();
        c1985.m8263((byte) -41);
        this.f14209.m41868(c1985, c3396, new EnumC19358[0]);
        m11127();
        this.f14211 = 0;
        return m11126();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14210 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC22180 interfaceC22180 = this.f14210;
        try {
            InterfaceC22180 interfaceC22180M11126 = m11126();
            if (interfaceC22180M11126 != null) {
                this.f14210 = interfaceC22180M11126;
                return interfaceC22180;
            }
            this.f14209.m41879();
            this.f14210 = null;
            return interfaceC22180;
        } catch (C8484 e) {
            f14207.mo12122("Enumeration failed", (Throwable) e);
            this.f14210 = null;
            return interfaceC22180;
        }
    }

    @Override // l.InterfaceC9190, java.lang.AutoCloseable
    public final void close() {
        if (this.f14210 != null) {
            this.f14209.m41879();
            this.f14210 = null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
