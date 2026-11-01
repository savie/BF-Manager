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
import l.C8479;

/* JADX INFO: loaded from: classes.dex */
public final class AwsChunkedEncodingInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f128 = new byte[0];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final Log f129 = LogFactory.m302(AwsChunkedEncodingInputStream.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f130;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f131;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f133;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f136;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AWSS3V4Signer f137;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DecodedStreamBuffer f138;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InputStream f139;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ChunkContentIterator f140;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f141;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f132 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f134 = false;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        m282();
        if (!this.f132) {
            throw new UnsupportedOperationException("Chunk-encoded stream only supports mark() at the start of the stream.");
        }
        if (this.f139.markSupported()) {
            Log log = f129;
            if (log.mo294()) {
                log.mo298("AwsChunkedEncodingInputStream marked at the start of the stream (will directly mark the wrapped stream since it's mark-supported).");
            }
            this.f139.mark(Integer.MAX_VALUE);
        } else {
            Log log2 = f129;
            if (log2.mo294()) {
                log2.mo298("AwsChunkedEncodingInputStream marked at the start of the stream (initializing the buffer since the wrapped stream is not mark-supported).");
            }
            this.f138 = new DecodedStreamBuffer(this.f131);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        m282();
        this.f140 = null;
        this.f133 = this.f135;
        if (this.f139.markSupported()) {
            Log log = f129;
            if (log.mo294()) {
                log.mo298("AwsChunkedEncodingInputStream reset (will reset the wrapped stream because it is mark-supported).");
            }
            this.f139.reset();
        } else {
            Log log2 = f129;
            if (log2.mo294()) {
                log2.mo298("AwsChunkedEncodingInputStream reset (will use the buffer of the decoded stream).");
            }
            DecodedStreamBuffer decodedStreamBuffer = this.f138;
            if (decodedStreamBuffer == null) {
                throw new IOException("Cannot reset the stream because the mark is not set.");
            }
            decodedStreamBuffer.m220();
        }
        this.f140 = null;
        this.f132 = true;
        this.f134 = false;
    }

    public AwsChunkedEncodingInputStream(InputStream inputStream, byte[] bArr, String str, String str2, String str3, AWSS3V4Signer aWSS3V4Signer) {
        this.f139 = null;
        int iMax = 262144;
        if (inputStream instanceof AwsChunkedEncodingInputStream) {
            AwsChunkedEncodingInputStream awsChunkedEncodingInputStream = (AwsChunkedEncodingInputStream) inputStream;
            iMax = Math.max(awsChunkedEncodingInputStream.f131, 262144);
            this.f139 = awsChunkedEncodingInputStream.f139;
            this.f138 = awsChunkedEncodingInputStream.f138;
        } else {
            this.f139 = inputStream;
            this.f138 = null;
        }
        if (iMax < 131072) {
            throw new IllegalArgumentException("Max buffer size should not be less than chunk size");
        }
        this.f131 = iMax;
        this.f141 = bArr;
        this.f130 = str;
        this.f136 = str2;
        this.f135 = str3;
        this.f133 = str3;
        this.f137 = aWSS3V4Signer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == -1) {
            return i;
        }
        Log log = f129;
        if (log.mo294()) {
            log.mo298("One byte read from the stream.");
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        m282();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        ChunkContentIterator chunkContentIterator = this.f140;
        if (chunkContentIterator == null || !chunkContentIterator.m217()) {
            if (this.f134) {
                return -1;
            }
            byte[] bArr2 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            int i3 = 0;
            while (i3 < 131072) {
                DecodedStreamBuffer decodedStreamBuffer = this.f138;
                if (decodedStreamBuffer != null && decodedStreamBuffer.m219()) {
                    bArr2[i3] = this.f138.m221();
                    i3++;
                } else {
                    int i4 = this.f139.read(bArr2, i3, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - i3);
                    if (i4 == -1) {
                        break;
                    }
                    DecodedStreamBuffer decodedStreamBuffer2 = this.f138;
                    if (decodedStreamBuffer2 != null) {
                        decodedStreamBuffer2.m218(i3, i4, bArr2);
                    }
                    i3 += i4;
                }
            }
            if (i3 == 0) {
                this.f140 = new ChunkContentIterator(m214(f128));
                z = true;
            } else {
                if (i3 < 131072) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i3);
                    bArr2 = bArr3;
                }
                this.f140 = new ChunkContentIterator(m214(bArr2));
                z = false;
            }
            this.f134 = z;
        }
        int iM216 = this.f140.m216(bArr, i, i2);
        if (iM216 > 0) {
            this.f132 = false;
            Log log = f129;
            if (log.mo294()) {
                log.mo298(iM216 + " byte read from the stream.");
            }
        }
        return iM216;
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m212(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j2 = j / 131072;
        long j3 = j % 131072;
        return (j2 * m213(131072L)) + (j3 > 0 ? m213(j3) : 0L) + m213(0L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m213(long j) {
        return ((long) (Long.toHexString(j).length() + 83)) + j + ((long) 2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private byte[] m214(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(bArr.length));
        StringBuilder sb2 = new StringBuilder("AWS4-HMAC-SHA256-PAYLOAD\n");
        sb2.append(this.f130);
        sb2.append("\n");
        sb2.append(this.f136);
        sb2.append("\n");
        sb2.append(this.f133);
        sb2.append("\n");
        AWSS3V4Signer aWSS3V4Signer = this.f137;
        sb2.append(BinaryUtils.m750(aWSS3V4Signer.hash("")));
        sb2.append("\n");
        sb2.append(BinaryUtils.m750(aWSS3V4Signer.hash(bArr)));
        String strM750 = BinaryUtils.m750(aWSS3V4Signer.sign(sb2.toString(), this.f141, SigningAlgorithm.HmacSHA256));
        this.f133 = strM750;
        sb.append(";chunk-signature=" + strM750);
        sb.append("\r\n");
        try {
            String string = sb.toString();
            Charset charset = StringUtils.f844;
            byte[] bytes = string.getBytes(charset);
            byte[] bytes2 = "\r\n".getBytes(charset);
            byte[] bArr2 = new byte[bytes.length + bArr.length + bytes2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            System.arraycopy(bytes2, 0, bArr2, bytes.length + bArr.length, bytes2.length);
            return bArr2;
        } catch (Exception e) {
            throw new AmazonClientException(C8479.m22142(e, new StringBuilder("Unable to sign the chunked data. ")), e);
        }
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InputStream mo215() {
        return this.f139;
    }
}
