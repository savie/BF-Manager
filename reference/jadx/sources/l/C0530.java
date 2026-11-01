package l;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0530 implements Handler.Callback, InterfaceC3983, InterfaceC19259, InterfaceC16635, InterfaceC2044, InterfaceC10991, InterfaceC20390, InterfaceC19841 {

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static final long f2223 = C17983.m41856(10000L);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0633 f2224;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final C13107 f2225;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f2226;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f2227;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f2228;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C22424[] f2229;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11115 f2230;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f2231;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f2232;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f2233;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f2236;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final boolean f2237;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9807 f2238;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C6901 f2239;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f2240;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2667[] f2241;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C20287 f2242;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final C0282 f2243;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C20992 f2245;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final Looper f2246;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f2247;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f2248;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C6051 f2249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10087 f2250;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public long f2251;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17464 f2252;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17142 f2254;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final long f2255;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f2256;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC8676 f2257;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public boolean f2259;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2260;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f2261;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f2262;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 f2263;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f2265;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C20287 f2266;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 f2267;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f2268;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C20039 f2269;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C17340 f2270;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C20516 f2271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC8065 f2272;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C9724 f2274;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C2170 f2275;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C12402 f2276;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f2277;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2278;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f2279;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public long f2280;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public long f2273 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f2234 = false;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C21221 f2264 = C21221.f69134;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public float f2235 = 1.0f;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public C4078 f2253 = C4078.f14988;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f2244 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f2258 = -9223372036854775807L;

    @Override // l.InterfaceC8156
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2532(InterfaceC19445 interfaceC19445) {
        this.f2228.mo21240(9, (InterfaceC6806) interfaceC19445).mo3909();
    }

    public C0530(Context context, InterfaceC4784[] interfaceC4784Arr, InterfaceC4784[] interfaceC4784Arr2, AbstractC8676 abstractC8676, C10087 c10087, InterfaceC11115 interfaceC11115, InterfaceC17142 interfaceC17142, int i, boolean z, InterfaceC8313 interfaceC8313, C6901 c6901, C11218 c11218, long j, Looper looper, C22217 c22217, C20516 c20516, C9724 c9724, final InterfaceC19841 interfaceC19841) {
        this.f2271 = c20516;
        this.f2257 = abstractC8676;
        this.f2250 = c10087;
        this.f2230 = interfaceC11115;
        this.f2254 = interfaceC17142;
        this.f2248 = i;
        this.f2227 = z;
        this.f2239 = c6901;
        this.f2252 = c11218;
        this.f2255 = j;
        this.f2267 = c22217;
        this.f2274 = c9724;
        this.f2263 = interfaceC8313;
        this.f2265 = interfaceC11115.mo28038();
        this.f2237 = interfaceC11115.mo28034();
        AbstractC16511 abstractC16511 = AbstractC16511.f53035;
        C17340 c17340M40318 = C17340.m40318(c10087);
        this.f2270 = c17340M40318;
        this.f2245 = new C20992(c17340M40318);
        this.f2241 = new InterfaceC2667[interfaceC4784Arr.length];
        this.f2261 = new boolean[interfaceC4784Arr.length];
        InterfaceC11841 interfaceC11841Mo22499 = abstractC8676.mo22499();
        this.f2229 = new C22424[interfaceC4784Arr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < interfaceC4784Arr.length; i2++) {
            interfaceC4784Arr[i2].mo13258(i2, c9724, c22217);
            this.f2241[i2] = interfaceC4784Arr[i2].mo13270();
            if (interfaceC11841Mo22499 != null) {
                ((AbstractC16862) this.f2241[i2]).m39518(interfaceC11841Mo22499);
            }
            InterfaceC4784 interfaceC4784 = interfaceC4784Arr2[i2];
            if (interfaceC4784 != null) {
                interfaceC4784.mo13258(i2, c9724, c22217);
                z2 = true;
            }
            this.f2229[i2] = new C22424(interfaceC4784Arr[i2], interfaceC4784Arr2[i2], i2);
        }
        this.f2247 = z2;
        this.f2238 = new C9807(this, c22217);
        this.f2278 = new ArrayList();
        this.f2243 = new C0282();
        this.f2269 = new C20039();
        abstractC8676.m22497(this, interfaceC17142);
        this.f2240 = true;
        InterfaceC8065 interfaceC8065Mo28887 = c22217.mo28887(looper, null);
        this.f2272 = interfaceC8065Mo28887;
        this.f2225 = new C13107(interfaceC8313, interfaceC8065Mo28887, new C18875(this));
        this.f2276 = new C12402(this, interfaceC8313, interfaceC8065Mo28887, c9724);
        C6051 c6051 = new C6051();
        this.f2249 = c6051;
        Looper looperM16449 = c6051.m16449();
        this.f2246 = looperM16449;
        InterfaceC8065 interfaceC8065Mo28888 = c22217.mo28887(looperM16449, this);
        this.f2228 = interfaceC8065Mo28888;
        this.f2224 = new C0633(context, looperM16449, this);
        interfaceC8065Mo28888.mo21240(35, new InterfaceC19841() { // from class: l.۠ܽۙ
            @Override // l.InterfaceC19841
            /* JADX INFO: renamed from: ۙ */
            public final void mo2526(long j2, long j3, C7648 c7648, MediaFormat mediaFormat) {
                C0530 c0530 = this.f28802;
                c0530.getClass();
                interfaceC19841.mo2526(j2, j3, c7648, mediaFormat);
                c0530.mo2526(j2, j3, c7648, mediaFormat);
            }
        }).mo3909();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m2503(C14519 c14519) {
        synchronized (c14519) {
        }
        try {
            c14519.m34956().mo13941(c14519.m34950(), c14519.m34957());
        } finally {
            c14519.m34954(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5345 m2452(C0530 c0530, C22279 c22279, long j) {
        InterfaceC2667[] interfaceC2667Arr = c0530.f2241;
        AbstractC8676 abstractC8676 = c0530.f2257;
        C5853 c5853Mo28036 = c0530.f2230.mo28036();
        C12402 c12402 = c0530.f2276;
        C10087 c10087 = c0530.f2250;
        c0530.f2264.getClass();
        return new C5345(interfaceC2667Arr, j, abstractC8676, c5853Mo28036, c12402, c22279, c10087);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m2536() {
        this.f2228.mo21237(29).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2523(int i, int i2, boolean z) {
        this.f2228.mo21238(1, z ? 1 : 0, i | (i2 << 4)).mo3909();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2540(int i) {
        this.f2228.mo21238(11, i, 0).mo3909();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2542(boolean z) {
        this.f2228.mo21238(12, z ? 1 : 0, 0).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2531(AbstractC16511 abstractC16511, int i, long j) {
        this.f2228.mo21240(3, new C20287(abstractC16511, i, j)).mo3909();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2541(C21449 c21449) {
        this.f2228.mo21240(4, c21449).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2534(boolean z) {
        this.f2228.mo21240(36, Boolean.valueOf(z)).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2528(C4078 c4078) {
        this.f2228.mo21240(38, c4078).mo3909();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m2538() {
        this.f2228.mo21237(6).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2524(int i, long j, InterfaceC10273 interfaceC10273, ArrayList arrayList) {
        this.f2228.mo21240(17, new C8998(i, j, interfaceC10273, arrayList)).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2525(int i, InterfaceC10273 interfaceC10273) {
        this.f2228.mo21239(20, i, interfaceC10273).mo3909();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2527(C2708 c2708) {
        this.f2228.mo21239(31, 0, c2708).mo3909();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2492(int i) {
        C17340 c17340 = this.f2270;
        m2455(i, c17340.f55194, c17340.f55175, c17340.f55193);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m2515() {
        float f = this.f2235;
        this.f2235 = f;
        float fM2922 = f * this.f2224.m2922();
        for (C22424 c22424 : this.f2229) {
            c22424.m49763(fM2922);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2474(InterfaceC19841 interfaceC19841) {
        for (C22424 c22424 : this.f2229) {
            c22424.m49775(interfaceC19841);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2530(C14519 c14519) {
        if (this.f2268 || !this.f2246.getThread().isAlive()) {
            C0303.m1848("Ignoring messages sent after release.");
            c14519.m34954(false);
        } else {
            this.f2228.mo21240(14, c14519).mo3909();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2535(long j, Object obj) {
        if (this.f2268 || !this.f2246.getThread().isAlive()) {
            return true;
        }
        C22176 c22176 = new C22176(this.f2267);
        this.f2228.mo21240(30, new Pair(obj, c22176)).mo3909();
        if (j != -9223372036854775807L) {
            return c22176.m49197(j);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m2543() {
        if (this.f2268 || !this.f2246.getThread().isAlive()) {
            return true;
        }
        this.f2268 = true;
        C22176 c22176 = new C22176(this.f2267);
        this.f2228.mo21240(7, c22176).mo3909();
        return c22176.m49197(this.f2255);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Looper m2537() {
        return this.f2246;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2520() {
        InterfaceC8065 interfaceC8065 = this.f2228;
        interfaceC8065.mo21246(2);
        interfaceC8065.mo21248(22);
    }

    @Override // l.InterfaceC3983
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2529(InterfaceC6806 interfaceC6806) {
        this.f2228.mo21240(8, interfaceC6806).mo3909();
    }

    @Override // l.InterfaceC19259
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2521() {
        this.f2228.mo21248(10);
    }

    @Override // l.InterfaceC19259
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo2539() {
        this.f2228.mo21248(26);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2533(C21449 c21449) {
        this.f2228.mo21240(16, c21449).mo3909();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m2519() {
        this.f2228.mo21248(34);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2522(int i) {
        this.f2228.mo21238(33, i, 0).mo3909();
    }

    @Override // l.InterfaceC19841
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2526(long j, long j2, C7648 c7648, MediaFormat mediaFormat) {
        if (this.f2231) {
            this.f2228.mo21237(37).mo3909();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        C15274 c15274;
        C5345 c5345M32366;
        int i2 = 1000;
        try {
            int i3 = message.what;
            C0633 c0633 = this.f2224;
            switch (i3) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f2245.m47155(1);
                    m2455(c0633.m2923(this.f2270.f55180, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    m2507();
                    break;
                case 3:
                    m2475((C20287) message.obj, true);
                    break;
                case 4:
                    m2497((C21449) message.obj);
                    break;
                case 5:
                    m2465((C6901) message.obj);
                    break;
                case 6:
                    m2480(false, true);
                    break;
                case 7:
                    m2478((C22176) message.obj);
                    return true;
                case 8:
                    m2495((InterfaceC6806) message.obj);
                    break;
                case 9:
                    m2502((InterfaceC6806) message.obj);
                    break;
                case 10:
                    m2488();
                    break;
                case 11:
                    m2485(message.arg1);
                    break;
                case 12:
                    m2439(message.arg1 != 0);
                    break;
                case 13:
                    m2479(message.arg1 != 0, (C22176) message.obj);
                    break;
                case 14:
                    m2496((C14519) message.obj);
                    break;
                case 15:
                    m2441((C14519) message.obj);
                    break;
                case 16:
                    C21449 c21449 = (C21449) message.obj;
                    m2477(c21449, c21449.f69728, true, false);
                    break;
                case 17:
                    m2466((C8998) message.obj);
                    break;
                case 18:
                    m2467((C8998) message.obj, message.arg1);
                    break;
                case 19:
                    m2469((C10409) message.obj);
                    break;
                case 20:
                    m2457(message.arg1, message.arg2, (InterfaceC10273) message.obj);
                    break;
                case 21:
                    m2468((InterfaceC10273) message.obj);
                    break;
                case 22:
                    m2490();
                    break;
                case 23:
                    m2486(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m2487();
                    break;
                case 26:
                    m2488();
                    m2442(true);
                    break;
                case 27:
                    m2456(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m2476((C21221) message.obj);
                    break;
                case 29:
                    m2491();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m2460(pair.first, (C22176) pair.second);
                    break;
                case 31:
                    m2463((C2708) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float fFloatValue = ((Float) message.obj).floatValue();
                    this.f2235 = fFloatValue;
                    float fM2922 = fFloatValue * c0633.m2922();
                    for (C22424 c22424 : this.f2229) {
                        c22424.m49763(fM2922);
                    }
                    break;
                case 33:
                    m2492(message.arg1);
                    break;
                case 34:
                    m2515();
                    break;
                case 35:
                    m2474((InterfaceC19841) message.obj);
                    break;
                case 36:
                    m2517(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f2231 = false;
                    C20287 c20287 = this.f2266;
                    if (c20287 != null) {
                        m2475(c20287, false);
                        this.f2266 = null;
                    }
                    break;
                case 38:
                    m2501((C4078) message.obj);
                    break;
            }
        } catch (RuntimeException e) {
            C2170 c2170M6757 = C2170.m6757(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
            C0303.m1854("Playback error", c2170M6757);
            m2480(true, false);
            this.f2270 = this.f2270.m40322(c2170M6757);
        } catch (C2170 e2) {
            C2170 c2170M6759 = e2;
            int i5 = c2170M6759.f7882;
            C13107 c13107 = this.f2225;
            if (i5 == 1 && (c5345M32366 = c13107.m32366()) != null && c2170M6759.f7880 == null) {
                c2170M6759 = c2170M6759.m6759(c5345M32366.f18464.f72815);
            }
            int i6 = c2170M6759.f7882;
            InterfaceC8065 interfaceC8065 = this.f2228;
            if (i6 == 1 && (c15274 = c2170M6759.f7880) != null && m2483(c2170M6759.f7877, c15274)) {
                this.f2232 = true;
                m2518();
                C5345 c5345M32383 = c13107.m32383();
                C5345 c5345M32387 = c13107.m32387();
                if (c13107.m32387() != c5345M32383) {
                    while (c5345M32387 != null && c5345M32387.m14847() != c5345M32383) {
                        c5345M32387 = c5345M32387.m14847();
                    }
                }
                c13107.m32367(c5345M32387);
                if (this.f2270.f55180 != 4) {
                    m2511();
                    interfaceC8065.mo21248(2);
                }
            } else {
                C2170 c2170 = this.f2275;
                if (c2170 != null) {
                    c2170.addSuppressed(c2170M6759);
                    c2170M6759 = this.f2275;
                }
                C2170 c2171 = c2170M6759;
                if (c2171.f7882 == 1 && c13107.m32387() != c13107.m32366()) {
                    while (c13107.m32387() != c13107.m32366()) {
                        c13107.m32371();
                    }
                    C5345 c5345M32388 = c13107.m32387();
                    C2023.m6504(c5345M32388);
                    m2512();
                    C22279 c22279 = c5345M32388.f18464;
                    C15274 c15275 = c22279.f72815;
                    long j = c22279.f72814;
                    this.f2270 = m2454(c15275, j, c22279.f72811, j, true, 0);
                }
                if (c2171.f7876 && (this.f2275 == null || (i = c2171.f49319) == 5004 || i == 5003)) {
                    C0303.m1852("Recoverable renderer error", c2171);
                    if (this.f2275 == null) {
                        this.f2275 = c2171;
                    }
                    interfaceC8065.mo21244(interfaceC8065.mo21240(25, c2171));
                } else {
                    C0303.m1854("Playback error", c2171);
                    m2480(true, false);
                    this.f2270 = this.f2270.m40322(c2171);
                }
            }
        } catch (C8501 e3) {
            m2459(e3, e3.f29475);
        } catch (C20018 e4) {
            m2459(e4, e4.f64121);
        } catch (C22766 e5) {
            m2459(e5, b.c);
        } catch (C22861 e6) {
            boolean z2 = e6.f74362;
            int i7 = e6.f74363;
            if (i7 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else if (i7 == 4) {
                i2 = z2 ? 3002 : 3004;
            }
            m2459(e6, i2);
        } catch (IOException e7) {
            m2459(e7, 2000);
        }
        m2512();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2459(IOException iOException, int i) {
        C2170 c2170M6756 = C2170.m6756(iOException, i);
        C5345 c5345M32387 = this.f2225.m32387();
        if (c5345M32387 != null) {
            c2170M6756 = c2170M6756.m6759(c5345M32387.f18464.f72815);
        }
        C0303.m1854("Playback error", c2170M6756);
        m2480(false, false);
        this.f2270 = this.f2270.m40322(c2170M6756);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m2516(int i) {
        C17340 c17340 = this.f2270;
        if (c17340.f55180 != i) {
            if (i != 2) {
                this.f2244 = -9223372036854775807L;
            }
            if (i != 3 && c17340.f55190) {
                this.f2270 = c17340.m40330(false);
            }
            this.f2270 = this.f2270.m40320(i);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m2512() {
        this.f2245.m47156(this.f2270);
        if (this.f2245.f68358) {
            C15348.m36784(this.f2271.f66490, this.f2245);
            this.f2245 = new C20992(this.f2270);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m2491() {
        this.f2245.m47155(1);
        m2481(false, false, false, true);
        this.f2230.mo28033(this.f2274);
        m2516(this.f2270.f55191.m38828() ? 4 : 2);
        C17340 c17340 = this.f2270;
        boolean z = c17340.f55193;
        m2455(this.f2224.m2923(c17340.f55180, z), c17340.f55194, c17340.f55175, z);
        this.f2276.m30854(this.f2254.mo34553());
        this.f2228.mo21248(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2466(C8998 c8998) throws Throwable {
        this.f2245.m47155(1);
        if (c8998.f30780 != -1) {
            this.f2242 = new C20287(new C9580(c8998.f30781, c8998.f30782), c8998.f30780, c8998.f30783);
        }
        m2473(this.f2276.m30851(c8998.f30781, c8998.f30782), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2467(C8998 c8998, int i) throws Throwable {
        this.f2245.m47155(1);
        C12402 c12402 = this.f2276;
        if (i == -1) {
            i = c12402.m30856();
        }
        m2473(c12402.m30850(i, c8998.f30781, c8998.f30782), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2469(C10409 c10409) throws Throwable {
        this.f2245.m47155(1);
        c10409.getClass();
        m2473(this.f2276.m30855(), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2457(int i, int i2, InterfaceC10273 interfaceC10273) throws Throwable {
        this.f2245.m47155(1);
        m2473(this.f2276.m30849(i, i2, interfaceC10273), false);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m2490() throws Throwable {
        m2473(this.f2276.m30847(), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2468(InterfaceC10273 interfaceC10273) throws Throwable {
        this.f2245.m47155(1);
        m2473(this.f2276.m30852(interfaceC10273), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2456(int i, int i2, List list) throws Throwable {
        this.f2245.m47155(1);
        m2473(this.f2276.m30848(i, i2, list), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2463(C2708 c2708, boolean z) {
        this.f2257.mo22494(c2708);
        if (!z) {
            c2708 = null;
        }
        C0633 c0633 = this.f2224;
        c0633.m2924(c2708);
        C17340 c17340 = this.f2270;
        boolean z2 = c17340.f55193;
        m2455(c0633.m2923(c17340.f55180, z2), c17340.f55194, c17340.f55175, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2455(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        C17340 c17340 = this.f2270;
        if (c17340.f55193 == z2 && c17340.f55194 == i2 && c17340.f55175 == i3) {
            return;
        }
        this.f2270 = c17340.m40321(i3, i2, z2);
        m2504(false, false);
        C13107 c13107 = this.f2225;
        for (C5345 c5345M32387 = c13107.m32387(); c5345M32387 != null; c5345M32387 = c5345M32387.m14847()) {
            for (InterfaceC6558 interfaceC6558 : c5345M32387.m14850().f34440) {
                if (interfaceC6558 != null) {
                    interfaceC6558.mo17790(z2);
                }
            }
        }
        if (!m2508()) {
            m2438();
            m2499();
            C17340 c17341 = this.f2270;
            if (c17341.f55190) {
                this.f2270 = c17341.m40330(false);
            }
            c13107.m32377(this.f2280);
            return;
        }
        int i4 = this.f2270.f55180;
        InterfaceC8065 interfaceC8065 = this.f2228;
        if (i4 == 3) {
            this.f2238.m24911();
            m2513();
            interfaceC8065.mo21248(2);
        } else if (i4 == 2) {
            interfaceC8065.mo21248(2);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m2486(boolean z) {
        this.f2234 = z;
        m2514();
        if (this.f2262) {
            C13107 c13107 = this.f2225;
            if (c13107.m32366() != c13107.m32387()) {
                m2442(true);
                m2498(false);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m2485(int i) {
        this.f2248 = i;
        int iM32368 = this.f2225.m32368(this.f2270.f55191, i);
        if ((iM32368 & 1) != 0) {
            m2442(true);
        } else if ((iM32368 & 2) != 0) {
            m2518();
        }
        m2498(false);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m2439(boolean z) {
        this.f2227 = z;
        int iM32370 = this.f2225.m32370(this.f2270.f55191, z);
        if ((iM32370 & 1) != 0) {
            m2442(true);
        } else if ((iM32370 & 2) != 0) {
            m2518();
        }
        m2498(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2476(C21221 c21221) {
        this.f2264 = c21221;
        this.f2225.m32378(this.f2270.f55191, c21221);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2442(boolean z) {
        C15274 c15274 = this.f2225.m32387().f18464.f72815;
        long jM2448 = m2448(c15274, this.f2270.f55192, true, false);
        if (jM2448 != this.f2270.f55192) {
            C17340 c17340 = this.f2270;
            this.f2270 = m2454(c15274, jM2448, c17340.f55189, c17340.f55187, z, 5);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m2513() {
        C5345 c5345M32387 = this.f2225.m32387();
        if (c5345M32387 == null) {
            return;
        }
        C10087 c10087M14850 = c5345M32387.m14850();
        int i = 0;
        while (true) {
            C22424[] c22424Arr = this.f2229;
            if (i >= c22424Arr.length) {
                return;
            }
            if (c10087M14850.m25496(i)) {
                c22424Arr[i].m49792();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m2438() {
        this.f2238.m24914();
        for (C22424 c22424 : this.f2229) {
            c22424.m49789();
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m2499() {
        C5345 c5345M32387 = this.f2225.m32387();
        if (c5345M32387 == null) {
            return;
        }
        long jMo7694 = c5345M32387.f18459 ? c5345M32387.f18461.mo7694() : -9223372036854775807L;
        if (jMo7694 != -9223372036854775807L) {
            if (!c5345M32387.m14831()) {
                this.f2225.m32367(c5345M32387);
                m2498(false);
                m2511();
            }
            m2500(jMo7694);
            if (jMo7694 != this.f2270.f55192) {
                C17340 c17340 = this.f2270;
                this.f2270 = m2454(c17340.f55179, jMo7694, c17340.f55189, jMo7694, true, 5);
            }
        } else {
            long jM24910 = this.f2238.m24910(c5345M32387 != this.f2225.m32366());
            this.f2280 = jM24910;
            long jM14845 = c5345M32387.m14845(jM24910);
            long j = this.f2270.f55192;
            if (!this.f2278.isEmpty() && !this.f2270.f55179.m36576()) {
                if (this.f2240) {
                    j--;
                    this.f2240 = false;
                }
                C17340 c17341 = this.f2270;
                int iMo14959 = c17341.f55191.mo14959(c17341.f55179.f49778);
                int iMin = Math.min(this.f2226, this.f2278.size());
                C7586 c7586 = iMin > 0 ? (C7586) this.f2278.get(iMin - 1) : null;
                while (c7586 != null && (iMo14959 < 0 || (iMo14959 == 0 && 0 > j))) {
                    int i = iMin - 1;
                    c7586 = i > 0 ? (C7586) this.f2278.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.f2278.size()) {
                }
                this.f2226 = iMin;
            }
            if (this.f2238.mo6302()) {
                boolean z = !this.f2245.f68356;
                C17340 c17342 = this.f2270;
                this.f2270 = m2454(c17342.f55179, jM14845, c17342.f55189, jM14845, z, 6);
            } else {
                C17340 c17343 = this.f2270;
                c17343.f55192 = jM14845;
                c17343.f55188 = SystemClock.elapsedRealtime();
            }
        }
        this.f2270.f55178 = this.f2225.m32379().m14835();
        C17340 c17344 = this.f2270;
        c17344.f55183 = m2446(c17344.f55178);
        C17340 c17345 = this.f2270;
        if (c17345.f55193 && c17345.f55180 == 3 && m2484(c17345.f55191, c17345.f55179)) {
            C17340 c17346 = this.f2270;
            if (c17346.f55177.f69728 == 1.0f) {
                float fM28168 = ((C11218) this.f2252).m28168(m2449(c17346.f55191, c17346.f55179.f49778, c17346.f55192), this.f2270.f55183);
                if (this.f2238.mo6303().f69728 != fM28168) {
                    C21449 c21449 = new C21449(fM28168, this.f2270.f55177.f69727);
                    this.f2228.mo21246(16);
                    this.f2238.mo6301(c21449);
                    m2477(this.f2270.f55177, this.f2238.mo6303().f69728, false, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2497(C21449 c21449) {
        this.f2228.mo21246(16);
        C9807 c9807 = this.f2238;
        c9807.mo6301(c21449);
        C21449 c21449Mo6303 = c9807.mo6303();
        m2477(c21449Mo6303, c21449Mo6303.f69728, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0203 A[LOOP:3: B:122:0x0201->B:123:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0211 A[EDGE_INSN: B:126:0x0211->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:127:0x021d A[EDGE_INSN: B:127:0x021d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:130:0x0225 A[LOOP:13: B:129:0x0223->B:130:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x0364  */
    /* JADX WARN: Code duplicated, block: B:286:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:294:0x04be  */
    /* JADX WARN: Code duplicated, block: B:296:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:297:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:306:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0502  */
    /* JADX WARN: Code duplicated, block: B:312:0x0508  */
    /* JADX WARN: Code duplicated, block: B:314:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x054c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0559  */
    /* JADX WARN: Code duplicated, block: B:322:0x0565  */
    /* JADX WARN: Code duplicated, block: B:325:0x056e  */
    /* JADX WARN: Code duplicated, block: B:333:0x058a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0592  */
    /* JADX WARN: Code duplicated, block: B:337:0x059c  */
    /* JADX WARN: Code duplicated, block: B:339:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:346:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:351:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:362:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:364:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:365:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:368:0x0608  */
    /* JADX WARN: Code duplicated, block: B:375:0x0626  */
    /* JADX WARN: Code duplicated, block: B:382:0x0632  */
    /* JADX WARN: Code duplicated, block: B:385:0x0639  */
    /* JADX WARN: Code duplicated, block: B:401:0x0660  */
    /* JADX WARN: Code duplicated, block: B:439:0x05d0 A[EDGE_INSN: B:439:0x05d0->B:353:0x05d0 BREAK  A[LOOP:10: B:347:0x05bd->B:352:0x05cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015d A[EDGE_INSN: B:88:0x015d->B:89:0x0160 BREAK  A[LOOP:1: B:73:0x0127->B:78:0x0133]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[PHI: r2
      0x01b3: PHI (r2v48 long) = (r2v47 long), (r2v60 long) binds: [B:98:0x01b1, B:94:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x01fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:335:0x0592, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m2507() {
        long j;
        ?? r0;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        C17340 c17340;
        C5345 c5345M32387;
        int i;
        C13107 c13107;
        C5345 c5345M32388;
        long jM28169;
        C5345 c5345M32379;
        boolean z5;
        boolean z6;
        boolean zMo28035;
        boolean z7;
        boolean z8;
        C17340 c17341;
        int i2;
        int i3;
        C22424[] c22424Arr;
        C17340 c17342;
        C5345 c5345M32389;
        C5345 c5345M14847;
        boolean z9;
        boolean z10;
        int i4;
        long j3;
        boolean z11;
        long jM14832;
        int i5;
        int i6;
        boolean zM25496;
        C5345 c5345M32383;
        C22279 c22279M32375;
        long jMo28889 = this.f2267.mo28889();
        this.f2228.mo21246(2);
        boolean z12 = this.f2247;
        C22424[] c22424Arr2 = this.f2229;
        C13107 c13108 = this.f2225;
        if (this.f2270.f55191.m38828() || !this.f2276.m30845()) {
            j = jMo28889;
            r0 = 0;
            z = true;
        } else {
            c13108.m32377(this.f2280);
            if (c13108.m32386() && (c22279M32375 = c13108.m32375(this.f2280, this.f2270)) != null) {
                long j4 = c22279M32375.f72814;
                C5345 c5345M32373 = c13108.m32373(c22279M32375);
                if (!c5345M32373.f18465) {
                    c5345M32373.f18465 = true;
                    c5345M32373.f18461.mo7689(this, j4);
                } else if (c5345M32373.f18459) {
                    this.f2228.mo21240(8, c5345M32373.f18461).mo3909();
                }
                if (c13108.m32387() == c5345M32373) {
                    m2500(j4);
                }
                m2498(false);
            }
            if (this.f2277) {
                this.f2277 = m2506(c13108.m32379());
                m2509();
            } else {
                m2511();
            }
            if (!this.f2262 && z12 && !this.f2232 && !m2444() && (c5345M32383 = c13108.m32383()) != null && c5345M32383 == c13108.m32366() && c5345M32383.m14847() != null && c5345M32383.m14847().f18459) {
                c13108.m32384();
                C5345 c5345M32384 = c13108.m32383();
                if (c5345M32384 != null) {
                    C10087 c10087M14850 = c5345M32384.m14850();
                    for (int i7 = 0; i7 < c22424Arr2.length; i7++) {
                        if (c10087M14850.m25496(i7) && c22424Arr2[i7].m49757() && !c22424Arr2[i7].m49790()) {
                            c22424Arr2[i7].m49788();
                            m2464(c5345M32384, i7, false, c5345M32384.m14832());
                        }
                    }
                    if (m2444()) {
                        this.f2273 = c5345M32384.f18461.mo7694();
                        if (!c5345M32384.m14831()) {
                            c13108.m32367(c5345M32384);
                            m2498(false);
                            m2511();
                        }
                    }
                }
            }
            C5345 c5345M32366 = c13108.m32366();
            if (c5345M32366 == null) {
                j = jMo28889;
                break;
            }
            if (c5345M32366.m14847() == null || this.f2262) {
                j = jMo28889;
                if (c5345M32366.f18464.f72810 || this.f2262) {
                    for (C22424 c22424 : c22424Arr2) {
                        if (c22424.m49791(c5345M32366) && c22424.m49758(c5345M32366)) {
                            long j5 = c5345M32366.f18464.f72812;
                            c22424.m49786(c5345M32366, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : c5345M32366.m14844() + c5345M32366.f18464.f72812);
                        }
                    }
                }
            } else {
                C5345 c5345M32367 = c13108.m32366();
                if (!c5345M32367.f18459) {
                    j = jMo28889;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= c22424Arr2.length) {
                        if ((!m2444() || c13108.m32383() != c13108.m32366()) && (c5345M32366.m14847().f18459 || this.f2280 >= c5345M32366.m14847().m14832())) {
                            C10087 c10087M14851 = c5345M32366.m14850();
                            C5345 c5345M32381 = c13108.m32381();
                            C10087 c10087M14852 = c5345M32381.m14850();
                            AbstractC16511 abstractC16511 = this.f2270.f55191;
                            j = jMo28889;
                            m2471(abstractC16511, c5345M32381.f18464.f72815, abstractC16511, c5345M32366.f18464.f72815, -9223372036854775807L, false);
                            if (!c5345M32381.f18459) {
                                for (C22424 c22425 : c22424Arr2) {
                                    c22425.m49772(c10087M14851, c10087M14852, c5345M32381.m14832());
                                }
                                break;
                            }
                            if (z12) {
                                j3 = -9223372036854775807L;
                                if (this.f2273 != -9223372036854775807L) {
                                    this.f2273 = j3;
                                    if (z12 || this.f2232) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        for (i6 = 0; i6 < c22424Arr2.length; i6++) {
                                            zM25496 = c10087M14852.m25496(i6);
                                            InterfaceC6558[] interfaceC6558Arr = c10087M14852.f34440;
                                            if (!zM25496 && c22424Arr2[i6].m49780() != -2 && !C6632.m17980(interfaceC6558Arr[i6].mo17795().f25265, interfaceC6558Arr[i6].mo17795().f25277) && !c22424Arr2[i6].m49790()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z11) {
                                        jM14832 = c5345M32381.m14832();
                                        for (C22424 c22426 : c22424Arr2) {
                                            c22426.m49765(jM14832);
                                        }
                                        if (c5345M32381.m14831()) {
                                            c13108.m32367(c5345M32381);
                                            m2498(false);
                                            m2511();
                                            break;
                                        }
                                        break;
                                    }
                                    while (i4 < r1) {
                                        c22425.m49772(c10087M14851, c10087M14852, c5345M32381.m14832());
                                    }
                                    break;
                                    break;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            if (c5345M32381.f18461.mo7694() != j3) {
                                this.f2273 = j3;
                                if (z12) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    while (i6 < c22424Arr2.length) {
                                        zM25496 = c10087M14852.m25496(i6);
                                        InterfaceC6558[] interfaceC6558Arr2 = c10087M14852.f34440;
                                        if (!zM25496) {
                                        }
                                    }
                                }
                                if (!z11) {
                                    jM14832 = c5345M32381.m14832();
                                    while (i5 < r2) {
                                        c22426.m49765(jM14832);
                                    }
                                    if (c5345M32381.m14831()) {
                                        break;
                                        break;
                                    }
                                    c13108.m32367(c5345M32381);
                                    m2498(false);
                                    m2511();
                                    break;
                                }
                                while (i4 < r1) {
                                    c22425.m49772(c10087M14851, c10087M14852, c5345M32381.m14832());
                                }
                                break;
                                break;
                            }
                            while (i4 < r1) {
                                c22425.m49772(c10087M14851, c10087M14852, c5345M32381.m14832());
                            }
                            break;
                            break;
                        }
                    } else if (c22424Arr2[i8].m49781(c5345M32367)) {
                        i8++;
                    }
                    j = jMo28889;
                    break;
                }
            }
            boolean z13 = false;
            C5345 c5345M32368 = c13108.m32366();
            if (c5345M32368 != null && c13108.m32387() != c5345M32368 && !c5345M32368.f18460) {
                C5345 c5345M32369 = c13108.m32366();
                C10087 c10087M14853 = c5345M32369.m14850();
                boolean z14 = true;
                for (int i9 = 0; i9 < c22424Arr2.length; i9++) {
                    int iM49783 = c22424Arr2[i9].m49783();
                    int iM49760 = c22424Arr2[i9].m49760(c5345M32369, c10087M14853, this.f2238);
                    if ((iM49760 & 2) != 0 && (z10 = this.f2256) && z10) {
                        this.f2256 = false;
                        if (this.f2270.f55190) {
                            this.f2228.mo21248(2);
                        }
                    }
                    this.f2279 -= iM49783 - c22424Arr2[i9].m49783();
                    z14 &= (iM49760 & 1) != 0;
                }
                if (z14) {
                    for (int i10 = 0; i10 < c22424Arr2.length; i10++) {
                        if (c10087M14853.m25496(i10) && !c22424Arr2[i10].m49791(c5345M32369)) {
                            m2464(c5345M32369, i10, false, c5345M32369.m14832());
                        }
                    }
                }
                if (z14) {
                    c13108.m32366().f18460 = true;
                }
            }
            boolean z15 = false;
            while (m2508() && !this.f2262 && (c5345M32389 = c13108.m32387()) != null && (c5345M14847 = c5345M32389.m14847()) != null && this.f2280 >= c5345M14847.m14832() && c5345M14847.f18460) {
                if (z15) {
                    m2512();
                }
                this.f2232 = z13;
                C5345 c5345M32371 = c13108.m32371();
                c5345M32371.getClass();
                if (this.f2270.f55179.f49778.equals(c5345M32371.f18464.f72815.f49778)) {
                    C15274 c15274 = this.f2270.f55179;
                    if (c15274.f49779 == -1) {
                        C15274 c15275 = c5345M32371.f18464.f72815;
                        if (c15275.f49779 != -1 || c15274.f49781 == c15275.f49781) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                C22279 c22279 = c5345M32371.f18464;
                C15274 c15276 = c22279.f72815;
                long j6 = c22279.f72814;
                this.f2270 = m2454(c15276, j6, c22279.f72811, j6, !z9, 0);
                m2514();
                m2499();
                if (m2444() && c5345M32371 == c13108.m32383()) {
                    for (C22424 c22427 : c22424Arr2) {
                        c22427.m49782();
                    }
                }
                if (this.f2270.f55180 == 3) {
                    m2513();
                }
                C10087 c10087M14854 = c13108.m32387().m14850();
                for (int i11 = 0; i11 < c22424Arr2.length; i11++) {
                    if (c10087M14854.m25496(i11)) {
                        c22424Arr2[i11].m49762();
                    }
                }
                z15 = true;
                z13 = false;
            }
            r0 = 0;
            z = true;
            this.f2264.getClass();
        }
        int i12 = this.f2270.f55180;
        if (i12 == z || i12 == 4) {
            return;
        }
        C5345 c5345M323810 = this.f2225.m32387();
        if (c5345M323810 != null) {
            long j7 = j;
            Trace.beginSection("doSomeWork");
            m2499();
            if (c5345M323810.f18459) {
                this.f2251 = C17983.m41827(this.f2267.mo28888());
                c5345M323810.f18461.mo7685(this.f2270.f55192 - this.f2265, this.f2237);
                int i13 = 0;
                z2 = true;
                z3 = true;
                while (true) {
                    C22424[] c22424Arr3 = this.f2229;
                    if (i13 >= c22424Arr3.length) {
                        break;
                    }
                    C22424 c22428 = c22424Arr3[i13];
                    if (c22428.m49783() == 0) {
                        m2458(i13, (boolean) r0);
                    } else {
                        c22428.m49785(this.f2280, this.f2251);
                        z3 = z3 && c22428.m49777();
                        boolean zM49776 = c22428.m49776(c5345M323810);
                        m2458(i13, zM49776);
                        z2 = z2 && zM49776;
                        if (!zM49776) {
                            m2440(i13);
                        }
                    }
                    i13++;
                }
            } else {
                c5345M323810.f18461.mo7692();
                z2 = true;
                z3 = true;
            }
            long j8 = c5345M323810.f18464.f72812;
            if (z3 && c5345M323810.f18459) {
                j2 = -9223372036854775807L;
                z4 = j8 == -9223372036854775807L || j8 <= this.f2270.f55192;
                if (z4 && this.f2262) {
                    this.f2262 = r0;
                    int i14 = this.f2270.f55194;
                    this.f2245.m47155((int) r0);
                    m2455(this.f2224.m2923(this.f2270.f55180, (boolean) r0), i14, 5, (boolean) r0);
                }
                if (!z4 && c5345M323810.f18464.f72810) {
                    m2516(4);
                    m2438();
                    j7 = j7;
                } else {
                    c17340 = this.f2270;
                    if (c17340.f55180 == 2) {
                        c13107 = this.f2225;
                        if (this.f2279 == 0) {
                            zMo28035 = m2510();
                        } else {
                            if (!z2) {
                                zMo28035 = false;
                            } else if (c17340.f55185) {
                                c5345M32388 = c13107.m32387();
                                if (m2484(this.f2270.f55191, c5345M32388.f18464.f72815)) {
                                    jM28169 = ((C11218) this.f2252).m28169();
                                } else {
                                    jM28169 = j2;
                                }
                                c5345M32379 = c13107.m32379();
                                if (c5345M32379.m14831() || !c5345M32379.f18464.f72810) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (c5345M32379.f18464.f72815.m36576() || c5345M32379.f18459) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z5 && !z6) {
                                    long jM2446 = m2446(c5345M32379.m14835());
                                    InterfaceC11115 interfaceC11115 = this.f2230;
                                    C9724 c9724 = this.f2274;
                                    AbstractC16511 abstractC16512 = this.f2270.f55191;
                                    C15274 c15277 = c5345M32388.f18464.f72815;
                                    long jM14845 = c5345M32388.m14845(this.f2280);
                                    float f = this.f2238.mo6303().f69728;
                                    boolean z16 = this.f2270.f55193;
                                    zMo28035 = interfaceC11115.mo28035(new C6175(c9724, abstractC16512, c15277, jM14845, jM2446, f, this.f2236, jM28169));
                                }
                            }
                            if (zMo28035) {
                                m2516(3);
                                this.f2275 = null;
                                if (m2508()) {
                                    m2504(r0, r0);
                                    this.f2238.m24911();
                                    m2513();
                                }
                            }
                        }
                        if (zMo28035) {
                            m2516(3);
                            this.f2275 = null;
                            if (m2508()) {
                                m2504(r0, r0);
                                this.f2238.m24911();
                                m2513();
                            }
                        }
                    } else {
                        j7 = j7;
                    }
                    if (this.f2270.f55180 == 3 && (this.f2279 != 0 ? !z2 : !m2510())) {
                        m2504(m2508(), r0);
                        m2516(2);
                        if (this.f2236) {
                            for (c5345M32387 = this.f2225.m32387(); c5345M32387 != null; c5345M32387 = c5345M32387.m14847()) {
                                for (InterfaceC6558 interfaceC6558 : c5345M32387.m14850().f34440) {
                                    if (interfaceC6558 != null) {
                                        interfaceC6558.mo17793();
                                    }
                                }
                            }
                            ((C11218) this.f2252).m28172();
                        }
                        m2438();
                    }
                }
                if (this.f2270.f55180 == 2) {
                    i3 = 0;
                    while (true) {
                        c22424Arr = this.f2229;
                        if (i3 < c22424Arr.length) {
                            break;
                        }
                        if (c22424Arr[i3].m49791(c5345M323810)) {
                            m2440(i3);
                        }
                        i3++;
                    }
                    c17342 = this.f2270;
                    if (c17342.f55185 && c17342.f55183 < 500000 && m2506(this.f2225.m32379()) && m2508()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (!z7) {
                    this.f2244 = j2;
                } else if (this.f2244 == j2) {
                    this.f2244 = this.f2267.mo28888();
                } else if (this.f2267.mo28888() - this.f2244 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
                if (m2508() || this.f2270.f55180 != 3) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (this.f2256 || !this.f2233 || !z8) {
                    z = false;
                }
                c17341 = this.f2270;
                if (c17341.f55190 != z) {
                    this.f2270 = c17341.m40330(z);
                }
                this.f2233 = r0;
                if (!z && (i2 = this.f2270.f55180) != 4 && (z8 || i2 == 2 || (i2 == 3 && this.f2279 != 0))) {
                    m2493(j7);
                }
                Trace.endSection();
                return;
            }
            j2 = -9223372036854775807L;
            if (z4) {
                this.f2262 = r0;
                int i15 = this.f2270.f55194;
                this.f2245.m47155((int) r0);
                m2455(this.f2224.m2923(this.f2270.f55180, (boolean) r0), i15, 5, (boolean) r0);
            }
            if (!z4) {
                c17340 = this.f2270;
                if (c17340.f55180 == 2) {
                    c13107 = this.f2225;
                    if (this.f2279 == 0) {
                        zMo28035 = m2510();
                    } else {
                        if (!z2) {
                            zMo28035 = false;
                        } else if (c17340.f55185) {
                            c5345M32388 = c13107.m32387();
                            if (m2484(this.f2270.f55191, c5345M32388.f18464.f72815)) {
                                jM28169 = ((C11218) this.f2252).m28169();
                            } else {
                                jM28169 = j2;
                            }
                            c5345M32379 = c13107.m32379();
                            if (c5345M32379.m14831()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c5345M32379.f18464.f72815.m36576()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            zMo28035 = z5 ? true : true;
                        }
                        if (zMo28035) {
                            m2516(3);
                            this.f2275 = null;
                            if (m2508()) {
                                m2504(r0, r0);
                                this.f2238.m24911();
                                m2513();
                            }
                        }
                    }
                    if (zMo28035) {
                        m2516(3);
                        this.f2275 = null;
                        if (m2508()) {
                            m2504(r0, r0);
                            this.f2238.m24911();
                            m2513();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f2270.f55180 == 3) {
                    m2504(m2508(), r0);
                    m2516(2);
                    if (this.f2236) {
                        while (c5345M32387 != null) {
                            while (i < r5) {
                                if (interfaceC6558 != null) {
                                    interfaceC6558.mo17793();
                                }
                            }
                        }
                        ((C11218) this.f2252).m28172();
                    }
                    m2438();
                }
            } else {
                c17340 = this.f2270;
                if (c17340.f55180 == 2) {
                    c13107 = this.f2225;
                    if (this.f2279 == 0) {
                        zMo28035 = m2510();
                    } else {
                        if (!z2) {
                            zMo28035 = false;
                        } else if (c17340.f55185) {
                            c5345M32388 = c13107.m32387();
                            if (m2484(this.f2270.f55191, c5345M32388.f18464.f72815)) {
                                jM28169 = ((C11218) this.f2252).m28169();
                            } else {
                                jM28169 = j2;
                            }
                            c5345M32379 = c13107.m32379();
                            if (c5345M32379.m14831()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (c5345M32379.f18464.f72815.m36576()) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                            }
                        }
                        if (zMo28035) {
                            m2516(3);
                            this.f2275 = null;
                            if (m2508()) {
                                m2504(r0, r0);
                                this.f2238.m24911();
                                m2513();
                            }
                        }
                    }
                    if (zMo28035) {
                        m2516(3);
                        this.f2275 = null;
                        if (m2508()) {
                            m2504(r0, r0);
                            this.f2238.m24911();
                            m2513();
                        }
                    }
                } else {
                    j7 = j7;
                }
                if (this.f2270.f55180 == 3) {
                    m2504(m2508(), r0);
                    m2516(2);
                    if (this.f2236) {
                        while (c5345M32387 != null) {
                            while (i < r5) {
                                if (interfaceC6558 != null) {
                                    interfaceC6558.mo17793();
                                }
                            }
                        }
                        ((C11218) this.f2252).m28172();
                    }
                    m2438();
                }
            }
            if (this.f2270.f55180 == 2) {
                i3 = 0;
                while (true) {
                    c22424Arr = this.f2229;
                    if (i3 < c22424Arr.length) {
                        break;
                        break;
                    } else {
                        if (c22424Arr[i3].m49791(c5345M323810)) {
                            m2440(i3);
                        }
                        i3++;
                    }
                }
                c17342 = this.f2270;
                if (c17342.f55185) {
                    z7 = false;
                } else {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            if (!z7) {
                this.f2244 = j2;
            } else if (this.f2244 == j2) {
                this.f2244 = this.f2267.mo28888();
            } else if (this.f2267.mo28888() - this.f2244 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
            if (m2508()) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f2256) {
                z = false;
            } else {
                z = false;
            }
            c17341 = this.f2270;
            if (c17341.f55190 != z) {
                this.f2270 = c17341.m40330(z);
            }
            this.f2233 = r0;
            if (!z) {
                m2493(j7);
            }
            Trace.endSection();
            return;
        }
        m2493(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2458(final int i, final boolean z) {
        boolean[] zArr = this.f2261;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f2272.mo21243(new Runnable() { // from class: l.᩸ܽۙ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    boolean z2 = z;
                    C0530 c0530 = this.f70381;
                    c0530.f2263.mo2578(i2, c0530.f2229[i2].m49780(), z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m2449(AbstractC16511 abstractC16511, Object obj, long j) {
        long jElapsedRealtime;
        C20039 c20039 = this.f2269;
        int i = abstractC16511.mo38826(obj, c20039).f64168;
        C0282 c0282 = this.f2243;
        abstractC16511.m38827(i, c0282);
        if (c0282.f1585 == -9223372036854775807L || !c0282.m1798() || !c0282.f1583) {
            return -9223372036854775807L;
        }
        long j2 = c0282.f1586;
        if (j2 == -9223372036854775807L) {
            jElapsedRealtime = System.currentTimeMillis();
        } else {
            jElapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C17983.m41827(jElapsedRealtime - c0282.f1585) - (j + c20039.f64171);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2484(AbstractC16511 abstractC16511, C15274 c15274) {
        if (c15274.m36576() || abstractC16511.m38828()) {
            return false;
        }
        int i = abstractC16511.mo38826(c15274.f49778, this.f2269).f64168;
        C0282 c0282 = this.f2243;
        abstractC16511.m38827(i, c0282);
        return c0282.m1798() && c0282.f1583 && c0282.f1585 != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:24:0x00b7, B:26:0x00c1, B:29:0x00c8, B:31:0x00ce, B:32:0x00d1, B:33:0x00d6, B:35:0x00e0, B:37:0x00e8, B:41:0x00f0, B:45:0x00fe, B:46:0x0103, B:48:0x010b, B:50:0x011b, B:54:0x0125, B:57:0x0132, B:61:0x0141, B:65:0x0152), top: B:84:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2475(C20287 c20287, boolean z) throws Throwable {
        long j;
        long j2;
        C15274 c15274;
        long j3;
        boolean z2;
        C15274 c15275;
        boolean z3;
        long jLongValue;
        boolean z4;
        long j4;
        long j5;
        boolean z5;
        C13107 c13107;
        boolean z6;
        long jM2448;
        boolean z7;
        C5345 c5345M32387;
        long jMo7681;
        C17340 c17340;
        int i;
        int i2;
        boolean z8;
        long j6;
        this.f2245.m47155(z ? 1 : 0);
        if (this.f2231) {
            this.f2266 = c20287;
            return;
        }
        Pair pairM2451 = m2451(this.f2270.f55191, c20287, true, this.f2248, this.f2227, this.f2243, this.f2269);
        try {
            if (pairM2451 == null) {
                Pair pairM2450 = m2450(this.f2270.f55191);
                c15275 = (C15274) pairM2450.first;
                jLongValue = ((Long) pairM2450.second).longValue();
                z3 = !this.f2270.f55191.m38828();
                j = -9223372036854775807L;
            } else {
                Object obj = pairM2451.first;
                long jLongValue2 = ((Long) pairM2451.second).longValue();
                long j7 = c20287.f65741 == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                C15274 c15274M32374 = this.f2225.m32374(this.f2270.f55191, obj, jLongValue2);
                if (c15274M32374.m36576()) {
                    this.f2270.f55191.mo38826(c15274M32374.f49778, this.f2269);
                    if (this.f2269.m45390(c15274M32374.f49779) == c15274M32374.f49782) {
                        this.f2269.f64170.getClass();
                    }
                    c15275 = c15274M32374;
                    z3 = true;
                    jLongValue = 0;
                    j = j7;
                } else if (c20287.f65741 == -9223372036854775807L) {
                    j = j7;
                    j2 = 0;
                    c15274 = c15274M32374;
                    j3 = jLongValue2;
                    z2 = true;
                } else {
                    j = j7;
                    j2 = 0;
                    c15274 = c15274M32374;
                    j3 = jLongValue2;
                    z2 = false;
                }
                if (this.f2270.f55191.m38828()) {
                    this.f2242 = c20287;
                } else if (pairM2451 == null) {
                    if (this.f2270.f55180 != 1) {
                        m2516(4);
                    }
                    m2481(false, true, false, true);
                } else {
                    try {
                        if (c15274.equals(this.f2270.f55179)) {
                            c5345M32387 = this.f2225.m32387();
                            if (c5345M32387 == null && c5345M32387.f18459 && j3 != j2) {
                                ?? r1 = c5345M32387.f18461;
                                long j8 = this.f2243.f1588;
                                if (this.f2259 && j8 != -9223372036854775807L) {
                                    this.f2253.getClass();
                                }
                                jMo7681 = r1.mo7681(j3, this.f2239);
                            } else {
                                jMo7681 = j3;
                            }
                            if (C17983.m41856(jMo7681) == C17983.m41856(this.f2270.f55192) || !((i = (c17340 = this.f2270).f55180) == 2 || i == 3)) {
                                j5 = jMo7681;
                            } else {
                                i2 = 2;
                                z8 = z2;
                                j6 = c17340.f55192;
                            }
                            this.f2270 = m2454(c15274, j6, j, j6, z8, i2);
                            return;
                        }
                        j5 = j3;
                        C17340 c17341 = this.f2270;
                        AbstractC16511 abstractC16511 = c17341.f55191;
                        m2471(abstractC16511, c15274, abstractC16511, c17341.f55179, j, true);
                        z2 = z4;
                        j3 = jM2448;
                    } catch (Throwable th) {
                        th = th;
                        j4 = jM2448;
                        this.f2270 = m2454(c15274, j4, j, j4, z4, 2);
                        throw th;
                    }
                    this.f2231 = this.f2259;
                    if (this.f2270.f55180 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c13107 = this.f2225;
                    if (c13107.m32387() != c13107.m32366()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    jM2448 = m2448(c15274, j5, z6, z5);
                    if (j3 != jM2448) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z4 = z2 | z7;
                }
                z8 = z2;
                j6 = j3;
                i2 = 2;
                this.f2270 = m2454(c15274, j6, j, j6, z8, i2);
                return;
            }
            if (this.f2270.f55191.m38828()) {
                this.f2242 = c20287;
            } else if (pairM2451 == null) {
                if (this.f2270.f55180 != 1) {
                    m2516(4);
                }
                m2481(false, true, false, true);
            } else {
                if (c15274.equals(this.f2270.f55179)) {
                    c5345M32387 = this.f2225.m32387();
                    if (c5345M32387 == null) {
                        jMo7681 = j3;
                    } else {
                        jMo7681 = j3;
                    }
                    if (C17983.m41856(jMo7681) == C17983.m41856(this.f2270.f55192)) {
                    }
                    j5 = jMo7681;
                } else {
                    j5 = j3;
                }
                this.f2231 = this.f2259;
                if (this.f2270.f55180 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c13107 = this.f2225;
                if (c13107.m32387() != c13107.m32366()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jM2448 = m2448(c15274, j5, z6, z5);
                if (j3 != jM2448) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z2 | z7;
                C17340 c17342 = this.f2270;
                AbstractC16511 abstractC16512 = c17342.f55191;
                m2471(abstractC16512, c15274, abstractC16512, c17342.f55179, j, true);
                z2 = z4;
                j3 = jM2448;
            }
            z8 = z2;
            j6 = j3;
            i2 = 2;
            this.f2270 = m2454(c15274, j6, j, j6, z8, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            z4 = z2;
            j4 = j3;
        }
        j2 = 0;
        j3 = jLongValue;
        c15274 = c15275;
        z2 = z3;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m2448(C15274 c15274, long j, boolean z, boolean z2) {
        C22424[] c22424Arr;
        m2438();
        m2504(false, true);
        if (z2 || this.f2270.f55180 == 3) {
            m2516(2);
        }
        C13107 c13107 = this.f2225;
        C5345 c5345M32387 = c13107.m32387();
        C5345 c5345M14847 = c5345M32387;
        while (c5345M14847 != null && !c15274.equals(c5345M14847.f18464.f72815)) {
            c5345M14847 = c5345M14847.m14847();
        }
        if (z || c5345M32387 != c5345M14847 || (c5345M14847 != null && c5345M14847.m14833(j) < 0)) {
            int i = 0;
            while (true) {
                c22424Arr = this.f2229;
                if (i >= c22424Arr.length) {
                    break;
                }
                int iM49783 = c22424Arr[i].m49783();
                c22424Arr[i].m49771(this.f2238);
                m2458(i, false);
                this.f2279 -= iM49783;
                i++;
            }
            this.f2273 = -9223372036854775807L;
            if (c5345M14847 != null) {
                while (c13107.m32387() != c5345M14847) {
                    c13107.m32371();
                }
                c13107.m32367(c5345M14847);
                c5345M14847.m14849(BasicLabelFormatter.TRILLION);
                m2482(new boolean[c22424Arr.length], c13107.m32366().m14832());
                c5345M14847.f18460 = true;
            }
        }
        m2518();
        if (c5345M14847 != null) {
            ?? r10 = c5345M14847.f18461;
            c13107.m32367(c5345M14847);
            if (!c5345M14847.f18459) {
                c5345M14847.f18464 = c5345M14847.f18464.m49453(j);
            } else if (c5345M14847.f18466) {
                j = r10.mo7680(j);
                r10.mo7685(j - this.f2265, this.f2237);
            }
            m2500(j);
            m2511();
        } else {
            c13107.m32365();
            m2500(j);
        }
        m2498(false);
        this.f2228.mo21248(2);
        return j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2500(long j) {
        C5345 c5345M32387 = this.f2225.m32387();
        long jM14833 = c5345M32387 == null ? j + BasicLabelFormatter.TRILLION : c5345M32387.m14833(j);
        this.f2280 = jM14833;
        this.f2238.m24912(jM14833);
        for (C22424 c22424 : this.f2229) {
            c22424.m49769(c5345M32387, this.f2280);
        }
        for (C5345 c5345M32388 = r0.m32387(); c5345M32388 != null; c5345M32388 = c5345M32388.m14847()) {
            for (InterfaceC6558 interfaceC6558 : c5345M32388.m14850().f34440) {
                if (interfaceC6558 != null) {
                    interfaceC6558.mo17794();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2465(C6901 c6901) {
        this.f2239 = c6901;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m2517(boolean z) throws Throwable {
        if (!z) {
            this.f2231 = false;
            this.f2228.mo21246(37);
            C20287 c20287 = this.f2266;
            if (c20287 != null) {
                m2475(c20287, false);
                this.f2266 = null;
            }
        }
        this.f2259 = z;
        for (C22424 c22424 : this.f2229) {
            c22424.m49768(this.f2259 ? this.f2253 : null);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2501(C4078 c4078) {
        this.f2253 = c4078;
        for (C22424 c22424 : this.f2229) {
            c22424.m49768(this.f2259 ? this.f2253 : null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2479(boolean z, C22176 c22176) {
        if (this.f2260 != z) {
            this.f2260 = z;
            if (!z) {
                for (C22424 c22424 : this.f2229) {
                    c22424.m49779();
                }
            }
        }
        if (c22176 != null) {
            c22176.m49198();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2460(Object obj, C22176 c22176) {
        for (C22424 c22424 : this.f2229) {
            c22424.m49766(obj);
        }
        int i = this.f2270.f55180;
        if (i == 3 || i == 2) {
            this.f2228.mo21248(2);
        }
        if (c22176 != null) {
            c22176.m49198();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2480(boolean z, boolean z2) {
        m2481(z || !this.f2260, false, true, false);
        this.f2245.m47155(z2 ? 1 : 0);
        this.f2230.mo28037(this.f2274);
        this.f2224.m2923(1, this.f2270.f55193);
        m2516(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2478(C22176 c22176) {
        C6051 c6051 = this.f2249;
        InterfaceC8065 interfaceC8065 = this.f2228;
        try {
            m2481(true, false, true, false);
            C22424[] c22424Arr = this.f2229;
            for (int i = 0; i < c22424Arr.length; i++) {
                ((AbstractC16862) this.f2241[i]).m39521();
                c22424Arr[i].m49759();
            }
            this.f2230.mo28039(this.f2274);
            this.f2224.m2925();
            this.f2257.mo22498();
            m2516(1);
        } finally {
            interfaceC8065.mo21247();
            c6051.m16450();
            c22176.m49198();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r0
      0x010e: PHI (r0v13 l.ܽ۠ۙ) = (r0v12 l.ܽ۠ۙ), (r0v12 l.ܽ۠ۙ), (r0v18 l.ܽ۠ۙ), (r0v18 l.ܽ۠ۙ) binds: [B:39:0x00d2, B:41:0x00d6, B:43:0x00e7, B:45:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2481(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        long j2;
        long j3;
        AbstractC16511 abstractC16511;
        C15274 c15274;
        this.f2228.mo21246(2);
        this.f2231 = false;
        this.f2266 = null;
        this.f2275 = null;
        m2504(false, true);
        this.f2238.m24914();
        this.f2280 = BasicLabelFormatter.TRILLION;
        int i = 0;
        while (true) {
            try {
                C22424[] c22424Arr = this.f2229;
                if (i >= c22424Arr.length) {
                    break;
                }
                int iM49783 = c22424Arr[i].m49783();
                c22424Arr[i].m49771(this.f2238);
                m2458(i, false);
                this.f2279 -= iM49783;
                i++;
            } catch (RuntimeException | C2170 e) {
                C0303.m1854("Disable failed.", e);
            }
        }
        this.f2273 = -9223372036854775807L;
        if (z) {
            for (C22424 c22424 : this.f2229) {
                try {
                    c22424.m49779();
                } catch (RuntimeException e2) {
                    C0303.m1854("Reset failed.", e2);
                }
            }
        }
        this.f2279 = 0;
        C17340 c17340 = this.f2270;
        C15274 c15275 = c17340.f55179;
        long j4 = c17340.f55192;
        if (this.f2270.f55179.m36576()) {
            j = this.f2270.f55189;
        } else {
            C17340 c17341 = this.f2270;
            C20039 c20039 = this.f2269;
            C15274 c15276 = c17341.f55179;
            AbstractC16511 abstractC16512 = c17341.f55191;
            if (abstractC16512.m38828() || abstractC16512.mo38826(c15276.f49778, c20039).f64169) {
                j = this.f2270.f55189;
            } else {
                j = this.f2270.f55192;
            }
        }
        if (z2) {
            this.f2242 = null;
            Pair pairM2450 = m2450(this.f2270.f55191);
            c15275 = (C15274) pairM2450.first;
            long jLongValue = ((Long) pairM2450.second).longValue();
            z5 = c15275.equals(this.f2270.f55179) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            z5 = false;
            j2 = j4;
            j3 = j;
        }
        this.f2225.m32365();
        this.f2277 = false;
        AbstractC16511 abstractC16511M24449 = this.f2270.f55191;
        if (z3 && (abstractC16511M24449 instanceof C9580)) {
            abstractC16511M24449 = ((C9580) abstractC16511M24449).m24449(this.f2276.m30857());
            if (c15275.f49779 != -1) {
                abstractC16511M24449.mo38826(c15275.f49778, this.f2269);
                int i2 = this.f2269.f64168;
                C0282 c0282 = this.f2243;
                abstractC16511M24449.mo14810(i2, c0282, 0L);
                if (c0282.m1798()) {
                    abstractC16511 = abstractC16511M24449;
                    c15274 = new C15274(c15275.f49780, c15275.f49778);
                } else {
                    abstractC16511 = abstractC16511M24449;
                    c15274 = c15275;
                }
            } else {
                abstractC16511 = abstractC16511M24449;
                c15274 = c15275;
            }
        } else {
            abstractC16511 = abstractC16511M24449;
            c15274 = c15275;
        }
        C17340 c17342 = this.f2270;
        int i3 = c17342.f55180;
        C2170 c2170 = z4 ? null : c17342.f55186;
        C23679 c23679 = z5 ? C23679.f76611 : c17342.f55184;
        C10087 c10087 = z5 ? this.f2250 : c17342.f55181;
        List listOf = z5 ? AbstractC22433.of() : c17342.f55182;
        C17340 c17343 = this.f2270;
        this.f2270 = new C17340(abstractC16511, c15274, j3, j2, i3, c2170, false, c23679, c10087, listOf, c15274, c17343.f55193, c17343.f55175, c17343.f55194, c17343.f55177, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f2225.m32388();
            this.f2276.m30858();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m2450(AbstractC16511 abstractC16511) {
        long j = 0;
        if (abstractC16511.m38828()) {
            return Pair.create(C17340.m40317(), 0L);
        }
        int iMo24007 = abstractC16511.mo24007(this.f2227);
        Pair pairM38824 = abstractC16511.m38824(this.f2243, this.f2269, iMo24007, -9223372036854775807L);
        C15274 c15274M32374 = this.f2225.m32374(abstractC16511, pairM38824.first, 0L);
        long jLongValue = ((Long) pairM38824.second).longValue();
        if (c15274M32374.m36576()) {
            Object obj = c15274M32374.f49778;
            C20039 c20039 = this.f2269;
            abstractC16511.mo38826(obj, c20039);
            if (c15274M32374.f49782 == c20039.m45390(c15274M32374.f49779)) {
                c20039.f64170.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c15274M32374, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2496(C14519 c14519) {
        c14519.getClass();
        Looper looperM34951 = c14519.m34951();
        Looper looper = this.f2246;
        InterfaceC8065 interfaceC8065 = this.f2228;
        if (looperM34951 == looper) {
            m2503(c14519);
            int i = this.f2270.f55180;
            if (i == 3 || i == 2) {
                interfaceC8065.mo21248(2);
                return;
            }
            return;
        }
        interfaceC8065.mo21240(15, c14519).mo3909();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2441(final C14519 c14519) {
        Looper looperM34951 = c14519.m34951();
        if (!looperM34951.getThread().isAlive()) {
            C0303.m1848("Trying to send message on a dead thread.");
            c14519.m34954(false);
        } else {
            this.f2267.mo28887(looperM34951, null).mo21243(new Runnable() { // from class: l.ᩳܽۙ
                @Override // java.lang.Runnable
                public final void run() {
                    C0530.m2462(this.f58063, c14519);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2462(C0530 c0530, C14519 c14519) {
        try {
            m2503(c14519);
        } catch (C2170 e) {
            C0303.m1854("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2472(AbstractC16511 abstractC16511, AbstractC16511 abstractC16512) {
        if (abstractC16511.m38828() && abstractC16512.m38828()) {
            return;
        }
        ArrayList arrayList = this.f2278;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((C7586) arrayList.get(size)).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m2518() {
        if (this.f2247 && m2444()) {
            for (C22424 c22424 : this.f2229) {
                int iM49783 = c22424.m49783();
                c22424.m49787(this.f2238);
                this.f2279 -= iM49783 - c22424.m49783();
            }
            this.f2273 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2483(int i, C15274 c15274) {
        C13107 c13107 = this.f2225;
        if (c13107.m32383() == null || !c13107.m32383().f18464.f72815.equals(c15274)) {
            return false;
        }
        return this.f2229[i].m49778(c13107.m32383());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m2487() {
        m2488();
        m2442(true);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m2488() {
        float f = this.f2238.mo6303().f69728;
        C5345 c5345M32387 = this.f2225.m32387();
        C5345 c5345M32366 = this.f2225.m32366();
        C10087 c10087 = null;
        boolean z = true;
        while (c5345M32387 != null && c5345M32387.f18459) {
            C17340 c17340 = this.f2270;
            C10087 c10087M14848 = c5345M32387.m14848(f, c17340.f55191, c17340.f55193);
            C10087 c10088 = c5345M32387 == this.f2225.m32387() ? c10087M14848 : c10087;
            C10087 c10087M14850 = c5345M32387.m14850();
            InterfaceC6558[] interfaceC6558Arr = c10087M14848.f34440;
            if (c10087M14850 != null && c10087M14850.f34440.length == interfaceC6558Arr.length) {
                int i = 0;
                while (true) {
                    if (i < interfaceC6558Arr.length) {
                        if (c10087M14848.m25497(c10087M14850, i)) {
                            i++;
                        }
                    } else {
                        if (c5345M32387 == c5345M32366) {
                            z = false;
                        }
                        c5345M32387 = c5345M32387.m14847();
                        c10087 = c10088;
                    }
                }
            }
            if (z) {
                C5345 c5345M32388 = this.f2225.m32387();
                boolean z2 = (this.f2225.m32367(c5345M32388) & 1) != 0;
                boolean[] zArr = new boolean[this.f2229.length];
                c10088.getClass();
                long jM14837 = c5345M32388.m14837(c10088, this.f2270.f55192, z2, zArr);
                C17340 c17341 = this.f2270;
                boolean z3 = (c17341.f55180 == 4 || jM14837 == c17341.f55192) ? false : true;
                C17340 c17342 = this.f2270;
                this.f2270 = m2454(c17342.f55179, jM14837, c17342.f55189, c17342.f55187, z3, 5);
                if (z3) {
                    m2500(jM14837);
                }
                m2518();
                boolean[] zArr2 = new boolean[this.f2229.length];
                int i2 = 0;
                while (true) {
                    C22424[] c22424Arr = this.f2229;
                    if (i2 >= c22424Arr.length) {
                        break;
                    }
                    int iM49783 = c22424Arr[i2].m49783();
                    zArr2[i2] = this.f2229[i2].m49756();
                    this.f2229[i2].m49774(c5345M32388.f18467[i2], this.f2238, this.f2280, zArr[i2]);
                    if (iM49783 - this.f2229[i2].m49783() > 0) {
                        m2458(i2, false);
                    }
                    this.f2279 -= iM49783 - this.f2229[i2].m49783();
                    i2++;
                }
                m2482(zArr2, this.f2280);
                c5345M32388.f18460 = true;
            } else {
                this.f2225.m32367(c5345M32387);
                if (c5345M32387.f18459) {
                    long jMax = Math.max(c5345M32387.f18464.f72814, c5345M32387.m14845(this.f2280));
                    if (this.f2247 && m2444() && this.f2225.m32383() == c5345M32387) {
                        m2518();
                    }
                    c5345M32387.m14836(c10087M14848, jMax);
                }
            }
            m2498(true);
            if (this.f2270.f55180 != 4) {
                m2511();
                m2499();
                this.f2228.mo21248(2);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m2510() {
        C5345 c5345M32387 = this.f2225.m32387();
        long j = c5345M32387.f18464.f72812;
        if (c5345M32387.f18459) {
            return j == -9223372036854775807L || this.f2270.f55192 < j || !m2508();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:176:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0371  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2473(AbstractC16511 abstractC16511, boolean z) throws Throwable {
        C15274 c15274;
        Object obj;
        int i;
        int iM2445;
        Object obj2;
        long jM41829;
        ?? r21;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        long j2;
        C16054 c16054;
        int i3;
        int iMo24007;
        boolean z7;
        boolean z8;
        long j3;
        ?? r8;
        int i4;
        long jM2448;
        int i5;
        long j4;
        Object obj3;
        boolean z9;
        int i6;
        C17340 c17340 = this.f2270;
        C20287 c20287 = this.f2242;
        C13107 c13107 = this.f2225;
        int i7 = this.f2248;
        boolean z10 = this.f2227;
        C0282 c0282 = this.f2243;
        C20039 c20039 = this.f2269;
        if (abstractC16511.m38828()) {
            j3 = -9223372036854775807L;
            c16054 = new C16054(C17340.m40317(), 0L, -9223372036854775807L, false, true, false);
            i = -1;
        } else {
            C15274 c15275 = c17340.f55179;
            Object obj4 = c15275.f49778;
            AbstractC16511 abstractC16512 = c17340.f55191;
            boolean z11 = abstractC16512.m38828() || abstractC16512.mo38826(c15275.f49778, c20039).f64169;
            long j5 = (c17340.f55179.m36576() || z11) ? c17340.f55189 : c17340.f55192;
            if (c20287 != null) {
                boolean z12 = false;
                Pair pairM2451 = m2451(abstractC16511, c20287, true, i7, z10, c0282, c20039);
                if (pairM2451 == null) {
                    iMo24007 = abstractC16511.mo24007(z10);
                    jM41829 = j5;
                    obj2 = obj4;
                    z7 = false;
                    z8 = true;
                } else {
                    if (c20287.f65741 == -9223372036854775807L) {
                        iMo24007 = abstractC16511.mo38826(pairM2451.first, c20039).f64168;
                        jM41829 = j5;
                        obj2 = obj4;
                        z7 = false;
                    } else {
                        obj2 = pairM2451.first;
                        jM41829 = ((Long) pairM2451.second).longValue();
                        iMo24007 = -1;
                        z7 = true;
                    }
                    z12 = c17340.f55180 == 4;
                    z8 = false;
                }
                z4 = z7;
                z3 = z8;
                z2 = z12;
                c15274 = c15275;
                i = -1;
                i2 = iMo24007;
            } else {
                c15274 = c15275;
                if (c17340.f55191.m38828()) {
                    iM2445 = abstractC16511.mo24007(z10);
                    obj = obj4;
                    i = -1;
                } else {
                    obj = obj4;
                    if (abstractC16511.mo14959(obj) == -1) {
                        i = -1;
                        iM2445 = m2445(c0282, c20039, i7, z10, obj, c17340.f55191, abstractC16511);
                        if (iM2445 == -1) {
                            iM2445 = abstractC16511.mo24007(z10);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5;
                        c15274 = c15274;
                        i2 = iM2445;
                        z3 = z6;
                        obj2 = obj;
                        z2 = false;
                        jM41829 = j5;
                        z4 = false;
                    } else {
                        i = -1;
                        if (j5 == -9223372036854775807L) {
                            iM2445 = abstractC16511.mo38826(obj, c20039).f64168;
                        } else if (z11) {
                            c15274 = c15274;
                            c17340.f55191.mo38826(c15274.f49778, c20039);
                            if (c17340.f55191.mo14810(c20039.f64168, c0282, 0L).f1580 == c17340.f55191.mo14959(c15274.f49778)) {
                                Pair pairM38824 = abstractC16511.m38824(c0282, c20039, abstractC16511.mo38826(obj, c20039).f64168, j5 + c20039.f64171);
                                obj2 = pairM38824.first;
                                jM41829 = ((Long) pairM38824.second).longValue();
                            } else if (abstractC16511.mo38826(obj, c20039).f64173 != -9223372036854775807L) {
                                r21 = 0;
                                jM41829 = C17983.m41829(j5, 0L, c20039.f64173 - 1);
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                jM41829 = j5;
                            }
                            i2 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                        } else {
                            iM2445 = -1;
                            z6 = false;
                            i2 = iM2445;
                            z3 = z6;
                            obj2 = obj;
                            z2 = false;
                            jM41829 = j5;
                            z4 = false;
                        }
                    }
                }
                z6 = false;
                i2 = iM2445;
                z3 = z6;
                obj2 = obj;
                z2 = false;
                jM41829 = j5;
                z4 = false;
            }
            if (i2 != i) {
                Pair pairM38825 = abstractC16511.m38824(c0282, c20039, i2, -9223372036854775807L);
                obj2 = pairM38825.first;
                jM41829 = ((Long) pairM38825.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jM41829;
            }
            C15274 c15274M32374 = c13107.m32374(abstractC16511, obj2, jM41829);
            int i8 = c15274M32374.f49781;
            boolean z13 = c15274.f49778.equals(obj2) && !c15274.m36576() && !c15274M32374.m36576() && (i8 == i || ((i3 = c15274.f49781) != i && i8 >= i3));
            C20039 c20039Mo38826 = abstractC16511.mo38826(obj2, c20039);
            if (!z11 && j5 == j) {
                Object obj5 = c15274.f49778;
                int i9 = c15274.f49779;
                if (obj5.equals(c15274M32374.f49778)) {
                    if (c15274.m36576()) {
                        c20039Mo38826.m45384(i9);
                    }
                    if (c15274M32374.m36576()) {
                        c20039Mo38826.m45384(c15274M32374.f49779);
                    }
                }
            }
            if (z13) {
                c15274M32374 = c15274;
            }
            if (!c15274M32374.m36576()) {
                j2 = jM41829;
            } else if (c15274M32374.equals(c15274)) {
                jM41829 = c17340.f55192;
                j2 = jM41829;
            } else {
                abstractC16511.mo38826(c15274M32374.f49778, c20039);
                if (c15274M32374.f49782 == c20039.m45390(c15274M32374.f49779)) {
                    c20039.f64170.getClass();
                }
                j2 = 0;
            }
            c16054 = new C16054(c15274M32374, j2, j, z2, z3, z4);
        }
        C15274 c15276 = c16054.f51945;
        long j6 = c16054.f51944;
        boolean z14 = c16054.f51946;
        long j7 = c16054.f51942;
        boolean z15 = (this.f2270.f55179.equals(c15276) && j7 == this.f2270.f55192) ? false : true;
        try {
            if (c16054.f51943) {
                if (this.f2270.f55180 != 1) {
                    m2516(4);
                }
                m2481(false, false, false, true);
            }
            for (C22424 c22424 : this.f2229) {
                c22424.m49773(abstractC16511);
            }
            try {
                if (z15) {
                    jM2448 = j7;
                    i4 = 2;
                    if (!abstractC16511.m38828()) {
                        for (C5345 c5345M32387 = this.f2225.m32387(); c5345M32387 != null; c5345M32387 = c5345M32387.m14847()) {
                            if (c5345M32387.f18464.f72815.equals(c15276)) {
                                c5345M32387.f18464 = this.f2225.m32376(abstractC16511, c5345M32387.f18464);
                                c5345M32387.m14843();
                            }
                        }
                        C13107 c13108 = this.f2225;
                        jM2448 = m2448(c15276, jM2448, c13108.m32387() != c13108.m32366(), z14);
                        i5 = 2;
                    }
                    C17340 c17341 = this.f2270;
                    AbstractC16511 abstractC16513 = c17341.f55191;
                    C15274 c15277 = c17341.f55179;
                    if (c16054.f51947) {
                        j4 = jM2448;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    m2471(abstractC16511, c15276, abstractC16513, c15277, j4, false);
                    if (z15 || j6 != this.f2270.f55189) {
                        C17340 c17342 = this.f2270;
                        obj3 = c17342.f55179.f49778;
                        AbstractC16511 abstractC16514 = c17342.f55191;
                        if (z15 || !z || abstractC16514.m38828() || abstractC16514.mo38826(obj3, this.f2269).f64169) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        long j8 = this.f2270.f55187;
                        if (abstractC16511.mo14959(obj3) == i) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.f2270 = m2454(c15276, jM2448, j6, j8, z9, i6);
                    }
                    m2514();
                    m2472(abstractC16511, this.f2270.f55191);
                    this.f2270 = this.f2270.m40325(abstractC16511);
                    if (!abstractC16511.m38828()) {
                        this.f2242 = null;
                    }
                    m2498(false);
                    this.f2228.mo21248(i5);
                }
                try {
                    i4 = 2;
                    jM2448 = j7;
                    int iM32369 = this.f2225.m32369(abstractC16511, this.f2280, this.f2225.m32366() == null ? 0L : m2447(this.f2225.m32366()), (!m2444() || this.f2225.m32383() == null) ? 0L : m2447(this.f2225.m32383()));
                    if ((iM32369 & 1) != 0) {
                        m2442(false);
                    } else if ((iM32369 & 2) != 0) {
                        m2518();
                    }
                } catch (Throwable th) {
                    th = th;
                    j3 = j7;
                    r21 = 2;
                    r8 = r21;
                    C17340 c17343 = this.f2270;
                    ?? r37 = r8;
                    m2471(abstractC16511, c15276, c17343.f55191, c17343.f55179, c16054.f51947 ? j3 : -9223372036854775807L, false);
                    if (z15 || j6 != this.f2270.f55189) {
                        C17340 c17344 = this.f2270;
                        Object obj6 = c17344.f55179.f49778;
                        AbstractC16511 abstractC16515 = c17344.f55191;
                        this.f2270 = m2454(c15276, j3, j6, this.f2270.f55187, z15 && z && !abstractC16515.m38828() && !abstractC16515.mo38826(obj6, this.f2269).f64169, abstractC16511.mo14959(obj6) == i ? 4 : 3);
                    }
                    m2514();
                    m2472(abstractC16511, this.f2270.f55191);
                    this.f2270 = this.f2270.m40325(abstractC16511);
                    if (!abstractC16511.m38828()) {
                        this.f2242 = null;
                    }
                    m2498(false);
                    this.f2228.mo21248(r37 == true ? 1 : 0);
                    throw th;
                }
                i5 = i4;
                C17340 c17345 = this.f2270;
                AbstractC16511 abstractC16516 = c17345.f55191;
                C15274 c15278 = c17345.f55179;
                if (c16054.f51947) {
                    j4 = jM2448;
                } else {
                    j4 = -9223372036854775807L;
                }
                m2471(abstractC16511, c15276, abstractC16516, c15278, j4, false);
                if (z15) {
                    C17340 c17346 = this.f2270;
                    obj3 = c17346.f55179.f49778;
                    AbstractC16511 abstractC16517 = c17346.f55191;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j9 = this.f2270.f55187;
                    if (abstractC16511.mo14959(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f2270 = m2454(c15276, jM2448, j6, j9, z9, i6);
                } else {
                    C17340 c17347 = this.f2270;
                    obj3 = c17347.f55179.f49778;
                    AbstractC16511 abstractC16518 = c17347.f55191;
                    if (z15) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    long j10 = this.f2270.f55187;
                    if (abstractC16511.mo14959(obj3) == i) {
                        i6 = 4;
                    } else {
                        i6 = 3;
                    }
                    this.f2270 = m2454(c15276, jM2448, j6, j10, z9, i6);
                }
                m2514();
                m2472(abstractC16511, this.f2270.f55191);
                this.f2270 = this.f2270.m40325(abstractC16511);
                if (!abstractC16511.m38828()) {
                    this.f2242 = null;
                }
                m2498(false);
                this.f2228.mo21248(i5);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            j3 = j7;
            r8 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2471(AbstractC16511 abstractC16511, C15274 c15274, AbstractC16511 abstractC16512, C15274 c15275, long j, boolean z) {
        boolean zM2484 = m2484(abstractC16511, c15274);
        Object obj = c15274.f49778;
        if (!zM2484) {
            C21449 c21449 = c15274.m36576() ? C21449.f69726 : this.f2270.f55177;
            C9807 c9807 = this.f2238;
            if (c9807.mo6303().equals(c21449)) {
                return;
            }
            this.f2228.mo21246(16);
            c9807.mo6301(c21449);
            m2477(this.f2270.f55177, c21449.f69728, false, false);
            return;
        }
        C20039 c20039 = this.f2269;
        int i = abstractC16511.mo38826(obj, c20039).f64168;
        C0282 c0282 = this.f2243;
        abstractC16511.m38827(i, c0282);
        C23876 c23876 = c0282.f1581;
        C11218 c11218 = (C11218) this.f2252;
        c11218.m28171(c23876);
        if (j != -9223372036854775807L) {
            c11218.m28170(m2449(abstractC16511, obj, j));
            return;
        }
        if (!C13638.equals(!abstractC16512.m38828() ? abstractC16512.mo14810(abstractC16512.mo38826(c15275.f49778, c20039).f64168, c0282, 0L).f1591 : null, c0282.f1591) || z) {
            c11218.m28170(-9223372036854775807L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m2447(C5345 c5345) {
        if (c5345 == null) {
            return 0L;
        }
        long jM14844 = c5345.m14844();
        if (!c5345.f18459) {
            return jM14844;
        }
        int i = 0;
        while (true) {
            C22424[] c22424Arr = this.f2229;
            if (i >= c22424Arr.length) {
                return jM14844;
            }
            if (c22424Arr[i].m49791(c5345)) {
                long jM49784 = c22424Arr[i].m49784(c5345);
                if (jM49784 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM14844 = Math.max(jM49784, jM14844);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۜܰܰ, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m2489() {
        C13107 c13107 = this.f2225;
        c13107.m32380();
        C5345 c5345M32364 = c13107.m32364();
        if (c5345M32364 != null) {
            ?? r1 = c5345M32364.f18461;
            if ((!c5345M32364.f18465 || c5345M32364.f18459) && !r1.mo1389()) {
                AbstractC16511 abstractC16511 = this.f2270.f55191;
                if (c5345M32364.f18459) {
                    r1.mo1391();
                }
                if (this.f2230.mo28031()) {
                    if (!c5345M32364.f18465) {
                        long j = c5345M32364.f18464.f72814;
                        c5345M32364.f18465 = true;
                        r1.mo7689(this, j);
                    } else {
                        C23815 c23815 = new C23815();
                        c23815.m52494(c5345M32364.m14845(this.f2280));
                        c23815.m52492(this.f2238.mo6303().f69728);
                        c23815.m52493(this.f2258);
                        c5345M32364.m14841(new C14643(c23815));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m2514() {
        C5345 c5345M32387 = this.f2225.m32387();
        this.f2262 = c5345M32387 != null && c5345M32387.f18464.f72809 && this.f2234;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2495(InterfaceC6806 interfaceC6806) {
        C13107 c13107 = this.f2225;
        boolean zM32385 = c13107.m32385(interfaceC6806);
        C9807 c9807 = this.f2238;
        if (zM32385) {
            C5345 c5345M32379 = c13107.m32379();
            c5345M32379.getClass();
            if (!c5345M32379.f18459) {
                float f = c9807.mo6303().f69728;
                C17340 c17340 = this.f2270;
                c5345M32379.m14838(f, c17340.f55191, c17340.f55193);
            }
            m2470(c5345M32379.f18464.f72815, c5345M32379.m14842(), c5345M32379.m14850());
            if (c5345M32379 == c13107.m32387()) {
                m2500(c5345M32379.f18464.f72814);
                m2482(new boolean[this.f2229.length], c13107.m32366().m14832());
                c5345M32379.f18460 = true;
                C17340 c17341 = this.f2270;
                C15274 c15274 = c17341.f55179;
                long j = c5345M32379.f18464.f72814;
                this.f2270 = m2454(c15274, j, c17341.f55189, j, false, 5);
            }
            m2511();
            return;
        }
        C5345 c5345M32372 = c13107.m32372(interfaceC6806);
        if (c5345M32372 != null) {
            C2023.m6510(true ^ c5345M32372.f18459);
            float f2 = c9807.mo6303().f69728;
            C17340 c17342 = this.f2270;
            c5345M32372.m14838(f2, c17342.f55191, c17342.f55193);
            if (c13107.m32382(interfaceC6806)) {
                m2489();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2502(InterfaceC6806 interfaceC6806) {
        C13107 c13107 = this.f2225;
        if (c13107.m32385(interfaceC6806)) {
            c13107.m32377(this.f2280);
            m2511();
        } else if (c13107.m32382(interfaceC6806)) {
            m2489();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2477(C21449 c21449, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f2245.m47155(1);
            }
            this.f2270 = this.f2270.m40326(c21449);
        }
        float f2 = c21449.f69728;
        C5345 c5345M32387 = this.f2225.m32387();
        while (true) {
            i = 0;
            if (c5345M32387 == null) {
                break;
            }
            InterfaceC6558[] interfaceC6558Arr = c5345M32387.m14850().f34440;
            int length = interfaceC6558Arr.length;
            while (i < length) {
                InterfaceC6558 interfaceC6558 = interfaceC6558Arr[i];
                if (interfaceC6558 != null) {
                    interfaceC6558.mo17788(f2);
                }
                i++;
            }
            c5345M32387 = c5345M32387.m14847();
        }
        C22424[] c22424Arr = this.f2229;
        int length2 = c22424Arr.length;
        while (i < length2) {
            c22424Arr[i].m49764(f, c21449.f69728);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l.ۜܰܰ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m2511() {
        long jM14845;
        boolean zMo28040 = false;
        if (m2506(this.f2225.m32379())) {
            C5345 c5345M32379 = this.f2225.m32379();
            long jM2446 = m2446(!c5345M32379.f18459 ? 0L : c5345M32379.f18461.mo1392());
            if (c5345M32379 == this.f2225.m32387()) {
                jM14845 = c5345M32379.m14845(this.f2280);
            } else {
                jM14845 = c5345M32379.m14845(this.f2280) - c5345M32379.f18464.f72814;
            }
            long j = jM14845;
            long jM28169 = m2484(this.f2270.f55191, c5345M32379.f18464.f72815) ? ((C11218) this.f2252).m28169() : -9223372036854775807L;
            C9724 c9724 = this.f2274;
            AbstractC16511 abstractC16511 = this.f2270.f55191;
            C15274 c15274 = c5345M32379.f18464.f72815;
            float f = this.f2238.mo6303().f69728;
            boolean z = this.f2270.f55193;
            C6175 c6175 = new C6175(c9724, abstractC16511, c15274, j, jM2446, f, this.f2236, jM28169);
            boolean zMo28041 = this.f2230.mo28040(c6175);
            C5345 c5345M32387 = this.f2225.m32387();
            if (zMo28041 || !c5345M32387.f18459 || jM2446 >= 500000 || (this.f2265 <= 0 && !this.f2237)) {
                zMo28040 = zMo28041;
            } else {
                c5345M32387.f18461.mo7685(this.f2270.f55192, false);
                zMo28040 = this.f2230.mo28040(c6175);
            }
        }
        this.f2277 = zMo28040;
        if (zMo28040) {
            C5345 c5345M323710 = this.f2225.m32379();
            c5345M323710.getClass();
            C23815 c23815 = new C23815();
            c23815.m52494(c5345M323710.m14845(this.f2280));
            c23815.m52492(this.f2238.mo6303().f69728);
            c23815.m52493(this.f2258);
            c5345M323710.m14841(new C14643(c23815));
        }
        m2509();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ۜܰܰ, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m2506(C5345 c5345) {
        if (c5345 != null) {
            try {
                ?? r1 = c5345.f18461;
                if (!c5345.f18459) {
                    r1.mo7692();
                } else {
                    for (InterfaceC18739 interfaceC18739 : c5345.f18467) {
                        if (interfaceC18739 != null) {
                            interfaceC18739.mo12777();
                        }
                    }
                }
                if ((!c5345.f18459 ? 0L : r1.mo1392()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.᩵ۨܰ] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m2509() {
        C5345 c5345M32379 = this.f2225.m32379();
        boolean z = this.f2277 || (c5345M32379 != null && c5345M32379.f18461.mo1389());
        C17340 c17340 = this.f2270;
        if (z != c17340.f55185) {
            this.f2270 = c17340.m40327(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17340 m2454(C15274 c15274, long j, long j2, long j3, boolean z, int i) {
        List list;
        C5345 c5345M32387;
        boolean z2;
        this.f2240 = (!this.f2240 && j == this.f2270.f55192 && c15274.equals(this.f2270.f55179)) ? false : true;
        m2514();
        C17340 c17340 = this.f2270;
        C23679 c23679M14842 = c17340.f55184;
        C10087 c10087M14850 = c17340.f55181;
        List listOf = c17340.f55182;
        if (this.f2276.m30845()) {
            C5345 c5345M32388 = this.f2225.m32387();
            if (c5345M32388 == null) {
                c23679M14842 = C23679.f76611;
            } else {
                c23679M14842 = c5345M32388.m14842();
            }
            if (c5345M32388 == null) {
                c10087M14850 = this.f2250;
            } else {
                c10087M14850 = c5345M32388.m14850();
            }
            InterfaceC6558[] interfaceC6558Arr = c10087M14850.f34440;
            C4793 c4793 = new C4793();
            boolean z3 = false;
            for (InterfaceC6558 interfaceC6558 : interfaceC6558Arr) {
                if (interfaceC6558 != null) {
                    C0987 c0987 = interfaceC6558.mo37958(0).f25258;
                    if (c0987 == null) {
                        c4793.m52163(new C0987(new InterfaceC22155[0]));
                    } else {
                        c4793.m52163(c0987);
                        z3 = true;
                    }
                }
            }
            AbstractC22433 abstractC22433M13309 = z3 ? c4793.m13309() : AbstractC22433.of();
            if (c5345M32388 != null) {
                C22279 c22279 = c5345M32388.f18464;
                if (c22279.f72811 != j2) {
                    c5345M32388.f18464 = c22279.m49452(j2);
                }
            }
            C22424[] c22424Arr = this.f2229;
            C13107 c13107 = this.f2225;
            if (c13107.m32387() == c13107.m32366() && (c5345M32387 = c13107.m32387()) != null) {
                C10087 c10087M14851 = c5345M32387.m14850();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c22424Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (c10087M14851.m25496(i2)) {
                        if (c22424Arr[i2].m49780() != 1) {
                            z2 = false;
                            break;
                        }
                        if (c10087M14851.f34443[i2].f18885 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f2256) {
                    this.f2256 = z5;
                    if (!z5 && this.f2270.f55190) {
                        this.f2228.mo21248(2);
                    }
                }
            }
            list = abstractC22433M13309;
        } else {
            if (!c15274.equals(this.f2270.f55179)) {
                c23679M14842 = C23679.f76611;
                c10087M14850 = this.f2250;
                listOf = AbstractC22433.of();
            }
            list = listOf;
        }
        C23679 c23679 = c23679M14842;
        C10087 c10087 = c10087M14850;
        if (z) {
            this.f2245.m47157(i);
        }
        C17340 c17341 = this.f2270;
        return c17341.m40324(c15274, j, j2, j3, m2446(c17341.f55178), c23679, c10087, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2482(boolean[] zArr, long j) {
        C22424[] c22424Arr;
        C5345 c5345M32366 = this.f2225.m32366();
        C10087 c10087M14850 = c5345M32366.m14850();
        int i = 0;
        while (true) {
            c22424Arr = this.f2229;
            if (i >= c22424Arr.length) {
                break;
            }
            if (!c10087M14850.m25496(i)) {
                c22424Arr[i].m49779();
            }
            i++;
        }
        for (int i2 = 0; i2 < c22424Arr.length; i2++) {
            if (c10087M14850.m25496(i2) && !c22424Arr[i2].m49791(c5345M32366)) {
                m2464(c5345M32366, i2, zArr[i2], j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2464(C5345 c5345, int i, boolean z, long j) {
        C22424 c22424 = this.f2229[i];
        if (c22424.m49756()) {
            return;
        }
        boolean z2 = c5345 == this.f2225.m32387();
        C10087 c10087M14850 = c5345.m14850();
        C5490 c5490 = c10087M14850.f34443[i];
        InterfaceC6558 interfaceC6558 = c10087M14850.f34440[i];
        boolean z3 = m2508() && this.f2270.f55180 == 3;
        boolean z4 = !z && z3;
        this.f2279++;
        c22424.m49770(c5490, interfaceC6558, c5345.f18467[i], this.f2280, z4, z2, j, c5345.m14844(), c5345.f18464.f72815, this.f2238);
        c22424.m49767(new C19581(this), c5345);
        if (z3 && z2) {
            c22424.m49792();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2498(boolean z) {
        long jM14835;
        C5345 c5345M32379 = this.f2225.m32379();
        C15274 c15274 = c5345M32379 == null ? this.f2270.f55179 : c5345M32379.f18464.f72815;
        boolean zEquals = this.f2270.f55176.equals(c15274);
        if (!zEquals) {
            this.f2270 = this.f2270.m40323(c15274);
        }
        C17340 c17340 = this.f2270;
        if (c5345M32379 == null) {
            jM14835 = c17340.f55192;
        } else {
            jM14835 = c5345M32379.m14835();
        }
        c17340.f55178 = jM14835;
        C17340 c17341 = this.f2270;
        c17341.f55183 = m2446(c17341.f55178);
        if ((!zEquals || z) && c5345M32379 != null && c5345M32379.f18459) {
            m2470(c5345M32379.f18464.f72815, c5345M32379.m14842(), c5345M32379.m14850());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m2446(long j) {
        C5345 c5345M32379 = this.f2225.m32379();
        if (c5345M32379 == null) {
            return 0L;
        }
        return Math.max(0L, j - c5345M32379.m14845(this.f2280));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2470(C15274 c15274, C23679 c23679, C10087 c10087) {
        long jM14845;
        C13107 c13107 = this.f2225;
        C5345 c5345M32379 = c13107.m32379();
        c5345M32379.getClass();
        if (c5345M32379 == c13107.m32387()) {
            jM14845 = c5345M32379.m14845(this.f2280);
        } else {
            jM14845 = c5345M32379.m14845(this.f2280) - c5345M32379.f18464.f72814;
        }
        long j = jM14845;
        long jM2446 = m2446(c5345M32379.m14835());
        long jM28169 = m2484(this.f2270.f55191, c5345M32379.f18464.f72815) ? ((C11218) this.f2252).m28169() : -9223372036854775807L;
        AbstractC16511 abstractC16511 = this.f2270.f55191;
        float f = this.f2238.mo6303().f69728;
        boolean z = this.f2270.f55193;
        this.f2230.mo28032(new C6175(this.f2274, abstractC16511, c15274, j, jM2446, f, this.f2236, jM28169), c10087.f34440);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m2508() {
        C17340 c17340 = this.f2270;
        return c17340.f55193 && c17340.f55194 == 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2440(int i) {
        C22424 c22424 = this.f2229[i];
        try {
            C5345 c5345M32387 = this.f2225.m32387();
            c5345M32387.getClass();
            c22424.m49755(c5345M32387);
        } catch (IOException | RuntimeException e) {
            int iM49780 = c22424.m49780();
            if (iM49780 == 3 || iM49780 == 5) {
                C10087 c10087M14850 = this.f2225.m32387().m14850();
                C0303.m1854("Disabling track due to error: " + C7648.m20199(c10087M14850.f34440[i].mo17795()), e);
                C10087 c10087 = new C10087((C5490[]) c10087M14850.f34443.clone(), (InterfaceC6558[]) c10087M14850.f34440.clone(), c10087M14850.f34442, c10087M14850.f34441);
                c10087.f34443[i] = null;
                c10087.f34440[i] = null;
                C22424[] c22424Arr = this.f2229;
                int iM49783 = c22424Arr[i].m49783();
                c22424Arr[i].m49771(this.f2238);
                m2458(i, false);
                this.f2279 -= iM49783;
                this.f2225.m32387().m14836(c10087, this.f2270.f55192);
                return;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m2444() {
        if (!this.f2247) {
            return false;
        }
        for (C22424 c22424 : this.f2229) {
            if (c22424.m49790()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m2443(C0530 c0530) {
        return c0530.f2259 && c0530.f2253.f14992;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m2493(long j) {
        boolean z = this.f2259;
        long jMin = 1000;
        long j2 = f2223;
        if (z && this.f2253.f14992) {
            jMin = this.f2270.f55180 != 3 ? j2 : 1000L;
            for (C22424 c22424 : this.f2229) {
                jMin = Math.min(jMin, C17983.m41856(c22424.m49761(this.f2280, this.f2251)));
            }
            if (this.f2270.m40328()) {
                C13107 c13107 = this.f2225;
                C5345 c5345M14847 = c13107.m32387() != null ? c13107.m32387().m14847() : null;
                if (c5345M14847 != null) {
                    if ((C17983.m41827(jMin) * this.f2270.f55177.f69728) + this.f2280 >= c5345M14847.m14832()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.f2270.f55180 != 3 || m2508()) {
            jMin = j2;
        }
        this.f2228.mo21242(j + jMin);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m2504(boolean z, boolean z2) {
        this.f2236 = z;
        this.f2258 = (!z || z2) ? -9223372036854775807L : this.f2267.mo28888();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pair m2451(AbstractC16511 abstractC16511, C20287 c20287, boolean z, int i, boolean z2, C0282 c0282, C20039 c20039) {
        int iM2445;
        AbstractC16511 abstractC16512 = c20287.f65740;
        if (abstractC16511.m38828()) {
            return null;
        }
        AbstractC16511 abstractC16513 = abstractC16512.m38828() ? abstractC16511 : abstractC16512;
        try {
            Pair pairM38824 = abstractC16513.m38824(c0282, c20039, c20287.f65742, c20287.f65741);
            if (!abstractC16511.equals(abstractC16513)) {
                if (abstractC16511.mo14959(pairM38824.first) == -1) {
                    if (!z || (iM2445 = m2445(c0282, c20039, i, z2, pairM38824.first, abstractC16513, abstractC16511)) == -1) {
                        return null;
                    }
                    return abstractC16511.m38824(c0282, c20039, iM2445, -9223372036854775807L);
                }
                if (abstractC16513.mo38826(pairM38824.first, c20039).f64169 && abstractC16513.mo14810(c20039.f64168, c0282, 0L).f1580 == abstractC16513.mo14959(pairM38824.first)) {
                    return abstractC16511.m38824(c0282, c20039, abstractC16511.mo38826(pairM38824.first, c20039).f64168, c20287.f65741);
                }
            }
            return pairM38824;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2445(C0282 c0282, C20039 c20039, int i, boolean z, Object obj, AbstractC16511 abstractC16511, AbstractC16511 abstractC16512) {
        Object obj2 = abstractC16511.mo14810(abstractC16511.mo38826(obj, c20039).f64168, c0282, 0L).f1591;
        for (int i2 = 0; i2 < abstractC16512.mo19929(); i2++) {
            if (abstractC16512.mo14810(i2, c0282, 0L).f1591.equals(obj2)) {
                return i2;
            }
        }
        int iMo14959 = abstractC16511.mo14959(obj);
        int iMo19928 = abstractC16511.mo19928();
        int iM38823 = iMo14959;
        int iMo149510 = -1;
        for (int i3 = 0; i3 < iMo19928 && iMo149510 == -1; i3++) {
            iM38823 = abstractC16511.m38823(iM38823, c20039, c0282, i, z);
            if (iM38823 == -1) {
                break;
            }
            iMo149510 = abstractC16512.mo14959(abstractC16511.mo14960(iM38823));
        }
        if (iMo149510 == -1) {
            return -1;
        }
        return abstractC16512.mo5920(iMo149510, c20039, false).f64168;
    }
}
