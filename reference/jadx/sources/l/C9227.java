package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9227 extends AbstractC20836 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2516 f30058;

    public C9227(C2516 c2516) {
        this.f30058 = c2516;
    }

    @Override // l.AbstractC20836
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo24413(Object obj) {
        Long l2 = (Long) obj;
        C2516 c2516 = this.f30058;
        InterfaceC24277 interfaceC24277M8403 = C2516.m8403(c2516);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            interfaceC24277M8403.seek(l2.longValue() * 102400);
            int iMo46455 = interfaceC24277M8403.mo46455(bArr);
            if (iMo46455 == -1) {
                return new byte[0];
            }
            return iMo46455 != 102400 ? Arrays.copyOf(bArr, iMo46455) : bArr;
        } finally {
            C2516.m8404(c2516, interfaceC24277M8403);
        }
    }
}
