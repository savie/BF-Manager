package l;

import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import bin.mt.plus.Features;
import java.io.File;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5CH */
/* JADX INFO: loaded from: classes.dex */
public final class C24216 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C24216 f78467 = new C24216();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler f78468;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C24216 m54209() {
        return f78467;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54210() {
        f78468 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        C20653.m47270();
        if (th != null && f78468 != null) {
            String strM54208 = m54208(th);
            try {
                File file = new File("/data/data/bin.mt.plus/DEBUG.log");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                int i = C0147.f1116;
                String string = C17359.toString(strM54208, null);
                OutputStream outputStreamM1310 = C0147.m1310(file);
                try {
                    byte[] bArr = C5125.f17846;
                    if (string != null) {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(outputStreamM1310);
                        int i2 = C18046.f59088;
                        if (charsetDefaultCharset == null) {
                            charsetDefaultCharset = Charset.defaultCharset();
                        }
                        writableByteChannelNewChannel.write(charsetDefaultCharset.encode(string));
                    }
                    if (outputStreamM1310 != null) {
                        outputStreamM1310.close();
                    }
                } catch (Throwable th2) {
                    if (outputStreamM1310 != null) {
                        try {
                            outputStreamM1310.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            try {
                C6382.m18134().m49876("DEBUG.log").m49879(strM54208);
            } catch (Throwable unused2) {
            }
            if (C16237.f52781) {
                try {
                    Intent intent = new Intent();
                    intent.setClass(C21576.m49084(), ActivityC3253.class);
                    intent.setFlags(268435456);
                    C21576.m49084().startActivity(intent);
                    Process.killProcess(Process.myPid());
                    return;
                } catch (Throwable unused3) {
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f78468;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            System.out.println("use DefaultHandler");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54208(Throwable th) {
        String str;
        th.getClass();
        if (C7756.m21096()) {
            str = "ROOT";
        } else {
            str = C7756.m21111() ? "SHELL" : "APP";
        }
        StringBuilder sb = new StringBuilder("VER: ");
        sb.append("2.26.11(26110365)\nPERMISSION: ");
        sb.append(str);
        sb.append("\nABI: ");
        sb.append(Features.getABI());
        sb.append("\nMODEL: ");
        sb.append(Build.MODEL);
        sb.append("\nSDK: ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\nRELEASE: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        try {
            sb.append("TARGET_SDK: ");
            sb.append(C21576.m49056().targetSdkVersion);
            sb.append('\n');
        } catch (Throwable unused) {
        }
        if (C7756.m21111() && (th instanceof C16024) && TextUtils.indexOf(sb, "at android.os.BinderProxy.transactNative(Native Method)") != -1) {
            sb.append("===============================================\n该错误可能是由 Shizuku 导致的，请尝试进入 Shizuku 中\n关掉 MT 管理器的授权，然后再重新打开 MT 管理器！\n===============================================\nThis error may be caused by Shizuku. Please try to enter Shizuku,\nturn off the authorization of MT and then reopen MT!\n===============================================\n");
        }
        sb.append("---StackTrace---");
        sb.append('\n');
        C17370.m40800(sb, th);
        return sb.toString();
    }
}
