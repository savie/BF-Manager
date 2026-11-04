package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܳ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15582 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4879 f50683;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f50684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f50685;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23042 f50686;

    public C15582(ContextWrapper contextWrapper, Looper looper, Looper looper2, InterfaceC20058 interfaceC20058, C0404 c0404) {
        this.f50685 = contextWrapper.getApplicationContext();
        this.f50683 = c0404.mo2209(looper, null);
        this.f50686 = new C23042(this, c0404.mo2209(looper2, null), interfaceC20058);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37322() {
        if (this.f50684) {
            this.f50683.mo14966(new Runnable() { // from class: l.᩷᩶ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C15582 c15582 = this.f72187;
                    c15582.f50685.unregisterReceiver(c15582.f50686);
                }
            });
            this.f50684 = false;
        }
    }
}
