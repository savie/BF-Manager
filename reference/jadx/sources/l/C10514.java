package l;

/* JADX INFO: renamed from: l.ۤ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes4.dex */
public class C10514 extends AbstractC21703 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String f33450;

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo5543() {
        return true;
    }

    public C10514(String str) {
        this.f33450 = str;
        this.f5441 = str.hashCode();
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ᩻ */
    public final String mo5570() {
        return this.f33450;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ܶ */
    public final EnumC12006 mo5558() {
        return EnumC12006.OBJECT;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5547(Object obj) {
        return this.f33450.equals(((C10514) obj).f33450);
    }

    @Override // l.AbstractC1566
    public String toString() {
        return this.f33450;
    }
}
