package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4262 f73677;

    public C22608(ClipData clipData, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f73677 = new C13436(clipData, i);
            return;
        }
        C7085 c7085 = new C7085();
        c7085.f23759 = clipData;
        c7085.f23760 = i;
        this.f73677 = c7085;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50117(int i) {
        this.f73677.mo12056(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50118(Uri uri) {
        this.f73677.mo12057(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50119(Bundle bundle) {
        this.f73677.mo12058(bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18374 m50116() {
        return this.f73677.build();
    }
}
