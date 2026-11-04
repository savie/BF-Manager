package l;

import android.os.Bundle;
import android.view.View;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܶ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16320 implements InterfaceC2984 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC23690 f52974;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f52976;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6868 f52979;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3354 f52980;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22310 f52981;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13950 f52982;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19547 f52984;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5968 f52985;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f52986;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17505 f52987;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1863 f52988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C8950 f52989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f52990;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52991;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f52975 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f52977 = FutureC23690.m52928(0L);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public WeakReference f52978 = new WeakReference(null);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile String f52983 = "active";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38737(C8950 c8950) {
        if (this.f52989 != null || this.f52976 != null || this.f52986 != null) {
            throw new IllegalStateException("Session directory lease is already owned");
        }
        this.f52989 = c8950;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0175 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0192 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01aa */
    /* JADX WARN: Code duplicated, block: B:133:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16320 m38711(l.InterfaceC24329 r20, l.C0352 r21, l.C2589 r22, java.util.concurrent.Executor r23, int r24, l.InterfaceC7509 r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16320.m38711(l.᩺۬᩹, l.֡ۢ᩸, l.ۖۢ᩸, java.util.concurrent.Executor, int, l.۟֡֫, java.lang.String):l.ܶ᩵᩸");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38734(String str) {
        C6868 c6868 = this.f52979;
        if (c6868 != null) {
            c6868.m19126(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38741(C24132 c24132) {
        this.f52978 = new WeakReference(c24132);
        m38735("session_owner", this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38735(String str, InterfaceC2984 interfaceC2984) {
        C8950 c8950 = this.f52989;
        if (c8950 != null) {
            c8950.m23930(str, interfaceC2984);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m38742() {
        return this.f52983;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38736(C2239 c2239) {
        C8950 c8950 = this.f52989;
        if (c8950 != null) {
            c8950.m23932(c2239);
        }
    }

    @Override // l.InterfaceC2984
    /* JADX INFO: renamed from: ۙ */
    public final String mo3661() {
        String string;
        C24132 c24132 = (C24132) this.f52978.get();
        StringBuilder sb = new StringBuilder("owner=");
        sb.append(C8950.m23919(this));
        sb.append("\nreleaseStage=");
        sb.append(this.f52983);
        sb.append("\n");
        sb.append(C8950.m23918((View) c24132));
        if (c24132 == null) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder("viewOwnsText=");
            sb2.append(c24132.m54021() == this.f52980);
            sb2.append("\n");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append("\n");
        sb.append(c24132 == null ? "view=unavailable\n" : c24132.m53973());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38715(Throwable th) {
        C8950 c8950;
        synchronized (this) {
            c8950 = this.f52989;
            this.f52989 = null;
        }
        if (c8950 != null) {
            c8950.m23931(th);
        }
    }

    public C16320(C17505 c17505, C3354 c3354, C19547 c19547, C5968 c5968) {
        this.f52987 = c17505;
        this.f52980 = c3354;
        this.f52984 = c19547;
        this.f52985 = c5968;
        this.f52988 = new C1863(c3354);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16320 m38712(InterfaceC24329 interfaceC24329, C19304 c19304) {
        C17505 c17505M41054 = C17505.m41054(interfaceC24329, c19304.f62382, c19304.f62383);
        c17505M41054.m41123();
        C16320 c16320 = new C16320(c17505M41054, new C3354(c17505M41054), null, new C5968(c17505M41054, interfaceC24329, c19304.f62382, c19304.f62384));
        c16320.f52985.f20454 = c19304;
        return c16320;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38732(int i, int i2, CharSequence charSequence) {
        C3354 c3354 = this.f52980;
        c3354.m11050(c3354.length(), c3354.length(), charSequence, i, i2);
        this.f52987.m41111();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38739(C12834 c12834, Bundle bundle, C23056 c23056, String str, C19304 c19304, InterfaceC7509 interfaceC7509, int i) {
        C17505 c17505 = this.f52987;
        c17505.m41109();
        C3354 c3354 = this.f52980;
        c3354.setSelection(i, i);
        c3354.mo11051(false);
        C7305 c7305M41121 = c17505.m41121();
        try {
            C10596 c10596M31876 = c12834.m31876(c7305M41121, bundle, c23056, str, 0, 0, true);
            c7305M41121.close();
            this.f52985.getClass();
            m38714(bundle, c23056, c10596M31876, c19304, 8388608, interfaceC7509, false);
        } catch (Throwable th) {
            try {
                c7305M41121.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38740(C13950 c13950, int i, int i2) {
        this.f52982 = c13950;
        this.f52991 = i;
        Bundle bundleM34019 = c13950.m34019();
        C23056 c23056M34018 = c13950.m34016() == 1 ? this.f52984.f63045 : c13950.m34018();
        C17505 c17505 = this.f52987;
        C7305 c7305M41121 = c17505.m41121();
        try {
            C12834 c12834 = this.f52984.f63046;
            C12834 c12834M31878 = c12834.m31878(c7305M41121, bundleM34019, c23056M34018, C14916.m35893(bundleM34019, c12834.f41119.m30713(c13950.m34021()), c7305M41121.length()), i2);
            try {
                C19547 c19547M31880 = c12834M31878.m31880(c17505, c23056M34018);
                C19547 c19547 = this.f52984;
                this.f52984 = c19547M31880;
                if (c19547 != null) {
                    c19547.close();
                }
                c12834M31878.close();
                c7305M41121.close();
                C5968 c5968 = this.f52985;
                c5968.f20451 = c13950;
                c5968.f20449 = i;
            } catch (Throwable th) {
                try {
                    c12834M31878.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c7305M41121.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38731(int i) {
        Bundle bundleM11509 = this.f52984.f63046.f41124.m11509();
        bundleM11509.putInt("textPageSize", i);
        C17505 c17505 = this.f52987;
        C7305 c7305M41121 = c17505.m41121();
        try {
            C19547 c19547 = this.f52984;
            C12834 c12834 = c19547.f63046;
            C12834 c12834M31878 = c12834.m31878(c7305M41121, bundleM11509, c19547.f63045, c12834.f41119, 8388608);
            try {
                C19547 c19547M31880 = c12834M31878.m31880(c17505, this.f52984.f63045);
                C19547 c19548 = this.f52984;
                this.f52984 = c19547M31880;
                if (c19548 != null) {
                    c19548.close();
                }
                c12834M31878.close();
                c7305M41121.close();
            } catch (Throwable th) {
                try {
                    c12834M31878.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c7305M41121.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38738(C12303 c12303, byte[] bArr, byte[] bArr2, C19304 c19304, int i) {
        Bundle bundleM11509 = this.f52984.f63046.f41124.m11509();
        C7305 c7305M41121 = this.f52987.m41121();
        try {
            C19547 c19547 = this.f52984;
            C10596 c10596M31868 = C12834.m31868(c7305M41121, bundleM11509, c19547.f63045, c19547.f63046.f41119.m30709(c12303), bArr, bArr2, i);
            c7305M41121.close();
            this.f52985.getClass();
            m38714(bundleM11509, this.f52984.f63045, c10596M31868, c19304, i, (InterfaceC7509) new C8730(), false);
        } catch (Throwable th) {
            try {
                c7305M41121.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16320 m38728(InterfaceC24329 interfaceC24329, AbstractC2720 abstractC2720, boolean z, int i, C19304 c19304, InterfaceC7509 interfaceC7509, boolean z2) throws IOException {
        C10596 c10596M31877;
        Bundle bundleM11509 = this.f52984.f63046.f41124.m11509();
        boolean z3 = bundleM11509.getBoolean("e2SourcePending");
        C17505 c17505 = this.f52987;
        if (z3 || !c17505.m41081().m48300()) {
            if (z3) {
                m38734("detecting_source_format");
                C5902 c5902M56478 = C25294.m56478(abstractC2720, z, i, interfaceC7509);
                m38717(interfaceC7509);
                if (c5902M56478 != null) {
                    m38716(abstractC2720, false, c5902M56478, 0, 0, c19304, interfaceC7509, z2);
                    return this;
                }
                if (bundleM11509.getInt("textPageSize") <= 0 && this.f52982 == null) {
                    m38734("opening_source");
                    this.f52981 = C22310.m50364(c17505, new C7459(abstractC2720), c19304.f62382, i, interfaceC7509);
                } else {
                    return C13950.m33997(this, interfaceC24329, abstractC2720, i, c19304, interfaceC7509, -1L);
                }
            } else {
                m38734("resuming_source");
                InterfaceC23473 c7459 = new C7459(abstractC2720);
                if (interfaceC7509 instanceof C16563) {
                    c7459 = new C1648(c7459, interfaceC7509);
                }
                this.f52981 = C22310.m50363(c17505, c7459, this.f52984.f63045.f74803);
            }
            m38734("reading_source_prefix");
            String strM48296 = this.f52981.m50369().m48296();
            String strM30706 = z3 ? strM48296 : this.f52984.f63046.f41119.m30706(strM48296);
            C24482 c24482M50368 = this.f52981.m50368();
            try {
                m38717(interfaceC7509);
                C3354 c3354 = this.f52980;
                if (c24482M50368 != null) {
                    InterfaceC18186 interfaceC18186M15347 = c3354.m15347();
                    C17359.requireNonNull(interfaceC18186M15347);
                    interfaceC18186M15347.mo20307(c24482M50368);
                }
                if (c24482M50368 != null) {
                    c24482M50368.close();
                }
                if (!this.f52981.m50369().m48300() && this.f52981.m50369().m48299() != EnumC14456.LOADING) {
                    throw new IOException("Cannot prepare source text", this.f52981.m50367());
                }
                C23056 c23056M50370 = z3 ? this.f52981.m50370() : this.f52984.f63045;
                if (z3) {
                    c3354.setSelection(0, 0);
                    c3354.mo11051(false);
                }
                bundleM11509.putBoolean("e2SourcePending", false);
                bundleM11509.putBoolean("changed", c3354.isChanged());
                bundleM11509.putBoolean(d.O, false);
                if (z3) {
                    bundleM11509.putLong("fileTime", ((C9431) abstractC2720).f30601.mo4286());
                    bundleM11509.putBoolean("checkFileExists", true);
                }
                String strM48297 = (z3 || strM30706.equals(strM48296)) ? this.f52981.m50369().m48296() : strM30706;
                C7305 c7305M41121 = c17505.m41121();
                try {
                    if (z3) {
                        c10596M31877 = this.f52984.f63046.m31876(c7305M41121, bundleM11509, c23056M50370, strM48297, 0, 0, this.f52981.m50369().m48300());
                    } else {
                        c10596M31877 = this.f52984.f63046.m31877(c7305M41121, bundleM11509, c23056M50370, strM48297, this.f52981.m50369().m48300());
                    }
                    c7305M41121.close();
                    m38714(bundleM11509, c23056M50370, c10596M31877, c19304, 8388608, interfaceC7509, z2 && this.f52981.m50369().m48300());
                    m38734("reading_source_tail");
                    C22310 c22310 = this.f52981;
                    boolean zM48300 = c22310.m50369().m48300();
                    while (c22310.m50369().m48299() == EnumC14456.LOADING) {
                        m38717(interfaceC7509);
                        C24482 c24482M50369 = c22310.m50368();
                        try {
                            m38717(interfaceC7509);
                            if (c24482M50369 != null) {
                                InterfaceC18186 interfaceC18186M15348 = c3354.m15347();
                                C17359.requireNonNull(interfaceC18186M15348);
                                interfaceC18186M15348.mo20307(c24482M50369);
                            }
                            if (c24482M50369 != null) {
                                c24482M50369.close();
                            }
                        } catch (Throwable th) {
                            if (c24482M50369 == null) {
                                throw th;
                            }
                            try {
                                c24482M50369.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    m38717(interfaceC7509);
                    if (!c22310.m50369().m48300()) {
                        throw new IOException("Cannot display incomplete source text", c22310.m50367());
                    }
                    String strM48298 = (z3 || strM30706.equals(strM48296)) ? c22310.m50369().m48296() : strM30706;
                    c22310.close();
                    this.f52981 = null;
                    if (!zM48300) {
                        C7305 c7305M41122 = c17505.m41121();
                        try {
                            C10596 c10596M31878 = this.f52984.f63046.m31877(c7305M41122, bundleM11509, c23056M50370, strM48298, true);
                            c7305M41122.close();
                            m38714(bundleM11509, c23056M50370, c10596M31878, c19304, 8388608, interfaceC7509, z2);
                            return this;
                        } catch (Throwable th3) {
                            try {
                                c7305M41122.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        c7305M41121.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (c24482M50368 == null) {
                    throw th7;
                }
                try {
                    c24482M50368.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m38743() {
        return this.f52977.m52949((InterfaceC25138) new C11845());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38733(Bundle bundle, C23056 c23056, C10596 c10596, C19304 c19304, C8730 c8730) {
        m38714(bundle, c23056, c10596, c19304, 8388608, (InterfaceC7509) c8730, false);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[Catch: all -> 0x00fb, SYNTHETIC, TRY_LEAVE, TryCatch #14 {all -> 0x00fb, blocks: (B:28:0x00b7, B:66:0x00fa, B:65:0x00f7, B:61:0x00f1), top: B:120:0x002d, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:129:? A[Catch: all -> 0x011d, SYNTHETIC, TRY_LEAVE, TryCatch #16 {all -> 0x011d, blocks: (B:3:0x000e, B:31:0x00bf, B:89:0x011c, B:88:0x0119, B:6:0x0015, B:84:0x0113), top: B:123:0x000e, inners: #12 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38714(Bundle bundle, C23056 c23056, C10596 c10596, C19304 c19304, int i, InterfaceC7509 interfaceC7509, boolean z) {
        C8359 c8359;
        Throwable th;
        Throwable th2;
        C12834 c12834;
        C17505 c17505 = this.f52987;
        InterfaceC24329 interfaceC24329M17389 = this.f52985.m17389();
        try {
            C6868 c6868 = this.f52979;
            C8359 c83510 = c6868 == null ? null : new C8359(c6868);
            try {
                try {
                    C7305 c7305M41121 = c17505.m41121();
                    try {
                        C18251 c18251M19990 = c7305M41121.m19990(C1405.m5136(bundle) + X931RNG.BLOCK64_RESEED_MAX);
                        try {
                            try {
                                try {
                                    C12834 c12834M27045 = c10596.m27045(c7305M41121, i);
                                    try {
                                        m38717(interfaceC7509);
                                        try {
                                            c8359 = c83510;
                                            c12834 = c12834M27045;
                                            try {
                                                C5090 c5090M15386 = C5090.m15386(interfaceC24329M17389, c17505.m41108(), new ByteArrayInputStream(c10596.m27046()), c10596.m27046().length, i, c19304.f62382);
                                                C15267 c15267M41110 = c17505.m41110();
                                                try {
                                                    FutureC23690 futureC23690M41117 = c17505.m41117(c15267M41110.m36628(C11557.m29074(c15267M41110.m36624(), c5090M15386, c17505.m41108())));
                                                    this.f52977 = futureC23690M41117;
                                                    if (!z) {
                                                        futureC23690M41117.m52947();
                                                    }
                                                    c15267M41110.close();
                                                    C1405.m5138(interfaceC24329M17389, bundle);
                                                    if (this.f52982 != null) {
                                                        this.f52977.m52947();
                                                        this.f52982.m34013(this.f52991, bundle, this.f52980.isChanged(), c23056.f74803, c12834.f41119.m30706(this.f52982.m34021()));
                                                    }
                                                    C19547 c19547M31880 = c12834.m31880(c17505, c23056);
                                                    C19547 c19547 = this.f52984;
                                                    this.f52984 = c19547M31880;
                                                    if (c19547 != null) {
                                                        c19547.close();
                                                    }
                                                    c12834.close();
                                                    if (c18251M19990 != null) {
                                                        c18251M19990.close();
                                                    }
                                                    c7305M41121.close();
                                                    if (c8359 != null) {
                                                        c8359.close();
                                                    }
                                                    c10596.close();
                                                } catch (Throwable th3) {
                                                    try {
                                                        c15267M41110.close();
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        th3.addSuppressed(th4);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Throwable th6 = th;
                                                try {
                                                    c12834.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            c8359 = c83510;
                                            c12834 = c12834M27045;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        c8359 = c83510;
                                        c12834 = c12834M27045;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    th2 = th;
                                    if (c18251M19990 != null) {
                                        throw th2;
                                    }
                                    try {
                                        c18251M19990.close();
                                        throw th2;
                                    } catch (Throwable th11) {
                                        th2.addSuppressed(th11);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                c8359 = c83510;
                                th2 = th;
                                if (c18251M19990 != null) {
                                    throw th2;
                                }
                                c18251M19990.close();
                                throw th2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            Throwable th14 = th;
                            try {
                                c7305M41121.close();
                                throw th14;
                            } catch (Throwable th15) {
                                th14.addSuppressed(th15);
                                throw th14;
                            }
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        c8359 = c83510;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    th = th;
                    if (c8359 != null) {
                        throw th;
                    }
                    try {
                        c8359.close();
                        throw th;
                    } catch (Throwable th18) {
                        th.addSuppressed(th18);
                        throw th;
                    }
                }
            } catch (Throwable th19) {
                th = th19;
                c8359 = c83510;
                th = th;
                if (c8359 != null) {
                    throw th;
                }
                c8359.close();
                throw th;
            }
        } catch (Throwable th20) {
            try {
                c10596.close();
                throw th20;
            } catch (Throwable th21) {
                th20.addSuppressed(th21);
                throw th20;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m38745() {
        synchronized (this) {
            FutureC23690 futureC23690 = this.f52974;
            if (futureC23690 == null) {
                C22310 c22310 = this.f52981;
                if (c22310 == null) {
                    return FutureC23690.m52928(null);
                }
                FutureC23690 futureC23690M52925 = FutureC23690.m52925(new RunnableC4719(1, c22310), C5261.f18538);
                this.f52974 = futureC23690M52925;
                this.f52981 = null;
                return futureC23690M52925.m52949((InterfaceC25138) new C2764(0));
            }
            return futureC23690.m52949((InterfaceC25138) new C2764(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16320 m38729(InterfaceC24329 interfaceC24329, C9431 c9431, boolean z, boolean z2, int i, int i2, int i3, C19304 c19304, InterfaceC7509 interfaceC7509, boolean z3) throws IOException {
        long jMax;
        C17505 c17505 = this.f52987;
        if (z3) {
            jMax = Math.max(0, c17505.m41103().m48908());
            if (this.f52982 != null) {
                for (int i4 = 0; i4 < this.f52991; i4++) {
                    m38717(interfaceC7509);
                    C15508 c15508M34010 = this.f52982.m34010(i4, c19304);
                    try {
                        jMax += (long) c15508M34010.length();
                        c15508M34010.close();
                    } catch (Throwable th) {
                        try {
                            c15508M34010.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } else {
            jMax = -1;
        }
        long j = jMax;
        m38734("detecting_source_format");
        C5902 c5902M56477 = z ? C25294.m56477() : C25294.m56478(c9431, z2, i, interfaceC7509);
        m38717(interfaceC7509);
        if (c5902M56477 == null && (this.f52982 != null || this.f52984.f63046.f41124.m11509().getInt("textPageSize") > 0)) {
            return C13950.m33997(this, interfaceC24329, c9431, i, c19304, interfaceC7509, j);
        }
        if (this.f52982 != null) {
            return C13950.m33996(this, c9431, z, c5902M56477, c19304, interfaceC7509, j);
        }
        if (c5902M56477 == null) {
            C3354 c3354 = this.f52980;
            c3354.replace(0, c3354.length(), (CharSequence) "");
            c17505.m41109();
            c3354.setSelection(0, 0);
            c3354.mo11051(false);
            Bundle bundleM11509 = this.f52984.f63046.f41124.m11509();
            bundleM11509.putBoolean("e2SourcePending", true);
            C7305 c7305M41121 = c17505.m41121();
            try {
                C12834 c12834 = this.f52984.f63046;
                C12834 c12834M31878 = c12834.m31878(c7305M41121, bundleM11509, (C23056) null, c12834.f41119.m30708(i2, i3, "\n"), 8388608);
                try {
                    C19547 c19547M31880 = c12834M31878.m31880(c17505, (C23056) null);
                    C19547 c19547 = this.f52984;
                    this.f52984 = c19547M31880;
                    if (c19547 != null) {
                        c19547.close();
                    }
                    c12834M31878.close();
                    c7305M41121.close();
                    return m38728(interfaceC24329, (AbstractC2720) c9431, z2, i, c19304, interfaceC7509, true);
                } catch (Throwable th3) {
                    try {
                        c12834M31878.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c7305M41121.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        }
        m38716(c9431, z, c5902M56477, i2, i3, c19304, interfaceC7509, true);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38716(AbstractC2720 abstractC2720, boolean z, C5902 c5902, int i, int i2, C19304 c19304, InterfaceC7509 interfaceC7509, boolean z2) throws IOException {
        CharSequence charSequence = c5902.f20207;
        m38717(interfaceC7509);
        m38734("replacing_source_text");
        C3354 c3354 = this.f52980;
        c3354.replace(0, c3354.length(), (CharSequence) "");
        C17505 c17505 = this.f52987;
        c17505.m41111();
        int i3 = 0;
        while (i3 < charSequence.length()) {
            long j = i3;
            int iMin = (int) Math.min(charSequence.length(), ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF + j);
            CharSequence charSequence2 = c5902.f20207;
            m38717(interfaceC7509);
            if ((((long) c3354.length()) + ((long) iMin)) - j > 2147483647L) {
                throw new IOException("Reloaded text exceeds coordinate limit");
            }
            c3354.m11050(c3354.length(), c3354.length(), charSequence2, i3, iMin);
            c17505.m41111();
            i3 = iMin;
        }
        c17505.m41109();
        c3354.setSelection(0, 0);
        c3354.mo11051(false);
        Bundle bundleM11509 = this.f52984.f63046.f41124.m11509();
        bundleM11509.putBoolean("changed", false);
        bundleM11509.putBoolean(d.O, false);
        bundleM11509.putBoolean("e2SourcePending", false);
        if (!z) {
            bundleM11509.putLong("fileTime", ((C9431) abstractC2720).f30601.mo4286());
            bundleM11509.putBoolean("checkFileExists", true);
        }
        C7305 c7305M41121 = c17505.m41121();
        try {
            C10596 c10596M31876 = this.f52984.f63046.m31876(c7305M41121, bundleM11509, c5902.f20205, c5902.f20204, i, i2, true);
            c7305M41121.close();
            m38714(bundleM11509, c5902.f20205, c10596M31876, c19304, 8388608, interfaceC7509, z2);
        } catch (Throwable th) {
            try {
                c7305M41121.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bundle m38722(InterfaceC24329 interfaceC24329, C19304 c19304) throws Throwable {
        C23056 c23056;
        C16320 c16320M38711 = m38711(interfaceC24329, c19304.f62382, c19304.f62383, c19304.f62384, 8388608, new C8730(), (String) null);
        try {
            Bundle bundleM11509 = c16320M38711.f52984.f63046.f41124.m11509();
            String string = bundleM11509.getString("filePath");
            if (string == null || string.equals("untitled")) {
                throw new IOException("Untitled session requires an output path");
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(string, new String[0]);
            C9431 c9431 = new C9431(abstractC22044M35193);
            c16320M38711 = c16320M38711.m38728(interfaceC24329, (AbstractC2720) c9431, bundleM11509.getBoolean("forceTryAXml") || bundleM11509.getBoolean("forceTryClass"), -1, c19304, (InterfaceC7509) new C8730(), false);
            C17505 c17505 = c16320M38711.f52987;
            String strM30706 = c16320M38711.f52984.f63046.f41119.m30706(c17505.m41081().m48296());
            if (!c17505.m41081().m48300() || (c23056 = c16320M38711.f52984.f63045) == null) {
                throw new IOException("Session text is not ready for saving");
            }
            C17088 c17088M40244 = C17088.m40244(c16320M38711, strM30706, c23056);
            try {
                c17088M40244.m40249(c9431);
                c17088M40244.m40248();
                c17088M40244.close();
                c16320M38711.f52980.mo11051(false);
                Bundle bundleM115010 = c16320M38711.f52984.f63046.f41124.m11509();
                bundleM115010.putBoolean("changed", false);
                bundleM115010.putBoolean(d.O, false);
                bundleM115010.putLong("fileTime", abstractC22044M35193.mo4286());
                bundleM115010.putBoolean("checkFileExists", true);
                C7305 c7305M41121 = c17505.m41121();
                try {
                    C19547 c19547 = c16320M38711.f52984;
                    C10596 c10596M31877 = c19547.f63046.m31877(c7305M41121, bundleM115010, c19547.f63045, strM30706, true);
                    c7305M41121.close();
                    c16320M38711.m38714(bundleM115010, c16320M38711.f52984.f63045, c10596M31877, c19304, 8388608, (InterfaceC7509) new C8730(), false);
                    c16320M38711.m38730(c17505.m41105()).m52947();
                    return bundleM115010;
                } catch (Throwable th) {
                    try {
                        c7305M41121.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c17088M40244.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            c16320M38711.m38744().m52947();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38717(InterfaceC7509 interfaceC7509) {
        if (interfaceC7509.mo924()) {
            throw new CancellationException("Fragment recovery is canceled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38719(InterfaceC24329 interfaceC24329, C6714 c6714, C19304 c19304) {
        C16320 c16320M38711 = m38711(interfaceC24329, c19304.f62382, c19304.f62383, c19304.f62384, 8388608, new C8730(), (String) null);
        C17505 c17505 = c16320M38711.f52987;
        Throwable th = null;
        try {
            try {
                Bundle bundleM11509 = c16320M38711.f52984.f63046.f41124.m11509();
                c6714.m18751(bundleM11509);
                C7305 c7305M41121 = c17505.m41121();
                try {
                    C19547 c19547 = c16320M38711.f52984;
                    C10596 c10596M31875 = c19547.f63046.m31875(c7305M41121, bundleM11509, c19547.f63045);
                    c7305M41121.close();
                    c16320M38711.m38714(bundleM11509, c16320M38711.f52984.f63045, c10596M31875, c19304, 8388608, (InterfaceC7509) new C8730(), false);
                    c16320M38711.m38730(c17505.m41105()).m52947();
                    c16320M38711.m38744().m52947();
                } catch (Throwable th2) {
                    try {
                        c7305M41121.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c16320M38711.m38744().m52947();
                    throw th4;
                } catch (Error | RuntimeException e) {
                    if (0 == 0) {
                        throw e;
                    }
                    th.addSuppressed(e);
                    throw th4;
                }
            }
        } catch (IOException | Error | RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m38730(long j) {
        synchronized (this) {
            FutureC23690 futureC23690 = this.f52986;
            if (futureC23690 == null) {
                FutureC23690 futureC23691 = this.f52976;
                if (futureC23691 == null) {
                    synchronized (this.f52987) {
                        if (this.f52987.m41105() != j || this.f52987.m41084() < j) {
                            throw new IllegalStateException("Fragment final checkpoint is not current and durable");
                        }
                    }
                    this.f52988.close();
                    this.f52980.close();
                    final FutureC23690 futureC23692 = new FutureC23690();
                    this.f52976 = futureC23692;
                    this.f52983 = "draining_checkpoint_queue";
                    this.f52985.m17383().m52948(new RunnableC13337(this, 0), C5261.f18538).m52933((InterfaceC11711) new C21764()).m52943((InterfaceC25138) new C5880(this)).m52931(new InterfaceC2017() { // from class: l.֫᩵᩸
                        @Override // l.InterfaceC2017
                        /* JADX INFO: renamed from: ᩷ */
                        public final void mo1355(Object obj, Throwable th) {
                            C16320.m38726(this.f7104, futureC23692, (Throwable) obj, th);
                        }
                    });
                    return futureC23692.m52949((InterfaceC25138) new C2764(0));
                }
                return futureC23691.m52949((InterfaceC25138) new C2764(0));
            }
            return futureC23690.m52949((InterfaceC25138) new C2764(0));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38721(C16320 c16320) {
        c16320.f52983 = "collecting_checkpoints";
        c16320.f52985.m17388();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC23690 m38725(C16320 c16320, final Throwable th) {
        c16320.f52983 = "waiting_document_reads";
        C13950 c13950 = c16320.f52982;
        return (c13950 == null ? FutureC23690.m52928(null) : c13950.m34017()).m52943((InterfaceC25138) new C22288(c16320)).m52933(new InterfaceC11711() { // from class: l.ۤ᩵᩸
            @Override // l.InterfaceC11711
            /* JADX INFO: renamed from: ۙ */
            public final Object mo14221(Object obj, Throwable th2) {
                return C16320.m38727(th, th2);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC23690 m38713(C16320 c16320) {
        c16320.f52983 = "closing_text_session";
        return c16320.f52987.m41124();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38726(C16320 c16320, FutureC23690 futureC23690, Throwable th, Throwable th2) {
        C19547 c19547;
        Throwable thM38727 = m38727(th, th2);
        c16320.f52983 = "releasing_prepared_state";
        synchronized (c16320) {
            c19547 = c16320.f52984;
            c16320.f52984 = null;
        }
        if (c19547 != null) {
            c19547.close();
        }
        c16320.f52983 = thM38727 == null ? "closed" : "close_failed";
        c16320.m38715(thM38727);
        if (thM38727 == null) {
            futureC23690.m52935((Object) null);
            return;
        }
        if ((thM38727 instanceof C3552) && thM38727.getCause() != null) {
            thM38727 = thM38727.getCause();
        }
        futureC23690.m52937(thM38727);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m38744() {
        synchronized (this) {
            FutureC23690 futureC23690 = this.f52986;
            if (futureC23690 == null) {
                FutureC23690 futureC23691 = this.f52976;
                this.f52988.close();
                FutureC23690 futureC23692 = new FutureC23690();
                this.f52986 = futureC23692;
                (futureC23691 == null ? FutureC23690.m52928(null) : futureC23691.m52933((InterfaceC11711) new C25272(0))).m52943((InterfaceC25138) new C13359(this)).m52933(new InterfaceC11711() { // from class: l.ܺ᩵᩸
                    @Override // l.InterfaceC11711
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo14221(Object obj, Throwable th) {
                        return C16320.m38710(this.f55735, th);
                    }
                }).m52943(new InterfaceC25138() { // from class: l.ܽ᩵᩸
                    @Override // l.InterfaceC25138
                    public final Object apply(Object obj) {
                        return this.f58454.f52985.m17383().m52933((InterfaceC11711) new C15574((Throwable) obj));
                    }
                }).m52943((InterfaceC25138) new C13579(this)).m52931((InterfaceC2017) new C5134(0, this, futureC23692));
                return futureC23692.m52949((InterfaceC25138) new C2764(0));
            }
            return futureC23690.m52949((InterfaceC25138) new C2764(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Throwable m38710(C16320 c16320, Throwable th) {
        try {
            c16320.f52980.close();
            return th;
        } catch (Throwable th2) {
            return m38727(th, th2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38718(C16320 c16320, FutureC23690 futureC23690, Throwable th, Throwable th2) {
        C19547 c19547;
        Throwable thM38727 = m38727(th, th2);
        synchronized (c16320) {
            c19547 = c16320.f52984;
            c16320.f52984 = null;
        }
        if (c19547 != null) {
            c19547.close();
        }
        c16320.m38715(thM38727);
        if (thM38727 == null) {
            futureC23690.m52935((Object) null);
            return;
        }
        if ((thM38727 instanceof C3552) && thM38727.getCause() != null) {
            thM38727 = thM38727.getCause();
        }
        futureC23690.m52937(thM38727);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Throwable m38727(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        if (th2 != null && th != th2) {
            th.addSuppressed(th2);
        }
        return th;
    }
}
