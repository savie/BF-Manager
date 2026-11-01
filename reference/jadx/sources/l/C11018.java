package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۧ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11018 implements InterfaceC16662 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC4397 f37456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15070 f37457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f37458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37459;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37460;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C11018() {
        this(1024);
    }

    public C11018(int i) {
        this.f37456 = new C6078(this);
        this.f37457 = new C15070();
        this.f37458 = new byte[i];
        this.f37460 = 0;
        this.f37459 = 0;
    }

    @Override // l.InterfaceC16662
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || (i + i2) - bArr.length > 0) {
            throw new IndexOutOfBoundsException();
        }
        m27772(this.f37459 + i2);
        System.arraycopy(bArr, i, this.f37458, this.f37459, i2);
        int i3 = this.f37459 + i2;
        this.f37459 = i3;
        if (i3 > this.f37460) {
            this.f37460 = i3;
        }
    }

    @Override // l.InterfaceC16662
    public final void seek(long j) {
        if (j == -1) {
            this.f37459 = this.f37460;
        } else {
            if (j < 0 || j > this.f37460) {
                throw new IndexOutOfBoundsException();
            }
            this.f37459 = (int) j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27779(int i) {
        this.f37460 = i;
        if (this.f37459 > i) {
            this.f37459 = i;
        }
    }

    @Override // l.InterfaceC16662
    public final long getPosition() {
        return this.f37459;
    }

    @Override // l.InterfaceC16662
    public final void writeByte(int i) {
        m27772(this.f37459 + 1);
        byte[] bArr = this.f37458;
        int i2 = this.f37459;
        int i3 = i2 + 1;
        this.f37459 = i3;
        bArr[i2] = (byte) i;
        if (i3 > this.f37460) {
            this.f37460 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27783(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m27784(true);
            m27786(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27784(boolean z) {
        writeByte(z ? 255 : 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27792(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m27784(true);
            m27782((CharSequence) str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27781(Boolean bool) {
        if (bool == null) {
            writeByte(0);
        } else if (bool.booleanValue()) {
            writeByte(1);
        } else {
            writeByte(2);
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ */
    public final void mo24505(short s) {
        m27772(this.f37459 + 2);
        byte[] bArr = this.f37458;
        int i = this.f37459;
        int i2 = i + 1;
        this.f37459 = i2;
        bArr[i] = (byte) (s & 255);
        int i3 = i + 2;
        this.f37459 = i3;
        bArr[i2] = (byte) ((s >>> 8) & 255);
        if (i3 > this.f37460) {
            this.f37460 = i3;
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ᩺ */
    public final void mo24508(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException(C8479.m22141(i, "Data out of range (UShort): "));
        }
        m27772(this.f37459 + 2);
        byte[] bArr = this.f37458;
        int i2 = this.f37459;
        int i3 = i2 + 1;
        this.f37459 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f37459 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        if (i4 > this.f37460) {
            this.f37460 = i4;
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ */
    public final void mo24501(char c) {
        m27772(this.f37459 + 2);
        byte[] bArr = this.f37458;
        int i = this.f37459;
        int i2 = i + 1;
        this.f37459 = i2;
        bArr[i] = (byte) (c & 255);
        int i3 = i + 2;
        this.f37459 = i3;
        bArr[i2] = (byte) ((c >>> '\b') & 255);
        if (i3 > this.f37460) {
            this.f37460 = i3;
        }
    }

    @Override // l.InterfaceC16662
    public final void writeInt(int i) {
        m27772(this.f37459 + 4);
        byte[] bArr = this.f37458;
        int i2 = this.f37459;
        int i3 = i2 + 1;
        this.f37459 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f37459 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i2 + 3;
        this.f37459 = i5;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        int i6 = i2 + 4;
        this.f37459 = i6;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        if (i6 > this.f37460) {
            this.f37460 = i6;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27790(int i) {
        m27772(this.f37459 + 4);
        byte[] bArr = this.f37458;
        int i2 = this.f37459;
        int i3 = i2 + 1;
        this.f37459 = i3;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i2 + 2;
        this.f37459 = i4;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i2 + 3;
        this.f37459 = i5;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i2 + 4;
        this.f37459 = i6;
        bArr[i5] = (byte) (i & 255);
        if (i6 > this.f37460) {
            this.f37460 = i6;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27791(long j) {
        m27772(this.f37459 + 8);
        byte[] bArr = this.f37458;
        int i = this.f37459;
        int i2 = i + 1;
        this.f37459 = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f37459 = i3;
        bArr[i2] = (byte) ((j >>> 8) & 255);
        int i4 = i + 3;
        this.f37459 = i4;
        bArr[i3] = (byte) ((j >>> 16) & 255);
        int i5 = i + 4;
        this.f37459 = i5;
        bArr[i4] = (byte) ((j >>> 24) & 255);
        int i6 = i + 5;
        this.f37459 = i6;
        bArr[i5] = (byte) ((j >>> 32) & 255);
        int i7 = i + 6;
        this.f37459 = i7;
        bArr[i6] = (byte) ((j >>> 40) & 255);
        int i8 = i + 7;
        this.f37459 = i8;
        bArr[i7] = (byte) ((j >>> 48) & 255);
        int i9 = i + 8;
        this.f37459 = i9;
        bArr[i8] = (byte) ((j >>> 56) & 255);
        if (i9 > this.f37460) {
            this.f37460 = i9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27778(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ */
    public final void mo24506(int[] iArr) {
        m27772((iArr.length * 4) + this.f37459);
        for (int i : iArr) {
            byte[] bArr = this.f37458;
            int i2 = this.f37459;
            int i3 = i2 + 1;
            this.f37459 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f37459 = i4;
            bArr[i3] = (byte) ((i >>> 8) & 255);
            int i5 = i2 + 3;
            this.f37459 = i5;
            bArr[i4] = (byte) ((i >>> 16) & 255);
            this.f37459 = i2 + 4;
            bArr[i5] = (byte) ((i >>> 24) & 255);
        }
        int i6 = this.f37459;
        if (i6 > this.f37460) {
            this.f37460 = i6;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27794(byte[] bArr) {
        writeInt(bArr.length);
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27795(int[] iArr) {
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27782(CharSequence charSequence) {
        if (charSequence == null) {
            writeInt(0);
            return;
        }
        int iM52794 = C23967.m52794(charSequence);
        writeInt(iM52794);
        m27772(this.f37459 + iM52794);
        try {
            C23967.m52799(this.f37456, charSequence, false);
            int i = this.f37459;
            if (i > this.f37460) {
                this.f37460 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27776(String str) {
        if (str == null) {
            mo24508(0);
            return;
        }
        int iM52794 = C23967.m52794(str);
        mo24508(iM52794);
        m27772(this.f37459 + iM52794);
        try {
            C23967.m52799(this.f37456, (CharSequence) str, false);
            int i = this.f37459;
            if (i > this.f37460) {
                this.f37460 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m27786(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۙ */
    public final void mo24502(int i, String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length && i != 0; i2++) {
            mo24501(charArray[i2]);
            i--;
        }
        if (i > 0) {
            int i3 = i * 2;
            m27772(this.f37459 + i3);
            byte[] bArr = this.f37458;
            int i4 = this.f37459;
            Arrays.fill(bArr, i4, i4 + i3, (byte) 0);
            int i5 = this.f37459 + i3;
            this.f37459 = i5;
            if (i5 > this.f37460) {
                this.f37460 = i5;
            }
        }
    }

    @Override // l.InterfaceC16662
    public final void skipBytes(int i) {
        m27772(this.f37459 + i);
        int i2 = this.f37459 + i;
        this.f37459 = i2;
        if (i2 > this.f37460) {
            this.f37460 = i2;
        }
    }

    @Override // l.InterfaceC16662
    /* JADX INFO: renamed from: ۘۨ */
    public final void mo24500() {
        skipBytes(4);
    }

    public final long length() {
        return this.f37460;
    }

    public final int size() {
        return this.f37460;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27774() {
        this.f37460 = 0;
        this.f37459 = 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m27773() {
        return Arrays.copyOf(this.f37458, this.f37460);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m27788() {
        return this.f37458;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m27789() {
        return C18019.m41968(this.f37458, this.f37460);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] m27798() {
        return C18019.m41965(0, this.f37460, this.f37458);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m27796() {
        try {
            return C7539.m20059(this.f37458, this.f37460);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27780(OutputStream outputStream) throws IOException {
        outputStream.write(this.f37458, 0, this.f37460);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27793(MessageDigest messageDigest) {
        messageDigest.update(this.f37458, 0, this.f37460);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m27785(MessageDigest messageDigest) {
        messageDigest.update(this.f37458, 0, this.f37460);
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m27772(int i) {
        byte[] bArr = this.f37458;
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
            this.f37458 = Arrays.copyOf(bArr, length);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m27799() {
        this.f37457.add(this.f37459);
        writeInt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27777() {
        int iM27092 = this.f37457.m27092();
        C15157.m36338(iM27092, (this.f37459 - iM27092) - 4, this.f37458);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27775(int i) {
        m27772(this.f37459 + 5);
        byte[] bArr = this.f37458;
        while ((((long) i) & 4294967295L) > 127) {
            int i2 = this.f37459;
            this.f37459 = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i3 = this.f37459;
        int i4 = i3 + 1;
        this.f37459 = i4;
        bArr[i3] = (byte) i;
        if (i4 > this.f37460) {
            this.f37460 = i4;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m27787(int i) {
        m27772(this.f37459 + 5);
        byte[] bArr = this.f37458;
        if (i >= 0) {
            while (i > 63) {
                int i2 = this.f37459;
                this.f37459 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        } else {
            while (i < -64) {
                int i3 = this.f37459;
                this.f37459 = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>= 7;
            }
        }
        int i4 = this.f37459;
        int i5 = i4 + 1;
        this.f37459 = i5;
        bArr[i4] = (byte) (i & 127);
        if (i5 > this.f37460) {
            this.f37460 = i5;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m27797() {
        byte[] bArr = this.f37458;
        int length = bArr.length;
        int i = this.f37460;
        if (length != i) {
            this.f37458 = Arrays.copyOf(bArr, i);
        }
    }
}
