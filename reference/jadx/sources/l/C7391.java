package l;

/* JADX INFO: renamed from: l.ۜ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7391 implements InterfaceC13335 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f24363 = C16980.m40037(C7391.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24364;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19457 f24365;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9627 f24366;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18666 f24367;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f24368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14936 f24369;

    public C7391(C12523 c12523, C19457 c19457) throws Exception {
        C1337 c1337 = c12523.f40200;
        boolean z = c1337.m4920() == 2;
        this.f24368 = z;
        if (c1337.m4922().getHost().isEmpty()) {
            this.f24369 = new C14936(c19457.m44979(), c19457.m44975(), Integer.MIN_VALUE);
            this.f24367 = new C18666(c19457.m44979());
        } else if (z) {
            this.f24369 = new C14936(c19457.m44979(), c1337.m4922().getHost(), -1);
            this.f24367 = new C18666(c19457.m44979());
        } else {
            throw new C20728("The requested list operations is invalid: " + c1337.m4922());
        }
        c19457.m44972();
        this.f24365 = c19457;
        try {
            c19457.m44971(this.f24369, this.f24367, new EnumC13269[0]);
            m20306();
            InterfaceC9627 interfaceC9627M20305 = m20305();
            if (interfaceC9627M20305 == null) {
                c19457.m44983();
                this.f24366 = null;
            }
            this.f24366 = interfaceC9627M20305;
        } catch (Exception e) {
            this.f24365.m44983();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m20306() throws C20728 {
        int iM5375 = this.f24367.m5375();
        if (iM5375 == 2184) {
            throw new C5287();
        }
        if (iM5375 != 0 && iM5375 != 234) {
            throw new C20728(iM5375, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC9627 m20305() throws C20728 {
        C18666 c18666 = this.f24367;
        if (this.f24364 < (c18666.m5375() == 234 ? c18666.m5376() - 1 : c18666.m5376())) {
            InterfaceC9627[] interfaceC9627ArrM5377 = c18666.m5377();
            int i = this.f24364;
            InterfaceC9627 interfaceC9627 = interfaceC9627ArrM5377[i];
            this.f24364 = i + 1;
            interfaceC9627.getClass();
            return interfaceC9627;
        }
        if (!this.f24368 || c18666.m5375() != 234) {
            return null;
        }
        String strM43421 = c18666.m43421();
        C14936 c14936 = this.f24369;
        c14936.m35917(0, strM43421);
        c18666.reset();
        c14936.m26885((byte) -41);
        this.f24365.m44971(c14936, c18666, new EnumC13269[0]);
        m20306();
        this.f24364 = 0;
        return m20305();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24366 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC9627 interfaceC9627 = this.f24366;
        try {
            InterfaceC9627 interfaceC9627M20305 = m20305();
            if (interfaceC9627M20305 != null) {
                this.f24366 = interfaceC9627M20305;
                return interfaceC9627;
            }
            this.f24365.m44983();
            this.f24366 = null;
            return interfaceC9627;
        } catch (C20048 e) {
            f24363.mo13702("Enumeration failed", (Throwable) e);
            this.f24366 = null;
            return interfaceC9627;
        }
    }

    @Override // l.InterfaceC13335, java.lang.AutoCloseable
    public final void close() {
        if (this.f24366 != null) {
            this.f24365.m44983();
            this.f24366 = null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
