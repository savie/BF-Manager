package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩹ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T7DJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C23497 extends C14618 implements Collection, InterfaceC9372 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f75973;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f75974;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public /* synthetic */ void forEach(Consumer consumer) {
        C13689.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C3516.convert(mo52748parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: parallelStream */
    public /* synthetic */ InterfaceC20670 mo52748parallelStream() {
        return C12465.stream(C1170.b(this), true);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return C10118.$default$removeIf(this, predicate);
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

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f75973.add((InterfaceC3359) obj);
    }

    public C23497(C15291 c15291, EnumC13127 enumC13127, boolean z, ArrayList arrayList) {
        super(c15291, enumC13127);
        this.f75973 = arrayList;
        this.f75974 = z;
    }

    public C23497(C15291 c15291, EnumC13127 enumC13127, ArrayList arrayList) {
        this(c15291, enumC13127, false, arrayList);
    }

    public C23497(C15291 c15291, EnumC13127 enumC13127) {
        this(c15291, enumC13127, false, new ArrayList());
    }

    public C23497(C15291 c15291, EnumC13127 enumC13127, int i) {
        this(c15291, enumC13127, true, new ArrayList());
    }

    public final InterfaceC3359 get(int i) {
        return (InterfaceC3359) this.f75973.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 m52686(C24069 c24069) {
        return C1170.stream(this.f75973).filter(c24069).findFirst();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52689(InterfaceC3359 interfaceC3359) {
        this.f75973.add(interfaceC3359);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f75973.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f75973.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f75973.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f75973.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f75973.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f75973.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52690(InterfaceC20670 interfaceC20670) {
        InterfaceC20670 interfaceC20670Filter = interfaceC20670.filter(new C17529());
        final ArrayList arrayList = this.f75973;
        C17359.requireNonNull(arrayList);
        interfaceC20670Filter.forEach(new Consumer() { // from class: l.ܶۤ᩺
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((InterfaceC3359) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52687(int i, C11913 c11913) {
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f75973.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52688(ArrayList arrayList) {
        ArrayList arrayList2 = this.f75973;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final ArrayList getElements() {
        return this.f75973;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f75973.iterator();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f75973.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f75973.toArray(objArr);
    }

    @Override // java.util.Collection, l.InterfaceC9372
    /* JADX INFO: renamed from: stream */
    public final InterfaceC20670 mo52749stream() {
        return C1170.stream(this.f75973);
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return C1170.stream(this.f75973).mapToInt(new C16783()).sum() + (this.f75974 ? 1 : 2);
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        ArrayList arrayList = this.f75973;
        int iCount = (int) C1170.stream(arrayList).filter(new C24989()).count();
        if (this.f75974) {
            ((C11388) interfaceC9397).m28735(iCount);
        } else {
            ((C11388) interfaceC9397).m28740(iCount);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3359) it.next()).mo1599(interfaceC9397);
        }
    }
}
