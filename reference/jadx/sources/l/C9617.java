package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1HS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9617 extends AbstractC25194 {
    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final /* bridge */ /* synthetic */ int mo9543() {
        return 0;
    }

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17734 mo9544() {
        return this;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public final String mo5151() {
        return "#comment";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5152(Appendable appendable, int i, C7381 c7381) {
    }

    public C9617(String str) {
        this.f81430 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6548 m25102() {
        String strM56171 = m56171();
        String strM5124 = C1402.m5124(1, 1, strM56171);
        if (strM5124.length() > 1 && (strM5124.startsWith("!") || strM5124.startsWith("?"))) {
            return null;
        }
        String strM34865 = C14442.m34865("<", strM5124, ">");
        C11988 c11988 = new C11988(new C4310());
        c11988.m30124();
        C5056 c5056M30120 = c11988.m30120(strM34865, super.mo37098());
        if (c5056M30120.m15302().m37082().size() <= 0) {
            return null;
        }
        C15496 c15496M37096 = c5056M30120.m15302().m37096();
        C6548 c6548 = new C6548(C16242.m38551(c5056M30120).m30123().m46442(c15496M37096.m37066()), strM56171.startsWith("!"));
        c6548.mo37069().m26654(c15496M37096.mo37069());
        return c6548;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m25103() {
        String strM56171 = m56171();
        if (strM56171.length() > 1) {
            return strM56171.startsWith("!") || strM56171.startsWith("?");
        }
        return false;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final void mo5150(Appendable appendable, int i, C7381 c7381) throws IOException {
        if (c7381.m20280() && this.f58268 == 0) {
            AbstractC17734 abstractC17734 = this.f58267;
            if ((abstractC17734 instanceof C15496) && ((C15496) abstractC17734).m37077().m17490()) {
                AbstractC17734.m41524(appendable, i, c7381);
            }
        }
        appendable.append("<!--").append(m56171()).append("-->");
    }

    @Override // l.AbstractC17734
    public final String toString() {
        return mo15298();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final Object mo5153clone() {
        return (C9617) super.mo5153clone();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: clone */
    public final AbstractC17734 mo5153clone() {
        return (C9617) super.mo5153clone();
    }
}
