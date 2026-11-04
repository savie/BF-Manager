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

/* JADX INFO: renamed from: l.֡᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0704 extends AbstractC18603 implements Handler.Callback {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8162 f2610;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile C1450 f2611;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C1450 f2612;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Handler f2613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f2614;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public FileWriter f2615;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public volatile C1450 f2616;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile C1450 f2617;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public char[] f2618;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HandlerThread f2619;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public File f2620;

    public C0704(C8162 c8162) {
        String str = C19349.f62523;
        this.f2614 = false;
        this.f2610 = c8162;
        this.f2611 = new C1450();
        this.f2617 = new C1450();
        this.f2612 = this.f2611;
        this.f2616 = this.f2617;
        this.f2618 = new char[c8162.m22076()];
        HandlerThread handlerThread = new HandlerThread("OpenSDK.Client.File.Tracer", 10);
        this.f2619 = handlerThread;
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f2613 = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3024() {
        Handler handler = this.f2613;
        if (handler.hasMessages(1024)) {
            handler.removeMessages(1024);
        }
        handler.sendEmptyMessage(1024);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3023() {
        m3021();
        this.f2619.quit();
    }

    @Override // l.AbstractC18603
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo3025(int i, Thread thread, long j, String str, String str2, Throwable th) {
        String str3;
        m43229().getClass();
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
        C4794.m14774(sb, "][", str, "] ", str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        this.f2612.m5223(sb.toString());
        if (this.f2612.m5225() >= this.f2610.m22076()) {
            m3024();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024 && Thread.currentThread() == this.f2619 && !this.f2614) {
            this.f2614 = true;
            synchronized (this) {
                if (this.f2612 == this.f2611) {
                    this.f2612 = this.f2617;
                    this.f2616 = this.f2611;
                } else {
                    this.f2612 = this.f2611;
                    this.f2616 = this.f2617;
                }
            }
            try {
                try {
                    this.f2616.m5222(m3022(), this.f2618);
                } catch (IOException e) {
                    C21587.m49112("FileTracer", "flushBuffer exception", e);
                }
                this.f2616.m5224();
                this.f2614 = false;
            } catch (Throwable th) {
                this.f2616.m5224();
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m3021() {
        try {
            FileWriter fileWriter = this.f2615;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f2615.close();
            }
        } catch (IOException e) {
            C21587.m49112("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private FileWriter m3022() {
        String string;
        File file;
        File[] fileArrListFiles;
        this.f2610.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        String strM34865 = C14442.m34865("com.tencent.mobileqq_connectSdk.", new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime()), ".log");
        File fileM16578 = C5596.m16578();
        if (fileM16578 != null) {
            if (!fileM16578.exists()) {
                fileM16578.mkdirs();
            }
            string = fileM16578.toString();
        } else {
            string = null;
        }
        if (TextUtils.isEmpty(string) && string == null) {
            file = null;
        } else {
            try {
                File file2 = new File(string, C19349.f62524);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, strM34865);
            } catch (Exception e) {
                C21587.m49112("openSDK_LOG", "getWorkFile,get app specific file exception:", e);
                file = null;
            }
        }
        if (file != null && (!file.equals(this.f2620) || this.f2615 == null)) {
            this.f2620 = file;
            m3021();
            try {
                this.f2615 = new FileWriter(this.f2620, true);
            } catch (IOException unused) {
                this.f2615 = null;
                C21587.m49116("openSDK_LOG", "-->obtainFileWriter() app specific file permission denied");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory() && (fileArrListFiles = parentFile.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3 != null) {
                        String name = file3.getName();
                        C21587.m49111("FileTracer", "name=" + name);
                        if (!TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log")) {
                            String name2 = file3.getName();
                            String strSubstring = name2.substring(32, 43);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - 259200000;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(jCurrentTimeMillis2);
                            if (new SimpleDateFormat("yy.MM.dd.HH").format(calendar2.getTime()).compareTo(strSubstring) > 0) {
                                C21587.m49111("FileTracer", "delete name=" + name2 + ", success=" + file3.delete());
                            }
                        }
                    }
                }
            }
        }
        return this.f2615;
    }
}
