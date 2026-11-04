package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18669 extends AbstractC3074 implements InterfaceC16431, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f60706;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C18669(C1516 c1516) {
        this.f60706 = c1516;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C20907(this.f60706);
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo38993() {
        return new C6737(this.f60706);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C12702(this.f60706);
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
        C1516 c1516 = this.f60706;
        if (iIntValue != 0) {
            int[] iArr = c1516.f5295;
            int iM30015 = C11972.m30015(iIntValue) & c1516.f5290;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c1516.f5289[iM30015] != bByteValue) {
                    return false;
                }
            } else {
                do {
                    iM30015 = (iM30015 + 1) & c1516.f5290;
                    i = iArr[iM30015];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c1516.f5289[iM30015] != bByteValue) {
                    return false;
                }
            }
        } else if (!c1516.f5294 || c1516.f5289[c1516.f5288] != bByteValue) {
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
        C1516 c1516 = this.f60706;
        if (iIntValue == 0) {
            if (!c1516.f5294 || c1516.f5289[c1516.f5288] != bByteValue) {
                return false;
            }
            c1516.m5386();
            return true;
        }
        int[] iArr = c1516.f5295;
        int iM30015 = C11972.m30015(iIntValue) & c1516.f5290;
        int i = iArr[iM30015];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c1516.f5289[iM30015] != bByteValue) {
                return false;
            }
            c1516.m5389(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c1516.f5290;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c1516.f5289[iM30015] == bByteValue) {
                c1516.m5389(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f60706.f5292;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f60706.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C1516 c1516 = this.f60706;
        if (c1516.f5294) {
            consumer.n(new C21653(c1516, c1516.f5288));
        }
        int[] iArr = c1516.f5295;
        int i = c1516.f5288;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C21653(c1516, i2));
            }
            i = i2;
        }
    }
}
