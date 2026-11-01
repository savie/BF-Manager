package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8623 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16881 f29753;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C22380 f29754;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22380 f29755;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29756;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16881 f29757;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f29758;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f29759;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f29760;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23229 f29761;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f29762;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29763 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4471 f29764;

    public C8623(ActivityC4471 activityC4471, boolean z, C6111 c6111, boolean z2, C6111 c6112, C23229 c23229, ResultCallback resultCallback) {
        this.f29764 = activityC4471;
        this.f29760 = z;
        this.f29762 = c6111;
        this.f29756 = z2;
        this.f29759 = c6112;
        this.f29761 = c23229;
        this.f29758 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        boolean z = this.f29760;
        ActivityC4471 activityC4471 = this.f29764;
        if (z && activityC4471.f15902 != null) {
            this.f29753 = new C16881(activityC4471.f15885.f32339);
            C6111 c6111 = this.f29762;
            this.f29754 = C22380.m49632(c6111.m17000(), c6111.m17042(), activityC4471.f15902);
        }
        if (this.f29756 && activityC4471.f15896 != null) {
            this.f29763 = false;
            this.f29757 = new C16881(activityC4471.f15894.f32339);
            C6111 c6112 = this.f29759;
            this.f29755 = C22380.m49632(c6112.m17000(), c6112.m17042(), activityC4471.f15896);
        }
        m10246(activityC4471, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C22380 c22380 = this.f29754;
        try {
            C22380 c22381 = this.f29755;
            C23229 c23229 = this.f29761;
            if (c22380 != null) {
                try {
                    this.f29763 = true;
                    c22380.m49637(this.f29753);
                    C16737.m39273(new RunnableC7917(0, c23229, this.f29762));
                } catch (Throwable th) {
                    if (c22381 != null) {
                        try {
                            c22381.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (c22381 != null) {
                this.f29763 = false;
                c22381.m49637(this.f29757);
                C16737.m39273(new RunnableC19206(0, c23229, this.f29759));
            }
            if (c22381 != null) {
                c22381.close();
            }
            if (c22380 != null) {
                c22380.close();
            }
        } catch (Throwable th3) {
            if (c22380 != null) {
                try {
                    c22380.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f29761.m51236()) {
            C15829.m37611(R.string.MT_Protector);
        }
        ResultCallback resultCallback = this.f29758;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f29761.m51236()) {
            C6111 c6111 = this.f29763 ? this.f29762 : this.f29759;
            if (exc instanceof C16405) {
                c6111.m17023(((C16405) exc).m38616() - 1);
            } else if (exc instanceof C4811) {
                int iM29578 = ((C4811) exc).m13367().m29578();
                if (iM29578 != -1) {
                    c6111.m17023(iM29578 - 1);
                }
            } else if (exc instanceof C22085) {
                C22085 c22085 = (C22085) exc;
                C8500.m22223(c22085.f71538, c22085.f71540).m22227(c6111);
            } else if (exc instanceof C18066) {
                ((C18066) exc).m42064(c6111);
            }
        }
        ResultCallback resultCallback = this.f29758;
        if (resultCallback != null) {
            resultCallback.onFailure(C2641.m8151(exc));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C22380 c22380 = this.f29754;
        if (c22380 != null) {
            c22380.close();
        }
        C22380 c22381 = this.f29755;
        if (c22381 != null) {
            c22381.close();
        }
        m10251();
    }
}
