package l;

/* JADX INFO: renamed from: l.۫᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBDF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13332 extends AbstractC5875 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f42519;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14011 f42520;

    public AbstractC13332(String str, C14011 c14011, int i) {
        super(str);
        try {
            if (c14011.m46489()) {
                throw new C12017("annotations.isMutable()", null);
            }
            this.f42520 = c14011;
            this.f42519 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // l.InterfaceC1159
    /* JADX INFO: renamed from: ۙ */
    public final int mo1345() {
        return this.f42519 + 6;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14011 m32899() {
        return this.f42520;
    }
}
