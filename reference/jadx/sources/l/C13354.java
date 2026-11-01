package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.۬᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C13354 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15676 f44267;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f44268;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f44269;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f44270;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f44272;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f44273;

    public C13354(C20409 c20409, ActivityC11632 activityC11632, String str, AbstractC20745 abstractC20745) {
        this.f44268 = c20409;
        this.f44269 = activityC11632;
        this.f44271 = str;
        this.f44273 = abstractC20745;
        this.f44270 = C23229.m51233(c20409.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f44272 = this.f44268.f66125.m17000().mo2398();
        m10249(this.f44269, this.f44270);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f44272;
        try {
            C15676 c15676M51594 = C23428.m51594(c3329);
            this.f44267 = c15676M51594;
            c15676M51594.m37349("<--id-c5skl23kjndf-->", this.f44271);
            this.f44273.m46735(this.f44267.mo19151());
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
        if (this.f44270.m51236()) {
            long jMo33991 = this.f44273.mo33991();
            C20409 c20409 = this.f44268;
            c20409.f66139 = jMo33991;
            c20409.startActivity(new Intent(c20409.getContext(), (Class<?>) ActivityC9317.class));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        int iM29578;
        if (this.f44270.m51236()) {
            this.f44269.m31002(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C4811) || (iM29578 = ((C4811) exc).m13367().m29578()) == -1) {
                return;
            }
            this.f44268.f66125.m17023(iM29578 - 1);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f44272;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
