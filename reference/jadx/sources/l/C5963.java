package l;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAVA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5963 extends AbstractC23863 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f20411;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f20412;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2759 f20413;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f20414;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f20415;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Collection f20416;

    @Override // l.AbstractC23863
    /* JADX INFO: renamed from: ۙ */
    public final void mo4587(C2759 c2759, Object obj, Type type, Map map) {
    }

    public C5963(C2759 c2759, List list, int i) {
        super(null, null);
        this.f20413 = c2759;
        this.f20415 = i;
        this.f20412 = list;
        this.f20414 = null;
        this.f20411 = null;
        this.f20416 = null;
    }

    public C5963(Map map, Object obj) {
        super(null, null);
        this.f20413 = null;
        this.f20415 = -1;
        this.f20412 = null;
        this.f20414 = obj;
        this.f20411 = map;
        this.f20416 = null;
    }

    public C5963(Collection collection) {
        super(null, null);
        this.f20413 = null;
        this.f20415 = -1;
        this.f20412 = null;
        this.f20414 = null;
        this.f20411 = null;
        this.f20416 = collection;
    }

    @Override // l.AbstractC23863
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17349(Object obj, Object obj2) {
        C6489 c6489;
        Object objM18320;
        Map map = this.f20411;
        if (map != null) {
            map.put(this.f20414, obj2);
            return;
        }
        Collection collection = this.f20416;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        List list = this.f20412;
        int i = this.f20415;
        list.set(i, obj2);
        if (!(list instanceof C6489) || (objM18320 = (c6489 = (C6489) list).m18320()) == null || Array.getLength(objM18320) <= i) {
            return;
        }
        if (c6489.m18326() != null) {
            obj2 = C3134.m10217(obj2, c6489.m18326(), this.f20413.f9130);
        }
        Array.set(objM18320, i, obj2);
    }
}
