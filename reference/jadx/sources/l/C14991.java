package l;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ܳ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14991 implements InterfaceC16745 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService f48919;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static int f48920;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public static final Object f48921 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48922;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f48923;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21705 f48924;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48925;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48926;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48927;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48928;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C21705 f48929;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f48930;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C10295 f48931;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f48932;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f48933;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f48934;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1830 f48935;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11085 f48936;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48937;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2575 f48938;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f48939;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f48940;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public long f48941;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f48942;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C15737 f48943;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f48944;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public long f48945;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48946;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public float f48947;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f48948;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C23197 f48949;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18412 f48950;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f48951;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AudioTrack f48952;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C2575 f48953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20475 f48954;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f48955;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6854 f48956;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C4551 f48957;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f48958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Context f48959;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f48960;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18983 f48961;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C19467 f48962;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0513 f48963;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f48964;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3321 f48965;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C7445 f48966;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5297 f48967;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C20738 f48968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f48969;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f48970;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48971;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C13323 f48972;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19246 f48973;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f48974;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f48975;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public Handler f48976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f48977;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48978;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7050 f48979;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C7050 f48980;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14770 f48981;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48983;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f48984;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Context f48985;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f48986;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12754 f48987;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public Looper f48988;

    public C14991(C9286 c9286) {
        int deviceId;
        Context applicationContext = c9286.f30188.getApplicationContext();
        this.f48985 = applicationContext;
        this.f48950 = C18412.f59977;
        this.f48981 = applicationContext != null ? null : c9286.f30186;
        this.f48936 = c9286.f30187;
        this.f48977 = false;
        int i = Build.VERSION.SDK_INT;
        this.f48984 = false;
        this.f48974 = 0;
        this.f48987 = c9286.f30192;
        InterfaceC18983 interfaceC18983 = c9286.f30191;
        interfaceC18983.getClass();
        this.f48961 = interfaceC18983;
        this.f48965 = new C3321(new C10516(this));
        C20475 c20475 = new C20475();
        this.f48954 = c20475;
        C23197 c23197 = new C23197();
        this.f48949 = c23197;
        this.f48972 = new C13323();
        this.f48943 = new C15737();
        this.f48930 = AbstractC1928.of((Object) c23197, (Object) c20475);
        this.f48947 = 1.0f;
        this.f48926 = 0;
        this.f48963 = new C0513();
        C7445 c7445 = C7445.f24498;
        this.f48980 = new C7050(c7445, 0L, 0L);
        this.f48966 = c7445;
        this.f48955 = false;
        this.f48951 = new ArrayDeque();
        this.f48924 = new C21705();
        this.f48929 = new C21705();
        this.f48967 = c9286.f30190;
        int i2 = -1;
        if (i >= 34 && (deviceId = c9286.f30188.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.f48932 = i2;
        this.f48969 = true;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36077(InterfaceC1830 interfaceC1830) {
        this.f48935 = interfaceC1830;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36083(C20738 c20738) {
        this.f48968 = c20738;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36080(InterfaceC14814 interfaceC14814) {
        this.f48965.m10948(interfaceC14814);
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo36087(C15648 c15648) {
        return mo36095(c15648) != 0;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo36095(C15648 c15648) {
        m36065();
        String str = c15648.f50848;
        int i = c15648.f50826;
        if ("audio/raw".equals(str)) {
            if (!C7116.m19494(i)) {
                j$$ExternalSyntheticOutline0.m(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.f48977 || i != 4)) {
                return 1;
            }
        } else if (this.f48981.m35558(this.f48950, c15648) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9549 m36090(C15648 c15648) {
        if (this.f48982) {
            return C9549.f30908;
        }
        return this.f48961.mo44091(this.f48950, c15648);
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long mo36092() {
        ArrayDeque arrayDeque;
        long j;
        if (!m36046() || this.f48933) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f48965.m10953(), C7116.m19473(this.f48938.f8274, m36061()));
        while (true) {
            arrayDeque = this.f48951;
            if (arrayDeque.isEmpty() || jMin < ((C7050) arrayDeque.getFirst()).f23253) {
                break;
            }
            this.f48980 = (C7050) arrayDeque.remove();
        }
        C7050 c7050 = this.f48980;
        long j2 = jMin - c7050.f23253;
        long jM19475 = C7116.m19475(j2, c7050.f23256.f24500);
        boolean zIsEmpty = arrayDeque.isEmpty();
        InterfaceC11085 interfaceC11085 = this.f48936;
        if (zIsEmpty) {
            long jM22851 = ((C8541) interfaceC11085).m22851(j2);
            C7050 c7051 = this.f48980;
            j = c7051.f23254 + jM22851;
            c7051.f23255 = jM22851 - jM19475;
        } else {
            C7050 c7052 = this.f48980;
            j = c7052.f23254 + jM19475 + c7052.f23255;
        }
        long jM22855 = ((C8541) interfaceC11085).m22855();
        long jM19473 = C7116.m19473(this.f48938.f8274, jM22855) + j;
        long j3 = this.f48939;
        if (jM22855 > j3) {
            long jM19474 = C7116.m19473(this.f48938.f8274, jM22855 - j3);
            this.f48939 = jM22855;
            this.f48934 += jM19474;
            if (this.f48976 == null) {
                this.f48976 = new Handler(Looper.myLooper());
            }
            this.f48976.removeCallbacksAndMessages(null);
            this.f48976.postDelayed(new RunnableC8501(1, this), 100L);
        }
        return jM19473;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36081(C15648 c15648, int[] iArr) throws C13016 {
        C6854 c6854;
        C9549 c9549M36090;
        int iIntValue;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM19460;
        int i7;
        int iM15984;
        m36065();
        String str = c15648.f50848;
        int i8 = c15648.f50829;
        int i9 = c15648.f50843;
        int i10 = c15648.f50826;
        boolean zEquals = "audio/raw".equals(str);
        boolean z3 = this.f48984;
        C5297 c5297 = this.f48967;
        if (zEquals) {
            C20782.m47565(C7116.m19494(i10));
            int iM19495 = C7116.m19495(i10) * i9;
            C22811 c22811 = new C22811();
            c22811.m19806((List) this.f48930);
            if (this.f48977 && (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4)) {
                c22811.m19807(this.f48943);
            } else {
                c22811.m19807(this.f48972);
                c22811.m51442((Object[]) ((C8541) this.f48936).m22854());
            }
            c6854 = new C6854(c22811.m51441());
            if (c6854.equals(this.f48956)) {
                c6854 = this.f48956;
            }
            this.f48949.m52127(c15648.f50851, c15648.f50816);
            this.f48954.m46978(iArr);
            try {
                C13565 c13565M19068 = c6854.m19068(new C13565(i8, i9, i10));
                int i11 = c13565M19068.f43065;
                int i12 = c13565M19068.f43064;
                int i13 = c13565M19068.f43066;
                c5297.getClass();
                iIntValue = C7116.m19504(i11);
                int iM19496 = C7116.m19495(i12) * i11;
                i2 = iM19495;
                z = z3;
                i4 = iM19496;
                z2 = false;
                i5 = i13;
                i = i12;
                i3 = 0;
            } catch (C5120 e) {
                throw new C13016(e, c15648);
            }
        } else {
            c6854 = new C6854(AbstractC1928.of());
            if (this.f48974 != 0) {
                c9549M36090 = m36090(c15648);
            } else {
                c9549M36090 = C9549.f30908;
            }
            if (this.f48974 != 0 && c9549M36090.f30909) {
                str.getClass();
                int iM25255 = C9681.m25255(str, c15648.f50836);
                c5297.getClass();
                iIntValue = C7116.m19504(i9);
                z2 = c9549M36090.f30911;
                i = iM25255;
                i2 = -1;
                i3 = 1;
                i4 = -1;
                z = true;
            } else {
                Pair pairM35558 = this.f48981.m35558(this.f48950, c15648);
                if (pairM35558 == null) {
                    throw new C13016("Unable to configure passthrough for: " + c15648, c15648);
                }
                int iIntValue2 = ((Integer) pairM35558.first).intValue();
                iIntValue = ((Integer) pairM35558.second).intValue();
                i = iIntValue2;
                z = z3;
                i2 = -1;
                i3 = 2;
                i4 = -1;
                z2 = false;
            }
            i5 = i8;
        }
        if (i == 0) {
            throw new C13016("Invalid output encoding (mode=" + i3 + ") for: " + c15648, c15648);
        }
        if (iIntValue == 0) {
            throw new C13016("Invalid output channel config (mode=" + i3 + ") for: " + c15648, c15648);
        }
        int i14 = c15648.f50849;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i);
        C20782.m47568(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d = z ? 8.0d : 1.0d;
        this.f48987.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                int iM15985 = C5332.m15984(i);
                C20782.m47568(iM15985 != -2147483647);
                iM19460 = C18444.m42970((((long) 50000000) * ((long) iM15985)) / 1000000);
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                if (i == 5) {
                    i7 = 500000;
                } else {
                    i7 = i == 8 ? BasicLabelFormatter.MILLION : 250000;
                }
                if (i14 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iM15984 = C23666.m52903(i14, 8);
                } else {
                    iM15984 = C5332.m15984(i);
                    C20782.m47568(iM15984 != -2147483647);
                }
                iM19460 = C18444.m42970((((long) i7) * ((long) iM15984)) / 1000000);
            }
            i6 = i;
        } else {
            z = z;
            z2 = z2;
            int i16 = i;
            long j = i5;
            i6 = i16;
            long j2 = i15;
            iM19460 = C7116.m19460(minBufferSize * 4, C18444.m42970(((((long) 250000) * j) * j2) / 1000000), C18444.m42970(((((long) 750000) * j) * j2) / 1000000));
        }
        int iMax = i15 * (((Math.max(minBufferSize, (int) (((double) iM19460) * d)) + i15) - 1) / i15);
        this.f48982 = false;
        C2575 c2575 = new C2575(c15648, i2, i3, i4, i5, iIntValue, i6, iMax, c6854, z, z2, this.f48925);
        if (m36046()) {
            this.f48953 = c2575;
        } else {
            this.f48938 = c2575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m36069() throws C5559 {
        AudioTrack audioTrackM36047;
        C19246 c19246;
        C20738 c20738;
        if (this.f48924.m49277()) {
            return false;
        }
        try {
            C2575 c2575 = this.f48938;
            c2575.getClass();
            audioTrackM36047 = m36047(c2575);
        } catch (C5559 e) {
            C2575 c2576 = this.f48938;
            if (c2576.f8272 > 1000000) {
                C2575 c2577 = new C2575(c2576.f8271, c2576.f8269, c2576.f8263, c2576.f8267, c2576.f8274, c2576.f8268, c2576.f8265, BasicLabelFormatter.MILLION, c2576.f8264, c2576.f8266, c2576.f8273, c2576.f8270);
                try {
                    audioTrackM36047 = m36047(c2577);
                    this.f48938 = c2577;
                } catch (C5559 e2) {
                    e.addSuppressed(e2);
                    if (this.f48938.f8263 == 1) {
                        throw e;
                    }
                    this.f48982 = true;
                    throw e;
                }
            }
            if (this.f48938.f8263 == 1) {
                throw e;
            }
            this.f48982 = true;
            throw e;
        }
        this.f48952 = audioTrackM36047;
        if (m36053(audioTrackM36047)) {
            AudioTrack audioTrack = this.f48952;
            if (this.f48962 == null) {
                this.f48962 = new C19467(this);
            }
            this.f48962.m45010(audioTrack);
            C2575 c2578 = this.f48938;
            if (c2578.f8273) {
                AudioTrack audioTrack2 = this.f48952;
                C15648 c15648 = c2578.f8271;
                audioTrack2.setOffloadDelayPadding(c15648.f50851, c15648.f50816);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (c20738 = this.f48968) != null) {
            C7796.m21251(this.f48952, c20738);
        }
        AudioTrack audioTrack3 = this.f48952;
        C2575 c2579 = this.f48938;
        this.f48965.m10947(audioTrack3, c2579.f8263 == 2, c2579.f8265, c2579.f8267, c2579.f8272, this.f48969);
        if (m36046()) {
            this.f48952.setVolume(this.f48947);
        }
        this.f48963.getClass();
        C10295 c10295 = this.f48931;
        if (c10295 != null && i >= 23) {
            C0338.m2072(this.f48952, c10295);
            C19246 c19247 = this.f48973;
            if (c19247 != null) {
                c19247.m44586(this.f48931.f32872);
            }
        }
        if (i >= 24 && (c19246 = this.f48973) != null) {
            this.f48957 = new C4551(this.f48952, c19246);
        }
        this.f48933 = true;
        int audioSessionId = this.f48952.getAudioSessionId();
        boolean z = audioSessionId != this.f48926;
        this.f48926 = audioSessionId;
        InterfaceC1830 interfaceC1830 = this.f48935;
        if (interfaceC1830 != null) {
            interfaceC1830.mo6328(this.f48938.m8634());
            if (z) {
                this.f48927 = true;
                this.f48935.mo6324(this.f48926);
            }
        }
        return true;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo36094() {
        this.f48964 = true;
        if (m36046()) {
            this.f48965.m10951();
            if (!this.f48978 || m36053(this.f48952)) {
                this.f48952.play();
            }
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36071() {
        this.f48960 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0183  */
    /* JADX WARN: Code duplicated, block: B:113:0x0189  */
    /* JADX WARN: Code duplicated, block: B:116:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0194  */
    /* JADX WARN: Code duplicated, block: B:119:0x019a  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e4 A[LOOP:0: B:122:0x01c4->B:130:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:137:0x0202  */
    /* JADX WARN: Code duplicated, block: B:140:0x020a  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0220  */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:164:0x029f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:189:0x030f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0316  */
    /* JADX WARN: Code duplicated, block: B:194:0x0326  */
    /* JADX WARN: Code duplicated, block: B:199:0x0335  */
    /* JADX WARN: Code duplicated, block: B:200:0x0340  */
    /* JADX WARN: Code duplicated, block: B:202:0x034f  */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0360  */
    /* JADX WARN: Code duplicated, block: B:208:0x036a  */
    /* JADX WARN: Code duplicated, block: B:211:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0116  */
    /* JADX WARN: Code duplicated, block: B:81:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a7, code lost:
    
        if (r5 == 0) goto L168;
     */
    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo36086(int r18, long r19, java.nio.ByteBuffer r21) throws l.C24951, l.C5559 {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14991.mo36086(int, long, java.nio.ByteBuffer):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AudioTrack m36047(C2575 c2575) throws C5559 {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f48926;
            int i3 = this.f48932;
            if (i3 == -1 || (context2 = this.f48985) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f48959 == null) {
                    this.f48959 = context2.createDeviceContext(i3);
                }
                context = this.f48959;
                i = 0;
            }
            return m36048(c2575.m8634(), this.f48950, i, c2575.f8271, context);
        } catch (C5559 e) {
            InterfaceC1830 interfaceC1830 = this.f48935;
            if (interfaceC1830 != null) {
                interfaceC1830.mo6327(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AudioTrack m36048(C15253 c15253, C18412 c18412, int i, C15648 c15648, Context context) throws C5559 {
        try {
            AudioTrack audioTrackM15895 = this.f48967.m15895(c15253, c18412, i, context);
            int state = audioTrackM15895.getState();
            if (state == 1) {
                return audioTrackM15895;
            }
            try {
                audioTrackM15895.release();
            } catch (Exception unused) {
            }
            throw new C5559(state, c15253.f49877, c15253.f49878, c15253.f49875, c15253.f49874, c15648, c15253.f49879, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C5559(0, c15253.f49877, c15253.f49878, c15253.f49875, c15253.f49874, c15648, c15253.f49879, e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m36057(long j) throws C24951 {
        m36067(j);
        if (this.f48937 != null) {
            return;
        }
        if (!this.f48956.m19075()) {
            ByteBuffer byteBuffer = this.f48946;
            if (byteBuffer != null) {
                m36051(byteBuffer);
                m36067(j);
                return;
            }
            return;
        }
        while (!this.f48956.m19071()) {
            do {
                ByteBuffer byteBufferM19074 = this.f48956.m19074();
                if (byteBufferM19074.hasRemaining()) {
                    m36051(byteBufferM19074);
                    m36067(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f48946;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f48956.m19070(this.f48946);
                    }
                }
            } while (this.f48937 == null);
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m36063() throws C24951 {
        if (!this.f48956.m19075()) {
            m36067(Long.MIN_VALUE);
            return this.f48937 == null;
        }
        this.f48956.m19073();
        m36057(Long.MIN_VALUE);
        if (!this.f48956.m19071()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f48937;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36051(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        C20782.m47568(this.f48937 == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f48938.f8263 != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM19477 = (int) C7116.m19477(C7116.m19474(20L), this.f48938.f8274, 1000000L, RoundingMode.UP);
                long jM36061 = m36061();
                long j = iM19477;
                if (jM36061 >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C2575 c2575 = this.f48938;
                    int i5 = c2575.f8265;
                    int i6 = c2575.f8267;
                    int i7 = (int) jM36061;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM19477) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fM19457 = C7116.m19457(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fM19457 < 0.0f) {
                                    fM19457 = -fM19457;
                                    f = -2.1474836E9f;
                                } else {
                                    f = 2.1474836E9f;
                                }
                                i3 = (int) (fM19457 * f);
                            } else if (i5 != 21) {
                                if (i5 == 22) {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else {
                                    throw new IllegalStateException();
                                }
                                i3 = i | i2;
                            } else {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 == 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 == 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.f48937 = byteBufferOrder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m36067(long j) throws C24951 {
        int iWrite;
        InterfaceC1830 interfaceC1830;
        if (this.f48937 == null) {
            return;
        }
        C21705 c21705 = this.f48929;
        if (c21705.m49277()) {
            return;
        }
        int iRemaining = this.f48937.remaining();
        boolean z = false;
        if (this.f48925) {
            C20782.m47568(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f48958;
            } else {
                this.f48958 = j;
            }
            AudioTrack audioTrack = this.f48952;
            ByteBuffer byteBuffer = this.f48937;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j);
            } else {
                if (this.f48983 == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f48983 = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f48983.putInt(1431633921);
                }
                if (this.f48975 == 0) {
                    this.f48983.putInt(4, iRemaining);
                    this.f48983.putLong(8, j * 1000);
                    this.f48983.position(0);
                    this.f48975 = iRemaining;
                }
                int iRemaining2 = this.f48983.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f48975 = 0;
                    } else {
                        this.f48975 -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f48983, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f48975 = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f48975 = 0;
                        } else {
                            this.f48975 -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f48952.write(this.f48937, iRemaining, 1);
        }
        this.f48940 = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            c21705.m49275();
            if (m36053(this.f48952)) {
                if (this.f48945 > 0) {
                    this.f48944 = false;
                }
                if (this.f48964 && (interfaceC1830 = this.f48935) != null && iWrite < iRemaining && !this.f48944) {
                    interfaceC1830.mo6332();
                }
            }
            int i = this.f48938.f8263;
            if (i == 0) {
                this.f48941 += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C20782.m47568(this.f48937 == this.f48946);
                    this.f48945 = (((long) this.f48942) * ((long) this.f48928)) + this.f48945;
                }
                this.f48937 = null;
                return;
            }
            return;
        }
        if ((Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32) {
            if (m36061() > 0) {
                z = true;
            } else if (m36053(this.f48952)) {
                if (this.f48938.f8263 == 1) {
                    this.f48982 = true;
                }
                z = true;
            }
        }
        C24951 c24951 = new C24951(iWrite, this.f48938.f8271, z);
        InterfaceC1830 interfaceC1831 = this.f48935;
        if (interfaceC1831 != null) {
            interfaceC1831.mo6327(c24951);
        }
        if (c24951.f80780 && this.f48985 != null) {
            C14770 c14770 = C14770.f48339;
            this.f48981 = c14770;
            this.f48973.m44587(c14770);
            throw c24951;
        }
        c21705.m49276(c24951);
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo36088() {
        if (!this.f48971 && m36046() && m36063()) {
            m36058();
            this.f48971 = true;
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo36097() {
        if (m36046()) {
            return this.f48971 && !mo36085();
        }
        return true;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo36085() {
        if (m36046()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f48952.isOffloadedPlayback() && this.f48948) && this.f48965.m10954(m36061());
        }
        return false;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36078(C7445 c7445) {
        this.f48966 = new C7445(C7116.m19457(c7445.f24500, 0.1f, 8.0f), C7116.m19457(c7445.f24499, 0.1f, 8.0f));
        if (m36070()) {
            m36055();
            return;
        }
        C7050 c7050 = new C7050(c7445, -9223372036854775807L, -9223372036854775807L);
        if (m36046()) {
            this.f48979 = c7050;
        } else {
            this.f48980 = c7050;
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7445 mo36089() {
        return this.f48966;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36084(boolean z) {
        this.f48955 = z;
        C7050 c7050 = new C7050(m36070() ? C7445.f24498 : this.f48966, -9223372036854775807L, -9223372036854775807L);
        if (m36046()) {
            this.f48979 = c7050;
        } else {
            this.f48980 = c7050;
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36082(C18412 c18412) {
        if (this.f48950.equals(c18412)) {
            return;
        }
        this.f48950 = c18412;
        if (this.f48925) {
            return;
        }
        C19246 c19246 = this.f48973;
        if (c19246 != null) {
            c19246.m44588(c18412);
        }
        flush();
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36073(int i) {
        if (this.f48927) {
            if (this.f48926 != i) {
                return;
            } else {
                this.f48927 = false;
            }
        }
        if (this.f48926 != i) {
            this.f48926 = i;
            this.f48922 = i != 0;
            flush();
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36076(C0513 c0513) {
        if (this.f48963.equals(c0513)) {
            return;
        }
        c0513.getClass();
        if (this.f48952 != null) {
            this.f48963.getClass();
        }
        this.f48963 = c0513;
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36075(AudioDeviceInfo audioDeviceInfo) {
        this.f48931 = audioDeviceInfo == null ? null : new C10295(audioDeviceInfo);
        C19246 c19246 = this.f48973;
        if (c19246 != null) {
            c19246.m44586(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f48952;
        if (audioTrack != null) {
            C0338.m2072(audioTrack, this.f48931);
        }
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo36098() {
        long j;
        if (!m36046()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C0338.m2071(this.f48952, this.f48938);
        }
        C2575 c2575 = this.f48938;
        if (c2575.f8263 == 0) {
            j = ((long) c2575.f8274) * ((long) c2575.f8267);
        } else {
            int iM15984 = C5332.m15984(c2575.f8265);
            C20782.m47568(iM15984 != -2147483647);
            j = iM15984;
        }
        return C7116.m19477(this.f48938.f8272, 1000000L, j, RoundingMode.DOWN);
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36091() {
        C20782.m47568(this.f48922);
        if (this.f48925) {
            return;
        }
        this.f48925 = true;
        flush();
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo36093() {
        if (this.f48925) {
            this.f48925 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36096(int i) {
        C20782.m47568(Build.VERSION.SDK_INT >= 29);
        this.f48974 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36074(int i, int i2) {
        C2575 c2575;
        AudioTrack audioTrack = this.f48952;
        if (audioTrack == null || !m36053(audioTrack) || (c2575 = this.f48938) == null || !c2575.f8273) {
            return;
        }
        this.f48952.setOffloadDelayPadding(i, i2);
    }

    @Override // l.InterfaceC16745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36072(float f) {
        if (this.f48947 != f) {
            this.f48947 = f;
            if (m36046()) {
                this.f48952.setVolume(this.f48947);
            }
        }
    }

    @Override // l.InterfaceC16745
    public final void pause() {
        this.f48964 = false;
        if (m36046()) {
            this.f48965.m10955();
            if (!this.f48978 || m36053(this.f48952)) {
                this.f48952.pause();
            }
        }
    }

    @Override // l.InterfaceC16745
    public final void flush() {
        C4551 c4551;
        if (m36046()) {
            this.f48923 = 0L;
            this.f48970 = 0L;
            this.f48941 = 0L;
            this.f48945 = 0L;
            this.f48944 = false;
            this.f48942 = 0;
            this.f48980 = new C7050(this.f48966, 0L, 0L);
            this.f48986 = 0L;
            this.f48979 = null;
            this.f48951.clear();
            this.f48946 = null;
            this.f48928 = 0;
            this.f48937 = null;
            this.f48978 = false;
            this.f48971 = false;
            this.f48948 = false;
            this.f48983 = null;
            this.f48975 = 0;
            this.f48949.m52128();
            C6854 c6854 = this.f48938.f8264;
            this.f48956 = c6854;
            c6854.m19069();
            if (this.f48965.m10949()) {
                this.f48952.pause();
            }
            if (m36053(this.f48952)) {
                C19467 c19467 = this.f48962;
                c19467.getClass();
                c19467.m45011(this.f48952);
            }
            final C15253 c15253M8634 = this.f48938.m8634();
            C2575 c2575 = this.f48953;
            if (c2575 != null) {
                this.f48938 = c2575;
                this.f48953 = null;
            }
            this.f48965.m10952();
            if (Build.VERSION.SDK_INT >= 24 && (c4551 = this.f48957) != null) {
                c4551.m14290();
                this.f48957 = null;
            }
            final AudioTrack audioTrack = this.f48952;
            final InterfaceC1830 interfaceC1830 = this.f48935;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f48921) {
                if (f48919 == null) {
                    String str = C7116.f23455;
                    f48919 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC8607(0));
                }
                f48920++;
                f48919.schedule(new Runnable() { // from class: l.ܿۢۙ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14991.m36050(audioTrack, interfaceC1830, handler, c15253M8634);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.f48952 = null;
        }
        this.f48929.m49275();
        this.f48924.m49275();
        this.f48939 = 0L;
        this.f48934 = 0L;
        Handler handler2 = this.f48976;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // l.InterfaceC16745
    public final void reset() {
        flush();
        AbstractC14956 abstractC14956ListIterator = this.f48930.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            ((InterfaceC22274) abstractC14956ListIterator.next()).reset();
        }
        this.f48972.reset();
        this.f48943.reset();
        C6854 c6854 = this.f48956;
        if (c6854 != null) {
            c6854.m19072();
        }
        this.f48964 = false;
        this.f48982 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m36099() {
        C19246 c19246 = this.f48973;
        if (c19246 != null) {
            c19246.m44589();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36079(C14770 c14770) {
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f48988 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = this.f48988;
        sb.append(looper != null ? looper.getThread().getName() : "null");
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C20782.m47567(sb.toString(), z);
        C14770 c14771 = this.f48981;
        if (c14771 == null || c14770.equals(c14771)) {
            return;
        }
        this.f48981 = c14770;
        InterfaceC1830 interfaceC1830 = this.f48935;
        if (interfaceC1830 != null) {
            interfaceC1830.mo6330();
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m36055() {
        if (m36046()) {
            try {
                this.f48952.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f48966.f24500).setPitch(this.f48966.f24499).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C1896.m6514("Failed to set playback params", e);
            }
            C7445 c7445 = new C7445(this.f48952.getPlaybackParams().getSpeed(), this.f48952.getPlaybackParams().getPitch());
            this.f48966 = c7445;
            this.f48965.m10945(c7445.f24500);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36049(long j) {
        C7445 c7445;
        boolean z;
        boolean zM36070 = m36070();
        boolean z2 = this.f48977;
        InterfaceC11085 interfaceC11085 = this.f48936;
        if (zM36070) {
            c7445 = C7445.f24498;
        } else {
            if (this.f48925) {
                c7445 = C7445.f24498;
            } else {
                C2575 c2575 = this.f48938;
                if (c2575.f8263 == 0) {
                    int i = c2575.f8271.f50826;
                    if (z2) {
                        String str = C7116.f23455;
                        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
                            c7445 = C7445.f24498;
                        }
                    }
                    c7445 = this.f48966;
                    ((C8541) interfaceC11085).m22852(c7445);
                } else {
                    c7445 = C7445.f24498;
                }
            }
            this.f48966 = c7445;
        }
        C7445 c7446 = c7445;
        if (this.f48925) {
            z = false;
        } else {
            C2575 c2576 = this.f48938;
            if (c2576.f8263 == 0) {
                int i2 = c2576.f8271.f50826;
                if (z2) {
                    String str2 = C7116.f23455;
                    if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                        z = false;
                    }
                }
                z = this.f48955;
                ((C8541) interfaceC11085).m22853(z);
            } else {
                z = false;
            }
        }
        this.f48955 = z;
        long jMax = Math.max(0L, j);
        C2575 c2577 = this.f48938;
        this.f48951.add(new C7050(c7446, jMax, C7116.m19473(c2577.f8274, m36061())));
        C6854 c6854 = this.f48938.f8264;
        this.f48956 = c6854;
        c6854.m19069();
        InterfaceC1830 interfaceC1830 = this.f48935;
        if (interfaceC1830 != null) {
            interfaceC1830.mo6329(this.f48955);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m36070() {
        C2575 c2575 = this.f48938;
        return c2575 != null && c2575.f8266 && Build.VERSION.SDK_INT >= 23;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private boolean m36046() {
        return this.f48952 != null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static long m36059(C14991 c14991) {
        C2575 c2575 = c14991.f48938;
        if (c2575.f8263 == 0) {
            return c14991.f48923 / ((long) c2575.f8269);
        }
        return c14991.f48970;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long m36061() {
        C2575 c2575 = this.f48938;
        if (c2575.f8263 == 0) {
            long j = this.f48941;
            long j2 = c2575.f8267;
            String str = C7116.f23455;
            return ((j + j2) - 1) / j2;
        }
        return this.f48945;
    }

    @EnsuresNonNull({"audioCapabilities"})
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m36065() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f48973 == null || this.f48988 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f48988;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        C20782.m47567(sb.toString(), z);
        if (this.f48973 == null && (context = this.f48985) != null) {
            this.f48988 = looperMyLooper;
            C19246 c19246 = new C19246(context, new C19403(1, this), this.f48950, this.f48931);
            this.f48973 = c19246;
            this.f48981 = c19246.m44585();
        }
        this.f48981.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36053(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36058() {
        if (this.f48978) {
            return;
        }
        this.f48978 = true;
        this.f48965.m10946(m36061());
        if (m36053(this.f48952)) {
            this.f48948 = false;
        }
        this.f48952.stop();
        this.f48975 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36050(AudioTrack audioTrack, InterfaceC1830 interfaceC1830, Handler handler, C15253 c15253) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC1830 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC21937(1, interfaceC1830, c15253));
            }
            synchronized (f48921) {
                int i = f48920 - 1;
                f48920 = i;
                if (i == 0) {
                    f48919.shutdown();
                    f48919 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC1830 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC21937(1, interfaceC1830, c15253));
            }
            synchronized (f48921) {
                int i2 = f48920 - 1;
                f48920 = i2;
                if (i2 == 0) {
                    f48919.shutdown();
                    f48919 = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m36062() {
        boolean z;
        synchronized (f48921) {
            z = f48920 > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36052(C14991 c14991) {
        if (c14991.f48934 >= 300000) {
            c14991.f48935.mo6323();
            c14991.f48934 = 0L;
        }
    }
}
