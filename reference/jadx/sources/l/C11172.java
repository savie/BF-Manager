package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 659W */
/* JADX INFO: loaded from: classes4.dex */
public final class C11172 extends C13685 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f37851 = new HashMap();

    @Override // l.C13685
    public final C1998 get(Object obj) {
        return (C1998) this.f37851.get(obj);
    }

    @Override // l.C13685
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo28103(Object obj, Object obj2) {
        C1998 c1998 = get(obj);
        if (c1998 != null) {
            return c1998.f7459;
        }
        this.f37851.put(obj, m33391(obj, obj2));
        return null;
    }

    @Override // l.C13685
    public final Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f37851.remove(obj);
        return objRemove;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m28102(InterfaceC22591 interfaceC22591) {
        HashMap map = this.f37851;
        if (map.containsKey(interfaceC22591)) {
            return ((C1998) map.get(interfaceC22591)).f7457;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28104(InterfaceC22591 interfaceC22591) {
        return this.f37851.containsKey(interfaceC22591);
    }
}
