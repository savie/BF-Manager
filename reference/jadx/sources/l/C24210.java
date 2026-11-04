package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes.dex */
public final class C24210 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21928 f78455;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f78456;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f78457 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f78454 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54203(C4072 c4072) {
        if (c4072.f34103 == -1) {
            C20436 c20436 = c4072.f13905;
            HashMap map = this.f78457;
            C4072 c4073 = (C4072) map.get(c20436);
            if (c4073 != null) {
                m54203(c4073);
            }
            C12231 c12231 = c4072.f13902;
            if (c12231 != null) {
                Iterator it = new C0299(c12231.f39367).iterator();
                while (it.hasNext()) {
                    C4072 c4074 = (C4072) map.get((C20436) it.next());
                    if (c4074 != null) {
                        m54203(c4074);
                    }
                }
            }
            int i = this.f78456;
            int i2 = this.f78454;
            this.f78454 = i2 + 1;
            this.f78456 = c4072.m27354(i, i2);
            map.remove(c4072.f13907);
        }
    }

    public C24210(C21928 c21928) {
        this.f78455 = c21928;
        for (C4072 c4072 : c21928.f51828) {
            this.f78457.put(c4072.f13907, c4072);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54204(int i) {
        this.f78456 = i;
        C21928 c21928 = this.f78455;
        C24738 c24738 = c21928.f51827;
        ArrayList arrayList = c21928.f51828;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4072) it.next()).f34103 = -1;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m54203((C4072) it2.next());
        }
        for (C4072 c4072 : this.f78457.values()) {
            arrayList.set(c4072.f34104, c4072);
        }
        return this.f78456;
    }
}
