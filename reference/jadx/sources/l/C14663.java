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

/* JADX INFO: renamed from: l.ܳܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14663 implements InterfaceC10430 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f47929;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7648 f47930;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f47933;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7648 f47936;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23835 f47937;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f47938;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C23835 f47939;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15100 f47940;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17484 f47942;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47944;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f47945;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47947;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f47949;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f47950;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public PlaybackMetrics.Builder f47951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final PlaybackSession f47952;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23835 f47953;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47954;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Context f47955;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7648 f47956;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Executor f47941 = C13672.m33379();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0282 f47935 = new C0282();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20039 f47946 = new C20039();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f47931 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f47934 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f47948 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47932 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f47943 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14663 m35179(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C14663(context, mediaMetricsManager.createPlaybackSession());
    }

    public C14663(Context context, PlaybackSession playbackSession) {
        this.f47955 = context.getApplicationContext();
        this.f47952 = playbackSession;
        C17484 c17484 = new C17484();
        this.f47942 = c17484;
        c17484.m40685(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LogSessionId m35189() {
        return this.f47952.getSessionId();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35190(C19602 c19602, String str) {
        C15274 c15274 = c19602.f62947;
        if (c15274 == null || !c15274.m36576()) {
            m35188();
            this.f47933 = str;
            this.f47951 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            m35186(c19602.f62945, c15274);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m35191(C19602 c19602, String str) {
        C15274 c15274 = c19602.f62947;
        if ((c15274 == null || !c15274.m36576()) && str.equals(this.f47933)) {
            m35188();
        }
        this.f47934.remove(str);
        this.f47931.remove(str);
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26343(int i) {
        if (i == 1) {
            this.f47938 = true;
        }
        this.f47945 = i;
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26345(C12629 c12629) {
        this.f47954 += c12629.f42203;
        this.f47929 += c12629.f42204;
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26349(C19602 c19602, int i, long j) {
        C15274 c15274 = c19602.f62947;
        if (c15274 != null) {
            String strM40684 = this.f47942.m40684(c19602.f62945, c15274);
            HashMap map = this.f47931;
            Long l2 = (Long) map.get(strM40684);
            HashMap map2 = this.f47934;
            Long l3 = (Long) map2.get(strM40684);
            map.put(strM40684, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strM40684, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26350(C19602 c19602, C13157 c13157) {
        C15274 c15274 = c19602.f62947;
        if (c15274 == null) {
            return;
        }
        C7648 c7648 = c13157.f43803;
        c7648.getClass();
        int i = c13157.f43808;
        AbstractC16511 abstractC16511 = c19602.f62945;
        c15274.getClass();
        C23835 c23835 = new C23835(c7648, i, this.f47942.m40684(abstractC16511, c15274));
        int i2 = c13157.f43802;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f47939 = c23835;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f47937 = c23835;
                return;
            }
        }
        this.f47953 = c23835;
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26347(C13314 c13314) {
        C23835 c23835 = this.f47953;
        if (c23835 != null) {
            C7648 c7648 = c23835.f77033;
            if (c7648.f25253 == -1) {
                C10471 c10471M20201 = c7648.m20201();
                c10471M20201.m26525(c13314.f44194);
                c10471M20201.m26534(c13314.f44193);
                this.f47953 = new C23835(c10471M20201.m26497(), c23835.f77035, c23835.f77034);
            }
        }
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26346(C13157 c13157) {
        this.f47950 = c13157.f43804;
    }

    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26348(C15100 c15100) {
        this.f47940 = c15100;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:337:0x0524  */
    /* JADX WARN: Code duplicated, block: B:340:0x054d  */
    /* JADX WARN: Code duplicated, block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, l.۟ᩴۙ] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v1 */
    @Override // l.InterfaceC10430
    /* JADX INFO: renamed from: ۙ */
    public final void mo26344(InterfaceC10161 interfaceC10161, C9019 c9019) {
        C17484 c17484;
        int i;
        boolean z;
        C17484 c17485;
        C11135 c11135;
        int i2;
        C11135 c11136;
        C11135 c11137;
        int i3;
        int i4;
        C7648 c7648;
        int i5;
        boolean z2;
        C9019 c90110;
        int i6;
        boolean z3;
        int i7;
        C8354 c8354;
        int i8;
        if (c9019.m23347() == 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            int iM23347 = c9019.m23347();
            c17484 = this.f47942;
            if (i9 >= iM23347) {
                break;
            }
            int iM23350 = c9019.m23350(i9);
            C19602 c19602M23349 = c9019.m23349(iM23350);
            if (iM23350 == 0) {
                c17484.m40688(c19602M23349);
            } else if (iM23350 == 11) {
                c17484.m40687(c19602M23349, this.f47945);
            } else {
                c17484.m40689(c19602M23349);
            }
            i9++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c9019.m23348(0)) {
            C19602 c19602M233410 = c9019.m23349(0);
            if (this.f47951 != null) {
                m35186(c19602M233410.f62945, c19602M233410.f62947);
            }
        }
        if (c9019.m23348(2) && this.f47951 != null) {
            AbstractC16706 abstractC16706ListIterator = interfaceC10161.mo25847().m24212().listIterator(0);
            loop1: while (true) {
                if (!abstractC16706ListIterator.hasNext()) {
                    c8354 = null;
                    break;
                }
                C1693 c1693 = (C1693) abstractC16706ListIterator.next();
                for (int i10 = 0; i10 < c1693.f6705; i10++) {
                    if (c1693.m5619(i10) && (c8354 = c1693.m5614(i10).f25271) != null) {
                        break loop1;
                    }
                }
            }
            if (c8354 != null) {
                PlaybackMetrics.Builder builder = this.f47951;
                int i11 = 0;
                while (true) {
                    if (i11 >= c8354.f28972) {
                        i8 = 1;
                        break;
                    }
                    UUID uuid = c8354.m21876(i11).f61263;
                    if (uuid.equals(C1297.f5562)) {
                        i8 = 3;
                        break;
                    } else if (uuid.equals(C1297.f5563)) {
                        i8 = 2;
                        break;
                    } else {
                        if (uuid.equals(C1297.f5561)) {
                            i8 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i8);
            }
        }
        if (c9019.m23348(1011)) {
            this.f47944++;
        }
        C15100 c15100 = this.f47940;
        Context context = this.f47955;
        Executor executor = this.f47941;
        long j = this.f47948;
        if (c15100 == null) {
            i4 = 1;
            c17485 = c17484;
        } else {
            int i12 = c15100.f49319;
            boolean z4 = this.f47950 == 4;
            if (i12 == 1001) {
                c11135 = new C11135(20, 0);
                c17485 = c17484;
            } else {
                if (c15100 instanceof C2170) {
                    C2170 c2170 = (C2170) c15100;
                    z = c2170.f7882 == 1;
                    i = c2170.f7881;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = c15100.getCause();
                cause.getClass();
                c17485 = c17484;
                if (cause instanceof IOException) {
                    if (cause instanceof C1360) {
                        c11137 = new C11135(5, ((C1360) cause).f5709);
                        c11135 = c11137;
                    } else if ((cause instanceof C22528) || (cause instanceof C22861)) {
                        c11135 = new C11135(z4 ? 10 : 11, 0);
                    } else {
                        boolean z5 = cause instanceof C5594;
                        if (z5 || (cause instanceof C9123)) {
                            if (C13751.m33494(context).m33498() == 1) {
                                c11135 = new C11135(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c11135 = new C11135(6, 0);
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    c11135 = new C11135(7, 0);
                                } else if (z5 && ((C5594) cause).f19202 == 1) {
                                    c11135 = new C11135(4, 0);
                                } else {
                                    c11135 = new C11135(8, 0);
                                }
                            }
                        } else if (i12 == 1002) {
                            c11135 = new C11135(21, 0);
                        } else if (cause instanceof C8501) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iM41821 = C17983.m41821(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (C17983.m41807(iM41821)) {
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
                                c11136 = new C11135(i3, iM41821);
                                c11135 = c11136;
                            } else if (C16523.m38892(cause3)) {
                                c11135 = new C11135(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c11135 = new C11135(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c11135 = new C11135(29, 0);
                            } else if (cause3 instanceof C3995) {
                                c11135 = new C11135(23, 0);
                            } else if (cause3 instanceof C22612) {
                                c11135 = new C11135(28, 0);
                            } else {
                                c11135 = new C11135(30, 0);
                            }
                        } else if ((cause instanceof C14062) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                c11135 = new C11135(32, 0);
                            } else {
                                c11135 = new C11135(31, 0);
                            }
                        } else {
                            c11135 = new C11135(9, 0);
                        }
                    }
                } else if (z && (i == 0 || i == 1)) {
                    c11135 = new C11135(35, 0);
                } else if (z && i == 3) {
                    c11135 = new C11135(15, 0);
                } else if (z && i == 2) {
                    c11135 = new C11135(23, 0);
                } else {
                    if (cause instanceof C3664) {
                        c11137 = new C11135(13, C17983.m41821(((C3664) cause).f13411));
                    } else {
                        if (cause instanceof C2253) {
                            c11136 = new C11135(14, ((C2253) cause).f8056);
                        } else if (cause instanceof OutOfMemoryError) {
                            c11135 = new C11135(14, 0);
                        } else if (cause instanceof C20682) {
                            c11137 = new C11135(17, ((C20682) cause).f67271);
                        } else if (cause instanceof C0220) {
                            c11137 = new C11135(18, ((C0220) cause).f1399);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (C17983.m41807(errorCode)) {
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
                            c11136 = new C11135(i2, errorCode);
                        } else {
                            c11135 = new C11135(22, 0);
                        }
                        c11135 = c11136;
                    }
                    c11135 = c11137;
                }
            }
            executor.execute(new RunnableC6195(0, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(c11135.f37785).setSubErrorCode(c11135.f37786).setException(c15100).build()));
            i4 = 1;
            this.f47947 = true;
            this.f47940 = null;
        }
        if (c9019.m23348(2)) {
            C9456 c9456Mo25847 = interfaceC10161.mo25847();
            boolean zM24216 = c9456Mo25847.m24216(2);
            boolean zM24217 = c9456Mo25847.m24216(i4);
            boolean zM24218 = c9456Mo25847.m24216(3);
            if (zM24216 || zM24217 || zM24218) {
                if (zM24216) {
                    c7648 = 0;
                } else {
                    if (!C13638.equals(this.f47956, null)) {
                        int i13 = this.f47956 == null ? 1 : 0;
                        this.f47956 = null;
                        m35180(1, jElapsedRealtime, null, i13);
                    }
                    c7648 = 0;
                }
                if (!zM24217 && !C13638.equals(this.f47930, c7648)) {
                    int i14 = this.f47930 == null ? 1 : 0;
                    this.f47930 = c7648;
                    m35180(0, jElapsedRealtime, c7648, i14);
                }
                if (!zM24218 && !C13638.equals(this.f47936, c7648)) {
                    int i15 = this.f47936 == null ? 1 : 0;
                    this.f47936 = c7648;
                    m35180(2, jElapsedRealtime, c7648, i15);
                }
            } else {
                c7648 = 0;
            }
        } else {
            c7648 = 0;
        }
        if (m35187(this.f47953)) {
            C23835 c23835 = this.f47953;
            C7648 c7649 = c23835.f77033;
            if (c7649.f25253 != -1) {
                int i16 = c23835.f77035;
                if (!C13638.equals(this.f47956, c7649)) {
                    int i17 = (this.f47956 == null && i16 == 0) ? 1 : i16;
                    this.f47956 = c7649;
                    m35180(1, jElapsedRealtime, c7649, i17);
                }
                this.f47953 = c7648;
            }
        }
        if (m35187(this.f47939)) {
            C23835 c23836 = this.f47939;
            C7648 c76410 = c23836.f77033;
            int i18 = c23836.f77035;
            if (!C13638.equals(this.f47930, c76410)) {
                int i19 = (this.f47930 == null && i18 == 0) ? 1 : i18;
                this.f47930 = c76410;
                m35180(0, jElapsedRealtime, c76410, i19);
            }
            this.f47939 = c7648;
        }
        if (m35187(this.f47937)) {
            C23835 c23837 = this.f47937;
            C7648 c76411 = c23837.f77033;
            int i20 = c23837.f77035;
            if (!C13638.equals(this.f47936, c76411)) {
                int i21 = (this.f47936 == null && i20 == 0) ? 1 : i20;
                this.f47936 = c76411;
                m35180(2, jElapsedRealtime, c76411, i21);
            }
            this.f47937 = c7648;
        }
        switch (C13751.m33494(context).m33498()) {
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
        if (i5 != this.f47943) {
            this.f47943 = i5;
            executor.execute(new RunnableC3870(1, this, new NetworkEvent.Builder().setNetworkType(i5).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (interfaceC10161.mo25808() != 2) {
            z2 = false;
            this.f47938 = false;
        } else {
            z2 = false;
        }
        if (interfaceC10161.mo25852() == null) {
            this.f47949 = z2;
            c90110 = c9019;
        } else {
            c90110 = c9019;
            if (c90110.m23348(10)) {
                this.f47949 = true;
            }
        }
        int iMo25808 = interfaceC10161.mo25808();
        if (this.f47938) {
            i7 = 5;
        } else if (this.f47949) {
            i7 = 13;
        } else if (iMo25808 == 4) {
            i7 = 11;
        } else {
            if (iMo25808 != 2) {
                if (iMo25808 == 3) {
                    if (interfaceC10161.mo25806()) {
                        i7 = interfaceC10161.mo25849() != 0 ? 9 : 3;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i6 = (iMo25808 != 1 || this.f47932 == 0) ? this.f47932 : 12;
                    z3 = true;
                }
                if (this.f47932 != i6) {
                    this.f47932 = i6;
                    this.f47947 = z3;
                    executor.execute(new RunnableC7979(1, this, new PlaybackStateEvent.Builder().setState(this.f47932).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
                }
                if (c90110.m23348(1028)) {
                    c17485.m40686(c90110.m23349(1028));
                }
            }
            int i22 = this.f47932;
            if (i22 == 0 || i22 == 2 || i22 == 12) {
                i7 = 2;
            } else if (interfaceC10161.mo25806()) {
                i7 = interfaceC10161.mo25849() != 0 ? 10 : 6;
            } else {
                i7 = 7;
            }
        }
        z3 = true;
        i6 = i7;
        if (this.f47932 != i6) {
            this.f47932 = i6;
            this.f47947 = z3;
            executor.execute(new RunnableC7979(1, this, new PlaybackStateEvent.Builder().setState(this.f47932).setTimeSinceCreatedMillis(jElapsedRealtime - j).build()));
        }
        if (c90110.m23348(1028)) {
            c17485.m40686(c90110.m23349(1028));
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m35187(C23835 c23835) {
        return c23835 != null && c23835.f77034.equals(this.f47942.m40683());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35180(int i, long j, C7648 c7648, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f47948);
        int i4 = 1;
        if (c7648 != null) {
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
            String str = c7648.f25262;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c7648.f25265;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c7648.f25277;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c7648.f25242;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c7648.f25246;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c7648.f25253;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c7648.f25249;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c7648.f25260;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c7648.f25269;
            if (str4 != null) {
                String str5 = C17983.f57504;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c7648.f25273;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f47947 = true;
        this.f47941.execute(new RunnableC9395(i4, this, timeSinceCreatedMillis.build()));
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35186(AbstractC16511 abstractC16511, C15274 c15274) {
        int iMo14959;
        PlaybackMetrics.Builder builder = this.f47951;
        if (c15274 == null || (iMo14959 = abstractC16511.mo14959(c15274.f49778)) == -1) {
            return;
        }
        C20039 c20039 = this.f47946;
        int i = 0;
        abstractC16511.mo5920(iMo14959, c20039, false);
        int i2 = c20039.f64168;
        C0282 c0282 = this.f47935;
        abstractC16511.m38827(i2, c0282);
        C14704 c14704 = c0282.f1594.f45157;
        if (c14704 != null) {
            int iM41819 = C17983.m41819(c14704.f48029, c14704.f48033);
            if (iM41819 == 0) {
                i = 3;
            } else if (iM41819 != 1) {
                i = iM41819 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (c0282.f1588 != -9223372036854775807L && !c0282.f1593 && !c0282.f1583 && !c0282.m1798()) {
            builder.setMediaDurationMillis(C17983.m41856(c0282.f1588));
        }
        builder.setPlaybackType(c0282.m1798() ? 2 : 1);
        this.f47947 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35188() {
        PlaybackMetrics.Builder builder = this.f47951;
        if (builder != null && this.f47947) {
            builder.setAudioUnderrunCount(this.f47944);
            this.f47951.setVideoFramesDropped(this.f47954);
            this.f47951.setVideoFramesPlayed(this.f47929);
            Long l2 = (Long) this.f47934.get(this.f47933);
            this.f47951.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f47931.get(this.f47933);
            this.f47951.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f47951.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f47941.execute(new RunnableC21795(1, this, this.f47951.build()));
        }
        this.f47951 = null;
        this.f47933 = null;
        this.f47944 = 0;
        this.f47954 = 0;
        this.f47929 = 0;
        this.f47956 = null;
        this.f47930 = null;
        this.f47936 = null;
        this.f47947 = false;
    }
}
