package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIWH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0864 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9812 f3235;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21943 f3236;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f3237;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Set f3238;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21943 f3239;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2551 f3240;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 f3241;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18293 f3242;

    public C0864(C2551 c2551, C9812 c9812, C21943 c21943, C21943 c21944) {
        this(c2551, c9812, c21943, c21944, new C18293(c2551), new HashSet(), new ArrayList());
    }

    public C0864(C2551 c2551, C9812 c9812, C21943 c21943, C21943 c21944, C18293 c18293, Set set, List list) {
        this.f3240 = c2551;
        this.f3235 = c9812;
        this.f3236 = c21943;
        this.f3241 = c21944;
        this.f3242 = c18293;
        this.f3238 = set;
        this.f3237 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0864 m3511(C0864 c0864) {
        return new C0864(c0864.f3240, C9812.m25574(c0864.f3235), c0864.f3241, c0864.f3236, c0864.f3242, c0864.f3238, c0864.f3237);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3516(C0864... c0864Arr) {
        for (C0864 c0864 : c0864Arr) {
            this.f3242.m42622(c0864.f3242);
            this.f3238.addAll(c0864.f3238);
            m3514(c0864.f3237);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21943 m3518() {
        return this.f3242.getFirst();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18293 m3522() {
        return this.f3242;
    }

    public C0864(C21943 c21943, C0864 c0864) {
        this(c0864.f3240, c0864.f3235, c21943, null, c0864.f3242, c0864.f3238, c0864.f3237);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2551 m3521() {
        return this.f3240;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9812 m3513() {
        return this.f3235;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set m3517() {
        return this.f3238;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21943 m3512() {
        return this.f3236;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21943 m3523() {
        return this.f3241;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21943 m3520() {
        return this.f3239;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3515(C21943 c21943) {
        this.f3239 = c21943;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m3524() {
        return this.f3237;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3519() {
        this.f3237.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3514(List list) {
        this.f3237.addAll(list);
    }

    public final String toString() {
        return "IfInfo: then: " + this.f3236 + ", else: " + this.f3241;
    }
}
