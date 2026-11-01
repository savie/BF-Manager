package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܶ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15547 extends AbstractC7079 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f50599;

    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18953(C3073 c3073) throws IOException {
        super.mo18953(c3073);
        this.f23751.m19501();
        this.f23749.m35630((byte) 5);
        C14904 c14904 = this.f23749;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627("ssh-userauth".getBytes(charset));
        c3073.m9249(this.f23751);
        C0168 c0168 = c3073.f11634;
        c0168.m1333().getClass();
        C14904 c14905 = this.f23749;
        c3073.m9239(c14905);
        this.f23749 = c14905;
        boolean z = c14905.f48679[5] == 6;
        c0168.m1333().getClass();
        if (!z || !c3073.m9231("enable_auth_none").equals("yes")) {
            return false;
        }
        byte[] bArrM22175 = C8491.m22175(this.f23748, charset);
        this.f23751.m19501();
        this.f23749.m35630((byte) 50);
        this.f23749.m35627(bArrM22175);
        this.f23749.m35627("ssh-connection".getBytes(charset));
        this.f23749.m35627("none".getBytes(charset));
        c3073.m9249(this.f23751);
        while (true) {
            C14904 c14906 = this.f23749;
            c3073.m9239(c14906);
            this.f23749 = c14906;
            int i = c14906.f48679[5] & 255;
            if (i == 52) {
                return true;
            }
            if (i != 53) {
                if (i != 51) {
                    throw new C5813(C2271.m6966(i, "USERAUTH fail (", MotionUtils.EASING_TYPE_FORMAT_END));
                }
                c14906.m35638();
                this.f23749.m35629();
                this.f23749.m35629();
                byte[] bArrM35628 = this.f23749.m35628();
                this.f23749.m35629();
                this.f50599 = new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                return false;
            }
            c14906.m35638();
            this.f23749.m35629();
            this.f23749.m35629();
            byte[] bArrM35629 = this.f23749.m35628();
            this.f23749.m35628();
            new String(bArrM35629, 0, bArrM35629.length, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37188() {
        return this.f50599;
    }
}
