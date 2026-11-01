package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.᩸ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21338 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f69448 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69447 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Stack f69446 = new Stack();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f69449 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47871(C2806 c2806) {
        Boolean bool = (Boolean) this.f69448.get(c2806);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = (Boolean) this.f69448.get(c2806);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return m47870(c2806).f74092.f48913;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C22750 m47870(C2806 c2806) {
        C22750 c22750;
        ArrayList arrayList;
        boolean z;
        C14989 c14989;
        int i = this.f69447;
        this.f69447 = i + 1;
        C22750 c22751 = new C22750(c2806, i);
        Stack stack = this.f69446;
        stack.push(c22751);
        HashMap map = this.f69449;
        map.put(c2806, c22751);
        for (C19741 c19741 : c2806.getFields()) {
            if (c19741.m44913() == EnumC19035.MESSAGE) {
                C22750 c22752 = (C22750) map.get(c19741.m44907());
                if (c22752 == null) {
                    c22751.f74091 = Math.min(c22751.f74091, m47870(c19741.m44907()).f74091);
                } else if (c22752.f74092 == null) {
                    c22751.f74091 = Math.min(c22751.f74091, c22752.f74091);
                }
            }
        }
        if (c22751.f74093 == c22751.f74091) {
            C14989 c149810 = new C14989();
            do {
                c22750 = (C22750) stack.pop();
                c22750.f74092 = c149810;
                C2806 c2807 = c22750.f74094;
                arrayList = c149810.f48912;
                arrayList.add(c2807);
            } while (c22750 != c22751);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C2806 c2808 = (C2806) it.next();
                z = true;
                if (c2808.m8531()) {
                    break;
                }
                for (C19741 c19742 : c2808.getFields()) {
                    if (c19742.m44914() || (c19742.m44913() == EnumC19035.MESSAGE && (c14989 = ((C22750) map.get(c19742.m44907())).f74092) != c149810 && c14989.f48913)) {
                        break loop2;
                    }
                }
            }
            c149810.f48913 = z;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f69448.put((C2806) it2.next(), Boolean.valueOf(c149810.f48913));
            }
        }
        return c22751;
    }
}
