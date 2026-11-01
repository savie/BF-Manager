package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0937 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC2348 f3737 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f3738;

    public C0937(Iterator it) {
        this.f3738 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3738.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC2348 abstractC2348 = (AbstractC2348) this.f3738.next();
        this.f3737 = abstractC2348;
        return abstractC2348;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC2348 abstractC2348 = this.f3737;
        if (abstractC2348 != null) {
            abstractC2348.f8288 = null;
        }
        this.f3738.remove();
    }
}
