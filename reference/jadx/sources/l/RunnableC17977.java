package l;

/* JADX INFO: renamed from: l.ᩳۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17977 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57493;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57495;

    public /* synthetic */ RunnableC17977(int i, Object obj, Object obj2) {
        this.f57494 = i;
        this.f57495 = obj;
        this.f57493 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57494) {
            case 0:
                DialogInterfaceOnDismissListenerC7394.m19727((DialogInterfaceOnDismissListenerC7394) this.f57495, (InterfaceC2557) this.f57493);
                break;
            default:
                C20637.m46505((C20637) this.f57495, (RunnableC10138) this.f57493);
                break;
        }
    }
}
