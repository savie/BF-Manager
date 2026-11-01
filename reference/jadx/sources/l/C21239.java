package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩸֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21239 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C22959 f69170 = C22959.m50799(1000);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69171 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f69174;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f69176;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f69177;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f69178;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f69179;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f69180;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f69181;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0777 f69182;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f69183;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f69184;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1388 f69185;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5222 f69186;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f69187;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f69189;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f69191;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69188 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69175 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AtomicReference f69172 = new AtomicReference();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicLong f69190 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f69173 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m47719(boolean z) {
        try {
            if (this.f69173) {
                return;
            }
            boolean z2 = true;
            this.f69173 = true;
            System.currentTimeMillis();
            synchronized (this.f69185) {
                C19431.m44468(this.f69185);
            }
            boolean z3 = false;
            if (z || this.f69172.get() != null || this.f69190.get() < this.f69183) {
                z2 = false;
            }
            System.currentTimeMillis();
            if (z2) {
                try {
                    m47718();
                } catch (Exception e) {
                    AtomicReference atomicReference = this.f69172;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    this.f69176.mo24647();
                }
            } else {
                this.f69176.mo24647();
            }
            z3 = z2;
            InterfaceC0777 interfaceC0777 = this.f69182;
            if (interfaceC0777 != null) {
                interfaceC0777.mo3329(this, z3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47720(C4516 c4516) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f69177 >= c.a && f69170.m50802()) {
            this.f69184.set(this.f69187);
            c4516.mo10126();
            this.f69177 = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47721(C22651 c22651, boolean z) {
        int iDecrementAndGet = this.f69175.decrementAndGet();
        double dCurrentTimeMillis = (System.currentTimeMillis() - c22651.f73793) / 1000.0d;
        long j = dCurrentTimeMillis > 0.0d ? (long) ((c22651.f73791.get() - c22651.f73790) / dCurrentTimeMillis) : 0L;
        if (j > 0) {
            m47717(j);
        }
        if (iDecrementAndGet == 0) {
            m47719(z);
        }
    }

    public C21239(int i, String str, String str2, String str3, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z, C1388 c1388, long j, long j2, Object obj, C5222 c5222, boolean z2, boolean z3, ThreadLocal threadLocal, InterfaceC0777 interfaceC0777) {
        this.f69187 = str;
        this.f69184 = threadLocal;
        System.currentTimeMillis();
        this.f69180 = str3;
        this.f69178 = abstractC20745;
        this.f69176 = abstractC20746;
        this.f69179 = z;
        this.f69185 = c1388;
        this.f69183 = j;
        this.f69174 = j2;
        this.f69181 = obj;
        this.f69186 = c5222;
        this.f69189 = z2;
        this.f69191 = z3;
        this.f69182 = interfaceC0777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47718() throws IOException {
        if (this.f69179) {
            boolean z = this.f69189;
            AbstractC20745 abstractC20745 = this.f69178;
            if (z && abstractC20745.mo33975()) {
                if (!(this.f69191 ? abstractC20745.mo35234(new C14890()) : abstractC20745.mo24647()) && abstractC20745.mo33975()) {
                    throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to replace target file: ")));
                }
            }
            if (!this.f69176.mo24646(abstractC20745)) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to rename file to target: ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47717(long j) {
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            if (j < 1048576) {
                return String.format("%.2fKB", Double.valueOf(j / 1024.0d));
            }
            return j < 1073741824 ? String.format("%.2fMB", Double.valueOf(j / 1048576.0d)) : String.format("%.2fGB", Double.valueOf(j / 1.073741824E9d));
        }
        return j + "B";
    }
}
