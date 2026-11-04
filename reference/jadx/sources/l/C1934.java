package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1934 extends AbstractC3425 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f6490;

    public C1934(EnumC24309 enumC24309, int i) {
        super(enumC24309);
        this.f6490 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6634(int i, int i2, int i3) {
        C5663 c5663 = new C5663();
        c5663.f19546 = i;
        c5663.f19547 = i2;
        c5663.f19545 = i3;
        this.f6490.add(c5663);
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ArrayList<C5663> arrayList = this.f6490;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(arrayList.size());
        for (C5663 c5663 : arrayList) {
            c11388.m28740(c5663.f19546);
            c11388.m28740(c5663.f19547);
            c11388.m28740(c5663.f19545);
        }
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return (this.f6490.size() * 6) + 2;
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo6635() {
        ArrayList arrayList = this.f6490;
        String strConcat = String.format("{ %d {", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strConcat = strConcat.concat(String.format(" [%d]: %s;", Integer.valueOf(i), ((C5663) it.next()).toString()));
            i++;
        }
        return strConcat.concat(" } }");
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6633() {
        StringBuilder sb = new StringBuilder();
        C1170.stream(this.f6490).forEach(new C3710(1, sb));
        return sb.toString();
    }
}
