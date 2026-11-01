package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܳۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes4.dex */
public final class C14360 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        InputStream inputStream = (InputStream) ((C14277) c15313.m36673()).m34475();
        C14277 c14277 = new C14277();
        try {
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            inputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            c14277.m34465(byteArray);
        } catch (Exception unused) {
        }
        c15313.m36672(c14277);
    }
}
