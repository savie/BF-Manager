package l;

/* JADX INFO: renamed from: l.ܳۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15176 implements InterfaceC18029 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f49495;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10042[] f49496;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC16711 f49497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 f49498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f49499;

    public C15176(EnumC16711 enumC16711, boolean z, int[] iArr, C10042[] c10042Arr, Object obj) {
        this.f49497 = enumC16711;
        this.f49499 = z;
        this.f49495 = iArr;
        this.f49496 = c10042Arr;
        C23447.m52662(obj, "defaultInstance");
        this.f49498 = (InterfaceC18775) obj;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16711 mo36491() {
        return this.f49497;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo36490() {
        return this.f49499;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] m36494() {
        return this.f49495;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10042[] m36492() {
        return this.f49496;
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 mo36493() {
        return this.f49498;
    }
}
