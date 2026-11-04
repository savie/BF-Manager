package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14917 extends AbstractC3074 implements InterfaceC2240, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f48715;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C14917(C19393 c19393) {
        this.f48715 = c19393;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C23869(this.f48715);
    }

    @Override // l.InterfaceC2240
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo7641() {
        return new C20885(this.f48715);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C3731(this.f48715);
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
        C19393 c19393 = this.f48715;
        if (cCharValue == 0) {
            return c19393.f62676 && C17359.equals(c19393.f62673[c19393.f62674], value);
        }
        char[] cArr = c19393.f62668;
        int iM30015 = C11972.m30015((int) cCharValue) & c19393.f62678;
        char c2 = cArr[iM30015];
        if (c2 == 0) {
            return false;
        }
        if (cCharValue == c2) {
            return C17359.equals(c19393.f62673[iM30015], value);
        }
        do {
            iM30015 = (iM30015 + 1) & c19393.f62678;
            c = cArr[iM30015];
            if (c == 0) {
                return false;
            }
        } while (cCharValue != c);
        return C17359.equals(c19393.f62673[iM30015], value);
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
        C19393 c19393 = this.f48715;
        if (cCharValue == 0) {
            if (!c19393.f62676 || !C17359.equals(c19393.f62673[c19393.f62674], value)) {
                return false;
            }
            c19393.m44849();
            return true;
        }
        char[] cArr = c19393.f62668;
        int iM30015 = C11972.m30015((int) cCharValue) & c19393.f62678;
        char c = cArr[iM30015];
        if (c == 0) {
            return false;
        }
        if (c == cCharValue) {
            if (!C17359.equals(c19393.f62673[iM30015], value)) {
                return false;
            }
            c19393.m44852(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c19393.f62678;
            char c2 = cArr[iM30015];
            if (c2 == 0) {
                return false;
            }
            if (c2 == cCharValue && C17359.equals(c19393.f62673[iM30015], value)) {
                c19393.m44852(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f48715.f62670;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f48715.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C19393 c19393 = this.f48715;
        if (c19393.f62676) {
            consumer.n(new C4477(c19393, c19393.f62674));
        }
        char[] cArr = c19393.f62668;
        int i = c19393.f62674;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (cArr[i2] != 0) {
                consumer.n(new C4477(c19393, i2));
            }
            i = i2;
        }
    }
}
