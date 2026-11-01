package l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: l.֨ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0925 extends ContentObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentResolver f3710;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3747 f3711;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f3712;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0925(C3747 c3747, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f3711 = c3747;
        this.f3710 = contentResolver;
        this.f3712 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3674() {
        this.f3710.registerContentObserver(this.f3712, false, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3675() {
        this.f3710.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C3747 c3747 = this.f3711;
        c3747.m10972(C2336.m7089(c3747.f13581, c3747.f13583, c3747.f13585));
    }
}
