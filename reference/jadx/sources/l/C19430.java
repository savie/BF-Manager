package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T5BA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19430 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f62586;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f62587;

    public C19430(int i, boolean z) {
        this.f62587 = z;
        this.f62586 = new HashSet(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44466(String str) {
        if (!this.f62587) {
            str = str.toLowerCase();
        }
        this.f62586.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44467(String str, String str2) {
        if (str2.isEmpty() || str2.contains("\\") || str2.contains("/")) {
            return false;
        }
        if (!this.f62587) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
        }
        if (str.equals(str2)) {
            return true;
        }
        HashSet hashSet = this.f62586;
        if (hashSet.contains(str2)) {
            return false;
        }
        hashSet.remove(str);
        hashSet.add(str2);
        return true;
    }
}
