package l;

import android.content.Context;

/* JADX INFO: renamed from: l.᩸֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22487 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72773;

    public /* synthetic */ RunnableC22487(int i, Object obj) {
        this.f72772 = i;
        this.f72773 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72772) {
            case 0:
                ((ActivityC2350) this.f72773).finish();
                break;
            case 1:
                C6996.m19319((C6996) this.f72773);
                break;
            case 2:
                C7543.m20611((Context) this.f72773);
                break;
            default:
                ((InterfaceC20670) this.f72773).close();
                break;
        }
    }
}
