package l;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۗۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8SY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f10831;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long[] f10832;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f10833;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f10834;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f10835;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23459 f10836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15999 f10837;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f10838;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f10839;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f10840;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f10841;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f10842;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f10843;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f10844;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f10845;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f10846;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f10847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f10848;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f10849;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f10850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f10851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC14814 f10852;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f10853;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f10854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10855;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10856;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f10857;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f10858;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f10859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10860;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AudioTrack f10861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10862;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f10863;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f10864;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Method f10865;

    public C3321(InterfaceC23459 interfaceC23459) {
        this.f10836 = interfaceC23459;
        try {
            this.f10865 = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10832 = new long[10];
        this.f10848 = -9223372036854775807L;
        this.f10835 = -9223372036854775807L;
        this.f10852 = InterfaceC14814.f48448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10947(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        long jM19473;
        this.f10861 = audioTrack;
        this.f10862 = i3;
        this.f10837 = new C15999(audioTrack, this.f10836);
        this.f10842 = audioTrack.getSampleRate();
        this.f10851 = z && Build.VERSION.SDK_INT < 23 && (i == 5 || i == 6);
        boolean zM19494 = C7116.m19494(i);
        this.f10855 = zM19494;
        if (zM19494) {
            jM19473 = C7116.m19473(this.f10842, i3 / i2);
        } else {
            jM19473 = -9223372036854775807L;
        }
        this.f10858 = jM19473;
        this.f10844 = 0L;
        this.f10834 = 0L;
        this.f10833 = false;
        this.f10838 = 0L;
        this.f10857 = 0L;
        this.f10854 = false;
        this.f10850 = -9223372036854775807L;
        this.f10847 = -9223372036854775807L;
        this.f10853 = 0L;
        this.f10864 = 0L;
        this.f10846 = 1.0f;
        this.f10840 = 0;
        this.f10831 = -9223372036854775807L;
        this.f10849 = z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10945(float f) {
        this.f10846 = f;
        C15999 c15999 = this.f10837;
        if (c15999 != null) {
            c15999.m38134();
        }
        m10939();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:26:0x0083, B:28:0x00a9), top: B:64:0x0083 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a9, please report this as an issue */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m10953() {
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f10861;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jMo2212 = this.f10852.mo2212() / 1000;
            if (jMo2212 - this.f10863 >= 30000) {
                long jM19473 = C7116.m19473(this.f10842, m10941());
                if (jM19473 != 0) {
                    int i = this.f10860;
                    long jM19507 = C7116.m19507(jM19473, this.f10846) - jMo2212;
                    long[] jArr = this.f10832;
                    jArr[i] = jM19507;
                    this.f10860 = (this.f10860 + 1) % 10;
                    int i2 = this.f10845;
                    if (i2 < 10) {
                        this.f10845 = i2 + 1;
                    }
                    this.f10863 = jMo2212;
                    this.f10843 = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f10845;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f10843 += jArr[i3] / ((long) i4);
                        i3++;
                        jArr = jArr;
                    }
                    if (!this.f10851) {
                        if (this.f10855 && (method = this.f10865) != null && jMo2212 - this.f10853 >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f10861;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str = C7116.f23455;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f10858;
                                this.f10864 = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f10864 = jMax;
                                if (jMax > 5000000) {
                                    C1896.m6517("Ignoring impossibly large audio latency: " + jMax);
                                    this.f10864 = 0L;
                                }
                            } catch (Exception unused) {
                                this.f10865 = null;
                            }
                            this.f10853 = jMo2212;
                        }
                        C15999 c15999 = this.f10837;
                        c15999.getClass();
                        c15999.m38131(this.f10846, jMo2212, m10943(jMo2212));
                    }
                }
            } else if (!this.f10851) {
                if (this.f10855) {
                    AudioTrack audioTrack3 = this.f10861;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    String str2 = C7116.f23455;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f10858;
                    this.f10864 = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f10864 = jMax;
                    if (jMax > 5000000) {
                        C1896.m6517("Ignoring impossibly large audio latency: " + jMax);
                        this.f10864 = 0L;
                    }
                    this.f10853 = jMo2212;
                }
                C15999 c159910 = this.f10837;
                c159910.getClass();
                c159910.m38131(this.f10846, jMo2212, m10943(jMo2212));
            }
        }
        long jMo2213 = this.f10852.mo2212() / 1000;
        C15999 c159911 = this.f10837;
        c159911.getClass();
        boolean zM38133 = c159911.m38133();
        long jM38129 = zM38133 ? c159911.m38129(jMo2213, this.f10846) : m10943(jMo2213);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zM38133 || !c159911.m38132()) {
                m10942(jM38129);
            }
            long j = this.f10848;
            if (j != -9223372036854775807L) {
                long j2 = jM38129 - this.f10835;
                long jM19475 = C7116.m19475(jMo2213 - j, this.f10846);
                long j3 = this.f10835 + jM19475;
                long jAbs = Math.abs(j3 - jM38129);
                if (j2 != 0 && jAbs < 1000000) {
                    long j4 = (jM19475 * 10) / 100;
                    jM38129 = C7116.m19476(jM38129, j3 - j4, j3 + j4);
                }
            }
            if (!this.f10849 && !this.f10856) {
                long j5 = this.f10835;
                if (j5 != -9223372036854775807L && jM38129 > j5) {
                    this.f10856 = true;
                    ((C10516) this.f10836).m26975(this.f10852.mo2208() - C7116.m19506(C7116.m19507(C7116.m19506(jM38129 - j5), this.f10846)));
                }
            }
            this.f10848 = jMo2213;
            this.f10835 = jM38129;
        } else if (playState == 1) {
            m10942(jM38129);
        }
        return jM38129;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10951() {
        if (this.f10850 != -9223372036854775807L) {
            this.f10850 = C7116.m19474(this.f10852.mo2210());
        }
        this.f10831 = C7116.m19473(this.f10842, m10941());
        C15999 c15999 = this.f10837;
        c15999.getClass();
        c15999.m38134();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10949() {
        AudioTrack audioTrack = this.f10861;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m10956(long j) {
        AudioTrack audioTrack = this.f10861;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z = false;
        if (this.f10851) {
            if (playState == 2) {
                this.f10854 = false;
                return false;
            }
            if (playState == 1 && m10941() == 0) {
                return false;
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            boolean z2 = this.f10854;
            boolean zM10954 = m10954(j);
            this.f10854 = zM10954;
            if (z2 && !zM10954 && playState != 1) {
                z = true;
            }
        } else {
            AudioTrack audioTrack2 = this.f10861;
            audioTrack2.getClass();
            int underrunCount = audioTrack2.getUnderrunCount();
            z = underrunCount > this.f10840;
            this.f10840 = underrunCount;
        }
        if (z) {
            int i = this.f10862;
            long jM19506 = C7116.m19506(this.f10858);
            C14991 c14991 = ((C10516) this.f10836).f33451;
            if (c14991.f48935 != null) {
                c14991.f48935.mo6326(jM19506, i, SystemClock.elapsedRealtime() - c14991.f48940);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10950(long j) {
        return this.f10847 != -9223372036854775807L && j > 0 && this.f10852.mo2210() - this.f10847 >= 200;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10946(long j) {
        this.f10841 = m10941();
        this.f10850 = C7116.m19474(this.f10852.mo2210());
        this.f10839 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m10954(long j) {
        long jM10953 = m10953();
        int i = this.f10842;
        String str = C7116.f23455;
        if (j > C7116.m19477(jM10953, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f10851) {
            return false;
        }
        AudioTrack audioTrack = this.f10861;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && m10941() == 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m10955() {
        m10939();
        if (this.f10850 == -9223372036854775807L) {
            C15999 c15999 = this.f10837;
            c15999.getClass();
            c15999.m38134();
        }
        this.f10841 = m10941();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10944() {
        this.f10833 = true;
        C15999 c15999 = this.f10837;
        if (c15999 != null) {
            c15999.m38130();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m10952() {
        m10939();
        this.f10861 = null;
        this.f10837 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10948(InterfaceC14814 interfaceC14814) {
        this.f10852 = interfaceC14814;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m10942(long j) {
        if (this.f10849) {
            long j2 = this.f10831;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jMo2208 = this.f10852.mo2208() - C7116.m19506(C7116.m19507(j - j2, this.f10846));
            this.f10831 = -9223372036854775807L;
            ((C10516) this.f10836).m26975(jMo2208);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private long m10943(long j) {
        long jM19475;
        if (this.f10845 != 0) {
            jM19475 = C7116.m19475(j + this.f10843, this.f10846);
        } else if (this.f10850 != -9223372036854775807L) {
            jM19475 = C7116.m19473(this.f10842, m10940());
        } else {
            jM19475 = C7116.m19473(this.f10842, m10941());
        }
        long jMax = Math.max(0L, jM19475 - this.f10864);
        if (this.f10850 == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(C7116.m19473(this.f10842, this.f10839), jMax);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10939() {
        this.f10843 = 0L;
        this.f10845 = 0;
        this.f10860 = 0;
        this.f10863 = 0L;
        this.f10835 = -9223372036854775807L;
        this.f10848 = -9223372036854775807L;
        this.f10856 = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private long m10941() {
        long j;
        if (this.f10850 != -9223372036854775807L) {
            return Math.min(this.f10839, m10940());
        }
        long jMo2210 = this.f10852.mo2210();
        if (jMo2210 - this.f10859 >= 5) {
            AudioTrack audioTrack = this.f10861;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f10851) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f10857 = this.f10844;
                    }
                    playbackHeadPosition += this.f10857;
                }
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.f10844;
                    if (j > playbackHeadPosition) {
                        if (this.f10833) {
                            this.f10838 += j;
                            this.f10833 = false;
                        } else {
                            this.f10834++;
                        }
                    }
                    this.f10844 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f10844 <= 0 || playState != 3) {
                    this.f10847 = -9223372036854775807L;
                    j = this.f10844;
                    if (j > playbackHeadPosition) {
                        if (this.f10833) {
                            this.f10838 += j;
                            this.f10833 = false;
                        } else {
                            this.f10834++;
                        }
                    }
                    this.f10844 = playbackHeadPosition;
                } else if (this.f10847 == -9223372036854775807L) {
                    this.f10847 = jMo2210;
                }
            }
            this.f10859 = jMo2210;
        }
        return this.f10844 + this.f10838 + (this.f10834 << 32);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private long m10940() {
        AudioTrack audioTrack = this.f10861;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f10841;
        }
        return this.f10841 + C7116.m19477(C7116.m19475(C7116.m19474(this.f10852.mo2210()) - this.f10850, this.f10846), this.f10842, 1000000L, RoundingMode.UP);
    }
}
