package l;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܽۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17354 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f56469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public synchronized void m40751(C7208 c7208) {
        ((LinkedHashSet) this.f56469).remove(c7208);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m40753(C7208 c7208) {
        return ((LinkedHashSet) this.f56469).contains(c7208);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public synchronized void m40754(C7208 c7208) {
        ((LinkedHashSet) this.f56469).add(c7208);
    }

    public C17354(int i) {
        switch (i) {
            case 1:
                this.f56469 = new LinkedHashSet();
                break;
            default:
                this.f56469 = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40750(int i) {
        if (i < 0 || i > 6) {
            return;
        }
        ((LinkedHashMap) this.f56469).put(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m40752() {
        return ((LinkedHashMap) this.f56469).containsValue(4);
    }
}
