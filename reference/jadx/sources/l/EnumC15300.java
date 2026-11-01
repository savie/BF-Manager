package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܶܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15300 {
    GZIP("GZIP", new C2598()),
    XZ("XZ", new C5421()),
    BZIP2("BZIP2", new C22355()),
    ZSTD("ZSTD", new C1187()),
    LZ4("LZ4", new C13183()),
    ZLIB("ZLIB", new C4009());


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f49842 = 65536;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6832 f49849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f49850;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m36612() {
        return new byte[4096];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36610(AbstractC20745 abstractC20745) {
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                byte[] bArrM36612 = m36612();
                byte[] bArr = C20010.f64054;
                int iM45293 = C20010.m45293(inputStreamMo33970, bArrM36612, bArrM36612.length);
                for (EnumC15300 enumC15300 : values()) {
                    if (enumC15300.m36616(bArrM36612, iM45293)) {
                        if (inputStreamMo33970 != null) {
                            inputStreamMo33970.close();
                        }
                        return true;
                    }
                }
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                    return false;
                }
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    EnumC15300(String str, InterfaceC6832 interfaceC6832) {
        this.f49850 = str;
        this.f49849 = interfaceC6832;
    }

    public String getName() {
        return this.f49850;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m36616(byte[] bArr, int i) {
        return this.f49849.mo4353(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long m36613(InterfaceC7739 interfaceC7739) {
        return this.f49849.mo4350(interfaceC7739);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream m36614(InputStream inputStream) {
        return this.f49849.mo4351(inputStream);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InputStream m36617(InputStream inputStream) {
        if (this == BZIP2) {
            return new C13889(inputStream);
        }
        if (this == GZIP) {
            return new C21649(inputStream);
        }
        if (this == ZLIB) {
            return new C18121(inputStream, new Inflater(), 65536);
        }
        return m36614(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public OutputStream m36615(OutputStream outputStream, int i, long j) {
        return this.f49849.mo4352(outputStream, i, j);
    }
}
