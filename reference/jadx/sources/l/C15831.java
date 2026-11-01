package l;

import java.net.MalformedURLException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15831 implements InterfaceC9190 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f51241 = C13488.m32997(C15831.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17241 f51242;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f51243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17241 f51244 = m37642();

    public C15831(C17241 c17241, Iterator it) {
        this.f51242 = c17241;
        this.f51243 = it;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17241 m37642() {
        while (true) {
            Iterator it = this.f51243;
            if (!it.hasNext()) {
                return null;
            }
            InterfaceC22180 interfaceC22180 = (InterfaceC22180) it.next();
            try {
                return new C17241(this.f51242, interfaceC22180.getName(), false, interfaceC22180.getType(), 17, 0L, 0L);
            } catch (MalformedURLException e) {
                f51241.mo12138("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51244 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17241 c17241 = this.f51244;
        this.f51244 = m37642();
        return c17241;
    }

    @Override // l.InterfaceC9190, java.lang.AutoCloseable
    public final void close() {
        this.f51244 = null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
