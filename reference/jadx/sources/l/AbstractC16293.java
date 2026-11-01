package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16293 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Iterator f52489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f52492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f52493 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Collection f52491 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Iterator f52490 = EnumC10108.INSTANCE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo38444(Object obj, Object obj2);

    public AbstractC16293(AbstractC11830 abstractC11830) {
        this.f52492 = abstractC11830;
        this.f52489 = abstractC11830.f39727.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52489.hasNext() || this.f52490.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f52490.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f52489.next();
            this.f52493 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f52491 = collection;
            this.f52490 = collection.iterator();
        }
        return this.f52490.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f52490.remove();
        Collection collection = this.f52491;
        C13638.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f52489.remove();
        }
        AbstractC11830.m29504(this.f52492);
    }
}
