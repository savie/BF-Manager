package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17031 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f55653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17031 m40121(String... strArr) {
        HashSet hashSet = new HashSet();
        hashSet.add("2025-11-25");
        for (String str : strArr) {
            C17359.requireNonNull(str, "supportedProtocolVersion");
            hashSet.add(str);
        }
        return new C17031(hashSet);
    }

    public C17031(HashSet hashSet) {
        this.f55653 = hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m40122(String str) {
        return this.f55653.contains(str) ? str : "2025-11-25";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40123(String str) {
        return this.f55653.contains(str);
    }
}
