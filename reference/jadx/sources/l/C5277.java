package l;

import bin.mt.plus.Main;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5277 implements InterfaceC20513 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f18274;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f18275;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f18276;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15156 f18277;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2455 f18278;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f18279;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f18280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12107 f18281;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f18282;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f18283;

    public C5277(C15156 c15156, long j, long j2, C2455 c2455, boolean[] zArr, C12107 c12107) {
        this.f18277 = c15156;
        this.f18275 = j;
        this.f18276 = j2;
        this.f18278 = c2455;
        this.f18283 = zArr;
        this.f18281 = c12107;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14571(long j, long j2) {
        C15156 c15156 = this.f18277;
        c15156.m46156(j, j2);
        c15156.m41578(this.f18275 + j, this.f18276);
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo14572() {
        C2455 c2455 = this.f18278;
        if (!c2455.m7487()) {
            this.f18282 = false;
            this.f18274 = false;
            return true;
        }
        this.f18283[0] = true;
        C12107 c12107 = this.f18281;
        if (C19808.m45041(c12107)) {
            if (this.f18280 == null) {
                this.f18280 = C19808.m45034(c2455, c12107, this);
            }
            this.f18282 = false;
            C6004 c6004 = new C6004((Main) null, c2455);
            c6004.m16303(new BooleanSupplier() { // from class: l.ۖۢ᩹
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f9766.f18277.mo2357();
                }
            });
            boolean zM16305 = c6004.m16305(this.f18280);
            this.f18274 = zM16305;
            return zM16305;
        }
        if (this.f18279 == null) {
            this.f18279 = C11088.m27974();
        }
        if (this.f18279.hasNext()) {
            c2455.m7474((String) this.f18279.next());
            this.f18282 = true;
            this.f18274 = false;
            return true;
        }
        this.f18282 = false;
        boolean zM16304 = new C6004((Main) null, c2455).m16304();
        this.f18274 = zM16304;
        return zM16304;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14570() {
        return this.f18282;
    }

    @Override // l.InterfaceC20513
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo14573() {
        return this.f18274;
    }

    @Override // l.InterfaceC20513
    public final void cancel() {
        this.f18277.cancel();
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f18277.mo2357();
    }
}
