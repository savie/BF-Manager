package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3314 extends AbstractC3074 implements InterfaceC22706, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f10817;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C3314(C4060 c4060) {
        this.f10817 = c4060;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C1823(this.f10817);
    }

    @Override // l.InterfaceC22706
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15224 mo10931() {
        return new C24944(this.f10817);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C11517(this.f10817);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C4060 c4060 = this.f10817;
        if (key != null) {
            Object[] objArr = c4060.f13849;
            int iM30015 = C11972.m30015(key.hashCode()) & c4060.f13859;
            Object obj3 = objArr[iM30015];
            if (obj3 == null) {
                return false;
            }
            if (!key.equals(obj3)) {
                do {
                    iM30015 = (iM30015 + 1) & c4060.f13859;
                    obj2 = objArr[iM30015];
                    if (obj2 == null) {
                        return false;
                    }
                } while (!key.equals(obj2));
                if (c4060.f13854[iM30015] != iIntValue) {
                    return false;
                }
            } else if (c4060.f13854[iM30015] != iIntValue) {
                return false;
            }
        } else if (!c4060.f13857 || c4060.f13854[c4060.f13855] != iIntValue) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C4060 c4060 = this.f10817;
        if (key == null) {
            if (!c4060.f13857 || c4060.f13854[c4060.f13855] != iIntValue) {
                return false;
            }
            c4060.m13093();
            return true;
        }
        Object[] objArr = c4060.f13849;
        int iM30015 = C11972.m30015(key.hashCode()) & c4060.f13859;
        Object obj2 = objArr[iM30015];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(key)) {
            if (c4060.f13854[iM30015] != iIntValue) {
                return false;
            }
            c4060.m13098(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c4060.f13859;
            Object obj3 = objArr[iM30015];
            if (obj3 == null) {
                return false;
            }
            if (obj3.equals(key) && c4060.f13854[iM30015] == iIntValue) {
                c4060.m13098(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10817.f13851;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10817.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C4060 c4060 = this.f10817;
        if (c4060.f13857) {
            consumer.n(new C23452(c4060, c4060.f13855));
        }
        Object[] objArr = c4060.f13849;
        int i = c4060.f13855;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C23452(c4060, i2));
            }
            i = i2;
        }
    }
}
