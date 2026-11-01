package l;

import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7219 extends AbstractC8631 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f24047;

    public C7219(InputStream inputStream) throws C19838 {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f24047 = dataInputStream;
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C19838();
        }
        this.f29781 = dataInputStream.readInt();
        this.f29782 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19187() {
        return this.f29781 == 0;
    }

    @Override // l.AbstractC8631
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19186() {
        if ((this.f29782 & (-16777216)) == 0) {
            this.f29781 = (this.f29781 << 8) | this.f24047.readUnsignedByte();
            this.f29782 <<= 8;
        }
    }
}
