package l;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۛᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C6236 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f21157;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f21158;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f21159;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Uri f21160;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f21161;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final UUID f21162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f21163;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f21164;

    public C6236(C17525 c17525) {
        C2023.m6510((c17525.f55716 && c17525.f55717 == null) ? false : true);
        UUID uuid = c17525.f55719;
        uuid.getClass();
        this.f21162 = uuid;
        this.f21160 = c17525.f55717;
        AbstractC6910 unused = c17525.f55715;
        this.f21158 = c17525.f55715;
        this.f21164 = c17525.f55721;
        this.f21159 = c17525.f55716;
        this.f21157 = c17525.f55714;
        AbstractC22433 unused2 = c17525.f55720;
        this.f21163 = c17525.f55720;
        this.f21161 = c17525.f55718 != null ? Arrays.copyOf(c17525.f55718, c17525.f55718.length) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m17291() {
        byte[] bArr = this.f21161;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6236)) {
            return false;
        }
        C6236 c6236 = (C6236) obj;
        return this.f21162.equals(c6236.f21162) && C13638.equals(this.f21160, c6236.f21160) && C13638.equals(this.f21158, c6236.f21158) && this.f21164 == c6236.f21164 && this.f21159 == c6236.f21159 && this.f21157 == c6236.f21157 && this.f21163.equals(c6236.f21163) && Arrays.equals(this.f21161, c6236.f21161);
    }

    public final int hashCode() {
        int iHashCode = this.f21162.hashCode() * 31;
        Uri uri = this.f21160;
        return Arrays.hashCode(this.f21161) + ((this.f21163.hashCode() + ((((((((this.f21158.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f21164 ? 1 : 0)) * 31) + (this.f21159 ? 1 : 0)) * 31) + (this.f21157 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C9023.m23358(0, 1, 2, 3, 4);
        C17983.m41806(5);
        C17983.m41806(6);
        C17983.m41806(7);
    }
}
