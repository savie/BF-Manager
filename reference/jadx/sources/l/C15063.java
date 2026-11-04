package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܳۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C7HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15063 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49170 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C24720 f49171 = C24720.m55194(1000);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f49172;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f49173;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49175;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f49176;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14162 f49177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f49178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f49179;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C24523 f49182;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13961 f49183;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f49184;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f49185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f49187;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f49189;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f49190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f49191;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f49186 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f49174 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f49180 = new AtomicReference();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f49181 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f49188 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m36293(boolean z) {
        if (this.f49188) {
            return;
        }
        boolean z2 = true;
        this.f49188 = true;
        System.currentTimeMillis();
        synchronized (this.f49183) {
            C20244.m46520(this.f49183);
        }
        boolean z3 = false;
        if (z || this.f49180.get() != null || this.f49181.get() < this.f49175) {
            z2 = false;
        }
        System.currentTimeMillis();
        if (z2) {
            try {
                m36292();
            } catch (Exception e) {
                AtomicReference atomicReference = this.f49180;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                this.f49185.mo4296();
            }
        } else {
            this.f49185.mo4296();
        }
        z3 = z2;
        InterfaceC14162 interfaceC14162 = this.f49177;
        if (interfaceC14162 != null) {
            interfaceC14162.mo34399(this, z3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36294(C3639 c3639) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f49178 >= c.a && f49171.m55199()) {
            this.f49187.set(this.f49189);
            c3639.mo11789();
            this.f49178 = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36295(C22523 c22523, boolean z) {
        int iDecrementAndGet = this.f49174.decrementAndGet();
        double dCurrentTimeMillis = (System.currentTimeMillis() - c22523.f72858) / 1000.0d;
        long j = dCurrentTimeMillis > 0.0d ? (long) ((c22523.f72855.get() - c22523.f72854) / dCurrentTimeMillis) : 0L;
        if (j > 0) {
            m36291(j);
        }
        if (iDecrementAndGet == 0) {
            m36293(z);
        }
    }

    public C15063(int i, String str, String str2, String str3, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z, C13961 c13961, long j, long j2, Object obj, C24523 c24523, boolean z2, boolean z3, ThreadLocal threadLocal, InterfaceC14162 interfaceC14162) {
        this.f49189 = str;
        this.f49187 = threadLocal;
        System.currentTimeMillis();
        this.f49179 = str3;
        this.f49190 = abstractC22044;
        this.f49185 = abstractC22045;
        this.f49173 = z;
        this.f49183 = c13961;
        this.f49175 = j;
        this.f49172 = j2;
        this.f49176 = obj;
        this.f49182 = c24523;
        this.f49184 = z2;
        this.f49191 = z3;
        this.f49177 = interfaceC14162;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36292() throws IOException {
        if (this.f49173) {
            boolean z = this.f49184;
            AbstractC22044 abstractC22044 = this.f49190;
            if (z && abstractC22044.mo2934()) {
                if (!(this.f49191 ? abstractC22044.mo4300(new C19539()) : abstractC22044.mo4296()) && abstractC22044.mo2934()) {
                    throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to replace target file: ")));
                }
            }
            if (!this.f49185.mo4301(abstractC22044)) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to rename file to target: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36291(long j) {
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            if (j < 1048576) {
                return String.format("%.2fKB", Double.valueOf(j / 1024.0d));
            }
            return j < 1073741824 ? String.format("%.2fMB", Double.valueOf(j / 1048576.0d)) : String.format("%.2fGB", Double.valueOf(j / 1.073741824E9d));
        }
        return j + "B";
    }
}
