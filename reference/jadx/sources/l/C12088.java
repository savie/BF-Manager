package l;

import android.view.WindowInsetsAnimation;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12088 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13954 f40447;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13954 f40448;

    public C12088(C13954 c13954, C13954 c13955) {
        this.f40447 = c13954;
        this.f40448 = c13955;
    }

    public C12088(WindowInsetsAnimation.Bounds bounds) {
        this.f40447 = C11610.m28942(bounds);
        this.f40448 = C11610.m28940(bounds);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13954 m30079() {
        return this.f40447;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13954 m30080() {
        return this.f40448;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f40447 + " upper=" + this.f40448 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12088 m30078(WindowInsetsAnimation.Bounds bounds) {
        return new C12088(bounds);
    }
}
