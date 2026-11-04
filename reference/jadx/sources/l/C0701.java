package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LIT4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0701 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f2607;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24018 f2609;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f2606 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2608 = true;

    public C0701(C24018 c24018, boolean z) {
        this.f2609 = c24018;
        this.f2607 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CentralityState - ");
        if (this.f2608) {
            sb.append("allows central");
        } else {
            sb.append("disallows central");
        }
        sb.append(" | ");
        Iterator it = this.f2606.iterator();
        while (it.hasNext()) {
            sb.append(((C6041) it.next()).getName());
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m3010() {
        return this.f2608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3009(boolean z) {
        this.f2608 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m3014() {
        return this.f2607;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m3011() {
        this.f2607 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3007(C6041 c6041) {
        this.f2606.add(c6041);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3006(HashSet hashSet) {
        this.f2606.addAll(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3008(C18959 c18959) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC16481 abstractC16481 : c18959.m44023()) {
            if (abstractC16481 instanceof C6041) {
                linkedList.add((C6041) abstractC16481);
            }
        }
        C4937.forEach(linkedList, new Consumer() { // from class: l.ܿ᩷᩵
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f60399.m3007((C6041) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3013(C18959 c18959) {
        HashSet hashSet = this.f2606;
        if (hashSet.isEmpty()) {
            return false;
        }
        C6041 c6041M44027 = c18959.m44027() != null ? c18959.m44027() : null;
        if (c6041M44027 == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C6041) it.next()).equals(c6041M44027)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0701 m3005() {
        C0701 c0701 = new C0701(this.f2609, this.f2607);
        c0701.f2608 = this.f2608;
        c0701.f2606.addAll(this.f2606);
        return c0701;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet m3012() {
        return this.f2606;
    }
}
