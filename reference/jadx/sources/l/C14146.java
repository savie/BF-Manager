package l;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ܰ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14146 implements InterfaceC19790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final UUID f46419;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f46420;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9912 f46421;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f46422;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1173 f46423;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13004 f46424;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3560 f46425;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HandlerC3187 f46426;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f46427;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public HandlerC1776 f46428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerThread f46429;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C24023 f46430;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8501 f46431;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC18854 f46432;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f46433;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f46434;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9724 f46435;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23650 f46436;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC14478 f46437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46438;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f46439;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Looper f46440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f46441;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f46442;

    public C14146(UUID uuid, InterfaceC3560 interfaceC3560, InterfaceC23650 interfaceC23650, InterfaceC14478 interfaceC14478, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C5407 c5407, Looper looper, InterfaceC14113 interfaceC14113, C9724 c9724) {
        this.f46419 = uuid;
        this.f46436 = interfaceC23650;
        this.f46437 = interfaceC14478;
        this.f46425 = interfaceC3560;
        this.f46433 = z;
        this.f46441 = z2;
        if (bArr == null) {
            list.getClass();
            this.f46439 = C0561.unmodifiableList(list);
        } else {
            this.f46442 = bArr;
            this.f46439 = null;
        }
        this.f46420 = map;
        this.f46423 = c5407;
        this.f46424 = new C13004();
        this.f46422 = interfaceC14113;
        this.f46435 = c9724;
        this.f46438 = 2;
        this.f46440 = looper;
        this.f46426 = new HandlerC3187(this, looper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34218(byte[] bArr) {
        m34211();
        return Arrays.equals(this.f46434, bArr);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34219() {
        C9912 c9912Mo8051 = this.f46425.mo8051();
        this.f46421 = c9912Mo8051;
        HandlerC1776 handlerC1776 = this.f46428;
        String str = C17983.f57504;
        c9912Mo8051.getClass();
        handlerC1776.getClass();
        handlerC1776.obtainMessage(1, new C9539(C13863.m33700(), true, SystemClock.elapsedRealtime(), c9912Mo8051)).sendToTarget();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34215() {
        if (m34202()) {
            m34208(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34217(Exception exc, boolean z) {
        m34205(z ? 1 : 3, exc);
    }

    @Override // l.InterfaceC19790
    public final int getState() {
        m34211();
        return this.f46438;
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo28387() {
        m34211();
        return this.f46433;
    }

    @Override // l.InterfaceC19790
    public final C8501 getError() {
        m34211();
        if (this.f46438 == 1) {
            return this.f46431;
        }
        return null;
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ۙ */
    public final UUID mo28382() {
        m34211();
        return this.f46419;
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC18854 mo28385() {
        m34211();
        return this.f46432;
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28384(String str) {
        m34211();
        byte[] bArr = this.f46434;
        C2023.m6508(bArr);
        return this.f46425.mo8048(str, bArr);
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ۙ */
    public final void mo28383(C21200 c21200) {
        m34211();
        if (this.f46427 < 0) {
            C0303.m1853("Session reference count less than zero: " + this.f46427);
            this.f46427 = 0;
        }
        C13004 c13004 = this.f46424;
        if (c21200 != null) {
            c13004.m32171(c21200);
        }
        int i = this.f46427 + 1;
        this.f46427 = i;
        if (i == 1) {
            C2023.m6510(this.f46438 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f46429 = handlerThread;
            handlerThread.start();
            this.f46428 = new HandlerC1776(this, this.f46429.getLooper());
            if (m34202()) {
                m34208(true);
            }
        } else if (c21200 != null && m34214() && c13004.m32173(c21200) == 1) {
            c21200.m47658(this.f46438);
        }
        C21906 c21906 = ((C15557) this.f46437).f50611;
        if (c21906.f71089 != -9223372036854775807L) {
            c21906.f71074.remove(this);
            Handler handler = c21906.f71085;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // l.InterfaceC19790
    /* JADX INFO: renamed from: ܰ */
    public final void mo28386(C21200 c21200) {
        m34211();
        int i = this.f46427;
        if (i <= 0) {
            C0303.m1853("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f46427 = i2;
        if (i2 == 0) {
            this.f46438 = 0;
            String str = C17983.f57504;
            this.f46426.removeCallbacksAndMessages(null);
            this.f46428.m5819();
            this.f46428 = null;
            this.f46429.quit();
            this.f46429 = null;
            this.f46432 = null;
            this.f46431 = null;
            this.f46430 = null;
            this.f46421 = null;
            byte[] bArr = this.f46434;
            if (bArr != null) {
                this.f46425.mo8041(bArr);
                this.f46434 = null;
            }
        }
        if (c21200 != null) {
            C13004 c13004 = this.f46424;
            c13004.m32172(c21200);
            if (c13004.m32173(c21200) == 0) {
                c21200.m47662();
            }
        }
        int i3 = this.f46427;
        C21906 c21906 = ((C15557) this.f46437).f50611;
        if (i3 == 1 && c21906.f71078 > 0 && c21906.f71089 != -9223372036854775807L) {
            c21906.f71074.add(this);
            Handler handler = c21906.f71085;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: l.᩺᩻ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75594.mo28386((C21200) null);
                }
            }, this, SystemClock.uptimeMillis() + c21906.f71089);
        } else if (i3 == 0) {
            c21906.f71084.remove(this);
            if (c21906.f71083 == this) {
                c21906.f71083 = null;
            }
            if (c21906.f71075 == this) {
                c21906.f71075 = null;
            }
            c21906.f71079.m18960(this);
            if (c21906.f71089 != -9223372036854775807L) {
                Handler handler2 = c21906.f71085;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c21906.f71074.remove(this);
            }
        }
        c21906.m48719();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m34202() {
        InterfaceC23650 interfaceC23650 = this.f46436;
        InterfaceC3560 interfaceC3560 = this.f46425;
        if (m34214()) {
            return true;
        }
        try {
            byte[] bArrMo8050 = interfaceC3560.mo8050();
            this.f46434 = bArrMo8050;
            interfaceC3560.mo8046(bArrMo8050, this.f46435);
            this.f46432 = interfaceC3560.mo8049(this.f46434);
            this.f46438 = 3;
            Iterator it = this.f46424.m32174().iterator();
            while (it.hasNext()) {
                ((C21200) it.next()).m47658(3);
            }
            this.f46434.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((C7089) interfaceC23650).m18961(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (C17672.m41148(e)) {
                ((C7089) interfaceC23650).m18961(this);
                return false;
            }
            m34205(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (C17672.m41148(e)) {
                ((C7089) interfaceC23650).m18961(this);
                return false;
            }
            m34205(1, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m34213(C14146 c14146, Object obj, Object obj2) {
        InterfaceC23650 interfaceC23650 = c14146.f46436;
        if (obj == c14146.f46421) {
            if (c14146.f46438 == 2 || c14146.m34214()) {
                c14146.f46421 = null;
                if (obj2 instanceof Exception) {
                    ((C7089) interfaceC23650).m18959((Exception) obj2, false);
                    return;
                }
                try {
                    c14146.f46425.mo8052((byte[]) obj2);
                    ((C7089) interfaceC23650).m18958();
                } catch (Exception e) {
                    ((C7089) interfaceC23650).m18959(e, true);
                }
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34208(boolean z) {
        long jMin;
        long j;
        if (this.f46441) {
            return;
        }
        byte[] bArr = this.f46434;
        String str = C17983.f57504;
        boolean z2 = true;
        if (this.f46442 == null) {
            m34209(bArr, 1, z);
            return;
        }
        int i = this.f46438;
        InterfaceC3560 interfaceC3560 = this.f46425;
        if (i != 4) {
            try {
                interfaceC3560.mo8047(this.f46434, this.f46442);
            } catch (Exception | NoSuchMethodError e) {
                m34205(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (C1297.f5562.equals(this.f46419)) {
            m34211();
            byte[] bArr2 = this.f46434;
            Pair pair = null;
            Map mapMo8042 = bArr2 == null ? null : interfaceC3560.mo8042(bArr2);
            if (mapMo8042 != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapMo8042.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapMo8042.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j2 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = C17492.FOREVER_NS;
        }
        if (jMin <= 60) {
            C0303.m1849("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m34209(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            m34205(2, new C22341());
            return;
        }
        this.f46438 = 4;
        Iterator it = this.f46424.m32174().iterator();
        while (it.hasNext()) {
            ((C21200) it.next()).m47663();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34209(byte[] bArr, int i, boolean z) {
        try {
            C24023 c24023Mo8043 = this.f46425.mo8043(bArr, this.f46439, i, this.f46420);
            this.f46430 = c24023Mo8043;
            HandlerC1776 handlerC1776 = this.f46428;
            String str = C17983.f57504;
            c24023Mo8043.getClass();
            handlerC1776.getClass();
            handlerC1776.obtainMessage(2, new C9539(C13863.m33700(), z, SystemClock.elapsedRealtime(), c24023Mo8043)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m34206(e, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34207(C14146 c14146, Object obj, Object obj2) {
        C13004 c13004 = c14146.f46424;
        InterfaceC3560 interfaceC3560 = c14146.f46425;
        if (obj == c14146.f46430 && c14146.m34214()) {
            c14146.f46430 = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c14146.m34206((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrMo8053 = interfaceC3560.mo8053(c14146.f46434, (byte[]) obj2);
                if (c14146.f46442 != null && bArrMo8053 != null && bArrMo8053.length != 0) {
                    c14146.f46442 = bArrMo8053;
                }
                c14146.f46438 = 4;
                Iterator it = c13004.m32174().iterator();
                while (it.hasNext()) {
                    ((C21200) it.next()).m47657();
                }
            } catch (Exception | NoSuchMethodError e) {
                c14146.m34206(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34216(int i) {
        if (i == 2 && this.f46438 == 4) {
            String str = C17983.f57504;
            m34208(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34206(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C17672.m41148(th)) {
            ((C7089) this.f46436).m18961(this);
        } else {
            m34205(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34205(int i, Throwable th) {
        int iM41807;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iM41807 = C17983.m41807(C17983.m41821(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (Build.VERSION.SDK_INT >= 23 && C12734.m31639(th)) {
            iM41807 = 6006;
        } else if ((th instanceof NotProvisionedException) || C17672.m41148(th)) {
            iM41807 = 6002;
        } else if (th instanceof DeniedByServerException) {
            iM41807 = 6007;
        } else if (th instanceof C3995) {
            iM41807 = 6001;
        } else if (th instanceof C22612) {
            iM41807 = 6003;
        } else if (th instanceof C22341) {
            iM41807 = 6008;
        } else if (i == 1) {
            iM41807 = 6006;
        } else if (i == 2) {
            iM41807 = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iM41807 = 6002;
        }
        this.f46431 = new C8501(iM41807, th);
        C0303.m1854("DRM session error", th);
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                if (!C17672.m41150(th) && !C17672.m41148(th)) {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
        } else {
            Iterator it = this.f46424.m32174().iterator();
            while (it.hasNext()) {
                ((C21200) it.next()).m47660((Exception) th);
            }
        }
        if (this.f46438 != 4) {
            this.f46438 = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m34214() {
        int i = this.f46438;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m34211() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f46440;
        if (threadCurrentThread != looper.getThread()) {
            C0303.m1852("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
