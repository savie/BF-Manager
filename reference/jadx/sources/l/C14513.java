package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14513 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8547 f45650;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f45651 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45653;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10043 f45654;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f45655;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f45656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f45657;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21227 f45658;

    public C14513(C21227 c21227, C8614 c8614, List list, Runnable runnable) {
        this.f45658 = c21227;
        this.f45655 = c8614;
        this.f45657 = list;
        this.f45656 = runnable;
        this.f45653 = c21227.f24222.m49876(C1112.m4125(c21227.m20218()));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C21227 c21227 = this.f45658;
        C8547 c8547 = c21227.f67741.m30662() ? new C8547() : null;
        this.f45650 = c8547;
        RunnableC24211 runnableC24211 = c8547 != null ? new RunnableC24211(c8547) : null;
        C10043 c10043 = new C10043(this.f45655.m23233());
        c10043.m25920(c21227.f67741.m30662() ? R.string.MT_Protector : R.string.MT_Protector);
        c10043.m25929("...");
        c10043.m25917((Runnable) runnableC24211);
        c10043.m25932();
        this.f45654 = c10043;
        if (this.f45657.size() == 1) {
            this.f45654.m25924();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        InterfaceC20481 interfaceC20481M30658;
        List<C14406> list = this.f45657;
        AbstractC22044 abstractC22044 = this.f45653;
        if (abstractC22044.mo4304()) {
            abstractC22044.mo4296();
        }
        abstractC22044.m49853();
        C8547 c8547 = this.f45650;
        C21227 c21227 = this.f45658;
        if (c8547 == null) {
            interfaceC20481M30658 = c21227.f67741.m30658((C8547) null);
        } else {
            interfaceC20481M30658 = c21227.f67741.m30658(this.f45650);
        }
        try {
            int i = c21227.f67741.m30662() ? R.string.MT_Protector : R.string.MT_Protector;
            int i2 = 0;
            for (C14406 c14406 : list) {
                if (!this.f45654.m27399()) {
                    this.f45654.m25920(i);
                    this.f45654.m25925(0);
                    i2++;
                    this.f45654.m25919(i2, list.size());
                    this.f45654.m25929(c14406.m34846());
                    String strM34846 = c14406.m34846();
                    String strM34844 = c14406.m34844();
                    boolean zM34840 = c14406.m34840();
                    C4819 entry = interfaceC20481M30658.getEntry(strM34844.substring(1) + strM34846);
                    if (entry == null) {
                        entry = zM34840 ? interfaceC20481M30658.getEntry(strM34846) : null;
                    }
                    if (entry == null) {
                        c14406.m34838();
                    } else {
                        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(c14406.m34842());
                        C13961 c13961M49855 = abstractC22044M49876.m49855("rw");
                        try {
                            interfaceC20481M30658.mo8643(entry, c13961M49855, new C4073(this, entry));
                            c13961M49855.close();
                            if (this.f45654.m27399()) {
                                abstractC22044M49876.mo4287();
                            } else {
                                c14406.m34839(abstractC22044M49876);
                                this.f45651.add(new C21120(abstractC22044M49876, c14406.m34846(), entry.m14851()));
                            }
                        } catch (Throwable th) {
                            try {
                                c13961M49855.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } else {
                    interfaceC20481M30658.close();
                    return;
                }
            }
            interfaceC20481M30658.close();
        } catch (Throwable th3) {
            try {
                interfaceC20481M30658.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f45654.m27399()) {
            this.f45653.mo4296();
        } else {
            this.f45652 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f45653.mo4296();
        if (this.f45654.m27399()) {
            return;
        }
        this.f45655.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f45654.m27405();
        C6331.m18055();
        if (this.f45652) {
            this.f45658.m20197(this.f45651);
            try {
                this.f45656.run();
            } catch (Throwable th) {
                this.f45655.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
