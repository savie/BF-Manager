package l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18330 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59789 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f59790;

    public C18330(ArrayList arrayList) {
        this.f59790 = arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42787() {
        return this.f59789 < this.f59790.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7208 m42786() {
        if (!m42787()) {
            throw new NoSuchElementException();
        }
        int i = this.f59789;
        this.f59789 = i + 1;
        return (C7208) this.f59790.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m42785() {
        return new ArrayList(this.f59790);
    }
}
