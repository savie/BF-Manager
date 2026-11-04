package l;

import com.alipay.sdk.m.y.o;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2783 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C24413 f9166;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10240 f9167 = new C10240();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10262 f9168;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18467 f9169;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9494 f9170;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19191 f9171;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24132 f9172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9178(int i, int i2, int i3, int i4) {
        return i >= 0 && i <= i3 && i4 <= i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m9180(C3551 c3551) {
        C4999 c4999;
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        C20661 c20661M54614 = this.f9166.m54614();
        if (c3551.m11575()) {
            C3025 c3025 = c3551.f12176;
            if (c3025.f9815 == interfaceC19106M54021 && c3025.f9812 == c20661M54614 && c20661M54614.m47282()) {
                int i = c3551.f12173;
                C10240 c10240 = this.f9167;
                if (i == c10240.f32720 && !c10240.f32712) {
                    C4999 c49910 = c10240.f32713;
                    if (c49910 == null || !c49910.m15226(interfaceC19106M54021, c20661M54614, interfaceC19106M54021.mo15344(), interfaceC19106M54021.length())) {
                        int iMo15344 = interfaceC19106M54021.mo15344();
                        int length = interfaceC19106M54021.length();
                        C23667 c23667 = c3551.f12174;
                        c4999 = new C4999(interfaceC19106M54021, c20661M54614, iMo15344, length, c23667, c23667);
                    } else {
                        C23667 c23668 = c49910.f17359;
                        C23667 c23669 = c3551.f12174;
                        if (c23668 == c23669) {
                            return true;
                        }
                        c4999 = c49910.m15225(c23669);
                    }
                    C10240 c10241 = this.f9167;
                    c10241.f32713 = c4999.m15223(c10241.f32721);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m9193(InterfaceC9629 interfaceC9629) {
        C6711 c6711;
        m9184();
        if (!this.f9167.f32718) {
            return false;
        }
        if (m9181(interfaceC9629, interfaceC9629.mo15344()) && this.f9166.m54613() != null) {
            m9209();
            RunnableC8004 runnableC8004M9155 = m9155(interfaceC9629, interfaceC9629.mo15344(), this.f9171.f62059);
            C19191 c19191 = this.f9171;
            c19191.f62058 = true;
            c19191.f62066 = runnableC8004M9155;
            this.f9172.post(runnableC8004M9155);
            return true;
        }
        if (m9153(interfaceC9629)) {
            return false;
        }
        if (this.f9170.f30763 != null) {
            m9201();
        }
        if (m9210(interfaceC9629)) {
            m9204(interfaceC9629, false);
        } else if (m9207((CharSequence) interfaceC9629)) {
            if (!m9194(interfaceC9629)) {
                return false;
            }
            if (this.f9170.f30757 && m9187(interfaceC9629)) {
                int i = m9195(interfaceC9629) ? this.f9170.f30762 : this.f9170.f30758;
                int i2 = m9195(interfaceC9629) ? this.f9170.f30746 : this.f9170.f30751;
                m9152();
                m9171(interfaceC9629, i, i2, false);
            } else if (!m9187(interfaceC9629) && !m9197()) {
                if (m9195(interfaceC9629)) {
                    C6711 c6712 = this.f9167.f32721;
                    if (c6712 != null) {
                        C9494 c9494 = this.f9170;
                        if (c6712.m18741(c9494.f30762, c9494.f30746)) {
                            if (!m9195(interfaceC9629)) {
                                C9494 c9495 = this.f9170;
                                c9495.f30762 = -1;
                                c9495.f30746 = -1;
                                c9495.f30754 = 0;
                                c9495.f30743 = 0;
                                c9495.f30759 = null;
                                c6711 = this.f9167.f32721;
                                if (c6711 != null) {
                                    m9188(interfaceC9629, this.f9167.f32721.m18746(), this.f9167.f32721.m18738());
                                }
                            }
                        }
                    }
                    C9494 c9496 = this.f9170;
                    m9171(interfaceC9629, c9496.f30762, c9496.f30746, false);
                } else if (!m9195(interfaceC9629)) {
                    C9494 c9497 = this.f9170;
                    c9497.f30762 = -1;
                    c9497.f30746 = -1;
                    c9497.f30754 = 0;
                    c9497.f30743 = 0;
                    c9497.f30759 = null;
                    c6711 = this.f9167.f32721;
                    if (c6711 != null && c6711.m18743()) {
                        m9188(interfaceC9629, this.f9167.f32721.m18746(), this.f9167.f32721.m18738());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized void m9205(C16800 c16800) {
        m9177(true, false, false);
        this.f9167.f32718 = false;
        this.f9166 = C24413.m54612(c16800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9213() {
        if (this.f9170.f30761 != null) {
            m9177(false, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9215(C6178 c6178) {
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        C20881 c20881 = m9181(interfaceC19106M54021, interfaceC19106M54021.mo15344()) ? this.f9171.f62059 : null;
        C24413 c24413 = this.f9166;
        C1270 c1270 = this.f9167.f32711;
        C10240 c10240 = this.f9167;
        C8246 c8246 = c10240.f32714;
        boolean z = c10240.f32718;
        C10240 c10241 = this.f9167;
        C11008.m27867(c6178, c24413, c1270, c8246, z, c10241.f32712, c10241.f32721, c20881);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9219(int i, int i2) {
        C10240 c10240;
        C6711 c6711;
        c10240 = this.f9167;
        return c10240.f32712 || ((c6711 = c10240.f32721) != null && c6711.m18741(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9223(C20348 c20348, int i) {
        m9177(true, false, false);
        this.f9167.f32718 = false;
        C13969 c13969M27863 = C11008.m27863(i, this.f9172.m54021().length(), c20348);
        this.f9166 = c13969M27863.m34048();
        m9159(c13969M27863.m34049(), c13969M27863.m34043(), c13969M27863.m34046(), c13969M27863.m34047(), false);
        this.f9167.f32718 = c13969M27863.m34045();
        C20881 c20881M34044 = c13969M27863.m34044();
        if (this.f9167.f32718 && c20881M34044 != null) {
            InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
            m9209();
            m9189();
            C19191 c19191 = this.f9171;
            c19191.f62059 = c20881M34044;
            c19191.f62061 = true;
            c19191.f62067 = interfaceC19106M54021.mo15344();
            c19191.f62062 = interfaceC19106M54021.length();
            c19191.f62065 = interfaceC19106M54021;
            c19191.f62057 = false;
            c19191.f62058 = false;
        } else if (this.f9167.f32718 && c13969M27863.m34047() != null) {
            m9172(this.f9172.m54021(), c13969M27863.m34047());
        }
        return this.f9167.f32718;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9225() {
        m9205((C16800) null);
        this.f9167.f32718 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9230() {
        m9177(true, false, false);
        this.f9167.f32719 = null;
        this.f9167.f32717 = null;
        this.f9167.f32716 = null;
        this.f9167.f32718 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized void m9232(InterfaceC9629 interfaceC9629) {
        if (this.f9167.f32718 && this.f9172.isAttachedToWindow() && this.f9172.m53945() && !this.f9172.m53976()) {
            if (m9186((CharSequence) interfaceC9629)) {
                if (this.f9170.f30761 != interfaceC9629) {
                    m9204(interfaceC9629, true);
                }
            } else if (m9207((CharSequence) interfaceC9629) && m9195(interfaceC9629)) {
                C9494 c9494 = this.f9170;
                m9171(interfaceC9629, c9494.f30762, c9494.f30746, true);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9234(InterfaceC9629 interfaceC9629) {
        int iM18746;
        if (this.f9167.f32718 && this.f9170.f30766 == interfaceC9629 && this.f9167.f32711 != null && this.f9167.f32711.m4628() == interfaceC9629.length() && interfaceC9629.length() != 0) {
            int length = interfaceC9629.length();
            if (!m9186((CharSequence) interfaceC9629)) {
                C6711 c6711 = this.f9167.f32721;
                if (m9207((CharSequence) interfaceC9629) && c6711 != null && c6711.m18743()) {
                    iM18746 = c6711.m18746();
                    length = c6711.m18738();
                }
                return;
            }
            iM18746 = 0;
            m9209();
            m9158(interfaceC9629, interfaceC9629.mo15344(), C20881.m47717(-1, -1, iM18746, length), EnumC0546.MERGE);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9236() {
        return this.f9167.f32712;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized long m9241() {
        if (this.f9172.m53878() && !this.f9172.m53976()) {
            InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
            if (m9181(interfaceC19106M54021, interfaceC19106M54021.mo15344())) {
                return -1L;
            }
            if (this.f9166.m54613() != null && m9233() == null) {
                return -1L;
            }
            C10240 c10240 = this.f9167;
            C6711 c6711 = c10240.f32721;
            if (c6711 != null) {
                if (m9195(this.f9172.m54021()) && c6711.m18743()) {
                    return (((long) c6711.m18746()) << 32) | (((long) c6711.m18738()) & 4294967295L);
                }
                return -1L;
            }
            if (c10240.f32711 != null && !this.f9167.f32712) {
                return -1L;
            }
            C9494 c9494 = this.f9170;
            return (c9494.f30758 == -1 && c9494.f30755 == -1 && !m9195(this.f9172.m54021())) ? Long.MIN_VALUE : -1L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m9242(CharSequence charSequence) {
        if (m9200(charSequence)) {
            m9182((InterfaceC9629) charSequence);
            return;
        }
        if (this.f9172.m54021() == charSequence) {
            m9177(true, false, false);
            this.f9167.f32718 = false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m9243(InterfaceC9629 interfaceC9629, int i, int i2) {
        if (this.f9167.f32718 && this.f9170.f30766 == interfaceC9629 && m9186((CharSequence) interfaceC9629) && i < i2 && i2 <= interfaceC9629.length()) {
            m9158(interfaceC9629, interfaceC9629.mo15344(), C20881.m47717(-1, -1, i, i2), EnumC0546.MERGE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9244(int i, int i2) {
        boolean z;
        InterfaceC9629 interfaceC9629M54021 = this.f9172.m54021();
        if (!m9192((CharSequence) interfaceC9629M54021)) {
            return false;
        }
        if (i >= 0 && i <= i2 && i2 <= interfaceC9629M54021.length()) {
            if (m9187(interfaceC9629M54021)) {
                C9494 c9494 = this.f9170;
                return !m9178(c9494.f30758, c9494.f30751, i, i2);
            }
            if (m9197()) {
                C9494 c9495 = this.f9170;
                return !m9178(c9495.f30755, c9495.f30764, i, i2);
            }
            C6711 c6711 = this.f9167.f32721;
            if (c6711 != null && c6711.m18741(i, i2)) {
                return false;
            }
            if (m9195(interfaceC9629M54021)) {
                C9494 c9496 = this.f9170;
                z = m9178(c9496.f30762, c9496.f30746, i, i2) ? false : true;
            }
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m9246(InterfaceC9629 interfaceC9629) {
        C6711 c6711;
        m9184();
        if (m9192((CharSequence) interfaceC9629)) {
            if (!m9195(interfaceC9629) && !m9187(interfaceC9629) && !m9197() && ((c6711 = this.f9167.f32721) == null || c6711.m18742().m4628() != interfaceC9629.length())) {
                m9174(interfaceC9629, false);
            }
            m9193(interfaceC9629);
            return false;
        }
        if (!m9186((CharSequence) interfaceC9629)) {
            return true;
        }
        C1270 c1270 = this.f9167.f32711;
        if (this.f9167.f32721 != null || c1270 == null || c1270.m4628() != interfaceC9629.length()) {
            m9182(interfaceC9629);
        } else if (!this.f9167.f32712 && m9210(interfaceC9629)) {
            m9204(interfaceC9629, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized void m9250() {
        m9177(false, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9214(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (i2 == 0 && i3 == 0) {
                this.f9168.f32767 = false;
                return;
            }
            m9184();
            C16800 c16800M54613 = this.f9166.m54613();
            if (c16800M54613 != null && this.f9167.f32718 && (charSequence instanceof InterfaceC9629)) {
                InterfaceC9629 interfaceC9629 = (InterfaceC9629) charSequence;
                if (m9200((CharSequence) interfaceC9629)) {
                    boolean zM53976 = this.f9172.m53976();
                    C4999 c4999 = this.f9167.f32713;
                    if (c4999 != null) {
                        this.f9167.f32713 = zM53976 ? null : c4999.m15224(interfaceC9629, this.f9166.m54614(), interfaceC9629.mo15344(), interfaceC9629.length(), i, i2, i3, (i <= 0 || this.f9167.f32711 == null || i > this.f9167.f32711.m4628()) ? c16800M54613.m39685() : this.f9167.f32711.m4631(i - 1));
                    }
                    m9170(interfaceC9629, i, i2, i3, zM53976);
                    m9169(interfaceC9629, i, i2, i3, c16800M54613, zM53976);
                    return;
                }
            }
            this.f9168.f32767 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2783(C24132 c24132, C13921 c13921) {
        C9494 c9494 = new C9494();
        c9494.f30758 = -1;
        c9494.f30751 = -1;
        c9494.f30762 = -1;
        c9494.f30746 = -1;
        c9494.f30755 = -1;
        c9494.f30764 = -1;
        this.f9170 = c9494;
        C19191 c19191 = new C19191();
        C20881 c20881 = C20881.f66829;
        c19191.f62068 = c20881;
        c19191.f62059 = c20881;
        this.f9171 = c19191;
        this.f9168 = new C10262();
        this.f9172 = c24132;
        this.f9169 = new C18467(new ExecutorC21429(c24132), new C18445(this, c24132));
        m9205((C16800) null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1270 m9251() {
        return this.f9167.f32711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9161(C2783 c2783, C3551 c3551) {
        if (c2783.m9180(c3551)) {
            c2783.f9172.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9218(C14715 c14715, int i, int i2) {
        int iM18738;
        int iM18746 = -1;
        c14715.m35397((C23667) null, -1, -1, 0);
        C3551 c3551M43047 = this.f9169.m43047();
        C4999 c4999 = this.f9167.f32713;
        if (c3551M43047 == null && c4999 == null) {
            return;
        }
        C20661 c20661M54614 = this.f9166.m54614();
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        if (this.f9167.f32718 && c20661M54614 != null && c20661M54614.m47282() && this.f9172.isAttachedToWindow() && this.f9172.m53878() && !this.f9172.m53976() && !this.f9167.f32712) {
            if (c3551M43047 != null && (c4999 == null || c4999.f17359 != c3551M43047.f12174)) {
                m9180(c3551M43047);
                c4999 = this.f9167.f32713;
            }
            if (c4999 == null || !c4999.m15226(interfaceC19106M54021, c20661M54614, interfaceC19106M54021.mo15344(), interfaceC19106M54021.length())) {
                return;
            }
            C23667 c23667 = c4999.f17360;
            if (c23667.f76757 <= i || c23667.f76756 >= i2) {
                return;
            }
            C6711 c6711 = this.f9167.f32721;
            if (c6711 == null || !c6711.m18743()) {
                iM18738 = -1;
            } else {
                iM18746 = c6711.m18746();
                iM18738 = c6711.m18738();
                if (iM18746 <= Math.max(i, c23667.f76756) && Math.min(i2, c23667.f76757) <= iM18738) {
                    return;
                }
            }
            c14715.m35397(c23667, iM18746, iM18738, c20661M54614.f66262.m30045());
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m9212() {
        this.f9172.m54000();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1270 m9231() {
        if (!this.f9167.f32718) {
            return null;
        }
        C20661 c20661M54614 = this.f9166.m54614();
        C1292 c1292 = this.f9167.f32716;
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        if (c1292 != null && c20661M54614 != null && c20661M54614.m47282() && c1292.f4614 == interfaceC19106M54021 && c1292.f4615 == c20661M54614 && c1292.f4612 == interfaceC19106M54021.mo15344() && c1292.f4616 == interfaceC19106M54021.length()) {
            return c1292.f4613;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9736 m9233() {
        if (!this.f9167.f32718) {
            return null;
        }
        C9736 c9736 = this.f9167.f32719;
        C20661 c20661M54614 = this.f9166.m54614();
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        if (c9736 == null || c20661M54614 == null || !c20661M54614.m47282() || !c9736.m25360(interfaceC19106M54021, c20661M54614)) {
            return null;
        }
        return c9736;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9736 m9211() {
        if (!this.f9167.f32718) {
            return null;
        }
        C9736 c9736 = this.f9167.f32717;
        C20661 c20661M54614 = this.f9166.m54614();
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        if (c9736 == null || c20661M54614 == null || !c20661M54614.m47282() || !c9736.m25360(interfaceC19106M54021, c20661M54614)) {
            return null;
        }
        return c9736;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9248(InterfaceC9629 interfaceC9629) {
        boolean z;
        C20705 c20705;
        C4297 c4297;
        C4297 c4297M43049;
        C20705 c20705M43045;
        synchronized (this) {
            z = false;
            if (this.f9170.f30761 != interfaceC9629 || m9184()) {
                c20705 = null;
                c4297 = null;
            } else {
                C9494 c9494 = this.f9170;
                c9494.f30765 = true;
                c20705 = c9494.f30745;
                c4297 = c9494.f30752;
                if (c20705 == null && (c20705M43045 = this.f9169.m43045()) != null && this.f9169.m43044(c20705M43045)) {
                    c20705 = c20705M43045;
                }
                if (c4297 == null && (c4297M43049 = this.f9169.m43049()) != null && this.f9169.m43042(c4297M43049)) {
                    c4297 = c4297M43049;
                }
                if (c20705 != null || c4297 != null) {
                    m9183();
                } else {
                    C9494 c9495 = this.f9170;
                    if (c9495.f30749 || c9495.f30757) {
                        m9183();
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (c20705 != null) {
            m9176(c20705);
            return;
        }
        if (c4297 != null) {
            m9168(c4297);
        } else if (z) {
            this.f9172.m54030();
        } else {
            if (m9193(interfaceC9629)) {
                return;
            }
            this.f9172.m54030();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m9240() {
        this.f9172.m54104();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9227(InterfaceC9629 interfaceC9629) {
        boolean z;
        RunnableC8004 runnableC8004M9155;
        synchronized (this) {
            boolean z2 = true;
            z = false;
            if (m9181(interfaceC9629, interfaceC9629.mo15344()) && this.f9166.m54613() != null) {
                m9209();
                runnableC8004M9155 = m9155(interfaceC9629, interfaceC9629.mo15344(), this.f9171.f62059);
                C19191 c19191 = this.f9171;
                boolean z3 = c19191.f62058;
                C9494 c9494 = this.f9170;
                if ((!c9494.f30749 || c9494.f30766 != interfaceC9629) && (!c9494.f30757 || !m9187(interfaceC9629))) {
                    z2 = false;
                }
                c19191.f62058 = z2 | z3;
                this.f9171.f62066 = runnableC8004M9155;
            } else {
                C9494 c9495 = this.f9170;
                if ((!c9495.f30749 || c9495.f30766 != interfaceC9629) && (!c9495.f30757 || !m9187(interfaceC9629))) {
                    z2 = false;
                }
                runnableC8004M9155 = null;
                z = z2;
            }
        }
        if (runnableC8004M9155 == null) {
            if (z) {
                m9193(interfaceC9629);
            }
            this.f9172.m54030();
        } else {
            C24132 c24132 = this.f9172;
            c24132.postInvalidate();
            c24132.post(runnableC8004M9155);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9217(InterfaceC9629 interfaceC9629, int i, int i2) {
        C6711 c6711;
        C6711 c6712;
        this.f9169.m43038(interfaceC9629, i, i2);
        synchronized (this) {
            if (this.f9167.f32718 && this.f9172.isAttachedToWindow() && !this.f9172.m53976() && this.f9170.f30766 == interfaceC9629) {
                if (m9186((CharSequence) interfaceC9629) && this.f9167.f32712) {
                    return;
                }
                if (i2 <= i || !m9207((CharSequence) interfaceC9629) || (c6712 = this.f9167.f32721) == null || !c6712.m18741(i, i2)) {
                    if (i2 > i && m9207((CharSequence) interfaceC9629) && ((c6711 = this.f9167.f32721) == null || !c6711.m18741(i, i2))) {
                        m9171(interfaceC9629, i, i2, this.f9172.m53945());
                    }
                    C18467 c18467 = this.f9169;
                    c18467.m43037(c18467.m43035(interfaceC9629));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9216(InterfaceC9629 interfaceC9629) {
        if (m9193(interfaceC9629)) {
            return;
        }
        this.f9172.m54030();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m9186(CharSequence charSequence) {
        return m9200(charSequence) && charSequence.length() <= 1000000;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m9192(CharSequence charSequence) {
        return m9200(charSequence) && charSequence.length() > 1000000;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m9210(InterfaceC9629 interfaceC9629) {
        if (!m9186((CharSequence) interfaceC9629)) {
            return false;
        }
        C24132 c24132 = this.f9172;
        return c24132.isAttachedToWindow() && c24132.m53878() && !c24132.m53976();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m9194(InterfaceC9629 interfaceC9629) {
        if (!m9207((CharSequence) interfaceC9629)) {
            return false;
        }
        C24132 c24132 = this.f9172;
        return c24132.isAttachedToWindow() && c24132.m53878() && !c24132.m53976();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m9204(InterfaceC9629 interfaceC9629, boolean z) {
        if (m9208(interfaceC9629) || m9153(interfaceC9629)) {
            return;
        }
        if (this.f9170.f30763 != null) {
            m9201();
        }
        m9183();
        C9494 c9494 = this.f9170;
        c9494.f30749 = false;
        c9494.f30766 = interfaceC9629;
        if (z) {
            c9494.f30761 = interfaceC9629;
        }
        this.f9169.m43041(this.f9166.m54614(), interfaceC9629, this.f9167.f32711, this.f9167.f32720);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9171(InterfaceC9629 interfaceC9629, int i, int i2, boolean z) {
        if (z || m9194(interfaceC9629)) {
            m9188(interfaceC9629, i, i2);
            if (m9208(interfaceC9629)) {
                return;
            }
            if (m9187(interfaceC9629)) {
                C9494 c9494 = this.f9170;
                if (c9494.f30758 <= i && i2 <= c9494.f30751) {
                    return;
                }
            }
            if (m9197()) {
                C9494 c9495 = this.f9170;
                if (c9495.f30755 <= i && i2 <= c9495.f30764) {
                    return;
                }
            }
            m9196();
            m9183();
            if (z) {
                this.f9170.f30761 = interfaceC9629;
            }
            C9494 c9496 = this.f9170;
            c9496.f30766 = interfaceC9629;
            c9496.f30758 = i;
            c9496.f30751 = i2;
            c9496.f30767 = interfaceC9629.mo15344();
            this.f9170.f30756 = interfaceC9629.length();
            C9494 c9497 = this.f9170;
            c9497.f30744 = this.f9167.f32720;
            c9497.f30757 = false;
            this.f9169.m43048(this.f9166.m54614(), interfaceC9629, i, i2, this.f9167.f32720);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m9191(InterfaceC9629 interfaceC9629, int i, int i2) {
        boolean zM9187 = m9187(interfaceC9629);
        C9494 c9494 = this.f9170;
        if ((!zM9187 || !m9178(c9494.f30758, c9494.f30751, i, i2)) && c9494.f30758 != -1) {
            this.f9169.m43046();
            m9152();
        }
        if (c9494.f30755 != -1 && (!m9197() || !m9178(c9494.f30755, c9494.f30764, i, i2))) {
            m9196();
        }
        c9494.f30766 = interfaceC9629;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9174(InterfaceC9629 interfaceC9629, boolean z) {
        m9177(false, false, false);
        C6711 c6711M18737 = C6711.m18737(interfaceC9629.length(), this.f9166.m54613().m39685());
        m9159(c6711M18737.m18742(), (C8246) null, false, c6711M18737, z);
        m9188(interfaceC9629, 0, Math.min(interfaceC9629.length(), 10000));
        this.f9167.f32718 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9177(boolean z, boolean z2, boolean z3) {
        if (z || !z3) {
            this.f9167.f32713 = null;
        }
        this.f9169.m43036();
        C9494 c9494 = this.f9170;
        c9494.f30749 = false;
        c9494.f30766 = null;
        m9183();
        m9152();
        if (!z2) {
            m9201();
            m9196();
        }
        if (!z3) {
            C9494 c9495 = this.f9170;
            c9495.f30762 = -1;
            c9495.f30746 = -1;
            c9495.f30754 = 0;
            c9495.f30743 = 0;
            c9495.f30759 = null;
            m9189();
        }
        if (z) {
            this.f9167.f32718 = false;
            m9159((C1270) null, (C8246) null, false, (C6711) null, false);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m9152() {
        C9494 c9494 = this.f9170;
        c9494.f30758 = -1;
        c9494.f30751 = -1;
        c9494.f30767 = 0;
        c9494.f30756 = 0;
        c9494.f30744 = 0;
        c9494.f30757 = false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m9196() {
        C9494 c9494 = this.f9170;
        c9494.f30755 = -1;
        c9494.f30764 = -1;
        c9494.f30760 = 0;
        c9494.f30748 = 0;
        c9494.f30753 = null;
        c9494.getClass();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m9201() {
        C9494 c9494 = this.f9170;
        c9494.f30747 = 0;
        c9494.f30750 = 0;
        c9494.f30763 = null;
        c9494.getClass();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m9183() {
        C9494 c9494 = this.f9170;
        c9494.f30761 = null;
        c9494.f30745 = null;
        c9494.f30752 = null;
        c9494.f30765 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m9188(InterfaceC9629 interfaceC9629, int i, int i2) {
        C17359.checkFromToIndex(i, i2, interfaceC9629.length());
        C9494 c9494 = this.f9170;
        c9494.f30762 = i;
        c9494.f30746 = i2;
        c9494.f30754 = interfaceC9629.mo15344();
        c9494.f30743 = interfaceC9629.length();
        c9494.f30759 = interfaceC9629;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m9195(InterfaceC9629 interfaceC9629) {
        C9494 c9494 = this.f9170;
        return c9494.f30759 == interfaceC9629 && c9494.f30762 != -1 && c9494.f30754 == interfaceC9629.mo15344() && c9494.f30743 == interfaceC9629.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m9172(InterfaceC9629 interfaceC9629, C6711 c6711) {
        C19191 c19191 = this.f9171;
        c19191.f62060 = c6711;
        c19191.f62068 = C20881.m47717(-1, -1, c6711.m18746(), c6711.m18738());
        c19191.f62056 = interfaceC9629.mo15344();
        c19191.f62064 = interfaceC9629.length();
        c19191.f62063 = interfaceC9629;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9165(C2783 c2783, InterfaceC9629 interfaceC9629, C20881 c20881) {
        C19191 c19191 = c2783.f9171;
        c19191.f62060 = null;
        c19191.f62068 = c20881;
        c19191.f62056 = interfaceC9629.mo15344();
        c19191.f62064 = interfaceC9629.length();
        c19191.f62063 = interfaceC9629;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m9189() {
        C19191 c19191 = this.f9171;
        c19191.f62060 = null;
        c19191.f62068 = C20881.f66829;
        c19191.f62056 = 0;
        c19191.f62064 = 0;
        c19191.f62063 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m9154() {
        m9209();
        C20881 c20881 = C20881.f66829;
        C19191 c19191 = this.f9171;
        c19191.f62059 = c20881;
        c19191.f62061 = false;
        c19191.f62067 = 0;
        c19191.f62062 = 0;
        c19191.f62065 = null;
        c19191.f62057 = false;
        c19191.f62058 = false;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m9209() {
        C19191 c19191 = this.f9171;
        RunnableC8004 runnableC8004 = c19191.f62066;
        c19191.f62066 = null;
        if (runnableC8004 != null) {
            this.f9172.removeCallbacks(runnableC8004);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m9181(InterfaceC9629 interfaceC9629, int i) {
        C19191 c19191 = this.f9171;
        return c19191.f62061 && c19191.f62065 == interfaceC9629 && c19191.f62067 == i && c19191.f62062 == interfaceC9629.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20881 m9158(InterfaceC9629 interfaceC9629, int i, C20881 c20881, EnumC0546 enumC0546) {
        boolean zM9181 = m9181(interfaceC9629, i);
        C19191 c19191 = this.f9171;
        if (!zM9181) {
            c19191.f62057 = false;
            c19191.f62058 = false;
        }
        if (enumC0546 != EnumC0546.REPLACE && zM9181) {
            c20881 = c19191.f62059.m47720(c20881);
        }
        c19191.f62059 = c20881;
        c19191.f62061 = true;
        c19191.f62067 = i;
        c19191.f62062 = interfaceC9629.length();
        c19191.f62065 = interfaceC9629;
        return c20881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9170(InterfaceC9629 interfaceC9629, int i, int i2, int i3, boolean z) {
        int i4;
        m9209();
        long length = (((long) interfaceC9629.length()) - ((long) i3)) + ((long) i2);
        int iMo15344 = interfaceC9629.mo15344();
        if (length >= 0 && length <= 2147483647L) {
            C19191 c19191 = this.f9171;
            if (c19191.f62061 && c19191.f62065 == interfaceC9629 && c19191.f62062 == (i4 = (int) length) && c19191.f62067 + 1 == iMo15344) {
                if (c19191.f62059.m47723() == null || z) {
                    m9154();
                    return;
                }
                C20881 c20881M47719 = c19191.f62059.m47719(i4, i, i2, i3);
                if (c20881M47719.m47723() == null) {
                    m9154();
                    return;
                }
                c19191.f62059 = c20881M47719;
                c19191.f62067 = iMo15344;
                c19191.f62062 = interfaceC9629.length();
                c19191.f62065 = interfaceC9629;
                return;
            }
        }
        m9154();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m9208(InterfaceC9629 interfaceC9629) {
        return this.f9171.f62058 && !this.f9172.m53945() && m9181(interfaceC9629, interfaceC9629.mo15344());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m9187(InterfaceC9629 interfaceC9629) {
        C9494 c9494 = this.f9170;
        return c9494.f30766 == interfaceC9629 && c9494.f30758 != -1 && c9494.f30767 == interfaceC9629.mo15344() && c9494.f30756 == interfaceC9629.length();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m9197() {
        InterfaceC19106 interfaceC19106M54021;
        C9494 c9494 = this.f9170;
        return c9494.f30755 != -1 && c9494.f30753 == (interfaceC19106M54021 = this.f9172.m54021()) && c9494.f30760 == interfaceC19106M54021.mo15344() && c9494.f30748 == interfaceC19106M54021.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9153(InterfaceC9629 interfaceC9629) {
        C9494 c9494 = this.f9170;
        return c9494.f30763 == interfaceC9629 && c9494.f30747 == interfaceC9629.mo15344() && c9494.f30750 == interfaceC9629.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9169(InterfaceC9629 interfaceC9629, int i, int i2, int i3, C16800 c16800, boolean z) {
        C1270 c1270M4615;
        C1270 c1270M4616;
        boolean z2;
        int i4;
        int i5;
        int iM31452;
        int iM31453;
        C6711 c6711M18737;
        boolean z3;
        C20881 c20881M9157 = C20881.f66829;
        long j = i3;
        long j2 = i2;
        long length = (((long) interfaceC9629.length()) - j) + j2;
        if (length >= 0 && length <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0) {
            long j3 = ((long) i) + j2;
            if (j3 <= length) {
                int i6 = (int) length;
                if (interfaceC9629.length() <= 1000000) {
                    C1270 c1270 = this.f9167.f32711;
                    C10240 c10240 = this.f9167;
                    Integer num = c10240.f32715;
                    boolean z4 = c10240.f32721 == null && c1270 != null && c1270.m4628() == i6;
                    if (z || !z4) {
                        if (!z) {
                            c20881M9157 = m9157(interfaceC9629, i6, i, i2, i3, c16800);
                        }
                        m9177(false, false, false);
                        int length2 = interfaceC9629.length();
                        C11974 c11974M39685 = c16800.m39685();
                        if (length2 == 0) {
                            c1270M4615 = C1270.m4622();
                        } else {
                            c1270M4615 = C1270.m4615(length2, c11974M39685, false);
                        }
                        m9159(c1270M4615, (C8246) null, false, (C6711) null, !z);
                        this.f9167.f32718 = true;
                        if (!z) {
                            m9173(interfaceC9629, c20881M9157);
                        }
                        C10262 c10262 = this.f9168;
                        c10262.f32767 = false;
                        c10262.f32768 = i;
                        c10262.f32766 = i + i3;
                        return;
                    }
                    try {
                        C11974 c11974M39686 = (i <= 0 || i3 <= 0) ? c16800.m39685() : c1270.m4631(i - 1);
                        int i7 = i + i2;
                        if (i3 == 0) {
                            c1270M4616 = C1270.m4622();
                        } else {
                            c1270M4616 = C1270.m4615(i3, c11974M39686, false);
                        }
                        m9160(c1270.m4629(i, i7, c1270M4616), null, false, null, true, num, false);
                        this.f9167.f32718 = true;
                        C10262 c10263 = this.f9168;
                        c10263.f32767 = false;
                        c10263.f32768 = i;
                        c10263.f32766 = i + i3;
                        m9183();
                        if (m9208(interfaceC9629) || m9153(interfaceC9629)) {
                            return;
                        }
                        if (this.f9170.f30763 != null) {
                            m9201();
                        }
                        boolean z5 = this.f9172.m53945() && this.f9172.isAttachedToWindow() && !this.f9172.m53976();
                        if (!z5 && !m9210(interfaceC9629)) {
                            if (this.f9172.m53976()) {
                                m9177(false, false, false);
                                return;
                            }
                            return;
                        }
                        C9494 c9494 = this.f9170;
                        if (c9494.f30766 != interfaceC9629) {
                            m9204(interfaceC9629, false);
                            return;
                        }
                        c9494.f30749 = false;
                        if (z5) {
                            c9494.f30761 = interfaceC9629;
                        }
                        this.f9169.m43040(this.f9166.m54614(), interfaceC9629, i, i2, i3, this.f9167.f32711, this.f9167.f32720);
                        return;
                    } catch (RuntimeException unused) {
                        m9182(interfaceC9629);
                        C10262 c10264 = this.f9168;
                        c10264.f32767 = true;
                        c10264.f32768 = 0;
                        c10264.f32766 = interfaceC9629.length();
                        return;
                    }
                }
                if (i6 > 1000000 && m9192((CharSequence) interfaceC9629)) {
                    long length3 = (((long) interfaceC9629.length()) - j) + j2;
                    if (length3 >= 0 && length3 <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0 && j3 <= length3) {
                        int i8 = (int) length3;
                        int iMo15344 = interfaceC9629.mo15344();
                        C9494 c9495 = this.f9170;
                        if (c9495.f30759 == interfaceC9629 && (i4 = c9495.f30762) != -1 && c9495.f30743 == i8 && c9495.f30754 + 1 == iMo15344) {
                            i5 = c9495.f30746;
                        } else if (c9495.f30766 == interfaceC9629 && (i4 = c9495.f30758) != -1 && c9495.f30756 == i8 && c9495.f30767 + 1 == iMo15344) {
                            i5 = c9495.f30751;
                        } else if (c9495.f30753 == interfaceC9629 && (i4 = c9495.f30755) != -1 && c9495.f30748 == i8 && c9495.f30760 + 1 == iMo15344) {
                            i5 = c9495.f30764;
                        }
                        int i9 = i5;
                        int i10 = i4;
                        C1270 c1271 = this.f9167.f32711;
                        if (c1271 != null) {
                            if (this.f9167.f32721 != null && c1271.m4628() == i8 && this.f9167.f32721.m18742() == c1271) {
                                if (m9194(interfaceC9629)) {
                                    C12676 c12676M18739 = this.f9167.f32721.m18739(i, i2, i3, i10, i9, c16800.m39685());
                                    c6711M18737 = c12676M18739.m31451();
                                    iM31452 = c12676M18739.m31452();
                                    iM31453 = c12676M18739.m31453();
                                } else {
                                    long jM18734 = C6711.m18734(i8, i, i2, i3, i10, i9);
                                    iM31452 = (int) (jM18734 >>> 32);
                                    iM31453 = (int) jM18734;
                                    c6711M18737 = C6711.m18737(interfaceC9629.length(), c16800.m39685());
                                }
                            }
                        } else {
                            long jM18735 = C6711.m18734(i8, i, i2, i3, i10, i9);
                            iM31452 = (int) (jM18735 >>> 32);
                            iM31453 = (int) jM18735;
                            c6711M18737 = C6711.m18737(interfaceC9629.length(), c16800.m39685());
                        }
                        int i11 = iM31453;
                        C6711 c6711 = c6711M18737;
                        int i12 = iM31452;
                        boolean zM53976 = this.f9172.m53976();
                        C19191 c19191 = this.f9171;
                        C20881 c20881 = (c19191.f62063 == interfaceC9629 && c19191.f62064 == i8 && c19191.f62056 + 1 == iMo15344) ? c19191.f62068 : null;
                        c19191.f62060 = null;
                        if (c20881 == null) {
                            m9189();
                        } else {
                            if (!zM53976) {
                                c20881M9157 = c20881.m47719(i8, i, i2, i3);
                            }
                            c19191.f62068 = c20881M9157;
                            c19191.f62056 = iMo15344;
                            c19191.f62064 = interfaceC9629.length();
                            c19191.f62063 = interfaceC9629;
                        }
                        this.f9169.m43039(this.f9166.m54614(), interfaceC9629, i, i2, i3);
                        this.f9170.f30766 = interfaceC9629;
                        m9152();
                        m9196();
                        if (c6711 != null) {
                            m9159(c6711.m18742(), (C8246) null, false, c6711, true);
                        }
                        m9188(interfaceC9629, i12, i11);
                        if (m9194(interfaceC9629)) {
                            z3 = false;
                            m9171(interfaceC9629, i12, i11, false);
                        } else {
                            z3 = false;
                        }
                        C10262 c10265 = this.f9168;
                        c10265.f32767 = z3;
                        c10265.f32768 = i;
                        c10265.f32766 = i + i3;
                        return;
                    }
                }
                if (z) {
                    z2 = false;
                    m9174(interfaceC9629, false);
                } else {
                    C20881 c20881M9158 = m9157(interfaceC9629, i6, i, i2, i3, c16800);
                    m9174(interfaceC9629, true);
                    m9173(interfaceC9629, c20881M9158);
                    z2 = false;
                }
                C10262 c10266 = this.f9168;
                c10266.f32767 = z2;
                c10266.f32768 = i;
                c10266.f32766 = i + i3;
                return;
            }
        }
        m9182(interfaceC9629);
        C10262 c10267 = this.f9168;
        c10267.f32767 = true;
        c10267.f32768 = 0;
        c10267.f32766 = interfaceC9629.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20881 m9157(InterfaceC9629 interfaceC9629, int i, int i2, int i3, int i4, C16800 c16800) {
        C1270 c1270M4615;
        C20881 c20881M47717 = C20881.f66829;
        C10240 c10240 = this.f9167;
        C6711 c6711 = c10240.f32721;
        if (c6711 != null) {
            int iMo15344 = interfaceC9629.mo15344();
            C19191 c19191 = this.f9171;
            if (c19191.f62063 == interfaceC9629 && c19191.f62056 + 1 == iMo15344 && c19191.f62064 == i) {
                c20881M47717 = c19191.f62068;
            } else if (c6711.m18743()) {
                c20881M47717 = C20881.m47717(-1, -1, c6711.m18746(), c6711.m18738());
            }
        } else {
            C1270 c1270 = c10240.f32711;
            if (c1270 != null && c1270.m4628() == i) {
                C11974 c11974M39685 = c16800.m39685();
                if (i == 0) {
                    c1270M4615 = C1270.m4622();
                } else {
                    c1270M4615 = C1270.m4615(i, c11974M39685, false);
                }
                C0524 c0524M4634 = c1270.m4634(c1270M4615);
                if (c0524M4634 != null) {
                    c20881M47717 = C20881.m47717(-1, -1, c0524M4634.m2487(), c0524M4634.m2486());
                }
            } else {
                c20881M47717 = C20881.m47717(-1, -1, 0, i);
            }
        }
        return c20881M47717.m47719(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9173(InterfaceC9629 interfaceC9629, C20881 c20881) {
        RunnableC8004 runnableC8004M9202 = m9202(interfaceC9629, interfaceC9629.mo15344(), c20881, EnumC0546.MERGE);
        if (runnableC8004M9202 == null) {
            m9193(interfaceC9629);
            return;
        }
        boolean z = this.f9167.f32721 != null;
        C19191 c19191 = this.f9171;
        c19191.f62057 = z;
        c19191.f62058 = true;
        C24132 c24132 = this.f9172;
        c24132.postInvalidate();
        c24132.post(runnableC8004M9202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9159(C1270 c1270, C8246 c8246, boolean z, C6711 c6711, boolean z2) {
        C24413 c24413 = this.f9166;
        C20661 c20661M54614 = c24413 == null ? null : c24413.m54614();
        m9160(c1270, c8246, z, c6711, z2, c20661M54614 != null ? Integer.valueOf(c20661M54614.m47287()) : null, false);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9160(C1270 c1270, C8246 c8246, boolean z, C6711 c6711, boolean z2, Integer num, boolean z3) {
        C9736 c9736M25353;
        C1292 c1292;
        C9736 c9736M25352;
        if (c6711 != null && c6711.m18742() != c1270) {
            throw new IllegalArgumentException("Window projection does not own visible store");
        }
        if (z && (c1270 == null || c8246 == null || c6711 != null || c8246.m22191() != c1270.m4628())) {
            throw new IllegalArgumentException("Invalid complete syntax display");
        }
        if (!z && c8246 != null) {
            throw new IllegalArgumentException("Incomplete syntax display cannot expose full contexts");
        }
        if (z2) {
            m9209();
        } else {
            m9154();
        }
        C24413 c24413 = this.f9166;
        C20661 c20661M54614 = c24413 == null ? null : c24413.m54614();
        InterfaceC19106 interfaceC19106M54021 = this.f9172.m54021();
        C4999 c4999 = this.f9167.f32713;
        if (c4999 != null) {
            this.f9167.f32713 = (z || c1270 == null || !c4999.m15226(interfaceC19106M54021, c20661M54614, interfaceC19106M54021.mo15344(), interfaceC19106M54021.length())) ? null : c4999.m15223(c6711);
        }
        if (c20661M54614 != null && c1270 != null) {
            if (z) {
                C17359.requireNonNull(c8246);
                c9736M25353 = C9736.m25352(interfaceC19106M54021, c20661M54614, c1270, c8246);
            } else if (c6711 == null || !c6711.m18744()) {
                c9736M25353 = null;
            } else {
                C8246 c8246M18747 = c6711.m18747();
                C17359.requireNonNull(c8246M18747);
                c9736M25353 = C9736.m25353(interfaceC19106M54021, c20661M54614, c1270, c8246M18747, c6711.m18746(), c6711.m18738());
            }
            if (num != null && num.intValue() == c20661M54614.m47287() && c1270.m4628() == interfaceC19106M54021.length()) {
                c1292 = new C1292(interfaceC19106M54021, c20661M54614, c1270);
                if (c9736M25353 == null && !c20661M54614.m47286()) {
                    c9736M25352 = C9736.m25352(interfaceC19106M54021, c20661M54614, c1270, C8246.m22173(interfaceC19106M54021.length(), c20661M54614.f66265));
                }
            } else {
                c9736M25352 = null;
                c1292 = null;
            }
            this.f9167.f32719 = null;
            this.f9167.f32717 = null;
            this.f9167.f32716 = null;
            C10240 c10240 = this.f9167;
            c10240.f32712 = z;
            c10240.f32714 = c8246;
            c10240.f32721 = c6711;
            if (c1270 == null) {
                num = null;
            }
            c10240.f32715 = num;
            c10240.f32720++;
            c10240.f32711 = c1270;
            this.f9167.f32716 = c1292;
            this.f9167.f32717 = c9736M25352;
            this.f9167.f32719 = c9736M25353;
            if (z3) {
                this.f9172.m53889();
            } else {
                this.f9172.m54104();
            }
        }
        c9736M25353 = null;
        c1292 = null;
        c9736M25352 = c9736M25353;
        this.f9167.f32719 = null;
        this.f9167.f32717 = null;
        this.f9167.f32716 = null;
        C10240 c10241 = this.f9167;
        c10241.f32712 = z;
        c10241.f32714 = c8246;
        c10241.f32721 = c6711;
        if (c1270 == null) {
            num = null;
        }
        c10241.f32715 = num;
        c10241.f32720++;
        c10241.f32711 = c1270;
        this.f9167.f32716 = c1292;
        this.f9167.f32717 = c9736M25352;
        this.f9167.f32719 = c9736M25353;
        if (z3) {
            this.f9172.m53889();
        } else {
            this.f9172.m54104();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m9176(C20705 c20705) {
        C0524 c0524M47373;
        C20881 c20881M47717;
        C18467 c18467 = this.f9169;
        if (c18467.m43044(c20705)) {
            C1270 c1270M9131 = c20705.m47378().m9131();
            synchronized (this) {
                try {
                    InterfaceC9629 interfaceC9629 = this.f9170.f30766;
                    C20661 c20661M54614 = this.f9166.m54614();
                    if (c18467.m43044(c20705) && interfaceC9629 != null && c20705.m47378().m9132() == c20661M54614 && this.f9172.m54021() == interfaceC9629 && c20705.m47374() == interfaceC9629.mo15344() && c20705.m47376() == interfaceC9629.length() && c1270M9131.m4628() == c20705.m47376() && this.f9167.f32720 == c20705.m47377()) {
                        C9494 c9494 = this.f9170;
                        if (c9494.f30761 == interfaceC9629) {
                            if (!c9494.f30765) {
                                c9494.f30745 = c20705;
                                return;
                            }
                            m9183();
                        }
                        if (this.f9172.isAttachedToWindow() && this.f9172.m53878() && !this.f9172.m53976()) {
                            this.f9170.f30749 = false;
                            if (!c20705.m47375()) {
                                c0524M47373 = c1270M9131.m4628() == 0 ? null : new C0524(0, c1270M9131.m4628());
                            } else {
                                c0524M47373 = c20705.m47373();
                            }
                            m9160(c1270M9131, c20705.m47378().m9130(), true, null, true, Integer.valueOf(c20661M54614.m47287()), true);
                            m9189();
                            C9494 c9495 = this.f9170;
                            c9495.f30762 = -1;
                            c9495.f30746 = -1;
                            c9495.f30754 = 0;
                            c9495.f30743 = 0;
                            c9495.f30759 = null;
                            m9152();
                            m9201();
                            m9196();
                            if (c0524M47373 == null) {
                                c20881M47717 = C20881.f66829;
                            } else {
                                c20881M47717 = C20881.m47717(-1, -1, c0524M47373.m2487(), c0524M47373.m2486());
                            }
                            RunnableC8004 runnableC8004M9202 = m9202(interfaceC9629, c20705.m47374(), c20881M47717, EnumC0546.MERGE);
                            C24132 c24132 = this.f9172;
                            if (runnableC8004M9202 == null) {
                                return;
                            }
                            c24132.postInvalidate();
                            c24132.post(runnableC8004M9202);
                            return;
                        }
                        this.f9170.f30749 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m9168(C4297 c4297) {
        C20881 c20881M47717;
        C18467 c18467 = this.f9169;
        if (c18467.m43042(c4297)) {
            C0744 c0744M13678 = c4297.m13678();
            C17359.requireNonNull(c0744M13678, o.c);
            C6711 c6711M18736 = C6711.m18736(c0744M13678.m3072(), c0744M13678.m3075(), c0744M13678.m3074(), c0744M13678.m3077(), c0744M13678.m3078().f66262);
            synchronized (this) {
                InterfaceC9629 interfaceC9629 = this.f9170.f30766;
                C20661 c20661M54614 = this.f9166.m54614();
                if (c18467.m43042(c4297) && interfaceC9629 != null && c0744M13678.m3078() == c20661M54614 && this.f9172.m54021() == interfaceC9629 && interfaceC9629.length() > 1000000 && c4297.m13679() == interfaceC9629.mo15344() && c4297.m13680() == interfaceC9629.length() && c0744M13678.m3070() == c4297.m13679() && c0744M13678.m3072() == c4297.m13680() && c0744M13678.m3075() == this.f9170.f30758) {
                    int iM3073 = c0744M13678.m3073();
                    C9494 c9494 = this.f9170;
                    if (iM3073 == c9494.f30751 && c9494.f30767 == c4297.m13679() && this.f9170.f30756 == c4297.m13680() && this.f9170.f30744 == c4297.m13677() && this.f9167.f32720 == c4297.m13677()) {
                        C9494 c9495 = this.f9170;
                        if (c9495.f30761 == interfaceC9629) {
                            if (!c9495.f30765) {
                                c9495.f30752 = c4297;
                                return;
                            }
                            m9183();
                        }
                        if (this.f9172.isAttachedToWindow() && this.f9172.m53878() && !this.f9172.m53976()) {
                            C6711 c6711 = this.f9171.f62060;
                            if (c6711 == null || c6711.m18742().m4628() != c6711M18736.m18742().m4628()) {
                                C19191 c19191 = this.f9171;
                                if (c19191.f62063 == interfaceC9629 && c19191.f62056 == interfaceC9629.mo15344() && c19191.f62064 == interfaceC9629.length()) {
                                    c20881M47717 = C20881.m47716(this.f9171.f62068, c0744M13678.m3075(), c0744M13678.m3073());
                                } else {
                                    c20881M47717 = C20881.m47717(-1, -1, c0744M13678.m3075(), c0744M13678.m3073());
                                }
                            } else {
                                c20881M47717 = c6711M18736.m18740(c6711);
                            }
                            C20881 c20881 = c20881M47717;
                            m9160(c6711M18736.m18742(), null, false, c6711M18736, true, Integer.valueOf(c20661M54614.m47287()), true);
                            if (!m9195(interfaceC9629)) {
                                m9188(interfaceC9629, c0744M13678.m3075(), c0744M13678.m3073());
                            }
                            m9152();
                            m9196();
                            RunnableC8004 runnableC8004M9202 = m9202(interfaceC9629, c4297.m13679(), c20881, EnumC0546.REPLACE);
                            C24132 c24132 = this.f9172;
                            if (runnableC8004M9202 == null) {
                                return;
                            }
                            c24132.postInvalidate();
                            c24132.post(runnableC8004M9202);
                            return;
                        }
                        this.f9170.f30757 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9166(C2783 c2783, C16975 c16975) {
        if (c16975.m40033()) {
            c2783.m9175(c16975);
            return;
        }
        C18467 c18467 = c2783.f9169;
        if (c18467.m43043(c16975)) {
            synchronized (c2783) {
                InterfaceC9629 interfaceC9629 = c2783.f9170.f30766;
                if (c18467.m43043(c16975) && interfaceC9629 != null && c2783.f9172.m54021() == interfaceC9629 && c16975.m40035() == interfaceC9629.mo15344() && c16975.m40032() == interfaceC9629.length()) {
                    boolean z = true;
                    if (c16975.m40031() == EnumC17721.SCHEDULER_REJECTED) {
                        C9494 c9494 = c2783.f9170;
                        c9494.f30749 = true;
                        if (c9494.f30761 == interfaceC9629 && c9494.f30765) {
                            c2783.m9183();
                        }
                        if (z) {
                            c2783.m9193(interfaceC9629);
                        }
                    }
                    C9494 c9495 = c2783.f9170;
                    c9495.f30749 = false;
                    c9495.f30747 = c16975.m40035();
                    c2783.f9170.f30750 = c16975.m40032();
                    c2783.f9170.f30763 = interfaceC9629;
                    c2783.m9177(false, true, false);
                    z = false;
                    if (z) {
                        c2783.m9193(interfaceC9629);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9175(C16975 c16975) {
        C18467 c18467 = this.f9169;
        if (c18467.m43043(c16975)) {
            synchronized (this) {
                InterfaceC9629 interfaceC9629 = this.f9170.f30766;
                int iM40034 = c16975.m40034();
                int iM40036 = c16975.m40036();
                if (c18467.m43043(c16975) && interfaceC9629 != null && this.f9172.m54021() == interfaceC9629 && c16975.m40035() == interfaceC9629.mo15344() && c16975.m40032() == interfaceC9629.length()) {
                    C9494 c9494 = this.f9170;
                    if (iM40034 == c9494.f30758 && iM40036 == c9494.f30751 && c9494.f30767 == c16975.m40035() && this.f9170.f30756 == c16975.m40032()) {
                        boolean z = false;
                        if (c16975.m40031() == EnumC17721.SCHEDULER_REJECTED) {
                            C9494 c9495 = this.f9170;
                            c9495.f30757 = true;
                            if (c9495.f30761 == interfaceC9629 && c9495.f30765) {
                                m9183();
                                z = true;
                            }
                        } else {
                            m9152();
                            C9494 c9496 = this.f9170;
                            c9496.f30755 = iM40034;
                            c9496.f30764 = iM40036;
                            c9496.f30760 = c16975.m40035();
                            this.f9170.f30748 = c16975.m40032();
                            this.f9170.f30753 = interfaceC9629;
                            this.f9167.f32713 = null;
                            m9177(false, true, true);
                        }
                        if (z) {
                            m9193(interfaceC9629);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private RunnableC8004 m9202(InterfaceC9629 interfaceC9629, int i, C20881 c20881, EnumC0546 enumC0546) {
        if (this.f9172.m54021() != interfaceC9629 || interfaceC9629.mo15344() != i || this.f9166.m54613() == null) {
            return null;
        }
        C20881 c20881M9158 = m9158(interfaceC9629, i, c20881, enumC0546);
        m9209();
        RunnableC8004 runnableC8004M9155 = m9155(interfaceC9629, i, c20881M9158);
        this.f9171.f62066 = runnableC8004M9155;
        return runnableC8004M9155;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9239(InterfaceC9629 interfaceC9629) {
        synchronized (this) {
            if (m9181(interfaceC9629, interfaceC9629.mo15344()) && this.f9166.m54613() != null) {
                m9209();
                RunnableC8004 runnableC8004M9155 = m9155(interfaceC9629, interfaceC9629.mo15344(), this.f9171.f62059);
                this.f9171.f62066 = runnableC8004M9155;
                this.f9172.post(runnableC8004M9155);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private RunnableC8004 m9155(InterfaceC9629 interfaceC9629, int i, C20881 c20881) {
        C1270 c1270 = this.f9167.f32711;
        if (c1270 == null) {
            throw new IllegalStateException("Syntax display is not initialized");
        }
        C16800 c16800M54613 = this.f9166.m54613();
        C10240 c10240 = this.f9167;
        return new RunnableC8004(this, interfaceC9629, c16800M54613, i, c10240.f32721, c1270, c10240.f32720, c20881);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m9237() {
        return this.f9167.f32718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9220(CharSequence charSequence) {
        C1270 c1270;
        return this.f9167.f32718 && (c1270 = this.f9167.f32711) != null && c1270.m4628() == charSequence.length();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9182(InterfaceC9629 interfaceC9629) {
        C1270 c1270M4615;
        m9184();
        if ((m9153(interfaceC9629) || m9197()) && this.f9167.f32711 != null && this.f9167.f32711.m4628() == interfaceC9629.length()) {
            return;
        }
        if (interfaceC9629.length() <= 1000000) {
            m9177(false, false, false);
            C16800 c16800M54613 = this.f9166.m54613();
            if (c16800M54613 == null) {
                return;
            }
            int length = interfaceC9629.length();
            C11974 c11974M39685 = c16800M54613.m39685();
            if (length == 0) {
                c1270M4615 = C1270.m4622();
            } else {
                c1270M4615 = C1270.m4615(length, c11974M39685, false);
            }
            m9159(c1270M4615, (C8246) null, false, (C6711) null, false);
            this.f9167.f32718 = true;
            if (m9210(interfaceC9629)) {
                m9204(interfaceC9629, false);
                return;
            }
            return;
        }
        m9174(interfaceC9629, false);
        if (m9194(interfaceC9629)) {
            C9494 c9494 = this.f9170;
            m9171(interfaceC9629, c9494.f30762, c9494.f30746, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9221(String str) {
        m9205(C9341.m24626(str));
        return this.f9166.m54613() != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9245(String str) {
        m9205(C9341.m24619(str));
        return this.f9166.m54613() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9222(C16800 c16800) {
        m9205(c16800);
        return this.f9166.m54613() != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16800 m9190(C2783 c2783) {
        return c2783.f9166.m54613();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16800 m9224() {
        return this.f9166.m54613();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m9226() {
        C16800 c16800M54613 = this.f9166.m54613();
        if (c16800M54613 != null) {
            return c16800M54613.m39682();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m9229() {
        C16800 c16800M54613 = this.f9166.m54613();
        return c16800M54613 == null ? "Text" : c16800M54613.m39683();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9235() {
        return this.f9166.m54613() != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 m9238() {
        C16800 c16800M54613 = this.f9166.m54613();
        if (c16800M54613 == null) {
            return null;
        }
        return c16800M54613.m39689();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0855 m9247() {
        C16800 c16800M54613 = this.f9166.m54613();
        if (c16800M54613 == null) {
            return null;
        }
        return c16800M54613.m39693();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m9184() {
        C20661 c20661M54614 = this.f9166.m54614();
        if (c20661M54614 == null || c20661M54614.m47282()) {
            return false;
        }
        C16800 c16800M54613 = this.f9166.m54613();
        C1270 c1270 = this.f9167.f32711;
        C10240 c10240 = this.f9167;
        Integer num = c10240.f32715;
        boolean z = c10240.f32718 && c1270 != null;
        C24413 c24413M54612 = C24413.m54612(c16800M54613);
        m9177(false, false, false);
        this.f9166 = c24413M54612;
        if (c24413M54612.m54614() != null) {
            m9160(c1270, null, false, null, true, num, false);
            this.f9167.f32718 = z;
        } else {
            this.f9167.f32718 = false;
            m9159((C1270) null, (C8246) null, false, (C6711) null, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m9200(CharSequence charSequence) {
        return (charSequence == null || this.f9166.m54614() == null || this.f9166.m54613() == null || !(charSequence instanceof InterfaceC9629) || this.f9172.m54021() != charSequence) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m9207(CharSequence charSequence) {
        return m9192(charSequence) && this.f9166.m54614() != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9249(InterfaceC9629 interfaceC9629, int i, int i2) {
        if (m9200((CharSequence) interfaceC9629)) {
            this.f9169.m43038(interfaceC9629, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9228(InterfaceC9629 interfaceC9629, int i, int i2) {
        if (!m9192((CharSequence) interfaceC9629) || i < 0 || i2 < 0) {
            return;
        }
        C17359.checkFromToIndex(i, i2, interfaceC9629.length());
        synchronized (this) {
            m9184();
            m9188(interfaceC9629, i, i2);
            C6711 c6711 = this.f9167.f32721;
            if (c6711 != null && c6711.m18741(i, i2)) {
                m9199(interfaceC9629, i, i2);
                return;
            }
            if (m9194(interfaceC9629)) {
                m9171(interfaceC9629, i, i2, false);
            } else {
                m9191(interfaceC9629, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m9199(InterfaceC9629 interfaceC9629, int i, int i2) {
        C9494 c9494 = this.f9170;
        if (c9494.f30758 != -1 && (!m9187(interfaceC9629) || !m9178(c9494.f30758, c9494.f30751, i, i2))) {
            this.f9169.m43046();
            c9494.f30766 = interfaceC9629;
            m9152();
        }
        if (c9494.f30755 != -1) {
            if (m9197() && m9178(c9494.f30755, c9494.f30764, i, i2)) {
                return;
            }
            m9196();
        }
    }
}
