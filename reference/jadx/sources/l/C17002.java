package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J58K */
/* JADX INFO: loaded from: classes5.dex */
public final class C17002 extends AbstractC14181 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f54351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9938 f54352;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f54353;

    public C17002() {
        super(EnumC2890.LABEL);
        this.f54353 = -1;
    }

    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ */
    public final C17002 mo985(C10527 c10527) {
        C17002 c17002Mo2550 = c10527.mo2550(this);
        if (this.f54351 != null && c17002Mo2550.f54351 == null) {
            c17002Mo2550.f54351 = new ArrayList(this.f54351.size());
            Iterator it = this.f54351.iterator();
            while (it.hasNext()) {
                c17002Mo2550.f54351.add((C15592) ((C15592) it.next()).mo985(c10527));
            }
        }
        return c17002Mo2550;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m39782() {
        return String.format("L%08x", Integer.valueOf(hashCode()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m39782());
        sb.append(":");
        ArrayList arrayList = this.f54351;
        if (arrayList != null && arrayList.size() > 0) {
            sb.append(" // ");
            sb.append(this.f54351);
        }
        if (this.f54353 >= 0) {
            sb.append(" // line ");
            sb.append(this.f54353);
        }
        return sb.toString();
    }
}
