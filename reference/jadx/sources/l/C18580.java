package l;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X6N1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59078;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f59079 = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Float m42977(String str) {
        return str.length() <= 128 ? (Float) this.f59079.get(str) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42978() {
        this.f59079.clear();
        this.f59078 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42979(String str, Float f) {
        if (str.length() > 128) {
            return;
        }
        if (this.f59079.put(str, f) == null) {
            this.f59078 += str.length();
        }
        Iterator it = this.f59079.keySet().iterator();
        while (true) {
            if (this.f59079.size() <= 1024 && this.f59078 <= 32768) {
                return;
            }
            this.f59078 -= ((String) it.next()).length();
            it.remove();
        }
    }
}
