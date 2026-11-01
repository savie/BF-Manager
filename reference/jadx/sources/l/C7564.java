package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;

/* JADX INFO: renamed from: l.۟ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YT */
/* JADX INFO: loaded from: classes4.dex */
public class C7564 extends AbstractC8956 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f25083;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f25084;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f25085;

    /* JADX INFO: renamed from: ۢۜ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f25086 = {9977, -467, -474, -479, -415, -478, -453, -415, -451, -470, -478, -480, -453, -470, -415, -483, -470, -478, -480, -453, -470, -484, -470, -451, -455, -470, -451, -484, -470, -451, -455, -474, -468, -470, -415, -498, -500, -485, -506, -512, -511, -496, -484, -485, -498, -483, -485, -502, -501, -467, -474, -479, -415, -478, -453, -415, -449, -477, -454, -452, -415, -503, -485, -481, -496, -484, -502, -483, -487, -502, -483, -496, -484, -485, -498, -483, -485, -502, -501, -467, -474, -479, -415, -478, -453, -415, -478, -468, -449, -415, -498, -500, -485, -506, -512, -511, -496, -484, -485, -498, -483, -485, -502, -501, -467, -474, -479, -415, -478, -453, -415, -451, -470, -478, -480, -453, -470, -415, -483, -470, -478, -480, -453, -470, -484, -470, -451, -455, -470, -451, -484, -470, -451, -455, -474, -468, -470, -415, -498, -500, -485, -506, -512, -511, -496, -503, -498, -506, -509, -502, -501, -496, -485, -512, -496, -484, -485, -498, -483, -485, -467, -474, -479, -415, -478, -453, -415, -449, -477, -454, -452, -415, -503, -485, -481, -496, -484, -502, -483, -487, -502, -483, -496, -503, -498, -506, -509, -502, -501, -496, -485, -512, -496, -484, -485, -498, -483, -485, -467, -474, -479, -415, -478, -453, -415, -478, -468, -449, -415, -498, -500, -485, -506, -512, -511, -496, -503, -498, -506, -509, -502, -501, -496, -485, -512, -496, -484, -485, -498, -483, -485, -467, -474, -479, -415, -478, -453, -415, -451, -470, -478, -480, -453, -470, -415, -483, -470, -478, -480, -453, -470, -484, -470, -451, -455, -470, -451, -484, -470, -451, -455, -474, -468, -470, -415, -498, -500, -485, -506, -512, -511, -496, -484, -485, -512, -481, -481, -502, -501, -467, -474, -479, -415, -478, -453, -415, -449, -477, -454, -452, -415, -503, -485, -481, -496, -484, -502, -483, -487, -502, -483, -496, -484, -485, -512, -481, -481, -502, -501, -467, -474, -479, -415, -478, -453, -415, -478, -468, -449, -415, -498, -500, -485, -506, -512, -511, -496, -484, -485, -512, -481, -481, -502, -501, 4405, 3325, -30151, -30484, 21777, 4900, 21929, 21939, 5102, -8269, 9376, 9779, 1207, 32665, -26401, 31813, 18284, -32340, -29803, -29428, -30284, -29481, 6496, 5746, 5746, 5751, 5730, 5716, 5743, 5738, 5743, 5742, 5750, 5743, 5665, 5746, 5749, 5728, 5747, 5749, 5748, 5745, 5665, 5746, 5732, 5747, 5751, 5736, 5730, 5732, 5691, 5665};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25087;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f25088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f25089;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f25090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Runnable[] f25091;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f25092;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f25093;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f25094;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo10182(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ void mo10184(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo10187(InterfaceC1423 interfaceC1423) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (l.C3743.m10966() <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (l.C1025.f4800 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (l.AbstractC0464.f2088 > 0) goto L19;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m20087(int r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7564.m20087(int, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0169 A[PHI: r6 r7 r10 r11 r12 r16 r17
      0x0169: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r16v18 int) = (r16v11 int), (r16v15 int), (r16v16 int), (r16v19 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r17v3 int) = (r17v1 int), (r17v1 int), (r17v1 int), (r17v4 int) binds: [B:45:0x0167, B:30:0x00cb, B:26:0x00a8, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0224 A[PHI: r1 r8 r16
      0x0224: PHI (r1v5 short[]) = (r1v3 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:61:0x0222, B:41:0x0141, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r8v4 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:61:0x0222, B:41:0x0141, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r16v25 int) = (r16v6 int), (r16v12 int), (r16v26 int) binds: [B:61:0x0222, B:41:0x0141, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[PHI: r5 r16
      0x0254: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:65:0x0252, B:49:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r16v9 int) = (r16v5 int), (r16v10 int) binds: [B:65:0x0252, B:49:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (l.C1398.m4895() <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (l.C2788.m8472() == 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m20088(l.C7564 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7564.m20088(l.۟ܺۘ, int):void");
    }

    public C7564() {
        int iM45029;
        int i;
        ArrayList arrayList = null;
        Runnable[] runnableArr = null;
        int i2 = -1627160247;
        int i3 = C0278.f1572;
        int i4 = C1025.f4800;
        int iM11306 = ThreadFactoryC3888.m11306("ܿܽ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 7715) ^ 884845803;
        int i6 = 505785007;
        while (true) {
            int i7 = iM11306 ^ i6;
            Handler handler = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-963)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1779216202:
                    case -249643117:
                        runnableArr = new Runnable[3];
                        if (C0216.f1393 == 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۘ۟") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-28439)) ^ 367583774;
                            i = 964170107;
                            i7 = iM45029 ^ i;
                        } else {
                            iM11306 = C19806.m45029("ܶ֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-439)) ^ 513167402;
                            i6 = -1264240684;
                        }
                        break;
                    case -1777155863:
                    case -1445801576:
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        C2332.m7079();
                        throw new RuntimeException();
                    case -1663347794:
                    case 1548997872:
                        if (C0629.f2722 <= 0) {
                            iM11306 = (C19806.m45029("ۜۨ") + i3) * 69;
                            i5 = ((iM11306 ^ i4) * 11445) ^ 1520906821;
                            i6 = -1026948026;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֡᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 2877) ^ (-568855730);
                        i = -1906312712;
                        i7 = iM45029 ^ i;
                        break;
                    case -1574239881:
                    case -829113922:
                        Looper looperM11305 = ThreadFactoryC3888.m11305();
                        if (!RunnableC3388.m10064() || C2477.f9839 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 31985) ^ 1952781331;
                            i6 = -1931281526;
                        } else {
                            if (C1189.f5284 > 0) {
                                if (C2704.m8255() <= 0) {
                                    iM11306 = (C19806.m45029("ۜۨ") + i3) * 69;
                                    i5 = ((iM11306 ^ i4) * 11445) ^ 1520906821;
                                    i6 = -1026948026;
                                    break;
                                } else {
                                    handler = new Handler(looperM11305);
                                    if (C0526.m2437() < 0) {
                                        iM45029 = (i3 - C19806.m45029("ۘۢ")) * 119;
                                        i5 = ((iM45029 ^ i4) * (-15267)) ^ (-967703599);
                                        i = -1217352106;
                                        i7 = iM45029 ^ i;
                                        break;
                                    }
                                }
                            }
                            iM11306 = C19806.m45029("ܶ֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-439)) ^ 513167402;
                            i6 = -1264240684;
                        }
                        break;
                    case -1317332468:
                    case 864359225:
                        C1977.m6356();
                        if (C0278.m1789() <= 0) {
                            iM11306 = C19806.m45029("ܶ֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-439)) ^ 513167402;
                            i6 = -1264240684;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("֡᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 2877) ^ (-568855730);
                        i = -1906312712;
                        i7 = iM45029 ^ i;
                        break;
                    case -859909527:
                    case 846262972:
                        if (!CallableC1627.f6528) {
                            iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 31985) ^ 1952781331;
                            i6 = -1931281526;
                        } else {
                            iM11306 = C19806.m45029("ܶ֡") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-439)) ^ 513167402;
                            i6 = -1264240684;
                        }
                        break;
                    case -372687181:
                    case 1777584106:
                        this.f25091 = runnableArr;
                        if (C3722.f13525 > 0) {
                            iM45029 = C19806.m45029("ۜܳ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-13103)) ^ 313247976;
                            i = 1634443392;
                            i7 = iM45029 ^ i;
                        } else {
                            iM11306 = (C19806.m45029("ۜۨ") + i3) * 69;
                            i5 = ((iM11306 ^ i4) * 11445) ^ 1520906821;
                            i6 = -1026948026;
                        }
                        break;
                    case 6099562:
                    case 1150894085:
                        this.f25090 = arrayList;
                        if (C0278.f1572 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i3) * 25;
                            i5 = ((iM45029 ^ i4) * 1243) ^ (-682562833);
                            i = -758890307;
                        } else {
                            iM45029 = (C19806.m45029("ܺۚ") + i3) * (-81);
                            i5 = ((iM45029 ^ i4) * 10249) ^ 781621843;
                            i = 956141375;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 110914925:
                    case 1158565144:
                        this.f25093 = handler;
                        if (C2249.f8050 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("֡᩻") ^ i4;
                            i5 = ((iM45029 ^ i3) * 2877) ^ (-568855730);
                            i = -1906312712;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩷֨") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-24125)) ^ 156782744;
                            i = -619848522;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 197071464:
                    case 1421037083:
                        arrayList = new ArrayList();
                        if (C0050.m946() > 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴۛ")) * (-19);
                            i5 = ((iM45029 ^ i3) * 1419) ^ (-809072534);
                            i = -946768947;
                            i7 = iM45029 ^ i;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۛܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 31985) ^ 1952781331;
                            i6 = -1931281526;
                        }
                        break;
                    case 202156553:
                    case 1592706509:
                        C3535.m10431();
                        iM11306 = C19806.m45029("ܶ֡") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-439)) ^ 513167402;
                        i6 = -1264240684;
                        break;
                    default:
                        this.f25089 = new C10387(this);
                        return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (l.C19806.m45024() != false) goto L19;
     */
    static {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7564.<clinit>():void");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0109 A[PHI: r4 r11
      0x0109: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:30:0x0107, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:30:0x0107, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x029f A[PHI: r2 r7 r8 r16 r25
      0x029f: PHI (r2v7 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int) binds: [B:67:0x029d, B:47:0x01c5, B:12:0x007b, B:95:0x029f, B:92:0x029f, B:91:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:67:0x029d, B:47:0x01c5, B:12:0x007b, B:95:0x029f, B:92:0x029f, B:91:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r8v6 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:67:0x029d, B:47:0x01c5, B:12:0x007b, B:95:0x029f, B:92:0x029f, B:91:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r16v10 short) = (r16v3 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short), (r16v2 short) binds: [B:67:0x029d, B:47:0x01c5, B:12:0x007b, B:95:0x029f, B:92:0x029f, B:91:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r25v7 java.lang.String) = 
      (r25v3 java.lang.String)
      (r25v4 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
      (r25v3 java.lang.String)
     binds: [B:67:0x029d, B:47:0x01c5, B:12:0x007b, B:95:0x029f, B:92:0x029f, B:91:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if (l.C1377.m4833() == 0) goto L68;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] m20090(android.content.Context r26) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7564.m20090(android.content.Context):java.lang.String[]");
    }

    @Override // l.AbstractC8956
    /* JADX INFO: renamed from: ۨ */
    public final void mo17355() {
        boolean z = false;
        Runnable[] runnableArr = null;
        int i = 0;
        Runnable runnable = null;
        int i2 = -903372086;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = C1398.f5802;
        int iM45029 = C19806.m45029("ۙ᩶") ^ i3;
        int i5 = ((iM45029 ^ i4) * 21245) ^ (-1087573423);
        int i6 = -2075229434;
        while (true) {
            i2 = ((((i2 ^ i4) * (-14341)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1985366618:
                case 1729827773:
                    C3722.m10894();
                    if (C2871.f10837 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺᩴ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * 15435) ^ (-2007234551);
                        i6 = 616914543;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩺ۖ")) * (-31);
                        i5 = ((iM45029 ^ i3) * 3165) ^ (-2072798475);
                        i6 = -739440685;
                    }
                    break;
                case -1863248187:
                case 1514329949:
                    this.f25093.removeCallbacks(runnable);
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("ۤ᩸") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * (-10781)) ^ 968275751;
                        i6 = 1337102031;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܶۘ")) * 119;
                        i5 = ((iM45029 ^ i4) * (-29237)) ^ (-175640160);
                        i6 = 1402923298;
                    }
                    break;
                case -1838385902:
                case -983763377:
                    runnableArr = this.f25091;
                    if (i < runnableArr.length) {
                        iM45029 = C19806.m45029("᩵᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-1391)) ^ 1552785321;
                        i6 = -1766032604;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ۬") + i4) * 41;
                        i5 = ((iM45029 ^ i3) * (-30803)) ^ (-896585572);
                        i6 = -1127038032;
                    }
                    break;
                case -1811098818:
                case -592452641:
                    C0216.m1591();
                    C7105.m18985();
                    iM45029 = C19806.m45029("۟ۧ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 26741) ^ (-1765508479);
                    i6 = -933211725;
                    break;
                case -1809770606:
                case 1187753848:
                    C16737.m39268(this.f25089);
                    this.f25094 = z;
                    iM45029 = C19806.m45029("ۗۧ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-22313)) ^ 223600605;
                    i6 = -1713011929;
                    break;
                case -1730533331:
                case 457157010:
                    C2871.m8646();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26741) ^ (-1765508479);
                        i6 = -933211725;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺᩴ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM45029 ^ i4) * 15435) ^ (-2007234551);
                        i6 = 616914543;
                    }
                    break;
                case -1568014244:
                case -185661405:
                    i = 0;
                    iM45029 = C19806.m45029("᩻ۧ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 21031) ^ (-1882770701);
                    i6 = -1183155421;
                    break;
                case -1468446473:
                case 1515878409:
                    if (this.f25094) {
                        iM45029 = (i4 - C19806.m45029("᩸ۖ")) * (-101);
                        i5 = ((iM45029 ^ i3) * (-13003)) ^ (-354698076);
                        i6 = -1781987113;
                    } else {
                        iM45029 = C19806.m45029("ۗۧ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-22313)) ^ 223600605;
                        i6 = -1713011929;
                    }
                    break;
                case -1395362434:
                case 1943709855:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13937) ^ 1779389459;
                        i6 = -1998665658;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    }
                    break;
                case -1393373552:
                case 732375863:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ۤ᩸") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM45029 ^ i4) * (-10781)) ^ 968275751;
                        i6 = 1337102031;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘܿ") ^ i4) * 89;
                        i5 = ((iM45029 ^ i3) * 21075) ^ (-1692574604);
                        i6 = 1324206853;
                    }
                    break;
                case -1267582833:
                case -902020896:
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    } else {
                        iM45029 = C19806.m45029("ۡܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32287)) ^ (-1568738526);
                        i6 = -1959116455;
                    }
                    break;
                case -1152813314:
                case -855072728:
                    z = false;
                    z = false;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    } else {
                        iM45029 = (C19806.m45029("᩸ܽ") + i3) * (-73);
                        i5 = ((iM45029 ^ i4) * (-21059)) ^ 1900206892;
                        i6 = 907827910;
                    }
                    break;
                case -1046943057:
                case 1176295784:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩶") + i3) * 21;
                        i5 = ((iM45029 ^ i4) * 3063) ^ 1431931202;
                        i6 = -164595019;
                    }
                    break;
                case -1032040283:
                case 1278510694:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26741) ^ (-1765508479);
                        i6 = -933211725;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * 28635) ^ 586216082;
                        i6 = 290994489;
                    }
                    break;
                case -1008965351:
                case -478822490:
                    C1875.m6086();
                    break;
                case -794586044:
                case 572229931:
                    this.f25088 = z ? 1 : 0;
                    C1461.m5085(this.f25090);
                    break;
                case -537266155:
                case 1209706032:
                    runnable = runnableArr[i];
                    if (runnable != null) {
                        iM45029 = C19806.m45029("ܳۘ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29213) ^ (-330966649);
                        i6 = 1901528229;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷۠") + i3) * (-81);
                        i5 = ((iM45029 ^ i4) * (-1795)) ^ (-713485191);
                        i6 = -1991776837;
                    }
                    break;
                case 111598394:
                case 978189775:
                    if (C3722.f13525 <= 0) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26741) ^ (-1765508479);
                        i6 = -933211725;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩷") ^ i3;
                        i5 = ((iM45029 ^ i4) * 17909) ^ 1909609321;
                        i6 = 921532108;
                    }
                    break;
                case 455744187:
                case 1558224613:
                    runnableArr[i] = null;
                    iM45029 = (ThreadFactoryC3888.m11306("᩷۠") + i3) * (-81);
                    i5 = ((iM45029 ^ i4) * (-1795)) ^ (-713485191);
                    i6 = -1991776837;
                    break;
                case 734656819:
                case 1933308854:
                    C1066.m4023();
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("۟ۧ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 26741) ^ (-1765508479);
                        i6 = -933211725;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    }
                    break;
                case 999651731:
                case 1188354015:
                    i++;
                    iM45029 = C19806.m45029("᩻ۧ") ^ i4;
                    i5 = ((iM45029 ^ i3) * 21031) ^ (-1882770701);
                    i6 = -1183155421;
                    break;
                case 1890516180:
                case 2141934660:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۘ") + i4) * (-31);
                        i5 = ((iM45029 ^ i3) * (-31615)) ^ (-863886834);
                        i6 = 1692284034;
                    }
                    break;
                default:
                    if (C1189.m4368() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-13279)) ^ (-2127365679);
                        i6 = -1088864867;
                    } else {
                        iM45029 = C19806.m45029("ܶܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 16621) ^ 1237845701;
                        i6 = -2014896727;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ */
    public final void mo10185(InterfaceC1423 interfaceC1423) {
        this.f25087 = false;
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int iM11306;
        int i5;
        int i6;
        Intent intent;
        boolean zM22208;
        String strM10415;
        Application applicationM4826;
        Intent intent2;
        int iM450211;
        int i7;
        Exception e;
        int i8 = C1066.f4915;
        int i9 = RunnableC0195.f1321;
        int iM450212 = C19806.m45029("᩻ۤ") ^ i8;
        int i10 = ((iM450212 ^ i9) * (-221)) ^ 873494007;
        String str = null;
        IntentFilter intentFilter = null;
        String strM5502 = null;
        Intent intent3 = null;
        int i11 = iM450212 ^ 655317433;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1851379292;
        Application application = null;
        String str2 = null;
        Exception exc = null;
        boolean z2 = false;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i9) * 26017) >> 31));
            switch (i18) {
                case -2135142955:
                case -20531216:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۟") ^ i8;
                        i5 = ((iM11306 ^ i9) * 14307) ^ (-1695216876);
                        i6 = 1482267289;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۙ") + i9) * (-67);
                        i5 = ((iM11306 ^ i8) * 25513) ^ 1253042119;
                        i6 = 595738831;
                    }
                    int i19 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i19;
                    i10 = i5;
                    break;
                case -2077913440:
                case 1277477740:
                    intent3 = intent3;
                    if (i15 == i16) {
                        iM11306 = C19806.m45029("֡᩷") ^ i8;
                        i5 = ((iM11306 ^ i9) * (-13013)) ^ 2026200869;
                        i6 = -498481061;
                    } else {
                        iM11306 = (C19806.m45029("ܰܿ") ^ i8) * 33;
                        i5 = ((iM11306 ^ i9) * (-32657)) ^ (-1085677529);
                        i6 = -1702781822;
                    }
                    int i110 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i110;
                    i10 = i5;
                    break;
                case -2015942909:
                case -594716374:
                    StringBuilder sb = new StringBuilder(strM5502);
                    C2124.m6683(sb, i15);
                    throw new IllegalArgumentException(C0817.m3407(sb));
                case -2013976125:
                case -1564567297:
                    zM22208 = ServiceC7629.m20160();
                    z2 = zM22208;
                    iM11306 = ThreadFactoryC3888.m11306("ܰۧ") ^ i9;
                    i5 = ((iM11306 ^ i8) * (-4349)) ^ (-1268616872);
                    i6 = -683390836;
                    int i111 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i111;
                    i10 = i5;
                    break;
                case -1995803017:
                case 366419598:
                    i12 = 17796;
                    iM45029 = C19806.m45029("᩺ᩳ") ^ i9;
                    i = ((iM45029 ^ i8) * (-1369)) ^ (-1420716873);
                    i2 = -1543474920;
                    int i20 = iM45029 ^ i2;
                    str = str;
                    intent = intent3;
                    i11 = i20;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent;
                    break;
                case -1858278013:
                case 343556085:
                    intent3 = intent3;
                    this.f25092 = z;
                    i17 = i17;
                    str = str;
                    int i21 = ApplicationC0716.f2988.getInt(str, i17) & 7;
                    this.f25088 = i21;
                    if (i21 == 0) {
                        z = z ? 1 : 0;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i9) * (-63);
                        i = ((iM45029 ^ i8) * 21129) ^ 216726331;
                        i2 = -1817732298;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۠") ^ i8;
                        z = z ? 1 : 0;
                        i = ((iM45029 ^ i9) * 29017) ^ (-1810402880);
                        i2 = 1699842782;
                    }
                    int i22 = iM45029 ^ i2;
                    str = str;
                    intent = intent3;
                    i11 = i22;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent;
                    break;
                case -1831272744:
                case -1684690426:
                    intent3 = intent3;
                    strM5502 = CallableC1627.m5502(f25086, TwofishEngine.GF256_FDBK, 25, i12);
                    i16 = 2;
                    if (i15 != 0) {
                        iM11306 = C19806.m45029("۠ۖ") ^ i8;
                        i5 = ((iM11306 ^ i9) * (-8451)) ^ (-1443370160);
                        i6 = -2108134626;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ۬") ^ i9) * (-77);
                        i5 = ((iM11306 ^ i8) * (-23647)) ^ 1285015951;
                        i6 = 1775530861;
                    }
                    int i112 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i112;
                    i10 = i5;
                    break;
                case -1823038112:
                case -1492871413:
                    intent3 = intent3;
                    if (i15 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i8) * 33;
                        i5 = ((iM11306 ^ i9) * (-8593)) ^ 1487758494;
                        i6 = -477099050;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩸") ^ i8) * 67;
                        i5 = ((iM11306 ^ i9) * 14167) ^ 2109674360;
                        i6 = -704219895;
                    }
                    int i113 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i113;
                    i10 = i5;
                    break;
                case -1735708754:
                case 1955691368:
                    intent3 = intent3;
                    if (z2) {
                        iM11306 = C19806.m45029("ܳ۬") ^ i9;
                        i5 = ((iM11306 ^ i8) * 21215) ^ (-875964142);
                        i6 = -491981693;
                    } else {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۡᩳ")) * 61;
                        i5 = ((iM11306 ^ i8) * (-28347)) ^ 396538836;
                        i6 = -1363254442;
                    }
                    int i114 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i114;
                    i10 = i5;
                    break;
                case -1581182530:
                case 844093238:
                    intent3 = intent3;
                    m20087(i15, str2);
                    iM11306 = (C19806.m45029("᩷ܺ") + i8) * 119;
                    i5 = ((iM11306 ^ i9) * 27147) ^ 1937445883;
                    i6 = 741360653;
                    int i115 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i115;
                    i10 = i5;
                    break;
                case -1507411384:
                case -1194618510:
                    zM22208 = ServiceC4538.m12674();
                    z2 = zM22208;
                    iM11306 = ThreadFactoryC3888.m11306("ܰۧ") ^ i9;
                    i5 = ((iM11306 ^ i8) * (-4349)) ^ (-1268616872);
                    i6 = -683390836;
                    int i116 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i116;
                    i10 = i5;
                    break;
                case -1495268123:
                case -1088170846:
                    intentFilter.addAction(f25083[i14]);
                    intentFilter.addAction(f25085[i14]);
                    intentFilter.addAction(f25084[i14]);
                    i14++;
                    iM450210 = ThreadFactoryC3888.m11306("ۗۖ") ^ i8;
                    i3 = ((iM450210 ^ i9) * 27101) ^ 608932622;
                    i4 = -690475716;
                    intent = intent3;
                    i11 = iM450210 ^ i4;
                    i10 = i3;
                    intent3 = intent;
                    break;
                case -1444629286:
                case -245609813:
                    intent3 = intent3;
                    if (RunnableC0195.m1432(C1398.m4893(exc))) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۜ") ^ i9) * 29;
                        i5 = ((iM11306 ^ i8) * (-31317)) ^ (-2128765057);
                        i6 = -1147776385;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛܰ") + i9) * 47;
                        i5 = ((iM11306 ^ i8) * 12049) ^ (-322913369);
                        i6 = 2076861582;
                    }
                    int i117 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i117;
                    i10 = i5;
                    break;
                case -1285235059:
                case -27251815:
                    intent3 = intent3;
                    i13 = 3;
                    if (i14 < 3) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܽ") ^ i9;
                        i5 = ((iM11306 ^ i8) * 30809) ^ 1518396657;
                        i6 = 87363117;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽ᩵") + i9) * (-65);
                        i5 = ((iM11306 ^ i8) * 21737) ^ (-2077699179);
                        i6 = 1552352509;
                    }
                    int i118 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i118;
                    i10 = i5;
                    break;
                case -1089723280:
                case 1985973909:
                    try {
                        C10405.m26303(application, intent3);
                        intent3 = intent3;
                        iM11306 = (C19806.m45029("᩷ܺ") + i8) * 119;
                        i5 = ((iM11306 ^ i9) * 27147) ^ 1937445883;
                        i6 = 741360653;
                    } catch (Exception e2) {
                        exc = e2;
                        intent3 = intent3;
                        iM11306 = (i8 - C19806.m45029("۠᩻")) * 29;
                        i5 = ((iM11306 ^ i9) * (-9073)) ^ (-1020680963);
                        i6 = 2003420748;
                    }
                    int i119 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i119;
                    i10 = i5;
                    break;
                case -1015822411:
                case 1118849822:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    short s = f25086[356];
                    if ((s * 29308) - ((s * s) + 214739716) <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") ^ i8) * (-55);
                        i = ((iM45029 ^ i9) * (-28141)) ^ (-783330973);
                        i2 = 1101848267;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫۫") ^ i9;
                        i = ((iM45029 ^ i8) * 7233) ^ 2091814244;
                        i2 = -1241377347;
                    }
                    int i23 = iM45029 ^ i2;
                    str = str;
                    intent = intent3;
                    i11 = i23;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent;
                    break;
                case -784354257:
                case -546394100:
                    zM22208 = ServiceC8498.m22208();
                    z2 = zM22208;
                    iM11306 = ThreadFactoryC3888.m11306("ܰۧ") ^ i9;
                    i5 = ((iM11306 ^ i8) * (-4349)) ^ (-1268616872);
                    i6 = -683390836;
                    int i1110 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1110;
                    i10 = i5;
                    break;
                case -710149052:
                case 1258091700:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    if (this.f25092) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i9) * (-63);
                        i = ((iM45029 ^ i8) * 21129) ^ 216726331;
                        i2 = -1817732298;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩻") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM45029 ^ i9) * (-8131)) ^ (-282061730);
                        i2 = 389407384;
                    }
                    int i24 = iM45029 ^ i2;
                    str = str;
                    intent = intent3;
                    i11 = i24;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent;
                    break;
                case -555315753:
                case 310371866:
                    StringBuilder sb2 = new StringBuilder(strM5502);
                    C2124.m6683(sb2, i15);
                    throw new IllegalArgumentException(C0817.m3407(sb2));
                case -404448890:
                case 1360335945:
                    intent3 = intent3;
                    if (i15 != z) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۗ") + i8) * (-11);
                        i5 = ((iM11306 ^ i9) * 941) ^ 55723714;
                        i6 = 616903157;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩶") ^ i9) * (-73);
                        i5 = ((iM11306 ^ i8) * 14413) ^ (-387851301);
                        i6 = -252093191;
                    }
                    int i1111 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1111;
                    i10 = i5;
                    break;
                case -336309362:
                case 989061352:
                    C16737.m39269(this.f25089, intentFilter);
                    this.f25094 = z;
                    i15 = i17;
                    iM11306 = C19806.m45029("ۙ۬") ^ i8;
                    i5 = ((iM11306 ^ i9) * 7789) ^ (-1201992195);
                    i6 = 820444530;
                    int i1112 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1112;
                    i10 = i5;
                    break;
                case -275897016:
                case 1089342062:
                    intent3 = intent3;
                    C23810.m52476((AbstractActivityC12483) interfaceC1423);
                    iM11306 = C19806.m45029("֡ᩳ") ^ i8;
                    i5 = ((iM11306 ^ i9) * 2495) ^ 606200449;
                    i6 = 792728872;
                    int i1113 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1113;
                    i10 = i5;
                    break;
                case -181767289:
                case 1098499273:
                    intent3 = intent3;
                    m20087(i15, (String) null);
                    iM11306 = (C19806.m45029("᩷ܺ") + i8) * 119;
                    i5 = ((iM11306 ^ i9) * 27147) ^ 1937445883;
                    i6 = 741360653;
                    int i1114 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1114;
                    i10 = i5;
                    break;
                case 11841367:
                case 1830363064:
                    m20086(i15);
                    ServiceC7629.m20167();
                    intent3 = intent3;
                    iM11306 = (C19806.m45029("᩷ܺ") + i8) * 119;
                    i5 = ((iM11306 ^ i9) * 27147) ^ 1937445883;
                    i6 = 741360653;
                    int i1115 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1115;
                    i10 = i5;
                    break;
                case 131524722:
                case 1140835929:
                    intent3 = intent3;
                    this.f25087 = true;
                    boolean z3 = this.f25092;
                    i17 = 0;
                    String strM7082 = C2332.m7082(f25086, 357, 4, i12);
                    if (z3) {
                        str = strM7082;
                        z = true;
                        iM11306 = C19806.m45029("֡ᩳ") ^ i8;
                        i5 = ((iM11306 ^ i9) * 2495) ^ 606200449;
                        i6 = 792728872;
                        int i1116 = iM11306 ^ i6;
                        intent3 = intent3;
                        i11 = i1116;
                        i10 = i5;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("۠ܿ") + i9) * 21;
                        str = strM7082;
                        intent3 = intent3;
                        i11 = iM11307 ^ 1090581716;
                        i10 = ((iM11307 ^ i8) * 29943) ^ 645787462;
                        z = true;
                    }
                    break;
                case 182337892:
                case 832330830:
                    intent3 = intent3;
                    i17 = i17;
                    str = str;
                    z = z ? 1 : 0;
                    if ((ApplicationC0716.f2988.getInt(str, i17) & 7) == 0) {
                        str = str;
                        z = z ? 1 : 0;
                        i17 = i17;
                        iM11306 = C19806.m45029("֡ᩳ") ^ i8;
                        i5 = ((iM11306 ^ i9) * 2495) ^ 606200449;
                        i6 = 792728872;
                        int i1117 = iM11306 ^ i6;
                        intent3 = intent3;
                        i11 = i1117;
                        i10 = i5;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ۬") + i9) * (-127);
                        i = ((iM45029 ^ i8) * (-13743)) ^ (-2140584272);
                        i2 = -476610001;
                        int i25 = iM45029 ^ i2;
                        str = str;
                        intent = intent3;
                        i11 = i25;
                        i10 = i;
                        z = z;
                        i17 = i17;
                        intent3 = intent;
                    }
                    break;
                case 189193901:
                case 1741143786:
                    i15++;
                    iM11306 = C19806.m45029("ۙ۬") ^ i8;
                    i5 = ((iM11306 ^ i9) * 7789) ^ (-1201992195);
                    i6 = 820444530;
                    int i1118 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i1118;
                    i10 = i5;
                    break;
                case 189605315:
                case 1032652020:
                    m20084();
                    return;
                case 265370350:
                case 1986700820:
                    m20086(i15);
                    int i26 = ServiceC8498.f29454;
                    applicationM4826 = C1377.m4826();
                    intent2 = new Intent(applicationM4826, (Class<?>) ServiceC8498.class);
                    application = applicationM4826;
                    intent3 = intent2;
                    iM450211 = (C19806.m45029("ۖۡ") + i9) * 73;
                    i5 = ((iM450211 ^ i8) * 23619) ^ 1866143813;
                    i7 = -832106725;
                    i11 = iM450211 ^ i7;
                    i10 = i5;
                    break;
                case 513679737:
                case 1650337183:
                    i12 = 5633;
                    iM45029 = C19806.m45029("᩺ᩳ") ^ i9;
                    i = ((iM45029 ^ i8) * (-1369)) ^ (-1420716873);
                    i2 = -1543474920;
                    int i27 = iM45029 ^ i2;
                    str = str;
                    intent = intent3;
                    i11 = i27;
                    i10 = i;
                    z = z;
                    i17 = i17;
                    intent3 = intent;
                    break;
                case 553745870:
                case 1038444722:
                    if (i15 == i16) {
                        iM450211 = C19806.m45029("ۤ֫") ^ i9;
                        i5 = ((iM450211 ^ i8) * 11091) ^ (-1868897951);
                        i7 = -1553882557;
                    } else {
                        iM450211 = C19806.m45029("᩶ᩴ") ^ i8;
                        i5 = ((iM450211 ^ i9) * (-22815)) ^ 767860206;
                        i7 = 2009104842;
                    }
                    i11 = iM450211 ^ i7;
                    i10 = i5;
                    break;
                case 570228516:
                case 1431965487:
                    intent3 = intent3;
                    if (i15 >= i13) {
                        i17 = i17;
                        str = str;
                        z = z ? 1 : 0;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i9) * (-63);
                        i = ((iM45029 ^ i8) * 21129) ^ 216726331;
                        i2 = -1817732298;
                        int i28 = iM45029 ^ i2;
                        str = str;
                        intent = intent3;
                        i11 = i28;
                        i10 = i;
                        z = z;
                        i17 = i17;
                        intent3 = intent;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗᩴ") ^ i8;
                        i5 = ((iM11306 ^ i9) * (-11403)) ^ 264797544;
                        i6 = 539654985;
                        int i1119 = iM11306 ^ i6;
                        intent3 = intent3;
                        i11 = i1119;
                        i10 = i5;
                    }
                    break;
                case 840755041:
                case 1422387684:
                    intent3 = intent3;
                    if (!(interfaceC1423 instanceof AbstractActivityC12483)) {
                        iM11306 = C19806.m45029("֡ᩳ") ^ i8;
                        i5 = ((iM11306 ^ i9) * 2495) ^ 606200449;
                        i6 = 792728872;
                        int i11110 = iM11306 ^ i6;
                        intent3 = intent3;
                        i11 = i11110;
                        i10 = i5;
                    } else {
                        iM450210 = (C19806.m45029("ۘۗ") + i8) * (-127);
                        i3 = ((iM450210 ^ i9) * 10123) ^ (-730977012);
                        i4 = 1756686501;
                        intent = intent3;
                        i11 = iM450210 ^ i4;
                        i10 = i3;
                        intent3 = intent;
                    }
                    break;
                case 885950721:
                case 1400051406:
                    strM10415 = C2124.m6674(exc);
                    str2 = strM10415;
                    iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i9;
                    i5 = ((iM11306 ^ i8) * 18571) ^ (-556145415);
                    i6 = 34872483;
                    int i11111 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i11111;
                    i10 = i5;
                    break;
                case 1028507141:
                case 1269399174:
                    try {
                        m20086(i15);
                        int i29 = ServiceC4538.f16137;
                        applicationM4826 = C1377.m4826();
                        try {
                            intent2 = new Intent(applicationM4826, (Class<?>) ServiceC4538.class);
                            application = applicationM4826;
                            intent3 = intent2;
                            iM450211 = (C19806.m45029("ۖۡ") + i9) * 73;
                            i5 = ((iM450211 ^ i8) * 23619) ^ 1866143813;
                            i7 = -832106725;
                            i11 = iM450211 ^ i7;
                        } catch (Exception e3) {
                            e = e3;
                            exc = e;
                            iM11306 = (i8 - C19806.m45029("۠᩻")) * 29;
                            i5 = ((iM11306 ^ i9) * (-9073)) ^ (-1020680963);
                            i6 = 2003420748;
                            int i11112 = iM11306 ^ i6;
                            intent3 = intent3;
                            i11 = i11112;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        intent3 = intent3;
                        exc = e;
                        iM11306 = (i8 - C19806.m45029("۠᩻")) * 29;
                        i5 = ((iM11306 ^ i9) * (-9073)) ^ (-1020680963);
                        i6 = 2003420748;
                        int i11113 = iM11306 ^ i6;
                        intent3 = intent3;
                        i11 = i11113;
                    }
                    i10 = i5;
                    break;
                case 1167506522:
                case 2141348722:
                    intent3 = intent3;
                    if ((this.f25088 & ((z ? 1 : 0) << i15)) == 0) {
                        iM11306 = (C19806.m45029("᩷ܺ") + i8) * 119;
                        i5 = ((iM11306 ^ i9) * 27147) ^ 1937445883;
                        i6 = 741360653;
                    } else {
                        iM11306 = C19806.m45029("ۨۜ") ^ i9;
                        i5 = ((iM11306 ^ i8) * (-26277)) ^ 817139117;
                        i6 = 943759521;
                    }
                    int i11114 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i11114;
                    i10 = i5;
                    break;
                case 1872808950:
                case 1924956455:
                    strM10415 = C3535.m10415(exc);
                    str2 = strM10415;
                    iM11306 = ThreadFactoryC3888.m11306("ۚۨ") ^ i9;
                    i5 = ((iM11306 ^ i8) * 18571) ^ (-556145415);
                    i6 = 34872483;
                    int i11115 = iM11306 ^ i6;
                    intent3 = intent3;
                    i11 = i11115;
                    i10 = i5;
                    break;
                default:
                    intentFilter = new IntentFilter();
                    i14 = 0;
                    iM450210 = ThreadFactoryC3888.m11306("ۗۖ") ^ i8;
                    i3 = ((iM450210 ^ i9) * 27101) ^ 608932622;
                    i4 = -690475716;
                    intent = intent3;
                    i11 = iM450210 ^ i4;
                    i10 = i3;
                    intent3 = intent;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00de A[PHI: r7 r8 r9
      0x00de: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:94:0x00de, B:24:0x00dc, B:20:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:94:0x00de, B:24:0x00dc, B:20:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:94:0x00de, B:24:0x00dc, B:20:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ec A[PHI: r2
      0x01ec: PHI (r2v6 java.util.ArrayList) = (r2v2 java.util.ArrayList), (r2v2 java.util.ArrayList), (r2v3 java.util.ArrayList), (r2v2 java.util.ArrayList) binds: [B:51:0x01d2, B:47:0x01b7, B:44:0x019b, B:18:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (l.C2788.f10625 >= 0) goto L77;
     */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20084() {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7564.m20084():void");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x0187 A[PHI: r1 r2 r8
      0x0187: PHI (r1v4 java.lang.Runnable[]) = (r1v2 java.lang.Runnable[]), (r1v3 java.lang.Runnable[]), (r1v2 java.lang.Runnable[]) binds: [B:56:0x0185, B:28:0x007e, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r2v3 android.os.Handler) = (r2v2 android.os.Handler), (r2v2 android.os.Handler), (r2v4 android.os.Handler) binds: [B:56:0x0185, B:28:0x007e, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r8v6 java.lang.Runnable) = (r8v4 java.lang.Runnable), (r8v5 java.lang.Runnable), (r8v4 java.lang.Runnable) binds: [B:56:0x0185, B:28:0x007e, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20086(final int i) {
        int iM45029;
        int i2;
        Runnable[] runnableArr = null;
        Handler handler = null;
        int i3 = 1339763526;
        int i4 = C1875.f7103;
        int i5 = C2124.f7782;
        int iM450210 = C19806.m45029("ܶۢ") ^ i5;
        int i6 = ((iM450210 ^ i4) * (-26163)) ^ (-1755864564);
        int i7 = -56559503;
        while (true) {
            int i8 = iM450210 ^ i7;
            Runnable runnable = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-9181)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2140650836:
                    case 1946328790:
                        C1937.m6279();
                        if (C1377.f5749) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 25843) ^ (-743191793);
                            i2 = 2026526074;
                        } else {
                            iM45029 = C19806.m45029("ܳᩳ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 9953) ^ 1095442039;
                            i2 = -200548019;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case -2081796193:
                    case 884240269:
                        if (CallableC1627.f6528) {
                            iM45029 = ThreadFactoryC3888.m11306("ۡۚ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-18601)) ^ 162817109;
                            i2 = -855796850;
                        } else {
                            iM45029 = C19806.m45029("ܳᩳ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 9953) ^ 1095442039;
                            i2 = -200548019;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case -1959028714:
                    case -1014740776:
                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                            iM45029 = (i4 - C19806.m45029("ܽۧ")) * (-33);
                            i6 = ((iM45029 ^ i5) * 19319) ^ 217153120;
                            i2 = -624371221;
                        } else {
                            iM45029 = (i5 - C19806.m45029("֡ۡ")) * 75;
                            i6 = ((iM45029 ^ i4) * 3595) ^ (-106858574);
                            i2 = 1132196898;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case -1609638976:
                    case 1831423309:
                        if (C2788.f10625 < 0) {
                            runnable = new Runnable(this) { // from class: l.ۡܺۘ

                                /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                                public final /* synthetic */ C7564 f30733;

                                {
                                    int i9 = -1218366781;
                                    int i10 = AbstractC0464.f2088;
                                    int i11 = C1419.f5860;
                                    int iM450211 = (C19806.m45029("֨ᩳ") + i11) * (-127);
                                    int i12 = ((iM450211 ^ i10) * 4039) ^ (-1136653631);
                                    int i13 = 786505617;
                                    while (true) {
                                        i9 = ((((i9 ^ i10) * (-20013)) >> 31) & i12) ^ (iM450211 ^ i13);
                                        switch (i9) {
                                            case -1988321779:
                                            case 1316116609:
                                                if (C0671.f2816 != 0) {
                                                    iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                    i13 = -309994754;
                                                } else {
                                                    iM450211 = C19806.m45029("᩹۫") ^ i11;
                                                    i12 = ((iM450211 ^ i10) * (-24683)) ^ (-126353269);
                                                    i13 = -907234832;
                                                }
                                                break;
                                            case -1882923799:
                                            case 465608433:
                                                if (C1377.f5749) {
                                                    iM450211 = (ThreadFactoryC3888.m11306("۬۬") + i11) * 53;
                                                    i12 = ((iM450211 ^ i10) * 31797) ^ 1014237119;
                                                    i13 = 1676019229;
                                                } else {
                                                    iM450211 = C19806.m45029("ܿۗ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 9321) ^ (-831499131);
                                                    i13 = 489951844;
                                                }
                                                break;
                                            case -1875977736:
                                            case -450691954:
                                                if (C10634.m26820()) {
                                                    iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                    i13 = -309994754;
                                                } else {
                                                    iM450211 = C19806.m45029("ۗܰ") ^ i11;
                                                    i12 = ((iM450211 ^ i10) * 29965) ^ (-201053445);
                                                    i13 = 286516458;
                                                }
                                                break;
                                            case -1496805192:
                                            case -450266974:
                                                return;
                                            case -1243116619:
                                            case -12545912:
                                                C1377.m4833();
                                                throw new RuntimeException();
                                            case -994888023:
                                            case 998426182:
                                                if (C2249.f8050 >= 0) {
                                                    iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                    i13 = -309994754;
                                                } else {
                                                    iM450211 = C19806.m45029("᩻ۙ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * (-14649)) ^ 1218419922;
                                                    i13 = 1670663529;
                                                }
                                                break;
                                            case -908529176:
                                            case 474972952:
                                                if (C1025.f4800 >= 0) {
                                                    iM450211 = (C19806.m45029("᩶᩺") ^ i11) * (-67);
                                                    i12 = ((iM450211 ^ i10) * (-29823)) ^ 1012560734;
                                                    i13 = -977625043;
                                                } else {
                                                    iM450211 = C19806.m45029("֫ۤ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * (-22077)) ^ 338761386;
                                                    i13 = 1098703853;
                                                }
                                                break;
                                            case -738289301:
                                            case 771720148:
                                                C3660.m10791();
                                                iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                i13 = -309994754;
                                                break;
                                            case -486513989:
                                            case -484290202:
                                                if (C0797.f3386) {
                                                    iM450211 = (C19806.m45029("᩶᩺") ^ i11) * (-67);
                                                    i12 = ((iM450211 ^ i10) * (-29823)) ^ 1012560734;
                                                    i13 = -977625043;
                                                } else {
                                                    iM450211 = ThreadFactoryC3888.m11306("ܽܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 8439) ^ 509129819;
                                                    i13 = 32885940;
                                                }
                                                break;
                                            case -233188717:
                                            case 1163280955:
                                                C1148.m4232();
                                                if (C1977.f7413 <= 0) {
                                                    iM450211 = C19806.m45029("ܽ֡") ^ i11;
                                                    i12 = ((iM450211 ^ i10) * 14893) ^ (-217087368);
                                                    i13 = 914538008;
                                                } else {
                                                    iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                    i13 = -309994754;
                                                }
                                                break;
                                            case 83748277:
                                            case 421454419:
                                                if (RunnableC1564.f6300) {
                                                    iM450211 = C19806.m45029("ܿۗ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 9321) ^ (-831499131);
                                                    i13 = 489951844;
                                                } else {
                                                    iM450211 = (i11 - C19806.m45029("ܿ۫")) * (-121);
                                                    i12 = ((iM450211 ^ i10) * (-31757)) ^ (-645751831);
                                                    i13 = -1746522246;
                                                }
                                                break;
                                            case 320073950:
                                            case 1744310304:
                                                if (C2332.f8260) {
                                                    iM450211 = (i11 - ThreadFactoryC3888.m11306("ۨ᩹")) * 85;
                                                    i12 = ((iM450211 ^ i10) * 19933) ^ 594341192;
                                                    i13 = 150617599;
                                                } else {
                                                    iM450211 = C19806.m45029("ܿۗ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 9321) ^ (-831499131);
                                                    i13 = 489951844;
                                                }
                                                break;
                                            case 712243287:
                                            case 1005961712:
                                                if (C2871.f10837 >= 0) {
                                                    iM450211 = C19806.m45029("ܽ֡") ^ i11;
                                                    i12 = ((iM450211 ^ i10) * 14893) ^ (-217087368);
                                                    i13 = 914538008;
                                                } else {
                                                    iM450211 = (i10 - ThreadFactoryC3888.m11306("ۛۨ")) * 49;
                                                    i12 = ((iM450211 ^ i11) * (-3187)) ^ (-159861640);
                                                    i13 = -243560341;
                                                }
                                                break;
                                            case 887154953:
                                            case 1504303071:
                                                if (C2249.f8050 >= 0) {
                                                    iM450211 = C19806.m45029("ܿۗ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 9321) ^ (-831499131);
                                                    i13 = 489951844;
                                                } else {
                                                    iM450211 = (ThreadFactoryC3888.m11306("ۖۡ") + i10) * 73;
                                                    i12 = ((iM450211 ^ i11) * 23569) ^ (-795423226);
                                                    i13 = 662138588;
                                                }
                                                break;
                                            case 1443601763:
                                            case 1503108145:
                                                if (C0278.f1572 > 0) {
                                                    iM450211 = (C19806.m45029("᩶᩺") ^ i11) * (-67);
                                                    i12 = ((iM450211 ^ i10) * (-29823)) ^ 1012560734;
                                                    i13 = -977625043;
                                                } else {
                                                    iM450211 = C19806.m45029("ܳܿ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 13043) ^ (-837528642);
                                                    i13 = -309994754;
                                                }
                                                break;
                                            default:
                                                this.f30733 = this;
                                                if (C1461.f5957 <= 0) {
                                                    iM450211 = C19806.m45029("ܿۗ") ^ i10;
                                                    i12 = ((iM450211 ^ i11) * 9321) ^ (-831499131);
                                                    i13 = 489951844;
                                                } else {
                                                    iM450211 = (ThreadFactoryC3888.m11306("ܶᩴ") + i10) * (-41);
                                                    i12 = ((iM450211 ^ i11) * (-387)) ^ (-1660440631);
                                                    i13 = -1770325614;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7564.m20088(this.f30733, i);
                                }
                            };
                            runnableArr = this.f25091;
                            if (AbstractC0464.f2088 <= 0) {
                                iM45029 = (i4 - C19806.m45029("ܽۧ")) * (-33);
                                i6 = ((iM45029 ^ i5) * 19319) ^ 217153120;
                                i2 = -624371221;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("֨᩹") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-3069)) ^ (-1513994445);
                                i2 = 1717194066;
                            }
                            i8 = iM45029 ^ i2;
                        }
                        break;
                    case -1549746063:
                    case 523897664:
                        RunnableC1895.m6170();
                        iM45029 = C19806.m45029("۟ۤ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 32221) ^ (-659915236);
                        i2 = -881328174;
                        i8 = iM45029 ^ i2;
                        break;
                    case -1343266168:
                    case 654890663:
                        C2788.m8472();
                        if (C1398.f5802 <= 0) {
                            iM45029 = C19806.m45029("۟ۤ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 32221) ^ (-659915236);
                            i2 = -881328174;
                        } else {
                            iM45029 = C19806.m45029("ܳᩳ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 9953) ^ 1095442039;
                            i2 = -200548019;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case -1230997141:
                    case -712242665:
                        if (RunnableC1895.f7152) {
                            iM45029 = C19806.m45029("ܿ۫") ^ i4;
                            i6 = ((iM45029 ^ i5) * (-22103)) ^ (-924371032);
                            i2 = -544891988;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 25843) ^ (-743191793);
                            i2 = 2026526074;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case -1150891620:
                    case 470103328:
                        if (C1977.f7413 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܿ᩸") ^ i4) * (-21);
                            i6 = ((iM45029 ^ i5) * (-4213)) ^ 738864464;
                            i2 = -640768911;
                            i8 = iM45029 ^ i2;
                        }
                        break;
                    case -1125342660:
                    case 58366711:
                        RunnableC1606.m5473();
                        break;
                    case -825861323:
                    case 1226888763:
                        if (C1189.f5284 <= 0) {
                            iM45029 = C19806.m45029("۟ۤ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 32221) ^ (-659915236);
                            i2 = -881328174;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩵ۡ") ^ i4) * (-41);
                            i6 = ((iM45029 ^ i5) * (-26675)) ^ (-2009610936);
                            i2 = 436296402;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case 257091600:
                    case 565674490:
                        if (C0526.f2219) {
                        }
                        iM45029 = C19806.m45029("ܳᩳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 9953) ^ 1095442039;
                        i2 = -200548019;
                        i8 = iM45029 ^ i2;
                        break;
                    case 297861768:
                    case 1839908062:
                        runnableArr[i] = runnable;
                        handler = this.f25093;
                        if (CallableC1627.f6528) {
                            iM45029 = (C19806.m45029("ᩳۖ") ^ i4) * 119;
                            i6 = ((iM45029 ^ i5) * (-9859)) ^ 615435888;
                            i2 = 500467791;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ܽۧ")) * (-33);
                            i6 = ((iM45029 ^ i5) * 19319) ^ 217153120;
                            i2 = -624371221;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    case 1156656430:
                    case 1520114501:
                        if (!C1668.m5583()) {
                        }
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡ᩳ")) * 93;
                        i6 = ((iM45029 ^ i5) * (-13129)) ^ (-927554432);
                        i2 = -1526255624;
                        i8 = iM45029 ^ i2;
                        break;
                        break;
                    case 1324754149:
                    case 1790168481:
                        if (RunnableC3388.f12514 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 25843) ^ (-743191793);
                            i2 = 2026526074;
                        } else {
                            iM45029 = (C19806.m45029("᩵ۗ") ^ i5) * 43;
                            i6 = ((iM45029 ^ i4) * 21841) ^ 1321017829;
                            i2 = 1279056838;
                        }
                        i8 = iM45029 ^ i2;
                        break;
                    default:
                        handler.postDelayed(runnable, 30000L);
                        break;
                }
                return;
            }
            iM450210 = (C19806.m45029("᩵᩶") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
            i6 = ((iM450210 ^ i4) * 20627) ^ 1968923054;
            i7 = -63449327;
        }
    }
}
