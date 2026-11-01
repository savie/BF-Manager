package l;

/* JADX INFO: renamed from: l.ۙ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4310 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15483;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15484;

    public /* synthetic */ RunnableC4310(int i, Object obj) {
        this.f15483 = i;
        this.f15484 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15483) {
            case 0:
                ((C14895) this.f15484).m50125(new C21950(0));
                break;
            default:
                ViewOnClickListenerC23713 viewOnClickListenerC23713 = (ViewOnClickListenerC23713) this.f15484;
                C22032 c22032 = viewOnClickListenerC23713.f76741;
                c22032.f71406.notifyItemChanged(viewOnClickListenerC23713.getAdapterPosition());
                c22032.m48933();
                break;
        }
    }
}
