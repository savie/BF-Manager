package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C10757 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13662 f36664;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f36665;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11462 f36666;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f36667;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f36668;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
    }

    public C10757(C11545 c11545, AbstractC11462 abstractC11462) {
        this.f36665 = c11545;
        this.f36666 = abstractC11462;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        if (this.f36666.f38584) {
            this.f36664 = this.f36665.m28770(false, (Runnable) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC11462 abstractC11462 = this.f36666;
        abstractC11462.mo23741(false);
        List listMo13037 = abstractC11462.mo13037();
        this.f36667 = listMo13037;
        abstractC11462.f38584 = false;
        C11545 c11545 = this.f36665;
        C3386.m10047(c11545, listMo13037);
        this.f36668 = c11545.f38812 || C11545.m28742(this.f36667, c11545.f38806);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C13662 c13662 = this.f36664;
        C11545 c11545 = this.f36665;
        if (!(c13662 == null && c11545.m28800()) && c11545.f38817 == this.f36666 && this.f36668) {
            c11545.m28731(this.f36667, true);
            c11545.f38826.m16166();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C13662 c13662 = this.f36664;
        if (c13662 != null) {
            c13662.m33365();
        }
    }
}
