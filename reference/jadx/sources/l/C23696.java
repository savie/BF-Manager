package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes.dex */
public final class C23696 extends AbstractC12507 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f76822;

    @Override // l.AbstractC12507
    /* JADX INFO: renamed from: ۙ */
    public final String mo31059() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52955(String str) {
        this.f76822 = C3558.m11588(str);
    }

    @Override // l.AbstractC12507
    /* JADX INFO: renamed from: ۙ */
    public final void mo31060(InterfaceC16982 interfaceC16982) {
        new Notification.BigTextStyle(((C19220) interfaceC16982).mo40047()).setBigContentTitle(null).bigText(this.f76822);
    }
}
