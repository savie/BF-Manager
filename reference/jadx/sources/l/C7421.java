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
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.۟ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7421 implements InterfaceC16449 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static int f24704;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService f24705;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public static final Object f24706 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24707;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f24708;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18252 f24709;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C18004 f24710;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24711;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f24712;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2336 f24713;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f24714;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f24715;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f24716;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f24717;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f24718;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15744 f24719;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3747 f24720;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f24721;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24722;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C10950 f24723;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AudioTrack f24724;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C6715 f24725;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Context f24726;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f24727;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f24728;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C6570 f24729;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23505 f24730;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f24731;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f24732;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public long f24733;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6715 f24734;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f24735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18710 f24736;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f24737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2708 f24738;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24739;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f24740;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C6010 f24741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC9081 f24742;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f24743;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15183 f24744;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C15183 f24745;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24746;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C18710 f24747;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C10805 f24748;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C21449 f24749;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Context f24750;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f24751;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f24752;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f24753;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f24754;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final C16136 f24755;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5531 f24756;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f24757;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f24758;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean f24759;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f24760;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public Handler f24761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f24762;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24763;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24764;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24765;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15889 f24766;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C9724 f24767;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC22238 f24768;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C10244 f24769;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20827 f24770;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public Looper f24771;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ByteBuffer f24772;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f24773;

    public C7421(C3892 c3892) {
        int deviceId;
        Context applicationContext = c3892.f14553.getApplicationContext();
        this.f24726 = applicationContext;
        this.f24738 = C2708.f10419;
        this.f24713 = applicationContext != null ? null : c3892.f14555;
        this.f24742 = c3892.f14557;
        this.f24762 = false;
        int i = Build.VERSION.SDK_INT;
        this.f24759 = false;
        this.f24721 = 0;
        this.f24770 = c3892.f14554;
        InterfaceC22238 interfaceC22238 = c3892.f14558;
        interfaceC22238.getClass();
        this.f24768 = interfaceC22238;
        this.f24748 = new C10805(new C8127(this));
        C23505 c23505 = new C23505();
        this.f24730 = c23505;
        C10950 c10950 = new C10950();
        this.f24723 = c10950;
        this.f24755 = new C16136();
        this.f24741 = new C6010();
        this.f24728 = AbstractC22433.of((Object) c10950, (Object) c23505);
        this.f24773 = 1.0f;
        this.f24716 = 0;
        this.f24756 = new C5531();
        C21449 c21449 = C21449.f69726;
        this.f24745 = new C15183(c21449, 0L, 0L);
        this.f24749 = c21449;
        this.f24731 = false;
        this.f24739 = new ArrayDeque();
        this.f24736 = new C18710();
        this.f24747 = new C18710();
        this.f24766 = c3892.f14556;
        int i2 = -1;
        if (i >= 34 && (deviceId = c3892.f14553.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.f24764 = i2;
        this.f24707 = true;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19888(InterfaceC15744 interfaceC15744) {
        this.f24719 = interfaceC15744;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19886(C9724 c9724) {
        this.f24767 = c9724;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19887(InterfaceC11593 interfaceC11593) {
        this.f24748.m27109(interfaceC11593);
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19893(C7648 c7648) {
        return mo19899(c7648) != 0;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo19899(C7648 c7648) {
        m19872();
        String str = c7648.f25265;
        int i = c7648.f25280;
        if ("audio/raw".equals(str)) {
            if (!C17983.m41853(i)) {
                C7309.m19506(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.f24762 || i != 4)) {
                return 1;
            }
        } else if (this.f24713.m7091(this.f24738, c7648) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15038 m19896(C7648 c7648) {
        if (this.f24714) {
            return C15038.f49026;
        }
        return this.f24768.mo33528(this.f24738, c7648);
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long mo19875() {
        ArrayDeque arrayDeque;
        long j;
        if (!m19861() || this.f24765) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f24748.m27113(), C17983.m41826(this.f24734.f22640, m19870()));
        while (true) {
            arrayDeque = this.f24739;
            if (arrayDeque.isEmpty() || jMin < ((C15183) arrayDeque.getFirst()).f49569) {
                break;
            }
            this.f24745 = (C15183) arrayDeque.remove();
        }
        C15183 c15183 = this.f24745;
        long j2 = jMin - c15183.f49569;
        long jM41828 = C17983.m41828(j2, c15183.f49568.f69728);
        boolean zIsEmpty = arrayDeque.isEmpty();
        InterfaceC9081 interfaceC9081 = this.f24742;
        if (zIsEmpty) {
            long jM50780 = ((C22944) interfaceC9081).m50780(j2);
            C15183 c15184 = this.f24745;
            j = c15184.f49570 + jM50780;
            c15184.f49571 = jM50780 - jM41828;
        } else {
            C15183 c15185 = this.f24745;
            j = c15185.f49570 + jM41828 + c15185.f49571;
        }
        long jM50784 = ((C22944) interfaceC9081).m50784();
        long jM41826 = C17983.m41826(this.f24734.f22640, jM50784) + j;
        long j3 = this.f24735;
        if (jM50784 > j3) {
            long jM41827 = C17983.m41826(this.f24734.f22640, jM50784 - j3);
            this.f24735 = jM50784;
            this.f24718 += jM41827;
            if (this.f24761 == null) {
                this.f24761 = new Handler(Looper.myLooper());
            }
            this.f24761.removeCallbacksAndMessages(null);
            this.f24761.postDelayed(new RunnableC7793(1, this), 100L);
        }
        return jM41826;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19885(C7648 c7648, int[] iArr) throws C7276 {
        C18252 c18252;
        C15038 c15038M19896;
        int iIntValue;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM41813;
        int i7;
        int iM45218;
        m19872();
        String str = c7648.f25265;
        int i8 = c7648.f25260;
        int i9 = c7648.f25249;
        int i10 = c7648.f25280;
        boolean zEquals = "audio/raw".equals(str);
        boolean z3 = this.f24759;
        C15889 c15889 = this.f24766;
        if (zEquals) {
            C2023.m6507(C17983.m41853(i10));
            int iM41849 = C17983.m41849(i10) * i9;
            C4793 c4793 = new C4793();
            c4793.m52162((List) this.f24728);
            if (this.f24762 && (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4)) {
                c4793.m52163(this.f24741);
            } else {
                c4793.m52163(this.f24755);
                c4793.m13310((Object[]) ((C22944) this.f24742).m50783());
            }
            c18252 = new C18252(c4793.m13309());
            if (c18252.equals(this.f24709)) {
                c18252 = this.f24709;
            }
            this.f24723.m27489(c7648.f25272, c7648.f25254);
            this.f24730.m51756(iArr);
            try {
                C18958 c18958M42434 = c18252.m42434(new C18958(i8, i9, i10));
                int i11 = c18958M42434.f61392;
                int i12 = c18958M42434.f61391;
                int i13 = c18958M42434.f61389;
                c15889.getClass();
                iIntValue = C17983.m41854(i11);
                int iM418410 = C17983.m41849(i12) * i11;
                i2 = iM41849;
                z = z3;
                i4 = iM418410;
                z2 = false;
                i5 = i13;
                i = i12;
                i3 = 0;
            } catch (C8375 e) {
                throw new C7276(e, c7648);
            }
        } else {
            c18252 = new C18252(AbstractC22433.of());
            if (this.f24721 != 0) {
                c15038M19896 = m19896(c7648);
            } else {
                c15038M19896 = C15038.f49026;
            }
            if (this.f24721 != 0 && c15038M19896.f49027) {
                str.getClass();
                int iM17983 = C6632.m17983(str, c7648.f25277);
                c15889.getClass();
                iIntValue = C17983.m41854(i9);
                z2 = c15038M19896.f49029;
                i = iM17983;
                i2 = -1;
                i3 = 1;
                i4 = -1;
                z = true;
            } else {
                Pair pairM7091 = this.f24713.m7091(this.f24738, c7648);
                if (pairM7091 == null) {
                    throw new C7276("Unable to configure passthrough for: " + c7648, c7648);
                }
                int iIntValue2 = ((Integer) pairM7091.first).intValue();
                iIntValue = ((Integer) pairM7091.second).intValue();
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
            throw new C7276("Invalid output encoding (mode=" + i3 + ") for: " + c7648, c7648);
        }
        if (iIntValue == 0) {
            throw new C7276("Invalid output channel config (mode=" + i3 + ") for: " + c7648, c7648);
        }
        int i14 = c7648.f25242;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i);
        C2023.m6510(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d = z ? 8.0d : 1.0d;
        this.f24770.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                int iM45219 = C19923.m45218(i);
                C2023.m6510(iM45219 != -2147483647);
                iM41813 = C17039.m39818((((long) 50000000) * ((long) iM45219)) / 1000000);
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
                    iM45218 = C8573.m22349(i14, 8);
                } else {
                    iM45218 = C19923.m45218(i);
                    C2023.m6510(iM45218 != -2147483647);
                }
                iM41813 = C17039.m39818((((long) i7) * ((long) iM45218)) / 1000000);
            }
            i6 = i;
        } else {
            z = z;
            z2 = z2;
            int i16 = i;
            long j = i5;
            i6 = i16;
            long j2 = i15;
            iM41813 = C17983.m41813(minBufferSize * 4, C17039.m39818(((((long) 250000) * j) * j2) / 1000000), C17039.m39818(((((long) 750000) * j) * j2) / 1000000));
        }
        int iMax = i15 * (((Math.max(minBufferSize, (int) (((double) iM41813) * d)) + i15) - 1) / i15);
        this.f24714 = false;
        C6715 c6715 = new C6715(c7648, i2, i3, i4, i5, iIntValue, i6, iMax, c18252, z, z2, this.f24737);
        if (m19861()) {
            this.f24725 = c6715;
        } else {
            this.f24734 = c6715;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m19871() throws C20682 {
        AudioTrack audioTrackM19852;
        C3747 c3747;
        C9724 c9724;
        if (this.f24736.m43243()) {
            return false;
        }
        try {
            C6715 c6715 = this.f24734;
            c6715.getClass();
            audioTrackM19852 = m19852(c6715);
        } catch (C20682 e) {
            C6715 c6716 = this.f24734;
            if (c6716.f22637 > 1000000) {
                C6715 c6717 = new C6715(c6716.f22633, c6716.f22639, c6716.f22631, c6716.f22634, c6716.f22640, c6716.f22629, c6716.f22636, BasicLabelFormatter.MILLION, c6716.f22632, c6716.f22635, c6716.f22630, c6716.f22638);
                try {
                    audioTrackM19852 = m19852(c6717);
                    this.f24734 = c6717;
                } catch (C20682 e2) {
                    e.addSuppressed(e2);
                    if (this.f24734.f22631 == 1) {
                        throw e;
                    }
                    this.f24714 = true;
                    throw e;
                }
            }
            if (this.f24734.f22631 == 1) {
                throw e;
            }
            this.f24714 = true;
            throw e;
        }
        this.f24724 = audioTrackM19852;
        if (m19858(audioTrackM19852)) {
            AudioTrack audioTrack = this.f24724;
            if (this.f24769 == null) {
                this.f24769 = new C10244(this);
            }
            this.f24769.m26040(audioTrack);
            C6715 c6718 = this.f24734;
            if (c6718.f22630) {
                AudioTrack audioTrack2 = this.f24724;
                C7648 c7648 = c6718.f22633;
                audioTrack2.setOffloadDelayPadding(c7648.f25272, c7648.f25254);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && (c9724 = this.f24767) != null) {
            C5304.m14724(this.f24724, c9724);
        }
        AudioTrack audioTrack3 = this.f24724;
        C6715 c6719 = this.f24734;
        this.f24748.m27108(audioTrack3, c6719.f22631 == 2, c6719.f22636, c6719.f22634, c6719.f22637, this.f24707);
        if (m19861()) {
            this.f24724.setVolume(this.f24773);
        }
        this.f24756.getClass();
        C6570 c6570 = this.f24729;
        if (c6570 != null && i >= 23) {
            C2481.m7611(this.f24724, c6570);
            C3747 c3748 = this.f24720;
            if (c3748 != null) {
                c3748.m10974(this.f24729.f22122);
            }
        }
        if (i >= 24 && (c3747 = this.f24720) != null) {
            this.f24710 = new C18004(this.f24724, c3747);
        }
        this.f24765 = true;
        int audioSessionId = this.f24724.getAudioSessionId();
        boolean z = audioSessionId != this.f24716;
        this.f24716 = audioSessionId;
        InterfaceC15744 interfaceC15744 = this.f24719;
        if (interfaceC15744 != null) {
            interfaceC15744.mo2087(this.f24734.m18154());
            if (z) {
                this.f24717 = true;
                this.f24719.mo2083(this.f24716);
            }
        }
        return true;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo19894() {
        this.f24757 = true;
        if (m19861()) {
            this.f24748.m27115();
            if (!this.f24763 || m19858(this.f24724)) {
                this.f24724.play();
            }
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo19877() {
        this.f24751 = true;
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
    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo19892(int r18, long r19, java.nio.ByteBuffer r21) throws l.C0220, l.C20682 {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7421.mo19892(int, long, java.nio.ByteBuffer):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AudioTrack m19852(C6715 c6715) throws C20682 {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f24716;
            int i3 = this.f24764;
            if (i3 == -1 || (context2 = this.f24726) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f24750 == null) {
                    this.f24750 = context2.createDeviceContext(i3);
                }
                context = this.f24750;
                i = 0;
            }
            return m19853(c6715.m18154(), this.f24738, i, c6715.f22633, context);
        } catch (C20682 e) {
            InterfaceC15744 interfaceC15744 = this.f24719;
            if (interfaceC15744 != null) {
                interfaceC15744.mo2086(e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AudioTrack m19853(C10099 c10099, C2708 c2708, int i, C7648 c7648, Context context) throws C20682 {
        try {
            AudioTrack audioTrackM37802 = this.f24766.m37802(c10099, c2708, i, context);
            int state = audioTrackM37802.getState();
            if (state == 1) {
                return audioTrackM37802;
            }
            try {
                audioTrackM37802.release();
            } catch (Exception unused) {
            }
            throw new C20682(state, c10099.f34484, c10099.f34486, c10099.f34485, c10099.f34483, c7648, c10099.f34482, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C20682(0, c10099.f34484, c10099.f34486, c10099.f34485, c10099.f34483, c7648, c10099.f34482, e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m19865(long j) throws C0220 {
        m19868(j);
        if (this.f24743 != null) {
            return;
        }
        if (!this.f24709.m42433()) {
            ByteBuffer byteBuffer = this.f24772;
            if (byteBuffer != null) {
                m19856(byteBuffer);
                m19868(j);
                return;
            }
            return;
        }
        while (!this.f24709.m42438()) {
            do {
                ByteBuffer byteBufferM42439 = this.f24709.m42439();
                if (byteBufferM42439.hasRemaining()) {
                    m19856(byteBufferM42439);
                    m19868(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f24772;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f24709.m42436(this.f24772);
                    }
                }
            } while (this.f24743 == null);
            return;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m19873() throws C0220 {
        if (!this.f24709.m42433()) {
            m19868(Long.MIN_VALUE);
            return this.f24743 == null;
        }
        this.f24709.m42437();
        m19865(Long.MIN_VALUE);
        if (!this.f24709.m42438()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f24743;
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
    private void m19856(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        C2023.m6510(this.f24743 == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f24734.f22631 != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iM41830 = (int) C17983.m41830(C17983.m41827(20L), this.f24734.f22640, 1000000L, RoundingMode.UP);
                long jM19870 = m19870();
                long j = iM41830;
                if (jM19870 >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C6715 c6715 = this.f24734;
                    int i5 = c6715.f22636;
                    int i6 = c6715.f22634;
                    int i7 = (int) jM19870;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM41830) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fM41810 = C17983.m41810(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fM41810 < 0.0f) {
                                    fM41810 = -fM41810;
                                    f = -2.14748365E9f;
                                } else {
                                    f = 2.14748365E9f;
                                }
                                i3 = (int) (fM41810 * f);
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
                                byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.14748365E9f);
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
                            byteBufferOrder.putFloat((-i4) / (-2.14748365E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.14748365E9f);
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
            this.f24743 = byteBufferOrder;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m19868(long j) throws C0220 {
        int iWrite;
        InterfaceC15744 interfaceC15744;
        if (this.f24743 == null) {
            return;
        }
        C18710 c18710 = this.f24747;
        if (c18710.m43243()) {
            return;
        }
        int iRemaining = this.f24743.remaining();
        boolean z = false;
        if (this.f24737) {
            C2023.m6510(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f24715;
            } else {
                this.f24715 = j;
            }
            AudioTrack audioTrack = this.f24724;
            ByteBuffer byteBuffer = this.f24743;
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j);
            } else {
                if (this.f24758 == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.f24758 = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.f24758.putInt(1431633921);
                }
                if (this.f24760 == 0) {
                    this.f24758.putInt(4, iRemaining);
                    this.f24758.putLong(8, j * 1000);
                    this.f24758.position(0);
                    this.f24760 = iRemaining;
                }
                int iRemaining2 = this.f24758.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.f24760 = 0;
                    } else {
                        this.f24760 -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.f24758, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f24760 = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.f24760 = 0;
                        } else {
                            this.f24760 -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f24724.write(this.f24743, iRemaining, 1);
        }
        this.f24732 = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            c18710.m43241();
            if (m19858(this.f24724)) {
                if (this.f24712 > 0) {
                    this.f24711 = false;
                }
                if (this.f24757 && (interfaceC15744 = this.f24719) != null && iWrite < iRemaining && !this.f24711) {
                    interfaceC15744.mo2091();
                }
            }
            int i = this.f24734.f22631;
            if (i == 0) {
                this.f24733 += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C2023.m6510(this.f24743 == this.f24772);
                    this.f24712 = (((long) this.f24740) * ((long) this.f24746)) + this.f24712;
                }
                this.f24743 = null;
                return;
            }
            return;
        }
        if ((Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32) {
            if (m19870() > 0) {
                z = true;
            } else if (m19858(this.f24724)) {
                if (this.f24734.f22631 == 1) {
                    this.f24714 = true;
                }
                z = true;
            }
        }
        C0220 c0220 = new C0220(iWrite, this.f24734.f22633, z);
        InterfaceC15744 interfaceC15745 = this.f24719;
        if (interfaceC15745 != null) {
            interfaceC15745.mo2086(c0220);
        }
        if (c0220.f1398 && this.f24726 != null) {
            C2336 c2336 = C2336.f8268;
            this.f24713 = c2336;
            this.f24720.m10975(c2336);
            throw c0220;
        }
        c18710.m43242(c0220);
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo19898() {
        if (!this.f24754 && m19861() && m19873()) {
            m19862();
            this.f24754 = true;
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19901() {
        if (m19861()) {
            return this.f24754 && !mo19891();
        }
        return true;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19891() {
        if (m19861()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f24724.isOffloadedPlayback() && this.f24722) && this.f24748.m27114(m19870());
        }
        return false;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19889(C21449 c21449) {
        this.f24749 = new C21449(C17983.m41810(c21449.f69728, 0.1f, 8.0f), C17983.m41810(c21449.f69727, 0.1f, 8.0f));
        if (m19860()) {
            m19863();
            return;
        }
        C15183 c15183 = new C15183(c21449, -9223372036854775807L, -9223372036854775807L);
        if (m19861()) {
            this.f24744 = c15183;
        } else {
            this.f24745 = c15183;
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21449 mo19897() {
        return this.f24749;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19890(boolean z) {
        this.f24731 = z;
        C15183 c15183 = new C15183(m19860() ? C21449.f69726 : this.f24749, -9223372036854775807L, -9223372036854775807L);
        if (m19861()) {
            this.f24744 = c15183;
        } else {
            this.f24745 = c15183;
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19883(C2708 c2708) {
        if (this.f24738.equals(c2708)) {
            return;
        }
        this.f24738 = c2708;
        if (this.f24737) {
            return;
        }
        C3747 c3747 = this.f24720;
        if (c3747 != null) {
            c3747.m10976(c2708);
        }
        flush();
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19879(int i) {
        if (this.f24717) {
            if (this.f24716 != i) {
                return;
            } else {
                this.f24717 = false;
            }
        }
        if (this.f24716 != i) {
            this.f24716 = i;
            this.f24752 = i != 0;
            flush();
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19884(C5531 c5531) {
        if (this.f24756.equals(c5531)) {
            return;
        }
        c5531.getClass();
        if (this.f24724 != null) {
            this.f24756.getClass();
        }
        this.f24756 = c5531;
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19881(AudioDeviceInfo audioDeviceInfo) {
        this.f24729 = audioDeviceInfo == null ? null : new C6570(audioDeviceInfo);
        C3747 c3747 = this.f24720;
        if (c3747 != null) {
            c3747.m10974(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f24724;
        if (audioTrack != null) {
            C2481.m7611(audioTrack, this.f24729);
        }
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long mo19876() {
        long j;
        if (!m19861()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C2481.m7610(this.f24724, this.f24734);
        }
        C6715 c6715 = this.f24734;
        if (c6715.f22631 == 0) {
            j = ((long) c6715.f22640) * ((long) c6715.f22634);
        } else {
            int iM45218 = C19923.m45218(c6715.f22636);
            C2023.m6510(iM45218 != -2147483647);
            j = iM45218;
        }
        return C17983.m41830(this.f24734.f22637, 1000000L, j, RoundingMode.DOWN);
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo19895() {
        C2023.m6510(this.f24752);
        if (this.f24737) {
            return;
        }
        this.f24737 = true;
        flush();
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo19902() {
        if (this.f24737) {
            this.f24737 = false;
            flush();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19900(int i) {
        C2023.m6510(Build.VERSION.SDK_INT >= 29);
        this.f24721 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19880(int i, int i2) {
        C6715 c6715;
        AudioTrack audioTrack = this.f24724;
        if (audioTrack == null || !m19858(audioTrack) || (c6715 = this.f24734) == null || !c6715.f22630) {
            return;
        }
        this.f24724.setOffloadDelayPadding(i, i2);
    }

    @Override // l.InterfaceC16449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19878(float f) {
        if (this.f24773 != f) {
            this.f24773 = f;
            if (m19861()) {
                this.f24724.setVolume(this.f24773);
            }
        }
    }

    @Override // l.InterfaceC16449
    public final void pause() {
        this.f24757 = false;
        if (m19861()) {
            this.f24748.m27103();
            if (!this.f24763 || m19858(this.f24724)) {
                this.f24724.pause();
            }
        }
    }

    @Override // l.InterfaceC16449
    public final void flush() {
        C18004 c18004;
        if (m19861()) {
            this.f24753 = 0L;
            this.f24708 = 0L;
            this.f24733 = 0L;
            this.f24712 = 0L;
            this.f24711 = false;
            this.f24740 = 0;
            this.f24745 = new C15183(this.f24749, 0L, 0L);
            this.f24727 = 0L;
            this.f24744 = null;
            this.f24739.clear();
            this.f24772 = null;
            this.f24746 = 0;
            this.f24743 = null;
            this.f24763 = false;
            this.f24754 = false;
            this.f24722 = false;
            this.f24758 = null;
            this.f24760 = 0;
            this.f24723.m27490();
            C18252 c18252 = this.f24734.f22632;
            this.f24709 = c18252;
            c18252.m42435();
            if (this.f24748.m27111()) {
                this.f24724.pause();
            }
            if (m19858(this.f24724)) {
                C10244 c10244 = this.f24769;
                c10244.getClass();
                c10244.m26041(this.f24724);
            }
            final C10099 c10099M18154 = this.f24734.m18154();
            C6715 c6715 = this.f24725;
            if (c6715 != null) {
                this.f24734 = c6715;
                this.f24725 = null;
            }
            this.f24748.m27110();
            if (Build.VERSION.SDK_INT >= 24 && (c18004 = this.f24710) != null) {
                c18004.m41953();
                this.f24710 = null;
            }
            final AudioTrack audioTrack = this.f24724;
            final InterfaceC15744 interfaceC15744 = this.f24719;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f24706) {
                if (f24705 == null) {
                    String str = C17983.f57504;
                    f24705 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC21511());
                }
                f24704++;
                f24705.schedule(new Runnable() { // from class: l.ۨۧۙ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7421.m19855(audioTrack, interfaceC15744, handler, c10099M18154);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.f24724 = null;
        }
        this.f24747.m43241();
        this.f24736.m43241();
        this.f24735 = 0L;
        this.f24718 = 0L;
        Handler handler2 = this.f24761;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // l.InterfaceC16449
    public final void reset() {
        flush();
        AbstractC16706 abstractC16706ListIterator = this.f24728.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            ((InterfaceC19664) abstractC16706ListIterator.next()).reset();
        }
        this.f24755.reset();
        this.f24741.reset();
        C18252 c18252 = this.f24709;
        if (c18252 != null) {
            c18252.m42440();
        }
        this.f24757 = false;
        this.f24714 = false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m19903() {
        C3747 c3747 = this.f24720;
        if (c3747 != null) {
            c3747.m10977();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19882(C2336 c2336) {
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f24771 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = this.f24771;
        sb.append(looper != null ? looper.getThread().getName() : "null");
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C2023.m6509(sb.toString(), z);
        C2336 c2337 = this.f24713;
        if (c2337 == null || c2336.equals(c2337)) {
            return;
        }
        this.f24713 = c2336;
        InterfaceC15744 interfaceC15744 = this.f24719;
        if (interfaceC15744 != null) {
            interfaceC15744.mo2090();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m19863() {
        if (m19861()) {
            try {
                this.f24724.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f24749.f69728).setPitch(this.f24749.f69727).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C0303.m1852("Failed to set playback params", e);
            }
            C21449 c21449 = new C21449(this.f24724.getPlaybackParams().getSpeed(), this.f24724.getPlaybackParams().getPitch());
            this.f24749 = c21449;
            this.f24748.m27106(c21449.f69728);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19854(long j) {
        C21449 c21449;
        boolean z;
        boolean zM19860 = m19860();
        boolean z2 = this.f24762;
        InterfaceC9081 interfaceC9081 = this.f24742;
        if (zM19860) {
            c21449 = C21449.f69726;
        } else {
            if (this.f24737) {
                c21449 = C21449.f69726;
            } else {
                C6715 c6715 = this.f24734;
                if (c6715.f22631 == 0) {
                    int i = c6715.f22633.f25280;
                    if (z2) {
                        String str = C17983.f57504;
                        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
                            c21449 = C21449.f69726;
                        }
                    }
                    c21449 = this.f24749;
                    ((C22944) interfaceC9081).m50781(c21449);
                } else {
                    c21449 = C21449.f69726;
                }
            }
            this.f24749 = c21449;
        }
        C21449 c214410 = c21449;
        if (this.f24737) {
            z = false;
        } else {
            C6715 c6716 = this.f24734;
            if (c6716.f22631 == 0) {
                int i2 = c6716.f22633.f25280;
                if (z2) {
                    String str2 = C17983.f57504;
                    if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                        z = false;
                    }
                }
                z = this.f24731;
                ((C22944) interfaceC9081).m50782(z);
            } else {
                z = false;
            }
        }
        this.f24731 = z;
        long jMax = Math.max(0L, j);
        C6715 c6717 = this.f24734;
        this.f24739.add(new C15183(c214410, jMax, C17983.m41826(c6717.f22640, m19870())));
        C18252 c18252 = this.f24734.f22632;
        this.f24709 = c18252;
        c18252.m42435();
        InterfaceC15744 interfaceC15744 = this.f24719;
        if (interfaceC15744 != null) {
            interfaceC15744.mo2088(this.f24731);
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private boolean m19860() {
        C6715 c6715 = this.f24734;
        return c6715 != null && c6715.f22635 && Build.VERSION.SDK_INT >= 23;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private boolean m19861() {
        return this.f24724 != null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static long m19850(C7421 c7421) {
        C6715 c6715 = c7421.f24734;
        if (c6715.f22631 == 0) {
            return c7421.f24753 / ((long) c6715.f22639);
        }
        return c7421.f24708;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long m19870() {
        C6715 c6715 = this.f24734;
        if (c6715.f22631 == 0) {
            long j = this.f24733;
            long j2 = c6715.f22634;
            String str = C17983.f57504;
            return ((j + j2) - 1) / j2;
        }
        return this.f24712;
    }

    @EnsuresNonNull({"audioCapabilities"})
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m19872() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.f24720 == null || this.f24771 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f24771;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        C2023.m6509(sb.toString(), z);
        if (this.f24720 == null && (context = this.f24726) != null) {
            this.f24771 = looperMyLooper;
            C3747 c3747 = new C3747(context, new H5PayActivity$$ExternalSyntheticLambda0(this), this.f24738, this.f24729);
            this.f24720 = c3747;
            this.f24713 = c3747.m10973();
        }
        this.f24713.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19858(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m19862() {
        if (this.f24763) {
            return;
        }
        this.f24763 = true;
        this.f24748.m27107(m19870());
        if (m19858(this.f24724)) {
            this.f24722 = false;
        }
        this.f24724.stop();
        this.f24760 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19855(AudioTrack audioTrack, InterfaceC15744 interfaceC15744, Handler handler, C10099 c10099) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC15744 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC20822(1, interfaceC15744, c10099));
            }
            synchronized (f24706) {
                int i = f24704 - 1;
                f24704 = i;
                if (i == 0) {
                    f24705.shutdown();
                    f24705 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC15744 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC20822(1, interfaceC15744, c10099));
            }
            synchronized (f24706) {
                int i2 = f24704 - 1;
                f24704 = i2;
                if (i2 == 0) {
                    f24705.shutdown();
                    f24705 = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m19869() {
        boolean z;
        synchronized (f24706) {
            z = f24704 > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19857(C7421 c7421) {
        if (c7421.f24718 >= 300000) {
            c7421.f24719.mo2082();
            c7421.f24718 = 0L;
        }
    }
}
