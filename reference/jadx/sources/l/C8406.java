package l;

import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W1SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8406 {
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24244 m22582(String str, boolean z, boolean z2) {
        String[] strArrSplit;
        String str2;
        boolean z3;
        File file;
        String name;
        String[] strArr;
        C2440 c2440;
        ArrayList arrayList;
        String str3;
        int i;
        File file2;
        if (str == null) {
            str = "";
        }
        String str4 = str;
        File file3 = new File(C21576.m49072(), "term/home");
        if (file3.isFile()) {
            file3.delete();
        }
        file3.mkdirs();
        File file4 = new File(C21576.m49072(), "term/tmp");
        if (file4.isFile()) {
            file4.delete();
        }
        file4.mkdirs();
        HashMap map = new HashMap(System.getenv());
        map.put("HOME", file3.getAbsolutePath());
        map.put("TMPDIR", file4.getAbsolutePath());
        C3186 c3186M46731 = z2 ? null : C20340.m46731();
        int i2 = 0;
        if (c3186M46731 == null || !c3186M46731.m10402()) {
            String strM44123 = z ? C19036.m44123(false) : "/system/bin/sh";
            strArrSplit = ((z && strM44123 == null) ? "/system/bin/sh" : strM44123).split("\\s+");
            str2 = strArrSplit[0];
            z3 = true;
        } else {
            if (c3186M46731.f10377 != null) {
                try {
                    C0949.m3770(c3186M46731);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(C21576.m49084().getDataDir(), "home");
            } else {
                file = new File(C21576.m49072().getParentFile(), "home");
            }
            try {
                if (file.exists()) {
                    if (!C3445.isSymbolicLink(C2503.toPath(file))) {
                        if (file.isDirectory()) {
                            file.renameTo(new File(file.getPath() + "_old"));
                        } else {
                            file.delete();
                        }
                        Os.symlink(new File(C21576.m49072(), "term/home").getPath(), file.getPath());
                    }
                    File fileM10403 = c3186M46731.m10403();
                    File file5 = new File(C21576.m49072(), "term/lib");
                    File file6 = new File(fileM10403, "bash");
                    name = file6.getName();
                    if (z) {
                        strArr = new String[]{name, "-c", "su"};
                    } else {
                        strArr = new String[]{name};
                    }
                    map.put("LANG", "en_US.UTF-8");
                    map.put("TERM", "xterm-256color");
                    map.put("SHELL", file6.getAbsolutePath());
                    map.put("PREFIX", new File(C21576.m49072(), "term").getAbsolutePath());
                    map.put("PROMPT_COMMAND", "history -a");
                    map.put("PWD", str4);
                    C4106.m13204("PATH", fileM10403.getAbsolutePath(), map);
                    C4106.m13204("LD_LIBRARY_PATH", file5.getAbsolutePath(), map);
                    c2440 = new C2440();
                    c2440.f7821 = "su";
                    arrayList = new ArrayList();
                    c2440.f7820 = arrayList;
                    String strM44124 = C19036.m44123(true);
                    str3 = strM44124 != null ? strM44124 : "su";
                    if (!str3.isEmpty()) {
                        String[] strArrSplit2 = str3.split("\\s+");
                        c2440.f7821 = strArrSplit2[0];
                        Collections.addAll(arrayList, strArrSplit2);
                        arrayList.remove(0);
                    }
                    for (String str5 : System.getenv("PATH").split(":")) {
                        file2 = new File(str5, c2440.f7821);
                        if (!file2.exists() && file2.canExecute()) {
                            c2440.f7821 = file2.getAbsolutePath();
                            break;
                        }
                    }
                    if ((!c2440.f7821.equals("magisk") || c2440.f7821.endsWith("/magisk")) && !c2440.f7820.isEmpty()) {
                        c2440.f7821 += " " + ((String) c2440.f7820.get(0));
                        c2440.f7820.remove(0);
                    }
                    System.out.println(c2440);
                    map.put("SU_COMMAND", c2440.f7821);
                    map.put("SU_ARGUMENTS", C24276.m54285((Collection) c2440.f7820, ' '));
                    strArrSplit = strArr;
                    str2 = name;
                    z3 = false;
                } else {
                    Os.symlink(new File(C21576.m49072(), "term/home").getPath(), file.getPath());
                }
            } catch (ErrnoException unused2) {
            }
            File fileM10404 = c3186M46731.m10403();
            File file7 = new File(C21576.m49072(), "term/lib");
            File file8 = new File(fileM10404, "bash");
            name = file8.getName();
            if (z) {
                strArr = new String[]{name, "-c", "su"};
            } else {
                strArr = new String[]{name};
            }
            map.put("LANG", "en_US.UTF-8");
            map.put("TERM", "xterm-256color");
            map.put("SHELL", file8.getAbsolutePath());
            map.put("PREFIX", new File(C21576.m49072(), "term").getAbsolutePath());
            map.put("PROMPT_COMMAND", "history -a");
            map.put("PWD", str4);
            C4106.m13204("PATH", fileM10404.getAbsolutePath(), map);
            C4106.m13204("LD_LIBRARY_PATH", file7.getAbsolutePath(), map);
            c2440 = new C2440();
            c2440.f7821 = "su";
            arrayList = new ArrayList();
            c2440.f7820 = arrayList;
            String strM44125 = C19036.m44123(true);
            if (strM44125 != null) {
            }
            if (!str3.isEmpty()) {
                String[] strArrSplit3 = str3.split("\\s+");
                c2440.f7821 = strArrSplit3[0];
                Collections.addAll(arrayList, strArrSplit3);
                arrayList.remove(0);
            }
            while (i < r0) {
                file2 = new File(str5, c2440.f7821);
                if (!file2.exists()) {
                }
            }
            if (!c2440.f7821.equals("magisk")) {
                c2440.f7821 += " " + ((String) c2440.f7820.get(0));
                c2440.f7820.remove(0);
            } else {
                c2440.f7821 += " " + ((String) c2440.f7820.get(0));
                c2440.f7820.remove(0);
            }
            System.out.println(c2440);
            map.put("SU_COMMAND", c2440.f7821);
            map.put("SU_ARGUMENTS", C24276.m54285((Collection) c2440.f7820, ' '));
            strArrSplit = strArr;
            str2 = name;
            z3 = false;
        }
        String[] strArr2 = new String[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            strArr2[i2] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            i2++;
        }
        return new C24244(str2, str4, strArrSplit, strArr2, z3, new C9325());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22583(final C24244 c24244) {
        if (c24244 == null || !c24244.m54260()) {
            return;
        }
        if (c24244.m54257().endsWith("/bash")) {
            c24244.m23822("history -d -1 && history -w; exit\r");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            new Thread(new Runnable() { // from class: l.ۡۙ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    while (true) {
                        C24244 c24245 = c24244;
                        if (!c24245.m54260()) {
                            return;
                        }
                        if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                            c24245.m54259();
                            return;
                        }
                        SystemClock.sleep(5L);
                    }
                }
            }).start();
            return;
        }
        c24244.m54259();
    }
}
