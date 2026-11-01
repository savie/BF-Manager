package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f47965;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f47966 = new HashMap(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4332 m35205() {
        if (!this.f47965) {
            this.f47965 = true;
            HashMap map = this.f47966;
            if (map.size() <= 0) {
                return new C9734(2);
            }
            return new C1971(C0561.unmodifiableMap(map));
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35207(AbstractC3382 abstractC3382) {
        if (!this.f47965) {
            Iterator it = abstractC3382.mo3243().iterator();
            while (it.hasNext()) {
                this.f47966.put((String) it.next(), abstractC3382);
            }
            return;
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35206(AbstractC3382 abstractC3382) {
        for (String str : abstractC3382.mo3243()) {
            HashMap map = this.f47966;
            if (!map.containsKey(str)) {
                map.put(str, abstractC3382);
            }
        }
    }
}
