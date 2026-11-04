package l;

import android.content.DialogInterface;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes4.dex */
public final class C7888 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19075 f26233;

    public C7888(C19075 c19075) {
        this.f26233 = c19075;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f26233.f61766.f4309);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        C19075 c19075 = this.f26233;
        interfaceC18752Edit.putString("dex_backup_name", c19075.m22914()).apply();
        C1176 c1176 = c19075.f61766;
        c1176.f4310.m30841(c19075.m22914());
        c1176.f4308 = c1176.f4310.m30840();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C19075 c19075 = this.f26233;
        c19075.m22951();
        C1176 c1176 = c19075.f61766;
        c1176.f4311.notifyDataSetChanged();
        c1176.f4307.m22432();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f26233.f61766.f4309.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
