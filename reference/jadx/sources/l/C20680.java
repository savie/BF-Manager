package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩵ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20680 extends C6752 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f66299;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set f66300;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC6073 f66301;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25398 f66302;

    public C20680(EnumC15700 enumC15700, long j, long j2, C25398 c25398, EnumC6073 enumC6073, Set set, int i) {
        super(33, enumC15700, EnumC23906.SMB2_QUERY_DIRECTORY, j, j2, i);
        this.f66301 = enumC6073;
        this.f66300 = set;
        this.f66302 = c25398;
        this.f66299 = "*";
    }

    @Override // l.C24652
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7006(C7453 c7453) {
        c7453.m56023(this.f79801);
        c7453.m56005((byte) this.f66301.getValue());
        c7453.m56005((byte) C10961.m27791(this.f66300));
        c7453.m56025(0L);
        this.f66302.m56760(c7453);
        c7453.m56023(96);
        String str = this.f66299;
        c7453.m56023(str.length() * 2);
        c7453.m56025(Math.min(mo3631(), ((C18684) mo3632()).m43470() * 65536));
        c7453.m56026(str, C22150.f71349);
    }
}
