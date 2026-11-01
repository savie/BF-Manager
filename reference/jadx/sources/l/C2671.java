package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7BG */
/* JADX INFO: loaded from: classes3.dex */
public final class C2671 extends C4788 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InputStream f10340 = System.in;

    @Override // l.C4788, l.InterfaceC1260
    public final String getName() {
        return "stdin/stdin";
    }

    @Override // l.C4788
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo8216() {
        if (this.f16839 != null) {
            return;
        }
        InputStream inputStream = this.f10340;
        try {
            byte[] bArr = new byte[32768];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    this.f16839 = byteArrayOutputStream.toByteArray();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
