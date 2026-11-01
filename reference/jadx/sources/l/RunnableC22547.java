package l;

/* JADX INFO: renamed from: l.᩹᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22547 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73525;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73526;

    public /* synthetic */ RunnableC22547(int i, Object obj) {
        this.f73525 = i;
        this.f73526 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73525) {
            case 0:
                ((C15492) this.f73526).showDropDown();
                break;
            case 1:
                C23186.m51189((byte[]) this.f73526);
                break;
            default:
                ((C11718) this.f73526).m50125(new C0077());
                break;
        }
    }
}
