package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7916 implements InterfaceC18907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26288;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f26289;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f26290;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f26291;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f26292;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f26293;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f26294;

    public C7916(ActivityC22568 activityC22568, C19143 c19143, boolean z, C12628 c12628, boolean z2, Runnable runnable) {
        this.f26293 = activityC22568;
        this.f26289 = c19143;
        this.f26290 = z;
        this.f26292 = c12628;
        this.f26291 = z2;
        this.f26294 = runnable;
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ۙ */
    public final AbstractActivityC17204 mo1758() {
        return this.f26293;
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1764(Object obj, C19143 c19143) {
        return this.f26293.f72927 == obj && this.f26289 == c19143;
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ۙ */
    public final void mo1760(C1442 c1442) {
        this.f26288 = true;
        boolean z = this.f26290;
        ActivityC22568 activityC22568 = this.f26293;
        if (z) {
            activityC22568.f72956 = c1442;
        } else {
            activityC22568.f72938 = c1442;
        }
        if (activityC22568.f72939 && activityC22568.f72961 != null && activityC22568.f72959 == null) {
            try {
                activityC22568.f72959 = activityC22568.f72961.m38182();
            } catch (IOException unused) {
            }
        }
        if (activityC22568.isDestroyed()) {
            return;
        }
        this.f26292.m31380();
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1763(C1442 c1442) {
        this.f26293.m50858((IOException) new C12893());
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1762() {
        ActivityC22568 activityC22568 = this.f26293;
        if (activityC22568.isDestroyed() || activityC22568.isFinishing()) {
            return;
        }
        activityC22568.m40398(R.string.MT_Protector, false);
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ۙ */
    public final void mo1761(C12893 c12893) {
        this.f26293.m50858((IOException) c12893);
    }

    @Override // l.InterfaceC18907
    /* JADX INFO: renamed from: ۙ */
    public final void mo1759(Object obj, C19143 c19143) {
        ActivityC22568 activityC22568 = this.f26293;
        if (activityC22568.f72927 != obj) {
            return;
        }
        activityC22568.f72927 = null;
        if (activityC22568.f72959 != null) {
            C16774 c16774 = activityC22568.f72959;
            activityC22568.f72959 = null;
            activityC22568.m50814(c16774);
        }
        if (activityC22568.isDestroyed()) {
            activityC22568.f72948.m42191();
            activityC22568.m50843();
            return;
        }
        activityC22568.f72948.m42190(true).m31388(activityC22568.f72933);
        activityC22568.f72948.m42190(false).m31388(activityC22568.f72933);
        activityC22568.m50863();
        C18092 c18092 = activityC22568.f72948;
        final boolean z = this.f26290;
        final boolean z2 = this.f26291;
        final Runnable runnable = this.f26294;
        c18092.post(new Runnable() { // from class: l.֡۬ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C7916 c7916 = this.f2068;
                ActivityC22568 activityC22569 = c7916.f26293;
                if (c7916.f26288 && !activityC22569.isFinishing() && !activityC22569.isDestroyed()) {
                    boolean z3 = z;
                    Runnable runnable2 = runnable;
                    if (z3 && z2) {
                        activityC22569.m50813(false, true, runnable2);
                    } else {
                        runnable2.run();
                    }
                }
                activityC22569.m50836();
            }
        });
    }
}
