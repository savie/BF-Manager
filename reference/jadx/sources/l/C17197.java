package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f56026;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f56027;

    public C17197() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f56026 = byteArrayOutputStream;
        this.f56027 = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m40363(C11976 c11976) {
        DataOutputStream dataOutputStream = this.f56027;
        ByteArrayOutputStream byteArrayOutputStream = this.f56026;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c11976.f38569);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(c11976.f38568);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c11976.f38566);
            dataOutputStream.writeLong(c11976.f38567);
            dataOutputStream.write(c11976.f38571);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
