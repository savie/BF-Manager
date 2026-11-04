package l;

import android.net.Uri;
import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۤ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8HD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11195 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35324;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C25368 f35325;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f35326;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35327;

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws C5976, C2970 {
        m22621(c25368);
        this.f35325 = c25368;
        Uri uri = c25368.f81907;
        long j = c25368.f81910;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C20782.m47564("Unsupported scheme: " + scheme, e.m.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = C7116.f23455;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C2970.m9687("Unexpected URI format: " + uriNormalizeScheme, (IllegalArgumentException) null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f35326 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw C2970.m9687("Error while parsing Base64 encoded string: " + str2, e);
            }
        } else {
            this.f35326 = C10902.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c25368.f81909;
        byte[] bArr = this.f35326;
        if (j2 > bArr.length) {
            this.f35326 = null;
            throw new C5976(2008);
        }
        int i = (int) j2;
        this.f35324 = i;
        int length = bArr.length - i;
        this.f35327 = length;
        if (j != -1) {
            this.f35327 = (int) Math.min(length, j);
        }
        m22619(c25368);
        return j != -1 ? j : this.f35327;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f35327;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f35326;
        String str = C7116.f23455;
        System.arraycopy(bArr2, this.f35324, bArr, i, iMin);
        this.f35324 += iMin;
        this.f35327 -= iMin;
        m22622(iMin);
        return iMin;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        C25368 c25368 = this.f35325;
        if (c25368 != null) {
            return c25368.f81907;
        }
        return null;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        if (this.f35326 != null) {
            this.f35326 = null;
            m22620();
        }
        this.f35325 = null;
    }
}
