package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7BG */
/* JADX INFO: loaded from: classes3.dex */
public final class C3982 extends C12185 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f13631 = System.in;

    @Override // l.C12185, l.InterfaceC18152
    public final String getName() {
        return "stdin/stdin";
    }

    @Override // l.C12185
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo12836() {
        if (this.f39174 != null) {
            return;
        }
        InputStream inputStream = this.f13631;
        try {
            byte[] bArr = new byte[32768];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    this.f39174 = byteArrayOutputStream.toByteArray();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
