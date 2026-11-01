package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۜۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6530 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15676 f21992;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f21993;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f21994;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f21995;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21996;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f21997;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f21998;

    public C6530(C7236 c7236, ActivityC5677 activityC5677, String str, AbstractC20745 abstractC20745) {
        this.f21993 = c7236;
        this.f21994 = activityC5677;
        this.f21996 = str;
        this.f21998 = abstractC20745;
        this.f21995 = C23229.m51233(c7236.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f21997 = this.f21993.f24106.m17000().mo2398();
        m10249(this.f21994, this.f21995);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f21997;
        try {
            C15676 c15676M51594 = C23428.m51594(c3329);
            this.f21992 = c15676M51594;
            c15676M51594.m37349("<--id-c5skl23kjndf-->", this.f21996);
            this.f21998.m46735(this.f21992.mo19151());
            if (c3329 != null) {
                c3329.close();
            }
        } catch (Throwable th) {
            if (c3329 != null) {
                try {
                    c3329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f21995.m51236()) {
            long jMo33991 = this.f21998.mo33991();
            C7236 c7236 = this.f21993;
            c7236.f24117 = jMo33991;
            c7236.startActivity(new Intent(c7236.getContext(), (Class<?>) ActivityC9317.class));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM29578;
        if (this.f21995.m51236()) {
            this.f21994.m31002(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C4811) || (iM29578 = ((C4811) exc).m13367().m29578()) == -1) {
                return;
            }
            this.f21993.f24106.m17023(iM29578 - 1);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f21997;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
