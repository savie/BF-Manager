package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܳ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9ARP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14822 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9613 f48445;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16233 f48446;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2555 f48447;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5172();

    static {
        C9613 c9613 = new C9613(new C17643());
        f48445 = c9613;
        c9613.f32385 = Integer.MAX_VALUE;
    }

    public AbstractC14822(C16233 c16233, C2555 c2555) {
        this.f48446 = c16233;
        this.f48447 = c2555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11729 mo35507(AbstractC11729 abstractC11729) {
        AbstractC11729 abstractC11729M29310;
        C2555 c2555 = this.f48447;
        if (c2555 == null) {
            return abstractC11729;
        }
        synchronized (c2555) {
            abstractC11729M29310 = AbstractC11729.m29310(abstractC11729, this.f48447, new IdentityHashMap());
        }
        return abstractC11729M29310;
    }
}
