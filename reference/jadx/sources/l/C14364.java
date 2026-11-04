package l;

import android.content.pm.PackageInfo;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14364 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f45290;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f45291;

    static {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("osmd");
        f45290 = abstractC22044M49876;
        f45291 = new ConcurrentMapC17249();
        try {
            C20348 c20348M49835 = abstractC22044M49876.m49835();
            byte[] bArr = c20348M49835.f65270;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ (i * i));
            }
            while (c20348M49835.available() > 0) {
                C17364.m40796(c20348M49835, 41397);
                String strM46743 = c20348M49835.m46743();
                C3924 c3924 = new C3924(0);
                c3924.f13388 = c20348M49835.m46743();
                c3924.f13389 = c20348M49835.m46743();
                f45291.put(strM46743, c3924);
            }
        } catch (Exception unused) {
            f45291.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34797() {
        synchronized (C14364.class) {
            C6178 c6178 = new C6178();
            for (Map.Entry entry : f45291.entrySet()) {
                String str = (String) entry.getKey();
                C3924 c3924 = (C3924) entry.getValue();
                if (c3924.f13388 != null && str.length() + c3924.f13388.length() + c3924.f13389.length() < 1000) {
                    c6178.mo17812(41397);
                    c6178.m17810(str);
                    c6178.m17810(c3924.f13388);
                    c6178.m17810(c3924.f13389);
                }
            }
            byte[] bArrM17808 = c6178.m17808();
            int size = c6178.size();
            for (int i = 0; i < size; i++) {
                bArrM17808[i] = (byte) (bArrM17808[i] ^ (i * i));
            }
            try {
                f45290.m49850(bArrM17808, 0, size);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34796(PackageInfo packageInfo) {
        C3924 c3924 = (C3924) C23217.computeIfAbsent(f45291, packageInfo.packageName, new C6162());
        String str = Long.toHexString(packageInfo.lastUpdateTime) + ":" + Locale.getDefault().hashCode();
        if (str.equals(c3924.f13388)) {
            String str2 = c3924.f13389;
            C17359.requireNonNull(str2);
            return str2;
        }
        synchronized (c3924) {
            if (!str.equals(c3924.f13388)) {
                c3924.f13389 = String.valueOf(packageInfo.applicationInfo.loadLabel(C21576.m49081()));
                c3924.f13388 = str;
            }
        }
        C5261.m15836(new RunnableC24062(), C14364.class, 1000L);
        return c3924.f13389;
    }
}
