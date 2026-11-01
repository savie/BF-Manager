package l;

/* JADX INFO: renamed from: l.ۖ᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9WM */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2838 extends AbstractC4955 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f10745 = C13488.m32998(AbstractC2838.class.getName());

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10746;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C22034 mo8593(C22034 c22034);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract String mo8594();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C22034 mo8595(C22034 c22034);

    public AbstractC2838(C22823 c22823) {
        super(c22823);
        this.f10746 = 0;
    }

    @Override // l.AbstractC4955
    public final String toString() {
        return mo4999() + " count: " + this.f10746;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC4314 interfaceC4314 = f10745;
        try {
            if (!m13745().m50560() && !m13745().m50533()) {
                int i = this.f10746;
                this.f10746 = i + 1;
                if (i < 3) {
                    interfaceC4314.mo12121("{}.run() JmDNS {}", mo4999(), mo8594());
                    C22034 c22034Mo8595 = mo8595(new C22034(0));
                    if (m13745().m50550()) {
                        c22034Mo8595 = mo8593(c22034Mo8595);
                    }
                    if (c22034Mo8595.m6981()) {
                        return;
                    }
                    m13745().m50547(c22034Mo8595);
                    return;
                }
                cancel();
                return;
            }
            cancel();
        } catch (Throwable th) {
            interfaceC4314.mo12122(mo4999() + ".run() exception ", th);
            m13745().m50567();
        }
    }
}
