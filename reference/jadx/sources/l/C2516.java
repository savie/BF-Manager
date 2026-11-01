package l;

import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2516 implements AutoCloseable {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f9972;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static C1873 f9973;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9974 = 0;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f9975;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18745[] f9976;

    /* JADX INFO: renamed from: ᩺᩷֡, reason: not valid java name and contains not printable characters */
    private static final short[] f9977 = {2559, 18301, 18273, 18299, 18300, 18285, 18283, 18240, 18283, 18281, 18287, 18298, 18279, 18296, 18283, 18222, 18301, 18273, 18299, 18300, 18285, 18283, 18222, 18274, 18283, 18272, 18281, 18298, 18278, 8992, 1078, 1051, 1030, 1082, 1041, 1053, 1035, 1043, 1051, 1040, 1034, 1118, 1047, 1037, 1118, 1053, 1042, 1041, 1037, 1051, 1050, 6827, 25558, 25595, 25574, 25562, 25585, 25597, 25579, 25587, 25595, 25584, 25578, 25534, 25591, 25581, 25534, 25597, 25586, 25585, 25581, 25595, 25594, 25558, 25595, 25574, 25562, 25585, 25597, 25579, 25587, 25595, 25584, 25578, 25534, 25581, 25585, 25579, 25580, 25597, 25595, 25534, 25591, 25581, 25534, 25591, 25584, 25576, 25599, 25586, 25591, 25594, 25599, 25578, 25595, 25594, 5135, -1496, -1533, -1535, -1529, -1518, -1521, -1520, -1533, -1466, -1532, -1529, -1515, -1533, -1466, -1515, -1527, -1517, -1516, -1531, -1533, -1466, -1526, -1533, -1528, -1535, -1518, -1522, -1496, -1533, -1535, -1529, -1518, -1521, -1520, -1533, -1466, -1534, -1527, -1531, -1517, -1525, -1533, -1528, -1518, -1466, -1526, -1533, -1528, -1535, -1518, -1522, -1489, -1528, -1520, -1529, -1526, -1521, -1534, -1466, -1522, -1533, -1506, -1466, -1531, -1522, -1533, -1531, -1523, -1514, -1527, -1521, -1528, -1518, -1489, -1528, -1520, -1529, -1526, -1521, -1534, -1466, -1531, -1522, -1529, -1528, -1535, -1533, -1534, -1466, -1536, -1526, -1529, -1535, -1485, -1528, -1531, -1522, -1529, -1528, -1535, -1533, -1534, -1466, -1531, -1522, -1533, -1531, -1523, -1514, -1527, -1521, -1528, -1518, -1466, -1521, -1515, -1466, -1528, -1527, -1518, -1466, -1529, -1466, -1531, -1526, -1533, -1529, -1528, -1466, -1500, -1497, -1483, -1501, -1466, -1516, -1527, -1527, -1518, -1484, -1533, -1515, -1518, -1527, -1516, -1533, -1534, -1466, -1534, -1527, -1531, -1517, -1525, -1533, -1528, -1518, -1466, -1525, -1533, -1518, -1529, -1534, -1529, -1518, -1529, -1466, -1533, -1506, -1531, -1533, -1533, -1534, -1515, -1466, -1525, -1533, -1525, -1527, -1516, -1505, -1466, -1526, -1521, -1525, -1521, -1518, 3276, 17933, 17962, 17970, 17957, 17960, 17965, 17952, 18020, 17952, 17965, 17974, 17968, 17981, 18020, 17959, 17964, 17969, 17962, 17967, 18020, 17959, 17963, 17969, 17962, 17968, 17920, 17965, 17974, 17968, 17981, 18020, 17975, 17968, 17974, 17969, 17959, 17968, 17969, 17974, 17953, 18020, 17953, 17980, 17959, 17953, 17953, 17952, 17975, 18020, 17961, 17953, 17961, 17963, 17974, 17981, 18020, 17960, 17965, 17961, 17965, 17968, 17920, 17965, 17974, 17968, 17981, 18020, 17959, 17964, 17969, 17962, 17967, 17975, 18020, 17952, 17963, 18020, 17962, 17963, 17968, 18020, 17961, 17957, 17968, 17959, 17964, 18020, 17952, 17963, 17959, 17969, 17961, 17953, 17962, 17968, 18020, 17960, 17953, 17962, 17955, 17968, 17964, 17933, 17962, 17970, 17957, 17960, 17965, 17952, 18020, 17952, 17965, 17974, 17968, 17981, 18020, 17959, 17964, 17969, 17962, 17967, 17925, 17952, 17966, 17957, 17959, 17953, 17962, 17968, 18020, 17952, 17965, 17974, 17968, 17981, 18020, 17974, 17969, 17962, 17975, 18020, 17957, 17974, 17953, 18020, 17962, 17963, 17968, 18020, 17959, 17957, 17962, 17963, 17962, 17965, 17959, 17957, 17960, 17937, 17962, 17967, 17962, 17963, 17971, 17962, 18020, 17952, 17965, 17974, 17968, 17981, 18020, 17959, 17964, 17969, 17962, 17967, 18020, 17968, 17957, 17955, 18020, 17933, 17962, 17970, 17957, 17960, 17965, 17952, 18020, 17952, 17965, 17974, 17968, 17981, 18020, 17958, 17965, 17968, 17961, 17957, 17972, 18020, 17960, 17953, 17962, 17955, 17968, 17964, 9700, -19287, -19285, -19287, -19294, -19281, -19314, -19293, -19272, -19281, -19287, -19266, -19291, -19272, -19277, 2677, 31683, 31681, 31683, 31688, 31685, 31716, 31689, 31698, 31685, 31683, 31700, 31695, 31698, 31705, 9610, 3677, 3706, 3682, 3701, 3704, 3709, 3696, 3636, 3697, 3692, 3680, 3697, 3706, 3680, 3636, 3704, 3697, 3706, 3699, 3680, 3708, 3314, -8837, -8895, -8869, -8876, -8879, -8869, -8936, -8886, -8867, -8888, -8876, -8871, -8869, -8867, -8875, -8867, -8874, -8884, -8936, -8886, -8867, -8869, -8879, -8888, -8867, -8936, -8868, -8867, -8888, -8867, -8874, -8868, -8867, -8874, -8869, -8895, -8847, -8874, -8882, -8871, -8876, -8879, -8868, -8936, -8886, -8867, -8888, -8876, -8871, -8869, -8867, -8875, -8867, -8874, -8884, -8936, -8886, -8867, -8869, -8879, -8888, -8867, -8936, -8884, -8886, -8871, -8882, -8867, -8886, -8885, -8871, -8876, -8852, -8873, -8873, -8936, -8875, -8871, -8874, -8895, -8936, -8886, -8867, -8888, -8876, -8871, -8869, -8867, -8875, -8867, -8874, -8884, -8936, -8886, -8867, -8869, -8879, -8888, -8867, -8885, 3668, -13237, -13201, -13195, -13195, -13201, -13208, -13215, -13274, -13211, -13202, -13213, -13211, -13203, -13194, -13207, -13201, -13208, -13198, -13274, -13214, -13213, -13206, -13198, -13209, -13274, -13201, -13214, -13213, -13208, -13198, -13201, -13198, -13185, -13237, -13201, -13195, -13195, -13201, -13208, -13215, -13274, -13211, -13202, -13213, -13211, -13203, -13194, -13207, -13201, -13208, -13198, -13274, -13196, -13213, -13211, -13201, -13194, -13213, -13274, -13201, -13214, -13213, -13208, -13198, -13201, -13198, -13185, 5640, 13963, 14000, 14000, 14079, 14002, 14014, 14001, 13990, 14079, 14012, 14007, 14010, 14012, 14004, 13999, 14000, 14006, 14001, 13995, 14079, 14011, 14010, 14003, 13995, 14014, 14079, 14010, 14001, 13995, 13997, 14006, 14010, 13996, 9173, 8433, 8406, 8398, 8409, 8404, 8401, 8412, 8344, 8392, 8409, 8396, 8396, 8413, 8394, 8406, 8344, 8396, 8409, 8410, 8404, 8413, 8344, 8395, 8401, 8386, 8413, 8433, 8406, 8398, 8409, 8404, 8401, 8412, 8344, 8392, 8409, 8396, 8396, 8413, 8394, 8406, 8344, 8392, 8409, 8385, 8404, 8407, 8409, 8412, 8344, 8404, 8413, 8406, 8415, 8396, 8400, 8424, 8409, 8396, 8396, 8413, 8394, 8406, 8344, 8394, 8413, 8392, 8404, 8409, 8411, 8413, 8405, 8413, 8406, 8396, 8344, 8405, 8397, 8395, 8396, 8344, 8406, 8407, 8396, 8344, 8410, 8413, 8344, 8413, 8405, 8392, 8396, 8385, 5282, -10040, -10001, -9990, -9993, -9986, -10053, -10001, -10007, -9990, -9995, -10008, -9990, -9992, -10001, -9998, -9996, -9995, 3179, 23156, 23129, 23108, 23160, 23123, 23135, 23113, 23121, 23129, 23122, 23112, 23068, 23119, 23123, 23113, 23118, 23135, 23129, 23068, 23125, 23119, 23068, 23125, 23122, 23114, 23133, 23120, 23125, 23128, 23133, 23112, 23129, 23128, 9861, -8143, -8112, -8188, -8190, -8175, -8162, -8189, -8175, -8173, -8188, -8167, -8161, -8162, -8112, -8167, -8189, -8112, -8175, -8164, -8190, -8171, -8175, -8172, -8183, -8112, -8175, -8173, -8188, -8167, -8186, -8171, 5117, -11044, -11013, -11037, -11020, -11015, -11012, -11023, -11083, -11011, -11024, -11027, -11083, -11018, -11011, -11024, -11018, -11010, -11035, -11014, -11012, -11013, -11039, -11089, -11083, 3976, 7327, 7332, 7339, 7336, 7334, 7343, 7402, 7358, 7333, 7402, 7337, 7334, 7333, 7353, 7343, 7402, 7330, 7343, 7346, 7402, 7337, 7330, 7343, 7337, 7329, 7354, 7333, 7331, 7332, 7358, 7402, 7352, 7343, 7353, 7333, 7359, 7352, 7337, 7343, 
    7353, 9199, 4320, 4225, 4306, 4288, 4311, 4292, 4225, 4296, 4306, 4225, 4288, 4301, 4307, 4292, 4288, 4293, 4312, 4225, 4288, 4290, 4309, 4296, 4311, 4292, 6028, 8757, 8764, 8764, 8745, 8767, 8750, 8807, 8766, 8763, 8750, 8763, 8761, 8754, 8763, 8756, 8765, 8767, 8766, 8822, 8826, 8759, 8763, 8738, 8755, 8759, 8751, 8759, 8726, 8767, 8756, 8765, 8750, 8754, 8807, 1677, 12072, 12085, 12090, 12075, 12072, 12083, 12084, 12079, 12040, 12085, 12090, 12075, 12072, 12083, 12084, 12079, 12155, 12089, 12094, 12087, 12084, 12085, 12092, 12072, 12155, 12079, 12084, 12155, 12090, 12085, 12084, 12079, 12083, 12094, 12073, 12155, 12095, 12084, 12088, 12078, 12086, 12094, 12085, 12079, 12040, 12085, 12090, 12075, 12072, 12083, 12084, 12079, 12155, 12082, 12072, 12155, 12072, 12079, 12090, 12087, 12094, 6129, -1496, -1499, -1474, -1495, -1489, -1480, -1501, -1474, -1483, 3077, 25125, 25111, 25088, 25107, 25150, 25111, 25112, 25106, 25114, 25107, 25174, 25108, 25107, 25114, 25113, 25112, 25105, 25093, 25174, 25090, 25113, 25174, 25111, 25112, 25113, 25090, 25118, 25107, 25092, 25174, 25106, 25113, 25109, 25091, 25115, 25107, 25112, 25090, 25125, 25111, 25088, 25107, 25150, 25111, 25112, 25106, 25114, 25107, 25174, 25119, 25093, 25174, 25112, 25113, 25090, 25174, 25111, 25109, 25090, 25119, 25088, 25107, 5334, 12907, 12889, 12878, 12893, 12892, 12824, 12875, 12887, 12877, 12874, 12891, 12893, 12824, 12884, 12893, 12886, 12895, 12876, 12880, 12824, 12907, 12889, 12878, 12893, 12912, 12889, 12886, 12892, 12884, 12893, 12824, 12890, 12893, 12884, 12887, 12886, 12895, 12875, 12824, 12876, 12887, 12824, 12889, 12886, 12887, 12876, 12880, 12893, 12874, 12824, 12892, 12887, 12891, 12877, 12885, 12893, 12886, 12876, 12907, 12889, 12878, 12893, 12912, 12889, 12886, 12892, 12884, 12893, 12824, 12881, 12875, 12824, 12886, 12887, 12876, 12824, 12889, 12891, 12876, 12881, 12878, 12893, 12907, 12889, 12878, 12893, 12892, 12824, 12875, 12887, 12877, 12874, 12891, 12893, 12824, 12881, 12875, 12824, 12889, 12884, 12874, 12893, 12889, 12892, 12865, 12824, 12887, 12879, 12886, 12893, 12892, 12824, 12890, 12865, 12824, 12892, 12887, 12891, 12877, 12885, 12893, 12886, 12876, 12907, 12889, 12878, 12893, 12912, 12889, 12886, 12892, 12884, 12893, 12824, 12881, 12875, 12824, 12875, 12876, 12889, 12884, 12893, 12824, 12825, 12805, 12824, 12892, 12887, 12891, 12877, 12885, 12893, 12886, 12876, 12824, 12884, 12893, 12886, 12895, 12876, 12880, 12824};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC18745 f9978;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile long f9979;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f9980;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f9981;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f9982;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f9983;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f9984;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f9985;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f9986;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile C3284 f9987;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f9988;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public File f9989;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C14575 f9990;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9991;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15986 f9992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13807 f9993;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile boolean f9994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m7740(Throwable th) throws IOException {
        m7777(th);
        throw null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C23041 m7789() {
        C3284 c3284;
        InterfaceC18745 interfaceC18745;
        InterfaceC18745 interfaceC18745Mo2298;
        Throwable th;
        C15218 c15218;
        m7766();
        boolean z = this.f9990 != null;
        if (!z) {
            m7802();
        } else if (!m7754((Iterable) C0050.m941(this.f9984))) {
            throw new C8599();
        }
        c3284 = this.f9987;
        interfaceC18745 = this.f9978;
        interfaceC18745Mo2298 = interfaceC18745.mo2298();
        C15218 c15219 = null;
        try {
            c15218 = new C15218(this.f9981, this.f9986, c3284.f12179, c3284.f12185, c3284.f12181);
            try {
                if (!z) {
                    m7802();
                } else if (!m7754((Iterable) C0050.m941(this.f9984))) {
                    throw new C8599();
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c15219 = c15218;
                if (c15219 == null) {
                    C2249.m6913(interfaceC18745Mo2298);
                    throw th;
                }
                try {
                    c15219.close();
                } catch (IOException e2) {
                    ViewGroupOnHierarchyChangeListenerC1916.m6242(th, e2);
                }
                try {
                    C2249.m6913(interfaceC18745Mo2298);
                    throw th;
                } catch (IOException e3) {
                    ViewGroupOnHierarchyChangeListenerC1916.m6242(th, e3);
                    throw th;
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
        }
        return new C23041(this, interfaceC18745, interfaceC18745Mo2298, c15218, c3284.f12178, this.f9986);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m7790() {
        return !C0629.m2912(this.f9982);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C14575 m7793() {
        C14575 c14575;
        m7766();
        m7767();
        m7786();
        m7802();
        C3284 c3284 = this.f9987;
        C15218 c15218 = new C15218(this.f9981, this.f9986, c3284.f12179, c3284.f12185, c3284.f12181);
        try {
            m7802();
            c14575 = new C14575(this, this.f9986, c3284, c15218);
            this.f9990 = c14575;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c15218.close();
                throw e;
            } catch (IOException e2) {
                C0629.m2911(e, e2);
                throw e;
            }
        }
        return c14575;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7794(int i, int i2, boolean z, boolean z2) {
        m7713();
        C16691 c16691 = new C16691(i, i2, z, z2);
        C16691.m39163(c16691, this.f9987.m9777());
        this.f9987.f12175 = c16691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7795(File file) {
        short s = f9977[1123];
        int i = (s * 28680) - ((s * s) + 205635600) > 0 ? 8316 : 64076;
        synchronized (this) {
            m7713();
            C13638.requireNonNull(file, C1977.m6363(f9977, 1124, 9, i));
            this.f9989 = file;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7798(int i, int i2, byte[] bArr) {
        m7764();
        C7893.m20871(i, 0, i2, m7716().f12185, bArr);
        m7764();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized C3989 m7801() {
        C3284 c3284;
        m7766();
        c3284 = this.f9987;
        return new C3989(c3284.f12179, c3284.f12178, c3284.f12175);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7802() {
        m7713();
        if (!m7754((Iterable) C0050.m941(this.f9984))) {
            C13807 c13807 = this.f9993;
            if (c13807 != null) {
                c13807.m33564();
            }
            this.f9994 = true;
            this.f9988.clear();
            this.f9982.clear();
            this.f9985 = 0L;
            this.f9986++;
            m7717();
            throw new C8599();
        }
        this.f9979 = System.nanoTime() + 250000000;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C16691 m7803() {
        m7713();
        return this.f9987.f12175;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized C11690 m7806() {
        C11690 c11690;
        m7766();
        C3284 c3284 = this.f9987;
        c11690 = new C11690(this, this.f9986, c3284.f12179, c3284.m9778(0L));
        ViewGroupOnHierarchyChangeListenerC1916.m6228(this.f9980, c11690, Boolean.TRUE);
        return c11690;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m7810() {
        return !ViewGroupOnHierarchyChangeListenerC1916.m6240(this.f9988);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m7791(int i, int i2, byte[] bArr, boolean[] zArr) {
        int iM1590;
        short s = f9977[1026];
        int i3 = (s * 39614) - ((s * s) + 392317249) > 0 ? 17490 : 8794;
        String strM6105 = C1875.m6105(f9977, 1027, 7, i3);
        synchronized (this) {
            C13638.requireNonNull(bArr, CallableC1627.m5502(f9977, 1034, 4, i3));
            C13638.requireNonNull(zArr, C0526.m2424(f9977, 1038, 7, i3));
            if (i < 0 || i2 < 0) {
                StringBuilder sb = new StringBuilder(strM6105);
                C0817.m3408(sb, i);
                C1148.m4223(sb, C3286.m9788(f9977, 1045, 16, i3));
                C2124.m6683(sb, i2);
                throw new IndexOutOfBoundsException(C2124.m6674(sb));
            }
            C22979.m50824(bArr.length, 0, i2);
            C22979.m50824(zArr.length, 0, i2);
            m7764();
            C3284 c3284M7716 = m7716();
            iM1590 = i >= c3284M7716.m9777() ? 0 : C0216.m1590(i2, c3284M7716.m9777() - i);
            if (iM1590 > 0) {
                C7893.m20871(i, 0, iM1590, c3284M7716.f12185, bArr);
                C9367.m24029(c3284M7716.f12181, i, zArr, iM1590);
            }
            m7764();
        }
        return iM1590;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m7714(long j, long j2) {
        long j3 = 0;
        int i = 1224223681;
        int i2 = C7105.f23796;
        int i3 = C1419.f5860;
        int iM11306 = (ThreadFactoryC3888.m11306("ۨ۬") + i3) * (-39);
        int i4 = ((iM11306 ^ i2) * (-21075)) ^ 758182322;
        int i5 = -409829467;
        while (true) {
            i = ((((i ^ i2) * (-5017)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2100443329:
                case 1189171758:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬ܶ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-30209)) ^ (-703035694);
                        i5 = 1613118383;
                    } else {
                        iM11306 = (C19806.m45029("ۖᩳ") + i2) * (-55);
                        i4 = ((iM11306 ^ i3) * (-10625)) ^ (-757089372);
                        i5 = 1962367631;
                    }
                    break;
                case -1930613564:
                case -1170306422:
                    if (j3 < j) {
                        iM11306 = (C19806.m45029("ۗܺ") + i3) * (-81);
                        i4 = ((iM11306 ^ i2) * 1451) ^ 784597208;
                        i5 = 2036102199;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۗ") + i2) * (-111);
                        i4 = ((iM11306 ^ i3) * (-14095)) ^ (-406141802);
                        i5 = -610751988;
                    }
                    break;
                case -1813078677:
                case -842515244:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("ܳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27909)) ^ 375174865;
                        i5 = -1447714491;
                    } else {
                        iM11306 = C19806.m45029("۟ۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30041)) ^ 1837676045;
                        i5 = -567253894;
                    }
                    break;
                case -1701238157:
                case -1645901145:
                    if (C1148.m4232() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۠") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 16455) ^ 552949675;
                        i5 = 1869531048;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1227) ^ (-2030122645);
                        i5 = 1466765886;
                    }
                    break;
                case -1331549553:
                case -583062635:
                    if (C3535.m10431() <= 0) {
                        iM11306 = (i3 - C19806.m45029("ܶ۬")) * 79;
                        i4 = ((iM11306 ^ i2) * 24333) ^ 1243984073;
                        i5 = 698325523;
                    } else {
                        iM11306 = C19806.m45029("ܳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27909)) ^ 375174865;
                        i5 = -1447714491;
                    }
                    break;
                case -1275675817:
                case 1188773582:
                    j3 = j2 + j;
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30053)) ^ (-1514803655);
                        i5 = -672815966;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14641)) ^ 34495629;
                        i5 = -259940853;
                    }
                    break;
                case -1062795247:
                case -981183441:
                    C0216.m1591();
                    iM11306 = C19806.m45029("ܳۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-27909)) ^ 375174865;
                    i5 = -1447714491;
                    break;
                case -1048794708:
                case -462048001:
                    if (C1668.f6641 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۠") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 16455) ^ 552949675;
                        i5 = 1869531048;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܶ۬")) * 79;
                        i4 = ((iM11306 ^ i2) * 24333) ^ 1243984073;
                        i5 = 698325523;
                    }
                    break;
                case -957928320:
                case -427778688:
                    return j3;
                case -331113407:
                case 495110984:
                    C0050.m946();
                    if (!C2332.f8260) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬ܶ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-30209)) ^ (-703035694);
                        i5 = 1613118383;
                    } else {
                        iM11306 = C19806.m45029("ܳۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27909)) ^ 375174865;
                        i5 = -1447714491;
                    }
                    break;
                case -255252893:
                case 1548166317:
                    if (C2332.f8260) {
                        iM11306 = (C19806.m45029("᩹ۙ") ^ i2) * 7;
                        i4 = ((iM11306 ^ i3) * 16425) ^ 246335026;
                        i5 = -837863417;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30053)) ^ (-1514803655);
                        i5 = -672815966;
                    }
                    break;
                case -142187047:
                case 2081771057:
                    C3577.m10565();
                    return 0L;
                case -122580632:
                case 290182148:
                    return C17492.FOREVER_NS;
                case 68193271:
                case 499891928:
                    if (C0050.f912 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬ܶ")) * 15;
                        i4 = ((iM11306 ^ i2) * (-30209)) ^ (-703035694);
                        i5 = 1613118383;
                    } else {
                        iM11306 = (C19806.m45029("ܿᩳ") + i3) * (-119);
                        i4 = ((iM11306 ^ i2) * (-5293)) ^ (-1518633638);
                        i5 = -240573636;
                    }
                    break;
                case 194033368:
                case 1151430190:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۠") ^ i2) * 11;
                        i4 = ((iM11306 ^ i3) * 16455) ^ 552949675;
                        i5 = 1869531048;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13227) ^ (-79535042);
                        i5 = -831024962;
                    }
                    break;
                case 622950506:
                case 943879413:
                    if (j3 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۢ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26155) ^ (-1794401903);
                        i5 = 1183425187;
                    } else {
                        iM11306 = (C19806.m45029("ۗܺ") + i3) * (-81);
                        i4 = ((iM11306 ^ i2) * 1451) ^ 784597208;
                        i5 = 2036102199;
                    }
                    break;
                case 797743685:
                case 1180196797:
                    if (C3743.m10966() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30053)) ^ (-1514803655);
                        i5 = -672815966;
                    } else {
                        iM11306 = (C19806.m45029("ܰۡ") + i3) * (-65);
                        i4 = ((iM11306 ^ i2) * 30081) ^ (-1537708095);
                        i5 = -1324407550;
                    }
                    break;
                case 1133494978:
                case 1648346459:
                    if (C1668.m5583()) {
                        iM11306 = C19806.m45029("ܰۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 19291) ^ (-2067840334);
                        i5 = -437769535;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܶ۬")) * 79;
                        i4 = ((iM11306 ^ i2) * 24333) ^ 1243984073;
                        i5 = 698325523;
                    }
                    break;
                default:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30053)) ^ (-1514803655);
                        i5 = -672815966;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۜ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i3) * (-8931)) ^ 564086301;
                        i5 = 1480695700;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0279 A[PHI: r4 r6 r26 r27
      0x0279: PHI (r4v7 long) = (r4v3 long), (r4v3 long), (r4v4 long), (r4v3 long) binds: [B:71:0x0277, B:61:0x01f3, B:53:0x019d, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r6v7 long) = (r6v3 long), (r6v3 long), (r6v4 long), (r6v3 long) binds: [B:71:0x0277, B:61:0x01f3, B:53:0x019d, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r26v7 int) = (r26v2 int), (r26v2 int), (r26v2 int), (r26v8 int) binds: [B:71:0x0277, B:61:0x01f3, B:53:0x019d, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r27v18 long) = (r27v0 long), (r27v2 long), (r27v3 long), (r27v19 long) binds: [B:71:0x0277, B:61:0x01f3, B:53:0x019d, B:13:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m7771(int i, int i2, int i3, int[] iArr) {
        long j;
        int iM11306;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int iM11307;
        int i10;
        int i11;
        int i12 = -1710440879;
        int i13 = C0050.f912;
        int i14 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450211 = C19806.m45029("֫ۧ") ^ i13;
        int i15 = ((iM450211 ^ i14) * 31047) ^ (-2078991104);
        int i16 = iM450211 ^ (-2103090354);
        long jM945 = 0;
        int i17 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long jM4839 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i18 = i16;
        while (true) {
            long j9 = 0;
            while (true) {
                i12 = i18 ^ (i15 & (((i12 ^ i14) * (-16465)) >> 31));
                switch (i12) {
                    case -2044412183:
                    case 1463195451:
                        return C2124.m6676(C9367.m24017(Math.max(j9, jM945 - j3)), 192L);
                    case -1760812046:
                    case -1740353664:
                        return j9;
                    case -1738152816:
                    case 533304193:
                        j = j9;
                        jM945 = C0050.m945(j7, j2 & j4);
                        if (C1148.f5161 > 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۚ᩻") + i13) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i8 = ((iM450210 ^ i14) * (-5231)) ^ (-196000555);
                            i9 = 420733037;
                            i18 = iM450210 ^ i9;
                            i15 = i8;
                            j9 = j;
                        } else {
                            iM11306 = (C19806.m45029("۟᩸") + i13) * (-127);
                            i4 = ((iM11306 ^ i14) * 16759) ^ 1782393373;
                            i5 = 153055087;
                            i15 = i4;
                            i18 = iM11306 ^ i5;
                            j9 = j;
                        }
                        break;
                    case -1597791856:
                    case 1868650298:
                        j = j9;
                        j4 = -65536;
                        j3 = j8 & (-65536);
                        j2 = jM4839 + 65535;
                        if (CallableC1627.m5507() == 0) {
                            iM450210 = (i14 - C19806.m45029("ۙܳ")) * 57;
                            i8 = ((iM450210 ^ i13) * (-20269)) ^ (-2094997273);
                            i9 = 1331393552;
                            i18 = iM450210 ^ i9;
                            i15 = i8;
                            j9 = j;
                        }
                        iM11306 = C19806.m45029("᩻᩸") ^ i14;
                        i4 = ((iM11306 ^ i13) * (-7301)) ^ (-1636340318);
                        i5 = 251286950;
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case -1454773767:
                    case 1800922633:
                        j = j9;
                        i17 = i2 - 1;
                        if (C3660.f13403 < 0) {
                            iM45029 = C19806.m45029("ܶܿ") ^ i14;
                            i6 = ((iM45029 ^ i13) * 4917) ^ (-1005518155);
                            i7 = -45531149;
                            i18 = i7 ^ iM45029;
                            i15 = i6;
                            j9 = j;
                        }
                        iM11306 = C19806.m45029("ۤۙ") ^ i14;
                        i4 = ((iM11306 ^ i13) * (-673)) ^ 1108111373;
                        i5 = 482991242;
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case -1439836230:
                    case 1435487596:
                        if (!CallableC1627.f6528) {
                            j = j9;
                            iM11306 = (C19806.m45029("۟᩸") + i13) * (-127);
                            i4 = ((iM11306 ^ i14) * 16759) ^ 1782393373;
                            i5 = 153055087;
                            i15 = i4;
                            i18 = iM11306 ^ i5;
                            j9 = j;
                        } else {
                            iM11307 = (C19806.m45029("ܶۘ") + i14) * 109;
                            i10 = ((iM11307 ^ i13) * 10869) ^ (-300955196);
                            i11 = 131726426;
                            int i19 = i10;
                            i18 = iM11307 ^ i11;
                            i15 = i19;
                        }
                        break;
                    case -1397237058:
                    case -1048055814:
                        j = j9;
                        if (C0817.f3443) {
                            iM11306 = ThreadFactoryC3888.m11306("۟ۘ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-27185)) ^ 167479448;
                            i5 = 1069292635;
                        } else {
                            iM11306 = (C19806.m45029("۟᩸") + i13) * (-127);
                            i4 = ((iM11306 ^ i14) * 16759) ^ 1782393373;
                            i5 = 153055087;
                        }
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case -1302785001:
                    case 483671703:
                        break;
                    case -1293014459:
                    case -829469647:
                        j = j9;
                        if (RunnableC3388.m10064()) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗۙ") + i14) * (-123);
                            i4 = ((iM11306 ^ i13) * (-13571)) ^ 122840073;
                            i5 = -283001660;
                        } else {
                            iM11306 = C19806.m45029("ۤۙ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-673)) ^ 1108111373;
                            i5 = 482991242;
                        }
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case -1274080087:
                    case 1088073041:
                        j = j9;
                        j6 = iArr[i17];
                        j5 = i3;
                        if (C0050.f912 > 0) {
                            iM45029 = C19806.m45029("ۧ᩺") ^ i13;
                            i6 = ((iM45029 ^ i14) * (-32253)) ^ (-665829073);
                            i7 = 910594142;
                            i18 = i7 ^ iM45029;
                            i15 = i6;
                            j9 = j;
                        } else {
                            iM11306 = C19806.m45029("᩻᩸") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-7301)) ^ (-1636340318);
                            i5 = 251286950;
                            i15 = i4;
                            i18 = iM11306 ^ i5;
                            j9 = j;
                        }
                        break;
                    case -1254433790:
                    case 446447146:
                        j = j9;
                        j8 = iArr[0];
                        j7 = i;
                        if (C2332.f8260) {
                            iM11306 = C19806.m45029("᩶۬") ^ i13;
                            i4 = ((iM11306 ^ i14) * (-12719)) ^ 915965654;
                            i5 = -446674132;
                        } else {
                            iM11306 = C19806.m45029("ۤۙ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-673)) ^ 1108111373;
                            i5 = 482991242;
                        }
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case -1243083677:
                    case 693735005:
                        C19806.m45024();
                        return 0L;
                    case -544911531:
                    case 1203754856:
                        CallableC1627.m5507();
                        if (!C7105.m18985()) {
                            j = j9;
                            iM11306 = C19806.m45029("ۤۙ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-673)) ^ 1108111373;
                            i5 = 482991242;
                            i15 = i4;
                            i18 = iM11306 ^ i5;
                            j9 = j;
                        } else {
                            iM11307 = (C19806.m45029("ܶۘ") + i14) * 109;
                            i10 = ((iM11307 ^ i13) * 10869) ^ (-300955196);
                            i11 = 131726426;
                            int i110 = i10;
                            i18 = iM11307 ^ i11;
                            i15 = i110;
                        }
                        break;
                    case 878600971:
                    case 1736239509:
                        C1189.m4368();
                        iM11307 = (i13 - ThreadFactoryC3888.m11306("᩻֫")) * (-101);
                        i10 = ((iM11307 ^ i14) * 4745) ^ 557131612;
                        i11 = -584127972;
                        int i111 = i10;
                        i18 = iM11307 ^ i11;
                        i15 = i111;
                        break;
                    case 900778728:
                    case 2053962190:
                        j = j9;
                        jM4839 = C1377.m4839(j7, j6 + j5);
                        if (C2332.m7079() > 0) {
                            iM450210 = C19806.m45029("᩺᩵") ^ i13;
                            i8 = ((iM450210 ^ i14) * (-22281)) ^ (-1015841801);
                            i9 = -320178360;
                            i18 = iM450210 ^ i9;
                            i15 = i8;
                            j9 = j;
                        }
                        iM11306 = C19806.m45029("᩻᩸") ^ i14;
                        i4 = ((iM11306 ^ i13) * (-7301)) ^ (-1636340318);
                        i5 = 251286950;
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    case 1064940595:
                    case 1760671511:
                        C3577.m10565();
                        if (C2332.f8260) {
                            iM11307 = (C19806.m45029("ܶۘ") + i14) * 109;
                            i10 = ((iM11307 ^ i13) * 10869) ^ (-300955196);
                            i11 = 131726426;
                        } else {
                            iM11307 = (i13 - ThreadFactoryC3888.m11306("᩻֫")) * (-101);
                            i10 = ((iM11307 ^ i14) * 4745) ^ 557131612;
                            i11 = -584127972;
                        }
                        int i112 = i10;
                        i18 = iM11307 ^ i11;
                        i15 = i112;
                        break;
                    case 1996098065:
                    case 2109539374:
                        j = j9;
                        if (C0797.f3386) {
                            iM11306 = C19806.m45029("ۤۙ") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-673)) ^ 1108111373;
                            i5 = 482991242;
                        } else {
                            iM11306 = (i13 - C19806.m45029("ۙܺ")) * (-109);
                            i4 = ((iM11306 ^ i14) * (-2681)) ^ (-419668269);
                            i5 = -1897017647;
                        }
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                    default:
                        j = j9;
                        if (C2249.f8050 >= 0) {
                            iM11306 = C19806.m45029("᩻᩸") ^ i14;
                            i4 = ((iM11306 ^ i13) * (-7301)) ^ (-1636340318);
                            i5 = 251286950;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֡᩶") + i13) * 65;
                            i4 = ((iM11306 ^ i14) * (-13441)) ^ 1104116849;
                            i5 = -1769736414;
                        }
                        i15 = i4;
                        i18 = iM11306 ^ i5;
                        j9 = j;
                        break;
                }
            }
            if (i2 == 0) {
                int iM11308 = ThreadFactoryC3888.m11306("֫ܽ") ^ i14;
                i18 = (-565553005) ^ iM11308;
                i15 = ((iM11308 ^ i13) * (-14731)) ^ (-1069908712);
            } else {
                int iM11309 = ThreadFactoryC3888.m11306("ۡۛ") ^ i14;
                i15 = ((iM11309 ^ i13) * 30733) ^ (-1982693558);
                i18 = iM11309 ^ (-58929781);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x022b A[PHI: r2 r9 r11
      0x022b: PHI (r2v18 java.util.ArrayList) = (r2v1 java.util.ArrayList), (r2v1 java.util.ArrayList), (r2v1 java.util.ArrayList), (r2v19 java.util.ArrayList) binds: [B:66:0x0229, B:62:0x020a, B:15:0x0068, B:35:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r9v2 long) = (r9v1 long), (r9v1 long), (r9v1 long), (r9v3 long) binds: [B:66:0x0229, B:62:0x020a, B:15:0x0068, B:35:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r11v2 long) = (r11v1 long), (r11v1 long), (r11v1 long), (r11v3 long) binds: [B:66:0x0229, B:62:0x020a, B:15:0x0068, B:35:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0277  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ac A[PHI: r2 r13
      0x02ac: PHI (r2v23 java.util.ArrayList) = (r2v1 java.util.ArrayList), (r2v1 java.util.ArrayList), (r2v24 java.util.ArrayList) binds: [B:75:0x02aa, B:6:0x0050, B:31:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r13v2 long) = (r13v1 long), (r13v1 long), (r13v3 long) binds: [B:75:0x02aa, B:6:0x0050, B:31:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7748(C22710 c22710, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM11306;
        int i;
        int iM11307;
        int i2;
        IdentityHashMap identityHashMap2 = identityHashMap;
        ArrayList arrayList2 = arrayList;
        int i3 = C3577.f13150;
        int i4 = C1461.f5957;
        int iM11308 = (ThreadFactoryC3888.m11306("ۖۙ") ^ i4) * 81;
        int i5 = ((iM11308 ^ i3) * 18009) ^ 1228668208;
        InterfaceC18745 interfaceC18745 = null;
        Long lM9877 = null;
        int i6 = iM11308 ^ (-1434415242);
        C3658 c3658 = null;
        int i7 = 1555301204;
        long jM6676 = 0;
        long j = 0;
        long jLongValue = 0;
        Long l2 = null;
        C18101 c18101 = null;
        int i8 = 0;
        while (true) {
            i7 = i6 ^ ((((i7 ^ i3) * 18809) >> 31) & i5);
            switch (i7) {
                case -2011561288:
                case 189346127:
                    break;
                case -1788019627:
                case -17229436:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺܳ")) * 81;
                        i5 = ((iM11306 ^ i3) * (-16241)) ^ (-674202674);
                        i = -157913716;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰܳ") + i4) * 85;
                        i5 = ((iM11306 ^ i3) * 32365) ^ (-903170349);
                        i = -1491536482;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1769799904:
                case 1703236514:
                    C0629.m2904(identityHashMap2, c18101, lM9877);
                    C2249.m6905(arrayList2, c18101);
                    break;
                case -1762918735:
                case 972271216:
                    C10634.m26820();
                    C1189.m4368();
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺܳ")) * 81;
                    i5 = ((iM11306 ^ i3) * (-16241)) ^ (-674202674);
                    i = -157913716;
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1734660946:
                case -1485807772:
                    interfaceC18745 = c3658.f13401;
                    i8 = c3658.f13400;
                    if (!(interfaceC18745 instanceof C18101)) {
                        arrayList2 = arrayList;
                        iM11306 = C19806.m45029("ۗ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 1017) ^ (-861618413);
                        i = 1395447320;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܶۢ") ^ i3;
                        i5 = (-1887817474) ^ ((iM11307 ^ i4) * (-23535));
                        i2 = 1184768115;
                        i6 = iM11307 ^ i2;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1616743240:
                case 520208211:
                    jLongValue = l2.longValue();
                    j = i8;
                    if (!C0817.f3443) {
                        arrayList2 = arrayList;
                        iM11306 = (i3 - C19806.m45029("ᩳܰ")) * 23;
                        i5 = ((iM11306 ^ i4) * 32593) ^ 990477108;
                        i = -1517627598;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    } else {
                        iM11307 = (C19806.m45029("᩻ۘ") ^ i4) * 71;
                        i5 = 1265428013 ^ ((iM11307 ^ i3) * (-22515));
                        i2 = -1792342373;
                        i6 = iM11307 ^ i2;
                        arrayList2 = arrayList;
                    }
                    break;
                case -1592064478:
                case -670989797:
                    m7748(c22710.f73966, identityHashMap2, arrayList);
                    break;
                case -1455038092:
                case -580717599:
                    if (c22710 == null) {
                        iM11306 = C19806.m45029("ۗ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 1017) ^ (-861618413);
                        i = 1395447320;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-30245)) ^ 827647950;
                        i = -467378691;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1231947934:
                case 2106979316:
                    ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap2, c18101, C3577.m10575(jM6676));
                    arrayList2 = arrayList;
                    iM11306 = C19806.m45029("ۗ۫") ^ i4;
                    i5 = ((iM11306 ^ i3) * 1017) ^ (-861618413);
                    i = 1395447320;
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1145493797:
                case 1968628416:
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") ^ i3) * 109;
                        i5 = ((iM11306 ^ i4) * 22541) ^ (-526543197);
                        i = 888664012;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳܰ")) * 23;
                        i5 = ((iM11306 ^ i4) * 32593) ^ 990477108;
                        i = -1517627598;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1136502087:
                case 1718670554:
                    c3658 = c22710.f73969;
                    if (C0797.m3351(c22710)) {
                        iM11306 = (i4 - C19806.m45029("ۙ᩷")) * (-91);
                        i5 = ((iM11306 ^ i3) * (-17561)) ^ 319842956;
                        i = 214751287;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܽ᩵")) * (-53);
                        i5 = ((iM11306 ^ i4) * (-26673)) ^ 476707939;
                        i = -1862516834;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -1022089009:
                case 1200783222:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳܰ")) * 23;
                        i5 = ((iM11306 ^ i4) * 32593) ^ 990477108;
                        i = -1517627598;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۬᩹")) * (-59);
                        i5 = ((iM11306 ^ i3) * 17317) ^ 445792586;
                        i = -709575762;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -807729722:
                case 1475278206:
                    lM9877 = ViewTreeObserverOnPreDrawListenerC3327.m9877(i8);
                    if (C1398.m4895() <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜۨ") ^ i4;
                        i5 = (-932151939) ^ ((iM11307 ^ i3) * (-15439));
                        i2 = 1637238879;
                    } else {
                        iM11307 = (C19806.m45029("ۤ᩹") + i3) * 119;
                        i5 = (-1360962353) ^ ((iM11307 ^ i4) * 21079);
                        i2 = 1666945400;
                    }
                    i6 = iM11307 ^ i2;
                    arrayList2 = arrayList;
                    break;
                case -602378557:
                case 823746493:
                    if (C2788.f10625 < 0) {
                        iM11306 = (i3 - C19806.m45029("ᩳܰ")) * 23;
                        i5 = ((iM11306 ^ i4) * 32593) ^ 990477108;
                        i = -1517627598;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺܳ")) * 81;
                    i5 = ((iM11306 ^ i3) * (-16241)) ^ (-674202674);
                    i = -157913716;
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -598506420:
                case 114792430:
                    c18101 = (C18101) interfaceC18745;
                    l2 = (Long) identityHashMap2.get(c18101);
                    if (l2 == null) {
                        iM11307 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i4;
                        i5 = 1215104507 ^ ((iM11307 ^ i3) * 13247);
                        i2 = 260782160;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۚ۠") ^ i3;
                        i5 = 198121017 ^ ((iM11307 ^ i4) * (-16629));
                        i2 = -2050218426;
                    }
                    i6 = iM11307 ^ i2;
                    arrayList2 = arrayList;
                    break;
                case -491182691:
                case 1388231190:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("۠ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-7775)) ^ (-314591522);
                        i = 1769782862;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6007) ^ (-1680720755);
                        i = 2046854154;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case -397620862:
                case 1665731607:
                    m7748(c22710.f73972, identityHashMap2, arrayList2);
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺܳ")) * 81;
                        i5 = ((iM11306 ^ i3) * (-16241)) ^ (-674202674);
                        i = -157913716;
                        i6 = iM11306 ^ i;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("᩹۠") ^ i3;
                        i6 = iM11309 ^ 1003847670;
                        i5 = ((iM11309 ^ i4) * (-12067)) ^ (-2011607422);
                    }
                    identityHashMap2 = identityHashMap;
                    break;
                case 19479046:
                case 1270527487:
                    C0526.m2437();
                    C2124.m6673();
                    break;
                case 291550409:
                case 1884654313:
                    jM6676 = C2124.m6676(jLongValue, j);
                    if (C1875.f7103 < 0) {
                        iM11307 = C19806.m45029("᩵ܿ") ^ i3;
                        i5 = (-2147325960) ^ ((iM11307 ^ i4) * (-16877));
                        i2 = -413431091;
                        i6 = iM11307 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29995)) ^ 1727732562;
                        i = -2126938956;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    break;
                case 447515828:
                case 577070473:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29995)) ^ 1727732562;
                        i = -2126938956;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩻") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i4) * 6855) ^ 343307207;
                        i = 1053128477;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
                case 469010653:
                case 1415797405:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("۠ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-7775)) ^ (-314591522);
                        i = 1769782862;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۜۨ") ^ i4;
                        i5 = (-932151939) ^ ((iM11307 ^ i3) * (-15439));
                        i2 = 1637238879;
                        i6 = iM11307 ^ i2;
                        arrayList2 = arrayList;
                    }
                    break;
                case 950160533:
                case 1303147240:
                    C3660.m10791();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۜۨ") ^ i4;
                        i5 = (-932151939) ^ ((iM11307 ^ i3) * (-15439));
                        i2 = 1637238879;
                        i6 = iM11307 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܺܳ")) * 81;
                        i5 = ((iM11306 ^ i3) * (-16241)) ^ (-674202674);
                        i = -157913716;
                        i6 = iM11306 ^ i;
                        identityHashMap2 = identityHashMap;
                    }
                    break;
                default:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29995)) ^ 1727732562;
                        i = -2126938956;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-9315)) ^ (-2059882786);
                        i = 1507440319;
                    }
                    i6 = iM11306 ^ i;
                    identityHashMap2 = identityHashMap;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0188 A[PHI: r19
      0x0188: PHI (r19v3 long) = (r19v2 long), (r19v1 long) binds: [B:46:0x0170, B:39:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x027f  */
    /* JADX WARN: Code duplicated, block: B:79:0x02af A[PHI: r9 r11
      0x02af: PHI (r9v3 long) = (r9v1 long), (r9v1 long), (r9v2 long), (r9v1 long) binds: [B:78:0x02ad, B:58:0x01f2, B:23:0x00aa, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r11v3 long) = (r11v1 long), (r11v1 long), (r11v2 long), (r11v1 long) binds: [B:78:0x02ad, B:58:0x01f2, B:23:0x00aa, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m7721(int i, long j) {
        int iM11306;
        int i2;
        int i3;
        long j2 = 0;
        long jM3398 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i4 = 1563438293;
        int i5 = C1066.f4915;
        int i6 = C2642.f10294;
        int iM11307 = (ThreadFactoryC3888.m11306("ᩴ۫") ^ i6) * (-121);
        int i7 = ((iM11307 ^ i5) * 7335) ^ (-1212541840);
        int i8 = iM11307 ^ 1124075541;
        long j6 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * (-8763)) >> 31));
            switch (i4) {
                case -1977371733:
                case 142904127:
                    if (j == j6) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ֫") + i5) * (-99);
                        i2 = ((iM11306 ^ i6) * 22433) ^ (-1311336717);
                        i3 = 1014548177;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * 18681) ^ (-1328798103);
                        i3 = 1712355678;
                    }
                    int i9 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i9;
                    break;
                case -1709403769:
                case 704156705:
                    if (C2871.f10837 >= 0) {
                        iM11306 = C19806.m45029("ܰܿ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 27611) ^ (-261636463);
                        i3 = 948653811;
                    } else {
                        iM11306 = (C19806.m45029("֫۟") + i5) * 101;
                        i2 = ((iM11306 ^ i6) * 24401) ^ (-1736584794);
                        i3 = 423503501;
                    }
                    int i10 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i10;
                    break;
                case -1684047092:
                case 1143002296:
                    return j6;
                case -1648393356:
                case 1608759542:
                    if (C0962.m3746() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                        i3 = 812920917;
                    } else {
                        iM11306 = C19806.m45029("ۜۤ") ^ i5;
                        i2 = ((iM11306 ^ i6) * (-9375)) ^ 2131858682;
                        i3 = 983876119;
                    }
                    int i11 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i11;
                    break;
                case -1621832340:
                case 1620119563:
                    C2124.m6673();
                    iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                    i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                    i3 = 812920917;
                    int i12 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i12;
                    break;
                case -1567673775:
                case 741113019:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                        i3 = 812920917;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۧܿ")) * (-87);
                        i2 = ((iM11306 ^ i6) * 29547) ^ 1959700247;
                        i3 = -1331398734;
                    }
                    int i13 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i13;
                    break;
                case -1515837381:
                case 1593521924:
                    C2642.m8171();
                    if (C1377.m4833() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * (-30305)) ^ (-314340718);
                        i3 = -2134050327;
                    } else {
                        iM11306 = C19806.m45029("ܰܿ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 27611) ^ (-261636463);
                        i3 = 948653811;
                    }
                    int i14 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i14;
                    break;
                case -1304777897:
                case 1595420913:
                    j6 = 0;
                    if (i == 0) {
                        iM11306 = C19806.m45029("۠֨") ^ i5;
                        i2 = ((iM11306 ^ i6) * (-25665)) ^ 143796208;
                        i3 = -274776051;
                    } else {
                        iM11306 = C19806.m45029("ۚ᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * 18681) ^ (-1328798103);
                        i3 = 1712355678;
                    }
                    int i15 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i15;
                    break;
                case -1248521510:
                case 1563918738:
                    C3722.m10894();
                    if (C0216.f1393 == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * (-30305)) ^ (-314340718);
                        i3 = -2134050327;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i6) * 49;
                        i2 = ((iM11306 ^ i5) * 30733) ^ 1248026242;
                        i3 = 155945674;
                    }
                    int i16 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i16;
                    break;
                case -843343942:
                case 178098903:
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * (-30305)) ^ (-314340718);
                        i3 = -2134050327;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ۫") ^ i6;
                        i2 = ((iM11306 ^ i5) * 21875) ^ (-1276784829);
                        i3 = 912471304;
                    }
                    int i17 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i17;
                    break;
                case -817574029:
                case 1881812015:
                    if (i > 0) {
                        iM11306 = C19806.m45029("ܿ᩹") ^ i6;
                        i2 = ((iM11306 ^ i5) * (-19345)) ^ (-819457463);
                        i3 = 255570704;
                    } else {
                        jM3398 = j2;
                        iM11306 = (i6 - C19806.m45029("᩻۬")) * (-97);
                        i2 = ((iM11306 ^ i5) * (-30537)) ^ 2033441669;
                        i3 = 1798836976;
                    }
                    int i18 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i18;
                    break;
                case -570593772:
                case -523403465:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                        i3 = 812920917;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ۤ᩹")) * (-49);
                        i2 = ((iM11306 ^ i5) * (-2713)) ^ (-1414026514);
                        i3 = 1053825361;
                    }
                    int i19 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i19;
                    break;
                case -290262613:
                case 278934064:
                    if (i > 1048576) {
                        jM3398 = j2;
                        iM11306 = (i6 - C19806.m45029("᩻۬")) * (-97);
                        i2 = ((iM11306 ^ i5) * (-30537)) ^ 2033441669;
                        i3 = 1798836976;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۛ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM11306 ^ i6) * 629) ^ (-712711531);
                        i3 = -396704171;
                    }
                    int i110 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i110;
                    break;
                case -173068323:
                case 1818773703:
                    return C0817.m3398(jM3398, j);
                case 93124876:
                case 1647181062:
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                        i3 = 812920917;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩵") ^ i6;
                        i2 = ((iM11306 ^ i5) * (-30305)) ^ (-314340718);
                        i3 = -2134050327;
                    }
                    int i111 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i111;
                    break;
                case 129652508:
                case 843527174:
                    j3 = i;
                    j4 = 16;
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("ܰܿ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 27611) ^ (-261636463);
                        i3 = 948653811;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩸") ^ i5;
                        i2 = ((iM11306 ^ i6) * (-7487)) ^ 1369503467;
                        i3 = 1707098357;
                    }
                    int i112 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i112;
                    break;
                case 330051197:
                case 1227251992:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܺ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 14531) ^ (-1659058751);
                        i3 = 812920917;
                    } else {
                        iM11306 = (C19806.m45029("᩵ܶ") + i6) * 91;
                        i2 = ((iM11306 ^ i5) * (-6709)) ^ 1076785335;
                        i3 = 289862306;
                    }
                    int i113 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i113;
                    break;
                case 460528449:
                case 484457791:
                    return j2;
                case 518410541:
                case 1376343822:
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("ܰܿ") ^ i5;
                        i2 = ((iM11306 ^ i6) * 27611) ^ (-261636463);
                        i3 = 948653811;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۟") ^ i5) * (-79);
                        i2 = ((iM11306 ^ i6) * (-5933)) ^ 181903963;
                        i3 = -739398616;
                    }
                    int i114 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i114;
                    break;
                case 839975441:
                case 985286215:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i6) * 49;
                        i2 = ((iM11306 ^ i5) * 30733) ^ 1248026242;
                        i3 = 155945674;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") + i6) * 21;
                        i2 = ((iM11306 ^ i5) * 24537) ^ 92760053;
                        i3 = -936333993;
                    }
                    int i115 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i115;
                    break;
                case 883971009:
                case 2039213503:
                    j2 = C17492.FOREVER_NS;
                    if (j < j6) {
                        iM11306 = (i6 - C19806.m45029("ܰۜ")) * (-91);
                        i2 = ((iM11306 ^ i5) * (-6215)) ^ (-1977650730);
                        i3 = -545379641;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۙܶ")) * 7;
                        i2 = ((iM11306 ^ i6) * 29247) ^ 1158380239;
                        i3 = -1204482632;
                    }
                    int i116 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i116;
                    break;
                case 1075844366:
                case 2145499745:
                    jM3398 = C0817.m3398(32L, j5);
                    iM11306 = (i6 - C19806.m45029("᩻۬")) * (-97);
                    i2 = ((iM11306 ^ i5) * (-30537)) ^ 2033441669;
                    i3 = 1798836976;
                    int i117 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i117;
                    break;
                case 1439220992:
                case 2069268812:
                    RunnableC1895.m6170();
                    ThreadFactoryC3888.m11300();
                    return 0L;
                default:
                    j5 = j3 * j4;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i5 - C19806.m45029("ۙܳ")) * (-21);
                        i2 = ((iM11306 ^ i6) * 28025) ^ 1129485481;
                        i3 = 33862343;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") ^ i6) * (-89);
                        i2 = ((iM11306 ^ i5) * (-19897)) ^ (-1956670953);
                        i3 = 1123968680;
                    }
                    int i118 = i2;
                    i8 = iM11306 ^ i3;
                    i7 = i118;
                    break;
            }
        }
    }

    static {
        InterfaceC18745[] interfaceC18745Arr = null;
        int i = 221659764;
        int i2 = C2477.f9839;
        int i3 = C3535.f13026;
        int iM11306 = ThreadFactoryC3888.m11306("ۙۜ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 32561) ^ 1102201990;
        int i5 = -1688675430;
        while (true) {
            i = ((((i ^ i2) * 8615) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1774001682:
                case -335717706:
                    C10634.m26820();
                    C1189.m4368();
                    throw new RuntimeException();
                case -1357333977:
                case 386249779:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11165)) ^ 1475865186;
                        i5 = 1201582571;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢ֨")) * (-65);
                        i4 = ((iM11306 ^ i2) * 17573) ^ (-1078119938);
                        i5 = -1755542261;
                    }
                    break;
                case -1334865846:
                case 618889936:
                    if (C0671.m3008() >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ܿ")) * 17;
                        i4 = ((iM11306 ^ i3) * 22081) ^ 1790884253;
                        i5 = -445141388;
                    } else {
                        iM11306 = C19806.m45029("ܿۖ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 27675) ^ (-435870907);
                        i5 = -1088492410;
                    }
                    break;
                case -1150590121:
                case 2099196761:
                    if (C1398.m4895() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 325) ^ (-740135706);
                        i5 = 364641656;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11165)) ^ 1475865186;
                        i5 = 1201582571;
                    }
                    break;
                case -1150182779:
                case -42880532:
                    if (C3660.f13403 < 0) {
                        f9975 = new Object();
                        return;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                    i4 = ((iM11306 ^ i3) * 325) ^ (-740135706);
                    i5 = 364641656;
                    break;
                case -1146902104:
                case 559718523:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܺ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 31443) ^ (-2141045998);
                        i5 = -276640957;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܰ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-15061)) ^ (-836966142);
                        i5 = 346925418;
                    }
                    break;
                case -1019666670:
                case -994558810:
                    interfaceC18745Arr = new InterfaceC18745[0];
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 325) ^ (-740135706);
                        i5 = 364641656;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۨ") + i2) * (-101);
                        i4 = ((iM11306 ^ i3) * 14531) ^ (-890482280);
                        i5 = 343494588;
                    }
                    break;
                case -917994957:
                case -211665980:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܺ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 31443) ^ (-2141045998);
                        i5 = -276640957;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 325) ^ (-740135706);
                        i5 = 364641656;
                    }
                    break;
                case -722444641:
                case -69994993:
                    if (C1189.m4368() <= 0) {
                        iM11306 = C19806.m45029("᩻ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18035)) ^ 753422613;
                        i5 = -1183139642;
                    } else {
                        f9972 = new AtomicLong(1L);
                        if (C2477.f9839 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܳܺ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i4 = ((iM11306 ^ i2) * 31443) ^ (-2141045998);
                            i5 = -276640957;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۜ۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i4 = ((iM11306 ^ i2) * (-30229)) ^ (-2046541206);
                            i5 = -1370535861;
                        }
                    }
                    break;
                case 52152061:
                case 1703551186:
                    if (C2124.f7782 > 0) {
                        iM11306 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11165)) ^ 1475865186;
                        i5 = 1201582571;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ܿ")) * 17;
                        i4 = ((iM11306 ^ i3) * 22081) ^ 1790884253;
                        i5 = -445141388;
                    }
                    break;
                case 410941165:
                case 1061388343:
                    RunnableC0195.m1431();
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ܿ")) * 17;
                    i4 = ((iM11306 ^ i3) * 22081) ^ 1790884253;
                    i5 = -445141388;
                    break;
                case 614998924:
                case 1263447757:
                    f9976 = interfaceC18745Arr;
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ܿ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11165)) ^ 1475865186;
                        i5 = 1201582571;
                    } else {
                        iM11306 = C19806.m45029("ۖۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 10651) ^ (-1076280975);
                        i5 = -1530821965;
                    }
                    break;
                case 1058330028:
                case 1139592543:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֫ܿ")) * 17;
                        i4 = ((iM11306 ^ i3) * 22081) ^ 1790884253;
                        i5 = -445141388;
                    } else {
                        iM11306 = C19806.m45029("᩺ۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20033) ^ (-1271834235);
                        i5 = 2063631713;
                    }
                    break;
                default:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 325) ^ (-740135706);
                        i5 = 364641656;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17999)) ^ 1262578118;
                        i5 = -879651822;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x04b8 A[PHI: r2 r7 r16 r24 r28
      0x04b8: PHI (r2v11 long) = (r2v9 long), (r2v12 long) binds: [B:116:0x04b6, B:106:0x0418] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r7v13 l.ܺܰ᩹) = (r7v11 l.ܺܰ᩹), (r7v14 l.ܺܰ᩹) binds: [B:116:0x04b6, B:106:0x0418] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r16v10 long) = (r16v8 long), (r16v11 long) binds: [B:116:0x04b6, B:106:0x0418] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r24v11 l.ۖܰ᩹) = (r24v9 l.ۖܰ᩹), (r24v12 l.ۖܰ᩹) binds: [B:116:0x04b6, B:106:0x0418] A[DONT_GENERATE, DONT_INLINE]
      0x04b8: PHI (r28v17 byte[]) = (r28v15 byte[]), (r28v18 byte[]) binds: [B:116:0x04b6, B:106:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0247 A[PHI: r7 r18
      0x0247: PHI (r7v51 byte[]) = (r7v48 byte[]), (r7v49 byte[]), (r7v52 byte[]) binds: [B:69:0x0245, B:62:0x01fd, B:52:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r18v3 long) = (r18v1 long), (r18v2 long), (r18v1 long) binds: [B:69:0x0245, B:62:0x01fd, B:52:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        if (l.C7105.f23796 >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22710 m7776(l.C22710 r36, l.InterfaceC5614 r37) throws l.C1105 {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7776(l.᩺ۖ᩹, l.ۚ᩸ۘ):l.᩺ۖ᩹");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (l.C1460.f5948 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (l.C2704.m8255() <= 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2516(l.InterfaceC18745 r31, java.io.File r32) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.<init>(l.ᩴۨ᩹, java.io.File):void");
    }

    public C2516(C8868 c8868, C3284 c3284, C15986 c15986) {
        long andIncrement = 0;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        int i = 1340348071;
        int i2 = C0278.f1572;
        int i3 = C1398.f5802;
        int iM11306 = ThreadFactoryC3888.m11306("֫۬") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-25101)) ^ (-2106401406);
        int i5 = 545619505;
        while (true) {
            i = ((((i ^ i2) * (-11713)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2114255245:
                case -106995248:
                    this.f9982 = new ArrayDeque();
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                        i5 = -1433348678;
                    } else {
                        iM11306 = (C19806.m45029("ۤܺ") ^ i3) * (-85);
                        i4 = ((iM11306 ^ i2) * 1041) ^ (-216294166);
                        i5 = -1727297230;
                    }
                    break;
                case -1397027642:
                case -19153306:
                    if (!C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܳ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * 20567) ^ (-19894661);
                        i5 = 1054399801;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20809) ^ (-1316203730);
                        i5 = 1865838610;
                    }
                    break;
                case -1365038835:
                case -1015272932:
                    this.f9984 = identityHashMap;
                    identityHashMap2 = new IdentityHashMap();
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29419)) ^ (-1347172442);
                        i5 = -707902609;
                    } else {
                        iM11306 = C19806.m45029("᩺ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11357)) ^ (-1255481559);
                        i5 = 1442504793;
                    }
                    break;
                case -1179921543:
                case 1009591385:
                    C3722.m10894();
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20809) ^ (-1316203730);
                        i5 = 1865838610;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                        i5 = -1433348678;
                    }
                    break;
                case -1056590684:
                case 5765540:
                    this.f9981 = andIncrement;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                        i5 = -1433348678;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۨ᩺")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11306 ^ i2) * 18047) ^ (-1762338919);
                        i5 = -1425019832;
                    }
                    break;
                case -723921859:
                case 1549757662:
                    C0629.m2904(identityHashMap, c8868, Boolean.TRUE);
                    return;
                case -537146108:
                case 110830475:
                    C2477.m7593();
                    C0671.m3008();
                    throw new RuntimeException();
                case -220377014:
                case 113636653:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                        i5 = -1433348678;
                    } else {
                        this.f9988 = new ArrayDeque();
                        if (C3535.f13026 <= 0) {
                            iM11306 = C19806.m45029("ۚۤ") ^ i2;
                            i4 = ((iM11306 ^ i3) * (-16139)) ^ 2094931873;
                            i5 = 309431628;
                        } else {
                            iM11306 = C19806.m45029("ᩳ֨") ^ i2;
                            i4 = ((iM11306 ^ i3) * (-24101)) ^ (-132827274);
                            i5 = -1668334463;
                        }
                    }
                    break;
                case -178904359:
                case 105355099:
                    new C15986();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ܳ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * 20567) ^ (-19894661);
                        i5 = 1054399801;
                    } else {
                        iM11306 = C19806.m45029("۟ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 24759) ^ (-1969077971);
                        i5 = 1786742598;
                    }
                    break;
                case 194051437:
                case 235587566:
                    andIncrement = f9972.getAndIncrement();
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29419)) ^ (-1347172442);
                        i5 = -707902609;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩵ۧ")) * 19;
                        i4 = ((iM11306 ^ i3) * 15623) ^ (-1863346466);
                        i5 = -292394261;
                    }
                    break;
                case 252073313:
                case 585224912:
                    if (C0671.f2816 == 0) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29419)) ^ (-1347172442);
                        i5 = -707902609;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                        i5 = -1433348678;
                    }
                    break;
                case 682761611:
                case 1874726111:
                    identityHashMap = new IdentityHashMap();
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ۚۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16139)) ^ 2094931873;
                        i5 = 309431628;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֫۠")) * (-57);
                        i4 = ((iM11306 ^ i2) * 14761) ^ (-1532955642);
                        i5 = -959674155;
                    }
                    break;
                case 839715082:
                case 1097492824:
                    this.f9978 = c8868;
                    this.f9992 = c15986;
                    this.f9987 = c3284;
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("ܳ۟") + i2) * 123;
                        i4 = ((iM11306 ^ i3) * (-9513)) ^ 1243219463;
                        i5 = -62587268;
                    } else {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29419)) ^ (-1347172442);
                        i5 = -707902609;
                    }
                    break;
                case 1027362987:
                case 1143188307:
                    C1066.m4023();
                    C3743.m10966();
                    iM11306 = (ThreadFactoryC3888.m11306("᩸۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((iM11306 ^ i2) * (-10829)) ^ (-1001719891);
                    i5 = -1433348678;
                    break;
                default:
                    this.f9980 = identityHashMap2;
                    if (C2788.m8472() != 0) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29419)) ^ (-1347172442);
                        i5 = -707902609;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7255) ^ (-682407847);
                        i5 = -400396487;
                    }
                    break;
            }
        }
    }

    public final int length() {
        return this.f9987.m9777();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m7808() {
        return this.f9987.f12179;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m7804() {
        return this.f9987.f12178;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m7799() {
        return this.f9994;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0278 A[PHI: r43
      0x0278: PHI (r43v16 long) = (r43v15 long), (r43v17 long) binds: [B:71:0x025e, B:68:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        if (l.C2788.m8472() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        r43 = r34;
        r34 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (l.C3577.f13150 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0078, code lost:
    
        if (l.C0817.m3399() == false) goto L29;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m7720(int r55, int r56, int r57, int[] r58) {
        /*
            Method dump skipped, instruction units count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7720(int, int, int, int[]):long");
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m7717() {
        IdentityHashMap identityHashMap = null;
        Iterator itM943 = null;
        int i = -679657385;
        int i2 = C3722.f13525;
        int i3 = C10634.f36300;
        int iM45029 = C19806.m45029("᩶ۘ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 25423) ^ (-559133445);
        int i5 = 642963348;
        while (true) {
            i = ((((i ^ i2) * 24707) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1900323698:
                case -425614675:
                    C0278.m1789();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰۖ")) * 65;
                    i4 = ((iM45029 ^ i3) * (-6823)) ^ 96937161;
                    i5 = -1901826030;
                    break;
                case -1806480773:
                case -1722478371:
                    identityHashMap = this.f9980;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31927) ^ 1948797234;
                        i5 = 828301994;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-32323)) ^ 756470974;
                        i5 = 417094237;
                    }
                    break;
                case -1687563885:
                case 1226854169:
                    if (RunnableC1564.m5348(itM943)) {
                        iM45029 = (C19806.m45029("ۛ֫") ^ i3) * (-83);
                        i4 = ((iM45029 ^ i2) * 23523) ^ (-238601563);
                        i5 = -610380292;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21977) ^ 2114935636;
                        i5 = -742744739;
                    }
                    break;
                case -1615045030:
                case 791684449:
                    if (C1937.m6279() >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰۖ")) * 65;
                        i4 = ((iM45029 ^ i3) * (-6823)) ^ 96937161;
                        i5 = -1901826030;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28947)) ^ (-2008192263);
                        i5 = -576702299;
                    }
                    break;
                case -1439781412:
                case 1954526334:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-31);
                        i4 = ((iM45029 ^ i2) * 26129) ^ (-957265300);
                        i5 = -727166327;
                    } else {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2071)) ^ 1160014502;
                        i5 = 2028529170;
                    }
                    break;
                case -1115491970:
                case 1861640253:
                    itM943 = C0050.m943(C1377.m4828(identityHashMap));
                    iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") ^ i3) * 27;
                    i4 = ((iM45029 ^ i2) * 29715) ^ (-1907423703);
                    i5 = -1106780808;
                    break;
                case -961243619:
                case 2032877898:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31927) ^ 1948797234;
                        i5 = 828301994;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖᩳ") ^ i2) * 89;
                        i4 = ((iM45029 ^ i3) * 19571) ^ 1871175502;
                        i5 = -330570924;
                    }
                    break;
                case -940783999:
                case -863695786:
                    if (C0962.m3746() >= 0) {
                        iM45029 = C19806.m45029("ۗۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 569) ^ (-1516069887);
                        i5 = -1463994613;
                    } else {
                        iM45029 = C19806.m45029("ۖܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19643)) ^ (-236058917);
                        i5 = 1928569238;
                    }
                    break;
                case -902183549:
                case 6926697:
                    ((C11690) C0216.m1584(itM943)).f39305 = false;
                    iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") ^ i3) * 27;
                    i4 = ((iM45029 ^ i2) * 29715) ^ (-1907423703);
                    i5 = -1106780808;
                    break;
                case -447578949:
                case 40585145:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31927) ^ 1948797234;
                        i5 = 828301994;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩵") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM45029 ^ i2) * (-21985)) ^ 35115995;
                        i5 = 1260688032;
                    }
                    break;
                case -347403016:
                case 398004610:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 22203) ^ 1196584403;
                        i5 = -368757707;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰۖ")) * 65;
                        i4 = ((iM45029 ^ i3) * (-6823)) ^ 96937161;
                        i5 = -1901826030;
                    }
                    break;
                case -300513673:
                case -119610882:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 24643) ^ (-443361149);
                        i5 = 1359047902;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-31);
                        i4 = ((iM45029 ^ i2) * 26129) ^ (-957265300);
                        i5 = -727166327;
                    }
                    break;
                case -267310134:
                case -154898175:
                    identityHashMap.clear();
                    break;
                case -262830209:
                case 337643559:
                    if (!C3743.f13569) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ۤ")) * (-31);
                        i4 = ((iM45029 ^ i2) * 26129) ^ (-957265300);
                        i5 = -727166327;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 22203) ^ 1196584403;
                        i5 = -368757707;
                    }
                    break;
                case 174193192:
                case 741091695:
                    if (C3660.m10791() == 0) {
                        iM45029 = C19806.m45029("ۗۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 569) ^ (-1516069887);
                        i5 = -1463994613;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܰۖ")) * 65;
                        i4 = ((iM45029 ^ i3) * (-6823)) ^ 96937161;
                        i5 = -1901826030;
                    }
                    break;
                case 175484710:
                case 1575800040:
                    C0216.m1591();
                    C0629.m2907();
                    break;
                case 688296399:
                case 1634893189:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳᩴ") + i2) * (-127);
                        i4 = ((iM45029 ^ i3) * 22203) ^ 1196584403;
                        i5 = -368757707;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 5357) ^ 869236913;
                        i5 = 2041622905;
                    }
                    break;
                case 1300335062:
                case 1468878161:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 31927) ^ 1948797234;
                        i5 = 828301994;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛۗ")) * 87;
                        i4 = ((iM45029 ^ i2) * 5967) ^ (-71452818);
                        i5 = -2070848476;
                    }
                    break;
                default:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۘ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21831)) ^ (-777650429);
                        i5 = -562663602;
                    } else {
                        iM45029 = C19806.m45029("ۗۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 569) ^ (-1516069887);
                        i5 = -1463994613;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7760(C22710 c22710, C23747 c23747) {
        int iM11306;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = -815413807;
        int i3 = RunnableC3388.f12514;
        int i4 = AbstractC0464.f2088;
        int iM45029 = (C19806.m45029("ۢۤ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM45029 ^ i4) * 14399) ^ (-1087677657);
        int i6 = -1342886239;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-5339)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2058105171:
                    case 444290512:
                        if (C10634.f36300 < 0) {
                            iM45029 = C19806.m45029("֡ۜ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 7937) ^ (-287228785);
                            i6 = -215512850;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * (-43);
                        i5 = ((iM45029 ^ i4) * (-10457)) ^ (-1358797524);
                        i6 = 619773994;
                        break;
                    case -2052192315:
                    case 1919796376:
                        C3660.m10791();
                        C1398.m4895();
                        return false;
                    case -1991124293:
                    case -1185708008:
                        C0629.m2907();
                        if (C1066.f4915 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * (-43);
                            i5 = ((iM45029 ^ i4) * (-10457)) ^ (-1358797524);
                            i6 = 619773994;
                            break;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-61);
                        i5 = ((iM45029 ^ i4) * (-9459)) ^ (-506688614);
                        i6 = 731340188;
                        break;
                    case -1867117502:
                    case 1329972248:
                        return z;
                    case -1786997657:
                    case 446873644:
                        if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                            iM45029 = C19806.m45029("ۛ֡") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-1975)) ^ 698769269;
                            i6 = 1418367818;
                            break;
                        }
                        iM45029 = (i4 - C19806.m45029("᩷ۛ")) * 19;
                        i5 = ((iM45029 ^ i3) * (-16145)) ^ 1146716555;
                        i6 = -838937071;
                        break;
                    case -1721410308:
                    case 1894250455:
                        if (C1977.f7413 > 0) {
                            iM45029 = (C19806.m45029("ۜۨ") + i3) * 83;
                            i5 = ((iM45029 ^ i4) * 25165) ^ (-120472573);
                            i6 = 552524417;
                            break;
                        }
                        iM45029 = (i4 - C19806.m45029("᩹ۢ")) * (-41);
                        i5 = ((iM45029 ^ i3) * 28849) ^ 1485998174;
                        i6 = 1642511274;
                        break;
                    case -1644403039:
                    case -1584270491:
                        return z;
                    case -1584439718:
                    case 831137332:
                        if (c22710.f73969.f13401 != c23747) {
                            iM45029 = ThreadFactoryC3888.m11306("ۧ֡") ^ i4;
                            i5 = ((iM45029 ^ i3) * 9545) ^ 1539892421;
                            i6 = -88222391;
                            break;
                        }
                        iM45029 = C19806.m45029("ۘ᩻") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-17975)) ^ (-1068456217);
                        i6 = 787405488;
                        break;
                    case -1562396172:
                    case 734483107:
                        return z;
                    case -1546227144:
                    case 1485969579:
                        if (C0797.m3351(c22710)) {
                            iM11306 = C19806.m45029("֫ۧ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-29331)) ^ (-1773462054);
                            i = 1776822159;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("۠۫") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-9253)) ^ 649256249;
                            i = 821882432;
                        }
                        i7 = iM11306 ^ i;
                        z2 = true;
                        break;
                    case -1412738010:
                    case 1466018021:
                        return z2;
                    case -1359166476:
                    case -28515828:
                        if (!m7760(c22710.f73972, c23747)) {
                            iM45029 = C19806.m45029("۟֡") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-16097)) ^ (-2132617336);
                            i6 = 1936455453;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩸ᩳ") + i3) * 3;
                        i5 = ((iM45029 ^ i4) * 4615) ^ (-1449842180);
                        i6 = -1922209077;
                        break;
                    case -1326529108:
                    case 376691224:
                        return z2;
                    case -989481338:
                    case 972389390:
                        if (C1398.f5802 > 0) {
                            iM45029 = C19806.m45029("ۢܰ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 19349) ^ (-361053663);
                            i6 = -2113266507;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * 25;
                        i5 = ((iM45029 ^ i4) * 23837) ^ (-1557042625);
                        i6 = -2094437175;
                        break;
                    case -635727512:
                    case 2001467312:
                        z = false;
                        if (c22710 != null) {
                            iM45029 = C19806.m45029("֨֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * 3179) ^ 1971493403;
                            i6 = -72060897;
                            break;
                        }
                        iM45029 = (C19806.m45029("ܳ᩸") ^ i3) * 15;
                        i5 = ((iM45029 ^ i4) * 15581) ^ (-740849351);
                        i6 = -537125081;
                        break;
                    case -630687972:
                    case 1788515827:
                        if (!C1668.m5583()) {
                            iM45029 = (i4 - C19806.m45029("᩷ۛ")) * 19;
                            i5 = ((iM45029 ^ i3) * (-16145)) ^ 1146716555;
                            i6 = -838937071;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-14623)) ^ (-395770777);
                        i6 = 1142447056;
                        break;
                    case -314499272:
                    case 1187675961:
                        C1875.m6086();
                        if (C1937.f7317 < 0) {
                            iM45029 = (i4 - C19806.m45029("᩹ۢ")) * (-41);
                            i5 = ((iM45029 ^ i3) * 28849) ^ 1485998174;
                            i6 = 1642511274;
                            break;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * (-43);
                        i5 = ((iM45029 ^ i4) * (-10457)) ^ (-1358797524);
                        i6 = 619773994;
                        break;
                        break;
                    case 132038217:
                    case 2118665670:
                        if (C1937.m6279() < 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳܿ")) * (-65);
                            i5 = ((iM45029 ^ i3) * (-27675)) ^ (-2135490143);
                            i6 = -816101033;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * 25;
                        i5 = ((iM45029 ^ i4) * 23837) ^ (-1557042625);
                        i6 = -2094437175;
                        break;
                        break;
                    case 216596043:
                    case 1484153616:
                        if (C1398.f5802 > 0) {
                            iM45029 = C19806.m45029("֡ܺ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-16967)) ^ (-1961835183);
                            i6 = 1527116416;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * 25;
                        i5 = ((iM45029 ^ i4) * 23837) ^ (-1557042625);
                        i6 = -2094437175;
                        break;
                        break;
                    case 722049688:
                    case 1788209174:
                        if (!m7760(c22710.f73966, c23747)) {
                            iM45029 = (i4 - C19806.m45029("᩵᩺")) * (-93);
                            i5 = ((iM45029 ^ i3) * 18835) ^ 911477025;
                            i6 = 1977681028;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩸ᩳ") + i3) * 3;
                        i5 = ((iM45029 ^ i4) * 4615) ^ (-1449842180);
                        i6 = -1922209077;
                        break;
                        break;
                    case 1083886610:
                    case 1125317649:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = (C19806.m45029("ۘۜ") ^ i3) * (-31);
                            i5 = ((iM45029 ^ i4) * (-27687)) ^ (-725994153);
                            i6 = -950529161;
                            break;
                        }
                        iM45029 = (i4 - C19806.m45029("᩷ۛ")) * 19;
                        i5 = ((iM45029 ^ i3) * (-16145)) ^ 1146716555;
                        i6 = -838937071;
                        break;
                        break;
                    case 1109483590:
                    case 1831324682:
                        if (RunnableC1606.f6488 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ۫") + i4) * 97;
                            i5 = ((iM45029 ^ i3) * (-31045)) ^ 145592018;
                            i6 = 66206398;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-61);
                        i5 = ((iM45029 ^ i4) * (-9459)) ^ (-506688614);
                        i6 = 731340188;
                        break;
                        break;
                    case 1117092217:
                    case 1122559944:
                        C0629.m2907();
                        if (C10634.f36300 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * 25;
                            i5 = ((iM45029 ^ i4) * 23837) ^ (-1557042625);
                            i6 = -2094437175;
                            break;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * (-43);
                        i5 = ((iM45029 ^ i4) * (-10457)) ^ (-1358797524);
                        i6 = 619773994;
                        break;
                        break;
                    case 1363382011:
                    case 1597081005:
                        C3660.m10791();
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-61);
                        i5 = ((iM45029 ^ i4) * (-9459)) ^ (-506688614);
                        i6 = 731340188;
                        break;
                        break;
                    default:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * (-43);
                            i5 = ((iM45029 ^ i4) * (-10457)) ^ (-1358797524);
                            i6 = 619773994;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩹") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14623) ^ 1226305647;
                        i6 = -1056660097;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0218 A[PHI: r10 r11 r12 r16 r17
      0x0218: PHI (r10v6 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:23:0x008c, B:67:0x0216, B:63:0x01f4, B:59:0x01d4, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r11v6 byte[]) = (r11v3 byte[]), (r11v2 byte[]), (r11v2 byte[]), (r11v2 byte[]), (r11v2 byte[]) binds: [B:23:0x008c, B:67:0x0216, B:63:0x01f4, B:59:0x01d4, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r12v10 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:23:0x008c, B:67:0x0216, B:63:0x01f4, B:59:0x01d4, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r16v31 l.ۘۖ᩹) = (r16v2 l.ۘۖ᩹), (r16v8 l.ۘۖ᩹), (r16v9 l.ۘۖ᩹), (r16v10 l.ۘۖ᩹), (r16v32 l.ۘۖ᩹) binds: [B:23:0x008c, B:67:0x0216, B:63:0x01f4, B:59:0x01d4, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r17v30 l.᩺ۖ᩹) = (r17v2 l.᩺ۖ᩹), (r17v9 l.᩺ۖ᩹), (r17v10 l.᩺ۖ᩹), (r17v11 l.᩺ۖ᩹), (r17v31 l.᩺ۖ᩹) binds: [B:23:0x008c, B:67:0x0216, B:63:0x01f4, B:59:0x01d4, B:9:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02e2 A[PHI: r16 r17
      0x02e2: PHI (r16v12 l.ۘۖ᩹) = (r16v4 l.ۘۖ᩹), (r16v11 l.ۘۖ᩹), (r16v13 l.ۘۖ᩹) binds: [B:83:0x02e0, B:55:0x01b6, B:51:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r17v13 l.᩺ۖ᩹) = (r17v5 l.᩺ۖ᩹), (r17v12 l.᩺ۖ᩹), (r17v14 l.᩺ۖ᩹) binds: [B:83:0x02e0, B:55:0x01b6, B:51:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22710 m7734(l.C22710 r19, java.util.IdentityHashMap r20, l.C15986 r21) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7734(l.᩺ۖ᩹, java.util.IdentityHashMap, l.ܺܰ᩹):l.᩺ۖ᩹");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6750 m7728(C6750 c6750, File file) throws Throwable {
        boolean z;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AutoCloseable autoCloseable;
        IOException iOException;
        IOException iOException2;
        int iM45029;
        int i8;
        int iM11307;
        int i9;
        int iM11308;
        int i10;
        int iM11309;
        int i11;
        int i12;
        int iM450210;
        int i13;
        int i14;
        File file2 = file;
        InterfaceC5614 interfaceC5614M29777 = null;
        int length = 0;
        Iterator itM10563 = null;
        AutoCloseable autoCloseable2 = null;
        boolean zM5348 = false;
        IOException iOException3 = null;
        IOException iOException4 = null;
        Throwable th = null;
        C3658 c3658 = null;
        boolean zM9866 = false;
        boolean zM10564 = false;
        InterfaceC15280 interfaceC15280M42160 = null;
        InterfaceC15280 interfaceC15280 = null;
        int i15 = -804792045;
        int i16 = C1937.f7317;
        int i17 = C1668.f6641;
        int iM450211 = C19806.m45029("᩺᩹") ^ i17;
        int i18 = ((iM450211 ^ i16) * (-9839)) ^ 660658445;
        int i19 = iM450211 ^ (-1547149468);
        InterfaceC15280 interfaceC15281 = null;
        C6750 c6751 = null;
        int i20 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-12197)) >> 31));
            switch (i15) {
                case -2119181287:
                case -511261705:
                    file2 = file;
                    interfaceC15280M42160 = new C18807(length);
                    interfaceC15280 = interfaceC15281;
                    iM11308 = (C19806.m45029("ۜܽ") ^ i16) * 31;
                    i = ((iM11308 ^ i17) * 31943) ^ (-1246698148);
                    i10 = -1429844743;
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case -2072577137:
                case 154953325:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable = autoCloseable2;
                    z = zM5348;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM9866) {
                        iM45029 = (i17 - C19806.m45029("ۚ᩹")) * (-19);
                        i3 = ((iM45029 ^ i16) * 1969) ^ (-261901802);
                        i8 = 228822449;
                    } else {
                        iM45029 = (i16 - ThreadFactoryC3888.m11306("ܳۤ")) * (-79);
                        i3 = ((iM45029 ^ i17) * 28573) ^ 739342617;
                        i8 = 1001707764;
                    }
                    i5 = iM45029 ^ i8;
                    zM5348 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -2032754091:
                case 806688991:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    if (C3577.m10564(interfaceC5614M29777)) {
                        iM11308 = (C19806.m45029("ܶ֡") + i17) * (-23);
                        i = ((iM11308 ^ i16) * (-5673)) ^ (-42936242);
                        i10 = 66807537;
                    } else {
                        iM11308 = (i16 - C19806.m45029("֫ۙ")) * 91;
                        i = ((iM11308 ^ i17) * 29835) ^ 1022450533;
                        i10 = -1759803766;
                    }
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case -1978366006:
                case 1628745519:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    interfaceC15280M42160.finish();
                    c6750.m18253();
                    zM9866 = ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC5614M29777);
                    iM11306 = ThreadFactoryC3888.m11306("ۗ֨") ^ i17;
                    i3 = ((iM11306 ^ i16) * 6551) ^ 2021453671;
                    i4 = 319606433;
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1893295916:
                case 649997207:
                    AutoCloseable autoCloseable3 = autoCloseable2;
                    boolean z2 = zM5348;
                    int i21 = i20;
                    C13638.requireNonNull(file2, C1148.m4230(f9977, 503, 14, i21));
                    interfaceC15281 = null;
                    interfaceC5614M29777 = C11965.m29777(null);
                    length = c6750.length();
                    if (length <= 33554432) {
                        iM11309 = (C19806.m45029("ۜۨ") + i16) * 65;
                        i11 = ((iM11309 ^ i17) * (-15729)) ^ 454676272;
                        i12 = -352020506;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i17;
                        i11 = ((iM11309 ^ i16) * 23999) ^ (-1949776620);
                        i12 = 1436316891;
                    }
                    int i22 = iM11309 ^ i12;
                    i20 = i21;
                    autoCloseable2 = autoCloseable3;
                    i19 = i22;
                    i18 = i11;
                    zM5348 = z2;
                    break;
                case -1785238225:
                case 371454316:
                    if (interfaceC15280 != null) {
                        iM450210 = (C19806.m45029("۠ۗ") ^ i17) * 67;
                        i13 = ((iM450210 ^ i16) * (-26321)) ^ (-1032434804);
                        i14 = 1823584466;
                    } else {
                        iM450210 = (C19806.m45029("ۡ᩺") + i16) * 29;
                        i13 = ((iM450210 ^ i17) * (-26899)) ^ (-892454998);
                        i14 = 1809693731;
                    }
                    i19 = iM450210 ^ i14;
                    i18 = i13;
                    break;
                case -1685828908:
                case 884079812:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    int i23 = i20;
                    short s = f9977[502];
                    int i24 = (s * 2) + 1;
                    int i25 = s + 1;
                    if (i24 - (i25 * i25) <= 0) {
                        iM11307 = C19806.m45029("۟ۘ") ^ i16;
                        i = ((iM11307 ^ i17) * (-16713)) ^ (-719105595);
                        i9 = 108526532;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("֡ۚ") ^ i17) * (-65);
                        i = ((iM11307 ^ i16) * 21301) ^ 1383778152;
                        i9 = -710481687;
                    }
                    i2 = iM11307 ^ i9;
                    i20 = i23;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case -1485879852:
                case 1612398635:
                    throw new C1105();
                case -1335836429:
                case 488026746:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    ViewGroupOnHierarchyChangeListenerC1916.m6242(th, iOException3);
                    iM11306 = C19806.m45029("ۨܶ") ^ i17;
                    i3 = ((iM11306 ^ i16) * (-7415)) ^ (-858937402);
                    i4 = -662227538;
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -1275950981:
                case 331826316:
                    try {
                        interfaceC15280M42160.mo36593(c3658, interfaceC5614M29777);
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i16) * (-9);
                        i3 = ((iM11306 ^ i17) * (-3911)) ^ (-1340252264);
                        i4 = -1263075775;
                        i5 = iM11306 ^ i4;
                        zM5348 = zM5348;
                        autoCloseable2 = autoCloseable2;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException | Error | RuntimeException e) {
                        e = e;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        z = zM5348;
                        th = e;
                        autoCloseable2 = interfaceC15281;
                        int iM113010 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                        i19 = iM113010 ^ (-1281012533);
                        i18 = ((iM113010 ^ i16) * 6525) ^ (-12162334);
                        zM5348 = z;
                        interfaceC5614M29777 = interfaceC5614M29777;
                    }
                    file2 = file;
                    break;
                case -1210320572:
                case 394472050:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    AutoCloseable autoCloseable4 = autoCloseable2;
                    z = zM5348;
                    try {
                        C3658 c3659 = (C3658) C0216.m1584(itM10563);
                        try {
                            zM10564 = C3577.m10564(interfaceC5614M29777);
                            int iM450212 = C19806.m45029("ܿܳ") ^ i16;
                            i = ((iM450212 ^ i17) * 31731) ^ (-1287430841);
                            i2 = iM450212 ^ (-1067424343);
                            c3658 = c3659;
                            zM5348 = z;
                            autoCloseable2 = autoCloseable4;
                            file2 = file;
                            i19 = i2;
                            i18 = i;
                            interfaceC5614M29777 = interfaceC5614M29777;
                        } catch (IOException | Error | RuntimeException e2) {
                            e = e2;
                            c3658 = c3659;
                            th = e;
                            autoCloseable2 = interfaceC15281;
                            int iM113011 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                            i19 = iM113011 ^ (-1281012533);
                            i18 = ((iM113011 ^ i16) * 6525) ^ (-12162334);
                            zM5348 = z;
                            interfaceC5614M29777 = interfaceC5614M29777;
                            file2 = file;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Error e4) {
                        e = e4;
                    } catch (RuntimeException e5) {
                        e = e5;
                    }
                    break;
                case -1109858394:
                case 2057968232:
                    try {
                        autoCloseable = autoCloseable2;
                        z = zM5348;
                        try {
                            interfaceC5614M29777 = interfaceC5614M29777;
                            try {
                                iOException = iOException3;
                                iOException2 = iOException4;
                                try {
                                    c6751 = new C6750(c6750.f22764, c6750.f22761, c6750.f22766, C7893.m20845(interfaceC15280M42160), C9367.m24039(length, false));
                                    iM45029 = (i17 - ThreadFactoryC3888.m11306("ᩴ۠")) * 33;
                                    i3 = ((iM45029 ^ i16) * (-717)) ^ (-396527015);
                                    i8 = 335185212;
                                    i5 = iM45029 ^ i8;
                                    zM5348 = z;
                                    autoCloseable2 = autoCloseable;
                                    interfaceC5614M29777 = interfaceC5614M29777;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    i19 = i5;
                                    i18 = i3;
                                } catch (IOException e6) {
                                    e = e6;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c6751 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15281;
                                    int iM113012 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                                    i19 = iM113012 ^ (-1281012533);
                                    i18 = ((iM113012 ^ i16) * 6525) ^ (-12162334);
                                    zM5348 = z;
                                    interfaceC5614M29777 = interfaceC5614M29777;
                                } catch (Error e7) {
                                    e = e7;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c6751 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15281;
                                    int iM113013 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                                    i19 = iM113013 ^ (-1281012533);
                                    i18 = ((iM113013 ^ i16) * 6525) ^ (-12162334);
                                    zM5348 = z;
                                    interfaceC5614M29777 = interfaceC5614M29777;
                                } catch (RuntimeException e8) {
                                    e = e8;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c6751 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC15281;
                                    int iM113014 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                                    i19 = iM113014 ^ (-1281012533);
                                    i18 = ((iM113014 ^ i16) * 6525) ^ (-12162334);
                                    zM5348 = z;
                                    interfaceC5614M29777 = interfaceC5614M29777;
                                }
                            } catch (IOException e9) {
                                e = e9;
                            } catch (Error e10) {
                                e = e10;
                            } catch (RuntimeException e11) {
                                e = e11;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            interfaceC5614M29777 = interfaceC5614M29777;
                        } catch (Error e13) {
                            e = e13;
                            interfaceC5614M29777 = interfaceC5614M29777;
                        } catch (RuntimeException e14) {
                            e = e14;
                            interfaceC5614M29777 = interfaceC5614M29777;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        z = zM5348;
                    } catch (Error e16) {
                        e = e16;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        z = zM5348;
                    } catch (RuntimeException e17) {
                        e = e17;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        z = zM5348;
                    }
                    file2 = file;
                    break;
                case -1025093240:
                case 1781723358:
                    throw new C19950();
                case -934465302:
                case 1611443453:
                    try {
                        interfaceC15280.close();
                        iM450210 = (C19806.m45029("ᩴ᩷") + i17) * (-77);
                        i13 = ((iM450210 ^ i16) * 15191) ^ (-1367821020);
                        i14 = -2004074335;
                        i19 = iM450210 ^ i14;
                        i18 = i13;
                    } catch (IOException | Error | RuntimeException e18) {
                        th = e18;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        z = zM5348;
                        autoCloseable2 = c6751;
                        int iM113015 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                        i19 = iM113015 ^ (-1281012533);
                        i18 = ((iM113015 ^ i16) * 6525) ^ (-12162334);
                        zM5348 = z;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        file2 = file;
                    }
                    break;
                case -867063951:
                case 1493169402:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    z = zM5348;
                    IOException iOException5 = iOException3;
                    IOException iOException6 = iOException4;
                    try {
                        throw new C1105();
                    } catch (IOException | Error | RuntimeException e19) {
                        e = e19;
                        iOException3 = iOException5;
                        iOException4 = iOException6;
                        th = e;
                        autoCloseable2 = interfaceC15281;
                        int iM113016 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i17) * (-115);
                        i19 = iM113016 ^ (-1281012533);
                        i18 = ((iM113016 ^ i16) * 6525) ^ (-12162334);
                        zM5348 = z;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        file2 = file;
                    }
                    break;
                case -802344989:
                case -477969271:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    C0629.m2911(th, iOException4);
                    iM11306 = (C19806.m45029("ۛۤ") + i16) * 95;
                    i3 = ((iM11306 ^ i17) * (-15019)) ^ (-1359083994);
                    i4 = 572206126;
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -591614520:
                case 751237719:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    if (zM5348) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩷") + i17) * (-107);
                        i3 = ((iM11306 ^ i16) * 31091) ^ 919322919;
                        i4 = 412170562;
                    } else {
                        iM11306 = (i16 - ThreadFactoryC3888.m11306("ܽܽ")) * 123;
                        i3 = ((iM11306 ^ i17) * (-953)) ^ (-1567444539);
                        i4 = -922114379;
                    }
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case -569003093:
                case 1019091658:
                    throw new C1105();
                case -542520979:
                case 2108957370:
                    return c6751;
                case -410749337:
                case -316167330:
                    return c6751;
                case -305441424:
                case 742535688:
                    i20 = 46282;
                    iM11308 = (i16 - ThreadFactoryC3888.m11306("ۛ᩻")) * 57;
                    i = ((iM11308 ^ i17) * 30297) ^ 425970313;
                    i10 = 1518257618;
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case -83166149:
                case 1499190084:
                    throw th;
                case 48963616:
                case 819299894:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = RunnableC1564.m5348(itM10563);
                    int iM113017 = (ThreadFactoryC3888.m11306("ᩳ᩶") ^ i17) * (-9);
                    i3 = ((iM113017 ^ i16) * 25123) ^ 1112267876;
                    i5 = iM113017 ^ (-2139111565);
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 268354172:
                case 555707917:
                    itM10563 = C3577.m10563(C7893.m20859(c6750.f22763));
                    iM11306 = (ThreadFactoryC3888.m11306("ۘۢ") ^ i16) * (-9);
                    i3 = ((iM11306 ^ i17) * (-3911)) ^ (-1340252264);
                    i4 = -1263075775;
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 423508548:
                case 788295050:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    try {
                        interfaceC15280.close();
                        iM11306 = (C19806.m45029("ۛۤ") + i16) * 95;
                        i3 = ((iM11306 ^ i17) * (-15019)) ^ (-1359083994);
                        i4 = 572206126;
                        i5 = iM11306 ^ i4;
                        zM5348 = zM5348;
                        autoCloseable2 = autoCloseable2;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException e20) {
                        int iM450213 = (i16 - C19806.m45029("ۤܰ")) * (-53);
                        i6 = ((iM450213 ^ i17) * (-28087)) ^ 216005566;
                        i7 = iM450213 ^ (-777280990);
                        iOException4 = e20;
                        i18 = i6;
                        zM5348 = zM5348;
                        autoCloseable2 = autoCloseable2;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        i19 = i7;
                    }
                    file2 = file;
                    break;
                case 573061035:
                case 1598025581:
                    interfaceC15280M42160 = C18101.m42160(file2, length);
                    interfaceC15280 = interfaceC15280M42160;
                    iM11308 = (C19806.m45029("ۜܽ") ^ i16) * 31;
                    i = ((iM11308 ^ i17) * 31943) ^ (-1246698148);
                    i10 = -1429844743;
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case 735901456:
                case 1469688389:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable = autoCloseable2;
                    z = zM5348;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM10564) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۘ") ^ i17;
                        i3 = ((iM45029 ^ i16) * 20885) ^ (-1204280901);
                        i8 = -1413206699;
                    } else {
                        iM45029 = C19806.m45029("ۢ֨") ^ i16;
                        i3 = ((iM45029 ^ i17) * (-21421)) ^ (-965056021);
                        i8 = -126096665;
                    }
                    i5 = iM45029 ^ i8;
                    zM5348 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 1033329000:
                case 1203612081:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    if (autoCloseable2 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۖ") ^ i16;
                        i3 = ((iM11306 ^ i17) * (-15727)) ^ 673881172;
                        i4 = 710734176;
                    } else {
                        iM11306 = C19806.m45029("ۨܶ") ^ i17;
                        i3 = ((iM11306 ^ i16) * (-7415)) ^ (-858937402);
                        i4 = -662227538;
                    }
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 1341981823:
                case 1847573797:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    if (interfaceC15280 != null) {
                        iM11306 = (i17 - C19806.m45029("۬᩻")) * 83;
                        i3 = ((iM11306 ^ i16) * (-21991)) ^ (-1740630437);
                        i4 = 95598068;
                    } else {
                        iM11306 = (C19806.m45029("ۛۤ") + i16) * 95;
                        i3 = ((iM11306 ^ i17) * (-15019)) ^ (-1359083994);
                        i4 = 572206126;
                    }
                    i5 = iM11306 ^ i4;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    i19 = i5;
                    i18 = i3;
                    file2 = file;
                    break;
                case 1347420660:
                case 1554472911:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    c6750.m18253();
                    if (length <= 65536) {
                        iM11308 = (i17 - ThreadFactoryC3888.m11306("۟ۤ")) * (-15);
                        i = ((iM11308 ^ i16) * (-30265)) ^ (-1279654801);
                        i10 = -1636378365;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۖ۬") ^ i17;
                        i = ((iM11308 ^ i16) * 31641) ^ (-1445481406);
                        i10 = -934946524;
                    }
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                case 1470516664:
                case 1548344403:
                    i20 = 56992;
                    iM11308 = (i16 - ThreadFactoryC3888.m11306("ۛ᩻")) * 57;
                    i = ((iM11308 ^ i17) * 30297) ^ 425970313;
                    i10 = 1518257618;
                    i2 = iM11308 ^ i10;
                    zM5348 = zM5348;
                    autoCloseable2 = autoCloseable2;
                    i19 = i2;
                    i18 = i;
                    interfaceC5614M29777 = interfaceC5614M29777;
                    break;
                default:
                    interfaceC5614M29777 = interfaceC5614M29777;
                    autoCloseable2 = autoCloseable2;
                    zM5348 = zM5348;
                    try {
                        autoCloseable2.close();
                        iM11306 = C19806.m45029("ۨܶ") ^ i17;
                        i3 = ((iM11306 ^ i16) * (-7415)) ^ (-858937402);
                        i4 = -662227538;
                        i5 = iM11306 ^ i4;
                        zM5348 = zM5348;
                        autoCloseable2 = autoCloseable2;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        i19 = i5;
                        i18 = i3;
                    } catch (IOException e21) {
                        int iM450214 = (i16 - C19806.m45029("ۘᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM450214 ^ i17) * 21263) ^ (-2054550645);
                        i7 = iM450214 ^ (-1113177422);
                        iOException3 = e21;
                        i18 = i6;
                        zM5348 = zM5348;
                        autoCloseable2 = autoCloseable2;
                        interfaceC5614M29777 = interfaceC5614M29777;
                        i19 = i7;
                    }
                    file2 = file;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7745(InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap, IdentityHashMap identityHashMap2) {
        Boolean bool = null;
        InterfaceC18745[] interfaceC18745Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 248786421;
        int i3 = C1875.f7103;
        int i4 = C3577.f13150;
        int iM45029 = (C19806.m45029("֡ۡ") ^ i4) * (-23);
        int i5 = ((iM45029 ^ i3) * (-29477)) ^ 1548216128;
        int i6 = 601432418;
        while (true) {
            i2 = ((((i2 ^ i3) * 16059) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2040831658:
                case 1574974595:
                    if (C3286.m9798() > 0) {
                        iM45029 = (C19806.m45029("ܿ᩵") + i4) * (-23);
                        i5 = ((iM45029 ^ i3) * (-28445)) ^ (-178752368);
                        i6 = 1109438526;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۧ")) * 95;
                        i5 = ((iM45029 ^ i4) * 31267) ^ 1707546522;
                        i6 = -540760813;
                    }
                    break;
                case -1928038850:
                case 868707803:
                    C1419.m4973();
                    if (C0962.m3746() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23267) ^ 905198323;
                        i6 = 1835703335;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩵") + i4) * (-23);
                        i5 = ((iM45029 ^ i3) * (-28445)) ^ (-178752368);
                        i6 = 1109438526;
                    }
                    break;
                case -1896970812:
                case -470516164:
                    C1148.m4232();
                    if (RunnableC1606.m5473() == 0) {
                        iM45029 = C19806.m45029("۬ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11527)) ^ (-954675244);
                        i6 = -654930063;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۗۧ")) * 95;
                        i5 = ((iM45029 ^ i4) * 31267) ^ 1707546522;
                        i6 = -540760813;
                    }
                    break;
                case -1833566427:
                case 1640652477:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23267) ^ 905198323;
                        i6 = 1835703335;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ܺ") + i3) * 75;
                        i5 = ((iM45029 ^ i4) * (-12141)) ^ 1148194472;
                        i6 = 317564087;
                    }
                    break;
                case -1725846736:
                case -1324781574:
                    C0278.m1789();
                    break;
                case -1638276572:
                case 1686146126:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (C19806.m45029("ܿ᩵") + i4) * (-23);
                        i5 = ((iM45029 ^ i3) * (-28445)) ^ (-178752368);
                        i6 = 1109438526;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3717) ^ (-1023972439);
                        i6 = 142313013;
                    }
                    break;
                case -1327168363:
                case 804823358:
                    if (interfaceC18745 instanceof C18101) {
                        iM45029 = C19806.m45029("ۢۛ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25283) ^ 797064542;
                        i6 = -226426710;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۛ᩺")) * 83;
                        i5 = ((iM45029 ^ i3) * 12307) ^ (-532491165);
                        i6 = 1414094044;
                    }
                    break;
                case -1052665813:
                case 883419913:
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩹") + i4) * 33;
                        i5 = ((iM45029 ^ i3) * (-15659)) ^ 1135037523;
                        i6 = 387366382;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ۟") ^ i3) * 29;
                        i5 = ((iM45029 ^ i4) * 8097) ^ (-75577737);
                        i6 = 1197959524;
                    }
                    break;
                case -976986956:
                case -838474200:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i3 - C19806.m45029("ۗۧ")) * 95;
                        i5 = ((iM45029 ^ i4) * 31267) ^ 1707546522;
                        i6 = -540760813;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ۠") + i4) * (-63);
                        i5 = ((iM45029 ^ i3) * 30449) ^ (-582608641);
                        i6 = -1179075441;
                    }
                    break;
                case -971538390:
                case 855142457:
                    if (C1668.m5583()) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܰ")) * (-11);
                        i5 = ((iM45029 ^ i3) * (-30169)) ^ (-352732606);
                        i6 = -1920989962;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23267) ^ 905198323;
                        i6 = 1835703335;
                    }
                    break;
                case -966226165:
                case 1749851840:
                    ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap2, ((C18101) interfaceC18745).f57884, bool);
                    iM45029 = (i4 - C19806.m45029("ۛ᩺")) * 83;
                    i5 = ((iM45029 ^ i3) * 12307) ^ (-532491165);
                    i6 = 1414094044;
                    break;
                case -771028706:
                case 1384298613:
                    bool = Boolean.TRUE;
                    if (C0629.m2904(identityHashMap, interfaceC18745, bool) != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i3) * (-13);
                        i5 = ((iM45029 ^ i4) * 18315) ^ 1020246681;
                        i6 = 623583397;
                    } else {
                        iM45029 = (C19806.m45029("۫֡") ^ i3) * (-77);
                        i5 = ((iM45029 ^ i4) * 20219) ^ (-1756657523);
                        i6 = 1845241343;
                    }
                    break;
                case -726268240:
                case -492907457:
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ۡۖ") + i3) * (-67);
                        i5 = ((iM45029 ^ i4) * 8239) ^ 1902378797;
                        i6 = 359582836;
                    } else {
                        iM45029 = (C19806.m45029("ܿ᩵") + i4) * (-23);
                        i5 = ((iM45029 ^ i3) * (-28445)) ^ (-178752368);
                        i6 = 1109438526;
                    }
                    break;
                case -680383768:
                case 1919016176:
                    interfaceC18745Arr = ((C23747) interfaceC18745).f76833;
                    length = interfaceC18745Arr.length;
                    i = 0;
                    iM45029 = (i4 - C19806.m45029("ܺ۬")) * 19;
                    i5 = ((iM45029 ^ i3) * (-23087)) ^ 2016317173;
                    i6 = 1461409724;
                    break;
                case -473315958:
                case 1316291616:
                    if (C1398.m4895() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩹") + i4) * 33;
                        i5 = ((iM45029 ^ i3) * (-15659)) ^ 1135037523;
                        i6 = 387366382;
                    } else {
                        iM45029 = (C19806.m45029("֫᩹") ^ i4) * 21;
                        i5 = ((iM45029 ^ i3) * (-8983)) ^ 1960927199;
                        i6 = 1959506539;
                    }
                    break;
                case -179564221:
                case 639564558:
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("۬ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11527)) ^ (-954675244);
                        i6 = -654930063;
                    } else {
                        iM45029 = C19806.m45029("ܶۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-21921)) ^ 1826095224;
                        i6 = 624169959;
                    }
                    break;
                case -139317116:
                case 707895183:
                    if (i < length) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ᩸") ^ i4) * (-3);
                        i5 = ((iM45029 ^ i3) * 22233) ^ 1333077271;
                        i6 = 1869944954;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i3) * (-13);
                        i5 = ((iM45029 ^ i4) * 18315) ^ 1020246681;
                        i6 = 623583397;
                    }
                    break;
                case 379858016:
                case 1088679691:
                    m7745(interfaceC18745Arr[i], identityHashMap, identityHashMap2);
                    i++;
                    iM45029 = (i4 - C19806.m45029("ܺ۬")) * 19;
                    i5 = ((iM45029 ^ i3) * (-23087)) ^ 2016317173;
                    i6 = 1461409724;
                    break;
                case 393136197:
                case 726883047:
                    break;
                case 930976267:
                case 1431882671:
                    RunnableC3388.m10064();
                    iM45029 = (i3 - C19806.m45029("ۗۧ")) * 95;
                    i5 = ((iM45029 ^ i4) * 31267) ^ 1707546522;
                    i6 = -540760813;
                    break;
                case 1593731410:
                case 1904287453:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ܿ᩵") + i4) * (-23);
                        i5 = ((iM45029 ^ i3) * (-28445)) ^ (-178752368);
                        i6 = 1109438526;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 6877) ^ 1263809838;
                        i6 = 1313949314;
                    }
                    break;
                case 1648517952:
                case 1685477600:
                    if (interfaceC18745 instanceof C23747) {
                        iM45029 = C19806.m45029("ۛ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-20647)) ^ 496939008;
                        i6 = 1011082083;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢܽ") ^ i3) * (-13);
                        i5 = ((iM45029 ^ i4) * 18315) ^ 1020246681;
                        i6 = 623583397;
                    }
                    break;
                default:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩹") + i4) * 33;
                        i5 = ((iM45029 ^ i3) * (-15659)) ^ 1135037523;
                        i6 = 387366382;
                    } else {
                        iM45029 = C19806.m45029("᩺᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-24799)) ^ (-2018335416);
                        i6 = 1220871280;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C6750 m7729(l.C6750 r65, java.io.File r66, l.InterfaceC5614 r67) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7729(l.ۜۨ᩹, java.io.File, l.ۚ᩸ۘ):l.ۜۨ᩹");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m7783(InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC18745[] interfaceC18745Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 554869643;
        int i3 = C1668.f6641;
        int i4 = C1875.f7103;
        int iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵ܳ")) * (-35);
        int i5 = ((iM11306 ^ i3) * 32751) ^ (-808024004);
        int i6 = -298702339;
        while (true) {
            i2 = ((((i2 ^ i3) * 6335) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2127517120:
                case -1099112653:
                    z2 = true;
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷۫")) * q.h;
                    i5 = ((iM11306 ^ i4) * 23957) ^ (-1314066858);
                    i6 = -289005835;
                    break;
                case -2125097818:
                case 1907710893:
                    length = interfaceC18745Arr.length;
                    i = 0;
                    iM11306 = (i3 - C19806.m45029("֨֨")) * (-9);
                    i5 = ((iM11306 ^ i4) * 16171) ^ 1723576422;
                    i6 = 1309527607;
                    break;
                case -2089234011:
                case 1090187147:
                    if (C3577.f13150 < 0) {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۙ") ^ i3) * 115;
                        i5 = ((iM11306 ^ i4) * (-16753)) ^ 443905368;
                        i6 = -1193045147;
                    }
                    break;
                case -2003379704:
                case -1791032475:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ۗ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-6235)) ^ 757655972;
                        i6 = 556464750;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۛ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 31305) ^ (-298021188);
                        i6 = -1250614295;
                    }
                    break;
                case -1918652570:
                case 914965710:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 14849) ^ (-997331284);
                        i6 = 1654441955;
                    }
                    break;
                case -1597206490:
                case 465014634:
                    C0629.m2904(identityHashMap, interfaceC18745, C1148.m4221(z2));
                    return z2;
                case -1472731232:
                case 495769548:
                    if (C3286.f12186) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i4) * (-7101)) ^ 1595160870;
                        i6 = -747048368;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-17199)) ^ (-643574521);
                        i6 = -717176460;
                    }
                    break;
                case -1376943846:
                case 1528583700:
                    return C1460.m5058(Boolean.TRUE, bool);
                case -1290457265:
                case -1121295234:
                    C0278.m1789();
                    C7105.m18985();
                    iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                    i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                    i6 = 629856663;
                    break;
                case -1277644293:
                case 1301290590:
                    C1419.m4973();
                    return false;
                case -1131300125:
                case -668147156:
                    interfaceC18745Arr = ((C23747) interfaceC18745).f76833;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3009) ^ 514120948;
                        i6 = 1784969094;
                    }
                    break;
                case -1058966465:
                case 451013027:
                    if (identityHashMap.containsKey(interfaceC18745)) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23021) ^ (-1575076281);
                        i6 = 1189076168;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۜ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9957)) ^ (-593705405);
                        i6 = -1812177283;
                    }
                    break;
                case -902468109:
                case -553940520:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    } else {
                        iM11306 = C19806.m45029("ۧ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24891)) ^ 1355724747;
                        i6 = -600771095;
                    }
                    break;
                case -809185812:
                case 1047698459:
                    if (C2704.m8255() <= 0) {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩹") ^ i3) * 23;
                        i5 = ((iM11306 ^ i4) * (-20559)) ^ (-473053026);
                        i6 = -1437325022;
                    }
                    break;
                case -619997485:
                case 434940726:
                    if (interfaceC18745 instanceof C23747) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31991)) ^ (-917863667);
                        i6 = 1331090867;
                    } else {
                        z2 = z;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷۫")) * q.h;
                        i5 = ((iM11306 ^ i4) * 23957) ^ (-1314066858);
                        i6 = -289005835;
                    }
                    break;
                case -491141794:
                case 1081151956:
                    if (i < length) {
                        iM11306 = (C19806.m45029("ᩳ᩹") ^ i4) * 71;
                        i5 = ((iM11306 ^ i3) * (-22753)) ^ 1996793931;
                        i6 = 1212940678;
                    } else {
                        z2 = z;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷۫")) * q.h;
                        i5 = ((iM11306 ^ i4) * 23957) ^ (-1314066858);
                        i6 = -289005835;
                    }
                    break;
                case -169419924:
                case 1288959714:
                    if (C1461.m5080()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i4) * (-7101)) ^ 1595160870;
                        i6 = -747048368;
                    } else {
                        iM11306 = C19806.m45029("ۤۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-8073)) ^ 2133662846;
                        i6 = 2114899135;
                    }
                    break;
                case -145880992:
                case 571418899:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("᩵ۨ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 11931) ^ 1651795783;
                        i6 = -1266908498;
                    } else {
                        iM11306 = (C19806.m45029("ۧᩴ") + i4) * (-49);
                        i5 = ((iM11306 ^ i3) * 3029) ^ (-494424730);
                        i6 = 630636254;
                    }
                    break;
                case -107512457:
                case 1263191470:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i4) * (-7101)) ^ 1595160870;
                        i6 = -747048368;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩶") ^ i4) * 91;
                        i5 = ((iM11306 ^ i3) * 20003) ^ 1808123448;
                        i6 = -2025297713;
                    }
                    break;
                case 230695387:
                case 2026738123:
                    C0629.m2904(identityHashMap, interfaceC18745, Boolean.FALSE);
                    z = interfaceC18745 instanceof InterfaceC21567;
                    if (z) {
                        z2 = z;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷۫")) * q.h;
                        i5 = ((iM11306 ^ i4) * 23957) ^ (-1314066858);
                        i6 = -289005835;
                    } else {
                        iM11306 = C19806.m45029("᩺ܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-32539)) ^ 161130079;
                        i6 = -220298085;
                    }
                    break;
                case 306028446:
                case 587552034:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۗ۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-6235)) ^ 757655972;
                        i6 = 556464750;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i4) * (-7101)) ^ 1595160870;
                        i6 = -747048368;
                    }
                    break;
                case 416881619:
                case 791199570:
                    i++;
                    iM11306 = (i3 - C19806.m45029("֨֨")) * (-9);
                    i5 = ((iM11306 ^ i4) * 16171) ^ 1723576422;
                    i6 = 1309527607;
                    break;
                case 832725594:
                case 886484097:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("᩵ۨ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 11931) ^ 1651795783;
                        i6 = -1266908498;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-14917)) ^ 393138924;
                        i6 = -815547157;
                    }
                    break;
                case 910891018:
                case 1478068950:
                    bool = (Boolean) identityHashMap.get(interfaceC18745);
                    if (bool == null) {
                        iM11306 = C19806.m45029("ۤۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 12977) ^ 1188552587;
                        i6 = 1469793493;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 23021) ^ (-1575076281);
                        i6 = 1189076168;
                    }
                    break;
                case 1924399819:
                case 2026611438:
                    if (m7783(interfaceC18745Arr[i], identityHashMap)) {
                        iM11306 = C19806.m45029("֡᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-1969)) ^ 1043624809;
                        i6 = 373984811;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3929) ^ 1329155844;
                        i6 = -1004890176;
                    }
                    break;
                default:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿ۟")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i4) * (-7101)) ^ 1595160870;
                        i6 = -747048368;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩺ۜ")) * (-5);
                        i5 = ((iM11306 ^ i3) * 31163) ^ 32760439;
                        i6 = 629856663;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7757(C6750 c6750) {
        boolean z;
        int length = c6750.length();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C7893.m20866(c6750.f22763, identityHashMap);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        Iterator itM943 = C0050.m943(C0050.m941(identityHashMap));
        while (C0962.m3748(itM943)) {
            m7745((InterfaceC18745) C0216.m1584(itM943), identityHashMap2, identityHashMap3);
        }
        long jM20877 = C7893.m20877(c6750.f22763);
        synchronized (f9975) {
            C1873 c1873 = f9973;
            Iterator itM4831 = C1377.m4831(C1377.m4828(identityHashMap3));
            z = false;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (!C0962.m3748(itM4831)) {
                    break;
                }
                if (((C21629) C0216.m1584(itM4831)).f70147 != c1873) {
                    z3 = false;
                }
                z2 |= z3;
            }
            long j = length;
            if (jM20877 > j || (c1873 != null && z2 && c1873.f7096 > j)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22710 m7735(C22710 c22710, IdentityHashMap identityHashMap, C18101 c18101, InterfaceC5614 interfaceC5614) throws IOException {
        int iM45029;
        int i;
        C22710 c22711 = null;
        C22710 c22712 = null;
        C22710 c22710M7735 = null;
        C22710 c22710M7736 = null;
        C3658 c3658 = null;
        int i2 = -1223234111;
        int i3 = C0278.f1572;
        int i4 = RunnableC0195.f1321;
        int iM11306 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 27323) ^ (-1596413810);
        int i6 = -1694603071;
        while (true) {
            int i7 = iM11306 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 6595) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2075750065:
                    case -1663506395:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (ThreadFactoryC3888.m11300() <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 27283) ^ (-1716874226);
                            i6 = 1059380777;
                            break;
                        }
                        iM11306 = C19806.m45029("ۡ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                        i6 = 287903674;
                        break;
                    case -1877928677:
                    case -1192245092:
                        if (!C0797.f3386) {
                            iM11306 = C19806.m45029("᩻֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * 5383) ^ (-1442969342);
                            i6 = -346709299;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩹ۘ")) * (-77);
                        i5 = ((iM11306 ^ i3) * 32461) ^ (-69517469);
                        i6 = -675811939;
                        break;
                    case -1834997314:
                    case 1988611374:
                        return C7893.m20831(c22710M7735, c22710M7736);
                    case -1829465840:
                    case 636640478:
                        if (!C2332.f8260) {
                            iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 27283) ^ (-1716874226);
                            i6 = 1059380777;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ֫") ^ i3) * 61;
                        i5 = ((iM11306 ^ i4) * (-14439)) ^ (-710809813);
                        i6 = -1673217809;
                        break;
                    case -1817809879:
                    case 619690650:
                        if (c22710M7736 != c22711) {
                            iM11306 = C19806.m45029("֫ܽ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-17585)) ^ (-350254966);
                            i6 = 1810921659;
                            break;
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢۗ")) * (-125);
                        i5 = ((iM11306 ^ i4) * 27507) ^ 255494982;
                        i6 = 1207493790;
                        break;
                    case -1714705042:
                    case 2060389575:
                        if (C0629.f2722 > 0) {
                            iM11306 = (C19806.m45029("ܽ᩵") + i4) * 79;
                            i5 = ((iM11306 ^ i3) * (-12369)) ^ 1431162437;
                            i6 = -226762901;
                            break;
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸᩹")) * 55;
                        i5 = ((iM11306 ^ i4) * 15897) ^ (-543834169);
                        i6 = 709059156;
                        break;
                    case -1292106301:
                    case 1292398181:
                        C2642.m8171();
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩹ۘ")) * (-77);
                        i5 = ((iM11306 ^ i3) * 32461) ^ (-69517469);
                        i6 = -675811939;
                        break;
                        break;
                    case -1240578832:
                    case -1125719202:
                        c3658 = c22710.f73969;
                        if (!identityHashMap.containsKey(c3658.f13401)) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢۗ")) * (-125);
                            i5 = ((iM11306 ^ i4) * 27507) ^ 255494982;
                            i6 = 1207493790;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۧ᩶") + i3) * (-67);
                        i5 = ((iM11306 ^ i4) * 8919) ^ (-1461049923);
                        i6 = 1333697154;
                        break;
                    case -773176176:
                    case -501385810:
                        if (!C0797.m3359()) {
                            iM11306 = C19806.m45029("ۡ۫") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                            i6 = 287903674;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("ۢ۟") + i3) * 49;
                        i5 = ((iM11306 ^ i4) * (-8301)) ^ (-627303077);
                        i6 = -2046586182;
                        break;
                    case -726183459:
                    case -304113195:
                        if (!C1377.f5749) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("᩹ۘ")) * (-77);
                            i5 = ((iM11306 ^ i3) * 32461) ^ (-69517469);
                            i6 = -675811939;
                            break;
                            break;
                        }
                        iM11306 = (C19806.m45029("᩶ۗ") + i4) * (-117);
                        i5 = ((iM11306 ^ i3) * 9883) ^ 1915608158;
                        i6 = -1524314784;
                        break;
                    case -625592312:
                    case 950705713:
                        return c22710;
                    case -346668406:
                    case 115717244:
                        int iMo36593 = c18101.mo36593(c3658, interfaceC5614);
                        int i8 = c3658.f13400;
                        if (C2642.f10294 > 0) {
                            return C7893.m20844(new C3658(c18101, iMo36593, i8, null));
                        }
                        iM11306 = C19806.m45029("ۡ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                        i6 = 287903674;
                        break;
                        break;
                    case -165569748:
                    case 550024688:
                        if (!CallableC1627.f6528) {
                            iM11306 = C19806.m45029("ۡ۫") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                            i6 = 287903674;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("᩷֡") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18359)) ^ (-302370848);
                        i6 = -354099354;
                        break;
                    case -94005578:
                    case 1997548343:
                        boolean zM3862 = C1025.m3862(c22710);
                        C22710 c22713 = c22710.f73966;
                        C22710 c22714 = c22710.f73972;
                        if (zM3862) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨܿ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11305)) ^ (-1804401781);
                            i = 523495514;
                        } else {
                            iM45029 = (C19806.m45029("ۧۧ") ^ i3) * (-37);
                            i5 = ((iM45029 ^ i4) * (-5833)) ^ (-1783706071);
                            i = -20174544;
                        }
                        i7 = iM45029 ^ i;
                        c22711 = c22713;
                        c22712 = c22714;
                        break;
                    case 91350813:
                    case 1846576033:
                        C0526.m2437();
                        return null;
                    case 131320661:
                    case 2100384558:
                        if (C0050.f912 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("֨ۖ") + i3) * (-51);
                            i5 = ((iM11306 ^ i4) * (-7643)) ^ 1674981698;
                            i6 = -175024500;
                            break;
                        }
                        iM11306 = C19806.m45029("֡۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31973) ^ 896549265;
                        i6 = 664007287;
                        break;
                    case 575870085:
                    case 752991462:
                        if (C0050.f912 > 0) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸᩹")) * 55;
                            i5 = ((iM11306 ^ i4) * 15897) ^ (-543834169);
                            i6 = 709059156;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("ۡ۫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                        i6 = 287903674;
                        break;
                        break;
                    case 1130403917:
                    case 1964924550:
                        c22710M7735 = m7735(c22712, identityHashMap, c18101, interfaceC5614);
                        c22710M7736 = m7735(c22711, identityHashMap, c18101, interfaceC5614);
                        if (c22710M7735 != c22712) {
                            iM11306 = C19806.m45029("֫ܽ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-17585)) ^ (-350254966);
                            i6 = 1810921659;
                            break;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ֡") + i4) * (-83);
                        i5 = ((iM11306 ^ i3) * 2197) ^ (-511105196);
                        i6 = 1925352133;
                        break;
                    case 1228026687:
                    case 1949029489:
                        if (C1977.f7413 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۙܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 22223) ^ 413251500;
                            i6 = 1504746386;
                            break;
                        }
                        iM11306 = C19806.m45029("֡۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31973) ^ 896549265;
                        i6 = 664007287;
                        break;
                        break;
                    case 2040046526:
                    case 2098332520:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        if (C1460.f5948 >= 0) {
                            iM11306 = C19806.m45029("ۡ۫") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-3995)) ^ (-357575824);
                            i6 = 287903674;
                            break;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩹ۘ")) * (-77);
                        i5 = ((iM11306 ^ i3) * 32461) ^ (-69517469);
                        i6 = -675811939;
                        break;
                        break;
                    default:
                        if (RunnableC0195.f1321 < 0) {
                            iM11306 = C19806.m45029("᩸ۨ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 28317) ^ 1313302154;
                            i6 = 1916578227;
                            break;
                        }
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸᩹")) * 55;
                        i5 = ((iM11306 ^ i4) * 15897) ^ (-543834169);
                        i6 = 709059156;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m7780(InterfaceC18745[] interfaceC18745Arr, Throwable th) {
        int length = 0;
        int i = 0;
        InterfaceC18745 interfaceC18745 = null;
        IOException e = null;
        int i2 = 1249207467;
        int i3 = C2788.f10625;
        int i4 = C1025.f4800;
        int iM11306 = ThreadFactoryC3888.m11306("ۙ۟") ^ i3;
        int i5 = ((iM11306 ^ i4) * 32417) ^ (-1262803109);
        int i6 = 1173611333;
        while (true) {
            i2 = ((((i2 ^ i4) * 8271) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2137258597:
                case 218673378:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۚ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5075)) ^ (-1328363891);
                        i6 = -803777964;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5661) ^ (-1510206589);
                        i6 = -1225783729;
                    }
                    break;
                case -1877093707:
                case -1594426511:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    } else {
                        iM11306 = C19806.m45029("ܶ֨") ^ i3;
                        i5 = ((iM11306 ^ i4) * 5233) ^ 1023833710;
                        i6 = 767043657;
                    }
                    break;
                case -1856640656:
                case 1473055657:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("۟֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-30265)) ^ 1974343348;
                        i6 = 1768224844;
                    } else {
                        iM11306 = C19806.m45029("ۘܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-19531)) ^ 1700066592;
                        i6 = 926520072;
                    }
                    break;
                case -1763890544:
                case 1361477196:
                    i++;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i4;
                    i5 = ((iM11306 ^ i3) * (-2175)) ^ 1179858313;
                    i6 = 384382227;
                    break;
                case -1753405212:
                case -1272716933:
                    interfaceC18745 = interfaceC18745Arr[i];
                    iM11306 = C19806.m45029("ܶܿ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 12079) ^ (-116161264);
                    i6 = -2104876540;
                    break;
                case -1704835124:
                case -1012171150:
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    } else {
                        iM11306 = (C19806.m45029("۠ۧ") + i4) * 23;
                        i5 = ((iM11306 ^ i3) * (-18291)) ^ (-1311025367);
                        i6 = 783410347;
                    }
                    break;
                case -1201119790:
                case -994687434:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    } else {
                        iM11306 = C19806.m45029("᩸֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31355) ^ (-1172732169);
                        i6 = -2021669547;
                    }
                    break;
                case -1131755464:
                case 1641799377:
                    if (!C0817.f3443) {
                        iM11306 = C19806.m45029("ۚ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5075)) ^ (-1328363891);
                        i6 = -803777964;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    }
                    break;
                case -1084132876:
                case 1200803903:
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("᩶ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24135) ^ (-611696145);
                        i6 = 420570869;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫֨") ^ i4) * (-29);
                        i5 = ((iM11306 ^ i3) * 9113) ^ (-1919843324);
                        i6 = -1621613056;
                    }
                    break;
                case -970822794:
                case 100226659:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 4777) ^ 1245465609;
                        i6 = -545515988;
                    }
                    break;
                case -967304552:
                case -682032692:
                    if (i < length) {
                        iM11306 = C19806.m45029("ۙ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5773)) ^ (-399815426);
                        i6 = 1640883567;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֨֡")) * (-37);
                        i5 = ((iM11306 ^ i4) * 6535) ^ 2029859253;
                        i6 = -328748764;
                    }
                    break;
                case -912008060:
                case 1881025850:
                    C2124.m6673();
                    iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                    i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                    i6 = -342047429;
                    break;
                case -489184640:
                case 2044950419:
                    length = interfaceC18745Arr.length;
                    i = 0;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i4;
                    i5 = ((iM11306 ^ i3) * (-2175)) ^ 1179858313;
                    i6 = 384382227;
                    break;
                case -291428463:
                case -28785084:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("֡ܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 13579) ^ (-2077145516);
                        i6 = -655954038;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    }
                    break;
                case -128571475:
                case 464349240:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ֫") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-22803)) ^ 89742650;
                        i6 = -1862549488;
                    }
                    break;
                case -118127061:
                case 1827753438:
                    break;
                case 64925291:
                case 265115619:
                    C3286.m9798();
                    if (!RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("᩶ᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24135) ^ (-611696145);
                        i6 = 420570869;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * (-89);
                        i5 = ((iM11306 ^ i4) * 18801) ^ 632018063;
                        i6 = -342047429;
                    }
                    break;
                case 422521814:
                case 1715543166:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۚ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5075)) ^ (-1328363891);
                        i6 = -803777964;
                    } else {
                        iM11306 = C19806.m45029("ᩳᩳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 7021) ^ (-63396018);
                        i6 = 1787614530;
                    }
                    break;
                case 811887394:
                case 1379610626:
                    try {
                        C2249.m6913(interfaceC18745);
                        iM11306 = (C19806.m45029("᩷ܶ") + i4) * (-37);
                        i5 = ((iM11306 ^ i3) * (-3979)) ^ (-370156576);
                        i6 = -2064220586;
                    } catch (IOException e2) {
                        e = e2;
                        iM11306 = C19806.m45029("ۖۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22267) ^ 1732782392;
                        i6 = 58847862;
                    }
                    break;
                case 1078644900:
                case 2127025444:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = C19806.m45029("ۚ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-5075)) ^ (-1328363891);
                        i6 = -803777964;
                    } else {
                        iM11306 = (C19806.m45029("ۛܶ") + i3) * 43;
                        i5 = ((iM11306 ^ i4) * (-25477)) ^ (-1576654686);
                        i6 = 753738793;
                    }
                    break;
                case 1269965288:
                case 2144857403:
                    C3535.m10431();
                    break;
                default:
                    C0629.m2911(th, e);
                    iM11306 = (C19806.m45029("᩷ܶ") + i4) * (-37);
                    i5 = ((iM11306 ^ i3) * (-3979)) ^ (-370156576);
                    i6 = -2064220586;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0168 A[PHI: r18
      0x0168: PHI (r18v2 long) = (r18v0 long), (r18v3 long) binds: [B:45:0x0151, B:36:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02a0 A[PHI: r1 r10 r11
      0x02a0: PHI (r1v48 long) = (r1v12 long), (r1v17 long), (r1v47 long), (r1v49 long) binds: [B:78:0x029e, B:62:0x01fd, B:27:0x00c3, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r10v4 l.ۗܰ᩹) = (r10v1 l.ۗܰ᩹), (r10v1 l.ۗܰ᩹), (r10v3 l.ۗܰ᩹), (r10v1 l.ۗܰ᩹) binds: [B:78:0x029e, B:62:0x01fd, B:27:0x00c3, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02a0: PHI (r11v4 long) = (r11v2 long), (r11v2 long), (r11v3 long), (r11v2 long) binds: [B:78:0x029e, B:62:0x01fd, B:27:0x00c3, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m7755(ArrayDeque arrayDeque, C3284 c3284) {
        long j;
        int iM11306;
        int i;
        int i2;
        long j2;
        int iM45029;
        int i3;
        int i4;
        int iM11307;
        int i5;
        int i6;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10 = -274823932;
        int i11 = C1189.f5284;
        int i12 = C2249.f8050;
        int iM450210 = C19806.m45029("ܺ᩹") ^ i12;
        int i13 = ((iM450210 ^ i11) * 1831) ^ (-425690670);
        int i14 = iM450210 ^ 39428776;
        long j3 = 0;
        int size = 0;
        long j4 = 0;
        ArrayDeque arrayDeque2 = null;
        C3284 c3285 = null;
        boolean z = false;
        ArrayDeque arrayDeque3 = null;
        ArrayDeque arrayDeque4 = null;
        long j5 = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 20869) >> 31));
            switch (i10) {
                case -2077302635:
                case 1080812116:
                    arrayDeque.addLast(c3284);
                    j5 = this.f9985;
                    if (C1461.m5080()) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۖۙ") ^ i11) * (-109);
                        i5 = ((iM11307 ^ i12) * (-25373)) ^ 1910304651;
                        i6 = 1194246543;
                    } else {
                        iM11307 = C19806.m45029("᩺ۘ") ^ i12;
                        i5 = ((iM11307 ^ i11) * (-19991)) ^ 219333714;
                        i6 = -765688295;
                    }
                    i7 = i5;
                    i14 = iM11307 ^ i6;
                    i13 = i7;
                    break;
                case -2074905835:
                case 22147030:
                    j = j5;
                    if (this.f9985 > 67108864) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i12;
                        i = ((iM11306 ^ i11) * (-24881)) ^ 1956653845;
                        i2 = 1796345763;
                    } else {
                        iM11306 = (i12 - C19806.m45029("֡ܺ")) * 33;
                        i = ((iM11306 ^ i11) * (-31357)) ^ 894089169;
                        i2 = 934564510;
                    }
                    i14 = i2 ^ iM11306;
                    i13 = i;
                    j5 = j;
                    break;
                case -2038343802:
                case 1865210332:
                    C2704.m8255();
                    if (!C1977.m6356()) {
                        j = j5;
                        iM11308 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i12;
                        i8 = ((iM11308 ^ i11) * 327) ^ (-49696527);
                        i9 = 834145766;
                        i14 = iM11308 ^ i9;
                        i13 = i8;
                        j5 = j;
                    } else {
                        j2 = j5;
                        iM45029 = C19806.m45029("ܰۗ") ^ i11;
                        i3 = ((iM45029 ^ i12) * (-28179)) ^ (-1924066761);
                        i4 = -1577178010;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1905629095:
                case 855873360:
                    this.f9985 = j4 - j3;
                    j2 = j5;
                    z = true;
                    iM45029 = (i11 - ThreadFactoryC3888.m11306("ۡ᩷")) * (-33);
                    i3 = ((iM45029 ^ i12) * (-9929)) ^ (-967545857);
                    i4 = 310784126;
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1839206785:
                case 1025463059:
                    if (C3286.f12186) {
                        j2 = j5;
                        iM45029 = C19806.m45029("ᩴۧ") ^ i11;
                        i3 = ((iM45029 ^ i12) * 4185) ^ 1127496575;
                        i4 = 526997790;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    j2 = j5;
                    iM45029 = C19806.m45029("ܰۗ") ^ i11;
                    i3 = ((iM45029 ^ i12) * (-28179)) ^ (-1924066761);
                    i4 = -1577178010;
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -1786325413:
                case 1985128258:
                    j = j5;
                    arrayDeque4 = this.f9988;
                    size = arrayDeque4.size();
                    arrayDeque3 = this.f9982;
                    if (!C3286.f12186) {
                        iM11306 = (C19806.m45029("ۡ᩸") + i11) * (-103);
                        i = ((iM11306 ^ i12) * 14609) ^ 1782537329;
                        i2 = -1289602281;
                        i14 = i2 ^ iM11306;
                        i13 = i;
                        j5 = j;
                    } else {
                        j2 = j;
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i12;
                        i3 = ((iM45029 ^ i11) * (-5721)) ^ (-1009303035);
                        i4 = 1379894305;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1676508969:
                case 1869795086:
                    j = j5;
                    arrayDeque2 = arrayDeque == arrayDeque4 ? arrayDeque3 : arrayDeque4;
                    iM11306 = (i11 - C19806.m45029("ۡ֨")) * 53;
                    i = ((iM11306 ^ i12) * (-24473)) ^ 1132157665;
                    i2 = -2131178138;
                    i14 = i2 ^ iM11306;
                    i13 = i;
                    j5 = j;
                    break;
                case -1418610324:
                case -517089509:
                    j = j5;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ۠") ^ i12;
                        i = ((iM11306 ^ i11) * 26877) ^ (-759685190);
                        i2 = -1357809184;
                    } else {
                        arrayDeque2 = arrayDeque;
                        iM11306 = (i11 - C19806.m45029("ۡ֨")) * 53;
                        i = ((iM11306 ^ i12) * (-24473)) ^ 1132157665;
                        i2 = -2131178138;
                    }
                    i14 = i2 ^ iM11306;
                    i13 = i;
                    j5 = j;
                    break;
                case -1262441735:
                case 1611176127:
                    j = j5;
                    if (arrayDeque3.size() + size <= 1024) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۢ") ^ i11) * (-35);
                        i = ((iM11306 ^ i12) * 477) ^ (-1873097422);
                        i2 = 573821791;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܽ") ^ i12;
                        i = ((iM11306 ^ i11) * (-24881)) ^ 1956653845;
                        i2 = 1796345763;
                    }
                    i14 = i2 ^ iM11306;
                    i13 = i;
                    j5 = j;
                    break;
                case -1214326442:
                case -1201512412:
                    j = j5;
                    long j6 = c3285.f12180;
                    if (C1875.m6086() != 0) {
                        j3 = j6;
                        iM11308 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i12;
                        i8 = ((iM11308 ^ i11) * 327) ^ (-49696527);
                        i9 = 834145766;
                        i14 = iM11308 ^ i9;
                        i13 = i8;
                    } else {
                        int iM450211 = C19806.m45029("᩵֨") ^ i12;
                        j3 = j6;
                        i13 = ((iM450211 ^ i11) * 3601) ^ 1870548564;
                        i14 = iM450211 ^ 1309278437;
                    }
                    j5 = j;
                    break;
                case -1097861324:
                case 1878321246:
                    j = j5;
                    c3285 = (C3284) arrayDeque2.removeFirst();
                    j4 = this.f9985;
                    if (C3535.f13026 > 0) {
                        iM11308 = (i11 - ThreadFactoryC3888.m11306("ᩳ֫")) * (-21);
                        i8 = ((iM11308 ^ i12) * 14993) ^ 1884164270;
                        i9 = 1913918295;
                        i14 = iM11308 ^ i9;
                        i13 = i8;
                        j5 = j;
                    } else {
                        j2 = j;
                        iM45029 = C19806.m45029("ܰۗ") ^ i11;
                        i3 = ((iM45029 ^ i12) * (-28179)) ^ (-1924066761);
                        i4 = -1577178010;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    break;
                case -1073543060:
                case -83738392:
                    return z;
                case -1036383816:
                case -41421971:
                    j2 = j5;
                    if (C2477.m7593() < 0) {
                        iM45029 = (C19806.m45029("ۢۗ") ^ i11) * (-99);
                        i3 = ((iM45029 ^ i12) * (-18875)) ^ (-185211422);
                        i4 = -1276173524;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    j5 = j2;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖۙ") ^ i11) * (-109);
                    i5 = ((iM11307 ^ i12) * (-25373)) ^ 1910304651;
                    i6 = 1194246543;
                    i7 = i5;
                    i14 = iM11307 ^ i6;
                    i13 = i7;
                    break;
                case -896874407:
                case 1965455737:
                    if (C1377.m4833() != 0) {
                        j2 = j5;
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i12;
                        i3 = ((iM45029 ^ i11) * (-5721)) ^ (-1009303035);
                        i4 = 1379894305;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    } else {
                        j = j5;
                        iM11308 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i12;
                        i8 = ((iM11308 ^ i11) * 327) ^ (-49696527);
                        i9 = 834145766;
                        i14 = iM11308 ^ i9;
                        i13 = i8;
                        j5 = j;
                    }
                    break;
                case -776440848:
                case 1547273282:
                    C1460.m5050();
                    C1419.m4973();
                    j = j5;
                    iM11308 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i12;
                    i8 = ((iM11308 ^ i11) * 327) ^ (-49696527);
                    i9 = 834145766;
                    i14 = iM11308 ^ i9;
                    i13 = i8;
                    j5 = j;
                    break;
                case -455688917:
                case 382878415:
                    j2 = j5;
                    if (C0278.f1572 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۧ") ^ i12;
                        i3 = ((iM45029 ^ i11) * (-5721)) ^ (-1009303035);
                        i4 = 1379894305;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ۨ֫")) * q.h;
                        i3 = ((iM45029 ^ i12) * 20703) ^ (-1633119371);
                        i4 = -158142714;
                    }
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case -199196530:
                case 314310096:
                    j2 = j5;
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("ᩴۧ") ^ i11;
                        i3 = ((iM45029 ^ i12) * 4185) ^ 1127496575;
                        i4 = 526997790;
                    } else {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("ۧ֡")) * (-49);
                        i3 = ((iM45029 ^ i11) * (-1425)) ^ (-1062109262);
                        i4 = 1005924596;
                    }
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case 32597186:
                case 613381296:
                    j2 = j5;
                    if (C0050.f912 > 0) {
                        iM45029 = (i11 - C19806.m45029("֫᩷")) * (-47);
                        i3 = ((iM45029 ^ i12) * 1913) ^ 1871996831;
                        i4 = 707944252;
                        i7 = i3;
                        i14 = iM45029 ^ i4;
                        j5 = j2;
                        i13 = i7;
                    }
                    j5 = j2;
                    iM11307 = (ThreadFactoryC3888.m11306("ۖۙ") ^ i11) * (-109);
                    i5 = ((iM11307 ^ i12) * (-25373)) ^ 1910304651;
                    i6 = 1194246543;
                    i7 = i5;
                    i14 = iM11307 ^ i6;
                    i13 = i7;
                    break;
                case 219578621:
                case 657043288:
                    j2 = j5;
                    if (C3577.m10565()) {
                        iM45029 = (i12 - C19806.m45029("۠۬")) * (-119);
                        i3 = ((iM45029 ^ i11) * 27593) ^ (-1977090620);
                        i4 = 1713106549;
                    } else {
                        iM45029 = C19806.m45029("ܰۗ") ^ i11;
                        i3 = ((iM45029 ^ i12) * (-28179)) ^ (-1924066761);
                        i4 = -1577178010;
                    }
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case 305982696:
                case 1204196986:
                    j2 = j5;
                    this.f9985 = C2124.m6676(j2, c3284.f12180);
                    z = false;
                    iM45029 = (i11 - ThreadFactoryC3888.m11306("ۡ᩷")) * (-33);
                    i3 = ((iM45029 ^ i12) * (-9929)) ^ (-967545857);
                    i4 = 310784126;
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                case 1226485801:
                case 1737263644:
                    j2 = j5;
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ܰۗ") ^ i11;
                        i3 = ((iM45029 ^ i12) * (-28179)) ^ (-1924066761);
                        i4 = -1577178010;
                    } else {
                        iM45029 = C19806.m45029("ᩳ֡") ^ i12;
                        i3 = ((iM45029 ^ i11) * 10049) ^ 1740387345;
                        i4 = -2146727243;
                    }
                    i7 = i3;
                    i14 = iM45029 ^ i4;
                    j5 = j2;
                    i13 = i7;
                    break;
                default:
                    RunnableC0195.m1431();
                    C10634.m26820();
                    return false;
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44461. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C2516 m7726(l.C8868 r84, java.io.DataInput r85, l.C15621 r86) {
        /*
            Method dump skipped, instruction units count: 4446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7726(l.ۡۨ᩹, java.io.DataInput, l.ܺ֫ۚ):l.ۖۨ᩹");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x04af A[PHI: r17 r18
      0x04af: PHI (r17v47 l.֨ܰ᩹) = (r17v12 l.֨ܰ᩹), (r17v14 l.֨ܰ᩹), (r17v16 l.֨ܰ᩹), (r17v48 l.֨ܰ᩹) binds: [B:132:0x04ad, B:124:0x046c, B:116:0x0417, B:18:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x04af: PHI (r18v5 short[]) = (r18v3 short[]), (r18v3 short[]), (r18v4 short[]), (r18v3 short[]) binds: [B:132:0x04ad, B:124:0x046c, B:116:0x0417, B:18:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x050e A[PHI: r9 r10 r11 r12 r17
      0x050e: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:140:0x050c, B:128:0x048c, B:112:0x03f7, B:108:0x03d2] A[DONT_GENERATE, DONT_INLINE]
      0x050e: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:140:0x050c, B:128:0x048c, B:112:0x03f7, B:108:0x03d2] A[DONT_GENERATE, DONT_INLINE]
      0x050e: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:140:0x050c, B:128:0x048c, B:112:0x03f7, B:108:0x03d2] A[DONT_GENERATE, DONT_INLINE]
      0x050e: PHI (r12v3 short) = (r12v2 short), (r12v2 short), (r12v2 short), (r12v4 short) binds: [B:140:0x050c, B:128:0x048c, B:112:0x03f7, B:108:0x03d2] A[DONT_GENERATE, DONT_INLINE]
      0x050e: PHI (r17v18 l.֨ܰ᩹) = (r17v9 l.֨ܰ᩹), (r17v13 l.֨ܰ᩹), (r17v17 l.֨ܰ᩹), (r17v19 l.֨ܰ᩹) binds: [B:140:0x050c, B:128:0x048c, B:112:0x03f7, B:108:0x03d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0302 A[PHI: r17
      0x0302: PHI (r17v52 l.֨ܰ᩹) = (r17v27 l.֨ܰ᩹), (r17v56 l.֨ܰ᩹) binds: [B:85:0x02d0, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x033f A[PHI: r17
      0x033f: PHI (r17v31 l.֨ܰ᩹) = (r17v24 l.֨ܰ᩹), (r17v27 l.֨ܰ᩹), (r17v32 l.֨ܰ᩹) binds: [B:97:0x033d, B:85:0x02d0, B:207:0x033f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        if (l.C0962.f3784 != false) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7750(l.C22710 r21, l.InterfaceC18745 r22, java.util.HashMap r23, java.util.ArrayList r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7750(l.᩺ۖ᩹, l.ᩴۨ᩹, java.util.HashMap, java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m7807() {
        synchronized (this) {
            m7766();
            m7767();
            m7786();
            if (C0629.m2912(this.f9988)) {
                return false;
            }
            C3284 c3284 = (C3284) this.f9988.removeLast();
            this.f9985 -= c3284.f12180;
            boolean zM7755 = m7755(this.f9982, this.f9987.m9778(0L));
            long j = this.f9983 + 1;
            this.f9983 = j;
            this.f9987 = c3284.m9778(j);
            for (InterfaceC18745 interfaceC18745 : zM7755 ? m7784() : f9976) {
                try {
                    C3660.m10780(interfaceC18745);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m7805() {
        synchronized (this) {
            m7766();
            m7767();
            m7786();
            if (C0629.m2912(this.f9982)) {
                return false;
            }
            C3284 c3284 = (C3284) this.f9982.removeLast();
            this.f9985 -= c3284.f12180;
            boolean zM7755 = m7755(this.f9988, this.f9987.m9778(0L));
            long j = this.f9983 + 1;
            this.f9983 = j;
            this.f9987 = c3284.m9778(j);
            for (InterfaceC18745 interfaceC18745 : zM7755 ? m7784() : f9976) {
                try {
                    C3660.m10780(interfaceC18745);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m7778(C22710 c22710, ArrayList arrayList) {
        IdentityHashMap identityHashMap = null;
        ArrayDeque arrayDeque = null;
        C22710 c22711 = null;
        C22710 c22712 = null;
        InterfaceC18745 interfaceC18745 = null;
        C23747 c23747 = null;
        int i = -1740567181;
        int i2 = C7105.f23796;
        int i3 = C0278.f1572;
        int iM11306 = (ThreadFactoryC3888.m11306("ۡۚ") ^ i2) * 71;
        int i4 = ((iM11306 ^ i3) * 24003) ^ 273394212;
        int i5 = 1084908914;
        while (true) {
            i = ((((i ^ i3) * 29453) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2127610459:
                case 1849784975:
                    if (C1025.m3862(c22712)) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֨ܰ")) * (-109);
                        i4 = ((iM11306 ^ i3) * 19939) ^ 1015839962;
                        i5 = 1884235754;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩷ܰ")) * 81;
                        i4 = ((iM11306 ^ i3) * 1337) ^ 1127499812;
                        i5 = 430914352;
                    }
                    break;
                case -2006963349:
                case 1947030345:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18859)) ^ (-1009999194);
                        i5 = -726449459;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 3393) ^ (-985237875);
                        i5 = -598870703;
                    }
                    break;
                case -1924337368:
                case 135536744:
                    if (!C0629.m2912(arrayDeque)) {
                        c22712 = c22711;
                        iM11306 = (i3 - C19806.m45029("ۖ᩵")) * (-55);
                        i4 = ((iM11306 ^ i2) * 24543) ^ (-1079999108);
                        i5 = -1767572130;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܰۙ")) * 31;
                        i4 = ((iM11306 ^ i3) * 7837) ^ 296660216;
                        i5 = 824655958;
                    }
                    break;
                case -1859634768:
                case 1799255601:
                    identityHashMap = new IdentityHashMap();
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7445)) ^ (-115481337);
                        i5 = 1812178230;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۫ۜ")) * 77;
                        i4 = ((iM11306 ^ i3) * 6005) ^ 828791956;
                        i5 = 476246015;
                    }
                    break;
                case -1846688997:
                case -891022300:
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29831)) ^ (-43584728);
                        i5 = -635290512;
                    } else {
                        iM11306 = C19806.m45029("᩸ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3899)) ^ (-2068051793);
                        i5 = 1107772709;
                    }
                    break;
                case -1723400843:
                case 1448151636:
                    RunnableC3388.m10064();
                    break;
                case -1652127373:
                case -1053152696:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18123)) ^ (-732487103);
                        i5 = -2077154374;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩺᩵")) * (-21);
                        i4 = ((iM11306 ^ i3) * 6547) ^ 1710197525;
                        i5 = -937608988;
                    }
                    break;
                case -1573910771:
                case -1431704242:
                    if (C0962.f3784) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29831)) ^ (-43584728);
                        i5 = -635290512;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩺") ^ i2) * 41;
                        i4 = ((iM11306 ^ i3) * (-30101)) ^ 68839215;
                        i5 = -1804958823;
                    }
                    break;
                case -1545972465:
                case 297331091:
                    if (c22712 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29717)) ^ (-1324815660);
                        i5 = -1450928805;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩸") + i3) * (-53);
                        i4 = ((iM11306 ^ i2) * 5453) ^ 1255256329;
                        i5 = -1731102488;
                    }
                    break;
                case -1503191431:
                case 1090496454:
                    C0050.m946();
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18859)) ^ (-1009999194);
                        i5 = -726449459;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18123)) ^ (-732487103);
                        i5 = -2077154374;
                    }
                    break;
                case -1416889846:
                case 2130306156:
                    if (C0629.m2912(arrayDeque)) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܰۙ")) * 31;
                        i4 = ((iM11306 ^ i3) * 7837) ^ 296660216;
                        i5 = 824655958;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11667)) ^ 656373299;
                        i5 = -1463334695;
                    }
                    break;
                case -1374176744:
                case -515785204:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۙ") + i2) * (-57);
                        i4 = ((iM11306 ^ i3) * (-14535)) ^ 702841487;
                        i5 = -1967999632;
                    } else {
                        iM11306 = C19806.m45029("᩸ܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31647)) ^ (-2135735543);
                        i5 = -1210198549;
                    }
                    break;
                case -1288846996:
                case 666678429:
                    break;
                case -1287049045:
                case 286663494:
                    C1668.m5584(arrayDeque, c22712);
                    c22712 = c22712.f73972;
                    iM11306 = (i3 - C19806.m45029("ۖ᩵")) * (-55);
                    i4 = ((iM11306 ^ i2) * 24543) ^ (-1079999108);
                    i5 = -1767572130;
                    break;
                case -1259123390:
                case 2056475908:
                    interfaceC18745 = c22712.f73969.f13401;
                    if (interfaceC18745 instanceof C23747) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۤ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM11306 ^ i2) * (-5345)) ^ (-937270163);
                        i5 = 1210255320;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩸") + i3) * (-53);
                        i4 = ((iM11306 ^ i2) * 5453) ^ 1255256329;
                        i5 = -1731102488;
                    }
                    break;
                case -1138910488:
                case -909857001:
                    C3722.m10894();
                    C0962.m3746();
                    iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-18123)) ^ (-732487103);
                    i5 = -2077154374;
                    break;
                case -1039440133:
                case -535977210:
                    C1937.m6279();
                    if (C2477.m7593() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7445)) ^ (-115481337);
                        i5 = 1812178230;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18859)) ^ (-1009999194);
                        i5 = -726449459;
                    }
                    break;
                case -1014373831:
                case 72128568:
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29831)) ^ (-43584728);
                        i5 = -635290512;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11303) ^ (-361366508);
                        i5 = -216784641;
                    }
                    break;
                case -950664143:
                case 519079399:
                    C0216.m1591();
                    if (!C0817.f3443) {
                        iM11306 = (i2 - C19806.m45029("ۤ᩵")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-28125)) ^ (-1001011706);
                        i5 = 1794223573;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-7445)) ^ (-115481337);
                        i5 = 1812178230;
                    }
                    break;
                case -731994157:
                case 1023772182:
                    if (c22712 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6565) ^ 1736007854;
                        i5 = -1541016612;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("֨ܰ")) * (-109);
                        i4 = ((iM11306 ^ i3) * 19939) ^ 1015839962;
                        i5 = 1884235754;
                    }
                    break;
                case -358639646:
                case 2045491011:
                    if (C1066.m4023() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29831)) ^ (-43584728);
                        i5 = -635290512;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18123)) ^ (-732487103);
                        i5 = -2077154374;
                    }
                    break;
                case -212374102:
                case 963685945:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ۗۛ") ^ i3) * (-41);
                        i4 = ((iM11306 ^ i2) * 13959) ^ 430647795;
                        i5 = 726612948;
                    } else {
                        iM11306 = (C19806.m45029("᩶ܺ") ^ i3) * 85;
                        i4 = ((iM11306 ^ i2) * 13969) ^ 1140662863;
                        i5 = 1450909764;
                    }
                    break;
                case -25860659:
                case 1969047731:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18123)) ^ (-732487103);
                        i5 = -2077154374;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 2449) ^ (-170583746);
                        i5 = 377054574;
                    }
                    break;
                case 185507103:
                case 2112226335:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("ۗۛ") ^ i3) * (-41);
                        i4 = ((iM11306 ^ i2) * 13959) ^ 430647795;
                        i5 = 726612948;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14755)) ^ (-1348907891);
                        i5 = 1207859843;
                    }
                    break;
                case 353223923:
                case 556953619:
                    C3660.m10788(arrayList, c23747);
                    iM11306 = (C19806.m45029("ܳ᩸") + i3) * (-53);
                    i4 = ((iM11306 ^ i2) * 5453) ^ 1255256329;
                    i5 = -1731102488;
                    break;
                case 533443506:
                case 1364657931:
                    if (c22711 == null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۗ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8847)) ^ (-957487042);
                        i5 = -1875169703;
                    } else {
                        c22712 = c22711;
                        iM11306 = (i3 - C19806.m45029("ۖ᩵")) * (-55);
                        i4 = ((iM11306 ^ i2) * 24543) ^ (-1079999108);
                        i5 = -1767572130;
                    }
                    break;
                case 814850840:
                case 1707800903:
                    if (C3577.f13150 < 0) {
                        iM11306 = (i2 - C19806.m45029("ۤ᩵")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * (-28125)) ^ (-1001011706);
                        i5 = 1794223573;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ۬") + i3) * (-107);
                        i4 = ((iM11306 ^ i2) * 18753) ^ 1063482255;
                        i5 = -686969918;
                    }
                    break;
                case 987424827:
                case 1632135304:
                    if (c22710 == null) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ܰۙ")) * 31;
                        i4 = ((iM11306 ^ i3) * 7837) ^ 296660216;
                        i5 = 824655958;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫֡") + i3) * (-113);
                        i4 = ((iM11306 ^ i2) * (-3151)) ^ 1134922109;
                        i5 = -1793523038;
                    }
                    break;
                case 1072303564:
                case 1223088260:
                    c23747 = (C23747) interfaceC18745;
                    if (C0629.m2904(identityHashMap, c23747, Boolean.TRUE) == null) {
                        iM11306 = (i2 - C19806.m45029("᩵ۧ")) * 97;
                        i4 = ((iM11306 ^ i3) * 15967) ^ (-2052093242);
                        i5 = -1879534354;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩸") + i3) * (-53);
                        i4 = ((iM11306 ^ i2) * 5453) ^ 1255256329;
                        i5 = -1731102488;
                    }
                    break;
                case 1102817289:
                case 1518970134:
                    arrayDeque = new ArrayDeque();
                    c22711 = c22710;
                    iM11306 = C19806.m45029("ܰ֡") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-155)) ^ (-1987075132);
                    i5 = -1691109803;
                    break;
                case 1246981189:
                case 1654900468:
                    c22711 = ((C22710) arrayDeque.pop()).f73966;
                    iM11306 = C19806.m45029("ܰ֡") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-155)) ^ (-1987075132);
                    i5 = -1691109803;
                    break;
                default:
                    if (C2249.f8050 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۙ") + i2) * (-57);
                        i4 = ((iM11306 ^ i3) * (-14535)) ^ 702841487;
                        i5 = -1967999632;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-18859)) ^ (-1009999194);
                        i5 = -726449459;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C13807 m7800() {
        C13807 c13807;
        m7766();
        m7767();
        m7786();
        c13807 = new C13807(this, this.f9987, this.f9986, this.f9992.m37964());
        this.f9993 = c13807;
        return c13807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C13807 m7792(C15218 c15218) {
        C13807 c13807;
        short s = f9977[1061];
        int i = ((s * s) + 203319081) - (s * 28518) < 0 ? 40834 : 12123;
        synchronized (this) {
            m7766();
            m7767();
            m7786();
            C13638.requireNonNull(c15218, RunnableC1606.m5481(f9977, 1062, 8, i));
            c15218.m36428();
            if (c15218.f49629 != this.f9981) {
                throw new IllegalArgumentException(C0797.m3361(f9977, 1070, 36, i));
            }
            C3284 c3284 = this.f9987;
            if (c15218.f49626 != this.f9986 || c15218.m36426() != c3284.f12179 || c15218.f49628 != c3284.f12185 || c15218.f49633 != c3284.f12181) {
                throw new IllegalStateException(ViewTreeObserverOnPreDrawListenerC3327.m9869(f9977, 1106, 17, i));
            }
            m7802();
            c15218.m36424();
            c13807 = new C13807(this, c3284, this.f9986, this.f9992.m37964());
            this.f9993 = c13807;
        }
        return c13807;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0715 A[PHI: r2 r9 r23 r24 r40 r42
      0x0715: PHI (r2v17 java.util.IdentityHashMap) = (r2v5 java.util.IdentityHashMap), (r2v18 java.util.IdentityHashMap) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0715: PHI (r9v14 long) = (r9v5 long), (r9v15 long) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0715: PHI (r23v13 java.util.IdentityHashMap) = (r23v4 java.util.IdentityHashMap), (r23v14 java.util.IdentityHashMap) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0715: PHI (r24v13 long) = (r24v3 long), (r24v14 long) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0715: PHI (r40v15 long) = (r40v5 long), (r40v16 long) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0715: PHI (r42v15 long) = (r42v5 long), (r42v16 long) binds: [B:134:0x06fe, B:96:0x0492] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        if (l.RunnableC3388.f12514 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        r24 = r2;
        r23 = r9;
        r2 = r18;
        r9 = r36;
        r44 = r40;
        r40 = r42;
        r42 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (l.C1460.m5050() == 0) goto L35;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m7724(l.C22710 r46, l.C22710 r47) {
        /*
            Method dump skipped, instruction units count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7724(l.᩺ۖ᩹, l.᩺ۖ᩹):long");
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private C3284 m7716() throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -7443033;
        int i6 = RunnableC3388.f12514;
        int i7 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("ܺ֡") ^ i7) * 45;
        int i8 = ((iM11306 ^ i6) * 5709) ^ (-303388704);
        int i9 = -394693703;
        while (true) {
            i5 = ((((i5 ^ i6) * (-28427)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2111164328:
                case 1287468718:
                    C0050.m946();
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ۛᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-29085)) ^ (-1747092548);
                        i9 = 1521052964;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                        i9 = 1699824171;
                    }
                    break;
                case -1990659866:
                case 1548006925:
                    s = sArr[c];
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("᩸ᩳ") + i7) * (-105);
                        i8 = ((iM11306 ^ i6) * 29059) ^ (-1912763423);
                        i9 = -1124126723;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֡") ^ i7) * 123;
                        i8 = ((iM11306 ^ i6) * 5387) ^ 1018564728;
                        i9 = -991920994;
                    }
                    break;
                case -1757583412:
                case -78576172:
                    RunnableC3388.m10064();
                    return null;
                case -1675493066:
                case 721695654:
                    sArr = f9977;
                    if (C1937.m6279() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 32235) ^ 1105507955;
                        i9 = -759358611;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۢ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14731) ^ 1580858799;
                        i9 = 664823731;
                    }
                    break;
                case -1525289206:
                case 1173215545:
                    i4 = 29747;
                    iM11306 = (C19806.m45029("ᩳ֨") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM11306 ^ i6) * (-15649)) ^ (-1210346033);
                    i9 = -1325248395;
                    break;
                case -1435870225:
                case 1388594699:
                    i4 = 25502;
                    iM11306 = (C19806.m45029("ᩳ֨") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM11306 ^ i6) * (-15649)) ^ (-1210346033);
                    i9 = -1325248395;
                    break;
                case -1224348066:
                case 1811225864:
                    int i10 = s + s2;
                    if (i3 - (i10 * i10) >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩺") + i7) * 21;
                        i8 = ((iM11306 ^ i6) * 4501) ^ (-1115552459);
                        i9 = 128940317;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܺ") ^ i6) * (-41);
                        i8 = ((iM11306 ^ i7) * 20121) ^ 2034475568;
                        i9 = -199954610;
                    }
                    break;
                case -1180677254:
                case 64395938:
                    c = '3';
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                        i9 = 1699824171;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۛ᩺")) * (-57);
                        i8 = ((iM11306 ^ i6) * (-4347)) ^ 1690261087;
                        i9 = -1583749763;
                    }
                    break;
                case -1072235120:
                case -1012987134:
                    short[] sArr2 = f9977;
                    if (C1875.f7103 < 0 && C7105.f23796 < 0) {
                        throw new IOException(C1377.m4832(sArr2, 52, 21, i4));
                    }
                    iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                    i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                    i9 = 1699824171;
                    break;
                case -995528094:
                case 700803264:
                    if (!C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                        i9 = 1699824171;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۬") + i7) * (-107);
                        i8 = ((iM11306 ^ i6) * (-29877)) ^ (-1233027570);
                        i9 = 44103811;
                    }
                    break;
                case -25363922:
                case 1308457122:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ۚᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-7513)) ^ 1917650381;
                        i9 = 258625660;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۬") + i7) * (-107);
                        i8 = ((iM11306 ^ i6) * (-29877)) ^ (-1233027570);
                        i9 = 44103811;
                    }
                    break;
                case 127558205:
                case 2092405520:
                    if (this.f9994) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-24983)) ^ (-639321609);
                        i9 = -247530867;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i7;
                        i8 = ((iM11306 ^ i6) * 25677) ^ 1224545244;
                        i9 = -24063698;
                    }
                    break;
                case 265020770:
                case 937912820:
                    C1977.m6356();
                    C1377.m4833();
                    iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                    i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                    i9 = 1699824171;
                    break;
                case 388340197:
                case 645681722:
                    if (this.f9991) {
                        iM11306 = C19806.m45029("ܺ᩸") ^ i6;
                        i8 = ((iM11306 ^ i7) * 15983) ^ (-1582143247);
                        i9 = 1570701507;
                    } else {
                        iM11306 = C19806.m45029("֨᩺") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-7963)) ^ 1448594024;
                        i9 = -834189234;
                    }
                    break;
                case 651415644:
                case 1072180455:
                    i = s * s;
                    i2 = 77158656;
                    if (C3743.m10966() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֡") ^ i7) * 123;
                        i8 = ((iM11306 ^ i6) * 5387) ^ 1018564728;
                        i9 = -991920994;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۡۛ")) * (-105);
                        i8 = ((iM11306 ^ i7) * 19957) ^ 929946599;
                        i9 = 2081056753;
                    }
                    break;
                case 821800689:
                case 1028861565:
                    C10634.m26820();
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 32235) ^ 1105507955;
                        i9 = -759358611;
                    } else {
                        iM11306 = C19806.m45029("ۛᩴ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-29085)) ^ (-1747092548);
                        i9 = 1521052964;
                    }
                    break;
                case 834709846:
                case 1866398525:
                    short[] sArr3 = f9977;
                    if (AbstractC0464.f2088 > 0) {
                        if (C0817.m3399()) {
                            throw new IOException(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr3, 73, 33, i4));
                        }
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                        i9 = 1699824171;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۬") + i7) * (-107);
                        i8 = ((iM11306 ^ i6) * (-29877)) ^ (-1233027570);
                        i9 = 44103811;
                    }
                    break;
                case 1281373104:
                case 1328776321:
                    return this.f9987;
                default:
                    s2 = 8784;
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۨ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 17325) ^ 682276271;
                        i9 = 1699824171;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܺ") + i7) * 63;
                        i8 = ((iM11306 ^ i6) * 12479) ^ (-264959254);
                        i9 = 1655985651;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7797(C14575 c14575, C8868 c8868) throws C8599 {
        int i;
        InterfaceC18745[] interfaceC18745Arr;
        short s = f9977[1196];
        int i2 = ((s * s) + 138415225) - (s * 23530) >= 0 ? 12856 : 5900;
        String strM6685 = C2124.m6685(f9977, 1197, 20, i2);
        C1419.m4970(c14575);
        C1419.m4970(c8868);
        if (!c8868.mo2300()) {
            throw new C8599();
        }
        synchronized (this) {
            m7766();
            if (c14575.f47687 != this) {
                throw new IllegalArgumentException(C1189.m4365(f9977, 1217, 38, i2));
            }
            if (c14575.f47691 || this.f9990 != c14575) {
                throw new IllegalStateException(C10634.m26821(f9977, 1255, 24, i2));
            }
            if (this.f9984.containsKey(c8868)) {
                throw new IllegalArgumentException(C1025.m3859(f9977, 1279, 41, i2));
            }
            C3284 c3284 = this.f9987;
            if (c14575.f47689 != this.f9986 || c14575.f47688 != c3284 || c14575.f47688.f12185 != c3284.f12185 || c14575.f47688.f12181 != c3284.f12181 || c14575.f47688.f12179 != c3284.f12179) {
                throw new IllegalStateException(RunnableC1606.m5481(f9977, 1320, 19, i2));
            }
            if (c8868.length() != c3284.m9777()) {
                StringBuilder sb = new StringBuilder(strM6685);
                C0817.m3408(sb, c8868.length());
                C2788.m8480(sb, C1461.m5070(f9977, 1339, 20, i2));
                C0817.m3408(sb, c3284.m9777());
                throw new IllegalArgumentException(C2124.m6674(sb));
            }
            if (!c8868.mo2300()) {
                throw new C8599();
            }
            interfaceC18745Arr = (InterfaceC18745[]) C1377.m4828(this.f9984).toArray(new InterfaceC18745[0]);
            InterfaceC18745 interfaceC18745 = this.f9978;
            if (interfaceC18745 instanceof InterfaceC16422) {
                ((InterfaceC16422) interfaceC18745).mo23012();
            }
            this.f9984.clear();
            C0629.m2904(this.f9984, c8868, Boolean.TRUE);
            this.f9978 = c8868;
            this.f9992 = new C15986();
            this.f9988.clear();
            this.f9982.clear();
            this.f9985 = 0L;
            this.f9986++;
            m7717();
            C22710 c22710M20845 = C7893.m20845(c8868);
            C5838 c5838M24039 = C9367.m24039(c8868.length(), false);
            long j = this.f9983 + 1;
            this.f9983 = j;
            this.f9987 = new C3284(c22710M20845, c5838M24039, false, j, 0L, 0L, 0L, 0L, 0L);
            this.f9990 = null;
            c14575.f47691 = true;
        }
        try {
            c14575.f47690.close();
        } catch (IOException unused) {
        }
        for (InterfaceC18745 interfaceC18746 : interfaceC18745Arr) {
            try {
                C2249.m6913(interfaceC18746);
            } catch (IOException unused2) {
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C5838 m7727(java.io.DataInput r65, int r66, l.C5401 r67) {
        /*
            Method dump skipped, instruction units count: 3526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7727(java.io.DataInput, int, l.ۚܰ᩹):l.ۛۙ᩹");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7796(C14575 c14575) {
        short s = f9977[1133];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = i - (i2 * i2) <= 0 ? 25206 : 9663;
        synchronized (this) {
            if (c14575.f47687 != this) {
                throw new IllegalArgumentException(C1875.m6105(f9977, 1134, 38, i3));
            }
            if (c14575.f47691) {
                return;
            }
            if (this.f9990 == c14575) {
                this.f9990 = null;
            } else if (!this.f9991) {
                throw new IllegalStateException(ViewTreeObserverOnPreDrawListenerC3327.m9869(f9977, 1172, 24, i3));
            }
            c14575.f47691 = true;
            c14575.f47690.close();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m7781(long j) {
        long j2 = 0;
        long jM3398 = 0;
        int i = 705164818;
        int i2 = C1668.f6641;
        int i3 = C2871.f10837;
        int iM45029 = (C19806.m45029("᩹ܽ") ^ i2) * (-65);
        int i4 = ((iM45029 ^ i3) * (-6509)) ^ (-52161023);
        int i5 = -1310363679;
        while (true) {
            i = ((((i ^ i3) * (-26307)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2123649939:
                case -1444357728:
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6831)) ^ 249517730;
                        i5 = -1919276164;
                    } else {
                        iM45029 = C19806.m45029("ۖۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 965) ^ 119647797;
                        i5 = 1972716245;
                    }
                    break;
                case -1972293361:
                case 674309988:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31585)) ^ 1068148026;
                        i5 = 1773519000;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢۨ")) * 77;
                        i4 = ((iM45029 ^ i3) * (-20631)) ^ (-2062563012);
                        i5 = 249382568;
                    }
                    break;
                case -1899560738:
                case 75575612:
                    return true;
                case -1849670435:
                case -616223913:
                    if (!C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6831)) ^ 249517730;
                        i5 = -1919276164;
                    }
                    break;
                case -1672939382:
                case -381814617:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    } else {
                        iM45029 = (C19806.m45029("۫ۨ") ^ i3) * 73;
                        i4 = ((iM45029 ^ i2) * (-6511)) ^ (-296295667);
                        i5 = 781870589;
                    }
                    break;
                case -1153815611:
                case -322835728:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-4695)) ^ (-1771912953);
                        i5 = -110340273;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    }
                    break;
                case -973944414:
                case -501402174:
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۜ") ^ i3) * 49;
                        i4 = ((iM45029 ^ i2) * (-22519)) ^ (-835909139);
                        i5 = 1368667698;
                    }
                    break;
                case -949646691:
                case 1106836187:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    } else {
                        iM45029 = C19806.m45029("ܽۗ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6121)) ^ (-1671280527);
                        i5 = 1643403582;
                    }
                    break;
                case -763833616:
                case 293863295:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * 6069) ^ (-1132964081);
                        i5 = 1359034082;
                    } else {
                        iM45029 = C19806.m45029("ܿ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32299) ^ 288580740;
                        i5 = 742400218;
                    }
                    break;
                case -754668408:
                case 577408598:
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10269) ^ 948976263;
                        i5 = 1621651422;
                    } else {
                        iM45029 = C19806.m45029("֨ۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 23799) ^ (-846831499);
                        i5 = 1969712925;
                    }
                    break;
                case -220567014:
                case 950342670:
                    if (jM3398 <= 67108864) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܰ") ^ i2) * (-19);
                        i4 = ((iM45029 ^ i3) * 30245) ^ 491544125;
                        i5 = 1328109281;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 32593) ^ 121571607;
                        i5 = -1904922448;
                    }
                    break;
                case -137207957:
                case 448572825:
                    C1460.m5050();
                    return false;
                case 413020366:
                case 1005921828:
                    j2 = 8272;
                    if (C2124.m6673() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10269) ^ 948976263;
                        i5 = 1621651422;
                    } else {
                        iM45029 = C19806.m45029("ۙۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21111) ^ (-966761690);
                        i5 = 2118635302;
                    }
                    break;
                case 577462102:
                case 1366072095:
                    RunnableC3388.m10064();
                    if (RunnableC1606.m5473() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31585)) ^ 1068148026;
                        i5 = 1773519000;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10269) ^ 948976263;
                        i5 = 1621651422;
                    }
                    break;
                case 1015413218:
                case 1389123624:
                    return false;
                case 1063961387:
                case 1671429825:
                    ThreadFactoryC3888.m11300();
                    RunnableC1606.m5473();
                    iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                    i4 = ((iM45029 ^ i3) * 10269) ^ 948976263;
                    i5 = 1621651422;
                    break;
                case 1846961792:
                case 2145905084:
                    jM3398 = C0817.m3398(j, j2);
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6549) ^ 670817665;
                        i5 = -476289240;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۙ") ^ i3) * 115;
                        i4 = ((iM45029 ^ i2) * (-30629)) ^ (-1937308061);
                        i5 = -1847480944;
                    }
                    break;
                default:
                    if (C1460.m5050() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6831)) ^ 249517730;
                        i5 = -1919276164;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10269) ^ 948976263;
                        i5 = 1621651422;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e8 A[PHI: r5
      0x00e8: PHI (r5v3 l.᩻ܰ᩹) = (r5v2 l.᩻ܰ᩹), (r5v5 l.᩻ܰ᩹) binds: [B:37:0x00e6, B:33:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7754(Iterable iterable) {
        int iM45029;
        int i;
        ?? r8;
        int iM11306;
        int i2;
        ArrayDeque arrayDeque = null;
        Iterator itM4898 = null;
        InterfaceC18745 interfaceC18745 = null;
        boolean z = false;
        C23747 c23747 = null;
        InterfaceC18745[] interfaceC18745Arr = null;
        int length = 0;
        ?? r9 = 0;
        int i3 = -1479386984;
        int i4 = C2788.f10625;
        int i5 = C1875.f7103;
        int iM11307 = (ThreadFactoryC3888.m11306("ۜۛ") ^ i4) * 11;
        int i6 = ((iM11307 ^ i5) * (-20357)) ^ (-2016668636);
        int i7 = -1573450412;
        while (true) {
            int i8 = iM11307 ^ i7;
            IdentityHashMap identityHashMap = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 11867) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2072567153:
                    case -445559075:
                        C1066.m4023();
                        return false;
                    case -1995409483:
                    case 676972246:
                        return z;
                    case -1947210166:
                    case 841022166:
                        arrayDeque = new ArrayDeque();
                        itM4898 = C1398.m4898(iterable);
                        iM45029 = ThreadFactoryC3888.m11306("ۨܳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 589) ^ 305760409;
                        i = 921249452;
                        r9 = r9;
                        i8 = iM45029 ^ i;
                        break;
                    case -1827983593:
                    case -1334073751:
                        if (C1419.f5860 < 0) {
                            if (C3743.f13569) {
                                if (AbstractC0464.f2088 > 0) {
                                    if (C7105.f23796 < 0) {
                                        if (C1419.f5860 >= 0) {
                                            iM11307 = C19806.m45029("᩹ᩳ") ^ i5;
                                            i6 = ((iM11307 ^ i4) * 6449) ^ 1734481307;
                                            i7 = 1127006895;
                                            break;
                                        } else if (C1460.f5948 < 0) {
                                            if (C0629.m2907()) {
                                                identityHashMap = new IdentityHashMap();
                                                if (!RunnableC1564.f6300) {
                                                    iM45029 = C19806.m45029("ۖۙ") ^ i5;
                                                    i6 = ((iM45029 ^ i4) * (-3357)) ^ 841451700;
                                                    i = 1625171748;
                                                    r9 = r9;
                                                    i8 = iM45029 ^ i;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                                    i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                                    i7 = -328003612;
                                    break;
                                }
                            }
                            iM11307 = C19806.m45029("᩻֨") ^ i4;
                            i6 = ((iM11307 ^ i5) * (-21763)) ^ (-1685952513);
                            i7 = 778301390;
                            break;
                        }
                        iM11307 = C19806.m45029("ᩴ᩷") ^ i4;
                        i6 = ((iM11307 ^ i5) * 17421) ^ 559253125;
                        i7 = 799228653;
                        break;
                    case -1772910558:
                    case 1609224369:
                        if (interfaceC18745 instanceof C23747) {
                            iM11306 = ThreadFactoryC3888.m11306("ܳܺ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-15817)) ^ (-684763561);
                            i2 = 780746266;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۟ۙ") + i5) * 59;
                            i6 = ((iM11306 ^ i4) * 25799) ^ 2013340808;
                            i2 = 724623906;
                        }
                        i8 = iM11306 ^ i2;
                        z = false;
                        break;
                    case -1657917788:
                    case 1149732847:
                        interfaceC18745Arr = c23747.f76833;
                        length = interfaceC18745Arr.length;
                        r8 = z;
                        iM45029 = C19806.m45029("֫᩺") ^ i4;
                        i6 = ((iM45029 ^ i5) * 20071) ^ (-1368830808);
                        i = -23154440;
                        r9 = r8;
                        i8 = iM45029 ^ i;
                        break;
                    case -1524921990:
                    case 531813951:
                        if (interfaceC18745.mo2300()) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۡ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11703)) ^ (-462460309);
                            i = -217856517;
                            r9 = r9;
                        } else {
                            iM45029 = C19806.m45029("۟֨") ^ i5;
                            i6 = ((iM45029 ^ i4) * 15341) ^ 10239497;
                            i = 1646378673;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -1474388456:
                    case 1500703250:
                        if (C3535.m10431() > 0) {
                            iM11307 = C19806.m45029("ᩴ᩷") ^ i4;
                            i6 = ((iM11307 ^ i5) * 17421) ^ 559253125;
                            i7 = 799228653;
                        } else {
                            iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                            i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                            i7 = -328003612;
                        }
                        break;
                    case -1448847018:
                    case -414923229:
                        C1189.m4362(arrayDeque, interfaceC18745Arr[r9 == true ? 1 : 0]);
                        if (C1668.f6641 < 0) {
                            iM45029 = (C19806.m45029("ܰ֫") ^ i4) * (-55);
                            i6 = ((iM45029 ^ i5) * 31891) ^ (-1278230955);
                            i = 2028619529;
                            r9 = r9;
                            i8 = iM45029 ^ i;
                        } else {
                            iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                            i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                            i7 = -328003612;
                        }
                        break;
                    case -1339373633:
                    case 1654022019:
                        interfaceC18745 = (InterfaceC18745) arrayDeque.pop();
                        if (C3535.f13026 <= 0) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۘۜ")) * 109;
                            i6 = ((iM45029 ^ i4) * 1655) ^ (-524591422);
                            i = 1050660667;
                            r9 = r9;
                        } else {
                            iM45029 = C19806.m45029("᩹۠") ^ i4;
                            i6 = ((iM45029 ^ i5) * 6839) ^ (-745509229);
                            i = -1470299444;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -1101228322:
                    case 405925210:
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                            iM45029 = (C19806.m45029("᩹ۗ") + i4) * 15;
                            i6 = ((iM45029 ^ i5) * (-17661)) ^ 1893666019;
                            i = -114465390;
                            r9 = r9;
                        } else {
                            iM45029 = C19806.m45029("۟ۗ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-1585)) ^ 1858475249;
                            i = -1985505290;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -932650395:
                    case 728797185:
                        if (r9 < length) {
                            iM45029 = C19806.m45029("ۚܽ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 1345) ^ 481726381;
                            i = 208997933;
                            r9 = r9;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۡ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11703)) ^ (-462460309);
                            i = -217856517;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -736930466:
                    case 1880972158:
                        return true;
                    case -563603923:
                    case 1090943503:
                        C1668.m5584(arrayDeque, (InterfaceC18745) C0216.m1584(itM4898));
                        iM45029 = ThreadFactoryC3888.m11306("ۨܳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 589) ^ 305760409;
                        i = 921249452;
                        r9 = r9;
                        i8 = iM45029 ^ i;
                        break;
                    case -486076111:
                    case 1448664024:
                        if (RunnableC1564.m5348(itM4898)) {
                            iM45029 = (C19806.m45029("ᩳۢ") ^ i4) * (-125);
                            i6 = ((iM45029 ^ i5) * (-30471)) ^ (-261886188);
                            i = -874047036;
                            r9 = r9;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۡ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11703)) ^ (-462460309);
                            i = -217856517;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -172210390:
                    case 2108740509:
                        if (C0629.m2904(identityHashMap, interfaceC18745, Boolean.TRUE) != null) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ۡ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-11703)) ^ (-462460309);
                            i = -217856517;
                            r9 = r9;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳܺ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 24915) ^ (-829520057);
                            i = 2103550120;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -95492424:
                    case 151541669:
                        C0797.m3359();
                        iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                        i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                        i7 = -328003612;
                        break;
                    case -77122901:
                    case 1412334584:
                        c23747 = (C23747) interfaceC18745;
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6238(c23747.f76826) <= 0) {
                            iM45029 = C19806.m45029("۟֨") ^ i5;
                            i6 = ((iM45029 ^ i4) * 15341) ^ 10239497;
                            i = 1646378673;
                            r9 = r9;
                        } else {
                            iM45029 = C19806.m45029("֫ܿ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 8491) ^ (-2123733682);
                            i = -1855333427;
                            r9 = r9;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case 102765016:
                    case 1849270519:
                        if (C3660.f13403 < 0) {
                            iM11307 = C19806.m45029("᩹ᩳ") ^ i5;
                            i6 = ((iM11307 ^ i4) * 6449) ^ 1734481307;
                            i7 = 1127006895;
                        } else {
                            iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                            i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                            i7 = -328003612;
                        }
                        break;
                    case 238439241:
                    case 488100046:
                        RunnableC1895.m6170();
                        if (C3577.f13150 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 18307) ^ 1731161812;
                            i = -741464484;
                            r9 = r9;
                            i8 = iM45029 ^ i;
                        } else {
                            iM11307 = C19806.m45029("᩹ᩳ") ^ i5;
                            i6 = ((iM11307 ^ i4) * 6449) ^ 1734481307;
                            i7 = 1127006895;
                        }
                        break;
                    case 1091359841:
                    case 1899012060:
                        r8 = (r9 == true ? 1 : 0) + 1;
                        iM45029 = C19806.m45029("֫᩺") ^ i4;
                        i6 = ((iM45029 ^ i5) * 20071) ^ (-1368830808);
                        i = -23154440;
                        r9 = r8;
                        i8 = iM45029 ^ i;
                        break;
                    default:
                        if (C2788.f10625 >= 0) {
                            iM11307 = (C19806.m45029("᩸ᩴ") ^ i5) * (-5);
                            i6 = ((iM11307 ^ i4) * 3905) ^ (-1688820305);
                            i7 = -328003612;
                        }
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۘۜ")) * 109;
                        i6 = ((iM45029 ^ i4) * 1655) ^ (-524591422);
                        i = 1050660667;
                        r9 = r9;
                        i8 = iM45029 ^ i;
                        break;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f9991) {
                return;
            }
            C13807 c13807 = this.f9993;
            if (c13807 != null) {
                c13807.m33564();
            }
            IOException iOException = null;
            this.f9990 = null;
            this.f9991 = true;
            this.f9988.clear();
            this.f9982.clear();
            this.f9985 = 0L;
            m7717();
            InterfaceC18745[] interfaceC18745Arr = (InterfaceC18745[]) C0050.m941(this.f9984).toArray(new InterfaceC18745[0]);
            this.f9984.clear();
            for (InterfaceC18745 interfaceC18745 : interfaceC18745Arr) {
                try {
                    C2249.m6913(interfaceC18745);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        ViewGroupOnHierarchyChangeListenerC1916.m6242(iOException, e);
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7758(InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC18745[] interfaceC18745Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 1149134121;
        int i3 = C1148.f5161;
        int i4 = C2249.f8050;
        int iM45029 = (i4 - C19806.m45029("ܿ᩵")) * (-19);
        int i5 = ((iM45029 ^ i3) * 3847) ^ (-1616502877);
        int i6 = -874274535;
        while (true) {
            i2 = ((((i2 ^ i3) * (-17787)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2115178664:
                case -1420562698:
                    bool = (Boolean) identityHashMap.get(interfaceC18745);
                    if (bool == null) {
                        iM45029 = (C19806.m45029("ۘ᩻") ^ i3) * (-49);
                        i5 = ((iM45029 ^ i4) * (-13793)) ^ (-424792583);
                        i6 = 211631739;
                    } else {
                        iM45029 = (C19806.m45029("᩶ܰ") ^ i3) * 89;
                        i5 = ((iM45029 ^ i4) * (-28409)) ^ 911000155;
                        i6 = 193390243;
                    }
                    break;
                case -2113433209:
                case -1338282573:
                    if (identityHashMap.containsKey(interfaceC18745)) {
                        iM45029 = (C19806.m45029("᩶ܰ") ^ i3) * 89;
                        i5 = ((iM45029 ^ i4) * (-28409)) ^ 911000155;
                        i6 = 193390243;
                    } else {
                        iM45029 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7671) ^ 1592607178;
                        i6 = -1123863007;
                    }
                    break;
                case -2050965643:
                case -1939833778:
                    C2249.m6915();
                    return false;
                case -1893256779:
                case 554778117:
                    C2332.m7079();
                    iM45029 = C19806.m45029("᩵۟") ^ i3;
                    i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                    i6 = -93267560;
                    break;
                case -1882633330:
                case -1489802242:
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = C19806.m45029("֨᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15677)) ^ (-2078093722);
                        i6 = 398488201;
                    }
                    break;
                case -1877668271:
                case 1934636668:
                    if (C0797.m3359()) {
                        iM45029 = (C19806.m45029("ۧᩴ") ^ i4) * (-65);
                        i5 = ((iM45029 ^ i3) * (-10275)) ^ 223285099;
                        i6 = 694663648;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 1109) ^ 1513186414;
                        i6 = -512587388;
                    }
                    break;
                case -1868629295:
                case -387795715:
                    length = interfaceC18745Arr.length;
                    i = 0;
                    iM45029 = C19806.m45029("۟ܶ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 21035) ^ (-1793962396);
                    i6 = -1257752361;
                    break;
                case -1769373346:
                case 473277904:
                    if (m7758(interfaceC18745Arr[i], identityHashMap)) {
                        iM45029 = C19806.m45029("֨֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-6591)) ^ (-1363074658);
                        i6 = 109413831;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۬ᩳ")) * 35;
                        i5 = ((iM45029 ^ i4) * 7249) ^ 1275212365;
                        i6 = -717867496;
                    }
                    break;
                case -1725378102:
                case 2103492351:
                    C0629.m2904(identityHashMap, interfaceC18745, Boolean.FALSE);
                    z = interfaceC18745 instanceof C18101;
                    if (z) {
                        z2 = z;
                        iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12847)) ^ 564975440;
                        i6 = 2048001643;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-3895)) ^ 557010471;
                        i6 = -1543447483;
                    }
                    break;
                case -1605184328:
                case -213225846:
                    i++;
                    iM45029 = C19806.m45029("۟ܶ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 21035) ^ (-1793962396);
                    i6 = -1257752361;
                    break;
                case -1477537268:
                case -1315483524:
                    interfaceC18745Arr = ((C23747) interfaceC18745).f76833;
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 1109) ^ 1513186414;
                        i6 = -512587388;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡֨") ^ i3) * (-61);
                        i5 = ((iM45029 ^ i4) * 3037) ^ (-1573644353);
                        i6 = 2059663805;
                    }
                    break;
                case -1276284192:
                case 265529246:
                    if (C1937.m6279() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 1109) ^ 1513186414;
                        i6 = -512587388;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 24981) ^ (-2060645823);
                        i6 = -260493876;
                    }
                    break;
                case -1168361896:
                case 502071163:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ܽۢ") ^ i3) * (-87);
                        i5 = ((iM45029 ^ i4) * (-26505)) ^ (-1290693616);
                        i6 = 1357298133;
                    } else {
                        iM45029 = C19806.m45029("ۢܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-27633)) ^ 265200857;
                        i6 = 1099915942;
                    }
                    break;
                case -1166963685:
                case 1699853836:
                    C0629.m2904(identityHashMap, interfaceC18745, C1148.m4221(z2));
                    return z2;
                case -957980248:
                case -385872962:
                    z2 = true;
                    iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-12847)) ^ 564975440;
                    i6 = 2048001643;
                    break;
                case -921883865:
                case 1963432652:
                    if (C1460.f5948 < 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12031)) ^ 1854192617;
                        i6 = -2092057857;
                    }
                    break;
                case -893667065:
                case 1163512182:
                    if (i < length) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۨ") ^ i4) * 7;
                        i5 = ((iM45029 ^ i3) * (-3691)) ^ 1934247487;
                        i6 = 1586472346;
                    } else {
                        z2 = z;
                        iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12847)) ^ 564975440;
                        i6 = 2048001643;
                    }
                    break;
                case -715694024:
                case 1820190218:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 1109) ^ 1513186414;
                        i6 = -512587388;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۛ") + i4) * 89;
                        i5 = ((iM45029 ^ i3) * 28855) ^ 653126550;
                        i6 = -12607121;
                    }
                    break;
                case -677123543:
                case -541182118:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 24985) ^ 1862734983;
                        i6 = -813158699;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽۤ")) * (-63);
                        i5 = ((iM45029 ^ i4) * 30157) ^ (-843365484);
                        i6 = 1398830473;
                    }
                    break;
                case -622947483:
                case 267111132:
                    if (C7105.f23796 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 1109) ^ 1513186414;
                        i6 = -512587388;
                    } else {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    }
                    break;
                case -609002915:
                case 1996597269:
                    if (interfaceC18745 instanceof C23747) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26477) ^ (-1531519852);
                        i6 = 1737299999;
                    } else {
                        z2 = z;
                        iM45029 = ThreadFactoryC3888.m11306("ۙۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-12847)) ^ 564975440;
                        i6 = 2048001643;
                    }
                    break;
                case -68693127:
                case -50447485:
                    if (!CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 24985) ^ 1862734983;
                        i6 = -813158699;
                    }
                    break;
                case -34196285:
                case 151516244:
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30343)) ^ 900329639;
                        i6 = 332291480;
                    }
                    break;
                case 210409127:
                case 2080189915:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26761) ^ 1980266562;
                        i6 = 1033210825;
                    }
                    break;
                case 1722680251:
                case 1876249142:
                    return C1460.m5058(Boolean.TRUE, bool);
                default:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("᩵۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5113) ^ 1211064393;
                        i6 = -93267560;
                    } else {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 1361) ^ (-1500487542);
                        i6 = 1933242590;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m7719(int i) {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = -701498494;
        int i3 = C2249.f8050;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("۫۠")) * (-87);
        int i5 = ((iM11306 ^ i4) * 15355) ^ 1222830359;
        int i6 = 187194642;
        while (true) {
            i2 = ((((i2 ^ i4) * 11531) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2078172242:
                case -456410685:
                    if (C3286.m9798() <= 0) {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    } else {
                        iM11306 = (C19806.m45029("ۖۙ") ^ i3) * q.h;
                        i5 = ((iM11306 ^ i4) * (-29423)) ^ 495329692;
                        i6 = 52633816;
                    }
                    break;
                case -2056991853:
                case 110110251:
                    C10634.m26820();
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۚ")) * 39;
                        i5 = ((iM11306 ^ i3) * (-28553)) ^ 626782685;
                        i6 = -1284603410;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    }
                    break;
                case -2042159453:
                case -2005686037:
                    return C2124.m6676(32L, j3);
                case -1784490440:
                case 1960166732:
                    if (i > 0) {
                        iM11306 = (C19806.m45029("ᩳ᩻") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i4) * 27255) ^ 397400806;
                        i6 = 534351159;
                    } else {
                        iM11306 = C19806.m45029("ܰۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-32475)) ^ (-1936964035);
                        i6 = 331934119;
                    }
                    break;
                case -1752130578:
                case 1435543767:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17985)) ^ 1899419490;
                        i6 = -1897744177;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") + i4) * (-29);
                        i5 = ((iM11306 ^ i3) * (-8189)) ^ (-665921571);
                        i6 = 922629713;
                    }
                    break;
                case -1698117702:
                case -807351798:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-17985)) ^ 1899419490;
                        i6 = -1897744177;
                    }
                    break;
                case -1132047309:
                case -979618667:
                    j = i;
                    j2 = 16;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩶") ^ i4) * 59;
                        i5 = ((iM11306 ^ i3) * (-16743)) ^ 218661125;
                        i6 = -723430312;
                    }
                    break;
                case -1063520612:
                case 1723658677:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۚ")) * 39;
                        i5 = ((iM11306 ^ i3) * (-28553)) ^ 626782685;
                        i6 = -1284603410;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶᩳ") + i3) * 119;
                        i5 = ((iM11306 ^ i4) * (-20139)) ^ (-638147925);
                        i6 = 1871205219;
                    }
                    break;
                case -952332338:
                case 1317085524:
                    C0817.m3399();
                    C2788.m8472();
                    return 0L;
                case -790763889:
                case 18308183:
                    j3 = j * j2;
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23459)) ^ 870704719;
                        i6 = 1825811081;
                    } else {
                        iM11306 = C19806.m45029("֨۟") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31575) ^ 2030413237;
                        i6 = -821992185;
                    }
                    break;
                case -314780311:
                case 1519305091:
                    return C17492.FOREVER_NS;
                case -247562124:
                case 9935394:
                    if (i > 1048576) {
                        iM11306 = C19806.m45029("ܰۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-32475)) ^ (-1936964035);
                        i6 = 331934119;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩻ܺ")) * (-83);
                        i5 = ((iM11306 ^ i4) * 4477) ^ (-913701807);
                        i6 = 1699029893;
                    }
                    break;
                case -206040540:
                case 1942039271:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۢܿ")) * 65;
                        i5 = ((iM11306 ^ i3) * 7117) ^ (-1432759748);
                        i6 = -1185195442;
                    }
                    break;
                case -118865326:
                case 937713843:
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23459)) ^ 870704719;
                        i6 = 1825811081;
                    } else {
                        iM11306 = C19806.m45029("᩶᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-27211)) ^ 2090013976;
                        i6 = -1779386503;
                    }
                    break;
                case 88479570:
                case 1321338340:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ᩴۛ") ^ i3) * (-29);
                        i5 = ((iM11306 ^ i4) * 10871) ^ (-316112236);
                        i6 = 56366390;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7717) ^ (-128994851);
                        i6 = 1156800822;
                    }
                    break;
                case 314231809:
                case 597259320:
                    if (C1937.m6279() >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۚ")) * 39;
                        i5 = ((iM11306 ^ i3) * (-28553)) ^ 626782685;
                        i6 = -1284603410;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܳ") ^ i3) * (-123);
                        i5 = ((iM11306 ^ i4) * 18571) ^ 1178150410;
                        i6 = -1789844619;
                    }
                    break;
                case 424579367:
                case 911197358:
                    C2332.m7079();
                    AbstractC0464.m2313();
                    iM11306 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-17985)) ^ 1899419490;
                    i6 = -1897744177;
                    break;
                case 630560285:
                case 1231204477:
                    CallableC1627.m5507();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܳۚ")) * 39;
                        i5 = ((iM11306 ^ i3) * (-28553)) ^ 626782685;
                        i6 = -1284603410;
                    } else {
                        iM11306 = C19806.m45029("᩻ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24171)) ^ (-125416607);
                        i6 = 1157931317;
                    }
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("᩻ۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-24171)) ^ (-125416607);
                        i6 = 1157931317;
                    } else {
                        iM11306 = C19806.m45029("۠۠") ^ i4;
                        i5 = ((iM11306 ^ i3) * 30787) ^ (-49207587);
                        i6 = 804970534;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7743(C2516 c2516, C23041 c23041) {
        synchronized (c2516) {
            if (c2516.f9986 != c23041.f74857 || c2516.f9978 != c23041.f74859 || !c23041.f74859.mo2300()) {
                throw new C8599();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0107 A[PHI: r8 r9 r16
      0x0107: PHI (r8v4 l.ۘۖ᩹) = (r8v3 l.ۘۖ᩹), (r8v2 l.ۘۖ᩹), (r8v2 l.ۘۖ᩹) binds: [B:36:0x00ee, B:29:0x00c5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r9v4 l.ᩴۨ᩹) = (r9v3 l.ᩴۨ᩹), (r9v2 l.ᩴۨ᩹), (r9v2 l.ᩴۨ᩹) binds: [B:36:0x00ee, B:29:0x00c5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r16v24 int) = (r16v14 int), (r16v15 int), (r16v28 int) binds: [B:36:0x00ee, B:29:0x00c5, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0140 A[PHI: r6 r7 r16
      0x0140: PHI (r6v5 l.᩺ۖ᩹) = (r6v3 l.᩺ۖ᩹), (r6v2 l.᩺ۖ᩹) binds: [B:40:0x0126, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r7v5 l.᩺ۖ᩹) = (r7v3 l.᩺ۖ᩹), (r7v2 l.᩺ۖ᩹) binds: [B:40:0x0126, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r16v27 int) = (r16v13 int), (r16v28 int) binds: [B:40:0x0126, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d2 A[PHI: r16
      0x01d2: PHI (r16v10 int) = (r16v8 int), (r16v11 int) binds: [B:56:0x01d0, B:48:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0204 A[PHI: r16
      0x0204: PHI (r16v18 int) = (r16v7 int), (r16v9 int), (r16v19 int) binds: [B:60:0x0202, B:52:0x01b4, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x028d A[PHI: r16
      0x028d: PHI (r16v21 int) = (r16v3 int), (r16v5 int), (r16v6 int), (r16v22 int) binds: [B:76:0x028b, B:68:0x0250, B:64:0x0234, B:10:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02bf A[PHI: r10 r11 r12 r16
      0x02bf: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:80:0x02bd, B:72:0x026e, B:25:0x00a3, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r11v4 byte[]) = (r11v2 byte[]), (r11v2 byte[]), (r11v3 byte[]), (r11v2 byte[]) binds: [B:80:0x02bd, B:72:0x026e, B:25:0x00a3, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:80:0x02bd, B:72:0x026e, B:25:0x00a3, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r16v20 int) = (r16v2 int), (r16v4 int), (r16v16 int), (r16v23 int) binds: [B:80:0x02bd, B:72:0x026e, B:25:0x00a3, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L14;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22710 m7775(l.C22710 r19, java.util.IdentityHashMap r20, l.C15986 r21) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7775(l.᩺ۖ᩹, java.util.IdentityHashMap, l.ܺܰ᩹):l.᩺ۖ᩹");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 89081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7738(java.io.DataOutputStream r72, l.InterfaceC18745 r73, l.C15218 r74, boolean r75) {
        /*
            Method dump skipped, instruction units count: 8908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7738(java.io.DataOutputStream, l.ᩴۨ᩹, l.ܶۨ᩹, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:138:0x05b5 A[PHI: r19 r21
      0x05b5: PHI (r19v24 byte) = (r19v6 byte), (r19v22 byte), (r19v25 byte) binds: [B:22:0x009f, B:137:0x05b3, B:129:0x0568] A[DONT_GENERATE, DONT_INLINE]
      0x05b5: PHI (r21v10 l.ۘۖ᩹) = (r21v2 l.ۘۖ᩹), (r21v8 l.ۘۖ᩹), (r21v11 l.ۘۖ᩹) binds: [B:22:0x009f, B:137:0x05b3, B:129:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0627 A[PHI: r19 r21
      0x0627: PHI (r19v61 byte) = (r19v19 byte), (r19v23 byte), (r19v62 byte) binds: [B:145:0x0625, B:133:0x058d, B:17:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r21v48 l.ۘۖ᩹) = (r21v5 l.ۘۖ᩹), (r21v9 l.ۘۖ᩹), (r21v49 l.ۘۖ᩹) binds: [B:145:0x0625, B:133:0x058d, B:17:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0661 A[PHI: r14 r19 r20 r21
      0x0661: PHI (r14v3 char) = (r14v2 char), (r14v4 char) binds: [B:149:0x065f, B:113:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r19v30 byte) = (r19v18 byte), (r19v31 byte) binds: [B:149:0x065f, B:113:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r20v4 short[]) = (r20v3 short[]), (r20v5 short[]) binds: [B:149:0x065f, B:113:0x0492] A[DONT_GENERATE, DONT_INLINE]
      0x0661: PHI (r21v16 l.ۘۖ᩹) = (r21v4 l.ۘۖ᩹), (r21v17 l.ۘۖ᩹) binds: [B:149:0x065f, B:113:0x0492] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7739(DataOutputStream dataOutputStream, C22710 c22710, InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap, IdentityHashMap identityHashMap2, HashMap map) throws IOException {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM450211;
        int i5;
        int i6;
        int i7 = C1977.f7413;
        int i8 = C7105.f23796;
        int iM11306 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i7;
        int i9 = ((iM11306 ^ i8) * 9421) ^ (-1099854179);
        C5070 c5070 = null;
        short[] sArr = null;
        int i10 = iM11306 ^ 1389003122;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 387335191;
        InterfaceC18745 interfaceC18746 = null;
        Integer num = null;
        C3658 c3658 = null;
        Integer num2 = null;
        byte b = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 26853) >> 31));
            switch (i15) {
                case -2049152603:
                case 1452833983:
                    c3658 = c3658;
                    b = b;
                    sArr = f9977;
                    c = 655;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM450210 = (C19806.m45029("ܰۤ") + i7) * 109;
                        i3 = ((iM450210 ^ i8) * (-20115)) ^ (-267581292);
                        i4 = 1454023439;
                    } else {
                        iM450210 = C19806.m45029("֡ۡ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 6451) ^ (-54155927);
                        i4 = -768033592;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1978935871:
                case 895570577:
                    C1875.m6086();
                    c3658 = c3658;
                    b = b;
                    iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                    i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                    i4 = 351730381;
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1960543039:
                case -123378217:
                    dataOutputStream.writeByte(3);
                    dataOutputStream.writeByte(b);
                    C1148.m4227(dataOutputStream, i12);
                    return;
                case -1934954560:
                case 1615765040:
                    if (!c5070.m14141(i11, i12)) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-23019)) ^ (-983509428);
                        i4 = -1432108406;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    } else {
                        iM45029 = C19806.m45029("᩻۫") ^ i7;
                        i = ((iM45029 ^ i8) * 26753) ^ (-1302218292);
                        i2 = 188386825;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1928043114:
                case 1577777718:
                    c3658 = c3658;
                    b = b;
                    if (C1189.f5284 <= 0) {
                        iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                        i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                        i4 = 351730381;
                    } else {
                        iM450210 = (i7 - C19806.m45029("ۗ֨")) * (-93);
                        i3 = ((iM450210 ^ i8) * 28087) ^ 478250649;
                        i4 = 906046458;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1892469258:
                case 798221665:
                    if (!RunnableC1895.f7152) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                        i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                        i4 = 351730381;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    } else {
                        iM45029 = (C19806.m45029("ۖۧ") ^ i7) * (-23);
                        i = ((iM45029 ^ i8) * (-6703)) ^ (-1864240103);
                        i2 = 996447755;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1877382351:
                case 186441063:
                    c3658 = c3658;
                    b = b;
                    if (interfaceC18746 instanceof C23747) {
                        iM450210 = (C19806.m45029("֡ܳ") ^ i8) * 119;
                        i3 = ((iM450210 ^ i7) * (-10053)) ^ (-1757002317);
                        i4 = 1748197531;
                    } else {
                        iM450210 = C19806.m45029("ܽ֨") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-18567)) ^ 1046950862;
                        i4 = -845033466;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1866083052:
                case 1651138869:
                    m7739(dataOutputStream, c22710.f73972, interfaceC18745, identityHashMap, identityHashMap2, map);
                    m7739(dataOutputStream, c22710.f73966, interfaceC18745, identityHashMap, identityHashMap2, map);
                    return;
                case -1826408938:
                case 2094467168:
                    num = (Integer) identityHashMap2.get((C23747) interfaceC18746);
                    if (num != null) {
                        iM450211 = ThreadFactoryC3888.m11306("ۢۡ") ^ i8;
                        i5 = ((iM450211 ^ i7) * 17069) ^ (-1680555966);
                        i6 = -1795413285;
                    } else {
                        iM450211 = (i8 - C19806.m45029("ۛۘ")) * (-59);
                        i5 = ((iM450211 ^ i7) * 19347) ^ 1749944601;
                        i6 = -50628827;
                    }
                    i10 = iM450211 ^ i6;
                    i9 = i5;
                    b = b;
                    break;
                case -1798560602:
                case 582033469:
                    c3658 = c3658;
                    b = b;
                    if (C0629.f2722 <= 0) {
                        iM450210 = C19806.m45029("ۢۤ") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-9917)) ^ 124818788;
                        i4 = 1984828421;
                    } else {
                        iM450210 = (C19806.m45029("ܿᩳ") + i8) * (-107);
                        i3 = ((iM450210 ^ i7) * 16557) ^ 904943256;
                        i4 = 1589951877;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1699808279:
                case 1509545179:
                    b = b;
                    c3658 = c22710.f73969;
                    interfaceC18746 = c3658.f13401;
                    c5070 = c3658.f13402;
                    i11 = c3658.f13399;
                    i12 = c3658.f13400;
                    if (interfaceC18746 == interfaceC18745) {
                        int iM11307 = (i8 - ThreadFactoryC3888.m11306("᩻۟")) * 71;
                        i9 = ((iM11307 ^ i7) * (-29151)) ^ (-358643589);
                        i10 = iM11307 ^ (-991476310);
                    } else {
                        int iM450212 = (C19806.m45029("᩺֫") + i7) * (-65);
                        i9 = ((iM450212 ^ i8) * (-31871)) ^ (-823457465);
                        i10 = iM450212 ^ 1080110814;
                    }
                    i13 = 0;
                    break;
                case -1696464554:
                case 597511261:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C1937.m6279() < 0) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = ThreadFactoryC3888.m11306("᩷᩻") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-7137)) ^ 307697857;
                        i4 = 1080872458;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    }
                    c3658 = c3658;
                    b = b;
                    iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                    i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                    i4 = 351730381;
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1660030880:
                case 38139811:
                    c3658 = c3658;
                    b = b;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM450210 = (C19806.m45029("᩸ܽ") + i7) * (-105);
                        i3 = ((iM450210 ^ i8) * (-18505)) ^ (-1073805040);
                        i4 = -975588914;
                    } else {
                        iM450210 = C19806.m45029("ۙܿ") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-3667)) ^ 1741114829;
                        i4 = -239447614;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1618521919:
                case 2095184689:
                    if (C10634.f36300 < 0) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۨ۟")) * 23;
                        i3 = ((iM450210 ^ i7) * (-533)) ^ 1842276484;
                        i4 = -526382150;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    }
                    c3658 = c3658;
                    b = b;
                    iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                    i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                    i4 = 351730381;
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1477862465:
                case -650236772:
                    throw new IOException(C2477.m7604(f9977, 689, 34, i14));
                case -1448242978:
                case -149675390:
                    c5070.m14135(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case -1257058244:
                case 2118430082:
                    c3658 = c3658;
                    b = b;
                    if (C0797.m3351(c22710)) {
                        iM450210 = C19806.m45029("ܰۛ") ^ i7;
                        i3 = ((iM450210 ^ i8) * 5531) ^ (-120582094);
                        i4 = 201108724;
                    } else {
                        iM450210 = C19806.m45029("ۚ᩺") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-13949)) ^ (-388772032);
                        i4 = -1475421446;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1167098409:
                case -755684760:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۖۧ") ^ i7) * (-23);
                        i = ((iM45029 ^ i8) * (-6703)) ^ (-1864240103);
                        i2 = 996447755;
                    } else {
                        iM45029 = C19806.m45029("ۡۢ") ^ i8;
                        i = ((iM45029 ^ i7) * (-4575)) ^ (-1486332363);
                        i2 = -271281083;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -1164982112:
                case -51453348:
                    i14 = 62250;
                    iM450210 = ThreadFactoryC3888.m11306("ۧ۠") ^ i8;
                    i3 = ((iM450210 ^ i7) * (-17039)) ^ 590814120;
                    i4 = 844324072;
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -1088303626:
                case 782519883:
                    c3658 = c3658;
                    b = b;
                    if (C1066.f4915 <= 0) {
                        iM450210 = (i7 - C19806.m45029("ۗܽ")) * 43;
                        i3 = ((iM450210 ^ i8) * (-27159)) ^ (-832791165);
                        i4 = 351730381;
                    } else {
                        iM450210 = (C19806.m45029("᩹۠") ^ i7) * 31;
                        i3 = ((iM450210 ^ i8) * (-9353)) ^ (-606963867);
                        i4 = 2046967547;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -979012723:
                case 1587061707:
                    dataOutputStream.writeByte(4);
                    C1148.m4227(dataOutputStream, C2124.m6682(num));
                    C1148.m4227(dataOutputStream, i11);
                    C1148.m4227(dataOutputStream, i12);
                    if (c5070 == null) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܰۙ")) * (-65);
                        i = ((iM45029 ^ i7) * 5353) ^ (-452744012);
                        i2 = -1719236094;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩻") ^ i7;
                        i = ((iM45029 ^ i8) * 639) ^ 898371178;
                        i2 = 133740150;
                    }
                    i10 = iM45029 ^ i2;
                    i9 = i;
                    break;
                case -833632590:
                case 1336369842:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = C19806.m45029("ۢۤ") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-9917)) ^ 124818788;
                        i4 = 1984828421;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    } else {
                        iM45029 = (C19806.m45029("ۖۧ") ^ i7) * (-23);
                        i = ((iM45029 ^ i8) * (-6703)) ^ (-1864240103);
                        i2 = 996447755;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case -767927641:
                case -81419287:
                    C2124.m6673();
                    return;
                case -596055494:
                case 642193275:
                    return;
                case -469153529:
                case -416303819:
                    c3658 = c3658;
                    b = b;
                    dataOutputStream.writeByte(1);
                    C1148.m4227(dataOutputStream, i11);
                    C1148.m4227(dataOutputStream, i12);
                    if (c5070 == null) {
                        iM450210 = C19806.m45029("ۘ᩻") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-13211)) ^ 1183423643;
                        i4 = 830859598;
                    } else {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("۠ۚ")) * (-31);
                        i3 = ((iM450210 ^ i7) * (-31491)) ^ 521459089;
                        i4 = -1965002729;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -164990467:
                case 962842234:
                    c3658 = c3658;
                    b = b;
                    if (C2871.f10837 >= 0) {
                        iM450210 = (C19806.m45029("ᩴ᩹") + i8) * 65;
                        i3 = ((iM450210 ^ i7) * (-27101)) ^ (-1769325305);
                        i4 = 1271100885;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩺۟") ^ i7;
                        i3 = ((iM450210 ^ i8) * 2433) ^ 1767524986;
                        i4 = 1956141342;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -130558690:
                case 25231076:
                    c3658 = c3658;
                    b = b;
                    if (c22710 == null) {
                        iM450210 = ThreadFactoryC3888.m11306("ۘۢ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 16857) ^ 712669496;
                        i4 = -333211298;
                    } else {
                        iM450210 = C19806.m45029("᩸ۤ") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-30061)) ^ 790772987;
                        i4 = 742525802;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case -114595655:
                case 982427919:
                    dataOutputStream.writeByte(2);
                    C1148.m4227(dataOutputStream, C0817.m3400(num2));
                    return;
                case 13379403:
                case 1339451720:
                    c3658 = c3658;
                    b = b;
                    if (C2788.f10625 >= 0) {
                        iM450210 = (C19806.m45029("ܰۤ") + i7) * 109;
                        i3 = ((iM450210 ^ i8) * (-20115)) ^ (-267581292);
                        i4 = 1454023439;
                    } else {
                        iM450210 = (C19806.m45029("ܿܶ") + i8) * 93;
                        i3 = ((iM450210 ^ i7) * (-13637)) ^ (-2069033586);
                        i4 = 198397624;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 70065055:
                case 408706183:
                    c3658 = c3658;
                    b = b;
                    short s = sArr[c];
                    if (((s * s) + 11539609) - (s * 6794) < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("۟ܿ") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-22353)) ^ (-1924288935);
                        i4 = 915041075;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۡ۫") ^ i7;
                        i3 = ((iM450210 ^ i8) * 20119) ^ 605002811;
                        i4 = 1995289012;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 88483064:
                case 2042904034:
                    C2788.m8471(dataOutputStream, i13);
                    return;
                case 130376482:
                case 1979791692:
                    b = b;
                    num2 = (Integer) RunnableC0195.m1435(map, new C1167(c3658));
                    if (num2 != null) {
                        iM450210 = (i7 - C19806.m45029("ۡᩴ")) * 47;
                        c3658 = c3658;
                        i3 = ((iM450210 ^ i8) * 935) ^ 1542257830;
                        i4 = -135233050;
                    } else {
                        c3658 = c3658;
                        iM450210 = C19806.m45029("ۗᩳ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 13297) ^ (-2040683667);
                        i4 = -36936431;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 195251531:
                case 647954239:
                    c3658 = c3658;
                    b = b;
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM450210 = ThreadFactoryC3888.m11306("᩷᩻") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-7137)) ^ 307697857;
                        i4 = 1080872458;
                    } else {
                        iM450210 = (C19806.m45029("۬ܳ") ^ i8) * 17;
                        i3 = ((iM450210 ^ i7) * (-13981)) ^ 657140278;
                        i4 = 325721339;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 358858959:
                case 1004461931:
                    c3658 = c3658;
                    b = b;
                    if (C0797.f3386) {
                        iM450210 = C19806.m45029("ۢۤ") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-9917)) ^ 124818788;
                        i4 = 1984828421;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۛ֨") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-13567)) ^ (-301017285);
                        i4 = 2090928610;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 396048746:
                case 1497114717:
                    dataOutputStream.writeByte(5);
                    dataOutputStream.writeByte(b);
                    C2788.m8471(dataOutputStream, i12);
                    c5070.m14135(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case 501050900:
                case 1763200936:
                    c3658 = c3658;
                    byte b2 = ((C0462) interfaceC18746).f2087;
                    if (c5070 != null) {
                        int iM450213 = C19806.m45029("֨᩸") ^ i7;
                        i9 = ((iM450213 ^ i8) * 13251) ^ (-1983131583);
                        b = b2;
                        i10 = iM450213 ^ 843827812;
                    } else {
                        b = b2;
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-23019)) ^ (-983509428);
                        i4 = -1432108406;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                    }
                    c3658 = c3658;
                    break;
                case 608916931:
                case 872626524:
                    ThreadFactoryC3888.m11300();
                    if (C1875.f7103 < 0) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = (C19806.m45029("ᩴ᩹") + i8) * 65;
                        i3 = ((iM450210 ^ i7) * (-27101)) ^ (-1769325305);
                        i4 = 1271100885;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    } else {
                        iM45029 = (C19806.m45029("ۖۧ") ^ i7) * (-23);
                        i = ((iM45029 ^ i8) * (-6703)) ^ (-1864240103);
                        i2 = 996447755;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case 619245594:
                case 1969556022:
                    i14 = 52230;
                    iM450210 = ThreadFactoryC3888.m11306("ۧ۠") ^ i8;
                    i3 = ((iM450210 ^ i7) * (-17039)) ^ 590814120;
                    i4 = 844324072;
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 632298827:
                case 1405727412:
                    if (!C7105.m18985()) {
                        c3658 = c3658;
                        b = b;
                        iM450210 = (C19806.m45029("᩸ܽ") + i7) * (-105);
                        i3 = ((iM450210 ^ i8) * (-18505)) ^ (-1073805040);
                        i4 = -975588914;
                        b = b;
                        i10 = iM450210 ^ i4;
                        i9 = i3;
                        c3658 = c3658;
                    } else {
                        iM45029 = (C19806.m45029("ۖۧ") ^ i7) * (-23);
                        i = ((iM45029 ^ i8) * (-6703)) ^ (-1864240103);
                        i2 = 996447755;
                        i10 = iM45029 ^ i2;
                        i9 = i;
                    }
                    break;
                case 933813826:
                case 2143754312:
                    throw new IOException(C2477.m7604(f9977, 656, 33, i14));
                case 987397709:
                case 1442700034:
                    c5070.m14135(dataOutputStream, i11, i12, identityHashMap);
                    return;
                case 1102581942:
                case 1805648917:
                    c3658 = c3658;
                    b = b;
                    if (interfaceC18746 instanceof C0462) {
                        iM450210 = (i7 - C19806.m45029("᩻ۖ")) * 55;
                        i3 = ((iM450210 ^ i8) * (-18121)) ^ 1616351420;
                        i4 = -140817017;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i7;
                        i3 = ((iM450210 ^ i8) * (-19709)) ^ 271743120;
                        i4 = 1494855690;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                case 1673989011:
                case 1975067873:
                    c3658 = c3658;
                    b = b;
                    if (C1398.f5802 <= 0) {
                        iM450210 = (i8 - ThreadFactoryC3888.m11306("ۨ۟")) * 23;
                        i3 = ((iM450210 ^ i7) * (-533)) ^ 1842276484;
                        i4 = -526382150;
                    } else {
                        iM450210 = (i7 - C19806.m45029("᩶ۧ")) * 9;
                        i3 = ((iM450210 ^ i8) * (-30119)) ^ 981495870;
                        i4 = -1265825708;
                    }
                    b = b;
                    i10 = iM450210 ^ i4;
                    i9 = i3;
                    c3658 = c3658;
                    break;
                default:
                    C1148.m4227(dataOutputStream, i13);
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[PHI: r9 r10 r11
      0x00a9: PHI (r9v3 short[]) = (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:28:0x00a7, B:24:0x0087, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:28:0x00a7, B:24:0x0087, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:28:0x00a7, B:24:0x0087, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0198 A[PHI: r3 r4 r5 r6
      0x0198: PHI (r3v3 short) = (r3v2 short), (r3v1 short) binds: [B:49:0x0196, B:45:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r4v3 short) = (r4v2 short), (r4v1 short) binds: [B:49:0x0196, B:45:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:49:0x0196, B:45:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:49:0x0196, B:45:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0203 A[PHI: r7
      0x0203: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:61:0x0201, B:41:0x0153, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0235 A[PHI: r2
      0x0235: PHI (r2v3 char) = (r2v1 char), (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:65:0x0233, B:53:0x01c8, B:15:0x0055, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0263 A[PHI: r16
      0x0263: PHI (r16v3 short[]) = (r16v1 short[]), (r16v2 short[]), (r16v1 short[]), (r16v1 short[]), (r16v1 short[]) binds: [B:69:0x0261, B:57:0x01e6, B:13:0x0051, B:10:0x0048, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7737(int i, int i2) throws IOException {
        int iM45029;
        int i3;
        int i4;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 691389397;
        int i12 = C1668.f6641;
        int i13 = C1148.f5161;
        int iM450210 = C19806.m45029("ܳ᩵") ^ i13;
        int i14 = ((iM450210 ^ i12) * (-15481)) ^ 436997852;
        int i15 = iM450210 ^ 926241355;
        short[] sArr2 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 31901) >> 31));
            switch (i11) {
                case -2023666181:
                case -1160397891:
                    if (C2332.f8260) {
                        iM45029 = (C19806.m45029("ܽۤ") + i13) * 51;
                        i3 = ((iM45029 ^ i12) * 6419) ^ 64282801;
                        i4 = -1413916881;
                    } else {
                        iM45029 = C19806.m45029("֨ۘ") ^ i13;
                        i3 = ((iM45029 ^ i12) * 29373) ^ (-1767841768);
                        i4 = -795438007;
                    }
                    int i16 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i16;
                    break;
                case -2018782714:
                case -1116765479:
                    C2124.m6673();
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ᩴܰ") + i12) * 13;
                        i3 = ((iM45029 ^ i13) * 10847) ^ 207018658;
                        i4 = 1940291222;
                    } else {
                        iM45029 = (C19806.m45029("۟ᩳ") ^ i12) * (-121);
                        i3 = ((iM45029 ^ i13) * 25039) ^ (-1590092336);
                        i4 = 1651901868;
                    }
                    int i17 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i17;
                    break;
                case -1955941493:
                case -1940572991:
                    c = 532;
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("֨ۘ") ^ i13;
                        i3 = ((iM45029 ^ i12) * 29373) ^ (-1767841768);
                        i4 = -795438007;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۨ") ^ i13) * 109;
                        i3 = ((iM45029 ^ i12) * (-2087)) ^ 437940726;
                        i4 = -974216398;
                    }
                    int i18 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i18;
                    break;
                case -1723629532:
                case 1216804366:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ᩴܰ") + i12) * 13;
                        i3 = ((iM45029 ^ i13) * 10847) ^ 207018658;
                        i4 = 1940291222;
                    } else {
                        iM45029 = (C19806.m45029("ۘܶ") ^ i12) * (-81);
                        i3 = ((iM45029 ^ i13) * 1327) ^ (-1925401282);
                        i4 = -1791683052;
                    }
                    int i19 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i19;
                    break;
                case -1704428221:
                case -7421685:
                    s = sArr2[c];
                    s2 = 23916;
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("᩸۫") ^ i12;
                        i3 = ((iM45029 ^ i13) * 31123) ^ 2110958956;
                        i4 = -26464301;
                    } else {
                        iM45029 = (C19806.m45029("ۜ᩺") + i12) * (-97);
                        i3 = ((iM45029 ^ i13) * (-14799)) ^ 968545337;
                        i4 = 1631070236;
                    }
                    int i110 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i110;
                    break;
                case -1656722478:
                case -1395508007:
                    if (i > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢܿ") ^ i12;
                        i3 = ((iM45029 ^ i13) * (-19251)) ^ (-1783818232);
                        i4 = -2008636808;
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i12;
                        i3 = ((iM45029 ^ i13) * (-19395)) ^ 54822413;
                        i4 = -846789813;
                    }
                    int i111 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i111;
                    break;
                case -1560789757:
                case -848196051:
                    sArr2 = f9977;
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ᩴܰ") + i12) * 13;
                        i3 = ((iM45029 ^ i13) * 10847) ^ 207018658;
                        i4 = 1940291222;
                    } else {
                        iM45029 = C19806.m45029("֫᩹") ^ i12;
                        i3 = ((iM45029 ^ i13) * 14015) ^ 694726240;
                        i4 = 456069744;
                    }
                    int i112 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i112;
                    break;
                case -1472428056:
                case 18845869:
                    i7 = 142993764;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i13 - C19806.m45029("۟᩻")) * (-11);
                        i3 = ((iM45029 ^ i12) * 7099) ^ (-51811081);
                        i4 = 1044038590;
                    } else {
                        iM45029 = (C19806.m45029("ۗ᩷") ^ i13) * (-5);
                        i3 = ((iM45029 ^ i12) * (-32213)) ^ 317219010;
                        i4 = 1116094371;
                    }
                    int i113 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i113;
                    break;
                case -1356496994:
                case 1479405486:
                    C19806.m45024();
                    return;
                case -1026656119:
                case 249918243:
                    C0216.m1591();
                    iM45029 = C19806.m45029("֨ۘ") ^ i13;
                    i3 = ((iM45029 ^ i12) * 29373) ^ (-1767841768);
                    i4 = -795438007;
                    int i114 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i114;
                    break;
                case -1006943906:
                case 673872874:
                    if (i5 - (i6 + i7) <= 0) {
                        iM45029 = C19806.m45029("ۙ᩷") ^ i13;
                        i3 = ((iM45029 ^ i12) * (-20189)) ^ (-1818900679);
                        i4 = 41921113;
                    } else {
                        iM45029 = C19806.m45029("᩶ۧ") ^ i12;
                        i3 = ((iM45029 ^ i13) * 26127) ^ 694513004;
                        i4 = 1480964820;
                    }
                    int i115 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i115;
                    break;
                case -939567693:
                case -365209330:
                    return;
                case -807645182:
                case -81160833:
                    i5 = s * s2;
                    i6 = s * s;
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩸۫") ^ i12;
                        i3 = ((iM45029 ^ i13) * 31123) ^ 2110958956;
                        i4 = -26464301;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩷") + i12) * 11;
                        i3 = ((iM45029 ^ i13) * 4415) ^ (-30760618);
                        i4 = 709888034;
                    }
                    int i116 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i116;
                    break;
                case -759802555:
                case 17933293:
                    throw m7773(RunnableC1606.m5481(sArr, i9, i10, i8));
                case -615473403:
                case 1443174875:
                    if (C2871.f10837 >= 0) {
                        iM45029 = (i13 - C19806.m45029("۟᩻")) * (-11);
                        i3 = ((iM45029 ^ i12) * 7099) ^ (-51811081);
                        i4 = 1044038590;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۧ") + i13) * 9;
                        i3 = ((iM45029 ^ i12) * 12899) ^ (-1627650555);
                        i4 = -1340413397;
                    }
                    int i117 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i117;
                    break;
                case -173875251:
                case 1526543813:
                    sArr = f9977;
                    i9 = 533;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("ۜۖ") + i12) * (-45);
                        i3 = ((iM45029 ^ i13) * (-14629)) ^ (-1286983842);
                        i4 = 807250704;
                    } else {
                        iM45029 = (C19806.m45029("۟ᩳ") ^ i12) * (-121);
                        i3 = ((iM45029 ^ i13) * 25039) ^ (-1590092336);
                        i4 = 1651901868;
                    }
                    int i118 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i118;
                    break;
                case 86122561:
                case 1941890951:
                    C7105.m18985();
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ᩴܰ") + i12) * 13;
                        i3 = ((iM45029 ^ i13) * 10847) ^ 207018658;
                        i4 = 1940291222;
                    } else {
                        iM45029 = C19806.m45029("֨ۘ") ^ i13;
                        i3 = ((iM45029 ^ i12) * 29373) ^ (-1767841768);
                        i4 = -795438007;
                    }
                    int i119 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i119;
                    break;
                case 373067283:
                case 524063354:
                    if (i <= i2) {
                        int iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i13;
                        i14 = ((iM11306 ^ i12) * (-7171)) ^ 867252046;
                        i15 = iM11306 ^ (-1202769021);
                    } else {
                        iM45029 = C19806.m45029("ۚ֫") ^ i12;
                        i3 = ((iM45029 ^ i13) * (-19395)) ^ 54822413;
                        i4 = -846789813;
                        int i1110 = i3;
                        i15 = iM45029 ^ i4;
                        i14 = i1110;
                    }
                    break;
                case 1084235819:
                case 2110527744:
                    i8 = 3604;
                    iM45029 = (ThreadFactoryC3888.m11306("۟֫") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i3 = ((iM45029 ^ i12) * (-3055)) ^ 2042573273;
                    i4 = -840346636;
                    int i1111 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i1111;
                    break;
                case 1371642817:
                case 1864398987:
                    i10 = 21;
                    if (C1066.m4023() <= 0) {
                        iM45029 = (C19806.m45029("۟ᩳ") ^ i12) * (-121);
                        i3 = ((iM45029 ^ i13) * 25039) ^ (-1590092336);
                        i4 = 1651901868;
                    } else {
                        iM45029 = (C19806.m45029("ۨ᩵") + i13) * 77;
                        i3 = ((iM45029 ^ i12) * 8407) ^ 1680852453;
                        i4 = 1747598089;
                    }
                    int i1112 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i1112;
                    break;
                case 1763047487:
                case 1934303746:
                    if (C0526.m2437() < 0) {
                        iM45029 = (C19806.m45029("ᩴܰ") + i12) * 13;
                        i3 = ((iM45029 ^ i13) * 10847) ^ 207018658;
                        i4 = 1940291222;
                    } else {
                        iM45029 = (i13 - C19806.m45029("۟᩻")) * (-11);
                        i3 = ((iM45029 ^ i12) * 7099) ^ (-51811081);
                        i4 = 1044038590;
                    }
                    int i1113 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i1113;
                    break;
                default:
                    i8 = 9015;
                    iM45029 = (ThreadFactoryC3888.m11306("۟֫") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i3 = ((iM45029 ^ i12) * (-3055)) ^ 2042573273;
                    i4 = -840346636;
                    int i1114 = i3;
                    i15 = iM45029 ^ i4;
                    i14 = i1114;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7751(C22710 c22710, InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap, ArrayList arrayList) {
        ArrayDeque arrayDeque = null;
        C22710 c22711 = null;
        C22710 c22712 = null;
        C3658 c3658 = null;
        InterfaceC18745 interfaceC18746 = null;
        C5070 c5070 = null;
        int i = 225712691;
        int i2 = C2477.f9839;
        int i3 = C2249.f8050;
        int iM45029 = (i3 - C19806.m45029("ۙ᩸")) * 9;
        int i4 = ((iM45029 ^ i2) * 4757) ^ (-2008030260);
        int i5 = 1025837267;
        while (true) {
            i = ((((i ^ i2) * (-2911)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2137936341:
                case -995224311:
                    C1189.m4362(arrayDeque, c22712);
                    c22712 = c22712.f73972;
                    iM45029 = (C19806.m45029("ۨ۟") + i2) * 35;
                    i4 = ((iM45029 ^ i3) * 32399) ^ (-873038510);
                    i5 = -1768185237;
                    break;
                case -2133166603:
                case -709432577:
                    if (C0671.f2816 == 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤ֫")) * q.h;
                        i4 = ((iM45029 ^ i3) * 1709) ^ (-1391103703);
                        i5 = 529881927;
                    } else {
                        iM45029 = C19806.m45029("۟᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 883) ^ 1150756712;
                        i5 = -911515106;
                    }
                    break;
                case -1924573168:
                case 2039683467:
                    C0629.m2907();
                    if (C0216.f1393 == 0) {
                        iM45029 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20975)) ^ 954008109;
                        i5 = 823176156;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13015)) ^ (-1641035572);
                        i5 = 366305351;
                    }
                    break;
                case -1921015914:
                case -1068922332:
                    if (c22712 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16603)) ^ (-2125912491);
                        i5 = 890443187;
                    } else {
                        iM45029 = C19806.m45029("֨ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13147) ^ (-2115973684);
                        i5 = 806681286;
                    }
                    break;
                case -1916092113:
                case -244112911:
                    RunnableC1895.m6170();
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("ۡۧ") + i2) * (-35);
                        i4 = ((iM45029 ^ i3) * (-11759)) ^ (-1563244021);
                        i5 = -628244956;
                    } else {
                        iM45029 = (C19806.m45029("ۛᩳ") ^ i2) * (-27);
                        i4 = ((iM45029 ^ i3) * (-15535)) ^ 1604169959;
                        i5 = 642276411;
                    }
                    break;
                case -1766350209:
                case -1127383578:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤܺ")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-23041)) ^ 881005048;
                        i5 = 1671454365;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫֨") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 24759) ^ 608975675;
                        i5 = 1357372494;
                    }
                    break;
                case -1681563207:
                case 1465098814:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C2332.m7079();
                    break;
                case -1637766774:
                case 415529264:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                        c22712 = c22711;
                        iM45029 = (C19806.m45029("ۨ۟") + i2) * 35;
                        i4 = ((iM45029 ^ i3) * 32399) ^ (-873038510);
                        i5 = -1768185237;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤܺ")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-23041)) ^ 881005048;
                        i5 = 1671454365;
                    }
                    break;
                case -1616008916:
                case -749332245:
                    c5070 = c3658.f13402;
                    if (c5070 != null) {
                        iM45029 = C19806.m45029("۫ۙ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21587)) ^ (-1336675711);
                        i5 = -1337304484;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܽ") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * 29393) ^ (-100842587);
                        i5 = -544742411;
                    }
                    break;
                case -1525835100:
                case -598892438:
                    if (c22711 == null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-19015)) ^ 781968168;
                        i5 = 1760964989;
                    } else {
                        c22712 = c22711;
                        iM45029 = (C19806.m45029("ۨ۟") + i2) * 35;
                        i4 = ((iM45029 ^ i3) * 32399) ^ (-873038510);
                        i5 = -1768185237;
                    }
                    break;
                case -1471595165:
                case 217373077:
                    if (!C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13015)) ^ (-1641035572);
                        i5 = 366305351;
                    } else {
                        iM45029 = (C19806.m45029("ۡۧ") + i2) * (-35);
                        i4 = ((iM45029 ^ i3) * (-11759)) ^ (-1563244021);
                        i5 = -628244956;
                    }
                    break;
                case -1325536533:
                case -939904641:
                    if (C1668.m5583()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ֫")) * 101;
                        i4 = ((iM45029 ^ i2) * (-17881)) ^ 2112286308;
                        i5 = -532764308;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") ^ i3) * (-75);
                        i4 = ((iM45029 ^ i2) * 24643) ^ 1576340355;
                        i5 = -798655904;
                    }
                    break;
                case -1296636790:
                case 1086353095:
                    if (C1148.m4232() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13015)) ^ (-1641035572);
                        i5 = 366305351;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩸") ^ i2) * (-99);
                        i4 = ((iM45029 ^ i3) * 7093) ^ (-890932102);
                        i5 = -698077973;
                    }
                    break;
                case -1157466360:
                case -176980003:
                    if (C1025.m3862(c22712)) {
                        iM45029 = C19806.m45029("֨ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 13147) ^ (-2115973684);
                        i5 = 806681286;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 16005) ^ (-585215909);
                        i5 = -257920479;
                    }
                    break;
                case -1064859216:
                case -751945611:
                    break;
                case -956804525:
                case -833247649:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") ^ i3) * (-75);
                        i4 = ((iM45029 ^ i2) * 24643) ^ 1576340355;
                        i5 = -798655904;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚ᩹") ^ i2) * 43;
                        i4 = ((iM45029 ^ i3) * 27865) ^ 88575576;
                        i5 = 907004533;
                    }
                    break;
                case -813701647:
                case -670037044:
                    C3577.m10565();
                    C0216.m1591();
                    iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 18053) ^ (-506478385);
                    i5 = 660766713;
                    break;
                case -576550743:
                case 1927167100:
                    C1189.m4368();
                    if (C1189.f5284 > 0) {
                        iM45029 = C19806.m45029("֡ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23623) ^ 1367367466;
                        i5 = -1783696886;
                    } else {
                        iM45029 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20975)) ^ 954008109;
                        i5 = 823176156;
                    }
                    break;
                case -300487087:
                case 722370015:
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ᩴ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 32389) ^ (-645198438);
                        i5 = -1211625946;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") ^ i3) * (-75);
                        i4 = ((iM45029 ^ i2) * 24643) ^ 1576340355;
                        i5 = -798655904;
                    }
                    break;
                case -294794674:
                case 205988898:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("֫ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12831) ^ (-2012109117);
                        i5 = 161666380;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-21579)) ^ (-1186756583);
                        i5 = -1163678190;
                    }
                    break;
                case -260629098:
                case 1106823376:
                    if (c22712 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16647) ^ (-319502468);
                        i5 = -1811261081;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܽ") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * 29393) ^ (-100842587);
                        i5 = -544742411;
                    }
                    break;
                case -34073345:
                case 1235479499:
                    if (interfaceC18746 instanceof C0462) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷ᩴ")) * 37;
                        i4 = ((iM45029 ^ i2) * (-29693)) ^ 273337371;
                        i5 = 515262449;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺֨") ^ i3) * (-73);
                        i4 = ((iM45029 ^ i2) * (-28963)) ^ (-258840779);
                        i5 = 482361135;
                    }
                    break;
                case -28282653:
                case 1373036569:
                    if (C2249.m6915() <= 0) {
                        iM45029 = C19806.m45029("֡ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23623) ^ 1367367466;
                        i5 = -1783696886;
                    } else {
                        iM45029 = C19806.m45029("۬ᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20911) ^ (-1482829930);
                        i5 = 238421559;
                    }
                    break;
                case 116020520:
                case 1634863274:
                    if (c22710 == null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤܺ")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-23041)) ^ 881005048;
                        i5 = 1671454365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21941) ^ 356338141;
                        i5 = 785824472;
                    }
                    break;
                case 164158470:
                case 1611400172:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤ֫")) * q.h;
                        i4 = ((iM45029 ^ i3) * 1709) ^ (-1391103703);
                        i5 = 529881927;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 18053) ^ (-506478385);
                        i5 = 660766713;
                    }
                    break;
                case 181803802:
                case 1838722533:
                    if (C1875.f7103 >= 0) {
                        iM45029 = C19806.m45029("֫ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12831) ^ (-2012109117);
                        i5 = 161666380;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-10493)) ^ 546074635;
                        i5 = 1926581414;
                    }
                    break;
                case 234470832:
                case 1939884640:
                    C1398.m4895();
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13015)) ^ (-1641035572);
                        i5 = 366305351;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۤ֫")) * q.h;
                        i4 = ((iM45029 ^ i3) * 1709) ^ (-1391103703);
                        i5 = 529881927;
                    }
                    break;
                case 871776252:
                case 2121598674:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("֡ܺ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23623) ^ 1367367466;
                        i5 = -1783696886;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩶") ^ i3) * (-119);
                        i4 = ((iM45029 ^ i2) * (-32135)) ^ (-1152520127);
                        i5 = -1163805258;
                    }
                    break;
                case 943801240:
                case 1292818552:
                    if (!(interfaceC18746 instanceof C23747)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܽ") + i2) * 99;
                        i4 = ((iM45029 ^ i3) * 29393) ^ (-100842587);
                        i5 = -544742411;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷ᩴ")) * 37;
                        i4 = ((iM45029 ^ i2) * (-29693)) ^ 273337371;
                        i5 = 515262449;
                    }
                    break;
                case 1256806523:
                case 1383001674:
                    if (C2477.m7593() >= 0) {
                        iM45029 = (C19806.m45029("ۡۧ") + i2) * (-35);
                        i4 = ((iM45029 ^ i3) * (-11759)) ^ (-1563244021);
                        i5 = -628244956;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7149)) ^ 1199827136;
                        i5 = 1137170057;
                    }
                    break;
                case 1416221736:
                case 2133369139:
                    c3658 = c22712.f73969;
                    interfaceC18746 = c3658.f13401;
                    if (interfaceC18746 != interfaceC18745) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12735) ^ (-296246961);
                        i5 = 965882081;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩷ᩴ")) * 37;
                        i4 = ((iM45029 ^ i2) * (-29693)) ^ 273337371;
                        i5 = 515262449;
                    }
                    break;
                case 1467457685:
                case 1824698370:
                    c22711 = ((C22710) arrayDeque.pop()).f73966;
                    iM45029 = (C19806.m45029("֡֨") + i3) * 31;
                    i4 = ((iM45029 ^ i2) * (-26475)) ^ 26043354;
                    i5 = -384747634;
                    break;
                case 1490703218:
                case 1592223681:
                    arrayDeque = new ArrayDeque();
                    c22711 = c22710;
                    iM45029 = (C19806.m45029("֡֨") + i3) * 31;
                    i4 = ((iM45029 ^ i2) * (-26475)) ^ 26043354;
                    i5 = -384747634;
                    break;
                case 1672604581:
                case 2059650412:
                    if (C2871.f10837 >= 0) {
                        iM45029 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20975)) ^ 954008109;
                        i5 = 823176156;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺܰ") + i2) * 63;
                        i4 = ((iM45029 ^ i3) * 9275) ^ 634169534;
                        i5 = -1767931450;
                    }
                    break;
                case 1881790077:
                case 2144024095:
                    c5070.m14133(c3658.f13399, c3658.f13400, identityHashMap, arrayList);
                    iM45029 = (ThreadFactoryC3888.m11306("ۚܽ") + i2) * 99;
                    i4 = ((iM45029 ^ i3) * 29393) ^ (-100842587);
                    i5 = -544742411;
                    break;
                default:
                    C1066.m4023();
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("֫ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12831) ^ (-2012109117);
                        i5 = 161666380;
                    } else {
                        iM45029 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20975)) ^ 954008109;
                        i5 = 823176156;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x021d  */
    /* JADX WARN: Code duplicated, block: B:73:0x024e  */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m7809(int i, int i2, byte[] bArr) throws Throwable {
        int iM11306;
        int i3;
        int i4;
        int iM11307;
        int i5;
        int i6;
        int i7 = C2788.f10625;
        int i8 = C1460.f5948;
        int iM45029 = (C19806.m45029("ۡܶ") + i8) * 97;
        int i9 = ((iM45029 ^ i7) * 19971) ^ (-567822633);
        int i10 = iM45029 ^ 489079426;
        Object obj = null;
        int i11 = -2128437381;
        Throwable th = null;
        InterfaceC5614 interfaceC5614 = null;
        C13807 c13807M7800 = null;
        int length = 0;
        while (true) {
            int i12 = i10 ^ ((((i11 ^ i7) * (-2121)) >> 31) & i9);
            switch (i12) {
                case -1833090700:
                case -1201036931:
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("۠ܽ") ^ i7;
                        i3 = ((iM11306 ^ i8) * 827) ^ 1764751959;
                        i4 = -216339419;
                    } else {
                        iM11306 = C19806.m45029("۫۟") ^ i7;
                        i3 = ((iM11306 ^ i8) * (-9477)) ^ 1314922782;
                        i4 = -360485748;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1643043755:
                case 846275579:
                    length = bArr.length;
                    c13807M7800 = m7800();
                    interfaceC5614 = null;
                    iM11306 = (i8 - ThreadFactoryC3888.m11306("۠ۡ")) * 119;
                    i3 = ((iM11306 ^ i7) * (-23533)) ^ (-1134436221);
                    i4 = -1308984435;
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1367060701:
                case 1818633565:
                    if (C3743.m10966() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i8;
                        i3 = ((iM11306 ^ i7) * (-4641)) ^ 1372993629;
                        i4 = 1572242257;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܺ") ^ i8;
                        i3 = ((iM11306 ^ i7) * 30279) ^ 1584671388;
                        i4 = 482764136;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1336870256:
                case 562060629:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("۠ܽ") ^ i7;
                        i3 = ((iM11306 ^ i8) * 827) ^ 1764751959;
                        i4 = -216339419;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨܺ") ^ i8) * (-51);
                        i3 = ((iM11306 ^ i7) * (-19511)) ^ (-514064772);
                        i4 = 295530177;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1209296722:
                case 533973250:
                    try {
                        c13807M7800.m33605(i, i2, bArr, length, interfaceC5614);
                        c13807M7800.m33607((InterfaceC5614) null);
                        iM11307 = (i7 - ThreadFactoryC3888.m11306("ᩳۛ")) * (-119);
                        i9 = ((iM11307 ^ i8) * (-28445)) ^ 1893092934;
                        i5 = -245871041;
                    } catch (Throwable th2) {
                        th = th2;
                        iM11307 = ThreadFactoryC3888.m11306("ۖۙ") ^ i7;
                        i9 = ((iM11307 ^ i8) * (-4583)) ^ (-1763075769);
                        i5 = -1024554990;
                    }
                    i6 = iM11307 ^ i5;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -1180639848:
                case -97484860:
                    if (C1066.f4915 > 0) {
                        iM11306 = (C19806.m45029("۟۫") ^ i7) * (-53);
                        i3 = ((iM11306 ^ i8) * 19229) ^ 2074734830;
                        i4 = -316081993;
                        i6 = iM11306 ^ i4;
                        i9 = i3;
                        i10 = i6;
                        i11 = i12;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                    i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                    i4 = 499954198;
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -937246790:
                case -654312682:
                    C0278.m1789();
                    return;
                case -668784684:
                case -120570713:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i8;
                        i3 = ((iM11306 ^ i7) * 13877) ^ (-468219211);
                        i4 = -364756334;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۛ") ^ i8;
                        i3 = ((iM11306 ^ i7) * (-20309)) ^ 1090103254;
                        i4 = 391953861;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -515474085:
                case 1916493222:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("۟۫") ^ i7) * (-53);
                        i3 = ((iM11306 ^ i8) * 19229) ^ 2074734830;
                        i4 = -316081993;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ᩴ᩹")) * 23;
                        i3 = ((iM11306 ^ i8) * (-25511)) ^ (-663515177);
                        i4 = 1843913463;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case -445814869:
                case 385923079:
                    try {
                        c13807M7800.close();
                        iM11307 = C19806.m45029("ۡ᩸") ^ i8;
                        i9 = ((iM11307 ^ i7) * (-1049)) ^ (-36040357);
                        i5 = -807945095;
                        i6 = iM11307 ^ i5;
                        i10 = i6;
                        i11 = i12;
                    } catch (Throwable th3) {
                        int iM450210 = C19806.m45029("᩹ۢ") ^ i8;
                        i9 = ((iM450210 ^ i7) * (-12951)) ^ 1034487039;
                        int i13 = iM450210 ^ (-1787404643);
                        obj = th3;
                        i11 = i12;
                        i10 = i13;
                    }
                    break;
                case -358365150:
                case 734123640:
                    throw th;
                case -274097057:
                case 2116642625:
                    c13807M7800.close();
                    return;
                case -213197290:
                case 92442519:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ᩴ۬") + i7) * 65;
                        i3 = ((iM11306 ^ i8) * 13771) ^ 357675169;
                        i4 = -367904717;
                    } else {
                        iM11306 = (C19806.m45029("۟۫") ^ i7) * (-53);
                        i3 = ((iM11306 ^ i8) * 19229) ^ 2074734830;
                        i4 = -316081993;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 105191881:
                case 1912271049:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i8;
                        i3 = ((iM11306 ^ i7) * 13877) ^ (-468219211);
                        i4 = -364756334;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩵") ^ i8;
                        i3 = ((iM11306 ^ i7) * (-22895)) ^ 1989806611;
                        i4 = -1775425410;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 137358254:
                case 1439492528:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                        i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                        i4 = 499954198;
                    } else {
                        iM11306 = (C19806.m45029("֫۬") + i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM11306 ^ i8) * 7857) ^ (-830005957);
                        i4 = 1744864320;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 240394769:
                case 803289405:
                    RunnableC1606.m5473();
                    iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                    i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                    i4 = 499954198;
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 565192438:
                case 653580974:
                    C1148.m4232();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i8;
                        i3 = ((iM11306 ^ i7) * (-4641)) ^ 1372993629;
                        i4 = 1572242257;
                        i6 = iM11306 ^ i4;
                        i9 = i3;
                        i10 = i6;
                        i11 = i12;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                    i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                    i4 = 499954198;
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 585206988:
                case 1902370978:
                    ViewGroupOnHierarchyChangeListenerC1916.m6242(th, obj);
                    iM11307 = C19806.m45029("ۡ᩸") ^ i8;
                    i9 = ((iM11307 ^ i7) * (-1049)) ^ (-36040357);
                    i5 = -807945095;
                    i6 = iM11307 ^ i5;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 806556449:
                case 1275369171:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i8;
                        i3 = ((iM11306 ^ i7) * (-4641)) ^ 1372993629;
                        i4 = 1572242257;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۜ") + i7) * 35;
                        i3 = ((iM11306 ^ i8) * 5881) ^ 1788125821;
                        i4 = -1885800866;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                case 1064131342:
                case 1701739244:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                        i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                        i4 = 499954198;
                    } else {
                        iM11306 = C19806.m45029("۠᩶") ^ i8;
                        i3 = ((iM11306 ^ i7) * 8555) ^ (-1754654432);
                        i4 = -1475150605;
                    }
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
                default:
                    C0526.m2437();
                    if (!C7105.m18985()) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i8;
                        i3 = ((iM11306 ^ i7) * 13877) ^ (-468219211);
                        i4 = -364756334;
                        i6 = iM11306 ^ i4;
                        i9 = i3;
                        i10 = i6;
                        i11 = i12;
                    }
                    iM11306 = ThreadFactoryC3888.m11306("ܿۙ") ^ i7;
                    i3 = ((iM11306 ^ i8) * 31223) ^ (-1077747782);
                    i4 = 499954198;
                    i6 = iM11306 ^ i4;
                    i9 = i3;
                    i10 = i6;
                    i11 = i12;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0190 A[PHI: r6 r8 r9 r11 r19 r21
      0x0190: PHI (r6v5 long) = (r6v4 long), (r6v2 long), (r6v2 long), (r6v2 long) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r8v4 l.᩺ۖ᩹) = (r8v3 l.᩺ۖ᩹), (r8v2 l.᩺ۖ᩹), (r8v2 l.᩺ۖ᩹), (r8v2 l.᩺ۖ᩹) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r9v5 long) = (r9v2 long), (r9v4 long), (r9v2 long), (r9v2 long) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r11v5 long) = (r11v2 long), (r11v2 long), (r11v4 long), (r11v2 long) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r19v20 java.util.Iterator) = (r19v17 java.util.Iterator), (r19v18 java.util.Iterator), (r19v19 java.util.Iterator), (r19v23 java.util.Iterator) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r21v3 long) = (r21v2 long), (r21v2 long), (r21v2 long), (r21v5 long) binds: [B:49:0x018e, B:45:0x0166, B:41:0x0140, B:37:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m7772(C22710 c22710) {
        Iterator it;
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM450210;
        int i5;
        long j = 0;
        C23747 c23747 = null;
        long jM6676 = 0;
        C22710 c22711 = null;
        long jM3398 = 0;
        long jM3399 = 0;
        Iterator itM10563 = null;
        int i6 = 1987897466;
        int i7 = C2249.f8050;
        int i8 = C1066.f4915;
        int iM11307 = ThreadFactoryC3888.m11306("ܶܽ") ^ i8;
        int i9 = ((iM11307 ^ i7) * 11237) ^ 396605176;
        int i10 = iM11307 ^ 1945564102;
        long jM6677 = 0;
        ArrayList arrayList = null;
        IdentityHashMap identityHashMap = null;
        while (true) {
            ArrayDeque arrayDeque = null;
            while (true) {
                i6 = i10 ^ (i9 & (((i6 ^ i7) * (-13867)) >> 31));
                switch (i6) {
                    case -2075470577:
                    case 534407400:
                        if (C1875.f7103 < 0) {
                            it = itM10563;
                            int iM450211 = (C19806.m45029("ܽ۫") ^ i8) * 99;
                            i9 = ((iM450211 ^ i7) * (-26727)) ^ (-2123151551);
                            itM10563 = it;
                            i10 = iM450211 ^ 427872043;
                            arrayList = null;
                        } else {
                            iM450210 = C19806.m45029("ۜۨ") ^ i8;
                            i3 = ((iM450210 ^ i7) * (-15227)) ^ (-1588322342);
                            i5 = -625070587;
                            i10 = iM450210 ^ i5;
                            i9 = i3;
                        }
                        break;
                    case -1814769923:
                    case 1099135307:
                        C1025.m3861();
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                            it = itM10563;
                        }
                        iM450210 = C19806.m45029("ۜۨ") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-15227)) ^ (-1588322342);
                        i5 = -625070587;
                        i10 = iM450210 ^ i5;
                        i9 = i3;
                        break;
                    case -1752600455:
                    case -1369945338:
                        it = itM10563;
                        if (C0629.m2912(arrayDeque)) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۙ᩹") ^ i8) * (-115);
                            i3 = ((iM45029 ^ i7) * (-5861)) ^ 189517958;
                            i4 = 2143815812;
                        } else {
                            iM45029 = (C19806.m45029("ۚ᩶") + i7) * (-53);
                            i3 = ((iM45029 ^ i8) * (-22067)) ^ 1791652940;
                            i4 = 157514813;
                        }
                        int i11 = iM45029 ^ i4;
                        itM10563 = it;
                        i10 = i11;
                        i9 = i3;
                        break;
                    case -1703465182:
                    case 1964079093:
                        C1189.m4362(arrayDeque, (C23747) C0278.m1776(itM10563));
                        iM450210 = ThreadFactoryC3888.m11306("ۖܽ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 13607) ^ (-420226570);
                        i5 = 825588144;
                        i10 = iM450210 ^ i5;
                        i9 = i3;
                        break;
                    case -1585462535:
                    case 1265394495:
                        it = itM10563;
                        jM6676 = C2124.m6676(j, c23747.f76829);
                        c22711 = c23747.f76821;
                        if (C0817.f3443) {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ۖۙ")) * (-123);
                            i3 = ((iM45029 ^ i8) * 9141) ^ (-959697387);
                            i4 = 569799825;
                        } else {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢ۟")) * 37;
                            i3 = ((iM45029 ^ i8) * 18929) ^ 1987785203;
                            i4 = -773809966;
                        }
                        int i12 = iM45029 ^ i4;
                        itM10563 = it;
                        i10 = i12;
                        i9 = i3;
                        break;
                    case -1320775731:
                    case 1967641218:
                        it = itM10563;
                        jM3398 = C0817.m3398(jM6676, C7893.m20875(c22711));
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = ThreadFactoryC3888.m11306("ܽۘ") ^ i8;
                            i3 = ((iM45029 ^ i7) * (-30581)) ^ 562261183;
                            i4 = 658300519;
                        } else {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢ۟")) * 37;
                            i3 = ((iM45029 ^ i8) * 18929) ^ 1987785203;
                            i4 = -773809966;
                        }
                        int i13 = iM45029 ^ i4;
                        itM10563 = it;
                        i10 = i13;
                        i9 = i3;
                        break;
                    case -1168959657:
                    case 872039506:
                        return j;
                    case -1090331417:
                    case -594792580:
                        C2704.m8255();
                        return 0L;
                    case -982577366:
                    case -36565441:
                        it = itM10563;
                        jM6677 = C2124.m6676(jM3399, C7893.m20827(c23747.f76821));
                        if (C1066.f4915 <= 0) {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢ۟")) * 37;
                            i3 = ((iM45029 ^ i8) * 18929) ^ 1987785203;
                            i4 = -773809966;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶ᩻") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i3 = ((iM45029 ^ i7) * 21405) ^ 383154972;
                            i4 = 617138723;
                        }
                        int i14 = iM45029 ^ i4;
                        itM10563 = it;
                        i10 = i14;
                        i9 = i3;
                        break;
                    case -846488678:
                    case 1763625316:
                        it = itM10563;
                        if (ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c23747, Boolean.TRUE) == null) {
                            iM45029 = C19806.m45029("۬ۛ") ^ i8;
                            i3 = ((iM45029 ^ i7) * 3011) ^ 526720268;
                            i4 = 785422142;
                            int i15 = iM45029 ^ i4;
                            itM10563 = it;
                            i10 = i15;
                            i9 = i3;
                        } else {
                            iM11306 = (C19806.m45029("ܶ֫") + i7) * (-49);
                            i = ((iM11306 ^ i8) * 18757) ^ 932972869;
                            i2 = -1151796507;
                            i9 = i;
                            itM10563 = it;
                            i10 = iM11306 ^ i2;
                        }
                        break;
                    case -245513335:
                    case 373963887:
                        it = itM10563;
                        if (!C2332.f8260) {
                            int iM450212 = (C19806.m45029("ܽ۫") ^ i8) * 99;
                            i9 = ((iM450212 ^ i7) * (-26727)) ^ (-2123151551);
                            itM10563 = it;
                            i10 = iM450212 ^ 427872043;
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            if (!C10634.m26820()) {
                                iM11306 = (ThreadFactoryC3888.m11306("ۗ֨") + i8) * 47;
                                i = ((iM11306 ^ i7) * (-28551)) ^ (-327527291);
                                i2 = 2063306899;
                                i9 = i;
                                itM10563 = it;
                                i10 = iM11306 ^ i2;
                            }
                        }
                        break;
                    case 518573352:
                    case 1316125040:
                        C1066.m4023();
                        AbstractC0464.m2313();
                        iM450210 = C19806.m45029("ۜۨ") ^ i8;
                        i3 = ((iM450210 ^ i7) * (-15227)) ^ (-1588322342);
                        i5 = -625070587;
                        i10 = iM450210 ^ i5;
                        i9 = i3;
                        break;
                    case 576572484:
                    case 874151523:
                        it = itM10563;
                        c23747 = (C23747) arrayDeque.pop();
                        if (C1937.f7317 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ܰܺ") ^ i7;
                            i3 = ((iM45029 ^ i8) * (-22021)) ^ 119498039;
                            i4 = 233319679;
                            int i16 = iM45029 ^ i4;
                            itM10563 = it;
                            i10 = i16;
                            i9 = i3;
                        } else {
                            int iM450213 = (C19806.m45029("ܽ۫") ^ i8) * 99;
                            i9 = ((iM450213 ^ i7) * (-26727)) ^ (-2123151551);
                            itM10563 = it;
                            i10 = iM450213 ^ 427872043;
                            arrayList = null;
                        }
                        break;
                    case 597879493:
                    case 1418300409:
                        if (!RunnableC1564.m5348(itM10563)) {
                            it = itM10563;
                            j = jM6677;
                            iM11306 = (C19806.m45029("ܶ֫") + i7) * (-49);
                            i = ((iM11306 ^ i8) * 18757) ^ 932972869;
                            i2 = -1151796507;
                            i9 = i;
                            itM10563 = it;
                            i10 = iM11306 ^ i2;
                        } else {
                            iM450210 = C19806.m45029("ۚܳ") ^ i7;
                            i3 = ((iM450210 ^ i8) * (-3215)) ^ 856565455;
                            i5 = 1511302612;
                            i10 = iM450210 ^ i5;
                            i9 = i3;
                        }
                        break;
                    case 850201464:
                    case 1186741120:
                        MenuItemOnMenuItemClickListenerC3244.m9710(arrayList);
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM450210 = C19806.m45029("ۜۨ") ^ i8;
                            i3 = ((iM450210 ^ i7) * (-15227)) ^ (-1588322342);
                            i5 = -625070587;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("֨۟") ^ i7) * 23;
                            i3 = ((iM450210 ^ i8) * 31467) ^ (-602298853);
                            i5 = 417592122;
                        }
                        i10 = iM450210 ^ i5;
                        i9 = i3;
                        break;
                    case 1115689010:
                    case 1590376691:
                        it = itM10563;
                        jM3399 = C0817.m3398(jM3398, C7893.m20876(c23747.f76821));
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = (i7 - ThreadFactoryC3888.m11306("ۢ۟")) * 37;
                            i3 = ((iM45029 ^ i8) * 18929) ^ 1987785203;
                            i4 = -773809966;
                        } else {
                            iM45029 = (C19806.m45029("ܽۖ") ^ i7) * 35;
                            i3 = ((iM45029 ^ i8) * 3787) ^ 1222729073;
                            i4 = -1334582275;
                        }
                        int i17 = iM45029 ^ i4;
                        itM10563 = it;
                        i10 = i17;
                        i9 = i3;
                        break;
                    case 1343896530:
                    case 1352433611:
                        m7778(c23747.f76821, arrayList);
                        itM10563 = C3577.m10563(arrayList);
                        iM450210 = ThreadFactoryC3888.m11306("ۖܽ") ^ i8;
                        i3 = ((iM450210 ^ i7) * 13607) ^ (-420226570);
                        i5 = 825588144;
                        i10 = iM450210 ^ i5;
                        i9 = i3;
                        break;
                    case 1618809307:
                    case 1635932314:
                        if (!C19806.f63586) {
                            it = itM10563;
                            int iM11308 = ThreadFactoryC3888.m11306("᩷۠") ^ i8;
                            i9 = ((iM11308 ^ i7) * (-17409)) ^ (-1998706464);
                            itM10563 = it;
                            i10 = iM11308 ^ 734882647;
                            identityHashMap = null;
                        } else {
                            iM450210 = C19806.m45029("ۜۨ") ^ i8;
                            i3 = ((iM450210 ^ i7) * (-15227)) ^ (-1588322342);
                            i5 = -625070587;
                            i10 = iM450210 ^ i5;
                            i9 = i3;
                        }
                        break;
                    default:
                        it = itM10563;
                        m7778(c22710, arrayList);
                        if (C1066.m4023() > 0) {
                            identityHashMap = new IdentityHashMap();
                            if (!C1977.m6356()) {
                                arrayDeque = new ArrayDeque(arrayList);
                                j = 0;
                                iM11306 = (C19806.m45029("ܶ֫") + i7) * (-49);
                                i = ((iM11306 ^ i8) * 18757) ^ 932972869;
                                i2 = -1151796507;
                                i9 = i;
                                itM10563 = it;
                                i10 = iM11306 ^ i2;
                            }
                        } else {
                            int iM11309 = ThreadFactoryC3888.m11306("᩷۠") ^ i8;
                            i9 = ((iM11309 ^ i7) * (-17409)) ^ (-1998706464);
                            itM10563 = it;
                            i10 = iM11309 ^ 734882647;
                            identityHashMap = null;
                        }
                        break;
                }
            }
            int iM113010 = ThreadFactoryC3888.m11306("ܿ۟") ^ i7;
            i9 = ((iM113010 ^ i8) * 13895) ^ 760560518;
            itM10563 = it;
            i10 = iM113010 ^ (-1579028875);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0111 A[PHI: r5 r6
      0x0111: PHI (r5v5 int) = (r5v4 int), (r5v2 int), (r5v2 int) binds: [B:46:0x010f, B:42:0x00f1, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:46:0x010f, B:42:0x00f1, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0174 A[PHI: r1 r2
      0x0174: PHI (r1v4 char) = (r1v3 char), (r1v2 char), (r1v2 char) binds: [B:55:0x0172, B:51:0x0153, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r2v4 short) = (r2v2 short), (r2v3 short), (r2v2 short) binds: [B:55:0x0172, B:51:0x0153, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3 A[PHI: r3 r4
      0x01a3: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:59:0x01a1, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x01a3: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:59:0x01a1, B:7:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (l.C0216.f1393 == 0) goto L19;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.IOException m7773(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7773(java.lang.String):java.io.IOException");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x025b A[PHI: r17
      0x025b: PHI (r17v4 java.lang.Long) = (r17v1 java.lang.Long), (r17v3 java.lang.Long), (r17v1 java.lang.Long) binds: [B:195:0x025b, B:74:0x0259, B:13:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
    
        if (l.C1148.f5161 > 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22710 m7733(l.C22710 r38, long r39, l.C15986 r41) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7733(l.᩺ۖ᩹, long, l.ܺܰ᩹):l.᩺ۖ᩹");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x024a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x0287  */
    /* JADX WARN: Code duplicated, block: B:116:0x0297  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc A[LOOP:11: B:122:0x02c6->B:124:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0302 A[LOOP:12: B:127:0x0300->B:128:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0317  */
    /* JADX WARN: Code duplicated, block: B:134:0x032b A[LOOP:14: B:133:0x0329->B:134:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x037f A[LOOP:13: B:130:0x0311->B:137:0x037f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x03aa A[LOOP:15: B:141:0x03a4->B:143:0x03aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:179:0x0458  */
    /* JADX WARN: Code duplicated, block: B:182:0x045f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0474  */
    /* JADX WARN: Code duplicated, block: B:188:0x0483  */
    /* JADX WARN: Code duplicated, block: B:190:0x048f  */
    /* JADX WARN: Code duplicated, block: B:191:0x049a  */
    /* JADX WARN: Code duplicated, block: B:193:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:200:0x04da  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:204:0x0503  */
    /* JADX WARN: Code duplicated, block: B:205:0x0509  */
    /* JADX WARN: Code duplicated, block: B:221:0x0551  */
    /* JADX WARN: Code duplicated, block: B:240:0x05d2 A[EDGE_INSN: B:240:0x05d2->B:245:0x0608 BREAK  A[LOOP:17: B:154:0x03e8->B:175:0x044c]] */
    /* JADX WARN: Code duplicated, block: B:241:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:243:0x05e5 A[LOOP:24: B:242:0x05e3->B:243:0x05e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x060a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0614  */
    /* JADX WARN: Code duplicated, block: B:251:0x061e A[Catch: IOException -> 0x0660, Error -> 0x0665, Error | RuntimeException -> 0x0667, TRY_ENTER, TryCatch #5 {IOException -> 0x0660, blocks: (B:251:0x061e, B:253:0x0628), top: B:295:0x061c }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0628 A[Catch: IOException -> 0x0660, Error -> 0x0665, Error | RuntimeException -> 0x0667, TRY_LEAVE, TryCatch #5 {IOException -> 0x0660, blocks: (B:251:0x061e, B:253:0x0628), top: B:295:0x061c }] */
    /* JADX WARN: Code duplicated, block: B:256:0x063b A[Catch: Error -> 0x065a, RuntimeException -> 0x065c, IOException -> 0x065e, TRY_ENTER, TryCatch #7 {IOException -> 0x065e, Error -> 0x065a, RuntimeException -> 0x065c, blocks: (B:256:0x063b, B:258:0x0641), top: B:297:0x0639 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0641 A[Catch: Error -> 0x065a, RuntimeException -> 0x065c, IOException -> 0x065e, TRY_LEAVE, TryCatch #7 {IOException -> 0x065e, Error -> 0x065a, RuntimeException -> 0x065c, blocks: (B:256:0x063b, B:258:0x0641), top: B:297:0x0639 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x066b  */
    /* JADX WARN: Code duplicated, block: B:317:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x044f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x05ce A[EDGE_INSN: B:359:0x05ce->B:238:0x05ce BREAK  A[LOOP:19: B:177:0x0452->B:237:0x05c2, LOOP_LABEL: LOOP:19: B:177:0x0452->B:237:0x05c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd A[LOOP:6: B:89:0x01c7->B:91:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:241:0x05d4, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9636 m7731(C22710 c22710, long j, C15986 c15986, InterfaceC5614 interfaceC5614) throws Throwable {
        long j2;
        C7518 c7518;
        HashMap map;
        ArrayList arrayList;
        Iterator itM10563;
        int[] iArr;
        ArrayList arrayList2;
        IdentityHashMap identityHashMap;
        Iterator itM10564;
        C8224 c8224;
        int iM4837;
        long[] jArr;
        long[] jArr2;
        ArrayList arrayList3;
        int i;
        Iterator itM10565;
        C22710 c22711;
        int i2;
        long[] jArr3;
        long j3;
        Iterator itM10566;
        long jM3398;
        int i3;
        int i4;
        C8930 c8930M7730;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList4;
        IdentityHashMap identityHashMap2;
        int i8;
        ArrayList arrayList5;
        int i9;
        C8930 c8930;
        C19513 c19513M23221;
        Iterator itM10567;
        C8930 c8931;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i10;
        long[] jArr4;
        ArrayList arrayList8;
        C8930 c8932;
        ArrayList arrayList9;
        int length;
        int[] iArr2;
        int length2;
        boolean z;
        int i11;
        long jM3399;
        int i12;
        int i13;
        Iterator itM9863;
        long j4;
        C8930 c8933;
        long j5;
        C19513 c19513;
        int[] iArr3;
        int length3;
        int i14;
        C22710 c22712;
        long jM6676;
        Iterator it;
        long jLongValue;
        long j6;
        ArrayList arrayList10;
        int i15;
        int i16;
        long[] jArr5;
        C10341 c10341;
        int iM938;
        ArrayList arrayList11;
        ArrayDeque arrayDeque;
        int i17;
        int[] iArr4;
        C10341 c10342;
        C18101[] c18101ArrM26246;
        int length4;
        int i18;
        C18101 c18101;
        Iterator itM10568;
        C10341 c10343;
        ArrayList arrayList12;
        int[] iArr5;
        int i19;
        C19513 c19514;
        Long lM9877;
        C22710 c22713;
        InterfaceC18745[] interfaceC18745Arr;
        C18101 c18102;
        int i20;
        char c;
        C18101 c18101M42154;
        long j7;
        ArrayList arrayList13;
        int i21;
        C22710 c22710M7733 = m7733(c22710, j, c15986);
        if (c22710M7733 == null) {
            return new C9636(null, f9976);
        }
        if (interfaceC5614 == null) {
            return new C9636(c22710M7733, f9976);
        }
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayList arrayList14 = new ArrayList();
        m7749(c22710M7733, identityHashMap3, arrayList14, new IdentityHashMap());
        ArrayList arrayList15 = new ArrayList();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        ArrayList arrayList16 = new ArrayList();
        Iterator itM9864 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList14);
        while (C0962.m3748(itM9864)) {
            InterfaceC18745 interfaceC18745 = (InterfaceC18745) C0216.m1584(itM9864);
            long jLongValue2 = ((Long) identityHashMap3.get(interfaceC18745)).longValue();
            IdentityHashMap identityHashMap5 = new IdentityHashMap();
            ArrayList arrayList17 = new ArrayList();
            m7744(interfaceC18745, identityHashMap5, arrayList17, new IdentityHashMap());
            int iM939 = C0050.m938(arrayList15);
            int i22 = (int) jLongValue2;
            IdentityHashMap identityHashMap6 = identityHashMap3;
            Iterator it2 = itM9864;
            if (jLongValue2 != i22) {
                throw new ArithmeticException();
            }
            C10341 c10344 = new C10341(iM939, interfaceC18745, i22, (C18101[]) arrayList17.toArray(new C18101[0]));
            C2249.m6905(arrayList15, c10344);
            Iterator itM9865 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList17);
            while (RunnableC1564.m5348(itM9865)) {
                C18101 c18103 = (C18101) C0216.m1584(itM9865);
                ArrayList arrayList18 = (ArrayList) identityHashMap4.get(c18103);
                if (arrayList18 == null) {
                    arrayList18 = new ArrayList();
                    ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap4, c18103, arrayList18);
                    C3660.m10788(arrayList16, c18103);
                }
                C2249.m6905(arrayList18, c10344);
            }
            identityHashMap3 = identityHashMap6;
            itM9864 = it2;
        }
        synchronized (f9975) {
            C1873 c1873 = f9973;
            if (c1873 == null || !c1873.m6081()) {
                j2 = 33554432;
            } else {
                long j8 = c1873.f7096;
                Iterator itM10569 = C3577.m10563(arrayList16);
                while (true) {
                    if (!RunnableC1564.m5348(itM10569)) {
                        j2 = 33554432;
                        j7 = -1;
                        arrayList13 = null;
                        i21 = 0;
                        break;
                    }
                    C18101 c18104 = (C18101) C0278.m1776(itM10569);
                    C21629 c21629 = c18104.f57884;
                    if (c21629.f70147 == c1873 && c21629.f70149 + ((long) c21629.f70150) == j8) {
                        arrayList13 = (ArrayList) identityHashMap4.get(c18104);
                        Iterator itM9866 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList13);
                        long jM33910 = 0;
                        while (RunnableC1564.m5348(itM9866)) {
                            jM33910 = C0817.m3398(jM33910, ((C10341) C0278.m1776(itM9866)).m26245());
                        }
                        if (jM33910 > 0 && jM33910 <= 33554432) {
                            int i23 = (int) jM33910;
                            if (jM33910 != i23) {
                                throw new ArithmeticException();
                            }
                            j7 = c21629.f70149;
                            j2 = 33554432;
                            i21 = i23;
                            break;
                        }
                    }
                }
                if (arrayList13 != null) {
                    synchronized (f9975) {
                        if (f9973 == c1873 && c1873.f7096 == j8 && c1873.m6081() && c1873.m6084(i21, j7)) {
                            IdentityHashMap identityHashMap7 = new IdentityHashMap();
                            Iterator itM9867 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList13);
                            while (C0962.m3748(itM9867)) {
                                C0629.m2904(identityHashMap7, ((C10341) C0216.m1584(itM9867)).m26248(), Boolean.TRUE);
                            }
                            c7518 = new C7518(identityHashMap7, i21, c1873, j7);
                        }
                    }
                }
                if (c7518 != null) {
                    map = new HashMap();
                    arrayList = new ArrayList();
                    itM10563 = C3577.m10563(arrayList16);
                    while (C0962.m3748(itM10563)) {
                        C18101 c18105 = (C18101) C0278.m1776(itM10563);
                        arrayList12 = (ArrayList) identityHashMap4.get(c18105);
                        iArr5 = new int[C1377.m4837(arrayList12)];
                        for (i19 = 0; i19 < C0050.m938(arrayList12); i19++) {
                            iArr5[i19] = ((C10341) C1419.m4967(arrayList12, i19)).m26247();
                        }
                        c19514 = new C19513(iArr5);
                        lM9877 = (Long) C2332.m7077(map, c19514);
                        if (lM9877 == null) {
                            C2249.m6905(arrayList, c19514);
                            lM9877 = ViewTreeObserverOnPreDrawListenerC3327.m9877(0L);
                        }
                        RunnableC1895.m6172(map, c19514, ViewTreeObserverOnPreDrawListenerC3327.m9877(C2124.m6676(lM9877.longValue(), c18105.mo8035())));
                    }
                    iArr = new int[C0050.m938(arrayList15)];
                    Arrays.fill(iArr, -1);
                    arrayList2 = new ArrayList();
                    identityHashMap = new IdentityHashMap();
                    itM10564 = C3577.m10563(arrayList15);
                    while (RunnableC1564.m5348(itM10564)) {
                        c10341 = (C10341) C0216.m1584(itM10564);
                        if (iArr[c10341.m26247()] >= 0) {
                            iM938 = C0050.m938(arrayList2);
                            arrayList11 = new ArrayList();
                            arrayDeque = new ArrayDeque();
                            C1189.m4362(arrayDeque, c10341);
                            while (!ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                                c10342 = (C10341) arrayDeque.pop();
                                if (iArr[c10342.m26247()] >= 0) {
                                    iArr[c10342.m26247()] = iM938;
                                    Iterator it3 = itM10564;
                                    C3660.m10788(arrayList11, C2788.m8476(c10342.m26247()));
                                    c18101ArrM26246 = c10342.m26246();
                                    length4 = c18101ArrM26246.length;
                                    int i24 = iM938;
                                    i18 = 0;
                                    while (i18 < length4) {
                                        int i25 = length4;
                                        c18101 = c18101ArrM26246[i18];
                                        C18101[] c18101Arr = c18101ArrM26246;
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c18101, Boolean.TRUE) != null) {
                                            itM10568 = C3577.m10563((ArrayList) identityHashMap4.get(c18101));
                                            while (C0962.m3748(itM10568)) {
                                                c10343 = (C10341) C0278.m1776(itM10568);
                                                if (iArr[c10343.m26247()] < 0) {
                                                    C1189.m4362(arrayDeque, c10343);
                                                }
                                            }
                                        }
                                        i18++;
                                        c18101ArrM26246 = c18101Arr;
                                        length4 = i25;
                                    }
                                    itM10564 = it3;
                                    iM938 = i24;
                                }
                            }
                            Iterator it4 = itM10564;
                            C23846.sort(arrayList11, new C11752(0));
                            iArr4 = new int[C1377.m4837(arrayList11)];
                            for (i17 = 0; i17 < C1377.m4837(arrayList11); i17++) {
                                iArr4[i17] = C2124.m6682((Integer) C3286.m9796(arrayList11, i17));
                            }
                            C2249.m6905(arrayList2, new C19513(iArr4));
                            itM10564 = it4;
                        }
                    }
                    c8224 = new C8224(arrayList2, iArr);
                    iM4837 = C1377.m4837((ArrayList) c8224.m21538());
                    jArr = new long[iM4837];
                    jArr2 = new long[iM4837];
                    arrayList3 = new ArrayList(iM4837);
                    for (i = 0; i < iM4837; i++) {
                        C3660.m10788(arrayList3, new ArrayList());
                    }
                    itM10565 = C3577.m10563(arrayList);
                    while (RunnableC1564.m5348(itM10565)) {
                        c19513 = (C19513) C0216.m1584(itM10565);
                        iArr3 = c19513.f62754;
                        i14 = 0;
                        c22712 = c22710M7733;
                        jM6676 = 0;
                        for (length3 = iArr3.length; i14 < length3; length3 = length3) {
                            jM6676 = C2124.m6676(jM6676, ((C10341) C1419.m4967(arrayList15, iArr3[i14])).m26245());
                            i14++;
                            itM10565 = itM10565;
                            iArr3 = iArr3;
                        }
                        it = itM10565;
                        int i26 = c8224.m21537()[c19513.f62754[0]];
                        jLongValue = ((Long) C2332.m7077(map, c19513)).longValue();
                        j6 = j2;
                        jArr[i26] = C0817.m3398(jArr[i26], jLongValue);
                        arrayList10 = (ArrayList) C3286.m9796(arrayList3, i26);
                        i15 = (int) jM6676;
                        i16 = iM4837;
                        jArr5 = jArr;
                        if (jM6676 == i15) {
                            throw new ArithmeticException();
                        }
                        C2249.m6905(arrayList10, new C8930(c19513, i15, jLongValue - jM6676));
                        c22710M7733 = c22712;
                        itM10565 = it;
                        j2 = j6;
                        iM4837 = i16;
                        jArr = jArr5;
                    }
                    c22711 = c22710M7733;
                    i2 = iM4837;
                    jArr3 = jArr;
                    j3 = j2;
                    itM10566 = C3577.m10563(arrayList15);
                    while (C0962.m3748(itM10566)) {
                        C10341 c10345 = (C10341) C0278.m1776(itM10566);
                        int i27 = c8224.m21537()[c10345.m26247()];
                        jArr2[i27] = C2124.m6676(jArr2[i27], c10345.m26245());
                    }
                    jM3398 = 0;
                    for (i3 = 0; i3 < i2; i3++) {
                        j5 = jArr3[i3] - jArr2[i3];
                        if (j5 > 0) {
                            jM3398 = C0817.m3398(jM3398, j5);
                        }
                    }
                    if (jM3398 <= j3) {
                        c7518 = null;
                        break;
                    }
                    i4 = 0;
                    c8930M7730 = null;
                    while (true) {
                        i5 = 33554432;
                        if (i4 < i2) {
                            i6 = 0;
                            i7 = 1048576;
                            loop19: while (i6 < C1377.m4837(arrayList3)) {
                                if (jArr2[i6] > j3) {
                                    arrayList5 = (ArrayList) C3286.m9796(arrayList3, i6);
                                    if (C1377.m4837(arrayList5) >= 2) {
                                        C23846.sort(arrayList5, new C13869());
                                        i9 = 0;
                                        while (i9 < C0050.m938(arrayList5)) {
                                            c8930 = (C8930) C1419.m4967(arrayList5, i9);
                                            if (c8930.m23220() > i5) {
                                                arrayList6 = arrayList15;
                                                arrayList7 = arrayList5;
                                                i10 = i9;
                                                jArr4 = jArr2;
                                                arrayList8 = arrayList3;
                                            } else {
                                                c19513M23221 = c8930.m23221();
                                                int iM23220 = c8930.m23220();
                                                long jM23219 = c8930.m23219() + ((long) iM23220);
                                                if (c8930.m23219() > 0) {
                                                    c8930M7730 = m7730(c8930M7730, c8930);
                                                }
                                                while (true) {
                                                    itM10567 = C3577.m10563(arrayList5);
                                                    c8931 = null;
                                                    long j9 = 0;
                                                    long j10 = 0;
                                                    while (C0962.m3748(itM10567)) {
                                                        c8932 = (C8930) C0216.m1584(itM10567);
                                                        arrayList9 = arrayList5;
                                                        length = c8932.m23221().f62754.length;
                                                        if (length > i7) {
                                                            break loop19;
                                                        }
                                                        int i28 = i7 - length;
                                                        iArr2 = c8932.m23221().f62754;
                                                        length2 = iArr2.length;
                                                        z = false;
                                                        Iterator it5 = itM10567;
                                                        i11 = 0;
                                                        long[] jArr6 = jArr2;
                                                        ArrayList arrayList19 = arrayList3;
                                                        jM3399 = 0;
                                                        while (i11 < length2) {
                                                            int i29 = length2;
                                                            i13 = iArr2[i11];
                                                            if (c19513M23221.m44574(i13)) {
                                                                z = true;
                                                            } else {
                                                                jM3399 = C0817.m3398(jM3399, ((C10341) C1419.m4967(arrayList15, i13)).m26245());
                                                            }
                                                            i11++;
                                                            length2 = i29;
                                                            arrayList15 = arrayList15;
                                                        }
                                                        ArrayList arrayList20 = arrayList15;
                                                        if (z || jM3399 == 0 || ((long) iM23220) + jM3399 > j3) {
                                                            i12 = i9;
                                                        } else {
                                                            i12 = i9;
                                                            long jM232110 = (c8932.m23219() + ((long) c8932.m23220())) - jM3399;
                                                            if (jM232110 > j9 || (jM232110 == j9 && c8931 != null && jM3399 < j10)) {
                                                                j9 = jM232110;
                                                                j10 = jM3399;
                                                                c8931 = c8932;
                                                            }
                                                        }
                                                        arrayList5 = arrayList9;
                                                        i9 = i12;
                                                        i7 = i28;
                                                        itM10567 = it5;
                                                        jArr2 = jArr6;
                                                        arrayList3 = arrayList19;
                                                        arrayList15 = arrayList20;
                                                    }
                                                    arrayList6 = arrayList15;
                                                    arrayList7 = arrayList5;
                                                    i10 = i9;
                                                    jArr4 = jArr2;
                                                    arrayList8 = arrayList3;
                                                    if (c8931 == null || j9 <= 0) {
                                                        break;
                                                    }
                                                    c19513M23221 = c19513M23221.m44573(c8931.m23221());
                                                    long j11 = ((long) iM23220) + j10;
                                                    iM23220 = (int) j11;
                                                    long j12 = iM23220;
                                                    if (j11 != j12) {
                                                        throw new ArithmeticException();
                                                    }
                                                    jM23219 = C0817.m3398(jM23219, c8931.m23219() + ((long) c8931.m23220()));
                                                    long j13 = jM23219 - j12;
                                                    if (j13 > 0) {
                                                        c8930M7730 = m7730(c8930M7730, new C8930(c19513M23221, iM23220, j13));
                                                    }
                                                    arrayList5 = arrayList7;
                                                    i9 = i10;
                                                    jArr2 = jArr4;
                                                    arrayList3 = arrayList8;
                                                    arrayList15 = arrayList6;
                                                }
                                            }
                                            i9 = i10 + 1;
                                            i5 = 33554432;
                                            arrayList5 = arrayList7;
                                            jArr2 = jArr4;
                                            arrayList3 = arrayList8;
                                            arrayList15 = arrayList6;
                                        }
                                    }
                                }
                                i6++;
                                i5 = 33554432;
                                jArr2 = jArr2;
                                arrayList3 = arrayList3;
                                arrayList15 = arrayList15;
                            }
                            arrayList4 = arrayList15;
                            if (c8930M7730 == null) {
                                identityHashMap2 = new IdentityHashMap();
                                for (int i30 : c8930M7730.m23221().f62754) {
                                    C0629.m2904(identityHashMap2, ((C10341) C3286.m9796(arrayList4, i30)).m26248(), Boolean.TRUE);
                                }
                                c7518 = new C7518(identityHashMap2, c8930M7730.m23220(), null, -1L);
                                break;
                            }
                            c7518 = null;
                            break;
                        }
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863((ArrayList) C3286.m9796(arrayList3, i4));
                        while (RunnableC1564.m5348(itM9863)) {
                            c8933 = (C8930) C0216.m1584(itM9863);
                            if (c8933.m23220() > 33554432 && c8933.m23219() > 0) {
                                c8930M7730 = m7730(c8930M7730, c8933);
                            }
                        }
                        j4 = jArr2[i4];
                        long j14 = jArr3[i4] - j4;
                        if (j4 <= 0 && j4 <= j3 && j14 > 0) {
                            C19513 c19515 = (C19513) C1419.m4967((ArrayList) c8224.m21538(), i4);
                            int i31 = (int) j4;
                            if (j4 != i31) {
                                throw new ArithmeticException();
                            }
                            c8930M7730 = m7730(c8930M7730, new C8930(c19515, i31, j14));
                        }
                        i4++;
                    }
                } else {
                    c22711 = c22710M7733;
                }
                if (c7518 == null) {
                    return new C9636(c22711, f9976);
                }
                c22713 = c22711;
                interfaceC18745Arr = f9976;
                try {
                    try {
                        try {
                            if (c7518.m20030() == null) {
                                c18101M42154 = C18101.m42153(c7518.m20032());
                            } else {
                                c18101M42154 = C18101.m42154(c7518.m20032(), c7518.m20031(), c7518.m20030());
                            }
                            c18102 = c18101M42154;
                            try {
                                if (c18102 == null) {
                                    return new C9636(c22713, interfaceC18745Arr);
                                }
                                C22710 c22710M7735 = m7735(c22713, c7518.m20033(), c18102, interfaceC5614);
                                c18102.finish();
                                return new C9636(c22710M7735, new InterfaceC18745[]{c18102});
                            } catch (IOException e) {
                                e = e;
                                i20 = 1;
                                c = 0;
                                if (c18102 != null) {
                                    InterfaceC18745[] interfaceC18745Arr2 = new InterfaceC18745[i20];
                                    interfaceC18745Arr2[c] = c18102;
                                    m7780(interfaceC18745Arr2, e);
                                }
                                if ((e instanceof C1105) || c7518.m20030() == null) {
                                    throw e;
                                }
                                return new C9636(c22713, interfaceC18745Arr);
                            } catch (Error e2) {
                                e = e2;
                                if (c18102 != null) {
                                    m7780(new InterfaceC18745[]{c18102}, e);
                                }
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                if (c18102 != null) {
                                    m7780(new InterfaceC18745[]{c18102}, e);
                                }
                                throw e;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            c18102 = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i20 = 1;
                        c = 0;
                        c18102 = null;
                    }
                } catch (Error | RuntimeException e6) {
                    e = e6;
                    c18102 = null;
                }
            }
        }
        c7518 = null;
        if (c7518 != null) {
            map = new HashMap();
            arrayList = new ArrayList();
            itM10563 = C3577.m10563(arrayList16);
            while (C0962.m3748(itM10563)) {
                C18101 c18106 = (C18101) C0278.m1776(itM10563);
                arrayList12 = (ArrayList) identityHashMap4.get(c18106);
                iArr5 = new int[C1377.m4837(arrayList12)];
                while (i19 < C0050.m938(arrayList12)) {
                    iArr5[i19] = ((C10341) C1419.m4967(arrayList12, i19)).m26247();
                }
                c19514 = new C19513(iArr5);
                lM9877 = (Long) C2332.m7077(map, c19514);
                if (lM9877 == null) {
                    C2249.m6905(arrayList, c19514);
                    lM9877 = ViewTreeObserverOnPreDrawListenerC3327.m9877(0L);
                }
                RunnableC1895.m6172(map, c19514, ViewTreeObserverOnPreDrawListenerC3327.m9877(C2124.m6676(lM9877.longValue(), c18106.mo8035())));
            }
            iArr = new int[C0050.m938(arrayList15)];
            Arrays.fill(iArr, -1);
            arrayList2 = new ArrayList();
            identityHashMap = new IdentityHashMap();
            itM10564 = C3577.m10563(arrayList15);
            while (RunnableC1564.m5348(itM10564)) {
                c10341 = (C10341) C0216.m1584(itM10564);
                if (iArr[c10341.m26247()] >= 0) {
                    iM938 = C0050.m938(arrayList2);
                    arrayList11 = new ArrayList();
                    arrayDeque = new ArrayDeque();
                    C1189.m4362(arrayDeque, c10341);
                    while (!ViewGroupOnHierarchyChangeListenerC1916.m6240(arrayDeque)) {
                        c10342 = (C10341) arrayDeque.pop();
                        if (iArr[c10342.m26247()] >= 0) {
                            iArr[c10342.m26247()] = iM938;
                            Iterator it6 = itM10564;
                            C3660.m10788(arrayList11, C2788.m8476(c10342.m26247()));
                            c18101ArrM26246 = c10342.m26246();
                            length4 = c18101ArrM26246.length;
                            int i210 = iM938;
                            i18 = 0;
                            while (i18 < length4) {
                                int i211 = length4;
                                c18101 = c18101ArrM26246[i18];
                                C18101[] c18101Arr2 = c18101ArrM26246;
                                if (ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c18101, Boolean.TRUE) != null) {
                                    itM10568 = C3577.m10563((ArrayList) identityHashMap4.get(c18101));
                                    while (C0962.m3748(itM10568)) {
                                        c10343 = (C10341) C0278.m1776(itM10568);
                                        if (iArr[c10343.m26247()] < 0) {
                                            C1189.m4362(arrayDeque, c10343);
                                        }
                                    }
                                }
                                i18++;
                                c18101ArrM26246 = c18101Arr2;
                                length4 = i211;
                            }
                            itM10564 = it6;
                            iM938 = i210;
                        }
                    }
                    Iterator it7 = itM10564;
                    C23846.sort(arrayList11, new C11752(0));
                    iArr4 = new int[C1377.m4837(arrayList11)];
                    while (i17 < C1377.m4837(arrayList11)) {
                        iArr4[i17] = C2124.m6682((Integer) C3286.m9796(arrayList11, i17));
                    }
                    C2249.m6905(arrayList2, new C19513(iArr4));
                    itM10564 = it7;
                }
            }
            c8224 = new C8224(arrayList2, iArr);
            iM4837 = C1377.m4837((ArrayList) c8224.m21538());
            jArr = new long[iM4837];
            jArr2 = new long[iM4837];
            arrayList3 = new ArrayList(iM4837);
            while (i < iM4837) {
                C3660.m10788(arrayList3, new ArrayList());
            }
            itM10565 = C3577.m10563(arrayList);
            while (RunnableC1564.m5348(itM10565)) {
                c19513 = (C19513) C0216.m1584(itM10565);
                iArr3 = c19513.f62754;
                i14 = 0;
                c22712 = c22710M7733;
                jM6676 = 0;
                while (i14 < length3) {
                    jM6676 = C2124.m6676(jM6676, ((C10341) C1419.m4967(arrayList15, iArr3[i14])).m26245());
                    i14++;
                    itM10565 = itM10565;
                    iArr3 = iArr3;
                }
                it = itM10565;
                int i212 = c8224.m21537()[c19513.f62754[0]];
                jLongValue = ((Long) C2332.m7077(map, c19513)).longValue();
                j6 = j2;
                jArr[i212] = C0817.m3398(jArr[i212], jLongValue);
                arrayList10 = (ArrayList) C3286.m9796(arrayList3, i212);
                i15 = (int) jM6676;
                i16 = iM4837;
                jArr5 = jArr;
                if (jM6676 == i15) {
                    throw new ArithmeticException();
                }
                C2249.m6905(arrayList10, new C8930(c19513, i15, jLongValue - jM6676));
                c22710M7733 = c22712;
                itM10565 = it;
                j2 = j6;
                iM4837 = i16;
                jArr = jArr5;
            }
            c22711 = c22710M7733;
            i2 = iM4837;
            jArr3 = jArr;
            j3 = j2;
            itM10566 = C3577.m10563(arrayList15);
            while (C0962.m3748(itM10566)) {
                C10341 c10346 = (C10341) C0278.m1776(itM10566);
                int i213 = c8224.m21537()[c10346.m26247()];
                jArr2[i213] = C2124.m6676(jArr2[i213], c10346.m26245());
            }
            jM3398 = 0;
            while (i3 < i2) {
                j5 = jArr3[i3] - jArr2[i3];
                if (j5 > 0) {
                    jM3398 = C0817.m3398(jM3398, j5);
                }
            }
            if (jM3398 <= j3) {
                c7518 = null;
                break;
            }
            i4 = 0;
            c8930M7730 = null;
            while (true) {
                i5 = 33554432;
                if (i4 < i2) {
                    i6 = 0;
                    i7 = 1048576;
                    loop19: while (i6 < C1377.m4837(arrayList3)) {
                        if (jArr2[i6] > j3) {
                            arrayList5 = (ArrayList) C3286.m9796(arrayList3, i6);
                            if (C1377.m4837(arrayList5) >= 2) {
                                C23846.sort(arrayList5, new C13869());
                                i9 = 0;
                                while (i9 < C0050.m938(arrayList5)) {
                                    c8930 = (C8930) C1419.m4967(arrayList5, i9);
                                    if (c8930.m23220() > i5) {
                                        arrayList6 = arrayList15;
                                        arrayList7 = arrayList5;
                                        i10 = i9;
                                        jArr4 = jArr2;
                                        arrayList8 = arrayList3;
                                    } else {
                                        c19513M23221 = c8930.m23221();
                                        int iM23221 = c8930.m23220();
                                        long jM232111 = c8930.m23219() + ((long) iM23221);
                                        if (c8930.m23219() > 0) {
                                            c8930M7730 = m7730(c8930M7730, c8930);
                                        }
                                        while (true) {
                                            itM10567 = C3577.m10563(arrayList5);
                                            c8931 = null;
                                            long j15 = 0;
                                            long j16 = 0;
                                            while (C0962.m3748(itM10567)) {
                                                c8932 = (C8930) C0216.m1584(itM10567);
                                                arrayList9 = arrayList5;
                                                length = c8932.m23221().f62754.length;
                                                if (length > i7) {
                                                    break loop19;
                                                    break loop19;
                                                }
                                                int i214 = i7 - length;
                                                iArr2 = c8932.m23221().f62754;
                                                length2 = iArr2.length;
                                                z = false;
                                                Iterator it8 = itM10567;
                                                i11 = 0;
                                                long[] jArr7 = jArr2;
                                                ArrayList arrayList110 = arrayList3;
                                                jM3399 = 0;
                                                while (i11 < length2) {
                                                    int i215 = length2;
                                                    i13 = iArr2[i11];
                                                    if (c19513M23221.m44574(i13)) {
                                                        z = true;
                                                    } else {
                                                        jM3399 = C0817.m3398(jM3399, ((C10341) C1419.m4967(arrayList15, i13)).m26245());
                                                    }
                                                    i11++;
                                                    length2 = i215;
                                                    arrayList15 = arrayList15;
                                                }
                                                ArrayList arrayList21 = arrayList15;
                                                if (z) {
                                                    i12 = i9;
                                                } else {
                                                    i12 = i9;
                                                }
                                                arrayList5 = arrayList9;
                                                i9 = i12;
                                                i7 = i214;
                                                itM10567 = it8;
                                                jArr2 = jArr7;
                                                arrayList3 = arrayList110;
                                                arrayList15 = arrayList21;
                                            }
                                            arrayList6 = arrayList15;
                                            arrayList7 = arrayList5;
                                            i10 = i9;
                                            jArr4 = jArr2;
                                            arrayList8 = arrayList3;
                                            if (c8931 == null) {
                                                break;
                                            }
                                            break;
                                            break;
                                            arrayList5 = arrayList7;
                                            i9 = i10;
                                            jArr2 = jArr4;
                                            arrayList3 = arrayList8;
                                            arrayList15 = arrayList6;
                                        }
                                    }
                                    i9 = i10 + 1;
                                    i5 = 33554432;
                                    arrayList5 = arrayList7;
                                    jArr2 = jArr4;
                                    arrayList3 = arrayList8;
                                    arrayList15 = arrayList6;
                                }
                            }
                        }
                        i6++;
                        i5 = 33554432;
                        jArr2 = jArr2;
                        arrayList3 = arrayList3;
                        arrayList15 = arrayList15;
                    }
                    arrayList4 = arrayList15;
                    if (c8930M7730 == null) {
                        identityHashMap2 = new IdentityHashMap();
                        while (i8 < r2) {
                            C0629.m2904(identityHashMap2, ((C10341) C3286.m9796(arrayList4, i30)).m26248(), Boolean.TRUE);
                        }
                        c7518 = new C7518(identityHashMap2, c8930M7730.m23220(), null, -1L);
                        break;
                    }
                    c7518 = null;
                    break;
                }
                itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863((ArrayList) C3286.m9796(arrayList3, i4));
                while (RunnableC1564.m5348(itM9863)) {
                    c8933 = (C8930) C0216.m1584(itM9863);
                    if (c8933.m23220() > 33554432) {
                    }
                }
                j4 = jArr2[i4];
                long j17 = jArr3[i4] - j4;
                if (j4 <= 0) {
                }
                i4++;
            }
        } else {
            c22711 = c22710M7733;
        }
        if (c7518 == null) {
            return new C9636(c22711, f9976);
        }
        c22713 = c22711;
        interfaceC18745Arr = f9976;
        if (c7518.m20030() == null) {
            c18101M42154 = C18101.m42153(c7518.m20032());
        } else {
            c18101M42154 = C18101.m42154(c7518.m20032(), c7518.m20031(), c7518.m20030());
        }
        c18102 = c18101M42154;
        if (c18102 == null) {
            return new C9636(c22713, interfaceC18745Arr);
        }
        C22710 c22710M7736 = m7735(c22713, c7518.m20033(), c18102, interfaceC5614);
        c18102.finish();
        return new C9636(c22710M7736, new InterfaceC18745[]{c18102});
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01e3 A[PHI: r9 r10 r14
      0x01e3: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:53:0x01ca, B:44:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r10v3 long) = (r10v2 long), (r10v1 long) binds: [B:53:0x01ca, B:44:0x0174] A[DONT_GENERATE, DONT_INLINE]
      0x01e3: PHI (r14v3 long) = (r14v2 long), (r14v1 long) binds: [B:53:0x01ca, B:44:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6045[] m7761(DataInput dataInput, C5401 c5401) throws IOException {
        int iM11306;
        int i;
        short[] sArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        long j;
        int i8;
        C6045[] c6045Arr;
        int i9;
        int iM11307;
        int i10;
        int iM450210;
        int i11;
        int i12;
        C5401 c5402 = c5401;
        int i13 = -1589588856;
        int i14 = C2477.f9839;
        int i15 = C1460.f5948;
        int iM450211 = C19806.m45029("ۡܽ") ^ i14;
        int i16 = ((iM450211 ^ i15) * 17547) ^ (-1450658540);
        int i17 = iM450211 ^ (-926951627);
        long j2 = 0;
        C6045[] c6045Arr2 = null;
        long j3 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        char c = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        long j4 = 0;
        short[] sArr4 = null;
        int i28 = 0;
        long j5 = 0;
        byte[] bArr = null;
        int i29 = 0;
        long j6 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-5329)) >> 31));
            switch (i13) {
                case -1998761905:
                case 1616409788:
                    C1875.m6086();
                    if (C1461.f5957 <= 0) {
                        i25 = i25;
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = (i14 - C19806.m45029("ۘܽ")) * (-65);
                        i16 = ((iM45029 ^ i15) * 23417) ^ (-1279877213);
                        i6 = 1547594457;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۠ܽ") ^ i15;
                        i11 = ((iM450210 ^ i14) * (-20727)) ^ 359985623;
                        i12 = -1099679025;
                        i17 = iM450210 ^ i12;
                        i16 = i11;
                    }
                    break;
                case -1900457548:
                case -537224978:
                    if (AbstractC0464.m2313() != 0) {
                        iM450210 = ThreadFactoryC3888.m11306("۠ܽ") ^ i15;
                        i11 = ((iM450210 ^ i14) * (-20727)) ^ 359985623;
                        i12 = -1099679025;
                    } else {
                        iM450210 = C19806.m45029("۬ۤ") ^ i15;
                        i11 = ((iM450210 ^ i14) * 32321) ^ (-2103147863);
                        i12 = 48190839;
                    }
                    i17 = iM450210 ^ i12;
                    i16 = i11;
                    break;
                case -1891151650:
                case 1516397348:
                    C3722.m10894();
                    return null;
                case -1707136720:
                case -423031367:
                    C1460.m5050();
                    iM450210 = ThreadFactoryC3888.m11306("۠ܽ") ^ i15;
                    i11 = ((iM450210 ^ i14) * (-20727)) ^ 359985623;
                    i12 = -1099679025;
                    i17 = iM450210 ^ i12;
                    i16 = i11;
                    break;
                case -1681688682:
                case -225403332:
                    return c6045Arr2;
                case -1632588617:
                case -1356774096:
                    i25 = i25;
                    sArr2 = f9977;
                    i26 = 758;
                    i27 = 26;
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ᩳ") ^ i14) * (-93);
                        i16 = ((iM11306 ^ i15) * 18201) ^ 1365207101;
                        i = 1908057527;
                    } else {
                        iM11306 = (C19806.m45029("ۧۨ") ^ i15) * 47;
                        i16 = ((iM11306 ^ i14) * (-8901)) ^ (-2069508635);
                        i = -65161068;
                    }
                    i17 = iM11306 ^ i;
                    c5402 = c5401;
                    i25 = i25;
                    break;
                case -1415393282:
                case -662729191:
                    short[] sArr5 = sArr2;
                    i2 = i26;
                    i3 = i27;
                    i25 = dataInput.readInt();
                    if (i25 >= 0) {
                        int iM11308 = (ThreadFactoryC3888.m11306("ۨᩳ") + i15) * 5;
                        i26 = i2;
                        i27 = i3;
                        sArr2 = sArr5;
                        i16 = ((iM11308 ^ i14) * 23377) ^ (-484160828);
                        i17 = iM11308 ^ 1837005357;
                    } else {
                        sArr = sArr5;
                        int iM450212 = (i14 - C19806.m45029("᩸᩸")) * (-15);
                        i26 = i2;
                        i16 = ((iM450212 ^ i15) * 28987) ^ (-877305873);
                        i27 = i3;
                        sArr2 = sArr;
                        i17 = iM450212 ^ (-1032618946);
                    }
                    c5402 = c5401;
                    break;
                case -1363388074:
                case 453635159:
                    i25 = i25;
                    sArr2 = sArr2;
                    i5 = i26;
                    i27 = i27;
                    short s2 = sArr4[c];
                    int i30 = s2 + 3891;
                    if (C3722.f13525 > 0) {
                        int iM450213 = C19806.m45029("᩹ܺ") ^ i14;
                        i7 = ((iM450213 ^ i15) * 12123) ^ (-50844802);
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i25 = i25;
                        i17 = iM450213 ^ (-1304095517);
                        s = s2;
                        i21 = i30;
                        i16 = i7;
                        c5402 = c5401;
                    } else {
                        s = s2;
                        i21 = i30;
                        iM45029 = (C19806.m45029("ܺۗ") + i15) * 109;
                        i16 = ((iM45029 ^ i14) * (-17875)) ^ (-682254475);
                        i6 = 701241848;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    }
                    break;
                case -1280100050:
                case -695233791:
                    i25 = i25;
                    j5 = 40 * ((long) i25);
                    if (C1398.f5802 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡۠") ^ i14;
                        i16 = ((iM11306 ^ i15) * 23919) ^ 1427765520;
                        i = -1687603206;
                        i17 = iM11306 ^ i;
                        c5402 = c5401;
                        i25 = i25;
                    } else {
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = (i14 - C19806.m45029("ۘܽ")) * (-65);
                        i16 = ((iM45029 ^ i15) * 23417) ^ (-1279877213);
                        i6 = 1547594457;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    }
                    break;
                case -1246087145:
                case 326151831:
                    c6045Arr2[i20] = new C6045(bArr);
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i25 = i25;
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = (C19806.m45029("ܺۗ") + i15) * 109;
                        i16 = ((iM45029 ^ i14) * (-17875)) ^ (-682254475);
                        i6 = 701241848;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    } else {
                        iM450210 = C19806.m45029("۠ۧ") ^ i14;
                        i11 = ((iM450210 ^ i15) * (-6065)) ^ 406503426;
                        i12 = 1863374085;
                        i17 = iM450210 ^ i12;
                        i16 = i11;
                    }
                    break;
                case -1198649945:
                case -140476353:
                    i25 = i25;
                    sArr2 = sArr2;
                    i5 = i26;
                    i27 = i27;
                    sArr4 = f9977;
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i14;
                        i16 = ((iM45029 ^ i15) * (-651)) ^ (-1374029906);
                        i6 = 275400771;
                    } else {
                        iM45029 = (i15 - C19806.m45029("۠۫")) * 47;
                        i16 = ((iM45029 ^ i14) * 1447) ^ (-1565913852);
                        i6 = -2060747434;
                    }
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                case -1092902979:
                case -363487694:
                    j = j2;
                    i8 = i25;
                    c5402.m14964(j);
                    c6045Arr = new C6045[i8];
                    i9 = 0;
                    j3 = 0;
                    int iM11309 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i14;
                    i7 = ((iM11309 ^ i15) * 4581) ^ 200180161;
                    i17 = iM11309 ^ 1663721435;
                    j2 = j;
                    i25 = i8;
                    i20 = i9;
                    c6045Arr2 = c6045Arr;
                    i16 = i7;
                    c5402 = c5401;
                    break;
                case -1032377876:
                case 1484300881:
                    i25 = i25;
                    sArr2 = sArr2;
                    i5 = i26;
                    i27 = i27;
                    i22 = i21 * i21;
                    i23 = s * s;
                    i24 = 15139881;
                    if (C2871.m8646()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۛ") ^ i15;
                        i16 = ((iM45029 ^ i14) * (-7373)) ^ (-611300626);
                        i6 = -898096963;
                    } else {
                        iM45029 = (i14 - C19806.m45029("ۘܽ")) * (-65);
                        i16 = ((iM45029 ^ i15) * 23417) ^ (-1279877213);
                        i6 = 1547594457;
                    }
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                case -746712123:
                case 470277741:
                    if (C2124.m6673() > 0) {
                        i25 = i25;
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i14;
                        i16 = ((iM45029 ^ i15) * (-651)) ^ (-1374029906);
                        i6 = 275400771;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    } else {
                        iM450210 = C19806.m45029("۬ۤ") ^ i15;
                        i11 = ((iM450210 ^ i14) * 32321) ^ (-2103147863);
                        i12 = 48190839;
                        i17 = iM450210 ^ i12;
                        i16 = i11;
                    }
                    break;
                case -622353760:
                case 220200506:
                    short[] sArr6 = f9977;
                    if (!C0526.f2219) {
                        throw new IllegalArgumentException(C1460.m5047(sArr6, 814, 37, i18));
                    }
                    iM450210 = ThreadFactoryC3888.m11306("۠ܽ") ^ i15;
                    i11 = ((iM450210 ^ i14) * (-20727)) ^ 359985623;
                    i12 = -1099679025;
                    i17 = iM450210 ^ i12;
                    i16 = i11;
                    break;
                case -301569730:
                case 1521381303:
                    if (j6 <= 67108864) {
                        iM11307 = C19806.m45029("֡֨") ^ i15;
                        i4 = ((iM11307 ^ i14) * (-13565)) ^ 1761819625;
                        i10 = -280521474;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۖ") ^ i15;
                        i4 = ((iM11307 ^ i14) * 17271) ^ (-1717577425);
                        i10 = 307716875;
                    }
                    i17 = iM11307 ^ i10;
                    i16 = i4;
                    break;
                case -169673694:
                case 718514582:
                    throw m7773(C1189.m4365(sArr3, i19, i29, i18));
                case -163496629:
                case 1168189062:
                    sArr3 = f9977;
                    i19 = UMWorkDispatch.MSG_QUIT;
                    i29 = 30;
                    if (RunnableC1606.f6488 < 0) {
                        iM11307 = (C19806.m45029("۬ᩳ") + i14) * (-85);
                        i4 = ((iM11307 ^ i15) * (-6563)) ^ (-1290250343);
                        i10 = -1782906319;
                        i17 = iM11307 ^ i10;
                        i16 = i4;
                    } else {
                        i25 = i25;
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = (C19806.m45029("ܺۗ") + i15) * 109;
                        i16 = ((iM45029 ^ i14) * (-17875)) ^ (-682254475);
                        i6 = 701241848;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    }
                    break;
                case -81100857:
                case 778993160:
                    i25 = i25;
                    sArr2 = sArr2;
                    i5 = i26;
                    i27 = i27;
                    int i31 = i23 + i24;
                    if (i22 - (i31 + i31) > 0) {
                        iM45029 = (C19806.m45029("᩻ۘ") ^ i14) * 127;
                        i16 = ((iM45029 ^ i15) * (-6593)) ^ 1218851030;
                        i6 = -575888224;
                    } else {
                        iM45029 = (i15 - C19806.m45029("᩵᩹")) * (-103);
                        i16 = ((iM45029 ^ i14) * (-21383)) ^ 1084440132;
                        i6 = 1369080840;
                    }
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                case -5585413:
                case 189900143:
                    c5402.m14964(j4);
                    bArr = new byte[i28];
                    dataInput.readFully(bArr);
                    if (i28 != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("֨᩶") ^ i15) * (-117);
                        i4 = ((iM11307 ^ i14) * (-31155)) ^ (-788023282);
                        i10 = -759192641;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܳ۬") + i14) * (-111);
                        i4 = ((iM11307 ^ i15) * 11315) ^ (-832769943);
                        i10 = -2135057577;
                    }
                    i17 = iM11307 ^ i10;
                    i16 = i4;
                    break;
                case 3033535:
                case 522260460:
                    c6045Arr = c6045Arr2;
                    i9 = i20 + 1;
                    j3 = j6;
                    j = j2;
                    i8 = i25;
                    int iM113010 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i14;
                    i7 = ((iM113010 ^ i15) * 4581) ^ 200180161;
                    i17 = iM113010 ^ 1663721435;
                    j2 = j;
                    i25 = i8;
                    i20 = i9;
                    c6045Arr2 = c6045Arr;
                    i16 = i7;
                    c5402 = c5401;
                    break;
                case 276564890:
                case 1439552384:
                    i28 = dataInput.readInt();
                    j4 = i28;
                    j6 = j3 + j4;
                    if (i28 > 0) {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("ۛۙ")) * (-25);
                        i4 = ((iM11307 ^ i15) * (-2239)) ^ (-885092273);
                        i10 = -447883314;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۖ") ^ i15;
                        i4 = ((iM11307 ^ i14) * 17271) ^ (-1717577425);
                        i10 = 307716875;
                    }
                    i17 = iM11307 ^ i10;
                    i16 = i4;
                    break;
                case 320573689:
                case 1005362012:
                    i25 = i25;
                    if (i20 >= i25) {
                        int iM113011 = (ThreadFactoryC3888.m11306("ܿܽ") ^ i15) * (-83);
                        i4 = ((iM113011 ^ i14) * 23471) ^ 1827216592;
                        i17 = iM113011 ^ (-1753387042);
                        i25 = i25;
                        i16 = i4;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("֫ᩴ") ^ i14;
                        i16 = ((iM113012 ^ i15) * 14697) ^ (-960065469);
                        i17 = iM113012 ^ 637280071;
                        i25 = i25;
                    }
                    break;
                case 420164968:
                case 1709467575:
                    i25 = i25;
                    if (i25 > 1048576) {
                        i25 = i25;
                        sArr = sArr2;
                        i2 = i26;
                        i3 = i27;
                        int iM450214 = (i14 - C19806.m45029("᩸᩸")) * (-15);
                        i26 = i2;
                        i16 = ((iM450214 ^ i15) * 28987) ^ (-877305873);
                        i27 = i3;
                        sArr2 = sArr;
                        i17 = iM450214 ^ (-1032618946);
                        c5402 = c5401;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܿ") ^ i15;
                        i16 = ((iM11306 ^ i14) * 17889) ^ (-1311089509);
                        i = 848949467;
                        i17 = iM11306 ^ i;
                        c5402 = c5401;
                        i25 = i25;
                    }
                    break;
                case 850791572:
                case 1281169976:
                    throw m7773(C1398.m4892(sArr2, i26, i27, i18));
                case 875897711:
                case 1758017375:
                    if (C2477.f9839 <= 0) {
                        i25 = i25;
                        iM11306 = (C19806.m45029("ۧۨ") ^ i15) * 47;
                        i16 = ((iM11306 ^ i14) * (-8901)) ^ (-2069508635);
                        i = -65161068;
                        i17 = iM11306 ^ i;
                        c5402 = c5401;
                        i25 = i25;
                    } else {
                        i25 = i25;
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = (i14 - C19806.m45029("ۘܽ")) * (-65);
                        i16 = ((iM45029 ^ i15) * 23417) ^ (-1279877213);
                        i6 = 1547594457;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    }
                    break;
                case 1273186174:
                case 1967179917:
                    i18 = 61434;
                    iM45029 = (i15 - ThreadFactoryC3888.m11306("֡ܽ")) * 17;
                    i5 = i26;
                    i16 = ((iM45029 ^ i14) * (-8113)) ^ (-1520309461);
                    i6 = -49462909;
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                case 1450180674:
                case 1843286986:
                    i18 = 8376;
                    iM45029 = (i15 - ThreadFactoryC3888.m11306("֡ܽ")) * 17;
                    i5 = i26;
                    i16 = ((iM45029 ^ i14) * (-8113)) ^ (-1520309461);
                    i6 = -49462909;
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                case 1523669811:
                case 1566549914:
                    i25 = i25;
                    sArr2 = sArr2;
                    i5 = i26;
                    i27 = i27;
                    c = 757;
                    if (RunnableC1564.m5345()) {
                        iM45029 = (C19806.m45029("ܺۗ") + i15) * 109;
                        i16 = ((iM45029 ^ i14) * (-17875)) ^ (-682254475);
                        i6 = 701241848;
                    } else {
                        iM45029 = C19806.m45029("᩷֫") ^ i14;
                        i16 = ((iM45029 ^ i15) * (-4195)) ^ (-545119587);
                        i6 = -561093204;
                    }
                    i27 = i27;
                    i26 = i5;
                    sArr2 = sArr2;
                    i17 = iM45029 ^ i6;
                    i25 = i25;
                    c5402 = c5401;
                    break;
                default:
                    i25 = i25;
                    j2 = j5 + 16;
                    if (C0526.m2437() < 0) {
                        iM11306 = (i15 - C19806.m45029("᩶ۢ")) * 35;
                        i16 = ((iM11306 ^ i14) * (-26677)) ^ 1362708895;
                        i = -1871138973;
                        i17 = iM11306 ^ i;
                        c5402 = c5401;
                        i25 = i25;
                    } else {
                        sArr2 = sArr2;
                        i5 = i26;
                        i27 = i27;
                        iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i14;
                        i16 = ((iM45029 ^ i15) * (-651)) ^ (-1374029906);
                        i6 = 275400771;
                        i27 = i27;
                        i26 = i5;
                        sArr2 = sArr2;
                        i17 = iM45029 ^ i6;
                        i25 = i25;
                        c5402 = c5401;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7749(C22710 c22710, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C3658 c3658 = null;
        InterfaceC18745 interfaceC18745 = null;
        int i = 0;
        Long l2 = null;
        long jM3398 = 0;
        int i2 = -836963293;
        int i3 = RunnableC3388.f12514;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ܿܺ")) * (-7);
        int i5 = ((iM11306 ^ i4) * 8465) ^ 1805227928;
        int i6 = -1397156881;
        while (true) {
            i2 = ((((i2 ^ i4) * (-21119)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1983380479:
                case 873046437:
                    m7749(c22710.f73972, identityHashMap, arrayList, identityHashMap2);
                    m7749(c22710.f73966, identityHashMap, arrayList, identityHashMap2);
                    break;
                case -1755443031:
                case -171159057:
                    break;
                case -1624863377:
                case -810843723:
                    C0629.m2904(identityHashMap, interfaceC18745, C3577.m10575(i));
                    C3660.m10788(arrayList, interfaceC18745);
                    break;
                case -1483534490:
                case 475380313:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ᩳۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-19349)) ^ 952661699;
                        i6 = 335070331;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙۡ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM11306 ^ i4) * (-27737)) ^ (-1527452785);
                        i6 = -1637981209;
                    }
                    break;
                case -1482422653:
                case 1213960044:
                    C0629.m2904(identityHashMap, interfaceC18745, ViewTreeObserverOnPreDrawListenerC3327.m9877(jM3398));
                    break;
                case -1412387263:
                case 1679760986:
                    C1875.m6086();
                    break;
                case -1230477476:
                case 1344401650:
                    C2642.m8171();
                    iM11306 = C19806.m45029("ۖ֫") ^ i3;
                    i5 = ((iM11306 ^ i4) * (-19373)) ^ 1879457504;
                    i6 = -98617744;
                    break;
                case -1135529626:
                case 1068468122:
                    C0216.m1591();
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i3) * (-97);
                        i5 = ((iM11306 ^ i4) * (-26481)) ^ (-619950684);
                        i6 = 1909586743;
                    } else {
                        iM11306 = C19806.m45029("ۖ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-19373)) ^ 1879457504;
                        i6 = -98617744;
                    }
                    break;
                case -1021389335:
                case 127032992:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-19435)) ^ 91822931;
                        i6 = 1050100012;
                    } else {
                        iM11306 = C19806.m45029("ۜ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19327) ^ (-1828950900);
                        i6 = -74260865;
                    }
                    break;
                case -987898185:
                case 772000415:
                    l2 = (Long) identityHashMap.get(interfaceC18745);
                    if (l2 == null) {
                        iM11306 = C19806.m45029("۠ۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 10485) ^ 1230392829;
                        i6 = -698311429;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֡ܰ")) * (-55);
                        i5 = ((iM11306 ^ i4) * (-15575)) ^ (-1205903649);
                        i6 = 614631659;
                    }
                    break;
                case -602413466:
                case 725280281:
                    c3658 = c22710.f73969;
                    if (C1025.m3862(c22710)) {
                        iM11306 = C19806.m45029("᩹᩹") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-29657)) ^ 1021736131;
                        i6 = -1660204195;
                    } else {
                        iM11306 = C19806.m45029("۬᩵") ^ i4;
                        i5 = ((iM11306 ^ i3) * 6243) ^ 1583180011;
                        i6 = -1064421221;
                    }
                    break;
                case -322801319:
                case 1532358736:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31197) ^ 705041694;
                        i6 = -183192941;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-409)) ^ (-909179017);
                        i6 = 1946881218;
                    }
                    break;
                case -78283044:
                case 1028468356:
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۜ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19327) ^ (-1828950900);
                        i6 = -74260865;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֨") + i3) * 79;
                        i5 = ((iM11306 ^ i4) * 27263) ^ 125627452;
                        i6 = -988755046;
                    }
                    break;
                case 21408043:
                case 1919688052:
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("ۖ֫") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-19373)) ^ 1879457504;
                        i6 = -98617744;
                    } else {
                        iM11306 = (C19806.m45029("ܰۡ") ^ i4) * (-117);
                        i5 = ((iM11306 ^ i3) * 3137) ^ 725454134;
                        i6 = -1631972817;
                    }
                    break;
                case 127839034:
                case 1890012491:
                    if (C1066.f4915 <= 0) {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i3) * (-97);
                        i5 = ((iM11306 ^ i4) * (-26481)) ^ (-619950684);
                        i6 = 1909586743;
                    } else {
                        iM11306 = C19806.m45029("ܿۘ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-27511)) ^ 1530094945;
                        i6 = -1537160017;
                    }
                    break;
                case 270811871:
                case 2099508484:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i3) * (-97);
                        i5 = ((iM11306 ^ i4) * (-26481)) ^ (-619950684);
                        i6 = 1909586743;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-12125)) ^ 230350592;
                        i6 = -1718466288;
                    }
                    break;
                case 431566371:
                case 1522348846:
                    if (C2124.f7782 > 0) {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31197) ^ 705041694;
                        i6 = -183192941;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֫") ^ i3) * (-97);
                        i5 = ((iM11306 ^ i4) * (-26481)) ^ (-619950684);
                        i6 = 1909586743;
                    }
                    break;
                case 531095587:
                case 542612288:
                    if (C2642.f10294 <= 0) {
                        iM11306 = C19806.m45029("ᩳۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-19349)) ^ 952661699;
                        i6 = 335070331;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֨") + i4) * (-59);
                        i5 = ((iM11306 ^ i3) * (-28793)) ^ (-722157474);
                        i6 = 207124723;
                    }
                    break;
                case 693211259:
                case 1007921375:
                    jM3398 = C0817.m3398(l2.longValue(), i);
                    if (C7105.f23796 >= 0) {
                        iM11306 = C19806.m45029("ۜ᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * 19327) ^ (-1828950900);
                        i6 = -74260865;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-6685)) ^ (-1660633710);
                        i6 = -287146717;
                    }
                    break;
                case 825244533:
                case 979425897:
                    if (c22710 == null) {
                        iM11306 = C19806.m45029("᩶ۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3063) ^ (-931505475);
                        i6 = -1131829427;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-31053)) ^ 1750857470;
                        i6 = 1652494429;
                    }
                    break;
                case 1704116447:
                case 2070682398:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = C19806.m45029("ᩳۙ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-19349)) ^ 952661699;
                        i6 = 335070331;
                    } else {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31197) ^ 705041694;
                        i6 = -183192941;
                    }
                    break;
                case 2010300961:
                case 2014202344:
                    if (C1025.f4800 >= 0) {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31197) ^ 705041694;
                        i6 = -183192941;
                    } else {
                        iM11306 = (C19806.m45029("᩻۟") + i3) * 33;
                        i5 = ((iM11306 ^ i4) * (-11409)) ^ 1534325145;
                        i6 = -1303663430;
                    }
                    break;
                default:
                    interfaceC18745 = c3658.f13401;
                    i = c3658.f13400;
                    if (m7758(interfaceC18745, identityHashMap2)) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-22133)) ^ 20781067;
                        i6 = -1341944379;
                    } else {
                        iM11306 = C19806.m45029("᩶ۧ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3063) ^ (-931505475);
                        i6 = -1131829427;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7752(InterfaceC18745[] interfaceC18745Arr) {
        int length = 0;
        int i = 0;
        InterfaceC18745 interfaceC18745 = null;
        int i2 = -1324839872;
        int i3 = C2642.f10294;
        int i4 = C3535.f13026;
        int iM45029 = C19806.m45029("ۙۤ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 1393) ^ (-2109703462);
        int i6 = -978147941;
        while (true) {
            i2 = ((((i2 ^ i4) * (-7317)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1998423596:
                case -221920526:
                    i++;
                    iM45029 = ThreadFactoryC3888.m11306("ۘܰ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-11955)) ^ (-1180219915);
                    i6 = 1975200129;
                    break;
                case -1833169453:
                case 592603108:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15199)) ^ (-1026096744);
                        i6 = -1273416067;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܽ") ^ i4) * 79;
                        i5 = ((iM45029 ^ i3) * (-12427)) ^ (-261663893);
                        i6 = -1784196385;
                    }
                    break;
                case -1819710346:
                case -761501962:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 22755) ^ (-1755614948);
                        i6 = -1403955382;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۛ") ^ i4) * (-33);
                        i5 = ((iM45029 ^ i3) * 16181) ^ (-1927015243);
                        i6 = 1606193801;
                    }
                    break;
                case -1366054975:
                case 213672535:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ۠") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM45029 ^ i4) * (-12251)) ^ (-625852459);
                        i6 = -1405565951;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۨ") ^ i3) * (-91);
                        i5 = ((iM45029 ^ i4) * (-23015)) ^ 767075609;
                        i6 = -1196969949;
                    }
                    break;
                case -1194793090:
                case -634846070:
                    length = interfaceC18745Arr.length;
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 22755) ^ (-1755614948);
                        i6 = -1403955382;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۤܰ")) * (-95);
                        i5 = ((iM45029 ^ i3) * (-9209)) ^ (-1410107479);
                        i6 = -1031272462;
                    }
                    break;
                case -832610162:
                case -206457073:
                    C1875.m6086();
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۨ") ^ i3) * (-91);
                        i5 = ((iM45029 ^ i4) * (-23015)) ^ 767075609;
                        i6 = -1196969949;
                    } else {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15199)) ^ (-1026096744);
                        i6 = -1273416067;
                    }
                    break;
                case -782997920:
                case 1448251275:
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۨ") ^ i3) * (-91);
                        i5 = ((iM45029 ^ i4) * (-23015)) ^ 767075609;
                        i6 = -1196969949;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰ֫")) * (-17);
                        i5 = ((iM45029 ^ i3) * (-22523)) ^ (-1502937463);
                        i6 = -2122757640;
                    }
                    break;
                case -660368658:
                case -67069043:
                    if (C3577.m10565()) {
                        iM45029 = (C19806.m45029("ܿ᩵") + i3) * 45;
                        i5 = ((iM45029 ^ i4) * (-21085)) ^ 2091850854;
                        i6 = -657321829;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۙ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-3849)) ^ (-351887286);
                        i6 = -173716361;
                    }
                    break;
                case -508996212:
                case 1708198223:
                    i = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ۘܰ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-11955)) ^ (-1180219915);
                    i6 = 1975200129;
                    break;
                case -504427258:
                case 79156576:
                    try {
                        C2249.m6913(interfaceC18745);
                        break;
                    } catch (IOException unused) {
                    }
                    iM45029 = ThreadFactoryC3888.m11306("᩻֫") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-3361)) ^ (-402325363);
                    i6 = -1389968259;
                    break;
                case -444876840:
                case 496130215:
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۧ") + i4) * (-49);
                        i5 = ((iM45029 ^ i3) * (-27447)) ^ 1003801997;
                        i6 = 1539036624;
                    } else {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15199)) ^ (-1026096744);
                        i6 = -1273416067;
                    }
                    break;
                case -365002628:
                case 2041267066:
                    C7105.m18985();
                    if (C1460.m5050() == 0) {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15199)) ^ (-1026096744);
                        i6 = -1273416067;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩹")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-14027)) ^ 490735838;
                        i6 = -1847318954;
                    }
                    break;
                case -335924837:
                case 1735042911:
                    C0629.m2907();
                    iM45029 = (i3 - C19806.m45029("֨᩹")) * (-51);
                    i5 = ((iM45029 ^ i4) * (-14027)) ^ 490735838;
                    i6 = -1847318954;
                    break;
                case -267327635:
                case 2064399937:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۙ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-3849)) ^ (-351887286);
                        i6 = -173716361;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩹")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-14027)) ^ 490735838;
                        i6 = -1847318954;
                    }
                    break;
                case -113609445:
                case 1818505702:
                    interfaceC18745 = interfaceC18745Arr[i];
                    iM45029 = (C19806.m45029("֫ۙ") ^ i3) * (-21);
                    i5 = ((iM45029 ^ i4) * (-28261)) ^ (-963673257);
                    i6 = 1821368412;
                    break;
                case -58873276:
                case 366128424:
                    break;
                case -28051239:
                case 2118305375:
                    if (C0797.m3359()) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۜ") + i3) * 101;
                        i5 = ((iM45029 ^ i4) * 8167) ^ (-1912858132);
                        i6 = -1724494102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 22755) ^ (-1755614948);
                        i6 = -1403955382;
                    }
                    break;
                case 65901129:
                case 731227582:
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("᩺ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15199)) ^ (-1026096744);
                        i6 = -1273416067;
                    } else {
                        iM45029 = C19806.m45029("ۡۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8493) ^ (-1133120103);
                        i6 = 34209414;
                    }
                    break;
                case 634060099:
                case 1723357839:
                    C0962.m3746();
                    break;
                case 831580819:
                case 1528510532:
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("ᩴ᩶") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29231)) ^ (-150404649);
                        i6 = -855354802;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨᩹")) * (-51);
                        i5 = ((iM45029 ^ i4) * (-14027)) ^ 490735838;
                        i6 = -1847318954;
                    }
                    break;
                default:
                    if (i < length) {
                        iM45029 = (C19806.m45029("᩶֡") + i4) * 41;
                        i5 = ((iM45029 ^ i3) * 32385) ^ (-1266390691);
                        i6 = 923391612;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ۠") + i4) * 89;
                        i5 = ((iM45029 ^ i3) * 27637) ^ (-588038511);
                        i6 = -1435907945;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7744(InterfaceC18745 interfaceC18745, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C18101 c18101 = null;
        C23747 c23747 = null;
        InterfaceC18745[] interfaceC18745Arr = null;
        int length = 0;
        int i = 0;
        int i2 = -1363363031;
        int i3 = C1875.f7103;
        int i4 = RunnableC3388.f12514;
        int iM45029 = (C19806.m45029("ۤۜ") + i3) * 35;
        int i5 = ((iM45029 ^ i4) * 5079) ^ 1468175403;
        int i6 = -2132657871;
        while (true) {
            i2 = ((((i2 ^ i4) * (-12851)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2087111706:
                case 343529588:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * (-23);
                        i5 = ((iM45029 ^ i4) * 22643) ^ 728970625;
                        i6 = -1713804758;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢۚ")) * (-119);
                        i5 = ((iM45029 ^ i4) * 14665) ^ (-1588468054);
                        i6 = 156059045;
                    }
                    break;
                case -2069952497:
                case 2137301902:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * (-23);
                        i5 = ((iM45029 ^ i4) * 22643) ^ 728970625;
                        i6 = -1713804758;
                    } else {
                        iM45029 = C19806.m45029("ۚۤ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 10389) ^ 1081676829;
                        i6 = 942516303;
                    }
                    break;
                case -1979075734:
                case -1860837328:
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۬") + i4) * 83;
                        i5 = ((iM45029 ^ i3) * 10541) ^ (-856462215);
                        i6 = 897885342;
                    } else {
                        iM45029 = C19806.m45029("ܳ۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * 29235) ^ (-524983732);
                        i6 = 301432516;
                    }
                    break;
                case -1889943857:
                case -690660946:
                    if (!CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۬") + i4) * 83;
                        i5 = ((iM45029 ^ i3) * 10541) ^ (-856462215);
                        i6 = 897885342;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * (-23);
                        i5 = ((iM45029 ^ i4) * 22643) ^ 728970625;
                        i6 = -1713804758;
                    }
                    break;
                case -1788068174:
                case -1638103770:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۬") + i4) * 83;
                        i5 = ((iM45029 ^ i3) * 10541) ^ (-856462215);
                        i6 = 897885342;
                    } else {
                        iM45029 = C19806.m45029("ܽۖ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-41)) ^ 540704583;
                        i6 = 336176620;
                    }
                    break;
                case -1783701428:
                case -1616491527:
                    interfaceC18745Arr = c23747.f76833;
                    length = interfaceC18745Arr.length;
                    i = 0;
                    iM45029 = (ThreadFactoryC3888.m11306("۬֫") ^ i4) * 63;
                    i5 = ((iM45029 ^ i3) * 2749) ^ 1317983473;
                    i6 = -1271135627;
                    break;
                case -1769974956:
                case 1182199225:
                    break;
                case -1687790491:
                case -698214044:
                    if (interfaceC18745 instanceof C23747) {
                        iM45029 = (C19806.m45029("۟᩹") + i3) * (-101);
                        i5 = ((iM45029 ^ i4) * 15197) ^ 1407653953;
                        i6 = -337360518;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ֫") ^ i4) * 51;
                        i5 = ((iM45029 ^ i3) * (-19571)) ^ 2001007525;
                        i6 = -331314031;
                    }
                    break;
                case -1582768948:
                case -513837668:
                    m7744(interfaceC18745Arr[i], identityHashMap, arrayList, identityHashMap2);
                    i++;
                    iM45029 = (ThreadFactoryC3888.m11306("۬֫") ^ i4) * 63;
                    i5 = ((iM45029 ^ i3) * 2749) ^ 1317983473;
                    i6 = -1271135627;
                    break;
                case -1520237513:
                case 1437243971:
                    if (interfaceC18745 instanceof C18101) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5083) ^ 1261307078;
                        i6 = -1959431102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-1261)) ^ (-242410133);
                        i6 = 90601190;
                    }
                    break;
                case -1512342216:
                case -78809312:
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("ۡ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14725) ^ (-1236135656);
                        i6 = -718430592;
                    } else {
                        iM45029 = (C19806.m45029("ۢ᩵") + i3) * 13;
                        i5 = ((iM45029 ^ i4) * (-9351)) ^ 1563907398;
                        i6 = 1964320143;
                    }
                    break;
                case -1506966854:
                case 13153951:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (C19806.m45029("ۗᩴ") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * 28395) ^ 559326080;
                        i6 = -1437675212;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧܽ") ^ i4) * (-79);
                        i5 = ((iM45029 ^ i3) * (-31397)) ^ 1128295762;
                        i6 = 1447956595;
                    }
                    break;
                case -1489900482:
                case 1287628741:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ۗᩴ") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * 28395) ^ 559326080;
                        i6 = -1437675212;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-7121)) ^ (-1329006412);
                        i6 = 496576497;
                    }
                    break;
                case -1060025466:
                case 1518343576:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i3 - C19806.m45029("ܽᩳ")) * 77;
                        i5 = ((iM45029 ^ i4) * (-14919)) ^ 1296471061;
                        i6 = 841926244;
                    } else {
                        iM45029 = C19806.m45029("ܶۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 30959) ^ (-1844408023);
                        i6 = -878015075;
                    }
                    break;
                case -1013584045:
                case 1610922937:
                    c18101 = (C18101) interfaceC18745;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c18101, Boolean.TRUE) == null) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֨ۗ")) * (-45);
                        i5 = ((iM45029 ^ i3) * (-2641)) ^ 457151955;
                        i6 = 1470554871;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ֫") ^ i4) * 51;
                        i5 = ((iM45029 ^ i3) * (-19571)) ^ 2001007525;
                        i6 = -331314031;
                    }
                    break;
                case -559904537:
                case 1671086844:
                    c23747 = (C23747) interfaceC18745;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap2, c23747, Boolean.TRUE) != null) {
                        iM45029 = (C19806.m45029("ᩳ֫") ^ i4) * 51;
                        i5 = ((iM45029 ^ i3) * (-19571)) ^ 2001007525;
                        i6 = -331314031;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֫᩶")) * (-9);
                        i5 = ((iM45029 ^ i4) * 9823) ^ 1457877818;
                        i6 = 786663970;
                    }
                    break;
                case -87651472:
                case 920870157:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۗᩴ") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * 28395) ^ 559326080;
                        i6 = -1437675212;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩸") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25247)) ^ (-144508352);
                        i6 = 736143655;
                    }
                    break;
                case 204932530:
                case 253617661:
                    C1377.m4833();
                    if (!C19806.f63586) {
                        iM45029 = (C19806.m45029("ۗᩴ") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * 28395) ^ 559326080;
                        i6 = -1437675212;
                    } else {
                        iM45029 = C19806.m45029("ۡ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14725) ^ (-1236135656);
                        i6 = -718430592;
                    }
                    break;
                case 227517501:
                case 1446457589:
                    if (i < length) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۘۘ")) * (-89);
                        i5 = ((iM45029 ^ i4) * 6001) ^ 1367010164;
                        i6 = -580698553;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ֫") ^ i4) * 51;
                        i5 = ((iM45029 ^ i3) * (-19571)) ^ 2001007525;
                        i6 = -331314031;
                    }
                    break;
                case 574134734:
                case 1198900454:
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ۬") + i4) * 83;
                        i5 = ((iM45029 ^ i3) * 10541) ^ (-856462215);
                        i6 = 897885342;
                    } else {
                        iM45029 = C19806.m45029("ۡ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14725) ^ (-1236135656);
                        i6 = -718430592;
                    }
                    break;
                case 624849941:
                case 1261286869:
                    C0050.m946();
                    iM45029 = (C19806.m45029("ۗᩴ") ^ i3) * (-7);
                    i5 = ((iM45029 ^ i4) * 28395) ^ 559326080;
                    i6 = -1437675212;
                    break;
                case 1005379172:
                case 2123418241:
                    C0817.m3399();
                    break;
                case 1443016068:
                case 1807503818:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙ᩺")) * (-23);
                        i5 = ((iM45029 ^ i4) * 22643) ^ 728970625;
                        i6 = -1713804758;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֨۬")) * (-31);
                        i5 = ((iM45029 ^ i4) * (-8845)) ^ 930366486;
                        i6 = 273190651;
                    }
                    break;
                default:
                    C3660.m10788(arrayList, c18101);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8930 m7730(C8930 c8930, C8930 c8931) {
        long jM23219 = 0;
        long jM232110 = 0;
        int i = 1768964909;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C2642.f10294;
        int iM11306 = (ThreadFactoryC3888.m11306("֨᩻") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i4 = ((iM11306 ^ i2) * 501) ^ (-237989175);
        int i5 = 766349534;
        while (true) {
            i = ((((i ^ i2) * (-3819)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2055370604:
                case 2142090326:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19495)) ^ (-2064717960);
                        i5 = -399542540;
                    }
                    break;
                case -2053258161:
                case 921366257:
                    RunnableC1564.m5345();
                    if (!C1668.m5583()) {
                        iM11306 = C19806.m45029("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24143)) ^ (-1881640853);
                        i5 = -106332282;
                    } else {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    }
                    break;
                case -1725000999:
                case 1771318735:
                    if (c8930 != null) {
                        iM11306 = (i2 - C19806.m45029("۫۬")) * (-99);
                        i4 = ((iM11306 ^ i3) * (-27303)) ^ (-2132127959);
                        i5 = 1911388944;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟᩷")) * (-61);
                        i4 = ((iM11306 ^ i2) * 32375) ^ 638614568;
                        i5 = -5440203;
                    }
                    break;
                case -1548635401:
                case 1122218888:
                    C3577.m10565();
                    iM11306 = C19806.m45029("ۖ֨") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-24143)) ^ (-1881640853);
                    i5 = -106332282;
                    break;
                case -1497730554:
                case 1646429437:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-14279)) ^ (-1383800913);
                        i5 = 391480492;
                    }
                    break;
                case -1302213588:
                case 141526318:
                    if (C1937.f7317 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4637)) ^ (-1642695123);
                        i5 = 1619624282;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 8643) ^ (-1413159507);
                        i5 = -2044554657;
                    }
                    break;
                case -1102313844:
                case 579352070:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4637)) ^ (-1642695123);
                        i5 = 1619624282;
                    } else {
                        iM11306 = C19806.m45029("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24143)) ^ (-1881640853);
                        i5 = -106332282;
                    }
                    break;
                case -1025508055:
                case 1094111864:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = C19806.m45029("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24143)) ^ (-1881640853);
                        i5 = -106332282;
                    } else {
                        iM11306 = (C19806.m45029("ۗܿ") + i3) * (-7);
                        i4 = ((iM11306 ^ i2) * (-7717)) ^ (-767000508);
                        i5 = 853099408;
                    }
                    break;
                case -800983547:
                case 678203528:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1287) ^ 611675123;
                        i5 = -1696190825;
                    } else {
                        iM11306 = (C19806.m45029("᩶ܰ") + i3) * 21;
                        i4 = ((iM11306 ^ i2) * 6827) ^ (-1532806725);
                        i5 = -98147527;
                    }
                    break;
                case -714684732:
                case 59868322:
                    if (c8931.m23219() == c8930.m23219()) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("᩵ۖ")) * (-55);
                        i4 = ((iM11306 ^ i3) * 4661) ^ (-1899815184);
                        i5 = 620618633;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۨ۟")) * (-65);
                        i4 = ((iM11306 ^ i2) * (-21165)) ^ 309909055;
                        i5 = -2103446873;
                    }
                    break;
                case -456846092:
                case 73790269:
                    if (jM23219 <= jM232110) {
                        iM11306 = C19806.m45029("֡۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15283) ^ 644014150;
                        i5 = -2096760418;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟᩷")) * (-61);
                        i4 = ((iM11306 ^ i2) * 32375) ^ 638614568;
                        i5 = -5440203;
                    }
                    break;
                case -432874450:
                case 1693931433:
                    C0050.m946();
                    return null;
                case -432388121:
                case -432216437:
                    jM23219 = c8931.m23219();
                    jM232110 = c8930.m23219();
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩺") + i3) * (-21);
                        i4 = ((iM11306 ^ i2) * 77) ^ 31610877;
                        i5 = 1615129937;
                    }
                    break;
                case -330536153:
                case -156805560:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-2807)) ^ (-337318582);
                        i5 = 863421674;
                    }
                    break;
                case 262354532:
                case 753856630:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-4637)) ^ (-1642695123);
                        i5 = 1619624282;
                    } else {
                        iM11306 = C19806.m45029("۠۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-12599)) ^ (-238098105);
                        i5 = 501414300;
                    }
                    break;
                case 274787042:
                case 1316577620:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("ۧܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31067) ^ (-2106672631);
                        i5 = -1597767328;
                    } else {
                        iM11306 = C19806.m45029("ۖ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24143)) ^ (-1881640853);
                        i5 = -106332282;
                    }
                    break;
                case 561454409:
                case 1266790291:
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("ۨ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19773) ^ (-652332218);
                        i5 = 1568160033;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۚ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-29655)) ^ 1887781668;
                        i5 = 1029577757;
                    }
                    break;
                case 583369613:
                case 1018471453:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1287) ^ 611675123;
                        i5 = -1696190825;
                    } else {
                        iM11306 = C19806.m45029("֫᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20935)) ^ 353053273;
                        i5 = 1376170775;
                    }
                    break;
                case 969763127:
                case 1437787602:
                    if (c8931.m23220() >= c8930.m23220()) {
                        iM11306 = (i3 - C19806.m45029("ۨ۟")) * (-65);
                        i4 = ((iM11306 ^ i2) * (-21165)) ^ 309909055;
                        i5 = -2103446873;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۟᩷")) * (-61);
                        i4 = ((iM11306 ^ i2) * 32375) ^ 638614568;
                        i5 = -5440203;
                    }
                    break;
                case 1109320670:
                case 2065818458:
                    return c8930;
                default:
                    return c8931;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m7779(C22710 c22710, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM45029;
        int i;
        C3658 c3658 = null;
        InterfaceC18745 interfaceC18745 = null;
        int i2 = 0;
        C23747 c23747 = null;
        Long l2 = null;
        long jM6676 = 0;
        int i3 = -1601688574;
        int i4 = RunnableC0195.f1321;
        int i5 = C0050.f912;
        int iM450210 = C19806.m45029("ۜ֡") ^ i5;
        int i6 = ((iM450210 ^ i4) * 13441) ^ (-702353532);
        int i7 = 1654973497;
        while (true) {
            int i8 = iM450210 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-2563)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2088733107:
                    case -989477542:
                        jM6676 = C2124.m6676(l2.longValue(), i2);
                        if (C3577.f13150 < 0) {
                            iM450210 = (i5 - ThreadFactoryC3888.m11306("֡ۛ")) * 43;
                            i6 = ((iM450210 ^ i4) * 4231) ^ (-1945177653);
                            i7 = -627476030;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i5) * (-103);
                            i6 = ((iM450210 ^ i4) * (-10423)) ^ 767220818;
                            i7 = 1095787696;
                        }
                        break;
                    case -2064916502:
                    case -493795498:
                        if (C2871.f10837 < 0) {
                            iM450210 = (i4 - C19806.m45029("ܿۛ")) * (-127);
                            i6 = ((iM450210 ^ i5) * (-31241)) ^ 421072134;
                            i7 = 2001888983;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i5) * (-103);
                            i6 = ((iM450210 ^ i4) * (-10423)) ^ 767220818;
                            i7 = 1095787696;
                        }
                        break;
                    case -2001649518:
                    case 61958879:
                        boolean zM3351 = C0797.m3351(c22710);
                        C3658 c3659 = c22710.f73969;
                        if (zM3351) {
                            iM45029 = ThreadFactoryC3888.m11306("ۚۤ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 6657) ^ 288361217;
                            i = -1091927831;
                        } else {
                            iM45029 = (i5 - C19806.m45029("ۜᩳ")) * 49;
                            i6 = ((iM45029 ^ i4) * (-2777)) ^ (-2028542953);
                            i = 1823968007;
                        }
                        i8 = iM45029 ^ i;
                        c3658 = c3659;
                        break;
                    case -1977190854:
                    case 294656705:
                        ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, c23747, ViewTreeObserverOnPreDrawListenerC3327.m9877(jM6676));
                        iM450210 = (ThreadFactoryC3888.m11306("ܿܿ") ^ i5) * (-89);
                        i6 = ((iM450210 ^ i4) * (-8599)) ^ (-1526316334);
                        i7 = 1595335395;
                        break;
                    case -1676352381:
                    case 336273044:
                        C3722.m10894();
                        if (RunnableC1606.f6488 < 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("۠ۢ") + i5) * 17;
                            i6 = ((iM450210 ^ i4) * (-30809)) ^ (-1398864445);
                            i7 = -1593958550;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-29607)) ^ 1599112364;
                            i7 = -654966323;
                        }
                        break;
                    case -1584036412:
                    case 1075857441:
                        if (RunnableC3388.f12514 < 0) {
                            iM450210 = (i5 - ThreadFactoryC3888.m11306("ܳ᩸")) * (-111);
                            i6 = ((iM450210 ^ i4) * 13603) ^ (-1345445897);
                            i7 = -352975592;
                        } else {
                            iM450210 = (C19806.m45029("ۘۙ") ^ i4) * (-67);
                            i6 = ((iM450210 ^ i5) * 19279) ^ (-524151952);
                            i7 = 188128542;
                        }
                        break;
                    case -1429497682:
                    case -257389930:
                        C0629.m2904(identityHashMap, c23747, C3577.m10575(i2));
                        C3660.m10788(arrayList, c23747);
                        break;
                    case -1373844641:
                    case -62680042:
                        if (C2124.m6673() <= 0) {
                            iM450210 = C19806.m45029("֡ۚ") ^ i5;
                            i6 = ((iM450210 ^ i4) * (-10975)) ^ 291278464;
                            i7 = 1884591491;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-29607)) ^ 1599112364;
                            i7 = -654966323;
                        }
                        break;
                    case -1011533139:
                    case 190410198:
                        if (!C0962.f3784) {
                            iM450210 = C19806.m45029("ۜۖ") ^ i4;
                            i6 = ((iM450210 ^ i5) * 17633) ^ 1838704158;
                            i7 = 1181894708;
                        } else {
                            iM450210 = C19806.m45029("֡ۚ") ^ i5;
                            i6 = ((iM450210 ^ i4) * (-10975)) ^ 291278464;
                            i7 = 1884591491;
                        }
                        break;
                    case -837819008:
                    case 1258336042:
                        if (!C2332.f8260) {
                            iM450210 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-29607)) ^ 1599112364;
                            i7 = -654966323;
                            break;
                        }
                        iM450210 = C19806.m45029("ᩴۗ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-19533)) ^ (-1218093412);
                        i7 = 945320332;
                        break;
                    case -634596842:
                    case 1692999378:
                        break;
                    case -442022627:
                    case 1528319625:
                        if (RunnableC0195.f1321 < 0) {
                            iM450210 = (i5 - ThreadFactoryC3888.m11306("ۙ֨")) * 15;
                            i6 = ((iM450210 ^ i4) * (-4023)) ^ (-1879423950);
                            i7 = -672679288;
                        } else {
                            iM450210 = C19806.m45029("֡ۚ") ^ i5;
                            i6 = ((iM450210 ^ i4) * (-10975)) ^ 291278464;
                            i7 = 1884591491;
                        }
                        break;
                    case -382763509:
                    case 490704368:
                        interfaceC18745 = c3658.f13401;
                        i2 = c3658.f13400;
                        if (!(interfaceC18745 instanceof C23747)) {
                            iM450210 = (ThreadFactoryC3888.m11306("ܿܿ") ^ i5) * (-89);
                            i6 = ((iM450210 ^ i4) * (-8599)) ^ (-1526316334);
                            i7 = 1595335395;
                            break;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("۠֨") ^ i5;
                        i6 = ((iM450210 ^ i4) * 27727) ^ (-909505204);
                        i7 = 921877093;
                        break;
                    case -21509258:
                    case 319127558:
                        if (AbstractC0464.f2088 > 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ۤۨ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-12535)) ^ (-1540753754);
                            i7 = -2072814405;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i5) * (-103);
                            i6 = ((iM450210 ^ i4) * (-10423)) ^ 767220818;
                            i7 = 1095787696;
                        }
                        break;
                    case -11650549:
                    case 369783909:
                        m7779(c22710.f73972, identityHashMap, arrayList);
                        m7779(c22710.f73966, identityHashMap, arrayList);
                        break;
                    case 121673758:
                    case 665212524:
                        if (C1937.m6279() < 0) {
                            iM450210 = C19806.m45029("۬ۙ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-27731)) ^ (-718402540);
                            i7 = 727993260;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i5) * (-103);
                            i6 = ((iM450210 ^ i4) * (-10423)) ^ 767220818;
                            i7 = 1095787696;
                        }
                        break;
                    case 171515241:
                    case 464469438:
                        if (C1977.f7413 <= 0) {
                            iM450210 = (C19806.m45029("ۘۙ") ^ i4) * (-67);
                            i6 = ((iM450210 ^ i5) * 19279) ^ (-524151952);
                            i7 = 188128542;
                            break;
                        }
                        iM450210 = C19806.m45029("֡ۚ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-10975)) ^ 291278464;
                        i7 = 1884591491;
                        break;
                    case 489201177:
                    case 1953616524:
                        if (C3722.f13525 > 0) {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("᩻ܶ")) * 9;
                            i6 = ((iM450210 ^ i5) * 749) ^ (-1830744188);
                            i7 = -918682066;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-29607)) ^ 1599112364;
                            i7 = -654966323;
                        }
                        break;
                    case 585899118:
                    case 781100959:
                        if (!C0817.m3399()) {
                            iM450210 = (ThreadFactoryC3888.m11306("۟ۜ") ^ i5) * (-103);
                            i6 = ((iM450210 ^ i4) * (-10423)) ^ 767220818;
                            i7 = 1095787696;
                            break;
                        }
                        iM450210 = C19806.m45029("ܿۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-28309)) ^ 328706285;
                        i7 = -1363461834;
                        break;
                    case 777001954:
                    case 2065755138:
                        C1937.m6279();
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        break;
                    case 1375679498:
                    case 2061039950:
                        c23747 = (C23747) interfaceC18745;
                        l2 = (Long) identityHashMap.get(c23747);
                        if (l2 != null) {
                            iM450210 = C19806.m45029("ۛۢ") ^ i4;
                            i6 = ((iM450210 ^ i5) * 11421) ^ 1540786380;
                            i7 = 1724958830;
                        } else {
                            iM450210 = (C19806.m45029("۬ۡ") + i4) * 115;
                            i6 = ((iM450210 ^ i5) * (-12943)) ^ (-877619661);
                            i7 = 867785334;
                        }
                        break;
                    default:
                        C1419.m4973();
                        C10634.m26820();
                        iM450210 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i4;
                        i6 = ((iM450210 ^ i5) * (-29607)) ^ 1599112364;
                        i7 = -654966323;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7767() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1252999686;
        int i7 = AbstractC0464.f2088;
        int i8 = C2124.f7782;
        int iM11306 = (i7 - ThreadFactoryC3888.m11306("ۨ᩻")) * (-49);
        int i9 = ((iM11306 ^ i8) * 3173) ^ 1450175990;
        int i10 = 358356366;
        while (true) {
            i6 = ((((i6 ^ i8) * (-16251)) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2071797432:
                case 675324207:
                    RunnableC1606.m5473();
                    iM11306 = ThreadFactoryC3888.m11306("۠᩶") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-29421)) ^ (-667364687);
                    i10 = 1135233413;
                    break;
                case -2070636686:
                case 1342083691:
                    if (!C10634.m26820()) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩶") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-29421)) ^ (-667364687);
                        i10 = 1135233413;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    }
                    break;
                case -2039456960:
                case -1896444088:
                    c = 903;
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 13695) ^ 686041552;
                        i10 = -1819373024;
                    } else {
                        iM11306 = C19806.m45029("ܳܺ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-18919)) ^ 798002816;
                        i10 = 1896383411;
                    }
                    break;
                case -1980566911:
                case 717656238:
                    return;
                case -1819461045:
                case 466096436:
                    RunnableC1895.m6170();
                    C7105.m18985();
                    return;
                case -1750992173:
                case 1722410079:
                    ThreadFactoryC3888.m11300();
                    if (C1875.m6086() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 13695) ^ 686041552;
                        i10 = -1819373024;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    }
                    break;
                case -1321166537:
                case 1370146:
                    sArr = f9977;
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۜ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 13695) ^ 686041552;
                        i10 = -1819373024;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۧۛ")) * (-69);
                        i9 = ((iM11306 ^ i8) * 17261) ^ (-84169300);
                        i10 = 449730674;
                    }
                    break;
                case -1218440905:
                case -1130467010:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܿ") + i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((iM11306 ^ i8) * 18907) ^ (-227650049);
                        i10 = 423195293;
                    }
                    break;
                case -886669027:
                case 929988563:
                    if (C19806.f63586) {
                        iM11306 = (i8 - C19806.m45029("᩻ۘ")) * (-47);
                        i9 = ((iM11306 ^ i7) * 805) ^ (-1175989183);
                        i10 = -1666473603;
                    } else {
                        iM11306 = C19806.m45029("᩶᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 12975) ^ 999058014;
                        i10 = 245567799;
                    }
                    break;
                case -873662180:
                case 1745994117:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    } else {
                        iM11306 = C19806.m45029("᩹ۙ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-29311)) ^ 291379637;
                        i10 = 396304076;
                    }
                    break;
                case -517812120:
                case 532888806:
                    i5 = 57456;
                    iM11306 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-5329)) ^ 1589388695;
                    i10 = -1496871531;
                    break;
                case -247953359:
                case -22691734:
                    if (this.f9993 == null) {
                        iM11306 = C19806.m45029("ۨۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 31793) ^ (-1657147038);
                        i10 = 1566427732;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۜ") + i8) * 89;
                        i9 = ((iM11306 ^ i7) * 24133) ^ 71590444;
                        i10 = -163744180;
                    }
                    break;
                case -74608192:
                case 2033965567:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    } else {
                        iM11306 = C19806.m45029("֨۬") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-2575)) ^ 2039600352;
                        i10 = -236229873;
                    }
                    break;
                case 189012882:
                case 1240235230:
                    int i11 = i3 + i4;
                    if ((i11 + i11) - i2 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i7;
                        i9 = ((iM11306 ^ i8) * 21365) ^ (-635356205);
                        i10 = 1201849764;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟᩺") + i8) * 95;
                        i9 = ((iM11306 ^ i7) * 10055) ^ 1430957063;
                        i10 = 2005446482;
                    }
                    break;
                case 344404968:
                case 1562483812:
                    i5 = 58900;
                    iM11306 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-5329)) ^ 1589388695;
                    i10 = -1496871531;
                    break;
                case 919523287:
                case 1611424311:
                    short[] sArr2 = f9977;
                    if (C0278.m1789() > 0 && RunnableC1895.m6170() == 0) {
                        throw new IllegalStateException(C0216.m1588(sArr2, 904, 31, i5));
                    }
                    iM11306 = ThreadFactoryC3888.m11306("۠᩶") ^ i7;
                    i9 = ((iM11306 ^ i8) * (-29421)) ^ (-667364687);
                    i10 = 1135233413;
                    break;
                case 1217583443:
                case 2092656033:
                    i4 = 51969681;
                    if (C1377.f5749) {
                        iM11306 = (i8 - C19806.m45029("ܶۢ")) * (-29);
                        i9 = ((iM11306 ^ i7) * 15209) ^ (-996091098);
                        i10 = 2017456495;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i8;
                        i9 = ((iM11306 ^ i7) * 5461) ^ (-972008281);
                        i10 = -216426577;
                    }
                    break;
                case 1674373965:
                case 2114584023:
                    i = s + 7209;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (i8 - C19806.m45029("᩻ۘ")) * (-47);
                        i9 = ((iM11306 ^ i7) * 805) ^ (-1175989183);
                        i10 = -1666473603;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۜ") + i8) * (-115);
                        i9 = ((iM11306 ^ i7) * 18921) ^ (-2030348038);
                        i10 = -13598622;
                    }
                    break;
                default:
                    s = sArr[c];
                    if (C1977.m6356()) {
                        iM11306 = (i8 - C19806.m45029("᩻ۘ")) * (-47);
                        i9 = ((iM11306 ^ i7) * 805) ^ (-1175989183);
                        i10 = -1666473603;
                    } else {
                        iM11306 = C19806.m45029("ۨ۫") ^ i7;
                        i9 = ((iM11306 ^ i8) * 23183) ^ (-1268358437);
                        i10 = 644585459;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7759(C22710 c22710, C5838 c5838, C8868 c8868, int i) {
        boolean z = false;
        C3658 c3658 = null;
        int i2 = -452461234;
        int i3 = C1398.f5802;
        int i4 = C1025.f4800;
        int iM45029 = C19806.m45029("ۧۜ") ^ i3;
        int i5 = ((iM45029 ^ i4) * 4267) ^ 475816336;
        int i6 = -1520220867;
        while (true) {
            int i7 = iM45029 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 31997) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2134488471:
                    case -695182518:
                        if (!c5838.f19803) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i4) * (-39);
                            i5 = ((iM45029 ^ i3) * 26691) ^ 1658341191;
                            i6 = -1612694167;
                            break;
                        }
                        iM45029 = C19806.m45029("۟۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                        i6 = 1785545392;
                        break;
                    case -2057558030:
                    case 953822529:
                        return z;
                    case -2034427393:
                    case -785619596:
                        if (!C0629.m2907()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶ֡") + i4) * (-29);
                            i5 = ((iM45029 ^ i3) * 18839) ^ 198117155;
                            i6 = 1641743414;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩻۬") ^ i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 7617) ^ 2088079693;
                        i6 = 1986809851;
                        break;
                    case -1997115354:
                    case -1918355513:
                        if (c3658.f13400 != i) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 983) ^ (-1197207188);
                        i6 = 1946383396;
                        break;
                    case -1971602637:
                    case -1954134375:
                        if (C2124.m6673() > 0) {
                            iM45029 = C19806.m45029("ܽۨ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-19879)) ^ 50196705;
                            i6 = 610647555;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩷ۡ") ^ i3) * 65;
                        i5 = ((iM45029 ^ i4) * 4987) ^ 208361457;
                        i6 = 1604306297;
                        break;
                    case -1905139849:
                    case -187388537:
                        if (C3722.f13525 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۤ֫") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-7409)) ^ 1368691230;
                            i6 = 1987417984;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                    case -1904825323:
                    case -900422456:
                        if (C1668.f6641 < 0) {
                            iM45029 = C19806.m45029("ᩳ᩹") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-17139)) ^ (-318589202);
                            i6 = -1586642776;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨۗ")) * (-67);
                        i5 = ((iM45029 ^ i4) * (-7261)) ^ 1781225259;
                        i6 = 1320283539;
                        break;
                    case -1646911915:
                    case -716039300:
                        if (c3658.f13399 != 0) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = (C19806.m45029("۟ۢ") ^ i4) * (-15);
                        i5 = ((iM45029 ^ i3) * 4029) ^ 1198246124;
                        i6 = 1298680906;
                        break;
                    case -1498711189:
                    case -1473601758:
                        if (i != c8868.length()) {
                            z = false;
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                        }
                        int iM11306 = ThreadFactoryC3888.m11306("ۙۖ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-971)) ^ (-618033608);
                        i7 = iM11306 ^ (-529452009);
                        z = false;
                        break;
                        break;
                    case -1427759494:
                    case 1752295799:
                        if (i != 0) {
                            iM45029 = (i3 - C19806.m45029("ۚ᩹")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM45029 ^ i4) * 2011) ^ 664106891;
                            i6 = -1283314992;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-4105)) ^ 1592181545;
                        i6 = 1762429597;
                        break;
                    case -1358530290:
                    case -743590249:
                        if (!C0817.f3443) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨۗ")) * (-67);
                            i5 = ((iM45029 ^ i4) * (-7261)) ^ 1781225259;
                            i6 = 1320283539;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case -1316731883:
                    case 104227673:
                        C10634.m26820();
                        if (C1189.f5284 > 0) {
                            iM45029 = C19806.m45029("֡֡") ^ i4;
                            i5 = ((iM45029 ^ i3) * 21153) ^ (-710798390);
                            i6 = -1683618086;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ֡") + i4) * (-29);
                        i5 = ((iM45029 ^ i3) * 18839) ^ 198117155;
                        i6 = 1641743414;
                        break;
                        break;
                    case -1303187568:
                    case 1289581176:
                        C0671.m3008();
                        if (C2124.f7782 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 27055) ^ (-100440182);
                            i6 = -1701725248;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case -1210924239:
                    case 1595215488:
                        if (c3658.f13402 != null) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ֨")) * (-93);
                        i5 = ((iM45029 ^ i3) * 28831) ^ 171282892;
                        i6 = -453146903;
                        break;
                    case -1178756653:
                    case 60041551:
                        if (c22710 != null) {
                            iM45029 = (i4 - C19806.m45029("ۘ᩵")) * (-51);
                            i5 = ((iM45029 ^ i3) * (-18697)) ^ 710673890;
                            i6 = -370678792;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۘ") + i4) * (-63);
                        i5 = ((iM45029 ^ i3) * (-29615)) ^ 1057656744;
                        i6 = -2114845949;
                        break;
                    case -1131300757:
                    case 552549677:
                        if (AbstractC0464.f2088 > 0) {
                            iM45029 = C19806.m45029("᩸ۧ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 30979) ^ 597855472;
                            i6 = -1551252197;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case -1122149562:
                    case -425019454:
                        if (c22710 == null) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = C19806.m45029("۟᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31217) ^ 2061009411;
                        i6 = 1445233417;
                        break;
                    case -1106330474:
                    case 571346418:
                        if (c5838 != null) {
                            iM45029 = (i4 - C19806.m45029("ۘ᩵")) * (-51);
                            i5 = ((iM45029 ^ i3) * (-18697)) ^ 710673890;
                            i6 = -370678792;
                            break;
                            break;
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ֨")) * (-93);
                        i5 = ((iM45029 ^ i3) * 28831) ^ 171282892;
                        i6 = -453146903;
                        break;
                        break;
                    case -883646221:
                    case -119251642:
                        return true;
                    case -752328877:
                    case -272027239:
                        c3658 = c22710.f73969;
                        if (c3658.f13401 != c8868) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = C19806.m45029("ܽ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-9273)) ^ (-1416758451);
                        i6 = -28849713;
                        break;
                    case -713652749:
                    case 2043715418:
                        C0629.m2907();
                        return false;
                    case -575874344:
                    case 953719215:
                        if (!C19806.m45024()) {
                            iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                            i6 = -27038668;
                            break;
                            break;
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۨۨ")) * 9;
                        i5 = ((iM45029 ^ i3) * 29943) ^ (-485515874);
                        i6 = -462734889;
                        break;
                    case -149070651:
                    case 32960645:
                        C0797.m3359();
                        if (!RunnableC3388.m10064()) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-30987)) ^ (-1227982958);
                            i6 = -2109794567;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case -45222226:
                    case 1858349458:
                        if (C3722.f13525 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-4613)) ^ 1178451420;
                            i6 = -1319514717;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩷ۡ") ^ i3) * 65;
                        i5 = ((iM45029 ^ i4) * 4987) ^ 208361457;
                        i6 = 1604306297;
                        break;
                        break;
                    case 148136540:
                    case 1933249211:
                        if (RunnableC1606.f6488 < 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܳ᩸") + i3) * (-27);
                            i5 = ((iM45029 ^ i4) * 985) ^ (-135639967);
                            i6 = 443338872;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27055) ^ (-100440182);
                        i6 = -1701725248;
                        break;
                        break;
                    case 398131718:
                    case 1098427552:
                        return z;
                    case 485974727:
                    case 1417422009:
                        if (AbstractC0464.f2088 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۖۢ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 14307) ^ (-118038148);
                            i6 = -262270162;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩷ۡ") ^ i3) * 65;
                        i5 = ((iM45029 ^ i4) * 4987) ^ 208361457;
                        i6 = 1604306297;
                        break;
                        break;
                    case 764133082:
                    case 1385027777:
                        if (RunnableC0195.f1321 >= 0) {
                            iM45029 = C19806.m45029("᩵ܺ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 23759) ^ 1069478702;
                            i6 = -155528128;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27055) ^ (-100440182);
                        i6 = -1701725248;
                        break;
                        break;
                    case 817896389:
                    case 1668889158:
                        if (c5838 == null) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i4) * (-39);
                            i5 = ((iM45029 ^ i3) * 26691) ^ 1658341191;
                            i6 = -1612694167;
                            break;
                            break;
                        }
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۚ") ^ i3) * (-7);
                        i5 = ((iM45029 ^ i4) * 5837) ^ (-314608730);
                        i6 = 83322140;
                        break;
                    case 979782296:
                    case 1327637838:
                        RunnableC0195.m1431();
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case 1259816501:
                    case 1901605293:
                        if (C0629.f2722 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶ֡") + i4) * (-29);
                            i5 = ((iM45029 ^ i3) * 18839) ^ 198117155;
                            i6 = 1641743414;
                            break;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۢۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-18543)) ^ 386609953;
                        i6 = -27038668;
                        break;
                        break;
                    case 1640317152:
                    case 1642791611:
                        if (RunnableC1606.f6488 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۠۠") ^ i3;
                            i5 = ((iM45029 ^ i4) * 1149) ^ 1628892451;
                            i6 = -1916890474;
                            break;
                        }
                        iM45029 = (C19806.m45029("᩷ۡ") ^ i3) * 65;
                        i5 = ((iM45029 ^ i4) * 4987) ^ 208361457;
                        i6 = 1604306297;
                        break;
                        break;
                    case 2022064709:
                    case 2100386190:
                        if (!C1025.m3862(c22710)) {
                            iM45029 = C19806.m45029("۟۬") ^ i3;
                            i5 = ((iM45029 ^ i4) * 8273) ^ 1955319337;
                            i6 = 1785545392;
                            break;
                            break;
                        }
                        iM45029 = C19806.m45029("ܰۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-16615)) ^ (-648210496);
                        i6 = -130183418;
                        break;
                    default:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = (C19806.m45029("᩻ۚ") + i4) * 25;
                            i5 = ((iM45029 ^ i3) * (-12617)) ^ 1855391630;
                            i6 = -418601951;
                            break;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 27055) ^ (-100440182);
                        i6 = -1701725248;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01db A[PHI: r7 r11 r13 r15
      0x01db: PHI (r7v4 java.util.Iterator) = 
      (r7v3 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
     binds: [B:58:0x01d4, B:128:0x01db, B:31:0x00bd, B:27:0x009d, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r11v4 long) = (r11v2 long), (r11v3 long), (r11v2 long), (r11v2 long), (r11v2 long) binds: [B:58:0x01d4, B:128:0x01db, B:31:0x00bd, B:27:0x009d, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r13v4 long) = (r13v2 long), (r13v3 long), (r13v2 long), (r13v2 long), (r13v2 long) binds: [B:58:0x01d4, B:128:0x01db, B:31:0x00bd, B:27:0x009d, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r15v4 long) = (r15v3 long), (r15v2 long), (r15v2 long), (r15v2 long), (r15v5 long) binds: [B:58:0x01d4, B:128:0x01db, B:31:0x00bd, B:27:0x009d, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x026a A[PHI: r4 r9
      0x026a: PHI (r4v4 java.util.IdentityHashMap) = 
      (r4v3 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
     binds: [B:70:0x0268, B:43:0x012b, B:22:0x0081, B:20:0x007d, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r9v4 java.lang.Object) = 
      (r9v2 java.lang.Object)
      (r9v3 java.lang.Object)
      (r9v2 java.lang.Object)
      (r9v2 java.lang.Object)
      (r9v2 java.lang.Object)
     binds: [B:70:0x0268, B:43:0x012b, B:22:0x0081, B:20:0x007d, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d5 A[PHI: r2
      0x02d5: PHI (r2v3 long) = (r2v2 long), (r2v4 long) binds: [B:78:0x02bb, B:74:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02f3 A[PHI: r6 r8 r10 r22
      0x02f3: PHI (r6v4 java.util.IdentityHashMap) = 
      (r6v2 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
      (r6v3 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
     binds: [B:67:0x023d, B:83:0x02f1, B:61:0x01fc, B:47:0x0150, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r8v5 l.᩻ܰ᩹) = (r8v2 l.᩻ܰ᩹), (r8v2 l.᩻ܰ᩹), (r8v2 l.᩻ܰ᩹), (r8v4 l.᩻ܰ᩹), (r8v2 l.᩻ܰ᩹) binds: [B:67:0x023d, B:83:0x02f1, B:61:0x01fc, B:47:0x0150, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r10v3 java.lang.Long) = (r10v2 java.lang.Long), (r10v2 java.lang.Long), (r10v2 java.lang.Long), (r10v2 java.lang.Long), (r10v5 java.lang.Long) binds: [B:67:0x023d, B:83:0x02f1, B:61:0x01fc, B:47:0x0150, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r22v8 java.util.ArrayList) = 
      (r22v4 java.util.ArrayList)
      (r22v3 java.util.ArrayList)
      (r22v3 java.util.ArrayList)
      (r22v3 java.util.ArrayList)
      (r22v3 java.util.ArrayList)
     binds: [B:67:0x023d, B:83:0x02f1, B:61:0x01fc, B:47:0x0150, B:39:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0323  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C22710 m7774(C22710 c22710, long j, C15986 c15986) {
        int iM45029;
        int i;
        int i2;
        long j2 = 0;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        Iterator itM10563 = null;
        C23747 c23747 = null;
        Object obj = null;
        Long l2 = null;
        long jLongValue = 0;
        long jMo31831 = 0;
        long j3 = 0;
        int i3 = -1342984236;
        int i4 = C1025.f4800;
        int i5 = C3577.f13150;
        int iM450210 = (C19806.m45029("ۢۨ") ^ i4) * (-9);
        int i6 = ((iM450210 ^ i5) * 2635) ^ 1144001434;
        int i7 = iM450210 ^ 2104626515;
        C22710 c22710M7775 = null;
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                i3 = i7 ^ (i6 & (((i3 ^ i5) * 29317) >> 31));
                switch (i3) {
                    case -1980887039:
                    case 13517386:
                        l2 = (Long) obj;
                        if (C2332.f8260) {
                            iM45029 = C19806.m45029("ۗ۬") ^ i5;
                            i = ((iM45029 ^ i4) * 25793) ^ 1844864572;
                            i2 = 2077617711;
                        } else {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * 13;
                            i = ((iM45029 ^ i5) * 17887) ^ (-1303174544);
                            i2 = 660028919;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1854779840:
                    case 1384069977:
                        identityHashMap = new IdentityHashMap();
                        if (C0962.f3784) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-69);
                            i = ((iM45029 ^ i5) * 5395) ^ (-1336224665);
                            i2 = 362377731;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ۡ۟")) * 9;
                            i = ((iM45029 ^ i5) * (-24253)) ^ (-52479524);
                            i2 = 498606567;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1758706543:
                    case -1288828118:
                        return c22710;
                    case -1567628756:
                    case 910549827:
                        if (c22710 != null) {
                            iM45029 = (i5 - C19806.m45029("ܶۗ")) * (-123);
                            i = ((iM45029 ^ i4) * 23155) ^ 1694702735;
                            i2 = -1372080220;
                        } else {
                            c22710M7775 = c22710;
                            iM45029 = ThreadFactoryC3888.m11306("ܳۚ") ^ i5;
                            i = ((iM45029 ^ i4) * 26511) ^ 710090570;
                            i2 = -522761543;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1440429835:
                    case 597258922:
                        c22710M7775 = m7775(c22710, identityHashMap2, c15986);
                        iM45029 = ThreadFactoryC3888.m11306("ܳۚ") ^ i5;
                        i = ((iM45029 ^ i4) * 26511) ^ 710090570;
                        i2 = -522761543;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1419470477:
                    case -1177649081:
                        if (identityHashMap2.isEmpty()) {
                            iM45029 = (C19806.m45029("ᩳۤ") + i4) * (-53);
                            i = ((iM45029 ^ i5) * 811) ^ (-1161310806);
                            i2 = 1565615985;
                        } else {
                            iM45029 = C19806.m45029("۠۫") ^ i4;
                            i = ((iM45029 ^ i5) * 32093) ^ 1183041924;
                            i2 = 2056642609;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1319026215:
                    case -196105424:
                        C0629.m2904(identityHashMap2, c23747, Boolean.TRUE);
                        j3 += jLongValue;
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۘ")) * (-59);
                        i = ((iM45029 ^ i4) * (-26149)) ^ (-372067307);
                        i2 = -1908770443;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -1274935707:
                    case -710895601:
                        C1937.m6279();
                        return null;
                    case -1079443008:
                    case -971624788:
                        C2788.m8472();
                        if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                            iM45029 = (C19806.m45029("ۤ᩻") ^ i5) * (-69);
                            i = ((iM45029 ^ i4) * 32065) ^ 1098286438;
                            i2 = 262443816;
                            i7 = iM45029 ^ i2;
                            i6 = i;
                        }
                        break;
                    case -1019000138:
                    case 745682593:
                        if (jLongValue <= jMo31831 / 4) {
                            iM45029 = ThreadFactoryC3888.m11306("֫۠") ^ i5;
                            i = ((iM45029 ^ i4) * (-4567)) ^ (-873070989);
                            i2 = -1096711375;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۘ")) * (-59);
                            i = ((iM45029 ^ i4) * (-26149)) ^ (-372067307);
                            i2 = -1908770443;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -995924656:
                    case 1178891493:
                        C1460.m5050();
                        if (C0050.f912 <= 0) {
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-69);
                        i = ((iM45029 ^ i5) * 5395) ^ (-1336224665);
                        i2 = 362377731;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -812215758:
                    case 2048585453:
                        return c22710M7775;
                    case -748687194:
                    case 1801019410:
                        j3 = 0;
                        itM10563 = C3577.m10563(arrayList);
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۘ")) * (-59);
                        i = ((iM45029 ^ i4) * (-26149)) ^ (-372067307);
                        i2 = -1908770443;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -747109818:
                    case -676396837:
                        C1148.m4232();
                        C0526.m2437();
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-69);
                        i = ((iM45029 ^ i5) * 5395) ^ (-1336224665);
                        i2 = 362377731;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -726163844:
                    case -616318286:
                        if (C7105.f23796 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i4;
                            i = ((iM45029 ^ i5) * (-749)) ^ (-1977031966);
                            i2 = -1762215013;
                        } else {
                            iM45029 = C19806.m45029("֡ܶ") ^ i5;
                            i = ((iM45029 ^ i4) * 8283) ^ (-132666516);
                            i2 = -370829668;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -681101910:
                    case 168982761:
                        if (RunnableC3388.m10064()) {
                        }
                        iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i4;
                        i = ((iM45029 ^ i5) * (-749)) ^ (-1977031966);
                        i2 = -1762215013;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -633153803:
                    case 611088375:
                        if (jLongValue > 65536 - j3) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۘ")) * (-59);
                            i = ((iM45029 ^ i4) * (-26149)) ^ (-372067307);
                            i2 = -1908770443;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i4;
                            i = ((iM45029 ^ i5) * (-29173)) ^ (-1766234363);
                            i2 = 620671015;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -589515264:
                    case 1385578507:
                        if (RunnableC1564.m5348(itM10563)) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i5;
                            i = ((iM45029 ^ i4) * (-6161)) ^ (-1335332885);
                            i2 = -1057056383;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ᩵") ^ i4) * 27;
                            i = ((iM45029 ^ i5) * (-10761)) ^ (-577737715);
                            i2 = -1446422161;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -518490487:
                    case 1321775004:
                        jLongValue = l2.longValue();
                        jMo31831 = c23747.mo31831();
                        if (jMo31831 >= j2) {
                            int iM450211 = C19806.m45029("֨ۗ") ^ i5;
                            i6 = ((iM450211 ^ i4) * 16539) ^ (-160411530);
                            i7 = iM450211 ^ 1502527178;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ܶۘ")) * (-59);
                            i = ((iM45029 ^ i4) * (-26149)) ^ (-372067307);
                            i2 = -1908770443;
                            i7 = iM45029 ^ i2;
                            i6 = i;
                        }
                        break;
                    case -457125183:
                    case 1227513988:
                        if (C0050.f912 <= 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-69);
                            i = ((iM45029 ^ i5) * 5395) ^ (-1336224665);
                            i2 = 362377731;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i5;
                            i = ((iM45029 ^ i4) * (-25037)) ^ (-396935117);
                            i2 = 1303031221;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -434765966:
                    case 41291746:
                        identityHashMap2 = new IdentityHashMap();
                        if (C2477.m7593() >= 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * 13;
                            i = ((iM45029 ^ i5) * 17887) ^ (-1303174544);
                            i2 = 660028919;
                        } else {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("۠ۢ")) * (-107);
                            i = ((iM45029 ^ i5) * (-16235)) ^ (-880643682);
                            i2 = -1364999613;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -231185963:
                    case 1513152774:
                        c23747 = (C23747) C0216.m1584(itM10563);
                        if (C1668.f6641 >= 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * 13;
                            i = ((iM45029 ^ i5) * 17887) ^ (-1303174544);
                            i2 = 660028919;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩵֫") + i4) * (-5);
                            i = ((iM45029 ^ i5) * (-12099)) ^ (-919716210);
                            i2 = -183361974;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case -108803640:
                    case 1398440818:
                        if (RunnableC3388.m10064()) {
                            iM45029 = ThreadFactoryC3888.m11306("۠᩸") ^ i4;
                            i = ((iM45029 ^ i5) * 28895) ^ (-578204909);
                            i2 = 1916729723;
                        } else {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * 13;
                            i = ((iM45029 ^ i5) * 17887) ^ (-1303174544);
                            i2 = 660028919;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case 425986189:
                    case 1480296263:
                        obj = identityHashMap.get(c23747);
                        if (C1148.f5161 <= 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-69);
                            i = ((iM45029 ^ i5) * 5395) ^ (-1336224665);
                            i2 = 362377731;
                        } else {
                            iM45029 = (C19806.m45029("ۙܽ") ^ i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i = ((iM45029 ^ i4) * 25051) ^ (-1377969805);
                            i2 = -584124442;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case 838362398:
                    case 1540034846:
                        j2 = 1048576;
                        if (j < 1048576) {
                            c22710M7775 = c22710;
                            iM45029 = ThreadFactoryC3888.m11306("ܳۚ") ^ i5;
                            i = ((iM45029 ^ i4) * 26511) ^ 710090570;
                            i2 = -522761543;
                        } else {
                            iM45029 = (C19806.m45029("۠ᩳ") + i4) * (-29);
                            i = ((iM45029 ^ i5) * 8543) ^ (-1514044622);
                            i2 = -892440922;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    case 1900410245:
                    case 1932026234:
                        if (RunnableC3388.f12514 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i5;
                            i = ((iM45029 ^ i4) * (-25037)) ^ (-396935117);
                            i2 = 1303031221;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ܿܽ")) * (-23);
                            i = ((iM45029 ^ i5) * 18911) ^ 1380221964;
                            i2 = 323835179;
                        }
                        i7 = iM45029 ^ i2;
                        i6 = i;
                        break;
                    default:
                        if (C3577.f13150 < 0) {
                            ArrayList arrayList2 = new ArrayList();
                            m7779(c22710, identityHashMap, arrayList2);
                            if (C2642.f10294 <= 0) {
                                arrayList = arrayList2;
                                iM45029 = (i4 - ThreadFactoryC3888.m11306("ۡܽ")) * 13;
                                i = ((iM45029 ^ i5) * 17887) ^ (-1303174544);
                                i2 = 660028919;
                                i7 = iM45029 ^ i2;
                                i6 = i;
                            } else {
                                int iM450212 = (C19806.m45029("ۡۡ") ^ i5) * (-23);
                                i6 = ((iM450212 ^ i4) * (-18199)) ^ 768522900;
                                arrayList = arrayList2;
                                i7 = iM450212 ^ 368102473;
                            }
                        }
                        break;
                }
            }
            int iM450213 = (C19806.m45029("֫ܰ") + i5) * (-93);
            i7 = iM450213 ^ 344159859;
            i6 = ((iM450213 ^ i4) * 20843) ^ 231676560;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7747(C22710 c22710, IdentityHashMap identityHashMap) {
        ArrayDeque arrayDeque = null;
        C22710 c22711 = null;
        InterfaceC18745 interfaceC18745 = null;
        int i = 111522413;
        int i2 = RunnableC3388.f12514;
        int i3 = C1419.f5860;
        int iM11306 = (i2 - ThreadFactoryC3888.m11306("ᩴۙ")) * (-7);
        int i4 = ((iM11306 ^ i3) * 7621) ^ 192573823;
        int i5 = 1474282415;
        while (true) {
            i = ((((i ^ i3) * 3225) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2060072556:
                case -255899637:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    } else {
                        iM11306 = C19806.m45029("ܳۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22211) ^ 243372948;
                        i5 = -1610930600;
                    }
                    break;
                case -2024491959:
                case 1933222829:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۤ") + i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-15351)) ^ (-1796597720);
                        i5 = 1627953700;
                    } else {
                        iM11306 = (C19806.m45029("۠ܿ") + i2) * (-11);
                        i4 = ((iM11306 ^ i3) * 26045) ^ (-1901276089);
                        i5 = -180733789;
                    }
                    break;
                case -2005933192:
                case 152405690:
                    ViewGroupOnHierarchyChangeListenerC1916.m6228(identityHashMap, (C23747) interfaceC18745, Boolean.TRUE);
                    iM11306 = (i2 - C19806.m45029("ܽ᩶")) * (-7);
                    i4 = ((iM11306 ^ i3) * (-26877)) ^ (-517522624);
                    i5 = -374962983;
                    break;
                case -1887896899:
                case 810371650:
                    C2477.m7593();
                    C1419.m4973();
                    break;
                case -1831671180:
                case -745824220:
                    arrayDeque = new ArrayDeque();
                    if (C2704.m8255() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖ֡") + i3) * (-43);
                        i4 = ((iM11306 ^ i2) * (-209)) ^ 49170088;
                        i5 = -1564095197;
                    }
                    break;
                case -1740865117:
                case 944571078:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ֫")) * 33;
                        i4 = ((iM11306 ^ i2) * (-10547)) ^ 1097490293;
                        i5 = 401747017;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۛ") + i3) * (-21);
                        i4 = ((iM11306 ^ i2) * (-11275)) ^ (-618108947);
                        i5 = -50819263;
                    }
                    break;
                case -1636354877:
                case 48522951:
                    CallableC1627.m5507();
                    if (C3286.m9798() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۤ") + i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-15351)) ^ (-1796597720);
                        i5 = 1627953700;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    }
                    break;
                case -1330066606:
                case 1637287265:
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۨ") + i3) * (-85);
                        i4 = ((iM11306 ^ i2) * (-8377)) ^ 258950206;
                        i5 = 1389151471;
                    }
                    break;
                case -1186245020:
                case -998183843:
                    C1668.m5584(arrayDeque, c22711.f73966);
                    if (C0671.f2816 != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛ֫")) * 33;
                        i4 = ((iM11306 ^ i2) * (-10547)) ^ 1097490293;
                        i5 = 401747017;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ֡") ^ i3) * 11;
                        i4 = ((iM11306 ^ i2) * (-7471)) ^ 1770605496;
                        i5 = 897274273;
                    }
                    break;
                case -1086582006:
                case -62754008:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19199)) ^ 1649671530;
                        i5 = 1118202037;
                    } else {
                        iM11306 = C19806.m45029("ܺᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 3849) ^ (-1464295431);
                        i5 = -1504900864;
                    }
                    break;
                case -1059709931:
                case -399146034:
                    C1189.m4362(arrayDeque, c22710);
                    iM11306 = (i2 - C19806.m45029("ܽ᩶")) * (-7);
                    i4 = ((iM11306 ^ i3) * (-26877)) ^ (-517522624);
                    i5 = -374962983;
                    break;
                case -908856792:
                case -755414053:
                    break;
                case -593124366:
                case -280117851:
                    C2788.m8472();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    } else {
                        iM11306 = C19806.m45029("ۨ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31839)) ^ (-516902494);
                        i5 = -437411904;
                    }
                    break;
                case -314752534:
                case -103824475:
                    if (c22710 == null) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12923)) ^ 2017465450;
                        i5 = 123312225;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 28655) ^ (-554049551);
                        i5 = 215031905;
                    }
                    break;
                case 33239523:
                case 1781981556:
                    if (C1419.m4973()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۤ") + i2) * (-71);
                        i4 = ((iM11306 ^ i3) * (-15351)) ^ (-1796597720);
                        i5 = 1627953700;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * 31;
                        i4 = ((iM11306 ^ i2) * (-7807)) ^ 1740496672;
                        i5 = 1853730430;
                    }
                    break;
                case 93693027:
                case 936165050:
                    interfaceC18745 = c22711.f73969.f13401;
                    if (interfaceC18745 instanceof C23747) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۠᩷")) * (-115);
                        i4 = ((iM11306 ^ i3) * (-16645)) ^ 1337811716;
                        i5 = 216698546;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܽ᩶")) * (-7);
                        i4 = ((iM11306 ^ i3) * (-26877)) ^ (-517522624);
                        i5 = -374962983;
                    }
                    break;
                case 141514630:
                case 412238356:
                    C1189.m4362(arrayDeque, c22711.f73972);
                    iM11306 = (i2 - C19806.m45029("ܽ᩶")) * (-7);
                    i4 = ((iM11306 ^ i3) * (-26877)) ^ (-517522624);
                    i5 = -374962983;
                    break;
                case 188650724:
                case 1659055614:
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19199)) ^ 1649671530;
                        i5 = 1118202037;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡ֫")) * (-41);
                        i4 = ((iM11306 ^ i2) * 3851) ^ (-1398277503);
                        i5 = 1322598073;
                    }
                    break;
                case 451377227:
                case 1202109295:
                    if (C0629.m2912(arrayDeque)) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12923)) ^ 2017465450;
                        i5 = 123312225;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺ۬") ^ i2) * 25;
                        i4 = ((iM11306 ^ i3) * (-17097)) ^ 2085682664;
                        i5 = 1584151184;
                    }
                    break;
                case 1010033736:
                case 1107745441:
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("ۨ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31839)) ^ (-516902494);
                        i5 = -437411904;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۡܿ")) * (-111);
                        i4 = ((iM11306 ^ i3) * (-28579)) ^ 1528050181;
                        i5 = 521528623;
                    }
                    break;
                case 1306460499:
                case 1741426446:
                    C1460.m5050();
                    if (C1398.f5802 > 0) {
                        iM11306 = C19806.m45029("ᩴ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19199)) ^ 1649671530;
                        i5 = 1118202037;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5463) ^ 250308910;
                        i5 = -1449725141;
                    }
                    break;
                case 1346865014:
                case 2083894514:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C3722.m10894();
                    iM11306 = C19806.m45029("ۨ۠") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-31839)) ^ (-516902494);
                    i5 = -437411904;
                    break;
                default:
                    c22711 = (C22710) arrayDeque.pop();
                    if (C1025.m3862(c22711)) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22431)) ^ (-1363581730);
                        i5 = -1684688258;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܰ") + i3) * 127;
                        i4 = ((iM11306 ^ i2) * (-457)) ^ 2124233633;
                        i5 = 1045619402;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7713() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 294981508;
        int i6 = C2642.f10294;
        int i7 = C1875.f7103;
        int iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i6;
        int i8 = ((iM11306 ^ i7) * (-16369)) ^ 703455983;
        int i9 = 1778347750;
        while (true) {
            i5 = ((((i5 ^ i7) * (-16721)) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2089855395:
                case -1763994437:
                    c = 29;
                    if (AbstractC0464.m2313() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14201) ^ (-2099123741);
                        i9 = 439458229;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۢ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-7023)) ^ 1162551164;
                        i9 = -131289832;
                    }
                    break;
                case -2087816309:
                case 95017102:
                    RunnableC1606.m5473();
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-18843)) ^ 30468714;
                        i9 = 1138600404;
                    } else {
                        iM11306 = (C19806.m45029("ۘ۟") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM11306 ^ i6) * 5519) ^ (-1618227267);
                        i9 = 1527408389;
                    }
                    break;
                case -2065864924:
                case 1687923446:
                    i4 = 1150;
                    iM11306 = C19806.m45029("ۜܶ") ^ i6;
                    i8 = ((iM11306 ^ i7) * (-9963)) ^ 302286777;
                    i9 = -994028452;
                    break;
                case -2042613020:
                case -1460903802:
                    C3743.m10966();
                    C1189.m4368();
                    return;
                case -1926497350:
                case 381990923:
                    C0797.m3359();
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16981) ^ 1847259225;
                        i9 = -644354403;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-24217)) ^ 1921877492;
                        i9 = -2019609799;
                    }
                    break;
                case -1744522495:
                case -917232890:
                    if (C3722.f13525 > 0) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16981) ^ 1847259225;
                        i9 = -644354403;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-18843)) ^ 30468714;
                        i9 = 1138600404;
                    }
                    break;
                case -1542711731:
                case 319851478:
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-18843)) ^ 30468714;
                        i9 = 1138600404;
                    } else {
                        iM11306 = (C19806.m45029("۬۬") ^ i7) * 21;
                        i8 = ((iM11306 ^ i6) * 23025) ^ 1193969899;
                        i9 = 276613264;
                    }
                    break;
                case -1407761831:
                case -407573366:
                    s = sArr[c];
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16981) ^ 1847259225;
                        i9 = -644354403;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۛ") + i6) * 123;
                        i8 = ((iM11306 ^ i7) * (-26507)) ^ 1334623352;
                        i9 = 1102405610;
                    }
                    break;
                case -1372491277:
                case 1895147548:
                    i = s + 1;
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14201) ^ (-2099123741);
                        i9 = 439458229;
                    } else {
                        iM11306 = C19806.m45029("ۗ֫") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16755) ^ 1993823484;
                        i9 = -362780063;
                    }
                    break;
                case -645294252:
                case -614730308:
                    if (this.f9991) {
                        iM11306 = (i7 - C19806.m45029("ۨ᩻")) * (-29);
                        i8 = ((iM11306 ^ i6) * 32321) ^ (-800451552);
                        i9 = 1455178824;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-16639)) ^ 470969261;
                        i9 = -357425072;
                    }
                    break;
                case -392699568:
                case -181791564:
                    return;
                case -130894563:
                case 917904465:
                    if ((i3 + 1) - i2 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳۤ") + i6) * (-41);
                        i8 = ((iM11306 ^ i7) * (-20835)) ^ (-1427402878);
                        i9 = 1799906841;
                    } else {
                        iM11306 = C19806.m45029("ۘۜ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 4713) ^ (-141853452);
                        i9 = 592374370;
                    }
                    break;
                case 22126712:
                case 1222702653:
                    i2 = i * i;
                    s2 = 2;
                    if (C2124.m6673() <= 0) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i7;
                        i8 = ((iM11306 ^ i6) * 16981) ^ 1847259225;
                        i9 = -644354403;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۠") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-8521)) ^ 1579581027;
                        i9 = 193343441;
                    }
                    break;
                case 73561938:
                case 221266502:
                    short[] sArr2 = f9977;
                    if (C2704.f10408 && C1419.f5860 < 0) {
                        throw new IllegalStateException(C2477.m7604(sArr2, 30, 21, i4));
                    }
                    iM11306 = C19806.m45029("ܶ֫") ^ i7;
                    i8 = ((iM11306 ^ i6) * 16981) ^ 1847259225;
                    i9 = -644354403;
                    break;
                case 337538668:
                case 572234111:
                    i3 = s * s2;
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14201) ^ (-2099123741);
                        i9 = 439458229;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۧ") + i7) * 95;
                        i8 = ((iM11306 ^ i6) * (-2645)) ^ (-1728246337);
                        i9 = -1336149250;
                    }
                    break;
                case 849745925:
                case 1751031190:
                    C3660.m10791();
                    C19806.m45024();
                    iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i7;
                    i8 = ((iM11306 ^ i6) * (-18843)) ^ 30468714;
                    i9 = 1138600404;
                    break;
                case 935825681:
                case 1533616417:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ֡") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-18843)) ^ 30468714;
                        i9 = 1138600404;
                    } else {
                        iM11306 = (C19806.m45029("֨᩷") + i7) * 41;
                        i8 = ((iM11306 ^ i6) * 30745) ^ 366992016;
                        i9 = 1009249383;
                    }
                    break;
                case 1588696120:
                case 1986473865:
                    sArr = f9977;
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 14201) ^ (-2099123741);
                        i9 = 439458229;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܰ") + i6) * (-87);
                        i8 = ((iM11306 ^ i7) * (-12269)) ^ 159058577;
                        i9 = 1389242997;
                    }
                    break;
                default:
                    i4 = 49816;
                    iM11306 = C19806.m45029("ۜܶ") ^ i6;
                    i8 = ((iM11306 ^ i7) * (-9963)) ^ 302286777;
                    i9 = -994028452;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m7777(Throwable th) throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -906124094;
        int i5 = C1189.f5284;
        int i6 = C2871.f10837;
        int iM11306 = (ThreadFactoryC3888.m11306("᩹ܶ") ^ i6) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i7 = ((iM11306 ^ i5) * 2625) ^ 1161878896;
        int i8 = 805599257;
        while (true) {
            i4 = ((((i4 ^ i5) * 18533) >> 31) & i7) ^ (iM11306 ^ i8);
            switch (i4) {
                case -2120766889:
                case -1945357100:
                    if ((i2 * i2) - i < 0) {
                        iM11306 = C19806.m45029("᩶ۚ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-27389)) ^ 843218777;
                        i8 = 1497178661;
                    } else {
                        iM11306 = C19806.m45029("ۖ۟") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18895)) ^ (-12426131);
                        i8 = -1502799867;
                    }
                    break;
                case -2103502740:
                case 1295908134:
                    s = sArr[c];
                    s2 = 2140;
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("᩺֫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-21607)) ^ (-2088466766);
                        i8 = 1582696629;
                    } else {
                        iM11306 = C19806.m45029("᩹ۛ") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-25841)) ^ (-523146834);
                        i8 = 1106917152;
                    }
                    break;
                case -1751164224:
                case 975257400:
                    if (th instanceof IOException) {
                        iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * 12987) ^ 1217891546;
                        i8 = 918527757;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܿ") + i6) * 97;
                        i7 = ((iM11306 ^ i5) * 6315) ^ 1471872855;
                        i8 = -1082976303;
                    }
                    break;
                case -1748822394:
                case 1366327677:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("֨᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-3701)) ^ (-1516563103);
                        i8 = 726851507;
                    } else {
                        iM11306 = C19806.m45029("ۗܶ") ^ i5;
                        i7 = ((iM11306 ^ i6) * 3909) ^ (-588820039);
                        i8 = -1253764950;
                    }
                    break;
                case -1717435151:
                case 896024033:
                    C0671.m3008();
                    if (C2477.f9839 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩶") + i5) * (-107);
                        i7 = ((iM11306 ^ i6) * (-22815)) ^ (-1160231136);
                        i8 = -1990897545;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                        i8 = 1896867653;
                    }
                    break;
                case -1689123675:
                case -1424126181:
                    C2871.m8646();
                    C0797.m3359();
                    iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                    i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                    i8 = 1896867653;
                    break;
                case -1597363624:
                case -114976228:
                    sArr = f9977;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                        i8 = 1896867653;
                    } else {
                        iM11306 = C19806.m45029("᩻ܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-8269)) ^ (-121474610);
                        i8 = -915764775;
                    }
                    break;
                case -1366857418:
                case -1238443362:
                    short[] sArr2 = f9977;
                    if (C10634.f36300 < 0) {
                        if (C1875.f7103 < 0) {
                            throw new IOException(C1460.m5047(sArr2, 961, 40, i3), th);
                        }
                        iM11306 = C19806.m45029("᩺֫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-21607)) ^ (-2088466766);
                        i8 = 1582696629;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                        i8 = 1896867653;
                    }
                    break;
                case -1363182428:
                case -701794051:
                    i3 = 7370;
                    iM11306 = (ThreadFactoryC3888.m11306("ܽ᩹") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i7 = ((iM11306 ^ i5) * 28175) ^ 1952789519;
                    i8 = -213834392;
                    break;
                case -1159482593:
                case -338818163:
                    i3 = 44798;
                    iM11306 = (ThreadFactoryC3888.m11306("ܽ᩹") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i7 = ((iM11306 ^ i5) * 28175) ^ 1952789519;
                    i8 = -213834392;
                    break;
                case -989630044:
                case 840294423:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                        i8 = 1896867653;
                    } else {
                        iM11306 = C19806.m45029("֨ۖ") ^ i6;
                        i7 = ((iM11306 ^ i5) * 23233) ^ (-338812425);
                        i8 = -1796493151;
                    }
                    break;
                case -697645579:
                case 1209118591:
                    throw ((Error) th);
                case -499943606:
                case -234322483:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM11306 = C19806.m45029("֨᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-3701)) ^ (-1516563103);
                        i8 = 726851507;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩶") + i5) * (-107);
                        i7 = ((iM11306 ^ i6) * (-22815)) ^ (-1160231136);
                        i8 = -1990897545;
                    }
                    break;
                case -395806035:
                case 1639766863:
                    if (th instanceof Error) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܳ") + i6) * 31;
                        i7 = ((iM11306 ^ i5) * 24405) ^ 1093975013;
                        i8 = 2101541495;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳᩴ") + i5) * 57;
                        i7 = ((iM11306 ^ i6) * 19327) ^ 1395643930;
                        i8 = 1366319348;
                    }
                    break;
                case -324722616:
                case 2078759190:
                    RunnableC3388.m10064();
                    if (CallableC1627.f6528) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܺ") + i5) * (-127);
                        i7 = ((iM11306 ^ i6) * (-15949)) ^ (-1928022052);
                        i8 = -1186488584;
                    } else {
                        iM11306 = C19806.m45029("֨᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-3701)) ^ (-1516563103);
                        i8 = 726851507;
                    }
                    break;
                case -64962968:
                case 1845440614:
                    i2 = s + s3;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩶") + i5) * (-107);
                        i7 = ((iM11306 ^ i6) * (-22815)) ^ (-1160231136);
                        i8 = -1990897545;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ֡") ^ i6) * (-83);
                        i7 = ((iM11306 ^ i5) * (-12129)) ^ (-431233607);
                        i8 = 2054727904;
                    }
                    break;
                case 21653420:
                case 733388164:
                    C0526.m2437();
                    return;
                case 250431962:
                case 1356359257:
                    throw ((RuntimeException) th);
                case 350558860:
                case 834647699:
                    i = s * s2;
                    s3 = 535;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (C19806.m45029("֡֨") + i5) * (-9);
                        i7 = ((iM11306 ^ i6) * (-16771)) ^ (-1150104870);
                        i8 = 1619144334;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18293)) ^ (-1919488257);
                        i8 = 1896867653;
                    }
                    break;
                case 534351655:
                case 639308803:
                    c = 960;
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("֨᩶") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-3701)) ^ (-1516563103);
                        i8 = 726851507;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۖ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-24299)) ^ (-1954429704);
                        i8 = 812634423;
                    }
                    break;
                case 1066728260:
                case 2073667441:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("᩺֫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-21607)) ^ (-2088466766);
                        i8 = 1582696629;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ۫") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-18797)) ^ (-687720893);
                        i8 = -410683806;
                    }
                    break;
                case 1531055645:
                case 1916361601:
                    if (th instanceof RuntimeException) {
                        iM11306 = C19806.m45029("᩷۠") ^ i5;
                        i7 = ((iM11306 ^ i6) * 9079) ^ 194448879;
                        i8 = 547219233;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۨ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-2467)) ^ 310100555;
                        i8 = -749988669;
                    }
                    break;
                default:
                    throw ((IOException) th);
            }
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m7764() throws IOException {
        if (this.f9990 != null) {
            m7716();
            return;
        }
        long jNanoTime = System.nanoTime();
        long j = this.f9979;
        if (j != 0 && jNanoTime - j < 0) {
            m7716();
            return;
        }
        synchronized (this) {
            if (this.f9990 != null) {
                m7716();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = this.f9979;
            if (j2 == 0 || jNanoTime2 - j2 >= 0) {
                m7802();
            } else {
                m7716();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18745[] m7762(C2516 c2516, C13807 c13807, InterfaceC5614 interfaceC5614) throws Throwable {
        C13807 c13808;
        boolean z;
        boolean z2;
        C9636 c9636M7731;
        InterfaceC18745[] interfaceC18745Arr;
        boolean z3;
        short s = f9977[851];
        int i = s + 14053;
        int i2 = (s * s) + 197486809;
        int i3 = (i * i) - (i2 + i2) <= 0 ? 55451 : 41300;
        c2516.m7766();
        if (c2516.f9993 != c13807 || c13807.f45567 != c2516.f9986 || c2516.f9987 != c13807.f45561) {
            throw new IllegalStateException(C1977.m6363(f9977, 852, 17, i3));
        }
        c2516.m7802();
        C13807.m33593(c13807);
        if (c13807.f45568) {
            if (interfaceC5614 == null || c13807.f45576 == 0) {
                z2 = false;
            } else {
                synchronized (f9975) {
                    C1873 c1873 = f9973;
                    z3 = c1873 != null && c1873.m6081();
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (c13807.f45562 || c13807.f45578 || z2) {
                C20924 c20924M37964 = c2516.f9992.m37964();
                try {
                    c9636M7731 = m7731(m7774(c13807.f45566, c13807.f45576, c2516.f9992), c13807.f45576, c2516.f9992, interfaceC5614);
                    try {
                        C22710 c22710M20850 = C7893.m20850(c9636M7731.f32432, c13807.f45565);
                        c2516.m7802();
                        C13807.m33593(c13807);
                        C17770 c17770M20874 = C7893.m20874(c22710M20850);
                        long jM20827 = C7893.m20827(c22710M20850);
                        long jM7772 = m7772(c22710M20850);
                        long jM20828 = C7893.m20828(c22710M20850);
                        c9636M7731.m24534(c13807);
                        c13807.f45566 = c22710M20850;
                        c13807.f45575 = c17770M20874.m41336();
                        c13807.f45579 = c17770M20874.m41337();
                        c13807.f45565 = jM20827;
                        c13807.f45570 = jM7772;
                        c13807.f45576 = jM20828;
                        interfaceC18745Arr = null;
                    } catch (IOException e) {
                        e = e;
                        if (c9636M7731 != null) {
                            c9636M7731.m24533(e);
                        }
                        if (!c13807.f45569) {
                            c2516.f9992.m37966(c20924M37964);
                        }
                        throw e;
                    } catch (Error e2) {
                        e = e2;
                        if (c9636M7731 != null) {
                            c9636M7731.m24533(e);
                        }
                        if (!c13807.f45569) {
                            c2516.f9992.m37966(c20924M37964);
                        }
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        if (c9636M7731 != null) {
                            c9636M7731.m24533(e);
                        }
                        if (!c13807.f45569) {
                            c2516.f9992.m37966(c20924M37964);
                        }
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e4) {
                    e = e4;
                    c9636M7731 = null;
                }
            } else {
                interfaceC18745Arr = null;
            }
            C13807.m33555(c13807);
            if (c13807.f45563 != null) {
                C16691 c16691 = c13807.f45563;
                C22710 c22710 = c13807.f45566;
                C16691.m39163(c16691, c22710 == null ? 0 : c22710.f73964);
            }
            if (interfaceC5614 != null && C3577.m10564(interfaceC5614)) {
                c13807.m33564();
                return interfaceC18745Arr;
            }
            ArrayDeque arrayDeque = c2516.f9982;
            boolean z4 = !C0629.m2912(arrayDeque);
            Iterator it = arrayDeque.iterator();
            while (RunnableC1564.m5348(it)) {
                c2516.f9985 -= ((C3284) C0278.m1776(it)).f12180;
            }
            arrayDeque.clear();
            boolean zM7755 = c2516.m7755(c2516.f9988, c2516.f9987.m9778(0L)) | z4;
            C13807.m33592(c13807);
            C22710 c22711 = c13807.f45566;
            C5838 c5838 = c13807.f45571;
            long j = c2516.f9983 + 1;
            c2516.f9983 = j;
            c2516.f9987 = new C3284(c22711, c5838, j, c13807.f45575, c13807.f45579, c13807.f45565, c13807.f45570, c13807.f45576, c13807.f45563);
            c2516.f9992.m37967();
            z = zM7755;
            c13808 = interfaceC18745Arr;
        } else {
            c13808 = 0;
            c2516.f9992.m37966(c13807.f45577);
            C13807.m33584(c13807);
            z = false;
        }
        c2516.f9993 = c13808;
        c13807.f45569 = true;
        return z ? c2516.m7784() : f9976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7742(C2516 c2516, C13807 c13807) {
        synchronized (c2516) {
            if (!c13807.f45569 && c2516.f9993 == c13807) {
                c13807.m33564();
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m7766() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 69105539;
        int i5 = RunnableC3388.f12514;
        int i6 = C1875.f7103;
        int iM45029 = C19806.m45029("ܳ᩵") ^ i5;
        int i7 = ((iM45029 ^ i6) * (-17047)) ^ 1050933785;
        int i8 = 821889916;
        while (true) {
            i4 = ((((i4 ^ i6) * 4809) >> 31) & i7) ^ (iM45029 ^ i8);
            switch (i4) {
                case -1936045937:
                case 280079482:
                    m7713();
                    if (this.f9994) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩹") ^ i6;
                        i7 = ((iM45029 ^ i5) * 27801) ^ 1418852231;
                        i8 = -1382192246;
                    } else {
                        iM45029 = C19806.m45029("֨ᩴ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-28443)) ^ (-139035214);
                        i8 = -488042521;
                    }
                    break;
                case -1913866801:
                case -1466345546:
                    c = 869;
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i5;
                        i7 = ((iM45029 ^ i6) * 9631) ^ 261483006;
                        i8 = 1464500803;
                    } else {
                        iM45029 = (C19806.m45029("ܿܽ") + i5) * 75;
                        i7 = ((iM45029 ^ i6) * 8933) ^ (-256008991);
                        i8 = 1078912405;
                    }
                    break;
                case -1819745569:
                case 869604048:
                    i3 = 58750;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽܳ") ^ i5) * 93;
                    i7 = ((iM45029 ^ i6) * (-9653)) ^ 2034015981;
                    i8 = 1991876767;
                    break;
                case -1515554232:
                case 1671034890:
                    i2 = i + 1;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i5 - C19806.m45029("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i6) * 32007) ^ 957139831;
                        i8 = 1420959271;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۢ") ^ i5) * 57;
                        i7 = ((iM45029 ^ i6) * 3327) ^ (-1154219175);
                        i8 = 1127153240;
                    }
                    break;
                case -1507043710:
                case -1020756194:
                    C1066.m4023();
                    if (C0671.f2816 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i5;
                        i7 = ((iM45029 ^ i6) * 9631) ^ 261483006;
                        i8 = 1464500803;
                    } else {
                        iM45029 = (C19806.m45029("۟ۤ") + i6) * (-53);
                        i7 = ((iM45029 ^ i5) * 8393) ^ 1248373580;
                        i8 = -1184321002;
                    }
                    break;
                case -1497648568:
                case -1359150239:
                    sArr = f9977;
                    if (C0526.m2437() >= 0) {
                        iM45029 = (C19806.m45029("۟ۤ") + i6) * (-53);
                        i7 = ((iM45029 ^ i5) * 8393) ^ 1248373580;
                        i8 = -1184321002;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۫") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i6) * (-16217)) ^ 1038407990;
                        i8 = 1907632117;
                    }
                    break;
                case -1427967656:
                case 658260967:
                    C1066.m4023();
                    if (!CallableC1627.f6528) {
                        iM45029 = (i5 - C19806.m45029("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i6) * 32007) ^ 957139831;
                        i8 = 1420959271;
                    } else {
                        iM45029 = (C19806.m45029("۟ۤ") + i6) * (-53);
                        i7 = ((iM45029 ^ i5) * 8393) ^ 1248373580;
                        i8 = -1184321002;
                    }
                    break;
                case -1390870627:
                case 960490392:
                    i = s * 2;
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("ۖۙ") + i6) * 45;
                        i7 = ((iM45029 ^ i5) * (-23859)) ^ (-1278219361);
                        i8 = -236273870;
                    } else {
                        iM45029 = C19806.m45029("۠ۛ") ^ i6;
                        i7 = ((iM45029 ^ i5) * (-26757)) ^ (-606747727);
                        i8 = -2002243492;
                    }
                    break;
                case -1348094558:
                case 165205382:
                    return;
                case -1245810275:
                case -138292016:
                    C3660.m10791();
                    iM45029 = (i5 - C19806.m45029("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i7 = ((iM45029 ^ i6) * 32007) ^ 957139831;
                    i8 = 1420959271;
                    break;
                case -1203043989:
                case -88372121:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return;
                case -1146920628:
                case 1830884037:
                    s2 = 1;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("۟ۤ") + i6) * (-53);
                        i7 = ((iM45029 ^ i5) * 8393) ^ 1248373580;
                        i8 = -1184321002;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i6;
                        i7 = ((iM45029 ^ i5) * 23353) ^ 1967186420;
                        i8 = -1011752493;
                    }
                    break;
                case -901143451:
                case -611859183:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i5 - C19806.m45029("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i6) * 32007) ^ 957139831;
                        i8 = 1420959271;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۧ᩶")) * 77;
                        i7 = ((iM45029 ^ i5) * 13457) ^ (-804263856);
                        i8 = 367250960;
                    }
                    break;
                case -207203114:
                case 1941107010:
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۖۙ") + i6) * 45;
                        i7 = ((iM45029 ^ i5) * (-23859)) ^ (-1278219361);
                        i8 = -236273870;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩻") ^ i6) * (-125);
                        i7 = ((iM45029 ^ i5) * (-30823)) ^ (-2078609445);
                        i8 = -202399447;
                    }
                    break;
                case 180626794:
                case 1701664209:
                    s = sArr[c];
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("ۧ᩷") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-5789)) ^ 1687027545;
                        i8 = 887287959;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩶ۖ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((iM45029 ^ i6) * 1363) ^ (-85416751);
                        i8 = 739955052;
                    }
                    break;
                case 549904910:
                case 831377420:
                    i3 = 23100;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽܳ") ^ i5) * 93;
                    i7 = ((iM45029 ^ i6) * (-9653)) ^ 2034015981;
                    i8 = 1991876767;
                    break;
                case 679722237:
                case 1180478016:
                    int i9 = s + s2;
                    if ((i9 * i9) - i2 < 0) {
                        iM45029 = C19806.m45029("ۖ֡") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-28901)) ^ 12531756;
                        i8 = 227068651;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ܳ۬")) * (-81);
                        i7 = ((iM45029 ^ i5) * (-1971)) ^ 1823852341;
                        i8 = -1257802206;
                    }
                    break;
                case 1185887941:
                case 2113952306:
                    short[] sArr2 = f9977;
                    if (C1377.m4833() == 0) {
                        if (C1148.f5161 > 0) {
                            throw new IllegalStateException(RunnableC1895.m6164(sArr2, 870, 33, i3));
                        }
                        iM45029 = (C19806.m45029("ۖۙ") + i6) * 45;
                        i7 = ((iM45029 ^ i5) * (-23859)) ^ (-1278219361);
                        i8 = -236273870;
                    } else {
                        iM45029 = (C19806.m45029("۟ۤ") + i6) * (-53);
                        i7 = ((iM45029 ^ i5) * 8393) ^ 1248373580;
                        i8 = -1184321002;
                    }
                    break;
                default:
                    C0278.m1789();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۧ᩷") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-5789)) ^ 1687027545;
                        i8 = 887287959;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۬۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((iM45029 ^ i6) * 32007) ^ 957139831;
                        i8 = 1420959271;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m7786() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -961739234;
        int i6 = C3535.f13026;
        int i7 = C1066.f4915;
        int iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i7;
        int i8 = ((iM11306 ^ i6) * 14793) ^ 1027707854;
        int i9 = -2080921892;
        while (true) {
            i5 = ((((i5 ^ i6) * 7915) >> 31) & i8) ^ (iM11306 ^ i9);
            switch (i5) {
                case -2052295322:
                case -1874072300:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ۤ᩺") ^ i7) * (-119);
                        i8 = ((iM11306 ^ i6) * 9765) ^ (-1069674246);
                        i9 = 1816935184;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i7;
                        i8 = ((iM11306 ^ i6) * 27413) ^ 1108411649;
                        i9 = -673349879;
                    }
                    break;
                case -1698468796:
                case -800400321:
                    return;
                case -1689456168:
                case 1930826797:
                    i4 = 4257;
                    iM11306 = C19806.m45029("ۢۡ") ^ i7;
                    i8 = ((iM11306 ^ i6) * 6885) ^ 1035758957;
                    i9 = 1180823023;
                    break;
                case -1516649852:
                case -154735692:
                    i4 = 62888;
                    iM11306 = C19806.m45029("ۢۡ") ^ i7;
                    i8 = ((iM11306 ^ i6) * 6885) ^ 1035758957;
                    i9 = 1180823023;
                    break;
                case -1477624787:
                case -431270905:
                    sArr = f9977;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") ^ i6) * (-17);
                        i8 = ((iM11306 ^ i7) * (-19235)) ^ 1794749736;
                        i9 = 2041102132;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۧܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM11306 ^ i6) * (-16207)) ^ 863706567;
                        i9 = -229352695;
                    }
                    break;
                case -1302221593:
                case 1369030691:
                    c = 1001;
                    if (C3577.m10565()) {
                        iM11306 = C19806.m45029("۬ۖ") ^ i6;
                        i8 = ((iM11306 ^ i7) * (-28461)) ^ 382695133;
                        i9 = 657351049;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22991) ^ 1795539208;
                        i9 = 1911841127;
                    }
                    break;
                case -1089434859:
                case 601692350:
                    if (this.f9990 == null) {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-25043)) ^ (-463815886);
                        i9 = -1242165459;
                    } else {
                        iM11306 = (C19806.m45029("᩵ᩴ") ^ i6) * (-5);
                        i8 = ((iM11306 ^ i7) * (-9365)) ^ 474676174;
                        i9 = -1743926054;
                    }
                    break;
                case -1076896711:
                case -160333677:
                    int i10 = s + s2;
                    if ((i10 * i10) - i3 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺᩴ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22961) ^ (-100454229);
                        i9 = -1071312496;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i6;
                        i8 = ((iM11306 ^ i7) * 31515) ^ 1089324023;
                        i9 = -995329904;
                    }
                    break;
                case -911957699:
                case 719709320:
                    s2 = 18096;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") + i6) * (-67);
                        i8 = ((iM11306 ^ i7) * (-25913)) ^ (-848955070);
                        i9 = -217532220;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i6) * (-9);
                        i8 = ((iM11306 ^ i7) * (-16007)) ^ 887098335;
                        i9 = 517445514;
                    }
                    break;
                case -839624079:
                case -646262232:
                    if (!C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22991) ^ 1795539208;
                        i9 = 1911841127;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") ^ i6) * (-17);
                        i8 = ((iM11306 ^ i7) * (-19235)) ^ 1794749736;
                        i9 = 2041102132;
                    }
                    break;
                case -665984846:
                case 1130009554:
                    C0526.m2437();
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22991) ^ 1795539208;
                        i9 = 1911841127;
                    } else {
                        iM11306 = C19806.m45029("۬۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 2601) ^ (-1730991339);
                        i9 = 173446363;
                    }
                    break;
                case -320018336:
                case 2026799356:
                    s = sArr[c];
                    if (CallableC1627.f6528) {
                        iM11306 = (i7 - C19806.m45029("᩻۠")) * (-5);
                        i8 = ((iM11306 ^ i6) * 28529) ^ (-1744977055);
                        i9 = 1088984937;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩺") ^ i7) * (-119);
                        i8 = ((iM11306 ^ i6) * 9765) ^ (-1069674246);
                        i9 = 1816935184;
                    }
                    break;
                case -240778879:
                case 1267079471:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i7;
                        i8 = ((iM11306 ^ i6) * 22991) ^ 1795539208;
                        i9 = 1911841127;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ۟") ^ i6) * (-115);
                        i8 = ((iM11306 ^ i7) * (-26155)) ^ 131943185;
                        i9 = 2109118509;
                    }
                    break;
                case 44762954:
                case 403027273:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۙ") ^ i7;
                        i8 = ((iM11306 ^ i6) * (-27119)) ^ (-1854427274);
                        i9 = -1407692111;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") ^ i6) * (-17);
                        i8 = ((iM11306 ^ i7) * (-19235)) ^ 1794749736;
                        i9 = 2041102132;
                    }
                    break;
                case 193572446:
                case 340300585:
                    C2788.m8472();
                    C0797.m3359();
                    iM11306 = C19806.m45029("۬۟") ^ i6;
                    i8 = ((iM11306 ^ i7) * 2601) ^ (-1730991339);
                    i9 = 173446363;
                    break;
                case 251578430:
                case 454653881:
                    C1398.m4895();
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۤ᩺") ^ i7) * (-119);
                        i8 = ((iM11306 ^ i6) * 9765) ^ (-1069674246);
                        i9 = 1816935184;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩻") ^ i6) * (-17);
                        i8 = ((iM11306 ^ i7) * (-19235)) ^ 1794749736;
                        i9 = 2041102132;
                    }
                    break;
                case 461527383:
                case 1133235418:
                    i = s * s;
                    i2 = 327465216;
                    if (C10634.m26820()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") + i6) * (-67);
                        i8 = ((iM11306 ^ i7) * (-25913)) ^ (-848955070);
                        i9 = -217532220;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܶ") + i6) * 51;
                        i8 = ((iM11306 ^ i7) * 29159) ^ 275955702;
                        i9 = 39150052;
                    }
                    break;
                case 902382320:
                case 1438021047:
                    C2332.m7079();
                    C2477.m7593();
                    return;
                default:
                    short[] sArr2 = f9977;
                    if (C2788.f10625 < 0) {
                        if (C1148.f5161 > 0) {
                            throw new IllegalStateException(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, b.c, 24, i4));
                        }
                        iM11306 = C19806.m45029("۬۟") ^ i6;
                        i8 = ((iM11306 ^ i7) * 2601) ^ (-1730991339);
                        i9 = 173446363;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩺") ^ i7) * (-119);
                        i8 = ((iM11306 ^ i6) * 9765) ^ (-1069674246);
                        i9 = 1816935184;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x01ee A[PHI: r9
      0x01ee: PHI (r9v3 java.lang.Object[]) = (r9v2 java.lang.Object[]), (r9v1 java.lang.Object[]) binds: [B:56:0x01ec, B:12:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0352 A[PHI: r10 r11 r12
      0x0352: PHI (r10v4 l.ᩴۨ᩹[]) = (r10v1 l.ᩴۨ᩹[]), (r10v3 l.ᩴۨ᩹[]), (r10v1 l.ᩴۨ᩹[]) binds: [B:149:0x0352, B:52:0x01c8, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:149:0x0352, B:52:0x01c8, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r12v3 l.ᩴۨ᩹[]) = (r12v1 l.ᩴۨ᩹[]), (r12v2 l.ᩴۨ᩹[]), (r12v1 l.ᩴۨ᩹[]) binds: [B:149:0x0352, B:52:0x01c8, B:6:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (l.C0797.m3359() == false) goto L16;
     */
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.InterfaceC18745[] m7784() {
        /*
            Method dump skipped, instruction units count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2516.m7784():l.ᩴۨ᩹[]");
    }
}
