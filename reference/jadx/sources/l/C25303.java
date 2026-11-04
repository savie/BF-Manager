package l;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.sdk.m.y.k;
import com.rosan.dhizuku.api.Dhizuku;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DO */
/* JADX INFO: loaded from: classes.dex */
public final class C25303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2182 f81743;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m56558(String str, ActivityC23745 activityC23745) {
        C2182 c2182 = f81743;
        if (c2182 != null && c2182.f7176.equals(str) && !c2182.f7172) {
            c2182.f7172 = true;
            try {
                try {
                    c2182.f7175.m45583();
                    try {
                        activityC23745.startActivity(c2182.f7173);
                    } catch (ActivityNotFoundException e) {
                        if (c2182.f7173.getComponent() == null) {
                            throw e;
                        }
                        c2182.f7173.setComponent(null);
                        activityC23745.startActivity(c2182.f7173);
                    }
                    c2182.f7174 = new C22802("user_action_required", "Installation request sent. Continue on the phone to confirm installation.");
                } catch (Exception unused) {
                    c2182.f7174 = m56551("Cannot open the installation screen. Open MT and retry.");
                }
                c2182.f7177.countDown();
            } catch (Throwable th) {
                c2182.f7177.countDown();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56557(C19818 c19818) {
        C2182 c2182 = new C2182(c19818);
        synchronized (C25303.class) {
            if (f81743 != null) {
                throw C10186.m26298(null, "APK_INSTALL_BUSY", "Another installation request is running. Wait for it to finish before retrying.", "warning");
            }
            f81743 = c2182;
        }
        try {
            try {
                AbstractC22044 abstractC22044M45584 = c19818.m45584();
                String strM40856 = C17394.m40856();
                if (m56561()) {
                    C22802 c22802M56555 = m56555(c2182, abstractC22044M45584, strM40856, false);
                    synchronized (C25303.class) {
                        if (f81743 == c2182) {
                            f81743 = null;
                        }
                    }
                    return c22802M56555;
                }
                if (!m56560()) {
                    if (ApplicationC17729.f58262.getBoolean("apk_installation_root", true) && C7756.m21096()) {
                        C22802 c22802M56554 = m56554(c2182, abstractC22044M45584, strM40856);
                        synchronized (C25303.class) {
                            if (f81743 == c2182) {
                                f81743 = null;
                            }
                        }
                        return c22802M56554;
                    }
                    C22802 c22802M56553 = m56553(c2182, abstractC22044M45584);
                    synchronized (C25303.class) {
                        if (f81743 == c2182) {
                            f81743 = null;
                        }
                    }
                    return c22802M56553;
                }
                C22802 c22802M56556 = m56555(c2182, abstractC22044M45584, strM40856, true);
                if (strM40856.isEmpty() || c22802M56556.m51415().equals(k.j)) {
                    synchronized (C25303.class) {
                        if (f81743 == c2182) {
                            f81743 = null;
                        }
                    }
                    return c22802M56556;
                }
                C22802 c22802 = new C22802(c22802M56556.m51415(), c22802M56556.m51414() + " Dhizuku uses its own installer source; the configured installer source is not applied.");
                synchronized (C25303.class) {
                    if (f81743 == c2182) {
                        f81743 = null;
                    }
                }
                return c22802;
            } catch (C10186 e) {
                throw e;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Cannot start installation: ");
                sb.append(e2.getMessage() == null ? e2.getClass().getSimpleName() : e2.getMessage());
                C22802 c22802M56551 = m56551(sb.toString());
                synchronized (C25303.class) {
                    if (f81743 == c2182) {
                        f81743 = null;
                    }
                    return c22802M56551;
                }
            }
        } catch (Throwable th) {
            synchronized (C25303.class) {
                if (f81743 == c2182) {
                    f81743 = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56561() {
        if (Build.VERSION.SDK_INT >= 23 && ApplicationC17729.f58262.getBoolean("apk_installation_shizuku", true) && !C20327.m46701().m46704("disable_install_by_shizuku")) {
            try {
                if (!C12797.m31698() && C12797.m31700() == 0) {
                    return true;
                }
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56560() {
        if (!ApplicationC17729.f58262.getBoolean("apk_installation_dhizuku", true) || C20327.m46701().m46704("disable_install_by_shizuku")) {
            return false;
        }
        try {
            return Dhizuku.init(C21576.m49084()) && Dhizuku.isPermissionGranted();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56553(C2182 c2182, AbstractC22044 abstractC22044) {
        boolean zCanRequestPackageInstalls;
        Uri uriM41231;
        Application applicationM49084 = C21576.m49084();
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 26) {
            zCanRequestPackageInstalls = C21576.m49081().canRequestPackageInstalls();
        } else {
            zCanRequestPackageInstalls = Settings.Secure.getInt(applicationM49084.getContentResolver(), "install_non_market_apps", 0) != 0;
        }
        if (!zCanRequestPackageInstalls) {
            C21576.m49068(new RunnableC13368(i2, applicationM49084));
            return m56551("Allow MT to install unknown apps in the phone settings, then retry.");
        }
        if (i < 24) {
            String str = C17568.f57086;
            if (C21576.f68932.getBoolean("apk_installation_prevents_deletion", false) || !abstractC22044.mo4291()) {
                uriM41231 = C17568.m41231(abstractC22044);
            } else {
                uriM41231 = abstractC22044.m49836();
            }
        } else {
            uriM41231 = C17568.m41231(abstractC22044);
        }
        Intent intentAddFlags = new Intent("android.intent.action.VIEW").setDataAndType(uriM41231, "application/vnd.android.package-archive").addFlags(1);
        intentAddFlags.putExtra("_install_apk_from_mt_as5d42", true);
        intentAddFlags.setComponent(C2119.m7302(C21576.m49081()));
        return m56552(c2182, intentAddFlags);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56554(C2182 c2182, AbstractC22044 abstractC22044, String str) throws Throwable {
        C1790 c1790;
        C22802 c22802M56551;
        String str2;
        if (abstractC22044.mo49880()) {
            boolean z = false;
            C1790 c1791 = null;
            try {
                try {
                    String strM44123 = C19036.m44123(false);
                    if (strM44123 == null) {
                        strM44123 = "su";
                    }
                    c1790 = new C1790(strM44123, false);
                    try {
                        try {
                            int i = Build.VERSION.SDK_INT;
                            String strValueOf = i <= 23 ? String.valueOf(Process.myUserHandle().hashCode()) : "current";
                            if (strValueOf.equals("current") && !str.isEmpty()) {
                                strValueOf = String.valueOf(C17394.m40855(c1790));
                            }
                            C17394.m40857(c1790, strValueOf, str);
                            String str3 = "-r -t -d " + C17394.m40859(str) + "--user " + strValueOf + " ";
                            if (i >= 34) {
                                str3 = str3 + "--bypass-low-target-sdk-block ";
                            }
                            String strM21098 = C7756.m21098(abstractC22044.mo4294());
                            if (i >= 28 && !"/data/local/tmp".equals(abstractC22044.getParent())) {
                                str2 = "cat " + strM21098 + " | pm install " + str3 + "-S " + abstractC22044.mo4285();
                            } else {
                                str2 = "pm install " + str3 + strM21098;
                            }
                            c2182.f7175.m45583();
                            try {
                                C22802 c22802M56556 = m56556(c1790.mo6261(60000L, str2));
                                c1790.close();
                                return c22802M56556;
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                c1791 = c1790;
                                if (!z) {
                                    StringBuilder sb = new StringBuilder("Cannot start root installation: ");
                                    sb.append(e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
                                    c22802M56551 = m56551(sb.toString());
                                } else {
                                    c22802M56551 = new C22802("started", "Installation was submitted but its result is unavailable. Check the phone before retrying.");
                                }
                                if (c1791 != null) {
                                    c1791.close();
                                }
                                return c22802M56551;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (c1790 != null) {
                                c1790.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                c1790 = null;
            }
        } else {
            return m56551("The root installer cannot read this file path. Save the APK to shared storage and retry.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[Catch: all -> 0x019f, Exception -> 0x01a1, SYNTHETIC, TRY_LEAVE, TryCatch #15 {Exception -> 0x01a1, blocks: (B:3:0x000c, B:5:0x0013, B:19:0x004c, B:21:0x0052, B:23:0x005c, B:25:0x006a, B:27:0x007d, B:40:0x00ba, B:108:0x019e, B:107:0x019b, B:26:0x0073, B:6:0x001d, B:11:0x002c, B:13:0x0036, B:15:0x003b, B:17:0x0042), top: B:176:0x000c }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56555(C2182 c2182, AbstractC22044 abstractC22044, String str, boolean z) throws Throwable {
        C22802 c22802M56551;
        int i;
        String ownerPackageName;
        IPackageInstaller iPackageInstallerM39256;
        C22802 c22802;
        C22802 c22803;
        PackageInstaller.Session sessionM39250 = null;
        boolean z2 = false;
        try {
            try {
                PackageInstaller.SessionParams sessionParamsM39251 = C16582.m39251();
                if (z) {
                    iPackageInstallerM39256 = C16582.m39256();
                    ownerPackageName = Dhizuku.getOwnerPackageName();
                    i = 0;
                } else {
                    IPackageInstaller iPackageInstallerM39255 = C16582.m39255();
                    boolean z3 = C12797.m31705() == 0;
                    int iHashCode = z3 ? Process.myUserHandle().hashCode() : 0;
                    C16582.m39254(iHashCode, str);
                    String strM39253 = C16582.m39253(sessionParamsM39251, z3 ? C21576.m49092() : "com.android.shell", str);
                    i = iHashCode;
                    ownerPackageName = strM39253;
                    iPackageInstallerM39256 = iPackageInstallerM39255;
                }
                IPackageInstallerSession iPackageInstallerSessionOpenSession = iPackageInstallerM39256.openSession(C16582.m39252(iPackageInstallerM39256, ownerPackageName, (z || Build.VERSION.SDK_INT < 31) ? null : C21576.m49084().getAttributionTag(), i).createSession(sessionParamsM39251));
                sessionM39250 = C16582.m39250(IPackageInstallerSession.Stub.asInterface(z ? Dhizuku.binderWrapper(iPackageInstallerSessionOpenSession.asBinder()) : new C5340(iPackageInstallerSessionOpenSession.asBinder())));
                InputStream inputStreamMo4290 = abstractC22044.mo4290();
                try {
                    OutputStream outputStreamOpenWrite = sessionM39250.openWrite(abstractC22044.getName(), 0L, -1L);
                    try {
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int i2 = inputStreamMo4290.read(bArr);
                            if (i2 == -1) {
                                if (outputStreamOpenWrite != null) {
                                    outputStreamOpenWrite.close();
                                }
                                inputStreamMo4290.close();
                                C11876 c11876 = new C11876(0);
                                try {
                                    try {
                                        sessionM39250.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c11876));
                                        if (c11876.f38290.await(60000L, TimeUnit.MILLISECONDS)) {
                                            Intent intent = c11876.f38291;
                                            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                                            if (intExtra == 0) {
                                                c22803 = new C22802("installed", "Installation completed.");
                                            } else {
                                                try {
                                                    if (intExtra != -1) {
                                                        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                                        if (TextUtils.isEmpty(stringExtra)) {
                                                            stringExtra = "Installation failed (status " + intExtra + ").";
                                                        }
                                                        C22802 c22802M56552 = m56551(stringExtra);
                                                        sessionM39250.close();
                                                        return c22802M56552;
                                                    }
                                                    Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                                                    if (intent2 == null) {
                                                        try {
                                                            sessionM39250.abandon();
                                                        } catch (Exception e) {
                                                            C20653.m47272("Cannot abandon MCP installation session", e);
                                                        }
                                                        C22802 c22802M56553 = m56551("The installer did not provide a confirmation screen.");
                                                        sessionM39250.close();
                                                        return c22802M56553;
                                                    }
                                                    C22802 c22802M56554 = m56552(c2182, intent2);
                                                    if (c22802M56554.m51415().equals(k.j)) {
                                                        try {
                                                            sessionM39250.abandon();
                                                        } catch (Exception e2) {
                                                            C20653.m47272("Cannot abandon MCP installation session", e2);
                                                        }
                                                    }
                                                    try {
                                                        sessionM39250.close();
                                                        return c22802M56554;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        c22802 = c22802M56554;
                                                    }
                                                } catch (Exception e4) {
                                                    C20653.m47272("Cannot close MCP installation session", e4);
                                                    return "Installation was submitted but its result is unavailable. Check the phone before retrying.";
                                                }
                                            }
                                            C20653.m47272("Cannot close MCP installation session", e);
                                            return c22802;
                                        }
                                        c22803 = new C22802("started", "Installation was submitted but its result is unavailable. Check the phone before retrying.");
                                        c22802 = c22803;
                                        try {
                                            sessionM39250.close();
                                            return c22802;
                                        } catch (Exception e5) {
                                            e = e5;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        z2 = true;
                                        if (e instanceof InterruptedException) {
                                            Thread.currentThread().interrupt();
                                        }
                                        if (z2) {
                                            c22802M56551 = new C22802("started", "Installation was submitted but its result is unavailable. Check the phone before retrying.");
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Cannot start ");
                                            sb.append(z ? "Dhizuku" : "Shizuku");
                                            sb.append(" installation: ");
                                            sb.append(e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
                                            c22802M56551 = m56551(sb.toString());
                                        }
                                        C22802 c22804 = c22802M56551;
                                        if (sessionM39250 != null) {
                                            if (!z2) {
                                                try {
                                                    sessionM39250.abandon();
                                                } catch (Exception e7) {
                                                    C20653.m47272("Cannot abandon MCP installation session", e7);
                                                }
                                            }
                                            try {
                                                sessionM39250.close();
                                            } catch (Exception e8) {
                                                C20653.m47272("Cannot close MCP installation session", e8);
                                            }
                                        }
                                        return c22804;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = true;
                                    Throwable th2 = th;
                                    if (sessionM39250 == null) {
                                        throw th2;
                                    }
                                    if (!z2) {
                                        try {
                                            sessionM39250.abandon();
                                        } catch (Exception e9) {
                                            C20653.m47272("Cannot abandon MCP installation session", e9);
                                        }
                                    }
                                    try {
                                        sessionM39250.close();
                                        throw th2;
                                    } catch (Exception e10) {
                                        C20653.m47272("Cannot close MCP installation session", e10);
                                        throw th2;
                                    }
                                }
                            } else {
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new InterruptedException();
                                }
                                outputStreamOpenWrite.write(bArr, 0, i2);
                            }
                            if (inputStreamMo4290 != null) {
                                throw th;
                            }
                            try {
                                inputStreamMo4290.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        if (outputStreamOpenWrite == null) {
                            throw th4;
                        }
                        try {
                            outputStreamOpenWrite.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    if (inputStreamMo4290 != null) {
                        throw th6;
                    }
                    inputStreamMo4290.close();
                    throw th6;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56556(C11484 c11484) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = c11484.f36125;
        sb.append(TextUtils.join("\n", strArr));
        sb.append("\n");
        sb.append(c11484.f36124);
        for (String str : sb.toString().split("\n")) {
            String strTrim = str.trim();
            if (strTrim.startsWith("Failure [") && strTrim.endsWith("]")) {
                return m56551(strTrim);
            }
        }
        if (!c11484.m28855()) {
            for (String str2 : strArr) {
                String strTrim2 = str2.trim();
                if (strTrim2.equals("Success") || strTrim2.startsWith("Completed with warning(s)")) {
                    return new C22802("installed", "Installation completed.");
                }
            }
        }
        return new C22802("started", "Installation was submitted but its result is unavailable. Check the phone before retrying.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56552(final C2182 c2182, Intent intent) {
        C22802 c22802M56551;
        c2182.f7173 = intent;
        C21576.m49068(new Runnable() { // from class: l.ۚ᩷ۚ
            @Override // java.lang.Runnable
            public final void run() {
                C25303.m56559(c2182);
            }
        });
        try {
            c2182.f7177.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        synchronized (C25303.class) {
            c2182.f7172 = true;
            c22802M56551 = c2182.f7174;
            if (c22802M56551 == null) {
                c22802M56551 = m56551("Cannot open the installation screen. Open MT and retry.");
            }
        }
        return c22802M56551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56559(C2182 c2182) {
        synchronized (C25303.class) {
            if (f81743 != c2182 || c2182.f7172) {
                return;
            }
            try {
                C21576.m49084().startActivity(new Intent(C21576.m49084(), (Class<?>) ActivityC23745.class).putExtra("requestId", c2182.f7176).addFlags(268435456));
            } catch (RuntimeException unused) {
                c2182.f7174 = m56551("Cannot open the installation screen. Open MT and retry.");
                c2182.f7172 = true;
                c2182.f7177.countDown();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22802 m56551(String str) {
        return new C22802(k.j, str);
    }
}
