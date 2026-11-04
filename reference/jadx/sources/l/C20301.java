package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩵ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D739 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20301 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15079 f65161;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f65162 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24777 f65163;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f65164;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f65165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f65166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f65167;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25368 f65168;

    public C20301(C24777 c24777, C25368 c25368) {
        this.f65163 = c24777;
        this.f65161 = c24777.m55308();
        this.f65168 = c25368;
        this.f65167 = c24777.m55307().mo25860(c25368);
        this.f65164 = c25368.f81909;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46639() {
        this.f65165 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46638() throws Exception {
        long jMo8326;
        if (this.f65165) {
            throw new InterruptedIOException();
        }
        InterfaceC15079 interfaceC15079 = this.f65161;
        String str = this.f65167;
        C25368 c25368 = this.f65168;
        interfaceC15079.mo22526(str, c25368.f81909, c25368.f81910);
        long j = c25368.f81910;
        if (j != -1) {
            this.f65166 = c25368.f81909 + j;
        } else {
            long jM42087 = C18063.m42087(this.f65161.mo22517(this.f65167));
            if (jM42087 == -1) {
                jM42087 = -1;
            }
            this.f65166 = jM42087;
        }
        while (true) {
            long j2 = this.f65166;
            if (j2 != -1 && this.f65164 >= j2) {
                return;
            }
            if (this.f65165) {
                throw new InterruptedIOException();
            }
            long j3 = this.f65166;
            long jMo22530 = this.f65161.mo22530(this.f65167, this.f65164, j3 == -1 ? Long.MAX_VALUE : j3 - this.f65164);
            if (jMo22530 > 0) {
                this.f65164 += jMo22530;
            } else {
                long j4 = -jMo22530;
                if (j4 == C25227.FOREVER_NS) {
                    j4 = -1;
                }
                long j5 = this.f65164;
                C24777 c24777 = this.f65163;
                boolean z = true;
                boolean z2 = j5 + j4 == this.f65166 || j4 == -1;
                if (j4 != -1) {
                    C11941 c11941M56734 = c25368.m56734();
                    c11941M56734.m29917(j5);
                    c11941M56734.m29910(j4);
                    try {
                        jMo8326 = c24777.mo8326(c11941M56734.m29908());
                    } catch (Exception unused) {
                        C18856.m43745(c24777);
                        z = false;
                        jMo8326 = -1;
                    }
                } else {
                    z = false;
                    jMo8326 = -1;
                }
                if (!z) {
                    if (this.f65165) {
                        throw new InterruptedIOException();
                    }
                    C11941 c11941M56735 = c25368.m56734();
                    c11941M56735.m29917(j5);
                    c11941M56735.m29910(-1L);
                    try {
                        jMo8326 = c24777.mo8326(c11941M56735.m29908());
                    } catch (Exception e) {
                        C18856.m43745(c24777);
                        throw e;
                    }
                }
                if (z2 && jMo8326 != -1) {
                    long j6 = jMo8326 + j5;
                    try {
                        if (this.f65166 != j6) {
                            this.f65166 = j6;
                        }
                    } catch (Exception e2) {
                        C18856.m43745(c24777);
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (this.f65165) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.f65162;
                    i = c24777.read(bArr, 0, bArr.length);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                if (z2) {
                    long j7 = ((long) i2) + j5;
                    if (this.f65166 != j7) {
                        this.f65166 = j7;
                    }
                }
                c24777.close();
                this.f65164 = j5 + ((long) i2);
            }
        }
    }
}
