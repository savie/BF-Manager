package l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: l.֡ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0601 extends ContentObserver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentResolver f2396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19246 f2397;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f2398;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0601(C19246 c19246, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f2397 = c19246;
        this.f2396 = contentResolver;
        this.f2398 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2705() {
        this.f2396.registerContentObserver(this.f2398, false, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2706() {
        this.f2396.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C19246 c19246 = this.f2397;
        c19246.m44583(C14770.m35557(c19246.f62265, c19246.f62257, c19246.f62260));
    }
}
