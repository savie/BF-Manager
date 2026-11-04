package l;

/* JADX INFO: renamed from: l.᩺۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4Z6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24319 extends AbstractC12384 implements InterfaceC14379 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9400 f78721;

    public AbstractC24319(EnumC22631 enumC22631) {
        super(enumC22631);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9400 m54356() {
        C9400 c9400 = this.f78721;
        if (c9400 != null) {
            return c9400;
        }
        throw new IllegalStateException("The referrer has not been set yet");
    }
}
