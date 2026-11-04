package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9GP */
/* JADX INFO: loaded from: classes5.dex */
public final class C15458 extends C24652 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16446 f50321;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set f50322;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6117 f50323;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Set f50324;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC11225 f50325;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Set f50326;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Set f50327;

    public C15458(EnumC15700 enumC15700, long j, long j2, EnumC16446 enumC16446, Set set, Set set2, Set set3, EnumC11225 enumC11225, Set set4, C6117 c6117) {
        super(57, enumC15700, EnumC23906.SMB2_CREATE, j, j2);
        this.f50321 = enumC16446 != null ? enumC16446 : EnumC16446.Identification;
        this.f50326 = set;
        this.f50322 = set2 == null ? EnumSet.noneOf(EnumC12038.class) : set2;
        this.f50327 = set3 == null ? EnumSet.noneOf(EnumC0785.class) : set3;
        this.f50325 = enumC11225 != null ? enumC11225 : EnumC11225.FILE_OPEN_IF;
        this.f50324 = set4 == null ? EnumSet.noneOf(EnumC23160.class) : set4;
        this.f50323 = c6117;
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        byte[] bArrM40357;
        int i = this.f79801;
        c7453.m56023(i);
        c7453.m56005((byte) 0);
        c7453.m56005((byte) 0);
        c7453.m56025(this.f50321.getValue());
        c7453.m20459(8);
        c7453.m20459(8);
        c7453.m56025(C10961.m27791(this.f50326));
        c7453.m56025(C10961.m27791(this.f50322));
        c7453.m56025(C10961.m27791(this.f50327));
        c7453.m56025(this.f50325.getValue());
        c7453.m56025(C10961.m27791(this.f50324));
        int i2 = i + 63;
        String strM17651 = this.f50323.m17651();
        if (strM17651 == null || strM17651.trim().length() == 0) {
            c7453.m56023(i2);
            c7453.m56023(0);
            bArrM40357 = new byte[1];
        } else {
            bArrM40357 = C17192.m40357(strM17651);
            c7453.m56023(i2);
            c7453.m56023(bArrM40357.length);
        }
        c7453.m56025(0L);
        c7453.m56025(0L);
        c7453.m56007(bArrM40357.length, bArrM40357);
    }
}
