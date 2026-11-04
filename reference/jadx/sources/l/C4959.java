package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4959 extends AbstractC3074 implements InterfaceC0179, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f17258;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C4959(C15399 c15399) {
        this.f17258 = c15399;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C9873(this.f17258);
    }

    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo1475() {
        return new C9127(this.f17258);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C0925(this.f17258);
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
        C15399 c15399 = this.f17258;
        if (iIntValue != 0) {
            int[] iArr = c15399.f50196;
            int iM30015 = C11972.m30015(iIntValue) & c15399.f50199;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c15399.f50195[iM30015] != iIntValue2) {
                    return false;
                }
            } else {
                do {
                    iM30015 = (iM30015 + 1) & c15399.f50199;
                    i = iArr[iM30015];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c15399.f50195[iM30015] != iIntValue2) {
                    return false;
                }
            }
        } else if (!c15399.f50203 || c15399.f50195[c15399.f50194] != iIntValue2) {
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
        C15399 c15399 = this.f17258;
        if (iIntValue == 0) {
            if (!c15399.f50203 || c15399.f50195[c15399.f50194] != iIntValue2) {
                return false;
            }
            c15399.m36864();
            return true;
        }
        int[] iArr = c15399.f50196;
        int iM30015 = C11972.m30015(iIntValue) & c15399.f50199;
        int i = iArr[iM30015];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c15399.f50195[iM30015] != iIntValue2) {
                return false;
            }
            c15399.m36867(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c15399.f50199;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c15399.f50195[iM30015] == iIntValue2) {
                c15399.m36867(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17258.f50197;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f17258.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C15399 c15399 = this.f17258;
        if (c15399.f50203) {
            consumer.n(new C13602(c15399, c15399.f50194));
        }
        int[] iArr = c15399.f50196;
        int i = c15399.f50194;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C13602(c15399, i2));
            }
            i = i2;
        }
    }
}
