package l;

/* JADX INFO: renamed from: l.ۢ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBGV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10348 extends C20222 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32963;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239[] f32964;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean[] f32965;

    public C10348(int i) {
        super(i != 0);
        this.f32964 = new InterfaceC22239[i];
        this.f32965 = new boolean[i];
        this.f32963 = 0;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10348 m26618() {
        InterfaceC22239[] interfaceC22239Arr = this.f32964;
        C10348 c10348 = new C10348(interfaceC22239Arr.length);
        System.arraycopy(interfaceC22239Arr, 0, c10348.f32964, 0, interfaceC22239Arr.length);
        boolean[] zArr = c10348.f32965;
        boolean[] zArr2 = this.f32965;
        System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
        c10348.f32963 = this.f32963;
        return c10348;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26616(C16074 c16074) {
        int i = this.f32963 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder sbM51387 = C22783.m51387("stack[", i2 == i ? "top0" : C5306.m15934(i - i2), "]: ");
            InterfaceC22239 interfaceC22239 = this.f32964[i2];
            sbM51387.append(interfaceC22239 == null ? "<invalid>" : interfaceC22239.toString());
            c16074.m12508(sbM51387.toString());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26620(C5085 c5085) {
        if (this.f32963 == 0) {
            return;
        }
        m46490();
        C5085 c5085M15370 = c5085.m15370();
        for (int i = 0; i < this.f32963; i++) {
            InterfaceC22239[] interfaceC22239Arr = this.f32964;
            if (interfaceC22239Arr[i] == c5085) {
                interfaceC22239Arr[i] = c5085M15370;
            }
        }
    }

    public final int size() {
        return this.f32963;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m26619() {
        m46490();
        for (int i = 0; i < this.f32963; i++) {
            this.f32964[i] = null;
            this.f32965[i] = false;
        }
        this.f32963 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26617(InterfaceC22239 interfaceC22239) {
        m46490();
        try {
            InterfaceC22239 interfaceC22239Mo8407 = interfaceC22239.mo8407();
            int iM15371 = interfaceC22239Mo8407.getType().m15371();
            int i = this.f32963;
            int i2 = i + iM15371;
            InterfaceC22239[] interfaceC22239Arr = this.f32964;
            if (i2 > interfaceC22239Arr.length) {
                m26612("overflow");
                throw null;
            }
            if (iM15371 == 2) {
                interfaceC22239Arr[i] = null;
                this.f32963 = i + 1;
            }
            int i3 = this.f32963;
            interfaceC22239Arr[i3] = interfaceC22239Mo8407;
            this.f32963 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m26613() {
        m46490();
        this.f32965[this.f32963] = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 m26614(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f32963;
        if (i >= i2) {
            m26612("underflow");
            throw null;
        }
        return this.f32964[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26621(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        int i2 = this.f32963;
        if (i >= i2) {
            throw new C16074("stack: underflow", null);
        }
        return this.f32965[(i2 - i) - 1];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5085 m26622(int i) {
        return m26614(i).getType();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 m26623() {
        m46490();
        InterfaceC22239 interfaceC22239M26614 = m26614(0);
        int i = this.f32963;
        int i2 = i - 1;
        this.f32964[i2] = null;
        this.f32965[i2] = false;
        this.f32963 = i - interfaceC22239M26614.getType().m15371();
        return interfaceC22239M26614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26615(int i, InterfaceC22239 interfaceC22239) {
        m46490();
        try {
            InterfaceC22239 interfaceC22239Mo8407 = interfaceC22239.mo8407();
            int i2 = (this.f32963 - i) - 1;
            InterfaceC22239[] interfaceC22239Arr = this.f32964;
            InterfaceC22239 interfaceC222310 = interfaceC22239Arr[i2];
            if (interfaceC222310 == null || interfaceC222310.getType().m15371() != interfaceC22239Mo8407.getType().m15371()) {
                StringBuilder sb = new StringBuilder("incompatible substitution: ");
                sb.append(interfaceC222310 == null ? "<invalid>" : interfaceC222310.toString());
                sb.append(" -> ");
                sb.append(interfaceC22239Mo8407 != null ? interfaceC22239Mo8407.toString() : "<invalid>");
                m26612(sb.toString());
                throw null;
            }
            interfaceC22239Arr[i2] = interfaceC22239Mo8407;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26612(String str) {
        throw new C16074(C25272.m56409("stack: ", str), null);
    }
}
