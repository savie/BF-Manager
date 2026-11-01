package l;

import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۬ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes3.dex */
public final class C13273 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f44065;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile C22445 f44066;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C2688 f44067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14789 f44068;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f44069;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21180 f44070;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f44071;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object f44072;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f44073;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19770 f44074;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4099 f44075;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10743 f44076;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile boolean f44077;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Executor f44078;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3329 f44079;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f44080;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3768 f44081;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12237 f44082;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1900 f44083;

    public C13273(C4099 c4099, C5511 c5511, C3329 c3329, C19770 c19770) {
        this.f44075 = c4099;
        C1900 c1900 = c5511.f18913;
        this.f44083 = c1900;
        this.f44072 = c5511.f18922;
        this.f44073 = c5511.f18921;
        int i = c5511.f18920;
        this.f44080 = i;
        int i2 = c5511.f18924;
        this.f44071 = i2;
        int i3 = c5511.f18915;
        this.f44069 = i3;
        this.f44065 = c5511.f18923;
        this.f44074 = c19770;
        this.f44079 = c3329;
        this.f44067 = c5511.f18918;
        this.f44068 = c5511.f18914;
        this.f44076 = c5511.f18919;
        if (c3329.length() != i) {
            throw new IllegalArgumentException("Stable syntax text length changed during request");
        }
        C11862 c11862M29567 = c5511.f18916 == null ? c5511.f18917 : c5511.f18917.m29567(c5511.f18916);
        C1277 c1277 = new C1277(this);
        C10743 c10743 = c5511.f18919;
        c1900.getClass();
        C12237 c12237 = new C12237(c1900, c3329, c1277, i2, i3, c11862M29567, c10743);
        this.f44082 = c12237;
        c12237.m30425(this.f44067);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32757() {
        this.f44081 = null;
        this.f44078 = null;
        this.f44070 = null;
        this.f44082.m30434();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32758(C3768 c3768, Executor executor, C21180 c21180) {
        this.f44081 = c3768;
        this.f44078 = executor;
        this.f44070 = c21180;
        this.f44082.m30426(c3768, executor, c21180);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16470 m32756(int i, long j, C1569 c1569) {
        try {
            EnumC16470 enumC16470M30424 = this.f44082.m30424(i, j, c1569);
            if (this.f44082.m30433()) {
                m32746();
                return EnumC16470.YIELDED;
            }
            if (enumC16470M30424 == EnumC16470.COMPLETED) {
                m32754();
                this.f44079 = null;
            }
            return enumC16470M30424;
        } catch (Error | RuntimeException e) {
            if (this.f44082.m30431() == EnumC16470.ABORTED) {
                this.f44075.m11636(this);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32746() {
        this.f44082.m30429();
        C11862 c11862M30432 = this.f44082.m30432();
        C10743 c10743M30423 = this.f44082.m30423();
        int i = this.f44080;
        C1900 c1900 = this.f44083;
        C14789 c14789M35431 = C14789.m35424(c1900, i).m35431(c10743M30423);
        this.f44068 = c14789M35431;
        this.f44076 = c14789M35431.m35427(c1900, this.f44071);
        this.f44082.getClass();
        this.f44082.m30434();
        C3329 c3329 = this.f44079;
        C1277 c1277 = new C1277(this);
        C10743 c10743 = this.f44076;
        c1900.getClass();
        C13638.requireNonNull(c3329, TextBundle.TEXT_ENTRY);
        C12237 c12237 = new C12237(c1900, c3329, c1277, this.f44071, this.f44069, c11862M30432, c10743);
        this.f44082 = c12237;
        this.f44067 = null;
        C3768 c3768 = this.f44081;
        if (c3768 != null) {
            c12237.m30426(c3768, this.f44078, this.f44070);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m32754() {
        try {
            if (m32751()) {
                this.f44075.m11636(this);
                return;
            }
            C7027 c7027M30420 = this.f44082.m30420();
            if (c7027M30420.m18860() != this.f44069 - this.f44071) {
                throw new IllegalStateException("Window style length differs from requested range");
            }
            C2357 c2357M30428 = this.f44082.m30428();
            if (c2357M30428.m7174() != this.f44069 - this.f44071 || c2357M30428.m7164(0) != this.f44083.f7183) {
                throw new IllegalStateException("Window context differs from requested range");
            }
            C10743 c10743M30430 = this.f44082.m30430();
            if (c10743M30430.m27016() == this.f44083) {
                int iM27019 = c10743M30430.m27019();
                int i = this.f44080;
                if (iM27019 == i) {
                    C14789 c14789M35428 = this.f44068;
                    if (c14789M35428 == null) {
                        c14789M35428 = C14789.m35424(this.f44083, i);
                    }
                    if (this.f44076 != null && this.f44082.m30421() >= 0) {
                        c14789M35428 = c14789M35428.m35428(this.f44076);
                    }
                    C14789 c14789M35431 = c14789M35428.m35431(c10743M30430);
                    if (c14789M35431.m35430() != this.f44083 || c14789M35431.m35429() != this.f44080) {
                        throw new IllegalStateException("Window checkpoint cache identity differs from request");
                    }
                    C11862 c11862M30438 = this.f44082.m30438();
                    if (c11862M30438.m29565() != this.f44083 || c11862M30438.m29568() != this.f44080) {
                        throw new IllegalStateException("Window restart identity differs from request");
                    }
                    if (m32751()) {
                        this.f44075.m11636(this);
                        return;
                    }
                    C1900 c1900 = this.f44083;
                    long j = this.f44073;
                    int i2 = this.f44080;
                    int i3 = this.f44071;
                    int i4 = this.f44069;
                    this.f44082.getClass();
                    this.f44066 = new C22445(c1900, j, i2, i3, i4, c7027M30420, c2357M30428, c11862M30438, c14789M35431, this.f44067);
                    return;
                }
            }
            throw new IllegalStateException("Window checkpoint identity differs from request");
        } catch (Error | RuntimeException e) {
            this.f44075.m11636(this);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean m32751() {
        if (this.f44077) {
            return true;
        }
        if (C14831.m35517(this.f44074.f63524)) {
            this.f44077 = true;
        }
        return this.f44077;
    }
}
