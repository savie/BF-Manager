package l;

/* JADX INFO: renamed from: l.ۖۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2457 implements Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f7879 = C16980.m40037(C2457.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC24334 f7880;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ClassLoader f7881;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0385 f7882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24087 f7883;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC13255 f7884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0966 f7885;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6129 f7886;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        this.f7882.getClass();
        ((C2457) obj).f7882.getClass();
        return 0;
    }

    public C2457(InterfaceC24334 interfaceC24334, C6129 c6129) {
        this.f7880 = interfaceC24334;
        this.f7882 = interfaceC24334.mo33125();
        this.f7881 = interfaceC24334.getClass().getClassLoader();
        this.f7886 = c6129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8282(C0966 c0966) {
        this.f7885 = c0966;
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        threadCurrentThread.setContextClassLoader(this.f7881);
        try {
            this.f7880.mo33128(c0966);
        } catch (Throwable th) {
            try {
                f7879.mo13724("Plugin init failed", th);
                this.f7885 = null;
            } finally {
                threadCurrentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8285() {
        if (this.f7885 != null) {
            try {
                InterfaceC24334 interfaceC24334 = this.f7880;
                C17359.requireNonNull(interfaceC24334);
                RunnableC9168 runnableC9168 = new RunnableC9168(0, interfaceC24334);
                ClassLoader classLoader = this.f7881;
                Thread threadCurrentThread = Thread.currentThread();
                ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
                threadCurrentThread.setContextClassLoader(classLoader);
                try {
                    runnableC9168.run();
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                    this.f7885 = null;
                } catch (Throwable th) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f7885 = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8283(InterfaceC13255 interfaceC13255) {
        if (interfaceC13255 == null) {
            return;
        }
        this.f7884 = interfaceC13255;
        try {
            ((AbstractC16984) interfaceC13255).m40049(this.f7886.m17697());
        } catch (Exception e) {
            this.f7882.getClass();
            throw new C8597("Failed to apply options for plugin: dex-input", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0385 m8280() {
        return this.f7882;
    }

    public final int hashCode() {
        this.f7882.getClass();
        return 88294036;
    }

    public final String toString() {
        this.f7882.getClass();
        return "dex-input";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m8286() {
        this.f7882.getClass();
        return "dex-input";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24087 m8281() {
        return this.f7883;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8284(C24087 c24087) {
        this.f7883 = c24087;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0966 m8287() {
        return this.f7885;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13255 m8288() {
        return this.f7884;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2457)) {
            return false;
        }
        this.f7882.getClass();
        ((C2457) obj).f7882.getClass();
        return true;
    }
}
