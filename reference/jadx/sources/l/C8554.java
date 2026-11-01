package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۡ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87V9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8554 extends C7142 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29585;

    static {
        byte[] bArr = C8491.f29422;
        f29585 = C8491.m22175("direct-streamlocal@openssh.com", StandardCharsets.UTF_8);
    }

    public C8554() {
        this.f25817 = f29585;
        this.f25812 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25819 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f25810 = 16384;
    }

    @Override // l.C7142, l.AbstractC7848
    /* JADX INFO: renamed from: ۚ */
    public final C7307 mo19046() {
        this.f25816.f11634.m1333().getClass();
        throw new RuntimeException("socketPath must be set");
    }
}
