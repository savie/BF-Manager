package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ۖ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89TZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2916 implements InterfaceC13335 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f9530 = C16980.m40037(AbstractC2916.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13335 f9531;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12523 f9532;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC12589 f9533 = m9552();

    /* JADX INFO: renamed from: ۙ */
    public abstract C12523 mo2957(InterfaceC9627 interfaceC9627);

    public AbstractC2916(C12523 c12523, InterfaceC13335 interfaceC13335) {
        this.f9532 = c12523;
        this.f9531 = interfaceC13335;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12589 m9553() {
        return this.f9532;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC12589 m9552() {
        while (true) {
            InterfaceC13335 interfaceC13335 = this.f9531;
            if (!interfaceC13335.hasNext()) {
                return null;
            }
            try {
                return mo2957((InterfaceC9627) interfaceC13335.next());
            } catch (MalformedURLException e) {
                f9530.mo13724("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9533 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC12589 interfaceC12589 = this.f9533;
        this.f9533 = m9552();
        return interfaceC12589;
    }

    @Override // l.InterfaceC13335, java.lang.AutoCloseable
    public final void close() {
        this.f9531.close();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9531.remove();
    }
}
