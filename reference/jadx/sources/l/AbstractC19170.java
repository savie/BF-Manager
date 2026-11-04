package l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9US */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19170 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f62025;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f62026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62028;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f62024 = C4681.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f62027 = C4681.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f62023 = C4681.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f62022 = C4681.synchronizedList(new LinkedList());

    public AbstractC19170(int i, int i2, boolean z) {
        this.f62028 = i;
        this.f62026 = i2;
        this.f62025 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m44436() {
        if (this.f62025) {
            return 0;
        }
        return this.f62026;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44435(int i) {
        this.f62026 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44427() {
        return this.f62028;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44425(int i) {
        this.f62028 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44423() {
        return this.f62025;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m44426() {
        return this.f62022.size() + (this.f62023.size() + (this.f62027.size() + this.f62024.size())) == 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m44430() {
        return this.f62024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44424() {
        List list = this.f62027;
        int size = list.size();
        List list2 = this.f62023;
        int size2 = list2.size() + size;
        List list3 = this.f62022;
        ArrayList arrayList = new ArrayList(list3.size() + size2);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m44434() {
        return this.f62027;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m44432() {
        return (this.f62028 & 15) == 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m44433() {
        return (this.f62028 & 30720) >> 11;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m44431() {
        return (this.f62028 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m44429() {
        return (this.f62028 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44428() {
        return (this.f62028 & 32768) == 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m44437() {
        return (this.f62028 & 32768) == 32768;
    }
}
