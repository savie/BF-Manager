package l;

/* JADX INFO: renamed from: l.ܶᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15389 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50088;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f50089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15967 f50090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f50091;

    public RunnableC15389(C19622 c19622, C10450 c10450, String str, C15967 c15967) {
        this.f50089 = c19622;
        this.f50091 = c10450;
        this.f50088 = str;
        this.f50090 = c15967;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C11260) this.f50089.f62983.f68499.getOrDefault(this.f50091.f35674.getBinder(), null)) == null) {
            return;
        }
        String str = this.f50088;
        C0675 c0675 = new C0675(str, this.f50090);
        c0675.m49804(2);
        c0675.m49807();
        if (!c0675.m49806()) {
            throw new IllegalStateException(C0252.m1693("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
