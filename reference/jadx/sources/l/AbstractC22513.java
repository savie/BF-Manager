package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22513 extends AbstractC19529 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21767 f72825;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21767 f72826;

    /* JADX INFO: renamed from: ۤ */
    public abstract C21767 mo14416(C21767 c21767);

    /* JADX INFO: renamed from: ᩷ */
    public abstract C21767 mo14417(C21767 c21767);

    public AbstractC22513(C21767 c21767, C21767 c21768) {
        this.f72825 = c21768;
        this.f72826 = c21767;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72826 != null;
    }

    @Override // l.AbstractC19529
    /* JADX INFO: renamed from: ۙ */
    public final void mo27034(C21767 c21767) {
        C21767 c21767Mo14416 = null;
        if (this.f72825 == c21767 && c21767 == this.f72826) {
            this.f72826 = null;
            this.f72825 = null;
        }
        C21767 c21768 = this.f72825;
        if (c21768 == c21767) {
            this.f72825 = mo14417(c21768);
        }
        C21767 c21769 = this.f72826;
        if (c21769 == c21767) {
            C21767 c217610 = this.f72825;
            if (c21769 != c217610 && c217610 != null) {
                c21767Mo14416 = mo14416(c21769);
            }
            this.f72826 = c21767Mo14416;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C21767 c21767 = this.f72826;
        C21767 c21768 = this.f72825;
        this.f72826 = (c21767 == c21768 || c21768 == null) ? null : mo14416(c21767);
        return c21767;
    }
}
