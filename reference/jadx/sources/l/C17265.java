package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17265 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17088 f56244;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f56245;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9431 f56246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17088 f56247;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9431 f56248;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f56249 = true;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f56250;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f56251;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f56252;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11555 f56253;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f56254;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2350 f56255;

    public C17265(ActivityC2350 activityC2350, boolean z, C24132 c24132, boolean z2, C24132 c24133, C11555 c11555, ResultCallback resultCallback) {
        this.f56255 = activityC2350;
        this.f56254 = z;
        this.f56252 = c24132;
        this.f56245 = z2;
        this.f56250 = c24133;
        this.f56253 = c11555;
        this.f56251 = resultCallback;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        boolean z = this.f56254;
        ActivityC2350 activityC2350 = this.f56255;
        if (z && activityC2350.f7580 != null) {
            this.f56248 = new C9431(activityC2350.f7585.f3543);
            C24132 c24132 = this.f56252;
            this.f56244 = C17088.m40245(c24132.m54021(), c24132.m54047(), activityC2350.f7580);
        }
        if (this.f56245 && activityC2350.f7586 != null) {
            this.f56249 = false;
            this.f56246 = new C9431(activityC2350.f7581.f3543);
            C24132 c24133 = this.f56250;
            this.f56247 = C17088.m40245(c24133.m54021(), c24133.m54047(), activityC2350.f7586);
        }
        m8191(activityC2350, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C17088 c17088 = this.f56244;
        try {
            C17088 c17089 = this.f56247;
            C11555 c11555 = this.f56253;
            if (c17088 != null) {
                try {
                    this.f56249 = true;
                    c17088.m40249(this.f56248);
                    C21576.m49068(new RunnableC5470(1, c11555, this.f56252));
                } catch (Throwable th) {
                    if (c17089 != null) {
                        try {
                            c17089.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (c17089 != null) {
                this.f56249 = false;
                c17089.m40249(this.f56246);
                C21576.m49068(new RunnableC24881(1, c11555, this.f56250));
            }
            if (c17089 != null) {
                c17089.close();
            }
            if (c17088 != null) {
                c17088.close();
            }
        } catch (Throwable th3) {
            if (c17088 != null) {
                try {
                    c17088.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f56253.m29071()) {
            C22673.m51152(R.string.MT_Protector);
        }
        ResultCallback resultCallback = this.f56251;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f56253.m29071()) {
            C24132 c24132 = this.f56249 ? this.f56252 : this.f56250;
            if (exc instanceof C0200) {
                c24132.m54024(((C0200) exc).m1593() - 1);
            } else if (exc instanceof C10254) {
                int iM24888 = ((C10254) exc).m26443().m24888();
                if (iM24888 != -1) {
                    c24132.m54024(iM24888 - 1);
                }
            } else if (exc instanceof C4511) {
                C4511 c4511 = (C4511) exc;
                C15301.m36736(c4511.f16093, c4511.f16098).m36745(c24132);
            } else if (exc instanceof C10833) {
                ((C10833) exc).m27560(c24132);
            }
        }
        ResultCallback resultCallback = this.f56251;
        if (resultCallback != null) {
            resultCallback.onFailure(C22327.m50390(exc));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C17088 c17088 = this.f56244;
        if (c17088 != null) {
            c17088.close();
        }
        C17088 c17089 = this.f56247;
        if (c17089 != null) {
            c17089.close();
        }
        m8196();
    }
}
