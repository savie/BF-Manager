package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12751 extends AbstractC22629 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CharSequence f42502;

    @Override // l.AbstractC22629
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo31692() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31693(String str) {
        this.f42502 = C3577.m10573(str);
    }

    @Override // l.AbstractC22629
    /* JADX INFO: renamed from: ۙ */
    public final void mo17216(InterfaceC4989 interfaceC4989) {
        new Notification.BigTextStyle(((C7106) interfaceC4989).mo13816()).setBigContentTitle(null).bigText(this.f42502);
    }
}
