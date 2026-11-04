package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10178 extends AbstractC3074 implements InterfaceC2174, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f32587;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C10178(C22311 c22311) {
        this.f32587 = c22311;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0484(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C0484(this);
    }

    @Override // l.InterfaceC2174
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo7471() {
        return new C7942(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C19129(this, 0, this.f32587.f72228);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C22311 c22311 = this.f32587;
        int i = c22311.f72228;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C8687(c22311, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32587.f72228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C22311 c22311 = this.f32587;
            if (c22311.mo13467(iIntValue) && C17359.equals(c22311.get(iIntValue), entry.getValue())) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C22311 c22311 = this.f32587;
        int iM50372 = c22311.m50372(iIntValue);
        if (iM50372 == -1 || !C17359.equals(value, c22311.f72229[iM50372])) {
            return false;
        }
        int i = (c22311.f72228 - iM50372) - 1;
        int[] iArr = c22311.f72233;
        int i2 = iM50372 + 1;
        System.arraycopy(iArr, i2, iArr, iM50372, i);
        Object[] objArr = c22311.f72229;
        System.arraycopy(objArr, i2, objArr, iM50372, i);
        int i3 = c22311.f72228 - 1;
        c22311.f72228 = i3;
        c22311.f72229[i3] = null;
        return true;
    }
}
