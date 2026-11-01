package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.۬ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13059 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43521 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f43522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f43523;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f43524;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f43525;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f43526;

    public /* synthetic */ C13059(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32264(C13059 c13059, int i, InterfaceC12976 interfaceC12976) {
        c13059.getClass();
        C0876 c0876 = (C0876) interfaceC12976;
        c0876.getClass();
        if (EnumC0980.ASCENDING == EnumC0980.DESCENDING) {
            List list = c13059.f43522;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c0876.m3534(i, listIterator.previous());
            }
            return;
        }
        Iterator it = c13059.f43522.iterator();
        while (it.hasNext()) {
            c0876.m3534(i, (AbstractC23725) it.next());
        }
    }

    public C13059() {
    }

    static {
        C1063.m4014().m4015();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m32277() {
        return this.f43524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m32274() {
        return this.f43523;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m32280() {
        return this.f43526;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m32272() {
        return this.f43522;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m32278() {
        return this.f43525;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13059)) {
            return false;
        }
        C13059 c13059 = (C13059) obj;
        return Arrays.equals(new Object[]{this.f43524, this.f43523, this.f43526, this.f43522, this.f43525}, new Object[]{c13059.f43524, c13059.f43523, c13059.f43526, c13059.f43522, c13059.f43525});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43524, this.f43523, this.f43526, this.f43522, this.f43525});
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32281(int i, AbstractC22044 abstractC22044) {
        Iterator it = this.f43524.iterator();
        while (it.hasNext()) {
            abstractC22044.mo14253(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f43523.iterator();
        while (it2.hasNext()) {
            abstractC22044.mo14234(i, ((Integer) it2.next()).intValue());
        }
        Iterator it3 = this.f43526.iterator();
        while (it3.hasNext()) {
            abstractC22044.mo14236(i, ((Long) it3.next()).longValue());
        }
        Iterator it4 = this.f43522.iterator();
        while (it4.hasNext()) {
            abstractC22044.mo14239(i, (AbstractC23725) it4.next());
        }
        Iterator it5 = this.f43525.iterator();
        while (it5.hasNext()) {
            abstractC22044.m48975(i, (C6708) it5.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32273(int i) {
        Iterator it = this.f43524.iterator();
        int serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += AbstractC22044.m48962(i, ((Long) it.next()).longValue());
        }
        Iterator it2 = this.f43523.iterator();
        while (it2.hasNext()) {
            ((Integer) it2.next()).getClass();
            serializedSize += AbstractC22044.m48965(i);
        }
        Iterator it3 = this.f43526.iterator();
        while (it3.hasNext()) {
            ((Long) it3.next()).getClass();
            serializedSize += AbstractC22044.m48973(i) + 8;
        }
        Iterator it4 = this.f43522.iterator();
        while (it4.hasNext()) {
            serializedSize += AbstractC22044.m48968(i, (AbstractC23725) it4.next());
        }
        for (C6708 c6708 : this.f43525) {
            serializedSize += c6708.getSerializedSize() + (AbstractC22044.m48973(i) * 2);
        }
        return serializedSize;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32276(int i, AbstractC22044 abstractC22044) {
        Iterator it = this.f43522.iterator();
        while (it.hasNext()) {
            abstractC22044.mo14255(i, (AbstractC23725) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32275(int i, InterfaceC12976 interfaceC12976) {
        C0876 c0876 = (C0876) interfaceC12976;
        c0876.m3536(i, false, this.f43524);
        c0876.m3513(i, false, this.f43523);
        c0876.m3530(i, false, this.f43526);
        c0876.m3523(i, this.f43522);
        EnumC0980 enumC0980 = EnumC0980.ASCENDING;
        for (int i2 = 0; i2 < this.f43525.size(); i2++) {
            c0876.m3537(i);
            ((C6708) this.f43525.get(i2)).m18147(c0876);
            c0876.m3516(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m32279(int i) {
        int iM48968 = 0;
        for (AbstractC23725 abstractC23725 : this.f43522) {
            iM48968 += AbstractC22044.m48968(3, abstractC23725) + AbstractC22044.m48960(2, i) + (AbstractC22044.m48973(1) * 2);
        }
        return iM48968;
    }
}
