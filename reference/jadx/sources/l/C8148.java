package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8148 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f26896;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19335 f26897;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f26898;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11351 f26899;

    public C8148(C8893 c8893, InterfaceC19335 interfaceC19335, Runnable runnable) {
        this.f26898 = c8893;
        this.f26897 = interfaceC19335;
        this.f26896 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f26898.f29056, 200);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f26899 = this.f26897.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C8893 c8893 = this.f26898;
        if (!c8893.f29063.m22434() || c8893.f29056.isFinishing()) {
            return;
        }
        c8893.m23809();
        Runnable runnable = this.f26896;
        if (runnable != null) {
            runnable.run();
        }
        C11351 c11351 = this.f26899;
        if (c11351 != null) {
            C8893.m23807(c8893, c11351.f35755);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C8893 c8893 = this.f26898;
        if (!c8893.f29063.m22434() || c8893.f29056.isFinishing()) {
            return;
        }
        c8893.m23809();
        C22673.m51159(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f26899 = null;
        this.f26898.f29058 = false;
        m8196();
    }
}
