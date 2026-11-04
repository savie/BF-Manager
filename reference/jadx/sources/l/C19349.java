package l;

import java.io.File;

/* JADX INFO: renamed from: l.ᩳ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19349 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f62523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f62524;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int f62525;

    static {
        StringBuilder sb = new StringBuilder("Tencent");
        String str = File.separator;
        C4794.m14774(sb, str, "msflogs", str, "com");
        C4794.m14774(sb, str, "tencent", str, "mobileqq");
        sb.append(str);
        f62523 = sb.toString();
        f62525 = 1024;
        f62524 = C12669.m31438(new StringBuilder(), C24068.f77818, str, "logs");
    }
}
