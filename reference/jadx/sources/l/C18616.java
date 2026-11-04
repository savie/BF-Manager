package l;

/* JADX INFO: renamed from: l.ܿ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes5.dex */
public class C18616 implements InterfaceC14864 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f60533;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f60534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60535;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f60536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60537 = false;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C18616(boolean z) {
        boolean z2;
        if (C19632.m45281()) {
            z2 = C21576.f68932.getBoolean("def_mov_recycle_bin", true);
        }
        this.f60534 = z2;
        this.f60535 = 0;
        this.f60533 = z;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ᩴۙ */
    public void mo28702() {
        this.f60533 = true;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۗ */
    public boolean mo28694() {
        return !this.f60537;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public boolean mo28698(boolean z) {
        return z || mo28694();
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۘ */
    public boolean mo28695() {
        return this.f60534;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public void mo28697(String str, C21578 c21578, C21578 c21579, boolean z) {
        this.f60536 = !new C4446(this, str, c21578, c21579, z).m49500(new C10145());
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ۙ */
    public int mo28696(String str, C21578 c21578, C21578 c21579, boolean z, boolean z2) {
        if (!z2) {
            return C8008.m21872(this, str, c21578, c21579, z, false);
        }
        int[] iArr = {1};
        boolean zM49500 = new C21600(this, str, c21578, c21579, this.f60535, iArr).m49500(new C10145());
        this.f60536 = !zM49500;
        if (zM49500) {
            return iArr[0];
        }
        return 1;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public boolean mo924() {
        return this.f60536;
    }

    @Override // l.InterfaceC14864
    /* JADX INFO: renamed from: ᩳ */
    public int mo28700() {
        return this.f60535;
    }
}
