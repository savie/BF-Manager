package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20974 extends AbstractC3074 implements InterfaceC22706, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2329 f67066;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C20974(C2329 c2329) {
        this.f67066 = c2329;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C23958(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C23958(this);
    }

    @Override // l.InterfaceC22706
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo10931() {
        return new C3820(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C14260(this, 0, this.f67066.f7510);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C2329 c2329 = this.f67066;
        int i = c2329.f7510;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C18736(c2329, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f67066.f7510;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            Object key = entry.getKey();
            C2329 c2329 = this.f67066;
            if (c2329.containsKey(key) && c2329.mo7848(key) == ((Integer) entry.getValue()).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C2329 c2329 = this.f67066;
        int iM7844 = c2329.m7844(key);
        if (iM7844 == -1 || iIntValue != c2329.f7511[iM7844]) {
            return false;
        }
        int i = (c2329.f7510 - iM7844) - 1;
        Object[] objArr = c2329.f7515;
        int i2 = iM7844 + 1;
        System.arraycopy(objArr, i2, objArr, iM7844, i);
        int[] iArr = c2329.f7511;
        System.arraycopy(iArr, i2, iArr, iM7844, i);
        int i3 = c2329.f7510 - 1;
        c2329.f7510 = i3;
        c2329.f7515[i3] = null;
        return true;
    }
}
