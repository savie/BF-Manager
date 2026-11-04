package l;

import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 4QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C8952 extends AbstractC9697 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f29207;

    public C8952(InputStream inputStream) throws C13996 {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f29207 = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C13996();
        }
        this.f31310 = dataInputStream.readInt();
        this.f31311 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23940() {
        return this.f31310 == 0;
    }

    @Override // l.AbstractC9697
    /* JADX INFO: renamed from: ۙ */
    public final void mo9706() {
        if ((this.f31311 & (-16777216)) == 0) {
            this.f31310 = (this.f31310 << 8) | this.f29207.readUnsignedByte();
            this.f31311 <<= 8;
        }
    }
}
