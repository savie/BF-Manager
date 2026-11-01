package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7085 implements InterfaceC4262 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Uri f23758;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ClipData f23759;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f23760;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f23761;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f23762;

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12056(int i) {
        this.f23761 = i;
    }

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12057(Uri uri) {
        this.f23758 = uri;
    }

    @Override // l.InterfaceC4262
    /* JADX INFO: renamed from: ۙ */
    public final void mo12058(Bundle bundle) {
        this.f23762 = bundle;
    }

    @Override // l.InterfaceC4262
    public final C18374 build() {
        return new C18374(new C21902(this));
    }
}
