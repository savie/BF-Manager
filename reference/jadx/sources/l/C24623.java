package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D76O */
/* JADX INFO: loaded from: classes.dex */
public final class C24623 implements InterfaceC6329 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4091 f79740;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4706 f79741;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f79742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f79743;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f79744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54958(C4706 c4706, ArrayList arrayList, C4091 c4091, long j) {
        this.f79741 = c4706;
        this.f79743 = arrayList;
        this.f79740 = c4091;
        this.f79742 = j;
        this.f79744 = null;
    }

    @Override // l.InterfaceC6329
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18050(EnumC22631 enumC22631, long j) {
        if (j != this.f79742) {
            return true;
        }
        if (this.f79744 == null) {
            this.f79744 = this.f79740.f13949.getType() + "->" + C12777.m31664(this.f79740);
        }
        this.f79743.add(new C5231("dex", "resource_id", "dex_method", this.f79744, enumC22631.f73509 + " " + this.f79741.f16610, null, null, null, null, null, null));
        return this.f79743.size() < this.f79741.f16611;
    }
}
