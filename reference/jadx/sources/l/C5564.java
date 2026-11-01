package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5564 extends AbstractC5543 implements InterfaceC17228, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f19082;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C5564(C6975 c6975) {
        this.f19082 = c6975;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C1705(this.f19082);
    }

    @Override // l.InterfaceC17228
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6269 mo15355() {
        return new C3116(this.f19082);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C9468(this.f19082);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C6975 c6975 = this.f19082;
        if (c6975.f23468.mo3247(key, null)) {
            return c6975.f23475 && C13638.equals(c6975.f23471[c6975.f23479], value);
        }
        Object[] objArr = c6975.f23476;
        int iM25125 = C9927.m25125(c6975.f23468.mo3246(key)) & c6975.f23477;
        Object obj3 = objArr[iM25125];
        if (obj3 == null) {
            return false;
        }
        if (c6975.f23468.mo3247(key, obj3)) {
            return C13638.equals(c6975.f23471[iM25125], value);
        }
        do {
            iM25125 = (iM25125 + 1) & c6975.f23477;
            obj2 = objArr[iM25125];
            if (obj2 == null) {
                return false;
            }
        } while (!c6975.f23468.mo3247(key, obj2));
        return C13638.equals(c6975.f23471[iM25125], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C6975 c6975 = this.f19082;
        if (c6975.f23468.mo3247(key, null)) {
            if (!c6975.f23475 || !C13638.equals(c6975.f23471[c6975.f23479], value)) {
                return false;
            }
            c6975.m18756();
            return true;
        }
        Object[] objArr = c6975.f23476;
        int iM25125 = C9927.m25125(c6975.f23468.mo3246(key)) & c6975.f23477;
        Object obj2 = objArr[iM25125];
        if (obj2 == null) {
            return false;
        }
        if (c6975.f23468.mo3247(obj2, key)) {
            if (!C13638.equals(c6975.f23471[iM25125], value)) {
                return false;
            }
            c6975.m18757(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c6975.f23477;
            Object obj3 = objArr[iM25125];
            if (obj3 == null) {
                return false;
            }
            if (c6975.f23468.mo3247(obj3, key) && C13638.equals(c6975.f23471[iM25125], value)) {
                c6975.m18757(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19082.f23474;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19082.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C6975 c6975 = this.f19082;
        if (c6975.f23475) {
            consumer.n(new C2741(c6975, c6975.f23479));
        }
        Object[] objArr = c6975.f23476;
        int i = c6975.f23479;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C2741(c6975, i2));
            }
            i = i2;
        }
    }
}
