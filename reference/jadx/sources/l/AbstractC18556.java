package l;

/* JADX INFO: renamed from: l.ܿ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IA21 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18556 extends Thread implements InterfaceC23032 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f60286 = C16980.m40037(AbstractC18556.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60287;

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo22001() {
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public abstract C19982 mo2877();

    public AbstractC18556() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23032 mo22002() {
        return new C8115(this, new C19982());
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23032 m43135() {
        return new C8115(this, new C19982(null, null, null, EnumC22966.GUEST));
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24546 mo22000() {
        return mo2877();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo2873() {
        if (this.f60287) {
            return;
        }
        Runtime.getRuntime().removeShutdownHook(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f60287 = true;
            mo2873();
        } catch (C20048 e) {
            f60286.mo13702("Failed to close context on shutdown", (Throwable) e);
        }
    }
}
