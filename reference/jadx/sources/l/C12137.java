package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12137 extends AbstractC9315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f40633;

    public C12137(EnumC2300 enumC2300, int i) {
        super(enumC2300);
        this.f40633 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30211(int i, int i2, int i3) {
        C16370 c16370 = new C16370();
        c16370.f52686 = i;
        c16370.f52687 = i2;
        c16370.f52685 = i3;
        this.f40633.add(c16370);
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ArrayList<C16370> arrayList = this.f40633;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(arrayList.size());
        for (C16370 c16370 : arrayList) {
            c23509.m51770(c16370.f52686);
            c23509.m51770(c16370.f52687);
            c23509.m51770(c16370.f52685);
        }
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return (this.f40633.size() * 6) + 2;
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۨ */
    public final String mo5333() {
        ArrayList arrayList = this.f40633;
        String strConcat = String.format("{ %d {", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strConcat = strConcat.concat(String.format(" [%d]: %s;", Integer.valueOf(i), ((C16370) it.next()).toString()));
            i++;
        }
        return strConcat.concat(" } }");
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۙ */
    public final String mo5332() {
        final StringBuilder sb = new StringBuilder();
        C9030.stream(this.f40633).forEach(new Consumer() { // from class: l.֡ۗۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C16370 c16370 = (C16370) obj;
                sb.append("{ " + c16370.f52686 + " " + c16370.f52687 + " " + c16370.f52685 + " }");
            }
        });
        return sb.toString();
    }
}
