package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0452 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC14621 f2031 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f2032;

    public C0452(Iterator it) {
        this.f2032 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2032.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC14621 abstractC14621 = (AbstractC14621) this.f2032.next();
        this.f2031 = abstractC14621;
        return abstractC14621;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC14621 abstractC14621 = this.f2031;
        if (abstractC14621 != null) {
            abstractC14621.f46061 = null;
        }
        this.f2032.remove();
    }
}
