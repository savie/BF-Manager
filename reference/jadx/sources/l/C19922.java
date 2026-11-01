package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D76O */
/* JADX INFO: loaded from: classes5.dex */
public final class C19922 implements InterfaceC4713 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f63850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11770 f63851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f63852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C5373 f63853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f63854;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45217(C5373 c5373, ArrayList arrayList, C11770 c11770, long j) {
        this.f63853 = c5373;
        this.f63854 = arrayList;
        this.f63851 = c11770;
        this.f63852 = j;
        this.f63850 = null;
    }

    @Override // l.InterfaceC4713
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13025(EnumC10297 enumC10297, long j) {
        if (j != this.f63852) {
            return true;
        }
        if (this.f63850 == null) {
            this.f63850 = this.f63851.f39513.getType() + "->" + C22851.m50579(this.f63851);
        }
        this.f63854.add(new C2281("dex", "resource_id", "dex_method", this.f63850, enumC10297.f35326 + " " + this.f63853.f18567, null, null, null, null, null, null));
        return this.f63854.size() < this.f63853.f18569;
    }
}
