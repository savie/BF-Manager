package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8979 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30745;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30746;

    public /* synthetic */ RunnableC8979(int i, Object obj) {
        this.f30745 = i;
        this.f30746 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30745) {
            case 0:
                ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = (ViewOnLayoutChangeListenerC3333) this.f30746;
                viewOnLayoutChangeListenerC3333.f12352.m35351(49, viewOnLayoutChangeListenerC3333.f12359.getHeight() - viewOnLayoutChangeListenerC3333.m31016(R.id.MT_Protector).getHeight(), true);
                break;
            case 1:
                ((C11643) this.f30746).m29075();
                break;
            case 2:
                C18002.m41924((C18002) this.f30746);
                break;
            default:
                ((InterfaceC5046) this.f30746).close();
                break;
        }
    }
}
