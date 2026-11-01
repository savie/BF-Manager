package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۧۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f37219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10947 m27462(String... strArr) {
        HashSet hashSet = new HashSet();
        hashSet.add("2025-11-25");
        for (String str : strArr) {
            C13638.requireNonNull(str, "supportedProtocolVersion");
            hashSet.add(str);
        }
        return new C10947(hashSet);
    }

    public C10947(HashSet hashSet) {
        this.f37219 = hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27463(String str) {
        return this.f37219.contains(str) ? str : "2025-11-25";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m27464(String str) {
        return this.f37219.contains(str);
    }
}
