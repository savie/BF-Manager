package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C12990 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11498 f41631;

    public C12990(ClipData clipData, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f41631 = new C1804(clipData, i);
            return;
        }
        C24925 c24925 = new C24925();
        c24925.f80666 = clipData;
        c24925.f80668 = i;
        this.f41631 = c24925;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32398(int i) {
        this.f41631.mo6277(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32399(Uri uri) {
        this.f41631.mo6278(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32400(Bundle bundle) {
        this.f41631.mo6279(bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23433 m32397() {
        return this.f41631.build();
    }
}
