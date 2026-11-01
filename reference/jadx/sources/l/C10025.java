package l;

import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۤۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAXR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10025 extends AbstractC7202 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2968 f34233;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 f34234;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 f34235;

    public C10025(C2968 c2968, AbstractC7202 abstractC7202, AbstractC7202 abstractC7203) {
        this.f34233 = c2968;
        this.f34234 = abstractC7202;
        this.f34235 = abstractC7203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10025 m25303(C2968 c2968, AbstractC7202 abstractC7202, AbstractC7202 abstractC7203) {
        return new C10025(c2968, abstractC7202, abstractC7203);
    }

    @Override // l.AbstractC7202
    /* JADX INFO: renamed from: ۙ */
    public final int mo19145() {
        return (((Boolean) this.f34233.f11103.orElse(Boolean.FALSE)).booleanValue() ? this.f34234 : this.f34235).mo19145();
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f34233, MessageHandler.Properties.Condition);
        c23244M37072.m51284(this.f34234, "thenIndent");
        c23244M37072.m51284(this.f34235, "elseIndent");
        return c23244M37072.toString();
    }
}
