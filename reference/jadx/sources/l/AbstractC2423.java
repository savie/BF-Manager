package l;

/* JADX INFO: renamed from: l.ۖۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: IA0M */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2423 implements InterfaceC9190 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f9709 = C13488.m32997(AbstractC2423.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17241 f9710;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17987 f9711;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f9712 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22180 f9714;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC22180[] mo7352();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo7353();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7355() {
        if (!this.f9712) {
            this.f9712 = true;
            try {
                mo7356();
                this.f9714 = null;
                this.f9711.m41879();
            } catch (Throwable th) {
                this.f9714 = null;
                this.f9711.m41879();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo7356();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC22180 mo7358();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract boolean mo7359();

    public AbstractC2423(C17241 c17241, C17987 c17987) throws Exception {
        this.f9710 = c17241;
        c17987.m41869();
        this.f9711 = c17987;
        try {
            InterfaceC22180 interfaceC22180Mo7358 = mo7358();
            this.f9714 = interfaceC22180Mo7358;
            if (interfaceC22180Mo7358 == null) {
                m7355();
            }
        } catch (Exception e) {
            m7355();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17987 m7357() {
        return this.f9711;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC11306 m7360() {
        return this.f9710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22180 m7354(boolean z) {
        InterfaceC22180[] interfaceC22180ArrMo7352 = mo7352();
        while (true) {
            int i = this.f9713;
            if (i < interfaceC22180ArrMo7352.length) {
                InterfaceC22180 interfaceC22180 = interfaceC22180ArrMo7352[i];
                this.f9713 = i + 1;
                String name = interfaceC22180.getName();
                if (name.length() < 3) {
                    int iHashCode = name.hashCode();
                    int i2 = C17241.f54927;
                    if ((iHashCode == 46 || iHashCode == 1472) && (name.equals(".") || name.equals(".."))) {
                    }
                }
                return interfaceC22180;
            }
            if (z || mo7359()) {
                return null;
            }
            if (!mo7353()) {
                m7355();
                return null;
            }
            this.f9713 = 0;
            return m7354(true);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9714 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC22180 interfaceC22180 = this.f9714;
        try {
            InterfaceC22180 interfaceC22180M7354 = m7354(false);
            if (interfaceC22180M7354 == null) {
                m7355();
                return interfaceC22180;
            }
            this.f9714 = interfaceC22180M7354;
            return interfaceC22180;
        } catch (C8484 e) {
            InterfaceC4314 interfaceC4314 = f9709;
            interfaceC4314.mo12122("Enumeration failed", (Throwable) e);
            this.f9714 = null;
            try {
                m7355();
            } catch (C8484 unused) {
                interfaceC4314.mo12120("Failed to close enum", (Exception) e);
            }
            return interfaceC22180;
        }
    }

    @Override // l.InterfaceC9190, java.lang.AutoCloseable
    public final void close() {
        if (this.f9714 != null) {
            m7355();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
