package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4698 extends AbstractC10663 implements InterfaceC8644 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4698 f16584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f16585;

    @Override // l.InterfaceC13864
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8644 mo14574() {
        return this;
    }

    @Override // l.InterfaceC13864
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo14577() {
        return true;
    }

    public C4698(String str, int i, Map map, C4698 c4698) {
        super(map, i, str);
        this.f16584 = c4698;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14575(int i) {
        if (isClosed()) {
            return;
        }
        this.f33824 = i;
        ArrayList arrayList = this.f16585;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4698) it.next()).m14575(i);
            }
        }
    }

    @Override // l.InterfaceC8644
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8644 mo14576() {
        return this.f16584;
    }

    @Override // l.InterfaceC8644
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List mo14578() {
        ArrayList arrayList = this.f16585;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC10663, l.InterfaceC13864
    public final Map attributes() {
        return this.f33822;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append(this.f33823);
        sb.append("', start=");
        sb.append(this.f33825);
        sb.append(", end=");
        sb.append(this.f33824);
        sb.append(", attributes=");
        sb.append(this.f33822);
        sb.append(", parent=");
        C4698 c4698 = this.f16584;
        sb.append(c4698 != null ? c4698.f33823 : null);
        sb.append(", children=");
        sb.append(this.f16585);
        sb.append('}');
        return sb.toString();
    }
}
