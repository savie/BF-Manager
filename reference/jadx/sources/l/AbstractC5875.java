package l;

/* JADX INFO: renamed from: l.ۚ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBA1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5875 implements InterfaceC1159 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20149;

    public AbstractC5875(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f20149 = str;
    }

    @Override // l.InterfaceC1159
    public final String getName() {
        return this.f20149;
    }
}
