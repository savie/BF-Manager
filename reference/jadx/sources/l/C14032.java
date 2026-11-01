package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14032 extends AbstractC5543 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f46142;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C14032(C6975 c6975) {
        this.f46142 = c6975;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C4858(this.f46142);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C11915(this.f46142);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C6975 c6975 = this.f46142;
        Object[] objArr = c6975.f23476;
        if (c6975.f23475) {
            consumer.accept(objArr[c6975.f23479]);
        }
        int i = c6975.f23479;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46142.f23474;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f46142.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C6975 c6975 = this.f46142;
        int i = c6975.f23474;
        c6975.remove(obj);
        return c6975.f23474 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46142.clear();
    }
}
