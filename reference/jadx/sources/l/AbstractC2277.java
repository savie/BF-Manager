package l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S9US */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2277 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f8127;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f8129;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f8132;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f8126 = C0561.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f8131 = C0561.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f8130 = C0561.synchronizedList(new LinkedList());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f8128 = C0561.synchronizedList(new LinkedList());

    public AbstractC2277(int i, int i2, boolean z) {
        this.f8127 = i;
        this.f8129 = i2;
        this.f8132 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m6974() {
        if (this.f8132) {
            return 0;
        }
        return this.f8129;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6983(int i) {
        this.f8129 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m6980() {
        return this.f8127;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6977(int i) {
        this.f8127 = i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m6975() {
        return this.f8132;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m6981() {
        return this.f8128.size() + (this.f8130.size() + (this.f8131.size() + this.f8126.size())) == 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m6986() {
        return this.f8126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6976() {
        List list = this.f8131;
        int size = list.size();
        List list2 = this.f8130;
        int size2 = list2.size() + size;
        List list3 = this.f8128;
        ArrayList arrayList = new ArrayList(list3.size() + size2);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m6982() {
        return this.f8131;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6985() {
        return (this.f8127 & 15) == 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m6978() {
        return (this.f8127 & 30720) >> 11;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m6984() {
        return (this.f8127 & 512) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m6973() {
        return (this.f8127 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m6979() {
        return (this.f8127 & 32768) == 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m6987() {
        return (this.f8127 & 32768) == 32768;
    }
}
