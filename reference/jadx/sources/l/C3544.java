package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3544 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13900 f13049;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2609 f13050;

    public C3544(C2609 c2609) {
        this.f13050 = c2609;
        this.f13049 = c2609.f10213;
        this.f13049 = m10459();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13900 m10459() {
        C13900 c13900 = this.f13049.f45797;
        C2609 c2609 = this.f13050;
        if (c13900 == c2609.f10212) {
            return null;
        }
        while (c13900.f45797 != c2609.f10212) {
            int i = c13900.f45795;
            C13900 c13901 = c13900.f45797;
            if (i != c13901.f45796 || !c13900.f45798.equals(c13901.f45798)) {
                break;
            }
            C13900 c13902 = c13900.f45797;
            c13900.f45795 = c13902.f45795;
            C13900 c13903 = c13902.f45797;
            c13903.f45794 = c13902.f45794;
            c13902.f45794.f45797 = c13903;
        }
        return c13900;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13049 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C13900 c13900 = this.f13049;
        this.f13049 = m10459();
        return c13900;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
