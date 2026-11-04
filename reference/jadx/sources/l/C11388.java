package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11388 implements InterfaceC9397 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f35847 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DataOutputStream f35846 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private synchronized void m28733(String str) {
        if (this.f35847 && this.f35846.size() >= 0) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28738(DataOutputStream dataOutputStream) {
        this.f35846 = dataOutputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28734() {
        this.f35846.write(0);
        m28733("Writing byte: 0");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28736(int i, byte[] bArr) {
        this.f35846.write(bArr, 0, i);
        m28733("Writing byte-array: " + bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28735(int i) throws IOException {
        this.f35846.writeByte(i);
        m28733("Writing writeByte: " + i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28740(int i) throws IOException {
        this.f35846.writeShort(i);
        m28733("Writing writeShort: " + i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28741(int i) throws IOException {
        this.f35846.writeInt(i);
        m28733("Writing writeInt: " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28737(long j) throws IOException {
        this.f35846.writeLong(j);
        m28733("Writing writeLong: " + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28739(String str) throws IOException {
        this.f35846.writeBytes(str);
        m28733("Writing writeBytes: " + str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28742(String str) throws IOException {
        this.f35846.writeUTF(str);
        m28733("Writing writeUTF: " + str);
    }
}
