package l;

import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܶۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15826 implements InterfaceC17777 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f51470 = new byte[64];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f51471 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC11248(1));

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15826 f51472;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f51473;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f51474;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23286 f51475;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C16572 f51476;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f51477;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ScheduledExecutorService f51478;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f51479;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11351 m37764(String str) {
        String strEncodeToString;
        String str2;
        m37763(str);
        C16572 c16572 = this.f51476;
        if (c16572.f53645.size() >= 32) {
            throw new IllegalStateException("MCP credential limit reached");
        }
        do {
            byte[] bArr = new byte[12];
            this.f51477.nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } while (c16572.f53641.containsKey(strEncodeToString));
        byte[] bArr2 = new byte[32];
        this.f51477.nextBytes(bArr2);
        String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
        str2 = "mtmcp_" + strEncodeToString + "_" + strEncodeToString2;
        C24778 c24778 = new C24778(strEncodeToString, str, C15022.m36182(C15022.m36179().digest(Base64.decode(strEncodeToString2, 11))), str2, System.currentTimeMillis(), 0L, "");
        ArrayList arrayList = new ArrayList(c16572.f53645);
        arrayList.add(c24778);
        m37759(arrayList);
        return new C11351(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37767(String str, String str2) {
        m37763(str2);
        ArrayList arrayList = new ArrayList(this.f51476.f53645);
        C24778 c24778 = (C24778) this.f51476.f53641.get(str);
        if (c24778 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.set(arrayList.indexOf(c24778), new C24778(str, str2, c24778.f80219, c24778.f80215, c24778.f80218, c24778.f80216, c24778.f80217));
        m37759(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37768(boolean z) {
        C16572 c16572 = this.f51476;
        if (z && (!c16572.f53644 || c16572.f53645.isEmpty())) {
            throw new IllegalStateException("MCP authentication requires a credential");
        }
        this.f51479.edit().putBoolean("amae", z).apply();
        this.f51476 = new C16572(z, c16572.f53644, 1 + c16572.f53642, ((long) (z == c16572.f53643 ? 0 : 1)) + c16572.f53640, c16572.f53645);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized String m37770(String str) {
        C24778 c24778;
        c24778 = (C24778) this.f51476.f53641.get(str);
        return (c24778 == null || c24778.f80215.isEmpty()) ? null : c24778.f80215;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C24778 m37772(String str) {
        C24778 c24778 = (C24778) this.f51476.f53641.get(str);
        if (c24778 == null) {
            return null;
        }
        C17318 c17318 = (C17318) this.f51474.get(str);
        if (c17318 != null) {
            c24778 = new C24778(str, c24778.f80213, c24778.f80219, c24778.f80215, c24778.f80218, c17318.f56406, c17318.f56407);
        }
        return c24778;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m37773(String str) {
        ArrayList arrayList = new ArrayList(this.f51476.f53645);
        C24778 c24778 = (C24778) this.f51476.f53641.get(str);
        if (c24778 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.remove(c24778);
        m37759(arrayList);
        this.f51474.remove(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized C15826 m37762() {
        if (f51472 == null) {
            f51472 = new C15826(C21576.f68931, new File(C21576.m49084().getNoBackupFilesDir(), "apk-mcp-credentials.json"));
        }
        return f51472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37766() {
        ScheduledExecutorService scheduledExecutorService;
        RunnableC1657 runnableC1657;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C24778 c24778 : this.f51476.f53645) {
                C17318 c17318 = (C17318) this.f51474.remove(c24778.f80214);
                if (c17318 != null) {
                    c24778 = new C24778(c24778.f80214, c24778.f80213, c24778.f80219, c24778.f80215, c24778.f80218, c17318.f56406, c17318.f56407);
                }
                arrayList.add(c24778);
                z |= c17318 != null;
            }
            this.f51474.keySet().retainAll(this.f51476.f53641.keySet());
            if (z && this.f51476.f53644) {
                m37759(arrayList);
            }
            this.f51473.set(false);
            if (!this.f51474.isEmpty() && this.f51473.compareAndSet(false, true)) {
                scheduledExecutorService = this.f51478;
                runnableC1657 = new RunnableC1657(this);
                scheduledExecutorService.schedule(runnableC1657, 30L, TimeUnit.SECONDS);
            }
        } catch (IOException unused) {
            this.f51473.set(false);
            if (!this.f51474.isEmpty() && this.f51473.compareAndSet(false, true)) {
                scheduledExecutorService = this.f51478;
                runnableC1657 = new RunnableC1657(this);
            }
        } catch (Throwable th) {
            this.f51473.set(false);
            if (!this.f51474.isEmpty() && this.f51473.compareAndSet(false, true)) {
                this.f51478.schedule(new RunnableC1657(this), 30L, TimeUnit.SECONDS);
            }
            throw th;
        }
    }

    public C15826(InterfaceC9801 interfaceC9801, File file) {
        List listM52403;
        boolean z;
        ScheduledExecutorService scheduledExecutorService = f51471;
        this.f51477 = new SecureRandom();
        this.f51474 = new ConcurrentMapC17249();
        this.f51473 = new AtomicBoolean();
        this.f51479 = interfaceC9801;
        this.f51478 = scheduledExecutorService;
        C23286 c23286 = new C23286(file);
        this.f51475 = c23286;
        boolean z2 = interfaceC9801.getBoolean("amae", false);
        try {
            listM52403 = c23286.m52403();
            z = true;
        } catch (IOException unused) {
            listM52403 = Collections.EMPTY_LIST;
            z = false;
        }
        this.f51476 = new C16572(z2, z, 0L, 0L, listM52403);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16572 m37771() {
        return this.f51476;
    }

    @Override // l.InterfaceC17777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25237 mo37765(C3767 c3767) {
        String str;
        C16572 c16572 = this.f51476;
        String str2 = "";
        if (!c16572.f53643) {
            return C25237.m56360(c16572.f53640, "");
        }
        List listM12224 = c3767.m12224();
        C24778 c24778 = null;
        if (listM12224.size() == 1 && c16572.f53644 && (str = (String) listM12224.get(0)) != null && str.length() <= 512) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt < ' ' || cCharAt > '~') {
                        break;
                    }
                    i++;
                } else {
                    String strTrim = str.trim();
                    int iIndexOf = strTrim.indexOf(32);
                    if (iIndexOf != 6 || !strTrim.regionMatches(true, 0, "Bearer", 0, 6)) {
                        break;
                        break;
                    }
                    String strTrim2 = strTrim.substring(iIndexOf + 1).trim();
                    if (strTrim2.length() != 66 || !strTrim2.startsWith("mtmcp_") || strTrim2.charAt(22) != '_') {
                        break;
                        break;
                        break;
                    }
                    String strSubstring = strTrim2.substring(6, 22);
                    String strSubstring2 = strTrim2.substring(23);
                    if (!m37760(16, strSubstring) || !m37760(43, strSubstring2)) {
                        break;
                        break;
                    }
                    byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                    if (bArrDecode.length != 32 || !Base64.encodeToString(bArrDecode, 11).equals(strSubstring2)) {
                        break;
                        break;
                    }
                    C24778 c24779 = (C24778) c16572.f53641.get(strSubstring);
                    if (!MessageDigest.isEqual(c24779 == null ? f51470 : c24779.f80219.getBytes(StandardCharsets.US_ASCII), C15022.m36182(C15022.m36179().digest(bArrDecode)).getBytes(StandardCharsets.US_ASCII))) {
                        break;
                    }
                    c24778 = c24779;
                    break;
                }
            }
        }
        if (c24778 == null) {
            C18683 c18683M5422 = AbstractC1530.m5422(EnumC21667.UNAUTHORIZED, "text/plain", "Unauthorized");
            c18683M5422.m43440("WWW-Authenticate", "Bearer realm=\"MT MCP\"");
            return C25237.m56361(c18683M5422);
        }
        String strM12233 = c3767.m12233();
        ConcurrentMapC17249 concurrentMapC17249 = this.f51474;
        String str3 = c24778.f80214;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM12233 != null && strM12233.length() <= 128) {
            str2 = strM12233;
        }
        concurrentMapC17249.put(str3, new C17318(jCurrentTimeMillis, str2));
        if (this.f51473.compareAndSet(false, true)) {
            this.f51478.schedule(new RunnableC1657(this), 30L, TimeUnit.SECONDS);
        }
        return C25237.m56360(c16572.f53640, c24778.f80214);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37769(long j, String str) {
        C16572 c16572 = this.f51476;
        if (c16572.f53640 != j) {
            return false;
        }
        if (c16572.f53643) {
            return c16572.f53644 && !str.isEmpty() && c16572.f53641.containsKey(str);
        }
        return str.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37759(ArrayList arrayList) throws IOException {
        C16572 c16572 = this.f51476;
        try {
            this.f51475.m52404(arrayList);
            this.f51476 = new C16572(c16572.f53643, true, c16572.f53642 + 1, c16572.f53640, arrayList);
        } catch (IOException unused) {
            this.f51476 = new C16572(c16572.f53643, false, c16572.f53642 + 1, c16572.f53640, Collections.EMPTY_LIST);
            throw new IOException("Cannot save MCP credentials");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m37763(String str) {
        if (str != null && !str.trim().isEmpty()) {
            int i = 0;
            if (str.codePointCount(0, str.length()) <= 64) {
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (Character.isHighSurrogate(cCharAt)) {
                        i++;
                        if (i >= str.length() || !Character.isLowSurrogate(str.charAt(i))) {
                            throw new IllegalArgumentException("Invalid MCP client name");
                        }
                    } else if (Character.isLowSurrogate(cCharAt) || Character.isISOControl(cCharAt)) {
                        throw new IllegalArgumentException("Invalid MCP client name");
                    }
                    i++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid MCP client name");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37761(String str, String str2, String str3) {
        if (str.length() != 66) {
            return false;
        }
        if (!str.startsWith("mtmcp_" + str2 + "_")) {
            return false;
        }
        String strSubstring = str.substring(23);
        if (!m37760(43, strSubstring)) {
            return false;
        }
        byte[] bArrDecode = Base64.decode(strSubstring, 11);
        return bArrDecode.length == 32 && Base64.encodeToString(bArrDecode, 11).equals(strSubstring) && C15022.m36182(C15022.m36179().digest(bArrDecode)).equals(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37760(int i, String str) {
        if (str.length() == i) {
            for (int i2 = 0; i2 < i; i2++) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }
}
