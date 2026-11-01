package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5693 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5693 f19416;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f19418;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f19419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f19417 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19420 = new ArrayList();

    public C5693(C5693 c5693, String str, String str2) {
        this.f19416 = c5693;
        this.f19419 = str;
        this.f19418 = str2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m15697() {
        return this.f19419;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m15701() {
        return this.f19418;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m15698() {
        return C0561.unmodifiableList(this.f19417);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m15703() {
        return C0561.unmodifiableList(this.f19420);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15702() {
        return this.f19417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14161 m15699(String str) {
        for (C14161 c14161 : this.f19420) {
            if (c14161.f46470.equals(str)) {
                return c14161;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15700(final Comparator comparator) {
        Comparator comparator2 = new Comparator() { // from class: l.ۨ᩻᩺
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C5693) obj).f19419, ((C5693) obj2).f19419);
            }
        };
        ArrayList arrayList = this.f19417;
        Collections.sort(arrayList, comparator2);
        Collections.sort(this.f19420, new Comparator() { // from class: l.ۖ᩻᩺
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C14161) obj).f46470, ((C14161) obj2).f46470);
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5693) arrayList.get(i)).m15700(comparator);
        }
    }
}
