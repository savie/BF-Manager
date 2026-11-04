package l;

import java.net.MalformedURLException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9YC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17744 implements InterfaceC13335 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f58283 = C16980.m40037(C17744.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f58284;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12523 f58285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12523 f58286 = m41558();

    public C17744(C12523 c12523, Iterator it) {
        this.f58285 = c12523;
        this.f58284 = it;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12523 m41558() {
        while (true) {
            Iterator it = this.f58284;
            if (!it.hasNext()) {
                return null;
            }
            InterfaceC9627 interfaceC9627 = (InterfaceC9627) it.next();
            try {
                return new C12523(this.f58285, interfaceC9627.getName(), false, interfaceC9627.getType(), 17, 0L, 0L);
            } catch (MalformedURLException e) {
                f58283.mo13724("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58286 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C12523 c12523 = this.f58286;
        this.f58286 = m41558();
        return c12523;
    }

    @Override // l.InterfaceC13335, java.lang.AutoCloseable
    public final void close() {
        this.f58286 = null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
