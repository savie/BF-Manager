package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes5.dex */
public final class C19849 implements DataInput {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f63788;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DataInputStream f63789;

    public C19849(DataInputStream dataInputStream, InterfaceC7509 interfaceC7509) {
        this.f63789 = dataInputStream;
        this.f63788 = interfaceC7509;
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
        InterfaceC7509 interfaceC7509 = this.f63788;
        C11644.m29273(interfaceC7509);
        int i3 = i2 + i;
        while (i < i3) {
            int iMin = Math.min(65536, i3 - i);
            this.f63789.readFully(bArr, i, iMin);
            i += iMin;
            C11644.m29273(interfaceC7509);
        }
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws IOException {
        InterfaceC7509 interfaceC7509;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        while (true) {
            interfaceC7509 = this.f63788;
            if (i2 >= i) {
                break;
            }
            C11644.m29273(interfaceC7509);
            int iSkipBytes = this.f63789.skipBytes(Math.min(65536, i - i2));
            if (iSkipBytes == 0) {
                break;
            }
            i2 += iSkipBytes;
        }
        C11644.m29273(interfaceC7509);
        return i2;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final short readShort() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readShort();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        C11644.m29273(this.f63788);
        return this.f63789.readInt();
    }

    @Override // java.io.DataInput
    public final long readLong() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readLong();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readFloat();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C9446 {
        C11644.m29273(this.f63788);
        return this.f63789.readDouble();
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        InterfaceC7509 interfaceC7509 = this.f63788;
        C11644.m29273(interfaceC7509);
        String line = this.f63789.readLine();
        C11644.m29273(interfaceC7509);
        return line;
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        InterfaceC7509 interfaceC7509 = this.f63788;
        C11644.m29273(interfaceC7509);
        String utf = this.f63789.readUTF();
        C11644.m29273(interfaceC7509);
        return utf;
    }
}
