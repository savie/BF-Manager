package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C8XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C0295 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15134 f1613 = new C15134();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1614 = new ArrayList();

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC14738 mo1823() {
        return this.f1613;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        if (interfaceC8119.mo21201() >= 4) {
            return new C22168(-1, interfaceC8119.mo21202() + 4, false);
        }
        if (interfaceC8119.mo21199()) {
            return C22168.m49178(interfaceC8119.mo21197());
        }
        return null;
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1822(C11647 c11647) {
        this.f1614.add(c11647.m29102());
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo1824() {
        int i;
        CharSequence charSequence;
        ArrayList arrayList = this.f1614;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) arrayList.get(size);
            }
        } while (C22851.m50577(0, charSequence.length(), charSequence) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.f1613.m36291(sb.toString());
    }
}
