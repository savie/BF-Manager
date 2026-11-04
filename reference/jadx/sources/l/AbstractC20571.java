package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95JE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20571 implements InterfaceC14054, InterfaceC10939 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65891;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC3417[] f65892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC3417[] f65894;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13791 f65895;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f65890 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f65893 = true;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6604(InterfaceC3417 interfaceC3417);

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC3417[] mo6605(int i);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo6607();

    /* JADX INFO: renamed from: ᩴ */
    public abstract InterfaceC3417 mo6608();

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13332(Object obj, AbstractC12563 abstractC12563) {
        this.f65894 = (InterfaceC3417[]) obj;
        try {
            C22874.m51594(abstractC12563, this, false);
            InterfaceC3417[] interfaceC3417Arr = this.f65894;
            this.f65894 = null;
            return interfaceC3417Arr;
        } catch (Exception e) {
            throw new RuntimeException("fail exe " + abstractC12563, e);
        }
    }

    public AbstractC20571(C13791 c13791) {
        this.f65895 = c13791;
        this.f65891 = c13791.f43751.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47168() {
        boolean z = this.f65893;
        C13791 c13791 = this.f65895;
        if (z) {
            Iterator it = c13791.f43751.iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C4448) it.next()).f15916 = i;
                i++;
            }
        }
        C22874.m51595(c13791);
        this.f65892 = mo6605(this.f65891);
        C22874.m51597(c13791.f43750, this);
        this.f65892 = null;
        mo6607();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC3417[] m47169() {
        return mo6605(this.f65891);
    }

    @Override // l.InterfaceC14054
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13331() {
        return mo6605(this.f65891);
    }

    @Override // l.InterfaceC4974
    /* JADX INFO: renamed from: ۙ */
    public final C4448 mo5056(C4448 c4448, C20022 c20022) {
        System.arraycopy(this.f65894, 0, this.f65892, 0, this.f65891);
        this.f65894 = this.f65892;
        InterfaceC3417 interfaceC3417Mo6603 = mo6603(c4448, c20022.f12387);
        this.f65890.add(interfaceC3417Mo6603);
        this.f65894[c4448.f15916] = interfaceC3417Mo6603;
        return c4448;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3417 mo6603(C4448 c4448, AbstractC11071 abstractC11071) {
        return mo6608();
    }

    @Override // l.InterfaceC22128
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5057(C4448 c4448) {
        mo6604(this.f65894[c4448.f15916]);
        return c4448;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (AbstractC12563 first = this.f65895.f43750.getFirst(); first != null; first = first.m31273()) {
            InterfaceC3417[] interfaceC3417Arr = (InterfaceC3417[]) first.f40353;
            if (interfaceC3417Arr != null) {
                for (InterfaceC3417 interfaceC3417 : interfaceC3417Arr) {
                    if (interfaceC3417 == null) {
                        sb.append('.');
                    } else {
                        sb.append(interfaceC3417.mo11178());
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
