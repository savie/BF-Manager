package l;

import bin.mt.plus.R;
import java.util.concurrent.Future;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.֫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23097 f7255;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f7256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f7258;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f7259;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7260;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f7261;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f7262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f7263;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4245 f7264;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C7919 f7265;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f7266;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7267;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile Future f7268;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f7269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f7270;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f7272;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11908 f7273;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20837 f7274;

    public C2214(C11908 c11908) {
        this.f7273 = c11908;
        this.f7264 = c11908.f38362;
        InterfaceC19106 interfaceC19106 = c11908.f38348;
        this.f7269 = interfaceC19106;
        this.f7263 = c11908.f38372;
        this.f7259 = c11908.f38368;
        int length = interfaceC19106.length();
        this.f7262 = length;
        boolean z = false;
        int i = c11908.f38347 == null ? 0 : c11908.f38347.f66719;
        this.f7267 = i;
        this.f7266 = c11908.f38347 != null ? c11908.f38347.f66718 : length;
        this.f7256 = c11908.f38370.m53968();
        int iM53882 = c11908.f38370.m53882();
        this.f7272 = iM53882;
        if (Math.max(i, iM53882) == i && !C11908.m29822(c11908, i)) {
            z = true;
        }
        this.f7257 = z;
        this.f7261 = c11908.f38357;
        this.f7271 = c11908.m29843();
        this.f7274 = c11908.f38370.m53974();
        this.f7255 = c11908.f38373;
        this.f7258 = c11908.f38352;
        this.f7265 = new C7919(c11908.f38370, c11908.f38350, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ۚ᩸ᩴ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                C2214 c2214 = this.f20357;
                return c2214.f7273.m29821(c2214);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7560(Future future) {
        this.f7268 = future;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m7562() {
        while (this.f7268 == null) {
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m7564() {
        Future future = this.f7268;
        return future != null && future.isDone();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7561() {
        Future future = this.f7268;
        if (this.f7270 || this.f7265.m21465()) {
            return true;
        }
        return future != null && future.isCancelled();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7559() {
        this.f7270 = true;
        this.f7265.m21463();
        Future future = this.f7268;
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7563() {
        this.f7265.m21466();
    }
}
