package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16084 extends AbstractC0560 implements InterfaceC10440 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f52026;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16084 f52027;

    @Override // l.InterfaceC21022
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10440 mo38112() {
        return this;
    }

    @Override // l.InterfaceC21022
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo38114() {
        return true;
    }

    public C16084(String str, int i, Map map, C16084 c16084) {
        super(map, i, str);
        this.f52027 = c16084;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38113(int i) {
        if (isClosed()) {
            return;
        }
        this.f2342 = i;
        ArrayList arrayList = this.f52026;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C16084) it.next()).m38113(i);
            }
        }
    }

    @Override // l.InterfaceC10440
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10440 mo26356() {
        return this.f52027;
    }

    @Override // l.InterfaceC10440
    /* JADX INFO: renamed from: ۖ */
    public final List mo26355() {
        ArrayList arrayList = this.f52026;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        return C0561.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC0560, l.InterfaceC21022
    public final Map attributes() {
        return this.f2340;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.f2341);
        sb.append("', start=");
        sb.append(this.f2339);
        sb.append(", end=");
        sb.append(this.f2342);
        sb.append(", attributes=");
        sb.append(this.f2340);
        sb.append(", parent=");
        C16084 c16084 = this.f52027;
        sb.append(c16084 != null ? c16084.f2341 : null);
        sb.append(", children=");
        sb.append(this.f52026);
        sb.append('}');
        return sb.toString();
    }
}
