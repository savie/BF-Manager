package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T5BA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3700 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f12708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f12709;

    public C3700(int i, boolean z) {
        this.f12709 = z;
        this.f12708 = new HashSet(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12021(String str) {
        if (!this.f12709) {
            str = str.toLowerCase();
        }
        this.f12708.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12022(String str, String str2) {
        if (str2.isEmpty() || str2.contains("\\") || str2.contains("/")) {
            return false;
        }
        if (!this.f12709) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
        }
        if (str.equals(str2)) {
            return true;
        }
        HashSet hashSet = this.f12708;
        if (hashSet.contains(str2)) {
            return false;
        }
        hashSet.remove(str);
        hashSet.add(str2);
        return true;
    }
}
