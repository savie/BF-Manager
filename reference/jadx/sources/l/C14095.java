package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14095 extends AbstractC5543 implements InterfaceC8450, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7038 f46262;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C14095(C7038 c7038) {
        this.f46262 = c7038;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final Iterator iterator() {
        return new C9674(this);
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C9674(this);
    }

    @Override // l.InterfaceC8450
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo22108() {
        return new C3322(this);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C4921(this, 0, this.f46262.f23647);
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C7038 c7038 = this.f46262;
        int i = c7038.f23647;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C22561(c7038, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46262.f23647;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            C7038 c7038 = this.f46262;
            if (c7038.mo18877(jLongValue) && C13638.equals(c7038.mo18880(jLongValue), entry.getValue())) {
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
        C7038 c7038 = this.f46262;
        int iM18874 = c7038.m18874(jLongValue);
        if (iM18874 == -1 || !C13638.equals(value, c7038.f23645[iM18874])) {
            return false;
        }
        int i = (c7038.f23647 - iM18874) - 1;
        long[] jArr = c7038.f23649;
        int i2 = iM18874 + 1;
        System.arraycopy(jArr, i2, jArr, iM18874, i);
        Object[] objArr = c7038.f23645;
        System.arraycopy(objArr, i2, objArr, iM18874, i);
        int i3 = c7038.f23647 - 1;
        c7038.f23647 = i3;
        c7038.f23645[i3] = null;
        return true;
    }
}
