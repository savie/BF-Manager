package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: l.۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13436 implements InterfaceC4262 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentInfo.Builder f44477;

    public C13436(ClipData clipData, int i) {
        this.f44477 = C1440.m5036(clipData, i);
    }

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12056(int i) {
        this.f44477.setFlags(i);
    }

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12057(Uri uri) {
        this.f44477.setLinkUri(uri);
    }

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12058(Bundle bundle) {
        this.f44477.setExtras(bundle);
    }

    @Override // l.InterfaceC4262
    public final C18374 build() {
        return new C18374(new C23314(this.f44477.build()));
    }
}
