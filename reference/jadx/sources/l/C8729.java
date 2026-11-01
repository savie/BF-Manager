package l;

import android.net.Uri;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۡ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HD */
/* JADX INFO: loaded from: classes4.dex */
public final class C8729 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12257 f29995;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29996;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29997;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f29998;

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws C20018, C22861 {
        m48019(c12257);
        this.f29995 = c12257;
        Uri uri = c12257.f41015;
        long j = c12257.f41017;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C2023.m6506("Unsupported scheme: " + scheme, e.m.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = C17983.f57504;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C22861.m50609("Unexpected URI format: " + uriNormalizeScheme, (IllegalArgumentException) null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f29998 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw C22861.m50609("Error while parsing Base64 encoded string: " + str2, e);
            }
        } else {
            this.f29998 = C12352.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c12257.f41009;
        byte[] bArr = this.f29998;
        if (j2 > bArr.length) {
            this.f29998 = null;
            throw new C20018(2008);
        }
        int i = (int) j2;
        this.f29997 = i;
        int length = bArr.length - i;
        this.f29996 = length;
        if (j != -1) {
            this.f29996 = (int) Math.min(length, j);
        }
        m48018(c12257);
        return j != -1 ? j : this.f29996;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f29996;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f29998;
        String str = C17983.f57504;
        System.arraycopy(bArr2, this.f29997, bArr, i, iMin);
        this.f29997 += iMin;
        this.f29996 -= iMin;
        m48017(iMin);
        return iMin;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        C12257 c12257 = this.f29995;
        if (c12257 != null) {
            return c12257.f41015;
        }
        return null;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        if (this.f29998 != null) {
            this.f29998 = null;
            m48020();
        }
        this.f29995 = null;
    }
}
