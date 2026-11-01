package l;

/* JADX INFO: renamed from: l.ۙܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: IA21 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4725 extends Thread implements InterfaceC19067 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f16666 = C13488.m32997(AbstractC4725.class);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f16667;

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean mo13092() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public abstract C18652 mo13097();

    public AbstractC4725() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19067 mo13095() {
        return new C11782(this, new C18652());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19067 m13096() {
        return new C11782(this, new C18652(null, null, null, EnumC17946.GUEST));
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23901 mo13093() {
        return mo13097();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void mo13094() {
        if (this.f16667) {
            return;
        }
        Runtime.getRuntime().removeShutdownHook(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f16667 = true;
            mo13094();
        } catch (C8484 e) {
            f16666.mo12122("Failed to close context on shutdown", (Throwable) e);
        }
    }
}
