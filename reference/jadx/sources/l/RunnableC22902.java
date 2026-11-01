package l;

/* JADX INFO: renamed from: l.᩺ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22902 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74453;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74454;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74456;

    public /* synthetic */ RunnableC22902(Object obj, Object obj2, Object obj3, int i) {
        this.f74454 = i;
        this.f74456 = obj;
        this.f74453 = obj2;
        this.f74455 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74454) {
            case 0:
                final ViewOnClickListenerC15847 viewOnClickListenerC15847 = (ViewOnClickListenerC15847) this.f74456;
                final C8229 c8229 = (C8229) this.f74453;
                final byte[] bArr = (byte[]) this.f74455;
                final C5693 c5693M21602 = c8229.m21602();
                C16737.m39273(new Runnable() { // from class: l.֨ۢۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC15847.m37722(viewOnClickListenerC15847, c5693M21602, bArr, c8229);
                    }
                });
                break;
            default:
                C13842.m33675((C13842) this.f74456, (C7648) this.f74453, (C17567) this.f74455);
                break;
        }
    }
}
