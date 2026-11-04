package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17769 extends AbstractC3074 implements InterfaceC19261, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4345 f58340;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C17769(C4345 c4345) {
        this.f58340 = c4345;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11802(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C11802(this);
    }

    @Override // l.InterfaceC19261
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15224 mo41578() {
        return new C25229(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C17023(this, 0, this.f58340.f15714);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C4345 c4345 = this.f58340;
        int i = c4345.f15714;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C20753(c4345, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f58340.f15714;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            C4345 c4345 = this.f58340;
            if (c4345.mo13847(jLongValue) && C17359.equals(c4345.mo13849(jLongValue), entry.getValue())) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        C4345 c4345 = this.f58340;
        int iM13845 = c4345.m13845(jLongValue);
        if (iM13845 == -1 || !C17359.equals(value, c4345.f15715[iM13845])) {
            return false;
        }
        int i = (c4345.f15714 - iM13845) - 1;
        long[] jArr = c4345.f15719;
        int i2 = iM13845 + 1;
        System.arraycopy(jArr, i2, jArr, iM13845, i);
        Object[] objArr = c4345.f15715;
        System.arraycopy(objArr, i2, objArr, iM13845, i);
        int i3 = c4345.f15714 - 1;
        c4345.f15714 = i3;
        c4345.f15715[i3] = null;
        return true;
    }
}
