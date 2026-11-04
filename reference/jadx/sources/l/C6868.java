package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.k;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6868 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f22800;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f22801;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Supplier f22802;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f22803;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f22804;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22805;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f22806;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f22807;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f22808;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f22809;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f22810;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f22811 = f22799.incrementAndGet();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f22812;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f22813;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f22814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f22815;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final RunnableC9104 f22816;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f22799 = new AtomicLong();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final ArrayDeque f22798 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m19124() {
        return this.f22809;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19125(int i) {
        this.f22801 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19126(String str) {
        long jLongValue = 0;
        if (this.f22804 < 0 && !this.f22809.equals(str)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            LinkedHashMap linkedHashMap = this.f22813;
            String str2 = this.f22809;
            Long l2 = (Long) linkedHashMap.get(str2);
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            linkedHashMap.put(str2, Long.valueOf((jLongValue + jUptimeMillis) - this.f22810));
            this.f22809 = str;
            this.f22810 = jUptimeMillis;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19129() {
        if (this.f22812 < 0) {
            this.f22812 = SystemClock.uptimeMillis() - this.f22808;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized String m19130() {
        StringBuilder sb;
        long jUptimeMillis = this.f22804;
        if (jUptimeMillis < 0) {
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        sb = new StringBuilder("id=");
        sb.append(this.f22811);
        sb.append(" mode=");
        sb.append(this.f22806);
        sb.append(" state=");
        sb.append(this.f22815);
        sb.append(" outcome=");
        sb.append(this.f22803);
        sb.append(" totalMs=");
        sb.append(jUptimeMillis - this.f22808);
        sb.append(" slow=");
        sb.append(jUptimeMillis - this.f22808 >= 2000);
        sb.append(" textChars=");
        sb.append(this.f22801);
        sb.append(" viewportReadyMs=");
        sb.append(this.f22812);
        sb.append(" failure=");
        sb.append(this.f22814);
        sb.append(" previousCloseFailures=");
        sb.append(this.f22805);
        sb.append(" stage=");
        sb.append(this.f22809);
        sb.append(" phasesMs={");
        for (Map.Entry entry : this.f22813.entrySet()) {
            long jLongValue = ((Long) entry.getValue()).longValue();
            if (this.f22804 < 0 && ((String) entry.getKey()).equals(this.f22809)) {
                jLongValue += jUptimeMillis - this.f22810;
            }
            sb.append((String) entry.getKey());
            sb.append(a.h);
            sb.append(jLongValue);
            sb.append(',');
        }
        if (this.f22804 < 0 && !this.f22813.containsKey(this.f22809)) {
            sb.append(this.f22809);
            sb.append(a.h);
            sb.append(jUptimeMillis - this.f22810);
            sb.append(',');
        }
        sb.append('}');
        if (this.f22800 != null) {
            sb.append("\npreviousCloseFailure=");
            sb.append(this.f22800);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Runnable, l.ۡۗ᩸] */
    public C6868(String str, String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f22808 = jUptimeMillis;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f22807 = handler;
        ?? r3 = new Runnable() { // from class: l.ۡۗ᩸
            @Override // java.lang.Runnable
            public final void run() {
                C6868.m19122(this.f29575);
            }
        };
        this.f22816 = r3;
        this.f22813 = new LinkedHashMap();
        this.f22809 = "initializing";
        this.f22803 = "pending";
        this.f22814 = "none";
        this.f22810 = jUptimeMillis;
        this.f22804 = -1L;
        this.f22812 = -1L;
        this.f22801 = -1;
        this.f22806 = str;
        this.f22815 = str2;
        handler.postDelayed(r3, 2000L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19128(Supplier supplier) {
        this.f22802 = supplier;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m19122(C6868 c6868) {
        synchronized (c6868) {
            if (c6868.f22804 >= 0) {
                return;
            }
            String strM19130 = c6868.m19130();
            if (c6868.f22802 != null) {
                try {
                    strM19130 = strM19130 + "\n" + ((String) c6868.f22802.get());
                } catch (RuntimeException e) {
                    strM19130 = strM19130 + "\ndiagnosticsError=" + e;
                }
            }
            m19120("slow_pending", strM19130);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19131(Throwable th) {
        synchronized (this) {
            if (this.f22804 >= 0) {
                return;
            }
            this.f22805++;
            this.f22800 = Log.getStackTraceString(th);
            m19120("previous_close_failed", m19130());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19127(Throwable th) {
        String str;
        while ((th instanceof C3552) && th.getCause() != null) {
            th = th.getCause();
        }
        synchronized (this) {
            long jLongValue = 0;
            if (this.f22804 >= 0) {
                return;
            }
            this.f22804 = SystemClock.uptimeMillis();
            LinkedHashMap linkedHashMap = this.f22813;
            String str2 = this.f22809;
            Long l2 = (Long) linkedHashMap.get(str2);
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            linkedHashMap.put(str2, Long.valueOf((jLongValue + this.f22804) - this.f22810));
            this.f22814 = th == null ? "none" : th.getClass().getName();
            if (th == null) {
                str = "success";
            } else {
                str = th instanceof CancellationException ? "canceled" : k.j;
            }
            this.f22803 = str;
            String strM19130 = m19130();
            this.f22807.removeCallbacks(this.f22816);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f22802 = null;
            } else {
                this.f22807.post(new RunnableC2393(0, this));
            }
            m19120("finished", strM19130);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19120(String str, String str2) {
        String strM = ExternalValue$$ExternalSyntheticOutline0.m("text-load event=", str, " ", str2);
        ArrayDeque arrayDeque = f22798;
        synchronized (arrayDeque) {
            if (arrayDeque.size() == 32) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(strM);
        }
        C20653.m47269(strM);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m19123() {
        String string;
        ArrayDeque<String> arrayDeque = f22798;
        synchronized (arrayDeque) {
            StringBuilder sb = new StringBuilder();
            for (String str : arrayDeque) {
                if (sb.length() != 0) {
                    sb.append("\n\n");
                }
                sb.append(str);
            }
            string = sb.toString();
        }
        return string;
    }
}
