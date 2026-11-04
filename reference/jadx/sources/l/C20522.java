package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.᩵ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20522 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        byte[] byteArray;
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) ((C14270) c19929.m45858()).m34634()));
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
        C14270 c14270 = new C14270();
        c14270.m34620(byteArray);
        c19929.m45857(c14270);
    }
}
