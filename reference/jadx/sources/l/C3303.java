package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۗܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3303 extends C13888 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC13785 f12210;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f12211;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Set f12212;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6396 f12213;

    public C3303(EnumC20508 enumC20508, long j, long j2, C6396 c6396, EnumC13785 enumC13785, Set set, int i) {
        super(33, enumC20508, EnumC2162.SMB2_QUERY_DIRECTORY, j, j2, i);
        this.f12210 = enumC13785;
        this.f12212 = set;
        this.f12213 = c6396;
        this.f12211 = "*";
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۖ */
    public final void mo3384(C19240 c19240) {
        c19240.m27396(this.f39515);
        c19240.m27381((byte) this.f12210.getValue());
        c19240.m27381((byte) C20799.m46781(this.f12212));
        c19240.m27398(0L);
        this.f12213.m17542(c19240);
        c19240.m27396(96);
        String str = this.f12211;
        c19240.m27396(str.length() * 2);
        c19240.m27398(Math.min(mo29405(), ((C1186) mo25478()).m4326() * 65536));
        c19240.m27399(str, C7393.f24574);
    }
}
