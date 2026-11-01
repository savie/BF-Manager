package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3409 extends AbstractC4511 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1998 f12588;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1998 f12589;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract C1998 mo10110(C1998 c1998);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C1998 mo10111(C1998 c1998);

    public AbstractC3409(C1998 c1998, C1998 c1999) {
        this.f12588 = c1999;
        this.f12589 = c1998;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12589 != null;
    }

    @Override // l.AbstractC4511
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10109(C1998 c1998) {
        C1998 c1998Mo10110 = null;
        if (this.f12588 == c1998 && c1998 == this.f12589) {
            this.f12589 = null;
            this.f12588 = null;
        }
        C1998 c1999 = this.f12588;
        if (c1999 == c1998) {
            this.f12588 = mo10111(c1999);
        }
        C1998 c19910 = this.f12589;
        if (c19910 == c1998) {
            C1998 c19911 = this.f12588;
            if (c19910 != c19911 && c19911 != null) {
                c1998Mo10110 = mo10110(c19910);
            }
            this.f12589 = c1998Mo10110;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1998 c1998 = this.f12589;
        C1998 c1999 = this.f12588;
        this.f12589 = (c1998 == c1999 || c1999 == null) ? null : mo10110(c1998);
        return c1998;
    }
}
