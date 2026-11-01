package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: SARS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10037 extends AbstractC6839 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f34258;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8626 f34259;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f34260;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f34261;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f34262;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f34263;

    public C10037(AbstractC6839 abstractC6839) {
        super(abstractC6839);
        List list = Collections.EMPTY_LIST;
        this.f34261 = list;
        this.f34258 = list;
        this.f34262 = list;
    }

    public C10037(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        List list = Collections.EMPTY_LIST;
        this.f34261 = list;
        this.f34258 = list;
        this.f34262 = list;
        C20190.m45650(c17367, 20225);
        c17367.readInt();
        this.f34260 = c17367.m40448();
        int iM40462 = c17367.m40462();
        int iM40463 = c17367.m40462();
        ArrayList arrayList = new ArrayList(iM40463 + 1);
        ArrayList arrayList2 = new ArrayList(iM40463);
        arrayList.add(c17367.m40442());
        for (int i = 0; i < iM40463; i++) {
            arrayList2.add(c17367.m40442());
            arrayList.add(c17367.m40442());
        }
        this.f34259 = C8626.m22404(arrayList, arrayList2, iM40462);
        this.f34263 = c17367.m40461();
        int iM40464 = c17367.m40462();
        ArrayList arrayList3 = new ArrayList(iM40464);
        for (int i2 = 0; i2 < iM40464; i2++) {
            arrayList3.add(new C1487(c17367.m40462(), c17367.m40442()));
        }
        this.f34261 = C0561.unmodifiableList(arrayList3);
        int iM40465 = c17367.m40462();
        ArrayList arrayList4 = new ArrayList(iM40465);
        for (int i3 = 0; i3 < iM40465; i3++) {
            arrayList4.add(C12154.m30235(c17367.m40462(), c17367.m40458()));
        }
        this.f34258 = C0561.unmodifiableList(arrayList4);
        int iM40466 = c17367.m40462();
        ArrayList arrayList5 = new ArrayList(iM40466);
        for (int i4 = 0; i4 < iM40466; i4++) {
            arrayList5.add(new C23068(c17367.m40462(), AbstractC6839.m18440(this, c17367)));
        }
        this.f34262 = C0561.unmodifiableList(arrayList5);
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20225);
        c11018.m27799();
        c11018.m27783(this.f34260);
        this.f34259.m22411(c11018);
        c11018.m27784(this.f34263);
        c11018.mo24508(this.f34261.size());
        for (C1487 c1487 : this.f34261) {
            c11018.mo24508(c1487.m5133());
            c11018.m27782((CharSequence) c1487.m5134());
        }
        List list = this.f34258;
        int size = list.size();
        c11018.mo24508(size);
        for (int i = 0; i < size; i++) {
            C12154 c12154 = (C12154) list.get(i);
            c11018.m27786(c12154.f40679);
            c11018.mo24508(c12154.f40680);
        }
        c11018.mo24508(this.f34262.size());
        for (C23068 c23068 : this.f34262) {
            c11018.mo24508(c23068.m51041());
            c23068.m51043().mo18446(c11018);
        }
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        this.f34259.getClass();
        boolean zIsEmpty = this.f34261.isEmpty();
        AbstractC6839 abstractC6839 = this.f23037;
        if (!zIsEmpty && (!(abstractC6839 instanceof C7214) || ((C7214) abstractC6839).m19171() != this)) {
            throw new C18066(this.f23038, "export is only allowed on a direct start match");
        }
        if (this.f34259.m22417() && (!(abstractC6839 instanceof C7214) || ((C7214) abstractC6839).m19152() != this)) {
            throw new C18066(this.f23038, "var() is only allowed on a direct end match");
        }
        Iterator it = this.f34262.iterator();
        while (it.hasNext()) {
            ((C23068) it.next()).m51043().mo18445(c4016);
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C10037 c10037 = new C10037(abstractC6839);
        c10037.f23038 = this.f23038;
        c10037.f34260 = this.f34260;
        c10037.f34259 = this.f34259;
        c10037.f34261 = this.f34261;
        c10037.f34258 = this.f34258;
        if (!this.f34262.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f34262.size());
            Iterator it = this.f34262.iterator();
            while (it.hasNext()) {
                arrayList.add(((C23068) it.next()).m51042(c10037));
            }
            c10037.f34262 = arrayList;
        }
        c10037.f34263 = this.f34263;
        return c10037;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m25322() {
        return this.f34260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25324(String str) {
        this.f34260 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25327(C14690 c14690) {
        this.f34259 = C8626.m22405(c14690);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8626 m25330() {
        return this.f34259;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25325(C8626 c8626) {
        this.f34259 = c8626;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m25332() {
        return this.f34261;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25333(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            C13638.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.f34261 = C0561.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m25329() {
        return this.f34258;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25331(ArrayList arrayList) {
        this.f34258 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25326(C12154 c12154) {
        this.f34258 = Collections.singletonList(c12154);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m25334() {
        return this.f34262;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25323(ArrayList arrayList) {
        if (arrayList.isEmpty() && this.f34262.isEmpty()) {
            return;
        }
        this.f34262 = arrayList;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m25321() {
        return this.f34263;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25328(boolean z) {
        this.f34263 = z;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM18455 = C6851.m18455(i2, "\t");
        sb.append(strM18455);
        sb.append("match: ");
        this.f34259.m22410(sb);
        sb.append('\n');
        sb.append(strM18455);
        sb.append("recordAllGroups: ");
        sb.append(this.f34263);
        sb.append('\n');
        for (C1487 c1487 : this.f34261) {
            sb.append(strM18455);
            sb.append("export: ");
            sb.append(c1487.m5133());
            sb.append(" => \"");
            sb.append(C9461.m24217(c1487.m5134()));
            sb.append("\"\n");
        }
        for (C12154 c12154 : this.f34258) {
            sb.append(strM18455);
            sb.append(c12154.f40680);
            sb.append(": \"");
            sb.append(c12154.f40679);
            sb.append("\"\n");
        }
        for (C23068 c23068 : this.f34262) {
            sb.append(strM18455);
            sb.append("subMatcher: ");
            sb.append(c23068.m51041());
            sb.append('\n');
            c23068.m51043().mo18443(sb, i2);
        }
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }
}
