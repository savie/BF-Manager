package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3249 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f12081;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15682 f12082;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f12085;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12086;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f12087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16387 f12084 = new C16387();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f12083 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m9731(C3249 c3249, String str) {
        c3249.f12081 = C12859.m31870(str);
        c3249.f12087 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9727(C3249 c3249, String str) {
        c3249.f12086 = C12859.m31870(str);
        c3249.f12085 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m9725(C3249 c3249) {
        if (!c3249.f12087 || !c3249.f12085) {
            throw new IllegalStateException("Syntax dependencies are not fully loaded");
        }
        return ((c3249.f12081 + 127224) * 31) + c3249.f12086;
    }
}
