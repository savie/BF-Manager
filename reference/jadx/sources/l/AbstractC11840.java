package l;

/* JADX INFO: renamed from: l.ۧ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBH6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11840 extends AbstractC5875 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4538 f38168;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38169;

    public AbstractC11840(String str, C4538 c4538, int i) {
        super(str);
        try {
            if (c4538.m46489()) {
                throw new C12017("parameterAnnotations.isMutable()", null);
            }
            this.f38168 = c4538;
            this.f38169 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return this.f38169 + 6;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4538 m29684() {
        return this.f38168;
    }
}
