package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.᩻ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC25110 {
    GZIP("GZIP", new C10937()),
    XZ("XZ", new C22872()),
    BZIP2("BZIP2", new C19888()),
    ZSTD("ZSTD", new C15412()),
    LZ4("LZ4", new C13175()),
    ZLIB("ZLIB", new C5718());


    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f81208 = 65536;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1989 f81211;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f81212;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static byte[] m55973() {
        return new byte[4096];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55971(AbstractC22044 abstractC22044) {
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                byte[] bArrM55973 = m55973();
                byte[] bArr = C5125.f17846;
                int iM15487 = C5125.m15487(inputStreamMo4290, bArrM55973, 0, bArrM55973.length);
                for (EnumC25110 enumC25110 : values()) {
                    if (enumC25110.m55977(bArrM55973, iM15487)) {
                        if (inputStreamMo4290 != null) {
                            inputStreamMo4290.close();
                        }
                        return true;
                    }
                }
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                return false;
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    EnumC25110(String str, InterfaceC1989 interfaceC1989) {
        this.f81212 = str;
        this.f81211 = interfaceC1989;
    }

    public String getName() {
        return this.f81212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m55977(byte[] bArr, int i) {
        return this.f81211.mo6818(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long m55974(InterfaceC17713 interfaceC17713) {
        return this.f81211.mo6815(interfaceC17713);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream m55975(InputStream inputStream) {
        return this.f81211.mo6816(inputStream);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InputStream m55978(InputStream inputStream) {
        if (this == BZIP2) {
            return new C4972(inputStream);
        }
        if (this == GZIP) {
            return new C16904(inputStream);
        }
        if (this == ZLIB) {
            return new C17650(inputStream, new Inflater(), 65536);
        }
        return m55975(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public OutputStream m55976(OutputStream outputStream, int i, long j) {
        return this.f81211.mo6817(outputStream, i, j);
    }
}
