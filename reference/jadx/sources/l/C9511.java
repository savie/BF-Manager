package l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۡܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C9511 implements InterfaceC1309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Charset f30802;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f30803;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30804;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30805 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OutputStream f30806;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f30807;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f30808;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19208 f30809;

    public C9511(C19208 c19208, int i, Charset charset, byte[] bArr, String str) {
        this.f30809 = c19208;
        this.f30804 = i;
        this.f30802 = charset;
        this.f30807 = bArr;
        this.f30808 = str;
    }

    @Override // l.InterfaceC1309
    /* JADX INFO: renamed from: ۙ */
    public final void mo4778(String str) throws IOException {
        m24897();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                this.f30803.write(this.f30808);
            } else {
                this.f30803.write(cCharAt);
            }
        }
    }

    @Override // l.InterfaceC1309
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4780(char c) throws IOException {
        m24897();
        if (c == '\n') {
            this.f30803.write(this.f30808);
        } else {
            this.f30803.write(c);
        }
    }

    @Override // l.InterfaceC1309
    /* JADX INFO: renamed from: ۙ */
    public final void mo4777(int i) throws IOException {
        m24897();
        if (i == 10) {
            this.f30803.write(this.f30808);
        } else {
            this.f30803.write(Character.toChars(i));
        }
    }

    @Override // l.InterfaceC1309
    /* JADX INFO: renamed from: ۙ */
    public final void mo4776() throws IOException {
        m24897();
        m24898();
        this.f30809.m44525();
        this.f30805++;
    }

    @Override // l.InterfaceC1309
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4779() {
        return this.f30805 - 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24899() {
        try {
            m24898();
        } catch (IOException unused) {
        }
        this.f30809.m44524();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24900() {
        try {
            m24898();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m24897() throws IOException {
        byte[] bArr;
        if (this.f30803 != null) {
            return;
        }
        OutputStream outputStreamM44523 = this.f30809.m44523(this.f30805, this.f30804);
        this.f30806 = outputStreamM44523;
        if (this.f30805 == 1 && (bArr = this.f30807) != null) {
            outputStreamM44523.write(bArr);
        }
        this.f30803 = new BufferedWriter(new OutputStreamWriter(this.f30806, this.f30802));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m24898() throws IOException {
        BufferedWriter bufferedWriter = this.f30803;
        if (bufferedWriter != null) {
            bufferedWriter.close();
            this.f30803 = null;
            this.f30806 = null;
        } else {
            OutputStream outputStream = this.f30806;
            if (outputStream != null) {
                outputStream.close();
                this.f30806 = null;
            }
        }
    }
}
