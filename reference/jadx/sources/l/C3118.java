package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3118 extends AbstractC3074 implements InterfaceC22510, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f10092;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C3118(C3864 c3864) {
        this.f10092 = c3864;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C1627(this.f10092);
    }

    @Override // l.InterfaceC22510
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo2045() {
        return new C24748(this.f10092);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C11321(this.f10092);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C3864 c3864 = this.f10092;
        if (c3864.f13186.mo25786(key, null)) {
            return c3864.f13190 && C17359.equals(c3864.f13184[c3864.f13187], value);
        }
        Object[] objArr = c3864.f13181;
        int iM30015 = C11972.m30015(c3864.f13186.mo25785(key)) & c3864.f13192;
        Object obj3 = objArr[iM30015];
        if (obj3 == null) {
            return false;
        }
        if (c3864.f13186.mo25786(key, obj3)) {
            return C17359.equals(c3864.f13184[iM30015], value);
        }
        do {
            iM30015 = (iM30015 + 1) & c3864.f13192;
            obj2 = objArr[iM30015];
            if (obj2 == null) {
                return false;
            }
        } while (!c3864.f13186.mo25786(key, obj2));
        return C17359.equals(c3864.f13184[iM30015], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C3864 c3864 = this.f10092;
        if (c3864.f13186.mo25786(key, null)) {
            if (!c3864.f13190 || !C17359.equals(c3864.f13184[c3864.f13187], value)) {
                return false;
            }
            c3864.m12499();
            return true;
        }
        Object[] objArr = c3864.f13181;
        int iM30015 = C11972.m30015(c3864.f13186.mo25785(key)) & c3864.f13192;
        Object obj2 = objArr[iM30015];
        if (obj2 == null) {
            return false;
        }
        if (c3864.f13186.mo25786(obj2, key)) {
            if (!C17359.equals(c3864.f13184[iM30015], value)) {
                return false;
            }
            c3864.m12500(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c3864.f13192;
            Object obj3 = objArr[iM30015];
            if (obj3 == null) {
                return false;
            }
            if (c3864.f13186.mo25786(obj3, key) && C17359.equals(c3864.f13184[iM30015], value)) {
                c3864.m12500(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10092.f13183;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10092.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C3864 c3864 = this.f10092;
        if (c3864.f13190) {
            consumer.n(new C23256(c3864, c3864.f13187));
        }
        Object[] objArr = c3864.f13181;
        int i = c3864.f13187;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.n(new C23256(c3864, i2));
            }
            i = i2;
        }
    }
}
