package l;

/* JADX INFO: renamed from: l.֨ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBA1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1100 implements InterfaceC5771 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f5006;

    public AbstractC1100(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f5006 = str;
    }

    @Override // l.InterfaceC5771
    public final String getName() {
        return this.f5006;
    }
}
