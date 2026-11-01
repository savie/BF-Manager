package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0C */
/* JADX INFO: loaded from: classes.dex */
public final class C23684 extends AbstractC1810 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76619 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52142(AbstractC1810 abstractC1810) {
        if (abstractC1810 == null) {
            abstractC1810 = C3221.f12023;
        }
        this.f76619.add(abstractC1810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52141(int i, C2246 c2246) {
    }

    public final int size() {
        return this.f76619.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f76619.iterator();
    }

    public final AbstractC1810 get(int i) {
        return (AbstractC1810) this.f76619.get(i);
    }

    @Override // l.AbstractC1810
    /* JADX INFO: renamed from: ۨ */
    public final String mo5903() {
        ArrayList arrayList = this.f76619;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC1810) arrayList.get(0)).mo5903();
        }
        throw new IllegalStateException(C8479.m22141(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C23684) && ((C23684) obj).f76619.equals(this.f76619);
        }
        return true;
    }

    public final int hashCode() {
        return this.f76619.hashCode();
    }
}
