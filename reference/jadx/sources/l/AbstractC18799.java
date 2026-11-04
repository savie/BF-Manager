package l;

/* JADX INFO: renamed from: l.ᩳۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9WM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18799 extends AbstractC18053 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f61043 = C16980.m40038(AbstractC18799.class.getName());

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61044;

    /* JADX INFO: renamed from: ۙ */
    public abstract C1271 mo3636(C1271 c1271);

    /* JADX INFO: renamed from: ۤ */
    public abstract String mo3637();

    /* JADX INFO: renamed from: ᩷ */
    public abstract C1271 mo3638(C1271 c1271);

    public AbstractC18799(C14168 c14168) {
        super(c14168);
        this.f61044 = 0;
    }

    @Override // l.AbstractC18053
    public final String toString() {
        return mo1348() + " count: " + this.f61044;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC25186 interfaceC25186 = f61043;
        try {
            if (!m42076().m34457() && !m42076().m34438()) {
                int i = this.f61044;
                this.f61044 = i + 1;
                if (i < 3) {
                    interfaceC25186.mo13701("{}.run() JmDNS {}", mo1348(), mo3637());
                    C1271 c1271Mo3638 = mo3638(new C1271(0));
                    if (m42076().m34432()) {
                        c1271Mo3638 = mo3636(c1271Mo3638);
                    }
                    if (c1271Mo3638.m44426()) {
                        return;
                    }
                    m42076().m34422(c1271Mo3638);
                    return;
                }
                cancel();
                return;
            }
            cancel();
        } catch (Throwable th) {
            interfaceC25186.mo13702(mo1348() + ".run() exception ", th);
            m42076().m34441();
        }
    }
}
