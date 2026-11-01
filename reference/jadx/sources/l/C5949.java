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

/* JADX INFO: renamed from: l.ۛۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5949 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22218 f20232;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f20233;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3126 f20234;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1777 f20235;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1715 f20236;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f20237;

    public C5949(C13752 c13752, InterfaceC3126 interfaceC3126) {
        this.f20237 = c13752;
        this.f20234 = interfaceC3126;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C13752 c13752 = this.f20237;
        C1777 c1777 = new C1777(c13752.f45340);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(c13752.getFileName());
        c1777.mo5827(new View.OnClickListener() { // from class: l.᩶ۡۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f64212.f20235.m5825();
            }
        });
        c1777.mo5843();
        this.f20235 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C13752 c13752 = this.f20237;
        if (c13752.f45339) {
            C3872.m11212(c13752.f45343, c13752.f45344);
        }
        ExecutorService executorServiceNewFixedThreadPool = null;
        try {
            PackageInstaller.Session sessionMo9429 = this.f20234.mo9429(C16574.m38982());
            try {
                if (c13752.f45339) {
                    this.f20236 = new C1715();
                    C2455 c2455 = new C2455(c13752.f45343);
                    try {
                        this.f20236.m5709(c2455, c13752.f45344);
                        this.f20235.m5837(R.string.MT_Protector);
                        C8516 c8516 = new C8516(this.f20236.f6778);
                        c8516.m22241(new InterfaceC21921() { // from class: l.֡ۡۚ
                            @Override // l.InterfaceC21921
                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final void mo1855(int i) {
                                C5949 c5949 = this.f1650;
                                c5949.f20235.m5840(i);
                                if (i == 100) {
                                    c5949.f20235.m5833(true);
                                }
                            }
                        });
                        this.f20232 = new C22218(c2455.m7483(), c8516);
                        this.f20235.mo5828(new Runnable() { // from class: l.ܽۡۚ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f53113.f20232.f72660 = true;
                            }
                        });
                        ExecutorService executorService = C4716.f16632;
                        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
                        this.f20236.m5710(this.f20232, sessionMo9429, executorServiceNewFixedThreadPool);
                        C22218 c22218 = this.f20232;
                        if (c22218.f72660) {
                            sessionMo9429.abandon();
                            c2455.close();
                            sessionMo9429.close();
                            if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                                return;
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                            return;
                        }
                        c22218.m49333();
                        c2455.close();
                    } catch (Throwable th) {
                        try {
                            c2455.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    this.f20235.m5837(R.string.MT_Protector);
                    this.f20235.mo5828((Runnable) null);
                    C8516 c8517 = new C8516(c13752.f45343.mo33964());
                    c8517.m22241(new InterfaceC21921() { // from class: l.۫ۡۚ
                        @Override // l.InterfaceC21921
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1855(int i) {
                            C5949 c5949 = this.f41128;
                            c5949.f20235.m5840(i);
                            if (i == 100) {
                                c5949.f20235.m5833(true);
                            }
                        }
                    });
                    OutputStream outputStreamOpenWrite = sessionMo9429.openWrite(c13752.getFileName(), 0L, -1L);
                    try {
                        c13752.f45343.m46696(outputStreamOpenWrite, new C17238(this, c8517));
                        if (outputStreamOpenWrite != null) {
                            outputStreamOpenWrite.close();
                        }
                        if (this.f20235.m5824()) {
                            sessionMo9429.abandon();
                            sessionMo9429.close();
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
                C9478 c9478 = new C9478();
                c9478.f32074 = new CountDownLatch(1);
                sessionMo9429.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c9478));
                while (!c9478.f32074.await(500L, TimeUnit.MILLISECONDS)) {
                    if (this.f20235.m5824()) {
                        sessionMo9429.abandon();
                        sessionMo9429.close();
                        if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                            return;
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        return;
                    }
                }
                Intent intent = c9478.f32075;
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                if (intExtra == 0) {
                    this.f20233 = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                    C1715 c1715 = this.f20236;
                    if (c1715 != null) {
                        c1715.m5711(this.f20232, this.f20235, executorServiceNewFixedThreadPool);
                    }
                } else {
                    if (intExtra == 3) {
                        throw new CancellationException();
                    }
                    String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    if (TextUtils.isEmpty(stringExtra)) {
                        throw new C4987(R.string.MT_Protector);
                    }
                    C3872.m11208(stringExtra.replace("Success", ""));
                }
                sessionMo9429.close();
                if (executorServiceNewFixedThreadPool == null || executorServiceNewFixedThreadPool.isShutdown()) {
                    return;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable th5) {
                if (sessionMo9429 != null) {
                    try {
                        sessionMo9429.close();
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

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (!this.f20235.m5824()) {
            C13752 c13752 = this.f20237;
            C3872.m11209(c13752.f45340, c13752.getFileName(), this.f20233);
            if (c13752.f45339) {
                return;
            }
            C3872.f14476.mo23642((Object) null);
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        String message = exc.getMessage();
        if (message != null && message.equals("binder haven't been received")) {
            this.f20234.mo9430();
            return;
        }
        if ((exc instanceof CancellationException) || this.f20235.m5824()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C19396;
        C13752 c13752 = this.f20237;
        if (z) {
            C19396 c19396 = (C19396) exc;
            if (c19396.m44445()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c13752.f45341);
                C21843.m48614(C16737.m39277()).m48618(intent);
                return;
            } else if (c19396.m44444()) {
                AbstractActivityC12483 abstractActivityC12483 = c13752.f45340;
                String message2 = c19396.getMessage();
                String strM44442 = c19396.m44442();
                abstractActivityC12483.getClass();
                abstractActivityC12483.runOnUiThread(new RunnableC6837(abstractActivityC12483, message2, strM44442, false));
                return;
            }
        }
        c13752.m33509(exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f20235.m5825();
    }
}
