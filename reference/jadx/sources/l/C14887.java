package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes5.dex */
public final class C14887 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8921 f48639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7430 f48640;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f48641;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4908 f48642;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48643;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7956 f48644;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f48645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48646;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f48647;

    public C14887(ViewOnClickListenerC7430 viewOnClickListenerC7430, C8921 c8921, C19143 c19143, byte[] bArr, int i, C12628 c12628) {
        this.f48640 = viewOnClickListenerC7430;
        this.f48639 = c8921;
        this.f48647 = c19143;
        this.f48641 = bArr;
        this.f48646 = i;
        this.f48645 = c12628;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C8921 c8921 = this.f48639;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f48640;
        ViewOnClickListenerC7430.m20351(viewOnClickListenerC7430, c8921);
        this.f48644 = this.f48647.m44374();
        m8193(viewOnClickListenerC7430.f24462, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩺᩸ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C14887.m35838(this.f79668);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m35838(C14887 c14887) {
        c14887.f7780.m33188((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m35837() {
        C13511 c13511 = this.f7780;
        if (this.f48639.mo924()) {
            return true;
        }
        return c13511 != null && c13511.m33196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        try {
            this.f48642 = this.f48644.m21659(new InterfaceC7509() { // from class: l.ۘ᩸ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f15915.m35837();
                }
            });
            ViewOnClickListenerC7430.m20353(this.f48644);
            C4908 c4908 = this.f48642;
            InterfaceC7509 interfaceC7509 = new InterfaceC7509() { // from class: l.ۘ᩸ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f15915.m35837();
                }
            };
            byte[] bArr = this.f48641;
            int iM15062 = c4908.m15062(bArr, this.f48646, interfaceC7509);
            this.f48643 = iM15062;
            if (iM15062 != -1 || m35837()) {
                return;
            }
            this.f48643 = this.f48642.m15062(bArr, 0, new InterfaceC7509() { // from class: l.ۘ᩸ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return this.f15915.m35837();
                }
            });
        } catch (Throwable th) {
            ViewOnClickListenerC7430.m20353(this.f48644);
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws IOException {
        C19143 c19143 = this.f48647;
        C4908 c4908 = this.f48642;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f48640;
        if (ViewOnClickListenerC7430.m20355(viewOnClickListenerC7430, c19143, c4908) && !m35837()) {
            int i = this.f48643;
            if (i == -1) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            int length = this.f48641.length;
            int length2 = this.f48642.length();
            long j = ((long) i) + ((long) length);
            if (i >= 0 && length > 0 && j <= length2) {
                int i2 = ((int) j) - 1;
                viewOnClickListenerC7430.f24456 = new C8176(this.f48647, this.f48642.m15063(), this.f48643, i2);
                this.f48645.m31357(this.f48643, i2);
                return;
            }
            throw new IOException("Search result exceeds snapshot length");
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof C9446) {
            return;
        }
        ViewOnClickListenerC7430.m20352(this.f48640, this.f48645, this.f48647, exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ViewOnClickListenerC7430.m20353(this.f48644);
        C4908 c4908 = this.f48642;
        if (c4908 != null) {
            try {
                c4908.close();
            } catch (IOException unused) {
            }
        }
        m8196();
        ViewOnClickListenerC7430.m20359(this.f48640, this.f48639);
    }
}
