package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14033 extends AbstractC5568 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f44464;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0063 f44465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44466;

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۚ */
    public final C18708 mo4988() {
        return null;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo4989() {
        return true;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC17216 mo4993() {
        return null;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4996() {
        return false;
    }

    public C14033(C20946 c20946, C19738 c19738) {
        super(c20946, c19738);
        this.f44466 = new ArrayList();
        this.f44464 = c20946.m47903();
    }

    public C14033(int i, C19738 c19738) {
        super(C20946.m47883(i, C5085.f17731), c19738);
        this.f44466 = new ArrayList();
        this.f44464 = i;
    }

    @Override // l.AbstractC5568
    public final Object clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    @Override // l.AbstractC5568
    public final AbstractC5568 clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34184(C24960 c24960) {
        for (C8813 c8813 : this.f44466) {
            c8813.f28790 = c8813.f28790.m47892(c24960.m55738(c8813.f28790.m47903()).m16508().getType());
        }
        this.f44465 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m34181() {
        return this.f44464;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34183(C20946 c20946, C19738 c19738) {
        this.f44466.add(new C8813(c20946, c19738.m45472(), c19738.m45479()));
        this.f44465 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34185(C20946 c20946) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C8813> arrayList2 = this.f44466;
        for (C8813 c8813 : arrayList2) {
            if (c8813.f28790.m47903() == c20946.m47903()) {
                arrayList.add(c8813);
            }
        }
        arrayList2.removeAll(arrayList);
        this.f44465 = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m34186(int i) {
        return ((C8813) this.f44466.get(i)).f28788;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ܶ */
    public final C0063 mo4992() {
        C0063 c0063 = this.f44465;
        if (c0063 != null) {
            return c0063;
        }
        ArrayList arrayList = this.f44466;
        if (arrayList.size() == 0) {
            return C0063.f947;
        }
        int size = arrayList.size();
        this.f44465 = new C0063(size);
        for (int i = 0; i < size; i++) {
            this.f44465.m31604(i, ((C8813) arrayList.get(i)).f28790);
        }
        this.f44465.mo15005();
        return this.f44465;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4995(AbstractC21976 abstractC21976) {
        for (C8813 c8813 : this.f44466) {
            C20946 c20946 = c8813.f28790;
            C20946 c20946Mo21960 = abstractC21976.mo21960(c20946);
            c8813.f28790 = c20946Mo21960;
            if (c20946 != c20946Mo21960) {
                m16506().m45470().m55732(this, c20946, c8813.f28790);
            }
        }
        this.f44465 = null;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17216 mo4997() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34182(int i, C24960 c24960) {
        ArrayList arrayList = new ArrayList();
        for (C8813 c8813 : this.f44466) {
            if (c8813.f28790.m47903() == i) {
                arrayList.add((C19738) c24960.m55749().get(c8813.f28788));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo4983() {
        return C2847.m9356() && mo4991() != null;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۙ */
    public final void mo4987(InterfaceC13025 interfaceC13025) {
        interfaceC13025.mo6342(this);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        StringBuilder sb = new StringBuilder(80);
        sb.append(C9012.f29360);
        sb.append(": phi");
        C20946 c20946M16508 = m16508();
        if (c20946M16508 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c20946M16508.mo1843());
        }
        sb.append(" <-");
        int size = mo4992().size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(this.f44465.m31619get(i).mo1843() + "[b=" + C5306.m15934(((C8813) this.f44466.get(i)).f28789) + "]");
            }
        }
        return sb.toString();
    }
}
