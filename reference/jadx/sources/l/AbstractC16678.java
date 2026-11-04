package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6GH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16678 implements InterfaceC6238 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20408 f53879 = C20408.f65406;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3254 f53880 = f53879;

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17866(EnumC1763 enumC1763) {
        m39409().m10619(enumC1763);
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ۙ */
    public final void mo17864(InterfaceC11851 interfaceC11851) {
        m39409().m10621(interfaceC11851);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39411(List list) {
        if (list.isEmpty()) {
            return;
        }
        m39409().m10618(list);
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ۙ */
    public final void mo17863(C11457 c11457, Object obj) {
        C3254 c3254M39409 = m39409();
        C24884 c24884 = (C24884) c3254M39409.mo10627(c11457);
        if (c24884 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            c3254M39409.m10621(new C24884(c11457, arrayList));
            return;
        }
        c24884.m55414().add(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39413(C11457 c11457, List list) {
        C3254 c3254M39409 = m39409();
        C24884 c24884 = (C24884) c3254M39409.mo10627(c11457);
        if (c24884 != null) {
            c24884.m55414().addAll(list);
        } else {
            c3254M39409.m10621(new C24884(c11457, list));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39414(AbstractC16678 abstractC16678) {
        C3254 c3254 = abstractC16678.f53880;
        if (c3254.mo10625()) {
            return;
        }
        m39409().m10620(c3254);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C3254 m39409() {
        C3254 c3254 = this.f53880;
        if (c3254 != f53879) {
            return c3254;
        }
        C3254 c3255 = new C3254();
        this.f53880 = c3255;
        return c3255;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m39410() {
        if (this.f53880.mo10625()) {
            C3254 c3254 = this.f53880;
            C20408 c20408 = f53879;
            if (c3254 != c20408) {
                this.f53880 = c20408;
            }
        }
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17865(EnumC1763 enumC1763) {
        return this.f53880.mo10628(enumC1763);
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo17867(InterfaceC2157 interfaceC2157) {
        return this.f53880.mo10622(interfaceC2157);
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11851 mo17862(InterfaceC2157 interfaceC2157) {
        return this.f53880.mo10627(interfaceC2157);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39412(AbstractC5820 abstractC5820, C11457 c11457) {
        InterfaceC11851 interfaceC11851Mo10627 = abstractC5820.f53880.mo10627(c11457);
        if (interfaceC11851Mo10627 != null) {
            mo17864(interfaceC11851Mo10627);
        }
    }

    @Override // l.InterfaceC6238
    /* JADX INFO: renamed from: ۙ */
    public final List mo17861(C11457 c11457) {
        return this.f53880.mo10616(c11457);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39418(EnumC1763 enumC1763) {
        this.f53880.mo10623(enumC1763);
        m39410();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39419(InterfaceC2157 interfaceC2157) {
        this.f53880.mo10624(interfaceC2157);
        m39410();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m39415() {
        this.f53880 = f53879;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m39416() {
        C3254 c3254 = this.f53880;
        if (c3254 == f53879) {
            return;
        }
        c3254.m10629();
        this.f53880.m10617();
        m39410();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39420() {
        return this.f53880.toString();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m39417() {
        return this.f53880.mo10625();
    }

    /* JADX INFO: renamed from: ֨ */
    public String mo17521() {
        return toString();
    }
}
