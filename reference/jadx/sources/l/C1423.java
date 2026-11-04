package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.֨᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1423 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f5010 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5009 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Stack f5012 = new Stack();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f5011 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5160(C24478 c24478) {
        Boolean bool = (Boolean) this.f5010.get(c24478);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = (Boolean) this.f5010.get(c24478);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return m5159(c24478).f62415.f32993;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C19322 m5159(C24478 c24478) {
        C19322 c19322;
        ArrayList arrayList;
        boolean z;
        C10371 c10371;
        int i = this.f5009;
        this.f5009 = i + 1;
        C19322 c19323 = new C19322(c24478, i);
        Stack stack = this.f5012;
        stack.push(c19323);
        HashMap map = this.f5011;
        map.put(c24478, c19323);
        for (C7323 c7323 : c24478.getFields()) {
            if (c7323.m20086() == EnumC2848.MESSAGE) {
                C19322 c19324 = (C19322) map.get(c7323.m20093());
                if (c19324 == null) {
                    c19323.f62418 = Math.min(c19323.f62418, m5159(c7323.m20093()).f62418);
                } else if (c19324.f62415 == null) {
                    c19323.f62418 = Math.min(c19323.f62418, c19324.f62418);
                }
            }
        }
        if (c19323.f62416 == c19323.f62418) {
            C10371 c10372 = new C10371();
            do {
                c19322 = (C19322) stack.pop();
                c19322.f62415 = c10372;
                C24478 c24479 = c19322.f62417;
                arrayList = c10372.f32992;
                arrayList.add(c24479);
            } while (c19322 != c19323);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C24478 c244710 = (C24478) it.next();
                z = true;
                if (c244710.m54739()) {
                    break;
                }
                for (C7323 c7324 : c244710.getFields()) {
                    if (c7324.m20090() || (c7324.m20086() == EnumC2848.MESSAGE && (c10371 = ((C19322) map.get(c7324.m20093())).f62415) != c10372 && c10371.f32993)) {
                        break loop2;
                    }
                }
            }
            c10372.f32993 = z;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f5010.put((C24478) it2.next(), Boolean.valueOf(c10372.f32993));
            }
        }
        return c19323;
    }
}
