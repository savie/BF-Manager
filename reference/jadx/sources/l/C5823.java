package l;

import android.os.SystemClock;
import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5823 implements Closeable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0580 f20032;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f20033;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f20036;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22209 f20037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15826 f20038;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final SecureRandom f20031 = new SecureRandom();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f20034 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized C13280 m16995(String str) {
        C13280 c13280;
        m16994();
        if (this.f20036) {
            throw m16993("TRANSFER_STOPPED", "The transfer service has stopped.");
        }
        C22867 c22867M51585 = C22867.m51585();
        c13280 = (C13280) this.f20034.get(str);
        if (c13280 != null && c13280.f42430.equals(c22867M51585.f74324)) {
            long j = c13280.f42429;
            long j2 = c22867M51585.f74322;
            if (j == j2 && this.f20038.m37769(j2, c22867M51585.f74324)) {
            }
        }
        throw m16993("TRANSFER_NOT_FOUND", "No transfer ticket is available for this caller.");
        return c13280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized JSONObject m16999(C13280 c13280) {
        JSONObject jSONObjectAdd;
        JSONObject jSONObject;
        jSONObjectAdd = JSON.object().add("transferId", c13280.f42415).add("direction", c13280.f42428 ? "upload" : "download").add(MotionUtils.EASING_TYPE_PATH, c13280.f42432).add("state", c13280.f42431).add("bytesTransferred", c13280.f42419).add("size", c13280.f42424).add("sha256", c13280.f42426).add("expiresAt", c13280.f42418).add("warnings", new JSONArray(c13280.f42421));
        jSONObject = c13280.f42423;
        return jSONObjectAdd.add(d.O, jSONObject == null ? JSON.NULL : new JSONObject(jSONObject));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13280 m17000(C3767 c3767) {
        C13280 c13280;
        m16994();
        if (this.f20036) {
            throw m16993("TRANSFER_STOPPED", "The transfer service has stopped.");
        }
        c13280 = (C13280) this.f20034.get(c3767.m12228().substring(11));
        List listM12224 = c3767.m12224();
        boolean zIsEqual = false;
        String str = listM12224.size() == 1 ? (String) listM12224.get(0) : "";
        if (c13280 != null) {
            String str2 = c13280.f42425;
            if (str != null && str.length() <= 128) {
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        String strTrim = str.trim();
                        if (!strTrim.regionMatches(true, 0, "Bearer ", 0, 7)) {
                            break;
                        }
                        Charset charset = StandardCharsets.US_ASCII;
                        zIsEqual = MessageDigest.isEqual(str2.getBytes(charset), strTrim.substring(7).trim().getBytes(charset));
                        break;
                    }
                    char cCharAt = str.charAt(i);
                    if (cCharAt < ' ' || cCharAt > '~') {
                        break;
                        break;
                    }
                    i++;
                }
            }
            if (zIsEqual) {
                if (!this.f20038.m37769(c13280.f42429, c13280.f42430)) {
                    throw m16993("TRANSFER_REVOKED", "The creating credential is no longer valid.");
                }
                if ("expired".equals(c13280.f42431) || "cancelled".equals(c13280.f42431)) {
                    throw m16993("TRANSFER_GONE", "The transfer ticket is no longer usable.");
                }
                EnumC12716 enumC12716M12226 = c3767.m12226();
                if (!c13280.f42428) {
                    if (enumC12716M12226 != EnumC12716.GET) {
                        if (enumC12716M12226 == EnumC12716.HEAD) {
                        }
                        throw m16993("TRANSFER_METHOD", "The HTTP method does not match this transfer.");
                    }
                    if (((HashMap) c3767.m12230()).containsKey("content-encoding")) {
                    }
                    throw m16993("TRANSFER_ENCODING", "Encoded request bodies are not supported.");
                }
                if (enumC12716M12226 == EnumC12716.PUT) {
                    if (!((HashMap) c3767.m12230()).containsKey("content-encoding") || ((HashMap) c3767.m12230()).containsKey("transfer-encoding")) {
                        throw m16993("TRANSFER_ENCODING", "Encoded request bodies are not supported.");
                    }
                    if (c13280.f42428) {
                        String str3 = (String) ((HashMap) c3767.m12230()).get("content-length");
                        if (str3 == null) {
                            throw m16993("TRANSFER_LENGTH_REQUIRED", "Content-Length is required.");
                        }
                        try {
                            if (Long.parseLong(str3) != c13280.f42424) {
                                throw new NumberFormatException();
                            }
                            if (k.j.equals(c13280.f42431)) {
                                throw m16993("TRANSFER_GONE", "This upload failed; query its result before creating a new ticket.");
                            }
                        } catch (NumberFormatException unused) {
                            throw m16993("TRANSFER_LENGTH_MISMATCH", "Content-Length does not match the upload ticket.");
                        }
                    } else if (!"0".equals(C11392.getOrDefault((HashMap) c3767.m12230(), "content-length", "0"))) {
                        throw m16993("TRANSFER_LENGTH_MISMATCH", "Download requests must not contain a body.");
                    }
                    if (c13280.f42417 != null) {
                        throw m16993("TRANSFER_BUSY", "This transfer is already active.");
                    }
                    if (this.f20035 >= 4 && (!c13280.f42428 || !"completed".equals(c13280.f42431))) {
                        throw m16993("TRANSFER_LIMIT", "Too many active file transfers.");
                    }
                }
                throw m16993("TRANSFER_METHOD", "The HTTP method does not match this transfer.");
                throw th;
            }
        }
        throw m16993("TRANSFER_UNAUTHORIZED", "Invalid transfer credential.");
        return c13280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m17002(C15517 c15517) {
        if (c15517.f50498 != null || Thread.currentThread().isInterrupted()) {
            throw new IOException("File transfer interrupted");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m17003(C15517 c15517, int i) {
        m17002(c15517);
        c15517.f50500.f42419 += (long) i;
        c15517.f50501 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m17004(C15517 c15517, String str, JSONArray jSONArray) {
        C13280 c13280 = c15517.f50500;
        String str2 = c15517.f50498;
        if (str2 != null) {
            m17005(c15517, m16993(str2, "File transfer was interrupted."));
            return;
        }
        c13280.f42426 = str;
        c13280.f42421 = new JSONArray(jSONArray);
        c13280.f42431 = "completed";
        c13280.f42416 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m17005(C15517 c15517, C10186 c10186) {
        C13280 c13280 = c15517.f50500;
        String str = c15517.f50498;
        if (str != null) {
            c10186 = C10186.m26302(str, "TRANSFER_STALLED".equals(str) ? "File transfer stopped making progress." : "File transfer was cancelled.", "warning", (JSONArray) null, c10186.f32602);
        }
        c13280.f42423 = m16992(c10186).getJSONObject(d.O);
        c13280.f42431 = "TRANSFER_CANCELLED".equals(c15517.f50498) ? "cancelled" : k.j;
        c13280.f42416 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized JSONObject m17006(String str) {
        return m16999(m16995(str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C15517 m17007(C3767 c3767) {
        C13280 c13280M17000 = m17000(c3767);
        if (c13280M17000.f42428 && "completed".equals(c13280M17000.f42431)) {
            return null;
        }
        C15517 c15517 = new C15517(c13280M17000, c3767, SystemClock.elapsedRealtime());
        c13280M17000.f42417 = c15517;
        if (c3767.m12226() != EnumC12716.HEAD) {
            c13280M17000.f42431 = c13280M17000.f42428 ? "receiving" : "sending";
            c13280M17000.f42419 = 0L;
            c13280M17000.f42426 = "";
            c13280M17000.f42423 = null;
            c13280M17000.f42416 = -1L;
            c13280M17000.f42421 = JSON.array();
        }
        this.f20035++;
        return c15517;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m17008(C15517 c15517) {
        C13280 c13280 = c15517.f50500;
        if (c13280.f42417 != c15517) {
            return;
        }
        if ("cancelling".equals(c13280.f42431)) {
            c13280.f42431 = "cancelled";
            c13280.f42416 = SystemClock.elapsedRealtime();
        }
        c13280.f42417 = null;
        this.f20035--;
        if (c15517.f50498 != null && Thread.currentThread() == c15517.f50502) {
            Thread.interrupted();
        }
    }

    public C5823(C22209 c22209, C0580 c0580, C15826 c15826) {
        this.f20037 = c22209;
        this.f20032 = c0580;
        this.f20038 = c15826;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m16998(String str, boolean z, boolean z2, long j, String str2) throws C10186 {
        String strM50219;
        String strEncodeToString;
        JSONObject jSONObjectM16999;
        C22867 c22867M51585 = C22867.m51585();
        String str3 = (String) ((HashMap) c22867M51585.f74325.m12230()).get(c.f);
        try {
            URI uriCreate = URI.create("http://" + str3);
            if (str3 != null && uriCreate.getRawUserInfo() == null && uriCreate.getRawQuery() == null && uriCreate.getRawFragment() == null && "".equals(uriCreate.getRawPath())) {
                boolean zContains = true;
                if (uriCreate.getPort() >= 1 && uriCreate.getPort() <= 65535 && uriCreate.getPort() == c22867M51585.f74323) {
                    String host = uriCreate.getHost();
                    if (!"127.0.0.1".equals(host) && !"localhost".equalsIgnoreCase(host)) {
                        zContains = C13808.m33716().contains(host);
                    }
                    if (zContains) {
                        String aSCIIString = uriCreate.toASCIIString();
                        if (j < 0 || j > 9007199254740991L) {
                            throw C10186.m26301("Invalid file size", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
                        }
                        if (!str2.isEmpty()) {
                            if (str2.length() == 64) {
                                for (int i = 0; i < str2.length(); i++) {
                                    char cCharAt = str2.charAt(i);
                                    if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'f') || (cCharAt >= 'A' && cCharAt <= 'F'))) {
                                    }
                                }
                            }
                            throw C10186.m26301("sha256 must be empty or 64 hexadecimal characters", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
                        }
                        C9113 c9113M50227 = this.f20037.m50227();
                        if (z) {
                            this.f20037.getClass();
                            strM50219 = C22209.m50226(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
                        } else {
                            this.f20037.getClass();
                            strM50219 = C22209.m50219(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
                        }
                        String str4 = strM50219;
                        C22209 c22209 = this.f20037;
                        C19225 c19225M50233 = z ? c22209.m50233(str4) : c22209.m50228(str4);
                        try {
                            long jM16996 = !z ? m16996(str4, z, z2) : j;
                            c19225M50233.close();
                            synchronized (this) {
                                m16994();
                                if (this.f20036) {
                                    throw m16993("TRANSFER_STOPPED", "The transfer service has stopped.");
                                }
                                if (!this.f20038.m37769(c22867M51585.f74322, c22867M51585.f74324)) {
                                    throw m16993("TRANSFER_REVOKED", "The creating credential is no longer valid.");
                                }
                                if (this.f20034.size() >= 64) {
                                    throw m16993("TRANSFER_LIMIT", "Too many transfer tickets; wait for retained results to expire.");
                                }
                                do {
                                    byte[] bArr = new byte[16];
                                    this.f20031.nextBytes(bArr);
                                    strEncodeToString = Base64.encodeToString(bArr, 11);
                                } while (this.f20034.containsKey(strEncodeToString));
                                byte[] bArr2 = new byte[32];
                                this.f20031.nextBytes(bArr2);
                                String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
                                C13280 c13280 = new C13280(strEncodeToString, strEncodeToString2, str4, z, z2, jM16996, str2, c22867M51585.f74324, c22867M51585.f74322, SystemClock.elapsedRealtime());
                                this.f20034.put(strEncodeToString, c13280);
                                if (this.f20033 == null) {
                                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6667(1));
                                    this.f20033 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.ᩴᩳۚ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f64251.m17001();
                                        }
                                    }, 1L, 1L, TimeUnit.SECONDS);
                                }
                                jSONObjectM16999 = m16999(c13280);
                                jSONObjectM16999.put("url", aSCIIString + "/mcp/files/" + strEncodeToString);
                                jSONObjectM16999.put(e.s, z ? "PUT" : "GET");
                                jSONObjectM16999.put("headers", JSON.object().add("Authorization", "Bearer " + strEncodeToString2));
                            }
                            return jSONObjectM16999;
                        } catch (Throwable th) {
                            try {
                                c19225M50233.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            throw m16993("TRANSFER_INVALID_HOST", "A direct local HTTP Host with an explicit port is required.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m16997(String str) {
        JSONObject jSONObjectM16999;
        synchronized (this) {
            C13280 c13280M16995 = m16995(str);
            C15517 c15517 = c13280M16995.f42417;
            if (!"publishing".equals(c13280M16995.f42431) && (c15517 == null || !"completed".equals(c13280M16995.f42431))) {
                if (c15517 == null) {
                    if (!c13280M16995.f42428 || "ready".equals(c13280M16995.f42431)) {
                        c13280M16995.f42431 = "cancelled";
                        c13280M16995.f42416 = SystemClock.elapsedRealtime();
                    }
                    return m16999(c13280M16995);
                }
                c15517.f50498 = "TRANSFER_CANCELLED";
                c13280M16995.f42431 = "cancelling";
                c15517.f50502.interrupt();
                c15517.f50499.m12220();
                synchronized (this) {
                    jSONObjectM16999 = m16999(c15517.f50500);
                }
                return jSONObjectM16999;
            }
            return m16999(c13280M16995);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m16996(String str, boolean z, boolean z2) throws C10186 {
        C22209 c22209 = this.f20037;
        C9113 c9113M50227 = c22209.m50227();
        if (z) {
            C22209.m50226(str, c9113M50227, MotionUtils.EASING_TYPE_PATH);
        } else {
            c9113M50227.m24268(str);
        }
        AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
        c22209.m50230(abstractC22044M50232);
        C1907 c1907M50234 = c22209.m50234(str);
        EnumC13093 enumC13093M6567 = c1907M50234.m6567();
        EnumC13093 enumC13093 = EnumC13093.REGULAR;
        if (enumC13093M6567 != enumC13093 && (!z || c1907M50234.m6567() != EnumC13093.MISSING)) {
            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                throw m16993("FILE_NOT_FOUND", "The file does not exist.");
            }
            if (c1907M50234.m6567() == EnumC13093.DIRECTORY) {
                throw m16993("FILE_IS_DIRECTORY", "Only regular files can be transferred.");
            }
            throw C10186.m26305("FILE_UNSUPPORTED_TYPE", "Links and special files cannot be transferred.");
        }
        if (z) {
            if (!z2 && c1907M50234.m6567() != EnumC13093.MISSING) {
                throw m16993("FILE_ALREADY_EXISTS", "The destination exists and overwrite is false.");
            }
            String parent = abstractC22044M50232.getParent();
            if (parent == null) {
                throw m16993("FILE_PARENT_NOT_FOUND", "The destination has no parent.");
            }
            c9113M50227.m24270(parent);
            EnumC13093 enumC13093M6568 = c22209.m50234(parent).m6567();
            if (enumC13093M6568 == EnumC13093.MISSING) {
                throw m16993("FILE_PARENT_NOT_FOUND", "The destination parent does not exist.");
            }
            if (enumC13093M6568 == enumC13093) {
                throw m16993("FILE_NOT_DIRECTORY", "The parent is not a directory.");
            }
            if (enumC13093M6568 != EnumC13093.DIRECTORY) {
                throw C10186.m26305("FILE_NOT_DIRECTORY", "The parent is not a directory.");
            }
        }
        long jM6566 = c1907M50234.m6567() == EnumC13093.MISSING ? 0L : c1907M50234.m6566();
        if (jM6566 < 0 || jM6566 > 9007199254740991L) {
            throw m16993("FILE_SIZE_OUT_OF_RANGE", "The file size cannot be represented exactly.");
        }
        return jM6566;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16994() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f20034.values().iterator();
        while (it.hasNext()) {
            C13280 c13280 = (C13280) it.next();
            if (c13280.f42417 == null) {
                long j = c13280.f42416;
                if (j >= 0 && jElapsedRealtime - j >= 600000) {
                    it.remove();
                } else if (jElapsedRealtime >= c13280.f42427 && ("ready".equals(c13280.f42431) || (!c13280.f42428 && ("completed".equals(c13280.f42431) || k.j.equals(c13280.f42431))))) {
                    c13280.f42431 = "expired";
                    c13280.f42416 = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17001() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            m16994();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (C13280 c13280 : this.f20034.values()) {
                C15517 c15517 = c13280.f42417;
                if (c15517 != null && c15517.f50498 == null && !"publishing".equals(c13280.f42431) && jElapsedRealtime - c15517.f50501 >= 30000) {
                    c15517.f50498 = "TRANSFER_STALLED";
                    c15517.f50502.interrupt();
                    arrayList.add(c15517);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15517) it.next()).f50499.m12220();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            this.f20036 = true;
            ScheduledExecutorService scheduledExecutorService = this.f20033;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            for (C13280 c13280 : this.f20034.values()) {
                if (c13280.f42417 != null && !"publishing".equals(c13280.f42431)) {
                    C15517 c15517 = c13280.f42417;
                    c15517.f50498 = "TRANSFER_CANCELLED";
                    c15517.f50502.interrupt();
                    arrayList.add(c13280.f42417);
                }
            }
            this.f20034.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15517) it.next()).f50499.m12220();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m16993(String str, String str2) {
        return C10186.m26298(null, str, str2, "warning");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16992(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectObject = JSON.object();
        JSONValue jSONValue = jSONObject.get("changed");
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectObject.add("changed", jSONValue);
        JSONValue jSONValue2 = jSONObject.get("stateKnown");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        return C15300.m36730(c10186, jSONObjectAdd.add("stateKnown", jSONValue2).add("warnings", jSONObject.getJSONArray("warnings") == null ? JSON.array() : new JSONArray(jSONObject.getJSONArray("warnings"))), JSON.array());
    }
}
