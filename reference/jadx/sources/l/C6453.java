package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۛܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6453 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21698;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24353 f21699;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2310 f21700;

    public C6453(C24353 c24353, int i) {
        this.f21699 = c24353;
        this.f21698 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f21699.f78967);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        ReentrantLock reentrantLock = C11650.f37690;
        C2592 c2592M8672 = C2592.m8672(4210);
        c2592M8672.m8681(this.f21698);
        C13778 c13778M8688 = C18978.m44079() ? c2592M8672.m8688() : c2592M8672.m8682();
        if (c13778M8688.m33676()) {
            this.f21700 = new C2310(Boolean.valueOf(c13778M8688.m33675()), c13778M8688.m33677());
            return;
        }
        throw new C3090(C1364.m5010(c13778M8688, R.string.MT_Protector));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51154((CharSequence) this.f21700.f7474);
        if (((Boolean) this.f21700.f7473).booleanValue()) {
            C24353 c24353 = this.f21699;
            ActivityC21369 activityC21369 = c24353.f78967;
            C0107 c0107 = ActivityC21369.f68056;
            new C4215(activityC21369, true).m8197();
            c24353.m22951();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f21699.f78967.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
