package l;

/* JADX INFO: renamed from: l.᩶ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19976 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63951;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63953;

    public /* synthetic */ RunnableC19976(int i, Object obj, Object obj2) {
        this.f63952 = i;
        this.f63953 = obj;
        this.f63951 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f63952;
        Object obj = this.f63951;
        Object obj2 = this.f63953;
        switch (i) {
            case 0:
                ActivityC5677 activityC5677 = (ActivityC5677) obj2;
                ((C6094) obj).m16543(activityC5677, activityC5677.f19368);
                break;
            case 1:
                ((C20409) obj2).m46150();
                ((ActivityC11632) obj).m29017(false);
                break;
            default:
                int i2 = C20658.f67232;
                ((AbstractC20745) obj2).mo32855(((AbstractC10444) obj).m26392());
                break;
        }
    }
}
