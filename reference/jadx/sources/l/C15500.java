package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܳܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes5.dex */
public final class C15500 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13263 f50451;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f50452;

    public C15500(AbstractActivityC17204 abstractActivityC17204, C13263 c13263) {
        this.f50452 = abstractActivityC17204;
        this.f50451 = c13263;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f50452, this.f50451.f42381 != -1 ? R.string.MT_Protector : R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        C15723 c15723M45895;
        C15723 c15723M45896;
        C15723 c15723M45897;
        C13263 c13263 = this.f50451;
        if (c13263.f42381 != -1) {
            C23794 c23794M32816 = c13263.m32816();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C19978 c19978 = new C19978();
            try {
                c15723M45896 = c19978.m45895(c23794M32816.f77076, c23794M32816.f77075, c23794M32816.f77073);
                C25198.m56177(c15723M45896);
                try {
                    if (c23794M32816.f77079) {
                        c15723M45896.m37610(c23794M32816.f77078, c23794M32816.m53076());
                    } else {
                        c15723M45896.m37619(c23794M32816.f77077);
                    }
                    boolean z = c23794M32816.f77079;
                    c15723M45896.m37611(new C6552(z ? null : c23794M32816.f77077, z ? c23794M32816.m53076() : null));
                    c15723M45896.m37609(new Runnable() { // from class: l.᩸ܿ۫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15500.m37104(this.f74584, atomicBoolean);
                        }
                    });
                    try {
                        c15723M45896.m37608();
                        if (this.f7780.m33196()) {
                            c15723M45896.m37625();
                            return;
                        }
                        int iM37606 = c15723M45896.m37606("127.0.0.1", 0, c13263.f42372, c13263.f42380);
                        atomicBoolean.set(false);
                        this.f7780.m33186(R.string.MT_Protector);
                        c15723M45897 = c19978.m45895(iM37606, c13263.f42376, "127.0.0.1");
                        C25198.m56177(c15723M45897);
                        try {
                            if (c13263.f42377) {
                                c15723M45897.m37610(c13263.f42379, c13263.f42378.isEmpty() ? null : c13263.f42378);
                            } else {
                                c15723M45897.m37619(c13263.f42374);
                            }
                            boolean z2 = c13263.f42377;
                            c15723M45897.m37611(new C6552(z2 ? null : c13263.f42374, (!z2 || c13263.f42378.isEmpty()) ? null : c13263.f42378));
                            c15723M45897.m37609(new Runnable() { // from class: l.ᩴܿ۫
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C15500.m37105(this.f64186, atomicBoolean);
                                }
                            });
                            try {
                                c15723M45897.m37608();
                                this.f7780.m33195(R.string.MT_Protector);
                                C20614 c20614 = (C20614) c15723M45897.m37624("sftp");
                                c20614.m47228(Charset.forName(c13263.f42373));
                                c20614.mo22538(b.j0);
                                c20614.m47225(".");
                                c15723M45896.m37625();
                                c15723M45897.m37625();
                            } catch (IOException e) {
                                if (atomicBoolean.get()) {
                                    throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e.getMessage(), e);
                                }
                                throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e.getMessage(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (c15723M45896 != null) {
                                c15723M45896.m37625();
                            }
                            if (c15723M45897 != null) {
                                c15723M45897.m37625();
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        if (atomicBoolean.get()) {
                            throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                        }
                        throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e2.getMessage(), e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c15723M45897 = null;
                    if (c15723M45896 != null) {
                        c15723M45896.m37625();
                    }
                    if (c15723M45897 != null) {
                        c15723M45897.m37625();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c15723M45896 = null;
            }
        } else {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            try {
                c15723M45895 = new C19978().m45895(c13263.f42372, c13263.f42376, c13263.f42380);
                C25198.m56177(c15723M45895);
                try {
                    if (c13263.f42377) {
                        c15723M45895.m37610(c13263.f42379, c13263.f42378.isEmpty() ? null : c13263.f42378);
                    } else {
                        c15723M45895.m37619(c13263.f42374);
                    }
                    boolean z3 = c13263.f42377;
                    c15723M45895.m37611(new C6552(z3 ? null : c13263.f42374, (!z3 || c13263.f42378.isEmpty()) ? null : c13263.f42378));
                    c15723M45895.m37609(new Runnable() { // from class: l.ۤܿ۫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15500.m37106(this.f34817, atomicBoolean2);
                        }
                    });
                    try {
                        c15723M45895.m37608();
                        if (this.f7780.m33196()) {
                            c15723M45895.m37625();
                            return;
                        }
                        this.f7780.m33195(R.string.MT_Protector);
                        C20614 c20615 = (C20614) c15723M45895.m37624("sftp");
                        c20615.m47228(Charset.forName(c13263.f42373));
                        c20615.mo22538(b.j0);
                        c20615.m47225(".");
                        c15723M45895.m37625();
                    } catch (IOException e3) {
                        if (atomicBoolean2.get()) {
                            throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                        }
                        throw new Exception(C21576.m49088(R.string.MT_Protector) + ": " + e3.getMessage(), e3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c15723M45895 != null) {
                        c15723M45895.m37625();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c15723M45895 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37106(C15500 c15500, AtomicBoolean atomicBoolean) {
        c15500.f7780.m33186(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37104(C15500 c15500, AtomicBoolean atomicBoolean) {
        c15500.f7780.m33186(R.string.MT_Protector);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37105(C15500 c15500, AtomicBoolean atomicBoolean) {
        c15500.f7780.m33186(R.string.MT_Protector);
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
        this.f50452.m40401(exc, (DialogInterface.OnDismissListener) null);
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
