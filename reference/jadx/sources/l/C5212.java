package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۙ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5212 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f18385;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f18386;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f18387;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14691 f18388;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f18389;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f18390;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f18391;

    public C5212(C25350 c25350, ActivityC0848 activityC0848, String str, AbstractC22044 abstractC22044) {
        this.f18385 = c25350;
        this.f18387 = activityC0848;
        this.f18390 = str;
        this.f18391 = abstractC22044;
        this.f18386 = C11555.m29068(c25350.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f18389 = this.f18385.f81832.m54021().mo15337();
        m8194(this.f18387, this.f18386);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f18389;
        try {
            C14691 c14691M24741 = C9398.m24741(c15508);
            this.f18388 = c14691M24741;
            c14691M24741.m35340("<--id-c5skl23kjndf-->", this.f18390);
            this.f18391.m49879(this.f18388.mo30929());
            if (c15508 != null) {
                c15508.close();
            }
        } catch (Throwable th) {
            if (c15508 != null) {
                try {
                    c15508.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f18386.m29071()) {
            long jMo4286 = this.f18391.mo4286();
            C25350 c25350 = this.f18385;
            c25350.f81853 = jMo4286;
            c25350.startActivity(new Intent(c25350.getContext(), (Class<?>) ActivityC7162.class));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int iM24888;
        if (this.f18386.m29071()) {
            this.f18387.m40401(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C10254) || (iM24888 = ((C10254) exc).m26443().m24888()) == -1) {
                return;
            }
            this.f18385.f81832.m54024(iM24888 - 1);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f18389;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
