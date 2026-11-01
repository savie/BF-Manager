package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14746 implements InterfaceC11115 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f48227;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f48228;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f48229;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5853 f48230;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f48231;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f48232;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f48233;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f48234;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f48235;

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28034() {
        return false;
    }

    public C14746() {
        C5853 c5853 = new C5853();
        m35341("bufferForPlaybackMs", 1000, 0, "0");
        m35341("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        m35341("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        m35341("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        m35341("maxBufferMs", 50000, 50000, "minBufferMs");
        m35341("backBufferDurationMs", 0, 0, "0");
        this.f48230 = c5853;
        long j = 50000;
        this.f48227 = C17983.m41827(j);
        this.f48235 = C17983.m41827(j);
        this.f48228 = C17983.m41827(1000);
        this.f48232 = C17983.m41827(2000);
        this.f48233 = -1;
        this.f48234 = C17983.m41827(0);
        this.f48231 = new HashMap();
        this.f48229 = -1L;
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۙ */
    public final void mo28033(C9724 c9724) {
        long id = Thread.currentThread().getId();
        long j = this.f48229;
        C2023.m6509("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f48229 = id;
        HashMap map = this.f48231;
        if (!map.containsKey(c9724)) {
            map.put(c9724, new C23918(0));
        }
        C23918 c23918 = (C23918) map.get(c9724);
        c23918.getClass();
        int i = this.f48233;
        if (i == -1) {
            i = 13107200;
        }
        c23918.f77485 = i;
        c23918.f77484 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۙ */
    public final void mo28032(C6175 c6175, InterfaceC6558[] interfaceC6558Arr) {
        C9724 c9724 = c6175.f21041;
        HashMap map = this.f48231;
        C23918 c23918 = (C23918) map.get(c9724);
        c23918.getClass();
        int iMax = this.f48233;
        if (iMax == -1) {
            int length = interfaceC6558Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    InterfaceC6558 interfaceC6558 = interfaceC6558Arr[i];
                    if (interfaceC6558 != null) {
                        switch (interfaceC6558.mo37959().f54866) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        c23918.f77485 = iMax;
        boolean zIsEmpty = map.isEmpty();
        C5853 c5853 = this.f48230;
        if (zIsEmpty) {
            c5853.m16059();
        } else {
            c5853.m16061(m35342());
        }
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۨ */
    public final C5853 mo28036() {
        return this.f48230;
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ܰ */
    public final long mo28038() {
        return this.f48234;
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo28040(C6175 c6175) {
        C23918 c23918 = (C23918) this.f48231.get(c6175.f21041);
        c23918.getClass();
        boolean z = this.f48230.m16065() >= m35342();
        float f = c6175.f21042;
        long j = this.f48235;
        long jMin = this.f48227;
        if (f > 1.0f) {
            jMin = Math.min(C17983.m41828(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c6175.f21039;
        if (j2 < jMax) {
            c23918.f77484 = !z;
            if (z && j2 < 500000) {
                C0303.m1848("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c23918.f77484 = false;
        }
        return c23918.f77484;
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28035(C6175 c6175) {
        long jM41857 = C17983.m41857(c6175.f21039, c6175.f21042);
        long jMin = c6175.f21038 ? this.f48232 : this.f48228;
        long j = c6175.f21040;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jM41857 >= jMin || this.f48230.m16065() >= m35342();
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo28031() {
        Iterator it = this.f48231.values().iterator();
        while (it.hasNext()) {
            if (((C23918) it.next()).f77484) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m35342() {
        Iterator it = this.f48231.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C23918) it.next()).f77485;
        }
        return i;
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ۨ */
    public final void mo28037(C9724 c9724) {
        HashMap map = this.f48231;
        if (map.remove(c9724) != null) {
            boolean zIsEmpty = map.isEmpty();
            C5853 c5853 = this.f48230;
            if (zIsEmpty) {
                c5853.m16059();
            } else {
                c5853.m16061(m35342());
            }
        }
    }

    @Override // l.InterfaceC11115
    /* JADX INFO: renamed from: ܰ */
    public final void mo28039(C9724 c9724) {
        HashMap map = this.f48231;
        if (map.remove(c9724) != null) {
            boolean zIsEmpty = map.isEmpty();
            C5853 c5853 = this.f48230;
            if (zIsEmpty) {
                c5853.m16059();
            } else {
                c5853.m16061(m35342());
            }
        }
        if (map.isEmpty()) {
            this.f48229 = -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35341(String str, int i, int i2, String str2) {
        C2023.m6506(str + " cannot be less than " + str2, i >= i2);
    }
}
