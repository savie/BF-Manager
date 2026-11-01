package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C2203 extends AbstractC5543 implements InterfaceC16937, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f7954;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C2203(C3614 c3614) {
        this.f7954 = c3614;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C14821(this.f7954);
    }

    @Override // l.InterfaceC16937
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6269 mo6816() {
        return new C9882(this.f7954);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C2119(this.f7954);
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
        C3614 c3614 = this.f7954;
        if (iIntValue != 0) {
            int[] iArr = c3614.f13284;
            int iM25125 = C9927.m25125(iIntValue) & c3614.f13288;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (Float.floatToRawIntBits(c3614.f13289[iM25125]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            } else {
                do {
                    iM25125 = (iM25125 + 1) & c3614.f13288;
                    i = iArr[iM25125];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (Float.floatToRawIntBits(c3614.f13289[iM25125]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            }
        } else if (!c3614.f13290 || Float.floatToRawIntBits(c3614.f13289[c3614.f13287]) != Float.floatToRawIntBits(fFloatValue)) {
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
        C3614 c3614 = this.f7954;
        if (iIntValue == 0) {
            if (!c3614.f13290 || Float.floatToRawIntBits(c3614.f13289[c3614.f13287]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c3614.m10707();
            return true;
        }
        int[] iArr = c3614.f13284;
        int iM25125 = C9927.m25125(iIntValue) & c3614.f13288;
        int i = iArr[iM25125];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (Float.floatToRawIntBits(c3614.f13289[iM25125]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c3614.m10710(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c3614.f13288;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && Float.floatToRawIntBits(c3614.f13289[iM25125]) == Float.floatToRawIntBits(fFloatValue)) {
                c3614.m10710(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7954.f13294;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7954.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C3614 c3614 = this.f7954;
        if (c3614.f13290) {
            consumer.n(new C11377(c3614, c3614.f13287));
        }
        int[] iArr = c3614.f13284;
        int i = c3614.f13287;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C11377(c3614, i2));
            }
            i = i2;
        }
    }
}
