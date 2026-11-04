package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C0718 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f2638;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8921 f2639;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f2640;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7430 f2641;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4908 f2642;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9666 f2643;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f2644;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f2645;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7956 f2646;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17103 f2647;

    public C0718(ViewOnClickListenerC7430 viewOnClickListenerC7430, C8921 c8921, C19143 c19143, C17103 c17103, C9666 c9666, byte[] bArr, byte[] bArr2, C12628 c12628) {
        this.f2641 = viewOnClickListenerC7430;
        this.f2639 = c8921;
        this.f2640 = c19143;
        this.f2647 = c17103;
        this.f2643 = c9666;
        this.f2638 = bArr;
        this.f2645 = bArr2;
        this.f2644 = c12628;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C8921 c8921 = this.f2639;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f2641;
        ViewOnClickListenerC7430.m20351(viewOnClickListenerC7430, c8921);
        this.f2646 = this.f2640.m44374();
        m8193(viewOnClickListenerC7430.f24462, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩶᩸ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C0718.m3040(this.f69011);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3040(C0718 c0718) {
        c0718.f7780.m33188((Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3039(C0718 c0718) {
        C13511 c13511 = c0718.f7780;
        if (c0718.f2639.mo924()) {
            return true;
        }
        return c13511 != null && c13511.m33196();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [l.ܿ᩸ܳ] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C19143 c19143 = this.f2640;
        C17103 c17103 = this.f2647;
        try {
            boolean zM40266 = c17103.m40266();
            C9666 c9666 = this.f2643;
            if (!zM40266) {
                c9666.f31213 = C10412.m26723();
            } else {
                try {
                    C4908 c4908M21659 = this.f2646.m21659(new InterfaceC7509() { // from class: l.ܿ᩸ܳ
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return C0718.m3039(this.f60538);
                        }
                    });
                    this.f2642 = c4908M21659;
                    c9666.f31213 = ViewOnClickListenerC7430.m20348(c19143, c4908M21659, this.f2638, this.f2645, new InterfaceC7509() { // from class: l.ܿ᩸ܳ
                        @Override // l.InterfaceC7509
                        /* JADX INFO: renamed from: ۫ */
                        public final boolean mo924() {
                            return C0718.m3039(this.f60538);
                        }
                    });
                    c9666.f31214 = c19143.m44373();
                    c17103.m40267();
                } catch (Throwable th) {
                    c17103.m40267();
                    throw th;
                }
            }
            ViewOnClickListenerC7430.m20353(this.f2646);
        } catch (Throwable th2) {
            ViewOnClickListenerC7430.m20353(this.f2646);
            throw th2;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f2647.m40268();
        C9666 c9666 = this.f2643;
        C10412 c10412 = c9666.f31213;
        if (!this.f2641.m20356(this.f2640) || c10412 == null) {
            return;
        }
        long j = c10412.f33102;
        if (c10412.f33100) {
            return;
        }
        if (j == 0) {
            C13511 c13511 = this.f7780;
            if (this.f2639.mo924()) {
                return;
            }
            if (c13511 == null || !c13511.m33196()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            return;
        }
        if (c9666.f31210) {
            C22673.m51153(1, this.f2644.getContext().getString(R.string.MT_Protector, Long.valueOf(j))).m51163();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof C9446) {
            return;
        }
        ViewOnClickListenerC7430.m20352(this.f2641, this.f2644, this.f2640, exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C17103 c17103 = this.f2647;
        c17103.m40267();
        c17103.m40268();
        ViewOnClickListenerC7430.m20353(this.f2646);
        C4908 c4908 = this.f2642;
        if (c4908 != null) {
            try {
                c4908.close();
            } catch (IOException unused) {
            }
        }
        m8196();
        c17103.close();
        ViewOnClickListenerC7430.m20359(this.f2641, this.f2639);
    }
}
