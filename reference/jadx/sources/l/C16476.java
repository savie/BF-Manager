package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ܽۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16476 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        byte[] byteArray;
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) ((C14277) c15313.m36673()).m34475()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            gZIPInputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C14277 c14277 = new C14277();
        c14277.m34465(byteArray);
        c15313.m36672(c14277);
    }
}
