package org.bouncycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import l.C12669;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class PemWriter extends BufferedWriter {
    public static final int LINE_LENGTH = 64;
    public char[] buf;
    public final int nlLength;

    public PemWriter(Writer writer) {
        super(writer);
        this.buf = new char[64];
        String strLineSeparator = Strings.lineSeparator();
        this.nlLength = strLineSeparator != null ? strLineSeparator.length() : 2;
    }

    private void writeEncoded(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] bArrEncode = Base64.encode(bArr);
        int length = 0;
        while (length < bArrEncode.length) {
            int i2 = 0;
            while (true) {
                cArr = this.buf;
                if (i2 == cArr.length || (i = length + i2) >= bArrEncode.length) {
                    break;
                }
                cArr[i2] = (char) bArrEncode[i];
                i2++;
            }
            write(cArr, 0, i2);
            newLine();
            length += this.buf.length;
        }
    }

    private void writePostEncapsulationBoundary(String str) throws IOException {
        write(PemReader.END + str + "-----");
        newLine();
    }

    private void writePreEncapsulationBoundary(String str) throws IOException {
        write(PemReader.BEGIN + str + "-----");
        newLine();
    }

    public int getOutputSize(PemObject pemObject) {
        int iM31441 = C12669.m31441(pemObject.getType().length() + 10, this.nlLength, 2, 10);
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                iM31441 += pemHeader.getValue().length() + pemHeader.getName().length() + 2 + this.nlLength;
            }
            iM31441 += this.nlLength;
        }
        int length = ((pemObject.getContent().length + 2) / 3) * 4;
        return C12669.m31436((length + 63) / 64, this.nlLength, length, iM31441);
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
        PemObject pemObjectGenerate = pemObjectGenerator.generate();
        writePreEncapsulationBoundary(pemObjectGenerate.getType());
        if (!pemObjectGenerate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObjectGenerate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        writeEncoded(pemObjectGenerate.getContent());
        writePostEncapsulationBoundary(pemObjectGenerate.getType());
    }
}
