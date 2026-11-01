package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۬᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f44276 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map f44277;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Map m32852() {
        if (this.f44277 == null) {
            this.f44277 = C0561.unmodifiableMap(new HashMap(this.f44276));
        }
        return this.f44277;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m32853(Map map) {
        this.f44277 = null;
        this.f44276.clear();
        this.f44276.putAll(map);
    }
}
