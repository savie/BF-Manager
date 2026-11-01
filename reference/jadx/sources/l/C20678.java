package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1252 f67263;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f67264;

    public C20678(C1252 c1252, Handler handler) {
        this.f67263 = c1252;
        this.f67264 = handler;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46518(C13768 c13768) {
        int i = c13768.f45380;
        Handler handler = this.f67264;
        C1252 c1252 = this.f67263;
        if (i == 0) {
            handler.post(new RunnableC10095(c1252, c13768.f45381));
        } else {
            handler.post(new RunnableC7272(c1252, i));
        }
    }
}
