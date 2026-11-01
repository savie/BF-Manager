package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0087 extends AbstractC5543 implements InterfaceC17726, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f1001;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C0087(C10672 c10672) {
        this.f1001 = c10672;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C19138(this.f1001);
    }

    @Override // l.InterfaceC17726
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6269 mo1027() {
        return new C9966(this.f1001);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C8555(this.f1001);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        int iIntValue2 = ((Integer) entry.getValue()).intValue();
        C10672 c10672 = this.f1001;
        if (iIntValue != 0) {
            int[] iArr = c10672.f36415;
            int iM25125 = C9927.m25125(iIntValue) & c10672.f36412;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c10672.f36413[iM25125] != iIntValue2) {
                    return false;
                }
            } else {
                do {
                    iM25125 = (iM25125 + 1) & c10672.f36412;
                    i = iArr[iM25125];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c10672.f36413[iM25125] != iIntValue2) {
                    return false;
                }
            }
        } else if (!c10672.f36419 || c10672.f36413[c10672.f36416] != iIntValue2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        int iIntValue2 = ((Integer) entry.getValue()).intValue();
        C10672 c10672 = this.f1001;
        if (iIntValue == 0) {
            if (!c10672.f36419 || c10672.f36413[c10672.f36416] != iIntValue2) {
                return false;
            }
            c10672.m26873();
            return true;
        }
        int[] iArr = c10672.f36415;
        int iM25125 = C9927.m25125(iIntValue) & c10672.f36412;
        int i = iArr[iM25125];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c10672.f36413[iM25125] != iIntValue2) {
                return false;
            }
            c10672.m26876(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c10672.f36412;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c10672.f36413[iM25125] == iIntValue2) {
                c10672.m26876(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1001.f36410;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1001.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C10672 c10672 = this.f1001;
        if (c10672.f36419) {
            consumer.n(new C19844(c10672, c10672.f36416));
        }
        int[] iArr = c10672.f36415;
        int i = c10672.f36416;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C19844(c10672, i2));
            }
            i = i2;
        }
    }
}
