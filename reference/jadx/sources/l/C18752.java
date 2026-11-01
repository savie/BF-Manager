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

/* JADX INFO: renamed from: l.ᩴ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5CH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18752 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18752 f60805 = new C18752();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler f60806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18752 m43303() {
        return f60805;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43304() {
        f60806 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        C0577.m2745();
        if (th != null && f60806 != null) {
            String strM43302 = m43302(th);
            try {
                File file = new File("/data/data/bin.mt.plus/DEBUG.log");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                int i = C15071.f49127;
                String string = C13638.toString(strM43302, null);
                OutputStream outputStreamM36109 = C15071.m36109(file);
                try {
                    byte[] bArr = C20010.f64054;
                    if (string != null) {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(outputStreamM36109);
                        int i2 = C22832.f74282;
                        if (charsetDefaultCharset == null) {
                            charsetDefaultCharset = Charset.defaultCharset();
                        }
                        writableByteChannelNewChannel.write(charsetDefaultCharset.encode(string));
                    }
                    if (outputStreamM36109 != null) {
                        outputStreamM36109.close();
                    }
                } catch (Throwable th2) {
                    if (outputStreamM36109 != null) {
                        try {
                            outputStreamM36109.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable unused) {
            }
            try {
                C11904.m29695().m46690("DEBUG.log").m46735(strM43302);
            } catch (Throwable unused2) {
            }
            if (C9927.f33907) {
                try {
                    Intent intent = new Intent();
                    intent.setClass(C16737.m39277(), ActivityC17608.class);
                    intent.setFlags(268435456);
                    C16737.m39277().startActivity(intent);
                    Process.killProcess(Process.myPid());
                    return;
                } catch (Throwable unused3) {
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f60806;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            System.out.println("use DefaultHandler");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43302(Throwable th) {
        String str;
        th.getClass();
        if (C6696.m18084()) {
            str = "ROOT";
        } else {
            str = C6696.m18097() ? "SHELL" : "APP";
        }
        StringBuilder sb = new StringBuilder("VER: ");
        sb.append("2.26.10(26101061)\nPERMISSION: ");
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
            sb.append(C16737.m39261().targetSdkVersion);
            sb.append('\n');
        } catch (Throwable unused) {
        }
        if (C6696.m18097() && (th instanceof C10271) && TextUtils.indexOf(sb, "at android.os.BinderProxy.transactNative(Native Method)") != -1) {
            sb.append("===============================================\n该错误可能是由 Shizuku 导致的，请尝试进入 Shizuku 中\n关掉 MT 管理器的授权，然后再重新打开 MT 管理器！\n===============================================\nThis error may be caused by Shizuku. Please try to enter Shizuku,\nturn off the authorization of MT and then reopen MT!\n===============================================\n");
        }
        sb.append("---StackTrace---");
        sb.append('\n');
        C17874.m41463(sb, th);
        return sb.toString();
    }
}
