package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.᩸֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22482 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f72766 = new C13640();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f72765 = new C4582();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f72767 = new C21736();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f72768 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50715(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        f72768 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50714(long j, boolean z, boolean z2) {
        int i = f72768;
        if (i == 1) {
            return ((C10547) f72765.get()).m26995(j, z, z2);
        }
        if (i == 2) {
            return ((C10547) f72767.get()).m26995(j, z, z2);
        }
        return ((C10547) f72766.get()).m26995(j, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50713(long j) {
        C10547 c10547;
        int i = f72768;
        if (i == 1) {
            c10547 = (C10547) f72765.get();
        } else if (i == 2) {
            c10547 = (C10547) f72767.get();
        } else {
            c10547 = (C10547) f72766.get();
        }
        return c10547.f33527.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m50716(long j) {
        C10547 c10547;
        int i = f72768;
        if (i == 1) {
            c10547 = (C10547) f72765.get();
        } else if (i == 2) {
            c10547 = (C10547) f72767.get();
        } else {
            c10547 = (C10547) f72766.get();
        }
        return c10547.f33526.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50718(long j) {
        C10547 c10547;
        int i = f72768;
        if (i == 1) {
            c10547 = (C10547) f72765.get();
        } else if (i == 2) {
            c10547 = (C10547) f72767.get();
        } else {
            c10547 = (C10547) f72766.get();
        }
        return c10547.f33525.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50711(String str) {
        try {
            int i = f72768;
            if (i != 1) {
                return i != 2 ? ((C10547) f72766.get()).f33527.parse(str).getTime() : ((C10547) f72767.get()).f33527.parse(str).getTime();
            }
            return ((C10547) f72765.get()).f33527.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m50717(String str) {
        try {
            int i = f72768;
            if (i != 1) {
                return i != 2 ? ((C10547) f72766.get()).f33525.parse(str).getTime() : ((C10547) f72767.get()).f33525.parse(str).getTime();
            }
            return ((C10547) f72765.get()).f33525.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50712() {
        int i = f72768;
        if (i != 1) {
            return i != 2 ? "yyyy-MM-dd HH:mm:ss" : "HH:mm:ss dd-MM-yyyy";
        }
        return "dd-MM-yyyy HH:mm:ss";
    }
}
