package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19345 extends AbstractC5543 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15818 f62382;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C19345(C15818 c15818) {
        this.f62382 = c15818;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f62382.m37599(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C15818 c15818 = this.f62382;
        int iM37599 = c15818.m37599(obj);
        if (iM37599 == -1) {
            return false;
        }
        int i = (c15818.f51193 - iM37599) - 1;
        Object[] objArr = c15818.f51195;
        int i2 = iM37599 + 1;
        System.arraycopy(objArr, i2, objArr, iM37599, i);
        Object[] objArr2 = c15818.f51191;
        System.arraycopy(objArr2, i2, objArr2, iM37599, i);
        int i3 = c15818.f51193 - 1;
        c15818.f51193 = i3;
        c15818.f51195[i3] = null;
        c15818.f51191[i3] = null;
        return true;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C18639(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C18639(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C8056(this, 0, this.f62382.f51193);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C15818 c15818 = this.f62382;
        Object[] objArr = c15818.f51195;
        int i = c15818.f51193;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62382.f51193;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f62382.clear();
    }
}
