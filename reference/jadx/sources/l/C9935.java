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

/* JADX INFO: renamed from: l.ۢۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9935 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f31871;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10745 f31872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21649 f31873;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23887 f31874 = new C23887();

    public C9935(C6733 c6733) {
        this.f31871 = c6733;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C6733 c6733 = this.f31871;
        C10745 c10745 = new C10745(c6733.f22436);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(c6733.getFileName());
        c10745.mo25915(new View.OnClickListener() { // from class: l.ᩳۛᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f61303.f31872.m27405();
            }
        });
        c10745.mo25931();
        this.f31872 = c10745;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹᩺ᩴ] */
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
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        boolean z;
        C14189 c14189;
        C21649 c21649;
        Throwable th;
        ?? r0 = this.f31874;
        C6733 c6733 = this.f31871;
        C8224.m22125(c6733.f22440, c6733.f22438);
        PackageInstaller.SessionParams sessionParamsM39251 = C16582.m39251();
        if (Build.VERSION.SDK_INT >= 26) {
            sessionParamsM39251.setInstallReason(4);
        }
        ?? packageInstaller = C21576.m49081().getPackageInstaller();
        int iCreateSession = packageInstaller.createSession(sessionParamsM39251);
        ExecutorService executorService = C5261.f18541;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C11138.f35105);
        final C14189 c14189M14503 = null;
        ?? r8 = 0;
        ?? r9 = 0;
        try {
            try {
                C22941 c22941 = new C22941(c6733.f22440);
                try {
                    packageInstaller = packageInstaller.openSession(iCreateSession);
                    try {
                        r0.m53390(c22941, c6733.f22438);
                        this.f31872.m27397(R.string.MT_Protector);
                        C3374 c3374 = new C3374(r0.f77361);
                        c3374.m11078(new InterfaceC17544() { // from class: l.᩶ۛᩴ
                            @Override // l.InterfaceC17544
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1209(int i) {
                                C9935 c9935 = this.f67479;
                                c9935.f31872.m27403(i);
                                if (i == 100) {
                                    c9935.f31872.m27394(true);
                                }
                            }
                        });
                        this.f31873 = new C21649(c22941.m51723(), c3374);
                        this.f31872.mo25916(new Runnable() { // from class: l.ܿۛᩴ
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f59320.f31873.f69113 = true;
                            }
                        });
                        r0.m53388(this.f31873, packageInstaller, executorServiceNewFixedThreadPool);
                        C21649 c216410 = this.f31873;
                        if (c216410.f69113) {
                            throw new CancellationException();
                        }
                        c216410.m49175();
                        c14189M14503 = C4650.m14503(iCreateSession);
                        Intent intent = new Intent("bin.mt.file.action.INSTALL_CALLBACK");
                        intent.setPackage(c6733.f22436.getPackageName());
                        intent.putExtra("android.content.pm.extra.SESSION_ID", iCreateSession);
                        PendingIntent broadcast = PendingIntent.getBroadcast(c6733.f22436, iCreateSession, intent, 167772160);
                        z = false;
                        C21576.m49068(new RunnableC0241(0, packageInstaller, broadcast));
                        try {
                            this.f31872.mo25916(new Runnable() { // from class: l.۟ۛᩴ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9935 c9935 = this.f25406;
                                    C14189 c141810 = c14189M14503;
                                    c9935.f31873.f69113 = true;
                                    synchronized (c141810) {
                                        c141810.notifyAll();
                                    }
                                }
                            });
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            while (true) {
                                if (!c14189M14503.m34484()) {
                                    if (this.f31872.m27399()) {
                                        throw new CancellationException();
                                    }
                                    if (c14189M14503.m34483() == -1) {
                                        if (C9034.m24095()) {
                                            ApplicationC17729.f58258.edit().putBoolean("show_apks_miui_warning", true).apply();
                                            throw new C4866(R.string.MT_Protector);
                                        }
                                        throw new C4866(R.string.MT_Protector);
                                    }
                                    if (!this.f31872.m27395() && c14189M14503.m34483() == 1 && System.currentTimeMillis() - jCurrentTimeMillis > 60000) {
                                        throw new C14935();
                                    }
                                } else if (c14189M14503.m34483() == 1) {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                int iM34483 = c14189M14503.m34483();
                                String strM34481 = c14189M14503.m34481();
                                if (iM34483 == 0) {
                                    if (!TextUtils.isEmpty(strM34481) && r0.f77360 == null) {
                                        r0.f77360 = strM34481;
                                    }
                                    r0.m53389(this.f31873, this.f31872, executorServiceNewFixedThreadPool);
                                    c22941.close();
                                    if (!executorServiceNewFixedThreadPool.isShutdown()) {
                                        C21649 c216411 = this.f31873;
                                        if (c216411 != null) {
                                            c216411.f69113 = true;
                                        }
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        executorServiceNewFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
                                    }
                                    if (packageInstaller != 0) {
                                        packageInstaller.close();
                                    }
                                    c14189M14503.m34482();
                                    return;
                                }
                                if (iM34483 == 2) {
                                    throw new CancellationException();
                                }
                                if (iM34483 == 3) {
                                    if (TextUtils.isEmpty(strM34481)) {
                                        throw new C4866(R.string.MT_Protector);
                                    }
                                    C8224.m22121(strM34481.replace("Success", ""));
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                c22941.close();
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
                        c14189M14503 = null;
                        th = th;
                        c22941.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                c14189 = c14189M14503;
                r9 = packageInstaller;
                if (!executorServiceNewFixedThreadPool.isShutdown()) {
                    c21649 = this.f31873;
                    if (c21649 != null) {
                        c21649.f69113 = true;
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
                if (c14189 != null) {
                    c14189.m34482();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            z = true;
            c14189 = null;
            if (!executorServiceNewFixedThreadPool.isShutdown()) {
                c21649 = this.f31873;
                if (c21649 != null) {
                    c21649.f69113 = true;
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
            if (c14189 != null) {
                c14189.m34482();
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f31872.m27399()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (C9034.m24095()) {
            C6421.m18184(ApplicationC17729.f58258, "show_apks_miui_warning", false);
        }
        C6733 c6733 = this.f31871;
        C8224.m22122(c6733.f22436, c6733.getFileName(), this.f31874.f77360);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (!(exc instanceof C14935) || this.f31872.m27395()) {
            if (exc instanceof CancellationException) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            String message = exc.getMessage();
            boolean zM24095 = C9034.m24095();
            C6733 c6733 = this.f31871;
            if (!zM24095 || message == null || !message.contains("INSTALL_FAILED_INTERNAL_ERROR")) {
                c6733.m18824(exc);
            } else {
                C6421.m18184(ApplicationC17729.f58258, "show_apks_miui_warning", true);
                c6733.m18822(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f31872.m27405();
    }
}
