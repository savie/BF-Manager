package l;

/* JADX INFO: renamed from: l.ܰۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4Z6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13639 extends AbstractC3384 implements InterfaceC5391 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15050 f44992;

    public AbstractC13639(EnumC10297 enumC10297) {
        super(enumC10297);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15050 m33339() {
        C15050 c15050 = this.f44992;
        if (c15050 != null) {
            return c15050;
        }
        throw new IllegalStateException("The referrer has not been set yet");
    }
}
