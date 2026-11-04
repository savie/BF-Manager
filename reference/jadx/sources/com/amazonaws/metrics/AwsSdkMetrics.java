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
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean f227;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String f228 = "hostMetricName";

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f229 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f230 = "jvmMetricName";

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static volatile Regions f231 = null;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String f232 = "getQueuePollTimeoutMilli";

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f233 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f234 = "metricNameSpace";

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String f235 = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String f236 = "com.amazonaws.management:type=AwsSdkMetrics";

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String f237 = "includePerHostMetrics";

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String f238 = "excludeMachineMetrics";

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final MetricRegistry f239;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f240 = false;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f241 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f242 = "metricQueueSize";

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static volatile AWSCredentialsProvider f244 = null;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f245 = false;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f246 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static volatile Integer f247 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f248 = "cloudwatchRegion";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f249 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static volatile String f250 = null;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f251 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f252 = "credentialFile";

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final int f253 = 1000;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final String f254 = "useSingleMetricNamespace";

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static volatile Long f255;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static volatile MetricCollector f256;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m298() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m302(AWSCredentialsProvider aWSCredentialsProvider) {
        f244 = aWSCredentialsProvider;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m303(MetricCollector metricCollector) {
        f256 = metricCollector;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m332() {
        if (f256 != null) {
            f256.getClass();
        }
        if (f241) {
            throw new IllegalStateException("Reentrancy is not allowed");
        }
        f241 = true;
        try {
            try {
                MetricCollector factory = ((MetricCollector.Factory) Class.forName(f235).newInstance()).getInstance();
                if (factory != null) {
                    m303(factory);
                    f241 = false;
                    return true;
                }
            } catch (Exception e) {
                LogFactory.m296(AwsSdkMetrics.class).mo289("Failed to enable the default metrics", e);
            }
            f241 = false;
            return false;
        } catch (Throwable th) {
            f241 = false;
            throw th;
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        f227 = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String strTrim = str.trim();
                if (!z2 && f238.equals(strTrim)) {
                    z2 = true;
                } else if (!z3 && f237.equals(strTrim)) {
                    z3 = true;
                } else if (z4 || !f254.equals(strTrim)) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String strTrim3 = strArrSplit[1].trim();
                        try {
                            if (f252.equals(strTrim2)) {
                                m327(strTrim3);
                            } else if (f248.equals(strTrim2)) {
                                f231 = Regions.m420(strTrim3);
                            } else if (f242.equals(strTrim2)) {
                                Integer num = new Integer(strTrim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                f247 = num;
                            } else if (f232.equals(strTrim2)) {
                                Long l2 = new Long(strTrim3);
                                if (l2.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                f255 = l2;
                            } else if (f234.equals(strTrim2)) {
                                f246 = strTrim3;
                            } else if (f230.equals(strTrim2)) {
                                f229 = strTrim3;
                            } else if (f228.equals(strTrim2)) {
                                f233 = strTrim3;
                            } else {
                                LogFactory.m296(AwsSdkMetrics.class).mo291("Ignoring unrecognized parameter: " + strTrim);
                            }
                        } catch (Exception e) {
                            LogFactory.m296(AwsSdkMetrics.class).mo286("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            f240 = z2;
            f245 = z3;
            f251 = z4;
        }
        f239 = new MetricRegistry();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static RequestMetricCollector m300() {
        if (f256 == null && m326()) {
            m332();
        }
        if (f256 == null) {
            return RequestMetricCollector.f265;
        }
        ((MetricCollector.AnonymousClass1) f256).getClass();
        return RequestMetricCollector.f265;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ServiceMetricCollector m319() {
        if (f256 == null && m326()) {
            m332();
        }
        if (f256 == null) {
            return ServiceMetricCollector.f266;
        }
        ((MetricCollector.AnonymousClass1) f256).getClass();
        return ServiceMetricCollector.f266;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m316() {
        return f256;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m320() {
        if (f256 == null && m326()) {
            m332();
        }
        return f256 == null ? MetricCollector.f263 : f256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m308(boolean z) {
        f240 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m329(boolean z) {
        f245 = z;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m326() {
        return f227;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m313() {
        return f251;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m315(boolean z) {
        f251 = z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m321() {
        return f240;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m322() {
        return f245;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean m312() {
        if (f245) {
            return true;
        }
        String str = f233;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m301() {
        m303(MetricCollector.f263);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m309(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f239.m338(metricType);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m310(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        return f239.m339(collection);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m328(Collection collection) {
        f239.m340(collection);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m330(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f239.m341(metricType);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Set m317() {
        return f239.m337();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static AWSCredentialsProvider m318() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(f235)) {
                return f244;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.m296(AwsSdkMetrics.class).mo289("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Regions m334() {
        return f231;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m304(Regions regions) {
        f231 = regions;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m323() {
        return f250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m307(String str) {
        m327(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m327(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            f244 = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                /* JADX INFO: renamed from: ۙ */
                public final AWSCredentials mo202() {
                    return propertiesCredentials;
                }
            };
            f250 = str;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Integer m325() {
        return f247;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m305(Integer num) {
        f247 = num;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static Long m311() {
        return f255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m306(Long l2) {
        f255 = l2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m333() {
        return f246;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m324(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        f246 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m335() {
        return f229;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m331(String str) {
        f229 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m299() {
        return f233;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m314(String str) {
        f233 = str;
    }

    public class MetricRegistry {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final HashSet f258;

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public volatile Set f259;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f258 = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            m336();
        }

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        private void m336() {
            this.f259 = C4681.unmodifiableSet(new HashSet(this.f258));
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean m338(MetricType metricType) {
            boolean zAdd;
            synchronized (this.f258) {
                zAdd = this.f258.add(metricType);
                if (zAdd) {
                    m336();
                }
            }
            return zAdd;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final boolean m339(Collection collection) {
            boolean zAddAll;
            synchronized (this.f258) {
                zAddAll = this.f258.addAll(collection);
                if (zAddAll) {
                    m336();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0015 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x0029, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final void m340(Collection collection) {
            synchronized (this.f258) {
                if (collection != null) {
                    if (collection.size() == 0) {
                        if (this.f258.size() == 0) {
                            return;
                        }
                        if (collection == null) {
                            collection = Collections.EMPTY_LIST;
                        }
                    }
                } else {
                    if (this.f258.size() == 0) {
                        return;
                    }
                    if (collection == null) {
                        collection = Collections.EMPTY_LIST;
                    }
                }
                this.f258.clear();
                if (!m339(collection)) {
                    m336();
                }
            }
        }

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final boolean m341(MetricType metricType) {
            boolean zRemove;
            synchronized (this.f258) {
                zRemove = this.f258.remove(metricType);
                if (zRemove) {
                    m336();
                }
            }
            return zRemove;
        }

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final Set m337() {
            return this.f259;
        }
    }
}
