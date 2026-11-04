package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: l.֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1804 implements InterfaceC11498 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentInfo.Builder f6153;

    public C1804(ClipData clipData, int i) {
        this.f6153 = C5533.m16446(clipData, i);
    }

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6277(int i) {
        this.f6153.setFlags(i);
    }

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6278(Uri uri) {
        this.f6153.setLinkUri(uri);
    }

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6279(Bundle bundle) {
        this.f6153.setExtras(bundle);
    }

    @Override // l.InterfaceC11498
    public final C23433 build() {
        return new C23433(new C16719(this.f6153.build()));
    }
}
