package l;

import java.io.Serializable;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes4.dex */
public class C8797 implements InterfaceC1340, Serializable, InterfaceC9372 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1340 f28669;

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final /* synthetic */ void forEach(Consumer consumer) {
        C3052.m9926(this, consumer);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10288.m26521(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public InterfaceC15949 spliterator() {
        throw null;
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // l.InterfaceC1340
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

    public C8797(InterfaceC9018 interfaceC9018) {
        C17359.requireNonNull(interfaceC9018);
        this.f28669 = interfaceC9018;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20206
    public void forEach(IntConsumer intConsumer) {
        this.f28669.forEach(intConsumer);
    }
}
