package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۗܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3478 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1079 f12021;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f12022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f12023;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6462 f12024;

    public C3478(C6462 c6462, AbstractActivityC17204 abstractActivityC17204, C1079 c1079, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f12024 = c6462;
        this.f12023 = abstractActivityC17204;
        this.f12021 = c1079;
        this.f12022 = dialogInterfaceC8327;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f12023, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        long jM4044 = this.f12021.m4044();
        ReentrantLock reentrantLock = C11650.f37690;
        C2592 c2592M8672 = C2592.m8672(4181);
        c2592M8672.m8675(jM4044);
        C13778 c13778M8684 = c2592M8672.m8684();
        if (!c13778M8684.m33676()) {
            throw new C4866(C1364.m5010(c13778M8684, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f12022.dismiss();
        this.f12024.mo2388(this.f12023);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f12023.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
