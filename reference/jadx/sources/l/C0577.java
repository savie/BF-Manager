package l;

import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes2.dex */
public final class C0577 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f2522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2523 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static File f2525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5204 f2524 = C22138.m49098(new C16101());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final LinkedBlockingQueue f2526 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2741(String str) {
        C13465.m32966(str, "content");
        m2747("mtio ".concat(str), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2743(ApplicationC0716 applicationC0716) {
        final File file = new File(applicationC0716.getFilesDir(), "log");
        if (file.mkdirs() || file.isDirectory()) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
            C4716.f16636.execute(new Runnable() { // from class: l.۟ᩳۨ
                @Override // java.lang.Runnable
                public final void run() {
                    Object objM43014;
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            C13465.m32962((Object) name);
                            if (C12529.m31139(name, ".log", false)) {
                                try {
                                    int length = name.length() - 4;
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    if (length < 0) {
                                        throw new IllegalArgumentException(C2271.m6966(length, "Requested character count ", " is less than zero.").toString());
                                    }
                                    int length2 = name.length();
                                    if (length > length2) {
                                        length = length2;
                                    }
                                    String strSubstring = name.substring(0, length);
                                    C13465.m32967(strSubstring, "substring(...)");
                                    objM43014 = Long.valueOf(Long.parseLong(strSubstring));
                                } catch (Throwable th) {
                                    objM43014 = C18610.m43014(th);
                                }
                                if (!(objM43014 instanceof C21432) && ((Number) objM43014).longValue() < jCurrentTimeMillis) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                }
            });
            f2522 = true;
            m2747("init: pid=" + Process.myPid(), null);
            f2525 = new File(file, System.currentTimeMillis() + ".log");
            C20415 c20415 = new C20415();
            c20415.setDaemon(true);
            c20415.setName("MLog");
            c20415.start();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m2740() {
        LinkedBlockingQueue linkedBlockingQueue = f2526;
        try {
            File file = f2525;
            if (file == null) {
                C13465.m32968("currentFile");
                throw null;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            while (true) {
                boolean z = false;
                while (true) {
                    String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
                    if (str != null) {
                        C13465.m32962(charsetDefaultCharset);
                        byte[] bytes = str.getBytes(charsetDefaultCharset);
                        C13465.m32967(bytes, "getBytes(...)");
                        bufferedOutputStream.write(bytes);
                        z = true;
                    } else if (z) {
                        break;
                    }
                }
                bufferedOutputStream.flush();
            }
        } catch (Throwable th) {
            if (C17904.m41594(C18610.m43014(th)) != null) {
                f2522 = false;
                linkedBlockingQueue.clear();
            }
            return C7321.f24318;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m2744(String str) {
        C13465.m32966(str, "content");
        m2747(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m2747(String str, Throwable th) {
        C13465.m32966(str, "content");
        CharSequence charSequenceSubSequence = "";
        String strM1693 = charSequenceSubSequence;
        if (th != null) {
            String strM41461 = C17874.m41461(th);
            C13465.m32967(strM41461, "getStackTraceString(...)");
            int length = strM41461.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (strM41461.charAt(length) != '\n') {
                        charSequenceSubSequence = strM41461.subSequence(0, length + 1);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        length = i;
                    }
                }
            }
            strM1693 = C0252.m1693("\n", charSequenceSubSequence.toString());
        }
        if (f2522) {
            f2526.offer(((C20334) f2524.getValue()).m45900(System.currentTimeMillis()) + " [" + Thread.currentThread().getName() + "] " + str + strM1693 + "\n");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m2746(String str) {
        C13465.m32966(str, "content");
        m2742(str, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m2742(String str, Throwable th) {
        C13465.m32966(str, "content");
        m2747("start-up ".concat(str), th);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m2745() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!f2526.isEmpty() && System.currentTimeMillis() - jCurrentTimeMillis < 1000) {
            Thread.sleep(100L);
        }
    }
}
