package l;

/* JADX INFO: renamed from: l.᩷ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98C6 */
/* JADX INFO: loaded from: classes.dex */
public class C21953 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f70859;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC4053 f70860;

    public C21953(String str) {
        this.f70859 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49676(String str) {
        this.f70859 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49675() {
        return this.f70859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49677(AbstractC4053 abstractC4053) {
        if (this.f70860 == null) {
            this.f70860 = abstractC4053;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC4053 m49680() {
        return this.f70860;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15745 m49681() {
        AbstractC4053 abstractC4053 = this.f70860;
        if (abstractC4053 == null) {
            return null;
        }
        return abstractC4053.m13046();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49678(C4930 c4930, InterfaceC6971 interfaceC6971) {
        if (m49681() == null) {
            interfaceC6971.run();
        } else {
            m49681().m37656(c4930, interfaceC6971);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49679(InterfaceC6971 interfaceC6971) {
        if (m49681() == null) {
            interfaceC6971.run();
        } else {
            m49681().m37656(m49681().m37654(), interfaceC6971);
        }
    }
}
