package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20543 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6373 f65776;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4135 f65777;

    public C20543(C4135 c4135) {
        this.f65777 = c4135;
        this.f65776 = c4135.f14030;
        this.f65776 = m47095();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6373 m47095() {
        C6373 c6373 = this.f65776.f21524;
        C4135 c4135 = this.f65777;
        if (c6373 == c4135.f14029) {
            return null;
        }
        while (c6373.f21524 != c4135.f14029) {
            int i = c6373.f21523;
            C6373 c6374 = c6373.f21524;
            if (i != c6374.f21525 || !c6373.f21526.equals(c6374.f21526)) {
                break;
            }
            C6373 c6375 = c6373.f21524;
            c6373.f21523 = c6375.f21523;
            C6373 c6376 = c6375.f21524;
            c6376.f21527 = c6375.f21527;
            c6375.f21527.f21524 = c6376;
        }
        return c6373;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65776 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C6373 c6373 = this.f65776;
        this.f65776 = m47095();
        return c6373;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
