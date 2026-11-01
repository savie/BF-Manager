package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9422 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC13197 f31923;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC23533 f31924;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f31925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f31926;

    public C9422(String str, EnumC13197 enumC13197, EnumC23533 enumC23533, boolean z) {
        C13638.requireNonNull(str, MotionUtils.EASING_TYPE_PATH);
        this.f31925 = str;
        C13638.requireNonNull(enumC13197, "targetType");
        this.f31923 = enumC13197;
        C13638.requireNonNull(enumC23533, am.Q);
        this.f31924 = enumC23533;
        this.f31926 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24180() {
        return this.f31925.equals("/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24179(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Root rule is required");
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            C9422 c9422 = (C9422) list.get(i);
            if (!hashSet.add(c9422.f31925)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
            if (c9422.m24180() != (i == list.size() - 1) || (c9422.m24180() && c9422.f31923 != EnumC13197.DIRECTORY)) {
                throw new IllegalArgumentException("Root directory rule must be last");
            }
            i++;
        }
    }
}
