package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J58K */
/* JADX INFO: loaded from: classes4.dex */
public final class C11817 extends AbstractC16292 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f38143;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10562 f38144;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f38145;

    public C11817() {
        super(EnumC20768.LABEL);
        this.f38145 = -1;
    }

    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final C11817 mo2797(C5194 c5194) {
        C11817 c11817Mo15614 = c5194.mo15614(this);
        if (this.f38143 != null && c11817Mo15614.f38143 == null) {
            c11817Mo15614.f38143 = new ArrayList(this.f38143.size());
            Iterator it = this.f38143.iterator();
            while (it.hasNext()) {
                c11817Mo15614.f38143.add((C20022) ((C20022) it.next()).mo2797(c5194));
            }
        }
        return c11817Mo15614;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m29665() {
        return String.format("L%08x", Integer.valueOf(hashCode()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m29665());
        sb.append(":");
        ArrayList arrayList = this.f38143;
        if (arrayList != null && arrayList.size() > 0) {
            sb.append(" // ");
            sb.append(this.f38143);
        }
        if (this.f38145 >= 0) {
            sb.append(" // line ");
            sb.append(this.f38145);
        }
        return sb.toString();
    }
}
