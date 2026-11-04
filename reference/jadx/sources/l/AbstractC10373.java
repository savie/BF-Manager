package l;

/* JADX INFO: renamed from: l.ۢ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA0M */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10373 implements InterfaceC13335 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f32995 = C16980.m40037(AbstractC10373.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32996;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19457 f32997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32998 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12523 f32999;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC9627 f33000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26676() {
        if (!this.f32998) {
            this.f32998 = true;
            try {
                mo22018();
                this.f33000 = null;
                this.f32997.m44983();
            } catch (Throwable th) {
                this.f33000 = null;
                this.f32997.m44983();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo22014();

    /* JADX INFO: renamed from: ۫ */
    public abstract InterfaceC9627[] mo22015();

    /* JADX INFO: renamed from: ܶ */
    public abstract InterfaceC9627 mo22016();

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo22017();

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo22018();

    public AbstractC10373(C12523 c12523, C19457 c19457) throws Exception {
        this.f32999 = c12523;
        c19457.m44972();
        this.f32997 = c19457;
        try {
            InterfaceC9627 interfaceC9627Mo22016 = mo22016();
            this.f33000 = interfaceC9627Mo22016;
            if (interfaceC9627Mo22016 == null) {
                m26676();
            }
        } catch (Exception e) {
            m26676();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19457 m26677() {
        return this.f32997;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12589 m26678() {
        return this.f32999;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627 m26675(boolean z) {
        InterfaceC9627[] interfaceC9627ArrMo22015 = mo22015();
        while (true) {
            int i = this.f32996;
            if (i < interfaceC9627ArrMo22015.length) {
                InterfaceC9627 interfaceC9627 = interfaceC9627ArrMo22015[i];
                this.f32996 = i + 1;
                String name = interfaceC9627.getName();
                if (name.length() < 3) {
                    int iHashCode = name.hashCode();
                    int i2 = C12523.f40192;
                    if ((iHashCode == 46 || iHashCode == 1472) && (name.equals(".") || name.equals(".."))) {
                    }
                }
                return interfaceC9627;
            }
            if (z || mo22017()) {
                return null;
            }
            if (!mo22014()) {
                m26676();
                return null;
            }
            this.f32996 = 0;
            return m26675(true);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33000 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC9627 interfaceC9627 = this.f33000;
        try {
            InterfaceC9627 interfaceC9627M26675 = m26675(false);
            if (interfaceC9627M26675 == null) {
                m26676();
                return interfaceC9627;
            }
            this.f33000 = interfaceC9627M26675;
            return interfaceC9627;
        } catch (C20048 e) {
            InterfaceC25186 interfaceC25186 = f32995;
            interfaceC25186.mo13702("Enumeration failed", (Throwable) e);
            this.f33000 = null;
            try {
                m26676();
            } catch (C20048 unused) {
                interfaceC25186.mo13711("Failed to close enum", e);
            }
            return interfaceC9627;
        }
    }

    @Override // l.InterfaceC13335, java.lang.AutoCloseable
    public final void close() {
        if (this.f33000 != null) {
            m26676();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
