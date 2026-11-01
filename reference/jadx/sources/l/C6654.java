package l;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۜۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6654 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22218 f22470;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f22471;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1777 f22472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1715 f22473 = new C1715();

    public C6654(C13752 c13752) {
        this.f22471 = c13752;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C13752 c13752 = this.f22471;
        C1777 c1777 = new C1777(c13752.f45340);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(c13752.getFileName());
        c1777.mo5827(new View.OnClickListener() { // from class: l.ۘۡۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14203.f22472.m5825();
            }
        });
        c1777.mo5843();
        this.f22472 = c1777;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.֫ۡۚ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.pm.PackageInstaller] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.pm.PackageInstaller$Session, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.pm.PackageInstaller$Session] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        boolean z;
        C18690 c18690;
        C22218 c22218;
        Throwable th;
        ?? r0 = this.f22473;
        C13752 c13752 = this.f22471;
        C3872.m11212(c13752.f45343, c13752.f45344);
        PackageInstaller.SessionParams sessionParamsM38982 = C16574.m38982();
        if (Build.VERSION.SDK_INT >= 26) {
            sessionParamsM38982.setInstallReason(4);
        }
        ?? packageInstaller = C16737.m39292().getPackageInstaller();
        int iCreateSession = packageInstaller.createSession(sessionParamsM38982);
        ExecutorService executorService = C4716.f16632;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C5464.f18831);
        final C18690 c18690M21325 = null;
        ?? r8 = 0;
        ?? r9 = 0;
        try {
            try {
                C2455 c2455 = new C2455(c13752.f45343);
                try {
                    packageInstaller = packageInstaller.openSession(iCreateSession);
                    try {
                        r0.m5709(c2455, c13752.f45344);
                        this.f22472.m5837(R.string.MT_Protector);
                        C8516 c8516 = new C8516(r0.f6778);
                        c8516.m22241(new InterfaceC21921() { // from class: l.ۚۡۚ
                            @Override // l.InterfaceC21921
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1855(int i) {
                                C6654 c6654 = this.f18176;
                                c6654.f22472.m5840(i);
                                if (i == 100) {
                                    c6654.f22472.m5833(true);
                                }
                            }
                        });
                        this.f22470 = new C22218(c2455.m7483(), c8516);
                        this.f22472.mo5828(new Runnable() { // from class: l.᩹ۡۚ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f72537.f22470.f72660 = true;
                            }
                        });
                        r0.m5710(this.f22470, packageInstaller, executorServiceNewFixedThreadPool);
                        C22218 c22219 = this.f22470;
                        if (c22219.f72660) {
                            throw new CancellationException();
                        }
                        c22219.m49333();
                        c18690M21325 = C8107.m21325(iCreateSession);
                        Intent intent = new Intent("bin.mt.file.action.INSTALL_CALLBACK");
                        intent.setPackage(c13752.f45340.getPackageName());
                        intent.putExtra("android.content.pm.extra.SESSION_ID", iCreateSession);
                        PendingIntent broadcast = PendingIntent.getBroadcast(c13752.f45340, iCreateSession, intent, 167772160);
                        z = false;
                        C16737.m39273(new RunnableC1009(0, packageInstaller, broadcast));
                        try {
                            this.f22472.mo5828(new Runnable() { // from class: l.۬ۡۚ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6654 c6654 = this.f43370;
                                    C18690 c18691 = c18690M21325;
                                    c6654.f22470.f72660 = true;
                                    synchronized (c18691) {
                                        c18691.notifyAll();
                                    }
                                }
                            });
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            while (true) {
                                if (!c18690M21325.m43176()) {
                                    if (this.f22472.m5824()) {
                                        throw new CancellationException();
                                    }
                                    if (c18690M21325.m43179() == -1) {
                                        if (C12597.m31369()) {
                                            ApplicationC0716.f2992.edit().putBoolean("show_apks_miui_warning", true).apply();
                                            throw new C4987(R.string.MT_Protector);
                                        }
                                        throw new C4987(R.string.MT_Protector);
                                    }
                                    if (!this.f22472.m5838() && c18690M21325.m43179() == 1 && System.currentTimeMillis() - jCurrentTimeMillis > 60000) {
                                        throw new C5284();
                                    }
                                } else if (c18690M21325.m43179() == 1) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                int iM43179 = c18690M21325.m43179();
                                String strM43177 = c18690M21325.m43177();
                                if (iM43179 == 0) {
                                    if (!TextUtils.isEmpty(strM43177) && r0.f6776 == null) {
                                        r0.f6776 = strM43177;
                                    }
                                    r0.m5711(this.f22470, this.f22472, executorServiceNewFixedThreadPool);
                                    c2455.close();
                                    if (!executorServiceNewFixedThreadPool.isShutdown()) {
                                        C22218 c222110 = this.f22470;
                                        if (c222110 != null) {
                                            c222110.f72660 = true;
                                        }
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                                    }
                                    if (packageInstaller != 0) {
                                        packageInstaller.close();
                                    }
                                    c18690M21325.m43178();
                                    return;
                                }
                                if (iM43179 == 2) {
                                    throw new CancellationException();
                                }
                                if (iM43179 == 3) {
                                    if (TextUtils.isEmpty(strM43177)) {
                                        throw new C4987(R.string.MT_Protector);
                                    }
                                    C3872.m11208(strM43177.replace("Success", ""));
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                c2455.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r8 = packageInstaller;
                        packageInstaller = r8;
                        z = true;
                        c18690M21325 = null;
                        th = th;
                        c2455.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c18690 = c18690M21325;
                r9 = packageInstaller;
                if (!executorServiceNewFixedThreadPool.isShutdown()) {
                    c22218 = this.f22470;
                    if (c22218 != null) {
                        c22218.f72660 = true;
                    }
                    executorServiceNewFixedThreadPool.shutdownNow();
                    executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                }
                if (r9 != 0) {
                    if (z) {
                        r9.abandon();
                    }
                    r9.close();
                }
                if (c18690 != null) {
                    c18690.m43178();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            z = true;
            c18690 = null;
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c22218 = this.f22470;
                if (c22218 != null) {
                    c22218.f72660 = true;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
            if (r9 != 0) {
                if (z) {
                    r9.abandon();
                }
                r9.close();
            }
            if (c18690 != null) {
                c18690.m43178();
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f22472.m5824()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (C12597.m31369()) {
            C1679.m5597(ApplicationC0716.f2992, "show_apks_miui_warning", false);
        }
        C13752 c13752 = this.f22471;
        C3872.m11209(c13752.f45340, c13752.getFileName(), this.f22473.f6776);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (!(exc instanceof C5284) || this.f22472.m5838()) {
            if (exc instanceof CancellationException) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            String message = exc.getMessage();
            boolean zM31369 = C12597.m31369();
            C13752 c13752 = this.f22471;
            if (!zM31369 || message == null || !message.contains("INSTALL_FAILED_INTERNAL_ERROR")) {
                c13752.m33509(exc);
            } else {
                C1679.m5597(ApplicationC0716.f2992, "show_apks_miui_warning", true);
                c13752.m33507(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f22472.m5825();
    }
}
