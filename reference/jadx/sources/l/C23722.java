package l;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩹ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23722 implements InterfaceC19992 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f76883;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f76885;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16262 f76886;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f76887;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C8936 f76889;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17008 f76890;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15648 f76893;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C16262 f76894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15648 f76895;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Context f76897;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f76898;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76899;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76900;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76901;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public PlaybackMetrics.Builder f76904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final PlaybackSession f76905;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76906;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76908;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16262 f76909;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15648 f76910;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Executor f76892 = C15300.m36732();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11328 f76891 = new C11328();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1634 f76896 = new C1634();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f76907 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f76903 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f76902 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f76884 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76888 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23722 m52981(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C23722(context, mediaMetricsManager.createPlaybackSession());
    }

    public C23722(Context context, PlaybackSession playbackSession) {
        this.f76897 = context.getApplicationContext();
        this.f76905 = playbackSession;
        C17008 c17008 = new C17008();
        this.f76890 = c17008;
        c17008.m40106(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LogSessionId m52991() {
        return this.f76905.getSessionId();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52992(C11041 c11041, String str) {
        C8402 c8402 = c11041.f34850;
        if (c8402 == null || !c8402.m22581()) {
            m52990();
            this.f76887 = str;
            this.f76904 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            m52988(c11041.f34846, c8402);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52993(C11041 c11041, String str) {
        C8402 c8402 = c11041.f34850;
        if ((c8402 == null || !c8402.m22581()) && str.equals(this.f76887)) {
            m52990();
        }
        this.f76903.remove(str);
        this.f76907.remove(str);
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45981(int i) {
        if (i == 1) {
            this.f76885 = true;
        }
        this.f76899 = i;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45986(C17074 c17074) {
        this.f76900 += c17074.f55747;
        this.f76901 += c17074.f55746;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45984(C11041 c11041, int i, long j) {
        C8402 c8402 = c11041.f34850;
        if (c8402 != null) {
            String strM40103 = this.f76890.m40103(c11041.f34846, c8402);
            HashMap map = this.f76907;
            Long l2 = (Long) map.get(strM40103);
            HashMap map2 = this.f76903;
            Long l3 = (Long) map2.get(strM40103);
            map.put(strM40103, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strM40103, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45985(C11041 c11041, C9893 c9893) {
        C8402 c8402 = c11041.f34850;
        if (c8402 == null) {
            return;
        }
        C15648 c15648 = c9893.f31814;
        c15648.getClass();
        int i = c9893.f31811;
        AbstractC24755 abstractC24755 = c11041.f34846;
        c8402.getClass();
        C16262 c16262 = new C16262(c15648, i, this.f76890.m40103(abstractC24755, c8402));
        int i2 = c9893.f31810;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f76894 = c16262;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f76909 = c16262;
                return;
            }
        }
        this.f76886 = c16262;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45987(C18787 c18787) {
        C16262 c16262 = this.f76886;
        if (c16262 != null) {
            C15648 c15648 = c16262.f52846;
            if (c15648.f50852 == -1) {
                C20124 c20124M37397 = c15648.m37397();
                c20124M37397.m46291(c18787.f61012);
                c20124M37397.m46333(c18787.f61011);
                this.f76886 = new C16262(c20124M37397.m46295(), c16262.f52848, c16262.f52847);
            }
        }
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45983(C9893 c9893) {
        this.f76908 = c9893.f31808;
    }

    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45982(C8936 c8936) {
        this.f76889 = c8936;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:337:0x0524  */
    /* JADX WARN: Code duplicated, block: B:340:0x054d  */
    /* JADX WARN: Code duplicated, block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, l.ܳ᩹ۙ] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v1 */
    @Override // l.InterfaceC19992
    /* JADX INFO: renamed from: ۙ */
    public final void mo45988(InterfaceC19533 interfaceC19533, C22976 c22976) {
        C17008 c17008;
        int i;
        boolean z;
        C17008 c17009;
        C17754 c17754;
        int i2;
        C17754 c17755;
        C17754 c17756;
        int i3;
        int i4;
        C15648 c15648;
        int i5;
        boolean z2;
        C22976 c22977;
        int i6;
        boolean z3;
        int i7;
        C22362 c22362;
        int i8;
        if (c22976.m51849() == 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int iM51849 = c22976.m51849();
            c17008 = this.f76890;
            if (i9 >= iM51849) {
                break;
            }
            int iM51852 = c22976.m51852(i9);
            C11041 c11041M51851 = c22976.m51851(iM51852);
            if (iM51852 == 0) {
                c17008.m40107(c11041M51851);
            } else if (iM51852 == 11) {
                c17008.m40105(c11041M51851, this.f76899);
            } else {
                c17008.m40108(c11041M51851);
            }
            i9++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c22976.m51850(0)) {
            C11041 c11041M51852 = c22976.m51851(0);
            if (this.f76904 != null) {
                m52988(c11041M51852.f34846, c11041M51852.f34850);
            }
        }
        if (c22976.m51850(2) && this.f76904 != null) {
            AbstractC14956 abstractC14956ListIterator = interfaceC19533.mo23568().m30246().listIterator(0);
            loop1: while (true) {
                if (!abstractC14956ListIterator.hasNext()) {
                    c22362 = null;
                    break;
                }
                C20279 c20279 = (C20279) abstractC14956ListIterator.next();
                for (int i10 = 0; i10 < c20279.f65101; i10++) {
                    if (c20279.m46544(i10) && (c22362 = c20279.m46539(i10).f50838) != null) {
                        break loop1;
                    }
                }
            }
            if (c22362 != null) {
                PlaybackMetrics.Builder builder = this.f76904;
                int i11 = 0;
                while (true) {
                    if (i11 >= c22362.f72390) {
                        i8 = 1;
                        break;
                    }
                    UUID uuid = c22362.m50438(i11).f18371;
                    if (uuid.equals(C19158.f61988)) {
                        i8 = 3;
                        break;
                    } else if (uuid.equals(C19158.f61987)) {
                        i8 = 2;
                        break;
                    } else {
                        if (uuid.equals(C19158.f61986)) {
                            i8 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i8);
            }
        }
        if (c22976.m51850(1011)) {
            this.f76906++;
        }
        C8936 c8936 = this.f76889;
        Context context = this.f76897;
        Executor executor = this.f76892;
        long j = this.f76902;
        if (c8936 == null) {
            i4 = 1;
            c17009 = c17008;
        } else {
            int i12 = c8936.f29167;
            boolean z4 = this.f76908 == 4;
            if (i12 == 1001) {
                c17754 = new C17754(20, 0);
                c17009 = c17008;
            } else {
                if (c8936 instanceof C18566) {
                    C18566 c18566 = (C18566) c8936;
                    z = c18566.f60329 == 1;
                    i = c18566.f60332;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = c8936.getCause();
                cause.getClass();
                c17009 = c17008;
                if (cause instanceof IOException) {
                    if (cause instanceof C8213) {
                        c17756 = new C17754(5, ((C8213) cause).f27043);
                        c17754 = c17756;
                    } else if ((cause instanceof C0755) || (cause instanceof C2970)) {
                        c17754 = new C17754(z4 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof C18654;
                        if (z5 || (cause instanceof C21793)) {
                            if (C4133.m13254(context).m13258() == 1) {
                                c17754 = new C17754(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c17754 = new C17754(6, 0);
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    c17754 = new C17754(7, 0);
                                } else if (z5 && ((C18654) cause).f60659 == 1) {
                                    c17754 = new C17754(4, 0);
                                } else {
                                    c17754 = new C17754(8, 0);
                                }
                            }
                        } else if (i12 == 1002) {
                            c17754 = new C17754(21, 0);
                        } else if (cause instanceof C21945) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iM19468 = C7116.m19468(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (C7116.m19514(iM19468)) {
                                    case 6002:
                                        i3 = 24;
                                        break;
                                    case 6003:
                                        i3 = 28;
                                        break;
                                    case 6004:
                                        i3 = 25;
                                        break;
                                    case 6005:
                                        i3 = 26;
                                        break;
                                    default:
                                        i3 = 27;
                                        break;
                                }
                                c17755 = new C17754(i3, iM19468);
                                c17754 = c17755;
                            } else if (C21764.m49332(cause3)) {
                                c17754 = new C17754(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c17754 = new C17754(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c17754 = new C17754(29, 0);
                            } else if (cause3 instanceof C1062) {
                                c17754 = new C17754(23, 0);
                            } else if (cause3 instanceof C7534) {
                                c17754 = new C17754(28, 0);
                            } else {
                                c17754 = new C17754(30, 0);
                            }
                        } else if ((cause instanceof C4484) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                c17754 = new C17754(32, 0);
                            } else {
                                c17754 = new C17754(31, 0);
                            }
                        } else {
                            c17754 = new C17754(9, 0);
                        }
                    }
                } else if (z && (i == 0 || i == 1)) {
                    c17754 = new C17754(35, 0);
                } else if (z && i == 3) {
                    c17754 = new C17754(15, 0);
                } else if (z && i == 2) {
                    c17754 = new C17754(23, 0);
                } else {
                    if (cause instanceof C0997) {
                        c17756 = new C17754(13, C7116.m19468(((C0997) cause).f3602));
                    } else {
                        if (cause instanceof C18150) {
                            c17755 = new C17754(14, ((C18150) cause).f59349);
                        } else if (cause instanceof OutOfMemoryError) {
                            c17754 = new C17754(14, 0);
                        } else if (cause instanceof C5559) {
                            c17756 = new C17754(17, ((C5559) cause).f19302);
                        } else if (cause instanceof C24951) {
                            c17756 = new C17754(18, ((C24951) cause).f80779);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (C7116.m19514(errorCode)) {
                                case 6002:
                                    i2 = 24;
                                    break;
                                case 6003:
                                    i2 = 28;
                                    break;
                                case 6004:
                                    i2 = 25;
                                    break;
                                case 6005:
                                    i2 = 26;
                                    break;
                                default:
                                    i2 = 27;
                                    break;
                            }
                            c17755 = new C17754(i2, errorCode);
                        } else {
                            c17754 = new C17754(22, 0);
                        }
                        c17754 = c17755;
                    }
                    c17754 = c17756;
                }
            }
            executor.execute(new RunnableC19877(1, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(c17754.f58307).setSubErrorCode(c17754.f58308).setException(c8936).build()));
            i4 = 1;
            this.f76883 = true;
            this.f76889 = null;
        }
        if (c22976.m51850(2)) {
            C12074 c12074Mo23568 = interfaceC19533.mo23568();
            boolean zM30250 = c12074Mo23568.m30250(2);
            boolean zM30251 = c12074Mo23568.m30250(i4);
            boolean zM30252 = c12074Mo23568.m30250(3);
            if (zM30250 || zM30251 || zM30252) {
                if (zM30250) {
                    c15648 = 0;
                } else {
                    if (!C17359.equals(this.f76910, null)) {
                        int i13 = this.f76910 == null ? 1 : 0;
                        this.f76910 = null;
                        m52982(1, jElapsedRealtime, null, i13);
                    }
                    c15648 = 0;
                }
                if (!zM30251 && !C17359.equals(this.f76895, c15648)) {
                    int i14 = this.f76895 == null ? 1 : 0;
                    this.f76895 = c15648;
                    m52982(0, jElapsedRealtime, c15648, i14);
                }
                if (!zM30252 && !C17359.equals(this.f76893, c15648)) {
                    int i15 = this.f76893 == null ? 1 : 0;
                    this.f76893 = c15648;
                    m52982(2, jElapsedRealtime, c15648, i15);
                }
            } else {
                c15648 = 0;
            }
        } else {
            c15648 = 0;
        }
        if (m52989(this.f76886)) {
            C16262 c16262 = this.f76886;
            C15648 c15649 = c16262.f52846;
            if (c15649.f50852 != -1) {
                int i16 = c16262.f52848;
                if (!C17359.equals(this.f76910, c15649)) {
                    int i17 = (this.f76910 == null && i16 == 0) ? 1 : i16;
                    this.f76910 = c15649;
                    m52982(1, jElapsedRealtime, c15649, i17);
                }
                this.f76886 = c15648;
            }
        }
        if (m52989(this.f76894)) {
            C16262 c16263 = this.f76894;
            C15648 c156410 = c16263.f52846;
            int i18 = c16263.f52848;
            if (!C17359.equals(this.f76895, c156410)) {
                int i19 = (this.f76895 == null && i18 == 0) ? 1 : i18;
                this.f76895 = c156410;
                m52982(0, jElapsedRealtime, c156410, i19);
            }
            this.f76894 = c15648;
        }
        if (m52989(this.f76909)) {
            C16262 c16264 = this.f76909;
            C15648 c156411 = c16264.f52846;
            int i20 = c16264.f52848;
            if (!C17359.equals(this.f76893, c156411)) {
                int i21 = (this.f76893 == null && i20 == 0) ? 1 : i20;
                this.f76893 = c156411;
                m52982(2, jElapsedRealtime, c156411, i21);
            }
            this.f76909 = c15648;
        }
        switch (C4133.m13254(context).m13258()) {
            case 0:
                i5 = 0;
                break;
            case 1:
                i5 = 9;
                break;
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            case 5:
                i5 = 6;
                break;
            case 6:
            case 8:
            default:
                i5 = 1;
                break;
            case 7:
                i5 = 3;
                break;
            case 9:
                i5 = 8;
                break;
            case 10:
                i5 = 7;
                break;
        }
        if (i5 != this.f76888) {
            this.f76888 = i5;
            executor.execute(new RunnableC6235(1, this, new NetworkEvent.Builder().setNetworkType(i5).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (interfaceC19533.mo23580() != 2) {
            z2 = false;
            this.f76885 = false;
        } else {
            z2 = false;
        }
        if (interfaceC19533.mo23569() == null) {
            this.f76898 = z2;
            c22977 = c22976;
        } else {
            c22977 = c22976;
            if (c22977.m51850(10)) {
                this.f76898 = true;
            }
        }
        int iMo23580 = interfaceC19533.mo23580();
        if (this.f76885) {
            i7 = 5;
        } else if (this.f76898) {
            i7 = 13;
        } else if (iMo23580 == 4) {
            i7 = 11;
        } else {
            if (iMo23580 != 2) {
                if (iMo23580 == 3) {
                    if (interfaceC19533.mo23570()) {
                        i7 = interfaceC19533.mo23572() != 0 ? 9 : 3;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i6 = (iMo23580 != 1 || this.f76884 == 0) ? this.f76884 : 12;
                    z3 = true;
                }
                if (this.f76884 != i6) {
                    this.f76884 = i6;
                    this.f76883 = z3;
                    executor.execute(new RunnableC8296(1, this, new PlaybackStateEvent.Builder().setState(this.f76884).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
                }
                if (c22977.m51850(1028)) {
                    c17009.m40104(c22977.m51851(1028));
                }
            }
            int i22 = this.f76884;
            if (i22 == 0 || i22 == 2 || i22 == 12) {
                i7 = 2;
            } else if (interfaceC19533.mo23570()) {
                i7 = interfaceC19533.mo23572() != 0 ? 10 : 6;
            } else {
                i7 = 7;
            }
        }
        z3 = true;
        i6 = i7;
        if (this.f76884 != i6) {
            this.f76884 = i6;
            this.f76883 = z3;
            executor.execute(new RunnableC8296(1, this, new PlaybackStateEvent.Builder().setState(this.f76884).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (c22977.m51850(1028)) {
            c17009.m40104(c22977.m51851(1028));
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52989(C16262 c16262) {
        return c16262 != null && c16262.f52847.equals(this.f76890.m40102());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52982(int i, long j, C15648 c15648, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f76902);
        final int i4 = 1;
        if (c15648 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c15648.f50820;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c15648.f50848;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c15648.f50836;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c15648.f50849;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c15648.f50814;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c15648.f50852;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c15648.f50843;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c15648.f50829;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c15648.f50811;
            if (str4 != null) {
                String str5 = C7116.f23455;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c15648.f50845;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f76883 = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f76892.execute(new Runnable() { // from class: l.ۧۨܳ
            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        C8614.m23135((C8614) this, (C8614) trackChangeEventBuild);
                        break;
                    default:
                        ((C23722) this).f76905.reportTrackChangeEvent((TrackChangeEvent) trackChangeEventBuild);
                        break;
                }
            }
        });
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52988(AbstractC24755 abstractC24755, C8402 c8402) {
        int iMo1588;
        PlaybackMetrics.Builder builder = this.f76904;
        if (c8402 == null || (iMo1588 = abstractC24755.mo1588(c8402.f27520)) == -1) {
            return;
        }
        C1634 c1634 = this.f76896;
        int i = 0;
        abstractC24755.mo1591(iMo1588, c1634, false);
        int i2 = c1634.f5657;
        C11328 c11328 = this.f76891;
        abstractC24755.m55263(i2, c11328);
        C20870 c20870 = c11328.f35699.f48681;
        if (c20870 != null) {
            int iM19466 = C7116.m19466(c20870.f66802, c20870.f66801);
            if (iM19466 == 0) {
                i = 3;
            } else if (iM19466 != 1) {
                i = iM19466 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (c11328.f35696 != -9223372036854775807L && !c11328.f35691 && !c11328.f35695 && !c11328.m28620()) {
            builder.setMediaDurationMillis(C7116.m19506(c11328.f35696));
        }
        builder.setPlaybackType(c11328.m28620() ? 2 : 1);
        this.f76883 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52990() {
        PlaybackMetrics.Builder builder = this.f76904;
        if (builder != null && this.f76883) {
            builder.setAudioUnderrunCount(this.f76906);
            this.f76904.setVideoFramesDropped(this.f76900);
            this.f76904.setVideoFramesPlayed(this.f76901);
            Long l2 = (Long) this.f76903.get(this.f76887);
            this.f76904.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f76907.get(this.f76887);
            this.f76904.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f76904.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f76892.execute(new RunnableC18945(1, this, this.f76904.build()));
        }
        this.f76904 = null;
        this.f76887 = null;
        this.f76906 = 0;
        this.f76900 = 0;
        this.f76901 = 0;
        this.f76910 = null;
        this.f76895 = null;
        this.f76893 = null;
        this.f76883 = false;
    }
}
