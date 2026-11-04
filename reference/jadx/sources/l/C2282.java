package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2282 extends AbstractC13468 {
    @Override // l.AbstractC13468
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C14573 c14573 = new C14573(byteBuffer.array(), byteBuffer.limit());
            c14573.m35161(12);
            int iM35156 = (c14573.m35156() + c14573.m35163(12)) - 4;
            c14573.m35161(44);
            c14573.m35160(c14573.m35163(12));
            c14573.m35161(16);
            ArrayList arrayList = new ArrayList();
            while (c14573.m35156() < iM35156) {
                c14573.m35161(48);
                int iM35163 = c14573.m35163(8);
                c14573.m35161(4);
                int iM35157 = c14573.m35156() + c14573.m35163(12);
                String str = null;
                String str2 = null;
                while (c14573.m35156() < iM35157) {
                    int iM35164 = c14573.m35163(8);
                    int iM35165 = c14573.m35163(8);
                    int iM35158 = c14573.m35156() + iM35165;
                    if (iM35164 == 2) {
                        int iM35166 = c14573.m35163(16);
                        c14573.m35161(8);
                        if (iM35166 == 3) {
                            while (c14573.m35156() < iM35158) {
                                int iM35167 = c14573.m35163(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM35167];
                                c14573.m35165(iM35167, bArr);
                                str = new String(bArr, charset);
                                int iM35168 = c14573.m35163(8);
                                for (int i = 0; i < iM35168; i++) {
                                    c14573.m35160(c14573.m35163(8));
                                }
                            }
                        }
                    } else if (iM35164 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM35165];
                        c14573.m35165(iM35165, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c14573.m35167(iM35158 * 8);
                }
                c14573.m35167(iM35157 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C6011(iM35163, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C19378(arrayList);
            }
        }
        return null;
    }
}
