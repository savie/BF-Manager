package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62B */
/* JADX INFO: loaded from: classes4.dex */
public final class C10124 extends AbstractC18908 implements InterfaceC18528 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12863 f34606;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5890 f34607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f34608;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Set f34609;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34610;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC7945 f34612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34613 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34611 = 0;

    public C10124(C5890 c5890, List list, int i, C12863 c12863, Set set, InterfaceC7945 interfaceC7945) {
        this.f34607 = c5890;
        this.f34608 = list;
        this.f34610 = i;
        this.f34606 = c12863;
        this.f34609 = set;
        this.f34612 = interfaceC7945;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹ */
    public final String mo9700() {
        return this.f34607.f20095.f5881.f11559;
    }

    @Override // l.InterfaceC8858
    public final String getName() {
        return this.f34607.f20094.f11559;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ */
    public final C4956 mo9699() {
        return this.f34607.f20096.f54765;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ */
    public final String mo9698() {
        return this.f34607.f20096.f54762.f5881.f11559;
    }

    @Override // l.InterfaceC18528
    public final List getParameters() {
        return this.f34608;
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo25750() {
        return this.f34610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25748(C10111 c10111) {
        this.f34612 = c10111;
    }

    @Override // l.InterfaceC18528
    public final Set getAnnotations() {
        return this.f34606;
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Set mo25749() {
        return this.f34609;
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7945 mo25747() {
        return this.f34612;
    }
}
