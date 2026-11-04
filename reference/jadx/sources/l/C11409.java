package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11409 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f35882 = new HashMap(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11528 m28756() {
        if (!this.f35881) {
            this.f35881 = true;
            HashMap map = this.f35882;
            if (map.size() <= 0) {
                return new C16630();
            }
            return new C24836(C4681.unmodifiableMap(map));
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28758(AbstractC17376 abstractC17376) {
        if (!this.f35881) {
            Iterator it = abstractC17376.mo12251().iterator();
            while (it.hasNext()) {
                this.f35882.put((String) it.next(), abstractC17376);
            }
            return;
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28757(AbstractC17376 abstractC17376) {
        for (String str : abstractC17376.mo12251()) {
            HashMap map = this.f35882;
            if (!map.containsKey(str)) {
                map.put(str, abstractC17376);
            }
        }
    }
}
