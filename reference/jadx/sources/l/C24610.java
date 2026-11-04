package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes.dex */
public final class C24610 implements InterfaceC12455 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6710 f79717;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f79718;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f79719;

    public C24610(List list, C6710 c6710, List list2) {
        this.f79718 = AbstractC1928.copyOf((Collection) list);
        this.f79717 = c6710;
        this.f79719 = AbstractC1928.copyOf((Collection) list2);
    }

    @Override // l.InterfaceC12455
    /* JADX INFO: renamed from: ۙ */
    public final C6710 mo30930() {
        return this.f79717;
    }

    @Override // l.InterfaceC12455
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC20660 mo30930() {
        return this.f79717;
    }

    @Override // l.InterfaceC12455
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC1928 mo30932() {
        return this.f79718;
    }

    @Override // l.InterfaceC12455
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC1928 mo30931() {
        return this.f79719;
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f79717, "tok");
        c3179M46714.m10379(this.f79718, "toksBefore");
        c3179M46714.m10379(this.f79719, "toksAfter");
        return c3179M46714.toString();
    }
}
