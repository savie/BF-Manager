package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4HZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1765 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5806(Context context) throws Throwable {
        C3176 c3176 = new C3176();
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
            C3176.m9592("Beginning load of %s...", "pl_droidsonroids_gif");
            InterfaceC14467 interfaceC14467 = c3176.f11936;
            HashSet hashSet = c3176.f11935;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                C3176.m9592("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                ((C4504) interfaceC14467).getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                C3176.m9592("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
                return;
            } catch (UnsatisfiedLinkError e) {
                C3176.m9592("Loading the library normally failed: %s", Log.getStackTraceString(e));
                C3176.m9592("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File fileM9593 = c3176.m9593(context);
                if (!fileM9593.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileM9594 = c3176.m9593(context);
                    C4504 c4504 = (C4504) interfaceC14467;
                    c4504.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C9528(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileM9594.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    c4504.getClass();
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        if (str != null && str.length() != 0) {
                            strArr = new String[]{Build.CPU_ABI, str};
                        } else {
                            strArr = new String[]{Build.CPU_ABI};
                        }
                    }
                    String[] strArr2 = strArr;
                    c4504.getClass();
                    c3176.f11934.m27455(context, strArr2, System.mapLibraryName("pl_droidsonroids_gif"), fileM9593, c3176);
                }
                String absolutePath = fileM9593.getAbsolutePath();
                ((C4504) interfaceC14467).getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                C3176.m9592("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
                return;
            }
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
