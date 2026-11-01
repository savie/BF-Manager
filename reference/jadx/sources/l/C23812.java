package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩻ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes.dex */
public final class C23812 implements InterfaceC20513 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f76992;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14640 f76993;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f76994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f76995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12107 f76996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76997;

    public C23812(C14640 c14640, C12107 c12107) {
        this.f76993 = c14640;
        this.f76996 = c12107;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ۙ */
    public final void mo14571(long j, long j2) {
        this.f76993.f47878.m45594(j, j2);
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14572() {
        C14640 c14640 = this.f76993;
        C11545 c11545 = c14640.f47877;
        if (!c14640.f47876.m7487()) {
            this.f76997 = false;
            this.f76992 = false;
            return true;
        }
        C12107 c12107 = this.f76996;
        if (C19808.m45041(c12107)) {
            if (this.f76995 == null) {
                this.f76995 = C19808.m45034(c14640.f47876, c12107, this);
            }
            this.f76997 = false;
            C6004 c6004 = new C6004(c11545.m28824(), c14640.f47876);
            c6004.m16303(new BooleanSupplier() { // from class: l.ۧܽ֨
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f37700.mo2357();
                }
            });
            boolean zM16305 = c6004.m16305(this.f76995);
            this.f76992 = zM16305;
            return zM16305;
        }
        if (this.f76994 == null) {
            this.f76994 = C11088.m27974();
        }
        if (this.f76994.hasNext()) {
            c14640.f47876.m7474((String) this.f76994.next());
            this.f76997 = true;
            this.f76992 = false;
            return true;
        }
        this.f76997 = false;
        boolean zM16304 = new C6004(c11545.m28824(), c14640.f47876).m16304();
        this.f76992 = zM16304;
        return zM16304;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14570() {
        return this.f76997;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo14573() {
        return this.f76992;
    }

    @Override // l.InterfaceC20513
    public final void cancel() {
        this.f76993.f47878.m5839();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f76993.f47878.m5824();
    }
}
