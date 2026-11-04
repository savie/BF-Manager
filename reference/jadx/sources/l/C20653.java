package l;

import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5ED */
/* JADX INFO: loaded from: classes5.dex */
public final class C20653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66233 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static File f66234;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0812 f66235 = C9015.m24070(new C23637());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final LinkedBlockingQueue f66236 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f66237;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m47266(String str) {
        C15243.m36590(str, "content");
        m47272("mtio ".concat(str), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m47268(ApplicationC17729 applicationC17729) {
        final File file = new File(applicationC17729.getFilesDir(), "log");
        if (file.mkdirs() || file.isDirectory()) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
            C5261.f18540.execute(new Runnable() { // from class: l.ܽܶۤ
                @Override // java.lang.Runnable
                public final void run() {
                    Object objM45347;
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            C15243.m36586((Object) name);
                            if (C0878.m3579(name, ".log", false)) {
                                try {
                                    objM45347 = Long.valueOf(Long.parseLong(C0878.m3572(4, name)));
                                } catch (Throwable th) {
                                    objM45347 = C19676.m45347(th);
                                }
                                if (!(objM45347 instanceof C10725) && ((Number) objM45347).longValue() < jCurrentTimeMillis) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                }
            });
            f66237 = true;
            m47272("init: pid=" + Process.myPid(), null);
            f66234 = new File(file, System.currentTimeMillis() + ".log");
            C19258 c19258 = new C19258();
            c19258.setDaemon(true);
            c19258.setName("MLog");
            c19258.start();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11471 m47265() {
        LinkedBlockingQueue linkedBlockingQueue = f66236;
        try {
            File file = f66234;
            if (file == null) {
                C15243.m36592("currentFile");
                throw null;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            while (true) {
                boolean z = false;
                while (true) {
                    String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
                    if (str != null) {
                        C15243.m36586(charsetDefaultCharset);
                        byte[] bytes = str.getBytes(charsetDefaultCharset);
                        C15243.m36591(bytes, "getBytes(...)");
                        bufferedOutputStream.write(bytes);
                        z = true;
                    } else if (z) {
                        break;
                    }
                }
                bufferedOutputStream.flush();
            }
        } catch (Throwable th) {
            if (C22660.m51055(C19676.m45347(th)) != null) {
                f66237 = false;
                linkedBlockingQueue.clear();
            }
            return C11471.f36082;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m47269(String str) {
        C15243.m36590(str, "content");
        m47272(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m47272(String str, Throwable th) {
        C15243.m36590(str, "content");
        CharSequence charSequenceSubSequence = "";
        String strM56409 = charSequenceSubSequence;
        if (th != null) {
            String strM40799 = C17370.m40799(th);
            C15243.m36591(strM40799, "getStackTraceString(...)");
            int length = strM40799.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (strM40799.charAt(length) != '\n') {
                        charSequenceSubSequence = strM40799.subSequence(0, length + 1);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        length = i;
                    }
                }
            }
            strM56409 = C25272.m56409("\n", charSequenceSubSequence.toString());
        }
        if (f66237) {
            f66236.offer(((C3499) f66235.getValue()).m11498(System.currentTimeMillis()) + " [" + Thread.currentThread().getName() + "] " + str + strM56409 + "\n");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m47271(String str) {
        C15243.m36590(str, "content");
        m47267(str, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m47267(String str, Throwable th) {
        C15243.m36590(str, "content");
        m47272("start-up ".concat(str), th);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m47270() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!f66236.isEmpty() && System.currentTimeMillis() - jCurrentTimeMillis < 1000) {
            Thread.sleep(100L);
        }
    }
}
