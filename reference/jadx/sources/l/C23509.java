package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes.dex */
public final class C23509 implements InterfaceC19275 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76098 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DataOutputStream f76097 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private synchronized void m51763(String str) {
        if (this.f76098 && this.f76097.size() >= 0) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51768(DataOutputStream dataOutputStream) {
        this.f76097 = dataOutputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51764() {
        this.f76097.write(0);
        m51763("Writing byte: 0");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51766(int i, byte[] bArr) {
        this.f76097.write(bArr, 0, i);
        m51763("Writing byte-array: " + bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51765(int i) throws IOException {
        this.f76097.writeByte(i);
        m51763("Writing writeByte: " + i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51770(int i) throws IOException {
        this.f76097.writeShort(i);
        m51763("Writing writeShort: " + i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51771(int i) throws IOException {
        this.f76097.writeInt(i);
        m51763("Writing writeInt: " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51767(long j) throws IOException {
        this.f76097.writeLong(j);
        m51763("Writing writeLong: " + j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51769(String str) throws IOException {
        this.f76097.writeBytes(str);
        m51763("Writing writeBytes: " + str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51772(String str) throws IOException {
        this.f76097.writeUTF(str);
        m51763("Writing writeUTF: " + str);
    }
}
