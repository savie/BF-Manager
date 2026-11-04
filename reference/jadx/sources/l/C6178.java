package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6178 implements InterfaceC23332 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21042;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14763 f21043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f21044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7669 f21045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21046;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C6178() {
        this(1024);
    }

    public C6178(int i) {
        this.f21045 = new C12143(this);
        this.f21043 = new C14763();
        this.f21044 = new byte[i];
        this.f21046 = 0;
        this.f21042 = 0;
    }

    @Override // l.InterfaceC23332
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || (i + i2) - bArr.length > 0) {
            throw new IndexOutOfBoundsException();
        }
        m17778(this.f21042 + i2);
        System.arraycopy(bArr, i, this.f21044, this.f21042, i2);
        int i3 = this.f21042 + i2;
        this.f21042 = i3;
        if (i3 > this.f21046) {
            this.f21046 = i3;
        }
    }

    @Override // l.InterfaceC23332
    public final void seek(long j) {
        if (j == -1) {
            this.f21042 = this.f21046;
        } else {
            if (j < 0 || j > this.f21046) {
                throw new IndexOutOfBoundsException();
            }
            this.f21042 = (int) j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17782(int i) {
        this.f21046 = i;
        if (this.f21042 > i) {
            this.f21042 = i;
        }
    }

    @Override // l.InterfaceC23332
    public final long getPosition() {
        return this.f21042;
    }

    @Override // l.InterfaceC23332
    public final void writeByte(int i) {
        m17778(this.f21042 + 1);
        byte[] bArr = this.f21044;
        int i2 = this.f21042;
        int i3 = i2 + 1;
        this.f21042 = i3;
        bArr[i2] = (byte) i;
        if (i3 > this.f21046) {
            this.f21046 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17787(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m17789(true);
            m17800(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17789(boolean z) {
        writeByte(z ? 255 : 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17804(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m17789(true);
            m17786((CharSequence) str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17785(Boolean bool) {
        if (bool == null) {
            writeByte(0);
        } else if (bool.booleanValue()) {
            writeByte(1);
        } else {
            writeByte(2);
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17788(short s) {
        m17778(this.f21042 + 2);
        byte[] bArr = this.f21044;
        int i = this.f21042;
        int i2 = i + 1;
        this.f21042 = i2;
        bArr[i] = (byte) (s & 255);
        int i3 = i + 2;
        this.f21042 = i3;
        bArr[i2] = (byte) ((s >>> 8) & 255);
        if (i3 > this.f21046) {
            this.f21046 = i3;
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo17812(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException(C13645.m33382(i, "Data out of range (UShort): "));
        }
        m17778(this.f21042 + 2);
        byte[] bArr = this.f21044;
        int i2 = this.f21042;
        int i3 = i2 + 1;
        this.f21042 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f21042 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        if (i4 > this.f21046) {
            this.f21046 = i4;
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo17801(char c) {
        m17778(this.f21042 + 2);
        byte[] bArr = this.f21044;
        int i = this.f21042;
        int i2 = i + 1;
        this.f21042 = i2;
        bArr[i] = (byte) (c & 255);
        int i3 = i + 2;
        this.f21042 = i3;
        bArr[i2] = (byte) ((c >>> '\b') & 255);
        if (i3 > this.f21046) {
            this.f21046 = i3;
        }
    }

    @Override // l.InterfaceC23332
    public final void writeInt(int i) {
        m17778(this.f21042 + 4);
        byte[] bArr = this.f21044;
        int i2 = this.f21042;
        int i3 = i2 + 1;
        this.f21042 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f21042 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i2 + 3;
        this.f21042 = i5;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        int i6 = i2 + 4;
        this.f21042 = i6;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        if (i6 > this.f21046) {
            this.f21046 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17802(int i) {
        m17778(this.f21042 + 4);
        byte[] bArr = this.f21044;
        int i2 = this.f21042;
        int i3 = i2 + 1;
        this.f21042 = i3;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i2 + 2;
        this.f21042 = i4;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i2 + 3;
        this.f21042 = i5;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i2 + 4;
        this.f21042 = i6;
        bArr[i5] = (byte) (i & 255);
        if (i6 > this.f21046) {
            this.f21046 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17803(long j) {
        m17778(this.f21042 + 8);
        byte[] bArr = this.f21044;
        int i = this.f21042;
        int i2 = i + 1;
        this.f21042 = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f21042 = i3;
        bArr[i2] = (byte) ((j >>> 8) & 255);
        int i4 = i + 3;
        this.f21042 = i4;
        bArr[i3] = (byte) ((j >>> 16) & 255);
        int i5 = i + 4;
        this.f21042 = i5;
        bArr[i4] = (byte) ((j >>> 24) & 255);
        int i6 = i + 5;
        this.f21042 = i6;
        bArr[i5] = (byte) ((j >>> 32) & 255);
        int i7 = i + 6;
        this.f21042 = i7;
        bArr[i6] = (byte) ((j >>> 40) & 255);
        int i8 = i + 7;
        this.f21042 = i8;
        bArr[i7] = (byte) ((j >>> 48) & 255);
        int i9 = i + 8;
        this.f21042 = i9;
        bArr[i8] = (byte) ((j >>> 56) & 255);
        if (i9 > this.f21046) {
            this.f21046 = i9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17781(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17790(int[] iArr) {
        m17778((iArr.length * 4) + this.f21042);
        for (int i : iArr) {
            byte[] bArr = this.f21044;
            int i2 = this.f21042;
            int i3 = i2 + 1;
            this.f21042 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f21042 = i4;
            bArr[i3] = (byte) ((i >>> 8) & 255);
            int i5 = i2 + 3;
            this.f21042 = i5;
            bArr[i4] = (byte) ((i >>> 16) & 255);
            this.f21042 = i2 + 4;
            bArr[i5] = (byte) ((i >>> 24) & 255);
        }
        int i6 = this.f21042;
        if (i6 > this.f21046) {
            this.f21046 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17806(byte[] bArr) {
        writeInt(bArr.length);
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17807(int[] iArr) {
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17786(CharSequence charSequence) {
        if (charSequence == null) {
            writeInt(0);
            return;
        }
        int iM48759 = C21443.m48759(charSequence);
        writeInt(iM48759);
        m17778(this.f21042 + iM48759);
        try {
            C21443.m48764(this.f21045, charSequence, false);
            int i = this.f21042;
            if (i > this.f21046) {
                this.f21046 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17810(String str) {
        if (str == null) {
            mo17812(0);
            return;
        }
        int iM48759 = C21443.m48759(str);
        mo17812(iM48759);
        m17778(this.f21042 + iM48759);
        try {
            C21443.m48764(this.f21045, (CharSequence) str, false);
            int i = this.f21042;
            if (i > this.f21046) {
                this.f21046 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m17800(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17783(int i, String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length && i != 0; i2++) {
            mo17801(charArray[i2]);
            i--;
        }
        if (i > 0) {
            int i3 = i * 2;
            m17778(this.f21042 + i3);
            byte[] bArr = this.f21044;
            int i4 = this.f21042;
            Arrays.fill(bArr, i4, i4 + i3, (byte) 0);
            int i5 = this.f21042 + i3;
            this.f21042 = i5;
            if (i5 > this.f21046) {
                this.f21046 = i5;
            }
        }
    }

    @Override // l.InterfaceC23332
    public final void skipBytes(int i) {
        m17778(this.f21042 + i);
        int i2 = this.f21042 + i;
        this.f21042 = i2;
        if (i2 > this.f21046) {
            this.f21046 = i2;
        }
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ۧۤ, reason: not valid java name and contains not printable characters */
    public final void mo17795() {
        skipBytes(4);
    }

    public final long length() {
        return this.f21046;
    }

    public final int size() {
        return this.f21046;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17793() {
        this.f21046 = 0;
        this.f21042 = 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] m17796() {
        return Arrays.copyOf(this.f21044, this.f21046);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m17808() {
        return this.f21044;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m17792() {
        return C15768.m37706(this.f21044, this.f21046);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m17799() {
        return C15768.m37703(0, this.f21046, this.f21044);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] m17798() {
        try {
            return C4515.m14240(this.f21044, this.f21046);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17784(OutputStream outputStream) throws IOException {
        outputStream.write(this.f21044, 0, this.f21046);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17805(MessageDigest messageDigest) {
        messageDigest.update(this.f21044, 0, this.f21046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m17791(MessageDigest messageDigest) {
        messageDigest.update(this.f21044, 0, this.f21046);
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m17778(int i) {
        byte[] bArr = this.f21044;
        if (i - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                length = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f21044 = Arrays.copyOf(bArr, length);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m17797() {
        this.f21043.add(this.f21042);
        writeInt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17780() {
        int iM37463 = this.f21043.m37463();
        C6929.m19210(iM37463, (this.f21042 - iM37463) - 4, this.f21044);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17809(int i) {
        m17778(this.f21042 + 5);
        byte[] bArr = this.f21044;
        while ((((long) i) & 4294967295L) > 127) {
            int i2 = this.f21042;
            this.f21042 = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i3 = this.f21042;
        int i4 = i3 + 1;
        this.f21042 = i4;
        bArr[i3] = (byte) i;
        if (i4 > this.f21046) {
            this.f21046 = i4;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17794(int i) {
        m17778(this.f21042 + 5);
        byte[] bArr = this.f21044;
        if (i >= 0) {
            while (i > 63) {
                int i2 = this.f21042;
                this.f21042 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        } else {
            while (i < -64) {
                int i3 = this.f21042;
                this.f21042 = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>= 7;
            }
        }
        int i4 = this.f21042;
        int i5 = i4 + 1;
        this.f21042 = i5;
        bArr[i4] = (byte) (i & 127);
        if (i5 > this.f21046) {
            this.f21046 = i5;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m17811() {
        byte[] bArr = this.f21044;
        int length = bArr.length;
        int i = this.f21046;
        if (length != i) {
            this.f21044 = Arrays.copyOf(bArr, i);
        }
    }
}
