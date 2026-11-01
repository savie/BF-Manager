package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩸֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21219 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f69124;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21571 f69125;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID f69126;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69127;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10428 f69128;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f69129;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3350 f69130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69131;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f69124) {
            return;
        }
        if (this.f69131 || this.f69127) {
            throw new IllegalStateException("Cannot release migration ownership during use");
        }
        try {
            this.f69130.close();
            this.f69124 = true;
            C21571 c21571 = this.f69125;
            if (c21571 != null) {
                c21571.close();
                this.f69125 = null;
            }
        } catch (Throwable th) {
            this.f69124 = true;
            C21571 c21572 = this.f69125;
            if (c21572 != null) {
                c21572.close();
                this.f69125 = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m47698(C0985 c0985) {
        Object objM47697;
        if (this.f69124) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f69127 || this.f69131) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f69127 = true;
        try {
            objM47697 = m47697(c0985);
            this.f69127 = false;
        } catch (Throwable th) {
            this.f69127 = false;
            throw th;
        }
        return objM47697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47700(C20325 c20325) {
        if (this.f69124) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f69131 || this.f69127) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f69131 = true;
        try {
            m47697(null);
            c20325.m45873();
            this.f69131 = false;
        } catch (Throwable th) {
            this.f69131 = false;
            throw th;
        }
    }

    public C21219(InterfaceC3800 interfaceC3800, C3350 c3350, UUID uuid, C10428 c10428) {
        this.f69129 = interfaceC3800;
        this.f69130 = c3350;
        this.f69126 = uuid;
        this.f69128 = c10428;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m47699() {
        return this.f69129;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID m47701() {
        return this.f69126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47696(C21219 c21219) throws IOException {
        c21219.m47697(null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Object m47697(C0985 c0985) throws IOException {
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        InterfaceC3800 interfaceC3800 = this.f69129;
        C3350 c3350 = this.f69130;
        C9702 c9702M9978 = c3350.m9978();
        UUID uuid = c9702M9978.f32686;
        UUID uuid2 = this.f69126;
        if (!uuid.equals(uuid2)) {
            throw new IOException("Migration recovery identity does not match");
        }
        InterfaceC3800 interfaceC3800M9983 = c3350.m9983(c9702M9978);
        C10428 c10428 = this.f69128;
        C16072 c16072M38075 = C16072.m38075(interfaceC3800M9983, c10428);
        try {
            try {
                C6754 c6754M50850 = new C22983(c16072M38075).m50850(C3931.f14649);
                try {
                    C3350.m9967(c9702M9978, c16072M38075, c6754M50850.f22785);
                    if (c6754M50850.f22784 != 0 || c6754M50850.f22778 != null || c6754M50850.f22776 != null) {
                        throw new IOException("Migration recovery requires explicit repair before cleanup");
                    }
                    C5697 c5697M15715 = C5697.m15715(c6754M50850.m18264());
                    if (!c5697M15715.f19434.equals(uuid2)) {
                        throw new IOException("Migration metadata identity does not match");
                    }
                    c5697M15715.m15722(interfaceC3800, c10428);
                    c16072M38075.f51985.mo17203();
                    interfaceC1959.mo6327(interfaceC3800);
                    C21571 c21571 = this.f69125;
                    this.f69125 = c6754M50850.m18263();
                    if (c21571 != null) {
                        c21571.close();
                    }
                    if (c0985 != null) {
                        C6276 c6276 = new C6276(c6754M50850.m18262(), c6754M50850.f22775);
                        try {
                            Object objM3787 = c0985.m3787(c6276, c5697M15715);
                            c6276.close();
                            c6754M50850.close();
                            c16072M38075.close();
                            return objM3787;
                        } catch (Throwable th) {
                            try {
                                c6276.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c6754M50850.close();
                    c16072M38075.close();
                    return null;
                } catch (Throwable th3) {
                    try {
                        c6754M50850.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c16072M38075.close();
                throw th5;
            }
            c16072M38075.close();
        } catch (Throwable th6) {
            th5.addSuppressed(th6);
        }
        throw th5;
    }
}
