package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܳᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MI */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14695 extends AbstractCollection implements InterfaceC0624, InterfaceC10441 {
    public /* synthetic */ void forEach(Consumer consumer) {
        C20113.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C2223.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ InterfaceC5046 parallelStream() {
        return C21980.stream(C9030.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C19613.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C2223.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ InterfaceC5046 stream() {
        return C21980.stream(C9030.b(this), false);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return spliterator();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 it = iterator();
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
                Object next = it.next();
                if (this == next) {
                    sb.append("(this collection)");
                } else {
                    sb.append(String.valueOf(next));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC10441, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC7371 spliterator() {
        return new C17249(iterator(), C17745.m41307(this), 64);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
