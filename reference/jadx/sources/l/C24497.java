package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8IQX */
/* JADX INFO: loaded from: classes.dex */
public final class C24497 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79470;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79471;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f79472;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f79473 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79474;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54756(int i, int i2, int i3, int i4) {
        if (this.f79472 || i4 == 0) {
            return;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int i5 = this.f79469;
        if (i5 != 0 && this.f79474 == i2 && this.f79470 == i3) {
            long j = i5;
            if ((((long) i3) * j) + ((long) this.f79471) == i && j + ((long) i4) <= 2147483647L) {
                this.f79469 = i5 + i4;
                return;
            }
        }
        m54754();
        this.f79471 = i;
        this.f79474 = i2;
        this.f79470 = i3;
        this.f79469 = i4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m54754() {
        if (this.f79469 == 0 || this.f79472) {
            return;
        }
        ArrayList arrayList = this.f79473;
        if (arrayList.size() >= 65536) {
            arrayList.clear();
            this.f79472 = true;
        } else {
            arrayList.add(new C4359(this.f79471, this.f79474, this.f79470, this.f79469));
        }
        this.f79469 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14799 m54755() {
        m54754();
        return new C14799(0L, 0L, 0, 0, C4681.unmodifiableList(new ArrayList(this.f79473)), false, this.f79472);
    }
}
