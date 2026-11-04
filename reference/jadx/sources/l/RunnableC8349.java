package l;

/* JADX INFO: renamed from: l.۠ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8349 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27367;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27369;

    public /* synthetic */ RunnableC8349(int i, Object obj, Object obj2) {
        this.f27367 = i;
        this.f27369 = obj;
        this.f27368 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27367) {
            case 0:
                InterfaceC16793 interfaceC16793 = (InterfaceC16793) this.f27369;
                C17539 c17539 = (C17539) this.f27368;
                interfaceC16793.mo13592(c17539.f57014, c17539.f57015);
                interfaceC16793.mo13595();
                break;
            case 1:
                C24306.m54322((C24306) this.f27369, (C17074) this.f27368);
                break;
            default:
                C18467.m43022((C18467) this.f27369, (C16975) this.f27368);
                break;
        }
    }
}
