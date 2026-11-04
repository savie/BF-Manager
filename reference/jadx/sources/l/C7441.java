package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 659W */
/* JADX INFO: loaded from: classes4.dex */
public final class C7441 extends C15053 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HashMap f24494 = new HashMap();

    @Override // l.C15053
    public final C21767 get(Object obj) {
        return (C21767) this.f24494.get(obj);
    }

    @Override // l.C15053
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo20394(Object obj, Object obj2) {
        C21767 c21767 = get(obj);
        if (c21767 != null) {
            return c21767.f69412;
        }
        this.f24494.put(obj, m36205(obj, obj2));
        return null;
    }

    @Override // l.C15053
    public final Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f24494.remove(obj);
        return objRemove;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m20393(InterfaceC22406 interfaceC22406) {
        HashMap map = this.f24494;
        if (map.containsKey(interfaceC22406)) {
            return ((C21767) map.get(interfaceC22406)).f69414;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20395(InterfaceC22406 interfaceC22406) {
        return this.f24494.containsKey(interfaceC22406);
    }
}
