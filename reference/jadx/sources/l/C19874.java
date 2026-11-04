package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ᩴܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19874 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f63904;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f63905;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f63906;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14691 f63907;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f63908;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63909;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f63910;

    public C19874(C7941 c7941, ActivityC18143 activityC18143, String str, AbstractC22044 abstractC22044) {
        this.f63904 = c7941;
        this.f63906 = activityC18143;
        this.f63909 = str;
        this.f63910 = abstractC22044;
        this.f63905 = C11555.m29068(c7941.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f63908 = this.f63904.f26387.m54021().mo15337();
        m8194(this.f63906, this.f63905);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f63908;
        try {
            C14691 c14691M24741 = C9398.m24741(c15508);
            this.f63907 = c14691M24741;
            c14691M24741.m35340("<--id-c5skl23kjndf-->", this.f63909);
            this.f63910.m49879(this.f63907.mo30929());
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
        if (this.f63905.m29071()) {
            long jMo4286 = this.f63910.mo4286();
            C7941 c7941 = this.f63904;
            c7941.f26379 = jMo4286;
            c7941.startActivity(new Intent(c7941.getContext(), (Class<?>) ActivityC7162.class));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int iM24888;
        if (this.f63905.m29071()) {
            this.f63906.m40401(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C10254) || (iM24888 = ((C10254) exc).m26443().m24888()) == -1) {
                return;
            }
            this.f63904.f26387.m54024(iM24888 - 1);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f63908;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
