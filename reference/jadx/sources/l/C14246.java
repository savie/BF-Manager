package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: l.ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23418 f46655;

    public C14246(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f46655 = new C5778(uri, clipDescription, uri2);
        } else {
            this.f46655 = new C10718(uri, clipDescription, uri2);
        }
    }

    public C14246(C5778 c5778) {
        this.f46655 = c5778;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri m34381() {
        return this.f46655.mo15911();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ClipDescription m34384() {
        return this.f46655.getDescription();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri m34383() {
        return this.f46655.mo15908();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14246 m34379(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C14246(new C5778(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m34382() {
        return this.f46655.mo15909();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34380() {
        this.f46655.mo15910();
    }
}
