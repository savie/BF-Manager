package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: l.ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10138 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19089 f32435;

    public C10138(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f32435 = new C0444(uri, clipDescription, uri2);
        } else {
            this.f32435 = new C7902(uri, clipDescription, uri2);
        }
    }

    public C10138(C0444 c0444) {
        this.f32435 = c0444;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m26152() {
        return this.f32435.mo2264();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ClipDescription m26155() {
        return this.f32435.getDescription();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Uri m26153() {
        return this.f32435.mo2265();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10138 m26151(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C10138(new C0444(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m26154() {
        return this.f32435.mo2262();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m26156() {
        this.f32435.mo2263();
    }
}
