package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܿۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18160 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59362 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f59363;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f59364;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f59365;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f59366;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f59367;

    public /* synthetic */ C18160(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42316(C18160 c18160, int i, InterfaceC18356 interfaceC18356) {
        c18160.getClass();
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.getClass();
        if (EnumC21340.ASCENDING == EnumC21340.DESCENDING) {
            List list = c18160.f59367;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c21560.m49006(i, listIterator.previous());
            }
            return;
        }
        Iterator it = c18160.f59367.iterator();
        while (it.hasNext()) {
            c21560.m49006(i, (AbstractC17084) it.next());
        }
    }

    public C18160() {
    }

    static {
        C21144.m48247().m48248();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m42331() {
        return this.f59365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m42327() {
        return this.f59363;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m42333() {
        return this.f59366;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m42335() {
        return this.f59367;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m42330() {
        return this.f59364;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18160)) {
            return false;
        }
        C18160 c18160 = (C18160) obj;
        return Arrays.equals(new Object[]{this.f59365, this.f59363, this.f59366, this.f59367, this.f59364}, new Object[]{c18160.f59365, c18160.f59363, c18160.f59366, c18160.f59367, c18160.f59364});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59365, this.f59363, this.f59366, this.f59367, this.f59364});
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42334(int i, AbstractC14846 abstractC14846) {
        Iterator it = this.f59365.iterator();
        while (it.hasNext()) {
            abstractC14846.mo14023(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f59363.iterator();
        while (it2.hasNext()) {
            abstractC14846.mo14004(i, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f59366.iterator();
        while (it3.hasNext()) {
            abstractC14846.mo14006(i, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f59367.iterator();
        while (it4.hasNext()) {
            abstractC14846.mo14008(i, (AbstractC17084) it4.next());
        }
        Iterator it5 = this.f59364.iterator();
        while (it5.hasNext()) {
            abstractC14846.m35775(i, (C7719) it5.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42326(int i) {
        Iterator it = this.f59365.iterator();
        int serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += AbstractC14846.m35773(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f59363.iterator();
        while (it2.hasNext()) {
            ((Integer) it2.next()).getClass();
            serializedSize += AbstractC14846.m35767(i);
        }
        Iterator it3 = this.f59366.iterator();
        while (it3.hasNext()) {
            ((Long) it3.next()).getClass();
            serializedSize += AbstractC14846.m35765(i) + 8;
        }
        Iterator it4 = this.f59367.iterator();
        while (it4.hasNext()) {
            serializedSize += AbstractC14846.m35761(i, (AbstractC17084) it4.next());
        }
        for (C7719 c7719 : this.f59364) {
            serializedSize += c7719.getSerializedSize() + (AbstractC14846.m35765(i) * 2);
        }
        return serializedSize;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42328(int i, AbstractC14846 abstractC14846) {
        Iterator it = this.f59367.iterator();
        while (it.hasNext()) {
            abstractC14846.mo14024(i, (AbstractC17084) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42329(int i, InterfaceC18356 interfaceC18356) {
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.m49003(i, false, this.f59365);
        c21560.m49027(i, false, this.f59363);
        c21560.m49017(i, false, this.f59366);
        c21560.m48998(i, this.f59367);
        EnumC21340 enumC21340 = EnumC21340.ASCENDING;
        for (int i2 = 0; i2 < this.f59364.size(); i2++) {
            c21560.m49018(i);
            ((C7719) this.f59364.get(i2)).m21009(c21560);
            c21560.m48991(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42332(int i) {
        int iM35761 = 0;
        for (AbstractC17084 abstractC17084 : this.f59367) {
            iM35761 += AbstractC14846.m35761(3, abstractC17084) + AbstractC14846.m35764(2, i) + (AbstractC14846.m35765(1) * 2);
        }
        return iM35761;
    }
}
