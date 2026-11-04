package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20804 implements InterfaceC23175 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66621;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17789 f66622;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f66623;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f66624;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f66625;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f66626;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f66627;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f66628;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f66629;

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo47588() {
        return false;
    }

    public C20804() {
        C17789 c17789 = new C17789();
        m47585("bufferForPlaybackMs", 1000, 0, "0");
        m47585("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        m47585("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        m47585("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        m47585("maxBufferMs", 50000, 50000, "minBufferMs");
        m47585("backBufferDurationMs", 0, 0, "0");
        this.f66622 = c17789;
        long j = 50000;
        this.f66625 = C7116.m19474(j);
        this.f66626 = C7116.m19474(j);
        this.f66629 = C7116.m19474(1000);
        this.f66624 = C7116.m19474(2000);
        this.f66623 = -1;
        this.f66628 = C7116.m19474(0);
        this.f66627 = new HashMap();
        this.f66621 = -1L;
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo47587(C20738 c20738) {
        long id = Thread.currentThread().getId();
        long j = this.f66621;
        C20782.m47567("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f66621 = id;
        HashMap map = this.f66627;
        if (!map.containsKey(c20738)) {
            map.put(c20738, new C3650(0));
        }
        C3650 c3650 = (C3650) map.get(c20738);
        c3650.getClass();
        int i = this.f66623;
        if (i == -1) {
            i = 13107200;
        }
        c3650.f12482 = i;
        c3650.f12481 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo47586(C15715 c15715, InterfaceC1470[] interfaceC1470Arr) {
        C20738 c20738 = c15715.f51046;
        HashMap map = this.f66627;
        C3650 c3650 = (C3650) map.get(c20738);
        c3650.getClass();
        int iMax = this.f66623;
        if (iMax == -1) {
            int length = interfaceC1470Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    InterfaceC1470 interfaceC1470 = interfaceC1470Arr[i];
                    if (interfaceC1470 != null) {
                        switch (interfaceC1470.mo17236().f53565) {
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
        c3650.f12482 = iMax;
        boolean zIsEmpty = map.isEmpty();
        C17789 c17789 = this.f66622;
        if (zIsEmpty) {
            c17789.m41636();
        } else {
            c17789.m41630(m47592());
        }
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17789 mo47590() {
        return this.f66622;
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo47593() {
        return this.f66628;
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo47595(C15715 c15715) {
        C3650 c3650 = (C3650) this.f66627.get(c15715.f51046);
        c3650.getClass();
        boolean z = this.f66622.m41633() >= m47592();
        float f = c15715.f51048;
        long j = this.f66626;
        long jMin = this.f66625;
        if (f > 1.0f) {
            jMin = Math.min(C7116.m19475(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c15715.f51045;
        if (j2 < jMax) {
            c3650.f12481 = !z;
            if (z && j2 < 500000) {
                C1896.m6517("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c3650.f12481 = false;
        }
        return c3650.f12481;
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo47589(C15715 c15715) {
        long jM19507 = C7116.m19507(c15715.f51045, c15715.f51048);
        long jMin = c15715.f51049 ? this.f66624 : this.f66629;
        long j = c15715.f51047;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jM19507 >= jMin || this.f66622.m41633() >= m47592();
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo47596() {
        Iterator it = this.f66627.values().iterator();
        while (it.hasNext()) {
            if (((C3650) it.next()).f12481) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m47592() {
        Iterator it = this.f66627.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C3650) it.next()).f12482;
        }
        return i;
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo47591(C20738 c20738) {
        HashMap map = this.f66627;
        if (map.remove(c20738) != null) {
            boolean zIsEmpty = map.isEmpty();
            C17789 c17789 = this.f66622;
            if (zIsEmpty) {
                c17789.m41636();
            } else {
                c17789.m41630(m47592());
            }
        }
    }

    @Override // l.InterfaceC23175
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo47594(C20738 c20738) {
        HashMap map = this.f66627;
        if (map.remove(c20738) != null) {
            boolean zIsEmpty = map.isEmpty();
            C17789 c17789 = this.f66622;
            if (zIsEmpty) {
                c17789.m41636();
            } else {
                c17789.m41630(m47592());
            }
        }
        if (map.isEmpty()) {
            this.f66621 = -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47585(String str, int i, int i2, String str2) {
        C20782.m47564(str + " cannot be less than " + str2, i >= i2);
    }
}
