package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5877 extends AbstractC3384 implements InterfaceC23031 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC10297 f20062 = EnumC10297.f35114;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List f20063;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f20064;

    @Override // l.InterfaceC1594
    /* JADX INFO: renamed from: ۤ */
    public final String mo1142() {
        return mo5435().f35326;
    }

    public C5877(int i, List list) {
        super(f20062);
        this.f20064 = i;
        this.f20063 = list == null ? AbstractC22433.of() : list;
    }

    @Override // l.InterfaceC23031
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo16087() {
        return this.f20064;
    }

    @Override // l.InterfaceC23031
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List mo16088() {
        return this.f20063;
    }

    @Override // l.AbstractC3384, l.InterfaceC1594
    /* JADX INFO: renamed from: ۡ */
    public final int mo5436() {
        return (((this.f20063.size() * this.f20064) + 1) / 2) + 4;
    }

    @Override // l.AbstractC3384
    /* JADX INFO: renamed from: ۛ */
    public final EnumC18057 mo2108() {
        return f20062.f35328;
    }
}
