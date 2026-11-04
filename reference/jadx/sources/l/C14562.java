package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14562 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45879;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f45880;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45883;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11974 f45884;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17941 f45882 = new C17941();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f45878 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m35122(C14562 c14562, String str) {
        c14562.f45880 = C9341.m24589(str);
        c14562.f45881 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35118(C14562 c14562, String str) {
        c14562.f45883 = C9341.m24589(str);
        c14562.f45879 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m35123(C14562 c14562) {
        if (!c14562.f45881 || !c14562.f45879) {
            throw new IllegalStateException("Syntax dependencies are not fully loaded");
        }
        return ((c14562.f45880 + 127224) * 31) + c14562.f45883;
    }
}
