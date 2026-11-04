package l;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܶ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16394 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53198;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final UUID f53199;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f53200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f53201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f53202;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri f53203;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f53204;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f53205;

    public C16394(C17886 c17886) {
        C20782.m47568((c17886.f58613 && c17886.f58618 == null) ? false : true);
        UUID uuid = c17886.f58614;
        uuid.getClass();
        this.f53199 = uuid;
        this.f53203 = c17886.f58618;
        AbstractC17589 unused = c17886.f58620;
        this.f53205 = c17886.f58620;
        this.f53202 = c17886.f58617;
        this.f53198 = c17886.f58613;
        this.f53201 = c17886.f58616;
        AbstractC1928 unused2 = c17886.f58619;
        this.f53204 = c17886.f58619;
        this.f53200 = c17886.f58615 != null ? Arrays.copyOf(c17886.f58615, c17886.f58615.length) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m38920() {
        byte[] bArr = this.f53200;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16394)) {
            return false;
        }
        C16394 c16394 = (C16394) obj;
        return this.f53199.equals(c16394.f53199) && C17359.equals(this.f53203, c16394.f53203) && C17359.equals(this.f53205, c16394.f53205) && this.f53202 == c16394.f53202 && this.f53198 == c16394.f53198 && this.f53201 == c16394.f53201 && this.f53204.equals(c16394.f53204) && Arrays.equals(this.f53200, c16394.f53200);
    }

    public final int hashCode() {
        int iHashCode = this.f53199.hashCode() * 31;
        Uri uri = this.f53203;
        return Arrays.hashCode(this.f53200) + ((this.f53204.hashCode() + ((((((((this.f53205.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f53202 ? 1 : 0)) * 31) + (this.f53198 ? 1 : 0)) * 31) + (this.f53201 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C4794.m14773(0, 1, 2, 3, 4);
        C7116.m19499(5);
        C7116.m19499(6);
        C7116.m19499(7);
    }
}
