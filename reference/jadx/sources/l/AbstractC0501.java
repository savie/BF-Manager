package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0501 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterable f2176;

    public AbstractC0501() {
        this.f2176 = null;
    }

    public AbstractC0501(Iterable iterable) {
        iterable.getClass();
        this.f2176 = iterable;
    }

    public final String toString() {
        Iterable iterable = this.f2176;
        if (iterable == null) {
            iterable = this;
        }
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0501 m2461(int i) {
        Iterable iterable = this.f2176;
        if (iterable == null) {
            iterable = this;
        }
        C12128.m30308("limit is negative", i >= 0);
        return m2460(new C24831(iterable, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0501 m2462(InterfaceC5417 interfaceC5417) {
        Iterable iterable = this.f2176;
        if (iterable == null) {
            iterable = this;
        }
        return m2460(new C11404(iterable, interfaceC5417));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0501 m2460(Iterable iterable) {
        if (iterable instanceof AbstractC0501) {
            return (AbstractC0501) iterable;
        }
        return new C4230(iterable, iterable);
    }
}
