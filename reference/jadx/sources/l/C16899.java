package l;

import android.content.pm.PackageInfo;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16899 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f54044;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f54045;

    static {
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("osmd");
        f54044 = abstractC20745M46690;
        f54045 = new ConcurrentMapC13783();
        try {
            C17367 c17367M46713 = abstractC20745M46690.m46713();
            byte[] bArr = c17367M46713.f55260;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ (i * i));
            }
            while (c17367M46713.available() > 0) {
                C20190.m45650(c17367M46713, 41397);
                String strM40459 = c17367M46713.m40459();
                C0670 c0670 = new C0670(0);
                c0670.f2814 = c17367M46713.m40459();
                c0670.f2815 = c17367M46713.m40459();
                f54045.put(strM40459, c0670);
            }
        } catch (Exception unused) {
            f54045.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39577() {
        synchronized (C16899.class) {
            C11018 c11018 = new C11018();
            for (Map.Entry entry : f54045.entrySet()) {
                String str = (String) entry.getKey();
                C0670 c0670 = (C0670) entry.getValue();
                if (c0670.f2814 != null && str.length() + c0670.f2814.length() + c0670.f2815.length() < 1000) {
                    c11018.mo24508(41397);
                    c11018.m27776(str);
                    c11018.m27776(c0670.f2814);
                    c11018.m27776(c0670.f2815);
                }
            }
            byte[] bArrM27788 = c11018.m27788();
            int size = c11018.size();
            for (int i = 0; i < size; i++) {
                bArrM27788[i] = (byte) (bArrM27788[i] ^ (i * i));
            }
            try {
                f54044.m46704(bArrM27788, 0, size);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39576(PackageInfo packageInfo) {
        C0670 c0670 = (C0670) C2492.computeIfAbsent(f54045, packageInfo.packageName, new C16194());
        String str = Long.toHexString(packageInfo.lastUpdateTime) + ":" + Locale.getDefault().hashCode();
        if (str.equals(c0670.f2814)) {
            String str2 = c0670.f2815;
            C13638.requireNonNull(str2);
            return str2;
        }
        synchronized (c0670) {
            if (!str.equals(c0670.f2814)) {
                c0670.f2815 = String.valueOf(packageInfo.applicationInfo.loadLabel(C16737.m39292()));
                c0670.f2814 = str;
            }
        }
        C4716.m13051(new RunnableC20427(0), C16899.class, 1000L);
        return c0670.f2815;
    }
}
