package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15939 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC21832 f51631;

    public AbstractC15939() {
        this.f51631 = AbstractC21832.m48603();
    }

    public AbstractC15939(Iterable iterable) {
        this.f51631 = AbstractC21832.m48604(iterable);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.f51631.mo22678(this)).iterator();
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
    public final AbstractC15939 m37895(int i) {
        Iterable iterable = (Iterable) this.f51631.mo22678(this);
        iterable.getClass();
        C18304.m42516("limit is negative", i >= 0);
        return m37894(new C6579(iterable, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15939 m37896(InterfaceC11955 interfaceC11955) {
        return m37894(C22808.m50466((Iterable) this.f51631.mo22678(this), interfaceC11955));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC15939 m37894(Iterable iterable) {
        if (iterable instanceof AbstractC15939) {
            return (AbstractC15939) iterable;
        }
        return new C8883(iterable, iterable);
    }
}
