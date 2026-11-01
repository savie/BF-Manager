package l;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ܿ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9B5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17687 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41209(boolean z) {
        String string = C16737.f53615.getString("custom_su_command", null);
        if (string != null) {
            string = string.trim();
        }
        if (string != null && string.length() > 0) {
            if (string.equals("magisk su")) {
                try {
                    String strM41208 = m41208("magisk su -h");
                    StringBuilder sb = new StringBuilder(string);
                    if (z && strM41208.contains("--interactive")) {
                        sb.append(" --interactive");
                    }
                    if (strM41208.contains("--target")) {
                        sb.append(" --target 1");
                        return sb.toString();
                    }
                    if (strM41208.contains("--mount-master")) {
                        sb.append(" --mount-master");
                        return sb.toString();
                    }
                } catch (Throwable unused) {
                }
            } else if (string.contains("-")) {
                return string;
            }
        }
        if (string == null || string.isEmpty()) {
            string = "su";
        }
        try {
            String strM41209 = m41208(string.concat(" -h"));
            StringBuilder sb2 = new StringBuilder(string);
            if (z && strM41209.contains("--interactive")) {
                sb2.append(" --interactive");
            }
            if (strM41209.contains("--target")) {
                sb2.append(" --target 1");
                return sb2.toString();
            }
            if (strM41209.contains("--mount-master")) {
                sb2.append(" --mount-master");
                return sb2.toString();
            }
            return string;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null && message.contains("Permission denied")) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41208(String str) throws InterruptedException, TimeoutException, IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        long jCurrentTimeMillis = System.currentTimeMillis() + 300;
        while (true) {
            try {
                processExec.exitValue();
                return new String(C19431.m44470(processExec.getInputStream(), 0)).trim();
            } catch (IllegalThreadStateException unused) {
                if (System.currentTimeMillis() > jCurrentTimeMillis) {
                    processExec.destroy();
                    throw new TimeoutException();
                }
                Thread.sleep(1L);
            }
        }
    }
}
