package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۨ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12000 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f38699;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final UUID f38700;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f38701;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12547 f38702;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0352 f38703;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38704;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20006 f38705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38706;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f38704) {
            return;
        }
        if (this.f38706 || this.f38701) {
            throw new IllegalStateException("Cannot release migration ownership during use");
        }
        try {
            this.f38705.close();
            this.f38704 = true;
            C12547 c12547 = this.f38702;
            if (c12547 != null) {
                c12547.close();
                this.f38702 = null;
            }
        } catch (Throwable th) {
            this.f38704 = true;
            C12547 c12548 = this.f38702;
            if (c12548 != null) {
                c12548.close();
                this.f38702 = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m30181(C3139 c3139) {
        Object objM30180;
        if (this.f38704) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f38701 || this.f38706) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f38701 = true;
        try {
            objM30180 = m30180(c3139);
            this.f38701 = false;
        } catch (Throwable th) {
            this.f38701 = false;
            throw th;
        }
        return objM30180;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30183(C21410 c21410) {
        if (this.f38704) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f38706 || this.f38701) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f38706 = true;
        try {
            m30180(null);
            c21410.m48719();
            this.f38706 = false;
        } catch (Throwable th) {
            this.f38706 = false;
            throw th;
        }
    }

    public C12000(InterfaceC24329 interfaceC24329, C20006 c20006, UUID uuid, C0352 c0352) {
        this.f38699 = interfaceC24329;
        this.f38705 = c20006;
        this.f38700 = uuid;
        this.f38703 = c0352;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m30182() {
        return this.f38699;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final UUID m30184() {
        return this.f38700;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30179(C12000 c12000) throws IOException {
        c12000.m30180(null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Object m30180(C3139 c3139) throws IOException {
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        InterfaceC24329 interfaceC24329 = this.f38699;
        C20006 c20006 = this.f38705;
        C22990 c22990M46042 = c20006.m46042();
        UUID uuid = c22990M46042.f74638;
        UUID uuid2 = this.f38700;
        if (!uuid.equals(uuid2)) {
            throw new IOException("Migration recovery identity does not match");
        }
        InterfaceC24329 interfaceC24329M46037 = c20006.m46037(c22990M46042);
        C0352 c0352 = this.f38703;
        C10046 c10046M25954 = C10046.m25954(interfaceC24329M46037, c0352);
        try {
            try {
                C23736 c23736M11663 = new C3598(c10046M25954).m11663(C16276.f52867);
                try {
                    C20006.m46020(c22990M46042, c10046M25954, c23736M11663.f76937);
                    if (c23736M11663.f76942 != 0 || c23736M11663.f76932 != null || c23736M11663.f76938 != null) {
                        throw new IOException("Migration recovery requires explicit repair before cleanup");
                    }
                    C6781 c6781M18902 = C6781.m18902(c23736M11663.m53006());
                    if (!c6781M18902.f22604.equals(uuid2)) {
                        throw new IOException("Migration metadata identity does not match");
                    }
                    c6781M18902.m18908(interfaceC24329, c0352);
                    c10046M25954.f32215.mo14343();
                    interfaceC22465.mo26981(interfaceC24329);
                    C12547 c12547 = this.f38702;
                    this.f38702 = c23736M11663.m53004();
                    if (c12547 != null) {
                        c12547.close();
                    }
                    if (c3139 != null) {
                        C7305 c7305 = new C7305(c23736M11663.m53005(), c23736M11663.f76936);
                        try {
                            Object objM10256 = c3139.m10256(c7305, c6781M18902);
                            c7305.close();
                            c23736M11663.close();
                            c10046M25954.close();
                            return objM10256;
                        } catch (Throwable th) {
                            try {
                                c7305.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c23736M11663.close();
                    c10046M25954.close();
                    return null;
                } catch (Throwable th3) {
                    try {
                        c23736M11663.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c10046M25954.close();
                throw th5;
            }
            c10046M25954.close();
        } catch (Throwable th6) {
            th5.addSuppressed(th6);
        }
        throw th5;
    }
}
