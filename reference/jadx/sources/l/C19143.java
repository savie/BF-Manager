package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.ᩳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C19143 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f61935;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f61936;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static C4227 f61937;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC22808[] f61938;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61939 = 0;

    /* JADX INFO: renamed from: ᩳ᩷ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f61940 = {3417, -7933, -7905, -7931, -7934, -7917, -7915, -7874, -7915, -7913, -7919, -7932, -7911, -7930, -7915, -7856, -7933, -7905, -7931, -7934, -7917, -7915, -7856, -7908, -7915, -7906, -7913, -7932, -7912, 5635, 12774, 12679, 12756, 12742, 12753, 12738, 12679, 12750, 12756, 12679, 12742, 12747, 12757, 12738, 12742, 12739, 12766, 12679, 12742, 12740, 12755, 12750, 12753, 12738, 6883, -30375, -30373, -30375, -30382, -30369, -30338, -30381, -30392, -30369, -30375, -30386, -30379, -30392, -30397, 1414, -9627, -9625, -9627, -9618, -9629, -9662, -9617, -9612, -9629, -9627, -9614, -9623, -9612, -9601, 8589, 30530, 30565, 30589, 30570, 30567, 30562, 30575, 30507, 30575, 30562, 30585, 30591, 30578, 30507, 30568, 30563, 30590, 30565, 30560, 30507, 30568, 30564, 30590, 30565, 30591, 30543, 30562, 30585, 30591, 30578, 30507, 30584, 30591, 30585, 30590, 30568, 30591, 30590, 30585, 30574, 30507, 30574, 30579, 30568, 30574, 30574, 30575, 30584, 30507, 30566, 30574, 30566, 30564, 30585, 30578, 30507, 30567, 30562, 30566, 30562, 30591, 30543, 30562, 30585, 30591, 30578, 30507, 30568, 30563, 30590, 30565, 30560, 30584, 30507, 30575, 30564, 30507, 30565, 30564, 30591, 30507, 30566, 30570, 30591, 30568, 30563, 30507, 30575, 30564, 30568, 30590, 30566, 30574, 30565, 30591, 30507, 30567, 30574, 30565, 30572, 30591, 30563, 30530, 30565, 30589, 30570, 30567, 30562, 30575, 30507, 30575, 30562, 30585, 30591, 30578, 30507, 30568, 30563, 30590, 30565, 30560, 30538, 30575, 30561, 30570, 30568, 30574, 30565, 30591, 30507, 30575, 30562, 30585, 30591, 30578, 30507, 30585, 30590, 30565, 30584, 30507, 30570, 30585, 30574, 30507, 30565, 30564, 30591, 30507, 30568, 30570, 30565, 30564, 30565, 30562, 30568, 30570, 30567, 30558, 30565, 30560, 30565, 30564, 30588, 30565, 30507, 30575, 30562, 30585, 30591, 30578, 30507, 30568, 30563, 30590, 30565, 30560, 30507, 30591, 30570, 30572, 30507, 30530, 30565, 30589, 30570, 30567, 30562, 30575, 30507, 30575, 30562, 30585, 30591, 30578, 30507, 30569, 30562, 30591, 30566, 30570, 30587, 30507, 30567, 30574, 30565, 30572, 30591, 30563, 3656, -135, -174, -176, -170, -189, -162, -191, -174, -233, -171, -170, -188, -174, -233, -188, -168, -190, -187, -172, -174, -233, -165, -174, -167, -176, -189, -161, -135, -174, -176, -170, -189, -162, -191, -174, -233, -173, -168, -172, -190, -166, -174, -167, -189, -233, -165, -174, -167, -176, -189, -161, -130, -167, -191, -170, -165, -162, -173, -233, -161, -174, -177, -233, -172, -161, -174, -172, -164, -185, -168, -162, -167, -189, -130, -167, -191, -170, -165, -162, -173, -233, -172, -161, -170, -167, -176, -174, -173, -233, -175, -165, -170, -176, -158, -167, -172, -161, -170, -167, -176, -174, -173, -233, -172, -161, -174, -172, -164, -185, -168, -162, -167, -189, -233, -162, -188, -233, -167, -168, -189, -233, -170, -233, -172, -165, -174, -170, -167, -233, -139, -138, -156, -142, -233, -187, -168, -168, -189, -155, -174, -188, -189, -168, -187, -174, -173, -233, -173, -168, -172, -190, -166, -174, -167, -189, -233, -166, -174, -189, -170, -173, -170, -189, -170, -233, -174, -177, -172, -174, -174, -173, -188, -233, -166, -174, -166, -168, -187, -178, -233, -165, -162, -166, -162, -189, 1433, -19244, -19213, -19221, -19204, -19215, -19212, -19207, -19267, -19208, -19227, -19223, -19208, -19213, -19223, -19267, -19215, -19208, -19213, -19206, -19223, -19211, 3030, -6959, -6923, -6929, -6929, -6923, -6926, -6917, -6980, -6913, -6924, -6919, -6913, -6921, -6932, -6925, -6923, -6926, -6936, -6980, -6920, -6919, -6928, -6936, -6915, -6980, -6923, -6920, -6919, -6926, -6936, -6923, -6936, -6939, -6959, -6923, -6929, -6929, -6923, -6926, -6917, -6980, -6913, -6924, -6919, -6913, -6921, -6932, -6925, -6923, -6926, -6936, -6980, -6930, -6919, -6913, -6923, -6932, -6919, -6980, -6923, -6920, -6919, -6926, -6936, -6923, -6936, -6939, 2323, -26862, -26840, -26830, -26819, -26824, -26830, -26767, -26845, -26828, -26847, -26819, -26832, -26830, -26828, -26820, -26828, -26817, -26843, -26767, -26845, -26828, -26830, -26824, -26847, -26828, -26767, -26827, -26828, -26847, -26828, -26817, -26827, -26828, -26817, -26830, -26840, -26856, -26817, -26841, -26832, -26819, -26824, -26827, -26767, -26845, -26828, -26847, -26819, -26832, -26830, -26828, -26820, -26828, -26817, -26843, -26767, -26845, -26828, -26830, -26824, -26847, -26828, -26767, -26843, -26845, -26832, -26841, -26828, -26845, -26846, -26832, -26819, -26875, -26818, -26818, -26767, -26820, -26832, -26817, -26840, -26767, -26845, -26828, -26847, -26819, -26832, -26830, -26828, -26820, -26828, -26817, -26843, -26767, -26845, -26828, -26830, -26824, -26847, -26828, -26846, 4045, 13557, 13518, 13518, 13441, 13516, 13504, 13519, 13528, 13441, 13506, 13513, 13508, 13506, 13514, 13521, 13518, 13512, 13519, 13525, 13441, 13509, 13508, 13517, 13525, 13504, 13441, 13508, 13519, 13525, 13523, 13512, 13508, 13522, 897, 32211, 32244, 32236, 32251, 32246, 32243, 32254, 32186, 32234, 32251, 32238, 32238, 32255, 32232, 32244, 32186, 32238, 32251, 32248, 32246, 32255, 32186, 32233, 32243, 32224, 32255, 32211, 32244, 32236, 32251, 32246, 32243, 32254, 32186, 32234, 32251, 32238, 32238, 32255, 32232, 32244, 32186, 32234, 32251, 32227, 32246, 32245, 32251, 32254, 32186, 32246, 32255, 32244, 32253, 32238, 32242, 32202, 32251, 32238, 32238, 32255, 32232, 32244, 32186, 32232, 32255, 32234, 32246, 32251, 32249, 32255, 32247, 32255, 32244, 32238, 32186, 32247, 32239, 32233, 32238, 32186, 32244, 32245, 32238, 32186, 32248, 32255, 32186, 32255, 32247, 32234, 32238, 32227, 9054, 2592, 2567, 2578, 2591, 2582, 2643, 2567, 2561, 2578, 2589, 2560, 2578, 2576, 2567, 2586, 2588, 2589, 1100, 16396, 16417, 16444, 16384, 16427, 16423, 16433, 16425, 16417, 16426, 16432, 16484, 16429, 16439, 16484, 16423, 16424, 16427, 16439, 16417, 16416, 7072, -16180, -16211, -16135, -16129, -16148, -16157, -16130, -16148, -16146, -16135, -16156, -16158, -16157, -16211, -16156, -16130, -16211, -16148, -16159, -16129, -16152, -16148, -16151, -16140, -16211, -16148, -16146, -16135, -16156, -16133, -16152, 5140, -24075, -24104, -24123, -24071, -24110, -24098, -24120, -24112, -24104, -24109, -24119, -24163, -24114, -24110, -24120, -24113, -24098, -24104, -24163, -24108, -24114, -24163, -24108, -24109, -24117, -24100, -24111, -24108, -24103, -24100, -24119, -24104, -24103, 607, -10743, -10716, -10695, -10747, -10706, -10718, -10700, -10708, -10716, -10705, -10699, -10655, -10712, -10702, -10655, -10718, -10707, -10706, -10702, -10716, -10715, -10743, -10716, -10695, -10747, -10706, -10718, -10700, -10708, -10716, -10705, -10699, -10655, -10702, -10706, -10700, -10701, -10718, -10716, -10655, -10712, -10702, -10655, -10712, -10705, -10697, -10720, -10707, -10712, -10715, -10720, -10699, -10716, -10715, 8143, 12880, 12919, 12911, 12920, 12917, 12912, 12925, 12857, 12913, 12924, 12897, 12857, 12922, 12913, 12924, 12922, 12914, 12905, 12918, 12912, 12919, 12909, 12835, 12857, 8586, -22044, -22049, -22064, -22061, -22051, -22060, -22127, -22075, -22050, -22127, -22062, -22051, -22050, -22078, 
    -22060, -22127, -22055, -22060, -22071, -22127, -22062, -22055, -22060, -22062, -22054, -22079, -22050, -22056, -22049, -22075, -22127, -22077, -22060, -22078, -22050, -22076, -22077, -22062, -22060, -22078, 5999, 4380, 4373, 4373, 4352, 4374, 4359, 4430, 4375, 4370, 4359, 4370, 4368, 4379, 4370, 4381, 4372, 4374, 4375, 4447, 4435, 4382, 4370, 4363, 4378, 4382, 4358, 4382, 4415, 4374, 4381, 4372, 4359, 4379, 4430, 9990, 16946, 16943, 16928, 16945, 16946, 16937, 16942, 16949, 16914, 16943, 16928, 16945, 16946, 16937, 16942, 16949, 16993, 16931, 16932, 16941, 16942, 16943, 16934, 16946, 16993, 16949, 16942, 16993, 16928, 16943, 16942, 16949, 16937, 16932, 16947, 16993, 16933, 16942, 16930, 16948, 16940, 16932, 16943, 16949, 16914, 16943, 16928, 16945, 16946, 16937, 16942, 16949, 16993, 16936, 16946, 16993, 16946, 16949, 16928, 16941, 16932, 7219, -15129, -15126, -15119, -15130, -15136, -15113, -15124, -15119, -15110, 4805, -11267, -11313, -11304, -11317, -11290, -11313, -11328, -11318, -11326, -11317, -11378, -11316, -11317, -11326, -11327, -11328, -11319, -11299, -11378, -11302, -11327, -11378, -11313, -11328, -11327, -11302, -11322, -11317, -11300, -11378, -11318, -11327, -11315, -11301, -11325, -11317, -11328, -11302, -11267, -11313, -11304, -11317, -11290, -11313, -11328, -11318, -11326, -11317, -11378, -11321, -11299, -11378, -11328, -11327, -11302, -11378, -11313, -11315, -11302, -11321, -11304, -11317, 7934, -7840, -7854, -7867, -7850, -7849, -7917, -7872, -7844, -7866, -7871, -7856, -7850, -7917, -7841, -7850, -7843, -7852, -7865, -7845, -7917, -7840, -7854, -7867, -7850, -7813, -7854, -7843, -7849, -7841, -7850, -7917, -7855, -7850, -7841, -7844, -7843, -7852, -7872, -7917, -7865, -7844, -7917, -7854, -7843, -7844, -7865, -7845, -7850, -7871, -7917, -7849, -7844, -7856, -7866, -7842, -7850, -7843, -7865, -7840, -7854, -7867, -7850, -7813, -7854, -7843, -7849, -7841, -7850, -7917, -7846, -7872, -7917, -7843, -7844, -7865, -7917, -7854, -7856, -7865, -7846, -7867, -7850, -7840, -7854, -7867, -7850, -7849, -7917, -7872, -7844, -7866, -7871, -7856, -7850, -7917, -7846, -7872, -7917, -7854, -7841, -7871, -7850, -7854, -7849, -7862, -7917, -7844, -7868, -7843, -7850, -7849, -7917, -7855, -7862, -7917, -7849, -7844, -7856, -7866, -7842, -7850, -7843, -7865, -7840, -7854, -7867, -7850, -7813, -7854, -7843, -7849, -7841, -7850, -7917, -7846, -7872, -7917, -7872, -7865, -7854, -7841, -7850, -7917, -7918, -7922, -7917, -7849, -7844, -7856, -7866, -7842, -7850, -7843, -7865, -7917, -7841, -7850, -7843, -7852, -7865, -7845, -7917};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f61941;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f61942;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f61943;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long f61944;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile long f61945;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f61946;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public File f61947;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f61948;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C25111 f61949;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f61950;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f61951;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C24365 f61952;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC22808 f61953;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C21381 f61954;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f61955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0498 f61956;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f61957;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f61958;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m44301(Throwable th) throws IOException {
        m44346(th);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C24365 m44361() {
        C24365 c24365;
        m44332();
        m44328();
        m44278();
        m44377();
        C21381 c21381 = this.f61954;
        C4908 c4908 = new C4908(this.f61944, this.f61958, c21381.f68091, c21381.f68092, c21381.f68095);
        try {
            m44377();
            c24365 = new C24365(this, this.f61958, c21381, c4908);
            this.f61952 = c24365;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c4908.close();
                throw e;
            } catch (IOException e2) {
                RunnableC3646.m11799(e, e2);
                throw e;
            }
        }
        return c24365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m44362(int i, int i2, boolean z, boolean z2) {
        m44326();
        C16159 c16159 = new C16159(i, i2, z, z2);
        C16159.m38334(c16159, this.f61954.m48614());
        this.f61954.f68087 = c16159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m44363(int i, byte[] bArr, int i2, int i3) {
        m44334();
        C19606.m45244(i, 0, i3, m44338().f68092, bArr);
        m44334();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m44364(File file) {
        short s = f61940[1123];
        int i = s * 23368;
        int i2 = s + 5842;
        int i3 = (i2 * i2) - i < 0 ? 24708 : 50307;
        synchronized (this) {
            m44326();
            C17359.requireNonNull(file, C4282.m13650(f61940, 1124, 9, i3));
            this.f61947 = file;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C8833 m44367() {
        C21381 c21381;
        m44332();
        c21381 = this.f61954;
        return new C8833(c21381.f68091, c21381.f68094, c21381.f68087);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m44368() {
        return !C3492.m11482(this.f61957);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C14053 m44369() {
        C21381 c21381;
        InterfaceC22808 interfaceC22808;
        InterfaceC22808 interfaceC22808Mo2791;
        Throwable th;
        C4908 c4908;
        m44332();
        boolean z = this.f61952 != null;
        if (!z) {
            m44377();
        } else if (!m44316((Iterable) C0619.m2758(this.f61951))) {
            throw new C12893();
        }
        c21381 = this.f61954;
        interfaceC22808 = this.f61953;
        interfaceC22808Mo2791 = interfaceC22808.mo2791();
        C4908 c4909 = null;
        try {
            c4908 = new C4908(this.f61944, this.f61958, c21381.f68091, c21381.f68092, c21381.f68095);
            try {
                if (!z) {
                    m44377();
                } else if (!m44316((Iterable) C0773.m3162(this.f61951))) {
                    throw new C12893();
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c4909 = c4908;
                if (c4909 == null) {
                    AbstractC0641.m2821(interfaceC22808Mo2791);
                    throw th;
                }
                try {
                    c4909.close();
                } catch (IOException e2) {
                    RunnableC3646.m11799(th, e2);
                }
                try {
                    AbstractC0641.m2821(interfaceC22808Mo2791);
                    throw th;
                } catch (IOException e3) {
                    C1146.m4219(th, e3);
                    throw th;
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
        }
        return new C14053(this, interfaceC22808, interfaceC22808Mo2791, c4908, c21381.f68094, this.f61958);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m44371() {
        return !C3492.m11482(this.f61950);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized C16159 m44372() {
        m44326();
        return this.f61954.f68087;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C7956 m44374() {
        C7956 c7956;
        m44332();
        C21381 c21381 = this.f61954;
        c7956 = new C7956(this, this.f61958, c21381.f68091, c21381.m48615(0L));
        AbstractC3624.m11766(this.f61955, c7956, Boolean.TRUE);
        return c7956;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized C8088 m44376() {
        C8088 c8088;
        m44332();
        long j = this.f61954.f68091;
        c8088 = new C8088(this);
        RunnableC0334.m2054(this.f61941, c8088);
        return c8088;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized void m44377() {
        m44326();
        if (!m44316((Iterable) C0773.m3162(this.f61951))) {
            C0498 c0498 = this.f61956;
            if (c0498 != null) {
                c0498.m2409();
            }
            this.f61943 = true;
            this.f61950.clear();
            this.f61957.clear();
            this.f61948 = 0L;
            this.f61958++;
            m44352();
            throw new C12893();
        }
        this.f61945 = System.nanoTime() + 250000000;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m44353(long j, long j2) {
        long j3 = 0;
        int i = 1662632938;
        int i2 = C4282.f15546;
        int i3 = C3779.f12953;
        int iM2761 = C0619.m2761("ۜۡ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 29453) ^ (-899549069);
        int i5 = 353394270;
        while (true) {
            i = ((((i ^ i3) * (-4133)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2016542513:
                case 1616985376:
                    if (C1783.m6232()) {
                        iM2761 = (C0619.m2761("᩶᩸") ^ i2) * 51;
                        i4 = ((iM2761 ^ i3) * (-14269)) ^ 2044615210;
                        i5 = 457029791;
                    } else {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 32509) ^ (-262071027);
                        i5 = 314295025;
                    }
                    break;
                case -1954835083:
                case -504683435:
                    if (j3 >= 0) {
                        iM2761 = (C0619.m2761("ۜۘ") ^ i3) * 59;
                        i4 = ((iM2761 ^ i2) * 32291) ^ (-1024059628);
                        i5 = -621595344;
                    } else {
                        iM2761 = (C0773.m3169("֨֡") ^ i2) * (-35);
                        i4 = ((iM2761 ^ i3) * (-12549)) ^ 1829965779;
                        i5 = -24365039;
                    }
                    break;
                case -1862935756:
                case -1743656581:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 32509) ^ (-262071027);
                        i5 = 314295025;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵᩷")) * 53;
                        i4 = ((iM2761 ^ i2) * (-19173)) ^ (-615584205);
                        i5 = 1934699719;
                    }
                    break;
                case -1747509239:
                case 1462605130:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۜ֨")) * (-31);
                        i4 = ((iM2761 ^ i3) * (-9645)) ^ 1155030466;
                        i5 = 11767965;
                    } else {
                        iM2761 = C0773.m3169("ܿ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 8919) ^ (-1713575474);
                        i5 = 477934831;
                    }
                    break;
                case -1660714175:
                case -1175325029:
                    if (C1146.f4234 < 0) {
                        iM2761 = C0619.m2761("ۜ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15349)) ^ 1025639498;
                        i5 = -1000849384;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۜ֨")) * (-31);
                        i4 = ((iM2761 ^ i3) * (-9645)) ^ 1155030466;
                        i5 = 11767965;
                    }
                    break;
                case -1285459501:
                case 833829582:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩶") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 21625) ^ 41384775;
                        i5 = 1804215825;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽۗ")) * (-115);
                        i4 = ((iM2761 ^ i2) * 28845) ^ (-109908948);
                        i5 = 1123124504;
                    }
                    break;
                case -1228517221:
                case 1289040446:
                    if (j3 < j) {
                        iM2761 = (C0773.m3169("֨֡") ^ i2) * (-35);
                        i4 = ((iM2761 ^ i3) * (-12549)) ^ 1829965779;
                        i5 = -24365039;
                    } else {
                        iM2761 = C0773.m3169("᩸۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2085)) ^ (-2105408951);
                        i5 = -752079834;
                    }
                    break;
                case -894604553:
                case 1741699521:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 32509) ^ (-262071027);
                        i5 = 314295025;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۡ۠")) * 101;
                        i4 = ((iM2761 ^ i3) * 15579) ^ (-901492673);
                        i5 = 749846787;
                    }
                    break;
                case -648604632:
                case 210944575:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩶") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 21625) ^ 41384775;
                        i5 = 1804215825;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13087) ^ (-1064708509);
                        i5 = 1413300612;
                    }
                    break;
                case -520412018:
                case 1925383460:
                    C3779.m12264();
                    if (C2287.f7432 < 0) {
                        iM2761 = (i2 - C0773.m3169("ۜ֨")) * (-31);
                        i4 = ((iM2761 ^ i3) * (-9645)) ^ 1155030466;
                        i5 = 11767965;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵᩷")) * 53;
                        i4 = ((iM2761 ^ i2) * (-19173)) ^ (-615584205);
                        i5 = 1934699719;
                    }
                    break;
                case -506186260:
                case 2108028850:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ܽ֨") + i3) * (-35);
                        i4 = ((iM2761 ^ i2) * 32509) ^ (-262071027);
                        i5 = 314295025;
                    } else {
                        iM2761 = C0619.m2761("᩸ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18813) ^ 24579938;
                        i5 = -301076955;
                    }
                    break;
                case -393601949:
                case -329597189:
                    C3734.m12152();
                    return 0L;
                case -141776832:
                case 986917241:
                    return j3;
                case 54093485:
                case 1384585520:
                    return C25227.FOREVER_NS;
                case 302403284:
                case 2068137053:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("ۜ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15349)) ^ 1025639498;
                        i5 = -1000849384;
                    } else {
                        iM2761 = C0773.m3169("᩻ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24149)) ^ 1868688096;
                        i5 = -34107141;
                    }
                    break;
                case 904140483:
                case 1522525138:
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("ۜ᩶") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 21625) ^ 41384775;
                        i5 = 1804215825;
                    } else {
                        iM2761 = C0773.m3169("ᩳۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14931)) ^ 397269662;
                        i5 = -1690451949;
                    }
                    break;
                case 1119328492:
                case 1448725769:
                    AbstractC3624.m11755();
                    C3690.m11987();
                    iM2761 = (i3 - C0619.m2761("᩵᩷")) * 53;
                    i4 = ((iM2761 ^ i2) * (-19173)) ^ (-615584205);
                    i5 = 1934699719;
                    break;
                case 1122496474:
                case 1492273677:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("ۜ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15349)) ^ 1025639498;
                        i5 = -1000849384;
                    } else {
                        iM2761 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 21425) ^ 1687117651;
                        i5 = -1370155354;
                    }
                    break;
                default:
                    j3 = j2 + j;
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("ۜ᩶") + i3) * (-111);
                        i4 = ((iM2761 ^ i2) * 21625) ^ 41384775;
                        i5 = 1804215825;
                    } else {
                        iM2761 = C0619.m2761("ܶܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26941) ^ 822051042;
                        i5 = -1344746327;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m44359(int i, int i2, byte[] bArr, boolean[] zArr) {
        int iM53427;
        short s = f61940[1026];
        int i3 = (s * 468) - ((s * s) + 54756) > 0 ? 45665 : 4467;
        String strM28300 = C11235.m28300(f61940, 1027, 7, i3);
        synchronized (this) {
            C17359.requireNonNull(bArr, C1783.m6233(f61940, 1034, 4, i3));
            C17359.requireNonNull(zArr, RunnableC3646.m11809(f61940, 1038, 7, i3));
            if (i < 0 || i2 < 0) {
                StringBuilder sb = new StringBuilder(strM28300);
                C1783.m6237(sb, i);
                C3779.m12258(sb, C3077.m10047(f61940, 1045, 16, i3));
                C3779.m12269(sb, i2);
                throw new IndexOutOfBoundsException(C1080.m4058(sb));
            }
            C13921.m33902(bArr.length, 0, i2);
            C13921.m33902(zArr.length, 0, i2);
            m44334();
            C21381 c21381M44338 = m44338();
            iM53427 = i >= c21381M44338.m48614() ? 0 : C23916.m53427(i2, c21381M44338.m48614() - i);
            if (iM53427 > 0) {
                C19606.m45244(i, 0, iM53427, c21381M44338.f68092, bArr);
                C20767.m47493(c21381M44338.f68095, i, zArr, iM53427);
            }
            m44334();
        }
        return iM53427;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44351(InterfaceC22808 interfaceC22808, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 1438242787;
        int i3 = C3448.f11240;
        int i4 = C1146.f4234;
        int iM2761 = C0619.m2761("᩸ᩳ") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-6515)) ^ 968036223;
        int i6 = -919356376;
        while (true) {
            i2 = ((((i2 ^ i3) * (-19481)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1728772639:
                case 1933172970:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                        i6 = -323651856;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۟ۗ")) * 13;
                        i5 = ((iM2761 ^ i4) * (-2491)) ^ 350580245;
                        i6 = 1652156030;
                    }
                    break;
                case -1721505437:
                case 1718583686:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28689)) ^ 772252694;
                        i6 = -964461277;
                    } else {
                        iM2761 = (C0619.m2761("ܶ֫") ^ i3) * (-5);
                        i5 = ((iM2761 ^ i4) * 15073) ^ (-1804935116);
                        i6 = 1129213437;
                    }
                    break;
                case -1713102122:
                case 1994577301:
                    if (identityHashMap.containsKey(interfaceC22808)) {
                        iM2761 = C0773.m3169("ܳۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-27291)) ^ (-1533231983);
                        i6 = -834976457;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܿܽ")) * 13;
                        i5 = ((iM2761 ^ i3) * 2193) ^ (-2106273871);
                        i6 = -2041043443;
                    }
                    break;
                case -1450582864:
                case -1219017607:
                    AbstractC0116.m1242(identityHashMap, interfaceC22808, C1343.m4947(z2));
                    return z2;
                case -1446343672:
                case -899909287:
                    if (C1343.m4943()) {
                        iM2761 = (C0619.m2761("᩵ᩴ") ^ i3) * (-59);
                        i5 = ((iM2761 ^ i4) * (-17529)) ^ 1418683907;
                        i6 = 434240585;
                    } else {
                        iM2761 = (C0773.m3169("۫᩶") ^ i4) * (-35);
                        i5 = ((iM2761 ^ i3) * (-6117)) ^ (-1410244659);
                        i6 = -1339395846;
                    }
                    break;
                case -1414043944:
                case 873098245:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                        i6 = -323651856;
                    } else {
                        iM2761 = C0619.m2761("ᩴۛ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 16321) ^ (-1434295672);
                        i6 = 680485124;
                    }
                    break;
                case -916216021:
                case 903818716:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0773.m3169("۟۟") + i4) * 81;
                        i5 = ((iM2761 ^ i3) * 4745) ^ (-81049212);
                        i6 = 573162606;
                    } else {
                        iM2761 = (i4 - C0773.m3169("۬۫")) * 23;
                        i5 = ((iM2761 ^ i3) * 17039) ^ (-1044091769);
                        i6 = -599992691;
                    }
                    break;
                case -603243988:
                case -192572180:
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0773.m3169("ۙܿ") ^ i3) * 9;
                        i5 = ((iM2761 ^ i4) * 12585) ^ 404440626;
                        i6 = 1729789668;
                    } else {
                        iM2761 = C0773.m3169("ۛܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                        i6 = -323651856;
                    }
                    break;
                case -401413520:
                case -368617442:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0773.m3169("ۙܿ") ^ i3) * 9;
                        i5 = ((iM2761 ^ i4) * 12585) ^ 404440626;
                        i6 = 1729789668;
                    } else {
                        iM2761 = C0619.m2761("۠ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-21397)) ^ (-124409599);
                        i6 = 689597289;
                    }
                    break;
                case -194445847:
                case 1556935498:
                    C1783.m6232();
                    C0487.m2356();
                    return false;
                case 44914880:
                case 431644901:
                    if (m44351(interfaceC22808Arr[i], identityHashMap)) {
                        iM2761 = C0773.m3169("᩶ᩳ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-12961)) ^ 588331489;
                        i6 = -1354058504;
                    } else {
                        iM2761 = (C0619.m2761("᩷ۨ") + i4) * 53;
                        i5 = ((iM2761 ^ i3) * (-22017)) ^ (-1738560438);
                        i6 = -1795292076;
                    }
                    break;
                case 90525329:
                case 1989902275:
                    length = interfaceC22808Arr.length;
                    i = 0;
                    iM2761 = C0619.m2761("ᩳۤ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 26843) ^ (-87239501);
                    i6 = -664793463;
                    break;
                case 139963780:
                case 1301208772:
                    C0619.m2763();
                    AbstractC3624.m11755();
                    iM2761 = C0773.m3169("ۛܳ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                    i6 = -323651856;
                    break;
                case 152952616:
                case 1440530155:
                    if (interfaceC22808 instanceof C6465) {
                        iM2761 = (C0619.m2761("ۢܿ") + i4) * 49;
                        i5 = ((iM2761 ^ i3) * 8621) ^ (-174939326);
                        i6 = -1567092172;
                    } else {
                        z2 = z;
                        iM2761 = C0773.m3169("᩸ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22265) ^ 726155117;
                        i6 = 1103321974;
                    }
                    break;
                case 200449349:
                case 1191200483:
                    z2 = true;
                    iM2761 = C0773.m3169("᩸ۘ") ^ i3;
                    i5 = ((iM2761 ^ i4) * 22265) ^ 726155117;
                    i6 = 1103321974;
                    break;
                case 240922060:
                case 1711090267:
                    interfaceC22808Arr = ((C6465) interfaceC22808).f21763;
                    if (C13473.f42873 != 0) {
                        iM2761 = (C0773.m3169("ۙܿ") ^ i3) * 9;
                        i5 = ((iM2761 ^ i4) * 12585) ^ 404440626;
                        i6 = 1729789668;
                    } else {
                        iM2761 = (C0773.m3169("᩻ۤ") ^ i3) * 33;
                        i5 = ((iM2761 ^ i4) * (-2715)) ^ 899741491;
                        i6 = -184665122;
                    }
                    break;
                case 336521725:
                case 2034871505:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28689)) ^ 772252694;
                        i6 = -964461277;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩶") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-14841)) ^ (-2027468472);
                        i6 = 6006360;
                    }
                    break;
                case 379521790:
                case 1746561626:
                    if (i < length) {
                        iM2761 = (i3 - C0619.m2761("᩸ۗ")) * 27;
                        i5 = ((iM2761 ^ i4) * (-12769)) ^ (-1923023548);
                        i6 = 1725285016;
                    } else {
                        z2 = z;
                        iM2761 = C0773.m3169("᩸ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22265) ^ 726155117;
                        i6 = 1103321974;
                    }
                    break;
                case 416271886:
                case 1868288148:
                    bool = (Boolean) identityHashMap.get(interfaceC22808);
                    if (bool == null) {
                        iM2761 = C0619.m2761("᩺ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-2789)) ^ (-64832199);
                        i6 = 1907271130;
                    } else {
                        iM2761 = C0773.m3169("ܳۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-27291)) ^ (-1533231983);
                        i6 = -834976457;
                    }
                    break;
                case 465013443:
                case 1870096095:
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-28689)) ^ 772252694;
                        i6 = -964461277;
                    } else {
                        iM2761 = (C0773.m3169("۟۟") + i4) * 81;
                        i5 = ((iM2761 ^ i3) * 4745) ^ (-81049212);
                        i6 = 573162606;
                    }
                    break;
                case 490060411:
                case 1959387462:
                    i++;
                    iM2761 = C0619.m2761("ᩳۤ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 26843) ^ (-87239501);
                    i6 = -664793463;
                    break;
                case 784989598:
                case 1943338201:
                    C1146.m4231();
                    if (C2485.f7950 == 0) {
                        iM2761 = (C0773.m3169("۟۟") + i4) * 81;
                        i5 = ((iM2761 ^ i3) * 4745) ^ (-81049212);
                        i6 = 573162606;
                    } else {
                        iM2761 = C0773.m3169("ۛܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                        i6 = -323651856;
                    }
                    break;
                case 1038407162:
                case 1883625945:
                    AbstractC0116.m1242(identityHashMap, interfaceC22808, Boolean.FALSE);
                    z = interfaceC22808 instanceof InterfaceC22062;
                    if (z) {
                        z2 = z;
                        iM2761 = C0773.m3169("᩸ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 22265) ^ 726155117;
                        i6 = 1103321974;
                    } else {
                        iM2761 = C0619.m2761("ۚᩴ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5077)) ^ 1406738665;
                        i6 = -442167757;
                    }
                    break;
                case 1049825376:
                case 1484573845:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("۫᩶") ^ i4) * (-35);
                        i5 = ((iM2761 ^ i3) * (-6117)) ^ (-1410244659);
                        i6 = -1339395846;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֫ۢ")) * 101;
                        i5 = ((iM2761 ^ i4) * 9013) ^ (-1416845600);
                        i6 = -1866133522;
                    }
                    break;
                case 1646512364:
                case 2118319420:
                    return C3492.m11490(Boolean.TRUE, bool);
                default:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15745) ^ 1162640831;
                        i6 = -323651856;
                    } else {
                        iM2761 = C0619.m2761("ܺܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 5297) ^ (-549044655);
                        i6 = -1897223902;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04a3 A[PHI: r2 r7 r16 r24 r28
      0x04a3: PHI (r2v15 long) = (r2v12 long), (r2v16 long) binds: [B:115:0x04a1, B:103:0x040b] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r7v35 l.᩻ܳܳ) = (r7v32 l.᩻ܳܳ), (r7v36 l.᩻ܳܳ) binds: [B:115:0x04a1, B:103:0x040b] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r16v10 long) = (r16v7 long), (r16v11 long) binds: [B:115:0x04a1, B:103:0x040b] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r24v15 l.֡ᩴܳ) = (r24v12 l.֡ᩴܳ), (r24v16 l.֡ᩴܳ) binds: [B:115:0x04a1, B:103:0x040b] A[DONT_GENERATE, DONT_INLINE]
      0x04a3: PHI (r28v47 byte[]) = (r28v44 byte[]), (r28v48 byte[]) binds: [B:115:0x04a1, B:103:0x040b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x04e7 A[PHI: r2 r7 r16 r24 r28
      0x04e7: PHI (r2v23 long) = (r2v11 long), (r2v14 long), (r2v24 long) binds: [B:119:0x04e5, B:107:0x0437, B:29:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r7v54 l.᩻ܳܳ) = (r7v31 l.᩻ܳܳ), (r7v34 l.᩻ܳܳ), (r7v55 l.᩻ܳܳ) binds: [B:119:0x04e5, B:107:0x0437, B:29:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r16v17 long) = (r16v6 long), (r16v9 long), (r16v18 long) binds: [B:119:0x04e5, B:107:0x0437, B:29:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r24v23 l.֡ᩴܳ) = (r24v11 l.֡ᩴܳ), (r24v14 l.֡ᩴܳ), (r24v24 l.֡ᩴܳ) binds: [B:119:0x04e5, B:107:0x0437, B:29:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r28v63 byte[]) = (r28v43 byte[]), (r28v46 byte[]), (r28v64 byte[]) binds: [B:119:0x04e5, B:107:0x0437, B:29:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x023f A[PHI: r7 r18
      0x023f: PHI (r7v16 byte[]) = (r7v12 byte[]), (r7v15 byte[]), (r7v17 byte[]) binds: [B:67:0x023d, B:60:0x01e5, B:51:0x0193] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r18v3 long) = (r18v1 long), (r18v2 long), (r18v1 long) binds: [B:67:0x023d, B:60:0x01e5, B:51:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13856 m44345(C13856 c13856, InterfaceC7509 interfaceC7509) throws C9446 {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        byte[] bArr;
        C0630 c0630;
        long jM45247;
        long j;
        int iM3169;
        int i4;
        int i5;
        byte[] bArr2;
        C0630 c0631;
        C25111 c25111;
        int iM2763;
        int i6;
        int i7;
        C0630 c0632;
        int i8 = -713976310;
        int i9 = C2354.f7599;
        int i10 = C20932.f66974;
        int iM31610 = (C0773.m3169("ۤ᩶") ^ i9) * 91;
        int i11 = ((iM31610 ^ i10) * (-11623)) ^ 903938974;
        int i12 = iM31610 ^ 1308574024;
        C13856 c13856M44343 = null;
        long jM45235 = 0;
        C13856 c13856M45218 = null;
        byte[] bArr3 = null;
        int i13 = 0;
        long j2 = 0;
        C13856 c13857 = null;
        long j3 = 0;
        long j4 = 0;
        long jM10044 = 0;
        C0630 c0633 = null;
        long jM45236 = 0;
        C25111 c25112 = null;
        long j5 = 0;
        long jM45251 = 0;
        int i14 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * 26551) >> 31));
            switch (i8) {
                case -2139085490:
                case 1138801738:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (C2375.m8058(interfaceC7509)) {
                        iM3169 = (i10 - C0619.m2761("ۢܳ")) * 3;
                        i4 = ((iM3169 ^ i9) * 26023) ^ (-683150377);
                        i5 = -2046766270;
                    } else {
                        iM3169 = (C0773.m3169("ܿۙ") ^ i9) * (-89);
                        i4 = ((iM3169 ^ i10) * 4693) ^ (-1157894747);
                        i5 = -187750543;
                    }
                    i11 = i4;
                    byte[] bArr4 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr4;
                    C0630 c0634 = c0630;
                    c25112 = c25112;
                    long j6 = jM45247;
                    c0633 = c0634;
                    jM45236 = j;
                    j5 = j6;
                    break;
                case -2136272939:
                case 328012899:
                    return null;
                case -2093012333:
                case -63618920:
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    j2 = 1048576;
                    if (jM45247 >= 1048576) {
                        bArr = bArr3;
                        iM3169 = C0773.m3169("ܶۧ") ^ i9;
                        i4 = ((iM3169 ^ i10) * (-24101)) ^ (-1823766242);
                        i5 = 947700702;
                        i11 = i4;
                        byte[] bArr5 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr5;
                        C0630 c0635 = c0630;
                        c25112 = c25112;
                        long j7 = jM45247;
                        c0633 = c0635;
                        jM45236 = j;
                        j5 = j7;
                    } else {
                        c13856M44343 = c13856;
                        int iM2764 = C0619.m2761("ۨ۫") ^ i9;
                        i11 = ((iM2764 ^ i10) * 28301) ^ (-1843458496);
                        bArr3 = bArr3;
                        i12 = iM2764 ^ 12447998;
                        c0632 = c0630;
                        c25112 = c25112;
                        long j8 = jM45247;
                        c0633 = c0632;
                        jM45236 = j;
                        j5 = j8;
                    }
                    break;
                case -2043710644:
                case 676563564:
                    bArr3 = bArr3;
                    i13 = 0;
                    if (c13856M45218 == null) {
                        iM2761 = (C0619.m2761("ۙۧ") + i10) * (-101);
                        i11 = ((iM2761 ^ i9) * (-20061)) ^ 1508571496;
                        i = 1902193317;
                    } else {
                        iM2761 = (C0619.m2761("ۡᩳ") ^ i10) * 93;
                        i11 = ((iM2761 ^ i9) * 25729) ^ 1093250859;
                        i = -1763767613;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case -1974389731:
                case 390525170:
                    throw new C9446();
                case -1866285908:
                case -743780861:
                    bArr = bArr3;
                    j = jM45236;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = C19606.m45247(c13856);
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i9 - C0619.m2761("ۖܺ")) * (-87);
                        i4 = ((iM3169 ^ i10) * (-29413)) ^ (-135422367);
                        i5 = 567175593;
                    } else {
                        iM3169 = (i10 - C0619.m2761("ۛ֨")) * (-123);
                        i4 = ((iM3169 ^ i9) * 25749) ^ (-1476101309);
                        i5 = -1942930656;
                    }
                    i11 = i4;
                    byte[] bArr6 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr6;
                    C0630 c0636 = c0630;
                    c25112 = c25112;
                    long j9 = jM45247;
                    c0633 = c0636;
                    jM45236 = j;
                    j5 = j9;
                    break;
                case -1864555411:
                case -971061709:
                    bArr3 = bArr3;
                    C25111 c25113 = c25112;
                    C0630 c0637 = c0633;
                    C13856 c13858 = c13856M44343;
                    C13856 c13856M44291 = m44291(c13858, C19606.m45247(c13856M44343), c25113);
                    if (C11235.m28304(interfaceC7509)) {
                        int iM2765 = C0619.m2761("۬᩵") ^ i10;
                        i11 = ((iM2765 ^ i9) * (-12163)) ^ (-1277501791);
                        c13856M44343 = c13858;
                        c0633 = c0637;
                        c25112 = c25113;
                        c13857 = c13856M44291;
                        i12 = iM2765 ^ (-25636167);
                    } else {
                        int iM2766 = (i10 - C0619.m2761("ܳ۟")) * (-73);
                        c13856M44343 = c13858;
                        c0633 = c0637;
                        c25112 = c25113;
                        c13857 = c13856M44291;
                        i12 = iM2766 ^ (-415030072);
                        i11 = ((iM2766 ^ i9) * 15917) ^ 2056402284;
                    }
                    bArr3 = bArr3;
                    break;
                case -1842920938:
                case 1716885146:
                    bArr3 = bArr3;
                    c13856M45218 = C19606.m45218(c13857, jM45235);
                    iM2761 = (i9 - C0619.m2761("ۤۘ")) * (-101);
                    i11 = ((iM2761 ^ i10) * 3111) ^ 1049748337;
                    i = -134501268;
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case -1804026800:
                case 841865545:
                    c0633.m2794(i13, i14, bArr3);
                    return C19606.m45220(c0633);
                case -1776403240:
                case 748638135:
                    bArr3 = bArr3;
                    jM45235 = C19606.m45235(c13857);
                    if (jM45235 >= j2) {
                        iM2761 = C0619.m2761("۟ۙ") ^ i10;
                        i11 = ((iM2761 ^ i9) * 18933) ^ 1311275927;
                        i = -1192537783;
                    } else {
                        c13856M45218 = c13857;
                        iM2761 = (i9 - C0619.m2761("ۤۘ")) * (-101);
                        i11 = ((iM2761 ^ i10) * 3111) ^ 1049748337;
                        i = -134501268;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case -1641548816:
                case -430196102:
                    C4282.m13644();
                    C0619.m2763();
                    return null;
                case -1617403365:
                case 529002622:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (c13856 == null) {
                        iM3169 = (C0773.m3169("ۤۨ") + i9) * (-67);
                        i4 = ((iM3169 ^ i10) * 9831) ^ 2039798673;
                        i5 = -1240938735;
                    } else {
                        iM3169 = C0773.m3169("۠ۛ") ^ i10;
                        i4 = ((iM3169 ^ i9) * 2855) ^ 369151302;
                        i5 = -1437845968;
                    }
                    i11 = i4;
                    byte[] bArr7 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr7;
                    C0630 c0638 = c0630;
                    c25112 = c25112;
                    long j10 = jM45247;
                    c0633 = c0638;
                    jM45236 = j;
                    j5 = j10;
                    break;
                case -1560216905:
                case -1185587553:
                    if (C2834.f9334 > 0) {
                        iM2762 = C0619.m2761("᩷ᩳ") ^ i10;
                        i2 = ((iM2762 ^ i9) * (-17771)) ^ 846774175;
                        i3 = 1684827284;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    } else {
                        bArr = bArr3;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = C0773.m3169("֡ۨ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 8079) ^ 1343393828;
                        i5 = 239554311;
                        i11 = i4;
                        byte[] bArr8 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr8;
                        C0630 c0639 = c0630;
                        c25112 = c25112;
                        long j11 = jM45247;
                        c0633 = c0639;
                        jM45236 = j;
                        j5 = j11;
                    }
                    break;
                case -1474548673:
                case -168807507:
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    c13856M44343 = m44343(c13856, jM45247, c25112);
                    int iM2767 = C0619.m2761("ۨ۫") ^ i9;
                    i11 = ((iM2767 ^ i10) * 28301) ^ (-1843458496);
                    bArr3 = bArr3;
                    i12 = iM2767 ^ 12447998;
                    c0632 = c0630;
                    c25112 = c25112;
                    long j12 = jM45247;
                    c0633 = c0632;
                    jM45236 = j;
                    j5 = j12;
                    break;
                case -1468133583:
                case 2119095009:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ۧۛ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 22913) ^ (-45698199);
                        i5 = 691375067;
                    } else {
                        iM3169 = C0619.m2761("۠ۢ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 13655) ^ 1374410622;
                        i5 = 1137318801;
                    }
                    i11 = i4;
                    byte[] bArr9 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr9;
                    C0630 c06310 = c0630;
                    c25112 = c25112;
                    long j13 = jM45247;
                    c0633 = c06310;
                    jM45236 = j;
                    j5 = j13;
                    break;
                case -1327987825:
                case 487195624:
                    if (j4 <= jM10044 / j3) {
                        iM2762 = C0619.m2761("ܳ᩺") ^ i9;
                        i2 = ((iM2762 ^ i10) * (-161)) ^ (-655408489);
                        i3 = 563899041;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    } else {
                        bArr3 = bArr3;
                        iM2761 = (C0773.m3169("᩵ۘ") ^ i10) * 15;
                        i11 = ((iM2761 ^ i9) * (-30703)) ^ (-1154257272);
                        i = 816849174;
                        i12 = iM2761 ^ i;
                        bArr3 = bArr3;
                    }
                    break;
                case -1308845418:
                case -257720305:
                    bArr3 = new byte[i14];
                    C19606.m45244(i13, i13, i14, c13856M45218, bArr3);
                    if (C2375.m8058(interfaceC7509)) {
                        iM2762 = (C0773.m3169("ۜۚ") + i9) * 7;
                        i2 = ((iM2762 ^ i10) * (-29223)) ^ (-1744256019);
                        i3 = -757314430;
                    } else {
                        iM2762 = (i10 - C0773.m3169("ۡۘ")) * (-115);
                        i2 = ((iM2762 ^ i9) * (-13771)) ^ (-1101512195);
                        i3 = -523506955;
                    }
                    i12 = iM2762 ^ i3;
                    i11 = i2;
                    break;
                case -1298176564:
                case 44399278:
                    return c13856M45218;
                case -1276633233:
                case 1020954023:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("֡ۨ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 8079) ^ 1343393828;
                        i5 = 239554311;
                    } else {
                        iM3169 = (i10 - C0773.m3169("ᩴۜ")) * 71;
                        i4 = ((iM3169 ^ i9) * 23407) ^ (-1922418587);
                        i5 = -1549233046;
                    }
                    i11 = i4;
                    byte[] bArr10 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr10;
                    C0630 c06311 = c0630;
                    c25112 = c25112;
                    long j14 = jM45247;
                    c0633 = c06311;
                    jM45236 = j;
                    j5 = j14;
                    break;
                case -1271615922:
                case 554014909:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i9 - C0619.m2761("ۖܺ")) * (-87);
                        i4 = ((iM3169 ^ i10) * (-29413)) ^ (-135422367);
                        i5 = 567175593;
                    } else {
                        iM3169 = (i10 - C0619.m2761("ۙۜ")) * 3;
                        i4 = ((iM3169 ^ i9) * (-2055)) ^ (-18178354);
                        i5 = -1128706687;
                    }
                    i11 = i4;
                    byte[] bArr11 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr11;
                    C0630 c06312 = c0630;
                    c25112 = c25112;
                    long j15 = jM45247;
                    c0633 = c06312;
                    jM45236 = j;
                    j5 = j15;
                    break;
                case -1168111560:
                case -726340811:
                    throw new C9446();
                case -1053505332:
                case -379277695:
                    C2419.m8174();
                    if (C0269.m1775() > 0) {
                        iM2762 = C0773.m3169("ܺ֫") ^ i9;
                        i2 = ((iM2762 ^ i10) * 19917) ^ 1647832659;
                        i3 = -859253467;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    } else {
                        bArr = bArr3;
                        c25112 = c25112;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = (i10 - C0619.m2761("۫ܽ")) * (-47);
                        i4 = ((iM3169 ^ i9) * 24211) ^ (-357007646);
                        i5 = 576391071;
                        i11 = i4;
                        byte[] bArr12 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr12;
                        C0630 c06313 = c0630;
                        c25112 = c25112;
                        long j16 = jM45247;
                        c0633 = c06313;
                        jM45236 = j;
                        j5 = j16;
                    }
                    break;
                case -832774187:
                case 464129452:
                    if (C3779.f12953 <= 0) {
                        bArr2 = bArr3;
                        c25111 = c25112;
                        c0631 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM2763 = C0619.m2761("ᩴۢ") ^ i9;
                        i6 = ((iM2763 ^ i10) * (-11603)) ^ (-1577695022);
                        i7 = 1364720562;
                        i11 = i6;
                        c0632 = c0631;
                        c25112 = c25111;
                        bArr3 = bArr2;
                        i12 = iM2763 ^ i7;
                        long j17 = jM45247;
                        c0633 = c0632;
                        jM45236 = j;
                        j5 = j17;
                    } else {
                        bArr = bArr3;
                        c25112 = c25112;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = (i10 - C0619.m2761("۫ܽ")) * (-47);
                        i4 = ((iM3169 ^ i9) * 24211) ^ (-357007646);
                        i5 = 576391071;
                        i11 = i4;
                        byte[] bArr13 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr13;
                        C0630 c06314 = c0630;
                        c25112 = c25112;
                        long j18 = jM45247;
                        c0633 = c06314;
                        jM45236 = j;
                        j5 = j18;
                    }
                    break;
                case -831958811:
                case 1833040823:
                    C3099.m10095();
                    if (!C2023.f6737) {
                        bArr = bArr3;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = C0773.m3169("֡ۨ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 8079) ^ 1343393828;
                        i5 = 239554311;
                        i11 = i4;
                        byte[] bArr14 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr14;
                        C0630 c06315 = c0630;
                        c25112 = c25112;
                        long j19 = jM45247;
                        c0633 = c06315;
                        jM45236 = j;
                        j5 = j19;
                    } else {
                        bArr3 = bArr3;
                        iM2761 = (i10 - C0619.m2761("۟ᩴ")) * 45;
                        i11 = ((iM2761 ^ i9) * 28569) ^ (-920529775);
                        i = -1896579683;
                        i12 = iM2761 ^ i;
                        bArr3 = bArr3;
                    }
                    break;
                case -637080401:
                case 1319365325:
                    C1146.m4231();
                    bArr = bArr3;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    iM3169 = C0773.m3169("֡ۨ") ^ i9;
                    i4 = ((iM3169 ^ i10) * 8079) ^ 1343393828;
                    i5 = 239554311;
                    i11 = i4;
                    byte[] bArr15 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr15;
                    C0630 c06316 = c0630;
                    c25112 = c25112;
                    long j110 = jM45247;
                    c0633 = c06316;
                    jM45236 = j;
                    j5 = j110;
                    break;
                case -514124506:
                case 1187224386:
                    bArr3 = bArr3;
                    jM10044 = C3077.m10044(jM45251, jM45236);
                    if (jM10044 >= j2) {
                        iM2761 = (C0619.m2761("֨᩶") ^ i9) * 89;
                        i11 = ((iM2761 ^ i10) * 19815) ^ (-174168596);
                        i = -803863445;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۘ") ^ i10) * 15;
                        i11 = ((iM2761 ^ i9) * (-30703)) ^ (-1154257272);
                        i = 816849174;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case -508238651:
                case 1062050148:
                    byte[] bArr16 = bArr3;
                    long j20 = i14;
                    j3 = 4;
                    if (C11235.f35427 >= 0) {
                        j4 = j20;
                        bArr = bArr16;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = C0773.m3169("֡ۨ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 8079) ^ 1343393828;
                        i5 = 239554311;
                        i11 = i4;
                        byte[] bArr17 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr17;
                        C0630 c06317 = c0630;
                        c25112 = c25112;
                        long j111 = jM45247;
                        c0633 = c06317;
                        jM45236 = j;
                        j5 = j111;
                    } else {
                        int iM31611 = C0773.m3169("ۛۛ") ^ i10;
                        i11 = 40016218 ^ ((iM31611 ^ i9) * (-9559));
                        i12 = iM31611 ^ 935727117;
                        bArr3 = bArr16;
                        j4 = j20;
                    }
                    break;
                case -398984481:
                case 1841250500:
                    i14 = 0;
                    iM2761 = C0773.m3169("ۚ᩶") ^ i9;
                    i11 = ((iM2761 ^ i10) * (-14795)) ^ (-2037806628);
                    i = -1235583563;
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case -41377896:
                case 1041360606:
                    bArr3 = bArr3;
                    if (C11235.m28304(interfaceC7509)) {
                        iM2761 = (i9 - C0773.m3169("ᩳ۟")) * (-13);
                        i11 = ((iM2761 ^ i10) * 7205) ^ (-786058462);
                        i = -1139838722;
                    } else {
                        iM2761 = C0619.m2761("ܰ᩶") ^ i9;
                        i11 = ((iM2761 ^ i10) * 10353) ^ (-525521533);
                        i = 374309786;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case 39930296:
                case 641374969:
                    bArr3 = bArr3;
                    if (i14 > 65536) {
                        iM2761 = (C0773.m3169("᩵ۘ") ^ i10) * 15;
                        i11 = ((iM2761 ^ i9) * (-30703)) ^ (-1154257272);
                        i = 816849174;
                    } else {
                        iM2761 = C0773.m3169("۫֫") ^ i9;
                        i11 = ((iM2761 ^ i10) * (-30277)) ^ 646683476;
                        i = -1611861190;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case 107155614:
                case 543953117:
                    throw new C9446();
                case 114615516:
                case 294767383:
                    if (C0773.m3161() == 0) {
                        bArr = bArr3;
                        c25112 = c25112;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = C0773.m3169("ۧۛ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 22913) ^ (-45698199);
                        i5 = 691375067;
                        i11 = i4;
                        byte[] bArr18 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr18;
                        C0630 c06318 = c0630;
                        c25112 = c25112;
                        long j112 = jM45247;
                        c0633 = c06318;
                        jM45236 = j;
                        j5 = j112;
                    } else {
                        iM2762 = C0619.m2761("᩷ᩳ") ^ i10;
                        i2 = ((iM2762 ^ i9) * (-17771)) ^ 846774175;
                        i3 = 1684827284;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    }
                    break;
                case 186735181:
                case 1247210140:
                    if (C3734.f12817 < 0) {
                        iM2762 = C0773.m3169("ܺ֫") ^ i9;
                        i2 = ((iM2762 ^ i10) * 19917) ^ 1647832659;
                        i3 = -859253467;
                    } else {
                        iM2762 = (C0619.m2761("᩸᩻") + i10) * (-39);
                        i2 = ((iM2762 ^ i9) * (-10589)) ^ 68481265;
                        i3 = 1642489828;
                    }
                    i12 = iM2762 ^ i3;
                    i11 = i2;
                    break;
                case 260843146:
                case 1931612009:
                    bArr3 = bArr3;
                    jM45251 = C19606.m45251(c13856M45218);
                    jM45236 = C19606.m45235(c13856M45218);
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i10 - C0619.m2761("۟ᩴ")) * 45;
                        i11 = ((iM2761 ^ i9) * 28569) ^ (-920529775);
                        i = -1896579683;
                    } else {
                        iM2761 = C0619.m2761("ۤ᩸") ^ i10;
                        i11 = ((iM2761 ^ i9) * 25891) ^ (-747071929);
                        i = -879284809;
                    }
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
                case 445849749:
                case 2147100687:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (i10 - C0619.m2761("۫ܽ")) * (-47);
                        i4 = ((iM3169 ^ i9) * 24211) ^ (-357007646);
                        i5 = 576391071;
                    } else {
                        iM3169 = C0619.m2761("ܺۗ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 11621) ^ (-787694628);
                        i5 = -41578486;
                    }
                    i11 = i4;
                    byte[] bArr19 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr19;
                    C0630 c06319 = c0630;
                    c25112 = c25112;
                    long j113 = jM45247;
                    c0633 = c06319;
                    jM45236 = j;
                    j5 = j113;
                    break;
                case 544870368:
                case 755310018:
                    throw new C9446();
                case 649011299:
                case 1429110176:
                    c0633 = new C0630(i14);
                    if (C3690.f12684 > 0) {
                        iM2762 = C0619.m2761("ۢ᩷") ^ i10;
                        i2 = ((iM2762 ^ i9) * (-4879)) ^ (-299604007);
                        i3 = 417463833;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    } else {
                        bArr2 = bArr3;
                        c25111 = c25112;
                        c0631 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM2763 = C0619.m2761("ᩴۢ") ^ i9;
                        i6 = ((iM2763 ^ i10) * (-11603)) ^ (-1577695022);
                        i7 = 1364720562;
                        i11 = i6;
                        c0632 = c0631;
                        c25112 = c25111;
                        bArr3 = bArr2;
                        i12 = iM2763 ^ i7;
                        long j114 = jM45247;
                        c0633 = c0632;
                        jM45236 = j;
                        j5 = j114;
                    }
                    break;
                case 981718999:
                case 1660756973:
                    bArr2 = bArr3;
                    c0631 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    c25111 = new C25111();
                    if (C2375.m8065() <= 0) {
                        iM2763 = C0619.m2761("ᩴۢ") ^ i9;
                        i6 = ((iM2763 ^ i10) * (-11603)) ^ (-1577695022);
                        i7 = 1364720562;
                    } else {
                        iM2763 = C0619.m2761("᩻ܳ") ^ i10;
                        i6 = ((iM2763 ^ i9) * (-3483)) ^ 1659971771;
                        i7 = 811389960;
                    }
                    i11 = i6;
                    c0632 = c0631;
                    c25112 = c25111;
                    bArr3 = bArr2;
                    i12 = iM2763 ^ i7;
                    long j115 = jM45247;
                    c0633 = c0632;
                    jM45236 = j;
                    j5 = j115;
                    break;
                case 1409293683:
                case 1843756871:
                    bArr = bArr3;
                    c25112 = c25112;
                    c0630 = c0633;
                    jM45247 = j5;
                    j = jM45236;
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("ۧۛ") ^ i9;
                        i4 = ((iM3169 ^ i10) * 22913) ^ (-45698199);
                        i5 = 691375067;
                    } else {
                        iM3169 = C0773.m3169("ۚ۫") ^ i9;
                        i4 = ((iM3169 ^ i10) * 1189) ^ (-1805333721);
                        i5 = -1318761860;
                    }
                    i11 = i4;
                    byte[] bArr110 = bArr;
                    i12 = iM3169 ^ i5;
                    bArr3 = bArr110;
                    C0630 c063110 = c0630;
                    c25112 = c25112;
                    long j116 = jM45247;
                    c0633 = c063110;
                    jM45236 = j;
                    j5 = j116;
                    break;
                case 1554528516:
                case 2084666371:
                    if (C1080.f3865 < 0) {
                        bArr = bArr3;
                        c25112 = c25112;
                        c0630 = c0633;
                        jM45247 = j5;
                        j = jM45236;
                        iM3169 = (i10 - C0619.m2761("۫ܽ")) * (-47);
                        i4 = ((iM3169 ^ i9) * 24211) ^ (-357007646);
                        i5 = 576391071;
                        i11 = i4;
                        byte[] bArr111 = bArr;
                        i12 = iM3169 ^ i5;
                        bArr3 = bArr111;
                        C0630 c063111 = c0630;
                        c25112 = c25112;
                        long j117 = jM45247;
                        c0633 = c063111;
                        jM45236 = j;
                        j5 = j117;
                    } else {
                        iM2762 = C0619.m2761("᩷ᩳ") ^ i10;
                        i2 = ((iM2762 ^ i9) * (-17771)) ^ 846774175;
                        i3 = 1684827284;
                        i12 = iM2762 ^ i3;
                        i11 = i2;
                    }
                    break;
                default:
                    i14 = c13856M45218.f43959;
                    iM2761 = C0773.m3169("ۚ᩶") ^ i9;
                    i11 = ((iM2761 ^ i10) * (-14795)) ^ (-2037806628);
                    i = -1235583563;
                    i12 = iM2761 ^ i;
                    bArr3 = bArr3;
                    break;
            }
        }
    }

    static {
        InterfaceC22808[] interfaceC22808Arr = null;
        int i = -1089561174;
        int i2 = C2702.f8586;
        int i3 = C4282.f15546;
        int iM3169 = (C0773.m3169("ۚ֡") + i2) * 95;
        int i4 = ((iM3169 ^ i3) * 27357) ^ 775581562;
        int i5 = 1357911324;
        while (true) {
            i = ((((i ^ i3) * (-7003)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1801258599:
                case 698321145:
                    f61938 = interfaceC22808Arr;
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0773.m3169("ۢ᩺") + i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 6067) ^ (-1596633275);
                        i5 = -569274895;
                    } else {
                        iM3169 = C0619.m2761("᩻ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8769)) ^ (-1689122016);
                        i5 = 806815678;
                    }
                    break;
                case -1459870983:
                case 390721698:
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0619.m2761("ܿܶ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * 15935) ^ (-2041423735);
                        i5 = 84571728;
                    } else {
                        iM3169 = C0619.m2761("ۖᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6851) ^ (-1258032469);
                        i5 = -1968771593;
                    }
                    break;
                case -1375355716:
                case -566150606:
                    RunnableC3646.m11813();
                    throw new RuntimeException();
                case -1316425151:
                case 1062968083:
                    interfaceC22808Arr = new InterfaceC22808[0];
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۢ᩺") + i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 6067) ^ (-1596633275);
                        i5 = -569274895;
                    } else {
                        iM3169 = (C0773.m3169("ܺ᩵") ^ i3) * (-69);
                        i4 = ((iM3169 ^ i2) * (-21797)) ^ (-81652434);
                        i5 = 1890625353;
                    }
                    break;
                case -1291979232:
                case 1363776082:
                    C2834.m9344();
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("۫ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24701)) ^ 1927104435;
                        i5 = 1596443215;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩻ۚ")) * 7;
                        i4 = ((iM3169 ^ i2) * 11579) ^ (-1206032469);
                        i5 = -1172238356;
                    }
                    break;
                case -1220378901:
                case 1427929765:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0619.m2761("ۖᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6851) ^ (-1258032469);
                        i5 = -1968771593;
                    } else {
                        iM3169 = C0773.m3169("᩹ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18425)) ^ 899419732;
                        i5 = -1070971172;
                    }
                    break;
                case -630676993:
                case 1867443731:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("۫ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24701)) ^ 1927104435;
                        i5 = 1596443215;
                    } else {
                        iM3169 = C0773.m3169("ܰ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * 9495) ^ (-874548226);
                        i5 = 2041208053;
                    }
                    break;
                case -463948930:
                case 1941645025:
                    if (C2354.f7599 < 0) {
                        f61935 = new Object();
                        return;
                    }
                    iM3169 = (C0619.m2761("ܿܶ") + i2) * (-69);
                    i4 = ((iM3169 ^ i3) * 15935) ^ (-2041423735);
                    i5 = 84571728;
                    break;
                case -460668341:
                case 1020678706:
                    if (C1783.m6232()) {
                        iM3169 = C0619.m2761("֫ᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25671) ^ (-956247840);
                        i5 = 1643226476;
                    } else {
                        iM3169 = (C0619.m2761("ܿܶ") + i2) * (-69);
                        i4 = ((iM3169 ^ i3) * 15935) ^ (-2041423735);
                        i5 = 84571728;
                    }
                    break;
                case 347570967:
                case 2039842204:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ۢ᩺") + i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 6067) ^ (-1596633275);
                        i5 = -569274895;
                    } else {
                        f61936 = new AtomicLong(1L);
                        if (RunnableC3646.f12471) {
                            iM3169 = C0773.m3169("۫ۜ") ^ i2;
                            i4 = ((iM3169 ^ i3) * (-24701)) ^ 1927104435;
                            i5 = 1596443215;
                        } else {
                            iM3169 = (i2 - C0619.m2761("ۙۛ")) * (-47);
                            i4 = ((iM3169 ^ i3) * 5605) ^ 1855377940;
                            i5 = -1066366629;
                        }
                    }
                    break;
                case 834953009:
                case 2027751176:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۖᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6851) ^ (-1258032469);
                        i5 = -1968771593;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5111) ^ 1061881026;
                        i5 = 1920068055;
                    }
                    break;
                case 975167967:
                case 977680102:
                    if (C0773.m3161() != 0) {
                        iM3169 = (C0773.m3169("ۢ᩺") + i3) * (-11);
                        i4 = ((iM3169 ^ i2) * 6067) ^ (-1596633275);
                        i5 = -569274895;
                    } else {
                        iM3169 = (C0773.m3169("ۡ֡") + i3) * 13;
                        i4 = ((iM3169 ^ i2) * 23341) ^ 361465159;
                        i5 = 1796845466;
                    }
                    break;
                case 1273176372:
                case 2094496561:
                    C4282.m13644();
                    iM3169 = C0619.m2761("ۖᩴ") ^ i3;
                    i4 = ((iM3169 ^ i2) * 6851) ^ (-1258032469);
                    i5 = -1968771593;
                    break;
                default:
                    C1321.m4852();
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("۫ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24701)) ^ 1927104435;
                        i5 = 1596443215;
                    } else {
                        iM3169 = C0619.m2761("ۖᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6851) ^ (-1258032469);
                        i5 = -1968771593;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (l.C3492.m11488() == false) goto L39;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m44311(l.C21381 r46, l.C14799 r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44311(l.᩶ܳܳ, l.ܰᩴܳ, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:66:0x022b A[PHI: r2 r8 r14
      0x022b: PHI (r2v4 java.util.ArrayDeque) = 
      (r2v3 java.util.ArrayDeque)
      (r2v2 java.util.ArrayDeque)
      (r2v2 java.util.ArrayDeque)
      (r2v2 java.util.ArrayDeque)
      (r2v2 java.util.ArrayDeque)
     binds: [B:65:0x0229, B:48:0x0183, B:38:0x010e, B:16:0x0069, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r8v5 l.ۤۚܳ) = (r8v2 l.ۤۚܳ), (r8v2 l.ۤۚܳ), (r8v4 l.ۤۚܳ), (r8v2 l.ۤۚܳ), (r8v2 l.ۤۚܳ) binds: [B:65:0x0229, B:48:0x0183, B:38:0x010e, B:16:0x0069, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r14v7 l.۬۫ܳ) = (r14v5 l.۬۫ܳ), (r14v5 l.۬۫ܳ), (r14v6 l.۬۫ܳ), (r14v5 l.۬۫ܳ), (r14v5 l.۬۫ܳ) binds: [B:65:0x0229, B:48:0x0183, B:38:0x010e, B:16:0x0069, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    public C19143(InterfaceC22808 interfaceC22808, File file) {
        int iM3169;
        int i;
        int i2;
        ArrayDeque arrayDeque;
        int iM31610;
        int i3;
        int i4;
        int iM2761;
        int i5;
        int i6;
        InterfaceC22808 interfaceC22809 = interfaceC22808;
        ArrayDeque arrayDeque2 = null;
        ArrayDeque arrayDeque3 = null;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        int length = 0;
        C10655 c10655M45237 = null;
        int i7 = 1256132419;
        int i8 = C1146.f4234;
        int i9 = C11235.f35427;
        short s = f61940[0];
        int i10 = 64784 * s;
        int i11 = s + 16196;
        int i12 = (i11 * i11) - i10 >= 0 ? 57712 : 31390;
        int iM2762 = (C0619.m2761("ۧ᩻") + i9) * (-123);
        int i13 = ((iM2762 ^ i8) * (-12291)) ^ 703643730;
        int i14 = iM2762 ^ (-1936724503);
        int i15 = i13;
        C13856 c13856M45220 = null;
        while (true) {
            int i16 = i15;
            while (true) {
                i7 = i14 ^ (i16 & (((i7 ^ i8) * 13089) >> 31));
                switch (i7) {
                    case -1907422259:
                    case 711769145:
                        C4282.m13644();
                        if (RunnableC1848.f6235) {
                            iM2761 = C0773.m3169("۠᩷") ^ i8;
                            i5 = ((iM2761 ^ i9) * (-12885)) ^ (-850168380);
                            i6 = -2072999784;
                        } else {
                            iM2761 = C0773.m3169("֡᩸") ^ i9;
                            i5 = ((iM2761 ^ i8) * (-30159)) ^ 379806823;
                            i6 = 799210437;
                        }
                        i15 = i5;
                        i14 = iM2761 ^ i6;
                        break;
                    case -1747380621:
                    case -353085611:
                        this.f61941 = new ArrayList();
                        if (C1826.m6301() >= 0) {
                            iM3169 = C0773.m3169("ۗۖ") ^ i9;
                            i = ((iM3169 ^ i8) * 29007) ^ (-835540045);
                            i2 = 481157702;
                        } else {
                            iM3169 = (i8 - C0773.m3169("ۛ۠")) * 21;
                            i = ((iM3169 ^ i9) * 12153) ^ 104910271;
                            i2 = 321626382;
                        }
                        i14 = iM3169 ^ i2;
                        i16 = i;
                        break;
                    case -1690067730:
                    case -879307888:
                        throw new IllegalArgumentException(C1519.m5399(f61940, 7, 22, i12));
                    case -1645161861:
                    case 1474263330:
                        this.f61953 = interfaceC22809;
                        AbstractC0116.m1242(identityHashMap, interfaceC22809, Boolean.TRUE);
                        c13856M45220 = C19606.m45220(interfaceC22808);
                        c10655M45237 = C19606.m45237(c13856M45220);
                        if (C1146.m4231()) {
                            iM3169 = C0619.m2761("᩷ᩴ") ^ i9;
                            i = ((iM3169 ^ i8) * (-19243)) ^ 297784762;
                            i2 = 828676469;
                        } else {
                            iM3169 = C0773.m3169("ۗۖ") ^ i9;
                            i = ((iM3169 ^ i8) * 29007) ^ (-835540045);
                            i2 = 481157702;
                        }
                        i14 = iM3169 ^ i2;
                        i16 = i;
                        break;
                    case -1551506180:
                    case 741507041:
                        C17037 c17037M47504 = C20767.m47504(length, false);
                        long jM27161 = c10655M45237.m27161();
                        if (C4282.f15546 > 0) {
                            long jM27162 = c10655M45237.m27162();
                            if (!RunnableC1848.f6235) {
                                this.f61954 = new C21381(c13856M45220, c17037M47504, false, 0L, jM27161, jM27162, 0L, 0L, 0L);
                                this.f61947 = file;
                                return;
                            }
                            iM2761 = C0773.m3169("۠᩷") ^ i8;
                            i5 = ((iM2761 ^ i9) * (-12885)) ^ (-850168380);
                            i6 = -2072999784;
                            i15 = i5;
                            i14 = iM2761 ^ i6;
                        } else {
                            arrayDeque = arrayDeque2;
                            iM31610 = C0773.m3169("ۧ᩶") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-15339)) ^ (-545320998);
                            i4 = 2112193774;
                            i14 = i4 ^ iM31610;
                            interfaceC22809 = interfaceC22808;
                            i16 = i3;
                            arrayDeque2 = arrayDeque;
                        }
                        break;
                    case -1119879066:
                    case 1251023312:
                        C2419.m8174();
                        C3779.m12264();
                        iM2761 = C0619.m2761("֨ۚ") ^ i8;
                        i5 = ((iM2761 ^ i9) * (-311)) ^ 2045682838;
                        i6 = -756030944;
                        i15 = i5;
                        i14 = iM2761 ^ i6;
                        break;
                    case -795346142:
                    case 1364947392:
                        arrayDeque2 = new ArrayDeque();
                        if (AbstractC0116.f1064 <= 0) {
                            iM3169 = C0773.m3169("ۗۖ") ^ i9;
                            i = ((iM3169 ^ i8) * 29007) ^ (-835540045);
                            i2 = 481157702;
                        } else {
                            iM3169 = C0773.m3169("ۗܽ") ^ i8;
                            i = ((iM3169 ^ i9) * 29949) ^ (-2015305431);
                            i2 = -170502641;
                        }
                        i14 = iM3169 ^ i2;
                        i16 = i;
                        break;
                    case -611733726:
                    case 873019661:
                        C3998.m12920();
                        if (C1564.f5401 > 0) {
                            iM2761 = C0619.m2761("֨ۚ") ^ i8;
                            i5 = ((iM2761 ^ i9) * (-311)) ^ 2045682838;
                            i6 = -756030944;
                        } else {
                            iM2761 = C0773.m3169("֡᩸") ^ i9;
                            i5 = ((iM2761 ^ i8) * (-30159)) ^ 379806823;
                            i6 = 799210437;
                        }
                        i15 = i5;
                        i14 = iM2761 ^ i6;
                        break;
                    case -531487999:
                    case 1195675153:
                        arrayDeque = arrayDeque2;
                        this.f61944 = f61936.getAndIncrement();
                        if (C23916.f77426 <= 0) {
                            iM31610 = C0773.m3169("ۧ᩶") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-15339)) ^ (-545320998);
                            i4 = 2112193774;
                        } else {
                            iM31610 = (C0773.m3169("ۘۨ") + i9) * (-73);
                            i3 = ((iM31610 ^ i8) * (-27519)) ^ 1865603228;
                            i4 = 1276875964;
                        }
                        i14 = i4 ^ iM31610;
                        interfaceC22809 = interfaceC22808;
                        i16 = i3;
                        arrayDeque2 = arrayDeque;
                        break;
                    case -284735531:
                    case 1838334370:
                        if (C3779.f12953 <= 0) {
                            iM3169 = C0773.m3169("ۗۖ") ^ i9;
                            i = ((iM3169 ^ i8) * 29007) ^ (-835540045);
                            i2 = 481157702;
                            i14 = iM3169 ^ i2;
                            i16 = i;
                        } else {
                            iM2761 = C0619.m2761("֨ۚ") ^ i8;
                            i5 = ((iM2761 ^ i9) * (-311)) ^ 2045682838;
                            i6 = -756030944;
                            i15 = i5;
                            i14 = iM2761 ^ i6;
                        }
                        break;
                    case -271526142:
                    case 1654000144:
                        AbstractC0116.m1243();
                        throw new RuntimeException();
                    case -70238450:
                    case 952999914:
                        identityHashMap2 = new IdentityHashMap();
                        if (C0773.f2792 > 0) {
                            iM3169 = C0619.m2761("᩺ܽ") ^ i8;
                            i = ((iM3169 ^ i9) * 13065) ^ (-1837715439);
                            i2 = -440117041;
                            i14 = iM3169 ^ i2;
                            i16 = i;
                        } else {
                            arrayDeque = arrayDeque2;
                            iM31610 = C0773.m3169("ۧ᩶") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-15339)) ^ (-545320998);
                            i4 = 2112193774;
                            i14 = i4 ^ iM31610;
                            interfaceC22809 = interfaceC22808;
                            i16 = i3;
                            arrayDeque2 = arrayDeque;
                        }
                        break;
                    case 2957234:
                    case 1169150795:
                        this.f61950 = arrayDeque2;
                        arrayDeque3 = new ArrayDeque();
                        if (C2702.f8586 > 0) {
                            iM3169 = C0773.m3169("ܺܿ") ^ i8;
                            i = ((iM3169 ^ i9) * (-28083)) ^ (-287600504);
                            i2 = -476779751;
                            i14 = iM3169 ^ i2;
                            i16 = i;
                        } else {
                            arrayDeque = arrayDeque2;
                            iM31610 = C0773.m3169("ۧ᩶") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-15339)) ^ (-545320998);
                            i4 = 2112193774;
                            i14 = i4 ^ iM31610;
                            interfaceC22809 = interfaceC22808;
                            i16 = i3;
                            arrayDeque2 = arrayDeque;
                        }
                        break;
                    case 776118113:
                    case 1408062046:
                        this.f61957 = arrayDeque3;
                        identityHashMap = new IdentityHashMap();
                        this.f61951 = identityHashMap;
                        if (AbstractC0641.f2496 < 0) {
                            iM3169 = (i9 - C0619.m2761("᩺᩻")) * (-69);
                            i = ((iM3169 ^ i8) * (-16399)) ^ 182594135;
                            i2 = 1361123595;
                            i14 = iM3169 ^ i2;
                            i16 = i;
                        } else {
                            arrayDeque = arrayDeque2;
                            iM31610 = C0773.m3169("ۧ᩶") ^ i9;
                            i3 = ((iM31610 ^ i8) * (-15339)) ^ (-545320998);
                            i4 = 2112193774;
                            i14 = i4 ^ iM31610;
                            interfaceC22809 = interfaceC22808;
                            i16 = i3;
                            arrayDeque2 = arrayDeque;
                        }
                        break;
                    case 1195554781:
                    case 1791563759:
                        C17359.requireNonNull(interfaceC22809, C3734.m12149(f61940, 1, 6, i12));
                        length = interfaceC22808.length();
                        if (length >= 0) {
                            iM3169 = (i8 - C0619.m2761("ܳ֫")) * 13;
                            i = ((iM3169 ^ i9) * (-16369)) ^ 797448627;
                            i2 = 1810822489;
                        } else {
                            iM3169 = C0619.m2761("ۧ֨") ^ i9;
                            i = ((iM3169 ^ i8) * (-13041)) ^ 1366936583;
                            i2 = 161575963;
                        }
                        i14 = iM3169 ^ i2;
                        i16 = i;
                        break;
                    default:
                        this.f61955 = identityHashMap2;
                        this.f61949 = new C25111();
                        if (C4238.m13540() <= 0) {
                            iM3169 = C0773.m3169("ۗۖ") ^ i9;
                            i = ((iM3169 ^ i8) * 29007) ^ (-835540045);
                            i2 = 481157702;
                        } else {
                            iM3169 = C0619.m2761("ۧ֡") ^ i9;
                            i = ((iM3169 ^ i8) * 29055) ^ (-1681720814);
                            i2 = 2014756763;
                        }
                        i14 = iM3169 ^ i2;
                        i16 = i;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[PHI: r9
      0x00d2: PHI (r9v5 l.᩻ܳܳ) = (r9v2 l.᩻ܳܳ), (r9v1 l.᩻ܳܳ), (r9v1 l.᩻ܳܳ), (r9v1 l.᩻ܳܳ) binds: [B:36:0x00d0, B:19:0x0068, B:17:0x0065, B:75:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    public C19143(C13111 c13111, C21381 c21381, C25111 c25111) {
        int iM3169;
        int i;
        ArrayList arrayList = null;
        int i2 = -1993910251;
        int i3 = C2375.f7641;
        int i4 = RunnableC0334.f1808;
        int iM2761 = (C0619.m2761("ۨ᩵") + i3) * 55;
        int i5 = ((iM2761 ^ i4) * (-17431)) ^ (-2130768086);
        int i6 = iM2761 ^ 564506441;
        IdentityHashMap identityHashMap = null;
        while (true) {
            C25111 c25112 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 8023) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -2086505749:
                    case 267385801:
                        this.f61954 = c21381;
                        AbstractC0116.m1242(identityHashMap, c13111, Boolean.TRUE);
                        return;
                    case -1885833013:
                    case 16380889:
                        this.f61941 = arrayList;
                        this.f61953 = c13111;
                        this.f61949 = c25111;
                        if (C0950.f3488 < 0) {
                            iM3169 = C0773.m3169("᩹᩸") ^ i3;
                            i5 = ((iM3169 ^ i4) * (-2011)) ^ (-296771505);
                            i = 2066882735;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31610 = C0773.m3169("᩵۠") ^ i3;
                            i5 = ((iM31610 ^ i4) * (-6685)) ^ 59625670;
                            i6 = iM31610 ^ 1490210172;
                            identityHashMap = null;
                        }
                        break;
                    case -1386539838:
                    case 2033927759:
                        C1146.m4231();
                        C2419.m8174();
                        throw new RuntimeException();
                    case -1274201761:
                    case 739205646:
                        C3077.m10041();
                        if (C4238.m13540() > 0) {
                            iM3169 = (i4 - C0619.m2761("ܽۧ")) * 109;
                            i5 = ((iM3169 ^ i3) * 16199) ^ (-188934555);
                            i = -1687796242;
                        } else {
                            iM3169 = C0619.m2761("֨ۨ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-2325)) ^ 939071460;
                            i = -41224841;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    case -1241014794:
                    case 386481029:
                        if (C3033.f9831 >= 0) {
                            iM3169 = (i3 - C0773.m3169("ܶ֨")) * 19;
                            i5 = ((iM3169 ^ i4) * (-32057)) ^ 869632287;
                            i = 1137956406;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31611 = C0773.m3169("᩵۠") ^ i3;
                            i5 = ((iM31611 ^ i4) * (-6685)) ^ 59625670;
                            i6 = iM31611 ^ 1490210172;
                            identityHashMap = null;
                        }
                        break;
                    case -936002056:
                    case -839347250:
                        RunnableC0334.m2063();
                        iM3169 = (i4 - C0619.m2761("ܽۧ")) * 109;
                        i5 = ((iM3169 ^ i3) * 16199) ^ (-188934555);
                        i = -1687796242;
                        i6 = iM3169 ^ i;
                        break;
                    case -364259778:
                    case 1655797598:
                        if (!C2878.f9462) {
                            this.f61950 = new ArrayDeque();
                            if (!C2878.f9462) {
                                this.f61957 = new ArrayDeque();
                                if (C3448.f11240 < 0) {
                                    identityHashMap = new IdentityHashMap();
                                    if (!C17202.f56030) {
                                    }
                                    iM3169 = C0619.m2761("֫֨") ^ i4;
                                    i5 = ((iM3169 ^ i3) * (-18421)) ^ 343611456;
                                    i = 916820435;
                                    i6 = iM3169 ^ i;
                                } else {
                                    int iM31612 = C0773.m3169("᩵۠") ^ i3;
                                    i5 = ((iM31612 ^ i4) * (-6685)) ^ 59625670;
                                    i6 = iM31612 ^ 1490210172;
                                    identityHashMap = null;
                                }
                                break;
                            }
                        }
                        break;
                    case -274213773:
                    case -80265686:
                        if (!C0619.f2439) {
                            iM3169 = (i4 - C0619.m2761("ܽۧ")) * 109;
                            i5 = ((iM3169 ^ i3) * 16199) ^ (-188934555);
                            i = -1687796242;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31613 = C0773.m3169("᩵۠") ^ i3;
                            i5 = ((iM31613 ^ i4) * (-6685)) ^ 59625670;
                            i6 = iM31613 ^ 1490210172;
                            identityHashMap = null;
                        }
                        break;
                    case 52091457:
                    case 1599816984:
                        this.f61951 = identityHashMap;
                        if (!RunnableC3646.f12471) {
                            this.f61955 = new IdentityHashMap();
                            if (C2966.f9654 < 0) {
                                c25112 = new C25111();
                                if (C1783.f6087 <= 0) {
                                    iM3169 = (i4 - C0619.m2761("ܽۧ")) * 109;
                                    i5 = ((iM3169 ^ i3) * 16199) ^ (-188934555);
                                    i = -1687796242;
                                } else {
                                    iM3169 = (i4 - C0773.m3169("ۢᩴ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                    i5 = ((iM3169 ^ i3) * 12041) ^ 561606208;
                                    i = -1743823467;
                                }
                                i6 = iM3169 ^ i;
                            }
                        }
                        break;
                    case 111816228:
                    case 1033911043:
                        this.f61944 = f61936.getAndIncrement();
                        if (C3492.f12043 <= 0) {
                            iM3169 = C0619.m2761("֨ۨ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-2325)) ^ 939071460;
                            i = -41224841;
                        } else {
                            iM3169 = (i3 - C0773.m3169("᩹ۘ")) * (-37);
                            i5 = ((iM3169 ^ i4) * 14113) ^ 1142327121;
                            i = 2130531456;
                        }
                        i6 = iM3169 ^ i;
                        break;
                    default:
                        this.f61949 = c25112;
                        arrayList = new ArrayList();
                        if (!C2023.f6737) {
                            iM3169 = C0773.m3169("ۗܽ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 18001) ^ (-370055198);
                            i = -79284236;
                            i6 = iM3169 ^ i;
                        } else {
                            int iM31614 = C0773.m3169("᩵۠") ^ i3;
                            i5 = ((iM31614 ^ i4) * (-6685)) ^ 59625670;
                            i6 = iM31614 ^ 1490210172;
                            identityHashMap = null;
                        }
                        break;
                }
            }
            int iM31615 = (i4 - C0773.m3169("᩸᩷")) * (-105);
            i5 = ((iM31615 ^ i3) * 26283) ^ (-1506820304);
            i6 = iM31615 ^ 1134329414;
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private C21381 m44338() throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = -1278464652;
        int i5 = C2288.f7433;
        int i6 = AbstractC0641.f2496;
        int iM2761 = (C0619.m2761("ۢᩳ") + i5) * (-43);
        int i7 = ((iM2761 ^ i6) * 6333) ^ (-1738900786);
        int i8 = 720298460;
        while (true) {
            i4 = ((((i4 ^ i6) * 6191) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -1926599325:
                case -1056471666:
                    return this.f61954;
                case -1725896302:
                case 1260201842:
                    if (this.f61943) {
                        iM2761 = C0619.m2761("۟۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * 15537) ^ (-506887628);
                        i8 = 1377997547;
                    } else {
                        iM2761 = C0619.m2761("ܰۙ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-31705)) ^ (-1839550201);
                        i8 = -1554692230;
                    }
                    break;
                case -1703514276:
                case -76387706:
                    if ((s * s2) - i2 > 0) {
                        iM2761 = (i5 - C0773.m3169("ۡ۟")) * (-95);
                        i7 = ((iM2761 ^ i6) * 15701) ^ 233021805;
                        i8 = -347411310;
                    } else {
                        iM2761 = C0619.m2761("֨ܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-16817)) ^ (-92442758);
                        i8 = 1694156455;
                    }
                    break;
                case -1521166142:
                case 1840120352:
                    if (this.f61946) {
                        iM2761 = C0773.m3169("ܺ۬") ^ i5;
                        i7 = ((iM2761 ^ i6) * 21509) ^ (-1218716541);
                        i8 = 2055664190;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۨܶ")) * 37;
                        i7 = ((iM2761 ^ i5) * (-19671)) ^ (-1869736271);
                        i8 = -1986116058;
                    }
                    break;
                case -1258821559:
                case -1218344789:
                    if (C2878.m9491() > 0) {
                        iM2761 = C0773.m3169("ۖܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 29125) ^ (-1739472593);
                        i8 = -1553020026;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩻") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-11053)) ^ 908033999;
                        i8 = 618542637;
                    }
                    break;
                case -787498320:
                case 1457912474:
                    sArr = f61940;
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("ۡ֫") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-19723)) ^ (-1066201510);
                        i8 = 1668109218;
                    } else {
                        iM2761 = (C0773.m3169("֫֡") ^ i5) * 67;
                        i7 = ((iM2761 ^ i6) * (-29393)) ^ (-263103073);
                        i8 = 258724008;
                    }
                    break;
                case -422939208:
                case -298850850:
                    i3 = 54849;
                    iM2761 = C0773.m3169("֡᩵") ^ i6;
                    i7 = ((iM2761 ^ i5) * 9947) ^ (-1057622213);
                    i8 = -411345114;
                    break;
                case -373809990:
                case 1847252713:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۛܰ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 11125) ^ 1772189968;
                        i8 = -245479913;
                    } else {
                        iM2761 = C0619.m2761("᩺ܶ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-14173)) ^ 447993033;
                        i8 = 1452963068;
                    }
                    break;
                case -271158417:
                case 1537849312:
                    C13473.m33144();
                    C1519.m5403();
                    return null;
                case 70362044:
                case 700155241:
                    C2485.m8357();
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ۛܰ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 11125) ^ 1772189968;
                        i8 = -245479913;
                    } else {
                        iM2761 = (C0619.m2761("ۗ۟") ^ i6) * (-95);
                        i7 = ((iM2761 ^ i5) * 15987) ^ (-318185558);
                        i8 = 561910458;
                    }
                    break;
                case 247031000:
                case 560331687:
                    s = sArr[c];
                    i = s * s;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("֫֡") ^ i5) * 67;
                        i7 = ((iM2761 ^ i6) * (-29393)) ^ (-263103073);
                        i8 = 258724008;
                    } else {
                        iM2761 = C0773.m3169("ܺۛ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-6669)) ^ 250675993;
                        i8 = 823768728;
                    }
                    break;
                case 379590562:
                case 2072709200:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0619.m2761("ܶ᩻") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-11053)) ^ 908033999;
                        i8 = 618542637;
                    } else {
                        iM2761 = (C0619.m2761("ۗ۟") ^ i6) * (-95);
                        i7 = ((iM2761 ^ i5) * 15987) ^ (-318185558);
                        i8 = 561910458;
                    }
                    break;
                case 395327652:
                case 1183640437:
                    AbstractC3624.m11755();
                    iM2761 = (C0619.m2761("ۗ۟") ^ i6) * (-95);
                    i7 = ((iM2761 ^ i5) * 15987) ^ (-318185558);
                    i8 = 561910458;
                    break;
                case 416560017:
                case 1574749891:
                    short[] sArr2 = f61940;
                    if (C0487.f2131 > 0) {
                        if (C1146.m4231()) {
                            throw new IOException(C11235.m28300(sArr2, 906, 21, i3));
                        }
                        iM2761 = C0619.m2761("ܶ᩻") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-11053)) ^ 908033999;
                        i8 = 618542637;
                    } else {
                        iM2761 = (C0619.m2761("ۗ۟") ^ i6) * (-95);
                        i7 = ((iM2761 ^ i5) * 15987) ^ (-318185558);
                        i8 = 561910458;
                    }
                    break;
                case 539097933:
                case 885745757:
                    c = 905;
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("ۖܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 29125) ^ (-1739472593);
                        i8 = -1553020026;
                    } else {
                        iM2761 = (C0773.m3169("ܽ֡") ^ i6) * (-85);
                        i7 = ((iM2761 ^ i5) * (-15329)) ^ 1944697518;
                        i8 = -968522507;
                    }
                    break;
                case 791328823:
                case 1397454628:
                    i2 = 241895809 + i;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۗ۟") ^ i6) * (-95);
                        i7 = ((iM2761 ^ i5) * 15987) ^ (-318185558);
                        i8 = 561910458;
                    } else {
                        iM2761 = C0773.m3169("۫ۢ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-27149)) ^ 1167042208;
                        i8 = 964899415;
                    }
                    break;
                case 812674647:
                case 1408760461:
                    short[] sArr3 = f61940;
                    if (AbstractC3624.f12429 > 0) {
                        if (C2419.m8174() < 0) {
                            throw new IOException(C3492.m11486(sArr3, 927, 33, i3));
                        }
                        iM2761 = C0619.m2761("ܶ᩻") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-11053)) ^ 908033999;
                        i8 = 618542637;
                    } else {
                        iM2761 = (C0773.m3169("֫֡") ^ i5) * 67;
                        i7 = ((iM2761 ^ i6) * (-29393)) ^ (-263103073);
                        i8 = 258724008;
                    }
                    break;
                case 1755315981:
                case 2018035025:
                    i3 = 51302;
                    iM2761 = C0773.m3169("֡᩵") ^ i6;
                    i7 = ((iM2761 ^ i5) * 9947) ^ (-1057622213);
                    i8 = -411345114;
                    break;
                default:
                    s2 = 31106;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ۖܳ") ^ i6;
                        i7 = ((iM2761 ^ i5) * 29125) ^ (-1739472593);
                        i8 = -1553020026;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩵") ^ i5) * (-117);
                        i7 = ((iM2761 ^ i6) * 21343) ^ 1981649002;
                        i8 = -346912988;
                    }
                    break;
            }
        }
    }

    public final int length() {
        return this.f61954.m48614();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m44373() {
        return this.f61954.f68091;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m44278() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -355783408;
        int i6 = C1783.f6087;
        int i7 = C2419.f7754;
        int iM3169 = (C0773.m3169("۟֨") ^ i6) * 35;
        int i8 = ((iM3169 ^ i7) * (-11843)) ^ (-1839322157);
        int i9 = -881136511;
        while (true) {
            i5 = ((((i5 ^ i7) * 23589) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -1857932099:
                case 2108991445:
                    if (i - (i2 + i3) > 0) {
                        iM3169 = (i7 - C0773.m3169("ܰۖ")) * 43;
                        i8 = ((iM3169 ^ i6) * (-12097)) ^ (-1142662099);
                        i9 = 1046607615;
                    } else {
                        iM3169 = (C0773.m3169("֡᩶") ^ i6) * (-53);
                        i8 = ((iM3169 ^ i7) * 16695) ^ (-110977234);
                        i9 = 500253451;
                    }
                    break;
                case -1554115171:
                case -1353441229:
                    return;
                case -1400383091:
                case 1665060204:
                    if (this.f61952 == null) {
                        iM3169 = C0619.m2761("ۤܰ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-4393)) ^ 1685629566;
                        i9 = 656620917;
                    } else {
                        iM3169 = (C0773.m3169("ۙ᩺") + i7) * (-13);
                        i8 = ((iM3169 ^ i6) * (-1315)) ^ (-1370925791);
                        i9 = 830127532;
                    }
                    break;
                case -1093932694:
                case 1531030585:
                    i4 = 12711;
                    iM3169 = (C0619.m2761("᩻ܿ") ^ i6) * 45;
                    i8 = ((iM3169 ^ i7) * 2175) ^ 503729985;
                    i9 = -1489122201;
                    break;
                case -929758196:
                case -746038163:
                    i = s * s2;
                    i2 = s * s;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۗ᩶") ^ i7) * 69;
                        i8 = ((iM3169 ^ i6) * (-7915)) ^ (-1450666979);
                        i9 = 19722495;
                    } else {
                        iM3169 = C0773.m3169("ۧᩴ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-6653)) ^ 2144854272;
                        i9 = 1322335687;
                    }
                    break;
                case -919396874:
                case 147623424:
                    C2702.m8876();
                    if (C2485.m8357() > 0) {
                        iM3169 = C0773.m3169("۬᩸") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-24993)) ^ (-1361216083);
                        i9 = -1467739230;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    }
                    break;
                case -711517773:
                case 1487724888:
                    i4 = 61968;
                    iM3169 = (C0619.m2761("᩻ܿ") ^ i6) * 45;
                    i8 = ((iM3169 ^ i7) * 2175) ^ 503729985;
                    i9 = -1489122201;
                    break;
                case -556016891:
                case 1728944338:
                    RunnableC0334.m2063();
                    AbstractC0641.m2813();
                    iM3169 = C0773.m3169("᩷ܰ") ^ i6;
                    i8 = ((iM3169 ^ i7) * (-23989)) ^ 893795875;
                    i9 = 894060550;
                    break;
                case -491746472:
                case 44869221:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("ۡܽ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22983)) ^ 871012311;
                        i9 = -1796247921;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    }
                    break;
                case -318246796:
                case -296851076:
                    sArr = f61940;
                    if (C1519.m5403()) {
                        iM3169 = (C0773.m3169("᩻ۚ") + i6) * (-71);
                        i8 = ((iM3169 ^ i7) * (-12503)) ^ 1341229660;
                        i9 = 446399266;
                    } else {
                        iM3169 = C0773.m3169("۬᩸") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-24993)) ^ (-1361216083);
                        i9 = -1467739230;
                    }
                    break;
                case 82158684:
                case 350882671:
                    i3 = 351712516;
                    if (C2966.m9664()) {
                        iM3169 = (C0773.m3169("ۤۖ") ^ i7) * (-43);
                        i8 = ((iM3169 ^ i6) * (-11989)) ^ (-62052782);
                        i9 = 1850298509;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩶") ^ i7) * 69;
                        i8 = ((iM3169 ^ i6) * (-7915)) ^ (-1450666979);
                        i9 = 19722495;
                    }
                    break;
                case 368506092:
                case 1879738863:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("ۡܽ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22983)) ^ 871012311;
                        i9 = -1796247921;
                    } else {
                        iM3169 = C0619.m2761("ᩴۧ") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-8361)) ^ (-409977464);
                        i9 = -149716650;
                    }
                    break;
                case 547729821:
                case 1530451575:
                    short[] sArr2 = f61940;
                    if (!C4282.m13644()) {
                        iM3169 = C0773.m3169("ۡܽ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22983)) ^ 871012311;
                        i9 = -1796247921;
                    } else {
                        if (C3033.f9831 < 0) {
                            throw new IllegalStateException(RunnableC3646.m11809(sArr2, 30, 24, i4));
                        }
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    }
                    break;
                case 593858326:
                case 1003358747:
                    s = sArr[c];
                    s2 = 37508;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0773.m3169("ۗ᩶") ^ i7) * 69;
                        i8 = ((iM3169 ^ i6) * (-7915)) ^ (-1450666979);
                        i9 = 19722495;
                    } else {
                        iM3169 = C0773.m3169("ۗۤ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-5329)) ^ 987855870;
                        i9 = -1715671178;
                    }
                    break;
                case 704256062:
                case 2137487919:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۚ᩷")) * 29;
                        i8 = ((iM3169 ^ i7) * (-21451)) ^ 406776962;
                        i9 = 930315658;
                    }
                    break;
                case 946085536:
                case 1411634947:
                    c = 29;
                    if (C17202.f56030) {
                        iM3169 = (i7 - C0619.m2761("ܳᩴ")) * 97;
                        i8 = ((iM3169 ^ i6) * (-29479)) ^ (-134218006);
                        i9 = -1771818913;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    }
                    break;
                case 2024151645:
                case 2138905193:
                    AbstractC0641.m2813();
                    C1783.m6232();
                    return;
                case 2029068510:
                case 2056763881:
                    C2702.m8876();
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("᩷ܰ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-23989)) ^ 893795875;
                        i9 = 894060550;
                    } else {
                        iM3169 = C0773.m3169("ۡܽ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-22983)) ^ 871012311;
                        i9 = -1796247921;
                    }
                    break;
                default:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ۘ۬") ^ i7) * 43;
                        i8 = ((iM3169 ^ i6) * 10957) ^ (-818167429);
                        i9 = -1796188076;
                    } else {
                        iM3169 = C0619.m2761("᩻֨") ^ i7;
                        i8 = ((iM3169 ^ i6) * 3243) ^ (-1539130536);
                        i9 = -1341069913;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m44379() {
        return this.f61954.f68094;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m44357() {
        return this.f61943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44312(InterfaceC22808 interfaceC22808, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C10938 c10938 = null;
        C6465 c6465 = null;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        int i = 0;
        int i2 = -1517060997;
        int i3 = C2287.f7432;
        int i4 = C1826.f6190;
        int iM2761 = C0619.m2761("ۗۖ") ^ i4;
        int i5 = ((iM2761 ^ i3) * 2077) ^ 1852505797;
        int i6 = 621194465;
        while (true) {
            i2 = ((((i2 ^ i3) * 9699) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2105803280:
                case 1099596612:
                    AbstractC0116.m1243();
                    C0773.m3161();
                    iM2761 = C0619.m2761("ۡܰ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                    i6 = 1382215715;
                    break;
                case -2085431366:
                case 1872491374:
                    interfaceC22808Arr = c6465.f21763;
                    length = interfaceC22808Arr.length;
                    i = 0;
                    iM2761 = C0773.m3169("ܳ֡") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-173)) ^ (-206546859);
                    i6 = 850042009;
                    break;
                case -2059016049:
                case 1732080027:
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = (i4 - C0619.m2761("֨ܳ")) * 101;
                        i5 = ((iM2761 ^ i3) * (-24863)) ^ (-1252002803);
                        i6 = 615578816;
                    } else {
                        iM2761 = (C0773.m3169("ۛܳ") ^ i3) * 39;
                        i5 = ((iM2761 ^ i4) * 3639) ^ 863378327;
                        i6 = 1153141279;
                    }
                    break;
                case -2031006897:
                case 2089240728:
                    RunnableC0334.m2054(arrayList, c10938);
                    break;
                case -1502808320:
                case 1102414793:
                    c10938 = (C10938) interfaceC22808;
                    if (AbstractC3624.m11766(identityHashMap, c10938, Boolean.TRUE) == null) {
                        iM2761 = (C0619.m2761("᩺ܺ") ^ i4) * (-83);
                        i5 = ((iM2761 ^ i3) * (-11155)) ^ 290700925;
                        i6 = 904892547;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8535) ^ 1590113773;
                        i6 = -619622351;
                    }
                    break;
                case -1397181551:
                case 1105413593:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ۡܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                        i6 = 1382215715;
                    } else {
                        iM2761 = C0619.m2761("᩹᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22979)) ^ 1638056057;
                        i6 = 64687459;
                    }
                    break;
                case -1296177570:
                case 155790187:
                    if (i < length) {
                        iM2761 = C0773.m3169("ܿ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17563) ^ 1229281425;
                        i6 = -1527167116;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8535) ^ 1590113773;
                        i6 = -619622351;
                    }
                    break;
                case -1223103074:
                case 1659908184:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("ۛ᩷") ^ i4) * 89;
                        i5 = ((iM2761 ^ i3) * 31793) ^ 169031344;
                        i6 = 1323027503;
                    } else {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 7389) ^ 1473193591;
                        i6 = 1451087684;
                    }
                    break;
                case -1074308954:
                case 330621177:
                    break;
                case -1071870069:
                case 1955211752:
                    m44312(interfaceC22808Arr[i], identityHashMap, arrayList, identityHashMap2);
                    i++;
                    iM2761 = C0773.m3169("ܳ֡") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-173)) ^ (-206546859);
                    i6 = 850042009;
                    break;
                case -985776894:
                case 532072278:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27557) ^ (-2112280028);
                        i6 = 1601143508;
                    } else {
                        iM2761 = C0773.m3169("ۨ۬") ^ i4;
                        i5 = ((iM2761 ^ i3) * 391) ^ (-57852210);
                        i6 = 688735411;
                    }
                    break;
                case -953149464:
                case 839534863:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ۡܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                        i6 = 1382215715;
                    } else {
                        iM2761 = C0619.m2761("ۛۧ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-1311)) ^ (-1075755267);
                        i6 = 212573609;
                    }
                    break;
                case -736428162:
                case 914825131:
                    C3033.m9845();
                    C2702.m8876();
                    break;
                case -648376470:
                case -31756286:
                    c6465 = (C6465) interfaceC22808;
                    if (AbstractC3624.m11766(identityHashMap2, c6465, Boolean.TRUE) != null) {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8535) ^ 1590113773;
                        i6 = -619622351;
                    } else {
                        iM2761 = C0773.m3169("֫ܰ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-3529)) ^ 513806729;
                        i6 = -275981438;
                    }
                    break;
                case -623480053:
                case -545578810:
                    C0619.m2763();
                    if (C1826.f6190 <= 0) {
                        iM2761 = (C0619.m2761("᩸ۘ") + i3) * 11;
                        i5 = ((iM2761 ^ i4) * (-10667)) ^ (-1495035008);
                        i6 = 56404595;
                    } else {
                        iM2761 = C0619.m2761("ۡܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                        i6 = 1382215715;
                    }
                    break;
                case -563845559:
                case -379686425:
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۡܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                        i6 = 1382215715;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۛ") + i3) * (-111);
                        i5 = ((iM2761 ^ i4) * 11209) ^ (-815421943);
                        i6 = -1620130162;
                    }
                    break;
                case -359298676:
                case 1668948004:
                    RunnableC3055.m9933();
                    if (!C17202.f56030) {
                        iM2761 = (C0619.m2761("᩸ۘ") + i3) * 11;
                        i5 = ((iM2761 ^ i4) * (-10667)) ^ (-1495035008);
                        i6 = 56404595;
                    } else {
                        iM2761 = C0773.m3169("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27557) ^ (-2112280028);
                        i6 = 1601143508;
                    }
                    break;
                case -348837506:
                case 276964472:
                    if (C3099.m10095()) {
                        iM2761 = (C0773.m3169("ۛ᩷") ^ i4) * 89;
                        i5 = ((iM2761 ^ i3) * 31793) ^ 169031344;
                        i6 = 1323027503;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۜ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM2761 ^ i3) * 7879) ^ 726402170;
                        i6 = -1649638811;
                    }
                    break;
                case 337983041:
                case 1032666304:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27557) ^ (-2112280028);
                        i6 = 1601143508;
                    } else {
                        iM2761 = (C0619.m2761("۠ۚ") + i3) * (-15);
                        i5 = ((iM2761 ^ i4) * (-14289)) ^ (-891132456);
                        i6 = -1146166063;
                    }
                    break;
                case 523231736:
                case 1307093584:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("᩻ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27557) ^ (-2112280028);
                        i6 = 1601143508;
                    } else {
                        iM2761 = C0773.m3169("۬ۙ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 7851) ^ (-2100798393);
                        i6 = 923774714;
                    }
                    break;
                case 749052564:
                case 1388769633:
                    if (interfaceC22808 instanceof C6465) {
                        iM2761 = (i3 - C0619.m2761("֫᩷")) * 95;
                        i5 = ((iM2761 ^ i4) * 15395) ^ 1767238724;
                        i6 = 1361186921;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8535) ^ 1590113773;
                        i6 = -619622351;
                    }
                    break;
                case 771524790:
                case 1563562572:
                    C3690.m11987();
                    if (!C2354.m7983()) {
                        iM2761 = (C0619.m2761("᩸ۘ") + i3) * 11;
                        i5 = ((iM2761 ^ i4) * (-10667)) ^ (-1495035008);
                        i6 = 56404595;
                    } else {
                        iM2761 = (i4 - C0619.m2761("֨ܳ")) * 101;
                        i5 = ((iM2761 ^ i3) * (-24863)) ^ (-1252002803);
                        i6 = 615578816;
                    }
                    break;
                case 849075783:
                case 1950385042:
                    if (interfaceC22808 instanceof C10938) {
                        iM2761 = (C0619.m2761("᩸۫") ^ i3) * 73;
                        i5 = ((iM2761 ^ i4) * (-31391)) ^ (-1273070908);
                        i6 = 596629706;
                    } else {
                        iM2761 = (C0619.m2761("֨᩻") ^ i4) * (-85);
                        i5 = ((iM2761 ^ i3) * (-20309)) ^ 399727890;
                        i6 = 761601501;
                    }
                    break;
                default:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0619.m2761("ۡܰ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14291) ^ 682337414;
                        i6 = 1382215715;
                    } else {
                        iM2761 = C0773.m3169("ۨܺ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 2665) ^ 1760395954;
                        i6 = 1766404796;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x027a  */
    /* JADX WARN: Code duplicated, block: B:80:0x02df  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if (l.C1343.m4943() == false) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m44305(l.C13856 r21, java.util.IdentityHashMap r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44305(l.۬۫ܳ, java.util.IdentityHashMap, java.util.ArrayList):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x019b A[PHI: r6 r8 r9 r19
      0x019b: PHI (r6v5 long) = (r6v3 long), (r6v1 long), (r6v1 long) binds: [B:45:0x0199, B:41:0x0171, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r8v4 l.۬۫ܳ) = (r8v2 l.۬۫ܳ), (r8v1 l.۬۫ܳ), (r8v1 l.۬۫ܳ) binds: [B:45:0x0199, B:41:0x0171, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r9v5 long) = (r9v1 long), (r9v3 long), (r9v1 long) binds: [B:45:0x0199, B:41:0x0171, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r19v26 java.util.Iterator) = (r19v12 java.util.Iterator), (r19v13 java.util.Iterator), (r19v27 java.util.Iterator) binds: [B:45:0x0199, B:41:0x0171, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (l.C1826.f6190 > 0) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m44340(l.C13856 r24) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44340(l.۬۫ܳ):long");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44349(InterfaceC22808[] interfaceC22808Arr, Throwable th) {
        int length = 0;
        int i = 0;
        InterfaceC22808 interfaceC22808 = null;
        IOException e = null;
        int i2 = -1557811288;
        int i3 = C1783.f6087;
        int i4 = C3033.f9831;
        int iM2761 = C0619.m2761("۠᩹") ^ i4;
        int i5 = ((iM2761 ^ i3) * 26517) ^ (-1582619011);
        int i6 = -325044631;
        while (true) {
            i2 = ((((i2 ^ i3) * 5681) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1983028594:
                case 58522202:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("ۛ᩻") ^ i4) * 13;
                        i5 = ((iM2761 ^ i3) * (-26651)) ^ (-387568411);
                        i6 = 1215162953;
                    } else {
                        iM2761 = C0773.m3169("ۖܰ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-1671)) ^ (-1598685092);
                        i6 = 2083536778;
                    }
                    break;
                case -1866429195:
                case 410565752:
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩹") ^ i3;
                        i5 = ((iM2761 ^ i4) * 31829) ^ (-531461546);
                        i6 = 521221199;
                    }
                    break;
                case -1831678289:
                case 1935120490:
                    length = interfaceC22808Arr.length;
                    i = 0;
                    iM2761 = C0619.m2761("۠۟") ^ i4;
                    i5 = ((iM2761 ^ i3) * 30319) ^ (-1739633186);
                    i6 = 1884034853;
                    break;
                case -1756497244:
                case 1447038257:
                    interfaceC22808 = interfaceC22808Arr[i];
                    iM2761 = C0773.m3169("ᩳ᩶") ^ i4;
                    i5 = ((iM2761 ^ i3) * 17817) ^ 370725263;
                    i6 = -1484343673;
                    break;
                case -1740550868:
                case 906268006:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = (C0773.m3169("ۛۚ") ^ i4) * 87;
                        i5 = ((iM2761 ^ i3) * 18009) ^ 2135289440;
                        i6 = -1671420101;
                    }
                    break;
                case -1693536564:
                case 326402886:
                    i++;
                    iM2761 = C0619.m2761("۠۟") ^ i4;
                    i5 = ((iM2761 ^ i3) * 30319) ^ (-1739633186);
                    i6 = 1884034853;
                    break;
                case -1617891472:
                case 623371523:
                    if (i < length) {
                        iM2761 = C0619.m2761("ܰ۬") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-5585)) ^ (-1214841419);
                        i6 = -579242258;
                    } else {
                        iM2761 = (C0619.m2761("᩻᩺") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2761 ^ i4) * (-24377)) ^ (-782218792);
                        i6 = 1716088839;
                    }
                    break;
                case -1156897654:
                case 148198681:
                    C1146.m4219(th, e);
                    iM2761 = (C0773.m3169("ܳۙ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i5 = ((iM2761 ^ i3) * 8627) ^ (-1168891432);
                    i6 = -630349220;
                    break;
                case -1075592959:
                case 2032615112:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("ܽۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-27691)) ^ 787618501;
                        i6 = -1811777147;
                    } else {
                        iM2761 = C0773.m3169("ۙۨ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-13907)) ^ 710244830;
                        i6 = -1707387288;
                    }
                    break;
                case -804264783:
                case -592443176:
                    if (C3734.m12152() >= 0) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = (C0773.m3169("ܰۧ") + i3) * (-115);
                        i5 = ((iM2761 ^ i4) * 7451) ^ (-745625545);
                        i6 = -1548752789;
                    }
                    break;
                case -739639344:
                case 354819276:
                    C2485.m8357();
                    if (C3448.m11248() == 0) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = C0619.m2761("᩺֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * 3789) ^ (-581861067);
                        i6 = -1661385467;
                    }
                    break;
                case -695642652:
                case 161668386:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩴ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2761 ^ i3) * (-3123)) ^ (-569567033);
                        i6 = 662246051;
                    }
                    break;
                case -642229130:
                case 2022632038:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۛ᩻") ^ i4) * 13;
                        i5 = ((iM2761 ^ i3) * (-26651)) ^ (-387568411);
                        i6 = 1215162953;
                    } else {
                        iM2761 = C0619.m2761("᩹ۧ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 13703) ^ (-993087895);
                        i6 = -86787780;
                    }
                    break;
                case -566823090:
                case 134289726:
                    C0619.m2763();
                    break;
                case -539259290:
                case 1213848398:
                    try {
                        RunnableC3055.m9929(interfaceC22808);
                        iM2761 = (C0773.m3169("ܳۙ") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2761 ^ i3) * 8627) ^ (-1168891432);
                        i6 = -630349220;
                    } catch (IOException e2) {
                        e = e2;
                        iM2761 = (i3 - C0773.m3169("ܿ۟")) * 5;
                        i5 = ((iM2761 ^ i4) * (-10225)) ^ 1046470607;
                        i6 = -938825532;
                    }
                    break;
                case -322813334:
                case -287252297:
                    C2485.m8357();
                    RunnableC3055.m9933();
                    iM2761 = C0773.m3169("ܽۚ") ^ i3;
                    i5 = ((iM2761 ^ i4) * (-27691)) ^ 787618501;
                    i6 = -1811777147;
                    break;
                case 283367978:
                case 1717276395:
                    C4238.m13540();
                    if (!RunnableC0334.m2063()) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = C0773.m3169("ۤۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-9785)) ^ 1310963642;
                        i6 = 1595058508;
                    }
                    break;
                case 333169858:
                case 1931893960:
                    C3099.m10095();
                    if (C1826.m6301() >= 0) {
                        iM2761 = (C0773.m3169("֨ܶ") ^ i4) * (-93);
                        i5 = ((iM2761 ^ i3) * (-18669)) ^ (-1879335629);
                        i6 = 842871131;
                    } else {
                        iM2761 = C0773.m3169("ܽۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-27691)) ^ 787618501;
                        i6 = -1811777147;
                    }
                    break;
                case 383232854:
                case 1745258899:
                    break;
                case 1428532683:
                case 1694711515:
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("ۤۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-9785)) ^ 1310963642;
                        i6 = 1595058508;
                    } else {
                        iM2761 = (C0619.m2761("۟᩺") + i4) * (-39);
                        i5 = ((iM2761 ^ i3) * 14163) ^ (-1315658570);
                        i6 = 717472713;
                    }
                    break;
                case 1603393172:
                case 2097568339:
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0773.m3169("ܽۚ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-27691)) ^ 787618501;
                        i6 = -1811777147;
                    } else {
                        iM2761 = (C0773.m3169("۬ۘ") ^ i4) * (-101);
                        i5 = ((iM2761 ^ i3) * 16497) ^ (-1668086499);
                        i6 = -500385053;
                    }
                    break;
                default:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("ۛ᩻") ^ i4) * 13;
                        i5 = ((iM2761 ^ i3) * (-26651)) ^ (-387568411);
                        i6 = 1215162953;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩷") + i3) * (-101);
                        i5 = ((iM2761 ^ i4) * 30913) ^ 1720128620;
                        i6 = 718730988;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7210 m44288(C7210 c7210, File file) throws Throwable {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        int i5;
        int iM2763;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int iM31610;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        AutoCloseable autoCloseable;
        IOException iOException;
        IOException iOException2;
        int iM2764;
        int i14;
        File file2 = file;
        InterfaceC7509 interfaceC7509M41888 = null;
        int length = 0;
        Iterator itM4942 = null;
        AutoCloseable autoCloseable2 = null;
        boolean zM6317 = false;
        IOException iOException3 = null;
        IOException iOException4 = null;
        Throwable th = null;
        C8636 c8636 = null;
        boolean zM28304 = false;
        boolean zM28305 = false;
        InterfaceC4973 interfaceC4973M27755 = null;
        InterfaceC4973 interfaceC4973 = null;
        int i15 = 772831238;
        int i16 = C1146.f4234;
        int i17 = C2702.f8586;
        int iM31611 = C0773.m3169("᩶᩵") ^ i16;
        int i18 = ((iM31611 ^ i17) * 14919) ^ (-2050684359);
        int i19 = iM31611 ^ 865533482;
        InterfaceC4973 interfaceC4974 = null;
        C7210 c7211 = null;
        int i20 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-23775)) >> 31));
            switch (i15) {
                case -2113822159:
                case 1707336571:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    if (zM6317) {
                        iM31610 = (i16 - C0773.m3169("ۗܽ")) * (-73);
                        i9 = ((iM31610 ^ i17) * (-2249)) ^ (-1990065262);
                        i10 = 2137059423;
                    } else {
                        iM31610 = C0619.m2761("᩷ܶ") ^ i16;
                        i9 = ((iM31610 ^ i17) * (-31731)) ^ 723169417;
                        i10 = -148282154;
                    }
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -2081624425:
                case -1947246615:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    int i21 = i20;
                    short s = f61940[54];
                    if ((s * 29832) - ((s * s) + 222487056) > 0) {
                        iM2762 = C0773.m3169("ۙۚ") ^ i17;
                        i3 = ((iM2762 ^ i16) * (-23139)) ^ (-1075085604);
                        i4 = -54546664;
                    } else {
                        iM2762 = C0619.m2761("ܶܳ") ^ i16;
                        i3 = ((iM2762 ^ i17) * 1433) ^ 1470068547;
                        i4 = 304804219;
                    }
                    i5 = iM2762 ^ i4;
                    i20 = i21;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case -2012222343:
                case -589560917:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable = autoCloseable2;
                    z = zM6317;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM28305) {
                        iM2764 = C0773.m3169("᩹ᩳ") ^ i17;
                        i9 = ((iM2764 ^ i16) * (-28347)) ^ (-1943725963);
                        i14 = 1648638166;
                    } else {
                        iM2764 = (C0773.m3169("ۡܰ") + i16) * (-45);
                        i9 = ((iM2764 ^ i17) * 29243) ^ (-1021987643);
                        i14 = -597708759;
                    }
                    i11 = iM2764 ^ i14;
                    zM6317 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -1935183769:
                case 820518973:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    if (autoCloseable2 != null) {
                        iM31610 = (C0773.m3169("֡ܰ") + i16) * 69;
                        i9 = ((iM31610 ^ i17) * 8665) ^ (-1662013610);
                        i10 = -1480130410;
                    } else {
                        iM31610 = C0773.m3169("֡ۜ") ^ i17;
                        i9 = ((iM31610 ^ i16) * (-9609)) ^ 1108411918;
                        i10 = 1341039933;
                    }
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -1904773496:
                case -2229369:
                    AutoCloseable autoCloseable3 = autoCloseable2;
                    boolean z2 = zM6317;
                    int i22 = i20;
                    C17359.requireNonNull(file2, C4238.m13530(f61940, 55, 14, i22));
                    interfaceC4974 = null;
                    interfaceC7509M41888 = C17950.m41888(null);
                    length = c7210.length();
                    if (length <= 33554432) {
                        iM3169 = C0773.m3169("۟ۤ") ^ i17;
                        i7 = ((iM3169 ^ i16) * (-14689)) ^ 265795655;
                        i8 = -1945373891;
                    } else {
                        iM3169 = (C0773.m3169("֨ܶ") + i17) * (-121);
                        i7 = ((iM3169 ^ i16) * 6983) ^ 545183830;
                        i8 = -702748932;
                    }
                    int i23 = iM3169 ^ i8;
                    i20 = i22;
                    autoCloseable2 = autoCloseable3;
                    i19 = i23;
                    i18 = i7;
                    zM6317 = z2;
                    break;
                case -1753295725:
                case -1749413808:
                    try {
                        interfaceC4973.close();
                        iM2761 = (C0773.m3169("᩷᩻") ^ i17) * (-109);
                        i = ((iM2761 ^ i16) * (-9475)) ^ (-366702149);
                        i2 = -483134890;
                        i19 = iM2761 ^ i2;
                        i18 = i;
                    } catch (IOException | Error | RuntimeException e) {
                        th = e;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        z = zM6317;
                        autoCloseable2 = c7211;
                        int iM31612 = C0773.m3169("۫ۖ") ^ i16;
                        i19 = iM31612 ^ (-2137939084);
                        i18 = ((iM31612 ^ i17) * 9827) ^ (-699975451);
                        zM6317 = z;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        file2 = file;
                    }
                    break;
                case -1571599932:
                case 1327425868:
                    i20 = 35130;
                    iM2763 = C0619.m2761("ۙ᩵") ^ i16;
                    i3 = ((iM2763 ^ i17) * 453) ^ 1894153093;
                    i6 = 1336167225;
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case -1554189913:
                case 125892570:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    if (interfaceC4973 != null) {
                        iM31610 = (C0619.m2761("ܽܿ") + i17) * (-125);
                        i9 = ((iM31610 ^ i16) * (-7703)) ^ 253158221;
                        i10 = 1519775154;
                    } else {
                        iM31610 = C0773.m3169("᩶᩹") ^ i16;
                        i9 = ((iM31610 ^ i17) * (-1615)) ^ 2108147332;
                        i10 = 200589427;
                    }
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -1342314506:
                case -417868587:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = C1826.m6317(itM4942);
                    int iM31613 = (C0773.m3169("᩵ᩴ") ^ i17) * 31;
                    i9 = ((iM31613 ^ i16) * 19263) ^ (-386474293);
                    i11 = iM31613 ^ 1195825420;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -1269466522:
                case -478428115:
                    interfaceC4973M27755 = C10938.m27755(file2, length);
                    interfaceC4973 = interfaceC4973M27755;
                    iM2763 = (C0773.m3169("ܶܰ") + i16) * 83;
                    i3 = ((iM2763 ^ i17) * 17353) ^ (-189762308);
                    i6 = 1810493156;
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case -1263521244:
                case 1243878665:
                    return c7211;
                case -1261333627:
                case -579724326:
                    i20 = 6272;
                    iM2763 = C0619.m2761("ۙ᩵") ^ i16;
                    i3 = ((iM2763 ^ i17) * 453) ^ 1894153093;
                    i6 = 1336167225;
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case -1259874896:
                case 354601466:
                    throw new C13308();
                case -1190176580:
                case 1551029692:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    RunnableC3646.m11799(th, iOException3);
                    iM31610 = C0773.m3169("֡ۜ") ^ i17;
                    i9 = ((iM31610 ^ i16) * (-9609)) ^ 1108411918;
                    i10 = 1341039933;
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -1148268366:
                case 898868315:
                    throw th;
                case -999960732:
                case 26152870:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    if (C2375.m8058(interfaceC7509M41888)) {
                        iM2763 = C0619.m2761("ܳۡ") ^ i16;
                        i3 = ((iM2763 ^ i17) * 8645) ^ 721290377;
                        i6 = -1295513600;
                    } else {
                        iM2763 = C0773.m3169("ᩴܽ") ^ i16;
                        i3 = ((iM2763 ^ i17) * (-781)) ^ 387363560;
                        i6 = -344818207;
                    }
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case -987896075:
                case 45199372:
                    throw new C9446();
                case -968151441:
                case 1196622155:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    interfaceC4973M27755.finish();
                    c7210.m19801();
                    zM28304 = C11235.m28304(interfaceC7509M41888);
                    iM31610 = C0619.m2761("ᩳۙ") ^ i17;
                    i9 = ((iM31610 ^ i16) * (-29467)) ^ (-2065961474);
                    i10 = -1724500736;
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -968060734:
                case 575597692:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    C1146.m4219(th, iOException4);
                    iM31610 = C0773.m3169("᩶᩹") ^ i16;
                    i9 = ((iM31610 ^ i17) * (-1615)) ^ 2108147332;
                    i10 = 200589427;
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -889281180:
                case 1548592656:
                    itM4942 = C1343.m4942(C19606.m45239(c7210.f23791));
                    iM31610 = (i17 - C0619.m2761("᩶ܳ")) * (-75);
                    i9 = ((iM31610 ^ i16) * (-13807)) ^ 1168005434;
                    i10 = 1737059965;
                    i11 = iM31610 ^ i10;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -884523044:
                case -782505862:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable = autoCloseable2;
                    z = zM6317;
                    iOException = iOException3;
                    iOException2 = iOException4;
                    if (zM28304) {
                        iM2764 = C0619.m2761("ۘۢ") ^ i17;
                        i9 = ((iM2764 ^ i16) * 30453) ^ 214380614;
                        i14 = 1680990824;
                    } else {
                        iM2764 = (i16 - C0619.m2761("֫ܺ")) * 73;
                        i9 = ((iM2764 ^ i17) * 1067) ^ 895101046;
                        i14 = 93233599;
                    }
                    i11 = iM2764 ^ i14;
                    zM6317 = z;
                    autoCloseable2 = autoCloseable;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    iOException3 = iOException;
                    iOException4 = iOException2;
                    i19 = i11;
                    i18 = i9;
                    file2 = file;
                    break;
                case -759019461:
                case 1948890305:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    AutoCloseable autoCloseable4 = autoCloseable2;
                    z = zM6317;
                    try {
                        C8636 c8637 = (C8636) C0950.m3796(itM4942);
                        try {
                            zM28305 = C11235.m28304(interfaceC7509M41888);
                            int iM2765 = C0619.m2761("۬ܺ") ^ i16;
                            i3 = ((iM2765 ^ i17) * 3793) ^ (-2042302302);
                            i5 = iM2765 ^ 947285941;
                            c8636 = c8637;
                            zM6317 = z;
                            autoCloseable2 = autoCloseable4;
                            file2 = file;
                            i19 = i5;
                            i18 = i3;
                            interfaceC7509M41888 = interfaceC7509M41888;
                        } catch (IOException | Error | RuntimeException e2) {
                            e = e2;
                            c8636 = c8637;
                            th = e;
                            autoCloseable2 = interfaceC4974;
                            int iM31614 = C0773.m3169("۫ۖ") ^ i16;
                            i19 = iM31614 ^ (-2137939084);
                            i18 = ((iM31614 ^ i17) * 9827) ^ (-699975451);
                            zM6317 = z;
                            interfaceC7509M41888 = interfaceC7509M41888;
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
                case -524971820:
                case 924864035:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    try {
                        autoCloseable2.close();
                        iM31610 = C0773.m3169("֡ۜ") ^ i17;
                        i9 = ((iM31610 ^ i16) * (-9609)) ^ 1108411918;
                        i10 = 1341039933;
                        i11 = iM31610 ^ i10;
                        zM6317 = zM6317;
                        autoCloseable2 = autoCloseable2;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        i19 = i11;
                        i18 = i9;
                    } catch (IOException e6) {
                        int iM2766 = (C0619.m2761("ۜۗ") + i17) * (-21);
                        i12 = ((iM2766 ^ i16) * 7617) ^ (-1993184833);
                        i13 = iM2766 ^ (-1210342207);
                        iOException3 = e6;
                        i18 = i12;
                        zM6317 = zM6317;
                        autoCloseable2 = autoCloseable2;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        i19 = i13;
                    }
                    file2 = file;
                    break;
                case -433132353:
                case 1474889172:
                    try {
                        autoCloseable = autoCloseable2;
                        z = zM6317;
                        try {
                            interfaceC7509M41888 = interfaceC7509M41888;
                            try {
                                iOException = iOException3;
                                iOException2 = iOException4;
                                try {
                                    c7211 = new C7210(c7210.f23792, c7210.f23795, c7210.f23790, C19606.m45220(interfaceC4973M27755), C20767.m47504(length, false));
                                    iM2764 = C0773.m3169("᩻᩸") ^ i17;
                                    i9 = ((iM2764 ^ i16) * 15083) ^ (-827863860);
                                    i14 = -1574414612;
                                    i11 = iM2764 ^ i14;
                                    zM6317 = z;
                                    autoCloseable2 = autoCloseable;
                                    interfaceC7509M41888 = interfaceC7509M41888;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    i19 = i11;
                                    i18 = i9;
                                } catch (IOException e7) {
                                    e = e7;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c7211 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC4974;
                                    int iM31615 = C0773.m3169("۫ۖ") ^ i16;
                                    i19 = iM31615 ^ (-2137939084);
                                    i18 = ((iM31615 ^ i17) * 9827) ^ (-699975451);
                                    zM6317 = z;
                                    interfaceC7509M41888 = interfaceC7509M41888;
                                } catch (Error e8) {
                                    e = e8;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c7211 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC4974;
                                    int iM31616 = C0773.m3169("۫ۖ") ^ i16;
                                    i19 = iM31616 ^ (-2137939084);
                                    i18 = ((iM31616 ^ i17) * 9827) ^ (-699975451);
                                    zM6317 = z;
                                    interfaceC7509M41888 = interfaceC7509M41888;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                    iOException3 = iOException;
                                    iOException4 = iOException2;
                                    c7211 = null;
                                    th = e;
                                    autoCloseable2 = interfaceC4974;
                                    int iM31617 = C0773.m3169("۫ۖ") ^ i16;
                                    i19 = iM31617 ^ (-2137939084);
                                    i18 = ((iM31617 ^ i17) * 9827) ^ (-699975451);
                                    zM6317 = z;
                                    interfaceC7509M41888 = interfaceC7509M41888;
                                }
                            } catch (IOException e10) {
                                e = e10;
                            } catch (Error e11) {
                                e = e11;
                            } catch (RuntimeException e12) {
                                e = e12;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            interfaceC7509M41888 = interfaceC7509M41888;
                        } catch (Error e14) {
                            e = e14;
                            interfaceC7509M41888 = interfaceC7509M41888;
                        } catch (RuntimeException e15) {
                            e = e15;
                            interfaceC7509M41888 = interfaceC7509M41888;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        z = zM6317;
                    } catch (Error e17) {
                        e = e17;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        z = zM6317;
                    } catch (RuntimeException e18) {
                        e = e18;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        z = zM6317;
                    }
                    file2 = file;
                    break;
                case -364511731:
                case 1607213728:
                    if (interfaceC4973 != null) {
                        iM2761 = C0619.m2761("ܶ۫") ^ i17;
                        i = ((iM2761 ^ i16) * 17513) ^ (-137563520);
                        i2 = -552544934;
                    } else {
                        iM2761 = (C0619.m2761("۟᩷") + i16) * 85;
                        i = ((iM2761 ^ i17) * 14573) ^ (-514725813);
                        i2 = -759190389;
                    }
                    i19 = iM2761 ^ i2;
                    i18 = i;
                    break;
                case -68005208:
                case 591152957:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    try {
                        interfaceC4973.close();
                        iM31610 = C0773.m3169("᩶᩹") ^ i16;
                        i9 = ((iM31610 ^ i17) * (-1615)) ^ 2108147332;
                        i10 = 200589427;
                        i11 = iM31610 ^ i10;
                        zM6317 = zM6317;
                        autoCloseable2 = autoCloseable2;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        i19 = i11;
                        i18 = i9;
                    } catch (IOException e19) {
                        int iM31618 = C0773.m3169("ܽᩳ") ^ i16;
                        i12 = ((iM31618 ^ i17) * (-26003)) ^ (-1190248458);
                        i13 = iM31618 ^ 1983198230;
                        iOException4 = e19;
                        i18 = i12;
                        zM6317 = zM6317;
                        autoCloseable2 = autoCloseable2;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        i19 = i13;
                    }
                    file2 = file;
                    break;
                case 196891384:
                case 2029430476:
                    file2 = file;
                    interfaceC4973M27755 = new C22873(length);
                    interfaceC4973 = interfaceC4974;
                    iM2763 = (C0773.m3169("ܶܰ") + i16) * 83;
                    i3 = ((iM2763 ^ i17) * 17353) ^ (-189762308);
                    i6 = 1810493156;
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                case 360218844:
                case 744480478:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    z = zM6317;
                    IOException iOException5 = iOException3;
                    IOException iOException6 = iOException4;
                    try {
                        throw new C9446();
                    } catch (IOException | Error | RuntimeException e20) {
                        e = e20;
                        iOException3 = iOException5;
                        iOException4 = iOException6;
                        th = e;
                        autoCloseable2 = interfaceC4974;
                        int iM31619 = C0773.m3169("۫ۖ") ^ i16;
                        i19 = iM31619 ^ (-2137939084);
                        i18 = ((iM31619 ^ i17) * 9827) ^ (-699975451);
                        zM6317 = z;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        file2 = file;
                    }
                    break;
                case 363650922:
                case 651954698:
                    try {
                        interfaceC4973M27755.mo15179(c8636, interfaceC7509M41888);
                        iM31610 = (i17 - C0619.m2761("᩶ܳ")) * (-75);
                        i9 = ((iM31610 ^ i16) * (-13807)) ^ 1168005434;
                        i10 = 1737059965;
                        i11 = iM31610 ^ i10;
                        zM6317 = zM6317;
                        autoCloseable2 = autoCloseable2;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        i19 = i11;
                        i18 = i9;
                    } catch (IOException | Error | RuntimeException e21) {
                        e = e21;
                        interfaceC7509M41888 = interfaceC7509M41888;
                        z = zM6317;
                        th = e;
                        autoCloseable2 = interfaceC4974;
                        int iM316110 = C0773.m3169("۫ۖ") ^ i16;
                        i19 = iM316110 ^ (-2137939084);
                        i18 = ((iM316110 ^ i17) * 9827) ^ (-699975451);
                        zM6317 = z;
                        interfaceC7509M41888 = interfaceC7509M41888;
                    }
                    file2 = file;
                    break;
                case 707367024:
                case 1622791729:
                    throw new C9446();
                case 1527257258:
                case 1702026807:
                    interfaceC7509M41888 = interfaceC7509M41888;
                    autoCloseable2 = autoCloseable2;
                    zM6317 = zM6317;
                    c7210.m19801();
                    if (length <= 65536) {
                        iM2763 = (C0773.m3169("᩶۟") ^ i17) * (-45);
                        i3 = ((iM2763 ^ i16) * (-6219)) ^ 336177861;
                        i6 = 1326213943;
                    } else {
                        iM2763 = C0773.m3169("֨۬") ^ i17;
                        i3 = ((iM2763 ^ i16) * (-13035)) ^ (-1768210487);
                        i6 = -1424648747;
                    }
                    i5 = iM2763 ^ i6;
                    zM6317 = zM6317;
                    autoCloseable2 = autoCloseable2;
                    i19 = i5;
                    i18 = i3;
                    interfaceC7509M41888 = interfaceC7509M41888;
                    break;
                default:
                    return c7211;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44320(C13856 c13856, C6465 c6465) {
        int iM2761;
        int i;
        boolean z = false;
        boolean z2 = false;
        int i2 = -1080239103;
        int i3 = C1146.f4234;
        int i4 = C2375.f7641;
        int iM2762 = (C0619.m2761("۠᩻") + i3) * 77;
        int i5 = ((iM2762 ^ i4) * (-3469)) ^ (-968102693);
        int i6 = 564069497;
        while (true) {
            int i7 = iM2762 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-21985)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2025942513:
                    case 452616877:
                        return z;
                    case -1992952227:
                    case -693883077:
                        return z2;
                    case -1869722764:
                    case -761484434:
                        if (C3734.m12152() < 0) {
                            iM2762 = (C0773.m3169("᩺ۡ") ^ i4) * 67;
                            i5 = ((iM2762 ^ i3) * (-19299)) ^ 149291213;
                            i6 = 1015371267;
                            break;
                        }
                        iM2762 = C0773.m3169("֫ۙ") ^ i3;
                        i5 = ((iM2762 ^ i4) * 9481) ^ (-1937202339);
                        i6 = -1674328412;
                        break;
                    case -1852856295:
                    case 85877394:
                        if (C1146.f4234 >= 0) {
                            iM2762 = C0773.m3169("֫ۙ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 9481) ^ (-1937202339);
                            i6 = -1674328412;
                            break;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۨ۬") + i4) * 33;
                        i5 = ((iM2762 ^ i3) * (-9973)) ^ (-275864215);
                        i6 = -899363073;
                        break;
                    case -1759234563:
                    case -827863436:
                        if (C1564.m5509() > 0) {
                            iM2762 = C0773.m3169("ܽܿ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-30027)) ^ (-633937900);
                            i6 = 1359540909;
                            break;
                        }
                        iM2762 = C0619.m2761("ۧۘ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-935)) ^ 308961411;
                        i6 = 738547311;
                        break;
                    case -1669540676:
                    case 1336577317:
                        C4282.m13644();
                        if (C1564.f5401 > 0) {
                            iM2762 = (C0619.m2761("ۨ۬") + i4) * 33;
                            i5 = ((iM2762 ^ i3) * (-9973)) ^ (-275864215);
                            i6 = -899363073;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("֡ܽ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-28517)) ^ 147338819;
                        i6 = -892696951;
                        break;
                    case -1591270012:
                    case -362502322:
                        if (!m44320(c13856.f43960, c6465)) {
                            iM2762 = C0773.m3169("ܺܶ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-24827)) ^ 1816650313;
                            i6 = -2057582666;
                            break;
                        }
                        iM2762 = (C0619.m2761("ܿۙ") ^ i4) * 13;
                        i5 = ((iM2762 ^ i3) * 30189) ^ 1709652263;
                        i6 = 972027932;
                        break;
                    case -1434431207:
                    case 229233260:
                        if (C3033.f9831 < 0) {
                            iM2762 = C0773.m3169("֨᩷") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-347)) ^ 673054861;
                            i6 = 660447792;
                            break;
                        }
                        iM2762 = C0773.m3169("ۢܺ") ^ i4;
                        i5 = ((iM2762 ^ i3) * (-3875)) ^ (-968795268);
                        i6 = -447618824;
                        break;
                    case -1229175323:
                    case 109564639:
                        if (C3492.f12043 > 0) {
                            iM2762 = C0773.m3169("᩻ۛ") ^ i4;
                            i5 = ((iM2762 ^ i3) * 26095) ^ (-838852469);
                            i6 = 12324163;
                            break;
                        }
                        iM2762 = C0773.m3169("ۢܺ") ^ i4;
                        i5 = ((iM2762 ^ i3) * (-3875)) ^ (-968795268);
                        i6 = -447618824;
                        break;
                        break;
                    case -1141369335:
                    case 2058579255:
                        AbstractC3624.m11755();
                        return false;
                    case -1108899898:
                    case 95462603:
                        if (!C1146.m4231()) {
                            iM2762 = C0773.m3169("֫ۙ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 9481) ^ (-1937202339);
                            i6 = -1674328412;
                            break;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۖܿ") + i4) * (-29);
                        i5 = ((iM2762 ^ i3) * 4191) ^ (-1008992741);
                        i6 = 484343019;
                        break;
                    case -1104133912:
                    case 743058984:
                        if (C0487.f2131 > 0) {
                            iM2762 = C0619.m2761("ۧۘ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-935)) ^ 308961411;
                            i6 = 738547311;
                            break;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۨ۬") + i4) * 33;
                        i5 = ((iM2762 ^ i3) * (-9973)) ^ (-275864215);
                        i6 = -899363073;
                        break;
                        break;
                    case -744116437:
                    case 1222002128:
                        if (C1321.m4855(c13856)) {
                            iM2761 = C0619.m2761("ۛۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 18971) ^ (-410627342);
                            i = -1386376233;
                        } else {
                            iM2761 = C0619.m2761("ۡۤ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 8853) ^ (-311151630);
                            i = -1631916268;
                        }
                        i7 = iM2761 ^ i;
                        z2 = true;
                        break;
                    case -563206579:
                    case 894902410:
                        if (C3779.f12953 > 0) {
                            iM2762 = (C0773.m3169("ۤܰ") ^ i3) * (-121);
                            i5 = ((iM2762 ^ i4) * 26447) ^ (-173821861);
                            i6 = 2038114684;
                            break;
                        }
                        iM2762 = C0619.m2761("ۧۘ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-935)) ^ 308961411;
                        i6 = 738547311;
                        break;
                        break;
                    case -537015362:
                    case 495696804:
                        if (!C0619.f2439) {
                            iM2762 = C0773.m3169("᩹֡") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-6177)) ^ (-2147232169);
                            i6 = 113648047;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۨ۬") + i4) * 33;
                        i5 = ((iM2762 ^ i3) * (-9973)) ^ (-275864215);
                        i6 = -899363073;
                        break;
                        break;
                    case -269875746:
                    case -206332656:
                        if (C3779.f12953 > 0) {
                            iM2762 = (i4 - C0619.m2761("ۗᩴ")) * (-127);
                            i5 = ((iM2762 ^ i3) * 2177) ^ 1379309796;
                            i6 = -638096318;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۨ۬") + i4) * 33;
                        i5 = ((iM2762 ^ i3) * (-9973)) ^ (-275864215);
                        i6 = -899363073;
                        break;
                        break;
                    case -231903976:
                    case 488904376:
                        if (c13856.f43958.f28220 != c6465) {
                            iM2762 = C0773.m3169("ۜ᩺") ^ i4;
                            i5 = ((iM2762 ^ i3) * 24755) ^ 1900343034;
                            i6 = 39448634;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۜۨ") + i3) * (-61);
                        i5 = ((iM2762 ^ i4) * (-22009)) ^ 288433863;
                        i6 = -1669868185;
                        break;
                    case -218590769:
                    case 1855429709:
                        return z2;
                    case 65495400:
                    case 828550432:
                        return z;
                    case 82904335:
                    case 634814838:
                        if (C3033.f9831 < 0) {
                            iM2762 = (C0773.m3169("ۨۡ") + i3) * 29;
                            i5 = ((iM2762 ^ i4) * 17195) ^ 493396159;
                            i6 = -127399260;
                            break;
                        }
                        iM2762 = C0619.m2761("ۧۘ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-935)) ^ 308961411;
                        i6 = 738547311;
                        break;
                        break;
                    case 322828004:
                    case 1952555770:
                        z = false;
                        if (c13856 != null) {
                            iM2762 = C0619.m2761("᩶᩶") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-2757)) ^ (-616209182);
                            i6 = -1485277806;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۧۗ") ^ i3) * 21;
                        i5 = ((iM2762 ^ i4) * (-9179)) ^ 785097959;
                        i6 = 2047924818;
                        break;
                    case 645818274:
                    case 891453064:
                        if (!m44320(c13856.f43955, c6465)) {
                            iM2762 = C0773.m3169("ܿ᩷") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-31981)) ^ 1754244091;
                            i6 = -203358866;
                            break;
                        }
                        iM2762 = (C0619.m2761("ܿۙ") ^ i4) * 13;
                        i5 = ((iM2762 ^ i3) * 30189) ^ 1709652263;
                        i6 = 972027932;
                        break;
                        break;
                    case 690380856:
                    case 1988594525:
                        return z;
                    case 781774939:
                    case 894852160:
                        if (AbstractC0641.f2496 < 0) {
                            iM2762 = (C0773.m3169("ۖ֡") ^ i3) * 5;
                            i5 = ((iM2762 ^ i4) * (-11957)) ^ 1839287558;
                            i6 = -489558311;
                            break;
                        }
                        iM2762 = C0773.m3169("֫ۙ") ^ i3;
                        i5 = ((iM2762 ^ i4) * 9481) ^ (-1937202339);
                        i6 = -1674328412;
                        break;
                        break;
                    default:
                        RunnableC1848.m6360();
                        iM2762 = C0773.m3169("֡ܽ") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-28517)) ^ 147338819;
                        i6 = -892696951;
                        break;
                        break;
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C7210 m44289(l.C7210 r65, java.io.File r66, l.InterfaceC7509 r67) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44289(l.ۜܳܳ, java.io.File, l.۟֡֫):l.ۜܳܳ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44319(C7210 c7210) {
        boolean z;
        int length = c7210.length();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C19606.m45233(c7210.f23791, identityHashMap);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        Iterator itM9936 = RunnableC3055.m9936(C0619.m2758(identityHashMap));
        while (C3998.m12923(itM9936)) {
            m44313((InterfaceC22808) C0950.m3796(itM9936), identityHashMap2, identityHashMap3);
        }
        long jM45251 = C19606.m45251(c7210.f23791);
        synchronized (f61935) {
            C4227 c4227 = f61937;
            Iterator itM2811 = AbstractC0641.m2811(C0773.m3162(identityHashMap3));
            z = false;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (!C3998.m12923(itM2811)) {
                    break;
                }
                if (((C22127) C0950.m3796(itM2811)).f71296 != c4227) {
                    z3 = false;
                }
                z2 |= z3;
            }
            long j = length;
            if (jM45251 > j || (c4227 != null && z2 && c4227.f15421 > j)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44313(InterfaceC22808 interfaceC22808, IdentityHashMap identityHashMap, IdentityHashMap identityHashMap2) {
        Boolean bool = null;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 1436794308;
        int i3 = C0487.f2131;
        int i4 = C4238.f15451;
        int iM2761 = (C0619.m2761("ܺ۟") + i3) * 99;
        int i5 = ((iM2761 ^ i4) * 20385) ^ (-562835294);
        int i6 = 212254505;
        while (true) {
            i2 = ((((i2 ^ i4) * 5737) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2118451717:
                case 1174605889:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ܿ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-277)) ^ (-1468796068);
                        i6 = -18170422;
                    } else {
                        iM2761 = C0619.m2761("ܰܽ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 15005) ^ 769018577;
                        i6 = -2022587587;
                    }
                    break;
                case -2105953807:
                case -281792292:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i4 - C0773.m3169("᩷֨")) * (-55);
                        i5 = ((iM2761 ^ i3) * 19611) ^ (-480084201);
                        i6 = -1919034995;
                    } else {
                        iM2761 = C0619.m2761("ۚ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-28969)) ^ 554179503;
                        i6 = -323465154;
                    }
                    break;
                case -2102603114:
                case 584696169:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("ܿ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-277)) ^ (-1468796068);
                        i6 = -18170422;
                    } else {
                        iM2761 = C0773.m3169("ۛۡ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 7869) ^ 1899274881;
                        i6 = 1366461503;
                    }
                    break;
                case -1965713296:
                case -1948984795:
                    if (C2702.m8876()) {
                        iM2761 = C0773.m3169("ۜۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 2143) ^ (-312182759);
                        i6 = 620416054;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩷֨")) * (-55);
                        i5 = ((iM2761 ^ i3) * 19611) ^ (-480084201);
                        i6 = -1919034995;
                    }
                    break;
                case -1840436638:
                case 1122593103:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("֫ܰ") + i3) * (-103);
                        i5 = ((iM2761 ^ i4) * (-2065)) ^ (-81165644);
                        i6 = 118178795;
                    } else {
                        iM2761 = C0619.m2761("ۚ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-28969)) ^ 554179503;
                        i6 = -323465154;
                    }
                    break;
                case -1775661858:
                case -1032191410:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܿ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-277)) ^ (-1468796068);
                        i6 = -18170422;
                    } else {
                        iM2761 = C0773.m3169("۬ᩳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25129)) ^ (-1248060507);
                        i6 = -1804726969;
                    }
                    break;
                case -1242539939:
                case -375710576:
                    C2966.m9664();
                    C4282.m13644();
                    iM2761 = (i3 - C0773.m3169("᩸֨")) * (-115);
                    i5 = ((iM2761 ^ i4) * (-10919)) ^ (-981740895);
                    i6 = -1316391563;
                    break;
                case -1156401387:
                case 1599537664:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۚ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-28969)) ^ 554179503;
                        i6 = -323465154;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۛ֨")) * (-43);
                        i5 = ((iM2761 ^ i3) * 715) ^ (-937118180);
                        i6 = 739955289;
                    }
                    break;
                case -1014545681:
                case -222505303:
                    AbstractC3624.m11766(identityHashMap2, ((C10938) interfaceC22808).f34596, bool);
                    iM2761 = C0773.m3169("۟ۨ") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-22675)) ^ (-1893933220);
                    i6 = -850323753;
                    break;
                case -966546217:
                case -930462189:
                    if (i < length) {
                        iM2761 = C0773.m3169("ۘۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-11565)) ^ 415871700;
                        i6 = -339872284;
                    } else {
                        iM2761 = (C0619.m2761("ۗ֨") ^ i3) * 29;
                        i5 = ((iM2761 ^ i4) * 12097) ^ 13935159;
                        i6 = -1183631457;
                    }
                    break;
                case -937867587:
                case 2021061925:
                    C3734.m12152();
                    C3448.m11248();
                    break;
                case -928934015:
                case 514707130:
                    break;
                case -572083742:
                case 495024126:
                    if (C2288.m7767()) {
                        iM2761 = (C0619.m2761("ۨ֡") ^ i3) * q.h;
                        i5 = ((iM2761 ^ i4) * (-4729)) ^ 339276481;
                        i6 = -1655879103;
                    } else {
                        iM2761 = C0773.m3169("֨ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-11547)) ^ (-16017778);
                        i6 = -1650169370;
                    }
                    break;
                case -545239209:
                case 462644472:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("ۚ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-28969)) ^ 554179503;
                        i6 = -323465154;
                    } else {
                        iM2761 = (C0773.m3169("ۡ۫") ^ i4) * (-99);
                        i5 = ((iM2761 ^ i3) * 4021) ^ 294267470;
                        i6 = -302953278;
                    }
                    break;
                case -536630150:
                case 1560941517:
                    m44313(interfaceC22808Arr[i], identityHashMap, identityHashMap2);
                    i++;
                    iM2761 = (C0773.m3169("ۗᩴ") ^ i4) * (-75);
                    i5 = ((iM2761 ^ i3) * (-27241)) ^ 1648678624;
                    i6 = -1102660941;
                    break;
                case -397687467:
                case 1665633781:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۨ֡") ^ i3) * q.h;
                        i5 = ((iM2761 ^ i4) * (-4729)) ^ 339276481;
                        i6 = -1655879103;
                    } else {
                        iM2761 = C0619.m2761("ܽ۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-23797)) ^ 1504020051;
                        i6 = -1327658221;
                    }
                    break;
                case -265530751:
                case 690839417:
                    interfaceC22808Arr = ((C6465) interfaceC22808).f21763;
                    length = interfaceC22808Arr.length;
                    i = 0;
                    iM2761 = (C0773.m3169("ۗᩴ") ^ i4) * (-75);
                    i5 = ((iM2761 ^ i3) * (-27241)) ^ 1648678624;
                    i6 = -1102660941;
                    break;
                case 293547493:
                case 1510979344:
                    if (C23916.f77426 > 0) {
                        iM2761 = C0773.m3169("ܿ֡") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-277)) ^ (-1468796068);
                        i6 = -18170422;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩸֨")) * (-115);
                        i5 = ((iM2761 ^ i4) * (-10919)) ^ (-981740895);
                        i6 = -1316391563;
                    }
                    break;
                case 666173363:
                case 2078732311:
                    if (interfaceC22808 instanceof C6465) {
                        iM2761 = (C0773.m3169("᩷۟") ^ i3) * (-41);
                        i5 = ((iM2761 ^ i4) * 3295) ^ 912382527;
                        i6 = 394741833;
                    } else {
                        iM2761 = (C0619.m2761("ۗ֨") ^ i3) * 29;
                        i5 = ((iM2761 ^ i4) * 12097) ^ 13935159;
                        i6 = -1183631457;
                    }
                    break;
                case 706951684:
                case 835065881:
                    if (C2878.f9462) {
                        iM2761 = (C0619.m2761("ۨ֡") ^ i3) * q.h;
                        i5 = ((iM2761 ^ i4) * (-4729)) ^ 339276481;
                        i6 = -1655879103;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰ۫")) * (-75);
                        i5 = ((iM2761 ^ i4) * (-8835)) ^ (-623196441);
                        i6 = 964697401;
                    }
                    break;
                case 852397141:
                case 1000253698:
                    if (!RunnableC1848.m6360()) {
                        iM2761 = (i3 - C0773.m3169("᩸֨")) * (-115);
                        i5 = ((iM2761 ^ i4) * (-10919)) ^ (-981740895);
                        i6 = -1316391563;
                    } else {
                        iM2761 = C0619.m2761("ۚ֡") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-28969)) ^ 554179503;
                        i6 = -323465154;
                    }
                    break;
                case 1387752012:
                case 1790306942:
                    if (interfaceC22808 instanceof C10938) {
                        iM2761 = (C0619.m2761("ܺ۫") ^ i4) * (-83);
                        i5 = ((iM2761 ^ i3) * 32533) ^ (-700151514);
                        i6 = 819949137;
                    } else {
                        iM2761 = C0773.m3169("۟ۨ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-22675)) ^ (-1893933220);
                        i6 = -850323753;
                    }
                    break;
                default:
                    bool = Boolean.TRUE;
                    if (AbstractC3624.m11766(identityHashMap, interfaceC22808, bool) != null) {
                        iM2761 = (C0619.m2761("ۗ֨") ^ i3) * 29;
                        i5 = ((iM2761 ^ i4) * 12097) ^ 13935159;
                        i6 = -1183631457;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵ۖ")) * 5;
                        i5 = ((iM2761 ^ i4) * (-25115)) ^ (-449648720);
                        i6 = 529782285;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44306(C13856 c13856, IdentityHashMap identityHashMap, ArrayList arrayList, IdentityHashMap identityHashMap2) {
        C8636 c8636 = null;
        InterfaceC22808 interfaceC22808 = null;
        int i = 0;
        Long l2 = null;
        long jM9672 = 0;
        int i2 = -839620664;
        int i3 = C4282.f15546;
        int i4 = C1564.f5401;
        int iM2761 = (C0619.m2761("ᩴᩳ") ^ i4) * 79;
        int i5 = ((iM2761 ^ i3) * (-20619)) ^ 452135432;
        int i6 = 1119140491;
        while (true) {
            i2 = ((((i2 ^ i3) * 1449) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -1988266612:
                case -420111802:
                    AbstractC3624.m11766(identityHashMap, interfaceC22808, C1542.m5460(i));
                    C1519.m5406(arrayList, interfaceC22808);
                    break;
                case -1856600705:
                case -863159646:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ܶ᩻")) * (-27);
                        i5 = ((iM2761 ^ i4) * (-7421)) ^ (-1385012802);
                        i6 = -944427207;
                    } else {
                        iM2761 = (C0619.m2761("ܽ᩺") ^ i4) * (-119);
                        i5 = ((iM2761 ^ i3) * 18267) ^ 1237899823;
                        i6 = 320260462;
                    }
                    break;
                case -1791897651:
                case 345035602:
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29737) ^ 115897126;
                        i6 = 1354452866;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ܺܿ")) * (-95);
                        i5 = ((iM2761 ^ i3) * (-6063)) ^ (-2033421062);
                        i6 = -895152126;
                    }
                    break;
                case -1660749322:
                case -178947316:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("۠֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29179)) ^ (-1759800052);
                        i6 = 1672911384;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۛۡ")) * (-89);
                        i5 = ((iM2761 ^ i4) * (-20135)) ^ (-100343765);
                        i6 = 1351699606;
                    }
                    break;
                case -1510861175:
                case 747428800:
                    if (c13856 == null) {
                        iM2761 = (C0619.m2761("ۗۘ") ^ i4) * (-77);
                        i5 = ((iM2761 ^ i3) * 11447) ^ (-1495131346);
                        i6 = 745863192;
                    } else {
                        iM2761 = C0619.m2761("ۗ۫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-20191)) ^ 1598726677;
                        i6 = -814501654;
                    }
                    break;
                case -1328682063:
                case -532979364:
                    l2 = (Long) identityHashMap.get(interfaceC22808);
                    if (l2 == null) {
                        iM2761 = (C0619.m2761("᩹᩹") + i3) * (-117);
                        i5 = ((iM2761 ^ i4) * 11087) ^ (-889663482);
                        i6 = -648864895;
                    } else {
                        iM2761 = (C0773.m3169("֡֨") + i3) * 99;
                        i5 = ((iM2761 ^ i4) * 5467) ^ (-1942950676);
                        i6 = -471134783;
                    }
                    break;
                case -1243313235:
                case 88205610:
                    c8636 = c13856.f43958;
                    if (C3099.m10087(c13856)) {
                        iM2761 = C0619.m2761("۬ܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30459)) ^ 1405928149;
                        i6 = 14034068;
                    } else {
                        iM2761 = C0619.m2761("ۛ۠") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-13909)) ^ 208135925;
                        i6 = 1057992743;
                    }
                    break;
                case -931947019:
                case 1351490788:
                    jM9672 = C2966.m9672(l2.longValue(), i);
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۢܶ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 5001) ^ 1994996718;
                        i6 = -798429935;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩷᩶")) * (-67);
                        i5 = ((iM2761 ^ i3) * 19293) ^ (-1555406293);
                        i6 = 163162265;
                    }
                    break;
                case -840837188:
                case -187986288:
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0773.m3169("۠֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29179)) ^ (-1759800052);
                        i6 = 1672911384;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29737) ^ 115897126;
                        i6 = 1354452866;
                    }
                    break;
                case -600661999:
                case 707548395:
                    C1146.m4231();
                    C1542.m5459();
                    break;
                case -492553699:
                case 1855869083:
                    AbstractC0116.m1242(identityHashMap, interfaceC22808, C3690.m12001(jM9672));
                    break;
                case -446687127:
                case 1046656126:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i4 - C0619.m2761("᩵ۙ")) * 21;
                        i5 = ((iM2761 ^ i3) * 24561) ^ 1421611737;
                        i6 = 1979501840;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29737) ^ 115897126;
                        i6 = 1354452866;
                    }
                    break;
                case -307816379:
                case 1167624945:
                    m44306(c13856.f43960, identityHashMap, arrayList, identityHashMap2);
                    m44306(c13856.f43955, identityHashMap, arrayList, identityHashMap2);
                    break;
                case -97241011:
                case 421634400:
                    C3099.m10095();
                    if (C2287.f7432 < 0) {
                        iM2761 = (i3 - C0619.m2761("ܶ᩻")) * (-27);
                        i5 = ((iM2761 ^ i4) * (-7421)) ^ (-1385012802);
                        i6 = -944427207;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩵ۙ")) * 21;
                        i5 = ((iM2761 ^ i3) * 24561) ^ 1421611737;
                        i6 = 1979501840;
                    }
                    break;
                case 86773960:
                case 1704436231:
                    if (C3690.m11987()) {
                        iM2761 = C0773.m3169("۠֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29179)) ^ (-1759800052);
                        i6 = 1672911384;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩶ܰ")) * 127;
                        i5 = ((iM2761 ^ i4) * 5711) ^ 1261149123;
                        i6 = 120427045;
                    }
                    break;
                case 217567310:
                case 660500357:
                    break;
                case 282392240:
                case 1400715702:
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i4;
                        i5 = ((iM2761 ^ i3) * 29737) ^ 115897126;
                        i6 = 1354452866;
                    } else {
                        iM2761 = (C0619.m2761("ۛ֨") ^ i3) * (-29);
                        i5 = ((iM2761 ^ i4) * (-1315)) ^ (-2092497200);
                        i6 = -840082438;
                    }
                    break;
                case 332371135:
                case 400946206:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("۠֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29179)) ^ (-1759800052);
                        i6 = 1672911384;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۘ᩷")) * (-117);
                        i5 = ((iM2761 ^ i3) * (-21521)) ^ 365030109;
                        i6 = -2147191926;
                    }
                    break;
                case 412364813:
                case 1090438543:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ܶ᩻")) * (-27);
                        i5 = ((iM2761 ^ i4) * (-7421)) ^ (-1385012802);
                        i6 = -944427207;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩸") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-887)) ^ (-14216510);
                        i6 = -1883081631;
                    }
                    break;
                case 441899394:
                case 611665483:
                    interfaceC22808 = c8636.f28220;
                    i = c8636.f28219;
                    if (m44322(interfaceC22808, identityHashMap2)) {
                        iM2761 = C0773.m3169("᩺۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-6497)) ^ (-1261181904);
                        i6 = -1804767487;
                    } else {
                        iM2761 = (C0619.m2761("ۗۘ") ^ i4) * (-77);
                        i5 = ((iM2761 ^ i3) * 11447) ^ (-1495131346);
                        i6 = 745863192;
                    }
                    break;
                case 1004558380:
                case 2030474326:
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("۟ܳ") ^ i3) * (-13);
                        i5 = ((iM2761 ^ i4) * 11691) ^ (-2086988433);
                        i6 = 648013723;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܶ᩻")) * (-27);
                        i5 = ((iM2761 ^ i4) * (-7421)) ^ (-1385012802);
                        i6 = -944427207;
                    }
                    break;
                case 1742695932:
                case 2077057355:
                    C1321.m4852();
                    C1783.m6232();
                    iM2761 = C0619.m2761("ܽ᩷") ^ i4;
                    i5 = ((iM2761 ^ i3) * 29737) ^ 115897126;
                    i6 = 1354452866;
                    break;
                default:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("۠֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-29179)) ^ (-1759800052);
                        i6 = 1672911384;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܰۖ")) * 51;
                        i5 = ((iM2761 ^ i4) * 21219) ^ (-884173880);
                        i6 = 210736274;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m44328() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = -1124915463;
        int i5 = C0773.f2792;
        int i6 = C2834.f9334;
        int iM2761 = C0619.m2761("᩸ۨ") ^ i5;
        int i7 = ((iM2761 ^ i6) * 12707) ^ 969851614;
        int i8 = 1355754396;
        while (true) {
            i4 = ((((i4 ^ i6) * 21569) >> 31) & i7) ^ (iM2761 ^ i8);
            switch (i4) {
                case -2132135834:
                case 946608291:
                    s2 = 1;
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ܰ۠") ^ i5;
                        i7 = ((iM2761 ^ i6) * 21253) ^ 1262895766;
                        i8 = -1506600985;
                    } else {
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                        i8 = 1004216550;
                    }
                    break;
                case -1959259632:
                case 586048774:
                    i2 = i + 1;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i5) * 13;
                        i7 = ((iM2761 ^ i6) * 2617) ^ (-2140942807);
                        i8 = 387597624;
                    } else {
                        iM2761 = C0619.m2761("ܽ۟") ^ i6;
                        i7 = ((iM2761 ^ i5) * 8499) ^ (-1228329980);
                        i8 = 1998932529;
                    }
                    break;
                case -1946807671:
                case -900669922:
                    i = s * 2;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۢܽ") ^ i5) * 99;
                        i7 = ((iM2761 ^ i6) * 21983) ^ (-555443672);
                        i8 = -1185206458;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩶") ^ i6;
                        i7 = ((iM2761 ^ i5) * 3103) ^ 981289846;
                        i8 = -999203559;
                    }
                    break;
                case -1884849638:
                case -30351661:
                    i3 = 17003;
                    iM2761 = C0619.m2761("۬ۡ") ^ i6;
                    i7 = ((iM2761 ^ i5) * (-29533)) ^ (-1568216359);
                    i8 = -296839128;
                    break;
                case -1769492510:
                case -1291401309:
                    i3 = 49293;
                    iM2761 = C0619.m2761("۬ۡ") ^ i6;
                    i7 = ((iM2761 ^ i5) * (-29533)) ^ (-1568216359);
                    i8 = -296839128;
                    break;
                case -1764382031:
                case -988533270:
                    C1542.m5459();
                    C2485.m8357();
                    iM2761 = C0773.m3169("۫᩹") ^ i5;
                    i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                    i8 = 1004216550;
                    break;
                case -1625854166:
                case -1600202896:
                    c = 839;
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i5) * 13;
                        i7 = ((iM2761 ^ i6) * 2617) ^ (-2140942807);
                        i8 = 387597624;
                    } else {
                        iM2761 = (C0773.m3169("۫ۚ") ^ i5) * (-11);
                        i7 = ((iM2761 ^ i6) * 2581) ^ (-1309326270);
                        i8 = 12482851;
                    }
                    break;
                case -1593315187:
                case -282534416:
                    if (this.f61956 == null) {
                        iM2761 = (C0773.m3169("᩻ܺ") ^ i6) * 11;
                        i7 = ((iM2761 ^ i5) * 21873) ^ 1537924895;
                        i8 = 623611092;
                    } else {
                        iM2761 = C0619.m2761("ۧۡ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-7689)) ^ 60168469;
                        i8 = -1266893106;
                    }
                    break;
                case -1523985763:
                case -1250702263:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i5) * 13;
                        i7 = ((iM2761 ^ i6) * 2617) ^ (-2140942807);
                        i8 = 387597624;
                    } else {
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                        i8 = 1004216550;
                    }
                    break;
                case -958260547:
                case 1512785133:
                    short[] sArr2 = f61940;
                    if (C1321.m4852() && C3998.f13671 == 0) {
                        throw new IllegalStateException(AbstractC0641.m2820(sArr2, 840, 31, i3));
                    }
                    iM2761 = C0773.m3169("۟ۙ") ^ i6;
                    i7 = ((iM2761 ^ i5) * (-139)) ^ 2087496619;
                    i8 = -96820669;
                    break;
                case -726824194:
                case 1753693829:
                    int i9 = s + s2;
                    if (i2 - (i9 * i9) <= 0) {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-23941)) ^ (-1490069128);
                        i8 = -467997463;
                    } else {
                        iM2761 = C0619.m2761("ۡ֨") ^ i6;
                        i7 = ((iM2761 ^ i5) * 5453) ^ 1328919631;
                        i8 = -1058138835;
                    }
                    break;
                case -631061152:
                case 1229301921:
                    RunnableC0334.m2063();
                    C2375.m8065();
                    return;
                case -368947184:
                case 825762434:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i6 - C0619.m2761("᩸ۢ")) * 43;
                        i7 = ((iM2761 ^ i5) * 22453) ^ 1797397905;
                        i8 = 1601921153;
                    } else {
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                        i8 = 1004216550;
                    }
                    break;
                case 263057315:
                case 1832431733:
                    C1826.m6301();
                    if (C3998.f13671 == 0) {
                        iM2761 = C0773.m3169("۟ۙ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-139)) ^ 2087496619;
                        i8 = -96820669;
                    } else {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i5) * 13;
                        i7 = ((iM2761 ^ i6) * 2617) ^ (-2140942807);
                        i8 = 387597624;
                    }
                    break;
                case 328246845:
                case 1019358361:
                    s = sArr[c];
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ۘۘ") ^ i5) * 17;
                        i7 = ((iM2761 ^ i6) * (-23731)) ^ 761207938;
                        i8 = 1456996391;
                    } else {
                        iM2761 = (C0773.m3169("ۧܺ") ^ i5) * 13;
                        i7 = ((iM2761 ^ i6) * 2617) ^ (-2140942807);
                        i8 = 387597624;
                    }
                    break;
                case 575825989:
                case 976013856:
                    sArr = f61940;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i6 - C0619.m2761("᩸ۢ")) * 43;
                        i7 = ((iM2761 ^ i5) * 22453) ^ 1797397905;
                        i8 = 1601921153;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۚ") ^ i5) * 127;
                        i7 = ((iM2761 ^ i6) * (-3509)) ^ 1655532074;
                        i8 = 500147978;
                    }
                    break;
                case 1293444913:
                case 2117400738:
                    return;
                case 1313316382:
                case 1901122315:
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                        i8 = 1004216550;
                    } else {
                        iM2761 = (C0619.m2761("۟᩷") ^ i6) * 23;
                        i7 = ((iM2761 ^ i5) * (-22645)) ^ (-854921663);
                        i8 = -1089867160;
                    }
                    break;
                default:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("۫᩹") ^ i5;
                        i7 = ((iM2761 ^ i6) * (-2351)) ^ (-2022305914);
                        i8 = 1004216550;
                    } else {
                        iM2761 = (i6 - C0619.m2761("֨ᩳ")) * 59;
                        i7 = ((iM2761 ^ i5) * (-16429)) ^ 9437983;
                        i8 = 882816556;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13176 m44290(C13176 c13176, C13176 c13177) {
        long jM32693 = 0;
        long jM32694 = 0;
        int i = -982058330;
        int i2 = C0269.f1558;
        int i3 = AbstractC3624.f12429;
        int iM2761 = (i2 - C0619.m2761("ܺ۟")) * (-43);
        int i4 = ((iM2761 ^ i3) * (-18605)) ^ 1478853353;
        int i5 = -231050532;
        while (true) {
            i = ((((i ^ i3) * (-16333)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1810590694:
                case -732514801:
                    if (C1564.m5509() <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۚ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-2819)) ^ 982537661;
                        i5 = -893717986;
                    } else {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * 119;
                        i4 = ((iM2761 ^ i3) * 9199) ^ (-1771362484);
                        i5 = 1406609107;
                    }
                    break;
                case -1530449129:
                case -779777750:
                    return c13177;
                case -1444925417:
                case -560136887:
                    C2419.m8174();
                    C1146.m4231();
                    return null;
                case -1421148964:
                case -183608263:
                    C17202.m40372();
                    C2966.m9664();
                    iM2761 = (C0773.m3169("ۢ۟") + i2) * 119;
                    i4 = ((iM2761 ^ i3) * 9199) ^ (-1771362484);
                    i5 = 1406609107;
                    break;
                case -1394643241:
                case 639485452:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۚ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-2819)) ^ 982537661;
                        i5 = -893717986;
                    } else {
                        iM2761 = C0619.m2761("ۛᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13189)) ^ (-291055624);
                        i5 = 1787582002;
                    }
                    break;
                case -1297947469:
                case -372056949:
                    if (c13177.m32692() >= c13176.m32692()) {
                        iM2761 = C0619.m2761("ۙ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15265) ^ 801547917;
                        i5 = 154106860;
                    } else {
                        iM2761 = C0773.m3169("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16737)) ^ 803753524;
                        i5 = -1954460534;
                    }
                    break;
                case -1223873827:
                case 1213570036:
                    C0269.m1775();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۡ۟")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-23107)) ^ (-582751655);
                        i5 = 1448044548;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻ۚ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-2819)) ^ 982537661;
                        i5 = -893717986;
                    }
                    break;
                case -946434517:
                case 644418866:
                    return c13176;
                case -765749912:
                case 1843143295:
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("᩵ܽ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20223)) ^ (-955163600);
                        i5 = -352409614;
                    } else {
                        iM2761 = (C0773.m3169("۬᩶") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * (-31683)) ^ 1714505708;
                        i5 = 274293323;
                    }
                    break;
                case -562581164:
                case 675064921:
                    if (c13177.m32693() == c13176.m32693()) {
                        iM2761 = C0619.m2761("֨ۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5341)) ^ (-527102827);
                        i5 = -112232125;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15265) ^ 801547917;
                        i5 = 154106860;
                    }
                    break;
                case -523109006:
                case 1199081413:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = (C0773.m3169("ۡۨ") ^ i2) * 41;
                        i4 = ((iM2761 ^ i3) * 10957) ^ (-1835756257);
                        i5 = 1175870199;
                    } else {
                        iM2761 = C0619.m2761("۫᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 649) ^ 618327448;
                        i5 = 949334396;
                    }
                    break;
                case -335573416:
                case 1123180970:
                    jM32693 = c13177.m32693();
                    jM32694 = c13176.m32693();
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ۡۨ") ^ i2) * 41;
                        i4 = ((iM2761 ^ i3) * 10957) ^ (-1835756257);
                        i5 = 1175870199;
                    } else {
                        iM2761 = (C0773.m3169("ۧۜ") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * (-1253)) ^ (-503911857);
                        i5 = 189619261;
                    }
                    break;
                case -153603444:
                case 1663002207:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i2 - C0773.m3169("ۡ۟")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-23107)) ^ (-582751655);
                        i5 = 1448044548;
                    } else {
                        iM2761 = (C0773.m3169("۟۬") + i3) * (-95);
                        i4 = ((iM2761 ^ i2) * (-13497)) ^ 459001187;
                        i5 = -1206419240;
                    }
                    break;
                case -152001607:
                case 1842750267:
                    C3448.m11248();
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ۡۨ") ^ i2) * 41;
                        i4 = ((iM2761 ^ i3) * 10957) ^ (-1835756257);
                        i5 = 1175870199;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩻ۚ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-2819)) ^ 982537661;
                        i5 = -893717986;
                    }
                    break;
                case -42907234:
                case 1114922863:
                    if (c13176 != null) {
                        iM2761 = C0773.m3169("᩵᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31439) ^ 1147393854;
                        i5 = 152831169;
                    } else {
                        iM2761 = C0773.m3169("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16737)) ^ 803753524;
                        i5 = -1954460534;
                    }
                    break;
                case 86264894:
                case 399759752:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ۢ۟") + i2) * 119;
                        i4 = ((iM2761 ^ i3) * 9199) ^ (-1771362484);
                        i5 = 1406609107;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܳ") ^ i2) * 35;
                        i4 = ((iM2761 ^ i3) * (-26809)) ^ (-1608520715);
                        i5 = -2141356052;
                    }
                    break;
                case 560042753:
                case 1085247709:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (i2 - C0773.m3169("ۡ۟")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-23107)) ^ (-582751655);
                        i5 = 1448044548;
                    } else {
                        iM2761 = C0619.m2761("᩹۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4401)) ^ 1652395107;
                        i5 = 703266950;
                    }
                    break;
                case 655927026:
                case 760358894:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0773.m3169("᩵ܽ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20223)) ^ (-955163600);
                        i5 = -352409614;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ֨") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * (-8171)) ^ 776395618;
                        i5 = 907630444;
                    }
                    break;
                case 1154570644:
                case 1790747599:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻ۚ")) * (-43);
                        i4 = ((iM2761 ^ i2) * (-2819)) ^ 982537661;
                        i5 = -893717986;
                    } else {
                        iM2761 = (C0773.m3169("֫ܿ") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * (-17001)) ^ (-61367483);
                        i5 = 1004423351;
                    }
                    break;
                case 1605531222:
                case 1806646589:
                    if (jM32693 <= jM32694) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28819) ^ 1301965720;
                        i5 = 1674758513;
                    } else {
                        iM2761 = C0773.m3169("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16737)) ^ 803753524;
                        i5 = -1954460534;
                    }
                    break;
                default:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0773.m3169("᩵ܽ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-20223)) ^ (-955163600);
                        i5 = -352409614;
                    } else {
                        iM2761 = C0619.m2761("ۚܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-23049)) ^ (-1795637998);
                        i5 = -1422127826;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[PHI: r5
      0x00fc: PHI (r5v3 l.ۛܳܳ) = (r5v2 l.ۛܳܳ), (r5v5 l.ۛܳܳ) binds: [B:38:0x00fa, B:34:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01de  */
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
    public static boolean m44316(Iterable iterable) {
        int iM3169;
        int i;
        ?? r8;
        int iM31610;
        int i2;
        ArrayDeque arrayDeque = null;
        Iterator itM47859 = null;
        InterfaceC22808 interfaceC22808 = null;
        boolean z = false;
        C6465 c6465 = null;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        ?? r9 = 0;
        int i3 = 643017853;
        int i4 = C11235.f35427;
        int i5 = C23916.f77426;
        int iM31611 = (i4 - C0773.m3169("ܶۜ")) * (-31);
        int i6 = ((iM31611 ^ i5) * 13903) ^ (-801098738);
        int i7 = 1316747315;
        while (true) {
            int i8 = iM31611 ^ i7;
            IdentityHashMap identityHashMap = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 713) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2075050100:
                    case -1668291470:
                        if (C3998.m12923(itM47859)) {
                            iM3169 = C0773.m3169("᩵᩹") ^ i4;
                            i6 = ((iM3169 ^ i5) * 4015) ^ (-1480827073);
                            i = 1075131184;
                            r9 = r9;
                        } else {
                            iM3169 = (C0619.m2761("ۨۤ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM3169 ^ i4) * (-8277)) ^ 1364947086;
                            i = 1940949199;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -2053954784:
                    case -1545912703:
                        if (C0269.f1558 <= 0) {
                            iM3169 = C0619.m2761("ۘۤ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 22095) ^ (-1798993567);
                            i = -563287027;
                            r9 = r9;
                        } else {
                            iM3169 = (C0773.m3169("᩵᩻") ^ i4) * (-89);
                            i6 = ((iM3169 ^ i5) * (-21127)) ^ (-1813740441);
                            i = -2070253618;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1887592379:
                    case -755740992:
                        C3492.m11485(arrayDeque, (InterfaceC22808) C0950.m3796(itM47859));
                        iM3169 = (C0619.m2761("ۨۗ") + i4) * (-19);
                        i6 = ((iM3169 ^ i5) * 19413) ^ (-365842341);
                        i = -1653279605;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                    case -1809333765:
                    case -132113435:
                        if (interfaceC22808.mo2792()) {
                            iM3169 = (C0619.m2761("ۨۤ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM3169 ^ i4) * (-8277)) ^ 1364947086;
                            i = 1940949199;
                            r9 = r9;
                        } else {
                            iM3169 = C0773.m3169("᩵ܿ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-13931)) ^ 841102530;
                            i = -770489597;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1777947710:
                    case -1255601778:
                        interfaceC22808 = (InterfaceC22808) arrayDeque.pop();
                        if (C3099.f10023 > 0) {
                            iM3169 = (i5 - C0773.m3169("ܽۢ")) * 23;
                            i6 = ((iM3169 ^ i4) * (-28955)) ^ 1772034452;
                            i = 1717431616;
                            r9 = r9;
                            i8 = iM3169 ^ i;
                        } else {
                            iM31611 = C0619.m2761("֡ᩴ") ^ i5;
                            i6 = ((iM31611 ^ i4) * (-11317)) ^ (-1393356481);
                            i7 = 302873455;
                        }
                        break;
                    case -1711621515:
                    case 660099329:
                        if (C2419.m8180(arrayDeque)) {
                            iM3169 = (i5 - C0773.m3169("۬ܳ")) * (-3);
                            i6 = ((iM3169 ^ i4) * 18581) ^ (-1779310039);
                            i = 170909825;
                            r9 = r9;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩶ᩴ")) * (-117);
                            i6 = ((iM3169 ^ i5) * (-4795)) ^ (-1550198984);
                            i = 1426624252;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case -1652596747:
                    case -386716673:
                        return z;
                    case -1477007497:
                    case 979819007:
                        if (!C3077.m10041()) {
                            iM31611 = C0619.m2761("֡ᩴ") ^ i5;
                            i6 = ((iM31611 ^ i4) * (-11317)) ^ (-1393356481);
                            i7 = 302873455;
                        }
                        iM3169 = C0619.m2761("ۘۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 22095) ^ (-1798993567);
                        i = -563287027;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                    case -460364649:
                    case 501925220:
                        C1080.m4050();
                        return false;
                    case -441194031:
                    case 433280418:
                        arrayDeque = new ArrayDeque();
                        itM47859 = C20932.m47859(iterable);
                        iM3169 = (C0619.m2761("ۨۗ") + i4) * (-19);
                        i6 = ((iM3169 ^ i5) * 19413) ^ (-365842341);
                        i = -1653279605;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                    case -21603246:
                    case 126353428:
                        if (interfaceC22808 instanceof C6465) {
                            iM31610 = (C0773.m3169("᩷᩻") ^ i4) * (-69);
                            i6 = ((iM31610 ^ i5) * 30947) ^ (-945564355);
                            i2 = 981407634;
                        } else {
                            iM31610 = C0773.m3169("ᩴ֫") ^ i5;
                            i6 = ((iM31610 ^ i4) * (-12063)) ^ 1431139787;
                            i2 = -1362646054;
                        }
                        i8 = iM31610 ^ i2;
                        z = false;
                        break;
                    case 319074267:
                    case 2026657565:
                        if (C2702.f8586 > 0) {
                            if (C3099.f10023 <= 0 || C1321.f4751 >= 0) {
                                iM31611 = C0619.m2761("֡ᩴ") ^ i5;
                                i6 = ((iM31611 ^ i4) * (-11317)) ^ (-1393356481);
                                i7 = 302873455;
                            } else if (C3492.f12043 > 0) {
                                if (C4282.f15546 > 0) {
                                    if (C2966.f9654 >= 0) {
                                        iM31611 = (C0773.m3169("ܳ֨") ^ i4) * 85;
                                        i6 = ((iM31611 ^ i5) * (-8655)) ^ 345189127;
                                        i7 = -1566792486;
                                    } else if (C0269.f1558 > 0) {
                                        identityHashMap = new IdentityHashMap();
                                        if (C3734.m12152() < 0) {
                                            iM3169 = C0773.m3169("ܿ᩷") ^ i5;
                                            i6 = ((iM3169 ^ i4) * 9999) ^ (-357110859);
                                            i = 590413100;
                                            r9 = r9;
                                            i8 = iM3169 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM31611 = (i5 - C0773.m3169("ܰۡ")) * 21;
                                i6 = ((iM31611 ^ i4) * (-26835)) ^ 1768249361;
                                i7 = -285877706;
                            }
                            break;
                        }
                        iM31611 = (C0619.m2761("᩶᩺") ^ i5) * (-31);
                        i6 = ((iM31611 ^ i4) * (-13441)) ^ (-908363493);
                        i7 = 2097630611;
                        break;
                    case 365853823:
                    case 1579451578:
                        r8 = (r9 == true ? 1 : 0) + 1;
                        iM3169 = C0773.m3169("ܽ᩸") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-873)) ^ 1110182075;
                        i = -324812590;
                        r9 = r8;
                        i8 = iM3169 ^ i;
                        break;
                    case 636770943:
                    case 1795250448:
                        C2966.m9664();
                        C0269.m1775();
                        iM3169 = C0619.m2761("ۘۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 22095) ^ (-1798993567);
                        i = -563287027;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                    case 738874887:
                    case 1180634476:
                        if (AbstractC0116.m1242(identityHashMap, interfaceC22808, Boolean.TRUE) != null) {
                            iM3169 = (C0619.m2761("ۨۤ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM3169 ^ i4) * (-8277)) ^ 1364947086;
                            i = 1940949199;
                            r9 = r9;
                        } else {
                            iM3169 = (C0619.m2761("۬ᩳ") ^ i4) * (-113);
                            i6 = ((iM3169 ^ i5) * 19195) ^ 3030863;
                            i = 778058057;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 786727257:
                    case 2118191453:
                        if (r9 < length) {
                            iM3169 = C0619.m2761("᩶᩶") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-31347)) ^ 1754917914;
                            i = 1239417203;
                            r9 = r9;
                        } else {
                            iM3169 = (C0619.m2761("ۨۤ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM3169 ^ i4) * (-8277)) ^ 1364947086;
                            i = 1940949199;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 951964520:
                    case 1480017685:
                        interfaceC22808Arr = c6465.f21763;
                        length = interfaceC22808Arr.length;
                        r8 = z;
                        iM3169 = C0773.m3169("ܽ᩸") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-873)) ^ 1110182075;
                        i = -324812590;
                        r9 = r8;
                        i8 = iM3169 ^ i;
                        break;
                    case 986834029:
                    case 1397098498:
                        c6465 = (C6465) interfaceC22808;
                        if (RunnableC0334.m2051(c6465.f21754) <= 0) {
                            iM3169 = C0773.m3169("᩵ܿ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-13931)) ^ 841102530;
                            i = -770489597;
                            r9 = r9;
                        } else {
                            iM3169 = C0773.m3169("۠ۧ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 15019) ^ (-43569686);
                            i = -1436599237;
                            r9 = r9;
                        }
                        i8 = iM3169 ^ i;
                        break;
                    case 1165458962:
                    case 1577156840:
                        return true;
                    case 1558816475:
                    case 1741498639:
                        if (C2485.f7950 != 0) {
                            iM31611 = (C0619.m2761("᩶᩺") ^ i5) * (-31);
                            i6 = ((iM31611 ^ i4) * (-13441)) ^ (-908363493);
                            i7 = 2097630611;
                        }
                        iM3169 = (C0773.m3169("᩵᩻") ^ i4) * (-89);
                        i6 = ((iM3169 ^ i5) * (-21127)) ^ (-1813740441);
                        i = -2070253618;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                    case 1719767333:
                    case 1929387045:
                        C2419.m8165(arrayDeque, interfaceC22808Arr[r9 == true ? 1 : 0]);
                        if (C2966.f9654 < 0) {
                            iM3169 = (C0619.m2761("ۧ᩵") ^ i4) * (-59);
                            i6 = ((iM3169 ^ i5) * 11753) ^ 1788939665;
                            i = 812875229;
                            r9 = r9;
                            i8 = iM3169 ^ i;
                        } else {
                            iM31611 = (C0773.m3169("ܳ֨") ^ i4) * 85;
                            i6 = ((iM31611 ^ i5) * (-8655)) ^ 345189127;
                            i7 = -1566792486;
                        }
                        break;
                    default:
                        C3779.m12264();
                        if (C0773.f2792 > 0) {
                            iM31611 = (C0773.m3169("ܳ֨") ^ i4) * 85;
                            i6 = ((iM31611 ^ i5) * (-8655)) ^ 345189127;
                            i7 = -1566792486;
                        }
                        iM3169 = (C0773.m3169("᩵᩻") ^ i4) * (-89);
                        i6 = ((iM3169 ^ i5) * (-21127)) ^ (-1813740441);
                        i = -2070253618;
                        r9 = r9;
                        i8 = iM3169 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44314(InterfaceC22808[] interfaceC22808Arr) {
        int length = 0;
        int i = 0;
        InterfaceC22808 interfaceC22808 = null;
        int i2 = 1908929806;
        int i3 = C1783.f6087;
        int i4 = C1826.f6190;
        int iM3169 = C0773.m3169("᩺۟") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-17269)) ^ 1388183953;
        int i6 = -495403808;
        while (true) {
            i2 = ((((i2 ^ i4) * (-18175)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2027058910:
                case 4477957:
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("ۗۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-24297)) ^ (-106410450);
                        i6 = -1165288996;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩷ۙ")) * 53;
                        i5 = ((iM3169 ^ i3) * 8899) ^ (-530432731);
                        i6 = -1497969394;
                    }
                    break;
                case -2011910240:
                case 2073685491:
                    interfaceC22808 = interfaceC22808Arr[i];
                    iM3169 = (C0619.m2761("᩺ܽ") + i4) * 19;
                    i5 = ((iM3169 ^ i3) * 31901) ^ (-1611694284);
                    i6 = 80122468;
                    break;
                case -1853921552:
                case -653257353:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ۖۖ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i4) * 27841) ^ (-1670035442);
                        i6 = -1553503953;
                    } else {
                        iM3169 = C0619.m2761("᩸֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * 14575) ^ 1030028488;
                        i6 = 814933381;
                    }
                    break;
                case -1766176033:
                case 1149155111:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ܽۖ") ^ i3) * (-57);
                        i5 = ((iM3169 ^ i4) * (-8447)) ^ (-616424912);
                        i6 = -560965463;
                    } else {
                        iM3169 = (C0619.m2761("ܳ۟") + i4) * (-107);
                        i5 = ((iM3169 ^ i3) * (-27637)) ^ 1320855081;
                        i6 = -685401348;
                    }
                    break;
                case -1558703866:
                case 2038881338:
                    try {
                        RunnableC3055.m9929(interfaceC22808);
                        break;
                    } catch (IOException unused) {
                    }
                    iM3169 = (C0773.m3169("۟ܶ") + i3) * (-97);
                    i5 = ((iM3169 ^ i4) * 27423) ^ (-1362116394);
                    i6 = 526741901;
                    break;
                case -1529058496:
                case 708395902:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ۖۖ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i4) * 27841) ^ (-1670035442);
                        i6 = -1553503953;
                    } else {
                        iM3169 = C0773.m3169("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14921) ^ 270004920;
                        i6 = -1085425260;
                    }
                    break;
                case -1486778691:
                case 309350022:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("ܳ۟") + i4) * (-107);
                        i5 = ((iM3169 ^ i3) * (-27637)) ^ 1320855081;
                        i6 = -685401348;
                    } else {
                        iM3169 = C0773.m3169("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14921) ^ 270004920;
                        i6 = -1085425260;
                    }
                    break;
                case -1471156557:
                case 1891029918:
                    length = interfaceC22808Arr.length;
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ܽۖ") ^ i3) * (-57);
                        i5 = ((iM3169 ^ i4) * (-8447)) ^ (-616424912);
                        i6 = -560965463;
                    } else {
                        iM3169 = (C0619.m2761("ۨۙ") ^ i4) * (-125);
                        i5 = ((iM3169 ^ i3) * (-11981)) ^ (-1941160543);
                        i6 = 1590232787;
                    }
                    break;
                case -720229810:
                case 1073615113:
                    if (i < length) {
                        iM3169 = (C0619.m2761("ᩴۨ") + i3) * 81;
                        i5 = ((iM3169 ^ i4) * 11001) ^ (-1591820330);
                        i6 = 181241;
                    } else {
                        iM3169 = C0773.m3169("ܽܿ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13329)) ^ (-1648923474);
                        i6 = 1324707042;
                    }
                    break;
                case -662110575:
                case 1071046915:
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("֫᩶") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17873) ^ 2142477145;
                        i6 = -2065063753;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩷ۙ")) * 53;
                        i5 = ((iM3169 ^ i3) * 8899) ^ (-530432731);
                        i6 = -1497969394;
                    }
                    break;
                case -609724913:
                case 428581794:
                    C2310.m7813();
                    AbstractC0116.m1243();
                    break;
                case -563154721:
                case 1378948594:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14921) ^ 270004920;
                        i6 = -1085425260;
                    } else {
                        iM3169 = C0619.m2761("۬ۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 11839) ^ (-860147899);
                        i6 = -1833154017;
                    }
                    break;
                case -536061573:
                case 726246264:
                    i = 0;
                    iM3169 = (C0619.m2761("ܺܺ") ^ i3) * 63;
                    i5 = ((iM3169 ^ i4) * 347) ^ 1697054904;
                    i6 = 2098270147;
                    break;
                case -445430639:
                case 1819529708:
                    if (RunnableC0334.m2063()) {
                        iM3169 = (i4 - C0773.m3169("᩷ۙ")) * 53;
                        i5 = ((iM3169 ^ i3) * 8899) ^ (-530432731);
                        i6 = -1497969394;
                    } else {
                        iM3169 = (C0773.m3169("ۨ֡") ^ i3) * 43;
                        i5 = ((iM3169 ^ i4) * (-4693)) ^ (-467151439);
                        i6 = -1345722830;
                    }
                    break;
                case -55591868:
                case 2057680451:
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("᩺ۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-21485)) ^ 1358699508;
                        i6 = 801800095;
                    } else {
                        iM3169 = C0773.m3169("ۡܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 14921) ^ 270004920;
                        i6 = -1085425260;
                    }
                    break;
                case -30548204:
                case 705738919:
                    break;
                case -21685890:
                case 1056815812:
                    i++;
                    iM3169 = (C0619.m2761("ܺܺ") ^ i3) * 63;
                    i5 = ((iM3169 ^ i4) * 347) ^ 1697054904;
                    i6 = 2098270147;
                    break;
                case 1012658319:
                case 1977516827:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ܽۖ") ^ i3) * (-57);
                        i5 = ((iM3169 ^ i4) * (-8447)) ^ (-616424912);
                        i6 = -560965463;
                    } else {
                        iM3169 = (C0773.m3169("۠᩶") ^ i3) * (-77);
                        i5 = ((iM3169 ^ i4) * 14405) ^ (-1159351086);
                        i6 = -275895933;
                    }
                    break;
                case 1102953635:
                case 1527673810:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (i4 - C0773.m3169("᩷ۙ")) * 53;
                        i5 = ((iM3169 ^ i3) * 8899) ^ (-530432731);
                        i6 = -1497969394;
                    } else {
                        iM3169 = C0619.m2761("᩷۠") ^ i3;
                        i5 = ((iM3169 ^ i4) * 26723) ^ 361674799;
                        i6 = -853877859;
                    }
                    break;
                case 1261205478:
                case 1783250319:
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("ۖۖ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM3169 ^ i4) * 27841) ^ (-1670035442);
                        i6 = -1553503953;
                    } else {
                        iM3169 = (i4 - C0773.m3169("֨᩻")) * 115;
                        i5 = ((iM3169 ^ i3) * 16363) ^ (-1529612358);
                        i6 = 658843111;
                    }
                    break;
                default:
                    C0269.m1775();
                    C23916.m53419();
                    iM3169 = C0773.m3169("ۡܽ") ^ i4;
                    i5 = ((iM3169 ^ i3) * 14921) ^ 270004920;
                    i6 = -1085425260;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C19143 m44297(l.C13111 r84, java.io.DataInput r85, l.InterfaceC2867 r86) {
        /*
            Method dump skipped, instruction units count: 4432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44297(l.۫۫ܳ, java.io.DataInput, l.ۖᩴܳ):l.ᩳܳܳ");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static IOException m44341(String str) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 515966813;
        int i5 = C2702.f8586;
        int i6 = C2310.f7472;
        int iM3169 = (i5 - C0773.m3169("ۛ᩺")) * 15;
        int i7 = ((iM3169 ^ i6) * (-15215)) ^ 1165751849;
        int i8 = -344319890;
        while (true) {
            i4 = ((((i4 ^ i6) * (-21891)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2005903384:
                case 1040040520:
                    s2 = 1;
                    if (C3690.m11987()) {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9775)) ^ (-1973158021);
                        i8 = -1813406277;
                    } else {
                        iM3169 = C0619.m2761("᩶۠") ^ i5;
                        i7 = ((iM3169 ^ i6) * 26471) ^ 1994876482;
                        i8 = -451075924;
                    }
                    break;
                case -1924327848:
                case 1606027445:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ۜܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * (-12615)) ^ 2091960690;
                        i8 = -1718267287;
                    } else {
                        iM3169 = C0619.m2761("᩹ۗ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 9681) ^ 1171052938;
                        i8 = 1688951346;
                    }
                    break;
                case -1849584947:
                case 1240705829:
                    i3 = 12825;
                    iM3169 = C0619.m2761("ۗ۠") ^ i5;
                    i7 = ((iM3169 ^ i6) * 13059) ^ 1477383877;
                    i8 = 154759420;
                    break;
                case -1783095860:
                case 1901596260:
                    i3 = 38709;
                    iM3169 = C0619.m2761("ۗ۠") ^ i5;
                    i7 = ((iM3169 ^ i6) * 13059) ^ 1477383877;
                    i8 = 154759420;
                    break;
                case -1625805629:
                case 1387717863:
                    C2287.m7745();
                    return null;
                case -1520392753:
                case 196715736:
                    C17202.m40372();
                    iM3169 = (C0619.m2761("ܿۨ") + i5) * (-73);
                    i7 = ((iM3169 ^ i6) * (-27783)) ^ 31688862;
                    i8 = 178979252;
                    break;
                case -848154197:
                case -22773814:
                    C0773.m3161();
                    if (!RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("ܿۨ") + i5) * (-73);
                        i7 = ((iM3169 ^ i6) * (-27783)) ^ 31688862;
                        i8 = 178979252;
                    } else {
                        iM3169 = (C0619.m2761("ۜܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * (-12615)) ^ 2091960690;
                        i8 = -1718267287;
                    }
                    break;
                case -821862260:
                case -76907892:
                    s = sArr[c];
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9775)) ^ (-1973158021);
                        i8 = -1813406277;
                    } else {
                        iM3169 = C0619.m2761("᩸ܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-16649)) ^ (-1147365249);
                        i8 = 560763095;
                    }
                    break;
                case -720663683:
                case 652711102:
                    sArr = f61940;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9775)) ^ (-1973158021);
                        i8 = -1813406277;
                    } else {
                        iM3169 = C0619.m2761("᩺ۘ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-10107)) ^ (-1662475254);
                        i8 = 1534863007;
                    }
                    break;
                case -611871492:
                case 355419129:
                    if (C0950.f3488 < 0) {
                        iM3169 = (C0619.m2761("ܰ᩶") + i5) * (-93);
                        i7 = ((iM3169 ^ i6) * (-26929)) ^ (-853749982);
                        i8 = -2003969054;
                    } else {
                        iM3169 = (C0619.m2761("ܿۨ") + i5) * (-73);
                        i7 = ((iM3169 ^ i6) * (-27783)) ^ 31688862;
                        i8 = 178979252;
                    }
                    break;
                case -144859088:
                case 1412590210:
                    i = s * 2;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9775)) ^ (-1973158021);
                        i8 = -1813406277;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩸ۗ")) * (-91);
                        i7 = ((iM3169 ^ i6) * 32633) ^ (-441009845);
                        i8 = 1824496778;
                    }
                    break;
                case 545348936:
                case 1096240553:
                    short[] sArr2 = f61940;
                    if (RunnableC3055.f9898 >= 0 || C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("᩷ܿ") + i6) * 53;
                        i7 = ((iM3169 ^ i5) * 25611) ^ (-681940094);
                        i8 = -1804238178;
                    } else {
                        if (C1542.f5343 > 0) {
                            return new IOException(C25272.m56409(C3033.m9847(sArr2, 961, 24, i3), str));
                        }
                        iM3169 = (C0619.m2761("ۜܰ") + i6) * 21;
                        i7 = ((iM3169 ^ i5) * (-12615)) ^ 2091960690;
                        i8 = -1718267287;
                    }
                    break;
                case 647614296:
                case 755377787:
                    i2 = i + 1;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ܰ᩶") + i5) * (-93);
                        i7 = ((iM3169 ^ i6) * (-26929)) ^ (-853749982);
                        i8 = -2003969054;
                    } else {
                        iM3169 = C0619.m2761("᩸ۙ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-16489)) ^ (-1589506180);
                        i8 = -338890128;
                    }
                    break;
                case 668375460:
                case 2031164567:
                    C0269.m1775();
                    if (C3734.f12817 < 0) {
                        iM3169 = (C0773.m3169("᩷ܿ") + i6) * 53;
                        i7 = ((iM3169 ^ i5) * 25611) ^ (-681940094);
                        i8 = -1804238178;
                    } else {
                        iM3169 = (C0619.m2761("ܿۨ") + i5) * (-73);
                        i7 = ((iM3169 ^ i6) * (-27783)) ^ 31688862;
                        i8 = 178979252;
                    }
                    break;
                case 751208176:
                case 1331835889:
                    c = 960;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-9775)) ^ (-1973158021);
                        i8 = -1813406277;
                    } else {
                        iM3169 = (C0773.m3169("ۨ۬") + i5) * 51;
                        i7 = ((iM3169 ^ i6) * 26621) ^ (-374970699);
                        i8 = -1589161268;
                    }
                    break;
                default:
                    int i9 = s + s2;
                    if ((i9 * i9) - i2 < 0) {
                        iM3169 = (C0773.m3169("ۜۜ") ^ i6) * 77;
                        i7 = ((iM3169 ^ i5) * 8617) ^ (-1750044471);
                        i8 = 470867745;
                    } else {
                        iM3169 = (C0773.m3169("֡۟") ^ i6) * 5;
                        i7 = ((iM3169 ^ i5) * 25859) ^ (-1965058507);
                        i8 = 1728978182;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44370() {
        synchronized (this) {
            m44332();
            m44328();
            m44278();
            if (C2419.m8180(this.f61950)) {
                return false;
            }
            C21381 c21381 = this.f61954;
            C21381 c21382 = (C21381) this.f61950.removeLast();
            long j = this.f61948;
            long j2 = c21382.f68096;
            C14799 c14799 = c21382.f68086;
            this.f61948 = j - (j2 + (c14799 == null ? 0L : c14799.m35638()));
            boolean zM44317 = m44317(this.f61957, this.f61954.m48615(0L));
            long j3 = this.f61942 + 1;
            this.f61942 = j3;
            this.f61954 = c21382.m48615(j3);
            m44311(c21381, c21381.f68086, true);
            for (InterfaceC22808 interfaceC22808 : zM44317 ? m44355() : f61938) {
                try {
                    RunnableC3055.m9929(interfaceC22808);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m44358() {
        synchronized (this) {
            m44332();
            m44328();
            m44278();
            if (C3492.m11482(this.f61957)) {
                return false;
            }
            C21381 c21381 = this.f61954;
            C21381 c21382 = (C21381) this.f61957.removeLast();
            long j = this.f61948;
            long j2 = c21382.f68096;
            C14799 c14799 = c21382.f68086;
            this.f61948 = j - (j2 + (c14799 == null ? 0L : c14799.m35638()));
            boolean zM44317 = m44317(this.f61950, this.f61954.m48615(0L));
            long j3 = this.f61942 + 1;
            this.f61942 = j3;
            this.f61954 = c21382.m48615(j3);
            m44311(c21381, c21382.f68086, false);
            for (InterfaceC22808 interfaceC22808 : zM44317 ? m44355() : f61938) {
                try {
                    AbstractC0641.m2821(interfaceC22808);
                } catch (IOException unused) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44348(C13856 c13856, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM2761;
        int i;
        C8636 c8636 = null;
        InterfaceC22808 interfaceC22808 = null;
        int i2 = 0;
        C6465 c6465 = null;
        Long l2 = null;
        long jM9672 = 0;
        int i3 = -657072475;
        int i4 = C1564.f5401;
        int i5 = AbstractC0641.f2496;
        int iM3169 = C0773.m3169("ۗ᩸") ^ i4;
        int i6 = ((iM3169 ^ i5) * (-24729)) ^ 691114244;
        int i7 = -1937252546;
        while (true) {
            int i8 = iM3169 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 32375) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2029121796:
                    case -138288142:
                        if (C13473.f42873 == 0) {
                            iM3169 = C0773.m3169("ܶ᩹") ^ i4;
                            i6 = ((iM3169 ^ i5) * 4057) ^ 1429788868;
                            i7 = -1105323044;
                        } else {
                            iM3169 = (C0773.m3169("᩶᩷") ^ i4) * (-63);
                            i6 = ((iM3169 ^ i5) * (-343)) ^ (-222551652);
                            i7 = -67843920;
                        }
                        break;
                    case -1990570433:
                    case -1166590532:
                        if (C2419.f7754 < 0) {
                            iM3169 = (i5 - C0773.m3169("۟ᩴ")) * (-63);
                            i6 = ((iM3169 ^ i4) * 20939) ^ 1257385364;
                            i7 = 1386547649;
                        } else {
                            iM3169 = (i5 - C0773.m3169("ܳۘ")) * (-27);
                            i6 = ((iM3169 ^ i4) * 20495) ^ 398288511;
                            i7 = 703399725;
                        }
                        break;
                    case -1984965072:
                    case -434795336:
                        break;
                    case -1911642028:
                    case -1084330208:
                        boolean zM4855 = C1321.m4855(c13856);
                        C8636 c8637 = c13856.f43958;
                        if (zM4855) {
                            iM2761 = C0773.m3169("᩺ۢ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-10545)) ^ 1277227406;
                            i = 1379293183;
                        } else {
                            iM2761 = (C0619.m2761("ۙ۟") + i5) * 27;
                            i6 = ((iM2761 ^ i4) * (-6345)) ^ 43543247;
                            i = -287657257;
                        }
                        i8 = iM2761 ^ i;
                        c8636 = c8637;
                        break;
                    case -1830704544:
                    case -1168610933:
                        RunnableC3646.m11813();
                        C2288.m7767();
                        iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 61;
                        i6 = ((iM3169 ^ i5) * 30723) ^ (-338314644);
                        i7 = 254084042;
                    case -1739893699:
                    case 1920759084:
                        if (C2375.m8065() <= 0) {
                            iM3169 = (C0619.m2761("ۘۙ") ^ i5) * (-97);
                            i6 = ((iM3169 ^ i4) * 18253) ^ 1303925165;
                            i7 = -545948570;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 61;
                            i6 = ((iM3169 ^ i5) * 30723) ^ (-338314644);
                            i7 = 254084042;
                        }
                        break;
                    case -1562050911:
                    case -1218861823:
                        C1343.m4943();
                        if (C2834.m9344() < 0) {
                            iM3169 = (C0773.m3169("᩶᩷") ^ i4) * (-63);
                            i6 = ((iM3169 ^ i5) * (-343)) ^ (-222551652);
                            i7 = -67843920;
                            break;
                        }
                        iM3169 = (i5 - C0773.m3169("ܳۘ")) * (-27);
                        i6 = ((iM3169 ^ i4) * 20495) ^ 398288511;
                        i7 = 703399725;
                        break;
                    case -1414986046:
                    case -771928501:
                        jM9672 = C2966.m9672(l2.longValue(), i2);
                        if (C0487.f2131 > 0) {
                            iM3169 = (i4 - C0619.m2761("۠۫")) * (-23);
                            i6 = ((iM3169 ^ i5) * (-18287)) ^ 732127108;
                            i7 = -1380302282;
                        } else {
                            iM3169 = (C0619.m2761("ۘۙ") ^ i5) * (-97);
                            i6 = ((iM3169 ^ i4) * 18253) ^ 1303925165;
                            i7 = -545948570;
                        }
                        break;
                    case -1400973107:
                    case 211036544:
                        AbstractC3624.m11766(identityHashMap, c6465, C1542.m5460(i2));
                        C1519.m5406(arrayList, c6465);
                        break;
                    case -1324826040:
                    case -166670324:
                        if (C1826.f6190 > 0) {
                            iM3169 = C0619.m2761("۬᩷") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-11701)) ^ (-1707345627);
                            i7 = 1168923483;
                        } else {
                            iM3169 = (i5 - C0773.m3169("ܳۘ")) * (-27);
                            i6 = ((iM3169 ^ i4) * 20495) ^ 398288511;
                            i7 = 703399725;
                        }
                        break;
                    case -997654420:
                    case 527543130:
                        if (!RunnableC1848.m6360()) {
                            iM3169 = (i4 - C0619.m2761("ۛ᩺")) * 45;
                            i6 = ((iM3169 ^ i5) * (-30707)) ^ 1153545792;
                            i7 = -1105265326;
                        } else {
                            iM3169 = (C0773.m3169("᩶᩷") ^ i4) * (-63);
                            i6 = ((iM3169 ^ i5) * (-343)) ^ (-222551652);
                            i7 = -67843920;
                        }
                        break;
                    case -814137438:
                    case 986383913:
                        if (RunnableC3055.f9898 < 0) {
                            iM3169 = C0773.m3169("ۗۢ") ^ i4;
                            i6 = ((iM3169 ^ i5) * 25161) ^ 986550777;
                            i7 = -204638873;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 61;
                            i6 = ((iM3169 ^ i5) * 30723) ^ (-338314644);
                            i7 = 254084042;
                        }
                        break;
                    case -400284952:
                    case 848712950:
                        if (C1564.f5401 > 0) {
                            iM3169 = C0619.m2761("ۚܳ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-5779)) ^ 415940606;
                            i7 = -1179491511;
                        } else {
                            iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 61;
                            i6 = ((iM3169 ^ i5) * 30723) ^ (-338314644);
                            i7 = 254084042;
                        }
                        break;
                    case -382656755:
                    case 681741796:
                        interfaceC22808 = c8636.f28220;
                        i2 = c8636.f28219;
                        if (!(interfaceC22808 instanceof C6465)) {
                            iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 29635) ^ 924561899;
                            i7 = 1824727786;
                        } else {
                            iM3169 = C0773.m3169("ܽۗ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-27593)) ^ (-1021246793);
                            i7 = -36382413;
                        }
                        break;
                    case -265689027:
                    case 1246191455:
                        m44348(c13856.f43960, identityHashMap, arrayList);
                        m44348(c13856.f43955, identityHashMap, arrayList);
                        break;
                    case -161868138:
                    case 1052785044:
                        if (!C0619.f2439) {
                            iM3169 = (C0619.m2761("ܳۨ") ^ i4) * (-71);
                            i6 = ((iM3169 ^ i5) * 9689) ^ (-1125421474);
                            i7 = 915146334;
                        } else {
                            iM3169 = (C0619.m2761("ۜܽ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM3169 ^ i4) * (-31223)) ^ (-1343277666);
                            i7 = -2052915332;
                        }
                        break;
                    case 491800288:
                    case 1372864478:
                        AbstractC0116.m1242(identityHashMap, c6465, C3690.m12001(jM9672));
                        iM3169 = C0619.m2761("᩺ۚ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 29635) ^ 924561899;
                        i7 = 1824727786;
                        break;
                    case 781982274:
                    case 1699079390:
                        C0619.m2763();
                        if (RunnableC3646.m11813() == 0) {
                            iM3169 = (i5 - C0773.m3169("ܳۘ")) * (-27);
                            i6 = ((iM3169 ^ i4) * 20495) ^ 398288511;
                            i7 = 703399725;
                            break;
                        }
                        iM3169 = (i4 - C0773.m3169("᩺ܳ")) * 61;
                        i6 = ((iM3169 ^ i5) * 30723) ^ (-338314644);
                        i7 = 254084042;
                        break;
                    case 862399778:
                    case 1698030628:
                        if (C20932.f66974 > 0) {
                            iM3169 = (C0773.m3169("۬ܿ") + i5) * (-109);
                            i6 = ((iM3169 ^ i4) * 31651) ^ 237216390;
                            i7 = 350921609;
                        } else {
                            iM3169 = (C0619.m2761("ۘۙ") ^ i5) * (-97);
                            i6 = ((iM3169 ^ i4) * 18253) ^ 1303925165;
                            i7 = -545948570;
                        }
                        break;
                    case 915465896:
                    case 1222003858:
                        if (C1146.f4234 < 0) {
                            iM3169 = C0619.m2761("ۘ֫") ^ i4;
                            i6 = ((iM3169 ^ i5) * 2721) ^ (-2048517210);
                            i7 = -976660672;
                        } else {
                            iM3169 = (C0619.m2761("ۜܽ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM3169 ^ i4) * (-31223)) ^ (-1343277666);
                            i7 = -2052915332;
                        }
                        break;
                    case 1010131489:
                    case 1996598267:
                        c6465 = (C6465) interfaceC22808;
                        l2 = (Long) identityHashMap.get(c6465);
                        if (l2 != null) {
                            iM3169 = (C0773.m3169("۟֡") + i4) * (-9);
                            i6 = ((iM3169 ^ i5) * 15759) ^ (-1673450);
                            i7 = 1633431368;
                        } else {
                            iM3169 = C0619.m2761("۟ۧ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-8569)) ^ 2000470354;
                            i7 = 648779479;
                        }
                        break;
                    default:
                        AbstractC3624.m11755();
                        C3077.m10041();
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0150  */
    /* JADX WARN: Code duplicated, block: B:57:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0225  */
    /* JADX WARN: Code duplicated, block: B:73:0x0251  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (l.C20932.m47848() != 0) goto L12;
     */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44375(int r18, int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44375(int, int, byte[]):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C0498 m44378() {
        C0498 c0498;
        m44332();
        m44328();
        m44278();
        c0498 = new C0498(this, this.f61954, this.f61958, this.f61949.m55979());
        this.f61956 = c0498;
        return c0498;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C0498 m44360(C4908 c4908) {
        C0498 c0498;
        short s = f61940[1061];
        int i = s + 1758;
        int i2 = (s * 7032) - (i * i) > 0 ? 33375 : 16961;
        synchronized (this) {
            m44332();
            m44328();
            m44278();
            C17359.requireNonNull(c4908, C20932.m47853(f61940, 1062, 8, i2));
            c4908.m15067();
            if (c4908.f17142 != this.f61944) {
                throw new IllegalArgumentException(C2419.m8166(f61940, 1070, 36, i2));
            }
            C21381 c21381 = this.f61954;
            if (c4908.f17145 != this.f61958 || c4908.m15063() != c21381.f68091 || c4908.f17141 != c21381.f68092 || c4908.f17147 != c21381.f68095) {
                throw new IllegalStateException(C2834.m9343(f61940, 1106, 17, i2));
            }
            m44377();
            c4908.m15065();
            c0498 = new C0498(this, c21381, this.f61958, this.f61949.m55979());
            this.f61956 = c0498;
        }
        return c0498;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44366(C24365 c24365, C13111 c13111) throws C12893 {
        int i;
        InterfaceC22808[] interfaceC22808Arr;
        short s = f61940[1196];
        int i2 = s + 15219;
        int i3 = (s * 60876) - (i2 * i2) > 0 ? 55550 : 57651;
        String strM10047 = C3077.m10047(f61940, 1197, 20, i3);
        C3099.m10086(c24365);
        C1321.m4848(c13111);
        if (!c13111.mo2792()) {
            throw new C12893();
        }
        synchronized (this) {
            m44332();
            if (c24365.f79065 != this) {
                throw new IllegalArgumentException(C0950.m3780(f61940, 1217, 38, i3));
            }
            if (c24365.f79066 || this.f61952 != c24365) {
                throw new IllegalStateException(C3077.m10047(f61940, 1255, 24, i3));
            }
            if (this.f61951.containsKey(c13111)) {
                throw new IllegalArgumentException(C17202.m40377(f61940, 1279, 41, i3));
            }
            C21381 c21381 = this.f61954;
            if (c24365.f79064 != this.f61958 || c24365.f79063 != c21381 || c24365.f79063.f68092 != c21381.f68092 || c24365.f79063.f68095 != c21381.f68095 || c24365.f79063.f68091 != c21381.f68091) {
                throw new IllegalStateException(C2878.m9486(f61940, 1320, 19, i3));
            }
            if (c13111.length() != c21381.m48614()) {
                StringBuilder sb = new StringBuilder(strM10047);
                C1783.m6237(sb, c13111.length());
                C3779.m12258(sb, C17202.m40377(f61940, 1339, 20, i3));
                C1783.m6237(sb, c21381.m48614());
                throw new IllegalArgumentException(C1080.m4058(sb));
            }
            if (!c13111.mo2792()) {
                throw new C12893();
            }
            interfaceC22808Arr = (InterfaceC22808[]) C0619.m2758(this.f61951).toArray(new InterfaceC22808[0]);
            InterfaceC22808 interfaceC22808 = this.f61953;
            if (interfaceC22808 instanceof InterfaceC2122) {
                ((InterfaceC2122) interfaceC22808).mo7314();
            }
            this.f61951.clear();
            AbstractC3624.m11766(this.f61951, c13111, Boolean.TRUE);
            this.f61953 = c13111;
            this.f61949 = new C25111();
            this.f61950.clear();
            this.f61957.clear();
            this.f61948 = 0L;
            this.f61958++;
            m44352();
            C13856 c13856M45220 = C19606.m45220(c13111);
            C17037 c17037M47504 = C20767.m47504(c13111.length(), false);
            long j = this.f61942 + 1;
            this.f61942 = j;
            this.f61954 = new C21381(c13856M45220, c17037M47504, false, j, 0L, 0L, 0L, 0L, 0L);
            m44311(c21381, new C24497().m54755(), false);
            this.f61952 = null;
            c24365.f79066 = true;
        }
        try {
            c24365.f79062.close();
        } catch (IOException unused) {
        }
        for (InterfaceC22808 interfaceC22809 : interfaceC22808Arr) {
            try {
                AbstractC0641.m2821(interfaceC22809);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x058a A[PHI: r19 r20 r21
      0x058a: PHI (r19v34 byte) = (r19v12 byte), (r19v18 byte), (r19v35 byte) binds: [B:134:0x0588, B:114:0x04b2, B:26:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r20v5 int) = (r20v3 int), (r20v4 int), (r20v3 int) binds: [B:134:0x0588, B:114:0x04b2, B:26:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r21v25 l.۠۫ܳ) = (r21v4 l.۠۫ܳ), (r21v10 l.۠۫ܳ), (r21v26 l.۠۫ܳ) binds: [B:134:0x0588, B:114:0x04b2, B:26:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x05dc A[PHI: r19 r21
      0x05dc: PHI (r19v40 byte) = (r19v11 byte), (r19v13 byte), (r19v33 byte), (r19v44 byte) binds: [B:139:0x05da, B:130:0x0564, B:29:0x00e1, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x05dc: PHI (r21v31 l.۠۫ܳ) = (r21v3 l.۠۫ܳ), (r21v5 l.۠۫ܳ), (r21v24 l.۠۫ܳ), (r21v34 l.۠۫ܳ) binds: [B:139:0x05da, B:130:0x0564, B:29:0x00e1, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0613 A[PHI: r19 r21
      0x0613: PHI (r19v36 byte) = (r19v10 byte), (r19v14 byte), (r19v37 byte) binds: [B:143:0x0611, B:126:0x0540, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0613: PHI (r21v27 l.۠۫ܳ) = (r21v2 l.۠۫ܳ), (r21v6 l.۠۫ܳ), (r21v28 l.۠۫ܳ) binds: [B:143:0x0611, B:126:0x0540, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0649 A[PHI: r13 r19 r21
      0x0649: PHI (r13v3 short) = (r13v2 short), (r13v4 short) binds: [B:147:0x0647, B:118:0x04de] A[DONT_GENERATE, DONT_INLINE]
      0x0649: PHI (r19v16 byte) = (r19v9 byte), (r19v17 byte) binds: [B:147:0x0647, B:118:0x04de] A[DONT_GENERATE, DONT_INLINE]
      0x0649: PHI (r21v8 l.۠۫ܳ) = (r21v1 l.۠۫ܳ), (r21v9 l.۠۫ܳ) binds: [B:147:0x0647, B:118:0x04de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
    
        if (l.C1146.f4234 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
    
        if (l.C1564.f5401 > 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m44299(java.io.DataOutputStream r25, l.C13856 r26, l.InterfaceC22808 r27, java.util.IdentityHashMap r28, java.util.IdentityHashMap r29, java.util.HashMap r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44299(java.io.DataOutputStream, l.۬۫ܳ, l.᩸۫ܳ, java.util.IdentityHashMap, java.util.IdentityHashMap, java.util.HashMap):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44365(C24365 c24365) {
        short s = f61940[1133];
        int i = s + 1;
        int i2 = ((s * 2) + 1) - (i * i) > 0 ? 45097 : 54190;
        synchronized (this) {
            if (c24365.f79065 != this) {
                throw new IllegalArgumentException(C23916.m53420(f61940, 1134, 38, i2));
            }
            if (c24365.f79066) {
                return;
            }
            if (this.f61952 == c24365) {
                this.f61952 = null;
            } else if (!this.f61946) {
                throw new IllegalStateException(C2310.m7803(f61940, 1172, 24, i2));
            }
            c24365.f79066 = true;
            c24365.f79062.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f61946) {
                return;
            }
            C0498 c0498 = this.f61956;
            if (c0498 != null) {
                c0498.m2409();
            }
            IOException iOException = null;
            this.f61952 = null;
            this.f61946 = true;
            this.f61950.clear();
            this.f61957.clear();
            this.f61948 = 0L;
            m44352();
            InterfaceC22808[] interfaceC22808Arr = (InterfaceC22808[]) C0619.m2758(this.f61951).toArray(new InterfaceC22808[0]);
            this.f61951.clear();
            for (InterfaceC22808 interfaceC22808 : interfaceC22808Arr) {
                try {
                    AbstractC0641.m2821(interfaceC22808);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        C1146.m4219(iOException, e);
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m44326() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -1223239590;
        int i6 = C1146.f4234;
        int i7 = AbstractC0641.f2496;
        int iM3169 = (C0773.m3169("ۡ۟") + i7) * 55;
        int i8 = ((iM3169 ^ i6) * (-31809)) ^ 391561286;
        int i9 = 1032619470;
        while (true) {
            i5 = ((((i5 ^ i6) * 18201) >> 31) & i8) ^ (iM3169 ^ i9);
            switch (i5) {
                case -1925351451:
                case -764587526:
                    int i10 = s + s2;
                    if ((i10 * i10) - i3 > 0) {
                        iM3169 = C0619.m2761("ۛۖ") ^ i6;
                        i8 = ((iM3169 ^ i7) * 30551) ^ (-381530880);
                        i9 = 1644935688;
                    } else {
                        iM3169 = C0773.m3169("֫֡") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-31869)) ^ (-1703874469);
                        i9 = 628962651;
                    }
                    break;
                case -1917045118:
                case 824108718:
                    if (this.f61946) {
                        iM3169 = C0619.m2761("ܰܺ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-4093)) ^ (-1121709812);
                        i9 = -381368630;
                    } else {
                        iM3169 = C0619.m2761("᩷ۧ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-10975)) ^ (-1363081684);
                        i9 = -1243500052;
                    }
                    break;
                case -1715953441:
                case -324268781:
                    i = s * s;
                    i2 = 1582564;
                    if (C2966.m9664()) {
                        iM3169 = C0619.m2761("ᩴᩴ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-8367)) ^ (-928162382);
                        i9 = -770028249;
                    } else {
                        iM3169 = C0773.m3169("ܿ۠") ^ i6;
                        i8 = ((iM3169 ^ i7) * 8433) ^ 1736566239;
                        i9 = -1952929330;
                    }
                    break;
                case -1648163853:
                case 1004605517:
                    if (C23916.f77426 > 0) {
                        iM3169 = C0773.m3169("ۚ۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-29129)) ^ (-563928797);
                        i9 = -262495386;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۢ") ^ i7) * (-81);
                        i8 = ((iM3169 ^ i6) * 4885) ^ 391014391;
                        i9 = 548692106;
                    }
                    break;
                case -1474693582:
                case 94098622:
                    return;
                case -1347938817:
                case -105568938:
                    i4 = 16452;
                    iM3169 = (C0619.m2761("֫᩸") + i7) * (-45);
                    i8 = ((iM3169 ^ i6) * 12243) ^ (-1050406159);
                    i9 = -1454375901;
                    break;
                case -1282770608:
                case 603583378:
                    C3099.m10095();
                    iM3169 = (C0773.m3169("ᩳۢ") ^ i7) * (-81);
                    i8 = ((iM3169 ^ i6) * 4885) ^ 391014391;
                    i9 = 548692106;
                    break;
                case -1266424088:
                case 191259600:
                    C1519.m5403();
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0773.m3169("۫۬") ^ i7) * (-91);
                        i8 = ((iM3169 ^ i6) * (-287)) ^ 1701409759;
                        i9 = -2049523667;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۢ") ^ i7) * (-81);
                        i8 = ((iM3169 ^ i6) * 4885) ^ 391014391;
                        i9 = 548692106;
                    }
                    break;
                case -1096169226:
                case -375520066:
                    sArr = f61940;
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0773.m3169("ۚ۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-29129)) ^ (-563928797);
                        i9 = -262495386;
                    } else {
                        iM3169 = C0619.m2761("ۜ֡") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-16483)) ^ (-418084182);
                        i9 = 1955689051;
                    }
                    break;
                case -991365604:
                case 1761319863:
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("᩶۠") ^ i7;
                        i8 = ((iM3169 ^ i6) * 17693) ^ (-231171668);
                        i9 = 1540044269;
                    } else {
                        iM3169 = C0773.m3169("ۚ۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-29129)) ^ (-563928797);
                        i9 = -262495386;
                    }
                    break;
                case -764264623:
                case -687254196:
                    i4 = 60879;
                    iM3169 = (C0619.m2761("֫᩸") + i7) * (-45);
                    i8 = ((iM3169 ^ i6) * 12243) ^ (-1050406159);
                    i9 = -1454375901;
                    break;
                case -705487420:
                case 684436921:
                    s = sArr[c];
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ܿ۠") ^ i6;
                        i8 = ((iM3169 ^ i7) * 8433) ^ 1736566239;
                        i9 = -1952929330;
                    } else {
                        iM3169 = (i7 - C0773.m3169("ܳۚ")) * 59;
                        i8 = ((iM3169 ^ i6) * 4565) ^ 198089227;
                        i9 = 1723608054;
                    }
                    break;
                case 115232795:
                case 1012962448:
                    s2 = 1258;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("۫۬") ^ i7) * (-91);
                        i8 = ((iM3169 ^ i6) * (-287)) ^ 1701409759;
                        i9 = -2049523667;
                    } else {
                        iM3169 = C0619.m2761("ᩳ۬") ^ i7;
                        i8 = ((iM3169 ^ i6) * 12005) ^ 1139290546;
                        i9 = 1488715473;
                    }
                    break;
                case 155026976:
                case 1497202370:
                    short[] sArr2 = f61940;
                    if (!C2354.m7983()) {
                        iM3169 = (C0773.m3169("ܰ᩹") + i6) * 89;
                        i8 = ((iM3169 ^ i7) * 3035) ^ (-135370173);
                        i9 = 1374567107;
                    } else {
                        if (C11235.m28309() == 0) {
                            throw new IllegalStateException(C23916.m53420(sArr2, 818, 21, i4));
                        }
                        iM3169 = C0773.m3169("ۚ۫") ^ i7;
                        i8 = ((iM3169 ^ i6) * (-29129)) ^ (-563928797);
                        i9 = -262495386;
                    }
                    break;
                case 849800505:
                case 1986398795:
                    C4238.m13540();
                    C1542.m5459();
                    return;
                case 1449894101:
                case 1672473118:
                    c = 817;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("۫۬") ^ i7) * (-91);
                        i8 = ((iM3169 ^ i6) * (-287)) ^ 1701409759;
                        i9 = -2049523667;
                    } else {
                        iM3169 = (C0773.m3169("۫᩵") ^ i7) * (-13);
                        i8 = ((iM3169 ^ i6) * (-11795)) ^ 1953455231;
                        i9 = 651870220;
                    }
                    break;
                case 1536739431:
                case 1650482597:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (C3099.m10095()) {
                        iM3169 = (C0773.m3169("ᩳۢ") ^ i7) * (-81);
                        i8 = ((iM3169 ^ i6) * 4885) ^ 391014391;
                        i9 = 548692106;
                    } else {
                        iM3169 = C0619.m2761("ܳۢ") ^ i6;
                        i8 = ((iM3169 ^ i7) * (-26977)) ^ 526008298;
                        i9 = -1944507235;
                    }
                    break;
                case 1600334961:
                case 2056252869:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0773.m3169("ܰ᩹") + i6) * 89;
                        i8 = ((iM3169 ^ i7) * 3035) ^ (-135370173);
                        i9 = 1374567107;
                    } else {
                        iM3169 = (C0773.m3169("۫۬") ^ i7) * (-91);
                        i8 = ((iM3169 ^ i6) * (-287)) ^ 1701409759;
                        i9 = -2049523667;
                    }
                    break;
                default:
                    if (C17202.m40372()) {
                        iM3169 = (i6 - C0773.m3169("֡ۙ")) * 127;
                        i8 = ((iM3169 ^ i7) * 32565) ^ 1934491711;
                        i9 = -575665021;
                    } else {
                        iM3169 = (C0773.m3169("۫۬") ^ i7) * (-91);
                        i8 = ((iM3169 ^ i6) * (-287)) ^ 1701409759;
                        i9 = -2049523667;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x02a8 A[PHI: r16 r17
      0x02a8: PHI (r16v10 l.۠۫ܳ) = (r16v3 l.۠۫ܳ), (r16v4 l.۠۫ܳ), (r16v6 l.۠۫ܳ), (r16v8 l.۠۫ܳ), (r16v9 l.۠۫ܳ), (r16v11 l.۠۫ܳ) binds: [B:79:0x02a6, B:75:0x0288, B:67:0x0235, B:59:0x01e3, B:55:0x01c2, B:51:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r17v10 l.۬۫ܳ) = (r17v3 l.۬۫ܳ), (r17v4 l.۬۫ܳ), (r17v6 l.۬۫ܳ), (r17v8 l.۬۫ܳ), (r17v9 l.۬۫ܳ), (r17v11 l.۬۫ܳ) binds: [B:79:0x02a6, B:75:0x0288, B:67:0x0235, B:59:0x01e3, B:55:0x01c2, B:51:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13856 m44293(C13856 c13856, IdentityHashMap identityHashMap, C25111 c25111) {
        C8636 c8636;
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        C8636 c8637;
        int iM2761;
        int i4;
        int i5;
        int i6 = C1080.f3865;
        int i7 = C3448.f11240;
        int iM31611 = C0773.m3169("ۖᩴ") ^ i7;
        int i8 = ((iM31611 ^ i6) * (-31627)) ^ 492053700;
        InterfaceC22808 interfaceC22808 = null;
        byte[] bArr = null;
        int i9 = iM31611 ^ 1418039056;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1140698310;
        C8636 c8638 = null;
        C13856 c13856M44293 = null;
        C13856 c13856M44294 = null;
        C13856 c13857 = null;
        C13856 c13858 = null;
        while (true) {
            i12 = i9 ^ (i8 & (((i12 ^ i6) * (-19701)) >> 31));
            switch (i12) {
                case -2050986017:
                case 3821318:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    } else {
                        iM3169 = C0773.m3169("ᩴۙ") ^ i6;
                        i = ((iM3169 ^ i7) * (-25033)) ^ (-782770456);
                        i2 = 2009035416;
                    }
                    int i13 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i13;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1936047954:
                case 166067252:
                    c8638 = c13856.f43958;
                    interfaceC22808 = c8638.f28220;
                    if (interfaceC22808 instanceof C10938) {
                        iM31610 = (C0773.m3169("֫ۜ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        c13856M44294 = c13856M44294;
                        i = ((iM31610 ^ i7) * 8019) ^ (-1409807912);
                        i3 = -396180940;
                    } else {
                        iM31610 = (C0619.m2761("۫ܶ") + i7) * (-91);
                        i = ((iM31610 ^ i6) * (-22621)) ^ 132846047;
                        i3 = -1791819279;
                    }
                    i9 = iM31610 ^ i3;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1684843176:
                case -906389949:
                    c8637 = c8638;
                    if (!identityHashMap.containsKey((C10938) interfaceC22808)) {
                        c8638 = c8637;
                        iM31610 = (C0619.m2761("۫ܶ") + i7) * (-91);
                        i = ((iM31610 ^ i6) * (-22621)) ^ 132846047;
                        i3 = -1791819279;
                        i9 = iM31610 ^ i3;
                        i8 = i;
                        c13856M44294 = c13856M44294;
                    } else {
                        iM2761 = C0773.m3169("֫֫") ^ i7;
                        i4 = ((iM2761 ^ i6) * (-16365)) ^ (-1748788759);
                        i5 = 1975667827;
                        C8636 c8639 = c8637;
                        i9 = iM2761 ^ i5;
                        i8 = i4;
                        c8638 = c8639;
                    }
                    break;
                case -1651817035:
                case -17806282:
                    i10 = c8638.f28219;
                    bArr = new byte[i10];
                    i11 = 0;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i6;
                        c8637 = c8638;
                        i4 = ((iM2761 ^ i7) * 31581) ^ (-1718808206);
                        i5 = 1698750893;
                    } else {
                        c8637 = c8638;
                        iM2761 = (i7 - C0773.m3169("ܺܳ")) * (-125);
                        i4 = ((iM2761 ^ i6) * 25717) ^ 1630894141;
                        i5 = 1703426870;
                    }
                    C8636 c86310 = c8637;
                    i9 = iM2761 ^ i5;
                    i8 = i4;
                    c8638 = c86310;
                    break;
                case -1457226957:
                case 1763028032:
                    C2310.m7813();
                    return null;
                case -1422745920:
                case -1394991467:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    } else {
                        iM3169 = (C0619.m2761("ܳۛ") + i7) * 29;
                        i = ((iM3169 ^ i6) * (-745)) ^ (-1275005740);
                        i2 = -419759493;
                    }
                    int i14 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i14;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1356990598:
                case -576728933:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i6;
                        i = ((iM3169 ^ i7) * (-17347)) ^ (-1423968067);
                        i2 = 230491392;
                    }
                    int i15 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i15;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1232169011:
                case 1165973611:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (i7 - C0619.m2761("۬ܺ")) * 71;
                        i = ((iM3169 ^ i6) * 8863) ^ 154402758;
                        i2 = 1201883598;
                    } else {
                        iM3169 = C0773.m3169("ۤۢ") ^ i6;
                        i = ((iM3169 ^ i7) * (-25291)) ^ 609452049;
                        i2 = 117004813;
                    }
                    int i16 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i16;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1160445202:
                case 467569601:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    } else {
                        iM3169 = (C0619.m2761("ۨᩴ") + i7) * (-123);
                        i = ((iM3169 ^ i6) * 25141) ^ 1439967689;
                        i2 = -1075198935;
                    }
                    int i17 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i17;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1127424536:
                case 1058923132:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("᩺ܰ") ^ i6;
                        i = ((iM3169 ^ i7) * 23319) ^ 1201858811;
                        i2 = -1301233314;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩵") ^ i7;
                        i = ((iM3169 ^ i6) * 4895) ^ 877303364;
                        i2 = 1837704180;
                    }
                    int i18 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i18;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -1104835750:
                case 99245125:
                    C3492.m11488();
                    C2023.m6964();
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    iM3169 = C0773.m3169("᩺ܰ") ^ i6;
                    i = ((iM3169 ^ i7) * 23319) ^ 1201858811;
                    i2 = -1301233314;
                    int i19 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i19;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -819565129:
                case -690244319:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ܿܰ") ^ i7;
                        i = ((iM3169 ^ i6) * 22679) ^ (-1393022804);
                        i2 = 497965230;
                    } else {
                        iM3169 = (C0773.m3169("֡᩺") + i7) * (-123);
                        i = ((iM3169 ^ i6) * 29583) ^ 1090438698;
                        i2 = 419015317;
                    }
                    int i110 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i110;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -718913824:
                case 731284518:
                    if (!C2966.m9664()) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i6;
                        c8637 = c8638;
                        i4 = ((iM2761 ^ i7) * 31581) ^ (-1718808206);
                        i5 = 1698750893;
                        C8636 c86311 = c8637;
                        i9 = iM2761 ^ i5;
                        i8 = i4;
                        c8638 = c86311;
                    } else {
                        c13856M44294 = c13856M44294;
                        c8636 = c8638;
                        iM3169 = C0619.m2761("ܿܰ") ^ i7;
                        i = ((iM3169 ^ i6) * 22679) ^ (-1393022804);
                        i2 = 497965230;
                        int i111 = iM3169 ^ i2;
                        c8638 = c8636;
                        i9 = i111;
                        i8 = i;
                        c13856M44294 = c13856M44294;
                    }
                    break;
                case -604566317:
                case 1582872736:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    boolean zM10087 = C3099.m10087(c13856);
                    c13858 = c13856.f43955;
                    c13857 = c13856.f43960;
                    if (zM10087) {
                        iM3169 = C0619.m2761("֡ۛ") ^ i6;
                        i = ((iM3169 ^ i7) * (-14249)) ^ (-1926016170);
                        i2 = 1476174620;
                    } else {
                        iM3169 = (C0773.m3169("֨ۖ") + i6) * 97;
                        i = ((iM3169 ^ i7) * (-22119)) ^ 1185548185;
                        i2 = 1834515518;
                    }
                    int i112 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i112;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case -475591321:
                case 1621382171:
                    return C19606.m45249(c13856M44294, c13856M44293);
                case -354617996:
                case 221942447:
                    C0773.m3161();
                    if (C2354.f7599 < 0) {
                        c13856M44294 = c13856M44294;
                        c8636 = c8638;
                        iM3169 = (i7 - C0619.m2761("۬ܺ")) * 71;
                        i = ((iM3169 ^ i6) * 8863) ^ 154402758;
                        i2 = 1201883598;
                        int i113 = iM3169 ^ i2;
                        c8638 = c8636;
                        i9 = i113;
                        i8 = i;
                        c13856M44294 = c13856M44294;
                    } else {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i6;
                        c8637 = c8638;
                        i4 = ((iM2761 ^ i7) * 31581) ^ (-1718808206);
                        i5 = 1698750893;
                        C8636 c86312 = c8637;
                        i9 = iM2761 ^ i5;
                        i8 = i4;
                        c8638 = c86312;
                    }
                    break;
                case -236457231:
                case 1900451511:
                    c8638.m23272(i11, bArr, i11, i10);
                    return c25111.m55980(i10, bArr);
                case -169409575:
                case 74488764:
                    C13473.m33144();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i6;
                        c8637 = c8638;
                        i4 = ((iM2761 ^ i7) * 31581) ^ (-1718808206);
                        i5 = 1698750893;
                        C8636 c86313 = c8637;
                        i9 = iM2761 ^ i5;
                        i8 = i4;
                        c8638 = c86313;
                    } else {
                        c13856M44294 = c13856M44294;
                        c8636 = c8638;
                        iM3169 = C0773.m3169("᩺ܰ") ^ i6;
                        i = ((iM3169 ^ i7) * 23319) ^ 1201858811;
                        i2 = -1301233314;
                        int i114 = iM3169 ^ i2;
                        c8638 = c8636;
                        i9 = i114;
                        i8 = i;
                        c13856M44294 = c13856M44294;
                    }
                    break;
                case -129489724:
                case 1222362540:
                    return c13856;
                case 6704921:
                case 2093508110:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ۛۛ") ^ i6;
                        i = ((iM3169 ^ i7) * (-28227)) ^ 412579282;
                        i2 = -1198943955;
                    } else {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    }
                    int i115 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i115;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case 687617409:
                case 1676614821:
                    c13856M44294 = c13856M44294;
                    c8636 = c8638;
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0619.m2761("֡᩷") + i6) * (-87);
                        i = ((iM3169 ^ i7) * (-623)) ^ 1316700787;
                        i2 = 1657714977;
                    } else {
                        iM3169 = (i7 - C0619.m2761("ܿۙ")) * (-47);
                        i = ((iM3169 ^ i6) * 16219) ^ 1551991363;
                        i2 = 1098798893;
                    }
                    int i116 = iM3169 ^ i2;
                    c8638 = c8636;
                    i9 = i116;
                    i8 = i;
                    c13856M44294 = c13856M44294;
                    break;
                case 1330874728:
                case 1401171585:
                    c8637 = c8638;
                    c13856M44294 = m44293(c13857, identityHashMap, c25111);
                    c13856M44293 = m44293(c13858, identityHashMap, c25111);
                    if (c13856M44294 == c13857) {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i6;
                        i4 = ((iM2761 ^ i7) * (-26589)) ^ (-1288750970);
                        i5 = -351764677;
                    } else {
                        iM2761 = C0619.m2761("ۙ֫") ^ i7;
                        i4 = ((iM2761 ^ i6) * (-30879)) ^ (-1771182272);
                        i5 = 200173619;
                    }
                    C8636 c86314 = c8637;
                    i9 = iM2761 ^ i5;
                    i8 = i4;
                    c8638 = c86314;
                    break;
                default:
                    c8637 = c8638;
                    if (c13856M44293 != c13858) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i7;
                        i4 = ((iM2761 ^ i6) * (-30879)) ^ (-1771182272);
                        i5 = 200173619;
                        C8636 c86315 = c8637;
                        i9 = iM2761 ^ i5;
                        i8 = i4;
                        c8638 = c86315;
                    } else {
                        c8638 = c8637;
                        iM31610 = (C0619.m2761("۫ܶ") + i7) * (-91);
                        i = ((iM31610 ^ i6) * (-22621)) ^ 132846047;
                        i3 = -1791819279;
                        i9 = iM31610 ^ i3;
                        i8 = i;
                        c13856M44294 = c13856M44294;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44310(C19143 c19143, C14053 c14053) {
        synchronized (c19143) {
            if (c19143.f61958 != c14053.f44504 || c19143.f61953 != c14053.f44509 || !c14053.f44509.mo2792()) {
                throw new C12893();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x04b7 A[PHI: r9 r10 r11 r12 r17
      0x04b7: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:129:0x04b5, B:109:0x03db, B:105:0x03b2] A[DONT_GENERATE, DONT_INLINE]
      0x04b7: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:129:0x04b5, B:109:0x03db, B:105:0x03b2] A[DONT_GENERATE, DONT_INLINE]
      0x04b7: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:129:0x04b5, B:109:0x03db, B:105:0x03b2] A[DONT_GENERATE, DONT_INLINE]
      0x04b7: PHI (r12v3 short) = (r12v2 short), (r12v2 short), (r12v4 short) binds: [B:129:0x04b5, B:109:0x03db, B:105:0x03b2] A[DONT_GENERATE, DONT_INLINE]
      0x04b7: PHI (r17v16 l.֨ᩴܳ) = (r17v10 l.֨ᩴܳ), (r17v15 l.֨ᩴܳ), (r17v17 l.֨ᩴܳ) binds: [B:129:0x04b5, B:109:0x03db, B:105:0x03b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x04e6 A[PHI: r17
      0x04e6: PHI (r17v54 l.֨ᩴܳ) = (r17v9 l.֨ᩴܳ), (r17v12 l.֨ᩴܳ), (r17v55 l.֨ᩴܳ) binds: [B:133:0x04e4, B:121:0x0464, B:14:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x02de A[PHI: r17
      0x02de: PHI (r17v26 l.֨ᩴܳ) = (r17v24 l.֨ᩴܳ), (r17v27 l.֨ᩴܳ) binds: [B:87:0x02c6, B:79:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x031b A[PHI: r17
      0x031b: PHI (r17v31 l.֨ᩴܳ) = (r17v22 l.֨ᩴܳ), (r17v27 l.֨ᩴܳ), (r17v32 l.֨ᩴܳ) binds: [B:94:0x0319, B:79:0x0290, B:193:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (l.C17202.f56030 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (l.RunnableC0334.m2063() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (l.AbstractC3624.f12429 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (l.C23916.f77426 > 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        r17 = r7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m44307(l.C13856 r21, l.InterfaceC22808 r22, java.util.HashMap r23, java.util.ArrayList r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44307(l.۬۫ܳ, l.᩸۫ܳ, java.util.HashMap, java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44350(long j) {
        long j2 = 0;
        long jM9672 = 0;
        int i = -1744761450;
        int i2 = C1519.f5300;
        int i3 = C0487.f2131;
        int iM3169 = C0773.m3169("֨᩺") ^ i2;
        int i4 = ((iM3169 ^ i3) * 13395) ^ (-1920177211);
        int i5 = -165906876;
        while (true) {
            i = ((((i ^ i3) * (-13971)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2019146524:
                case -1067200466:
                    if (jM9672 <= 67108864) {
                        iM3169 = (C0773.m3169("ۤ᩵") + i3) * (-27);
                        i4 = ((iM3169 ^ i2) * 31535) ^ 1407629176;
                        i5 = -1366247421;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ᩳ۟")) * (-79);
                        i4 = ((iM3169 ^ i3) * 32073) ^ (-1395464626);
                        i5 = 1001872507;
                    }
                    break;
                case -1943551605:
                case 1656559822:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("۫ᩳ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 703) ^ 449578052;
                        i5 = 1441149449;
                    } else {
                        iM3169 = C0619.m2761("֫۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24405) ^ 1683448519;
                        i5 = -2068907178;
                    }
                    break;
                case -1831966126:
                case -1789263428:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0619.m2761("ۧܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15629)) ^ 1306146594;
                        i5 = 574801559;
                    }
                    break;
                case -1645374775:
                case 1016646132:
                    if (C1080.m4050()) {
                        iM3169 = (i2 - C0773.m3169("᩹᩶")) * (-73);
                        i4 = ((iM3169 ^ i3) * 16819) ^ 581004373;
                        i5 = 515241205;
                    } else {
                        iM3169 = (C0619.m2761("۫ᩳ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 703) ^ 449578052;
                        i5 = 1441149449;
                    }
                    break;
                case -1543107012:
                case 628682846:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("ܺۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7979)) ^ (-1523188790);
                        i5 = -1366040206;
                    } else {
                        iM3169 = (C0619.m2761("۫ᩳ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 703) ^ 449578052;
                        i5 = 1441149449;
                    }
                    break;
                case -1019499276:
                case 1516892425:
                    C2878.m9491();
                    C3492.m11488();
                    return false;
                case -838904502:
                case 1282190486:
                    if (!C2966.m9664()) {
                        iM3169 = (C0619.m2761("۫ᩳ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 703) ^ 449578052;
                        i5 = 1441149449;
                    } else {
                        iM3169 = (C0619.m2761("ۗ᩻") ^ i3) * 37;
                        i4 = ((iM3169 ^ i2) * 2757) ^ (-534676670);
                        i5 = -1604964488;
                    }
                    break;
                case -821712156:
                case 341919443:
                    AbstractC0641.m2813();
                    C2310.m7813();
                    iM3169 = (C0619.m2761("ۗ᩻") ^ i3) * 37;
                    i4 = ((iM3169 ^ i2) * 2757) ^ (-534676670);
                    i5 = -1604964488;
                    break;
                case -458157717:
                case 1010060244:
                    C1564.m5509();
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("ۗ᩻") ^ i3) * 37;
                        i4 = ((iM3169 ^ i2) * 2757) ^ (-534676670);
                        i5 = -1604964488;
                    } else {
                        iM3169 = (C0619.m2761("֡᩺") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i2) * (-3591)) ^ (-460331871);
                        i5 = -2130976516;
                    }
                    break;
                case -248314811:
                case -46363749:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0619.m2761("ۗۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26685) ^ 1749090054;
                        i5 = -1969483999;
                    }
                    break;
                case -164533627:
                case 860356088:
                    return false;
                case 117753210:
                case 223275842:
                    jM9672 = C2966.m9672(j, j2);
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("֡ۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18613) ^ 1192743586;
                        i5 = -1827501624;
                    } else {
                        iM3169 = C0773.m3169("ۤ֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15707)) ^ 184620040;
                        i5 = -686666741;
                    }
                    break;
                case 449327890:
                case 907878697:
                    if (!C0619.f2439) {
                        iM3169 = (C0619.m2761("ۗ᩻") ^ i3) * 37;
                        i4 = ((iM3169 ^ i2) * 2757) ^ (-534676670);
                        i5 = -1604964488;
                    } else {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    }
                    break;
                case 499893725:
                case 1540414921:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0619.m2761("᩻ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-213)) ^ 205527744;
                        i5 = -1284214043;
                    }
                    break;
                case 677680814:
                case 1636500248:
                    return true;
                case 694300585:
                case 1272875267:
                    j2 = 8272;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0619.m2761("᩶ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30175) ^ 750009556;
                        i5 = -2051271061;
                    }
                    break;
                case 1521688660:
                case 1911396259:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7585) ^ (-2084065757);
                        i5 = -768573343;
                    }
                    break;
                default:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0773.m3169("᩺᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22537)) ^ 2015451937;
                        i5 = 276329958;
                    } else {
                        iM3169 = C0773.m3169("۫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6169)) ^ (-464376508);
                        i5 = -1688832413;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13856 m44292(C13856 c13856, IdentityHashMap identityHashMap, C10938 c10938, InterfaceC7509 interfaceC7509) throws IOException {
        int iM3169;
        int i;
        C13856 c13857 = null;
        C13856 c13858 = null;
        C13856 c13856M44292 = null;
        C13856 c13856M44293 = null;
        C8636 c8636 = null;
        int i2 = -1900255490;
        int i3 = C1564.f5401;
        int i4 = C2834.f9334;
        int iM2761 = C0619.m2761("ۨۙ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 21053) ^ (-1642416888);
        int i6 = 1027155204;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * (-18871)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2016615885:
                    case -1306123114:
                        boolean zM10087 = C3099.m10087(c13856);
                        C13856 c13859 = c13856.f43955;
                        C13856 c138510 = c13856.f43960;
                        if (zM10087) {
                            iM3169 = (i4 - C0619.m2761("ۙ᩶")) * 57;
                            i5 = ((iM3169 ^ i3) * (-12889)) ^ 1717140829;
                            i = 2065416299;
                        } else {
                            iM3169 = (C0773.m3169("۟᩶") + i3) * 73;
                            i5 = ((iM3169 ^ i4) * (-4313)) ^ (-621338062);
                            i = 59594599;
                        }
                        i7 = iM3169 ^ i;
                        c13857 = c13859;
                        c13858 = c138510;
                        break;
                    case -2015120433:
                    case -1977197179:
                        C3779.m12264();
                        C2966.m9664();
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                    case -1956329850:
                    case 1267926020:
                        C4238.m13540();
                        if (C1321.f4751 >= 0) {
                            iM2761 = (C0619.m2761("۬ܳ") ^ i3) * 45;
                            i5 = ((iM2761 ^ i4) * (-17717)) ^ 183365753;
                            i6 = 828771702;
                            break;
                        }
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                        break;
                    case -1891047124:
                    case 653134608:
                        return C19606.m45249(c13856M44292, c13856M44293);
                    case -1769234217:
                    case -1108103918:
                        C0269.m1775();
                        if (C0487.f2131 <= 0) {
                            iM2761 = (C0773.m3169("֡ܽ") + i3) * (-113);
                            i5 = ((iM2761 ^ i4) * (-195)) ^ 807182335;
                            i6 = -401849355;
                            break;
                        }
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                        break;
                    case -1691832808:
                    case -1118058398:
                        if (RunnableC0334.f1808 > 0) {
                            iM2761 = C0773.m3169("ۘۛ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-26595)) ^ (-1917821739);
                            i6 = 1912055780;
                            break;
                        }
                        iM2761 = (C0773.m3169("֡ܽ") + i3) * (-113);
                        i5 = ((iM2761 ^ i4) * (-195)) ^ 807182335;
                        i6 = -401849355;
                        break;
                        break;
                    case -1523811771:
                    case -176449897:
                        return c13856;
                    case -1283998662:
                    case 1883607071:
                        if (C2834.m9344() < 0) {
                            iM2761 = C0619.m2761("ܳܺ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 28797) ^ (-1645359730);
                            i6 = -233661483;
                            break;
                        }
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                        break;
                    case -1249630452:
                    case 776683576:
                        C2023.m6964();
                        return null;
                    case -1099547194:
                    case 178875380:
                        AbstractC3624.m11755();
                        if (C3448.f11240 < 0) {
                            iM2761 = (C0619.m2761("ۚۡ") + i4) * 19;
                            i5 = ((iM2761 ^ i3) * (-31861)) ^ 1846592008;
                            i6 = 1756272944;
                            break;
                        }
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                        break;
                    case -999169148:
                    case 1202591814:
                        if (C11235.f35427 < 0) {
                            iM2761 = (C0619.m2761("ۜۖ") + i3) * 77;
                            i5 = ((iM2761 ^ i4) * (-18295)) ^ (-1869693308);
                            i6 = 1820809907;
                            break;
                        }
                        iM2761 = C0619.m2761("ۤۜ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17667) ^ 126204005;
                        i6 = -87208284;
                        break;
                        break;
                    case -986388222:
                    case -411993411:
                        if (C11235.m28309() == 0) {
                            iM2761 = C0619.m2761("ۗۧ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-18957)) ^ (-610893268);
                            i6 = -43037770;
                            break;
                        }
                        iM2761 = (C0619.m2761("ܰᩴ") + i4) * (-55);
                        i5 = ((iM2761 ^ i3) * 27843) ^ 736362711;
                        i6 = 2106631218;
                        break;
                    case -788725047:
                    case -165743715:
                        c13856M44292 = m44292(c13858, identityHashMap, c10938, interfaceC7509);
                        c13856M44293 = m44292(c13857, identityHashMap, c10938, interfaceC7509);
                        if (c13856M44292 != c13858) {
                            iM2761 = C0619.m2761("᩷᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 24943) ^ (-2008040237);
                            i6 = 1551541313;
                            break;
                        }
                        iM2761 = C0773.m3169("ۤۛ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27779) ^ (-683716330);
                        i6 = 75085391;
                        break;
                    case -610678623:
                    case 2129562507:
                        if (c13856M44293 != c13857) {
                            iM2761 = C0619.m2761("᩷᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 24943) ^ (-2008040237);
                            i6 = 1551541313;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ۜۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30277)) ^ (-1252209033);
                        i6 = -1880314792;
                        break;
                    case -600861872:
                    case 1129230517:
                        c8636 = c13856.f43958;
                        if (!identityHashMap.containsKey(c8636.f28220)) {
                            iM2761 = C0773.m3169("ۜۘ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-30277)) ^ (-1252209033);
                            i6 = -1880314792;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ۡۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-32293)) ^ 804767418;
                        i6 = -1173984744;
                        break;
                    case -507904587:
                    case 1871858936:
                        if (!RunnableC1848.m6360()) {
                            iM2761 = C0619.m2761("ۗ֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26007) ^ (-1234141904);
                            i6 = -1079783141;
                            break;
                        }
                        iM2761 = (C0619.m2761("ܰᩴ") + i4) * (-55);
                        i5 = ((iM2761 ^ i3) * 27843) ^ 736362711;
                        i6 = 2106631218;
                        break;
                        break;
                    case -179371043:
                    case 1964308373:
                        int iMo15179 = c10938.mo15179(c8636, interfaceC7509);
                        int i8 = c8636.f28219;
                        if (C2485.f7950 == 0) {
                            return C19606.m45213(new C8636(c10938, iMo15179, i8, null));
                        }
                        iM2761 = (C0619.m2761("ܰᩴ") + i4) * (-55);
                        i5 = ((iM2761 ^ i3) * 27843) ^ 736362711;
                        i6 = 2106631218;
                        break;
                        break;
                    case 190881108:
                    case 690486369:
                        if (!C2288.m7767()) {
                            iM2761 = (i4 - C0619.m2761("۬ᩴ")) * (-87);
                            i5 = ((iM2761 ^ i3) * 13933) ^ (-1254559032);
                            i6 = -1667769348;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۚۡ") + i4) * 19;
                        i5 = ((iM2761 ^ i3) * (-31861)) ^ 1846592008;
                        i6 = 1756272944;
                        break;
                        break;
                    case 804193994:
                    case 1986162969:
                        if (C1146.f4234 < 0) {
                            iM2761 = (C0619.m2761("ۢۜ") ^ i4) * (-63);
                            i5 = ((iM2761 ^ i3) * (-28425)) ^ 1202758474;
                            i6 = 1040142818;
                            break;
                        }
                        iM2761 = (C0619.m2761("۬ܳ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * (-17717)) ^ 183365753;
                        i6 = 828771702;
                        break;
                        break;
                    case 1091681928:
                    case 1324318365:
                        if (!C4282.m13644()) {
                            iM2761 = (C0619.m2761("۬ܳ") ^ i3) * 45;
                            i5 = ((iM2761 ^ i4) * (-17717)) ^ 183365753;
                            i6 = 828771702;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("᩺ܺ") + i4) * (-81);
                        i5 = ((iM2761 ^ i3) * (-15605)) ^ 1021326316;
                        i6 = -2026556984;
                        break;
                    default:
                        if (C3099.f10023 > 0) {
                            iM2761 = C0619.m2761("ۗܳ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 15599) ^ 770665058;
                            i6 = 1433943109;
                            break;
                        }
                        iM2761 = (C0619.m2761("۬ܳ") ^ i3) * 45;
                        i5 = ((iM2761 ^ i4) * (-17717)) ^ 183365753;
                        i6 = 828771702;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44308(C13856 c13856, InterfaceC22808 interfaceC22808, IdentityHashMap identityHashMap, ArrayList arrayList) {
        ArrayDeque arrayDeque = null;
        C13856 c13857 = null;
        C13856 c13858 = null;
        C8636 c8636 = null;
        InterfaceC22808 interfaceC22809 = null;
        C10127 c10127 = null;
        int i = 904055904;
        int i2 = C3099.f10023;
        int i3 = C3492.f12043;
        int iM2761 = C0619.m2761("᩶ۙ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 4185) ^ (-1471008040);
        int i5 = 398262982;
        while (true) {
            i = ((((i ^ i2) * (-22983)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2079093842:
                case -160883541:
                    C23916.m53419();
                    if (C2485.m8357() <= 0) {
                        iM2761 = (C0773.m3169("᩺᩵") + i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-20173)) ^ 135318249;
                        i5 = -1713397743;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23817)) ^ (-707406127);
                        i5 = 2027058559;
                    }
                    break;
                case -1994470305:
                case -29813211:
                    if (c13856 == null) {
                        iM2761 = (i3 - C0619.m2761("ܳ۫")) * 109;
                        i4 = ((iM2761 ^ i2) * 30303) ^ 1124727954;
                        i5 = 1952486564;
                    } else {
                        iM2761 = C0773.m3169("᩸۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30501)) ^ 1738440621;
                        i5 = 139437967;
                    }
                    break;
                case -1967946852:
                case 1458616016:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23817)) ^ (-707406127);
                        i5 = 2027058559;
                    } else {
                        iM2761 = (C0619.m2761("ۖۗ") ^ i3) * 69;
                        i4 = ((iM2761 ^ i2) * 3087) ^ 1628833998;
                        i5 = 116617967;
                    }
                    break;
                case -1921289176:
                case -968656384:
                    if (C23916.f77426 > 0) {
                        iM2761 = (i2 - C0619.m2761("֫ܶ")) * (-125);
                        i4 = ((iM2761 ^ i3) * 11055) ^ 65668687;
                        i5 = 1631122840;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۡ۬")) * (-83);
                        i4 = ((iM2761 ^ i3) * 22813) ^ 359904662;
                        i5 = 1059183644;
                    }
                    break;
                case -1901109356:
                case 1413983289:
                    if (C1343.f4799 != 0) {
                        iM2761 = (i2 - C0619.m2761("֫ܶ")) * (-125);
                        i4 = ((iM2761 ^ i3) * 11055) ^ 65668687;
                        i5 = 1631122840;
                    } else {
                        iM2761 = C0619.m2761("֨ܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27195) ^ (-2016476274);
                        i5 = -1393821580;
                    }
                    break;
                case -1800107676:
                case -1459856138:
                    if (c13857 == null) {
                        iM2761 = (i2 - C0619.m2761("ܰۢ")) * (-15);
                        i4 = ((iM2761 ^ i3) * 12407) ^ (-2006295510);
                        i5 = 894903825;
                    } else {
                        c13858 = c13857;
                        iM2761 = (C0619.m2761("ܿ֡") + i2) * 49;
                        i4 = ((iM2761 ^ i3) * (-7771)) ^ (-1235083447);
                        i5 = -1401494714;
                    }
                    break;
                case -1782606700:
                case -1088564682:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (i2 - C0619.m2761("֫ܶ")) * (-125);
                        i4 = ((iM2761 ^ i3) * 11055) ^ 65668687;
                        i5 = 1631122840;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۚ") + i2) * (-23);
                        i4 = ((iM2761 ^ i3) * (-25487)) ^ 2137620197;
                        i5 = -1472326779;
                    }
                    break;
                case -1679750947:
                case 1273675976:
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ۗᩴ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 429) ^ (-300590393);
                        i5 = 258819693;
                    } else {
                        iM2761 = (C0619.m2761("᩺᩺") + i2) * (-89);
                        i4 = ((iM2761 ^ i3) * (-15763)) ^ (-807955047);
                        i5 = 1921658551;
                    }
                    break;
                case -1594214532:
                case -832608360:
                    if (c13858 != null) {
                        iM2761 = (C0773.m3169("ۙۗ") + i3) * (-9);
                        i4 = ((iM2761 ^ i2) * (-15313)) ^ 563067161;
                        i5 = 839325163;
                    } else {
                        iM2761 = (C0773.m3169("ۖ۟") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * (-31831)) ^ (-597188333);
                        i5 = 544639717;
                    }
                    break;
                case -1554492012:
                case -429399675:
                    if (!C2419.m8180(arrayDeque)) {
                        c13858 = c13857;
                        iM2761 = (C0619.m2761("ܿ֡") + i2) * 49;
                        i4 = ((iM2761 ^ i3) * (-7771)) ^ (-1235083447);
                        i5 = -1401494714;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ܳ۫")) * 109;
                        i4 = ((iM2761 ^ i2) * 30303) ^ 1124727954;
                        i5 = 1952486564;
                    }
                    break;
                case -1403416274:
                case 201219577:
                    break;
                case -1289897410:
                case -717541798:
                    if (interfaceC22809 instanceof C17651) {
                        iM2761 = (C0619.m2761("ܽۢ") ^ i2) * (-69);
                        i4 = ((iM2761 ^ i3) * (-13539)) ^ (-1681452083);
                        i5 = 200185882;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܽܿ")) * 99;
                        i4 = ((iM2761 ^ i2) * (-24077)) ^ (-1658511597);
                        i5 = -402062154;
                    }
                    break;
                case -1247141317:
                case 1737724615:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10513)) ^ (-889190024);
                        i5 = -560743201;
                    } else {
                        iM2761 = C0773.m3169("ܶܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18355) ^ 2057010148;
                        i5 = 311312461;
                    }
                    break;
                case -1199628087:
                case 613604249:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 37;
                        i4 = ((iM2761 ^ i2) * (-12069)) ^ (-375506923);
                        i5 = -465743633;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩵ܶ")) * (-87);
                        i4 = ((iM2761 ^ i2) * (-1707)) ^ 1543553596;
                        i5 = -1319687689;
                    }
                    break;
                case -1096872862:
                case 1148773646:
                    if (c13858 != null) {
                        iM2761 = C0773.m3169("᩶֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30931) ^ 716912008;
                        i5 = 529421522;
                    } else {
                        iM2761 = (C0619.m2761("᩵ۚ") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 12331) ^ 1282353330;
                        i5 = -726149860;
                    }
                    break;
                case -1091827511:
                case -38634386:
                    RunnableC0334.m2063();
                    if (C1321.f4751 < 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10513)) ^ (-889190024);
                        i5 = -560743201;
                    } else {
                        iM2761 = (C0619.m2761("ۛۨ") ^ i2) * (-3);
                        i4 = ((iM2761 ^ i3) * (-47)) ^ 1095276277;
                        i5 = -2021304385;
                    }
                    break;
                case -1031833350:
                case 2118901002:
                    c8636 = c13858.f43958;
                    interfaceC22809 = c8636.f28220;
                    if (interfaceC22809 != interfaceC22808) {
                        iM2761 = C0773.m3169("ۜۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20343) ^ 1711420645;
                        i5 = -959616741;
                    } else {
                        iM2761 = (C0619.m2761("ܽۢ") ^ i2) * (-69);
                        i4 = ((iM2761 ^ i3) * (-13539)) ^ (-1681452083);
                        i5 = 200185882;
                    }
                    break;
                case -991304797:
                case 1888275840:
                    C2288.m7767();
                    C11235.m28309();
                    break;
                case -941948227:
                case 1379226122:
                    C4238.m13540();
                    if (C13473.f42873 == 0) {
                        iM2761 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23817)) ^ (-707406127);
                        i5 = 2027058559;
                    } else {
                        iM2761 = (C0619.m2761("ۛۨ") ^ i2) * (-3);
                        i4 = ((iM2761 ^ i3) * (-47)) ^ 1095276277;
                        i5 = -2021304385;
                    }
                    break;
                case -907097181:
                case -269708800:
                    C3492.m11485(arrayDeque, c13858);
                    c13858 = c13858.f43960;
                    iM2761 = (C0619.m2761("ܿ֡") + i2) * 49;
                    i4 = ((iM2761 ^ i3) * (-7771)) ^ (-1235083447);
                    i5 = -1401494714;
                    break;
                case -858281295:
                case -304058470:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i2 - C0619.m2761("֫ܶ")) * (-125);
                        i4 = ((iM2761 ^ i3) * 11055) ^ 65668687;
                        i5 = 1631122840;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩵") + i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-20173)) ^ 135318249;
                        i5 = -1713397743;
                    }
                    break;
                case -848946382:
                case 764066479:
                    C3077.m10041();
                    if (C1826.f6190 > 0) {
                        iM2761 = (C0773.m3169("ۗᩴ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 429) ^ (-300590393);
                        i5 = 258819693;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23817)) ^ (-707406127);
                        i5 = 2027058559;
                    }
                    break;
                case -731264449:
                case 1241643426:
                    c10127.m26109(c8636.f28222, c8636.f28219, identityHashMap, arrayList);
                    iM2761 = (C0773.m3169("ۖ۟") ^ i2) * 13;
                    i4 = ((iM2761 ^ i3) * (-31831)) ^ (-597188333);
                    i5 = 544639717;
                    break;
                case -425366981:
                case 2063075167:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i3 - C0619.m2761("᩵ܿ")) * 37;
                        i4 = ((iM2761 ^ i2) * (-12069)) ^ (-375506923);
                        i5 = -465743633;
                    } else {
                        iM2761 = (i2 - C0619.m2761("֨ۛ")) * (-35);
                        i4 = ((iM2761 ^ i3) * (-12547)) ^ 2025629467;
                        i5 = 1651504947;
                    }
                    break;
                case -384547674:
                case 209449449:
                    if (C1321.m4855(c13858)) {
                        iM2761 = (C0619.m2761("᩵ۚ") ^ i3) * 27;
                        i4 = ((iM2761 ^ i2) * 12331) ^ 1282353330;
                        i5 = -726149860;
                    } else {
                        iM2761 = C0619.m2761("᩵᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4927) ^ 539944241;
                        i5 = -1849720956;
                    }
                    break;
                case -258173924:
                case -67851016:
                    c13857 = ((C13856) arrayDeque.pop()).f43955;
                    iM2761 = C0773.m3169("ۤᩳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 18937) ^ (-1113148974);
                    i5 = -1156960208;
                    break;
                case -131506283:
                case 24656446:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("᩶ۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10513)) ^ (-889190024);
                        i5 = -560743201;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺ۟")) * (-17);
                        i4 = ((iM2761 ^ i3) * (-27999)) ^ 25477922;
                        i5 = -1003890572;
                    }
                    break;
                case 71869740:
                case 1864150392:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("᩺᩵") + i3) * (-85);
                        i4 = ((iM2761 ^ i2) * (-20173)) ^ 135318249;
                        i5 = -1713397743;
                    } else {
                        iM2761 = (C0773.m3169("ۚ۬") ^ i3) * 115;
                        i4 = ((iM2761 ^ i2) * 17241) ^ (-516334950);
                        i5 = 1816339068;
                    }
                    break;
                case 101728852:
                case 1617839726:
                    C3690.m11987();
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("۫ܿ") + i3) * 35;
                        i4 = ((iM2761 ^ i2) * (-12317)) ^ (-1298538309);
                        i5 = 2090255639;
                    } else {
                        iM2761 = (C0773.m3169("ۗᩴ") ^ i2) * (-39);
                        i4 = ((iM2761 ^ i3) * 429) ^ (-300590393);
                        i5 = 258819693;
                    }
                    break;
                case 545284175:
                case 1682048929:
                    C0773.m3161();
                    C3779.m12264();
                    iM2761 = (C0619.m2761("ۛۨ") ^ i2) * (-3);
                    i4 = ((iM2761 ^ i3) * (-47)) ^ 1095276277;
                    i5 = -2021304385;
                    break;
                case 948597917:
                case 2126140835:
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("۫ܿ") + i3) * 35;
                        i4 = ((iM2761 ^ i2) * (-12317)) ^ (-1298538309);
                        i5 = 2090255639;
                    } else {
                        iM2761 = C0619.m2761("۠ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15279) ^ 1897209664;
                        i5 = -756964639;
                    }
                    break;
                case 976446059:
                case 1129511806:
                    c10127 = c8636.f28221;
                    if (c10127 != null) {
                        iM2761 = C0773.m3169("۫۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21945)) ^ 1034307167;
                        i5 = 307486277;
                    } else {
                        iM2761 = (C0773.m3169("ۖ۟") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * (-31831)) ^ (-597188333);
                        i5 = 544639717;
                    }
                    break;
                case 1020788587:
                case 1648489571:
                    if (C2288.f7433 > 0) {
                        iM2761 = (i2 - C0619.m2761("֫ܶ")) * (-125);
                        i4 = ((iM2761 ^ i3) * 11055) ^ 65668687;
                        i5 = 1631122840;
                    } else {
                        iM2761 = C0773.m3169("ܶۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28205) ^ (-607551640);
                        i5 = -551432168;
                    }
                    break;
                case 1344169569:
                case 1929539985:
                    arrayDeque = new ArrayDeque();
                    c13857 = c13856;
                    iM2761 = C0773.m3169("ۤᩳ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 18937) ^ (-1113148974);
                    i5 = -1156960208;
                    break;
                case 1416975535:
                case 1549610726:
                    if (C2419.m8180(arrayDeque)) {
                        iM2761 = (i3 - C0619.m2761("ܳ۫")) * 109;
                        i4 = ((iM2761 ^ i2) * 30303) ^ 1124727954;
                        i5 = 1952486564;
                    } else {
                        iM2761 = (C0773.m3169("ۨ᩵") + i3) * 97;
                        i4 = ((iM2761 ^ i2) * 7171) ^ (-1517740588);
                        i5 = 1798840686;
                    }
                    break;
                default:
                    if (!(interfaceC22809 instanceof C6465)) {
                        iM2761 = (C0773.m3169("ۖ۟") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * (-31831)) ^ (-597188333);
                        i5 = 544639717;
                    } else {
                        iM2761 = (C0619.m2761("ܽۢ") ^ i2) * (-69);
                        i4 = ((iM2761 ^ i3) * (-13539)) ^ (-1681452083);
                        i5 = 200185882;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44347(C13856 c13856, ArrayList arrayList) {
        IdentityHashMap identityHashMap = null;
        ArrayDeque arrayDeque = null;
        C13856 c13857 = null;
        C13856 c13858 = null;
        InterfaceC22808 interfaceC22808 = null;
        C6465 c6465 = null;
        int i = -422408646;
        int i2 = C2375.f7641;
        int i3 = C3779.f12953;
        int iM2761 = (i3 - C0619.m2761("ܽ֡")) * (-83);
        int i4 = ((iM2761 ^ i2) * 19465) ^ (-293343990);
        int i5 = -2028444686;
        while (true) {
            i = ((((i ^ i2) * (-17131)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2102122864:
                case 654095847:
                    arrayDeque = new ArrayDeque();
                    c13857 = c13856;
                    iM2761 = C0619.m2761("֡֡") ^ i3;
                    i4 = ((iM2761 ^ i2) * 21789) ^ (-923401527);
                    i5 = 1767807602;
                    break;
                case -2006099439:
                case 278823577:
                    C0487.m2356();
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4791) ^ 1134416551;
                        i5 = -1700955165;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۘ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-29079)) ^ 681747733;
                        i5 = -1069618898;
                    }
                    break;
                case -2005967089:
                case 428740988:
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3845)) ^ 865234486;
                        i5 = -1640811363;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2047) ^ 1825961798;
                        i5 = -813953091;
                    }
                    break;
                case -1983927847:
                case -1490232132:
                    interfaceC22808 = c13858.f43958.f28220;
                    if (interfaceC22808 instanceof C6465) {
                        iM2761 = C0619.m2761("ۢ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5723)) ^ 157239786;
                        i5 = -361521723;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩵") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * (-8101)) ^ 2121879163;
                        i5 = 1851299683;
                    }
                    break;
                case -1890465612:
                case -1498240731:
                    identityHashMap = new IdentityHashMap();
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ۧ᩶") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-5943)) ^ 1790586557;
                        i5 = -1427613543;
                    } else {
                        iM2761 = C0619.m2761("ܳۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-25617)) ^ (-1812057465);
                        i5 = -827928246;
                    }
                    break;
                case -1888305945:
                case 1881666132:
                    if (C2419.f7754 < 0) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3845)) ^ 865234486;
                        i5 = -1640811363;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۨۙ")) * 99;
                        i4 = ((iM2761 ^ i3) * 19311) ^ (-1271722319);
                        i5 = 1323309626;
                    }
                    break;
                case -1876577094:
                case -1213704384:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ۨۙ")) * 99;
                        i4 = ((iM2761 ^ i3) * 19311) ^ (-1271722319);
                        i5 = 1323309626;
                    } else {
                        iM2761 = (C0619.m2761("᩺ۘ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-29079)) ^ 681747733;
                        i5 = -1069618898;
                    }
                    break;
                case -1660084471:
                case -771555507:
                    if (C1146.m4231()) {
                        iM2761 = (C0773.m3169("ܳܶ") + i2) * (-91);
                        i4 = ((iM2761 ^ i3) * 28809) ^ (-1770787067);
                        i5 = 16932238;
                    } else {
                        iM2761 = (C0619.m2761("ۧ᩶") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-5943)) ^ 1790586557;
                        i5 = -1427613543;
                    }
                    break;
                case -1632774782:
                case 1164610237:
                    c6465 = (C6465) interfaceC22808;
                    if (AbstractC3624.m11766(identityHashMap, c6465, Boolean.TRUE) == null) {
                        iM2761 = C0619.m2761("ᩴܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-1279)) ^ 149200508;
                        i5 = -804546539;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩵") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * (-8101)) ^ 2121879163;
                        i5 = 1851299683;
                    }
                    break;
                case -1529465049:
                case 1397050207:
                    C1519.m5406(arrayList, c6465);
                    iM2761 = (C0619.m2761("ܺ᩵") + i3) * 23;
                    i4 = ((iM2761 ^ i2) * (-8101)) ^ 2121879163;
                    i5 = 1851299683;
                    break;
                case -1452710632:
                case 1998201051:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3845)) ^ 865234486;
                        i5 = -1640811363;
                    } else {
                        iM2761 = (C0773.m3169("ۤۖ") ^ i3) * (-49);
                        i4 = ((iM2761 ^ i2) * (-25545)) ^ 642250781;
                        i5 = 1490320665;
                    }
                    break;
                case -1369455495:
                case 83739960:
                    if (c13856 == null) {
                        iM2761 = C0619.m2761("ܰۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4901) ^ 2033232398;
                        i5 = 314790278;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20415)) ^ (-364519068);
                        i5 = -764619866;
                    }
                    break;
                case -1298303531:
                case -761392252:
                    if (C3492.m11482(arrayDeque)) {
                        iM2761 = C0619.m2761("ܰۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4901) ^ 2033232398;
                        i5 = 314790278;
                    } else {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 17531) ^ (-1495656656);
                        i5 = 1554004081;
                    }
                    break;
                case -1291424664:
                case 2137254705:
                    C3033.m9845();
                    if (C2287.m7745() > 0) {
                        iM2761 = (C0619.m2761("᩺ۘ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-29079)) ^ 681747733;
                        i5 = -1069618898;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴ᩶")) * (-103);
                        i4 = ((iM2761 ^ i2) * 15995) ^ 2015840026;
                        i5 = -2035998440;
                    }
                    break;
                case -1257420703:
                case 2136859554:
                    C1343.m4943();
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0619.m2761("ۧ᩶") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-5943)) ^ 1790586557;
                        i5 = -1427613543;
                    } else {
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4791) ^ 1134416551;
                        i5 = -1700955165;
                    }
                    break;
                case -1244276214:
                case 1966824165:
                    c13857 = ((C13856) arrayDeque.pop()).f43955;
                    iM2761 = C0619.m2761("֡֡") ^ i3;
                    i4 = ((iM2761 ^ i2) * 21789) ^ (-923401527);
                    i5 = 1767807602;
                    break;
                case -1125863975:
                case 127516029:
                    if (c13858 != null) {
                        iM2761 = (C0619.m2761("ۡ۬") + i2) * (-101);
                        i4 = ((iM2761 ^ i3) * 18873) ^ (-2003780273);
                        i5 = 1785144981;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩵") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * (-8101)) ^ 2121879163;
                        i5 = 1851299683;
                    }
                    break;
                case -1012035444:
                case 1956202825:
                    C13473.m33144();
                    C1542.m5459();
                    break;
                case -854603599:
                case 1921806535:
                    if (C1321.m4855(c13858)) {
                        iM2761 = (C0619.m2761("ۚۨ") ^ i3) * 73;
                        i4 = ((iM2761 ^ i2) * 14311) ^ (-395411197);
                        i5 = -605779643;
                    } else {
                        iM2761 = C0773.m3169("ۘۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17795)) ^ (-994803835);
                        i5 = -552188156;
                    }
                    break;
                case -828814577:
                case -564385094:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = (i2 - C0619.m2761("ܺۘ")) * 29;
                        i4 = ((iM2761 ^ i3) * 23477) ^ 1006000766;
                        i5 = 1295735003;
                    } else {
                        iM2761 = (C0773.m3169("ᩴܳ") + i3) * 23;
                        i4 = ((iM2761 ^ i2) * (-13949)) ^ (-874254422);
                        i5 = 569854346;
                    }
                    break;
                case -793344005:
                case -690490123:
                    C2287.m7745();
                    C3998.m12920();
                    iM2761 = (i3 - C0773.m3169("ᩴ᩶")) * (-103);
                    i4 = ((iM2761 ^ i2) * 15995) ^ 2015840026;
                    i5 = -2035998440;
                    break;
                case -769685175:
                case 173457169:
                    if (c13858 != null) {
                        iM2761 = C0773.m3169("ۗܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32619) ^ 2129516391;
                        i5 = -1177450508;
                    } else {
                        iM2761 = (C0619.m2761("ۚۨ") ^ i3) * 73;
                        i4 = ((iM2761 ^ i2) * 14311) ^ (-395411197);
                        i5 = -605779643;
                    }
                    break;
                case -745433075:
                case 1016218410:
                    if (C1343.m4943()) {
                        iM2761 = (C0619.m2761("᩺ۘ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * (-29079)) ^ 681747733;
                        i5 = -1069618898;
                    } else {
                        iM2761 = (C0773.m3169("ܿۜ") + i2) * (-115);
                        i4 = ((iM2761 ^ i3) * 23563) ^ 1367645840;
                        i5 = -134870417;
                    }
                    break;
                case -421220964:
                case 1583207282:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ۧ᩶") ^ i3) * (-21);
                        i4 = ((iM2761 ^ i2) * (-5943)) ^ 1790586557;
                        i5 = -1427613543;
                    } else {
                        iM2761 = C0773.m3169("֨ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6131) ^ (-1916176368);
                        i5 = 678127647;
                    }
                    break;
                case -415338903:
                case 296201192:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۨۙ")) * 99;
                        i4 = ((iM2761 ^ i3) * 19311) ^ (-1271722319);
                        i5 = 1323309626;
                    } else {
                        iM2761 = C0773.m3169("ۛ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25381) ^ 1214101742;
                        i5 = 63204996;
                    }
                    break;
                case -230296419:
                case 995880194:
                    break;
                case -158415566:
                case 1394995236:
                    C3492.m11485(arrayDeque, c13858);
                    c13858 = c13858.f43960;
                    iM2761 = C0773.m3169("ۤۨ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 14685) ^ (-1541169177);
                    i5 = -1497251404;
                    break;
                case 32766178:
                case 1608820158:
                    if (C2702.m8876()) {
                        iM2761 = (C0619.m2761("֫֫") ^ i2) * 5;
                        i4 = ((iM2761 ^ i3) * 14071) ^ 388521960;
                        i5 = -2033193358;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴ᩶")) * (-103);
                        i4 = ((iM2761 ^ i2) * 15995) ^ 2015840026;
                        i5 = -2035998440;
                    }
                    break;
                case 98360973:
                case 1972178498:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ܺۘ")) * 29;
                        i4 = ((iM2761 ^ i3) * 23477) ^ 1006000766;
                        i5 = 1295735003;
                    } else {
                        iM2761 = C0773.m3169("᩻ۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19925) ^ 36976327;
                        i5 = 1377901089;
                    }
                    break;
                case 876072811:
                case 1360658661:
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("᩺۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16819)) ^ (-1782808555);
                        i5 = 1834204852;
                    } else {
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4791) ^ 1134416551;
                        i5 = -1700955165;
                    }
                    break;
                case 1086748516:
                case 2138958142:
                    if (c13857 == null) {
                        iM2761 = C0773.m3169("֨֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28017)) ^ (-1113893132);
                        i5 = 464281869;
                    } else {
                        c13858 = c13857;
                        iM2761 = C0773.m3169("ۤۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14685) ^ (-1541169177);
                        i5 = -1497251404;
                    }
                    break;
                default:
                    if (!C3492.m11482(arrayDeque)) {
                        c13858 = c13857;
                        iM2761 = C0773.m3169("ۤۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 14685) ^ (-1541169177);
                        i5 = -1497251404;
                    } else {
                        iM2761 = C0619.m2761("ܰۢ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4901) ^ 2033232398;
                        i5 = 314790278;
                    }
                    break;
            }
            return;
        }
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
    public static C14667 m44295(C13856 c13856, long j, C25111 c25111, InterfaceC7509 interfaceC7509) throws Throwable {
        long j2;
        C1990 c1990;
        HashMap map;
        ArrayList arrayList;
        Iterator itM4942;
        int[] iArr;
        ArrayList arrayList2;
        IdentityHashMap identityHashMap;
        Iterator itM4943;
        C19889 c19889;
        int iM7752;
        long[] jArr;
        long[] jArr2;
        ArrayList arrayList3;
        int i;
        Iterator itM13647;
        C13856 c13857;
        int i2;
        long[] jArr3;
        long j3;
        Iterator itM13648;
        long jM10044;
        int i3;
        int i4;
        C13176 c13176M44290;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList4;
        IdentityHashMap identityHashMap2;
        int i8;
        ArrayList arrayList5;
        int i9;
        C13176 c13176;
        C15413 c15413M32694;
        Iterator itM13649;
        C13176 c13177;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i10;
        long[] jArr4;
        ArrayList arrayList8;
        C13176 c13178;
        ArrayList arrayList9;
        int length;
        int[] iArr2;
        int length2;
        boolean z;
        int i11;
        long jM9672;
        int i12;
        int i13;
        Iterator itM4944;
        long j4;
        C13176 c13179;
        long j5;
        C15413 c15413;
        int[] iArr3;
        int length3;
        int i14;
        C13856 c13858;
        long jM10045;
        Iterator it;
        long jLongValue;
        long j6;
        ArrayList arrayList10;
        int i15;
        int i16;
        long[] jArr5;
        C5719 c5719;
        int iM8879;
        ArrayList arrayList11;
        ArrayDeque arrayDeque;
        int i17;
        int[] iArr4;
        C5719 c57110;
        C10938[] c10938ArrM16755;
        int length4;
        int i18;
        C10938 c10938;
        Iterator itM136410;
        C5719 c57111;
        ArrayList arrayList12;
        int[] iArr5;
        int i19;
        C15413 c15414;
        Long lM12001;
        C13856 c13859;
        InterfaceC22808[] interfaceC22808Arr;
        C10938 c10939;
        int i20;
        char c;
        C10938 c10938M27748;
        long j7;
        ArrayList arrayList13;
        int i21;
        C13856 c13856M44291 = m44291(c13856, j, c25111);
        if (c13856M44291 == null) {
            return new C14667(null, f61938);
        }
        if (interfaceC7509 == null) {
            return new C14667(c13856M44291, f61938);
        }
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayList arrayList14 = new ArrayList();
        m44306(c13856M44291, identityHashMap3, arrayList14, new IdentityHashMap());
        ArrayList arrayList15 = new ArrayList();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        ArrayList arrayList16 = new ArrayList();
        Iterator itM4945 = C1343.m4942(arrayList14);
        while (C1826.m6317(itM4945)) {
            InterfaceC22808 interfaceC22808 = (InterfaceC22808) C0950.m3796(itM4945);
            long jLongValue2 = ((Long) identityHashMap3.get(interfaceC22808)).longValue();
            IdentityHashMap identityHashMap5 = new IdentityHashMap();
            ArrayList arrayList17 = new ArrayList();
            m44312(interfaceC22808, identityHashMap5, arrayList17, new IdentityHashMap());
            int iM88710 = C2702.m8879(arrayList15);
            int i22 = (int) jLongValue2;
            IdentityHashMap identityHashMap6 = identityHashMap3;
            Iterator it2 = itM4945;
            if (jLongValue2 != i22) {
                throw new ArithmeticException();
            }
            C5719 c57112 = new C5719(iM88710, interfaceC22808, i22, (C10938[]) arrayList17.toArray(new C10938[0]));
            C1519.m5406(arrayList15, c57112);
            Iterator itM4946 = C1343.m4942(arrayList17);
            while (C1826.m6317(itM4946)) {
                C10938 c109310 = (C10938) C0950.m3796(itM4946);
                ArrayList arrayList18 = (ArrayList) identityHashMap4.get(c109310);
                if (arrayList18 == null) {
                    arrayList18 = new ArrayList();
                    AbstractC0116.m1242(identityHashMap4, c109310, arrayList18);
                    C1519.m5406(arrayList16, c109310);
                }
                RunnableC0334.m2054(arrayList18, c57112);
            }
            identityHashMap3 = identityHashMap6;
            itM4945 = it2;
        }
        synchronized (f61935) {
            C4227 c4227 = f61937;
            if (c4227 == null || !c4227.m13497()) {
                j2 = 33554432;
            } else {
                long j8 = c4227.f15421;
                Iterator itM136411 = C4282.m13647(arrayList16);
                while (true) {
                    if (!C3998.m12923(itM136411)) {
                        j2 = 33554432;
                        j7 = -1;
                        arrayList13 = null;
                        i21 = 0;
                        break;
                    }
                    C10938 c109311 = (C10938) C4238.m13529(itM136411);
                    C22127 c22127 = c109311.f34596;
                    if (c22127.f71296 == c4227 && c22127.f71294 + ((long) c22127.f71297) == j8) {
                        arrayList13 = (ArrayList) identityHashMap4.get(c109311);
                        Iterator itM136412 = C4282.m13647(arrayList13);
                        long jM10046 = 0;
                        while (C3998.m12923(itM136412)) {
                            jM10046 = C3077.m10044(jM10046, ((C5719) C0950.m3796(itM136412)).m16756());
                        }
                        if (jM10046 > 0 && jM10046 <= 33554432) {
                            int i23 = (int) jM10046;
                            if (jM10046 != i23) {
                                throw new ArithmeticException();
                            }
                            j7 = c22127.f71294;
                            j2 = 33554432;
                            i21 = i23;
                            break;
                        }
                    }
                }
                if (arrayList13 != null) {
                    synchronized (f61935) {
                        if (f61937 == c4227 && c4227.f15421 == j8 && c4227.m13497() && c4227.m13500(i21, j7)) {
                            IdentityHashMap identityHashMap7 = new IdentityHashMap();
                            Iterator itM136413 = C4282.m13647(arrayList13);
                            while (C3998.m12923(itM136413)) {
                                AbstractC3624.m11766(identityHashMap7, ((C5719) C4238.m13529(itM136413)).m16757(), Boolean.TRUE);
                            }
                            c1990 = new C1990(identityHashMap7, i21, c4227, j7);
                        }
                    }
                }
                if (c1990 != null) {
                    map = new HashMap();
                    arrayList = new ArrayList();
                    itM4942 = C1343.m4942(arrayList16);
                    while (C1826.m6317(itM4942)) {
                        C10938 c109312 = (C10938) C4238.m13529(itM4942);
                        arrayList12 = (ArrayList) identityHashMap4.get(c109312);
                        iArr5 = new int[C2288.m7752(arrayList12)];
                        for (i19 = 0; i19 < C2702.m8879(arrayList12); i19++) {
                            iArr5[i19] = ((C5719) C1542.m5457(arrayList12, i19)).m16758();
                        }
                        c15414 = new C15413(iArr5);
                        lM12001 = (Long) C2310.m7814(map, c15414);
                        if (lM12001 == null) {
                            RunnableC0334.m2054(arrayList, c15414);
                            lM12001 = C3690.m12001(0L);
                        }
                        RunnableC0334.m2056(map, c15414, C1542.m5460(C3077.m10044(lM12001.longValue(), c109312.mo2796())));
                    }
                    iArr = new int[C2288.m7752(arrayList15)];
                    Arrays.fill(iArr, -1);
                    arrayList2 = new ArrayList();
                    identityHashMap = new IdentityHashMap();
                    itM4943 = C1343.m4942(arrayList15);
                    while (C3998.m12923(itM4943)) {
                        c5719 = (C5719) C0950.m3796(itM4943);
                        if (iArr[c5719.m16758()] >= 0) {
                            iM8879 = C2702.m8879(arrayList2);
                            arrayList11 = new ArrayList();
                            arrayDeque = new ArrayDeque();
                            C2419.m8165(arrayDeque, c5719);
                            while (!C3492.m11482(arrayDeque)) {
                                c57110 = (C5719) arrayDeque.pop();
                                if (iArr[c57110.m16758()] >= 0) {
                                    iArr[c57110.m16758()] = iM8879;
                                    Iterator it3 = itM4943;
                                    RunnableC0334.m2054(arrayList11, C0619.m2764(c57110.m16758()));
                                    c10938ArrM16755 = c57110.m16755();
                                    length4 = c10938ArrM16755.length;
                                    int i24 = iM8879;
                                    i18 = 0;
                                    while (i18 < length4) {
                                        int i25 = length4;
                                        c10938 = c10938ArrM16755[i18];
                                        C10938[] c10938Arr = c10938ArrM16755;
                                        if (AbstractC3624.m11766(identityHashMap, c10938, Boolean.TRUE) != null) {
                                            itM136410 = C4282.m13647((ArrayList) identityHashMap4.get(c10938));
                                            while (C1826.m6317(itM136410)) {
                                                c57111 = (C5719) C0950.m3796(itM136410);
                                                if (iArr[c57111.m16758()] < 0) {
                                                    C3492.m11485(arrayDeque, c57111);
                                                }
                                            }
                                        }
                                        i18++;
                                        c10938ArrM16755 = c10938Arr;
                                        length4 = i25;
                                    }
                                    itM4943 = it3;
                                    iM8879 = i24;
                                }
                            }
                            Iterator it4 = itM4943;
                            i17 = 0;
                            C12884.sort(arrayList11, new C18529(i17));
                            iArr4 = new int[C2288.m7752(arrayList11)];
                            while (i17 < C2702.m8879(arrayList11)) {
                                iArr4[i17] = C0619.m2757((Integer) C3690.m11990(arrayList11, i17));
                                i17++;
                            }
                            C1519.m5406(arrayList2, new C15413(iArr4));
                            itM4943 = it4;
                        }
                    }
                    c19889 = new C19889(arrayList2, iArr);
                    iM7752 = C2288.m7752((ArrayList) c19889.m45787());
                    jArr = new long[iM7752];
                    jArr2 = new long[iM7752];
                    arrayList3 = new ArrayList(iM7752);
                    for (i = 0; i < iM7752; i++) {
                        RunnableC0334.m2054(arrayList3, new ArrayList());
                    }
                    itM13647 = C4282.m13647(arrayList);
                    while (C1826.m6317(itM13647)) {
                        c15413 = (C15413) C0950.m3796(itM13647);
                        iArr3 = c15413.f50231;
                        i14 = 0;
                        c13858 = c13856M44291;
                        jM10045 = 0;
                        for (length3 = iArr3.length; i14 < length3; length3 = length3) {
                            jM10045 = C3077.m10044(jM10045, ((C5719) C3690.m11990(arrayList15, iArr3[i14])).m16756());
                            i14++;
                            itM13647 = itM13647;
                            iArr3 = iArr3;
                        }
                        it = itM13647;
                        int i26 = c19889.m45786()[c15413.f50231[0]];
                        jLongValue = ((Long) C0269.m1779(map, c15413)).longValue();
                        j6 = j2;
                        jArr[i26] = C3077.m10044(jArr[i26], jLongValue);
                        arrayList10 = (ArrayList) C3690.m11990(arrayList3, i26);
                        i15 = (int) jM10045;
                        i16 = iM7752;
                        jArr5 = jArr;
                        if (jM10045 == i15) {
                            throw new ArithmeticException();
                        }
                        C1519.m5406(arrayList10, new C13176(c15413, i15, jLongValue - jM10045));
                        c13856M44291 = c13858;
                        itM13647 = it;
                        j2 = j6;
                        iM7752 = i16;
                        jArr = jArr5;
                    }
                    c13857 = c13856M44291;
                    i2 = iM7752;
                    jArr3 = jArr;
                    j3 = j2;
                    itM13648 = C4282.m13647(arrayList15);
                    while (C1826.m6317(itM13648)) {
                        C5719 c57113 = (C5719) C4238.m13529(itM13648);
                        int i27 = c19889.m45786()[c57113.m16758()];
                        jArr2[i27] = C3077.m10044(jArr2[i27], c57113.m16756());
                    }
                    jM10044 = 0;
                    for (i3 = 0; i3 < i2; i3++) {
                        j5 = jArr3[i3] - jArr2[i3];
                        if (j5 > 0) {
                            jM10044 = C3077.m10044(jM10044, j5);
                        }
                    }
                    if (jM10044 <= j3) {
                        c1990 = null;
                        break;
                    }
                    i4 = 0;
                    c13176M44290 = null;
                    while (true) {
                        i5 = 33554432;
                        if (i4 < i2) {
                            i6 = 0;
                            i7 = 1048576;
                            loop19: while (i6 < C2702.m8879(arrayList3)) {
                                if (jArr2[i6] > j3) {
                                    arrayList5 = (ArrayList) C1542.m5457(arrayList3, i6);
                                    if (C2702.m8879(arrayList5) >= 2) {
                                        C12884.sort(arrayList5, new C21513());
                                        i9 = 0;
                                        while (i9 < C2288.m7752(arrayList5)) {
                                            c13176 = (C13176) C1542.m5457(arrayList5, i9);
                                            if (c13176.m32692() > i5) {
                                                arrayList6 = arrayList15;
                                                arrayList7 = arrayList5;
                                                i10 = i9;
                                                jArr4 = jArr2;
                                                arrayList8 = arrayList3;
                                            } else {
                                                c15413M32694 = c13176.m32694();
                                                int iM32692 = c13176.m32692();
                                                long jM32693 = c13176.m32693() + ((long) iM32692);
                                                if (c13176.m32693() > 0) {
                                                    c13176M44290 = m44290(c13176M44290, c13176);
                                                }
                                                while (true) {
                                                    itM13649 = C4282.m13647(arrayList5);
                                                    c13177 = null;
                                                    long j9 = 0;
                                                    long j10 = 0;
                                                    while (C1826.m6317(itM13649)) {
                                                        c13178 = (C13176) C4238.m13529(itM13649);
                                                        arrayList9 = arrayList5;
                                                        length = c13178.m32694().f50231.length;
                                                        if (length > i7) {
                                                            break loop19;
                                                        }
                                                        int i28 = i7 - length;
                                                        iArr2 = c13178.m32694().f50231;
                                                        length2 = iArr2.length;
                                                        z = false;
                                                        Iterator it5 = itM13649;
                                                        i11 = 0;
                                                        long[] jArr6 = jArr2;
                                                        ArrayList arrayList19 = arrayList3;
                                                        jM9672 = 0;
                                                        while (i11 < length2) {
                                                            int i29 = length2;
                                                            i13 = iArr2[i11];
                                                            if (c15413M32694.m36892(i13)) {
                                                                z = true;
                                                            } else {
                                                                jM9672 = C2966.m9672(jM9672, ((C5719) C3690.m11990(arrayList15, i13)).m16756());
                                                            }
                                                            i11++;
                                                            length2 = i29;
                                                            arrayList15 = arrayList15;
                                                        }
                                                        ArrayList arrayList20 = arrayList15;
                                                        if (z || jM9672 == 0 || ((long) iM32692) + jM9672 > j3) {
                                                            i12 = i9;
                                                        } else {
                                                            i12 = i9;
                                                            long jM32694 = (c13178.m32693() + ((long) c13178.m32692())) - jM9672;
                                                            if (jM32694 > j9 || (jM32694 == j9 && c13177 != null && jM9672 < j10)) {
                                                                j9 = jM32694;
                                                                j10 = jM9672;
                                                                c13177 = c13178;
                                                            }
                                                        }
                                                        arrayList5 = arrayList9;
                                                        i9 = i12;
                                                        i7 = i28;
                                                        itM13649 = it5;
                                                        jArr2 = jArr6;
                                                        arrayList3 = arrayList19;
                                                        arrayList15 = arrayList20;
                                                    }
                                                    arrayList6 = arrayList15;
                                                    arrayList7 = arrayList5;
                                                    i10 = i9;
                                                    jArr4 = jArr2;
                                                    arrayList8 = arrayList3;
                                                    if (c13177 == null || j9 <= 0) {
                                                        break;
                                                    }
                                                    c15413M32694 = c15413M32694.m36891(c13177.m32694());
                                                    long j11 = ((long) iM32692) + j10;
                                                    iM32692 = (int) j11;
                                                    long j12 = iM32692;
                                                    if (j11 != j12) {
                                                        throw new ArithmeticException();
                                                    }
                                                    jM32693 = C2966.m9672(jM32693, c13177.m32693() + ((long) c13177.m32692()));
                                                    long j13 = jM32693 - j12;
                                                    if (j13 > 0) {
                                                        c13176M44290 = m44290(c13176M44290, new C13176(c15413M32694, iM32692, j13));
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
                            if (c13176M44290 == null) {
                                identityHashMap2 = new IdentityHashMap();
                                for (int i30 : c13176M44290.m32694().f50231) {
                                    AbstractC3624.m11766(identityHashMap2, ((C5719) C3690.m11990(arrayList4, i30)).m16757(), Boolean.TRUE);
                                }
                                c1990 = new C1990(identityHashMap2, c13176M44290.m32692(), null, -1L);
                                break;
                            }
                            c1990 = null;
                            break;
                        }
                        itM4944 = C1343.m4942((ArrayList) C3690.m11990(arrayList3, i4));
                        while (C3998.m12923(itM4944)) {
                            c13179 = (C13176) C4238.m13529(itM4944);
                            if (c13179.m32692() > 33554432 && c13179.m32693() > 0) {
                                c13176M44290 = m44290(c13176M44290, c13179);
                            }
                        }
                        j4 = jArr2[i4];
                        long j14 = jArr3[i4] - j4;
                        if (j4 <= 0 && j4 <= j3 && j14 > 0) {
                            C15413 c15415 = (C15413) C1542.m5457((ArrayList) c19889.m45787(), i4);
                            int i31 = (int) j4;
                            if (j4 != i31) {
                                throw new ArithmeticException();
                            }
                            c13176M44290 = m44290(c13176M44290, new C13176(c15415, i31, j14));
                        }
                        i4++;
                    }
                } else {
                    c13857 = c13856M44291;
                }
                if (c1990 == null) {
                    return new C14667(c13857, f61938);
                }
                c13859 = c13857;
                interfaceC22808Arr = f61938;
                try {
                    try {
                        try {
                            if (c1990.m6820() == null) {
                                c10938M27748 = C10938.m27747(c1990.m6822());
                            } else {
                                c10938M27748 = C10938.m27748(c1990.m6822(), c1990.m6819(), c1990.m6820());
                            }
                            c10939 = c10938M27748;
                            try {
                                if (c10939 == null) {
                                    return new C14667(c13859, interfaceC22808Arr);
                                }
                                C13856 c13856M44292 = m44292(c13859, c1990.m6821(), c10939, interfaceC7509);
                                c10939.finish();
                                return new C14667(c13856M44292, new InterfaceC22808[]{c10939});
                            } catch (IOException e) {
                                e = e;
                                i20 = 1;
                                c = 0;
                                if (c10939 != null) {
                                    InterfaceC22808[] interfaceC22808Arr2 = new InterfaceC22808[i20];
                                    interfaceC22808Arr2[c] = c10939;
                                    m44349(interfaceC22808Arr2, e);
                                }
                                if ((e instanceof C9446) || c1990.m6820() == null) {
                                    throw e;
                                }
                                return new C14667(c13859, interfaceC22808Arr);
                            } catch (Error e2) {
                                e = e2;
                                if (c10939 != null) {
                                    m44349(new InterfaceC22808[]{c10939}, e);
                                }
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                if (c10939 != null) {
                                    m44349(new InterfaceC22808[]{c10939}, e);
                                }
                                throw e;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            c10939 = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i20 = 1;
                        c = 0;
                        c10939 = null;
                    }
                } catch (Error | RuntimeException e6) {
                    e = e6;
                    c10939 = null;
                }
            }
        }
        c1990 = null;
        if (c1990 != null) {
            map = new HashMap();
            arrayList = new ArrayList();
            itM4942 = C1343.m4942(arrayList16);
            while (C1826.m6317(itM4942)) {
                C10938 c109313 = (C10938) C4238.m13529(itM4942);
                arrayList12 = (ArrayList) identityHashMap4.get(c109313);
                iArr5 = new int[C2288.m7752(arrayList12)];
                while (i19 < C2702.m8879(arrayList12)) {
                    iArr5[i19] = ((C5719) C1542.m5457(arrayList12, i19)).m16758();
                }
                c15414 = new C15413(iArr5);
                lM12001 = (Long) C2310.m7814(map, c15414);
                if (lM12001 == null) {
                    RunnableC0334.m2054(arrayList, c15414);
                    lM12001 = C3690.m12001(0L);
                }
                RunnableC0334.m2056(map, c15414, C1542.m5460(C3077.m10044(lM12001.longValue(), c109313.mo2796())));
            }
            iArr = new int[C2288.m7752(arrayList15)];
            Arrays.fill(iArr, -1);
            arrayList2 = new ArrayList();
            identityHashMap = new IdentityHashMap();
            itM4943 = C1343.m4942(arrayList15);
            while (C3998.m12923(itM4943)) {
                c5719 = (C5719) C0950.m3796(itM4943);
                if (iArr[c5719.m16758()] >= 0) {
                    iM8879 = C2702.m8879(arrayList2);
                    arrayList11 = new ArrayList();
                    arrayDeque = new ArrayDeque();
                    C2419.m8165(arrayDeque, c5719);
                    while (!C3492.m11482(arrayDeque)) {
                        c57110 = (C5719) arrayDeque.pop();
                        if (iArr[c57110.m16758()] >= 0) {
                            iArr[c57110.m16758()] = iM8879;
                            Iterator it6 = itM4943;
                            RunnableC0334.m2054(arrayList11, C0619.m2764(c57110.m16758()));
                            c10938ArrM16755 = c57110.m16755();
                            length4 = c10938ArrM16755.length;
                            int i210 = iM8879;
                            i18 = 0;
                            while (i18 < length4) {
                                int i211 = length4;
                                c10938 = c10938ArrM16755[i18];
                                C10938[] c10938Arr2 = c10938ArrM16755;
                                if (AbstractC3624.m11766(identityHashMap, c10938, Boolean.TRUE) != null) {
                                    itM136410 = C4282.m13647((ArrayList) identityHashMap4.get(c10938));
                                    while (C1826.m6317(itM136410)) {
                                        c57111 = (C5719) C0950.m3796(itM136410);
                                        if (iArr[c57111.m16758()] < 0) {
                                            C3492.m11485(arrayDeque, c57111);
                                        }
                                    }
                                }
                                i18++;
                                c10938ArrM16755 = c10938Arr2;
                                length4 = i211;
                            }
                            itM4943 = it6;
                            iM8879 = i210;
                        }
                    }
                    Iterator it7 = itM4943;
                    i17 = 0;
                    C12884.sort(arrayList11, new C18529(i17));
                    iArr4 = new int[C2288.m7752(arrayList11)];
                    while (i17 < C2702.m8879(arrayList11)) {
                        iArr4[i17] = C0619.m2757((Integer) C3690.m11990(arrayList11, i17));
                        i17++;
                    }
                    C1519.m5406(arrayList2, new C15413(iArr4));
                    itM4943 = it7;
                }
            }
            c19889 = new C19889(arrayList2, iArr);
            iM7752 = C2288.m7752((ArrayList) c19889.m45787());
            jArr = new long[iM7752];
            jArr2 = new long[iM7752];
            arrayList3 = new ArrayList(iM7752);
            while (i < iM7752) {
                RunnableC0334.m2054(arrayList3, new ArrayList());
            }
            itM13647 = C4282.m13647(arrayList);
            while (C1826.m6317(itM13647)) {
                c15413 = (C15413) C0950.m3796(itM13647);
                iArr3 = c15413.f50231;
                i14 = 0;
                c13858 = c13856M44291;
                jM10045 = 0;
                while (i14 < length3) {
                    jM10045 = C3077.m10044(jM10045, ((C5719) C3690.m11990(arrayList15, iArr3[i14])).m16756());
                    i14++;
                    itM13647 = itM13647;
                    iArr3 = iArr3;
                }
                it = itM13647;
                int i212 = c19889.m45786()[c15413.f50231[0]];
                jLongValue = ((Long) C0269.m1779(map, c15413)).longValue();
                j6 = j2;
                jArr[i212] = C3077.m10044(jArr[i212], jLongValue);
                arrayList10 = (ArrayList) C3690.m11990(arrayList3, i212);
                i15 = (int) jM10045;
                i16 = iM7752;
                jArr5 = jArr;
                if (jM10045 == i15) {
                    throw new ArithmeticException();
                }
                C1519.m5406(arrayList10, new C13176(c15413, i15, jLongValue - jM10045));
                c13856M44291 = c13858;
                itM13647 = it;
                j2 = j6;
                iM7752 = i16;
                jArr = jArr5;
            }
            c13857 = c13856M44291;
            i2 = iM7752;
            jArr3 = jArr;
            j3 = j2;
            itM13648 = C4282.m13647(arrayList15);
            while (C1826.m6317(itM13648)) {
                C5719 c57114 = (C5719) C4238.m13529(itM13648);
                int i213 = c19889.m45786()[c57114.m16758()];
                jArr2[i213] = C3077.m10044(jArr2[i213], c57114.m16756());
            }
            jM10044 = 0;
            while (i3 < i2) {
                j5 = jArr3[i3] - jArr2[i3];
                if (j5 > 0) {
                    jM10044 = C3077.m10044(jM10044, j5);
                }
            }
            if (jM10044 <= j3) {
                c1990 = null;
                break;
            }
            i4 = 0;
            c13176M44290 = null;
            while (true) {
                i5 = 33554432;
                if (i4 < i2) {
                    i6 = 0;
                    i7 = 1048576;
                    loop19: while (i6 < C2702.m8879(arrayList3)) {
                        if (jArr2[i6] > j3) {
                            arrayList5 = (ArrayList) C1542.m5457(arrayList3, i6);
                            if (C2702.m8879(arrayList5) >= 2) {
                                C12884.sort(arrayList5, new C21513());
                                i9 = 0;
                                while (i9 < C2288.m7752(arrayList5)) {
                                    c13176 = (C13176) C1542.m5457(arrayList5, i9);
                                    if (c13176.m32692() > i5) {
                                        arrayList6 = arrayList15;
                                        arrayList7 = arrayList5;
                                        i10 = i9;
                                        jArr4 = jArr2;
                                        arrayList8 = arrayList3;
                                    } else {
                                        c15413M32694 = c13176.m32694();
                                        int iM32693 = c13176.m32692();
                                        long jM32695 = c13176.m32693() + ((long) iM32693);
                                        if (c13176.m32693() > 0) {
                                            c13176M44290 = m44290(c13176M44290, c13176);
                                        }
                                        while (true) {
                                            itM13649 = C4282.m13647(arrayList5);
                                            c13177 = null;
                                            long j15 = 0;
                                            long j16 = 0;
                                            while (C1826.m6317(itM13649)) {
                                                c13178 = (C13176) C4238.m13529(itM13649);
                                                arrayList9 = arrayList5;
                                                length = c13178.m32694().f50231.length;
                                                if (length > i7) {
                                                    break loop19;
                                                    break loop19;
                                                }
                                                int i214 = i7 - length;
                                                iArr2 = c13178.m32694().f50231;
                                                length2 = iArr2.length;
                                                z = false;
                                                Iterator it8 = itM13649;
                                                i11 = 0;
                                                long[] jArr7 = jArr2;
                                                ArrayList arrayList110 = arrayList3;
                                                jM9672 = 0;
                                                while (i11 < length2) {
                                                    int i215 = length2;
                                                    i13 = iArr2[i11];
                                                    if (c15413M32694.m36892(i13)) {
                                                        z = true;
                                                    } else {
                                                        jM9672 = C2966.m9672(jM9672, ((C5719) C3690.m11990(arrayList15, i13)).m16756());
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
                                                itM13649 = it8;
                                                jArr2 = jArr7;
                                                arrayList3 = arrayList110;
                                                arrayList15 = arrayList21;
                                            }
                                            arrayList6 = arrayList15;
                                            arrayList7 = arrayList5;
                                            i10 = i9;
                                            jArr4 = jArr2;
                                            arrayList8 = arrayList3;
                                            if (c13177 == null) {
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
                    if (c13176M44290 == null) {
                        identityHashMap2 = new IdentityHashMap();
                        while (i8 < r2) {
                            AbstractC3624.m11766(identityHashMap2, ((C5719) C3690.m11990(arrayList4, i30)).m16757(), Boolean.TRUE);
                        }
                        c1990 = new C1990(identityHashMap2, c13176M44290.m32692(), null, -1L);
                        break;
                    }
                    c1990 = null;
                    break;
                }
                itM4944 = C1343.m4942((ArrayList) C3690.m11990(arrayList3, i4));
                while (C3998.m12923(itM4944)) {
                    c13179 = (C13176) C4238.m13529(itM4944);
                    if (c13179.m32692() > 33554432) {
                    }
                }
                j4 = jArr2[i4];
                long j17 = jArr3[i4] - j4;
                if (j4 <= 0) {
                }
                i4++;
            }
        } else {
            c13857 = c13856M44291;
        }
        if (c1990 == null) {
            return new C14667(c13857, f61938);
        }
        c13859 = c13857;
        interfaceC22808Arr = f61938;
        if (c1990.m6820() == null) {
            c10938M27748 = C10938.m27747(c1990.m6822());
        } else {
            c10938M27748 = C10938.m27748(c1990.m6822(), c1990.m6819(), c1990.m6820());
        }
        c10939 = c10938M27748;
        if (c10939 == null) {
            return new C14667(c13859, interfaceC22808Arr);
        }
        C13856 c13856M44293 = m44292(c13859, c1990.m6821(), c10939, interfaceC7509);
        c10939.finish();
        return new C14667(c13856M44293, new InterfaceC22808[]{c10939});
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m44332() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 942120257;
        int i4 = C3448.f11240;
        int i5 = RunnableC0334.f1808;
        int iM2761 = C0619.m2761("ۖۜ") ^ i5;
        int i6 = ((iM2761 ^ i4) * (-18675)) ^ (-370350760);
        int i7 = -690546592;
        while (true) {
            i3 = ((((i3 ^ i4) * (-29147)) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2113150617:
                case -1427557522:
                    s3 = 64816;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۘ۟")) * 45;
                        i6 = ((iM2761 ^ i5) * (-16937)) ^ (-1842765916);
                        i7 = 1615371612;
                    }
                    break;
                case -1885363732:
                case -1152897067:
                    RunnableC3055.m9933();
                    C3734.m12152();
                    return;
                case -1679804761:
                case -1403612403:
                    C3998.m12920();
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("ܽۘ") + i5) * (-85);
                        i6 = ((iM2761 ^ i4) * (-11559)) ^ (-1718269827);
                        i7 = 903314389;
                    } else {
                        iM2761 = C0773.m3169("ۚۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 29003) ^ (-734331170);
                        i7 = 1742128758;
                    }
                    break;
                case -1632643440:
                case -132730949:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("᩸ۚ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-32147)) ^ 511242628;
                        i7 = -177173034;
                    } else {
                        iM2761 = C0619.m2761("ۚۢ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 24685) ^ (-1135137515);
                        i7 = -2022546075;
                    }
                    break;
                case -1564432822:
                case -468855892:
                    i2 = 41405;
                    iM2761 = C0773.m3169("ܰۗ") ^ i4;
                    i6 = ((iM2761 ^ i5) * 3845) ^ (-25140579);
                    i7 = -520798793;
                    break;
                case -1497575540:
                case 490036692:
                    C2966.m9664();
                    iM2761 = C0773.m3169("ۚۖ") ^ i4;
                    i6 = ((iM2761 ^ i5) * 29003) ^ (-734331170);
                    i7 = 1742128758;
                    break;
                case -1266207313:
                case -932703633:
                    if ((s * s3) - i > 0) {
                        iM2761 = C0773.m3169("ܽܺ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 15097) ^ (-218422024);
                        i7 = -1625538787;
                    } else {
                        iM2761 = (C0773.m3169("ۖۛ") ^ i5) * 53;
                        i6 = ((iM2761 ^ i4) * (-18673)) ^ 1591671146;
                        i7 = -996170306;
                    }
                    break;
                case -1189389688:
                case 180818474:
                    short[] sArr2 = f61940;
                    if (C4282.f15546 > 0) {
                        if (C4238.f15451 < 0) {
                            throw new IllegalStateException(C2375.m8069(sArr2, 872, 33, i2));
                        }
                        iM2761 = (C0773.m3169("ܽۘ") + i5) * (-85);
                        i6 = ((iM2761 ^ i4) * (-11559)) ^ (-1718269827);
                        i7 = 903314389;
                    } else {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    }
                    break;
                case -1060353925:
                case 1900389968:
                    C2419.m8174();
                    if (!C0619.f2439) {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    } else {
                        iM2761 = (C0773.m3169("ܽۘ") + i5) * (-85);
                        i6 = ((iM2761 ^ i4) * (-11559)) ^ (-1718269827);
                        i7 = 903314389;
                    }
                    break;
                case -703867878:
                case -80319228:
                    int i8 = s + s2;
                    i = i8 * i8;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("᩸ۚ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-32147)) ^ 511242628;
                        i7 = -177173034;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ᩴ۟")) * (-21);
                        i6 = ((iM2761 ^ i4) * 26223) ^ 757202303;
                        i7 = 361238315;
                    }
                    break;
                case -479708055:
                case -109117230:
                    sArr = f61940;
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0773.m3169("ܽۘ") + i5) * (-85);
                        i6 = ((iM2761 ^ i4) * (-11559)) ^ (-1718269827);
                        i7 = 903314389;
                    } else {
                        iM2761 = (C0619.m2761("ۘܿ") ^ i5) * (-83);
                        i6 = ((iM2761 ^ i4) * (-12147)) ^ 2039785378;
                        i7 = -708580183;
                    }
                    break;
                case 146564278:
                case 1067081517:
                    m44326();
                    if (this.f61943) {
                        iM2761 = C0773.m3169("۠᩶") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-31989)) ^ (-1518354857);
                        i7 = -1935389743;
                    } else {
                        iM2761 = C0773.m3169("֨ۡ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 12797) ^ (-2050552422);
                        i7 = 1569785226;
                    }
                    break;
                case 317094234:
                case 420066301:
                    s = sArr[c];
                    s2 = 16204;
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0773.m3169("᩸ۚ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-32147)) ^ 511242628;
                        i7 = -177173034;
                    } else {
                        iM2761 = (i4 - C0773.m3169("֫ۙ")) * (-119);
                        i6 = ((iM2761 ^ i5) * 16757) ^ (-366838627);
                        i7 = -46643236;
                    }
                    break;
                case 321185147:
                case 1125696974:
                    C2419.m8174();
                    if (C2375.f7641 > 0) {
                        iM2761 = C0773.m3169("ۚۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 29003) ^ (-734331170);
                        i7 = 1742128758;
                    } else {
                        iM2761 = C0619.m2761("ۧᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-11639)) ^ (-830354187);
                        i7 = 1324712774;
                    }
                    break;
                case 422515663:
                case 1251813956:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    } else {
                        iM2761 = (C0619.m2761("֨᩺") ^ i4) * (-47);
                        i6 = ((iM2761 ^ i5) * 1865) ^ 109486136;
                        i7 = -1003701980;
                    }
                    break;
                case 1003157205:
                case 1187325473:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    } else {
                        iM2761 = C0773.m3169("۫۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-17213)) ^ (-1019400452);
                        i7 = -1563145290;
                    }
                    break;
                case 1127150218:
                case 2002084902:
                    i2 = 60599;
                    iM2761 = C0773.m3169("ܰۗ") ^ i4;
                    i6 = ((iM2761 ^ i5) * 3845) ^ (-25140579);
                    i7 = -520798793;
                    break;
                case 1278968822:
                case 1747864956:
                    return;
                default:
                    c = 871;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۢۗ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23499)) ^ 1687362726;
                        i7 = 1940477492;
                    } else {
                        iM2761 = (C0773.m3169("ۗ֫") + i5) * 21;
                        i6 = ((iM2761 ^ i4) * 29039) ^ 438861680;
                        i7 = 1910010178;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44322(InterfaceC22808 interfaceC22808, IdentityHashMap identityHashMap) {
        Boolean bool = null;
        boolean z = false;
        boolean z2 = false;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        int i = 0;
        int i2 = 129240900;
        int i3 = C2702.f8586;
        int i4 = C23916.f77426;
        int iM3169 = (C0773.m3169("᩻ۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM3169 ^ i3) * (-22709)) ^ (-1920721196);
        int i6 = 1421821992;
        while (true) {
            i2 = ((((i2 ^ i3) * 28689) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2121303932:
                case 1623282804:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21133) ^ 1393267918;
                        i6 = -1443348477;
                    } else {
                        iM3169 = C0619.m2761("ܺۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-26507)) ^ (-197796983);
                        i6 = 1436862987;
                    }
                    break;
                case -2073418591:
                case 702191893:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("ۢ᩻") + i4) * 35;
                        i5 = ((iM3169 ^ i3) * 1399) ^ (-1246881975);
                        i6 = -262009374;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܺ") + i3) * 41;
                        i5 = ((iM3169 ^ i4) * 32377) ^ 1616118214;
                        i6 = -1656596680;
                    }
                    break;
                case -1828757486:
                case -1352481034:
                    bool = (Boolean) identityHashMap.get(interfaceC22808);
                    if (bool == null) {
                        iM3169 = C0619.m2761("ۜ᩶") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-4925)) ^ (-5708562);
                        i6 = -793169745;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩺") ^ i3) * (-3);
                        i5 = ((iM3169 ^ i4) * (-8343)) ^ 339368359;
                        i6 = -1779392356;
                    }
                    break;
                case -1826891355:
                case -1438481095:
                    C11235.m28309();
                    if (C11235.f35427 < 0) {
                        iM3169 = (C0773.m3169("ۢ᩻") + i4) * 35;
                        i5 = ((iM3169 ^ i3) * 1399) ^ (-1246881975);
                        i6 = -262009374;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵᩹")) * 37;
                        i5 = ((iM3169 ^ i4) * (-757)) ^ (-1069502838);
                        i6 = -918286083;
                    }
                    break;
                case -1766756995:
                case 346558649:
                    if (m44322(interfaceC22808Arr[i], identityHashMap)) {
                        iM3169 = C0773.m3169("ۤۛ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-13427)) ^ (-780064851);
                        i6 = -1756467407;
                    } else {
                        iM3169 = C0619.m2761("ۧܳ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-7063)) ^ (-1819069585);
                        i6 = -520992268;
                    }
                    break;
                case -1524030211:
                case 1888682235:
                    C23916.m53419();
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ܺۨ") ^ i3) * (-89);
                        i5 = ((iM3169 ^ i4) * (-28863)) ^ (-569609507);
                        i6 = 811945625;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩻") + i4) * 35;
                        i5 = ((iM3169 ^ i3) * 1399) ^ (-1246881975);
                        i6 = -262009374;
                    }
                    break;
                case -1466141852:
                case -1081332867:
                    i++;
                    iM3169 = C0619.m2761("ۙܶ") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-11773)) ^ (-649611763);
                    i6 = -321427177;
                    break;
                case -1429014744:
                case 2137827825:
                    interfaceC22808Arr = ((C6465) interfaceC22808).f21763;
                    if (C2834.m9344() >= 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21133) ^ 1393267918;
                        i6 = -1443348477;
                    } else {
                        iM3169 = C0773.m3169("ۜ֨") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-21161)) ^ 145845053;
                        i6 = 115249065;
                    }
                    break;
                case -1385431740:
                case -1381113648:
                    z2 = true;
                    iM3169 = (i3 - C0773.m3169("ۚܳ")) * (-67);
                    i5 = ((iM3169 ^ i4) * (-8371)) ^ 1206388080;
                    i6 = 1585207656;
                    break;
                case -1287322044:
                case -847982307:
                    return C3492.m11490(Boolean.TRUE, bool);
                case -1094111099:
                case 1995091765:
                    C3690.m11987();
                    C13473.m33144();
                    return false;
                case -938992880:
                case -772717389:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21133) ^ 1393267918;
                        i6 = -1443348477;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩵۟")) * (-11);
                        i5 = ((iM3169 ^ i3) * 25619) ^ (-235791500);
                        i6 = -63646371;
                    }
                    break;
                case -862980986:
                case 905236737:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ܺۨ") ^ i3) * (-89);
                        i5 = ((iM3169 ^ i4) * (-28863)) ^ (-569609507);
                        i6 = 811945625;
                    } else {
                        iM3169 = C0619.m2761("᩹ᩳ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 10439) ^ (-2060783968);
                        i6 = -1150327800;
                    }
                    break;
                case -701177348:
                case -489292812:
                    if (i < length) {
                        iM3169 = (i3 - C0619.m2761("ܳܿ")) * 43;
                        i5 = ((iM3169 ^ i4) * (-5177)) ^ (-747602930);
                        i6 = 1053960393;
                    } else {
                        z2 = z;
                        iM3169 = (i3 - C0773.m3169("ۚܳ")) * (-67);
                        i5 = ((iM3169 ^ i4) * (-8371)) ^ 1206388080;
                        i6 = 1585207656;
                    }
                    break;
                case -664848985:
                case 898673875:
                    if (interfaceC22808 instanceof C6465) {
                        iM3169 = C0773.m3169("᩻֨") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-27137)) ^ 1407063424;
                        i6 = 922842304;
                    } else {
                        z2 = z;
                        iM3169 = (i3 - C0773.m3169("ۚܳ")) * (-67);
                        i5 = ((iM3169 ^ i4) * (-8371)) ^ 1206388080;
                        i6 = 1585207656;
                    }
                    break;
                case -509295385:
                case 1845583314:
                    C2834.m9344();
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("֫᩻") ^ i4;
                        i5 = ((iM3169 ^ i3) * 21133) ^ 1393267918;
                        i6 = -1443348477;
                    } else {
                        iM3169 = (C0773.m3169("ۢ᩻") + i4) * 35;
                        i5 = ((iM3169 ^ i3) * 1399) ^ (-1246881975);
                        i6 = -262009374;
                    }
                    break;
                case -428022862:
                case 1521804356:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩹")) * 37;
                        i5 = ((iM3169 ^ i4) * (-757)) ^ (-1069502838);
                        i6 = -918286083;
                    } else {
                        iM3169 = C0773.m3169("᩺ۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-3501)) ^ (-1591348944);
                        i6 = -2065553251;
                    }
                    break;
                case -386076350:
                case 1431210943:
                    AbstractC0116.m1242(identityHashMap, interfaceC22808, C1343.m4947(z2));
                    return z2;
                case -359986127:
                case 953335817:
                    AbstractC0116.m1242(identityHashMap, interfaceC22808, Boolean.FALSE);
                    z = interfaceC22808 instanceof C10938;
                    if (z) {
                        z2 = z;
                        iM3169 = (i3 - C0773.m3169("ۚܳ")) * (-67);
                        i5 = ((iM3169 ^ i4) * (-8371)) ^ 1206388080;
                        i6 = 1585207656;
                    } else {
                        iM3169 = C0773.m3169("֫ܽ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-915)) ^ 2083605644;
                        i6 = -490942269;
                    }
                    break;
                case -44616241:
                case 1105978337:
                    C1519.m5403();
                    C2288.m7767();
                    iM3169 = (i3 - C0619.m2761("᩵᩹")) * 37;
                    i5 = ((iM3169 ^ i4) * (-757)) ^ (-1069502838);
                    i6 = -918286083;
                    break;
                case 117826333:
                case 1890221888:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ܺۨ") ^ i3) * (-89);
                        i5 = ((iM3169 ^ i4) * (-28863)) ^ (-569609507);
                        i6 = 811945625;
                    } else {
                        iM3169 = (C0773.m3169("ܰۜ") + i3) * (-11);
                        i5 = ((iM3169 ^ i4) * (-30045)) ^ 132919856;
                        i6 = -1699110270;
                    }
                    break;
                case 419938580:
                case 499829597:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩹")) * 37;
                        i5 = ((iM3169 ^ i4) * (-757)) ^ (-1069502838);
                        i6 = -918286083;
                    } else {
                        iM3169 = (C0773.m3169("ᩴۡ") + i4) * 29;
                        i5 = ((iM3169 ^ i3) * (-19309)) ^ (-1421529646);
                        i6 = 2112839780;
                    }
                    break;
                case 667492324:
                case 1010632307:
                    length = interfaceC22808Arr.length;
                    i = 0;
                    iM3169 = C0619.m2761("ۙܶ") ^ i4;
                    i5 = ((iM3169 ^ i3) * (-11773)) ^ (-649611763);
                    i6 = -321427177;
                    break;
                case 1374880586:
                case 1459376182:
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0773.m3169("ܽ᩸") ^ i3) * 93;
                        i5 = ((iM3169 ^ i4) * 18337) ^ (-1586904293);
                        i6 = -181826922;
                    } else {
                        iM3169 = (C0773.m3169("ۘۗ") + i4) * (-79);
                        i5 = ((iM3169 ^ i3) * (-18395)) ^ (-491195559);
                        i6 = 2096588531;
                    }
                    break;
                case 1638637600:
                case 2039189002:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩹")) * 37;
                        i5 = ((iM3169 ^ i4) * (-757)) ^ (-1069502838);
                        i6 = -918286083;
                    } else {
                        iM3169 = C0619.m2761("᩻۬") ^ i4;
                        i5 = ((iM3169 ^ i3) * 17395) ^ 168693565;
                        i6 = 1813788785;
                    }
                    break;
                default:
                    if (identityHashMap.containsKey(interfaceC22808)) {
                        iM3169 = (C0773.m3169("ܶ᩺") ^ i3) * (-3);
                        i5 = ((iM3169 ^ i4) * (-8343)) ^ 339368359;
                        i6 = -1779392356;
                    } else {
                        iM3169 = C0773.m3169("֨᩹") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-8661)) ^ (-1588519151);
                        i6 = 36788814;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44346(Throwable th) throws IOException {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 495402282;
        int i5 = AbstractC0116.f1064;
        int i6 = RunnableC0334.f1808;
        int iM3169 = C0773.m3169("ۢ֨") ^ i5;
        int i7 = ((iM3169 ^ i6) * (-22217)) ^ 795982427;
        int i8 = -867568828;
        while (true) {
            i4 = ((((i4 ^ i6) * 17409) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2108354991:
                case 433300368:
                    i2 = 3367225 + i;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i5 - C0619.m2761("᩶᩺")) * 97;
                        i7 = ((iM3169 ^ i6) * 25123) ^ 1167741126;
                        i8 = 1671083368;
                    } else {
                        iM3169 = (C0619.m2761("ۜۖ") ^ i5) * (-125);
                        i7 = ((iM3169 ^ i6) * 28279) ^ (-879248899);
                        i8 = 8495987;
                    }
                    break;
                case -2027951261:
                case -21683543:
                    if (th instanceof IOException) {
                        iM3169 = (C0773.m3169("ᩳ᩺") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM3169 ^ i5) * (-20661)) ^ (-754403032);
                        i8 = 272392380;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩶᩸")) * (-69);
                        i7 = ((iM3169 ^ i6) * (-17779)) ^ (-855480272);
                        i8 = -1527503337;
                    }
                    break;
                case -1950590260:
                case 1909431051:
                    C1343.m4943();
                    if (C1783.f6087 <= 0) {
                        iM3169 = (i5 - C0773.m3169("᩵֡")) * (-119);
                        i7 = ((iM3169 ^ i6) * 16211) ^ 710015437;
                        i8 = -1327797313;
                    } else {
                        iM3169 = C0773.m3169("᩻ۢ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15053) ^ 1285033013;
                        i8 = 1481553887;
                    }
                    break;
                case -1669301549:
                case -303563120:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("ۜܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27799) ^ (-119525721);
                        i8 = 852895176;
                    } else {
                        iM3169 = (C0773.m3169("ۘۙ") + i6) * (-15);
                        i7 = ((iM3169 ^ i5) * 22489) ^ 259483979;
                        i8 = -1468225573;
                    }
                    break;
                case -1492015362:
                case -512314850:
                    short[] sArr2 = f61940;
                    if (C1564.f5401 > 0) {
                        if (C2354.m7983()) {
                            throw new IOException(RunnableC3646.m11809(sArr2, 986, 40, i3), th);
                        }
                        iM3169 = (C0773.m3169("ۘۙ") + i6) * (-15);
                        i7 = ((iM3169 ^ i5) * 22489) ^ 259483979;
                        i8 = -1468225573;
                    } else {
                        iM3169 = C0773.m3169("᩻ۢ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15053) ^ 1285033013;
                        i8 = 1481553887;
                    }
                    break;
                case -1479769905:
                case 340030703:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("᩻ۢ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 15053) ^ 1285033013;
                        i8 = 1481553887;
                    } else {
                        iM3169 = C0773.m3169("ۜܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27799) ^ (-119525721);
                        i8 = 852895176;
                    }
                    break;
                case -1452645271:
                case 1462461807:
                    if ((s * s2) - i2 <= 0) {
                        iM3169 = (i6 - C0773.m3169("᩹ܽ")) * 11;
                        i7 = ((iM3169 ^ i5) * (-20143)) ^ (-765430779);
                        i8 = -76586889;
                    } else {
                        iM3169 = C0619.m2761("۠᩸") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11047) ^ 2082796521;
                        i8 = 2011397189;
                    }
                    break;
                case -1305734706:
                case -1141008022:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("ۘۙ") + i6) * (-15);
                        i7 = ((iM3169 ^ i5) * 22489) ^ 259483979;
                        i8 = -1468225573;
                    } else {
                        iM3169 = C0773.m3169("ܽܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-10175)) ^ 97731045;
                        i8 = -976751327;
                    }
                    break;
                case -1141048392:
                case -260510600:
                    if (C2485.f7950 != 0) {
                        iM3169 = (i5 - C0619.m2761("᩶᩺")) * 97;
                        i7 = ((iM3169 ^ i6) * 25123) ^ 1167741126;
                        i8 = 1671083368;
                    } else {
                        iM3169 = (C0773.m3169("᩸۟") + i6) * (-95);
                        i7 = ((iM3169 ^ i5) * 16895) ^ (-519580841);
                        i8 = -1302977018;
                    }
                    break;
                case -1092926480:
                case 1534323473:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i5 - C0619.m2761("᩶᩺")) * 97;
                        i7 = ((iM3169 ^ i6) * 25123) ^ 1167741126;
                        i8 = 1671083368;
                    } else {
                        iM3169 = C0773.m3169("ۚ۟") ^ i5;
                        i7 = ((iM3169 ^ i6) * 10681) ^ (-1059897975);
                        i8 = 10327989;
                    }
                    break;
                case -933767682:
                case 1309921670:
                    sArr = f61940;
                    if (C2354.m7983()) {
                        iM3169 = (i5 - C0619.m2761("ᩴܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM3169 ^ i6) * 13497) ^ (-1087992111);
                        i8 = 208133688;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩵֡")) * (-119);
                        i7 = ((iM3169 ^ i6) * 16211) ^ 710015437;
                        i8 = -1327797313;
                    }
                    break;
                case -844165819:
                case 1945988705:
                    i3 = 49569;
                    iM3169 = (C0619.m2761("ܽ۬") ^ i5) * (-87);
                    i7 = ((iM3169 ^ i6) * (-21341)) ^ 292256422;
                    i8 = 1735521730;
                    break;
                case -781281669:
                case -613664244:
                    s = sArr[c];
                    i = s * s;
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("᩷᩻") + i5) * (-113);
                        i7 = ((iM3169 ^ i6) * (-18365)) ^ 168919820;
                        i8 = 890212080;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩶᩺")) * 97;
                        i7 = ((iM3169 ^ i6) * 25123) ^ 1167741126;
                        i8 = 1671083368;
                    }
                    break;
                case -755442853:
                case -132562700:
                    throw ((Error) th);
                case -424569308:
                case 1081995401:
                    if (th instanceof RuntimeException) {
                        iM3169 = C0773.m3169("ܶ᩷") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-1911)) ^ 1354653580;
                        i8 = 1205147606;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩵") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM3169 ^ i6) * 28643) ^ 1435473126;
                        i8 = -1627180981;
                    }
                    break;
                case -37309919:
                case 1425923111:
                    s2 = 3670;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۘۙ") + i6) * (-15);
                        i7 = ((iM3169 ^ i5) * 22489) ^ 259483979;
                        i8 = -1468225573;
                    } else {
                        iM3169 = C0619.m2761("᩹᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * 11535) ^ (-1850994981);
                        i8 = -1663642234;
                    }
                    break;
                case 75739468:
                case 231041475:
                    c = 985;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i5 - C0619.m2761("᩶᩺")) * 97;
                        i7 = ((iM3169 ^ i6) * 25123) ^ 1167741126;
                        i8 = 1671083368;
                    } else {
                        iM3169 = C0619.m2761("ۨۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 10571) ^ 2101218184;
                        i8 = -456018854;
                    }
                    break;
                case 663843421:
                case 1986948560:
                    if (th instanceof Error) {
                        iM3169 = C0619.m2761("۫ۙ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-12801)) ^ 437759084;
                        i8 = -844733579;
                    } else {
                        iM3169 = (i6 - C0619.m2761("᩻ۜ")) * 23;
                        i7 = ((iM3169 ^ i5) * 14861) ^ 392938246;
                        i8 = 1961107644;
                    }
                    break;
                case 919077792:
                case 1140134790:
                    C17202.m40372();
                    return;
                case 1500642172:
                case 1755129134:
                    throw ((IOException) th);
                case 1563861654:
                case 1919554328:
                    throw ((RuntimeException) th);
                case 1588219590:
                case 1844605655:
                    C0487.m2356();
                    iM3169 = C0773.m3169("ۜܰ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 27799) ^ (-119525721);
                    i8 = 852895176;
                    break;
                default:
                    i3 = 43441;
                    iM3169 = (C0619.m2761("ܽ۬") ^ i5) * (-87);
                    i7 = ((iM3169 ^ i6) * (-21341)) ^ 292256422;
                    i8 = 1735521730;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0473 A[PHI: r7 r29 r34 r43
      0x0473: PHI (r7v8 long) = (r7v2 long), (r7v2 long), (r7v9 long) binds: [B:112:0x0471, B:108:0x0453, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r29v5 long) = (r29v1 long), (r29v1 long), (r29v6 long) binds: [B:112:0x0471, B:108:0x0453, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r34v48 int) = (r34v19 int), (r34v20 int), (r34v49 int) binds: [B:112:0x0471, B:108:0x0453, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0473: PHI (r43v33 long) = (r43v15 long), (r43v16 long), (r43v34 long) binds: [B:112:0x0471, B:108:0x0453, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a2 A[PHI: r43
      0x02a2: PHI (r43v25 long) = (r43v24 long), (r43v26 long) binds: [B:72:0x028a, B:69:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        if (l.C2023.f6737 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (l.C1321.m4852() != false) goto L28;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m44281(int r55, int r56, int r57, int[] r58) {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44281(int, int, int, int[]):long");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01d3 A[PHI: r7 r11 r13 r15
      0x01d3: PHI (r7v4 java.util.Iterator) = 
      (r7v2 java.util.Iterator)
      (r7v3 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
      (r7v2 java.util.Iterator)
     binds: [B:103:0x01d3, B:55:0x01cc, B:28:0x00b1, B:24:0x008f, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r11v4 long) = (r11v3 long), (r11v2 long), (r11v2 long), (r11v2 long), (r11v2 long) binds: [B:103:0x01d3, B:55:0x01cc, B:28:0x00b1, B:24:0x008f, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r13v4 long) = (r13v3 long), (r13v2 long), (r13v2 long), (r13v2 long), (r13v2 long) binds: [B:103:0x01d3, B:55:0x01cc, B:28:0x00b1, B:24:0x008f, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x01d3: PHI (r15v4 long) = (r15v2 long), (r15v3 long), (r15v2 long), (r15v2 long), (r15v5 long) binds: [B:103:0x01d3, B:55:0x01cc, B:28:0x00b1, B:24:0x008f, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f4 A[PHI: r6
      0x01f4: PHI (r6v4 java.util.IdentityHashMap) = 
      (r6v3 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
      (r6v2 java.util.IdentityHashMap)
     binds: [B:58:0x01f2, B:19:0x0076, B:16:0x005a, B:13:0x0054, B:7:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02d0 A[PHI: r2
      0x02d0: PHI (r2v3 long) = (r2v2 long), (r2v4 long) binds: [B:78:0x02b6, B:74:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02f0 A[PHI: r4
      0x02f0: PHI (r4v4 java.util.IdentityHashMap) = 
      (r4v2 java.util.IdentityHashMap)
      (r4v3 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
      (r4v2 java.util.IdentityHashMap)
     binds: [B:83:0x02ee, B:70:0x0279, B:16:0x005a, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0353 A[PHI: r8 r9
      0x0353: PHI (r8v5 l.ۛܳܳ) = (r8v2 l.ۛܳܳ), (r8v4 l.ۛܳܳ), (r8v2 l.ۛܳܳ), (r8v2 l.ۛܳܳ) binds: [B:91:0x0351, B:44:0x0148, B:40:0x0121, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r9v4 java.lang.Object) = (r9v2 java.lang.Object), (r9v2 java.lang.Object), (r9v3 java.lang.Object), (r9v2 java.lang.Object) binds: [B:91:0x0351, B:44:0x0148, B:40:0x0121, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13856 m44343(C13856 c13856, long j, C25111 c25111) {
        int iM2761;
        int i;
        int i2;
        long j2 = 0;
        IdentityHashMap identityHashMap = null;
        IdentityHashMap identityHashMap2 = null;
        Iterator itM4942 = null;
        C6465 c6465 = null;
        Object obj = null;
        Long l2 = null;
        long jLongValue = 0;
        long jMo8834 = 0;
        long j3 = 0;
        int i3 = 294143141;
        int i4 = C2354.f7599;
        int i5 = C1146.f4234;
        int iM3169 = (C0773.m3169("ۧۛ") + i5) * (-49);
        int i6 = ((iM3169 ^ i4) * (-22331)) ^ (-2065604160);
        int i7 = iM3169 ^ (-1168456461);
        C13856 c13856M44344 = null;
        while (true) {
            ArrayList arrayList = null;
            while (true) {
                i3 = i7 ^ (i6 & (((i3 ^ i4) * 23835) >> 31));
                switch (i3) {
                    case -2130994740:
                    case 1759651616:
                        if (jLongValue > 65536 - j3) {
                            iM2761 = (i4 - C0773.m3169("᩻᩸")) * 27;
                            i = ((iM2761 ^ i5) * (-19821)) ^ (-1783326073);
                            i2 = -982696058;
                        } else {
                            iM2761 = (C0619.m2761("᩺ܰ") ^ i5) * 71;
                            i = ((iM2761 ^ i4) * (-27655)) ^ 1222290108;
                            i2 = -494611504;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -2101315079:
                    case -587656517:
                        if (C1321.f4751 >= 0) {
                            iM2761 = (C0619.m2761("ۤ۬") ^ i4) * 61;
                            i = ((iM2761 ^ i5) * 6905) ^ 754351929;
                            i2 = 745970290;
                        } else {
                            iM2761 = (C0619.m2761("ۤᩳ") + i4) * (-11);
                            i = ((iM2761 ^ i5) * 20697) ^ 346807348;
                            i2 = 86362929;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1923164929:
                    case 1709666556:
                        identityHashMap2 = new IdentityHashMap();
                        if (C2702.f8586 <= 0) {
                            iM2761 = (C0773.m3169("ܺܰ") + i5) * 75;
                            i = ((iM2761 ^ i4) * (-30707)) ^ 1429208995;
                            i2 = 269556285;
                        } else {
                            iM2761 = (C0619.m2761("۟۬") ^ i5) * 71;
                            i = ((iM2761 ^ i4) * (-12613)) ^ (-1235096907);
                            i2 = 230152979;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1905699911:
                    case -55927577:
                        if (C3998.m12923(itM4942)) {
                            iM2761 = (C0619.m2761("ۘܳ") ^ i5) * (-23);
                            i = ((iM2761 ^ i4) * (-18421)) ^ 626471730;
                            i2 = 97832426;
                        } else {
                            iM2761 = C0773.m3169("ۙ۠") ^ i4;
                            i = ((iM2761 ^ i5) * (-8959)) ^ (-1339013274);
                            i2 = 2132550880;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1868438331:
                    case -1472987246:
                        j2 = 1048576;
                        if (j < 1048576) {
                            c13856M44344 = c13856;
                            iM2761 = (C0619.m2761("ۤ۠") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i = ((iM2761 ^ i5) * 4943) ^ 1305144609;
                            i2 = -1678370817;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ܽܺ")) * (-65);
                            i = ((iM2761 ^ i5) * 7017) ^ (-1120108099);
                            i2 = -809059422;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1742808337:
                    case 670177077:
                        identityHashMap = new IdentityHashMap();
                        if (AbstractC0116.m1243() != 0) {
                            iM2761 = (C0773.m3169("۬᩻") ^ i5) * (-79);
                            i = ((iM2761 ^ i4) * (-2357)) ^ 515425538;
                            i2 = -1883522284;
                        } else {
                            iM2761 = (C0773.m3169("᩺ۧ") ^ i4) * (-123);
                            i = ((iM2761 ^ i5) * (-19903)) ^ (-148672863);
                            i2 = 987589805;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1702121444:
                    case -812287026:
                        if (C1321.f4751 < 0) {
                            ArrayList arrayList2 = new ArrayList();
                            m44348(c13856, identityHashMap, arrayList2);
                            if (C3734.m12152() >= 0) {
                                arrayList = arrayList2;
                                iM2761 = (C0619.m2761("᩹ۗ") ^ i5) * 43;
                                i = ((iM2761 ^ i4) * 9643) ^ (-267996757);
                                i2 = -768418638;
                                i7 = iM2761 ^ i2;
                                i6 = i;
                            } else {
                                int iM2762 = C0619.m2761("۠᩺") ^ i5;
                                i6 = ((iM2762 ^ i4) * (-5583)) ^ 128069003;
                                arrayList = arrayList2;
                                i7 = iM2762 ^ (-711016092);
                            }
                        }
                        break;
                    case -1603143429:
                    case 2050925008:
                        if (AbstractC0641.f2496 < 0) {
                            iM2761 = (C0773.m3169("ܺܰ") + i5) * 75;
                            i = ((iM2761 ^ i4) * (-30707)) ^ 1429208995;
                            i2 = 269556285;
                        } else {
                            iM2761 = (C0773.m3169("۬᩻") ^ i5) * (-79);
                            i = ((iM2761 ^ i4) * (-2357)) ^ 515425538;
                            i2 = -1883522284;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1547477675:
                    case -840605586:
                        C20932.m47848();
                        return null;
                    case -1545284551:
                    case -396648182:
                        c13856M44344 = m44344(c13856, identityHashMap2, c25111);
                        iM2761 = (C0619.m2761("ۤ۠") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i5) * 4943) ^ 1305144609;
                        i2 = -1678370817;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1529259268:
                    case 1096882739:
                        if (jLongValue <= jMo8834 / 4) {
                            iM2761 = (C0619.m2761("ᩳ֨") + i4) * (-119);
                            i = ((iM2761 ^ i5) * (-5505)) ^ 1854159709;
                            i2 = -1992691987;
                        } else {
                            iM2761 = (i4 - C0773.m3169("᩻᩸")) * 27;
                            i = ((iM2761 ^ i5) * (-19821)) ^ (-1783326073);
                            i2 = -982696058;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1404547821:
                    case 1246400320:
                        return c13856M44344;
                    case -1285208913:
                    case 1528949833:
                        l2 = (Long) obj;
                        if (RunnableC1848.f6235) {
                            iM2761 = (C0619.m2761("᩹ۗ") ^ i5) * 43;
                            i = ((iM2761 ^ i4) * 9643) ^ (-267996757);
                            i2 = -768418638;
                        } else {
                            iM2761 = C0773.m3169("ۜܿ") ^ i4;
                            i = ((iM2761 ^ i5) * (-28071)) ^ (-464246595);
                            i2 = 2139719800;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1069630820:
                    case 326538620:
                        AbstractC0116.m1242(identityHashMap2, c6465, Boolean.TRUE);
                        j3 += jLongValue;
                        iM2761 = (i4 - C0773.m3169("᩻᩸")) * 27;
                        i = ((iM2761 ^ i5) * (-19821)) ^ (-1783326073);
                        i2 = -982696058;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -823096038:
                    case 1177951215:
                        if (C0773.f2792 > 0) {
                            iM2761 = C0773.m3169("᩵ۙ") ^ i5;
                            i = ((iM2761 ^ i4) * 11547) ^ 1340646433;
                            i2 = -715701137;
                            i7 = iM2761 ^ i2;
                            i6 = i;
                        }
                        break;
                    case -676123724:
                    case -368362888:
                        if (c13856 != null) {
                            iM2761 = (C0619.m2761("֫᩵") + i5) * 43;
                            i = ((iM2761 ^ i4) * (-3017)) ^ (-1675770565);
                            i2 = 213336310;
                        } else {
                            c13856M44344 = c13856;
                            iM2761 = (C0619.m2761("ۤ۠") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i = ((iM2761 ^ i5) * 4943) ^ 1305144609;
                            i2 = -1678370817;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -437765662:
                    case 549570795:
                        c6465 = (C6465) C0950.m3796(itM4942);
                        if (C0773.m3161() != 0) {
                            iM2761 = (C0619.m2761("ۤ۬") ^ i4) * 61;
                            i = ((iM2761 ^ i5) * 6905) ^ 754351929;
                            i2 = 745970290;
                        } else {
                            iM2761 = C0773.m3169("᩷۫") ^ i4;
                            i = ((iM2761 ^ i5) * (-31979)) ^ (-1531012215);
                            i2 = 1984070117;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -433999071:
                    case -107932010:
                        obj = identityHashMap.get(c6465);
                        if (C4238.f15451 >= 0) {
                            iM2761 = (C0619.m2761("ۤ۬") ^ i4) * 61;
                            i = ((iM2761 ^ i5) * 6905) ^ 754351929;
                            i2 = 745970290;
                        } else {
                            iM2761 = (C0773.m3169("᩶ᩴ") + i5) * 15;
                            i = ((iM2761 ^ i4) * (-19223)) ^ 1919527862;
                            i2 = 208663305;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -277023145:
                    case -24085372:
                        if (identityHashMap2.isEmpty()) {
                            iM2761 = (i5 - C0619.m2761("ۛ᩹")) * (-61);
                            i = ((iM2761 ^ i4) * 28553) ^ 1979122450;
                            i2 = -1458678998;
                        } else {
                            iM2761 = (i5 - C0619.m2761("᩶᩵")) * 83;
                            i = ((iM2761 ^ i4) * 11833) ^ (-1267712238);
                            i2 = -1784535424;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -269919733:
                    case 624179199:
                        jLongValue = l2.longValue();
                        jMo8834 = c6465.mo8834();
                        if (jMo8834 >= j2) {
                            int iM2763 = C0619.m2761("᩵ۘ") ^ i4;
                            i6 = ((iM2763 ^ i5) * (-3397)) ^ (-454746332);
                            i7 = iM2763 ^ (-788387680);
                        } else {
                            iM2761 = (i4 - C0773.m3169("᩻᩸")) * 27;
                            i = ((iM2761 ^ i5) * (-19821)) ^ (-1783326073);
                            i2 = -982696058;
                            i7 = iM2761 ^ i2;
                            i6 = i;
                        }
                        break;
                    case -66847142:
                    case 1331197036:
                        j3 = 0;
                        itM4942 = C1343.m4942(arrayList);
                        iM2761 = (i4 - C0773.m3169("᩻᩸")) * 27;
                        i = ((iM2761 ^ i5) * (-19821)) ^ (-1783326073);
                        i2 = -982696058;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case -1976:
                    case 1514397478:
                        return c13856;
                    case 314069785:
                    case 1264868554:
                        if (C2834.m9344() >= 0) {
                        }
                        iM2761 = (C0773.m3169("ܺܰ") + i5) * 75;
                        i = ((iM2761 ^ i4) * (-30707)) ^ 1429208995;
                        i2 = 269556285;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case 544012223:
                    case 574458702:
                        C1321.m4852();
                        iM2761 = (C0773.m3169("ܺܰ") + i5) * 75;
                        i = ((iM2761 ^ i4) * (-30707)) ^ 1429208995;
                        i2 = 269556285;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case 756700314:
                    case 1697456489:
                        if (C2288.m7767()) {
                            iM2761 = (C0773.m3169("۬᩻") ^ i5) * (-79);
                            i = ((iM2761 ^ i4) * (-2357)) ^ 515425538;
                            i2 = -1883522284;
                        } else {
                            iM2761 = C0619.m2761("᩶ۡ") ^ i5;
                            i = ((iM2761 ^ i4) * 3291) ^ (-1911832689);
                            i2 = 1741246109;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    case 1614885281:
                    case 1992152934:
                        if (C1321.f4751 < 0) {
                            iM2761 = (C0773.m3169("۬᩻") ^ i5) * (-79);
                            i = ((iM2761 ^ i4) * (-2357)) ^ 515425538;
                            i2 = -1883522284;
                        } else {
                            iM2761 = (C0619.m2761("ۤ۬") ^ i4) * 61;
                            i = ((iM2761 ^ i5) * 6905) ^ 754351929;
                            i2 = 745970290;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                    default:
                        C1826.m6301();
                        if (C2834.m9344() < 0) {
                            iM2761 = (C0773.m3169("ܺܰ") + i5) * 75;
                            i = ((iM2761 ^ i4) * (-30707)) ^ 1429208995;
                            i2 = 269556285;
                        } else {
                            iM2761 = (C0773.m3169("ۘۙ") ^ i4) * 87;
                            i = ((iM2761 ^ i5) * 10433) ^ (-364908044);
                            i2 = 814446840;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                        break;
                }
            }
            int iM2764 = C0619.m2761("ܳۘ") ^ i4;
            i7 = iM2764 ^ 806426478;
            i6 = ((iM2764 ^ i5) * 23277) ^ 444016608;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171 A[PHI: r19
      0x0171: PHI (r19v3 long) = (r19v2 long), (r19v1 long) binds: [B:49:0x0157, B:42:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x018d A[PHI: r13
      0x018d: PHI (r13v2 long) = (r13v1 long), (r13v3 long) binds: [B:53:0x018b, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x026d  */
    /* JADX WARN: Code duplicated, block: B:80:0x029f A[PHI: r9 r11
      0x029f: PHI (r9v3 long) = (r9v1 long), (r9v1 long), (r9v1 long), (r9v2 long), (r9v1 long) binds: [B:79:0x029d, B:67:0x0220, B:57:0x01bd, B:26:0x0099, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r11v3 long) = (r11v1 long), (r11v1 long), (r11v1 long), (r11v2 long), (r11v1 long) binds: [B:79:0x029d, B:67:0x0220, B:57:0x01bd, B:26:0x0099, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m44282(int i, long j) {
        int iM3169;
        int i2;
        int i3;
        long j2 = 0;
        long jM9672 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i4 = -204671257;
        int i5 = C0950.f3488;
        int i6 = C3099.f10023;
        int iM2761 = (C0619.m2761("ۡܶ") + i6) * (-65);
        int i7 = ((iM2761 ^ i5) * (-3453)) ^ 911392990;
        int i8 = iM2761 ^ (-1044766225);
        long j6 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * (-7333)) >> 31));
            switch (i4) {
                case -2007231855:
                case -1761853179:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-7311)) ^ (-659505794);
                        i3 = -1201929519;
                    } else {
                        iM3169 = C0619.m2761("᩺ۡ") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-30609)) ^ (-875379640);
                        i3 = -1003016276;
                    }
                    int i9 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i9;
                    break;
                case -1870297507:
                case -1194627826:
                    j3 = i;
                    j4 = 16;
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-7311)) ^ (-659505794);
                        i3 = -1201929519;
                    } else {
                        iM3169 = C0619.m2761("᩸֨") ^ i5;
                        i2 = ((iM3169 ^ i6) * 11973) ^ (-1403655734);
                        i3 = 168339579;
                    }
                    int i10 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i10;
                    break;
                case -1782465233:
                case -1658846105:
                    j5 = j3 * j4;
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("ۢᩴ") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-17459)) ^ 1042031451;
                        i3 = -1060816502;
                    } else {
                        iM3169 = C0773.m3169("᩹ۚ") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-15391)) ^ (-647619248);
                        i3 = 1556818081;
                    }
                    int i11 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i11;
                    break;
                case -1752366760:
                case -762601060:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 15417) ^ (-228183030);
                        i3 = -1419178028;
                    } else {
                        iM3169 = C0773.m3169("ۙ۟") ^ i5;
                        i2 = ((iM3169 ^ i6) * (-5585)) ^ (-1087178464);
                        i3 = 527916955;
                    }
                    int i12 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i12;
                    break;
                case -1734923042:
                case -984227683:
                    C2310.m7813();
                    if (C2419.m8174() < 0) {
                        iM3169 = C0773.m3169("ܿۖ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 5185) ^ 1425257940;
                        i3 = -440533769;
                    } else {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 8231) ^ (-1020619671);
                        i3 = -450290545;
                    }
                    int i13 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i13;
                    break;
                case -1562356634:
                case -1362141827:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ܿۖ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 5185) ^ 1425257940;
                        i3 = -440533769;
                    } else {
                        iM3169 = (C0619.m2761("۫ۤ") + i5) * 85;
                        i2 = ((iM3169 ^ i6) * 27861) ^ (-1668613537);
                        i3 = -481690955;
                    }
                    int i14 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i14;
                    break;
                case -1542811728:
                case 81679296:
                    if (i > 0) {
                        iM3169 = C0773.m3169("ܿ۬") ^ i6;
                        i2 = ((iM3169 ^ i5) * 29213) ^ 1736924799;
                        i3 = -1333156900;
                    } else {
                        jM9672 = j2;
                        iM3169 = (C0619.m2761("֡ܰ") + i5) * 19;
                        i2 = ((iM3169 ^ i6) * 19929) ^ 866028137;
                        i3 = 1613779295;
                    }
                    int i15 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i15;
                    break;
                case -1415365206:
                case 1208253336:
                    return j6;
                case -1300974664:
                case -1014676760:
                    if (j == j6) {
                        iM3169 = C0619.m2761("᩹᩸") ^ i6;
                        i2 = ((iM3169 ^ i5) * 27079) ^ (-2093893503);
                        i3 = -202209229;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩶᩺")) * (-61);
                        i2 = ((iM3169 ^ i5) * (-8547)) ^ 1545055842;
                        i3 = -1623840308;
                    }
                    int i16 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i16;
                    break;
                case -1239015350:
                case -214226579:
                    C2375.m8065();
                    C3779.m12264();
                    iM3169 = C0773.m3169("ܿۖ") ^ i5;
                    i2 = ((iM3169 ^ i6) * 5185) ^ 1425257940;
                    i3 = -440533769;
                    int i17 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i17;
                    break;
                case -979862335:
                case -968153880:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 15417) ^ (-228183030);
                        i3 = -1419178028;
                    } else {
                        iM3169 = C0619.m2761("۫ۡ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 9903) ^ 1650085689;
                        i3 = -882645920;
                    }
                    int i18 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i18;
                    break;
                case -782697750:
                case 1781676810:
                    j2 = C25227.FOREVER_NS;
                    if (j < j6) {
                        iM3169 = C0773.m3169("ᩳ᩶") ^ i5;
                        i2 = ((iM3169 ^ i6) * 17325) ^ (-1312439397);
                        i3 = 1244959697;
                    } else {
                        iM3169 = C0619.m2761("ᩴۤ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 5611) ^ (-558466322);
                        i3 = -61124666;
                    }
                    int i19 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i19;
                    break;
                case -634594088:
                case 1484386334:
                    return C3077.m10044(jM9672, j);
                case -628165785:
                case 1548267290:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-7311)) ^ (-659505794);
                        i3 = -1201929519;
                    } else {
                        iM3169 = C0773.m3169("ܳܽ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 31631) ^ 380364034;
                        i3 = 1838005423;
                    }
                    int i110 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i110;
                    break;
                case -585348194:
                case 1081971920:
                    return j2;
                case -535951015:
                case -177359549:
                    C0773.m3161();
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ܿۖ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 5185) ^ 1425257940;
                        i3 = -440533769;
                    } else {
                        iM3169 = C0773.m3169("ۢۡ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 15417) ^ (-228183030);
                        i3 = -1419178028;
                    }
                    int i111 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i111;
                    break;
                case -388251945:
                case 803258819:
                    if (i > 1048576) {
                        jM9672 = j2;
                        iM3169 = (C0619.m2761("֡ܰ") + i5) * 19;
                        i2 = ((iM3169 ^ i6) * 19929) ^ 866028137;
                        i3 = 1613779295;
                    } else {
                        iM3169 = C0619.m2761("᩺ۙ") ^ i5;
                        i2 = ((iM3169 ^ i6) * (-21051)) ^ (-695203942);
                        i3 = 803455165;
                    }
                    int i112 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i112;
                    break;
                case -297948867:
                case 77261222:
                    jM9672 = C2966.m9672(32L, j5);
                    iM3169 = (C0619.m2761("֡ܰ") + i5) * 19;
                    i2 = ((iM3169 ^ i6) * 19929) ^ 866028137;
                    i3 = 1613779295;
                    int i113 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i113;
                    break;
                case 95845826:
                case 1963808070:
                    j6 = 0;
                    if (i == 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") + i5) * 119;
                        i2 = ((iM3169 ^ i6) * (-2833)) ^ (-943392025);
                        i3 = -189272953;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩶᩺")) * (-61);
                        i2 = ((iM3169 ^ i5) * (-8547)) ^ 1545055842;
                        i3 = -1623840308;
                    }
                    int i114 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i114;
                    break;
                case 179109733:
                case 1922469292:
                    RunnableC3055.m9933();
                    return 0L;
                case 903848003:
                case 1778025473:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۢᩴ") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-17459)) ^ 1042031451;
                        i3 = -1060816502;
                    } else {
                        iM3169 = C0773.m3169("ۛ۫") ^ i5;
                        i2 = ((iM3169 ^ i6) * 18269) ^ 1368287414;
                        i3 = -500819942;
                    }
                    int i115 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i115;
                    break;
                case 1393314730:
                case 1498734799:
                    if (C0862.m3503()) {
                        iM3169 = C0773.m3169("ۜۛ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 21741) ^ 137239850;
                        i3 = -157451132;
                    } else {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-7311)) ^ (-659505794);
                        i3 = -1201929519;
                    }
                    int i116 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i116;
                    break;
                case 1470442284:
                case 1912713567:
                    C0773.m3161();
                    if (C0950.f3488 < 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 15417) ^ (-228183030);
                        i3 = -1419178028;
                    } else {
                        iM3169 = C0619.m2761("۬᩺") ^ i6;
                        i2 = ((iM3169 ^ i5) * (-7311)) ^ (-659505794);
                        i3 = -1201929519;
                    }
                    int i117 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i117;
                    break;
                default:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩺ܶ") ^ i5;
                        i2 = ((iM3169 ^ i6) * 8231) ^ (-1020619671);
                        i3 = -450290545;
                    } else {
                        iM3169 = C0619.m2761("ܽܿ") ^ i6;
                        i2 = ((iM3169 ^ i5) * 6783) ^ 1186566353;
                        i3 = -1647681051;
                    }
                    int i118 = i2;
                    i8 = iM3169 ^ i3;
                    i7 = i118;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0280 A[PHI: r15 r16
      0x0280: PHI (r15v4 l.ۤܳܳ) = (r15v3 l.ۤܳܳ), (r15v1 l.ۤܳܳ) binds: [B:74:0x027e, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r16v3 java.lang.Object) = (r16v2 java.lang.Object), (r16v1 java.lang.Object) binds: [B:74:0x027e, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        if (l.C0487.f2131 > 0) goto L36;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13856 m44291(l.C13856 r38, long r39, l.C25111 r41) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44291(l.۬۫ܳ, long, l.᩻ܳܳ):l.۬۫ܳ");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static l.C17037 m44296(java.io.DataInput r67, int r68, l.C19275 r69) {
        /*
            Method dump skipped, instruction units count: 3452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44296(java.io.DataInput, int, l.ᩳᩴܳ):l.ܺᩴܳ");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fc A[PHI: r8 r9 r16
      0x00fc: PHI (r8v4 l.۠۫ܳ) = (r8v3 l.۠۫ܳ), (r8v2 l.۠۫ܳ), (r8v2 l.۠۫ܳ) binds: [B:35:0x00e3, B:30:0x00d3, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r9v4 l.᩸۫ܳ) = (r9v3 l.᩸۫ܳ), (r9v2 l.᩸۫ܳ), (r9v2 l.᩸۫ܳ) binds: [B:35:0x00e3, B:30:0x00d3, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r16v26 int) = (r16v14 int), (r16v16 int), (r16v29 int) binds: [B:35:0x00e3, B:30:0x00d3, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0135 A[PHI: r6 r7 r16
      0x0135: PHI (r6v4 l.۬۫ܳ) = (r6v3 l.۬۫ܳ), (r6v2 l.۬۫ܳ) binds: [B:39:0x011e, B:30:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r7v4 l.۬۫ܳ) = (r7v3 l.۬۫ܳ), (r7v2 l.۬۫ܳ) binds: [B:39:0x011e, B:30:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r16v15 int) = (r16v13 int), (r16v16 int) binds: [B:39:0x011e, B:30:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x021e A[PHI: r10 r11 r12 r16
      0x021e: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:67:0x021c, B:59:0x01e0, B:24:0x00a2, B:16:0x0081, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r11v4 byte[]) = (r11v2 byte[]), (r11v2 byte[]), (r11v3 byte[]), (r11v2 byte[]), (r11v2 byte[]) binds: [B:67:0x021c, B:59:0x01e0, B:24:0x00a2, B:16:0x0081, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:67:0x021c, B:59:0x01e0, B:24:0x00a2, B:16:0x0081, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r16v20 int) = (r16v5 int), (r16v7 int), (r16v17 int), (r16v19 int), (r16v22 int) binds: [B:67:0x021c, B:59:0x01e0, B:24:0x00a2, B:16:0x0081, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0253 A[PHI: r16
      0x0253: PHI (r16v10 int) = (r16v4 int), (r16v11 int) binds: [B:71:0x0251, B:47:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0284 A[PHI: r16
      0x0284: PHI (r16v21 int) = (r16v3 int), (r16v8 int), (r16v9 int), (r16v22 int) binds: [B:75:0x0282, B:55:0x01c3, B:51:0x01a4, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02b4 A[PHI: r16
      0x02b4: PHI (r16v23 int) = (r16v2 int), (r16v6 int), (r16v18 int), (r16v19 int), (r16v25 int) binds: [B:79:0x02b2, B:63:0x01ff, B:18:0x0085, B:16:0x0081, B:10:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13856 m44344(C13856 c13856, IdentityHashMap identityHashMap, C25111 c25111) {
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4 = C3492.f12043;
        int i5 = C20932.f66974;
        int iM31610 = C0773.m3169("ۚ᩻") ^ i5;
        int i6 = ((iM31610 ^ i4) * (-14299)) ^ (-632428750);
        InterfaceC22808 interfaceC22808 = null;
        byte[] bArr = null;
        int i7 = iM31610 ^ 1567033858;
        int i8 = 0;
        int i9 = 0;
        int i10 = 2055514181;
        C8636 c8636 = null;
        C13856 c13856M44344 = null;
        C13856 c13856M44345 = null;
        C13856 c13857 = null;
        C13856 c13858 = null;
        while (true) {
            int i11 = i7 ^ (i6 & (((i10 ^ i4) * (-24107)) >> 31));
            switch (i11) {
                case -2128856277:
                case 1135436839:
                    i = i11;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("֡۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * 28405) ^ (-1758403376);
                        i3 = 1389900674;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩵") ^ i5) * (-27);
                        i2 = ((iM3169 ^ i4) * (-22489)) ^ 1801905946;
                        i3 = 896558650;
                    }
                    int i12 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i12;
                    break;
                case -2088360526:
                case -757963269:
                    i = i11;
                    C20932.m47848();
                    if (C0773.f2792 <= 0) {
                        iM3169 = (i4 - C0773.m3169("᩻ۡ")) * (-13);
                        i2 = ((iM3169 ^ i5) * (-23245)) ^ 1909961873;
                        i3 = -915860076;
                    } else {
                        iM3169 = C0773.m3169("֡۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * 28405) ^ (-1758403376);
                        i3 = 1389900674;
                    }
                    int i13 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i13;
                    break;
                case -2083280312:
                case 1933031762:
                    i = i11;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i5) * 43;
                        i2 = ((iM3169 ^ i4) * 28975) ^ (-1885334390);
                        i3 = 2096434704;
                    } else {
                        iM3169 = C0773.m3169("ܽۘ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-31083)) ^ 444858116;
                        i3 = 2037427401;
                    }
                    int i14 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i14;
                    break;
                case -1856410112:
                case 370515988:
                    i = i11;
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ܿ۟") + i5) * (-121);
                        i2 = ((iM3169 ^ i4) * 10797) ^ (-2125674852);
                        i3 = 255314100;
                    } else {
                        iM3169 = C0773.m3169("֡۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * 28405) ^ (-1758403376);
                        i3 = 1389900674;
                    }
                    int i15 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i15;
                    break;
                case -1723915297:
                case 1875204385:
                    i = i11;
                    c13856M44345 = m44344(c13857, identityHashMap, c25111);
                    c13856M44344 = m44344(c13858, identityHashMap, c25111);
                    if (c13856M44345 == c13857) {
                        iM3169 = C0619.m2761("ܿۡ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-9725)) ^ (-227453835);
                        i3 = 2050158583;
                    } else {
                        iM3169 = C0619.m2761("۠ܰ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 27803) ^ (-1476915037);
                        i3 = -19382689;
                    }
                    int i16 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i16;
                    break;
                case -1633397759:
                case -1489051173:
                    i = i11;
                    if (C11235.f35427 >= 0) {
                        iM3169 = (i4 - C0773.m3169("᩻ۡ")) * (-13);
                        i2 = ((iM3169 ^ i5) * (-23245)) ^ 1909961873;
                        i3 = -915860076;
                    } else {
                        iM3169 = (C0619.m2761("ۚۖ") + i4) * 65;
                        i2 = ((iM3169 ^ i5) * (-29693)) ^ (-64616870);
                        i3 = 1659027479;
                    }
                    int i17 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i17;
                    break;
                case -1581617111:
                case -873462505:
                    i = i11;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۙ۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-23339)) ^ 1738275762;
                        i3 = 54504434;
                    } else {
                        iM3169 = (C0773.m3169("᩺۟") ^ i5) * 69;
                        i2 = ((iM3169 ^ i4) * 5959) ^ 357481669;
                        i3 = 758277755;
                    }
                    int i18 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i18;
                    break;
                case -1504505207:
                case 1231862819:
                    i = i11;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ۙ۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-23339)) ^ 1738275762;
                        i3 = 54504434;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۫ۜ")) * (-115);
                        i2 = ((iM3169 ^ i5) * (-22421)) ^ (-631784671);
                        i3 = 1905625593;
                    }
                    int i19 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i19;
                    break;
                case -1488572053:
                case 2120355098:
                    return c13856;
                case -1052645291:
                case 2007706726:
                    i = i11;
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i5) * 43;
                        i2 = ((iM3169 ^ i4) * 28975) ^ (-1885334390);
                        i3 = 2096434704;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۟֨")) * (-87);
                        i2 = ((iM3169 ^ i5) * (-6477)) ^ (-1692164021);
                        i3 = 560899892;
                    }
                    int i110 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i110;
                    break;
                case -1043283388:
                case 1688268555:
                    c8636.m23272(i9, bArr, i9, i8);
                    return c25111.m55980(i8, bArr);
                case -736875894:
                case 607126237:
                    return C19606.m45249(c13856M44345, c13856M44344);
                case -599762911:
                case 703838277:
                    if (C2310.f7472 >= 0) {
                        i = i11;
                        iM3169 = (C0619.m2761("ܿ۫") ^ i5) * 43;
                        i2 = ((iM3169 ^ i4) * 28975) ^ (-1885334390);
                        i3 = 2096434704;
                    } else {
                        iM3169 = C0619.m2761("۬֫") ^ i4;
                        i = i11;
                        i2 = ((iM3169 ^ i5) * 23141) ^ 2034500374;
                        i3 = -1054595827;
                    }
                    int i111 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i111;
                    break;
                case -528011396:
                case 550940964:
                    i = i11;
                    i8 = c8636.f28219;
                    bArr = new byte[i8];
                    i9 = 0;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i4 - C0773.m3169("᩻ۡ")) * (-13);
                        i2 = ((iM3169 ^ i5) * (-23245)) ^ 1909961873;
                        i3 = -915860076;
                    } else {
                        iM3169 = C0619.m2761("ᩴۖ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-3411)) ^ 582118105;
                        i3 = 2002077984;
                    }
                    int i112 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i112;
                    break;
                case -237313649:
                case 1287579795:
                    C2287.m7745();
                    return null;
                case -46962717:
                case 2014596717:
                    i = i11;
                    C1321.m4852();
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0619.m2761("ܿ۫") ^ i5) * 43;
                        i2 = ((iM3169 ^ i4) * 28975) ^ (-1885334390);
                        i3 = 2096434704;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩻ۡ")) * (-13);
                        i2 = ((iM3169 ^ i5) * (-23245)) ^ 1909961873;
                        i3 = -915860076;
                    }
                    int i113 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i113;
                    break;
                case 23657129:
                case 517623381:
                    i = i11;
                    c8636 = c13856.f43958;
                    interfaceC22808 = c8636.f28220;
                    if (interfaceC22808 instanceof C6465) {
                        iM3169 = (C0619.m2761("֨ۤ") ^ i4) * (-69);
                        i2 = ((iM3169 ^ i5) * (-11127)) ^ 1092979838;
                        i3 = -962487683;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩻ۜ")) * 101;
                        i2 = ((iM3169 ^ i4) * 13419) ^ 1530319086;
                        i3 = 1187166271;
                    }
                    int i114 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i114;
                    break;
                case 348307295:
                case 2031056097:
                    i = i11;
                    boolean zM4855 = C1321.m4855(c13856);
                    c13858 = c13856.f43955;
                    c13857 = c13856.f43960;
                    if (zM4855) {
                        iM3169 = C0773.m3169("ۢۨ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-17269)) ^ (-1726512750);
                        i3 = 220991194;
                    } else {
                        iM3169 = C0619.m2761("֨ۢ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-20223)) ^ (-73268600);
                        i3 = -1275896480;
                    }
                    int i115 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i115;
                    break;
                case 480035376:
                case 1404863351:
                    i = i11;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i4 - C0773.m3169("᩻ۡ")) * (-13);
                        i2 = ((iM3169 ^ i5) * (-23245)) ^ 1909961873;
                        i3 = -915860076;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩹ۡ")) * (-63);
                        i2 = ((iM3169 ^ i5) * (-22851)) ^ (-217741343);
                        i3 = 1695958160;
                    }
                    int i116 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i116;
                    break;
                case 895385480:
                case 902629197:
                    i = i11;
                    C1321.m4852();
                    iM3169 = (C0619.m2761("ܿ۫") ^ i5) * 43;
                    i2 = ((iM3169 ^ i4) * 28975) ^ (-1885334390);
                    i3 = 2096434704;
                    int i117 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i117;
                    break;
                case 1156316164:
                case 1913476497:
                    i = i11;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("֡۫") ^ i5;
                        i2 = ((iM3169 ^ i4) * 28405) ^ (-1758403376);
                        i3 = 1389900674;
                    } else {
                        iM3169 = C0619.m2761("ᩴܽ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-24719)) ^ (-1107803335);
                        i3 = 1347994535;
                    }
                    int i118 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i118;
                    break;
                case 1774490812:
                case 1867138979:
                    i = i11;
                    if (c13856M44344 == c13858) {
                        iM3169 = (i5 - C0619.m2761("᩻ۜ")) * 101;
                        i2 = ((iM3169 ^ i4) * 13419) ^ 1530319086;
                        i3 = 1187166271;
                    } else {
                        iM3169 = C0619.m2761("۠ܰ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 27803) ^ (-1476915037);
                        i3 = -19382689;
                    }
                    int i119 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i119;
                    break;
                default:
                    i = i11;
                    if (identityHashMap.containsKey((C6465) interfaceC22808)) {
                        iM3169 = C0773.m3169("ۘᩳ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-18129)) ^ (-140037599);
                        i3 = -901052062;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩻ۜ")) * 101;
                        i2 = ((iM3169 ^ i4) * 13419) ^ 1530319086;
                        i3 = 1187166271;
                    }
                    int i1110 = i;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i10 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0687 A[PHI: r4 r7 r9 r23 r24 r40 r42
      0x0687: PHI (r4v5 java.util.IdentityHashMap) = (r4v2 java.util.IdentityHashMap), (r4v1 java.util.IdentityHashMap), (r4v1 java.util.IdentityHashMap) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r7v3 java.lang.Object) = (r7v1 java.lang.Object), (r7v2 java.lang.Object), (r7v1 java.lang.Object) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r9v47 long) = (r9v7 long), (r9v9 long), (r9v49 long) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r23v41 java.util.IdentityHashMap) = (r23v11 java.util.IdentityHashMap), (r23v13 java.util.IdentityHashMap), (r23v42 java.util.IdentityHashMap) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r24v37 long) = (r24v6 long), (r24v8 long), (r24v38 long) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r40v40 long) = (r40v8 long), (r40v10 long), (r40v41 long) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x0687: PHI (r42v41 long) = (r42v8 long), (r42v10 long), (r42v42 long) binds: [B:128:0x0685, B:122:0x0622, B:18:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x06f8 A[PHI: r2 r9 r23 r24 r40 r42
      0x06f8: PHI (r2v71 java.util.IdentityHashMap) = (r2v7 java.util.IdentityHashMap), (r2v75 java.util.IdentityHashMap) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x06f8: PHI (r9v51 long) = (r9v6 long), (r9v58 long) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x06f8: PHI (r23v44 java.util.IdentityHashMap) = (r23v10 java.util.IdentityHashMap), (r23v49 java.util.IdentityHashMap) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x06f8: PHI (r24v40 long) = (r24v5 long), (r24v46 long) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x06f8: PHI (r40v43 long) = (r40v7 long), (r40v51 long) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x06f8: PHI (r42v44 long) = (r42v7 long), (r42v52 long) binds: [B:136:0x06e1, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0101, code lost:
    
        if (l.C2966.f9654 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m44285(l.C13856 r46, l.C13856 r47) {
        /*
            Method dump skipped, instruction units count: 2344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44285(l.۬۫ܳ, l.۬۫ܳ):long");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44304(C13856 c13856, IdentityHashMap identityHashMap) {
        ArrayDeque arrayDeque = null;
        C13856 c13857 = null;
        InterfaceC22808 interfaceC22808 = null;
        int i = -1569941397;
        int i2 = AbstractC3624.f12429;
        int i3 = C1080.f3865;
        int iM3169 = C0773.m3169("ۢ᩵") ^ i2;
        int i4 = ((iM3169 ^ i3) * 7465) ^ (-822725949);
        int i5 = 1998881565;
        while (true) {
            i = ((((i ^ i3) * 30997) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2096941582:
                case 457728812:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    } else {
                        iM3169 = (C0619.m2761("᩷۬") ^ i3) * (-103);
                        i4 = ((iM3169 ^ i2) * 25473) ^ (-1727478813);
                        i5 = 205299395;
                    }
                    break;
                case -2069429793:
                case -1527457552:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("᩶۫") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-27571)) ^ 2008310356;
                        i5 = -1426732706;
                    } else {
                        iM3169 = C0773.m3169("ۢۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9493) ^ 941395952;
                        i5 = -1253851078;
                    }
                    break;
                case -1979665318:
                case -141906095:
                    AbstractC3624.m11766(identityHashMap, (C6465) interfaceC22808, Boolean.TRUE);
                    iM3169 = (i3 - C0619.m2761("۟᩵")) * (-21);
                    i4 = ((iM3169 ^ i2) * 2831) ^ 1732398970;
                    i5 = 2086783196;
                    break;
                case -1889457046:
                case -1660695650:
                    C2485.m8357();
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    } else {
                        iM3169 = C0773.m3169("۫ᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11769)) ^ 1540449397;
                        i5 = 1975129836;
                    }
                    break;
                case -1879065623:
                case 966719268:
                    C3077.m10041();
                    if (C11235.f35427 >= 0) {
                        iM3169 = (C0619.m2761("ۖۡ") + i2) * 59;
                        i4 = ((iM3169 ^ i3) * (-27757)) ^ (-735684775);
                        i5 = -256202691;
                    } else {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    }
                    break;
                case -1695782294:
                case -1240709578:
                    if (C1080.m4050()) {
                        iM3169 = (i3 - C0773.m3169("ۜܿ")) * 65;
                        i4 = ((iM3169 ^ i2) * 3097) ^ 267349152;
                        i5 = -1770049289;
                    } else {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    }
                    break;
                case -1374022989:
                case 870482550:
                    interfaceC22808 = c13857.f43958.f28220;
                    if (interfaceC22808 instanceof C6465) {
                        iM3169 = C0773.m3169("ܽۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17725) ^ 1816555518;
                        i5 = -1041401685;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۟᩵")) * (-21);
                        i4 = ((iM3169 ^ i2) * 2831) ^ 1732398970;
                        i5 = 2086783196;
                    }
                    break;
                case -1361268499:
                case 358330901:
                    C2834.m9344();
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    } else {
                        iM3169 = (C0619.m2761("۟۬") + i2) * (-75);
                        i4 = ((iM3169 ^ i3) * (-22827)) ^ (-1339888547);
                        i5 = 1975820977;
                    }
                    break;
                case -1266212910:
                case 1746661160:
                    RunnableC3055.m9933();
                    C0773.m3161();
                    iM3169 = C0773.m3169("ܶܶ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                    i5 = 76038160;
                    break;
                case -1244087769:
                case 945815828:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("ۖۡ") + i2) * 59;
                        i4 = ((iM3169 ^ i3) * (-27757)) ^ (-735684775);
                        i5 = -256202691;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩸") ^ i3) * (-111);
                        i4 = ((iM3169 ^ i2) * (-31955)) ^ (-707287686);
                        i5 = -1140635895;
                    }
                    break;
                case -1121608982:
                case 1759223918:
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0773.m3169("᩶۫") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-27571)) ^ 2008310356;
                        i5 = -1426732706;
                    } else {
                        iM3169 = C0773.m3169("֫ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) ^ 197598308;
                        i5 = 1938660435;
                    }
                    break;
                case -994407256:
                case -537989064:
                    C0487.m2356();
                    break;
                case -960469028:
                case 333930310:
                    C3492.m11485(arrayDeque, c13857.f43960);
                    iM3169 = (i3 - C0619.m2761("۟᩵")) * (-21);
                    i4 = ((iM3169 ^ i2) * 2831) ^ 1732398970;
                    i5 = 2086783196;
                    break;
                case -399799175:
                case -179427761:
                    arrayDeque = new ArrayDeque();
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("᩶۫") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-27571)) ^ 2008310356;
                        i5 = -1426732706;
                    } else {
                        iM3169 = (C0619.m2761("ۤܿ") ^ i2) * (-39);
                        i4 = ((iM3169 ^ i3) * 8151) ^ (-730641453);
                        i5 = 107281415;
                    }
                    break;
                case -318099619:
                case 2079291819:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ܶܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-25611)) ^ 1514699226;
                        i5 = 76038160;
                    } else {
                        iM3169 = C0773.m3169("᩺᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 5685) ^ (-2133653714);
                        i5 = -817273558;
                    }
                    break;
                case -179674907:
                case 582683826:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("᩶۫") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-27571)) ^ 2008310356;
                        i5 = -1426732706;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۧܺ")) * (-9);
                        i4 = ((iM3169 ^ i3) * 25045) ^ (-614308869);
                        i5 = 794707226;
                    }
                    break;
                case 130064478:
                case 1019823876:
                    if (c13856 == null) {
                        iM3169 = (C0773.m3169("۫֫") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * (-6913)) ^ (-513903108);
                        i5 = 1816225667;
                    } else {
                        iM3169 = C0619.m2761("᩷ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1057) ^ (-540075682);
                        i5 = 774589421;
                    }
                    break;
                case 197431653:
                case 2043165408:
                    C2419.m8165(arrayDeque, c13857.f43955);
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("᩶۫") + i3) * (-29);
                        i4 = ((iM3169 ^ i2) * (-27571)) ^ 2008310356;
                        i5 = -1426732706;
                    } else {
                        iM3169 = (C0619.m2761("ܳۜ") ^ i2) * 27;
                        i4 = ((iM3169 ^ i3) * 31613) ^ (-1266935921);
                        i5 = 301198551;
                    }
                    break;
                case 500468793:
                case 1651948323:
                    if (C1146.m4231()) {
                        iM3169 = (C0773.m3169("֨ۡ") ^ i2) * (-13);
                        i4 = ((iM3169 ^ i3) * 21595) ^ 911333829;
                        i5 = 1067882885;
                    } else {
                        iM3169 = (C0619.m2761("ۖۡ") + i2) * 59;
                        i4 = ((iM3169 ^ i3) * (-27757)) ^ (-735684775);
                        i5 = -256202691;
                    }
                    break;
                case 1160182045:
                case 2040613227:
                    break;
                case 1254000212:
                case 2093960058:
                    if (C3492.m11482(arrayDeque)) {
                        iM3169 = (C0773.m3169("۫֫") + i2) * (-77);
                        i4 = ((iM3169 ^ i3) * (-6913)) ^ (-513903108);
                        i5 = 1816225667;
                    } else {
                        iM3169 = C0773.m3169("ۗۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12475)) ^ (-890848841);
                        i5 = -494696011;
                    }
                    break;
                case 1610523240:
                case 1847937682:
                    C2419.m8165(arrayDeque, c13856);
                    iM3169 = (i3 - C0619.m2761("۟᩵")) * (-21);
                    i4 = ((iM3169 ^ i2) * 2831) ^ 1732398970;
                    i5 = 2086783196;
                    break;
                default:
                    c13857 = (C13856) arrayDeque.pop();
                    if (C3099.m10087(c13857)) {
                        iM3169 = (C0773.m3169("᩷ܿ") ^ i3) * (-99);
                        i4 = ((iM3169 ^ i2) * 15037) ^ 1379055655;
                        i5 = 337920566;
                    } else {
                        iM3169 = C0773.m3169("᩷᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17491)) ^ (-2079630468);
                        i5 = -794719918;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x04ae A[PHI: r12 r13 r18 r21 r22 r23 r24 r27 r33
      0x04ae: PHI (r12v66 int) = (r12v30 int), (r12v31 int), (r12v34 int), (r12v67 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r13v63 int) = (r13v28 int), (r13v29 int), (r13v32 int), (r13v64 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r18v6 char) = (r18v2 char), (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r21v6 int) = (r21v2 int), (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r22v6 int) = (r22v2 int), (r22v2 int), (r22v3 int), (r22v2 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r23v6 int) = (r23v2 int), (r23v2 int), (r23v3 int), (r23v2 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r24v6 short[]) = (r24v3 short[]), (r24v2 short[]), (r24v2 short[]), (r24v2 short[]) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r27v27 int) = (r27v10 int), (r27v11 int), (r27v15 int), (r27v28 int) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r33v48 short[]) = (r33v24 short[]), (r33v25 short[]), (r33v29 short[]), (r33v49 short[]) binds: [B:106:0x04ac, B:102:0x0484, B:92:0x0405, B:10:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c7 A[PHI: r9 r10 r14
      0x01c7: PHI (r9v3 int) = (r9v2 int), (r9v6 int) binds: [B:41:0x017a, B:6:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r10v2 long) = (r10v1 long), (r10v5 long) binds: [B:41:0x017a, B:6:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r14v2 long) = (r14v1 long), (r14v5 long) binds: [B:41:0x017a, B:6:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20570[] m44323(DataInput dataInput, C19275 c19275) throws IOException {
        int iM2761;
        int i;
        int i2;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int i7;
        int i8;
        short[] sArr;
        int iM3169;
        int i9;
        long j;
        int i10;
        C20570[] c20570Arr;
        int i11;
        int iM2763;
        int i12;
        int i13;
        C19275 c19276 = c19275;
        int i14 = -216591398;
        int i15 = C1080.f3865;
        int i16 = C11235.f35427;
        int iM31610 = C0773.m3169("֨ܿ") ^ i15;
        int i17 = ((iM31610 ^ i16) * 13601) ^ 2068945158;
        int i18 = iM31610 ^ (-655825227);
        long j2 = 0;
        C20570[] c20570Arr2 = null;
        long j3 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        char c = 0;
        short s = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        long j4 = 0;
        short[] sArr4 = null;
        int i29 = 0;
        long j5 = 0;
        byte[] bArr = null;
        int i30 = 0;
        long j6 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 19537) >> 31));
            switch (i14) {
                case -2130149305:
                case 59639498:
                    i26 = i26;
                    sArr2 = sArr2;
                    i3 = i27;
                    i28 = i28;
                    sArr4 = f61940;
                    if (C0773.m3161() != 0) {
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                    } else {
                        iM2762 = C0619.m2761("ۡ᩸") ^ i15;
                        i17 = ((iM2762 ^ i16) * (-23675)) ^ (-680705624);
                        i5 = -1357676337;
                    }
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -2078215421:
                case 585642477:
                    c20570Arr2[i21] = new C20570(bArr);
                    if (!C2023.f6737) {
                        iM2763 = C0619.m2761("ۤۡ") ^ i16;
                        i12 = ((iM2763 ^ i15) * (-20577)) ^ 1386550445;
                        i13 = 1355826603;
                        i18 = iM2763 ^ i13;
                        i17 = i12;
                    } else {
                        i4 = i26;
                        iM3169 = (i15 - C0619.m2761("᩵᩸")) * 75;
                        i17 = ((iM3169 ^ i16) * 23619) ^ 1849826916;
                        i9 = -105236267;
                        i18 = iM3169 ^ i9;
                        c19276 = c19275;
                        i26 = i4;
                    }
                    break;
                case -1956872288:
                case -441202087:
                    C2702.m8876();
                    if (C2834.f9334 <= 0) {
                        i4 = i26;
                        iM3169 = (i15 - C0619.m2761("᩵᩸")) * 75;
                        i17 = ((iM3169 ^ i16) * 23619) ^ 1849826916;
                        i9 = -105236267;
                        i18 = iM3169 ^ i9;
                        c19276 = c19275;
                        i26 = i4;
                    } else {
                        i26 = i26;
                        sArr2 = sArr2;
                        i3 = i27;
                        i28 = i28;
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    }
                    break;
                case -1913952481:
                case -797478110:
                    short[] sArr5 = sArr2;
                    i7 = i27;
                    i8 = i28;
                    i26 = dataInput.readInt();
                    if (i26 >= 0) {
                        int iM2764 = C0619.m2761("ܽۧ") ^ i15;
                        i27 = i7;
                        i28 = i8;
                        sArr2 = sArr5;
                        i17 = ((iM2764 ^ i16) * 9529) ^ 129792574;
                        i18 = iM2764 ^ 2016864397;
                    } else {
                        sArr = sArr5;
                        int iM31611 = (i16 - C0773.m3169("ۖۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i27 = i7;
                        i17 = ((iM31611 ^ i15) * 1987) ^ (-619601683);
                        i28 = i8;
                        sArr2 = sArr;
                        i18 = iM31611 ^ (-78791040);
                    }
                    c19276 = c19275;
                    break;
                case -1748016268:
                case 507345357:
                    i4 = i26;
                    sArr2 = f61940;
                    i27 = 706;
                    i28 = 26;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i15 - C0619.m2761("ۚۛ")) * (-71);
                        i17 = ((iM3169 ^ i16) * 1787) ^ 154123647;
                        i9 = -177913195;
                    } else {
                        iM3169 = C0773.m3169("ۖۨ") ^ i16;
                        i17 = ((iM3169 ^ i15) * (-17515)) ^ (-1816292805);
                        i9 = 2059939506;
                    }
                    i18 = iM3169 ^ i9;
                    c19276 = c19275;
                    i26 = i4;
                    break;
                case -1650217770:
                case 181349144:
                    sArr3 = f61940;
                    i20 = 732;
                    i30 = 30;
                    if (!C17202.f56030) {
                        i26 = i26;
                        sArr2 = sArr2;
                        i3 = i27;
                        i28 = i28;
                        iM2762 = C0773.m3169("ۖܺ") ^ i16;
                        i17 = ((iM2762 ^ i15) * (-4083)) ^ 1437247864;
                        i5 = -929984838;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    } else {
                        iM2761 = C0619.m2761("ۧۡ") ^ i15;
                        i = ((iM2761 ^ i16) * (-14685)) ^ 528654797;
                        i2 = -685939686;
                        i18 = iM2761 ^ i2;
                        i17 = i;
                    }
                    break;
                case -1575332255:
                case -1514368726:
                    i26 = i26;
                    sArr2 = sArr2;
                    i3 = i27;
                    i28 = i28;
                    int i31 = i24 + i25;
                    if ((i31 + i31) - i23 < 0) {
                        iM2762 = (C0619.m2761("۠ᩴ") + i15) * (-109);
                        i17 = ((iM2762 ^ i16) * 3503) ^ 2057238139;
                        i5 = 1499521905;
                    } else {
                        iM2762 = C0619.m2761("ᩴ᩷") ^ i16;
                        i17 = ((iM2762 ^ i15) * (-18803)) ^ (-325657352);
                        i5 = -38088213;
                    }
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -1555015377:
                case 562206167:
                    i4 = i26;
                    if (i4 > 1048576) {
                        i26 = i4;
                        sArr = sArr2;
                        i7 = i27;
                        i8 = i28;
                        int iM31612 = (i16 - C0773.m3169("ۖۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i27 = i7;
                        i17 = ((iM31612 ^ i15) * 1987) ^ (-619601683);
                        i28 = i8;
                        sArr2 = sArr;
                        i18 = iM31612 ^ (-78791040);
                        c19276 = c19275;
                    } else {
                        iM3169 = (i16 - C0773.m3169("ܰ᩵")) * 65;
                        i17 = ((iM3169 ^ i15) * (-13861)) ^ 260476787;
                        i9 = 90713062;
                        i18 = iM3169 ^ i9;
                        c19276 = c19275;
                        i26 = i4;
                    }
                    break;
                case -1533881468:
                case 711272304:
                    return c20570Arr2;
                case -1465007985:
                case 1953839504:
                    i26 = i26;
                    sArr2 = sArr2;
                    i3 = i27;
                    i28 = i28;
                    c = 705;
                    if (C2023.f6737) {
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                    } else {
                        iM2762 = (i16 - C0619.m2761("᩷᩹")) * 47;
                        i17 = ((iM2762 ^ i15) * (-2533)) ^ 1144324653;
                        i5 = -781921827;
                    }
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -1454677753:
                case 1649616854:
                    i26 = i26;
                    sArr2 = sArr2;
                    i3 = i27;
                    i28 = i28;
                    i23 = i22 * i22;
                    i24 = s * s;
                    i25 = 83283876;
                    if (C3077.m10041()) {
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                    } else {
                        iM2762 = (C0773.m3169("ۖۗ") + i16) * 75;
                        i17 = ((iM2762 ^ i15) * 6767) ^ (-32026998);
                        i5 = -1432390074;
                    }
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -1367760873:
                case 209448488:
                    throw m44341(C1542.m5471(sArr3, i20, i30, i19));
                case -1341565905:
                case 1455030921:
                    if (j6 <= 67108864) {
                        iM2761 = (i15 - C0773.m3169("ۚۢ")) * (-41);
                        i = ((iM2761 ^ i16) * (-1157)) ^ 474342431;
                        i2 = 700566316;
                    } else {
                        iM2761 = (C0773.m3169("۬᩵") + i16) * 39;
                        i = ((iM2761 ^ i15) * (-25467)) ^ 1934492289;
                        i2 = 1783996723;
                    }
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    break;
                case -1263954549:
                case -443016764:
                    RunnableC3055.m9933();
                    C3099.m10095();
                    i4 = i26;
                    iM3169 = (i15 - C0619.m2761("ۚۛ")) * (-71);
                    i17 = ((iM3169 ^ i16) * 1787) ^ 154123647;
                    i9 = -177913195;
                    i18 = iM3169 ^ i9;
                    c19276 = c19275;
                    i26 = i4;
                    break;
                case -1256514658:
                case -865722811:
                    i19 = 7002;
                    iM2762 = (C0773.m3169("֡ۨ") ^ i15) * 97;
                    i3 = i27;
                    i17 = ((iM2762 ^ i16) * 17655) ^ (-1856447344);
                    i5 = -242529779;
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -1078373150:
                case 1689829487:
                    if (!C1343.m4943()) {
                        i26 = i26;
                        sArr2 = sArr2;
                        i3 = i27;
                        i28 = i28;
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    } else {
                        i4 = i26;
                        iM3169 = (i15 - C0619.m2761("ۚۛ")) * (-71);
                        i17 = ((iM3169 ^ i16) * 1787) ^ 154123647;
                        i9 = -177913195;
                        i18 = iM3169 ^ i9;
                        c19276 = c19275;
                        i26 = i4;
                    }
                    break;
                case -1036866942:
                case 977204208:
                    c20570Arr = c20570Arr2;
                    i11 = i21 + 1;
                    j3 = j6;
                    j = j2;
                    i10 = i26;
                    int iM31613 = (C0773.m3169("ۙܰ") ^ i16) * (-119);
                    i6 = ((iM31613 ^ i15) * EnumC5810.f19979) ^ 717988437;
                    i18 = iM31613 ^ 1965653114;
                    j2 = j;
                    i26 = i10;
                    i21 = i11;
                    c20570Arr2 = c20570Arr;
                    i17 = i6;
                    c19276 = c19275;
                    break;
                case -864563193:
                case 1313314345:
                    i4 = i26;
                    j5 = 40 * ((long) i4);
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ۡۡ") + i15) * (-69);
                        i17 = ((iM3169 ^ i16) * (-1599)) ^ (-522725515);
                        i9 = 949810305;
                    } else {
                        iM3169 = (i15 - C0773.m3169("᩺ۢ")) * (-9);
                        i17 = ((iM3169 ^ i16) * 18553) ^ 1142416942;
                        i9 = -1400704548;
                    }
                    i18 = iM3169 ^ i9;
                    c19276 = c19275;
                    i26 = i4;
                    break;
                case -854450478:
                case -395713656:
                    C0773.m3161();
                    if (C20932.f66974 > 0) {
                        i4 = i26;
                        iM3169 = (C0773.m3169("ۡۡ") + i15) * (-69);
                        i17 = ((iM3169 ^ i16) * (-1599)) ^ (-522725515);
                        i9 = 949810305;
                        i18 = iM3169 ^ i9;
                        c19276 = c19275;
                        i26 = i4;
                    } else {
                        i26 = i26;
                        sArr2 = sArr2;
                        i3 = i27;
                        i28 = i28;
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    }
                    break;
                case -844141631:
                case 662315889:
                    i4 = i26;
                    if (i21 >= i4) {
                        int iM2765 = (C0619.m2761("᩸۠") ^ i15) * 59;
                        i = ((iM2765 ^ i16) * 30187) ^ 811048808;
                        i18 = iM2765 ^ 888336132;
                        i26 = i4;
                        i17 = i;
                    } else {
                        int iM2766 = C0619.m2761("ܽ۬") ^ i16;
                        i17 = ((iM2766 ^ i15) * (-24489)) ^ 256128089;
                        i18 = iM2766 ^ 1831478712;
                        i26 = i4;
                    }
                    break;
                case -762065978:
                case -452527332:
                    i4 = i26;
                    j2 = j5 + 16;
                    if (C3779.m12264()) {
                        iM3169 = (C0773.m3169("֨֫") ^ i15) * 83;
                        i17 = ((iM3169 ^ i16) * 26637) ^ 72741271;
                        i9 = 2106869948;
                    } else {
                        iM3169 = (i15 - C0619.m2761("᩵᩸")) * 75;
                        i17 = ((iM3169 ^ i16) * 23619) ^ 1849826916;
                        i9 = -105236267;
                    }
                    i18 = iM3169 ^ i9;
                    c19276 = c19275;
                    i26 = i4;
                    break;
                case -742394310:
                case -603095460:
                    C1564.m5509();
                    C2288.m7767();
                    return null;
                case -399849676:
                case 2034077705:
                    throw m44341(RunnableC0334.m2049(sArr2, i27, i28, i19));
                case -281023625:
                case 1868278844:
                    i19 = 32154;
                    iM2762 = (C0773.m3169("֡ۨ") ^ i15) * 97;
                    i3 = i27;
                    i17 = ((iM2762 ^ i16) * 17655) ^ (-1856447344);
                    i5 = -242529779;
                    i28 = i28;
                    i27 = i3;
                    sArr2 = sArr2;
                    i18 = iM2762 ^ i5;
                    i26 = i26;
                    c19276 = c19275;
                    break;
                case -176228276:
                case 1016400047:
                    c19276.m44622(j4);
                    bArr = new byte[i29];
                    dataInput.readFully(bArr);
                    if (i29 != 0) {
                        iM2761 = (i16 - C0773.m3169("ۤ᩺")) * (-43);
                        i = ((iM2761 ^ i15) * 27143) ^ 1480564636;
                        i2 = 1992394107;
                    } else {
                        iM2761 = (C0773.m3169("ۛۨ") ^ i15) * (-47);
                        i = ((iM2761 ^ i16) * (-19261)) ^ 171601116;
                        i2 = -319545859;
                    }
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    break;
                case 588429115:
                case 1607445901:
                    j = j2;
                    i10 = i26;
                    c19276.m44622(j);
                    c20570Arr = new C20570[i10];
                    i11 = 0;
                    j3 = 0;
                    int iM31614 = (C0773.m3169("ۙܰ") ^ i16) * (-119);
                    i6 = ((iM31614 ^ i15) * EnumC5810.f19979) ^ 717988437;
                    i18 = iM31614 ^ 1965653114;
                    j2 = j;
                    i26 = i10;
                    i21 = i11;
                    c20570Arr2 = c20570Arr;
                    i17 = i6;
                    c19276 = c19275;
                    break;
                case 651060668:
                case 663691571:
                    i26 = i26;
                    sArr2 = sArr2;
                    i3 = i27;
                    i28 = i28;
                    short s2 = sArr4[c];
                    int i32 = s2 + 9126;
                    if (!C1080.m4050()) {
                        s = s2;
                        i22 = i32;
                        iM2762 = C0773.m3169("ۖܺ") ^ i16;
                        i17 = ((iM2762 ^ i15) * (-4083)) ^ 1437247864;
                        i5 = -929984838;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    } else {
                        int iM2767 = (C0619.m2761("ۧۜ") + i15) * 13;
                        i6 = ((iM2767 ^ i16) * 2451) ^ 361518438;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i26 = i26;
                        i18 = iM2767 ^ (-1921597026);
                        s = s2;
                        i22 = i32;
                        i17 = i6;
                        c19276 = c19275;
                    }
                    break;
                case 1013275063:
                case 1423448424:
                    short[] sArr6 = f61940;
                    if (C1146.m4231()) {
                        throw new IllegalArgumentException(C20932.m47853(sArr6, 762, 37, i19));
                    }
                    iM2763 = (C0619.m2761("᩸ܳ") + i16) * q.h;
                    i12 = ((iM2763 ^ i15) * (-987)) ^ (-1474677155);
                    i13 = 1997874305;
                    i18 = iM2763 ^ i13;
                    i17 = i12;
                    break;
                case 1517512394:
                case 1611522570:
                    if (C1321.f4751 < 0) {
                        iM2763 = (C0619.m2761("᩸ܳ") + i16) * q.h;
                        i12 = ((iM2763 ^ i15) * (-987)) ^ (-1474677155);
                        i13 = 1997874305;
                        i18 = iM2763 ^ i13;
                        i17 = i12;
                    } else {
                        i26 = i26;
                        sArr2 = sArr2;
                        i3 = i27;
                        i28 = i28;
                        iM2762 = (i16 - C0619.m2761("ܺۨ")) * (-45);
                        i17 = ((iM2762 ^ i15) * (-22859)) ^ (-1185158003);
                        i5 = -872576042;
                        i28 = i28;
                        i27 = i3;
                        sArr2 = sArr2;
                        i18 = iM2762 ^ i5;
                        i26 = i26;
                        c19276 = c19275;
                    }
                    break;
                default:
                    i29 = dataInput.readInt();
                    j4 = i29;
                    j6 = j3 + j4;
                    if (i29 > 0) {
                        iM2761 = C0619.m2761("᩵ۛ") ^ i16;
                        i = ((iM2761 ^ i15) * 24747) ^ 104943768;
                        i2 = -1000666405;
                    } else {
                        iM2761 = (C0773.m3169("۬᩵") + i16) * 39;
                        i = ((iM2761 ^ i15) * (-25467)) ^ 1934492289;
                        i2 = 1783996723;
                    }
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b9 A[PHI: r3 r4 r8
      0x01b9: PHI (r3v3 short) = (r3v2 short), (r3v1 short), (r3v1 short), (r3v1 short), (r3v1 short) binds: [B:53:0x01b7, B:41:0x0156, B:16:0x006a, B:14:0x0066, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:53:0x01b7, B:41:0x0156, B:16:0x006a, B:14:0x0066, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:53:0x01b7, B:41:0x0156, B:16:0x006a, B:14:0x0066, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01f0 A[PHI: r2
      0x01f0: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char) binds: [B:57:0x01ee, B:14:0x0066, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0222 A[PHI: r6 r7 r12 r17
      0x0222: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:61:0x0220, B:45:0x0176, B:26:0x009e, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:61:0x0220, B:45:0x0176, B:26:0x009e, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r12v7 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:61:0x0220, B:45:0x0176, B:26:0x009e, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r17v3 short[]) = (r17v2 short[]), (r17v1 short[]), (r17v1 short[]), (r17v1 short[]) binds: [B:61:0x0220, B:45:0x0176, B:26:0x009e, B:8:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0250 A[PHI: r10 r11
      0x0250: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:65:0x024e, B:30:0x00c4, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r11v7 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:65:0x024e, B:30:0x00c4, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x027e A[PHI: r5
      0x027e: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:69:0x027c, B:49:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44298(int i, int i2) throws IOException {
        int iM2761;
        int i3;
        int i4 = i;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1512835863;
        int i13 = C1321.f4751;
        int i14 = RunnableC3055.f9898;
        int iM2762 = C0619.m2761("᩶᩸") ^ i14;
        int i15 = ((iM2762 ^ i13) * (-31749)) ^ 1325198371;
        int i16 = iM2762 ^ 1151506377;
        short[] sArr2 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * (-763)) >> 31));
            switch (i12) {
                case -1977368935:
                case 1913426283:
                    C0773.m3161();
                    iM2761 = (C0619.m2761("᩸ܽ") + i13) * 69;
                    i15 = ((iM2761 ^ i14) * 20409) ^ 716883784;
                    i3 = -1542468278;
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1974945080:
                case 869006204:
                    int i17 = i7 + i8;
                    if ((i17 + i17) - i6 < 0) {
                        iM2761 = C0619.m2761("᩻᩷") ^ i14;
                        i15 = ((iM2761 ^ i13) * 9073) ^ (-700833960);
                        i3 = -2086766476;
                    } else {
                        iM2761 = C0619.m2761("ۗᩴ") ^ i13;
                        i15 = ((iM2761 ^ i14) * 12959) ^ 467587562;
                        i3 = -847722648;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1851045950:
                case -1745178239:
                    i8 = 67601284;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("᩸ܽ") + i13) * 69;
                        i15 = ((iM2761 ^ i14) * 20409) ^ 716883784;
                        i3 = -1542468278;
                    } else {
                        iM2761 = (C0773.m3169("ۢܰ") ^ i13) * 41;
                        i15 = ((iM2761 ^ i14) * (-6129)) ^ 779414627;
                        i3 = 605034741;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1747090439:
                case 549621217:
                    if (C3077.f9998) {
                        int iM3169 = C0773.m3169("᩺ۜ") ^ i14;
                        i16 = iM3169 ^ (-815468746);
                        i15 = ((iM3169 ^ i13) * (-24127)) ^ (-359556496);
                        i11 = 21;
                    } else {
                        i11 = 21;
                        iM2761 = C0773.m3169("᩷֨") ^ i13;
                        i15 = ((iM2761 ^ i14) * 15717) ^ (-48201160);
                        i3 = 1981091979;
                        i16 = iM2761 ^ i3;
                        i4 = i;
                    }
                    break;
                case -1596327901:
                case -573412379:
                    sArr = f61940;
                    if (C3779.f12953 <= 0) {
                        i10 = 481;
                        iM2761 = C0773.m3169("᩸ᩴ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 4959) ^ 392692370;
                        i3 = 1311003914;
                        i16 = iM2761 ^ i3;
                        i4 = i;
                    } else {
                        int iM31610 = (C0773.m3169("֡ܽ") + i13) * (-9);
                        i16 = iM31610 ^ 73092336;
                        i15 = ((iM31610 ^ i14) * 4343) ^ 586151899;
                        i10 = 481;
                    }
                    break;
                case -1547869657:
                case -1222154823:
                    if (C3099.m10095()) {
                        iM2761 = C0773.m3169("᩸ᩴ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 4959) ^ 392692370;
                        i3 = 1311003914;
                    } else {
                        iM2761 = (C0619.m2761("᩷᩸") + i13) * 119;
                        i15 = ((iM2761 ^ i14) * (-19855)) ^ 868516497;
                        i3 = -1492280408;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1539576718:
                case -1048380675:
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = (C0619.m2761("᩸ܽ") + i13) * 69;
                        i15 = ((iM2761 ^ i14) * 20409) ^ 716883784;
                        i3 = -1542468278;
                    } else {
                        iM2761 = C0619.m2761("۟ۗ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-9475)) ^ 459517049;
                        i3 = 1614779077;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1519281986:
                case 751498200:
                    if (i4 <= i2) {
                        int iM31611 = C0773.m3169("᩵ᩳ") ^ i13;
                        i15 = ((iM31611 ^ i14) * (-4311)) ^ 882796551;
                        i16 = iM31611 ^ (-1680288051);
                    } else {
                        iM2761 = (C0619.m2761("ܰ۫") ^ i13) * 5;
                        i15 = ((iM2761 ^ i14) * (-31117)) ^ 1107468106;
                        i3 = -1658106331;
                        i16 = iM2761 ^ i3;
                        i4 = i;
                    }
                    break;
                case -1461127581:
                case 188485668:
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("᩷֨") ^ i13;
                        i15 = ((iM2761 ^ i14) * 15717) ^ (-48201160);
                        i3 = 1981091979;
                    } else {
                        iM2761 = (i14 - C0773.m3169("᩵ܶ")) * (-31);
                        i15 = ((iM2761 ^ i13) * (-8911)) ^ 1340380539;
                        i3 = 823690818;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1366206153:
                case 1001585579:
                    s = sArr2[c];
                    s2 = 8222;
                    if (C3690.m11987()) {
                        iM2761 = (C0619.m2761("᩸ܽ") + i13) * 69;
                        i15 = ((iM2761 ^ i14) * 20409) ^ 716883784;
                        i3 = -1542468278;
                    } else {
                        iM2761 = (i14 - C0619.m2761("ᩴܿ")) * (-35);
                        i15 = ((iM2761 ^ i13) * 23113) ^ (-1708140136);
                        i3 = -615569340;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -1363333489:
                case 194295395:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("ۜۘ") + i13) * 67;
                        i15 = ((iM2761 ^ i14) * (-20603)) ^ 622624454;
                        i3 = -1286426776;
                    } else {
                        iM2761 = C0619.m2761("᩷ܰ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 1875) ^ (-1781984372);
                        i3 = 1563994532;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -861650301:
                case -586526064:
                    c = 480;
                    if (C4282.m13644()) {
                        iM2761 = (C0773.m3169("֡᩷") + i13) * (-23);
                        i15 = ((iM2761 ^ i14) * (-11823)) ^ (-918871951);
                        i3 = 864233074;
                    } else {
                        iM2761 = C0619.m2761("۟ۗ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-9475)) ^ 459517049;
                        i3 = 1614779077;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -795937311:
                case 1298356799:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0619.m2761("᩸ܽ") + i13) * 69;
                        i15 = ((iM2761 ^ i14) * 20409) ^ 716883784;
                        i3 = -1542468278;
                    } else {
                        iM2761 = C0773.m3169("᩸ᩴ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 4959) ^ 392692370;
                        i3 = 1311003914;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -711714964:
                case 1091400381:
                    sArr2 = f61940;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("᩷֨") ^ i13;
                        i15 = ((iM2761 ^ i14) * 15717) ^ (-48201160);
                        i3 = 1981091979;
                    } else {
                        iM2761 = C0619.m2761("ۘۗ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 7413) ^ (-736261613);
                        i3 = 924221419;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -493158185:
                case 624192625:
                    i5 = s + s2;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۜۘ") + i13) * 67;
                        i15 = ((iM2761 ^ i14) * (-20603)) ^ 622624454;
                        i3 = -1286426776;
                    } else {
                        iM2761 = C0773.m3169("۟ۖ") ^ i13;
                        i15 = ((iM2761 ^ i14) * 7997) ^ (-154456369);
                        i3 = -1381755768;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -383147474:
                case 694763981:
                    C3033.m9845();
                    if (RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("۟ۗ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-9475)) ^ 459517049;
                        i3 = 1614779077;
                    } else {
                        iM2761 = C0773.m3169("᩷֨") ^ i13;
                        i15 = ((iM2761 ^ i14) * 15717) ^ (-48201160);
                        i3 = 1981091979;
                    }
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case -179578873:
                case 1770111148:
                    i9 = 33514;
                    iM2761 = (C0619.m2761("ۖܺ") ^ i14) * (-37);
                    i15 = ((iM2761 ^ i13) * (-4075)) ^ (-345273984);
                    i3 = 2138145830;
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case 84052282:
                case 1809905262:
                    i9 = 46237;
                    iM2761 = (C0619.m2761("ۖܺ") ^ i14) * (-37);
                    i15 = ((iM2761 ^ i13) * (-4075)) ^ (-345273984);
                    i3 = 2138145830;
                    i16 = iM2761 ^ i3;
                    i4 = i;
                    break;
                case 628826896:
                case 1582083965:
                    throw m44341(RunnableC3055.m9937(sArr, i10, i11, i9));
                case 842388198:
                case 1276941578:
                    C1343.m4943();
                    C23916.m53419();
                    return;
                case 1027819304:
                case 1245698982:
                    return;
                default:
                    if (i4 > 0) {
                        int iM31612 = C0773.m3169("ۛۢ") ^ i14;
                        i16 = iM31612 ^ (-958996677);
                        i15 = ((iM31612 ^ i13) * 29423) ^ 757232014;
                    } else {
                        iM2761 = (C0619.m2761("ܰ۫") ^ i13) * 5;
                        i15 = ((iM2761 ^ i14) * (-31117)) ^ 1107468106;
                        i3 = -1658106331;
                        i16 = iM2761 ^ i3;
                    }
                    i4 = i;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 88861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44300(java.io.DataOutputStream r72, l.InterfaceC22808 r73, l.C4908 r74, boolean r75) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 8886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19143.m44300(java.io.DataOutputStream, l.᩸۫ܳ, l.ۙ۫ܳ, boolean):void");
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m44352() {
        IdentityHashMap identityHashMap = null;
        Iterator itM2811 = null;
        int i = -2080013661;
        int i2 = C1783.f6087;
        int i3 = C1146.f4234;
        int iM2761 = C0619.m2761("ᩳۛ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-20545)) ^ (-141542845);
        int i5 = 267063417;
        while (true) {
            i = ((((i ^ i3) * 12171) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2094681247:
                case -934764979:
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("ۧ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * 8075) ^ (-2070398122);
                        i5 = 453479964;
                    } else {
                        iM2761 = C0619.m2761("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4233) ^ (-1796817187);
                        i5 = -944210938;
                    }
                    break;
                case -1944638417:
                case -361503868:
                    ((C7956) C4238.m13529(itM2811)).f26437 = false;
                    iM2761 = (i3 - C0773.m3169("᩸᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM2761 ^ i2) * 28639) ^ (-43541190);
                    i5 = 294758187;
                    break;
                case -1920143288:
                case -912260039:
                    C3448.m11248();
                    if (C0773.m3161() != 0) {
                        iM2761 = (C0773.m3169("᩶֫") + i3) * 75;
                        i4 = ((iM2761 ^ i2) * (-9557)) ^ (-1170927882);
                        i5 = -205248908;
                    } else {
                        iM2761 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                        i5 = -1536851899;
                    }
                    break;
                case -1868536915:
                case -1151454647:
                    itM2811 = AbstractC0641.m2811(C0773.m3162(identityHashMap));
                    iM2761 = (i3 - C0773.m3169("᩸᩺")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM2761 ^ i2) * 28639) ^ (-43541190);
                    i5 = 294758187;
                    break;
                case -1745986297:
                case 681673445:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4233) ^ (-1796817187);
                        i5 = -944210938;
                    } else {
                        iM2761 = (C0773.m3169("᩶֫") + i3) * 75;
                        i4 = ((iM2761 ^ i2) * (-9557)) ^ (-1170927882);
                        i5 = -205248908;
                    }
                    break;
                case -1702948858:
                case -1258272138:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4233) ^ (-1796817187);
                        i5 = -944210938;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۙۤ")) * (-85);
                        i4 = ((iM2761 ^ i2) * SecP160R2Field.PInv33) ^ (-1688630075);
                        i5 = 1401670272;
                    }
                    break;
                case -1417797526:
                case 2089142716:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                        i5 = -1536851899;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11617)) ^ 162351018;
                        i5 = -1811894463;
                    }
                    break;
                case -1161225754:
                case 1195680553:
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                        i5 = -1536851899;
                    } else {
                        iM2761 = (C0619.m2761("ۚۚ") + i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 22515) ^ 438204483;
                        i5 = -1734025939;
                    }
                    break;
                case -1136158016:
                case 1172063047:
                    identityHashMap = this.f61955;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (C0619.m2761("ۚۚ") + i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 22515) ^ 438204483;
                        i5 = -1734025939;
                    } else {
                        iM2761 = (C0773.m3169("ۡۖ") + i3) * 63;
                        i4 = ((iM2761 ^ i2) * 20255) ^ (-536984490);
                        i5 = 157469192;
                    }
                    break;
                case -424738349:
                case 495222948:
                    C17202.m40372();
                    iM2761 = C0619.m2761("۫ܽ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                    i5 = -1536851899;
                    break;
                case -416702045:
                case -296668159:
                    C2375.m8065();
                    C2878.m9491();
                    break;
                case -218644618:
                case 1735819681:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0619.m2761("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4233) ^ (-1796817187);
                        i5 = -944210938;
                    } else {
                        iM2761 = C0619.m2761("᩶ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24121)) ^ (-796582131);
                        i5 = -2105553768;
                    }
                    break;
                case -176034249:
                case 880231453:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("᩶֫") + i3) * 75;
                        i4 = ((iM2761 ^ i2) * (-9557)) ^ (-1170927882);
                        i5 = -205248908;
                    } else {
                        iM2761 = (C0773.m3169("۬ᩴ") ^ i2) * (-65);
                        i4 = ((iM2761 ^ i3) * (-17715)) ^ 1908655228;
                        i5 = 1455995840;
                    }
                    break;
                case -175294421:
                case 1881763675:
                    if (C1826.m6317(itM2811)) {
                        iM2761 = C0773.m3169("ۖ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27673)) ^ (-789228058);
                        i5 = 1510626265;
                    } else {
                        iM2761 = (C0773.m3169("֫ܰ") ^ i2) * (-115);
                        i4 = ((iM2761 ^ i3) * 11527) ^ 572233683;
                        i5 = -2029082303;
                    }
                    break;
                case 190638806:
                case 638437791:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                        i5 = -1536851899;
                    } else {
                        iM2761 = C0619.m2761("ۧ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * o.a.e) ^ (-314098287);
                        i5 = -800348887;
                    }
                    break;
                case 284824510:
                case 2121112642:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("۫ܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4455)) ^ 392200820;
                        i5 = -1536851899;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-32183)) ^ 311429938;
                        i5 = 1945741880;
                    }
                    break;
                case 607326832:
                case 969747671:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ܰܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-30563)) ^ (-1207774633);
                        i5 = 664265992;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩺۫")) * 29;
                        i4 = ((iM2761 ^ i2) * (-15861)) ^ 49659021;
                        i5 = 1841397888;
                    }
                    break;
                case 758211382:
                case 791434454:
                    identityHashMap.clear();
                    break;
                default:
                    if (C0950.m3785() != 0) {
                        iM2761 = (C0619.m2761("ۚۚ") + i2) * (-19);
                        i4 = ((iM2761 ^ i3) * 22515) ^ 438204483;
                        i5 = -1734025939;
                    } else {
                        iM2761 = C0773.m3169("᩺ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18491)) ^ 1910233959;
                        i5 = -1155100810;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44321(C13856 c13856, C17037 c17037, C13111 c13111, int i) {
        boolean z = false;
        C8636 c8636 = null;
        int i2 = 85827227;
        int i3 = C4282.f15546;
        int i4 = C2419.f7754;
        int iM2761 = C0619.m2761("᩷ۘ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-30077)) ^ (-1902326416);
        int i6 = -50594934;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 2461) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1996585645:
                    case -1667879820:
                        if (C1542.f5343 <= 0) {
                            iM2761 = (C0619.m2761("ۘۜ") ^ i3) * (-9);
                            i5 = ((iM2761 ^ i4) * 12307) ^ 42318653;
                            i6 = -1387727619;
                            break;
                        }
                        iM2761 = (i4 - C0619.m2761("֡۠")) * (-115);
                        i5 = ((iM2761 ^ i3) * 2415) ^ (-924076070);
                        i6 = 224021412;
                        break;
                    case -1948861764:
                    case 1744249152:
                        if (AbstractC0116.m1243() == 0) {
                            iM2761 = (C0619.m2761("֡ᩴ") ^ i3) * (-109);
                            i5 = ((iM2761 ^ i4) * (-1787)) ^ (-1145370671);
                            i6 = 1451636941;
                            break;
                        }
                        iM2761 = (C0619.m2761("۫ۜ") + i4) * 21;
                        i5 = ((iM2761 ^ i3) * 19179) ^ (-1065246642);
                        i6 = -1850129928;
                        break;
                    case -1887231440:
                    case -1282018412:
                        if (C3492.f12043 > 0) {
                            iM2761 = C0619.m2761("ۤ֨") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-7093)) ^ 447724598;
                            i6 = 2111320983;
                            break;
                        }
                        iM2761 = (C0619.m2761("۫ۜ") + i4) * 21;
                        i5 = ((iM2761 ^ i3) * 19179) ^ (-1065246642);
                        i6 = -1850129928;
                        break;
                        break;
                    case -1719603913:
                    case -1604565489:
                        if (C2310.f7472 < 0) {
                            iM2761 = C0619.m2761("᩹᩵") ^ i4;
                            i5 = ((iM2761 ^ i3) * 8977) ^ (-626202909);
                            i6 = -2095275895;
                            break;
                        }
                        iM2761 = (i3 - C0619.m2761("ۨۤ")) * 47;
                        i5 = ((iM2761 ^ i4) * 4315) ^ 425684716;
                        i6 = -1392805785;
                        break;
                    case -1688942610:
                    case -593499293:
                        if (c17037 != null) {
                            iM2761 = C0619.m2761("᩹ܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 21823) ^ 1502357646;
                            i6 = 1083924668;
                            break;
                        }
                        iM2761 = C0773.m3169("ۘ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-14081)) ^ (-1119307590);
                        i6 = 1843805060;
                        break;
                    case -1682468502:
                    case -1044455354:
                        if (C1321.f4751 < 0) {
                            iM2761 = (C0773.m3169("ۧۤ") ^ i4) * 39;
                            i5 = ((iM2761 ^ i3) * 26959) ^ 259616016;
                            i6 = -1378723583;
                            break;
                        }
                        iM2761 = C0773.m3169("᩺ܺ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 20127) ^ 1693664660;
                        i6 = 670531175;
                        break;
                    case -1648361309:
                    case -467703285:
                        if (c13856 == null) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                        }
                        iM2761 = C0619.m2761("᩻ۘ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-9701)) ^ 503350315;
                        i6 = -1820048781;
                        break;
                    case -1401739519:
                    case 275158680:
                        if (!c17037.f55671) {
                            iM2761 = C0619.m2761("᩹۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * 11397) ^ (-990764706);
                            i6 = -2135560994;
                            break;
                        }
                        iM2761 = C0619.m2761("֡ۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                        i6 = -1079901005;
                        break;
                        break;
                    case -1382016778:
                    case 820235231:
                        if (AbstractC3624.f12429 > 0) {
                            iM2761 = C0619.m2761("ۡۨ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-11787)) ^ (-1873808118);
                            i6 = -212833794;
                            break;
                        }
                        iM2761 = (i4 - C0619.m2761("֡۠")) * (-115);
                        i5 = ((iM2761 ^ i3) * 2415) ^ (-924076070);
                        i6 = 224021412;
                        break;
                        break;
                    case -1350335507:
                    case 613291192:
                        C0487.m2356();
                        if (RunnableC3646.m11813() != 0) {
                            iM2761 = (i3 - C0619.m2761("ۨۤ")) * 47;
                            i5 = ((iM2761 ^ i4) * 4315) ^ 425684716;
                            i6 = -1392805785;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۛ᩻") ^ i4) * 97;
                        i5 = ((iM2761 ^ i3) * (-23837)) ^ (-1516442146);
                        i6 = -2059384430;
                        break;
                    case -1348833885:
                    case 1575029000:
                        if (C2834.f9334 > 0) {
                            iM2761 = C0619.m2761("ۙ۠") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-26189)) ^ 702169331;
                            i6 = -195372980;
                            break;
                        }
                        iM2761 = (C0619.m2761("۟ۡ") ^ i3) * (-31);
                        i5 = ((iM2761 ^ i4) * (-31453)) ^ 458553896;
                        i6 = -1838066961;
                        break;
                    case -1305839106:
                    case 1442581970:
                        if (c8636.f28221 != null) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ۘ᩺") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-14081)) ^ (-1119307590);
                        i6 = 1843805060;
                        break;
                        break;
                    case -1225297087:
                    case 2066183251:
                        if (!C3779.m12264()) {
                            iM2761 = (C0619.m2761("ۘۜ") ^ i3) * (-9);
                            i5 = ((iM2761 ^ i4) * 12307) ^ 42318653;
                            i6 = -1387727619;
                            break;
                            break;
                        }
                        iM2761 = C0619.m2761("ۖۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 9993) ^ (-1963361934);
                        i6 = 2034396371;
                        break;
                    case -1156850050:
                    case 586677452:
                        if (c8636.f28219 != i) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("֨ܰ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27637) ^ (-1332515025);
                        i6 = 1902052431;
                        break;
                    case -1075854581:
                    case 95668087:
                        C0619.m2763();
                        if (C2702.f8586 <= 0) {
                            iM2761 = C0773.m3169("᩺ܺ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20127) ^ 1693664660;
                            i6 = 670531175;
                            break;
                            break;
                        }
                        iM2761 = (C0619.m2761("۟ۡ") ^ i3) * (-31);
                        i5 = ((iM2761 ^ i4) * (-31453)) ^ 458553896;
                        i6 = -1838066961;
                        break;
                        break;
                    case -665092130:
                    case 1630789172:
                        if (C3734.f12817 < 0) {
                            iM2761 = (C0773.m3169("ܳ᩵") + i3) * (-109);
                            i5 = ((iM2761 ^ i4) * 15673) ^ (-937887669);
                            i6 = -1536968109;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۛ᩻") ^ i4) * 97;
                        i5 = ((iM2761 ^ i3) * (-23837)) ^ (-1516442146);
                        i6 = -2059384430;
                        break;
                        break;
                    case -574578257:
                    case 350862523:
                        if (c8636.f28222 != 0) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                            break;
                        }
                        iM2761 = (C0619.m2761("۠ۡ") ^ i4) * (-125);
                        i5 = ((iM2761 ^ i3) * (-9441)) ^ 1546712318;
                        i6 = -421704353;
                        break;
                    case -448492762:
                    case 132462832:
                        if (c13856 != null) {
                            iM2761 = C0619.m2761("᩹ܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 21823) ^ 1502357646;
                            i6 = 1083924668;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("ᩴᩴ") ^ i4) * 21;
                        i5 = ((iM2761 ^ i3) * (-31711)) ^ 798430506;
                        i6 = -317697871;
                        break;
                    case -443476820:
                    case -252184363:
                        return true;
                    case -270879853:
                    case 433937139:
                        if (C2288.f7433 > 0) {
                            iM2761 = C0619.m2761("᩸ܽ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-16859)) ^ 1194132390;
                            i6 = 133683327;
                            break;
                        }
                        iM2761 = (i3 - C0619.m2761("ۨۤ")) * 47;
                        i5 = ((iM2761 ^ i4) * 4315) ^ 425684716;
                        i6 = -1392805785;
                        break;
                        break;
                    case -124749008:
                    case 453611418:
                        if (!RunnableC3646.f12471) {
                            iM2761 = (i4 - C0619.m2761("֡۠")) * (-115);
                            i5 = ((iM2761 ^ i3) * 2415) ^ (-924076070);
                            i6 = 224021412;
                            break;
                            break;
                        }
                        iM2761 = (i3 - C0619.m2761("ۨۤ")) * 47;
                        i5 = ((iM2761 ^ i4) * 4315) ^ 425684716;
                        i6 = -1392805785;
                        break;
                        break;
                    case 38245624:
                    case 187233703:
                        C1826.m6301();
                        iM2761 = (C0773.m3169("ۛ᩻") ^ i4) * 97;
                        i5 = ((iM2761 ^ i3) * (-23837)) ^ (-1516442146);
                        i6 = -2059384430;
                        break;
                        break;
                    case 126343333:
                    case 146872007:
                        if (i != 0) {
                            iM2761 = C0773.m3169("ۗ֡") ^ i3;
                            i5 = ((iM2761 ^ i4) * 29253) ^ 1041875425;
                            i6 = -1061417804;
                            break;
                        }
                        iM2761 = C0773.m3169("ᩳ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8499) ^ (-871302049);
                        i6 = 1831891040;
                        break;
                    case 191376927:
                    case 936114767:
                        C3779.m12264();
                        if (C3033.f9831 >= 0) {
                            iM2761 = (i3 - C0619.m2761("֫ۤ")) * 63;
                            i5 = ((iM2761 ^ i4) * 31411) ^ 933471213;
                            i6 = -1931373609;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۛ᩻") ^ i4) * 97;
                        i5 = ((iM2761 ^ i3) * (-23837)) ^ (-1516442146);
                        i6 = -2059384430;
                        break;
                        break;
                    case 354220784:
                    case 1725476307:
                        if (!RunnableC3646.f12471) {
                            iM2761 = (C0773.m3169("ۛ᩻") ^ i4) * 97;
                            i5 = ((iM2761 ^ i3) * (-23837)) ^ (-1516442146);
                            i6 = -2059384430;
                            break;
                            break;
                        }
                        iM2761 = (C0619.m2761("۟ۡ") ^ i3) * (-31);
                        i5 = ((iM2761 ^ i4) * (-31453)) ^ 458553896;
                        i6 = -1838066961;
                        break;
                        break;
                    case 395845739:
                    case 936734816:
                        return z;
                    case 468760644:
                    case 1132528377:
                        if (!C3099.m10087(c13856)) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("۫ܳ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-26421)) ^ 796011570;
                        i6 = -540787427;
                        break;
                    case 536171962:
                    case 2083373793:
                        if (C1146.f4234 < 0) {
                            iM2761 = (C0773.m3169("ۤ۫") + i4) * (-59);
                            i5 = ((iM2761 ^ i3) * (-7823)) ^ (-184327354);
                            i6 = -532778568;
                            break;
                        }
                        iM2761 = (C0619.m2761("ۘۜ") ^ i3) * (-9);
                        i5 = ((iM2761 ^ i4) * 12307) ^ 42318653;
                        i6 = -1387727619;
                        break;
                        break;
                    case 603736281:
                    case 1501255622:
                        if (i != c13111.length()) {
                            z = false;
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                        }
                        int iM3169 = (i3 - C0773.m3169("᩶ۘ")) * (-17);
                        i5 = ((iM3169 ^ i4) * (-30315)) ^ 402217842;
                        i7 = iM3169 ^ (-1483331038);
                        z = false;
                        break;
                        break;
                    case 812182488:
                    case 1818636091:
                        C3099.m10095();
                        return false;
                    case 918623999:
                    case 1799900974:
                        if (c17037 == null) {
                            iM2761 = C0619.m2761("᩹۬") ^ i4;
                            i5 = ((iM2761 ^ i3) * 11397) ^ (-990764706);
                            i6 = -2135560994;
                            break;
                            break;
                        }
                        iM2761 = C0773.m3169("ۘ۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-30829)) ^ 130221868;
                        i6 = -1999617252;
                        break;
                    case 1052543238:
                    case 1681646671:
                        return z;
                    case 1799249387:
                    case 1812849581:
                        if (C2702.f8586 > 0) {
                            iM2761 = (C0773.m3169("ۘۗ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i5 = ((iM2761 ^ i4) * 1569) ^ 1424333984;
                            i6 = -1010479143;
                            break;
                        }
                        iM2761 = C0619.m2761("᩹᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * 8977) ^ (-626202909);
                        i6 = -2095275895;
                        break;
                        break;
                    default:
                        c8636 = c13856.f43958;
                        if (c8636.f28220 != c13111) {
                            iM2761 = C0619.m2761("֡ۚ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 17779) ^ (-556877831);
                            i6 = -1079901005;
                            break;
                            break;
                        }
                        iM2761 = C0619.m2761("ۘ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-3305)) ^ 1939551676;
                        i6 = -110901827;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private void m44334() throws IOException {
        if (this.f61952 != null) {
            m44338();
            return;
        }
        long jNanoTime = System.nanoTime();
        long j = this.f61945;
        if (j != 0 && jNanoTime - j < 0) {
            m44338();
            return;
        }
        synchronized (this) {
            if (this.f61952 != null) {
                m44338();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = this.f61945;
            if (j2 == 0 || jNanoTime2 - j2 >= 0) {
                m44377();
            } else {
                m44338();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22808[] m44324(C19143 c19143, C0498 c0498, InterfaceC7509 interfaceC7509) throws Throwable {
        C0498 c0499;
        boolean z;
        boolean z2;
        C14667 c14667M44295;
        InterfaceC22808[] interfaceC22808Arr;
        boolean z3;
        short s = f61940[799];
        int i = ((s * s) + 10478169) - (s * 6474) >= 0 ? 2675 : 33137;
        c19143.m44332();
        if (c19143.f61956 != c0498 || c0498.f2155 != c19143.f61958 || c19143.f61954 != c0498.f2168) {
            throw new IllegalStateException(AbstractC0641.m2820(f61940, 800, 17, i));
        }
        c19143.m44377();
        C0498.m2422(c0498);
        if (c0498.f2165) {
            if (interfaceC7509 == null || c0498.f2162 == 0) {
                z2 = false;
            } else {
                synchronized (f61935) {
                    C4227 c4227 = f61937;
                    z3 = c4227 != null && c4227.m13497();
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (c0498.f2158 || c0498.f2164 || z2) {
                C11684 c11684M55979 = c19143.f61949.m55979();
                try {
                    c14667M44295 = m44295(m44343(c0498.f2167, c0498.f2162, c19143.f61949), c0498.f2162, c19143.f61949, interfaceC7509);
                    try {
                        C13856 c13856M45218 = C19606.m45218(c14667M44295.f47956, c0498.f2172);
                        c19143.m44377();
                        C0498.m2422(c0498);
                        C10655 c10655M45237 = C19606.m45237(c13856M45218);
                        long jM45235 = C19606.m45235(c13856M45218);
                        long jM44340 = m44340(c13856M45218);
                        long jM45247 = C19606.m45247(c13856M45218);
                        c14667M44295.m35289(c0498);
                        c0498.f2167 = c13856M45218;
                        c0498.f2159 = c10655M45237.m27161();
                        c0498.f2156 = c10655M45237.m27162();
                        c0498.f2172 = jM45235;
                        c0498.f2173 = jM44340;
                        c0498.f2162 = jM45247;
                        interfaceC22808Arr = null;
                    } catch (IOException e) {
                        e = e;
                        if (c14667M44295 != null) {
                            c14667M44295.m35288(e);
                        }
                        if (!c0498.f2161) {
                            c19143.f61949.m55981(c11684M55979);
                        }
                        throw e;
                    } catch (Error e2) {
                        e = e2;
                        if (c14667M44295 != null) {
                            c14667M44295.m35288(e);
                        }
                        if (!c0498.f2161) {
                            c19143.f61949.m55981(c11684M55979);
                        }
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        if (c14667M44295 != null) {
                            c14667M44295.m35288(e);
                        }
                        if (!c0498.f2161) {
                            c19143.f61949.m55981(c11684M55979);
                        }
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e4) {
                    e = e4;
                    c14667M44295 = null;
                }
            } else {
                interfaceC22808Arr = null;
            }
            C0498.m2403(c0498);
            if (c0498.f2170 != null) {
                C16159 c16159 = c0498.f2170;
                C13856 c13856 = c0498.f2167;
                C16159.m38334(c16159, c13856 == null ? 0 : c13856.f43959);
            }
            if (interfaceC7509 != null && C11235.m28304(interfaceC7509)) {
                c0498.m2409();
                return interfaceC22808Arr;
            }
            ArrayDeque arrayDeque = c19143.f61957;
            boolean z4 = !C3492.m11482(arrayDeque);
            Iterator it = arrayDeque.iterator();
            while (C1826.m6317(it)) {
                C21381 c21381 = (C21381) C4238.m13529(it);
                long j = c19143.f61948;
                long j2 = c21381.f68096;
                C14799 c14799 = c21381.f68086;
                c19143.f61948 = j - (j2 + (c14799 == null ? 0L : c14799.m35638()));
            }
            arrayDeque.clear();
            boolean zM44317 = c19143.m44317(c19143.f61950, c19143.f61954.m48615(0L)) | z4;
            C0498.m2421(c0498);
            C21381 c21382 = c19143.f61954;
            C13856 c13857 = c0498.f2167;
            C17037 c17037 = c0498.f2169;
            long j3 = c19143.f61942 + 1;
            c19143.f61942 = j3;
            c19143.f61954 = new C21381(c13857, c17037, j3, c0498.f2159, c0498.f2156, c0498.f2172, c0498.f2173, c0498.f2162, c0498.f2170);
            c19143.f61954.f68086 = c0498.f2154.m54755();
            c19143.m44311(c21382, c19143.f61954.f68086, false);
            c19143.f61949.m55982();
            z = zM44317;
            c0499 = interfaceC22808Arr;
        } else {
            c0499 = 0;
            c19143.f61949.m55981(c0498.f2171);
            C0498.m2437(c0498);
            z = false;
        }
        c19143.f61956 = c0499;
        c0498.f2161 = true;
        return z ? c19143.m44355() : f61938;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m44280(int i) {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = -925890964;
        int i3 = AbstractC3624.f12429;
        int i4 = C1783.f6087;
        int iM3169 = C0773.m3169("ۗۜ") ^ i3;
        int i5 = ((iM3169 ^ i4) * 19291) ^ 1177918326;
        int i6 = 1451883482;
        while (true) {
            i2 = ((((i2 ^ i4) * (-22001)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2040758656:
                case -1447850549:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19069)) ^ 371054712;
                        i6 = 995897015;
                    } else {
                        iM3169 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 16129) ^ 263454969;
                        i6 = -1510329558;
                    }
                    break;
                case -1747466560:
                case -990452742:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19069)) ^ 371054712;
                        i6 = 995897015;
                    } else {
                        iM3169 = (C0619.m2761("ۜ۫") + i4) * 65;
                        i5 = ((iM3169 ^ i3) * 27819) ^ 1710790231;
                        i6 = 12757108;
                    }
                    break;
                case -1111098237:
                case -658218590:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ۤۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6505) ^ 1890218765;
                        i6 = 1449748369;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۖᩴ")) * (-51);
                        i5 = ((iM3169 ^ i3) * (-23205)) ^ (-1698486861);
                        i6 = 944401301;
                    }
                    break;
                case -1107381336:
                case 1848032608:
                    j = i;
                    j2 = 16;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۙۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19069)) ^ 371054712;
                        i6 = 995897015;
                    } else {
                        iM3169 = C0619.m2761("֨ۜ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 4863) ^ 2019788482;
                        i6 = -600155330;
                    }
                    break;
                case -683405647:
                case 1776621027:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-24193)) ^ 114910713;
                        i6 = -844003016;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۙ᩶")) * (-11);
                        i5 = ((iM3169 ^ i4) * (-18207)) ^ (-723016454);
                        i6 = -62581212;
                    }
                    break;
                case -589444560:
                case 879876395:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0773.m3169("᩵ܶ") + i4) * (-85);
                        i5 = ((iM3169 ^ i3) * 31937) ^ (-1219851071);
                        i6 = 1239036410;
                    } else {
                        iM3169 = C0619.m2761("ܳۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-1723)) ^ (-695325192);
                        i6 = 1237819043;
                    }
                    break;
                case -372734367:
                case 519905022:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۤۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6505) ^ 1890218765;
                        i6 = 1449748369;
                    } else {
                        iM3169 = (C0773.m3169("ۡۜ") ^ i4) * 65;
                        i5 = ((iM3169 ^ i3) * (-28409)) ^ 470799964;
                        i6 = -1760941023;
                    }
                    break;
                case -371060687:
                case 308030439:
                    C1343.m4943();
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("ۤۡ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 6505) ^ 1890218765;
                        i6 = 1449748369;
                    } else {
                        iM3169 = C0619.m2761("ۙۨ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-19069)) ^ 371054712;
                        i6 = 995897015;
                    }
                    break;
                case -271679466:
                case 1845797401:
                    C1321.m4852();
                    C1826.m6301();
                    return 0L;
                case 16606488:
                case 267651885:
                    j3 = j * j2;
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0773.m3169("᩵ܶ") + i4) * (-85);
                        i5 = ((iM3169 ^ i3) * 31937) ^ (-1219851071);
                        i6 = 1239036410;
                    } else {
                        iM3169 = C0773.m3169("᩸ۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-29123)) ^ 1095131365;
                        i6 = 619005606;
                    }
                    break;
                case 66261329:
                case 1498843057:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 16129) ^ 263454969;
                        i6 = -1510329558;
                    } else {
                        iM3169 = (C0619.m2761("֡ۙ") + i3) * 91;
                        i5 = ((iM3169 ^ i4) * (-28711)) ^ 1693550273;
                        i6 = 1078655893;
                    }
                    break;
                case 155483893:
                case 1863013888:
                    return C2966.m9672(32L, j3);
                case 280242915:
                case 2025282834:
                    return C25227.FOREVER_NS;
                case 493095669:
                case 863074720:
                    if (i > 0) {
                        iM3169 = (C0773.m3169("᩺᩻") ^ i3) * 45;
                        i5 = ((iM3169 ^ i4) * 29823) ^ 588784215;
                        i6 = 314376304;
                    } else {
                        iM3169 = C0773.m3169("۫᩸") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6941) ^ 1132870492;
                        i6 = 1518384120;
                    }
                    break;
                case 495226918:
                case 1872274050:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-24193)) ^ 114910713;
                        i6 = -844003016;
                    } else {
                        iM3169 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 16129) ^ 263454969;
                        i6 = -1510329558;
                    }
                    break;
                case 635098287:
                case 1247456287:
                    if (i > 1048576) {
                        iM3169 = C0773.m3169("۫᩸") ^ i4;
                        i5 = ((iM3169 ^ i3) * 6941) ^ 1132870492;
                        i6 = 1518384120;
                    } else {
                        iM3169 = C0619.m2761("ܰ֫") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-7727)) ^ (-195680193);
                        i6 = -137740763;
                    }
                    break;
                case 1080565004:
                case 1733842945:
                    if (C2702.m8876()) {
                        iM3169 = (i3 - C0773.m3169("ۡ۬")) * (-119);
                        i5 = ((iM3169 ^ i4) * 26619) ^ 2041736320;
                        i6 = 1778071335;
                    } else {
                        iM3169 = C0619.m2761("ۤۖ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-24193)) ^ 114910713;
                        i6 = -844003016;
                    }
                    break;
                case 1442154415:
                case 1902681198:
                    C3448.m11248();
                    iM3169 = C0773.m3169("ۖ۠") ^ i4;
                    i5 = ((iM3169 ^ i3) * 16129) ^ 263454969;
                    i6 = -1510329558;
                    break;
                default:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ۖ۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 16129) ^ 263454969;
                        i6 = -1510329558;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۖۚ")) * (-121);
                        i5 = ((iM3169 ^ i4) * (-13319)) ^ 766486115;
                        i6 = -192597429;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44309(C19143 c19143, C0498 c0498) {
        synchronized (c19143) {
            if (!c0498.f2161 && c19143.f61956 == c0498) {
                c0498.m2409();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x040e A[PHI: r2 r14 r16 r19
      0x040e: PHI (r2v35 java.util.IdentityHashMap) = 
      (r2v14 java.util.IdentityHashMap)
      (r2v1 java.util.IdentityHashMap)
      (r2v34 java.util.IdentityHashMap)
      (r2v1 java.util.IdentityHashMap)
      (r2v1 java.util.IdentityHashMap)
      (r2v1 java.util.IdentityHashMap)
     binds: [B:101:0x040c, B:141:0x040e, B:96:0x03df, B:46:0x0192, B:26:0x00bb, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r14v3 l.᩶ܳܳ) = (r14v1 l.᩶ܳܳ), (r14v1 l.᩶ܳܳ), (r14v1 l.᩶ܳܳ), (r14v2 l.᩶ܳܳ), (r14v1 l.᩶ܳܳ), (r14v1 l.᩶ܳܳ) binds: [B:101:0x040c, B:141:0x040e, B:96:0x03df, B:46:0x0192, B:26:0x00bb, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r16v17 l.᩸۫ܳ) = (r16v7 l.᩸۫ܳ), (r16v2 l.᩸۫ܳ), (r16v16 l.᩸۫ܳ), (r16v2 l.᩸۫ܳ), (r16v2 l.᩸۫ܳ), (r16v2 l.᩸۫ܳ) binds: [B:101:0x040c, B:141:0x040e, B:96:0x03df, B:46:0x0192, B:26:0x00bb, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r19v3 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v2 int), (r19v1 int) binds: [B:101:0x040c, B:141:0x040e, B:96:0x03df, B:46:0x0192, B:26:0x00bb, B:18:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0218 A[PHI: r7 r8 r9
      0x0218: PHI (r7v6 java.util.Set) = (r7v2 java.util.Set), (r7v1 java.util.Set), (r7v1 java.util.Set) binds: [B:60:0x0216, B:56:0x01f2, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r8v6 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:60:0x0216, B:56:0x01f2, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r9v6 java.lang.Object[]) = (r9v1 java.lang.Object[]), (r9v2 java.lang.Object[]), (r9v1 java.lang.Object[]) binds: [B:60:0x0216, B:56:0x01f2, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22808[] m44355() {
        InterfaceC22808 interfaceC22808;
        IdentityHashMap identityHashMap;
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        C19143 c19143 = this;
        IdentityHashMap identityHashMap2 = null;
        Iterator itM9936 = null;
        Set setM2758 = null;
        int i5 = 0;
        Object[] array = null;
        InterfaceC22808[] interfaceC22808Arr = null;
        int length = 0;
        InterfaceC22808[] interfaceC22808Arr2 = null;
        int length2 = 0;
        C21381 c21381 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 837264788;
        int i10 = C2834.f9334;
        int i11 = C1783.f6087;
        int iM2762 = (C0619.m2761("ᩴܿ") ^ i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i12 = ((iM2762 ^ i11) * (-12731)) ^ (-1855203047);
        int i13 = iM2762 ^ (-931439385);
        InterfaceC22808 interfaceC22809 = null;
        Iterator it = null;
        int i14 = 0;
        IdentityHashMap identityHashMap3 = null;
        Iterator it2 = null;
        InterfaceC22808 interfaceC228010 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 181) >> 31));
            switch (i9) {
                case -2107792513:
                case 84905719:
                    i6++;
                    i14 = i7;
                    iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                    i3 = ((iM2761 ^ i11) * 25351) ^ 922412916;
                    i4 = 11345857;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -2014410493:
                case 1904496444:
                    C2834.m9344();
                    if (C0862.m3503()) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-25113)) ^ (-2107205313);
                        i4 = 1507482674;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ۢۜ")) * q.h;
                        i3 = ((iM2761 ^ i10) * 14385) ^ 1128616182;
                        i4 = 1956369349;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1952831595:
                case -866466708:
                    i14 = 0;
                    length2 = interfaceC22808Arr.length;
                    i6 = i5;
                    iM2761 = C0619.m2761("ۜ᩻") ^ i10;
                    i3 = ((iM2761 ^ i11) * 25351) ^ 922412916;
                    i4 = 11345857;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1951445642:
                case 1282205026:
                    interfaceC22808 = interfaceC22809;
                    identityHashMap = identityHashMap2;
                    if (identityHashMap3.size() <= 1) {
                        iM3169 = C0619.m2761("᩵᩻") ^ i10;
                        i = ((iM3169 ^ i11) * 15177) ^ (-1516612575);
                        i2 = -343634196;
                    } else {
                        iM3169 = (C0773.m3169("ۗۜ") ^ i11) * (-25);
                        i = ((iM3169 ^ i10) * (-30135)) ^ 410893854;
                        i2 = 2069594476;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    identityHashMap2 = identityHashMap;
                    interfaceC22809 = interfaceC22808;
                    break;
                case -1879085858:
                case 1427363790:
                    setM2758 = C0619.m2758(c19143.f61951);
                    i5 = 0;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-25113)) ^ (-2107205313);
                        i4 = 1507482674;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩻") ^ i10;
                        i3 = ((iM2761 ^ i11) * 17671) ^ (-1813249495);
                        i4 = -1943947116;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1786868773:
                case 1078933509:
                    if (C3998.m12923(it2)) {
                        iM2761 = (i10 - C0773.m3169("֨ܶ")) * 49;
                        i3 = ((iM2761 ^ i11) * (-25433)) ^ 2128524002;
                        i4 = 1743469221;
                    } else {
                        iM2761 = C0773.m3169("۫ܰ") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-23431)) ^ (-50404281);
                        i4 = 830925835;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1747626441:
                case -1132488843:
                    c21381 = ((C7956) C0950.m3796(itM9936)).f26436;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                    } else {
                        iM2761 = C0773.m3169("ۗۘ") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-32739)) ^ (-966994401);
                        i4 = 660938848;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1624010494:
                case 44121196:
                    c19143.f61951.remove(interfaceC228010);
                    i8 = 1;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                    } else {
                        iM2761 = (i10 - C0773.m3169("ۢۧ")) * (-33);
                        i3 = ((iM2761 ^ i11) * 891) ^ 1019196788;
                        i4 = 1739405960;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1607020643:
                case -1094815496:
                    interfaceC22808Arr2[i14] = interfaceC228010;
                    i7 = i14 + i8;
                    iM2761 = (i10 - C0619.m2761("ۗ֫")) * (-99);
                    i3 = ((iM2761 ^ i11) * 29489) ^ (-1865928142);
                    i4 = 1407021019;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1531591645:
                case 588255779:
                    C19606.m45233(((C21381) C4238.m13529(it)).f68092, identityHashMap2);
                    iM2761 = (C0773.m3169("ۢ۠") + i10) * (-35);
                    i3 = ((iM2761 ^ i11) * 21555) ^ 616166571;
                    i4 = 818838447;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1529973350:
                case -1114675397:
                    return f61938;
                case -1483409903:
                case -1188977780:
                    return (InterfaceC22808[]) Arrays.copyOf(interfaceC22808Arr2, i14);
                case -1461617735:
                case 332678161:
                    itM9936 = RunnableC3055.m9936(C0619.m2758(c19143.f61955));
                    iM2761 = (C0773.m3169("ᩳۛ") ^ i11) * (-105);
                    i3 = ((iM2761 ^ i10) * (-8673)) ^ (-478682461);
                    i4 = -1683292612;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1328872989:
                case 1834062711:
                    C19606.m45233(c21381.f68092, identityHashMap2);
                    iM2761 = (C0773.m3169("ᩳۛ") ^ i11) * (-105);
                    i3 = ((iM2761 ^ i10) * (-8673)) ^ (-478682461);
                    i4 = -1683292612;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1278061837:
                case 350496174:
                    if (C3998.m12923(itM9936)) {
                        iM2761 = (C0773.m3169("ۜ᩵") + i10) * 49;
                        i3 = ((iM2761 ^ i11) * 15909) ^ 1547120201;
                        i4 = -1164130642;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ܰᩴ")) * (-71);
                        i3 = ((iM2761 ^ i10) * 31963) ^ 41400726;
                        i4 = 1051224428;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1246673817:
                case -1016536508:
                    array = setM2758.toArray(new InterfaceC22808[i5]);
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-25113)) ^ (-2107205313);
                        i4 = 1507482674;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۗ") ^ i11) * (-79);
                        i3 = ((iM2761 ^ i10) * (-7421)) ^ (-1476955977);
                        i4 = 62531861;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -1235680886:
                case -1149173175:
                    interfaceC22808 = interfaceC22809;
                    identityHashMap2 = new IdentityHashMap();
                    if (C2966.f9654 < 0) {
                        iM3169 = C0773.m3169("᩷ۧ") ^ i11;
                        identityHashMap = identityHashMap2;
                        i = ((iM3169 ^ i10) * (-15323)) ^ (-541927955);
                        i2 = 1696348049;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        identityHashMap2 = identityHashMap;
                        interfaceC22809 = interfaceC22808;
                    } else {
                        interfaceC22809 = interfaceC22808;
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    }
                    break;
                case -789343516:
                case 508862955:
                    interfaceC228010 = interfaceC22808Arr[i6];
                    if (identityHashMap2.containsKey(interfaceC228010)) {
                        i7 = i14;
                        iM2761 = (i10 - C0619.m2761("ۗ֫")) * (-99);
                        i3 = ((iM2761 ^ i11) * 29489) ^ (-1865928142);
                        i4 = 1407021019;
                    } else {
                        iM2761 = (C0619.m2761("ۧۚ") ^ i11) * (-127);
                        i3 = ((iM2761 ^ i10) * (-533)) ^ 1898382345;
                        i4 = -1326861401;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -481855310:
                case 402682809:
                    if (C3998.m12923(it)) {
                        iM2761 = (C0619.m2761("᩹ۜ") + i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i3 = ((iM2761 ^ i11) * 10579) ^ (-223745393);
                        i4 = 602314624;
                    } else {
                        iM2761 = (i11 - C0773.m3169("۟᩹")) * 51;
                        i3 = ((iM2761 ^ i10) * 24925) ^ (-579301124);
                        i4 = -610983259;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -461819146:
                case 458717831:
                    interfaceC22808Arr = (InterfaceC22808[]) array;
                    length = interfaceC22808Arr.length;
                    interfaceC22808Arr2 = new InterfaceC22808[length];
                    if (C4238.f15451 < 0) {
                        iM2761 = C0619.m2761("᩷۫") ^ i10;
                        i3 = ((iM2761 ^ i11) * (-25491)) ^ (-2090803085);
                        i4 = -992958191;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    } else {
                        interfaceC22808 = interfaceC22809;
                        iM3169 = (i11 - C0619.m2761("ܺۙ")) * (-13);
                        identityHashMap = identityHashMap2;
                        i = ((iM3169 ^ i10) * 16107) ^ 458003182;
                        i2 = 2028293095;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        identityHashMap2 = identityHashMap;
                        interfaceC22809 = interfaceC22808;
                    }
                    break;
                case -400174091:
                case 1340359950:
                    if (i6 < length2) {
                        iM2761 = (C0773.m3169("۫᩶") ^ i10) * 81;
                        i3 = ((iM2761 ^ i11) * (-3827)) ^ (-777587530);
                        i4 = 142231104;
                    } else {
                        iM2761 = C0619.m2761("᩹۟") ^ i11;
                        i3 = ((iM2761 ^ i10) * (-15921)) ^ 1796207827;
                        i4 = 1597750413;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -312413607:
                case 1576140448:
                    C19606.m45233(c19143.f61954.f68092, identityHashMap2);
                    if (C2966.f9654 >= 0) {
                        iM2761 = (i10 - C0619.m2761("۬᩵")) * 93;
                        i3 = ((iM2761 ^ i11) * 30237) ^ (-1489218986);
                        i4 = 1250030920;
                    } else {
                        iM2761 = (C0773.m3169("ܿ۬") + i11) * (-55);
                        i3 = ((iM2761 ^ i10) * (-10327)) ^ 1412684787;
                        i4 = 71791335;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case -40993580:
                case 791373111:
                    IdentityHashMap identityHashMap4 = identityHashMap2;
                    InterfaceC22808 interfaceC228011 = c19143.f61953;
                    if (C23916.f77426 <= 0) {
                        identityHashMap2 = identityHashMap4;
                        interfaceC22809 = interfaceC228011;
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                        i13 = iM2761 ^ i4;
                    } else {
                        int iM2763 = C0619.m2761("ۤۜ") ^ i10;
                        i3 = ((iM2763 ^ i11) * 2981) ^ (-774175186);
                        i13 = iM2763 ^ 1709596545;
                        identityHashMap2 = identityHashMap4;
                        interfaceC22809 = interfaceC228011;
                    }
                    i12 = i3;
                    break;
                case -19326631:
                case 689345253:
                    C1343.m4943();
                    iM2761 = (i11 - C0619.m2761("ۢۜ")) * q.h;
                    i3 = ((iM2761 ^ i10) * 14385) ^ 1128616182;
                    i4 = 1956369349;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 181145148:
                case 1771839628:
                    it2 = c19143.f61950.iterator();
                    iM2761 = C0619.m2761("ۛ۫") ^ i11;
                    i3 = ((iM2761 ^ i10) * 5907) ^ 1992423100;
                    i4 = -548783779;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 333543057:
                case 716125737:
                    interfaceC22808 = interfaceC22809;
                    AbstractC3624.m11766(identityHashMap2, interfaceC22808, Boolean.TRUE);
                    if (C2419.m8174() >= 0) {
                        iM3169 = (i11 - C0619.m2761("ܺۙ")) * (-13);
                        identityHashMap = identityHashMap2;
                        i = ((iM3169 ^ i10) * 16107) ^ 458003182;
                        i2 = 2028293095;
                    } else {
                        identityHashMap = identityHashMap2;
                        iM3169 = C0619.m2761("֨ܺ") ^ i10;
                        i = ((iM3169 ^ i11) * (-1675)) ^ (-1527262019);
                        i2 = 314113506;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    identityHashMap2 = identityHashMap;
                    interfaceC22809 = interfaceC22808;
                    break;
                case 334418685:
                case 397086779:
                    C0269.m1775();
                    if (!C2878.f9462) {
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    } else {
                        interfaceC22808 = interfaceC22809;
                        identityHashMap = identityHashMap2;
                        iM3169 = (i10 - C0773.m3169("ᩳ۠")) * (-41);
                        i = ((iM3169 ^ i11) * (-27265)) ^ 1700232176;
                        i2 = 1624264453;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        identityHashMap2 = identityHashMap;
                        interfaceC22809 = interfaceC22808;
                    }
                    break;
                case 353169149:
                case 1218441294:
                    if (i14 == length) {
                        iM2761 = (C0619.m2761("ۜ᩹") + i11) * 119;
                        i3 = ((iM2761 ^ i10) * 18643) ^ 397288158;
                        i4 = 1589936152;
                    } else {
                        iM2761 = C0773.m3169("ۖ۟") ^ i11;
                        i3 = ((iM2761 ^ i10) * 8691) ^ 1294415424;
                        i4 = -216723277;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 467204989:
                case 761660288:
                    C2310.m7813();
                    if (C3998.f13671 == 0) {
                        iM2761 = (i11 - C0619.m2761("ۢۜ")) * q.h;
                        i3 = ((iM2761 ^ i10) * 14385) ^ 1128616182;
                        i4 = 1956369349;
                    } else {
                        iM2761 = C0619.m2761("֨ܽ") ^ i10;
                        i3 = ((iM2761 ^ i11) * 32547) ^ 802941125;
                        i4 = 1717539232;
                    }
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 500055627:
                case 1132928050:
                    C13473.m33144();
                    if (!C1080.m4050()) {
                        iM2761 = (i10 - C0619.m2761("۬᩵")) * 93;
                        i3 = ((iM2761 ^ i11) * 30237) ^ (-1489218986);
                        i4 = 1250030920;
                        i13 = iM2761 ^ i4;
                        i12 = i3;
                    } else {
                        interfaceC22808 = interfaceC22809;
                        identityHashMap = identityHashMap2;
                        iM3169 = (i10 - C0773.m3169("ᩳ۠")) * (-41);
                        i = ((iM3169 ^ i11) * (-27265)) ^ 1700232176;
                        i2 = 1624264453;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        identityHashMap2 = identityHashMap;
                        interfaceC22809 = interfaceC22808;
                    }
                    break;
                case 537454541:
                case 1140541196:
                    return interfaceC22808Arr2;
                case 739432233:
                case 1259593991:
                    C19606.m45233(((C21381) C4238.m13529(it2)).f68092, identityHashMap2);
                    iM2761 = C0619.m2761("ۛ۫") ^ i11;
                    i3 = ((iM2761 ^ i10) * 5907) ^ 1992423100;
                    i4 = -548783779;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 751181556:
                case 2075285592:
                    it = c19143.f61957.iterator();
                    iM2761 = (C0773.m3169("ۢ۠") + i10) * (-35);
                    i3 = ((iM2761 ^ i11) * 21555) ^ 616166571;
                    i4 = 818838447;
                    i13 = iM2761 ^ i4;
                    i12 = i3;
                    break;
                case 1337452297:
                case 2002346403:
                    C2419.m8174();
                    C3033.m9845();
                    return null;
                default:
                    interfaceC22808 = interfaceC22809;
                    identityHashMap = identityHashMap2;
                    IdentityHashMap identityHashMap5 = c19143.f61951;
                    if (C3734.f12817 >= 0) {
                        identityHashMap3 = identityHashMap5;
                        iM3169 = (i10 - C0773.m3169("ᩳ۠")) * (-41);
                        i = ((iM3169 ^ i11) * (-27265)) ^ 1700232176;
                        i2 = 1624264453;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        identityHashMap2 = identityHashMap;
                        interfaceC22809 = interfaceC22808;
                    } else {
                        int iM2764 = C0619.m2761("ۡ᩶") ^ i10;
                        int i15 = ((iM2764 ^ i11) * (-23339)) ^ 1432403291;
                        i13 = iM2764 ^ (-991553773);
                        identityHashMap3 = identityHashMap5;
                        identityHashMap2 = identityHashMap;
                        i12 = i15;
                        interfaceC22809 = interfaceC22808;
                        c19143 = this;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x0303  */
    /* JADX WARN: Code duplicated, block: B:93:0x0336  */
    /* JADX WARN: Code duplicated, block: B:97:0x0366  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44317(ArrayDeque arrayDeque, C21381 c21381) {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5 = 1205978526;
        int i6 = C1146.f4234;
        int i7 = C1080.f3865;
        int iM2763 = (C0619.m2761("֡ۙ") ^ i6) * 59;
        int i8 = ((iM2763 ^ i7) * (-22607)) ^ (-1763315733);
        int i9 = iM2763 ^ (-1730148660);
        long jM35638 = 0;
        int size = 0;
        long j = 0;
        int i10 = i9;
        long j2 = 0;
        C14799 c14799 = null;
        long j3 = 0;
        ArrayDeque arrayDeque2 = null;
        long jM35639 = 0;
        C21381 c21382 = null;
        C14799 c147910 = null;
        boolean z = false;
        long j4 = 0;
        long j5 = 0;
        ArrayDeque arrayDeque3 = null;
        ArrayDeque arrayDeque4 = null;
        while (true) {
            i5 = i10 ^ ((((i5 ^ i7) * (-5847)) >> 31) & i8);
            switch (i5) {
                case -2088147440:
                case -1548878337:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ᩳۤ") + i6) * 83;
                        i3 = ((iM3169 ^ i7) * 6325) ^ 80490259;
                        i4 = -71863837;
                    } else {
                        iM3169 = (C0773.m3169("۟۬") + i6) * 55;
                        i3 = ((iM3169 ^ i7) * (-1061)) ^ 913623836;
                        i4 = -1264611360;
                    }
                    int i11 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i11;
                    break;
                case -1760941684:
                case -131770346:
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("ܺܶ") + i7) * 53;
                        i8 = ((iM2761 ^ i6) * 2677) ^ 1232214773;
                        i = -1063400719;
                        i10 = i ^ iM2761;
                    } else {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                        i3 = ((iM3169 ^ i7) * 25881) ^ (-1618409856);
                        i4 = 1767460343;
                        int i12 = i3;
                        i10 = iM3169 ^ i4;
                        i8 = i12;
                    }
                    break;
                case -1609224367:
                case 1386773318:
                    long j6 = c21382.f68096;
                    c147910 = c21382.f68086;
                    if (c147910 != null) {
                        iM2762 = C0773.m3169("ܶ᩷") ^ i7;
                        j = j6;
                        i8 = 195211038 ^ ((iM2762 ^ i6) * (-7815));
                        i2 = 2140746197;
                        i10 = iM2762 ^ i2;
                    } else {
                        j = j6;
                        jM35638 = j5;
                        iM2761 = (i6 - C0619.m2761("ܽ᩻")) * (-103);
                        i8 = ((iM2761 ^ i7) * (-32315)) ^ 1990498072;
                        i = -1286229090;
                        i10 = i ^ iM2761;
                    }
                    break;
                case -1555071463:
                case 320820300:
                    if (C3492.m11482(arrayDeque)) {
                        iM2761 = (i6 - C0619.m2761("ᩳۘ")) * (-85);
                        i8 = ((iM2761 ^ i7) * 27483) ^ (-893132107);
                        i = -2067540559;
                    } else {
                        arrayDeque3 = arrayDeque;
                        iM2761 = C0773.m3169("ۡ᩻") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-2625)) ^ (-1203189803);
                        i = 839309804;
                    }
                    i10 = i ^ iM2761;
                    break;
                case -1526751940:
                case 1827827249:
                    jM35638 = c147910.m35638();
                    iM2761 = (i6 - C0619.m2761("ܽ᩻")) * (-103);
                    i8 = ((iM2761 ^ i7) * (-32315)) ^ 1990498072;
                    i = -1286229090;
                    i10 = i ^ iM2761;
                    break;
                case -1486615764:
                case 998354277:
                    arrayDeque.addLast(c21381);
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i7;
                        i3 = ((iM3169 ^ i6) * 16025) ^ (-1005410069);
                        i4 = -354682519;
                    } else {
                        iM3169 = C0773.m3169("֫ᩴ") ^ i6;
                        i3 = ((iM3169 ^ i7) * (-9319)) ^ 1778965180;
                        i4 = -1063043461;
                    }
                    int i13 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i13;
                    break;
                case -1396566139:
                case -83051106:
                    RunnableC1848.m6360();
                    iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                    i3 = ((iM3169 ^ i7) * 25881) ^ (-1618409856);
                    i4 = 1767460343;
                    int i14 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i14;
                    break;
                case -1236147572:
                case 1612004954:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ۡ֫") ^ i7;
                        i3 = ((iM3169 ^ i6) * (-20373)) ^ (-612245399);
                        i4 = -1706825282;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩹") ^ i7;
                        i3 = ((iM3169 ^ i6) * (-6063)) ^ 989903531;
                        i4 = 622831544;
                    }
                    int i15 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i15;
                    break;
                case -1009582710:
                case 422266796:
                    C2834.m9344();
                    if (C1321.f4751 < 0) {
                        iM3169 = C0773.m3169("ۡ֫") ^ i7;
                        i3 = ((iM3169 ^ i6) * (-20373)) ^ (-612245399);
                        i4 = -1706825282;
                        int i16 = i3;
                        i10 = iM3169 ^ i4;
                        i8 = i16;
                    }
                    iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                    i3 = ((iM3169 ^ i7) * 25881) ^ (-1618409856);
                    i4 = 1767460343;
                    int i17 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i17;
                    break;
                case -834024892:
                case 1969085287:
                    jM35639 = c14799.m35638();
                    iM3169 = (i6 - C0773.m3169("۠ᩳ")) * (-51);
                    i3 = ((iM3169 ^ i7) * 30911) ^ 829561170;
                    i4 = -375364362;
                    int i18 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i18;
                    break;
                case -793952937:
                case -652007300:
                    C13473.m33144();
                    C1321.m4852();
                    return false;
                case -587889701:
                case -379559746:
                    c21382 = (C21381) arrayDeque3.removeFirst();
                    long j7 = this.f61948;
                    if (C2419.f7754 < 0) {
                        iM2762 = (C0619.m2761("ᩴۚ") + i6) * (-45);
                        j4 = j7;
                        i8 = (-579663961) ^ ((iM2762 ^ i7) * 23991);
                        i2 = -1464769410;
                        i10 = iM2762 ^ i2;
                    } else {
                        j4 = j7;
                        iM2761 = (C0773.m3169("ܺܶ") + i7) * 53;
                        i8 = ((iM2761 ^ i6) * 2677) ^ 1232214773;
                        i = -1063400719;
                        i10 = i ^ iM2761;
                    }
                    break;
                case -500317610:
                case -335177458:
                    arrayDeque3 = arrayDeque == arrayDeque2 ? arrayDeque4 : arrayDeque2;
                    iM2761 = C0773.m3169("ۡ᩻") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-2625)) ^ (-1203189803);
                    i = 839309804;
                    i10 = i ^ iM2761;
                    break;
                case -254507793:
                case 888748914:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0619.m2761("ۛ᩵") ^ i7;
                        i3 = ((iM3169 ^ i6) * 16025) ^ (-1005410069);
                        i4 = -354682519;
                    } else {
                        iM3169 = C0773.m3169("ۢۚ") ^ i6;
                        i3 = ((iM3169 ^ i7) * (-27357)) ^ (-2128441760);
                        i4 = -798180256;
                    }
                    int i19 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i19;
                    break;
                case -25621620:
                case 589242929:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ᩳۤ") + i6) * 83;
                        i3 = ((iM3169 ^ i7) * 6325) ^ 80490259;
                        i4 = -71863837;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩸") ^ i6;
                        i3 = ((iM3169 ^ i7) * 23575) ^ 937343949;
                        i4 = -947965474;
                    }
                    int i110 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i110;
                    break;
                case 37004843:
                case 1680603583:
                    if (this.f61948 > 67108864) {
                        iM2761 = C0773.m3169("ܳᩴ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 8343) ^ (-1638885016);
                        i = -931529979;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩶") ^ i7;
                        i8 = ((iM2761 ^ i6) * 9057) ^ (-1753478290);
                        i = -2116676625;
                    }
                    i10 = i ^ iM2761;
                    break;
                case 105651983:
                case 1740076463:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("ۡ֫") ^ i7;
                        i3 = ((iM3169 ^ i6) * (-20373)) ^ (-612245399);
                        i4 = -1706825282;
                    } else {
                        iM3169 = C0619.m2761("֨᩹") ^ i7;
                        i3 = ((iM3169 ^ i6) * 3611) ^ (-1810940560);
                        i4 = -521719204;
                    }
                    int i111 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i111;
                    break;
                case 558351730:
                case 832674581:
                    this.f61948 = C2966.m9672(j2, j3 + jM35639);
                    z = false;
                    iM2761 = C0619.m2761("ۙۚ") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-5465)) ^ 1308271208;
                    i = -2046885666;
                    i10 = i ^ iM2761;
                    break;
                case 834486651:
                case 1248310784:
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۢۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 12899) ^ (-875743090);
                        i = 1214044706;
                        i10 = i ^ iM2761;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۤ") + i6) * 83;
                        i3 = ((iM3169 ^ i7) * 6325) ^ 80490259;
                        i4 = -71863837;
                        int i112 = i3;
                        i10 = iM3169 ^ i4;
                        i8 = i112;
                    }
                    break;
                case 921475090:
                case 1587121431:
                    arrayDeque2 = this.f61950;
                    size = arrayDeque2.size();
                    arrayDeque4 = this.f61957;
                    if (!C2966.m9664()) {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                        i3 = ((iM3169 ^ i7) * 25881) ^ (-1618409856);
                        i4 = 1767460343;
                        int i113 = i3;
                        i10 = iM3169 ^ i4;
                        i8 = i113;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩺") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-17285)) ^ (-190941965);
                        i = 1420376248;
                        i10 = i ^ iM2761;
                    }
                    break;
                case 949861571:
                case 1521532679:
                    return z;
                case 1033558222:
                case 1591606713:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0773.m3169("ᩳۤ") + i6) * 83;
                        i3 = ((iM3169 ^ i7) * 6325) ^ 80490259;
                        i4 = -71863837;
                    } else {
                        iM3169 = (C0773.m3169("֨۠") ^ i7) * (-11);
                        i3 = ((iM3169 ^ i6) * (-16665)) ^ 108519838;
                        i4 = -182246721;
                    }
                    int i114 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i114;
                    break;
                case 1092969916:
                case 1309164501:
                    if (C1826.m6301() < 0) {
                        iM2761 = (C0773.m3169("ܺܶ") + i7) * 53;
                        i8 = ((iM2761 ^ i6) * 2677) ^ 1232214773;
                        i = -1063400719;
                    } else {
                        iM2761 = C0619.m2761("ۢۘ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 12899) ^ (-875743090);
                        i = 1214044706;
                    }
                    i10 = i ^ iM2761;
                    break;
                case 1288023834:
                case 2029685022:
                    this.f61948 = j4 - (j + jM35638);
                    z = true;
                    iM2761 = C0619.m2761("ۙۚ") ^ i7;
                    i8 = ((iM2761 ^ i6) * (-5465)) ^ 1308271208;
                    i = -2046885666;
                    i10 = i ^ iM2761;
                    break;
                case 1447060579:
                case 1996914946:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i6;
                        i3 = ((iM3169 ^ i7) * 25881) ^ (-1618409856);
                        i4 = 1767460343;
                    } else {
                        iM3169 = (C0773.m3169("ܳ֫") ^ i7) * 35;
                        i3 = ((iM3169 ^ i6) * (-29221)) ^ 1830749961;
                        i4 = 1554489711;
                    }
                    int i115 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i115;
                    break;
                case 1893378640:
                case 1946634087:
                    j2 = this.f61948;
                    j3 = c21381.f68096;
                    c14799 = c21381.f68086;
                    j5 = 0;
                    if (c14799 == null) {
                        jM35639 = 0;
                        iM3169 = (i6 - C0773.m3169("۠ᩳ")) * (-51);
                        i3 = ((iM3169 ^ i7) * 30911) ^ 829561170;
                        i4 = -375364362;
                    } else {
                        iM3169 = C0773.m3169("᩸֨") ^ i7;
                        i3 = ((iM3169 ^ i6) * 5647) ^ 135374821;
                        i4 = -1372014657;
                    }
                    int i116 = i3;
                    i10 = iM3169 ^ i4;
                    i8 = i116;
                    break;
                default:
                    if (arrayDeque4.size() + size <= 1024) {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i6;
                        i8 = ((iM2761 ^ i7) * (-2001)) ^ (-843123485);
                        i = -1303570438;
                    } else {
                        iM2761 = C0773.m3169("ܳᩴ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 8343) ^ (-1638885016);
                        i = -931529979;
                    }
                    i10 = i ^ iM2761;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0241 A[PHI: r4 r6 r15 r17 r19 r27
      0x0241: PHI (r4v4 long) = (r4v3 long), (r4v3 long), (r4v3 long), (r4v6 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r6v4 long) = (r6v3 long), (r6v3 long), (r6v3 long), (r6v6 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r15v6 long) = (r15v3 long), (r15v4 long), (r15v3 long), (r15v3 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r17v6 long) = (r17v3 long), (r17v4 long), (r17v3 long), (r17v3 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r19v6 long) = (r19v3 long), (r19v4 long), (r19v3 long), (r19v3 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r27v15 long) = (r27v1 long), (r27v8 long), (r27v14 long), (r27v17 long) binds: [B:64:0x023f, B:34:0x00f9, B:12:0x0069, B:7:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0275 A[PHI: r9 r11 r24 r27
      0x0275: PHI (r9v5 long) = (r9v3 long), (r9v3 long), (r9v3 long), (r9v6 long) binds: [B:68:0x0273, B:60:0x0220, B:30:0x00cd, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r11v5 long) = (r11v3 long), (r11v3 long), (r11v3 long), (r11v6 long) binds: [B:68:0x0273, B:60:0x0220, B:30:0x00cd, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r24v8 long) = (r24v5 long), (r24v5 long), (r24v7 long), (r24v5 long) binds: [B:68:0x0273, B:60:0x0220, B:30:0x00cd, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r27v11 long) = (r27v0 long), (r27v2 long), (r27v10 long), (r27v12 long) binds: [B:68:0x0273, B:60:0x0220, B:30:0x00cd, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m44339(int i, int i2, int i3, int[] iArr) {
        long j;
        int iM2761;
        int i4;
        int i5;
        int iM2762;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int i10 = 239505000;
        int i11 = C3779.f12953;
        int i12 = C1542.f5343;
        int iM31610 = C0773.m3169("ۖ᩺") ^ i11;
        int i13 = ((iM31610 ^ i12) * 26719) ^ (-462763151);
        int i14 = iM31610 ^ (-1211608976);
        long jM8353 = 0;
        int i15 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long jM8354 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i16 = i14;
        while (true) {
            long j9 = 0;
            while (true) {
                i10 = i16 ^ (i13 & (((i10 ^ i12) * 13225) >> 31));
                switch (i10) {
                    case -2036561728:
                    case -1690533578:
                        C2878.m9491();
                        C3734.m12152();
                        return 0L;
                    case -1877776891:
                    case 741060527:
                        return j9;
                    case -1638865118:
                    case 790932369:
                        j = j9;
                        if (C20932.f66974 <= 0) {
                            iM2761 = C0619.m2761("۬ۘ") ^ i12;
                            i4 = ((iM2761 ^ i11) * (-19907)) ^ (-586648801);
                            i5 = -477765265;
                        } else {
                            iM2761 = (C0619.m2761("ۧۧ") ^ i12) * 5;
                            i4 = ((iM2761 ^ i11) * (-3495)) ^ (-597190137);
                            i5 = -1275870359;
                        }
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                    case -1427833809:
                    case 1600508718:
                        C1826.m6301();
                        if (C2375.m8065() <= 0) {
                            j = j9;
                            iM2762 = (i11 - C0773.m3169("᩸ۗ")) * (-9);
                            i6 = ((iM2762 ^ i12) * (-1779)) ^ 2065373519;
                            i7 = 318599751;
                            i16 = i7 ^ iM2762;
                            i13 = i6;
                            j9 = j;
                        } else {
                            int iM2763 = C0619.m2761("۠ܶ") ^ i12;
                            i16 = iM2763 ^ (-1272059261);
                            i13 = ((iM2763 ^ i11) * 10331) ^ 711180579;
                        }
                        break;
                    case -1372613481:
                    case 308497756:
                        j = j9;
                        j6 = iArr[i15];
                        j5 = i3;
                        if (C1146.f4234 < 0) {
                            iM2762 = C0773.m3169("۠ۢ") ^ i12;
                            i6 = ((iM2762 ^ i11) * 3023) ^ (-1998289173);
                            i7 = -84440227;
                            i16 = i7 ^ iM2762;
                            i13 = i6;
                            j9 = j;
                        }
                        iM2761 = C0619.m2761("۬ۘ") ^ i12;
                        i4 = ((iM2761 ^ i11) * (-19907)) ^ (-586648801);
                        i5 = -477765265;
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                    case -1281976461:
                    case 620034032:
                        j = j9;
                        jM8354 = C2485.m8353(j7, j6 + j5);
                        if (C3779.f12953 > 0) {
                            iM3169 = (C0773.m3169("ܶ᩵") + i11) * (-45);
                            i8 = ((iM3169 ^ i12) * 2365) ^ (-821080339);
                            i9 = -835445978;
                            i16 = iM3169 ^ i9;
                            i13 = i8;
                            j9 = j;
                        } else {
                            iM2761 = C0619.m2761("ۧ᩷") ^ i11;
                            i4 = ((iM2761 ^ i12) * (-25267)) ^ (-1540583613);
                            i5 = 913377565;
                            i13 = i4;
                            i16 = iM2761 ^ i5;
                            j9 = j;
                        }
                        break;
                    case -1136609826:
                    case -45287687:
                        RunnableC3646.m11813();
                        j = j9;
                        iM2762 = (i11 - C0773.m3169("᩸ۗ")) * (-9);
                        i6 = ((iM2762 ^ i12) * (-1779)) ^ 2065373519;
                        i7 = 318599751;
                        i16 = i7 ^ iM2762;
                        i13 = i6;
                        j9 = j;
                        break;
                    case -724000335:
                    case 841574581:
                        j = j9;
                        if (C23916.f77426 <= 0) {
                            iM2761 = C0619.m2761("ۧ᩷") ^ i11;
                            i4 = ((iM2761 ^ i12) * (-25267)) ^ (-1540583613);
                            i5 = 913377565;
                        } else {
                            iM2761 = C0619.m2761("ۗۛ") ^ i12;
                            i4 = ((iM2761 ^ i11) * (-27789)) ^ 1566976513;
                            i5 = 1430291261;
                        }
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                    case -585741163:
                    case -126781784:
                        j = j9;
                        if (C1564.f5401 <= 0) {
                            iM2761 = (C0619.m2761("֨ۜ") ^ i11) * (-83);
                            i4 = ((iM2761 ^ i12) * 21939) ^ (-286285870);
                            i5 = 1923804912;
                        } else {
                            iM2761 = C0619.m2761("ᩴۚ") ^ i11;
                            i4 = ((iM2761 ^ i12) * 13877) ^ 1350080672;
                            i5 = -643931708;
                        }
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                    case -268107244:
                    case 1376158104:
                        j = j9;
                        if (C11235.f35427 >= 0) {
                            iM2761 = C0619.m2761("۬ۘ") ^ i12;
                            i4 = ((iM2761 ^ i11) * (-19907)) ^ (-586648801);
                            i5 = -477765265;
                        } else {
                            iM2761 = C0773.m3169("ۚܺ") ^ i11;
                            i4 = ((iM2761 ^ i12) * (-3685)) ^ (-84719206);
                            i5 = 464644643;
                        }
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                    case -239047510:
                    case 501175802:
                        if (C20932.f66974 <= 0) {
                            j = j9;
                            iM2761 = C0619.m2761("۬ۘ") ^ i12;
                            i4 = ((iM2761 ^ i11) * (-19907)) ^ (-586648801);
                            i5 = -477765265;
                            i13 = i4;
                            i16 = iM2761 ^ i5;
                            j9 = j;
                        }
                        j = j9;
                        iM2762 = (i11 - C0773.m3169("᩸ۗ")) * (-9);
                        i6 = ((iM2762 ^ i12) * (-1779)) ^ 2065373519;
                        i7 = 318599751;
                        i16 = i7 ^ iM2762;
                        i13 = i6;
                        j9 = j;
                        break;
                    case -124938413:
                    case 2117616777:
                        j = j9;
                        j4 = -65536;
                        j3 = j8 & (-65536);
                        j2 = jM8354 + 65535;
                        if (C0269.m1775() > 0) {
                            iM3169 = (C0773.m3169("ۧۙ") + i12) * (-105);
                            i8 = ((iM3169 ^ i11) * (-263)) ^ 551758999;
                            i9 = -1940073024;
                            i16 = iM3169 ^ i9;
                            i13 = i8;
                            j9 = j;
                        } else {
                            iM2761 = (C0619.m2761("֨ۜ") ^ i11) * (-83);
                            i4 = ((iM2761 ^ i12) * 21939) ^ (-286285870);
                            i5 = 1923804912;
                            i13 = i4;
                            i16 = iM2761 ^ i5;
                            j9 = j;
                        }
                        break;
                    case 177644865:
                    case 1792101906:
                        j = j9;
                        jM8353 = C2485.m8353(j7, j2 & j4);
                        if (!C3077.f9998) {
                            iM2761 = C0619.m2761("۬ۘ") ^ i12;
                            i4 = ((iM2761 ^ i11) * (-19907)) ^ (-586648801);
                            i5 = -477765265;
                            i13 = i4;
                            i16 = iM2761 ^ i5;
                            j9 = j;
                        } else {
                            iM3169 = C0773.m3169("᩶ܳ") ^ i12;
                            i8 = ((iM3169 ^ i11) * (-9795)) ^ 581303620;
                            i9 = 1570475632;
                            i16 = iM3169 ^ i9;
                            i13 = i8;
                            j9 = j;
                        }
                        break;
                    case 210082298:
                    case 535404635:
                        if (C0862.f3233 != 0) {
                            j = j9;
                            iM2761 = (C0619.m2761("֨ۜ") ^ i11) * (-83);
                            i4 = ((iM2761 ^ i12) * 21939) ^ (-286285870);
                            i5 = 1923804912;
                            i13 = i4;
                            i16 = iM2761 ^ i5;
                            j9 = j;
                        }
                        j = j9;
                        iM2762 = (i11 - C0773.m3169("᩸ۗ")) * (-9);
                        i6 = ((iM2762 ^ i12) * (-1779)) ^ 2065373519;
                        i7 = 318599751;
                        i16 = i7 ^ iM2762;
                        i13 = i6;
                        j9 = j;
                        break;
                    case 351892769:
                    case 1544600942:
                        return C2966.m9672(C20767.m47481(Math.max(j9, jM8353 - j3)), 192L);
                    case 471964149:
                    case 792844014:
                        break;
                    case 637581272:
                    case 850925801:
                        j = j9;
                        i15 = i2 - 1;
                        if (C20932.f66974 <= 0) {
                            iM2762 = (i11 - C0773.m3169("᩸ۗ")) * (-9);
                            i6 = ((iM2762 ^ i12) * (-1779)) ^ 2065373519;
                            i7 = 318599751;
                        } else {
                            iM2762 = C0619.m2761("۟۟") ^ i11;
                            i6 = ((iM2762 ^ i12) * 13017) ^ 1578254369;
                            i7 = 1006358410;
                        }
                        i16 = i7 ^ iM2762;
                        i13 = i6;
                        j9 = j;
                        break;
                    default:
                        j = j9;
                        j8 = iArr[0];
                        j7 = i;
                        if (C17202.m40372()) {
                            iM2761 = C0619.m2761("֡ۢ") ^ i11;
                            i4 = ((iM2761 ^ i12) * 24505) ^ (-1624611118);
                            i5 = 455144638;
                        } else {
                            iM2761 = (C0619.m2761("֨ۜ") ^ i11) * (-83);
                            i4 = ((iM2761 ^ i12) * 21939) ^ (-286285870);
                            i5 = 1923804912;
                        }
                        i13 = i4;
                        i16 = iM2761 ^ i5;
                        j9 = j;
                        break;
                }
            }
            if (i2 == 0) {
                int iM2764 = C0619.m2761("۬ۖ") ^ i11;
                i16 = (-1182014887) ^ iM2764;
                i13 = ((iM2764 ^ i12) * 15709) ^ 602162458;
            } else {
                int iM31611 = C0773.m3169("᩺ܰ") ^ i12;
                i13 = ((iM31611 ^ i11) * 21051) ^ 561624799;
                i16 = iM31611 ^ 1818662426;
            }
        }
    }
}
