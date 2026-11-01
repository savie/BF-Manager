package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95JE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3241 implements InterfaceC19595, InterfaceC7600 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9116 f12052;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f12053 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f12054 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12055;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9593[] f12056;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC9593[] f12057;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo9693(InterfaceC9593 interfaceC9593);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC9593[] mo9694(int i);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC9593 mo9695();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo9696();

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6324(Object obj, AbstractC4777 abstractC4777) {
        this.f12056 = (InterfaceC9593[]) obj;
        try {
            C21005.m47166(abstractC4777, this, false);
            InterfaceC9593[] interfaceC9593Arr = this.f12056;
            this.f12056 = null;
            return interfaceC9593Arr;
        } catch (Exception e) {
            throw new RuntimeException("fail exe " + abstractC4777, e);
        }
    }

    public AbstractC3241(C9116 c9116) {
        this.f12052 = c9116;
        this.f12055 = c9116.f31044.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9697() {
        boolean z = this.f12054;
        C9116 c9116 = this.f12052;
        if (z) {
            Iterator it = c9116.f31044.iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C2184) it.next()).f7921 = i;
                i++;
            }
        }
        C21005.m47168(c9116);
        this.f12057 = mo9694(this.f12055);
        C21005.m47170(c9116.f31045, this);
        this.f12057 = null;
        mo9696();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9593[] m9691() {
        return mo9694(this.f12055);
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6322() {
        return mo9694(this.f12055);
    }

    @Override // l.InterfaceC9012
    /* JADX INFO: renamed from: ۙ */
    public final C2184 mo4153(C2184 c2184, C15592 c15592) {
        System.arraycopy(this.f12056, 0, this.f12057, 0, this.f12055);
        this.f12056 = this.f12057;
        InterfaceC9593 interfaceC9593Mo9692 = mo9692(c2184, c15592.f31401);
        this.f12053.add(interfaceC9593Mo9692);
        this.f12056[c2184.f7921] = interfaceC9593Mo9692;
        return c2184;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC9593 mo9692(C2184 c2184, AbstractC7124 abstractC7124) {
        return mo9695();
    }

    @Override // l.InterfaceC10423
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo4154(C2184 c2184) {
        mo9693(this.f12056[c2184.f7921]);
        return c2184;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC4777 first = this.f12052.f31045.getFirst(); first != null; first = first.m13247()) {
            InterfaceC9593[] interfaceC9593Arr = (InterfaceC9593[]) first.f16794;
            if (interfaceC9593Arr != null) {
                for (InterfaceC9593 interfaceC9593 : interfaceC9593Arr) {
                    if (interfaceC9593 == null) {
                        sb.append('.');
                    } else {
                        sb.append(interfaceC9593.mo24461());
                    }
                }
                sb.append(" | ");
            }
            sb.append(first.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
