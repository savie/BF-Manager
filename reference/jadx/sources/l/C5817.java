package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C5817 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۚ᩻ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f19758;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13662 f19759;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f19760;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19761;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f19762;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11462 f19763;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f19764;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19765;

    static {
        ApplicationC6132.m17119(81);
        f19758 = new short[]{2987, 29591, 29589, 29576, 29581, 29570, 29572, 29587, 29624, 29570, 29599, 29574, 29572, 29587, 29579, 29598, 29624, 29578, 29574, 29587, 29572, 29583, 29570, 29577, 29574, 29573, 29579, 29570, 29624, 29573, 29582, 29577, 29624, 29572, 29576, 29577, 29585, 29570, 29589, 29587};
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C5817(C11545 c11545, AbstractC11462 abstractC11462, String str, int i) {
        this.f19760 = c11545;
        this.f19763 = abstractC11462;
        this.f19765 = str;
        this.f19761 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        if (this.f19763.f38584) {
            this.f19759 = this.f19760.m28770(false, (Runnable) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C13662 c13662 = this.f19759;
        C11545 c11545 = this.f19760;
        if (!(c13662 == null && c11545.m28800()) && this.f19764) {
            AbstractC11462 abstractC11462 = c11545.f38817;
            AbstractC11462 abstractC11463 = this.f19763;
            if (abstractC11462 == abstractC11463 && this.f19765.equals(abstractC11463.m28629())) {
                if (this.f19761 == abstractC11463.f38589.m33189()) {
                    c11545.m28731(this.f19762, true);
                    c11545.f38826.m16166();
                }
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C13662 c13662 = this.f19759;
        if (c13662 != null) {
            c13662.m33365();
        }
    }
}
