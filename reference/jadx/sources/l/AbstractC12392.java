package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.۫ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9CR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12392 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11748 f41411;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C6396 f41412;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9570 f41413;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4314 f41414;

    public AbstractC12392() {
        throw null;
    }

    public AbstractC12392(C6396 c6396, C9570 c9570, C11748 c11748) {
        this.f41414 = C13488.m32997(getClass());
        new ArrayList();
        new ReentrantReadWriteLock();
        this.f41412 = c6396;
        this.f41411 = c11748;
        this.f41413 = c9570;
        C13488.m32997(getClass());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30830(InterfaceC23331 interfaceC23331) {
        C9570 c9570 = this.f41413;
        c9570.getClass();
        C19240 c19240 = new C19240();
        InterfaceC8140 interfaceC8140M50147 = C22625.m50147(interfaceC23331);
        interfaceC8140M50147.mo8636(interfaceC23331, c19240);
        c9570.m47750(this.f41412, EnumC12810.SMB2_0_INFO_FILE, interfaceC8140M50147.mo8635(), c19240.m27377());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41413.mo6887(this.f41412);
    }

    public final int hashCode() {
        C11748 c11748 = this.f41411;
        int iHashCode = ((c11748 == null ? 0 : c11748.hashCode()) + 31) * 31;
        C9570 c9570 = this.f41413;
        return iHashCode + (c9570 != null ? c9570.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC12392 abstractC12392 = (AbstractC12392) obj;
        C9570 c9570 = abstractC12392.f41413;
        C11748 c11748 = abstractC12392.f41411;
        C11748 c11749 = this.f41411;
        if (c11749 == null) {
            if (c11748 != null) {
                return false;
            }
        } else if (!c11749.equals(c11748)) {
            return false;
        }
        C9570 c9571 = this.f41413;
        if (c9571 == null) {
            return c9570 == null;
        }
        return c9571.equals(c9570);
    }
}
