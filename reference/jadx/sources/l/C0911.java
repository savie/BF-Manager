package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6ZJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7623 f3412;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f3413;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f3414;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC20059 f3415;

    public C0911(String str, EnumC20059 enumC20059, EnumC7623 enumC7623, boolean z) {
        C17359.requireNonNull(str, MotionUtils.EASING_TYPE_PATH);
        this.f3413 = str;
        C17359.requireNonNull(enumC20059, "targetType");
        this.f3415 = enumC20059;
        C17359.requireNonNull(enumC7623, am.Q);
        this.f3412 = enumC7623;
        this.f3414 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3682() {
        return this.f3413.equals("/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3681(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Root rule is required");
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            C0911 c0911 = (C0911) list.get(i);
            if (!hashSet.add(c0911.f3413)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
            if (c0911.m3682() != (i == list.size() - 1) || (c0911.m3682() && c0911.f3415 != EnumC20059.DIRECTORY)) {
                throw new IllegalArgumentException("Root directory rule must be last");
            }
            i++;
        }
    }
}
