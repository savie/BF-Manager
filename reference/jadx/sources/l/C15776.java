package l;

import java.io.Serializable;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes5.dex */
public class C15776 implements InterfaceC10131, Serializable, InterfaceC10441 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10131 f51096;

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final /* synthetic */ void forEach(Consumer consumer) {
        C5669.m15559(this, consumer);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C8720.m22565(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public InterfaceC11790 spliterator() {
        throw null;
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // l.InterfaceC10131
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public boolean add(Integer num) {
        throw null;
    }

    @Override // java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        add((Integer) obj);
        throw null;
    }

    public C15776(InterfaceC10609 interfaceC10609) {
        C13638.requireNonNull(interfaceC10609);
        this.f51096 = interfaceC10609;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC22603
    public void forEach(IntConsumer intConsumer) {
        this.f51096.forEach(intConsumer);
    }
}
