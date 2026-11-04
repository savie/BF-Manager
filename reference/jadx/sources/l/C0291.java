package l;

import android.view.WindowInsetsAnimation;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0291 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13275 f1606;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13275 f1607;

    public C0291(C13275 c13275, C13275 c13276) {
        this.f1606 = c13275;
        this.f1607 = c13276;
    }

    public C0291(WindowInsetsAnimation.Bounds bounds) {
        this.f1606 = C21877.m49568(bounds);
        this.f1607 = C21877.m49566(bounds);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13275 m1856() {
        return this.f1606;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13275 m1857() {
        return this.f1607;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f1606 + " upper=" + this.f1607 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0291 m1855(WindowInsetsAnimation.Bounds bounds) {
        return new C0291(bounds);
    }
}
