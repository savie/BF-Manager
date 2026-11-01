package l;

import android.content.ClipDescription;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 23DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10718 implements InterfaceC23418 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri f36547;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f36548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ClipDescription f36549;

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15909() {
        return null;
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۨ */
    public final void mo15910() {
    }

    public C10718(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f36547 = uri;
        this.f36549 = clipDescription;
        this.f36548 = uri2;
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ܰ */
    public final Uri mo15911() {
        return this.f36547;
    }

    @Override // l.InterfaceC23418
    public final ClipDescription getDescription() {
        return this.f36549;
    }

    @Override // l.InterfaceC23418
    /* JADX INFO: renamed from: ۖ */
    public final Uri mo15908() {
        return this.f36548;
    }
}
