package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ITI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3648 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f12476;

    public C3648(HashMap map) {
        this.f12476 = map;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C25278.f81639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3648 m11819(List list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC13343 interfaceC13343 = (InterfaceC13343) it.next();
            if (interfaceC13343.getVisibility() != EnumC11105.SYSTEM) {
                map.put(interfaceC13343.mo17110(), interfaceC13343);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return new C3648(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m11820() {
        return this.f12476.values();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m11822() {
        HashMap map = this.f12476;
        return map.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(map.values());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m11821() {
        return this.f12476.isEmpty();
    }

    public final String toString() {
        return this.f12476.toString();
    }
}
