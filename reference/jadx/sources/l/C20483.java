package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20483 extends AbstractC21188 {
    @Override // l.AbstractC21188
    /* JADX INFO: renamed from: ۙ */
    public final C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C11634 c11634 = new C11634(byteBuffer.array(), byteBuffer.limit());
            c11634.m29034(12);
            int iM29036 = (c11634.m29036() + c11634.m29039(12)) - 4;
            c11634.m29034(44);
            c11634.m29043(c11634.m29039(12));
            c11634.m29034(16);
            ArrayList arrayList = new ArrayList();
            while (c11634.m29036() < iM29036) {
                c11634.m29034(48);
                int iM29039 = c11634.m29039(8);
                c11634.m29034(4);
                int iM29037 = c11634.m29036() + c11634.m29039(12);
                String str = null;
                String str2 = null;
                while (c11634.m29036() < iM29037) {
                    int iM290310 = c11634.m29039(8);
                    int iM290311 = c11634.m29039(8);
                    int iM29038 = c11634.m29036() + iM290311;
                    if (iM290310 == 2) {
                        int iM290312 = c11634.m29039(16);
                        c11634.m29034(8);
                        if (iM290312 == 3) {
                            while (c11634.m29036() < iM29038) {
                                int iM290313 = c11634.m29039(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM290313];
                                c11634.m29041(iM290313, bArr);
                                str = new String(bArr, charset);
                                int iM290314 = c11634.m29039(8);
                                for (int i = 0; i < iM290314; i++) {
                                    c11634.m29043(c11634.m29039(8));
                                }
                            }
                        }
                    } else if (iM290310 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM290311];
                        c11634.m29041(iM290311, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c11634.m29029(iM29038 * 8);
                }
                c11634.m29029(iM29037 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C16250(iM29039, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0987(arrayList);
            }
        }
        return null;
    }
}
