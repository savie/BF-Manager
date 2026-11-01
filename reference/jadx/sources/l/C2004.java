package l;

import android.text.TextUtils;
import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.g;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.֫ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2004 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long f7475;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final long f7476;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final long f7478;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final long f7480;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f7481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f7484;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f7485;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f7486;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1299 f7487;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f7488;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f7489;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f7490;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap f7491;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f7492;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17548 f7493;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f7494;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f7495;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f7496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SecureRandom f7497 = new SecureRandom();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f7498;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f7499;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f7477 = Pattern.compile("Android\\s+([0-9]+(?:\\.[0-9]+)*)", 2);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f7482 = Pattern.compile("Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)", 2);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f7479 = Pattern.compile("(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)", 2);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f7483 = Pattern.compile("\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f7480 = timeUnit.toMillis(1L);
        f7485 = TimeUnit.SECONDS.toMillis(30L);
        f7481 = timeUnit.toMillis(30L);
        f7475 = TimeUnit.HOURS.toMillis(2L);
        long millis = timeUnit.toMillis(5L);
        f7484 = millis;
        f7476 = millis * 2;
        f7478 = timeUnit.toMillis(10L);
    }

    public C2004(C17548 c17548, String str) {
        Object obj = new Object();
        this.f7490 = obj;
        this.f7496 = new HashMap();
        this.f7498 = new HashMap();
        this.f7491 = new HashMap();
        this.f7494 = new HashMap();
        this.f7489 = new HashMap();
        this.f7492 = str == null ? "" : str;
        this.f7493 = c17548;
        this.f7487 = new C1299(C16737.m39277());
        synchronized (obj) {
            if (!m6419()) {
                m6421(System.currentTimeMillis());
                m6443();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m6463() {
        LinkedHashMap linkedHashMap;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            if (!m6419()) {
                m6432(jCurrentTimeMillis);
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("authRequired", Boolean.TRUE);
            linkedHashMap.put("pairingAvailable", Boolean.valueOf(m6419() || (this.f7486 != null && jCurrentTimeMillis < this.f7488)));
            long jMax = 0;
            if (!m6419()) {
                jMax = Math.max(this.f7488 - jCurrentTimeMillis, 0L);
            }
            linkedHashMap.put("pairingExpiresInMs", Long.valueOf(jMax));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11178 m6456(C15530 c15530, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM6417 = m6417(c15530);
        synchronized (this.f7490) {
            try {
                C11178 c11178M6430 = m6430(jCurrentTimeMillis, strM6417);
                if (c11178M6430 != null) {
                    return c11178M6430;
                }
                try {
                    C6238 c6238M6418 = m6418(str);
                    if (TextUtils.isEmpty(c6238M6418.f21170) || c6238M6418.f21166 == null) {
                        m6439(jCurrentTimeMillis, strM6417);
                        return C11178.m28120(R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f7490) {
                        try {
                            m6432(jCurrentTimeMillis);
                            if (!m6446(jCurrentTimeMillis, c6238M6418.f21170)) {
                                m6422(jCurrentTimeMillis, strM6417);
                                return C11178.m28119();
                            }
                            try {
                                C23878 c23878M6431 = m6431(c6238M6418.f21166);
                                synchronized (this.f7490) {
                                    try {
                                        m6432(jCurrentTimeMillis);
                                        if (!m6446(jCurrentTimeMillis, c6238M6418.f21170)) {
                                            m6422(jCurrentTimeMillis, strM6417);
                                            return C11178.m28119();
                                        }
                                        this.f7491.remove(strM6417);
                                        m6435(c23878M6431, m6427(c15530, c6238M6418), c6238M6418.f21168, jCurrentTimeMillis, c15530);
                                        if (!m6419()) {
                                            m6421(jCurrentTimeMillis);
                                            m6443();
                                        }
                                        return C11178.m28121(c23878M6431.f77170);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Exception unused) {
                                m6439(jCurrentTimeMillis, strM6417);
                                return C11178.m28120(R.string.MT_Protector, new Object[0]);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (C1320 unused2) {
                    m6439(jCurrentTimeMillis, strM6417);
                    return C11178.m28120(R.string.MT_Protector, new Object[0]);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11178 m6451(C15530 c15530) {
        C11178 c11178M6430;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            c11178M6430 = m6430(jCurrentTimeMillis, m6417(c15530));
        }
        return c11178M6430;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6460(C15530 c15530) {
        m6439(System.currentTimeMillis(), m6417(c15530));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16117 m6462(C15530 c15530) {
        boolean zEquals;
        String strM14444 = C5244.m14444(c15530, "ticket");
        if (!TextUtils.isEmpty(strM14444)) {
            if (!EnumC18351.GET.equals(c15530.m37142()) && !EnumC18351.HEAD.equals(c15530.m37142())) {
                return C16117.m38156(EnumC10591.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
            }
            if (C5244.m14441(c15530)) {
                return C16117.m38156(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM14445 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
            String strM14446 = C5244.m14444(c15530, "disposition");
            synchronized (this.f7490) {
                m6438(jCurrentTimeMillis);
                C9030.removeIf(this.f7494.entrySet(), new C15412(jCurrentTimeMillis));
                C16822 c16822 = (C16822) this.f7494.get(strM14444);
                if (c16822 != null && c16822.f53853 > jCurrentTimeMillis) {
                    String str = c16822.f53851;
                    boolean zEquals2 = true;
                    if (str == null) {
                        zEquals = strM14445 == null;
                    } else {
                        zEquals = str.equals(strM14445);
                    }
                    if (zEquals) {
                        String str2 = c16822.f53854;
                        if (str2 != null) {
                            zEquals2 = str2.equals(strM14446);
                        } else if (strM14446 != null) {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            C22467 c22467M6420 = m6420(c16822.f53852);
                            if (c22467M6420 != null) {
                                if (!c22467M6420.f73342) {
                                    m6433(c16822.f53852, jCurrentTimeMillis, c15530, false);
                                }
                                return C16117.m38157(new C21055(c16822.f53852, null, null));
                            }
                            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                    }
                    return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
        }
        return m6457(c15530);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16117 m6464(C15530 c15530) {
        String strM14444 = C5244.m14444(c15530, "ticket");
        if (!EnumC18351.GET.equals(c15530.m37142())) {
            return C16117.m38156(EnumC10591.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        if (C5244.m14441(c15530)) {
            return C16117.m38156(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        if (TextUtils.isEmpty(strM14444)) {
            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            m6438(jCurrentTimeMillis);
            C9030.removeIf(this.f7489.entrySet(), new C8356(jCurrentTimeMillis));
            C7650 c7650 = (C7650) this.f7489.get(strM14444);
            if (c7650 == null) {
                return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (c7650.f25282 <= jCurrentTimeMillis) {
                return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            C22467 c22467M6420 = m6420(c7650.f25283);
            if (c22467M6420 == null) {
                return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (!c22467M6420.f73342) {
                m6433(c7650.f25283, jCurrentTimeMillis, c15530, false);
            }
            return C16117.m38157(new C21055(c7650.f25283, strM14444, c7650.f25281));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m6453(C21055 c21055) {
        C22467 c22467M6420;
        if (c21055 == null) {
            c22467M6420 = null;
        } else {
            String str = c21055.f68578;
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f7490) {
                m6438(jCurrentTimeMillis);
                c22467M6420 = m6420(str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticated", Boolean.valueOf(c22467M6420 != null));
        if (c22467M6420 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("deviceId", c22467M6420.f73344);
            linkedHashMap2.put("deviceName", c22467M6420.f73348);
            linkedHashMap2.put("firstAccessAt", Long.valueOf(c22467M6420.f73346));
            linkedHashMap2.put("lastAccessAt", Long.valueOf(c22467M6420.f73343));
            linkedHashMap2.put("lastIp", c22467M6420.f73345);
            linkedHashMap2.put("userAgent", c22467M6420.f73347);
            linkedHashMap2.put("temporary", Boolean.valueOf(c22467M6420.f73342));
            linkedHashMap.put(e.p, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6452() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            m6438(jCurrentTimeMillis);
            arrayList = new ArrayList();
            Iterator it = this.f7487.m4643().iterator();
            while (it.hasNext()) {
                arrayList.add(C1299.m4639((C22467) it.next()));
            }
            Iterator it2 = this.f7496.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(C1299.m4639((C22467) it2.next()));
            }
            C1299.m4642(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6466(C21055 c21055, String str) {
        boolean zRemoveIf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            m6438(jCurrentTimeMillis);
            C1299 c1299 = this.f7487;
            ArrayList arrayListM4643 = c1299.m4643();
            zRemoveIf = C9030.removeIf(arrayListM4643, new C19645(str));
            if (zRemoveIf) {
                c1299.m4644(arrayListM4643);
            }
            if (c21055 != null && str.equals(c21055.f68578)) {
                zRemoveIf = this.f7496.remove(str) != null || zRemoveIf;
            }
            if (zRemoveIf) {
                m6440(str);
            }
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6458(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            m6438(jCurrentTimeMillis);
            C1299 c1299 = this.f7487;
            ArrayList arrayListM4643 = c1299.m4643();
            boolean zRemoveIf = C9030.removeIf(arrayListM4643, new C19645(str));
            if (zRemoveIf) {
                c1299.m4644(arrayListM4643);
            }
            z = this.f7496.remove(str) != null || zRemoveIf;
            if (z) {
                m6440(str);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C6238 m6418(String str) {
        String strM6441;
        String strM6442;
        String strM6443;
        JSONObject jSONObjectM32822 = C13316.m32822(str);
        C6238 c6238 = new C6238();
        c6238.f21170 = C13316.m32829(jSONObjectM32822, "code");
        c6238.f21169 = C13316.m32829(jSONObjectM32822, "deviceName");
        C0593 c0593 = null;
        Boolean booleanObject = null;
        c0593 = null;
        try {
            JSONObject jSONObject = jSONObjectM32822.getJSONObject("clientHints");
            if (jSONObject != null) {
                C0593 c0594 = new C0593();
                List list = Collections.EMPTY_LIST;
                c0594.f2576 = list;
                c0594.f2579 = list;
                try {
                    strM6441 = m6441(jSONObject.getString("platform"));
                } catch (RuntimeException unused) {
                    strM6441 = null;
                }
                c0594.f2577 = strM6441;
                try {
                    strM6442 = m6441(jSONObject.getString("platformVersion"));
                } catch (RuntimeException unused2) {
                    strM6442 = null;
                }
                c0594.f2580 = strM6442;
                try {
                    strM6443 = m6441(jSONObject.getString("model"));
                } catch (RuntimeException unused3) {
                    strM6443 = null;
                }
                c0594.f2575 = strM6443;
                try {
                    booleanObject = jSONObject.getBooleanObject("mobile");
                } catch (RuntimeException unused4) {
                }
                c0594.f2578 = booleanObject;
                c0594.f2576 = m6429(jSONObject, "brands");
                c0594.f2579 = m6429(jSONObject, "fullVersionList");
                c0593 = c0594;
            }
        } catch (RuntimeException unused5) {
        }
        c6238.f21167 = c0593;
        try {
            c6238.f21166 = jSONObjectM32822.getJSONObject("publicKey");
            c6238.f21168 = C13316.m32828(jSONObjectM32822, "trust");
            return c6238;
        } catch (RuntimeException e) {
            throw C13316.m32827(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m6454(C21055 c21055, String str) {
        C12589 c12589;
        try {
            JSONObject jSONObjectM32822 = C13316.m32822(str);
            c12589 = new C12589();
            c12589.f42075 = C13316.m32829(jSONObjectM32822, MotionUtils.EASING_TYPE_PATH);
            c12589.f42074 = C13316.m32829(jSONObjectM32822, "disposition");
        } catch (C1320 unused) {
            c12589 = null;
        }
        if (c12589 == null || TextUtils.isEmpty(c12589.f42075) || !("inline".equals(c12589.f42074) || "attachment".equals(c12589.f42074))) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f7497.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C16822 c16822 = new C16822(0);
        c16822.f53852 = c21055.f68578;
        c16822.f53851 = c12589.f42075;
        c16822.f53854 = c12589.f42074;
        c16822.f53853 = f7478 + jCurrentTimeMillis;
        synchronized (this.f7490) {
            C9030.removeIf(this.f7494.entrySet(), new C15412(jCurrentTimeMillis));
            this.f7494.put(strEncodeToString, c16822);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c16822.f53853));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m6455(C21055 c21055, C10473 c10473) {
        if (c21055 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f7497.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C7650 c7650 = new C7650(0);
        c7650.f25283 = c21055.f68578;
        c7650.f25281 = c10473;
        c7650.f25282 = f7478 + jCurrentTimeMillis;
        synchronized (this.f7490) {
            C9030.removeIf(this.f7489.entrySet(), new C8356(jCurrentTimeMillis));
            this.f7489.put(strEncodeToString, c7650);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c7650.f25282));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6459() {
        synchronized (this.f7490) {
            ScheduledFuture scheduledFuture = this.f7499;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f7499 = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.f7495;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f7495 = null;
            }
            this.f7494.clear();
            this.f7489.clear();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m6461() {
        synchronized (this.f7490) {
            if (m6419()) {
                return null;
            }
            m6432(System.currentTimeMillis());
            return this.f7486;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m6450() {
        synchronized (this.f7490) {
            if (m6419()) {
                return 0L;
            }
            m6432(System.currentTimeMillis());
            return this.f7488;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static long m6447() {
        return f7480;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16117 m6457(C15530 c15530) {
        String strM37143;
        boolean zVerify;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM14439 = C5244.m14439(c15530, "X-MT-Auth-Device");
        String strM144310 = C5244.m14439(c15530, "X-MT-Auth-Timestamp");
        String strM144311 = C5244.m14439(c15530, "X-MT-Auth-Nonce");
        String strM144312 = C5244.m14439(c15530, "X-MT-Auth-Content-SHA256");
        String strM144313 = C5244.m14439(c15530, "X-MT-Auth-Signature");
        boolean zEquals = false;
        if (TextUtils.isEmpty(strM14439) || TextUtils.isEmpty(strM144310) || TextUtils.isEmpty(strM144311) || TextUtils.isEmpty(strM144312) || TextUtils.isEmpty(strM144313)) {
            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        try {
            if (Math.abs(jCurrentTimeMillis - Long.parseLong(strM144310)) > f7484) {
                return C16117.m38155();
            }
            synchronized (this.f7490) {
                m6438(jCurrentTimeMillis);
                m6445(jCurrentTimeMillis);
                C22467 c22467M6420 = m6420(strM14439);
                if (c22467M6420 == null) {
                    return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                Map map = (Map) this.f7498.get(strM14439);
                if (map != null && map.containsKey(strM144311)) {
                    return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                StringBuilder sb = new StringBuilder("MT-REMOTE-AUTH-v1\n");
                sb.append(c15530.m37142().name());
                sb.append("\n");
                String strM37132 = c15530.m37132();
                if (TextUtils.isEmpty(strM37132)) {
                    strM37143 = c15530.m37143();
                } else {
                    strM37143 = c15530.m37143() + "?" + strM37132;
                }
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM37143, "\n", strM144310, "\n");
                String strM5622 = C1694.m5622(sb, strM144311, "\n", strM144312);
                try {
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(m6431(C13316.m32822(c22467M6420.f73349)).f77169);
                    signature.update(strM5622.getBytes(StandardCharsets.UTF_8));
                    zVerify = signature.verify(Base64.decode(strM144313, 11));
                } catch (Exception unused) {
                    zVerify = false;
                }
                if (!zVerify) {
                    return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                try {
                    if (!strM144312.equals(m6423(c15530))) {
                        return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f7490) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m6438(jCurrentTimeMillis2);
                        m6445(jCurrentTimeMillis2);
                        if (m6420(strM14439) == null) {
                            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        Map map2 = (Map) this.f7498.get(strM14439);
                        if (map2 != null && map2.containsKey(strM144311)) {
                            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        HashMap map3 = this.f7498;
                        Map map4 = (Map) map3.get(strM14439);
                        if (map4 == null) {
                            map4 = new HashMap();
                            map3.put(strM14439, map4);
                        }
                        map4.put(strM144311, Long.valueOf(jCurrentTimeMillis2));
                        if (EnumC18351.DELETE.equals(c15530.m37142()) && "/api/auth/devices".equals(c15530.m37143())) {
                            zEquals = strM14439.equals(C5244.m14444(c15530, "deviceId"));
                        }
                        if (!zEquals) {
                            m6433(strM14439, jCurrentTimeMillis2, c15530, true);
                        }
                        return C16117.m38157(new C21055(strM14439, null, null));
                    }
                } catch (C14706 e) {
                    return C16117.m38156(e.f48036, e.f48038, e.f48037);
                } catch (Exception unused2) {
                    return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
            }
        } catch (NumberFormatException unused3) {
            return C16117.m38156(EnumC10591.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6465(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f7490) {
            m6438(jCurrentTimeMillis);
            C9030.removeIf(this.f7489.entrySet(), new C8356(jCurrentTimeMillis));
            C7650 c7650 = (C7650) this.f7489.get(str);
            if (c7650 == null) {
                return false;
            }
            if (c7650.f25282 <= jCurrentTimeMillis) {
                return false;
            }
            return m6420(c7650.f25283) != null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if ("/api/file-upload-complete".equals(r0) == false) goto L56;
     */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6423(l.C15530 r9) throws l.C14706 {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2004.m6423(l.ܶ᩹᩹):java.lang.String");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static long m6448(C15530 c15530) throws C14706 {
        if (!C5244.m14443(c15530)) {
            return 0L;
        }
        if (C5244.m14445(c15530)) {
            throw new C14706(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        String strM14439 = C5244.m14439(c15530, "content-length");
        if (TextUtils.isEmpty(strM14439)) {
            return -1L;
        }
        String strTrim = strM14439.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C14706(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C14706(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C14706(EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23878 m6431(JSONObject jSONObject) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        String strM6444 = m6444(jSONObject, "kty");
        String strM6445 = m6444(jSONObject, "crv");
        String strM6446 = m6444(jSONObject, "x");
        String strM6447 = m6444(jSONObject, "y");
        if (!"EC".equals(strM6444) || !"P-256".equals(strM6445) || strM6446.contains("=") || strM6447.contains("=")) {
            throw new IllegalArgumentException("unsupported key");
        }
        byte[] bArrDecode = Base64.decode(strM6446, 11);
        byte[] bArrDecode2 = Base64.decode(strM6447, 11);
        if (bArrDecode.length != 32 || bArrDecode2.length != 32) {
            throw new IllegalArgumentException("invalid coordinate length");
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrDecode), new BigInteger(1, bArrDecode2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        if (!(publicKeyGeneratePublic instanceof ECPublicKey)) {
            throw new IllegalArgumentException("invalid key");
        }
        StringBuilder sbM30515 = C12278.m30515("{\"crv\":\"", strM6445, "\",\"kty\":\"", strM6444, "\",\"x\":\"");
        sbM30515.append(strM6446);
        sbM30515.append("\",\"y\":\"");
        sbM30515.append(strM6447);
        sbM30515.append("\"}");
        String string = sbM30515.toString();
        return new C23878(string, m6428(string.getBytes(StandardCharsets.UTF_8)), (ECPublicKey) publicKeyGeneratePublic);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m6444(JSONObject jSONObject, String str) {
        String strM32829 = jSONObject == null ? null : C13316.m32829(jSONObject, str);
        if (TextUtils.isEmpty(strM32829)) {
            throw new IllegalArgumentException("missing ".concat(str));
        }
        return strM32829;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6435(final C23878 c23878, String str, boolean z, long j, C15530 c15530) {
        C22467 c22467;
        long j2;
        String str2 = c23878.f77170;
        C1299 c1299 = this.f7487;
        ArrayList arrayListM4643 = c1299.m4643();
        Iterator it = arrayListM4643.iterator();
        do {
            if (!it.hasNext()) {
                c22467 = null;
                break;
            }
            c22467 = (C22467) it.next();
        } while (!str2.equals(c22467.f73344));
        C9030.removeIf(arrayListM4643, new Predicate() { // from class: l.᩺ᩴۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c23878.f77170.equals(((C22467) obj).f73344);
            }
        });
        HashMap map = this.f7496;
        map.remove(str2);
        C22467 c22468 = c22467 == null ? new C22467() : c22467;
        c22468.f73344 = str2;
        c22468.f73348 = str;
        c22468.f73349 = c23878.f77168;
        if (c22467 != null) {
            j2 = c22467.f73346;
            if (j2 <= 0) {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        c22468.f73346 = j2;
        c22468.f73343 = j;
        c22468.f73345 = m6417(c15530);
        c22468.f73347 = m6442(c15530);
        c22468.f73342 = !z;
        if (z) {
            arrayListM4643.add(c22468);
            C23846.sort(arrayListM4643, C7618.comparingLong(new C9062()));
            while (arrayListM4643.size() > 32) {
                arrayListM4643.remove(0);
            }
            c1299.m4644(arrayListM4643);
            return;
        }
        map.put(c22468.f73344, c22468);
        c1299.m4644(arrayListM4643);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6433(String str, long j, C15530 c15530, boolean z) {
        C22467 c22467 = (C22467) this.f7496.get(str);
        if (c22467 != null && z) {
            c22467.f73343 = j;
            c22467.f73345 = m6417(c15530);
            c22467.f73347 = m6442(c15530);
            return;
        }
        C1299 c1299 = this.f7487;
        ArrayList<C22467> arrayListM4643 = c1299.m4643();
        for (C22467 c22468 : arrayListM4643) {
            if (str.equals(c22468.f73344)) {
                c22468.f73343 = j;
                c22468.f73345 = m6417(c15530);
                c22468.f73347 = m6442(c15530);
                c1299.m4644(arrayListM4643);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m6440(final String str) {
        this.f7498.remove(str);
        C9030.removeIf(this.f7494.entrySet(), new Predicate() { // from class: l.ᩳᩴۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C16822) ((Map.Entry) obj).getValue()).f53852);
            }
        });
        C9030.removeIf(this.f7489.entrySet(), new Predicate() { // from class: l.ᩴᩴۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C7650) ((Map.Entry) obj).getValue()).f25283);
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C22467 m6420(String str) {
        for (C22467 c22467 : this.f7487.m4643()) {
            if (str.equals(c22467.f73344)) {
                return c22467;
            }
        }
        return (C22467) this.f7496.get(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m6438(long j) {
        Iterator it = this.f7496.entrySet().iterator();
        while (it.hasNext()) {
            C22467 c22467 = (C22467) ((Map.Entry) it.next()).getValue();
            if (j - c22467.f73343 > f7481 || j - c22467.f73346 > f7475) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m6445(final long j) {
        Iterator it = this.f7498.entrySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map.Entry) it.next()).getValue();
            C9030.removeIf(map.entrySet(), new Predicate() { // from class: l.᩸ᩴۜ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C2004.m6436(j, (Map.Entry) obj);
                }
            });
            if (map.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m6436(long j, Map.Entry entry) {
        return j - ((Long) entry.getValue()).longValue() > f7476;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6432(long j) {
        if (m6419()) {
            return;
        }
        if (this.f7486 == null || j >= this.f7488) {
            m6421(j);
            m6443();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m6446(long j, String str) {
        if (m6419()) {
            return this.f7492.equals(str);
        }
        String str2 = this.f7486;
        return str2 != null && j < this.f7488 && str2.equals(str);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m6419() {
        return !TextUtils.isEmpty(this.f7492);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m6421(long j) {
        String str = String.format(Locale.ROOT, "%06d", Integer.valueOf(this.f7497.nextInt(BasicLabelFormatter.MILLION)));
        this.f7486 = str;
        long j2 = j + f7480;
        this.f7488 = j2;
        C17548 c17548 = this.f7493;
        if (c17548 != null) {
            C2025 c2025 = (C2025) c17548.f55771;
            ServiceC4538 serviceC4538 = (ServiceC4538) ((C3078) c17548.f55772).f11653;
            int i = ServiceC4538.f16137;
            C16737.m39273(new RunnableC3436(serviceC4538, c2025, str, j2));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m6443() {
        if (this.f7495 == null) {
            this.f7495 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC4121());
        }
        ScheduledFuture scheduledFuture = this.f7499;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f7499 = this.f7495.schedule(new Runnable() { // from class: l.ۜᩴۜ
            @Override // java.lang.Runnable
            public final void run() {
                C2004.m6434(this.f23362);
            }
        }, Math.max(this.f7488 - System.currentTimeMillis(), 1L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6434(C2004 c2004) {
        synchronized (c2004.f7490) {
            c2004.m6421(System.currentTimeMillis());
            c2004.m6443();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m6439(long j, String str) {
        synchronized (this.f7490) {
            m6422(j, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m6422(long j, String str) {
        HashMap map = this.f7491;
        C17527 c17527 = (C17527) map.get(str);
        if (c17527 != null) {
            long j2 = c17527.f55722;
            if (j2 > 0 && j >= j2) {
                c17527 = new C17527(0);
                map.put(str, c17527);
            }
        } else {
            c17527 = new C17527(0);
            map.put(str, c17527);
        }
        int i = c17527.f55723 + 1;
        c17527.f55723 = i;
        if (i >= 5) {
            c17527.f55722 = j + f7485;
            c17527.f55723 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11178 m6430(long j, String str) {
        C17527 c17527 = (C17527) this.f7491.get(str);
        if (c17527 == null || c17527.f55722 <= j) {
            return null;
        }
        m6422(j, str);
        return C11178.m28120(R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m6417(C15530 c15530) {
        String strM37137 = c15530.m37137();
        return TextUtils.isEmpty(strM37137) ? "" : strM37137;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m6442(C15530 c15530) {
        String strM14439 = C5244.m14439(c15530, "user-agent");
        if (strM14439 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(strM14439.length(), 1024));
        for (int i = 0; i < strM14439.length(); i++) {
            char cCharAt = strM14439.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strTrim = sb.toString().trim();
        return strTrim.length() > 1024 ? strTrim.substring(0, 1024) : strTrim;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x028b A[PHI: r5
      0x028b: PHI (r5v34 java.lang.String) = (r5v33 java.lang.String), (r5v33 java.lang.String), (r5v37 java.lang.String), (r5v33 java.lang.String) binds: [B:135:0x0233, B:145:0x0255, B:415:0x028b, B:143:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:193:0x0313  */
    /* JADX WARN: Code duplicated, block: B:197:0x031a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0455  */
    /* JADX WARN: Code duplicated, block: B:306:0x04a5 A[PHI: r0 r2
      0x04a5: PHI (r0v20 java.lang.String[]) = 
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v25 java.lang.String[])
     binds: [B:236:0x03a8, B:239:0x03b6, B:241:0x03be, B:243:0x03c6, B:245:0x03ce, B:247:0x03d6, B:249:0x03de, B:251:0x03e6, B:253:0x03ee, B:255:0x03f6, B:257:0x03fe, B:259:0x0406, B:261:0x040e, B:263:0x0416, B:265:0x041e, B:412:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r2v5 int) = 
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v8 int)
     binds: [B:236:0x03a8, B:239:0x03b6, B:241:0x03be, B:243:0x03c6, B:245:0x03ce, B:247:0x03d6, B:249:0x03de, B:251:0x03e6, B:253:0x03ee, B:255:0x03f6, B:257:0x03fe, B:259:0x0406, B:261:0x040e, B:263:0x0416, B:265:0x041e, B:412:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:310:0x04b7 A[EDGE_INSN: B:310:0x04b7->B:311:0x04b8 BREAK  A[LOOP:1: B:231:0x0389->B:307:0x04a9]] */
    /* JADX WARN: Code duplicated, block: B:314:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:321:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:376:0x059d  */
    /* JADX WARN: Code duplicated, block: B:379:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6427(C15530 c15530, C6238 c6238) {
        String str;
        String strM6424;
        int i;
        String strM6425;
        boolean z;
        int i2;
        String str2;
        Boolean bool;
        String str3;
        String[] strArr;
        int i3;
        String str4;
        String str5;
        List list;
        String strM14439 = C5244.m14439(c15530, "user-agent");
        C0593 c0593 = c6238.f21167;
        String strM144310 = C5244.m14439(c15530, "sec-ch-ua");
        String strM6426 = m6425(c0593 == null ? null : c0593.f2579);
        if (TextUtils.isEmpty(strM6426)) {
            strM6426 = m6425(c0593 == null ? null : c0593.f2576);
        }
        if (TextUtils.isEmpty(strM6426)) {
            if (TextUtils.isEmpty(strM144310)) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f7483.matcher(strM144310);
                while (matcher.find() && arrayList.size() < 8) {
                    String strM6441 = m6441(matcher.group(1));
                    m6441(matcher.group(2));
                    arrayList.add(new C20350(strM6441));
                }
                list = arrayList;
            }
            strM6426 = m6425(list);
        }
        if (TextUtils.isEmpty(strM6426)) {
            if (TextUtils.isEmpty(strM14439)) {
                strM6426 = null;
            } else if (strM14439.contains("SamsungBrowser/")) {
                strM6426 = "Samsung Internet";
            } else if (strM14439.contains("Edg/") || strM14439.contains("EdgA/") || strM14439.contains("EdgiOS/")) {
                strM6426 = "Edge";
            } else if (strM14439.contains("OPR/") || strM14439.contains("Opera/")) {
                strM6426 = "Opera";
            } else if (strM14439.contains("FxiOS/") || strM14439.contains("Firefox/")) {
                strM6426 = "Firefox";
            } else if (strM14439.contains("CriOS/") || strM14439.contains("Chrome/")) {
                strM6426 = "Chrome";
            } else if (strM14439.contains("Safari/") && strM14439.contains("Version/")) {
                strM6426 = "Safari";
            } else {
                strM6426 = null;
            }
        }
        String strM144311 = C5244.m14439(c15530, "sec-ch-ua-platform");
        String str6 = c0593 == null ? null : c0593.f2577;
        String strM6442 = m6441(strM144311);
        if (strM6442.length() >= 2 && strM6442.startsWith("\"") && strM6442.endsWith("\"")) {
            strM6442 = C20630.m46498(1, 1, strM6442);
        }
        String strM6443 = m6441(str6);
        if (TextUtils.isEmpty(strM6443)) {
            strM6443 = m6441(strM6442);
        }
        String str7 = c0593 == null ? null : c0593.f2580;
        String strM6444 = m6441(strM6443);
        if (TextUtils.isEmpty(strM6444)) {
            strM6424 = null;
            str = strM6426;
        } else {
            String lowerCase = strM6444.toLowerCase(Locale.ROOT);
            str = strM6426;
            if (lowerCase.contains("android")) {
                strM6424 = m6424(AnalyticsConstants.SDK_TYPE, m6449(str7));
            } else if (lowerCase.contains("ios")) {
                strM6424 = m6424("iOS", m6449(str7));
            } else if (lowerCase.contains(g.a)) {
                strM6424 = m6424("macOS", m6449(str7));
            } else if (lowerCase.contains("windows")) {
                String strM6445 = m6441(str7);
                int i4 = 0;
                while (i4 < strM6445.length() && Character.isDigit(strM6445.charAt(i4))) {
                    i4++;
                }
                if (i4 == 0) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(strM6445.substring(0, i4));
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                }
                if (i >= 13) {
                    strM6424 = "Windows 11";
                } else {
                    strM6424 = i > 0 ? "Windows 10" : null;
                }
                if (TextUtils.isEmpty(strM6424)) {
                    strM6424 = "Windows";
                }
            } else {
                strM6424 = lowerCase.contains("chrome os") ? m6424("ChromeOS", m6449(str7)) : m6424(strM6444, m6449(str7));
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM6424);
        String str8 = strM6424;
        Pattern pattern = f7482;
        String str9 = "iPhone";
        String strM5594 = "";
        if (!zIsEmpty) {
            strM6425 = str8;
        } else if (TextUtils.isEmpty(strM14439)) {
            strM6425 = null;
        } else if (strM14439.contains("iPhone") || strM14439.contains("iPad")) {
            String str10 = strM14439.contains("iPad") ? "iPadOS" : "iOS";
            String strM6449 = m6449(m6426(f7479, strM14439));
            if (strM6449.startsWith("18.6")) {
                int iIndexOf = strM14439.indexOf("Version/");
                if (iIndexOf < 0) {
                    i2 = -1;
                } else {
                    int i5 = iIndexOf + 8;
                    int i6 = i5;
                    while (i6 < strM14439.length() && Character.isDigit(strM14439.charAt(i6))) {
                        i6++;
                    }
                    if (i6 == i5) {
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(strM14439.substring(i5, i6));
                        } catch (NumberFormatException unused2) {
                            i2 = -1;
                        }
                    }
                }
                if (i2 >= 26) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                strM6449 = "";
            }
            strM6425 = m6424(str10, strM6449);
        } else {
            String strM6427 = m6426(f7477, strM14439);
            if (!TextUtils.isEmpty(strM6427)) {
                String strM64410 = m6449(strM6427);
                if (!"10".equals(strM64410) || (!strM14439.contains("Chrome/") && !strM14439.contains("EdgA/") && !strM14439.contains("OPR/") && !strM14439.contains("SamsungBrowser/"))) {
                    str2 = strM64410;
                    break;
                }
                String strM6428 = m6426(pattern, strM14439);
                if (!TextUtils.isEmpty(strM6428)) {
                    String[] strArrSplit = strM6428.split(l.b);
                    int length = strArrSplit.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            str2 = strM64410;
                            break;
                        }
                        String strM6446 = m6441(strArrSplit[i7]);
                        int iIndexOf2 = strM6446.indexOf(" Build/");
                        String str11 = strM64410;
                        if (iIndexOf2 >= 0) {
                            strM6446 = strM6446.substring(0, iIndexOf2);
                        }
                        if ("k".equals(m6441(strM6446).toLowerCase(Locale.ROOT))) {
                            str2 = "";
                            break;
                        }
                        i7++;
                        strM64410 = str11;
                    }
                } else {
                    str2 = strM64410;
                    break;
                }
                strM6425 = m6424(AnalyticsConstants.SDK_TYPE, str2);
            } else if (strM14439.contains("Mac OS X") || strM14439.contains("Macintosh")) {
                strM6425 = "macOS";
            } else if (strM14439.contains("Windows NT")) {
                strM6425 = "Windows";
            } else if (strM14439.contains("CrOS")) {
                strM6425 = "ChromeOS";
            } else {
                strM6425 = "Linux";
                if (!strM14439.contains("Linux")) {
                    strM6425 = null;
                }
            }
        }
        String strM144312 = C5244.m14439(c15530, "sec-ch-ua-mobile");
        if (c0593 == null || (bool = c0593.f2578) == null) {
            String strM6447 = m6441(strM144312);
            if ("?1".equals(strM6447)) {
                bool = Boolean.TRUE;
            } else {
                bool = "?0".equals(strM6447) ? Boolean.FALSE : null;
            }
        }
        String strM6448 = m6441(c0593 == null ? null : c0593.f2575);
        if (!TextUtils.isEmpty(strM6448)) {
            str9 = strM6448;
        } else if (TextUtils.isEmpty(strM14439)) {
            if (Boolean.TRUE.equals(bool) || TextUtils.isEmpty(strM6425) || !strM6425.startsWith("iOS")) {
                str9 = null;
            }
        } else if (strM14439.contains("iPad")) {
            str9 = "iPad";
        } else if (!strM14439.contains("iPhone")) {
            String strM6429 = m6426(pattern, strM14439);
            if (!TextUtils.isEmpty(strM6429)) {
                String[] strArrSplit2 = strM6429.split(l.b);
                int length2 = strArrSplit2.length;
                int i8 = 0;
                str3 = "";
                while (true) {
                    if (i8 >= length2) {
                        if (!TextUtils.isEmpty(str3)) {
                            break;
                        }
                        str3 = null;
                        break;
                    }
                    String str12 = strArrSplit2[i8];
                    String strM64411 = m6441(str12);
                    int iIndexOf3 = strM64411.indexOf(" Build/");
                    if (iIndexOf3 >= 0) {
                        strM64411 = strM64411.substring(0, iIndexOf3);
                    }
                    String strM64412 = m6441(strM64411);
                    String strM64413 = m6441(strM64412);
                    if (!TextUtils.isEmpty(strM64413)) {
                        String lowerCase2 = strM64413.toLowerCase(Locale.ROOT);
                        if (!"k".equals(lowerCase2) && !"wv".equals(lowerCase2) && !"tablet".equals(lowerCase2) && !lowerCase2.contains("mobile") && !lowerCase2.contains("linux") && !lowerCase2.startsWith("rv:") && !lowerCase2.startsWith("version/") && !lowerCase2.startsWith("chrome/") && !lowerCase2.startsWith("crios/") && !lowerCase2.startsWith("firefox/") && !lowerCase2.startsWith("fxios/") && !lowerCase2.startsWith("gecko/") && !lowerCase2.startsWith("safari/") && !lowerCase2.startsWith("applewebkit/")) {
                            if (lowerCase2.length() < 2 || lowerCase2.length() > 12) {
                                strArr = strArrSplit2;
                                i3 = length2;
                            } else {
                                String[] strArrSplit3 = lowerCase2.replace('_', '-').split("-");
                                if (strArrSplit3.length < 1 || strArrSplit3.length > 3 || (strArrSplit3.length == 1 && strArrSplit3[0].length() > 3)) {
                                    strArr = strArrSplit2;
                                } else {
                                    int length3 = strArrSplit3.length;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < length3) {
                                            String str13 = strArrSplit3[i9];
                                            strArr = strArrSplit2;
                                            if (str13.length() >= 2 && str13.length() <= 4) {
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < str13.length()) {
                                                        char cCharAt = str13.charAt(i10);
                                                        i3 = length2;
                                                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                                                            i10++;
                                                            length2 = i3;
                                                        }
                                                    } else {
                                                        i9++;
                                                        strArrSplit2 = strArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            strArr = strArrSplit2;
                                            i3 = length2;
                                        }
                                    }
                                }
                                i3 = length2;
                            }
                            if (!TextUtils.isEmpty(strM64412) && str12.contains("Build/")) {
                                str3 = strM64412;
                                break;
                            }
                            str3 = strM64412;
                        } else {
                            strArr = strArrSplit2;
                            i3 = length2;
                        }
                    } else {
                        strArr = strArrSplit2;
                        i3 = length2;
                    }
                    i8++;
                    strArrSplit2 = strArr;
                    length2 = i3;
                }
            } else {
                str3 = null;
                break;
            }
            if (!TextUtils.isEmpty(str3)) {
                str9 = str3;
            } else if (Boolean.TRUE.equals(bool)) {
                str9 = null;
            } else {
                str9 = null;
            }
        }
        String strM64414 = m6441(str);
        String strM64415 = m6441(strM6425);
        if (!TextUtils.isEmpty(strM64414) && !TextUtils.isEmpty(strM64415)) {
            strM64414 = C1679.m5594(strM64414, " on ", strM64415);
        } else if (TextUtils.isEmpty(strM64414)) {
            strM64414 = TextUtils.isEmpty(strM64415) ? "" : strM64415;
        }
        String strM64416 = m6441(str9);
        if (TextUtils.isEmpty(strM64416)) {
            strM64416 = strM5594;
        } else {
            String upperCase = strM64416.toUpperCase(Locale.ROOT);
            if (upperCase.contains("REDMI") || upperCase.startsWith("POCO") || upperCase.contains("XIAOMI")) {
                str4 = "Xiaomi";
            } else if (upperCase.startsWith("RMX")) {
                str4 = "realme";
            } else if (upperCase.startsWith("SM-")) {
                str4 = "Samsung";
            } else if (upperCase.contains("PIXEL")) {
                str4 = "Google";
            } else {
                String str14 = "OPPO";
                if (!upperCase.contains("OPPO")) {
                    if (upperCase.contains("IQOO")) {
                        str4 = "iQOO";
                    } else if (upperCase.contains("VIVO")) {
                        str4 = "vivo";
                    } else if (upperCase.contains("HONOR")) {
                        str4 = "Honor";
                    } else if (upperCase.contains("HUAWEI")) {
                        str4 = "Huawei";
                    } else if (upperCase.contains("ONEPLUS")) {
                        str4 = "OnePlus";
                    } else {
                        str14 = null;
                    }
                }
                str5 = str14;
                if (!TextUtils.isEmpty(str5)) {
                    if (!strM64416.regionMatches(true, 0, str5, 0, str5.length())) {
                        strM5594 = C1679.m5594(str5, " ", strM64416);
                        strM64416 = strM5594;
                    }
                }
            }
            str5 = str4;
            if (!TextUtils.isEmpty(str5)) {
                if (!strM64416.regionMatches(true, 0, str5, 0, str5.length())) {
                    strM5594 = C1679.m5594(str5, " ", strM64416);
                    strM64416 = strM5594;
                }
            }
        }
        if (!TextUtils.isEmpty(strM64416) && !TextUtils.isEmpty(strM64414)) {
            return m6437(C1679.m5594(strM64416, " · ", strM64414));
        }
        if (TextUtils.isEmpty(strM64416)) {
            return !TextUtils.isEmpty(strM64414) ? m6437(strM64414) : m6437(c6238.f21169);
        }
        return m6437(strM64416);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m6429(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(jSONArray.size(), 8);
            for (int i = 0; i < iMin; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String strM6441 = m6441(jSONObject2.getString("brand"));
                    if (!TextUtils.isEmpty(strM6441)) {
                        m6441(jSONObject2.getString("version"));
                        arrayList.add(new C20350(strM6441));
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6425(List list) {
        String str;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM6441 = m6441(((C20350) it.next()).f65916);
                if (TextUtils.isEmpty(strM6441)) {
                    str = null;
                } else {
                    String lowerCase = strM6441.toLowerCase(Locale.ROOT);
                    if ((lowerCase.contains("not") && lowerCase.contains("brand")) || lowerCase.contains("chromium")) {
                        str = null;
                    } else if (lowerCase.contains("samsung internet")) {
                        str = "Samsung Internet";
                    } else if (lowerCase.contains("microsoft edge") || lowerCase.equals("edge")) {
                        str = "Edge";
                    } else if (lowerCase.contains("google chrome") || lowerCase.equals("chrome")) {
                        str = "Chrome";
                    } else if (lowerCase.contains("opera")) {
                        str = "Opera";
                    } else if (lowerCase.contains("firefox")) {
                        str = "Firefox";
                    } else if (lowerCase.contains("safari")) {
                        str = "Safari";
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String strM6442 = m6441(((C20350) it2.next()).f65916);
                if (TextUtils.isEmpty(strM6442)) {
                    strM6442 = null;
                } else {
                    String lowerCase2 = strM6442.toLowerCase(Locale.ROOT);
                    if ((lowerCase2.contains("not") && lowerCase2.contains("brand")) || lowerCase2.contains("chromium")) {
                        strM6442 = null;
                    }
                }
                if (!TextUtils.isEmpty(strM6442)) {
                    return strM6442;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m6441(String str) {
        if (str == null) {
            return "";
        }
        int iMin = Math.min(str.length(), 128);
        StringBuilder sb = new StringBuilder(iMin);
        boolean z = false;
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                if (Character.isWhitespace(cCharAt)) {
                    z = sb.length() > 0;
                } else {
                    if (z) {
                        sb.append(' ');
                        z = false;
                    }
                    sb.append(cCharAt);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m6449(String str) {
        String strReplace = m6441(str).replace('_', '.');
        while (strReplace.endsWith(".0")) {
            int i = 0;
            for (int i2 = 0; i2 < strReplace.length(); i2++) {
                if (strReplace.charAt(i2) == '.') {
                    i++;
                }
            }
            if (i <= 0) {
                break;
            }
            strReplace = C20630.m46498(2, 0, strReplace);
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6424(String str, String str2) {
        String strM6449 = m6449(str2);
        return TextUtils.isEmpty(strM6449) ? str : C1679.m5594(str, " ", strM6449);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6426(Pattern pattern, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m6437(String str) {
        String strM6441 = m6441(str);
        if (TextUtils.isEmpty(strM6441)) {
            return "Unknown browser";
        }
        return strM6441.length() > 64 ? strM6441.substring(0, 64) : strM6441;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6428(byte[] bArr) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(bArr), 11);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
