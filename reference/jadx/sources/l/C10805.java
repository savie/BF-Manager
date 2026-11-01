package l;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۧۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10805 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f36783;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f36784;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f36785;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f36786;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f36787;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f36788;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17154 f36789;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f36790;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f36791;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f36792;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f36793;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f36794;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f36795;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f36796;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f36797;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f36798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f36799;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f36800;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f36801;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f36802;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AudioTrack f36803;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f36804;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f36805;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f36806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36807;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36808;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f36809;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f36810;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f36811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f36812;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC5865 f36813;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f36814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC11593 f36815;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Method f36816;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f36817;

    public C10805(InterfaceC5865 interfaceC5865) {
        this.f36813 = interfaceC5865;
        try {
            this.f36816 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f36799 = new long[10];
        this.f36796 = -9223372036854775807L;
        this.f36795 = -9223372036854775807L;
        this.f36815 = InterfaceC11593.f38960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27108(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        long jM41826;
        this.f36803 = audioTrack;
        this.f36786 = i3;
        this.f36789 = new C17154(audioTrack, this.f36813);
        this.f36801 = audioTrack.getSampleRate();
        this.f36806 = z && Build.VERSION.SDK_INT < 23 && (i == 5 || i == 6);
        boolean zM41853 = C17983.m41853(i);
        this.f36814 = zM41853;
        if (zM41853) {
            jM41826 = C17983.m41826(this.f36801, i3 / i2);
        } else {
            jM41826 = -9223372036854775807L;
        }
        this.f36791 = jM41826;
        this.f36817 = 0L;
        this.f36804 = 0L;
        this.f36788 = false;
        this.f36790 = 0L;
        this.f36808 = 0L;
        this.f36805 = false;
        this.f36787 = -9223372036854775807L;
        this.f36793 = -9223372036854775807L;
        this.f36809 = 0L;
        this.f36794 = 0L;
        this.f36800 = 1.0f;
        this.f36798 = 0;
        this.f36807 = -9223372036854775807L;
        this.f36784 = z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27106(float f) {
        this.f36800 = f;
        C17154 c17154 = this.f36789;
        if (c17154 != null) {
            c17154.m40079();
        }
        m27099();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:26:0x0083, B:28:0x00a9), top: B:64:0x0083 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a9, please report this as an issue */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m27113() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f36803;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jMo28885 = this.f36815.mo28885() / 1000;
            if (jMo28885 - this.f36810 >= 30000) {
                long jM41826 = C17983.m41826(this.f36801, m27098());
                if (jM41826 != 0) {
                    int i = this.f36812;
                    long jM41857 = C17983.m41857(jM41826, this.f36800) - jMo28885;
                    long[] jArr = this.f36799;
                    jArr[i] = jM41857;
                    this.f36812 = (this.f36812 + 1) % 10;
                    int i2 = this.f36792;
                    if (i2 < 10) {
                        this.f36792 = i2 + 1;
                    }
                    this.f36810 = jMo28885;
                    this.f36785 = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f36792;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f36785 += jArr[i3] / ((long) i4);
                        i3++;
                        jArr = jArr;
                    }
                    if (!this.f36806) {
                        if (this.f36814 && (method = this.f36816) != null && jMo28885 - this.f36809 >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f36803;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str = C17983.f57504;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f36791;
                                this.f36794 = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f36794 = jMax;
                                if (jMax > 5000000) {
                                    C0303.m1848("Ignoring impossibly large audio latency: " + jMax);
                                    this.f36794 = 0L;
                                }
                            } catch (Exception unused) {
                                this.f36816 = null;
                            }
                            this.f36809 = jMo28885;
                        }
                        C17154 c17154 = this.f36789;
                        c17154.getClass();
                        c17154.m40082(this.f36800, jMo28885, m27100(jMo28885));
                    }
                }
            } else if (!this.f36806) {
                if (this.f36814) {
                    AudioTrack audioTrack3 = this.f36803;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    String str2 = C17983.f57504;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f36791;
                    this.f36794 = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f36794 = jMax;
                    if (jMax > 5000000) {
                        C0303.m1848("Ignoring impossibly large audio latency: " + jMax);
                        this.f36794 = 0L;
                    }
                    this.f36809 = jMo28885;
                }
                C17154 c17155 = this.f36789;
                c17155.getClass();
                c17155.m40082(this.f36800, jMo28885, m27100(jMo28885));
            }
        }
        long jMo28886 = this.f36815.mo28885() / 1000;
        C17154 c17156 = this.f36789;
        c17156.getClass();
        boolean zM40084 = c17156.m40084();
        long jM40080 = zM40084 ? c17156.m40080(jMo28886, this.f36800) : m27100(jMo28886);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zM40084 || !c17156.m40083()) {
                m27102(jM40080);
            }
            long j = this.f36796;
            if (j != -9223372036854775807L) {
                long j2 = jM40080 - this.f36795;
                long jM41828 = C17983.m41828(jMo28886 - j, this.f36800);
                long j3 = this.f36795 + jM41828;
                long jAbs = Math.abs(j3 - jM40080);
                if (j2 != 0 && jAbs < 1000000) {
                    long j4 = (jM41828 * 10) / 100;
                    jM40080 = C17983.m41829(jM40080, j3 - j4, j3 + j4);
                }
            }
            if (!this.f36784 && !this.f36783) {
                long j5 = this.f36795;
                if (j5 != -9223372036854775807L && jM40080 > j5) {
                    this.f36783 = true;
                    ((C8127) this.f36813).m21392(this.f36815.mo28886() - C17983.m41856(C17983.m41857(C17983.m41856(jM40080 - j5), this.f36800)));
                }
            }
            this.f36796 = jMo28886;
            this.f36795 = jM40080;
        } else if (playState == 1) {
            m27102(jM40080);
        }
        return jM40080;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m27115() {
        if (this.f36787 != -9223372036854775807L) {
            this.f36787 = C17983.m41827(this.f36815.mo28888());
        }
        this.f36807 = C17983.m41826(this.f36801, m27098());
        C17154 c17154 = this.f36789;
        c17154.getClass();
        c17154.m40079();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27111() {
        AudioTrack audioTrack = this.f36803;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m27104(long j) {
        AudioTrack audioTrack = this.f36803;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z = false;
        if (this.f36806) {
            if (playState == 2) {
                this.f36805 = false;
                return false;
            }
            if (playState == 1 && m27098() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            boolean z2 = this.f36805;
            boolean zM27114 = m27114(j);
            this.f36805 = zM27114;
            if (z2 && !zM27114 && playState != 1) {
                z = true;
            }
        } else {
            AudioTrack audioTrack2 = this.f36803;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            z = underrunCount > this.f36798;
            this.f36798 = underrunCount;
        }
        if (z) {
            int i = this.f36786;
            long jM41856 = C17983.m41856(this.f36791);
            C7421 c7421 = ((C8127) this.f36813).f28449;
            if (c7421.f24719 != null) {
                c7421.f24719.mo2085(jM41856, i, SystemClock.elapsedRealtime() - c7421.f24732);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27112(long j) {
        return this.f36793 != -9223372036854775807L && j > 0 && this.f36815.mo28888() - this.f36793 >= 200;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27107(long j) {
        this.f36797 = m27098();
        this.f36787 = C17983.m41827(this.f36815.mo28888());
        this.f36802 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m27114(long j) {
        long jM27113 = m27113();
        int i = this.f36801;
        String str = C17983.f57504;
        if (j > C17983.m41830(jM27113, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f36806) {
            return false;
        }
        AudioTrack audioTrack = this.f36803;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m27098() == 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27103() {
        m27099();
        if (this.f36787 == -9223372036854775807L) {
            C17154 c17154 = this.f36789;
            c17154.getClass();
            c17154.m40079();
        }
        this.f36797 = m27098();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27105() {
        this.f36788 = true;
        C17154 c17154 = this.f36789;
        if (c17154 != null) {
            c17154.m40081();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27110() {
        m27099();
        this.f36803 = null;
        this.f36789 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27109(InterfaceC11593 interfaceC11593) {
        this.f36815 = interfaceC11593;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m27102(long j) {
        if (this.f36784) {
            long j2 = this.f36807;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jMo28886 = this.f36815.mo28886() - C17983.m41856(C17983.m41857(j - j2, this.f36800));
            this.f36807 = -9223372036854775807L;
            ((C8127) this.f36813).m21392(jMo28886);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private long m27100(long j) {
        long jM41828;
        if (this.f36792 != 0) {
            jM41828 = C17983.m41828(j + this.f36785, this.f36800);
        } else if (this.f36787 != -9223372036854775807L) {
            jM41828 = C17983.m41826(this.f36801, m27101());
        } else {
            jM41828 = C17983.m41826(this.f36801, m27098());
        }
        long jMax = Math.max(0L, jM41828 - this.f36794);
        if (this.f36787 == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(C17983.m41826(this.f36801, this.f36802), jMax);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m27099() {
        this.f36785 = 0L;
        this.f36792 = 0;
        this.f36812 = 0;
        this.f36810 = 0L;
        this.f36795 = -9223372036854775807L;
        this.f36796 = -9223372036854775807L;
        this.f36783 = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private long m27098() {
        long j;
        if (this.f36787 != -9223372036854775807L) {
            return Math.min(this.f36802, m27101());
        }
        long jMo28888 = this.f36815.mo28888();
        if (jMo28888 - this.f36811 >= 5) {
            AudioTrack audioTrack = this.f36803;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f36806) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f36808 = this.f36817;
                    }
                    playbackHeadPosition += this.f36808;
                }
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.f36817;
                    if (j > playbackHeadPosition) {
                        if (this.f36788) {
                            this.f36790 += j;
                            this.f36788 = false;
                        } else {
                            this.f36804++;
                        }
                    }
                    this.f36817 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f36817 <= 0 || playState != 3) {
                    this.f36793 = -9223372036854775807L;
                    j = this.f36817;
                    if (j > playbackHeadPosition) {
                        if (this.f36788) {
                            this.f36790 += j;
                            this.f36788 = false;
                        } else {
                            this.f36804++;
                        }
                    }
                    this.f36817 = playbackHeadPosition;
                } else if (this.f36793 == -9223372036854775807L) {
                    this.f36793 = jMo28888;
                }
            }
            this.f36811 = jMo28888;
        }
        return this.f36817 + this.f36790 + (this.f36804 << 32);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private long m27101() {
        AudioTrack audioTrack = this.f36803;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f36797;
        }
        return this.f36797 + C17983.m41830(C17983.m41828(C17983.m41827(this.f36815.mo28888()) - this.f36787, this.f36800), this.f36801, 1000000L, RoundingMode.UP);
    }
}
