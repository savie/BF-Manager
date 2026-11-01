package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11690 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f39303;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3284 f39304;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f39305 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2516 f39306;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f39307;

    public C11690(C2516 c2516, long j, long j2, C3284 c3284) {
        this.f39306 = c2516;
        this.f39307 = j;
        this.f39303 = j2;
        this.f39304 = c3284;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m29186() {
        long j;
        synchronized (this.f39306) {
            m29184();
            j = this.f39303;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15218 m29189(InterfaceC5614 interfaceC5614) throws Throwable {
        C3284 c3284;
        synchronized (this.f39306) {
            m29184();
            c3284 = this.f39304;
        }
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
        if (!interfaceC5614M29777.mo2357()) {
            m29182();
            C15218 c15218 = null;
            try {
                C15218 c15219 = new C15218(this.f39306.f9981, this.f39307, this.f39303, c3284.f12185, c3284.f12181);
                try {
                    c15219.m36424();
                    m29182();
                    if (interfaceC5614M29777.mo2357()) {
                        throw new C1105();
                    }
                    return c15219;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c15218 = c15219;
                    if (c15218 != null) {
                        try {
                            c15218.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C1105();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6750 m29188(int i, int i2, C11054 c11054) throws Throwable {
        C3284 c3284;
        synchronized (this.f39306) {
            m29184();
            C22979.m50823(this.f39304.m9777(), i, i2);
            c3284 = this.f39304;
        }
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(c11054);
        if (!interfaceC5614M29777.mo2357()) {
            m29182();
            C6750 c6750 = null;
            try {
                C6750 c6751 = new C6750(this.f39306.f9981, this.f39307, this.f39303, C2516.m7776(C7893.m20847(c3284.f12185, i, i2), interfaceC5614M29777), C9367.m24022(c3284.f12181, i, i2));
                try {
                    c6751.m18253();
                    m29182();
                    if (interfaceC5614M29777.mo2357()) {
                        throw new C1105();
                    }
                    return c6751;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c6750 = c6751;
                    if (c6750 != null) {
                        try {
                            c6750.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C1105();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m29182() {
        synchronized (this.f39306) {
            m29184();
        }
        this.f39306.m7802();
        synchronized (this.f39306) {
            m29184();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6750 m29187(int i, int i2, File file, C3147 c3147) throws Throwable {
        C3284 c3284;
        Throwable th;
        C6750 c6750;
        synchronized (this.f39306) {
            m29184();
            C22979.m50823(this.f39304.m9777(), i, i2);
            if (i2 > 33554432) {
                throw new C19950();
            }
            c3284 = this.f39304;
        }
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(c3147);
        if (interfaceC5614M29777.mo2357()) {
            throw new C1105();
        }
        C6750 c6751 = null;
        try {
            c6750 = new C6750(this.f39306.f9981, this.f39307, this.f39303, C7893.m20847(c3284.f12185, i, i2), C9367.m24022(c3284.f12181, i, i2));
            try {
                C6750 c6750M7729 = C2516.m7729(c6750, file, interfaceC5614M29777);
                c6751 = c6750M7729 != c6750 ? c6750 : null;
                try {
                    synchronized (this.f39306) {
                        m29184();
                    }
                    if (c6751 != null) {
                        c6751.close();
                    }
                    return c6750M7729;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c6750 = c6751;
                    c6751 = c6750M7729;
                    th = e;
                    if (c6751 != null) {
                        try {
                            c6751.close();
                        } catch (IOException e2) {
                            th.addSuppressed(e2);
                        }
                    }
                    if (c6750 == null) {
                        throw th;
                    }
                    try {
                        c6750.close();
                        throw th;
                    } catch (IOException e3) {
                        th.addSuppressed(e3);
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Error e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (IOException | Error | RuntimeException e7) {
            th = e7;
            c6750 = null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m29184() {
        if (this.f39305) {
            long j = this.f39307;
            C2516 c2516 = this.f39306;
            if (j == c2516.f9986 && !c2516.f9991) {
                return;
            }
        }
        throw new IllegalStateException("VersionHandle is not active");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f39306) {
            if (this.f39305) {
                this.f39305 = false;
                this.f39306.f9980.remove(this);
                C2516.m7752(this.f39306.m7784());
            }
        }
    }
}
