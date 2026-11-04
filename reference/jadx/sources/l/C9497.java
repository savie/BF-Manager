package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9497 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12384 f30775;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30776;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24878(int i, List list) {
        AbstractC12384 abstractC12384 = (AbstractC12384) list.get(i);
        if (!C14565.m35134(abstractC12384)) {
            return false;
        }
        this.f30775 = abstractC12384;
        this.f30776 = ((InterfaceC12142) abstractC12384).mo1542();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24876() {
        return this.f30776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24877(C12328 c12328) {
        c12328.f39606.m27116(this.f30775);
    }
}
