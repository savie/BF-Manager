package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public final class C22748 extends AbstractC5543 implements InterfaceC1849, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f74090;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C22748(C7931 c7931) {
        this.f74090 = c7931;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C2285(this.f74090);
    }

    @Override // l.InterfaceC1849
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo6012() {
        return new C22042(this.f74090);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C5108(this.f74090);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C7931 c7931 = this.f74090;
        if (iIntValue == 0) {
            return c7931.f26053 && C13638.equals(c7931.f26047[c7931.f26057], value);
        }
        int[] iArr = c7931.f26054;
        int iM25125 = C9927.m25125(iIntValue) & c7931.f26055;
        int i2 = iArr[iM25125];
        if (i2 == 0) {
            return false;
        }
        if (iIntValue == i2) {
            return C13638.equals(c7931.f26047[iM25125], value);
        }
        do {
            iM25125 = (iM25125 + 1) & c7931.f26055;
            i = iArr[iM25125];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return C13638.equals(c7931.f26047[iM25125], value);
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
        C7931 c7931 = this.f74090;
        if (iIntValue == 0) {
            if (!c7931.f26053 || !C13638.equals(c7931.f26047[c7931.f26057], value)) {
                return false;
            }
            c7931.m20938();
            return true;
        }
        int[] iArr = c7931.f26054;
        int iM25125 = C9927.m25125(iIntValue) & c7931.f26055;
        int i = iArr[iM25125];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (!C13638.equals(c7931.f26047[iM25125], value)) {
                return false;
            }
            c7931.m20943(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c7931.f26055;
            int i2 = iArr[iM25125];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && C13638.equals(c7931.f26047[iM25125], value)) {
                c7931.m20943(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f74090.f26052;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f74090.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C7931 c7931 = this.f74090;
        if (c7931.f26053) {
            consumer.n(new C6519(c7931, c7931.f26057));
        }
        int[] iArr = c7931.f26054;
        int i = c7931.f26057;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C6519(c7931, i2));
            }
            i = i2;
        }
    }
}
