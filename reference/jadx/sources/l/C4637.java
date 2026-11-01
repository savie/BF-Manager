package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۙ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6RP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4637 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16072 f16383;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f16384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9100 f16385;

    public C4637(C16072 c16072, C16072 c16073) {
        this.f16383 = c16072;
        this.f16385 = new C9100(c16072, c16073);
    }

    public C4637(C16072 c16072, C16072 c16073, int i) {
        this.f16383 = c16072;
        this.f16385 = C9100.m23442(c16072, c16073);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20990 m12802(C20990 c20990) {
        if (this.f16384) {
            throw new IllegalStateException("Recovery graph copy is closed");
        }
        C6276 c6276 = c20990.f68349;
        if (c6276.m40840().f48220 != this.f16383) {
            throw new IllegalArgumentException("Snapshot belongs to another recovery generation");
        }
        try {
            C14744 c14744M23445 = this.f16385.m23445(c6276.m40840());
            C21695 c21695M12801 = m12801(c20990.f68350);
            C6276 c6277 = new C6276(c14744M23445, c6276.m17352());
            try {
                return new C20990(c6277, c20990.f68351, c21695M12801, c20990.f68352, c20990.f68348);
            } catch (Error | RuntimeException e) {
                c6277.close();
                throw e;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12803(Runnable runnable) {
        this.f16385.m23448(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21695 m12801(C21695 c21695) {
        if (c21695 == null) {
            return null;
        }
        C9100 c9100 = this.f16385;
        C21695 c21696 = (C21695) c9100.m23444(c21695);
        if (c21696 != null) {
            return c21696;
        }
        c9100.m23446();
        C6899 c6899 = c21695.f70379;
        C21695 c21697 = new C21695(new C6899(new C15346(m12800(c6899.f23225.f49958, true)), new C15346(m12800(c6899.f23227.f49958, true)), c6899.f23228, c6899.f23226), c21695.f70377, c21695.f70376, c21695.f70375, c21695.f70378);
        c9100.m23447(c21695, c21697);
        return c21697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6878 m12800(C6878 c6878, boolean z) {
        Object c1463;
        C6878 c6879;
        if (c6878 == null) {
            return null;
        }
        C9100 c9100 = this.f16385;
        C6878 c68710 = (C6878) c9100.m23444(c6878);
        if (c68710 != null) {
            return c68710;
        }
        c9100.m23446();
        Object obj = c6878.f23174;
        if (obj == null) {
            c6879 = new C6878(m12800(c6878.f23173, z), m12800(c6878.f23175, z));
        } else {
            if (!z) {
                C1463 c1464 = (C1463) obj;
                c1463 = (C1463) c9100.m23444(c1464);
                if (c1463 == null) {
                    c9100.m23446();
                    c1463 = new C1463(c1464.f5964, c1464.f5963, c1464.f5965, c1464.f5959, c9100.m23445(c1464.f5966), c9100.m23445(c1464.f5961));
                    c9100.m23447(c1464, c1463);
                }
            } else {
                C23128 c23128 = (C23128) obj;
                c1463 = (C23128) c9100.m23444(c23128);
                if (c1463 == null) {
                    c9100.m23446();
                    c1463 = new C23128(c23128.f75116, c23128.f75117, c23128.f75115, new C15346(m12800(c23128.f75113.f49958, false)));
                    c9100.m23447(c23128, c1463);
                }
            }
            c6879 = new C6878(c1463);
        }
        c9100.m23447(c6878, c6879);
        return c6879;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f16384) {
            return;
        }
        this.f16384 = true;
        this.f16385.close();
    }
}
