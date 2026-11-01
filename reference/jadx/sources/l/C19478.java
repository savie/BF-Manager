package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9BM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19478 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC6839 f62696;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f62697;

    public C19478(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        C20190.m45650(c17367, 20230);
        c17367.readInt();
        this.f62697 = c17367.m40458();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20230);
        c11018.m27799();
        c11018.m27786(this.f62697);
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        if (c4016.f14872.add(this.f62697)) {
            try {
                AbstractC6839 abstractC6839Mo18441 = this.f23037.mo18442().m46962(this.f62697).mo18441(this);
                this.f62696 = abstractC6839Mo18441;
                abstractC6839Mo18441.mo18445(c4016);
            } catch (RuntimeException e) {
                throw new C18066(this.f23038, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m44540() {
        return this.f62697;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44539(String str) {
        this.f62697 = str;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C19478 c19478 = new C19478(abstractC6839);
        c19478.f23038 = this.f23038;
        c19478.f62697 = this.f62697;
        return c19478;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        sb.append(C6851.m18455(i + 1, "\t"));
        sb.append("include: \"");
        sb.append(this.f62697);
        sb.append("\"\n");
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18444(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C19478) it.next()).f62697.equals(this.f62697)) {
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add("include \"" + ((C19478) it2.next()).f62697 + "\"");
                }
                arrayList2.add("include \"" + this.f62697 + "\"");
                throw new C13834("There is a circular hard dependency: " + C6851.m18456(arrayList2, " > "));
            }
        }
        ArrayList arrayList3 = (ArrayList) arrayList.clone();
        arrayList3.add(this);
        if (this.f62696 == null) {
            this.f62696 = this.f23037.mo18442().m46962(this.f62697).mo18441(this);
        }
        this.f62696.mo18444(arrayList3);
    }
}
