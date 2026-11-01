package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes4.dex */
public final class C19854 implements DataInput {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f63684;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DataInputStream f63685;

    public C19854(DataInputStream dataInputStream, InterfaceC5614 interfaceC5614) {
        this.f63685 = dataInputStream;
        this.f63684 = interfaceC5614;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || ((long) i) + ((long) i2) > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid checkpoint input range");
        }
        InterfaceC5614 interfaceC5614 = this.f63684;
        C5742.m15809(interfaceC5614);
        int i3 = i2 + i;
        while (i < i3) {
            int iMin = Math.min(65536, i3 - i);
            this.f63685.readFully(bArr, i, iMin);
            i += iMin;
            C5742.m15809(interfaceC5614);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        InterfaceC5614 interfaceC5614;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        while (true) {
            interfaceC5614 = this.f63684;
            if (i2 >= i) {
                break;
            }
            C5742.m15809(interfaceC5614);
            int iSkipBytes = this.f63685.skipBytes(Math.min(65536, i - i2));
            if (iSkipBytes == 0) {
                break;
            }
            i2 += iSkipBytes;
        }
        C5742.m15809(interfaceC5614);
        return i2;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final short readShort() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readShort();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        C5742.m15809(this.f63684);
        return this.f63685.readInt();
    }

    @Override // java.io.DataInput
    public final long readLong() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readLong();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readFloat();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C1105 {
        C5742.m15809(this.f63684);
        return this.f63685.readDouble();
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        InterfaceC5614 interfaceC5614 = this.f63684;
        C5742.m15809(interfaceC5614);
        String line = this.f63685.readLine();
        C5742.m15809(interfaceC5614);
        return line;
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        InterfaceC5614 interfaceC5614 = this.f63684;
        C5742.m15809(interfaceC5614);
        String utf = this.f63685.readUTF();
        C5742.m15809(interfaceC5614);
        return utf;
    }
}
