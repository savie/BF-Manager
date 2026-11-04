package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0C */
/* JADX INFO: loaded from: classes.dex */
public final class C21538 extends AbstractC0655 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68813 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48983(AbstractC0655 abstractC0655) {
        if (abstractC0655 == null) {
            abstractC0655 = C19300.f62377;
        }
        this.f68813.add(abstractC0655);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48982(int i, C2892 c2892) {
    }

    public final int size() {
        return this.f68813.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f68813.iterator();
    }

    public final AbstractC0655 get(int i) {
        return (AbstractC0655) this.f68813.get(i);
    }

    @Override // l.AbstractC0655
    /* JADX INFO: renamed from: ۤ */
    public final String mo2866() {
        ArrayList arrayList = this.f68813;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC0655) arrayList.get(0)).mo2866();
        }
        throw new IllegalStateException(C13645.m33382(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C21538) && ((C21538) obj).f68813.equals(this.f68813);
        }
        return true;
    }

    public final int hashCode() {
        return this.f68813.hashCode();
    }
}
