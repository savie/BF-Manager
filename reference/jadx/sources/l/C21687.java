package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21687 extends AbstractC15338 implements Handler.Callback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C19571 f70354;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HandlerThread f70355;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Handler f70356;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public char[] f70357;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C19571 f70359;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FileWriter f70360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C19571 f70361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18159 f70362;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public File f70363;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile C19571 f70364;

    public C21687(C18159 c18159) {
        String str = C18865.f61094;
        this.f70358 = false;
        this.f70362 = c18159;
        this.f70359 = new C19571();
        this.f70364 = new C19571();
        this.f70361 = this.f70359;
        this.f70354 = this.f70364;
        this.f70357 = new char[c18159.m42284()];
        HandlerThread handlerThread = new HandlerThread("OpenSDK.Client.File.Tracer", 10);
        this.f70355 = handlerThread;
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f70356 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48440() {
        Handler handler = this.f70356;
        if (handler.hasMessages(1024)) {
            handler.removeMessages(1024);
        }
        handler.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48439() {
        m48438();
        this.f70355.quit();
    }

    @Override // l.AbstractC15338
    /* JADX INFO: renamed from: ܰ */
    public final void mo21701(int i, Thread thread, long j, String str, String str2, Throwable th) {
        String str3;
        m36716().getClass();
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            str3 = "V";
        } else if (i == 2) {
            str3 = "D";
        } else if (i == 4) {
            str3 = "I";
        } else if (i == 8) {
            str3 = "W";
        } else if (i != 16) {
            str3 = i != 32 ? "-" : "A";
        } else {
            str3 = "E";
        }
        sb.append(str3);
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append('.');
        if (j2 < 10) {
            sb.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(" [");
        sb.append(Process.myPid());
        sb.append("][");
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, "][", str, "] ", str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        this.f70361.m44675(sb.toString());
        if (this.f70361.m44677() >= this.f70362.m42284()) {
            m48440();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024 && Thread.currentThread() == this.f70355 && !this.f70358) {
            this.f70358 = true;
            synchronized (this) {
                if (this.f70361 == this.f70359) {
                    this.f70361 = this.f70364;
                    this.f70354 = this.f70359;
                } else {
                    this.f70361 = this.f70359;
                    this.f70354 = this.f70364;
                }
            }
            try {
                try {
                    this.f70354.m44674(m48437(), this.f70357);
                } catch (IOException e) {
                    C23099.m51111("FileTracer", "flushBuffer exception", e);
                }
                this.f70354.m44676();
                this.f70358 = false;
            } catch (Throwable th) {
                this.f70354.m44676();
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m48438() {
        try {
            FileWriter fileWriter = this.f70360;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f70360.close();
            }
        } catch (IOException e) {
            C23099.m51111("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private FileWriter m48437() {
        String string;
        File file;
        File[] fileArrListFiles;
        this.f70362.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        String strM38890 = C16523.m38890("com.tencent.mobileqq_connectSdk.", new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime()), ".log");
        File fileM5870 = C1791.m5870();
        if (fileM5870 != null) {
            if (!fileM5870.exists()) {
                fileM5870.mkdirs();
            }
            string = fileM5870.toString();
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string) && string == null) {
            file = null;
        } else {
            try {
                File file2 = new File(string, C18865.f61095);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, strM38890);
            } catch (Exception e) {
                C23099.m51111("openSDK_LOG", "getWorkFile,get app specific file exception:", e);
                file = null;
            }
        }
        if (file != null && (!file.equals(this.f70363) || this.f70360 == null)) {
            this.f70363 = file;
            m48438();
            try {
                this.f70360 = new FileWriter(this.f70363, true);
            } catch (IOException unused) {
                this.f70360 = null;
                C23099.m51115("openSDK_LOG", "-->obtainFileWriter() app specific file permission denied");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory() && (fileArrListFiles = parentFile.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3 != null) {
                        String name = file3.getName();
                        C23099.m51110("FileTracer", "name=" + name);
                        if (!TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log")) {
                            String name2 = file3.getName();
                            String strSubstring = name2.substring(32, 43);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - 259200000;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(jCurrentTimeMillis2);
                            if (new SimpleDateFormat("yy.MM.dd.HH").format(calendar2.getTime()).compareTo(strSubstring) > 0) {
                                C23099.m51110("FileTracer", "delete name=" + name2 + ", success=" + file3.delete());
                            }
                        }
                    }
                }
            }
        }
        return this.f70360;
    }
}
