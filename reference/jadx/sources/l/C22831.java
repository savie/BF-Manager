package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4HZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22831 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51495(Context context) throws Throwable {
        C15371 c15371 = new C15371();
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
            C15371.m36802("Beginning load of %s...", "pl_droidsonroids_gif");
            InterfaceC10896 interfaceC10896 = c15371.f50135;
            HashSet hashSet = c15371.f50134;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                C15371.m36802("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                ((C13134) interfaceC10896).getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                C15371.m36802("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
                return;
            } catch (UnsatisfiedLinkError e) {
                C15371.m36802("Loading the library normally failed: %s", Log.getStackTraceString(e));
                C15371.m36802("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File fileM36803 = c15371.m36803(context);
                if (!fileM36803.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileM36804 = c15371.m36803(context);
                    C13134 c13134 = (C13134) interfaceC10896;
                    c13134.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C19847(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileM36804.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    c13134.getClass();
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
                    c13134.getClass();
                    c15371.f50133.m15117(context, strArr2, System.mapLibraryName("pl_droidsonroids_gif"), fileM36803, c15371);
                }
                String absolutePath = fileM36803.getAbsolutePath();
                ((C13134) interfaceC10896).getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                C15371.m36802("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
                return;
            }
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
