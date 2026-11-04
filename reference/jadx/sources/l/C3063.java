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
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۗ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3063 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long f9908;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final long f9910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final long f9912;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f9913;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f9914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f9916;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final long f9918;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f9919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f9920;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5345 f9921;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f9922;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f9923;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f9924;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f9925;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f9926;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f9927;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f9928 = new SecureRandom();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f9929;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f9930;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0342 f9931;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f9932;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f9909 = Pattern.compile("Android\\s+([0-9]+(?:\\.[0-9]+)*)", 2);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f9917 = Pattern.compile("Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)", 2);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f9911 = Pattern.compile("(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)", 2);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f9915 = Pattern.compile("\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f9913 = timeUnit.toMillis(1L);
        f9910 = TimeUnit.SECONDS.toMillis(30L);
        f9908 = timeUnit.toMillis(30L);
        f9914 = TimeUnit.HOURS.toMillis(2L);
        long millis = timeUnit.toMillis(5L);
        f9916 = millis;
        f9918 = millis * 2;
        f9912 = timeUnit.toMillis(10L);
    }

    public C3063(C5345 c5345, String str) {
        Object obj = new Object();
        this.f9929 = obj;
        this.f9926 = new HashMap();
        this.f9925 = new HashMap();
        this.f9923 = new HashMap();
        this.f9930 = new HashMap();
        this.f9920 = new HashMap();
        this.f9922 = str == null ? "" : str;
        this.f9921 = c5345;
        this.f9931 = new C0342(C21576.m49084());
        synchronized (obj) {
            if (!m9968()) {
                m9977(System.currentTimeMillis());
                m9962();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m9990() {
        LinkedHashMap linkedHashMap;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            if (!m9968()) {
                m9955(jCurrentTimeMillis);
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("authRequired", Boolean.TRUE);
            linkedHashMap.put("pairingAvailable", Boolean.valueOf(m9968() || (this.f9924 != null && jCurrentTimeMillis < this.f9919)));
            long jMax = 0;
            if (!m9968()) {
                jMax = Math.max(this.f9919 - jCurrentTimeMillis, 0L);
            }
            linkedHashMap.put("pairingExpiresInMs", Long.valueOf(jMax));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17233 m9984(C3767 c3767, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM9966 = m9966(c3767);
        synchronized (this.f9929) {
            try {
                C17233 c17233M9954 = m9954(jCurrentTimeMillis, strM9966);
                if (c17233M9954 != null) {
                    return c17233M9954;
                }
                try {
                    C16487 c16487M9967 = m9967(str);
                    if (TextUtils.isEmpty(c16487M9967.f53454) || c16487M9967.f53455 == null) {
                        m9964(jCurrentTimeMillis, strM9966);
                        return C17233.m40473(R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f9929) {
                        try {
                            m9955(jCurrentTimeMillis);
                            if (!m9975(jCurrentTimeMillis, c16487M9967.f53454)) {
                                m9978(jCurrentTimeMillis, strM9966);
                                return C17233.m40472();
                            }
                            try {
                                C15741 c15741M9953 = m9953(c16487M9967.f53455);
                                synchronized (this.f9929) {
                                    try {
                                        m9955(jCurrentTimeMillis);
                                        if (!m9975(jCurrentTimeMillis, c16487M9967.f53454)) {
                                            m9978(jCurrentTimeMillis, strM9966);
                                            return C17233.m40472();
                                        }
                                        this.f9923.remove(strM9966);
                                        m9958(c15741M9953, m9950(c3767, c16487M9967), c16487M9967.f53453, jCurrentTimeMillis, c3767);
                                        if (!m9968()) {
                                            m9977(jCurrentTimeMillis);
                                            m9962();
                                        }
                                        return C17233.m40474(c15741M9953.f51184);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Exception unused) {
                                m9964(jCurrentTimeMillis, strM9966);
                                return C17233.m40473(R.string.MT_Protector, new Object[0]);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (C14489 unused2) {
                    m9964(jCurrentTimeMillis, strM9966);
                    return C17233.m40473(R.string.MT_Protector, new Object[0]);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17233 m9995(C3767 c3767) {
        C17233 c17233M9954;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            c17233M9954 = m9954(jCurrentTimeMillis, m9966(c3767));
        }
        return c17233M9954;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9989(C3767 c3767) {
        m9964(System.currentTimeMillis(), m9966(c3767));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14995 m9987(C3767 c3767) {
        boolean zEquals;
        String strM53547 = C23991.m53547(c3767, "ticket");
        if (!TextUtils.isEmpty(strM53547)) {
            if (!EnumC12716.GET.equals(c3767.m12226()) && !EnumC12716.HEAD.equals(c3767.m12226())) {
                return C14995.m36102(EnumC21667.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
            }
            if (C23991.m53543(c3767)) {
                return C14995.m36102(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM53548 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
            String strM53549 = C23991.m53547(c3767, "disposition");
            synchronized (this.f9929) {
                m9963(jCurrentTimeMillis);
                C1170.removeIf(this.f9930.entrySet(), new C9290(jCurrentTimeMillis));
                C1572 c1572 = (C1572) this.f9930.get(strM53547);
                if (c1572 != null && c1572.f5458 > jCurrentTimeMillis) {
                    String str = c1572.f5460;
                    boolean zEquals2 = true;
                    if (str == null) {
                        zEquals = strM53548 == null;
                    } else {
                        zEquals = str.equals(strM53548);
                    }
                    if (zEquals) {
                        String str2 = c1572.f5459;
                        if (str2 != null) {
                            zEquals2 = str2.equals(strM53549);
                        } else if (strM53549 != null) {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            C18241 c18241M9976 = m9976(c1572.f5457);
                            if (c18241M9976 != null) {
                                if (!c18241M9976.f59548) {
                                    m9956(c1572.f5457, jCurrentTimeMillis, c3767, false);
                                }
                                return C14995.m36101(new C19471(c1572.f5457, null, null));
                            }
                            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                    }
                    return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
        }
        return m9983(c3767);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14995 m9991(C3767 c3767) {
        String strM53547 = C23991.m53547(c3767, "ticket");
        if (!EnumC12716.GET.equals(c3767.m12226())) {
            return C14995.m36102(EnumC21667.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        if (C23991.m53543(c3767)) {
            return C14995.m36102(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        if (TextUtils.isEmpty(strM53547)) {
            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            m9963(jCurrentTimeMillis);
            C1170.removeIf(this.f9920.entrySet(), new C13765(jCurrentTimeMillis));
            C22455 c22455 = (C22455) this.f9920.get(strM53547);
            if (c22455 == null) {
                return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (c22455.f72672 <= jCurrentTimeMillis) {
                return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            C18241 c18241M9976 = m9976(c22455.f72673);
            if (c18241M9976 == null) {
                return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (!c18241M9976.f59548) {
                m9956(c22455.f72673, jCurrentTimeMillis, c3767, false);
            }
            return C14995.m36101(new C19471(c22455.f72673, strM53547, c22455.f72671));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m9980(C19471 c19471) {
        C18241 c18241M9976;
        if (c19471 == null) {
            c18241M9976 = null;
        } else {
            String str = c19471.f62902;
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f9929) {
                m9963(jCurrentTimeMillis);
                c18241M9976 = m9976(str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticated", Boolean.valueOf(c18241M9976 != null));
        if (c18241M9976 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("deviceId", c18241M9976.f59545);
            linkedHashMap2.put("deviceName", c18241M9976.f59551);
            linkedHashMap2.put("firstAccessAt", Long.valueOf(c18241M9976.f59547));
            linkedHashMap2.put("lastAccessAt", Long.valueOf(c18241M9976.f59552));
            linkedHashMap2.put("lastIp", c18241M9976.f59550);
            linkedHashMap2.put("userAgent", c18241M9976.f59546);
            linkedHashMap2.put("temporary", Boolean.valueOf(c18241M9976.f59548));
            linkedHashMap.put(e.p, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9979() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            m9963(jCurrentTimeMillis);
            arrayList = new ArrayList();
            Iterator it = this.f9931.m2078().iterator();
            while (it.hasNext()) {
                arrayList.add(C0342.m2074((C18241) it.next()));
            }
            Iterator it2 = this.f9926.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(C0342.m2074((C18241) it2.next()));
            }
            C0342.m2077(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9993(C19471 c19471, String str) {
        boolean zRemoveIf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            m9963(jCurrentTimeMillis);
            C0342 c0342 = this.f9931;
            ArrayList arrayListM2078 = c0342.m2078();
            zRemoveIf = C1170.removeIf(arrayListM2078, new C4555(str));
            if (zRemoveIf) {
                c0342.m2079(arrayListM2078);
            }
            if (c19471 != null && str.equals(c19471.f62902)) {
                zRemoveIf = this.f9926.remove(str) != null || zRemoveIf;
            }
            if (zRemoveIf) {
                m9965(str);
            }
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9985(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            m9963(jCurrentTimeMillis);
            C0342 c0342 = this.f9931;
            ArrayList arrayListM2078 = c0342.m2078();
            boolean zRemoveIf = C1170.removeIf(arrayListM2078, new C4555(str));
            if (zRemoveIf) {
                c0342.m2079(arrayListM2078);
            }
            z = this.f9926.remove(str) != null || zRemoveIf;
            if (z) {
                m9965(str);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C16487 m9967(String str) {
        String strM9960;
        String strM9961;
        String strM9962;
        JSONObject jSONObjectM48360 = C21203.m48360(str);
        C16487 c16487 = new C16487();
        c16487.f53454 = C21203.m48367(jSONObjectM48360, "code");
        c16487.f53452 = C21203.m48367(jSONObjectM48360, "deviceName");
        C5301 c5301 = null;
        Boolean booleanObject = null;
        c5301 = null;
        try {
            JSONObject jSONObject = jSONObjectM48360.getJSONObject("clientHints");
            if (jSONObject != null) {
                C5301 c5302 = new C5301();
                List list = Collections.EMPTY_LIST;
                c5302.f18667 = list;
                c5302.f18671 = list;
                try {
                    strM9960 = m9960(jSONObject.getString("platform"));
                } catch (RuntimeException unused) {
                    strM9960 = null;
                }
                c5302.f18670 = strM9960;
                try {
                    strM9961 = m9960(jSONObject.getString("platformVersion"));
                } catch (RuntimeException unused2) {
                    strM9961 = null;
                }
                c5302.f18669 = strM9961;
                try {
                    strM9962 = m9960(jSONObject.getString("model"));
                } catch (RuntimeException unused3) {
                    strM9962 = null;
                }
                c5302.f18672 = strM9962;
                try {
                    booleanObject = jSONObject.getBooleanObject("mobile");
                } catch (RuntimeException unused4) {
                }
                c5302.f18668 = booleanObject;
                c5302.f18667 = m9952(jSONObject, "brands");
                c5302.f18671 = m9952(jSONObject, "fullVersionList");
                c5301 = c5302;
            }
        } catch (RuntimeException unused5) {
        }
        c16487.f53451 = c5301;
        try {
            c16487.f53455 = jSONObjectM48360.getJSONObject("publicKey");
            c16487.f53453 = C21203.m48366(jSONObjectM48360, "trust");
            return c16487;
        } catch (RuntimeException e) {
            throw C21203.m48365(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m9981(C19471 c19471, String str) {
        C11266 c11266;
        try {
            JSONObject jSONObjectM48360 = C21203.m48360(str);
            c11266 = new C11266();
            c11266.f35562 = C21203.m48367(jSONObjectM48360, MotionUtils.EASING_TYPE_PATH);
            c11266.f35561 = C21203.m48367(jSONObjectM48360, "disposition");
        } catch (C14489 unused) {
            c11266 = null;
        }
        if (c11266 == null || TextUtils.isEmpty(c11266.f35562) || !("inline".equals(c11266.f35561) || "attachment".equals(c11266.f35561))) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f9928.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C1572 c1572 = new C1572(0);
        c1572.f5457 = c19471.f62902;
        c1572.f5460 = c11266.f35562;
        c1572.f5459 = c11266.f35561;
        c1572.f5458 = f9912 + jCurrentTimeMillis;
        synchronized (this.f9929) {
            C1170.removeIf(this.f9930.entrySet(), new C9290(jCurrentTimeMillis));
            this.f9930.put(strEncodeToString, c1572);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c1572.f5458));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m9982(C19471 c19471, C10520 c10520) {
        if (c19471 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f9928.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C22455 c22455 = new C22455(0);
        c22455.f72673 = c19471.f62902;
        c22455.f72671 = c10520;
        c22455.f72672 = f9912 + jCurrentTimeMillis;
        synchronized (this.f9929) {
            C1170.removeIf(this.f9920.entrySet(), new C13765(jCurrentTimeMillis));
            this.f9920.put(strEncodeToString, c22455);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c22455.f72672));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9988() {
        synchronized (this.f9929) {
            ScheduledFuture scheduledFuture = this.f9932;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f9932 = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.f9927;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f9927 = null;
            }
            this.f9930.clear();
            this.f9920.clear();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m9986() {
        synchronized (this.f9929) {
            if (m9968()) {
                return null;
            }
            m9955(System.currentTimeMillis());
            return this.f9924;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m9994() {
        synchronized (this.f9929) {
            if (m9968()) {
                return 0L;
            }
            m9955(System.currentTimeMillis());
            return this.f9919;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m9969() {
        return f9913;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14995 m9983(C3767 c3767) {
        String strM12228;
        boolean zVerify;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM53541 = C23991.m53541(c3767, "X-MT-Auth-Device");
        String strM53542 = C23991.m53541(c3767, "X-MT-Auth-Timestamp");
        String strM53543 = C23991.m53541(c3767, "X-MT-Auth-Nonce");
        String strM53544 = C23991.m53541(c3767, "X-MT-Auth-Content-SHA256");
        String strM53545 = C23991.m53541(c3767, "X-MT-Auth-Signature");
        boolean zEquals = false;
        if (TextUtils.isEmpty(strM53541) || TextUtils.isEmpty(strM53542) || TextUtils.isEmpty(strM53543) || TextUtils.isEmpty(strM53544) || TextUtils.isEmpty(strM53545)) {
            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        try {
            if (Math.abs(jCurrentTimeMillis - Long.parseLong(strM53542)) > f9916) {
                return C14995.m36100();
            }
            synchronized (this.f9929) {
                m9963(jCurrentTimeMillis);
                m9974(jCurrentTimeMillis);
                C18241 c18241M9976 = m9976(strM53541);
                if (c18241M9976 == null) {
                    return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                Map map = (Map) this.f9925.get(strM53541);
                if (map != null && map.containsKey(strM53543)) {
                    return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                StringBuilder sb = new StringBuilder("MT-REMOTE-AUTH-v1\n");
                sb.append(c3767.m12226().name());
                sb.append("\n");
                String strM12225 = c3767.m12225();
                if (TextUtils.isEmpty(strM12225)) {
                    strM12228 = c3767.m12228();
                } else {
                    strM12228 = c3767.m12228() + "?" + strM12225;
                }
                C4794.m14774(sb, strM12228, "\n", strM53542, "\n");
                String strM31438 = C12669.m31438(sb, strM53543, "\n", strM53544);
                try {
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(m9953(C21203.m48360(c18241M9976.f59549)).f51183);
                    signature.update(strM31438.getBytes(StandardCharsets.UTF_8));
                    zVerify = signature.verify(Base64.decode(strM53545, 11));
                } catch (Exception unused) {
                    zVerify = false;
                }
                if (!zVerify) {
                    return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                try {
                    if (!strM53544.equals(m9946(c3767))) {
                        return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f9929) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m9963(jCurrentTimeMillis2);
                        m9974(jCurrentTimeMillis2);
                        if (m9976(strM53541) == null) {
                            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        Map map2 = (Map) this.f9925.get(strM53541);
                        if (map2 != null && map2.containsKey(strM53543)) {
                            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        HashMap map3 = this.f9925;
                        Map map4 = (Map) map3.get(strM53541);
                        if (map4 == null) {
                            map4 = new HashMap();
                            map3.put(strM53541, map4);
                        }
                        map4.put(strM53543, Long.valueOf(jCurrentTimeMillis2));
                        if (EnumC12716.DELETE.equals(c3767.m12226()) && "/api/auth/devices".equals(c3767.m12228())) {
                            zEquals = strM53541.equals(C23991.m53547(c3767, "deviceId"));
                        }
                        if (!zEquals) {
                            m9956(strM53541, jCurrentTimeMillis2, c3767, true);
                        }
                        return C14995.m36101(new C19471(strM53541, null, null));
                    }
                } catch (C23201 e) {
                    return C14995.m36102(e.f75184, e.f75185, e.f75183);
                } catch (Exception unused2) {
                    return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
            }
        } catch (NumberFormatException unused3) {
            return C14995.m36102(EnumC21667.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9992(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9929) {
            m9963(jCurrentTimeMillis);
            C1170.removeIf(this.f9920.entrySet(), new C13765(jCurrentTimeMillis));
            C22455 c22455 = (C22455) this.f9920.get(str);
            if (c22455 == null) {
                return false;
            }
            if (c22455.f72672 <= jCurrentTimeMillis) {
                return false;
            }
            return m9976(c22455.f72673) != null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if ("/api/file-upload-complete".equals(r0) == false) goto L56;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m9946(l.C3767 r9) throws l.C23201 {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3063.m9946(l.ۗ᩻ܳ):java.lang.String");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m9970(C3767 c3767) throws C23201 {
        if (!C23991.m53544(c3767)) {
            return 0L;
        }
        if (C23991.m53548(c3767)) {
            throw new C23201(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        String strM53541 = C23991.m53541(c3767, "content-length");
        if (TextUtils.isEmpty(strM53541)) {
            return -1L;
        }
        String strTrim = strM53541.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C23201(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C23201(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C23201(EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15741 m9953(JSONObject jSONObject) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        String strM9973 = m9973(jSONObject, "kty");
        String strM9974 = m9973(jSONObject, "crv");
        String strM9975 = m9973(jSONObject, "x");
        String strM9976 = m9973(jSONObject, "y");
        if (!"EC".equals(strM9973) || !"P-256".equals(strM9974) || strM9975.contains("=") || strM9976.contains("=")) {
            throw new IllegalArgumentException("unsupported key");
        }
        byte[] bArrDecode = Base64.decode(strM9975, 11);
        byte[] bArrDecode2 = Base64.decode(strM9976, 11);
        if (bArrDecode.length != 32 || bArrDecode2.length != 32) {
            throw new IllegalArgumentException("invalid coordinate length");
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrDecode), new BigInteger(1, bArrDecode2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        if (!(publicKeyGeneratePublic instanceof ECPublicKey)) {
            throw new IllegalArgumentException("invalid key");
        }
        StringBuilder sbM10406 = C3188.m10406("{\"crv\":\"", strM9974, "\",\"kty\":\"", strM9973, "\",\"x\":\"");
        sbM10406.append(strM9975);
        sbM10406.append("\",\"y\":\"");
        sbM10406.append(strM9976);
        sbM10406.append("\"}");
        String string = sbM10406.toString();
        return new C15741(string, m9951(string.getBytes(StandardCharsets.UTF_8)), (ECPublicKey) publicKeyGeneratePublic);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m9973(JSONObject jSONObject, String str) {
        String strM48367 = jSONObject == null ? null : C21203.m48367(jSONObject, str);
        if (TextUtils.isEmpty(strM48367)) {
            throw new IllegalArgumentException("missing ".concat(str));
        }
        return strM48367;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9958(final C15741 c15741, String str, boolean z, long j, C3767 c3767) {
        C18241 c18241;
        long j2;
        String str2 = c15741.f51184;
        C0342 c0342 = this.f9931;
        ArrayList arrayListM2078 = c0342.m2078();
        Iterator it = arrayListM2078.iterator();
        do {
            if (!it.hasNext()) {
                c18241 = null;
                break;
            }
            c18241 = (C18241) it.next();
        } while (!str2.equals(c18241.f59545));
        C1170.removeIf(arrayListM2078, new Predicate() { // from class: l.֨ۢۧ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c15741.f51184.equals(((C18241) obj).f59545);
            }
        });
        HashMap map = this.f9926;
        map.remove(str2);
        C18241 c18242 = c18241 == null ? new C18241() : c18241;
        c18242.f59545 = str2;
        c18242.f59551 = str;
        c18242.f59549 = c15741.f51182;
        if (c18241 != null) {
            j2 = c18241.f59547;
            if (j2 <= 0) {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        c18242.f59547 = j2;
        c18242.f59552 = j;
        c18242.f59550 = m9966(c3767);
        c18242.f59546 = m9961(c3767);
        c18242.f59548 = !z;
        if (z) {
            arrayListM2078.add(c18242);
            C12884.sort(arrayListM2078, C2661.comparingLong(new C21709()));
            while (arrayListM2078.size() > 32) {
                arrayListM2078.remove(0);
            }
            c0342.m2079(arrayListM2078);
            return;
        }
        map.put(c18242.f59545, c18242);
        c0342.m2079(arrayListM2078);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9956(String str, long j, C3767 c3767, boolean z) {
        C18241 c18241 = (C18241) this.f9926.get(str);
        if (c18241 != null && z) {
            c18241.f59552 = j;
            c18241.f59550 = m9966(c3767);
            c18241.f59546 = m9961(c3767);
            return;
        }
        C0342 c0342 = this.f9931;
        ArrayList<C18241> arrayListM2078 = c0342.m2078();
        for (C18241 c18242 : arrayListM2078) {
            if (str.equals(c18242.f59545)) {
                c18242.f59552 = j;
                c18242.f59550 = m9966(c3767);
                c18242.f59546 = m9961(c3767);
                c0342.m2079(arrayListM2078);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9965(final String str) {
        this.f9925.remove(str);
        C1170.removeIf(this.f9930.entrySet(), new Predicate() { // from class: l.۠ۢۧ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C1572) ((Map.Entry) obj).getValue()).f5457);
            }
        });
        C1170.removeIf(this.f9920.entrySet(), new Predicate() { // from class: l.ۜۢۧ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C22455) ((Map.Entry) obj).getValue()).f72673);
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C18241 m9976(String str) {
        for (C18241 c18241 : this.f9931.m2078()) {
            if (str.equals(c18241.f59545)) {
                return c18241;
            }
        }
        return (C18241) this.f9926.get(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9963(long j) {
        Iterator it = this.f9926.entrySet().iterator();
        while (it.hasNext()) {
            C18241 c18241 = (C18241) ((Map.Entry) it.next()).getValue();
            if (j - c18241.f59552 > f9908 || j - c18241.f59547 > f9914) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9974(final long j) {
        Iterator it = this.f9925.entrySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map.Entry) it.next()).getValue();
            C1170.removeIf(map.entrySet(), new Predicate() { // from class: l.ۖۢۧ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C3063.m9959(j, (Map.Entry) obj);
                }
            });
            if (map.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m9959(long j, Map.Entry entry) {
        return j - ((Long) entry.getValue()).longValue() > f9918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9955(long j) {
        if (m9968()) {
            return;
        }
        if (this.f9924 == null || j >= this.f9919) {
            m9977(j);
            m9962();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9975(long j, String str) {
        if (m9968()) {
            return this.f9922.equals(str);
        }
        String str2 = this.f9924;
        return str2 != null && j < this.f9919 && str2.equals(str);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m9968() {
        return !TextUtils.isEmpty(this.f9922);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m9977(long j) {
        String str = String.format(Locale.ROOT, "%06d", Integer.valueOf(this.f9928.nextInt(BasicLabelFormatter.MILLION)));
        this.f9924 = str;
        long j2 = j + f9913;
        this.f9919 = j2;
        C5345 c5345 = this.f9921;
        if (c5345 != null) {
            C16531 c16531 = c5345.f18779;
            ServiceC3107 serviceC3107 = (ServiceC3107) c5345.f18780.f56273;
            int i = ServiceC3107.f10060;
            C21576.m49068(new RunnableC23245(serviceC3107, c16531, str, j2));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9962() {
        if (this.f9927 == null) {
            this.f9927 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18987());
        }
        ScheduledFuture scheduledFuture = this.f9932;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9932 = this.f9927.schedule(new Runnable() { // from class: l.ۢۢۧ
            @Override // java.lang.Runnable
            public final void run() {
                C3063.m9957(this.f32168);
            }
        }, Math.max(this.f9919 - System.currentTimeMillis(), 1L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9957(C3063 c3063) {
        synchronized (c3063.f9929) {
            c3063.m9977(System.currentTimeMillis());
            c3063.m9962();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9964(long j, String str) {
        synchronized (this.f9929) {
            m9978(j, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m9978(long j, String str) {
        HashMap map = this.f9923;
        C24693 c24693 = (C24693) map.get(str);
        if (c24693 != null) {
            long j2 = c24693.f79907;
            if (j2 > 0 && j >= j2) {
                c24693 = new C24693(0);
                map.put(str, c24693);
            }
        } else {
            c24693 = new C24693(0);
            map.put(str, c24693);
        }
        int i = c24693.f79908 + 1;
        c24693.f79908 = i;
        if (i >= 5) {
            c24693.f79907 = j + f9910;
            c24693.f79908 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17233 m9954(long j, String str) {
        C24693 c24693 = (C24693) this.f9923.get(str);
        if (c24693 == null || c24693.f79907 <= j) {
            return null;
        }
        m9978(j, str);
        return C17233.m40473(R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m9966(C3767 c3767) {
        String strM12233 = c3767.m12233();
        return TextUtils.isEmpty(strM12233) ? "" : strM12233;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m9961(C3767 c3767) {
        String strM53541 = C23991.m53541(c3767, "user-agent");
        if (strM53541 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(strM53541.length(), 1024));
        for (int i = 0; i < strM53541.length(); i++) {
            char cCharAt = strM53541.charAt(i);
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
    public static String m9950(C3767 c3767, C16487 c16487) {
        String str;
        String strM9947;
        int i;
        String strM9948;
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
        String strM53541 = C23991.m53541(c3767, "user-agent");
        C5301 c5301 = c16487.f53451;
        String strM53542 = C23991.m53541(c3767, "sec-ch-ua");
        String strM9949 = m9948(c5301 == null ? null : c5301.f18671);
        if (TextUtils.isEmpty(strM9949)) {
            strM9949 = m9948(c5301 == null ? null : c5301.f18667);
        }
        if (TextUtils.isEmpty(strM9949)) {
            if (TextUtils.isEmpty(strM53542)) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f9915.matcher(strM53542);
                while (matcher.find() && arrayList.size() < 8) {
                    String strM9960 = m9960(matcher.group(1));
                    m9960(matcher.group(2));
                    arrayList.add(new C12758(strM9960));
                }
                list = arrayList;
            }
            strM9949 = m9948(list);
        }
        if (TextUtils.isEmpty(strM9949)) {
            if (TextUtils.isEmpty(strM53541)) {
                strM9949 = null;
            } else if (strM53541.contains("SamsungBrowser/")) {
                strM9949 = "Samsung Internet";
            } else if (strM53541.contains("Edg/") || strM53541.contains("EdgA/") || strM53541.contains("EdgiOS/")) {
                strM9949 = "Edge";
            } else if (strM53541.contains("OPR/") || strM53541.contains("Opera/")) {
                strM9949 = "Opera";
            } else if (strM53541.contains("FxiOS/") || strM53541.contains("Firefox/")) {
                strM9949 = "Firefox";
            } else if (strM53541.contains("CriOS/") || strM53541.contains("Chrome/")) {
                strM9949 = "Chrome";
            } else if (strM53541.contains("Safari/") && strM53541.contains("Version/")) {
                strM9949 = "Safari";
            } else {
                strM9949 = null;
            }
        }
        String strM53543 = C23991.m53541(c3767, "sec-ch-ua-platform");
        String str6 = c5301 == null ? null : c5301.f18670;
        String strM9961 = m9960(strM53543);
        if (strM9961.length() >= 2 && strM9961.startsWith("\"") && strM9961.endsWith("\"")) {
            strM9961 = C1402.m5124(1, 1, strM9961);
        }
        String strM9962 = m9960(str6);
        if (TextUtils.isEmpty(strM9962)) {
            strM9962 = m9960(strM9961);
        }
        String str7 = c5301 == null ? null : c5301.f18669;
        String strM9963 = m9960(strM9962);
        if (TextUtils.isEmpty(strM9963)) {
            strM9947 = null;
            str = strM9949;
        } else {
            String lowerCase = strM9963.toLowerCase(Locale.ROOT);
            str = strM9949;
            if (lowerCase.contains("android")) {
                strM9947 = m9947(AnalyticsConstants.SDK_TYPE, m9971(str7));
            } else if (lowerCase.contains("ios")) {
                strM9947 = m9947("iOS", m9971(str7));
            } else if (lowerCase.contains(g.a)) {
                strM9947 = m9947("macOS", m9971(str7));
            } else if (lowerCase.contains("windows")) {
                String strM9964 = m9960(str7);
                int i4 = 0;
                while (i4 < strM9964.length() && Character.isDigit(strM9964.charAt(i4))) {
                    i4++;
                }
                if (i4 == 0) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(strM9964.substring(0, i4));
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                }
                if (i >= 13) {
                    strM9947 = "Windows 11";
                } else {
                    strM9947 = i > 0 ? "Windows 10" : null;
                }
                if (TextUtils.isEmpty(strM9947)) {
                    strM9947 = "Windows";
                }
            } else {
                strM9947 = lowerCase.contains("chrome os") ? m9947("ChromeOS", m9971(str7)) : m9947(strM9963, m9971(str7));
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM9947);
        String str8 = strM9947;
        Pattern pattern = f9917;
        String str9 = "iPhone";
        String strM46451 = "";
        if (!zIsEmpty) {
            strM9948 = str8;
        } else if (TextUtils.isEmpty(strM53541)) {
            strM9948 = null;
        } else if (strM53541.contains("iPhone") || strM53541.contains("iPad")) {
            String str10 = strM53541.contains("iPad") ? "iPadOS" : "iOS";
            String strM9971 = m9971(m9949(f9911, strM53541));
            if (strM9971.startsWith("18.6")) {
                int iIndexOf = strM53541.indexOf("Version/");
                if (iIndexOf < 0) {
                    i2 = -1;
                } else {
                    int i5 = iIndexOf + 8;
                    int i6 = i5;
                    while (i6 < strM53541.length() && Character.isDigit(strM53541.charAt(i6))) {
                        i6++;
                    }
                    if (i6 == i5) {
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(strM53541.substring(i5, i6));
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
                strM9971 = "";
            }
            strM9948 = m9947(str10, strM9971);
        } else {
            String strM99410 = m9949(f9909, strM53541);
            if (!TextUtils.isEmpty(strM99410)) {
                String strM9972 = m9971(strM99410);
                if (!"10".equals(strM9972) || (!strM53541.contains("Chrome/") && !strM53541.contains("EdgA/") && !strM53541.contains("OPR/") && !strM53541.contains("SamsungBrowser/"))) {
                    str2 = strM9972;
                    break;
                }
                String strM99411 = m9949(pattern, strM53541);
                if (!TextUtils.isEmpty(strM99411)) {
                    String[] strArrSplit = strM99411.split(l.b);
                    int length = strArrSplit.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            str2 = strM9972;
                            break;
                        }
                        String strM9965 = m9960(strArrSplit[i7]);
                        int iIndexOf2 = strM9965.indexOf(" Build/");
                        String str11 = strM9972;
                        if (iIndexOf2 >= 0) {
                            strM9965 = strM9965.substring(0, iIndexOf2);
                        }
                        if ("k".equals(m9960(strM9965).toLowerCase(Locale.ROOT))) {
                            str2 = "";
                            break;
                        }
                        i7++;
                        strM9972 = str11;
                    }
                } else {
                    str2 = strM9972;
                    break;
                }
                strM9948 = m9947(AnalyticsConstants.SDK_TYPE, str2);
            } else if (strM53541.contains("Mac OS X") || strM53541.contains("Macintosh")) {
                strM9948 = "macOS";
            } else if (strM53541.contains("Windows NT")) {
                strM9948 = "Windows";
            } else if (strM53541.contains("CrOS")) {
                strM9948 = "ChromeOS";
            } else {
                strM9948 = "Linux";
                if (!strM53541.contains("Linux")) {
                    strM9948 = null;
                }
            }
        }
        String strM53544 = C23991.m53541(c3767, "sec-ch-ua-mobile");
        if (c5301 == null || (bool = c5301.f18668) == null) {
            String strM9966 = m9960(strM53544);
            if ("?1".equals(strM9966)) {
                bool = Boolean.TRUE;
            } else {
                bool = "?0".equals(strM9966) ? Boolean.FALSE : null;
            }
        }
        String strM9967 = m9960(c5301 == null ? null : c5301.f18672);
        if (!TextUtils.isEmpty(strM9967)) {
            str9 = strM9967;
        } else if (TextUtils.isEmpty(strM53541)) {
            if (Boolean.TRUE.equals(bool) || TextUtils.isEmpty(strM9948) || !strM9948.startsWith("iOS")) {
                str9 = null;
            }
        } else if (strM53541.contains("iPad")) {
            str9 = "iPad";
        } else if (!strM53541.contains("iPhone")) {
            String strM99412 = m9949(pattern, strM53541);
            if (!TextUtils.isEmpty(strM99412)) {
                String[] strArrSplit2 = strM99412.split(l.b);
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
                    String strM9968 = m9960(str12);
                    int iIndexOf3 = strM9968.indexOf(" Build/");
                    if (iIndexOf3 >= 0) {
                        strM9968 = strM9968.substring(0, iIndexOf3);
                    }
                    String strM9969 = m9960(strM9968);
                    String strM99610 = m9960(strM9969);
                    if (!TextUtils.isEmpty(strM99610)) {
                        String lowerCase2 = strM99610.toLowerCase(Locale.ROOT);
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
                            if (!TextUtils.isEmpty(strM9969) && str12.contains("Build/")) {
                                str3 = strM9969;
                                break;
                            }
                            str3 = strM9969;
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
        String strM99611 = m9960(str);
        String strM99612 = m9960(strM9948);
        if (!TextUtils.isEmpty(strM99611) && !TextUtils.isEmpty(strM99612)) {
            strM99611 = C20196.m46451(strM99611, " on ", strM99612);
        } else if (TextUtils.isEmpty(strM99611)) {
            strM99611 = TextUtils.isEmpty(strM99612) ? "" : strM99612;
        }
        String strM99613 = m9960(str9);
        if (TextUtils.isEmpty(strM99613)) {
            strM99613 = strM46451;
        } else {
            String upperCase = strM99613.toUpperCase(Locale.ROOT);
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
                    if (!strM99613.regionMatches(true, 0, str5, 0, str5.length())) {
                        strM46451 = C20196.m46451(str5, " ", strM99613);
                        strM99613 = strM46451;
                    }
                }
            }
            str5 = str4;
            if (!TextUtils.isEmpty(str5)) {
                if (!strM99613.regionMatches(true, 0, str5, 0, str5.length())) {
                    strM46451 = C20196.m46451(str5, " ", strM99613);
                    strM99613 = strM46451;
                }
            }
        }
        if (!TextUtils.isEmpty(strM99613) && !TextUtils.isEmpty(strM99611)) {
            return m9972(C20196.m46451(strM99613, " · ", strM99611));
        }
        if (TextUtils.isEmpty(strM99613)) {
            return !TextUtils.isEmpty(strM99611) ? m9972(strM99611) : m9972(c16487.f53452);
        }
        return m9972(strM99613);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m9952(JSONObject jSONObject, String str) {
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
                    String strM9960 = m9960(jSONObject2.getString("brand"));
                    if (!TextUtils.isEmpty(strM9960)) {
                        m9960(jSONObject2.getString("version"));
                        arrayList.add(new C12758(strM9960));
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
    public static String m9948(List list) {
        String str;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM9960 = m9960(((C12758) it.next()).f40833);
                if (TextUtils.isEmpty(strM9960)) {
                    str = null;
                } else {
                    String lowerCase = strM9960.toLowerCase(Locale.ROOT);
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
                String strM9961 = m9960(((C12758) it2.next()).f40833);
                if (TextUtils.isEmpty(strM9961)) {
                    strM9961 = null;
                } else {
                    String lowerCase2 = strM9961.toLowerCase(Locale.ROOT);
                    if ((lowerCase2.contains("not") && lowerCase2.contains("brand")) || lowerCase2.contains("chromium")) {
                        strM9961 = null;
                    }
                }
                if (!TextUtils.isEmpty(strM9961)) {
                    return strM9961;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m9960(String str) {
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m9971(String str) {
        String strReplace = m9960(str).replace('_', '.');
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
            strReplace = C1402.m5124(2, 0, strReplace);
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9947(String str, String str2) {
        String strM9971 = m9971(str2);
        return TextUtils.isEmpty(strM9971) ? str : C20196.m46451(str, " ", strM9971);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9949(Pattern pattern, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m9972(String str) {
        String strM9960 = m9960(str);
        if (TextUtils.isEmpty(strM9960)) {
            return "Unknown browser";
        }
        return strM9960.length() > 64 ? strM9960.substring(0, 64) : strM9960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9951(byte[] bArr) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(bArr), 11);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
