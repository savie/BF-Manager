package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public final class C24873 implements InterfaceC8332 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80492;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f80493;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f80494;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f80495;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f80496;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f80497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16667 f80498;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f80499;

    public C24873(C3989 c3989, C2366 c2366) {
        ArrayList arrayList = new ArrayList();
        this.f80494 = arrayList;
        this.f80498 = null;
        this.f80497 = false;
        this.f80499 = true;
        this.f80493 = -1;
        if (c2366 == null) {
            return;
        }
        c2366.m8041(this);
        if (this.f80492) {
            this.f80498.m39377((C16667) arrayList.get(this.f80493));
            arrayList.set(this.f80493, this.f80498);
            this.f80492 = false;
        }
        C16667 c16667 = this.f80498;
        if (c16667 != null) {
            arrayList.add(c16667);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m55398() {
        return this.f80494;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8037(float f, float f2) {
        boolean z = this.f80492;
        ArrayList arrayList = this.f80494;
        if (z) {
            this.f80498.m39377((C16667) arrayList.get(this.f80493));
            arrayList.set(this.f80493, this.f80498);
            this.f80492 = false;
        }
        C16667 c16667 = this.f80498;
        if (c16667 != null) {
            arrayList.add(c16667);
        }
        this.f80496 = f;
        this.f80495 = f2;
        this.f80498 = new C16667(f, f2, 0.0f, 0.0f);
        this.f80493 = arrayList.size();
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8042(float f, float f2) {
        this.f80498.m39376(f, f2);
        this.f80494.add(this.f80498);
        C16667 c16667 = this.f80498;
        this.f80498 = new C16667(f, f2, f - c16667.f53845, f2 - c16667.f53843);
        this.f80492 = false;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8039(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f80499 || this.f80497) {
            this.f80498.m39376(f, f2);
            this.f80494.add(this.f80498);
            this.f80497 = false;
        }
        this.f80498 = new C16667(f5, f6, f5 - f3, f6 - f4);
        this.f80492 = false;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8038(float f, float f2, float f3, float f4) {
        this.f80498.m39376(f, f2);
        this.f80494.add(this.f80498);
        this.f80498 = new C16667(f3, f4, f3 - f, f4 - f2);
        this.f80492 = false;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8040(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f80497 = true;
        this.f80499 = false;
        C16667 c16667 = this.f80498;
        C3989.m12868(c16667.f53845, c16667.f53843, f, f2, f3, z, z2, f4, f5, this);
        this.f80499 = true;
        this.f80492 = false;
    }

    @Override // l.InterfaceC8332
    public final void close() {
        this.f80494.add(this.f80498);
        mo8042(this.f80496, this.f80495);
        this.f80492 = true;
    }
}
