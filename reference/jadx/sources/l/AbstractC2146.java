package l;

/* JADX INFO: renamed from: l.֫᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBDN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2146 extends AbstractC5875 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7366 f7088;

    public AbstractC2146(String str, C7366 c7366) {
        super(str);
        try {
            if (c7366.m46489()) {
                throw new C12017("localVariables.isMutable()", null);
            }
            this.f7088 = c7366;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return (this.f7088.size() * 10) + 8;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7366 m7410() {
        return this.f7088;
    }
}
