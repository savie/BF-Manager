package l;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܶۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6N1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15878 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f51633;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f51634 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Float m37849(String str) {
        return str.length() <= 128 ? (Float) this.f51634.get(str) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37850() {
        this.f51634.clear();
        this.f51633 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37851(String str, Float f) {
        if (str.length() > 128) {
            return;
        }
        if (this.f51634.put(str, f) == null) {
            this.f51633 += str.length();
        }
        Iterator it = this.f51634.keySet().iterator();
        while (true) {
            if (this.f51634.size() <= 1024 && this.f51633 <= 32768) {
                return;
            }
            this.f51633 -= ((String) it.next()).length();
            it.remove();
        }
    }
}
