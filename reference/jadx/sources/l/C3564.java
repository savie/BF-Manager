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

/* JADX INFO: renamed from: l.ۗ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7DJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3564 extends C12925 implements Collection, InterfaceC10441 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13131;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13132;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public /* synthetic */ void forEach(Consumer consumer) {
        C20113.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
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

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f13132.add((InterfaceC4705) obj);
    }

    public C3564(C12738 c12738, EnumC16783 enumC16783, boolean z, ArrayList arrayList) {
        super(c12738, enumC16783);
        this.f13132 = arrayList;
        this.f13131 = z;
    }

    public C3564(C12738 c12738, EnumC16783 enumC16783, ArrayList arrayList) {
        this(c12738, enumC16783, false, arrayList);
    }

    public C3564(C12738 c12738, EnumC16783 enumC16783) {
        this(c12738, enumC16783, false, new ArrayList());
    }

    public C3564(C12738 c12738, EnumC16783 enumC16783, int i) {
        this(c12738, enumC16783, true, new ArrayList());
    }

    public final InterfaceC4705 get(int i) {
        return (InterfaceC4705) this.f13132.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11521 m10553(C22242 c22242) {
        return C9030.stream(this.f13132).filter(c22242).findFirst();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10556(InterfaceC4705 interfaceC4705) {
        this.f13132.add(interfaceC4705);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13132.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f13132.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f13132.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f13132.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f13132.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f13132.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10557(InterfaceC5046 interfaceC5046) {
        InterfaceC5046 interfaceC5046Filter = interfaceC5046.filter(new C9916());
        ArrayList arrayList = this.f13132;
        C13638.requireNonNull(arrayList);
        interfaceC5046Filter.forEach(new C20790(1, arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10554(int i, C23757 c23757) {
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13132.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10555(ArrayList arrayList) {
        ArrayList arrayList2 = this.f13132;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final ArrayList getElements() {
        return this.f13132;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13132.iterator();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f13132.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f13132.toArray(objArr);
    }

    @Override // java.util.Collection, l.InterfaceC10441
    public final InterfaceC5046 stream() {
        return C9030.stream(this.f13132);
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return C9030.stream(this.f13132).mapToInt(new C2153()).sum() + (this.f13131 ? 1 : 2);
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        ArrayList arrayList = this.f13132;
        int iCount = (int) C9030.stream(arrayList).filter(new C14855()).count();
        if (this.f13131) {
            ((C23509) interfaceC19275).m51765(iCount);
        } else {
            ((C23509) interfaceC19275).m51770(iCount);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4705) it.next()).mo2341(interfaceC19275);
        }
    }
}
