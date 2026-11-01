package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5233 extends AbstractC5543 implements InterfaceC17537, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f18145;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C5233(C6644 c6644) {
        this.f18145 = c6644;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C2014(this.f18145);
    }

    @Override // l.InterfaceC17537
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6269 mo14425() {
        return new C3425(this.f18145);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C9777(this.f18145);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C6644 c6644 = this.f18145;
        if (key != null) {
            Object[] objArr = c6644.f22442;
            int iM25125 = C9927.m25125(key.hashCode()) & c6644.f22443;
            Object obj3 = objArr[iM25125];
            if (obj3 == null) {
                return false;
            }
            if (!key.equals(obj3)) {
                do {
                    iM25125 = (iM25125 + 1) & c6644.f22443;
                    obj2 = objArr[iM25125];
                    if (obj2 == null) {
                        return false;
                    }
                } while (!key.equals(obj2));
                if (c6644.f22435[iM25125] != iIntValue) {
                    return false;
                }
            } else if (c6644.f22435[iM25125] != iIntValue) {
                return false;
            }
        } else if (!c6644.f22441 || c6644.f22435[c6644.f22445] != iIntValue) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C6644 c6644 = this.f18145;
        if (key == null) {
            if (!c6644.f22441 || c6644.f22435[c6644.f22445] != iIntValue) {
                return false;
            }
            c6644.m18013();
            return true;
        }
        Object[] objArr = c6644.f22442;
        int iM25125 = C9927.m25125(key.hashCode()) & c6644.f22443;
        Object obj2 = objArr[iM25125];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (c6644.f22435[iM25125] != iIntValue) {
                return false;
            }
            c6644.m18017(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c6644.f22443;
            Object obj3 = objArr[iM25125];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && c6644.f22435[iM25125] == iIntValue) {
                c6644.m18017(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18145.f22440;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18145.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C6644 c6644 = this.f18145;
        if (c6644.f22441) {
            consumer.n(new C2410(c6644, c6644.f22445));
        }
        Object[] objArr = c6644.f22442;
        int i = c6644.f22445;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C2410(c6644, i2));
            }
            i = i2;
        }
    }
}
