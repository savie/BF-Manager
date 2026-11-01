package l;

/* JADX INFO: renamed from: l.ۛ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O8EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6397 extends C15404 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public EnumC15300 f21707;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f21708;

    public C6397(String str, long j, long j2, long j3, EnumC15300 enumC15300) {
        super(str, "", null, j, j3, true);
        this.f21707 = enumC15300;
        this.f21708 = j2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m17544() {
        return this.f21708;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC15300 m17543() {
        return this.f21707;
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۫ۙ */
    public final CharSequence mo7973() {
        if (getSize() != -1) {
            return null;
        }
        return "↘️ " + C1791.m5863(this.f21708);
    }
}
