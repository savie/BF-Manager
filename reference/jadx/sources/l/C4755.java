package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4755 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f16748 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16749 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19594 f16750;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16751;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13184(C13929 c13929) {
        if (c13929.f30807 == -1) {
            C1953 c1953 = c13929.f45863;
            HashMap map = this.f16748;
            C13929 c139210 = (C13929) map.get(c1953);
            if (c139210 != null) {
                m13184(c139210);
            }
            C9716 c9716 = c13929.f45865;
            if (c9716 != null) {
                Iterator it = new C22291(c9716.f32710).iterator();
                while (it.hasNext()) {
                    C13929 c139211 = (C13929) map.get((C1953) it.next());
                    if (c139211 != null) {
                        m13184(c139211);
                    }
                }
            }
            int i = this.f16751;
            int i2 = this.f16749;
            this.f16749 = i2 + 1;
            this.f16751 = c13929.m23326(i, i2);
            map.remove(c13929.f45864);
        }
    }

    public C4755(C19594 c19594) {
        this.f16750 = c19594;
        for (C13929 c13929 : c19594.f37761) {
            this.f16748.put(c13929.f45864, c13929);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13185(int i) {
        this.f16751 = i;
        C19594 c19594 = this.f16750;
        C12063 c12063 = c19594.f37759;
        ArrayList arrayList = c19594.f37761;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C13929) it.next()).f30807 = -1;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m13184((C13929) it2.next());
        }
        for (C13929 c13929 : this.f16748.values()) {
            arrayList.set(c13929.f30809, c13929);
        }
        return this.f16751;
    }
}
