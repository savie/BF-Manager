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

/* JADX INFO: renamed from: l.ۡۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8716 implements InterfaceC23647 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C8716 f29960;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10127 f29962;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f29963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f29964;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f29965;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f29966;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ScheduledExecutorService f29967;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C8010 f29968;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29959 = new byte[64];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f29961 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15066());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22552(String str) {
        ArrayList arrayList = new ArrayList(this.f29968.f26263);
        C18593 c18593 = (C18593) this.f29968.f26264.get(str);
        if (c18593 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.remove(c18593);
        m22547(arrayList);
        this.f29966.remove(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C17887 m22554(String str) {
        String strEncodeToString;
        String str2;
        m22550(str);
        C8010 c8010 = this.f29968;
        if (c8010.f26263.size() >= 32) {
            throw new IllegalStateException("MCP credential limit reached");
        }
        do {
            byte[] bArr = new byte[12];
            this.f29965.nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } while (c8010.f26264.containsKey(strEncodeToString));
        byte[] bArr2 = new byte[32];
        this.f29965.nextBytes(bArr2);
        String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
        str2 = "mtmcp_" + strEncodeToString + "_" + strEncodeToString2;
        C18593 c18593 = new C18593(strEncodeToString, str, C22253.m49424(C22253.m49421().digest(Base64.decode(strEncodeToString2, 11))), str2, System.currentTimeMillis(), 0L, "");
        ArrayList arrayList = new ArrayList(c8010.f26263);
        arrayList.add(c18593);
        m22547(arrayList);
        return new C17887(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22556(String str, String str2) {
        m22550(str2);
        ArrayList arrayList = new ArrayList(this.f29968.f26263);
        C18593 c18593 = (C18593) this.f29968.f26264.get(str);
        if (c18593 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.set(arrayList.indexOf(c18593), new C18593(str, str2, c18593.f59150, c18593.f59149, c18593.f59154, c18593.f59155, c18593.f59152));
        m22547(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22557(boolean z) {
        C8010 c8010 = this.f29968;
        if (z && (!c8010.f26261 || c8010.f26263.isEmpty())) {
            throw new IllegalStateException("MCP authentication requires a credential");
        }
        this.f29963.edit().putBoolean("amae", z).apply();
        this.f29968 = new C8010(z, c8010.f26261, 1 + c8010.f26262, c8010.f26263);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized String m22558(String str) {
        C18593 c18593;
        c18593 = (C18593) this.f29968.f26264.get(str);
        return (c18593 == null || c18593.f59149.isEmpty()) ? null : c18593.f59149;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C18593 m22560(String str) {
        C18593 c18593 = (C18593) this.f29968.f26264.get(str);
        if (c18593 == null) {
            return null;
        }
        C19299 c19299 = (C19299) this.f29966.get(str);
        if (c19299 != null) {
            c18593 = new C18593(str, c18593.f59151, c18593.f59150, c18593.f59149, c18593.f59154, c19299.f62272, c19299.f62273);
        }
        return c18593;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized C8716 m22551() {
        if (f29960 == null) {
            f29960 = new C8716(C16737.f53607, new File(C16737.m39277().getNoBackupFilesDir(), "apk-mcp-credentials.json"));
        }
        return f29960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22555() {
        ScheduledExecutorService scheduledExecutorService;
        RunnableC21415 runnableC21415;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C18593 c18593 : this.f29968.f26263) {
                C19299 c19299 = (C19299) this.f29966.remove(c18593.f59153);
                if (c19299 != null) {
                    c18593 = new C18593(c18593.f59153, c18593.f59151, c18593.f59150, c18593.f59149, c18593.f59154, c19299.f62272, c19299.f62273);
                }
                arrayList.add(c18593);
                z |= c19299 != null;
            }
            this.f29966.keySet().retainAll(this.f29968.f26264.keySet());
            if (z && this.f29968.f26261) {
                m22547(arrayList);
            }
            this.f29964.set(false);
            if (!this.f29966.isEmpty() && this.f29964.compareAndSet(false, true)) {
                scheduledExecutorService = this.f29967;
                runnableC21415 = new RunnableC21415(this);
                scheduledExecutorService.schedule(runnableC21415, 30L, TimeUnit.SECONDS);
            }
        } catch (IOException unused) {
            this.f29964.set(false);
            if (!this.f29966.isEmpty() && this.f29964.compareAndSet(false, true)) {
                scheduledExecutorService = this.f29967;
                runnableC21415 = new RunnableC21415(this);
            }
        } catch (Throwable th) {
            this.f29964.set(false);
            if (!this.f29966.isEmpty() && this.f29964.compareAndSet(false, true)) {
                this.f29967.schedule(new RunnableC21415(this), 30L, TimeUnit.SECONDS);
            }
            throw th;
        }
    }

    public C8716(InterfaceC6025 interfaceC6025, File file) {
        List listM25752;
        boolean z;
        ScheduledExecutorService scheduledExecutorService = f29961;
        this.f29965 = new SecureRandom();
        this.f29966 = new ConcurrentMapC13783();
        this.f29964 = new AtomicBoolean();
        this.f29963 = interfaceC6025;
        this.f29967 = scheduledExecutorService;
        C10127 c10127 = new C10127(file);
        this.f29962 = c10127;
        boolean z2 = interfaceC6025.getBoolean("amae", false);
        try {
            listM25752 = c10127.m25752();
            z = true;
        } catch (IOException unused) {
            listM25752 = Collections.EMPTY_LIST;
            z = false;
        }
        this.f29968 = new C8010(z2, z, 0L, listM25752);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8010 m22559() {
        return this.f29968;
    }

    @Override // l.InterfaceC23647
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6007 mo22553(C15530 c15530) {
        String str;
        C8010 c8010 = this.f29968;
        if (!c8010.f26260) {
            return C6007.m16307();
        }
        List listM37140 = c15530.m37140();
        C18593 c18593 = null;
        if (listM37140.size() == 1 && c8010.f26261 && (str = (String) listM37140.get(0)) != null && str.length() <= 512) {
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
                    if (!m22548(16, strSubstring) || !m22548(43, strSubstring2)) {
                        break;
                        break;
                    }
                    byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                    if (bArrDecode.length != 32 || !Base64.encodeToString(bArrDecode, 11).equals(strSubstring2)) {
                        break;
                        break;
                    }
                    C18593 c18594 = (C18593) c8010.f26264.get(strSubstring);
                    if (!MessageDigest.isEqual(c18594 == null ? f29959 : c18594.f59150.getBytes(StandardCharsets.US_ASCII), C22253.m49424(C22253.m49421().digest(bArrDecode)).getBytes(StandardCharsets.US_ASCII))) {
                        break;
                    }
                    c18593 = c18594;
                    break;
                }
            }
        }
        if (c18593 == null) {
            C7768 c7768M39639 = AbstractC16940.m39639(EnumC10591.UNAUTHORIZED, "text/plain", "Unauthorized");
            c7768M39639.m20448("WWW-Authenticate", "Bearer realm=\"MT MCP\"");
            return C6007.m16308(c7768M39639);
        }
        String strM37137 = c15530.m37137();
        ConcurrentMapC13783 concurrentMapC13783 = this.f29966;
        String str2 = c18593.f59153;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM37137 == null || strM37137.length() > 128) {
            strM37137 = "";
        }
        concurrentMapC13783.put(str2, new C19299(jCurrentTimeMillis, strM37137));
        if (this.f29964.compareAndSet(false, true)) {
            this.f29967.schedule(new RunnableC21415(this), 30L, TimeUnit.SECONDS);
        }
        return C6007.m16307();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22547(ArrayList arrayList) throws IOException {
        C8010 c8010 = this.f29968;
        try {
            this.f29962.m25753(arrayList);
            this.f29968 = new C8010(c8010.f26260, true, c8010.f26262 + 1, arrayList);
        } catch (IOException unused) {
            this.f29968 = new C8010(c8010.f26260, false, c8010.f26262 + 1, Collections.EMPTY_LIST);
            throw new IOException("Cannot save MCP credentials");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m22550(String str) {
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
    public static boolean m22549(String str, String str2, String str3) {
        if (str.length() != 66) {
            return false;
        }
        if (!str.startsWith("mtmcp_" + str2 + "_")) {
            return false;
        }
        String strSubstring = str.substring(23);
        if (!m22548(43, strSubstring)) {
            return false;
        }
        byte[] bArrDecode = Base64.decode(strSubstring, 11);
        return bArrDecode.length == 32 && Base64.encodeToString(bArrDecode, 11).equals(strSubstring) && C22253.m49424(C22253.m49421().digest(bArrDecode)).equals(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22548(int i, String str) {
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
