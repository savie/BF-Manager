package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes2.dex */
public final class C22769 extends AbstractC5543 implements InterfaceC1558, InterfaceC22810 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f74144;

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C22769(C7952 c7952) {
        this.f74144 = c7952;
    }

    @Override // l.AbstractC14695, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC0624, l.InterfaceC18660, java.util.Set
    public final InterfaceC6269 iterator() {
        return new C2306(this.f74144);
    }

    @Override // l.InterfaceC1558
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6269 mo5338() {
        return new C22063(this.f74144);
    }

    @Override // l.AbstractC14695, java.util.Collection, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC7371 spliterator() {
        return new C5129(this.f74144);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        char c;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C7952 c7952 = this.f74144;
        if (cCharValue == 0) {
            return c7952.f26122 && C13638.equals(c7952.f26116[c7952.f26126], value);
        }
        char[] cArr = c7952.f26123;
        int iM25125 = C9927.m25125((int) cCharValue) & c7952.f26124;
        char c2 = cArr[iM25125];
        if (c2 == 0) {
            return false;
        }
        if (cCharValue == c2) {
            return C13638.equals(c7952.f26116[iM25125], value);
        }
        do {
            iM25125 = (iM25125 + 1) & c7952.f26124;
            c = cArr[iM25125];
            if (c == 0) {
                return false;
            }
        } while (cCharValue != c);
        return C13638.equals(c7952.f26116[iM25125], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C7952 c7952 = this.f74144;
        if (cCharValue == 0) {
            if (!c7952.f26122 || !C13638.equals(c7952.f26116[c7952.f26126], value)) {
                return false;
            }
            c7952.m20982();
            return true;
        }
        char[] cArr = c7952.f26123;
        int iM25125 = C9927.m25125((int) cCharValue) & c7952.f26124;
        char c = cArr[iM25125];
        if (c == 0) {
            return false;
        }
        if (c == cCharValue) {
            if (!C13638.equals(c7952.f26116[iM25125], value)) {
                return false;
            }
            c7952.m20985(iM25125);
            return true;
        }
        while (true) {
            iM25125 = (iM25125 + 1) & c7952.f26124;
            char c2 = cArr[iM25125];
            if (c2 == 0) {
                return false;
            }
            if (c2 == cCharValue && C13638.equals(c7952.f26116[iM25125], value)) {
                c7952.m20985(iM25125);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f74144.f26121;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f74144.clear();
    }

    @Override // l.AbstractC14695, java.lang.Iterable, l.InterfaceC10441, l.InterfaceC16585
    public final void forEach(Consumer consumer) {
        C7952 c7952 = this.f74144;
        if (c7952.f26122) {
            consumer.n(new C6540(c7952, c7952.f26126));
        }
        char[] cArr = c7952.f26123;
        int i = c7952.f26126;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (cArr[i2] != 0) {
                consumer.n(new C6540(c7952, i2));
            }
            i = i2;
        }
    }
}
