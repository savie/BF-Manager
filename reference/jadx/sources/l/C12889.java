package l;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAVA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12889 extends AbstractC18533 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f42852;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Map f42853;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Collection f42854;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14265 f42855;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f42856;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f42857;

    @Override // l.AbstractC18533
    /* JADX INFO: renamed from: ۙ */
    public final void mo7044(C14265 c14265, Object obj, Type type, Map map) {
    }

    public C12889(C14265 c14265, List list, int i) {
        super(null, null);
        this.f42855 = c14265;
        this.f42857 = i;
        this.f42856 = list;
        this.f42852 = null;
        this.f42853 = null;
        this.f42854 = null;
    }

    public C12889(Map map, Object obj) {
        super(null, null);
        this.f42855 = null;
        this.f42857 = -1;
        this.f42856 = null;
        this.f42852 = obj;
        this.f42853 = map;
        this.f42854 = null;
    }

    public C12889(Collection collection) {
        super(null, null);
        this.f42855 = null;
        this.f42857 = -1;
        this.f42856 = null;
        this.f42852 = null;
        this.f42853 = null;
        this.f42854 = collection;
    }

    @Override // l.AbstractC18533
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo31963(Object obj, Object obj2) {
        C10031 c10031;
        Object objM25306;
        Map map = this.f42853;
        if (map != null) {
            map.put(this.f42852, obj2);
            return;
        }
        Collection collection = this.f42854;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        List list = this.f42856;
        int i = this.f42857;
        list.set(i, obj2);
        if (!(list instanceof C10031) || (objM25306 = (c10031 = (C10031) list).m25306()) == null || Array.getLength(objM25306) <= i) {
            return;
        }
        if (c10031.m25309() != null) {
            obj2 = C8219.m21512(obj2, c10031.m25309(), this.f42855.f46686);
        }
        Array.set(objM25306, i, obj2);
    }
}
