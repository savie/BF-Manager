package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19400 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f62692 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Map f62693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Map m44854() {
        if (this.f62693 == null) {
            this.f62693 = C4681.unmodifiableMap(new HashMap(this.f62692));
        }
        return this.f62693;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m44855(Map map) {
        this.f62693 = null;
        this.f62692.clear();
        this.f62692.putAll(map);
    }
}
