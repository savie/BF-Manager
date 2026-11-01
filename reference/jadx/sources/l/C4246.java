package l;

import com.alipay.sdk.m.y.o;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4246 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1194 f15349;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6111 f15350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C1652 f15351;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13420 f15352;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22592 f15353 = new C22592();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5658 f15354;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11779 f15355;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m11930(C20889 c20889) {
        m11932(true, false, false);
        this.f15353.f73626 = false;
        this.f15351 = C1652.m5551(c20889);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11933(int i, int i2, int i3, int i4) {
        return i >= 0 && i <= i3 && i4 <= i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m11936(C11303 c11303) {
        C18128 c18128;
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        C1900 c1900M5553 = this.f15351.m5553();
        if (c11303.m28307()) {
            C3768 c3768 = c11303.f38156;
            if (c3768.f13629 == interfaceC2916M17000 && c3768.f13632 == c1900M5553 && c1900M5553.m6204()) {
                int i = c11303.f38153;
                C22592 c22592 = this.f15353;
                if (i == c22592.f73623 && !c22592.f73625) {
                    C18128 c18129 = c22592.f73629;
                    if (c18129 == null || !c18129.m42199(interfaceC2916M17000, c1900M5553, interfaceC2916M17000.mo2395(), interfaceC2916M17000.length())) {
                        int iMo2395 = interfaceC2916M17000.mo2395();
                        int length = interfaceC2916M17000.length();
                        C17175 c17175 = c11303.f38155;
                        c18128 = new C18128(interfaceC2916M17000, c1900M5553, iMo2395, length, c17175, c17175);
                    } else {
                        C17175 c17176 = c18129.f57956;
                        C17175 c17177 = c11303.f38155;
                        if (c17176 == c17177) {
                            return true;
                        }
                        c18128 = c18129.m42198(c17177);
                    }
                    C22592 c22593 = this.f15353;
                    c22593.f73629 = c18128.m42197(c22593.f73632);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m11954(InterfaceC0507 interfaceC0507) {
        C3498 c3498;
        m11940();
        if (!this.f15353.f73626) {
            return false;
        }
        if (m11934(interfaceC0507, interfaceC0507.mo2395()) && this.f15351.m5552() != null) {
            m11942();
            RunnableC2835 runnableC2835M11911 = m11911(interfaceC0507, interfaceC0507.mo2395(), this.f15354.f19331);
            C5658 c5658 = this.f15354;
            c5658.f19332 = true;
            c5658.f19333 = runnableC2835M11911;
            this.f15350.post(runnableC2835M11911);
            return true;
        }
        if (m11908(interfaceC0507)) {
            return false;
        }
        if (this.f15352.f44397 != null) {
            m11956();
        }
        if (m11962(interfaceC0507)) {
            m11949(interfaceC0507, false);
        } else if (m11907((CharSequence) interfaceC0507)) {
            if (!m11950(interfaceC0507)) {
                return false;
            }
            if (this.f15352.f44398 && m11941(interfaceC0507)) {
                int i = m11958(interfaceC0507) ? this.f15352.f44404 : this.f15352.f44406;
                int i2 = m11958(interfaceC0507) ? this.f15352.f44405 : this.f15352.f44390;
                m11952();
                m11915(interfaceC0507, i, i2, false);
            } else if (!m11941(interfaceC0507) && !m11953()) {
                if (m11958(interfaceC0507)) {
                    C3498 c3499 = this.f15353.f73632;
                    if (c3499 != null) {
                        C13420 c13420 = this.f15352;
                        if (c3499.m10289(c13420.f44404, c13420.f44405)) {
                            if (!m11958(interfaceC0507)) {
                                C13420 c13421 = this.f15352;
                                c13421.f44404 = -1;
                                c13421.f44405 = -1;
                                c13421.f44399 = 0;
                                c13421.f44400 = 0;
                                c13421.f44384 = null;
                                c3498 = this.f15353.f73632;
                                if (c3498 != null) {
                                    m11905(interfaceC0507, this.f15353.f73632.m10292(), this.f15353.f73632.m10286());
                                }
                            }
                        }
                    }
                    C13420 c13422 = this.f15352;
                    m11915(interfaceC0507, c13422.f44404, c13422.f44405, false);
                } else if (!m11958(interfaceC0507)) {
                    C13420 c13423 = this.f15352;
                    c13423.f44404 = -1;
                    c13423.f44405 = -1;
                    c13423.f44399 = 0;
                    c13423.f44400 = 0;
                    c13423.f44384 = null;
                    c3498 = this.f15353.f73632;
                    if (c3498 != null && c3498.m10284()) {
                        m11905(interfaceC0507, this.f15353.f73632.m10292(), this.f15353.f73632.m10286());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized void m11964(InterfaceC0507 interfaceC0507) {
        if (this.f15353.f73626 && this.f15350.isAttachedToWindow() && this.f15350.m17072() && !this.f15350.m17044()) {
            if (m11944((CharSequence) interfaceC0507)) {
                if (this.f15352.f44403 != interfaceC0507) {
                    m11949(interfaceC0507, true);
                }
            } else if (m11907((CharSequence) interfaceC0507) && m11958(interfaceC0507)) {
                C13420 c13420 = this.f15352;
                m11915(interfaceC0507, c13420.f44404, c13420.f44405, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11969() {
        if (this.f15352.f44403 != null) {
            m11932(false, false, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11974(C11018 c11018) {
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        C2087 c2087 = m11934(interfaceC2916M17000, interfaceC2916M17000.mo2395()) ? this.f15354.f19331 : null;
        C1652 c1652 = this.f15351;
        C7027 c7027 = this.f15353.f73624;
        C22592 c22592 = this.f15353;
        C2357 c2357 = c22592.f73628;
        boolean z = c22592.f73626;
        C22592 c22593 = this.f15353;
        C19064.m43828(c11018, c1652, c7027, c2357, z, c22593.f73625, c22593.f73632, c2087);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11975(int i, int i2) {
        C22592 c22592;
        C3498 c3498;
        c22592 = this.f15353;
        return c22592.f73625 || ((c3498 = c22592.f73632) != null && c3498.m10289(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11978(C17367 c17367, int i) {
        m11932(true, false, false);
        this.f15353.f73626 = false;
        C15537 c15537M43825 = C19064.m43825(i, this.f15350.m17000().length(), c17367);
        this.f15351 = c15537M43825.m37155();
        m11927(c15537M43825.m37151(), c15537M43825.m37152(), c15537M43825.m37156(), c15537M43825.m37153(), false);
        this.f15353.f73626 = c15537M43825.m37150();
        C2087 c2087M37154 = c15537M43825.m37154();
        if (this.f15353.f73626 && c2087M37154 != null) {
            InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
            m11942();
            m11951();
            C5658 c5658 = this.f15354;
            c5658.f19331 = c2087M37154;
            c5658.f19325 = true;
            c5658.f19326 = interfaceC2916M17000.mo2395();
            c5658.f19336 = interfaceC2916M17000.length();
            c5658.f19329 = interfaceC2916M17000;
            c5658.f19328 = false;
            c5658.f19332 = false;
        } else if (this.f15353.f73626 && c15537M43825.m37153() != null) {
            m11917(this.f15350.m17000(), c15537M43825.m37153());
        }
        return this.f15353.f73626;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11983() {
        m11932(true, false, false);
        this.f15353.f73630 = null;
        this.f15353.f73631 = null;
        this.f15353.f73622 = null;
        this.f15353.f73626 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11984() {
        m11930((C20889) null);
        this.f15353.f73626 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized long m11989() {
        if (this.f15350.m16968() && !this.f15350.m17044()) {
            InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
            if (m11934(interfaceC2916M17000, interfaceC2916M17000.mo2395())) {
                return -1L;
            }
            if (this.f15351.m5552() != null && m12000() == null) {
                return -1L;
            }
            C22592 c22592 = this.f15353;
            C3498 c3498 = c22592.f73632;
            if (c3498 != null) {
                if (m11958(this.f15350.m17000()) && c3498.m10284()) {
                    return (((long) c3498.m10292()) << 32) | (((long) c3498.m10286()) & 4294967295L);
                }
                return -1L;
            }
            if (c22592.f73624 != null && !this.f15353.f73625) {
                return -1L;
            }
            C13420 c13420 = this.f15352;
            return (c13420.f44406 == -1 && c13420.f44407 == -1 && !m11958(this.f15350.m17000())) ? Long.MIN_VALUE : -1L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11990(CharSequence charSequence) {
        if (m11939(charSequence)) {
            m11946((InterfaceC0507) charSequence);
            return;
        }
        if (this.f15350.m17000() == charSequence) {
            m11932(true, false, false);
            this.f15353.f73626 = false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11991(InterfaceC0507 interfaceC0507, int i, int i2) {
        if (this.f15353.f73626 && this.f15352.f44391 == interfaceC0507 && m11944((CharSequence) interfaceC0507) && i < i2 && i2 <= interfaceC0507.length()) {
            m11910(interfaceC0507, interfaceC0507.mo2395(), C2087.m6618(-1, -1, i, i2), EnumC12009.MERGE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11992(int i, int i2) {
        boolean z;
        InterfaceC0507 interfaceC0507M17000 = this.f15350.m17000();
        if (!m11961((CharSequence) interfaceC0507M17000)) {
            return false;
        }
        if (i >= 0 && i <= i2 && i2 <= interfaceC0507M17000.length()) {
            if (m11941(interfaceC0507M17000)) {
                C13420 c13420 = this.f15352;
                return !m11933(c13420.f44406, c13420.f44390, i, i2);
            }
            if (m11953()) {
                C13420 c13421 = this.f15352;
                return !m11933(c13421.f44407, c13421.f44386, i, i2);
            }
            C3498 c3498 = this.f15353.f73632;
            if (c3498 != null && c3498.m10289(i, i2)) {
                return false;
            }
            if (m11958(interfaceC0507M17000)) {
                C13420 c13422 = this.f15352;
                z = m11933(c13422.f44404, c13422.f44405, i, i2) ? false : true;
            }
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11994(InterfaceC0507 interfaceC0507) {
        C3498 c3498;
        m11940();
        if (m11961((CharSequence) interfaceC0507)) {
            if (!m11958(interfaceC0507) && !m11941(interfaceC0507) && !m11953() && ((c3498 = this.f15353.f73632) == null || c3498.m10291().m18860() != interfaceC0507.length())) {
                m11918(interfaceC0507, false);
            }
            m11954(interfaceC0507);
            return false;
        }
        if (!m11944((CharSequence) interfaceC0507)) {
            return true;
        }
        C7027 c7027 = this.f15353.f73624;
        if (this.f15353.f73632 != null || c7027 == null || c7027.m18860() != interfaceC0507.length()) {
            m11946(interfaceC0507);
        } else if (!this.f15353.f73625 && m11962(interfaceC0507)) {
            m11949(interfaceC0507, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m11995() {
        return this.f15353.f73625;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11997() {
        m11932(false, true, true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized void m12001(InterfaceC0507 interfaceC0507) {
        int iM10292;
        if (this.f15353.f73626 && this.f15352.f44391 == interfaceC0507 && this.f15353.f73624 != null && this.f15353.f73624.m18860() == interfaceC0507.length() && interfaceC0507.length() != 0) {
            int length = interfaceC0507.length();
            if (!m11944((CharSequence) interfaceC0507)) {
                C3498 c3498 = this.f15353.f73632;
                if (m11907((CharSequence) interfaceC0507) && c3498 != null && c3498.m10284()) {
                    iM10292 = c3498.m10292();
                    length = c3498.m10286();
                }
                return;
            }
            iM10292 = 0;
            m11942();
            m11910(interfaceC0507, interfaceC0507.mo2395(), C2087.m6618(-1, -1, iM10292, length), EnumC12009.MERGE);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11970(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (i2 == 0 && i3 == 0) {
                this.f15349.f5296 = false;
                return;
            }
            m11940();
            C20889 c20889M5552 = this.f15351.m5552();
            if (c20889M5552 != null && this.f15353.f73626 && (charSequence instanceof InterfaceC0507)) {
                InterfaceC0507 interfaceC0507 = (InterfaceC0507) charSequence;
                if (m11939((CharSequence) interfaceC0507)) {
                    boolean zM17044 = this.f15350.m17044();
                    C18128 c18128 = this.f15353.f73629;
                    if (c18128 != null) {
                        this.f15353.f73629 = zM17044 ? null : c18128.m42196(interfaceC0507, this.f15351.m5553(), interfaceC0507.mo2395(), interfaceC0507.length(), i, i2, i3, (i <= 0 || this.f15353.f73624 == null || i > this.f15353.f73624.m18860()) ? c20889M5552.m46969() : this.f15353.f73624.m18863(i - 1));
                    }
                    m11914(interfaceC0507, i, i2, i3, zM17044);
                    m11913(interfaceC0507, i, i2, i3, c20889M5552, zM17044);
                    return;
                }
            }
            this.f15349.f5296 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4246(C6111 c6111, C0219 c0219) {
        C13420 c13420 = new C13420();
        c13420.f44406 = -1;
        c13420.f44390 = -1;
        c13420.f44404 = -1;
        c13420.f44405 = -1;
        c13420.f44407 = -1;
        c13420.f44386 = -1;
        this.f15352 = c13420;
        C5658 c5658 = new C5658();
        C2087 c2087 = C2087.f7716;
        c5658.f19337 = c2087;
        c5658.f19331 = c2087;
        this.f15354 = c5658;
        this.f15349 = new C1194();
        this.f15350 = c6111;
        this.f15355 = new C11779(new ExecutorC4952(c6111), new C14126(this, c6111));
        m11930((C20889) null);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7027 m12002() {
        return this.f15353.f73624;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11924(C4246 c4246, C11303 c11303) {
        if (c4246.m11936(c11303)) {
            c4246.f15350.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11973(C3063 c3063, int i, int i2) {
        int iM10286;
        int iM10292 = -1;
        c3063.m9186((C17175) null, -1, -1, 0);
        C11303 c11303M29444 = this.f15355.m29444();
        C18128 c18128 = this.f15353.f73629;
        if (c11303M29444 == null && c18128 == null) {
            return;
        }
        C1900 c1900M5553 = this.f15351.m5553();
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        if (this.f15353.f73626 && c1900M5553 != null && c1900M5553.m6204() && this.f15350.isAttachedToWindow() && this.f15350.m16968() && !this.f15350.m17044() && !this.f15353.f73625) {
            if (c11303M29444 != null && (c18128 == null || c18128.f57956 != c11303M29444.f38155)) {
                m11936(c11303M29444);
                c18128 = this.f15353.f73629;
            }
            if (c18128 == null || !c18128.m42199(interfaceC2916M17000, c1900M5553, interfaceC2916M17000.mo2395(), interfaceC2916M17000.length())) {
                return;
            }
            C17175 c17175 = c18128.f57958;
            if (c17175.f54750 <= i || c17175.f54749 >= i2) {
                return;
            }
            C3498 c3498 = this.f15353.f73632;
            if (c3498 == null || !c3498.m10284()) {
                iM10286 = -1;
            } else {
                iM10292 = c3498.m10292();
                iM10286 = c3498.m10286();
                if (iM10292 <= Math.max(i, c17175.f54749) && Math.min(i2, c17175.f54750) <= iM10286) {
                    return;
                }
            }
            c3063.m9186(c17175, iM10292, iM10286, c1900M5553.f7174.m37379());
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m11982() {
        this.f15350.m16924();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7027 m11963() {
        if (!this.f15353.f73626) {
            return null;
        }
        C1900 c1900M5553 = this.f15351.m5553();
        C1424 c1424 = this.f15353.f73622;
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        if (c1424 != null && c1900M5553 != null && c1900M5553.m6204() && c1424.f5875 == interfaceC2916M17000 && c1424.f5877 == c1900M5553 && c1424.f5874 == interfaceC2916M17000.mo2395() && c1424.f5873 == interfaceC2916M17000.length()) {
            return c1424.f5876;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12942 m12000() {
        if (!this.f15353.f73626) {
            return null;
        }
        C12942 c12942 = this.f15353.f73630;
        C1900 c1900M5553 = this.f15351.m5553();
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        if (c12942 == null || c1900M5553 == null || !c1900M5553.m6204() || !c12942.m32069(interfaceC2916M17000, c1900M5553)) {
            return null;
        }
        return c12942;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12942 m11968() {
        if (!this.f15353.f73626) {
            return null;
        }
        C12942 c12942 = this.f15353.f73631;
        C1900 c1900M5553 = this.f15351.m5553();
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        if (c12942 == null || c1900M5553 == null || !c1900M5553.m6204() || !c12942.m32069(interfaceC2916M17000, c1900M5553)) {
            return null;
        }
        return c12942;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11966(InterfaceC0507 interfaceC0507) {
        boolean z;
        C24003 c24003;
        C3540 c3540;
        C3540 c3540M29431;
        C24003 c24003M29443;
        synchronized (this) {
            z = false;
            if (this.f15352.f44403 != interfaceC0507 || m11940()) {
                c24003 = null;
                c3540 = null;
            } else {
                C13420 c13420 = this.f15352;
                c13420.f44402 = true;
                c24003 = c13420.f44392;
                c3540 = c13420.f44393;
                if (c24003 == null && (c24003M29443 = this.f15355.m29443()) != null && this.f15355.m29441(c24003M29443)) {
                    c24003 = c24003M29443;
                }
                if (c3540 == null && (c3540M29431 = this.f15355.m29431()) != null && this.f15355.m29439(c3540M29431)) {
                    c3540 = c3540M29431;
                }
                if (c24003 != null || c3540 != null) {
                    m11945();
                } else {
                    C13420 c13421 = this.f15352;
                    if (c13421.f44394 || c13421.f44398) {
                        m11945();
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (c24003 != null) {
            m11931(c24003);
            return;
        }
        if (c3540 != null) {
            m11919(c3540);
        } else if (z) {
            this.f15350.m17063();
        } else {
            if (m11954(interfaceC0507)) {
                return;
            }
            this.f15350.m17063();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m11998() {
        this.f15350.m16935();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11986(InterfaceC0507 interfaceC0507) {
        boolean z;
        RunnableC2835 runnableC2835M11911;
        synchronized (this) {
            boolean z2 = true;
            z = false;
            if (m11934(interfaceC0507, interfaceC0507.mo2395()) && this.f15351.m5552() != null) {
                m11942();
                runnableC2835M11911 = m11911(interfaceC0507, interfaceC0507.mo2395(), this.f15354.f19331);
                C5658 c5658 = this.f15354;
                boolean z3 = c5658.f19332;
                C13420 c13420 = this.f15352;
                if ((!c13420.f44394 || c13420.f44391 != interfaceC0507) && (!c13420.f44398 || !m11941(interfaceC0507))) {
                    z2 = false;
                }
                c5658.f19332 = z2 | z3;
                this.f15354.f19333 = runnableC2835M11911;
            } else {
                C13420 c13421 = this.f15352;
                if ((!c13421.f44394 || c13421.f44391 != interfaceC0507) && (!c13421.f44398 || !m11941(interfaceC0507))) {
                    z2 = false;
                }
                runnableC2835M11911 = null;
                z = z2;
            }
        }
        if (runnableC2835M11911 == null) {
            if (z) {
                m11954(interfaceC0507);
            }
            this.f15350.m17063();
        } else {
            C6111 c6111 = this.f15350;
            c6111.postInvalidate();
            c6111.post(runnableC2835M11911);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11972(InterfaceC0507 interfaceC0507, int i, int i2) {
        C3498 c3498;
        C3498 c3499;
        this.f15355.m29435(interfaceC0507, i, i2);
        synchronized (this) {
            if (this.f15353.f73626 && this.f15350.isAttachedToWindow() && !this.f15350.m17044() && this.f15352.f44391 == interfaceC0507) {
                if (m11944((CharSequence) interfaceC0507) && this.f15353.f73625) {
                    return;
                }
                if (i2 <= i || !m11907((CharSequence) interfaceC0507) || (c3499 = this.f15353.f73632) == null || !c3499.m10289(i, i2)) {
                    if (i2 > i && m11907((CharSequence) interfaceC0507) && ((c3498 = this.f15353.f73632) == null || !c3498.m10289(i, i2))) {
                        m11915(interfaceC0507, i, i2, this.f15350.m17072());
                    }
                    C11779 c11779 = this.f15355;
                    c11779.m29434(c11779.m29432(interfaceC0507));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11971(InterfaceC0507 interfaceC0507) {
        if (m11954(interfaceC0507)) {
            return;
        }
        this.f15350.m17063();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m11944(CharSequence charSequence) {
        return m11939(charSequence) && charSequence.length() <= 1000000;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m11961(CharSequence charSequence) {
        return m11939(charSequence) && charSequence.length() > 1000000;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m11962(InterfaceC0507 interfaceC0507) {
        if (!m11944((CharSequence) interfaceC0507)) {
            return false;
        }
        C6111 c6111 = this.f15350;
        return c6111.isAttachedToWindow() && c6111.m16968() && !c6111.m17044();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private boolean m11950(InterfaceC0507 interfaceC0507) {
        if (!m11907((CharSequence) interfaceC0507)) {
            return false;
        }
        C6111 c6111 = this.f15350;
        return c6111.isAttachedToWindow() && c6111.m16968() && !c6111.m17044();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m11949(InterfaceC0507 interfaceC0507, boolean z) {
        if (m11955(interfaceC0507) || m11908(interfaceC0507)) {
            return;
        }
        if (this.f15352.f44397 != null) {
            m11956();
        }
        m11945();
        C13420 c13420 = this.f15352;
        c13420.f44394 = false;
        c13420.f44391 = interfaceC0507;
        if (z) {
            c13420.f44403 = interfaceC0507;
        }
        this.f15355.m29438(this.f15351.m5553(), interfaceC0507, this.f15353.f73624, this.f15353.f73623);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11915(InterfaceC0507 interfaceC0507, int i, int i2, boolean z) {
        if (z || m11950(interfaceC0507)) {
            m11905(interfaceC0507, i, i2);
            if (m11955(interfaceC0507)) {
                return;
            }
            if (m11941(interfaceC0507)) {
                C13420 c13420 = this.f15352;
                if (c13420.f44406 <= i && i2 <= c13420.f44390) {
                    return;
                }
            }
            if (m11953()) {
                C13420 c13421 = this.f15352;
                if (c13421.f44407 <= i && i2 <= c13421.f44386) {
                    return;
                }
            }
            m11904();
            m11945();
            if (z) {
                this.f15352.f44403 = interfaceC0507;
            }
            C13420 c13422 = this.f15352;
            c13422.f44391 = interfaceC0507;
            c13422.f44406 = i;
            c13422.f44390 = i2;
            c13422.f44408 = interfaceC0507.mo2395();
            this.f15352.f44401 = interfaceC0507.length();
            C13420 c13423 = this.f15352;
            c13423.f44387 = this.f15353.f73623;
            c13423.f44398 = false;
            this.f15355.m29445(this.f15351.m5553(), interfaceC0507, i, i2, this.f15353.f73623);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m11960(InterfaceC0507 interfaceC0507, int i, int i2) {
        boolean zM11941 = m11941(interfaceC0507);
        C13420 c13420 = this.f15352;
        if ((!zM11941 || !m11933(c13420.f44406, c13420.f44390, i, i2)) && c13420.f44406 != -1) {
            this.f15355.m29442();
            m11952();
        }
        if (c13420.f44407 != -1 && (!m11953() || !m11933(c13420.f44407, c13420.f44386, i, i2))) {
            m11904();
        }
        c13420.f44391 = interfaceC0507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11918(InterfaceC0507 interfaceC0507, boolean z) {
        m11932(false, false, false);
        C3498 c3498M10283 = C3498.m10283(interfaceC0507.length(), this.f15351.m5552().m46969());
        m11927(c3498M10283.m10291(), (C2357) null, false, c3498M10283, z);
        m11905(interfaceC0507, 0, Math.min(interfaceC0507.length(), 10000));
        this.f15353.f73626 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11932(boolean z, boolean z2, boolean z3) {
        if (z || !z3) {
            this.f15353.f73629 = null;
        }
        this.f15355.m29433();
        C13420 c13420 = this.f15352;
        c13420.f44394 = false;
        c13420.f44391 = null;
        m11945();
        m11952();
        if (!z2) {
            m11956();
            m11904();
        }
        if (!z3) {
            C13420 c13421 = this.f15352;
            c13421.f44404 = -1;
            c13421.f44405 = -1;
            c13421.f44399 = 0;
            c13421.f44400 = 0;
            c13421.f44384 = null;
            m11951();
        }
        if (z) {
            this.f15353.f73626 = false;
            m11927((C7027) null, (C2357) null, false, (C3498) null, false);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11952() {
        C13420 c13420 = this.f15352;
        c13420.f44406 = -1;
        c13420.f44390 = -1;
        c13420.f44408 = 0;
        c13420.f44401 = 0;
        c13420.f44387 = 0;
        c13420.f44398 = false;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m11904() {
        C13420 c13420 = this.f15352;
        c13420.f44407 = -1;
        c13420.f44386 = -1;
        c13420.f44389 = 0;
        c13420.f44396 = 0;
        c13420.f44385 = null;
        c13420.getClass();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m11956() {
        C13420 c13420 = this.f15352;
        c13420.f44388 = 0;
        c13420.f44395 = 0;
        c13420.f44397 = null;
        c13420.getClass();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m11945() {
        C13420 c13420 = this.f15352;
        c13420.f44403 = null;
        c13420.f44392 = null;
        c13420.f44393 = null;
        c13420.f44402 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m11905(InterfaceC0507 interfaceC0507, int i, int i2) {
        C13638.checkFromToIndex(i, i2, interfaceC0507.length());
        C13420 c13420 = this.f15352;
        c13420.f44404 = i;
        c13420.f44405 = i2;
        c13420.f44399 = interfaceC0507.mo2395();
        c13420.f44400 = interfaceC0507.length();
        c13420.f44384 = interfaceC0507;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m11958(InterfaceC0507 interfaceC0507) {
        C13420 c13420 = this.f15352;
        return c13420.f44384 == interfaceC0507 && c13420.f44404 != -1 && c13420.f44399 == interfaceC0507.mo2395() && c13420.f44400 == interfaceC0507.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m11917(InterfaceC0507 interfaceC0507, C3498 c3498) {
        C5658 c5658 = this.f15354;
        c5658.f19330 = c3498;
        c5658.f19337 = C2087.m6618(-1, -1, c3498.m10292(), c3498.m10286());
        c5658.f19327 = interfaceC0507.mo2395();
        c5658.f19335 = interfaceC0507.length();
        c5658.f19334 = interfaceC0507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11921(C4246 c4246, InterfaceC0507 interfaceC0507, C2087 c2087) {
        C5658 c5658 = c4246.f15354;
        c5658.f19330 = null;
        c5658.f19337 = c2087;
        c5658.f19327 = interfaceC0507.mo2395();
        c5658.f19335 = interfaceC0507.length();
        c5658.f19334 = interfaceC0507;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m11951() {
        C5658 c5658 = this.f15354;
        c5658.f19330 = null;
        c5658.f19337 = C2087.f7716;
        c5658.f19327 = 0;
        c5658.f19335 = 0;
        c5658.f19334 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m11957() {
        m11942();
        C2087 c2087 = C2087.f7716;
        C5658 c5658 = this.f15354;
        c5658.f19331 = c2087;
        c5658.f19325 = false;
        c5658.f19326 = 0;
        c5658.f19336 = 0;
        c5658.f19329 = null;
        c5658.f19328 = false;
        c5658.f19332 = false;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m11942() {
        C5658 c5658 = this.f15354;
        RunnableC2835 runnableC2835 = c5658.f19333;
        c5658.f19333 = null;
        if (runnableC2835 != null) {
            this.f15350.removeCallbacks(runnableC2835);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m11934(InterfaceC0507 interfaceC0507, int i) {
        C5658 c5658 = this.f15354;
        return c5658.f19325 && c5658.f19329 == interfaceC0507 && c5658.f19326 == i && c5658.f19336 == interfaceC0507.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2087 m11910(InterfaceC0507 interfaceC0507, int i, C2087 c2087, EnumC12009 enumC12009) {
        boolean zM11934 = m11934(interfaceC0507, i);
        C5658 c5658 = this.f15354;
        if (!zM11934) {
            c5658.f19328 = false;
            c5658.f19332 = false;
        }
        if (enumC12009 != EnumC12009.REPLACE && zM11934) {
            c2087 = c5658.f19331.m6620(c2087);
        }
        c5658.f19331 = c2087;
        c5658.f19325 = true;
        c5658.f19326 = i;
        c5658.f19336 = interfaceC0507.length();
        c5658.f19329 = interfaceC0507;
        return c2087;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11914(InterfaceC0507 interfaceC0507, int i, int i2, int i3, boolean z) {
        int i4;
        m11942();
        long length = (((long) interfaceC0507.length()) - ((long) i3)) + ((long) i2);
        int iMo2395 = interfaceC0507.mo2395();
        if (length >= 0 && length <= 2147483647L) {
            C5658 c5658 = this.f15354;
            if (c5658.f19325 && c5658.f19329 == interfaceC0507 && c5658.f19336 == (i4 = (int) length) && c5658.f19326 + 1 == iMo2395) {
                if (c5658.f19331.m6624() == null || z) {
                    m11957();
                    return;
                }
                C2087 c2087M6619 = c5658.f19331.m6619(i4, i, i2, i3);
                if (c2087M6619.m6624() == null) {
                    m11957();
                    return;
                }
                c5658.f19331 = c2087M6619;
                c5658.f19326 = iMo2395;
                c5658.f19336 = interfaceC0507.length();
                c5658.f19329 = interfaceC0507;
                return;
            }
        }
        m11957();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m11955(InterfaceC0507 interfaceC0507) {
        return this.f15354.f19332 && !this.f15350.m17072() && m11934(interfaceC0507, interfaceC0507.mo2395());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m11941(InterfaceC0507 interfaceC0507) {
        C13420 c13420 = this.f15352;
        return c13420.f44391 == interfaceC0507 && c13420.f44406 != -1 && c13420.f44408 == interfaceC0507.mo2395() && c13420.f44401 == interfaceC0507.length();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m11953() {
        InterfaceC2916 interfaceC2916M17000;
        C13420 c13420 = this.f15352;
        return c13420.f44407 != -1 && c13420.f44385 == (interfaceC2916M17000 = this.f15350.m17000()) && c13420.f44389 == interfaceC2916M17000.mo2395() && c13420.f44396 == interfaceC2916M17000.length();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m11908(InterfaceC0507 interfaceC0507) {
        C13420 c13420 = this.f15352;
        return c13420.f44397 == interfaceC0507 && c13420.f44388 == interfaceC0507.mo2395() && c13420.f44395 == interfaceC0507.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11913(InterfaceC0507 interfaceC0507, int i, int i2, int i3, C20889 c20889, boolean z) {
        C7027 c7027M18851;
        C7027 c7027M18852;
        boolean z2;
        int i4;
        int i5;
        int iM24953;
        int iM24954;
        C3498 c3498M10283;
        boolean z3;
        C2087 c2087M11909 = C2087.f7716;
        long j = i3;
        long j2 = i2;
        long length = (((long) interfaceC0507.length()) - j) + j2;
        if (length >= 0 && length <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0) {
            long j3 = ((long) i) + j2;
            if (j3 <= length) {
                int i6 = (int) length;
                if (interfaceC0507.length() <= 1000000) {
                    C7027 c7027 = this.f15353.f73624;
                    C22592 c22592 = this.f15353;
                    Integer num = c22592.f73627;
                    boolean z4 = c22592.f73632 == null && c7027 != null && c7027.m18860() == i6;
                    if (z || !z4) {
                        if (!z) {
                            c2087M11909 = m11909(interfaceC0507, i6, i, i2, i3, c20889);
                        }
                        m11932(false, false, false);
                        int length2 = interfaceC0507.length();
                        C15682 c15682M46969 = c20889.m46969();
                        if (length2 == 0) {
                            c7027M18851 = C7027.m18855();
                        } else {
                            c7027M18851 = C7027.m18851(length2, c15682M46969, false);
                        }
                        m11927(c7027M18851, (C2357) null, false, (C3498) null, !z);
                        this.f15353.f73626 = true;
                        if (!z) {
                            m11916(interfaceC0507, c2087M11909);
                        }
                        C1194 c1194 = this.f15349;
                        c1194.f5296 = false;
                        c1194.f5297 = i;
                        c1194.f5295 = i + i3;
                        return;
                    }
                    try {
                        C15682 c15682M469610 = (i <= 0 || i3 <= 0) ? c20889.m46969() : c7027.m18863(i - 1);
                        int i7 = i + i2;
                        if (i3 == 0) {
                            c7027M18852 = C7027.m18855();
                        } else {
                            c7027M18852 = C7027.m18851(i3, c15682M469610, false);
                        }
                        m11928(c7027.m18861(i, i7, c7027M18852), null, false, null, true, num, false);
                        this.f15353.f73626 = true;
                        C1194 c1195 = this.f15349;
                        c1195.f5296 = false;
                        c1195.f5297 = i;
                        c1195.f5295 = i + i3;
                        m11945();
                        if (m11955(interfaceC0507) || m11908(interfaceC0507)) {
                            return;
                        }
                        if (this.f15352.f44397 != null) {
                            m11956();
                        }
                        boolean z5 = this.f15350.m17072() && this.f15350.isAttachedToWindow() && !this.f15350.m17044();
                        if (!z5 && !m11962(interfaceC0507)) {
                            if (this.f15350.m17044()) {
                                m11932(false, false, false);
                                return;
                            }
                            return;
                        }
                        C13420 c13420 = this.f15352;
                        if (c13420.f44391 != interfaceC0507) {
                            m11949(interfaceC0507, false);
                            return;
                        }
                        c13420.f44394 = false;
                        if (z5) {
                            c13420.f44403 = interfaceC0507;
                        }
                        this.f15355.m29437(this.f15351.m5553(), interfaceC0507, i, i2, i3, this.f15353.f73624, this.f15353.f73623);
                        return;
                    } catch (RuntimeException unused) {
                        m11946(interfaceC0507);
                        C1194 c1196 = this.f15349;
                        c1196.f5296 = true;
                        c1196.f5297 = 0;
                        c1196.f5295 = interfaceC0507.length();
                        return;
                    }
                }
                if (i6 > 1000000 && m11961((CharSequence) interfaceC0507)) {
                    long length3 = (((long) interfaceC0507.length()) - j) + j2;
                    if (length3 >= 0 && length3 <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0 && j3 <= length3) {
                        int i8 = (int) length3;
                        int iMo2395 = interfaceC0507.mo2395();
                        C13420 c13421 = this.f15352;
                        if (c13421.f44384 == interfaceC0507 && (i4 = c13421.f44404) != -1 && c13421.f44400 == i8 && c13421.f44399 + 1 == iMo2395) {
                            i5 = c13421.f44405;
                        } else if (c13421.f44391 == interfaceC0507 && (i4 = c13421.f44406) != -1 && c13421.f44401 == i8 && c13421.f44408 + 1 == iMo2395) {
                            i5 = c13421.f44390;
                        } else if (c13421.f44385 == interfaceC0507 && (i4 = c13421.f44407) != -1 && c13421.f44396 == i8 && c13421.f44389 + 1 == iMo2395) {
                            i5 = c13421.f44386;
                        }
                        int i9 = i5;
                        int i10 = i4;
                        C7027 c7028 = this.f15353.f73624;
                        if (c7028 != null) {
                            if (this.f15353.f73632 != null && c7028.m18860() == i8 && this.f15353.f73632.m10291() == c7028) {
                                if (m11950(interfaceC0507)) {
                                    C9850 c9850M10288 = this.f15353.f73632.m10288(i, i2, i3, i10, i9, c20889.m46969());
                                    c3498M10283 = c9850M10288.m24952();
                                    iM24953 = c9850M10288.m24953();
                                    iM24954 = c9850M10288.m24954();
                                } else {
                                    long jM10280 = C3498.m10280(i8, i, i2, i3, i10, i9);
                                    iM24953 = (int) (jM10280 >>> 32);
                                    iM24954 = (int) jM10280;
                                    c3498M10283 = C3498.m10283(interfaceC0507.length(), c20889.m46969());
                                }
                            }
                        } else {
                            long jM10281 = C3498.m10280(i8, i, i2, i3, i10, i9);
                            iM24953 = (int) (jM10281 >>> 32);
                            iM24954 = (int) jM10281;
                            c3498M10283 = C3498.m10283(interfaceC0507.length(), c20889.m46969());
                        }
                        int i11 = iM24954;
                        C3498 c3498 = c3498M10283;
                        int i12 = iM24953;
                        boolean zM17044 = this.f15350.m17044();
                        C5658 c5658 = this.f15354;
                        C2087 c2087 = (c5658.f19334 == interfaceC0507 && c5658.f19335 == i8 && c5658.f19327 + 1 == iMo2395) ? c5658.f19337 : null;
                        c5658.f19330 = null;
                        if (c2087 == null) {
                            m11951();
                        } else {
                            if (!zM17044) {
                                c2087M11909 = c2087.m6619(i8, i, i2, i3);
                            }
                            c5658.f19337 = c2087M11909;
                            c5658.f19327 = iMo2395;
                            c5658.f19335 = interfaceC0507.length();
                            c5658.f19334 = interfaceC0507;
                        }
                        this.f15355.m29436(this.f15351.m5553(), interfaceC0507, i, i2, i3);
                        this.f15352.f44391 = interfaceC0507;
                        m11952();
                        m11904();
                        if (c3498 != null) {
                            m11927(c3498.m10291(), (C2357) null, false, c3498, true);
                        }
                        m11905(interfaceC0507, i12, i11);
                        if (m11950(interfaceC0507)) {
                            z3 = false;
                            m11915(interfaceC0507, i12, i11, false);
                        } else {
                            z3 = false;
                        }
                        C1194 c1197 = this.f15349;
                        c1197.f5296 = z3;
                        c1197.f5297 = i;
                        c1197.f5295 = i + i3;
                        return;
                    }
                }
                if (z) {
                    z2 = false;
                    m11918(interfaceC0507, false);
                } else {
                    C2087 c2087M119010 = m11909(interfaceC0507, i6, i, i2, i3, c20889);
                    m11918(interfaceC0507, true);
                    m11916(interfaceC0507, c2087M119010);
                    z2 = false;
                }
                C1194 c1198 = this.f15349;
                c1198.f5296 = z2;
                c1198.f5297 = i;
                c1198.f5295 = i + i3;
                return;
            }
        }
        m11946(interfaceC0507);
        C1194 c1199 = this.f15349;
        c1199.f5296 = true;
        c1199.f5297 = 0;
        c1199.f5295 = interfaceC0507.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2087 m11909(InterfaceC0507 interfaceC0507, int i, int i2, int i3, int i4, C20889 c20889) {
        C7027 c7027M18851;
        C2087 c2087M6618 = C2087.f7716;
        C22592 c22592 = this.f15353;
        C3498 c3498 = c22592.f73632;
        if (c3498 != null) {
            int iMo2395 = interfaceC0507.mo2395();
            C5658 c5658 = this.f15354;
            if (c5658.f19334 == interfaceC0507 && c5658.f19327 + 1 == iMo2395 && c5658.f19335 == i) {
                c2087M6618 = c5658.f19337;
            } else if (c3498.m10284()) {
                c2087M6618 = C2087.m6618(-1, -1, c3498.m10292(), c3498.m10286());
            }
        } else {
            C7027 c7027 = c22592.f73624;
            if (c7027 != null && c7027.m18860() == i) {
                C15682 c15682M46969 = c20889.m46969();
                if (i == 0) {
                    c7027M18851 = C7027.m18855();
                } else {
                    c7027M18851 = C7027.m18851(i, c15682M46969, false);
                }
                C22550 c22550M18867 = c7027.m18867(c7027M18851);
                if (c22550M18867 != null) {
                    c2087M6618 = C2087.m6618(-1, -1, c22550M18867.m50065(), c22550M18867.m50064());
                }
            } else {
                c2087M6618 = C2087.m6618(-1, -1, 0, i);
            }
        }
        return c2087M6618.m6619(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11916(InterfaceC0507 interfaceC0507, C2087 c2087) {
        RunnableC2835 runnableC2835M11947 = m11947(interfaceC0507, interfaceC0507.mo2395(), c2087, EnumC12009.MERGE);
        if (runnableC2835M11947 == null) {
            m11954(interfaceC0507);
            return;
        }
        boolean z = this.f15353.f73632 != null;
        C5658 c5658 = this.f15354;
        c5658.f19328 = z;
        c5658.f19332 = true;
        C6111 c6111 = this.f15350;
        c6111.postInvalidate();
        c6111.post(runnableC2835M11947);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11927(C7027 c7027, C2357 c2357, boolean z, C3498 c3498, boolean z2) {
        C1652 c1652 = this.f15351;
        C1900 c1900M5553 = c1652 == null ? null : c1652.m5553();
        m11928(c7027, c2357, z, c3498, z2, c1900M5553 != null ? Integer.valueOf(c1900M5553.m6197()) : null, false);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11928(C7027 c7027, C2357 c2357, boolean z, C3498 c3498, boolean z2, Integer num, boolean z3) {
        C12942 c12942M32062;
        C1424 c1424;
        C12942 c12942M32061;
        if (c3498 != null && c3498.m10291() != c7027) {
            throw new IllegalArgumentException("Window projection does not own visible store");
        }
        if (z && (c7027 == null || c2357 == null || c3498 != null || c2357.m7174() != c7027.m18860())) {
            throw new IllegalArgumentException("Invalid complete syntax display");
        }
        if (!z && c2357 != null) {
            throw new IllegalArgumentException("Incomplete syntax display cannot expose full contexts");
        }
        if (z2) {
            m11942();
        } else {
            m11957();
        }
        C1652 c1652 = this.f15351;
        C1900 c1900M5553 = c1652 == null ? null : c1652.m5553();
        InterfaceC2916 interfaceC2916M17000 = this.f15350.m17000();
        C18128 c18128 = this.f15353.f73629;
        if (c18128 != null) {
            this.f15353.f73629 = (z || c7027 == null || !c18128.m42199(interfaceC2916M17000, c1900M5553, interfaceC2916M17000.mo2395(), interfaceC2916M17000.length())) ? null : c18128.m42197(c3498);
        }
        if (c1900M5553 != null && c7027 != null) {
            if (z) {
                C13638.requireNonNull(c2357);
                c12942M32062 = C12942.m32061(interfaceC2916M17000, c1900M5553, c7027, c2357);
            } else if (c3498 == null || !c3498.m10293()) {
                c12942M32062 = null;
            } else {
                C2357 c2357M10285 = c3498.m10285();
                C13638.requireNonNull(c2357M10285);
                c12942M32062 = C12942.m32062(interfaceC2916M17000, c1900M5553, c7027, c2357M10285, c3498.m10292(), c3498.m10286());
            }
            if (num != null && num.intValue() == c1900M5553.m6197() && c7027.m18860() == interfaceC2916M17000.length()) {
                c1424 = new C1424(interfaceC2916M17000, c1900M5553, c7027);
                if (c12942M32062 == null && !c1900M5553.m6206()) {
                    c12942M32061 = C12942.m32061(interfaceC2916M17000, c1900M5553, c7027, C2357.m7157(interfaceC2916M17000.length(), c1900M5553.f7183));
                }
            } else {
                c12942M32061 = null;
                c1424 = null;
            }
            this.f15353.f73630 = null;
            this.f15353.f73631 = null;
            this.f15353.f73622 = null;
            C22592 c22592 = this.f15353;
            c22592.f73625 = z;
            c22592.f73628 = c2357;
            c22592.f73632 = c3498;
            if (c7027 == null) {
                num = null;
            }
            c22592.f73627 = num;
            c22592.f73623++;
            c22592.f73624 = c7027;
            this.f15353.f73622 = c1424;
            this.f15353.f73631 = c12942M32061;
            this.f15353.f73630 = c12942M32062;
            if (z3) {
                this.f15350.m17053();
            } else {
                this.f15350.m16935();
            }
        }
        c12942M32062 = null;
        c1424 = null;
        c12942M32061 = c12942M32062;
        this.f15353.f73630 = null;
        this.f15353.f73631 = null;
        this.f15353.f73622 = null;
        C22592 c22593 = this.f15353;
        c22593.f73625 = z;
        c22593.f73628 = c2357;
        c22593.f73632 = c3498;
        if (c7027 == null) {
            num = null;
        }
        c22593.f73627 = num;
        c22593.f73623++;
        c22593.f73624 = c7027;
        this.f15353.f73622 = c1424;
        this.f15353.f73631 = c12942M32061;
        this.f15353.f73630 = c12942M32062;
        if (z3) {
            this.f15350.m17053();
        } else {
            this.f15350.m16935();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m11931(C24003 c24003) {
        C22550 c22550M52838;
        C2087 c2087M6618;
        C11779 c11779 = this.f15355;
        if (c11779.m29441(c24003)) {
            C7027 c7027M37089 = c24003.m52837().m37089();
            synchronized (this) {
                try {
                    InterfaceC0507 interfaceC0507 = this.f15352.f44391;
                    C1900 c1900M5553 = this.f15351.m5553();
                    if (c11779.m29441(c24003) && interfaceC0507 != null && c24003.m52837().m37090() == c1900M5553 && this.f15350.m17000() == interfaceC0507 && c24003.m52840() == interfaceC0507.mo2395() && c24003.m52839() == interfaceC0507.length() && c7027M37089.m18860() == c24003.m52839() && this.f15353.f73623 == c24003.m52841()) {
                        C13420 c13420 = this.f15352;
                        if (c13420.f44403 == interfaceC0507) {
                            if (!c13420.f44402) {
                                c13420.f44392 = c24003;
                                return;
                            }
                            m11945();
                        }
                        if (this.f15350.isAttachedToWindow() && this.f15350.m16968() && !this.f15350.m17044()) {
                            this.f15352.f44394 = false;
                            if (!c24003.m52842()) {
                                c22550M52838 = c7027M37089.m18860() == 0 ? null : new C22550(0, c7027M37089.m18860());
                            } else {
                                c22550M52838 = c24003.m52838();
                            }
                            m11928(c7027M37089, c24003.m52837().m37088(), true, null, true, Integer.valueOf(c1900M5553.m6197()), true);
                            m11951();
                            C13420 c13421 = this.f15352;
                            c13421.f44404 = -1;
                            c13421.f44405 = -1;
                            c13421.f44399 = 0;
                            c13421.f44400 = 0;
                            c13421.f44384 = null;
                            m11952();
                            m11956();
                            m11904();
                            if (c22550M52838 == null) {
                                c2087M6618 = C2087.f7716;
                            } else {
                                c2087M6618 = C2087.m6618(-1, -1, c22550M52838.m50065(), c22550M52838.m50064());
                            }
                            RunnableC2835 runnableC2835M11947 = m11947(interfaceC0507, c24003.m52840(), c2087M6618, EnumC12009.MERGE);
                            C6111 c6111 = this.f15350;
                            if (runnableC2835M11947 == null) {
                                return;
                            }
                            c6111.postInvalidate();
                            c6111.post(runnableC2835M11947);
                            return;
                        }
                        this.f15352.f44394 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m11919(C3540 c3540) {
        C2087 c2087M6618;
        C11779 c11779 = this.f15355;
        if (c11779.m29439(c3540)) {
            C22445 c22445M10441 = c3540.m10441();
            C13638.requireNonNull(c22445M10441, o.c);
            C3498 c3498M10281 = C3498.m10281(c22445M10441.m49820(), c22445M10441.m49822(), c22445M10441.m49814(), c22445M10441.m49821(), c22445M10441.m49815().f7174);
            synchronized (this) {
                InterfaceC0507 interfaceC0507 = this.f15352.f44391;
                C1900 c1900M5553 = this.f15351.m5553();
                if (c11779.m29439(c3540) && interfaceC0507 != null && c22445M10441.m49815() == c1900M5553 && this.f15350.m17000() == interfaceC0507 && interfaceC0507.length() > 1000000 && c3540.m10442() == interfaceC0507.mo2395() && c3540.m10439() == interfaceC0507.length() && c22445M10441.m49816() == c3540.m10442() && c22445M10441.m49820() == c3540.m10439() && c22445M10441.m49822() == this.f15352.f44406) {
                    int iM49819 = c22445M10441.m49819();
                    C13420 c13420 = this.f15352;
                    if (iM49819 == c13420.f44390 && c13420.f44408 == c3540.m10442() && this.f15352.f44401 == c3540.m10439() && this.f15352.f44387 == c3540.m10440() && this.f15353.f73623 == c3540.m10440()) {
                        C13420 c13421 = this.f15352;
                        if (c13421.f44403 == interfaceC0507) {
                            if (!c13421.f44402) {
                                c13421.f44393 = c3540;
                                return;
                            }
                            m11945();
                        }
                        if (this.f15350.isAttachedToWindow() && this.f15350.m16968() && !this.f15350.m17044()) {
                            C3498 c3498 = this.f15354.f19330;
                            if (c3498 == null || c3498.m10291().m18860() != c3498M10281.m10291().m18860()) {
                                C5658 c5658 = this.f15354;
                                if (c5658.f19334 == interfaceC0507 && c5658.f19327 == interfaceC0507.mo2395() && c5658.f19335 == interfaceC0507.length()) {
                                    c2087M6618 = C2087.m6617(this.f15354.f19337, c22445M10441.m49822(), c22445M10441.m49819());
                                } else {
                                    c2087M6618 = C2087.m6618(-1, -1, c22445M10441.m49822(), c22445M10441.m49819());
                                }
                            } else {
                                c2087M6618 = c3498M10281.m10287(c3498);
                            }
                            C2087 c2087 = c2087M6618;
                            m11928(c3498M10281.m10291(), null, false, c3498M10281, true, Integer.valueOf(c1900M5553.m6197()), true);
                            if (!m11958(interfaceC0507)) {
                                m11905(interfaceC0507, c22445M10441.m49822(), c22445M10441.m49819());
                            }
                            m11952();
                            m11904();
                            RunnableC2835 runnableC2835M11947 = m11947(interfaceC0507, c3540.m10442(), c2087, EnumC12009.REPLACE);
                            C6111 c6111 = this.f15350;
                            if (runnableC2835M11947 == null) {
                                return;
                            }
                            c6111.postInvalidate();
                            c6111.post(runnableC2835M11947);
                            return;
                        }
                        this.f15352.f44398 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11925(C4246 c4246, C16947 c16947) {
        if (c16947.m39702()) {
            c4246.m11929(c16947);
            return;
        }
        C11779 c11779 = c4246.f15355;
        if (c11779.m29440(c16947)) {
            synchronized (c4246) {
                InterfaceC0507 interfaceC0507 = c4246.f15352.f44391;
                if (c11779.m29440(c16947) && interfaceC0507 != null && c4246.f15350.m17000() == interfaceC0507 && c16947.m39701() == interfaceC0507.mo2395() && c16947.m39700() == interfaceC0507.length()) {
                    boolean z = true;
                    if (c16947.m39698() == EnumC12714.SCHEDULER_REJECTED) {
                        C13420 c13420 = c4246.f15352;
                        c13420.f44394 = true;
                        if (c13420.f44403 == interfaceC0507 && c13420.f44402) {
                            c4246.m11945();
                        }
                        if (z) {
                            c4246.m11954(interfaceC0507);
                        }
                    }
                    C13420 c13421 = c4246.f15352;
                    c13421.f44394 = false;
                    c13421.f44388 = c16947.m39701();
                    c4246.f15352.f44395 = c16947.m39700();
                    c4246.f15352.f44397 = interfaceC0507;
                    c4246.m11932(false, true, false);
                    z = false;
                    if (z) {
                        c4246.m11954(interfaceC0507);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11929(C16947 c16947) {
        C11779 c11779 = this.f15355;
        if (c11779.m29440(c16947)) {
            synchronized (this) {
                InterfaceC0507 interfaceC0507 = this.f15352.f44391;
                int iM39699 = c16947.m39699();
                int iM39697 = c16947.m39697();
                if (c11779.m29440(c16947) && interfaceC0507 != null && this.f15350.m17000() == interfaceC0507 && c16947.m39701() == interfaceC0507.mo2395() && c16947.m39700() == interfaceC0507.length()) {
                    C13420 c13420 = this.f15352;
                    if (iM39699 == c13420.f44406 && iM39697 == c13420.f44390 && c13420.f44408 == c16947.m39701() && this.f15352.f44401 == c16947.m39700()) {
                        boolean z = false;
                        if (c16947.m39698() == EnumC12714.SCHEDULER_REJECTED) {
                            C13420 c13421 = this.f15352;
                            c13421.f44398 = true;
                            if (c13421.f44403 == interfaceC0507 && c13421.f44402) {
                                m11945();
                                z = true;
                            }
                        } else {
                            m11952();
                            C13420 c13422 = this.f15352;
                            c13422.f44407 = iM39699;
                            c13422.f44386 = iM39697;
                            c13422.f44389 = c16947.m39701();
                            this.f15352.f44396 = c16947.m39700();
                            this.f15352.f44385 = interfaceC0507;
                            this.f15353.f73629 = null;
                            m11932(false, true, true);
                        }
                        if (z) {
                            m11954(interfaceC0507);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private RunnableC2835 m11947(InterfaceC0507 interfaceC0507, int i, C2087 c2087, EnumC12009 enumC12009) {
        if (this.f15350.m17000() != interfaceC0507 || interfaceC0507.mo2395() != i || this.f15351.m5552() == null) {
            return null;
        }
        C2087 c2087M11910 = m11910(interfaceC0507, i, c2087, enumC12009);
        m11942();
        RunnableC2835 runnableC2835M11911 = m11911(interfaceC0507, i, c2087M11910);
        this.f15354.f19333 = runnableC2835M11911;
        return runnableC2835M11911;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11980(InterfaceC0507 interfaceC0507) {
        synchronized (this) {
            if (m11934(interfaceC0507, interfaceC0507.mo2395()) && this.f15351.m5552() != null) {
                m11942();
                RunnableC2835 runnableC2835M11911 = m11911(interfaceC0507, interfaceC0507.mo2395(), this.f15354.f19331);
                this.f15354.f19333 = runnableC2835M11911;
                this.f15350.post(runnableC2835M11911);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private RunnableC2835 m11911(InterfaceC0507 interfaceC0507, int i, C2087 c2087) {
        C7027 c7027 = this.f15353.f73624;
        if (c7027 == null) {
            throw new IllegalStateException("Syntax display is not initialized");
        }
        C20889 c20889M5552 = this.f15351.m5552();
        C22592 c22592 = this.f15353;
        return new RunnableC2835(this, interfaceC0507, c20889M5552, i, c22592.f73632, c7027, c22592.f73623, c2087);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m11999() {
        return this.f15353.f73626;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11976(CharSequence charSequence) {
        C7027 c7027;
        return this.f15353.f73626 && (c7027 = this.f15353.f73624) != null && c7027.m18860() == charSequence.length();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m11946(InterfaceC0507 interfaceC0507) {
        C7027 c7027M18851;
        m11940();
        if ((m11908(interfaceC0507) || m11953()) && this.f15353.f73624 != null && this.f15353.f73624.m18860() == interfaceC0507.length()) {
            return;
        }
        if (interfaceC0507.length() <= 1000000) {
            m11932(false, false, false);
            C20889 c20889M5552 = this.f15351.m5552();
            if (c20889M5552 == null) {
                return;
            }
            int length = interfaceC0507.length();
            C15682 c15682M46969 = c20889M5552.m46969();
            if (length == 0) {
                c7027M18851 = C7027.m18855();
            } else {
                c7027M18851 = C7027.m18851(length, c15682M46969, false);
            }
            m11927(c7027M18851, (C2357) null, false, (C3498) null, false);
            this.f15353.f73626 = true;
            if (m11962(interfaceC0507)) {
                m11949(interfaceC0507, false);
                return;
            }
            return;
        }
        m11918(interfaceC0507, false);
        if (m11950(interfaceC0507)) {
            C13420 c13420 = this.f15352;
            m11915(interfaceC0507, c13420.f44404, c13420.f44405, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11977(String str) {
        m11930(C12859.m31869(str));
        return this.f15351.m5552() != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m11993(String str) {
        m11930(C12859.m31894(str));
        return this.f15351.m5552() != null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C20889 m11959(C4246 c4246) {
        return c4246.f15351.m5552();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5366 m11965() {
        C20889 c20889M5552 = this.f15351.m5552();
        if (c20889M5552 == null) {
            return null;
        }
        return c20889M5552.m46952();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13128 m11979() {
        C20889 c20889M5552 = this.f15351.m5552();
        if (c20889M5552 == null) {
            return null;
        }
        return c20889M5552.m46957();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m11981() {
        C20889 c20889M5552 = this.f15351.m5552();
        return c20889M5552 == null ? "Text" : c20889M5552.m46958();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m11985() {
        C20889 c20889M5552 = this.f15351.m5552();
        if (c20889M5552 != null) {
            return c20889M5552.m46960();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20889 m11988() {
        return this.f15351.m5552();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m11996() {
        return this.f15351.m5552() != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m11907(CharSequence charSequence) {
        return m11961(charSequence) && this.f15351.m5553() != null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m11939(CharSequence charSequence) {
        return (charSequence == null || this.f15351.m5553() == null || this.f15351.m5552() == null || !(charSequence instanceof InterfaceC0507) || this.f15350.m17000() != charSequence) ? false : true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private boolean m11940() {
        C1900 c1900M5553 = this.f15351.m5553();
        if (c1900M5553 == null || c1900M5553.m6204()) {
            return false;
        }
        C20889 c20889M5552 = this.f15351.m5552();
        C7027 c7027 = this.f15353.f73624;
        C22592 c22592 = this.f15353;
        Integer num = c22592.f73627;
        boolean z = c22592.f73626 && c7027 != null;
        C1652 c1652M5551 = C1652.m5551(c20889M5552);
        m11932(false, false, false);
        this.f15351 = c1652M5551;
        if (c1652M5551.m5553() != null) {
            m11928(c7027, null, false, null, true, num, false);
            this.f15353.f73626 = z;
        } else {
            this.f15353.f73626 = false;
            m11927((C7027) null, (C2357) null, false, (C3498) null, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11967(InterfaceC0507 interfaceC0507, int i, int i2) {
        if (m11939((CharSequence) interfaceC0507)) {
            this.f15355.m29435(interfaceC0507, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m11987(InterfaceC0507 interfaceC0507, int i, int i2) {
        if (!m11961((CharSequence) interfaceC0507) || i < 0 || i2 < 0) {
            return;
        }
        C13638.checkFromToIndex(i, i2, interfaceC0507.length());
        synchronized (this) {
            m11940();
            m11905(interfaceC0507, i, i2);
            C3498 c3498 = this.f15353.f73632;
            if (c3498 != null && c3498.m10289(i, i2)) {
                m11937(interfaceC0507, i, i2);
                return;
            }
            if (m11950(interfaceC0507)) {
                m11915(interfaceC0507, i, i2, false);
            } else {
                m11960(interfaceC0507, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m11937(InterfaceC0507 interfaceC0507, int i, int i2) {
        C13420 c13420 = this.f15352;
        if (c13420.f44406 != -1 && (!m11941(interfaceC0507) || !m11933(c13420.f44406, c13420.f44390, i, i2))) {
            this.f15355.m29442();
            c13420.f44391 = interfaceC0507;
            m11952();
        }
        if (c13420.f44407 != -1) {
            if (m11953() && m11933(c13420.f44407, c13420.f44386, i, i2)) {
                return;
            }
            m11904();
        }
    }
}
