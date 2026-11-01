package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۚۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5319 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f18364 = new C4613();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f18363 = new C13787();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f18365 = new C11670();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f18362 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14741(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        f18362 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14740(long j, boolean z, boolean z2) {
        int i = f18362;
        if (i == 1) {
            return ((C2496) f18363.get()).m7628(j, z, z2);
        }
        if (i == 2) {
            return ((C2496) f18365.get()).m7628(j, z, z2);
        }
        return ((C2496) f18364.get()).m7628(j, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14739(long j) {
        C2496 c2496;
        int i = f18362;
        if (i == 1) {
            c2496 = (C2496) f18363.get();
        } else if (i == 2) {
            c2496 = (C2496) f18365.get();
        } else {
            c2496 = (C2496) f18364.get();
        }
        return c2496.f9904.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m14742(long j) {
        C2496 c2496;
        int i = f18362;
        if (i == 1) {
            c2496 = (C2496) f18363.get();
        } else if (i == 2) {
            c2496 = (C2496) f18365.get();
        } else {
            c2496 = (C2496) f18364.get();
        }
        return c2496.f9903.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m14744(long j) {
        C2496 c2496;
        int i = f18362;
        if (i == 1) {
            c2496 = (C2496) f18363.get();
        } else if (i == 2) {
            c2496 = (C2496) f18365.get();
        } else {
            c2496 = (C2496) f18364.get();
        }
        return c2496.f9902.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m14737(String str) {
        try {
            int i = f18362;
            if (i != 1) {
                return i != 2 ? ((C2496) f18364.get()).f9904.parse(str).getTime() : ((C2496) f18365.get()).f9904.parse(str).getTime();
            }
            return ((C2496) f18363.get()).f9904.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m14743(String str) {
        try {
            int i = f18362;
            if (i != 1) {
                return i != 2 ? ((C2496) f18364.get()).f9902.parse(str).getTime() : ((C2496) f18365.get()).f9902.parse(str).getTime();
            }
            return ((C2496) f18363.get()).f9902.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14738() {
        int i = f18362;
        if (i != 1) {
            return i != 2 ? "yyyy-MM-dd HH:mm:ss" : "HH:mm:ss dd-MM-yyyy";
        }
        return "dd-MM-yyyy HH:mm:ss";
    }
}
