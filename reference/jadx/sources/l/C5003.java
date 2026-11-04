package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5003 extends AbstractC3074 implements InterfaceC3511, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2020 f17370;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C5003(C2020 c2020) {
        this.f17370 = c2020;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8775(this);
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C8775(this);
    }

    @Override // l.InterfaceC3511
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo11512() {
        return new C7284(this);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C13995(this, 0, this.f17370.f6731);
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C2020 c2020 = this.f17370;
        int i = c2020.f6731;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C19919(c2020, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17370.f6731;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character) && entry.getValue() != null && (entry.getValue() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C2020 c2020 = this.f17370;
            if (c2020.mo6944(cCharValue) && c2020.mo6946(cCharValue) == ((Character) entry.getValue()).charValue()) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Character) || entry.getValue() == null || !(entry.getValue() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        char cCharValue2 = ((Character) entry.getValue()).charValue();
        C2020 c2020 = this.f17370;
        int iM6941 = c2020.m6941(cCharValue);
        if (iM6941 == -1 || cCharValue2 != c2020.f6732[iM6941]) {
            return false;
        }
        int i = (c2020.f6731 - iM6941) - 1;
        char[] cArr = c2020.f6736;
        int i2 = iM6941 + 1;
        System.arraycopy(cArr, i2, cArr, iM6941, i);
        char[] cArr2 = c2020.f6732;
        System.arraycopy(cArr2, i2, cArr2, iM6941, i);
        c2020.f6731--;
        return true;
    }
}
