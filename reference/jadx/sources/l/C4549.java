package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۙ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes3.dex */
public final class C4549 extends C10514 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public List f16160;

    public C4549(String str, List list) {
        super(str);
        this.f16160 = list;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۚ */
    public final List mo5549() {
        return this.f16160;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final void mo5545(List list) {
        this.f16160 = list;
    }

    @Override // l.C10514, l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        return super.mo5547(obj) && this.f16160.equals(((C4549) obj).f16160);
    }

    @Override // l.C10514, l.AbstractC1566
    public final String toString() {
        List list = this.f16160;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f33450;
        if (zIsEmpty) {
            return str;
        }
        return str + " extends " + C4123.m13221(list, " & ");
    }
}
