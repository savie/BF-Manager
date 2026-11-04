package l;

import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܺ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17173 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f55973;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10745 f55974;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20903 f55975;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21649 f55976;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23887 f55977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f55978;

    public C17173(C6733 c6733, InterfaceC20903 interfaceC20903) {
        this.f55978 = c6733;
        this.f55975 = interfaceC20903;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C6733 c6733 = this.f55978;
        C10745 c10745 = new C10745(c6733.f22436);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(c6733.getFileName());
        c10745.mo25915(new View.OnClickListener() { // from class: l.۫᩺ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42812.f55974.m27405();
            }
        });
        c10745.mo25931();
        this.f55974 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C6733 c6733 = this.f55978;
        if (c6733.f22441) {
            C8224.m22125(c6733.f22440, c6733.f22438);
        }
        ExecutorService executorServiceNewFixedThreadPool = null;
        try {
            PackageInstaller.Session sessionMo37456 = this.f55975.mo37456(C16582.m39251());
            try {
                if (c6733.f22441) {
                    this.f55977 = new C23887();
                    C22941 c22941 = new C22941(c6733.f22440);
                    try {
                        this.f55977.m53390(c22941, c6733.f22438);
                        this.f55974.m27397(R.string.MT_Protector);
                        C3374 c3374 = new C3374(this.f55977.f77361);
                        c3374.m11078(new InterfaceC17544() { // from class: l.ۚ᩺ᩴ
                            @Override // l.InterfaceC17544
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1209(int i) {
                                C17173 c17173 = this.f20501;
                                c17173.f55974.m27403(i);
                                if (i == 100) {
                                    c17173.f55974.m27394(true);
                                }
                            }
                        });
                        this.f55976 = new C21649(c22941.m51723(), c3374);
                        this.f55974.mo25916(new Runnable() { // from class: l.֫᩺ᩴ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7388.f55976.f69113 = true;
                            }
                        });
                        ExecutorService executorService = C5261.f18541;
                        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
                        this.f55977.m53388(this.f55976, sessionMo37456, executorServiceNewFixedThreadPool);
                        C21649 c21649 = this.f55976;
                        if (c21649.f69113) {
                            sessionMo37456.abandon();
                            c22941.close();
                            sessionMo37456.close();
                            if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                                return;
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                            return;
                        }
                        c21649.m49175();
                        c22941.close();
                    } catch (Throwable th) {
                        try {
                            c22941.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    this.f55974.m27397(R.string.MT_Protector);
                    this.f55974.mo25916((Runnable) null);
                    C3374 c3375 = new C3374(c6733.f22440.mo4285());
                    c3375.m11078(new InterfaceC17544() { // from class: l.ۧ᩺ᩴ
                        @Override // l.InterfaceC17544
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1209(int i) {
                            C17173 c17173 = this.f38492;
                            c17173.f55974.m27403(i);
                            if (i == 100) {
                                c17173.f55974.m27394(true);
                            }
                        }
                    });
                    OutputStream outputStreamOpenWrite = sessionMo37456.openWrite(c6733.getFileName(), 0L, -1L);
                    try {
                        c6733.f22440.m49842(outputStreamOpenWrite, new C25379(this, c3375));
                        if (outputStreamOpenWrite != null) {
                            outputStreamOpenWrite.close();
                        }
                        if (this.f55974.m27399()) {
                            sessionMo37456.abandon();
                            sessionMo37456.close();
                            return;
                        }
                    } catch (Throwable th3) {
                        if (outputStreamOpenWrite != null) {
                            try {
                                outputStreamOpenWrite.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                C3749 c3749 = new C3749();
                c3749.f12855 = new CountDownLatch(1);
                sessionMo37456.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c3749));
                while (!c3749.f12855.await(500L, TimeUnit.MILLISECONDS)) {
                    if (this.f55974.m27399()) {
                        sessionMo37456.abandon();
                        sessionMo37456.close();
                        if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                            return;
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        return;
                    }
                }
                Intent intent = c3749.f12856;
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                if (intExtra == 0) {
                    this.f55973 = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                    C23887 c23887 = this.f55977;
                    if (c23887 != null) {
                        c23887.m53389(this.f55976, this.f55974, executorServiceNewFixedThreadPool);
                    }
                } else {
                    if (intExtra == 3) {
                        throw new CancellationException();
                    }
                    String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    if (TextUtils.isEmpty(stringExtra)) {
                        throw new C4866(R.string.MT_Protector);
                    }
                    C8224.m22121(stringExtra.replace("Success", ""));
                }
                sessionMo37456.close();
                if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable th5) {
                if (sessionMo37456 != null) {
                    try {
                        sessionMo37456.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            if (0 != 0 && !executorServiceNewFixedThreadPool.isShutdown()) {
                executorServiceNewFixedThreadPool.shutdownNow();
            }
            throw th7;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (!this.f55974.m27399()) {
            C6733 c6733 = this.f55978;
            C8224.m22122(c6733.f22436, c6733.getFileName(), this.f55973);
            if (c6733.f22441) {
                return;
            }
            C8224.f27071.mo40353((Object) null);
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        String message = exc.getMessage();
        if (message != null && message.equals("binder haven't been received")) {
            this.f55975.mo37457();
            return;
        }
        if ((exc instanceof CancellationException) || this.f55974.m27399()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C21804;
        C6733 c6733 = this.f55978;
        if (z) {
            C21804 c21804 = (C21804) exc;
            if (c21804.m49453()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c6733.f22439);
                C7247.m19877(C21576.m49084()).m19881(intent);
                return;
            } else if (c21804.m49451()) {
                AbstractActivityC17204 abstractActivityC17204 = c6733.f22436;
                String message2 = c21804.getMessage();
                String strM49450 = c21804.m49450();
                abstractActivityC17204.getClass();
                abstractActivityC17204.runOnUiThread(new RunnableC8779(abstractActivityC17204, message2, strM49450, false));
                return;
            }
        }
        c6733.m18824(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f55974.m27405();
    }
}
