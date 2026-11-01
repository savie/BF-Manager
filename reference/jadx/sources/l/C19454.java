package l;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩵۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes4.dex */
public final class C19454 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f62625;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10678 f62626;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62628;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f62630;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f62631;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f62632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f62633;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f62634;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f62627 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f62629 = new LinkedHashSet();

    public C19454(String str, int i, int i2, boolean z) {
        this.f62634 = str;
        this.f62625 = i;
        this.f62632 = z;
        this.f62628 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19454 m44505(int i, String str) {
        return new C19454(str, i, -1, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19454 m44504(int i, int i2, String str) {
        C19454 c19454 = new C19454(str, i, i2, false);
        c19454.f62626 = C10678.m26888(i2);
        return c19454;
    }
}
