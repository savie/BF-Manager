package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۟֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7520 extends AbstractC17961 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f24844;

    @Override // l.AbstractC17961
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029(C15723 c15723) throws IOException {
        super.mo1029(c15723);
        this.f58832.m34100();
        this.f58830.m25651((byte) 5);
        C9866 c9866 = this.f58830;
        Charset charset = StandardCharsets.UTF_8;
        c9866.m25673("ssh-userauth".getBytes(charset));
        c15723.m37627(this.f58832);
        C19978 c19978 = c15723.f51127;
        c19978.m45899().getClass();
        C9866 c9867 = this.f58830;
        c15723.m37613(c9867);
        this.f58830 = c9867;
        boolean z = c9867.f31750[5] == 6;
        c19978.m45899().getClass();
        if (!z || !c15723.m37607("enable_auth_none").equals("yes")) {
            return false;
        }
        byte[] bArrM24055 = C9011.m24055(this.f58833, charset);
        this.f58832.m34100();
        this.f58830.m25651((byte) 50);
        this.f58830.m25673(bArrM24055);
        this.f58830.m25673("ssh-connection".getBytes(charset));
        this.f58830.m25673("none".getBytes(charset));
        c15723.m37627(this.f58832);
        while (true) {
            C9866 c9868 = this.f58830;
            c15723.m37613(c9868);
            this.f58830 = c9868;
            int i = c9868.f31750[5] & 255;
            if (i == 52) {
                return true;
            }
            if (i != 53) {
                if (i != 51) {
                    throw new C2079(C14442.m34864(i, "USERAUTH fail (", MotionUtils.EASING_TYPE_FORMAT_END));
                }
                c9868.m25658();
                this.f58830.m25650();
                this.f58830.m25650();
                byte[] bArrM25649 = this.f58830.m25649();
                this.f58830.m25650();
                this.f24844 = new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                return false;
            }
            c9868.m25658();
            this.f58830.m25650();
            this.f58830.m25650();
            byte[] bArrM256410 = this.f58830.m25649();
            this.f58830.m25649();
            new String(bArrM256410, 0, bArrM256410.length, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20583() {
        return this.f24844;
    }
}
