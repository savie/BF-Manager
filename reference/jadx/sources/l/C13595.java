package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87V9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13595 extends C22106 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f43174;

    static {
        byte[] bArr = C9011.f29358;
        f43174 = C9011.m24055("direct-streamlocal@openssh.com", StandardCharsets.UTF_8);
    }

    public C13595() {
        this.f27474 = f43174;
        this.f27468 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27471 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f27475 = 16384;
    }

    @Override // l.C22106, l.AbstractC8375
    /* JADX INFO: renamed from: ᩴ */
    public final C14010 mo22547() {
        this.f27469.f51127.m45899().getClass();
        throw new RuntimeException("socketPath must be set");
    }
}
