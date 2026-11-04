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

/* JADX INFO: renamed from: l.ܰ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes5.dex */
public final class C14245 implements InterfaceC10756 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f45004;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f45005;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f45006;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18961 f45007;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21945 f45008;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public HandlerThread f45009;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3299 f45010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24183 f45011;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HandlerC12008 f45012;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f45013;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f45014;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f45015;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20738 f45016;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f45017;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Looper f45018;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final UUID f45019;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19290 f45020;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC20213 f45021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45022;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC4944 f45023;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6283 f45024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC3059 f45025;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HandlerC23943 f45026;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f45027;

    public C14245(UUID uuid, InterfaceC24183 interfaceC24183, InterfaceC3059 interfaceC3059, InterfaceC20213 interfaceC20213, List list, boolean z, boolean z2, byte[] bArr, HashMap map, C0316 c0316, Looper looper, InterfaceC4365 interfaceC4365, C20738 c20738) {
        this.f45019 = uuid;
        this.f45025 = interfaceC3059;
        this.f45021 = interfaceC20213;
        this.f45011 = interfaceC24183;
        this.f45017 = z;
        this.f45015 = z2;
        if (bArr == null) {
            list.getClass();
            this.f45006 = C4681.unmodifiableList(list);
        } else {
            this.f45027 = bArr;
            this.f45006 = null;
        }
        this.f45013 = map;
        this.f45007 = c0316;
        this.f45020 = new C19290();
        this.f45004 = interfaceC4365;
        this.f45016 = c20738;
        this.f45022 = 2;
        this.f45018 = looper;
        this.f45026 = new HandlerC23943(this, looper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34586(byte[] bArr) {
        m34577();
        return Arrays.equals(this.f45014, bArr);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34587() {
        C6283 c6283Mo38103 = this.f45011.mo38103();
        this.f45024 = c6283Mo38103;
        HandlerC12008 handlerC12008 = this.f45012;
        String str = C7116.f23455;
        c6283Mo38103.getClass();
        handlerC12008.getClass();
        handlerC12008.obtainMessage(1, new C6043(C14368.m34811(), true, SystemClock.elapsedRealtime(), c6283Mo38103)).sendToTarget();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34588() {
        if (m34579()) {
            m34575(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34585(Exception exc, boolean z) {
        m34572(z ? 1 : 3, exc);
    }

    @Override // l.InterfaceC10756
    public final int getState() {
        m34577();
        return this.f45022;
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo27416() {
        m34577();
        return this.f45017;
    }

    @Override // l.InterfaceC10756
    public final C21945 getError() {
        m34577();
        if (this.f45022 == 1) {
            return this.f45008;
        }
        return null;
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ۙ */
    public final UUID mo27411() {
        m34577();
        return this.f45019;
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC4944 mo27414() {
        m34577();
        return this.f45023;
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27413(String str) {
        m34577();
        byte[] bArr = this.f45014;
        C20782.m47566(bArr);
        return this.f45011.mo38100(str, bArr);
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ۙ */
    public final void mo27412(C12994 c12994) {
        m34577();
        if (this.f45005 < 0) {
            C1896.m6515("Session reference count less than zero: " + this.f45005);
            this.f45005 = 0;
        }
        C19290 c19290 = this.f45020;
        if (c12994 != null) {
            c19290.m44655(c12994);
        }
        int i = this.f45005 + 1;
        this.f45005 = i;
        if (i == 1) {
            C20782.m47568(this.f45022 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f45009 = handlerThread;
            handlerThread.start();
            this.f45012 = new HandlerC12008(this, this.f45009.getLooper());
            if (m34579()) {
                m34575(true);
            }
        } else if (c12994 != null && m34580() && c19290.m44657(c12994) == 1) {
            c12994.m32408(this.f45022);
        }
        C6789 c6789 = ((C8280) this.f45021).f27239;
        if (c6789.f22620 != -9223372036854775807L) {
            c6789.f22633.remove(this);
            Handler handler = c6789.f22629;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // l.InterfaceC10756
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27415(C12994 c12994) {
        m34577();
        int i = this.f45005;
        if (i <= 0) {
            C1896.m6515("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f45005 = i2;
        if (i2 == 0) {
            this.f45022 = 0;
            String str = C7116.f23455;
            this.f45026.removeCallbacksAndMessages(null);
            this.f45012.m30196();
            this.f45012 = null;
            this.f45009.quit();
            this.f45009 = null;
            this.f45023 = null;
            this.f45008 = null;
            this.f45010 = null;
            this.f45024 = null;
            byte[] bArr = this.f45014;
            if (bArr != null) {
                this.f45011.mo38107(bArr);
                this.f45014 = null;
            }
        }
        if (c12994 != null) {
            C19290 c19290 = this.f45020;
            c19290.m44656(c12994);
            if (c19290.m44657(c12994) == 0) {
                c12994.m32412();
            }
        }
        int i3 = this.f45005;
        C6789 c6789 = ((C8280) this.f45021).f27239;
        if (i3 == 1 && c6789.f22625 > 0 && c6789.f22620 != -9223372036854775807L) {
            c6789.f22633.add(this);
            Handler handler = c6789.f22629;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: l.ۖ֨ۙ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7485.mo27415((C12994) null);
                }
            }, this, SystemClock.uptimeMillis() + c6789.f22620);
        } else if (i3 == 0) {
            c6789.f22627.remove(this);
            if (c6789.f22630 == this) {
                c6789.f22630 = null;
            }
            if (c6789.f22624 == this) {
                c6789.f22624 = null;
            }
            c6789.f22622.m24080(this);
            if (c6789.f22620 != -9223372036854775807L) {
                Handler handler2 = c6789.f22629;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c6789.f22633.remove(this);
            }
        }
        c6789.m18941();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m34579() {
        InterfaceC3059 interfaceC3059 = this.f45025;
        InterfaceC24183 interfaceC24183 = this.f45011;
        if (m34580()) {
            return true;
        }
        try {
            byte[] bArrMo38102 = interfaceC24183.mo38102();
            this.f45014 = bArrMo38102;
            interfaceC24183.mo38098(bArrMo38102, this.f45016);
            this.f45023 = interfaceC24183.mo38101(this.f45014);
            this.f45022 = 3;
            Iterator it = this.f45020.m44658().iterator();
            while (it.hasNext()) {
                ((C12994) it.next()).m32408(3);
            }
            this.f45014.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((C9025) interfaceC3059).m24081(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (C17469.m40974(e)) {
                ((C9025) interfaceC3059).m24081(this);
                return false;
            }
            m34572(1, e);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (C17469.m40974(e)) {
                ((C9025) interfaceC3059).m24081(this);
                return false;
            }
            m34572(1, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34582(C14245 c14245, Object obj, Object obj2) {
        InterfaceC3059 interfaceC3059 = c14245.f45025;
        if (obj == c14245.f45024) {
            if (c14245.f45022 == 2 || c14245.m34580()) {
                c14245.f45024 = null;
                if (obj2 instanceof Exception) {
                    ((C9025) interfaceC3059).m24079((Exception) obj2, false);
                    return;
                }
                try {
                    c14245.f45011.mo38104((byte[]) obj2);
                    ((C9025) interfaceC3059).m24078();
                } catch (Exception e) {
                    ((C9025) interfaceC3059).m24079(e, true);
                }
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34575(boolean z) {
        long jMin;
        long j;
        if (this.f45015) {
            return;
        }
        byte[] bArr = this.f45014;
        String str = C7116.f23455;
        boolean z2 = true;
        if (this.f45027 == null) {
            m34576(bArr, 1, z);
            return;
        }
        int i = this.f45022;
        InterfaceC24183 interfaceC24183 = this.f45011;
        if (i != 4) {
            try {
                interfaceC24183.mo38099(this.f45014, this.f45027);
            } catch (Exception | NoSuchMethodError e) {
                m34572(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (C19158.f61988.equals(this.f45019)) {
            m34577();
            byte[] bArr2 = this.f45014;
            Pair pair = null;
            Map mapMo38094 = bArr2 == null ? null : interfaceC24183.mo38094(bArr2);
            if (mapMo38094 != null) {
                long j2 = -9223372036854775807L;
                try {
                    String str2 = (String) mapMo38094.get("LicenseDurationRemaining");
                    j = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str3 = (String) mapMo38094.get("PlaybackDurationRemaining");
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
            jMin = C25227.FOREVER_NS;
        }
        if (jMin <= 60) {
            C1896.m6511("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m34576(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            m34572(2, new C7774());
            return;
        }
        this.f45022 = 4;
        Iterator it = this.f45020.m44658().iterator();
        while (it.hasNext()) {
            ((C12994) it.next()).m32413();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34576(byte[] bArr, int i, boolean z) {
        try {
            C3299 c3299Mo38095 = this.f45011.mo38095(bArr, this.f45006, i, this.f45013);
            this.f45010 = c3299Mo38095;
            HandlerC12008 handlerC12008 = this.f45012;
            String str = C7116.f23455;
            c3299Mo38095.getClass();
            handlerC12008.getClass();
            handlerC12008.obtainMessage(2, new C6043(C14368.m34811(), z, SystemClock.elapsedRealtime(), c3299Mo38095)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m34573(e, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34574(C14245 c14245, Object obj, Object obj2) {
        C19290 c19290 = c14245.f45020;
        InterfaceC24183 interfaceC24183 = c14245.f45011;
        if (obj == c14245.f45010 && c14245.m34580()) {
            c14245.f45010 = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c14245.m34573((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrMo38105 = interfaceC24183.mo38105(c14245.f45014, (byte[]) obj2);
                if (c14245.f45027 != null && bArrMo38105 != null && bArrMo38105.length != 0) {
                    c14245.f45027 = bArrMo38105;
                }
                c14245.f45022 = 4;
                Iterator it = c19290.m44658().iterator();
                while (it.hasNext()) {
                    ((C12994) it.next()).m32407();
                }
            } catch (Exception | NoSuchMethodError e) {
                c14245.m34573(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34584(int i) {
        if (i == 2 && this.f45022 == 4) {
            String str = C7116.f23455;
            m34575(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34573(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C17469.m40974(th)) {
            ((C9025) this.f45025).m24081(this);
        } else {
            m34572(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34572(int i, Throwable th) {
        int iM19514;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            iM19514 = C7116.m19514(C7116.m19468(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (Build.VERSION.SDK_INT >= 23 && C16723.m39489(th)) {
            iM19514 = 6006;
        } else if ((th instanceof NotProvisionedException) || C17469.m40974(th)) {
            iM19514 = 6002;
        } else if (th instanceof DeniedByServerException) {
            iM19514 = 6007;
        } else if (th instanceof C1062) {
            iM19514 = 6001;
        } else if (th instanceof C7534) {
            iM19514 = 6003;
        } else if (th instanceof C7774) {
            iM19514 = 6008;
        } else if (i == 1) {
            iM19514 = 6006;
        } else if (i == 2) {
            iM19514 = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iM19514 = 6002;
        }
        this.f45008 = new C21945(iM19514, th);
        C1896.m6516("DRM session error", th);
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                if (!C17469.m40976(th) && !C17469.m40974(th)) {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
        } else {
            Iterator it = this.f45020.m44658().iterator();
            while (it.hasNext()) {
                ((C12994) it.next()).m32410((Exception) th);
            }
        }
        if (this.f45022 != 4) {
            this.f45022 = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m34580() {
        int i = this.f45022;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m34577() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f45018;
        if (threadCurrentThread != looper.getThread()) {
            C1896.m6514("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
