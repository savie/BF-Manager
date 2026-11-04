package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ܳᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C6RP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15530 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10046 f50530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21476 f50531;

    public C15530(C10046 c10046, C10046 c10047) {
        this.f50530 = c10046;
        this.f50531 = new C21476(c10046, c10047);
    }

    public C15530(C10046 c10046, C10046 c10047, int i) {
        this.f50530 = c10046;
        this.f50531 = C21476.m48853(c10046, c10047);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7745 m37189(C7745 c7745) {
        if (this.f50529) {
            throw new IllegalStateException("Recovery graph copy is closed");
        }
        C7305 c7305 = c7745.f25502;
        if (c7305.m23622().f69247 != this.f50530) {
            throw new IllegalArgumentException("Snapshot belongs to another recovery generation");
        }
        try {
            C21697 c21697M48856 = this.f50531.m48856(c7305.m23622());
            C12219 c12219M37187 = m37187(c7745.f25503);
            C7305 c7306 = new C7305(c21697M48856, c7305.m19989());
            try {
                return new C7745(c7306, c7745.f25501, c12219M37187, c7745.f25505, c7745.f25504);
            } catch (Error | RuntimeException e) {
                c7306.close();
                throw e;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37190(Runnable runnable) {
        this.f50531.m48859(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12219 m37187(C12219 c12219) {
        if (c12219 == null) {
            return null;
        }
        C21476 c21476 = this.f50531;
        C12219 c122110 = (C12219) c21476.m48855(c12219);
        if (c122110 != null) {
            return c122110;
        }
        c21476.m48857();
        C3335 c3335 = c12219.f39261;
        C12219 c122111 = new C12219(new C3335(new C20424(m37188(c3335.f10908.f65428, true)), new C20424(m37188(c3335.f10906.f65428, true)), c3335.f10907, c3335.f10905), c12219.f39260, c12219.f39258, c12219.f39262, c12219.f39259);
        c21476.m48858(c12219, c122111);
        return c122111;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23408 m37188(C23408 c23408, boolean z) {
        Object c10727;
        C23408 c23409;
        if (c23408 == null) {
            return null;
        }
        C21476 c21476 = this.f50531;
        C23408 c234010 = (C23408) c21476.m48855(c23408);
        if (c234010 != null) {
            return c234010;
        }
        c21476.m48857();
        Object obj = c23408.f75775;
        if (obj == null) {
            c23409 = new C23408(m37188(c23408.f75771, z), m37188(c23408.f75773, z));
        } else {
            if (!z) {
                C10727 c10728 = (C10727) obj;
                c10727 = (C10727) c21476.m48855(c10728);
                if (c10727 == null) {
                    c21476.m48857();
                    c10727 = new C10727(c10728.f34065, c10728.f34066, c10728.f34070, c10728.f34067, c21476.m48856(c10728.f34068), c21476.m48856(c10728.f34064));
                    c21476.m48858(c10728, c10727);
                }
            } else {
                C20489 c20489 = (C20489) obj;
                c10727 = (C20489) c21476.m48855(c20489);
                if (c10727 == null) {
                    c21476.m48857();
                    c10727 = new C20489(c20489.f65634, c20489.f65632, c20489.f65631, new C20424(m37188(c20489.f65630.f65428, false)));
                    c21476.m48858(c20489, c10727);
                }
            }
            c23409 = new C23408(c10727);
        }
        c21476.m48858(c23408, c23409);
        return c23409;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f50529) {
            return;
        }
        this.f50529 = true;
        this.f50531.close();
    }
}
