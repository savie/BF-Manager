package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ᩳܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18105 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12131 f57892;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21033 f57893;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3329 f57894;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12359 f57895;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f57896;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f57897;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f57898;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f57899;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f57900;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f57901;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f57902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC12359 f57903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f57904;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f57905;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f57906;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f57907;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f57908;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f57909;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f57910;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f57911;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18811 f57912;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile C16695 f57913;

    public C18105(C6111 c6111, InterfaceC2916 interfaceC2916, AbstractC12359 abstractC12359) {
        this.f57909 = c6111;
        this.f57897 = interfaceC2916;
        this.f57895 = abstractC12359;
        this.f57903 = abstractC12359;
        this.f57893 = C21033.m47414(abstractC12359.m30756(), new C7628[0]);
        this.f57896 = abstractC12359.m30745();
        this.f57911 = c6111.m16923();
        this.f57912 = abstractC12359.f41324;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42165(int i, int i2, int i3, int i4) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int iMo2395 = this.f57897.mo2395();
        C21033 c21033 = this.f57893;
        if (c21033 != null && this.f57896 == i4 && iMo2395 == i4 + 1 && c21033.m47416() == (((long) this.f57897.length()) - ((long) i3)) + ((long) i2)) {
            this.f57893 = this.f57893.m47420(new C7628(i, i2 + i, i3));
        } else {
            this.f57893 = null;
        }
        this.f57896 = iMo2395;
        this.f57913 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42168() {
        return !this.f57902 && this.f57909.f20728 == this && this.f57909.f20708 == this.f57897 && !this.f57909.f20819;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42169(AbstractC12359 abstractC12359) {
        C16695 c16695 = this.f57913;
        return m42168() && this.f57897.mo2395() == this.f57910 && c16695 != null && c16695.f53482 == abstractC12359 && c16695.f53480 == abstractC12359.mo14794() && c16695.f53479.m39026() == this.f57909.m16978() && abstractC12359.mo14800(c16695.f53479);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [l.᩺ܳۖ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۜܳۖ] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42170() {
        final AbstractC12359 c5325;
        try {
            if (m42168()) {
                C12131 c12131 = this.f57892;
                boolean z = true;
                if (c12131 != null && c12131.m30190(this.f57895, this.f57910, this.f57909.m16978())) {
                    if (this.f57906 == 0) {
                        C6111 c6111 = this.f57909;
                        c5325 = new C21489(c6111, this.f57897, c6111.f20794, this.f57908, c12131, new BooleanSupplier() { // from class: l.ۜܳۖ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f22979.m42168();
                            }
                        }, this.f57894);
                    } else {
                        C6111 c6112 = this.f57909;
                        c5325 = new C5325(c6112, this.f57897, c6112.f20794, this.f57906 == 1, this.f57908, c12131, new BooleanSupplier() { // from class: l.᩺ܳۖ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f74863.m42168();
                            }
                        }, this.f57894);
                    }
                } else if (this.f57906 == 0) {
                    C6111 c6113 = this.f57909;
                    c5325 = new C21489(c6113, this.f57897, c6113.f20794, this.f57908, this.f57894);
                } else {
                    C6111 c6114 = this.f57909;
                    c5325 = new C5325(c6114, this.f57897, c6114.f20794, this.f57906 == 1, this.f57908, this.f57894);
                }
                try {
                    C16592 c16592Mo30725 = c5325.mo30725();
                    if (m42168() && this.f57897.mo2395() == this.f57910 && c16592Mo30725 != null && c5325.mo14800(c16592Mo30725) && c5325.mo14799(Math.max(this.f57909.m16916(), this.f57909.m17020()))) {
                        final C16695 c16695 = new C16695(c5325, c5325.mo14794(), c16592Mo30725);
                        this.f57913 = c16695;
                        m42162(c5325, c16592Mo30725.m39023());
                        C16737.m39273(new Runnable() { // from class: l.ܶܳۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18105.m42163(this.f49815, c16695);
                            }
                        });
                    } else {
                        z = false;
                    }
                    while (c5325.mo14804()) {
                        if (!m42168()) {
                            c5325.mo14797();
                            break;
                        }
                        SystemClock.sleep(10L);
                    }
                    Throwable thMo14778 = c5325.mo14778();
                    if (thMo14778 instanceof RuntimeException) {
                        throw ((RuntimeException) thMo14778);
                    }
                    if (thMo14778 instanceof Error) {
                        throw ((Error) thMo14778);
                    }
                    if (thMo14778 != null) {
                        throw new IllegalStateException("Large edit layout preparation failed", thMo14778);
                    }
                    if (!z && m42168() && this.f57897.mo2395() == this.f57910) {
                        m42162(c5325, Math.max(0, ((int) (c5325.m30744(Math.min(this.f57908, this.f57897.length())) * this.f57909.f20794.m17870())) - (this.f57909.m16814() / 2)));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c5325 != null) {
                        c5325.mo14797();
                    }
                }
            } else {
                c5325 = null;
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c5325 = null;
        }
        C3329 c3329 = this.f57894;
        if (c3329 != null) {
            c3329.close();
            this.f57894 = null;
        }
        C16737.m39273(new Runnable() { // from class: l.᩸ܳۖ
            @Override // java.lang.Runnable
            public final void run() {
                this.f70158.m42167(c5325, th);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42162(AbstractC12359 abstractC12359, int i) {
        if (m42168()) {
            C6111 c6111 = this.f57909;
            C1590 c1590 = c6111.f20794;
            C13190 c13190 = c6111.f20770;
            if (c1590.f6398 && c13190.m32642()) {
                long jMo14796 = abstractC12359.mo14796(i, Math.max(1, c6111.m16814()));
                c13190.m32633(this.f57897, (int) (jMo14796 >>> 32), (int) jMo14796);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42163(C18105 c18105, C16695 c16695) {
        if (c18105.f57913 == c16695 && c18105.m42169(c16695.f53482)) {
            C6111 c6111 = c18105.f57909;
            if (c6111.f20764 != c18105.f57903) {
                return;
            }
            c6111.m16674(c16695.f53482, false);
            c18105.f57903 = c16695.f53482;
            c18105.f57909.m16651(c16695.f53479.m39025(), c16695.f53479.m39023(), false);
            c18105.f57905 = c16695.f53479.m39024();
            c16695.f53481 = true;
            c18105.f57909.f20770.m32620(c18105.f57897);
            c18105.f57909.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42166(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C6111 c6111 = this.f57909;
        if (actionMasked == 0) {
            this.f57898 = c6111.m17018();
            this.f57900 = motionEvent.getX();
            this.f57901 = motionEvent.getY();
            return;
        }
        if (actionMasked != 2 || !this.f57898) {
            if (actionMasked != 2) {
                this.f57898 = false;
                return;
            }
            return;
        }
        int x = (int) (this.f57900 - motionEvent.getX());
        int y = (int) (this.f57901 - motionEvent.getY());
        if (m42168()) {
            m42164(x, y);
        } else if (c6111.f20728 == null) {
            InterfaceC2916 interfaceC2916 = c6111.f20708;
            InterfaceC2916 interfaceC2917 = this.f57897;
            if (interfaceC2916 == interfaceC2917 && !c6111.f20819 && interfaceC2917.mo2395() == this.f57910 && c6111.f20764 == this.f57903 && c6111.m16709()) {
                c6111.scrollTo(c6111.m16974(c6111.getScrollX() + x), c6111.m16837(c6111.m17066() + y));
                c6111.invalidate();
            }
        }
        this.f57900 = motionEvent.getX();
        this.f57901 = motionEvent.getY();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42164(int i, int i2) {
        C6111 c6111 = this.f57909;
        if (c6111.m17018()) {
            this.f57905 = Math.min(this.f57905, c6111.m16814());
            int iM16974 = c6111.m16974(c6111.getScrollX() + i);
            int iMo30732 = c6111.f20764.mo30732(c6111.m17066() + i2, this.f57905);
            if (c6111.f20764.mo14800(new C16592(iM16974, iMo30732, c6111.m16978(), this.f57905))) {
                if (iM16974 == c6111.getScrollX() && iMo30732 == c6111.m17066()) {
                    return;
                }
                this.f57904 = true;
                c6111.scrollTo(iM16974, iMo30732);
                c6111.invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:71:0x0112, B:73:0x0116), top: B:143:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:86:0x0155 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42167(AbstractC12359 abstractC12359, Throwable e) {
        C3329 c3329 = this.f57894;
        if (c3329 != null) {
            c3329.close();
            this.f57894 = null;
        }
        if (this.f57909.f20728 != this) {
            if (this.f57899) {
                this.f57899 = false;
                try {
                    this.f57897.setReadOnly(false);
                    return;
                } finally {
                    this.f57909.m17001();
                }
            }
            return;
        }
        this.f57907 = false;
        if (m42168() && abstractC12359 != null && e == null && this.f57897.mo2395() != this.f57910) {
            this.f57895 = abstractC12359;
            if (this.f57906 != this.f57909.f20808 || !this.f57912.equals(this.f57909.m16815())) {
                this.f57893 = null;
            }
            this.f57892 = null;
            this.f57913 = null;
            C16737.m39273(new RunnableC14476(this));
            return;
        }
        if (m42168() && e == null && abstractC12359 != null && (this.f57906 != this.f57909.f20808 || !this.f57912.equals(this.f57909.m16815()) || (this.f57906 != 0 && abstractC12359.mo14790() != this.f57909.m16978() && this.f57909.m16978() > 0))) {
            this.f57913 = null;
            this.f57892 = null;
            this.f57909.invalidate();
            try {
                this.f57895 = abstractC12359;
                this.f57893 = null;
                C16737.m39273(new RunnableC14476(this));
                return;
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        try {
            if (m42168() && this.f57899 && this.f57897.mo2395() == this.f57910) {
                C6111 c6111 = this.f57909;
                if (c6111.f20764 == this.f57903 && abstractC12359 != null && e == null) {
                    c6111.m16674(abstractC12359, false);
                } else if (m42168()) {
                    if (!(e instanceof Error)) {
                        throw ((Error) e);
                    }
                    if (e instanceof RuntimeException) {
                        if (this.f57909.m16894(this.f57897, (RuntimeException) e)) {
                            if (abstractC12359 != null) {
                                abstractC12359.f41313 = -1;
                            }
                            this.f57892 = null;
                            this.f57909.f20728 = null;
                            this.f57909.f20772 = 0L;
                            if (this.f57899) {
                                this.f57897.setReadOnly(false);
                            }
                            return;
                        }
                    }
                    this.f57909.f20770.m32661(this.f57897);
                    this.f57909.m17043();
                }
            } else if (m42168() && this.f57899) {
                if (!(e instanceof Error)) {
                    throw ((Error) e);
                }
                if (e instanceof RuntimeException) {
                    if (this.f57909.m16894(this.f57897, (RuntimeException) e)) {
                        if (abstractC12359 != null) {
                            abstractC12359.f41313 = -1;
                        }
                        this.f57892 = null;
                        this.f57909.f20728 = null;
                        this.f57909.f20772 = 0L;
                        try {
                            if (this.f57899) {
                                this.f57897.setReadOnly(false);
                            }
                            return;
                        } finally {
                            if (this.f57899) {
                                this.f57909.m17001();
                            }
                            C16737.m39273(new RunnableC5387(1, this.f57909));
                        }
                    }
                }
                this.f57909.f20770.m32661(this.f57897);
                this.f57909.m17043();
            }
            if (abstractC12359 != null) {
                abstractC12359.f41313 = -1;
            }
            this.f57892 = null;
            this.f57909.f20728 = null;
            this.f57909.f20772 = 0L;
            try {
                if (this.f57899) {
                    this.f57897.setReadOnly(false);
                }
                if (this.f57899) {
                    this.f57909.m17001();
                }
                C16737.m39273(new RunnableC5387(1, this.f57909));
                if (this.f57902 || this.f57909.f20708 != this.f57897 || this.f57909.f20819) {
                    return;
                }
                this.f57909.f20825.m31939(this.f57897);
                this.f57909.f20770.m32620(this.f57897);
                C6111 c6112 = this.f57909;
                AbstractC15910 abstractC15910 = c6112.f20789;
                if (abstractC15910 != null) {
                    abstractC15910.mo30808(c6112);
                }
                if (!this.f57909.m16630() && this.f57909.f20713 == null && !this.f57904) {
                    this.f57909.m16886(true);
                }
                C6111 c6113 = this.f57909;
                c6113.m16851(c6113.m16916(), this.f57909.m17020());
                this.f57909.m17063();
                this.f57909.m16829();
                int iM16923 = this.f57909.m16923();
                if (this.f57911 != iM16923) {
                    this.f57909.mo16920(iM16923);
                }
                this.f57909.requestLayout();
                this.f57909.invalidate();
                this.f57909.m16728();
            } catch (Throwable th) {
                if (this.f57899) {
                    this.f57909.m17001();
                }
                C16737.m39273(new RunnableC5387(1, this.f57909));
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12359 != null) {
                abstractC12359.f41313 = -1;
            }
            this.f57892 = null;
            this.f57909.f20728 = null;
            this.f57909.f20772 = 0L;
            try {
                if (this.f57899) {
                    this.f57897.setReadOnly(false);
                }
                throw th2;
            } finally {
                if (this.f57899) {
                    this.f57909.m17001();
                }
                C16737.m39273(new RunnableC5387(1, this.f57909));
            }
        }
    }
}
