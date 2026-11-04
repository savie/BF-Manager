package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes.dex */
public final class C24925 implements InterfaceC11498 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ClipData f80666;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f80667;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f80668;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Bundle f80669;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Uri f80670;

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ */
    public final void mo6277(int i) {
        this.f80667 = i;
    }

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ */
    public final void mo6278(Uri uri) {
        this.f80670 = uri;
    }

    @Override // l.InterfaceC11498
    /* JADX INFO: renamed from: ۙ */
    public final void mo6279(Bundle bundle) {
        this.f80669 = bundle;
    }

    @Override // l.InterfaceC11498
    public final C23433 build() {
        return new C23433(new C15973(this));
    }
}
