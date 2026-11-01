package l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܰۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C13603 implements InterfaceC4429 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f44871 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9287 f44872;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Charset f44873;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f44874;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f44875;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public BufferedWriter f44876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public OutputStream f44878;

    public C13603(C9287 c9287, int i, Charset charset, byte[] bArr, String str) {
        this.f44872 = c9287;
        this.f44875 = i;
        this.f44873 = charset;
        this.f44874 = bArr;
        this.f44877 = str;
    }

    @Override // l.InterfaceC4429
    /* JADX INFO: renamed from: ۙ */
    public final void mo12361(String str) throws IOException {
        m33239();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                this.f44876.write(this.f44877);
            } else {
                this.f44876.write(cCharAt);
            }
        }
    }

    @Override // l.InterfaceC4429
    /* JADX INFO: renamed from: ۙ */
    public final void mo12359(char c) throws IOException {
        m33239();
        if (c == '\n') {
            this.f44876.write(this.f44877);
        } else {
            this.f44876.write(c);
        }
    }

    @Override // l.InterfaceC4429
    /* JADX INFO: renamed from: ۙ */
    public final void mo12360(int i) throws IOException {
        m33239();
        if (i == 10) {
            this.f44876.write(this.f44877);
        } else {
            this.f44876.write(Character.toChars(i));
        }
    }

    @Override // l.InterfaceC4429
    /* JADX INFO: renamed from: ۙ */
    public final void mo12358() throws IOException {
        m33239();
        m33238();
        this.f44872.m23831();
        this.f44871++;
    }

    @Override // l.InterfaceC4429
    /* JADX INFO: renamed from: ܰ */
    public final int mo12362() {
        return this.f44871 - 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m33240() {
        try {
            m33238();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33241() {
        try {
            m33238();
        } catch (IOException unused) {
        }
        this.f44872.m23830();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m33239() throws IOException {
        byte[] bArr;
        if (this.f44876 != null) {
            return;
        }
        OutputStream outputStreamM23829 = this.f44872.m23829(this.f44871, this.f44875);
        this.f44878 = outputStreamM23829;
        if (this.f44871 == 1 && (bArr = this.f44874) != null) {
            outputStreamM23829.write(bArr);
        }
        this.f44876 = new BufferedWriter(new OutputStreamWriter(this.f44878, this.f44873));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m33238() throws IOException {
        BufferedWriter bufferedWriter = this.f44876;
        if (bufferedWriter != null) {
            bufferedWriter.close();
            this.f44876 = null;
            this.f44878 = null;
        } else {
            OutputStream outputStream = this.f44878;
            if (outputStream != null) {
                outputStream.close();
                this.f44878 = null;
            }
        }
    }
}
