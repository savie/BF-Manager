package l;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܳ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69RK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14546 implements InterfaceC0433 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19551 f47627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f47628;

    public C14546(AbstractC20745 abstractC20745) {
        this.f47628 = abstractC20745.m46710("r");
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f47628.skipBytes(i) != i) {
            throw new EOFException();
        }
    }

    public final void seek(long j) {
        this.f47628.seek(j);
    }

    public final byte readByte() {
        return this.f47628.readByte();
    }

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final int m35013() {
        return this.f47628.mo4872();
    }

    @Override // l.InterfaceC0433
    public final int readInt() {
        return this.f47628.readInt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35010() {
        C1388 c1388 = this.f47628;
        long filePointer = c1388.getFilePointer();
        int i = c1388.readInt();
        c1388.seek(filePointer);
        return i;
    }

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m35012() throws EOFException {
        C1388 c1388 = this.f47628;
        int i = c1388.readInt();
        byte[] bArr = new byte[i];
        c1388.m4864(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m35009() {
        C1388 c1388 = this.f47628;
        int i = c1388.readInt();
        byte[] bArr = new byte[i];
        c1388.m4864(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m35011() {
        C19551 c19551 = this.f47627;
        if (c19551 == null) {
            c19551 = new C19551();
            this.f47627 = c19551;
        } else {
            c19551.m44640();
        }
        while (true) {
            int i = this.f47628.read();
            if (i > 0) {
                c19551.write(i);
            } else {
                return new String(c19551.f62829, 0, c19551.f62830, StandardCharsets.UTF_8);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47628.close();
    }
}
