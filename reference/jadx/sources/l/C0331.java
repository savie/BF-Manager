package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0331 extends AbstractC3074 implements InterfaceC22510, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7043 f1802;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C0331(C7043 c7043) {
        this.f1802 = c7043;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14500(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C14500(this);
    }

    @Override // l.InterfaceC22510
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15224 mo2045() {
        return new C21214(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C18230(this, 0, this.f1802.f23232);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C7043 c7043 = this.f1802;
        int i = c7043.f23232;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C1077(c7043, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1802.f23232;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C7043 c7043 = this.f1802;
        return c7043.containsKey(key) && C17359.equals(c7043.get(key), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C7043 c7043 = this.f1802;
        int iM19368 = c7043.m19368(key);
        if (iM19368 == -1 || !C17359.equals(value, c7043.f23233[iM19368])) {
            return false;
        }
        int i = (c7043.f23232 - iM19368) - 1;
        Object[] objArr = c7043.f23237;
        int i2 = iM19368 + 1;
        System.arraycopy(objArr, i2, objArr, iM19368, i);
        Object[] objArr2 = c7043.f23233;
        System.arraycopy(objArr2, i2, objArr2, iM19368, i);
        int i3 = c7043.f23232 - 1;
        c7043.f23232 = i3;
        c7043.f23237[i3] = null;
        c7043.f23233[i3] = null;
        return true;
    }
}
