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

/* JADX INFO: renamed from: l.᩵ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1SD */
/* JADX INFO: loaded from: classes4.dex */
public final class C19562 {
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x017d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4995 m44662(String str, boolean z, boolean z2) {
        String[] strArrSplit;
        String str2;
        boolean z3;
        File file;
        String name;
        String[] strArr;
        C8273 c8273;
        ArrayList arrayList;
        String str3;
        int i;
        File file2;
        if (str == null) {
            str = "";
        }
        String str4 = str;
        File file3 = new File(C16737.m39285(), "term/home");
        if (file3.isFile()) {
            file3.delete();
        }
        file3.mkdirs();
        File file4 = new File(C16737.m39285(), "term/tmp");
        if (file4.isFile()) {
            file4.delete();
        }
        file4.mkdirs();
        HashMap map = new HashMap(System.getenv());
        map.put("HOME", file3.getAbsolutePath());
        map.put("TMPDIR", file4.getAbsolutePath());
        C3478 c3478M13121 = z2 ? null : C4744.m13121();
        int i2 = 0;
        if (c3478M13121 == null || !c3478M13121.m10207()) {
            String strM41209 = z ? C17687.m41209(false) : "/system/bin/sh";
            strArrSplit = ((z && strM41209 == null) ? "/system/bin/sh" : strM41209).split("\\s+");
            str2 = strArrSplit[0];
            z3 = true;
        } else {
            if (c3478M13121.f12767 != null) {
                try {
                    C18150.m42277(c3478M13121);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(C16737.m39277().getDataDir(), "home");
            } else {
                file = new File(C16737.m39285().getParentFile(), "home");
            }
            try {
                if (file.exists()) {
                    if (!C5212.isSymbolicLink(C7412.toPath(file))) {
                        if (file.isDirectory()) {
                            file.renameTo(new File(file.getPath() + "_old"));
                        } else {
                            file.delete();
                        }
                        Os.symlink(new File(C16737.m39285(), "term/home").getPath(), file.getPath());
                    }
                    File fileM10208 = c3478M13121.m10208();
                    File file5 = new File(C16737.m39285(), "term/lib");
                    File file6 = new File(fileM10208, "bash");
                    name = file6.getName();
                    if (z) {
                        strArr = new String[]{name, "-c", "su"};
                    } else {
                        strArr = new String[]{name};
                    }
                    map.put("LANG", "en_US.UTF-8");
                    map.put("TERM", "xterm-256color");
                    map.put("SHELL", file6.getAbsolutePath());
                    map.put("PREFIX", new File(C16737.m39285(), "term").getAbsolutePath());
                    map.put("PROMPT_COMMAND", "history -a");
                    map.put("PWD", str4);
                    C21929.m48751("PATH", fileM10208.getAbsolutePath(), map);
                    C21929.m48751("LD_LIBRARY_PATH", file5.getAbsolutePath(), map);
                    c8273 = new C8273();
                    c8273.f28760 = "su";
                    arrayList = new ArrayList();
                    c8273.f28759 = arrayList;
                    String strM412010 = C17687.m41209(true);
                    str3 = strM412010 != null ? strM412010 : "su";
                    if (!str3.isEmpty()) {
                        String[] strArrSplit2 = str3.split("\\s+");
                        c8273.f28760 = strArrSplit2[0];
                        Collections.addAll(arrayList, strArrSplit2);
                        arrayList.remove(0);
                    }
                    for (String str5 : System.getenv("PATH").split(":")) {
                        file2 = new File(str5, c8273.f28760);
                        if (!file2.exists() && file2.canExecute()) {
                            c8273.f28760 = file2.getAbsolutePath();
                            break;
                        }
                    }
                    if ((!c8273.f28760.equals("magisk") || c8273.f28760.endsWith("/magisk")) && !c8273.f28759.isEmpty()) {
                        c8273.f28760 += " " + ((String) c8273.f28759.get(0));
                        c8273.f28759.remove(0);
                    }
                    System.out.println(c8273);
                    map.put("SU_COMMAND", c8273.f28760);
                    map.put("SU_ARGUMENTS", C6851.m18459((Collection) c8273.f28759, ' '));
                    strArrSplit = strArr;
                    str2 = name;
                    z3 = false;
                } else {
                    Os.symlink(new File(C16737.m39285(), "term/home").getPath(), file.getPath());
                }
            } catch (ErrnoException unused2) {
            }
            File fileM10209 = c3478M13121.m10208();
            File file7 = new File(C16737.m39285(), "term/lib");
            File file8 = new File(fileM10209, "bash");
            name = file8.getName();
            if (z) {
                strArr = new String[]{name, "-c", "su"};
            } else {
                strArr = new String[]{name};
            }
            map.put("LANG", "en_US.UTF-8");
            map.put("TERM", "xterm-256color");
            map.put("SHELL", file8.getAbsolutePath());
            map.put("PREFIX", new File(C16737.m39285(), "term").getAbsolutePath());
            map.put("PROMPT_COMMAND", "history -a");
            map.put("PWD", str4);
            C21929.m48751("PATH", fileM10209.getAbsolutePath(), map);
            C21929.m48751("LD_LIBRARY_PATH", file7.getAbsolutePath(), map);
            c8273 = new C8273();
            c8273.f28760 = "su";
            arrayList = new ArrayList();
            c8273.f28759 = arrayList;
            String strM412011 = C17687.m41209(true);
            if (strM412011 != null) {
            }
            if (!str3.isEmpty()) {
                String[] strArrSplit3 = str3.split("\\s+");
                c8273.f28760 = strArrSplit3[0];
                Collections.addAll(arrayList, strArrSplit3);
                arrayList.remove(0);
            }
            while (i < r0) {
                file2 = new File(str5, c8273.f28760);
                if (!file2.exists()) {
                }
            }
            if (!c8273.f28760.equals("magisk")) {
                c8273.f28760 += " " + ((String) c8273.f28759.get(0));
                c8273.f28759.remove(0);
            } else {
                c8273.f28760 += " " + ((String) c8273.f28759.get(0));
                c8273.f28759.remove(0);
            }
            System.out.println(c8273);
            map.put("SU_COMMAND", c8273.f28760);
            map.put("SU_ARGUMENTS", C6851.m18459((Collection) c8273.f28759, ' '));
            strArrSplit = strArr;
            str2 = name;
            z3 = false;
        }
        String[] strArr2 = new String[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            strArr2[i2] = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            i2++;
        }
        return new C4995(str2, str4, strArrSplit, strArr2, z3, new C18401());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44663(final C4995 c4995) {
        if (c4995 == null || !c4995.m13847()) {
            return;
        }
        if (c4995.m13843().endsWith("/bash")) {
            c4995.m48569("history -d -1 && history -w; exit\r");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            new Thread(new Runnable() { // from class: l.ᩴܺۜ
                @Override // java.lang.Runnable
                public final void run() {
                    while (true) {
                        C4995 c4996 = c4995;
                        if (!c4996.m13847()) {
                            return;
                        }
                        if (System.currentTimeMillis() - jCurrentTimeMillis > 500) {
                            c4996.m13849();
                            return;
                        }
                        SystemClock.sleep(5L);
                    }
                }
            }).start();
            return;
        }
        c4995.m13849();
    }
}
