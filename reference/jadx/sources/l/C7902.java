package l;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX INFO: renamed from: l.۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7902 implements InterfaceC19089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri f26255;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Uri f26256;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ClipDescription f26257;

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2262() {
        return null;
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ۤ */
    public final void mo2263() {
    }

    public C7902(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f26255 = uri;
        this.f26257 = clipDescription;
        this.f26256 = uri2;
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ᩷ */
    public final Uri mo2264() {
        return this.f26255;
    }

    @Override // l.InterfaceC19089
    public final ClipDescription getDescription() {
        return this.f26257;
    }

    @Override // l.InterfaceC19089
    /* JADX INFO: renamed from: ᩸ */
    public final Uri mo2265() {
        return this.f26256;
    }
}
