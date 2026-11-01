package l;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5778 implements InterfaceC23418 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputContentInfo f19631;

    public C5778(Object obj) {
        this.f19631 = (InputContentInfo) obj;
    }

    public C5778(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f19631 = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri mo15911() {
        return this.f19631.getContentUri();
    }

    @Override // l.InterfaceC23418
    public final ClipDescription getDescription() {
        return this.f19631.getDescription();
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri mo15908() {
        return this.f19631.getLinkUri();
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15909() {
        return this.f19631;
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo15910() {
        this.f19631.requestPermission();
    }
}
