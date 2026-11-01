package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8AG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21272 f69800;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69801;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22684 f69802;

    public C21481(OutputStream outputStream) {
        C22684 c22684 = new C22684(outputStream);
        this.f69802 = c22684;
        this.f69800 = new C21272(new DataOutputStream(c22684));
        this.f69801 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48096(EnumC17953 enumC17953) throws IOException {
        if (enumC17953 == EnumC17953.ONE) {
            return;
        }
        long jM41778 = enumC17953.m41778();
        C22684 c22684 = this.f69802;
        long jM50249 = (((long) (~enumC17953.m41778())) & (c22684.m50249() + jM41778)) - c22684.m50249();
        while (true) {
            long j = jM50249 - 1;
            if (jM50249 <= 0) {
                return;
            }
            m48094(0);
            jM50249 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48093() throws IOException {
        int i = this.f69801;
        this.f69801 = i + 4;
        m48099(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48097(byte[] bArr) throws IOException {
        this.f69800.write(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48094(int i) throws IOException {
        this.f69800.writeByte(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48098(int i) throws IOException {
        this.f69800.writeShort(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48099(int i) throws IOException {
        this.f69800.writeInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48095(String str) throws IOException {
        this.f69800.writeChars(str);
    }
}
