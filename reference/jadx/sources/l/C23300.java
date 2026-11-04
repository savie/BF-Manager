package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public final class C23300 extends AbstractC3074 implements InterfaceC21808, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f75463;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C23300(C24046 c24046) {
        this.f75463 = c24046;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C5400(this.f75463);
    }

    @Override // l.InterfaceC21808
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo49462() {
        return new C11365(this.f75463);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C1671(this.f75463);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Float)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        float fFloatValue = ((Float) entry.getValue()).floatValue();
        C24046 c24046 = this.f75463;
        if (iIntValue != 0) {
            int[] iArr = c24046.f77781;
            int iM30015 = C11972.m30015(iIntValue) & c24046.f77776;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (Float.floatToRawIntBits(c24046.f77775[iM30015]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            } else {
                do {
                    iM30015 = (iM30015 + 1) & c24046.f77776;
                    i = iArr[iM30015];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (Float.floatToRawIntBits(c24046.f77775[iM30015]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            }
        } else if (!c24046.f77780 || Float.floatToRawIntBits(c24046.f77775[c24046.f77774]) != Float.floatToRawIntBits(fFloatValue)) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Float)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        float fFloatValue = ((Float) entry.getValue()).floatValue();
        C24046 c24046 = this.f75463;
        if (iIntValue == 0) {
            if (!c24046.f77780 || Float.floatToRawIntBits(c24046.f77775[c24046.f77774]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c24046.m53596();
            return true;
        }
        int[] iArr = c24046.f77781;
        int iM30015 = C11972.m30015(iIntValue) & c24046.f77776;
        int i = iArr[iM30015];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (Float.floatToRawIntBits(c24046.f77775[iM30015]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c24046.m53599(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c24046.f77776;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && Float.floatToRawIntBits(c24046.f77775[iM30015]) == Float.floatToRawIntBits(fFloatValue)) {
                c24046.m53599(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f75463.f77778;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f75463.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C24046 c24046 = this.f75463;
        if (c24046.f77780) {
            consumer.n(new C15840(c24046, c24046.f77774));
        }
        int[] iArr = c24046.f77781;
        int i = c24046.f77774;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C15840(c24046, i2));
            }
            i = i2;
        }
    }
}
