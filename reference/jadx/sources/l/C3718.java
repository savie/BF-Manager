package l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13516 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13517;

    public C3718(ArrayList arrayList) {
        this.f13517 = arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m10886() {
        return this.f13516 < this.f13517.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8608 m10885() {
        if (!m10886()) {
            throw new NoSuchElementException();
        }
        int i = this.f13516;
        this.f13516 = i + 1;
        return (C8608) this.f13517.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m10884() {
        return new ArrayList(this.f13517);
    }
}
