package l;

/* JADX INFO: renamed from: l.ܽۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes5.dex */
public class C16608 implements InterfaceC16088 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f53295;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f53296;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53297;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f53299 = false;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C16608(boolean z) {
        boolean z2;
        if (C20370.m46024()) {
            z2 = C16737.f53615.getBoolean("def_mov_recycle_bin", true);
        }
        this.f53296 = z2;
        this.f53297 = 0;
        this.f53298 = z;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۚۙ */
    public void mo11427() {
        this.f53298 = true;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۠ */
    public boolean mo11428() {
        return !this.f53299;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public boolean mo11425(boolean z) {
        return z || mo11428();
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo11432() {
        return this.f53296;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public void mo11424(String str, C20321 c20321, C20321 c20322, boolean z) {
        this.f53295 = !new C15903(this, str, c20321, c20322, z).m20356(new C15475());
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ۙ */
    public int mo11423(String str, C20321 c20321, C20321 c20322, boolean z, boolean z2) {
        if (!z2) {
            return C17745.m41306(this, str, c20321, c20322, z, false);
        }
        int[] iArr = {1};
        boolean zM20356 = new C0379(this, str, c20321, c20322, this.f53297, iArr).m20356(new C15475());
        this.f53295 = !zM20356;
        if (zM20356) {
            return iArr[0];
        }
        return 1;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2357() {
        return this.f53295;
    }

    @Override // l.InterfaceC16088
    /* JADX INFO: renamed from: ܿ */
    public int mo11431() {
        return this.f53297;
    }
}
