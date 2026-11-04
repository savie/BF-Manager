package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: SISW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6566 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22036 = new ArrayList();

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36001;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m18484() {
        return this.f22036;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PHI:");
        ArrayList<C18981> arrayList = this.f22036;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6041 c6041M44027 = ((C18981) it.next()).m44027();
            if (c6041M44027 != null) {
                sb.append(" r");
                sb.append(c6041M44027.m17532());
            }
        }
        for (C18981 c18981 : arrayList) {
            sb.append("\n  ");
            sb.append(c18981);
        }
        return sb.toString();
    }
}
