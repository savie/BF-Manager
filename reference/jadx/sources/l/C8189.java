package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 699M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8189 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f28541;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f28542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28543;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f28544;

    public C8189(AbstractC6839 abstractC6839) {
        super(abstractC6839);
        this.f28543 = new ArrayList();
    }

    public C8189(AbstractC6839 abstractC6839, C17367 c17367) {
        super(abstractC6839);
        this.f28543 = new ArrayList();
        C20190.m45650(c17367, 20231);
        c17367.readInt();
        this.f28541 = c17367.m40448();
        this.f28544 = c17367.readByte();
        this.f28542 = C16387.m38583(c17367.m40448());
        int iM40462 = c17367.m40462();
        for (int i = 0; i < iM40462; i++) {
            this.f28543.add(AbstractC6839.m18440(this, c17367));
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        c11018.mo24508(20231);
        c11018.m27799();
        c11018.m27783(this.f28541);
        c11018.writeByte(this.f28544);
        c11018.m27783(C16387.m38584(this.f28542));
        ArrayList arrayList = this.f28543;
        c11018.mo24508(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18446(c11018);
        }
        c11018.m27777();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        Iterator it = this.f28543.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18445(c4016);
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        C8189 c8189 = new C8189(abstractC6839);
        c8189.f23038 = this.f23038;
        c8189.f28541 = this.f28541;
        c8189.f28544 = this.f28544;
        c8189.f28542 = this.f28542;
        Iterator it = this.f28543.iterator();
        while (it.hasNext()) {
            c8189.f28543.add(((AbstractC6839) it.next()).mo18441(c8189));
        }
        return c8189;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m21479() {
        return this.f28541;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21480(String str) {
        this.f28541 = str;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18444(ArrayList arrayList) {
        int i = this.f28544;
        ArrayList arrayList2 = this.f28543;
        if (i == 2) {
            if (arrayList2.size() == 1) {
                ((AbstractC6839) arrayList2.get(0)).mo18444(arrayList);
            }
        } else {
            if (arrayList2.isEmpty()) {
                return;
            }
            ((AbstractC6839) arrayList2.get(0)).mo18444(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m21481() {
        return this.f28544;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21483(String str) {
        str.getClass();
        int i = 2;
        switch (str) {
            case "select":
                break;
            case "link":
                i = 0;
                break;
            case "linkAll":
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("Unknown group type: ".concat(str));
        }
        this.f28544 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21485(String str) {
        this.f28542 = C16387.m38583(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21486(AbstractC6839 abstractC6839) {
        this.f28543.add(abstractC6839);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m21484() {
        return this.f28543;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21482() {
        return this.f28542;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        String str;
        sb.append(C6851.m18455(i, "\t"));
        sb.append("{\n");
        int i2 = i + 1;
        String strM18455 = C6851.m18455(i2, "\t");
        sb.append(strM18455);
        sb.append("group: ");
        int i3 = this.f28544;
        if (i3 == 0) {
            str = "link";
        } else if (i3 == 1) {
            str = "linkAll";
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("group type=" + this.f28544);
            }
            str = "select";
        }
        sb.append(str);
        sb.append('\n');
        String strM38584 = C16387.m38584(this.f28542);
        if (strM38584 != null) {
            sb.append(strM18455);
            sb.append("style: ");
            sb.append('\"');
            sb.append(strM38584);
            sb.append('\"');
            sb.append('\n');
        }
        sb.append(strM18455);
        sb.append("contains: ");
        sb.append('\n');
        Iterator it = this.f28543.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18443(sb, i2);
        }
        sb.append(C6851.m18455(i, "\t"));
        sb.append("}\n");
    }
}
