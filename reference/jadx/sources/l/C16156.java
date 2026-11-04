package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܶܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16156 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f52447;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23616 f52448;

    public C16156(C23616 c23616, String str) {
        this.f52448 = c23616;
        this.f52447 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f52448.f76645, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        long jM4044 = this.f52448.f76646.m4044();
        ReentrantLock reentrantLock = C11650.f37690;
        C2592 c2592M8672 = C2592.m8672(4198);
        c2592M8672.m8675(jM4044);
        c2592M8672.m8687(this.f52447);
        C13778 c13778M8684 = c2592M8672.m8684();
        if (!c13778M8684.m33676()) {
            throw new C4866(C1364.m5010(c13778M8684, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C23616 c23616 = this.f52448;
        c23616.m22951();
        c23616.f76643.dismiss();
        c23616.f76644.mo2388(c23616.f76645);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f52448.f76645.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
