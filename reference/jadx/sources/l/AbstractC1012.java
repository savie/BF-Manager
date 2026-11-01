package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.֨ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 89TZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1012 implements InterfaceC9190 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f4700 = C13488.m32997(AbstractC1012.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17241 f4701;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9190 f4702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11306 f4703 = m3838();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract C17241 mo3840(InterfaceC22180 interfaceC22180);

    public AbstractC1012(C17241 c17241, InterfaceC9190 interfaceC9190) {
        this.f4701 = c17241;
        this.f4702 = interfaceC9190;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11306 m3839() {
        return this.f4701;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private InterfaceC11306 m3838() {
        while (true) {
            InterfaceC9190 interfaceC9190 = this.f4702;
            if (!interfaceC9190.hasNext()) {
                return null;
            }
            try {
                return mo3840((InterfaceC22180) interfaceC9190.next());
            } catch (MalformedURLException e) {
                f4700.mo12138("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4703 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC11306 interfaceC11306 = this.f4703;
        this.f4703 = m3838();
        return interfaceC11306;
    }

    @Override // l.InterfaceC9190, java.lang.AutoCloseable
    public final void close() {
        this.f4702.close();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4702.remove();
    }
}
