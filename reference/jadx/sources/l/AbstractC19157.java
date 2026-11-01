package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩵֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBZE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19157 extends AbstractCollection implements InterfaceC7162, InterfaceC10441 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo19084(((Byte) obj).byteValue());
    }

    @Override // l.InterfaceC7162
    /* JADX INFO: renamed from: ۖ */
    public boolean mo19084(byte b) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7162
    /* JADX INFO: renamed from: ܰ */
    public boolean mo19086(byte b) {
        InterfaceC17040 it = iterator();
        while (it.hasNext()) {
            if (b == it.nextByte()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public void forEach(Consumer consumer) {
        C13638.requireNonNull(consumer);
        mo15546(consumer instanceof InterfaceC0106 ? (InterfaceC0106) consumer : new C16335(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC7162) {
            InterfaceC17040 it = ((InterfaceC7162) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo19084(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo15545(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo19086(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC7162) {
            InterfaceC17040 it = ((InterfaceC7162) collection).iterator();
            while (it.hasNext()) {
                if (!mo15545(it.nextByte())) {
                    return false;
                }
            }
            return true;
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC7162) {
            InterfaceC17040 it = ((InterfaceC7162) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo19086(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC7162) {
            InterfaceC7162 interfaceC7162 = (InterfaceC7162) collection;
            InterfaceC17040 it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!interfaceC7162.mo15545(it.nextByte())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC17040 it = iterator();
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf((int) it.nextByte()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public boolean removeIf(final Predicate predicate) {
        return mo19085(predicate instanceof InterfaceC9280 ? (InterfaceC9280) predicate : new InterfaceC9280() { // from class: l.ۤ֫ᩳ
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return C1517.m5287(this, i);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C1517.m5286(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C1517.m5289(this, intPredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C1517.m5288(this, (Byte) obj);
            }

            @Override // l.InterfaceC9280
            /* JADX INFO: renamed from: ۙ */
            public final C14219 mo15846(InterfaceC9280 interfaceC9280) {
                return new C14219(this, interfaceC9280);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C8512.$default$and(this, predicate2);
            }

            public final IntPredicate negate() {
                return new C5751(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final Predicate mo9645negate() {
                return new C5751(this);
            }

            @Override // l.InterfaceC9280
            /* JADX INFO: renamed from: ܰ */
            public final C23391 mo15847(InterfaceC9280 interfaceC9280) {
                return new C23391(this, interfaceC9280);
            }

            public final Predicate or(Predicate predicate2) {
                return C8512.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC9280
            /* JADX INFO: renamed from: ܰ */
            public final boolean mo15848(byte b) {
                return predicate.test(Byte.valueOf(C21273.m47735((int) b)));
            }
        });
    }

    @Override // l.InterfaceC7162
    /* JADX INFO: renamed from: ۙ */
    public boolean mo19085(InterfaceC9280 interfaceC9280) {
        InterfaceC17040 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC9280.mo15848(it.nextByte())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC7162
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
