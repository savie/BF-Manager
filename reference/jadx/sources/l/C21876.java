package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21876 extends AbstractC5543 implements InterfaceC11999, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f70982;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C21876(C9177 c9177) {
        this.f70982 = c9177;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C22582(this.f70982);
    }

    @Override // l.InterfaceC11999
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo29885() {
        return new C13410(this.f70982);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C1414(this.f70982);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Byte)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        byte bByteValue = ((Byte) entry.getValue()).byteValue();
        C9177 c9177 = this.f70982;
        if (iIntValue != 0) {
            int[] iArr = c9177.f31228;
            int iM25125 = C9927.m25125(iIntValue) & c9177.f31232;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c9177.f31233[iM25125] != bByteValue) {
                    return false;
                }
            } else {
                do {
                    iM25125 = (iM25125 + 1) & c9177.f31232;
                    i = iArr[iM25125];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c9177.f31233[iM25125] != bByteValue) {
                    return false;
                }
            }
        } else if (!c9177.f31234 || c9177.f31233[c9177.f31231] != bByteValue) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Byte)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        byte bByteValue = ((Byte) entry.getValue()).byteValue();
        C9177 c9177 = this.f70982;
        if (iIntValue == 0) {
            if (!c9177.f31234 || c9177.f31233[c9177.f31231] != bByteValue) {
                return false;
            }
            c9177.m23605();
            return true;
        }
        int[] iArr = c9177.f31228;
        int iM25125 = C9927.m25125(iIntValue) & c9177.f31232;
        int i = iArr[iM25125];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c9177.f31233[iM25125] != bByteValue) {
                return false;
            }
            c9177.m23608(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c9177.f31232;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c9177.f31233[iM25125] == bByteValue) {
                c9177.m23608(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f70982.f31238;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f70982.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C9177 c9177 = this.f70982;
        if (c9177.f31234) {
            consumer.n(new C15527(c9177, c9177.f31231));
        }
        int[] iArr = c9177.f31228;
        int i = c9177.f31231;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C15527(c9177, i2));
            }
            i = i2;
        }
    }
}
