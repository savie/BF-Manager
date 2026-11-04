package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0444 implements InterfaceC19089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputContentInfo f2025;

    public C0444(Object obj) {
        this.f2025 = (InputContentInfo) obj;
    }

    public C0444(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2025 = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri mo2264() {
        return this.f2025.getContentUri();
    }

    @Override // l.InterfaceC19089
    public final ClipDescription getDescription() {
        return this.f2025.getDescription();
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Uri mo2265() {
        return this.f2025.getLinkUri();
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2262() {
        return this.f2025;
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo2263() {
        this.f2025.requestPermission();
    }
}
