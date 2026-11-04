package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16334 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23794 f53051;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f53052;

    public C16334(AbstractActivityC17204 abstractActivityC17204, C23794 c23794) {
        this.f53052 = abstractActivityC17204;
        this.f53051 = c23794;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f53052, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        C23794 c23794 = this.f53051;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C15723 c15723 = null;
        try {
            C15723 c15723M45895 = new C19978().m45895(c23794.f77076, c23794.f77075, c23794.f77073);
            C25198.m56177(c15723M45895);
            try {
                if (c23794.f77079) {
                    c15723M45895.m37610(c23794.f77078, c23794.m53076());
                } else {
                    c15723M45895.m37619(c23794.f77077);
                }
                c15723M45895.m37609(new Runnable() { // from class: l.ܽ᩶۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16334.m38823(this.f58484, atomicBoolean);
                    }
                });
                try {
                    c15723M45895.m37608();
                    c15723M45895.m37625();
                } catch (IOException e) {
                    if (!atomicBoolean.get()) {
                        throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e.getMessage(), e);
                    }
                    throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                th = th;
                c15723 = c15723M45895;
                if (c15723 != null) {
                    c15723.m37625();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38823(C16334 c16334, AtomicBoolean atomicBoolean) {
        c16334.f7780.m33186(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f53052.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f7780.m33196()) {
            return;
        }
        m8196();
    }
}
