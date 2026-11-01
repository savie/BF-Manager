package com.amazonaws.metrics;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l.C0561;

/* JADX INFO: loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String f237 = "cloudwatchRegion";

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f238 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f239 = "com.amazonaws.management:type=AwsSdkMetrics";

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final String f240 = "useSingleMetricNamespace";

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f241 = "metricQueueSize";

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f242 = null;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String f243 = "getQueuePollTimeoutMilli";

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f244 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String f245 = "excludeMachineMetrics";

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f246 = false;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static volatile Regions f247 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String f248 = "metricNameSpace";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f249 = "hostMetricName";

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final MetricRegistry f250;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String f251 = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f252 = null;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final int f253 = 1000;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f254 = "jvmMetricName";

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f255 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f257;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f258 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f259 = false;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static volatile Long f260 = null;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f261 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f262 = "credentialFile";

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static volatile Integer f263 = null;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static volatile AWSCredentialsProvider f264 = null;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static volatile MetricCollector f265 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String f266 = "includePerHostMetrics";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m335() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m309(AWSCredentialsProvider aWSCredentialsProvider) {
        f264 = aWSCredentialsProvider;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m310(MetricCollector metricCollector) {
        f265 = metricCollector;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m331() {
        if (f265 != null) {
            f265.getClass();
        }
        if (f238) {
            throw new IllegalStateException("Reentrancy is not allowed");
        }
        f238 = true;
        try {
            try {
                MetricCollector factory = ((MetricCollector.Factory) Class.forName(f251).newInstance()).getInstance();
                if (factory != null) {
                    m310(factory);
                    f238 = false;
                    return true;
                }
            } catch (Exception e) {
                LogFactory.m302(AwsSdkMetrics.class).mo297("Failed to enable the default metrics", e);
            }
            f238 = false;
            return false;
        } catch (Throwable th) {
            f238 = false;
            throw th;
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        f257 = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String strTrim = str.trim();
                if (!z2 && f245.equals(strTrim)) {
                    z2 = true;
                } else if (!z3 && f266.equals(strTrim)) {
                    z3 = true;
                } else if (z4 || !f240.equals(strTrim)) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String strTrim3 = strArrSplit[1].trim();
                        try {
                            if (f262.equals(strTrim2)) {
                                m328(strTrim3);
                            } else if (f237.equals(strTrim2)) {
                                f247 = Regions.m426(strTrim3);
                            } else if (f241.equals(strTrim2)) {
                                Integer num = new Integer(strTrim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                f263 = num;
                            } else if (f243.equals(strTrim2)) {
                                Long l2 = new Long(strTrim3);
                                if (l2.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                f260 = l2;
                            } else if (f248.equals(strTrim2)) {
                                f255 = strTrim3;
                            } else if (f254.equals(strTrim2)) {
                                f242 = strTrim3;
                            } else if (f249.equals(strTrim2)) {
                                f252 = strTrim3;
                            } else {
                                LogFactory.m302(AwsSdkMetrics.class).mo298("Ignoring unrecognized parameter: " + strTrim);
                            }
                        } catch (Exception e) {
                            LogFactory.m302(AwsSdkMetrics.class).mo293("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            f246 = z2;
            f259 = z3;
            f261 = z4;
        }
        f250 = new MetricRegistry();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static RequestMetricCollector m340() {
        if (f265 == null && m339()) {
            m331();
        }
        if (f265 == null) {
            return RequestMetricCollector.f275;
        }
        ((MetricCollector.AnonymousClass1) f265).getClass();
        return RequestMetricCollector.f275;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static ServiceMetricCollector m334() {
        if (f265 == null && m339()) {
            m331();
        }
        if (f265 == null) {
            return ServiceMetricCollector.f276;
        }
        ((MetricCollector.AnonymousClass1) f265).getClass();
        return ServiceMetricCollector.f276;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m321() {
        return f265;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m333() {
        if (f265 == null && m339()) {
            m331();
        }
        return f265 == null ? MetricCollector.f273 : f265;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m315(boolean z) {
        f246 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m330(boolean z) {
        f259 = z;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m339() {
        return f257;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m320() {
        return f261;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m326(boolean z) {
        f261 = z;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m304() {
        return f246;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m336() {
        return f259;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m327() {
        if (f259) {
            return true;
        }
        String str = f252;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m308() {
        m310(MetricCollector.f273);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m316(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f250.m344(metricType);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m317(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        return f250.m345(collection);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m329(Collection collection) {
        f250.m346(collection);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m332(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f250.m347(metricType);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static Set m323() {
        return f250.m343();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static AWSCredentialsProvider m305() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(f251)) {
                return f264;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.m302(AwsSdkMetrics.class).mo297("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static Regions m322() {
        return f247;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m311(Regions regions) {
        f247 = regions;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m318() {
        return f244;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m314(String str) {
        m328(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m328(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            f264 = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                /* JADX INFO: renamed from: ۙ */
                public final AWSCredentials mo208() {
                    return propertiesCredentials;
                }
            };
            f244 = str;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Integer m338() {
        return f263;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m312(Integer num) {
        f263 = num;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Long m324() {
        return f260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m313(Long l2) {
        f260 = l2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m337() {
        return f255;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m319(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        f255 = str;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static String m341() {
        return f242;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m306(String str) {
        f242 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String m307() {
        return f252;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m325(String str) {
        f252 = str;
    }

    public class MetricRegistry {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final HashSet f268;

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public volatile Set f269;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f268 = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            m342();
        }

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        private void m342() {
            this.f269 = C0561.unmodifiableSet(new HashSet(this.f268));
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean m344(MetricType metricType) {
            boolean zAdd;
            synchronized (this.f268) {
                zAdd = this.f268.add(metricType);
                if (zAdd) {
                    m342();
                }
            }
            return zAdd;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean m345(Collection collection) {
            boolean zAddAll;
            synchronized (this.f268) {
                zAddAll = this.f268.addAll(collection);
                if (zAddAll) {
                    m342();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0015 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x0029, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final void m346(Collection collection) {
            synchronized (this.f268) {
                if (collection != null) {
                    if (collection.size() == 0) {
                        if (this.f268.size() == 0) {
                            return;
                        }
                        if (collection == null) {
                            collection = Collections.EMPTY_LIST;
                        }
                    }
                } else {
                    if (this.f268.size() == 0) {
                        return;
                    }
                    if (collection == null) {
                        collection = Collections.EMPTY_LIST;
                    }
                }
                this.f268.clear();
                if (!m345(collection)) {
                    m342();
                }
            }
        }

        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
        public final boolean m347(MetricType metricType) {
            boolean zRemove;
            synchronized (this.f268) {
                zRemove = this.f268.remove(metricType);
                if (zRemove) {
                    m342();
                }
            }
            return zRemove;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final Set m343() {
            return this.f269;
        }
    }
}
