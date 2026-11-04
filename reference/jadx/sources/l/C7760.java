package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8AG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7760 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11731 f25544;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25545;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5766 f25546;

    public C7760(OutputStream outputStream) {
        C5766 c5766 = new C5766(outputStream);
        this.f25546 = c5766;
        this.f25544 = new C11731(new DataOutputStream(c5766));
        this.f25545 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21133(EnumC18947 enumC18947) throws IOException {
        if (enumC18947 == EnumC18947.ONE) {
            return;
        }
        long jM43975 = enumC18947.m43975();
        C5766 c5766 = this.f25546;
        long jM16843 = (((long) (~enumC18947.m43975())) & (c5766.m16843() + jM43975)) - c5766.m16843();
        while (true) {
            long j = jM16843 - 1;
            if (jM16843 <= 0) {
                return;
            }
            m21131(0);
            jM16843 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21130() throws IOException {
        int i = this.f25545;
        this.f25545 = i + 4;
        m21136(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21134(byte[] bArr) throws IOException {
        this.f25544.write(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21131(int i) throws IOException {
        this.f25544.writeByte(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21135(int i) throws IOException {
        this.f25544.writeShort(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21136(int i) throws IOException {
        this.f25544.writeInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21132(String str) throws IOException {
        this.f25544.writeChars(str);
    }
}
