package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6J8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18948;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f18949;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f18950;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public OutputStream f18951;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f18952;

    public C5436(AbstractC22044 abstractC22044, String str) throws IOException {
        if (!m16169(str)) {
            throw new IOException("Invalid download filename");
        }
        abstractC22044.m49853();
        this.f18952 = abstractC22044.m49876(str);
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str.concat(".mtdownload"));
        for (int i = 0; i < 100; i++) {
            AbstractC22044 abstractC22044M49839 = abstractC22044M49876.m49839(true);
            try {
                abstractC22044M49839.mo4298().mo8791();
                this.f18950 = abstractC22044M49839;
                try {
                    this.f18951 = abstractC22044M49839.mo4289(false);
                    return;
                } catch (IOException e) {
                    m16170();
                    throw e;
                }
            } catch (C22790 e2) {
                if (e2.m51409() != EnumC10855.ALREADY_EXISTS) {
                    throw e2;
                }
            }
        }
        throw new IOException("Unable to reserve download filename");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16171(int i, byte[] bArr) {
        this.f18951.write(bArr, 0, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m16173() throws IOException {
        this.f18951.close();
        this.f18951 = null;
        this.f18948 = true;
        for (int i = 0; i < 100; i++) {
            AbstractC22044 abstractC22044M49839 = this.f18952.m49839(true);
            try {
                this.f18950.mo4298().mo8789(abstractC22044M49839);
                this.f18949 = true;
                return abstractC22044M49839;
            } catch (C22790 e) {
                if (e.m51409() != EnumC10855.ALREADY_EXISTS) {
                    throw e;
                }
            }
        }
        throw new IOException("Unable to publish download file");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16170() {
        boolean z;
        AbstractC22044 abstractC22044 = this.f18950;
        try {
            OutputStream outputStream = this.f18951;
            if (outputStream != null) {
                outputStream.close();
            }
            if (z) {
                return;
            }
        } finally {
            this.f18951 = null;
            if (!this.f18948 && !this.f18949) {
                abstractC22044.mo4298().mo8793();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m16172() {
        if (this.f18949) {
            return null;
        }
        AbstractC22044 abstractC22044 = this.f18950;
        if (abstractC22044.mo2934()) {
            return abstractC22044;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16169(String str) {
        if (str.isEmpty() || str.equals(".") || str.equals("..")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '/' || cCharAt == '\\' || cCharAt == 127) {
                return false;
            }
        }
        return true;
    }
}
