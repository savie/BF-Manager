package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17933 extends AbstractC5543 implements InterfaceC17228, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15818 f57369;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C17933(C15818 c15818) {
        this.f57369 = c15818;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C22873(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C22873(this);
    }

    @Override // l.InterfaceC17228
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo15355() {
        return new C15112(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C21461(this, 0, this.f57369.f51193);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C15818 c15818 = this.f57369;
        int i = c15818.f51193;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C8762(c15818, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f57369.f51193;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C15818 c15818 = this.f57369;
        return c15818.containsKey(key) && C13638.equals(c15818.get(key), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C15818 c15818 = this.f57369;
        int iM37599 = c15818.m37599(key);
        if (iM37599 == -1 || !C13638.equals(value, c15818.f51191[iM37599])) {
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
}
