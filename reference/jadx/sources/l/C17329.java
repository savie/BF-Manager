package l;

/* JADX INFO: renamed from: l.ܿۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBGV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17329 extends C18947 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919[] f55136;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f55137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean[] f55138;

    public C17329(int i) {
        super(i != 0);
        this.f55136 = new InterfaceC4919[i];
        this.f55138 = new boolean[i];
        this.f55137 = 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17329 m40299() {
        InterfaceC4919[] interfaceC4919Arr = this.f55136;
        C17329 c17329 = new C17329(interfaceC4919Arr.length);
        System.arraycopy(interfaceC4919Arr, 0, c17329.f55136, 0, interfaceC4919Arr.length);
        boolean[] zArr = c17329.f55138;
        boolean[] zArr2 = this.f55138;
        System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
        c17329.f55137 = this.f55137;
        return c17329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40296(C21293 c21293) {
        int i = this.f55137 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder sbM30914 = C12441.m30914("stack[", i2 == i ? "top0" : C22475.m49982(i - i2), "]: ");
            InterfaceC4919 interfaceC4919 = this.f55136[i2];
            sbM30914.append(interfaceC4919 == null ? "<invalid>" : interfaceC4919.toString());
            c21293.m20021(sbM30914.toString());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40300(C3320 c3320) {
        if (this.f55137 == 0) {
            return;
        }
        m43641();
        C3320 c3320M9837 = c3320.m9837();
        for (int i = 0; i < this.f55137; i++) {
            InterfaceC4919[] interfaceC4919Arr = this.f55136;
            if (interfaceC4919Arr[i] == c3320) {
                interfaceC4919Arr[i] = c3320M9837;
            }
        }
    }

    public final int size() {
        return this.f55137;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m40298() {
        m43641();
        for (int i = 0; i < this.f55137; i++) {
            this.f55136[i] = null;
            this.f55138[i] = false;
        }
        this.f55137 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40295(InterfaceC4919 interfaceC4919) {
        m43641();
        try {
            InterfaceC4919 interfaceC4919Mo9835 = interfaceC4919.mo9835();
            int iM9830 = interfaceC4919Mo9835.getType().m9830();
            int i = this.f55137;
            int i2 = i + iM9830;
            InterfaceC4919[] interfaceC4919Arr = this.f55136;
            if (i2 > interfaceC4919Arr.length) {
                m40291("overflow");
                throw null;
            }
            if (iM9830 == 2) {
                interfaceC4919Arr[i] = null;
                this.f55137 = i + 1;
            }
            int i3 = this.f55137;
            interfaceC4919Arr[i3] = interfaceC4919Mo9835;
            this.f55137 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40302() {
        m43641();
        this.f55138[this.f55137] = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 m40293(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f55137;
        if (i >= i2) {
            m40291("underflow");
            throw null;
        }
        return this.f55136[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40301(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f55137;
        if (i >= i2) {
            throw new C21293("stack: underflow", null);
        }
        return this.f55138[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3320 m40292(int i) {
        return m40293(i).getType();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 m40297() {
        m43641();
        InterfaceC4919 interfaceC4919M40293 = m40293(0);
        int i = this.f55137;
        int i2 = i - 1;
        this.f55136[i2] = null;
        this.f55138[i2] = false;
        this.f55137 = i - interfaceC4919M40293.getType().m9830();
        return interfaceC4919M40293;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40294(int i, InterfaceC4919 interfaceC4919) {
        m43641();
        try {
            InterfaceC4919 interfaceC4919Mo9835 = interfaceC4919.mo9835();
            int i2 = (this.f55137 - i) - 1;
            InterfaceC4919[] interfaceC4919Arr = this.f55136;
            InterfaceC4919 interfaceC49110 = interfaceC4919Arr[i2];
            if (interfaceC49110 == null || interfaceC49110.getType().m9830() != interfaceC4919Mo9835.getType().m9830()) {
                StringBuilder sb = new StringBuilder("incompatible substitution: ");
                sb.append(interfaceC49110 == null ? "<invalid>" : interfaceC49110.toString());
                sb.append(" -> ");
                sb.append(interfaceC4919Mo9835 != null ? interfaceC4919Mo9835.toString() : "<invalid>");
                m40291(sb.toString());
                throw null;
            }
            interfaceC4919Arr[i2] = interfaceC4919Mo9835;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40291(String str) {
        throw new C21293(C0252.m1693("stack: ", str), null);
    }
}
