package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes5.dex */
public class C14307 extends C9086 implements Map, InterfaceC16613 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3121 f45172;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12070 f45173;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C24005 f45174;

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C1698.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1698.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C1698.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C1698.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34744(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m24224(map.size() + size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34746(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return size != size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34745(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m24220(size2))) {
                m24222(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C3121 c3121 = this.f45172;
        if (c3121 != null) {
            return c3121;
        }
        C3121 c3122 = new C3121(this);
        this.f45172 = c3122;
        return c3122;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C12070 c12070 = this.f45173;
        if (c12070 != null) {
            return c12070;
        }
        C12070 c12071 = new C12070(this);
        this.f45173 = c12071;
        return c12071;
    }

    @Override // java.util.Map
    public final Collection values() {
        C24005 c24005 = this.f45174;
        if (c24005 != null) {
            return c24005;
        }
        C24005 c24006 = new C24005(this);
        this.f45174 = c24006;
        return c24006;
    }
}
