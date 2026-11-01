package l;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۨ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12034 extends AbstractC11763 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21825 f40298;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f40299 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2068 f40297 = new C2068(null, Integer.MAX_VALUE);

    public AbstractC12034(C21825 c21825) {
        this.f40298 = c21825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2068 m29932(C8506 c8506) {
        HashMap map = this.f40299;
        C2068 c2068 = (C2068) map.get(c8506);
        if (c2068 == null) {
            LinkedHashSet linkedHashSet = c8506.f29480;
            Object obj = c8506.f22269;
            if (linkedHashSet.isEmpty()) {
                c2068 = new C2068(C21825.of((Object) c8506), Integer.valueOf(((C19003) obj).m43728()));
            } else {
                Iterator it = c8506.f29480.iterator();
                while (it.hasNext()) {
                    if (((C8506) it.next()) != c8506) {
                        c2068 = new C2068(C21825.of((Object) c8506), Integer.valueOf(((C19003) obj).m43728()));
                        for (C8506 c8507 : c8506.f29480) {
                            if (c8507 != c8506) {
                                C2068 c2068M29932 = m29932(c8507);
                                c2068 = new C2068(((C21825) c2068.f7664).m48594((C21825) c2068M29932.f7664), Integer.valueOf(((Integer) c2068M29932.f7665).intValue() + ((Integer) c2068.f7665).intValue()));
                            }
                        }
                    }
                }
                c2068 = new C2068(C21825.of((Object) c8506), Integer.valueOf(((C19003) obj).m43728()));
            }
            map.put(c8506, c2068);
        }
        return c2068;
    }

    @Override // l.AbstractC11763, l.InterfaceC7800
    /* JADX INFO: renamed from: ۙ */
    public final C8506 mo20468(C19795 c19795) {
        this.f40299.clear();
        C2068 c2068 = this.f40297;
        C2068 c2069 = c2068;
        for (C8506 c8506 : c19795.f63562) {
            if (!Collections.disjoint((Collection) c8506.f22269, this.f40298)) {
                C2068 c2068M29932 = m29932(c8506);
                if (((Integer) c2068M29932.f7665).intValue() < ((Integer) c2069.f7665).intValue()) {
                    c2069 = c2068M29932;
                }
            }
        }
        if (c2069 == c2068) {
            throw new C10623();
        }
        return (C8506) ((C21825) c2069.f7664).f70876;
    }
}
