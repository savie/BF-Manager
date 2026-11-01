package l;

/* JADX INFO: renamed from: l.ܺᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98C6 */
/* JADX INFO: loaded from: classes4.dex */
public class C16126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f52115;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC0998 f52116;

    public C16126(String str) {
        this.f52115 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38172(String str) {
        this.f52115 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38171() {
        return this.f52115;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38173(AbstractC0998 abstractC0998) {
        if (this.f52116 == null) {
            this.f52116 = abstractC0998;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC0998 m38176() {
        return this.f52116;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3403 m38177() {
        AbstractC0998 abstractC0998 = this.f52116;
        if (abstractC0998 == null) {
            return null;
        }
        return abstractC0998.m3821();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38175(C15879 c15879, InterfaceC7411 interfaceC7411) {
        if (m38177() == null) {
            interfaceC7411.run();
        } else {
            m38177().m10096(c15879, interfaceC7411);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38174(InterfaceC7411 interfaceC7411) {
        if (m38177() == null) {
            interfaceC7411.run();
        } else {
            m38177().m10096(m38177().m10094(), interfaceC7411);
        }
    }
}
