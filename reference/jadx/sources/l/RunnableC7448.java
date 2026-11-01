package l;

import android.content.Context;

/* JADX INFO: renamed from: l.۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7448 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24820;

    public /* synthetic */ RunnableC7448(int i, Object obj) {
        this.f24819 = i;
        this.f24820 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24819) {
            case 0:
                C20854.m46875((C20854) this.f24820);
                break;
            case 1:
                C11353.m28432((Context) this.f24820);
                break;
            case 2:
                C13708.m33408((C13708) this.f24820);
                break;
            case 3:
                C23519.m51794((C23519) this.f24820);
                break;
            default:
                ((AbstractC23941) this.f24820).cancel();
                break;
        }
    }
}
