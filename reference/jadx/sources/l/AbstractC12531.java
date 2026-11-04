package l;

/* JADX INFO: renamed from: l.ۨᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: IISF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12531 extends AbstractC5820 implements InterfaceC20451 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31135(EnumC17315 enumC17315) {
        return enumC17315.m40666(mo8527().m5681().m17705());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m31136(String str) {
        C23977.m53505((C2551) this, str);
        C19990.m45969(this, EnumC17315.WARN, str);
        mo17866(EnumC1763.INCONSISTENT_CODE);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31138(String str) {
        C19990.m45969(this, EnumC17315.WARN, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31134(String str, Throwable th) {
        StringBuilder sbM10405 = C3188.m10405(str, ": ");
        sbM10405.append(C4123.m13224(th));
        C19990.m45969(this, EnumC17315.WARN, sbM10405.toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31137(String str) {
        C19990.m45969(this, EnumC17315.INFO, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31133(String str) {
        C19990.m45969(this, EnumC17315.DEBUG, str);
    }
}
