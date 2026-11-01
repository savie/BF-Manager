package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;

/* JADX INFO: renamed from: l.۟᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8IS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7690 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9102 f25470;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f25471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f25472;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f25473;

    public C7690(ContextWrapper contextWrapper, Looper looper, Looper looper2, InterfaceC10513 interfaceC10513, C22217 c22217) {
        this.f25473 = contextWrapper.getApplicationContext();
        this.f25471 = c22217.mo28887(looper, null);
        this.f25470 = new C9102(this, c22217.mo28887(looper2, null), interfaceC10513);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20325() {
        if (this.f25472) {
            this.f25471.mo21243(new Runnable() { // from class: l.۠᩶ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C7690 c7690 = this.f29141;
                    c7690.f25473.unregisterReceiver(c7690.f25470);
                }
            });
            this.f25472 = false;
        }
    }
}
