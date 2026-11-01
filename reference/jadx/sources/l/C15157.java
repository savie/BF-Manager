package l;

/* JADX INFO: renamed from: l.ܶۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D9BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15157 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f49511 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f49512 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f49513;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f49514;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f49515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long f49516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f49517;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36342(String str) {
        return str.endsWith(".apk") || str.endsWith(".apk.bak") || str.endsWith(".apk.1") || str.endsWith(".jar");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m36347(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36336(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m36348(int i) {
        f49512 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m36351(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36335() {
        return f49513;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36337(int i) {
        f49513 = i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m36345() {
        C2664.m8195();
        C11838.m29532();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m36346() {
        return f49515;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36353(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36352(int i) {
        f49515 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36338(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m36332() {
        return f49517;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m36333(int i) {
        f49517 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m36343() {
        return f49511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36340(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >>> 8) & 255);
        bArr[i + 2] = (byte) ((j >>> 16) & 255);
        bArr[i + 3] = (byte) ((j >>> 24) & 255);
        bArr[i + 4] = (byte) ((j >>> 32) & 255);
        bArr[i + 5] = (byte) ((j >>> 40) & 255);
        bArr[i + 6] = (byte) ((j >>> 48) & 255);
        bArr[i + 7] = (byte) ((j >>> 56) & 255);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m36344(int i) {
        f49511 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m36350() {
        return f49516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36339(long j) {
        f49516 = j;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m36334() {
        return f49514;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36341(boolean z) {
        f49514 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m36354() {
        return f49516 < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m36349() {
        return f49512 == -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m36331() {
        return f49512 == 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m36355() {
        f49512 = -1;
        f49513 = 0;
        f49515 = 0;
        f49517 = 0;
        f49511 = 0;
        f49516 = 0L;
        f49514 = false;
    }
}
