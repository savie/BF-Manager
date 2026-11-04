package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import l.C16076;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DecodedStreamBuffer f120;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f122;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f123;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f124;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f125;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f126;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AWSS3V4Signer f128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InputStream f130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ChunkContentIterator f131;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f119 = new byte[0];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Log f118 = LogFactory.m296(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f127 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f121 = false;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        m276();
        if (!this.f127) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f130.markSupported()) {
            Log log = f118;
            if (log.mo287()) {
                log.mo291("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f130.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f118;
            if (log2.mo287()) {
                log2.mo291("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f120 = new DecodedStreamBuffer(this.f125);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        m276();
        this.f131 = null;
        this.f123 = this.f124;
        if (this.f130.markSupported()) {
            Log log = f118;
            if (log.mo287()) {
                log.mo291("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f130.reset();
        } else {
            Log log2 = f118;
            if (log2.mo287()) {
                log2.mo291("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f120;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.m214();
        }
        this.f131 = null;
        this.f127 = true;
        this.f121 = false;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWSS3V4Signer aWSS3V4Signer) {
        this.f130 = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f125, 262144);
            this.f130 = awsChunkedEncodingInputStream.f130;
            this.f120 = awsChunkedEncodingInputStream.f120;
        } else {
            this.f130 = inputStream;
            this.f120 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f125 = iMax;
        this.f126 = bArr;
        this.f129 = str;
        this.f122 = str2;
        this.f124 = str3;
        this.f123 = str3;
        this.f128 = aWSS3V4Signer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == -1) {
            return i;
        }
        Log log = f118;
        if (log.mo287()) {
            log.mo291("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        m276();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f131;
        if (chunkContentIterator == null || !chunkContentIterator.m211()) {
            if (this.f121) {
                return -1;
            }
            byte[] bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            int i3 = 0;
            while (i3 < 131072) {
                DecodedStreamBuffer decodedStreamBuffer = this.f120;
                if (decodedStreamBuffer != null && decodedStreamBuffer.m213()) {
                    bArr2[i3] = this.f120.m215();
                    i3++;
                } else {
                    int i4 = this.f130.read(bArr2, i3, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - i3);
                    if (i4 == -1) {
                        break;
                    }
                    DecodedStreamBuffer decodedStreamBuffer2 = this.f120;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.m212(i3, i4, bArr2);
                    }
                    i3 += i4;
                }
            }
            if (i3 == 0) {
                this.f131 = new ChunkContentIterator(m207(f119));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i3);
                    bArr2 = bArr3;
                }
                this.f131 = new ChunkContentIterator(m207(bArr2));
                z = false;
            }
            this.f121 = z;
        }
        int iM210 = this.f131.m210(bArr, i, i2);
        if (iM210 > 0) {
            this.f127 = false;
            Log log = f118;
            if (log.mo287()) {
                log.mo291(iM210 + " byte read from the stream.");
            }
        }
        return iM210;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(262144L, j);
        byte[] bArr = new byte[iMin];
        long j2 = j;
        while (j2 > 0 && (i = read(bArr, 0, iMin)) >= 0) {
            j2 -= (long) i;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m208(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j2 = j / 131072;
        long j3 = j % 131072;
        return (j2 * m206(131072L)) + (j3 > 0 ? m206(j3) : 0L) + m206(0L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m206(long j) {
        return ((long) (Long.toHexString(j).length() + 83)) + j + ((long) 2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private byte[] m207(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f129);
        sb2.append("\n");
        sb2.append(this.f122);
        sb2.append("\n");
        sb2.append(this.f123);
        sb2.append("\n");
        AWSS3V4Signer aWSS3V4Signer = this.f128;
        sb2.append(BinaryUtils.m744(aWSS3V4Signer.hash("")));
        sb2.append("\n");
        sb2.append(BinaryUtils.m744(aWSS3V4Signer.hash(bArr)));
        String strM744 = BinaryUtils.m744(aWSS3V4Signer.sign(sb2.toString(), this.f126, SigningAlgorithm.HmacSHA256));
        this.f123 = strM744;
        sb.append(";chunk-signature=" + strM744);
        sb.append("\r\n");
        try {
            String string = sb.toString();
            Charset charset = StringUtils.f834;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e) {
            throw new AmazonClientException(C16076.m38224(e, new StringBuilder("Unable to sign the chunked data. ")), e);
        }
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InputStream mo209() {
        return this.f130;
    }
}
