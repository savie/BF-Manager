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

/* JADX INFO: renamed from: l.֨ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LBZE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1296 extends AbstractCollection implements InterfaceC8753, InterfaceC9372 {
    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public /* synthetic */ InterfaceC8409 spliterator() {
        return C13629.spliterator(this, 0);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C3516.convert(mo52749stream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        return mo4703(((Byte) obj).byteValue());
    }

    @Override // l.InterfaceC8753
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo4703(byte b) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC8753
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo4702(byte b) {
        InterfaceC19963 it = iterator();
        while (it.hasNext()) {
            if (b == it.nextByte()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public void forEach(Consumer consumer) {
        C17359.requireNonNull(consumer);
        mo12190(consumer instanceof InterfaceC22201 ? (InterfaceC22201) consumer : new C11012(consumer));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection instanceof InterfaceC8753) {
            InterfaceC19963 it = ((InterfaceC8753) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo4703(it.nextByte())) {
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
        return mo12189(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo4702(((Byte) obj).byteValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC8753) {
            InterfaceC19963 it = ((InterfaceC8753) collection).iterator();
            while (it.hasNext()) {
                if (!mo12189(it.nextByte())) {
                    return false;
                }
            }
            return true;
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection instanceof InterfaceC8753) {
            InterfaceC19963 it = ((InterfaceC8753) collection).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (mo4702(it.nextByte())) {
                    z = true;
                }
            }
            return z;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        if (collection instanceof InterfaceC8753) {
            InterfaceC8753 interfaceC8753 = (InterfaceC8753) collection;
            InterfaceC19963 it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!interfaceC8753.mo12189(it.nextByte())) {
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
        InterfaceC19963 it = iterator();
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

    @Override // java.util.Collection, l.InterfaceC9372
    public boolean removeIf(final Predicate predicate) {
        return mo4701(predicate instanceof InterfaceC25185 ? (InterfaceC25185) predicate : new InterfaceC25185() { // from class: l.ۖܺ᩹
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ boolean test(int i) {
                return C11758.m29526(this, i);
            }

            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C11758.m29525(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C11758.m29528(this, intPredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C11758.m29527(this, (Byte) obj);
            }

            @Override // l.InterfaceC25185
            /* JADX INFO: renamed from: ۙ */
            public final C2064 mo7131(InterfaceC25185 interfaceC25185) {
                return new C2064(this, interfaceC25185);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C19025.$default$and(this, predicate2);
            }

            public final IntPredicate negate() {
                return new C15487(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final Predicate mo7134negate() {
                return new C15487(this);
            }

            @Override // l.InterfaceC25185
            /* JADX INFO: renamed from: ᩷ */
            public final C5793 mo7132(InterfaceC25185 interfaceC25185) {
                return new C5793(this, interfaceC25185);
            }

            public final Predicate or(Predicate predicate2) {
                return C19025.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC25185
            /* JADX INFO: renamed from: ᩷ */
            public final boolean mo7133(byte b) {
                return predicate.test(Byte.valueOf(C8485.m22799((int) b)));
            }
        });
    }

    @Override // l.InterfaceC8753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo4701(InterfaceC25185 interfaceC25185) {
        InterfaceC19963 it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC25185.mo7133(it.nextByte())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C12465.stream(C1170.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
