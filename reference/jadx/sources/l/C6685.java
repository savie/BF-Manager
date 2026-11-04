package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6685 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8921 f22268;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7430 f22269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f22270;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4908 f22271;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22272;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7956 f22273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12628 f22274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f22275;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19143 f22276;

    public C6685(ViewOnClickListenerC7430 viewOnClickListenerC7430, C8921 c8921, C19143 c19143, byte[] bArr, long j, C12628 c12628) {
        this.f22269 = viewOnClickListenerC7430;
        this.f22268 = c8921;
        this.f22276 = c19143;
        this.f22270 = bArr;
        this.f22275 = j;
        this.f22274 = c12628;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C8921 c8921 = this.f22268;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f22269;
        ViewOnClickListenerC7430.m20351(viewOnClickListenerC7430, c8921);
        this.f22273 = this.f22276.m44374();
        m8193(viewOnClickListenerC7430.f24462, R.string.MT_Protector, 200, new RunnableC20855(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18705(C6685 c6685) {
        c6685.f7780.m33188((Runnable) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m18706(C6685 c6685) {
        C13511 c13511 = c6685.f7780;
        if (c6685.f22268.mo924()) {
            return true;
        }
        return c13511 != null && c13511.m33196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        try {
            this.f22271 = this.f22273.m21659(new InterfaceC7509() { // from class: l.ۨ᩸ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return C6685.m18706(this.f40563);
                }
            });
            ViewOnClickListenerC7430.m20353(this.f22273);
            C4908 c4908 = this.f22271;
            InterfaceC7509 interfaceC7509 = new InterfaceC7509() { // from class: l.ۨ᩸ܳ
                @Override // l.InterfaceC7509
                /* JADX INFO: renamed from: ۫ */
                public final boolean mo924() {
                    return C6685.m18706(this.f40563);
                }
            };
            byte[] bArr = this.f22270;
            if (bArr == null || bArr.length == 0) {
                throw new IllegalArgumentException("Search pattern must not be empty");
            }
            long jM20346 = (((long) ViewOnClickListenerC7430.m20346(this.f22275, true)) - ((long) bArr.length)) + 1;
            int iM20346 = jM20346 < 0 ? -1 : ViewOnClickListenerC7430.m20346(jM20346, false);
            InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
            int iM15066 = c4908.m15066(bArr, iM20346, interfaceC7509M41888);
            if (iM15066 == -1 && !interfaceC7509M41888.mo924()) {
                iM15066 = c4908.m15066(bArr, c4908.length(), interfaceC7509M41888);
            }
            this.f22272 = iM15066;
        } catch (Throwable th) {
            ViewOnClickListenerC7430.m20353(this.f22273);
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws IOException {
        C19143 c19143 = this.f22276;
        C4908 c4908 = this.f22271;
        ViewOnClickListenerC7430 viewOnClickListenerC7430 = this.f22269;
        if (ViewOnClickListenerC7430.m20355(viewOnClickListenerC7430, c19143, c4908)) {
            C13511 c13511 = this.f7780;
            if (this.f22268.mo924()) {
                return;
            }
            if (c13511 == null || !c13511.m33196()) {
                int i = this.f22272;
                if (i == -1) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                int length = this.f22270.length;
                int length2 = this.f22271.length();
                long j = ((long) i) + ((long) length);
                if (i >= 0 && length > 0 && j <= length2) {
                    int i2 = ((int) j) - 1;
                    viewOnClickListenerC7430.f24456 = new C8176(this.f22276, this.f22271.m15063(), this.f22272, i2);
                    this.f22274.m31357(this.f22272, i2);
                    return;
                }
                throw new IOException("Search result exceeds snapshot length");
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (exc instanceof C9446) {
            return;
        }
        ViewOnClickListenerC7430.m20352(this.f22269, this.f22274, this.f22276, exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ViewOnClickListenerC7430.m20353(this.f22273);
        C4908 c4908 = this.f22271;
        if (c4908 != null) {
            try {
                c4908.close();
            } catch (IOException unused) {
            }
        }
        m8196();
        ViewOnClickListenerC7430.m20359(this.f22269, this.f22268);
    }
}
