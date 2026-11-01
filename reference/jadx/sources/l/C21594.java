package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ATX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21594 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f70057;

    public C21594(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        C20190.m45650(c17367, 20227);
        c17367.readInt();
        int iM40462 = c17367.m40462();
        ArrayList arrayList = new ArrayList(iM40462);
        for (int i = 0; i < iM40462; i++) {
            arrayList.add(AbstractC6839.m18440(this, c17367));
        }
        this.f70057 = C0561.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20227);
        c11018.m27799();
        c11018.mo24508(this.f70057.size());
        Iterator it = this.f70057.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18446(c11018);
        }
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        Iterator it = this.f70057.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18445(c4016);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48308(ArrayList arrayList) {
        this.f70057 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m48307() {
        return this.f70057;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(final AbstractC6839 abstractC6839) {
        C21594 c21594 = new C21594(abstractC6839);
        c21594.f23038 = this.f23038;
        c21594.f70057 = (List) C9030.stream(this.f70057).map(new Function() { // from class: l.ܶ۬ۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC6839) obj).mo18441(abstractC6839);
            }
        }).collect(C1890.toList());
        return c21594;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        Iterator it = this.f70057.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18443(sb, i + 1);
        }
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18444(ArrayList arrayList) {
        Iterator it = this.f70057.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18444(arrayList);
        }
    }
}
