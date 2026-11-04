package l;

/* JADX INFO: renamed from: l.ۛۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6285 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24185[] f21341 = new C24185[6];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21342;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24185[] m17969() {
        int i = this.f21342;
        C24185[] c24185Arr = new C24185[i];
        System.arraycopy(this.f21341, 0, c24185Arr, 0, i);
        return c24185Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17968(C24185 c24185) {
        while (c24185 != null) {
            int i = 0;
            while (true) {
                int i2 = this.f21342;
                if (i < i2) {
                    if (this.f21341[i].f78327.equals(c24185.f78327)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C24185[] c24185Arr = this.f21341;
                    if (i2 >= c24185Arr.length) {
                        C24185[] c24185Arr2 = new C24185[c24185Arr.length + 6];
                        System.arraycopy(c24185Arr, 0, c24185Arr2, 0, i2);
                        this.f21341 = c24185Arr2;
                    }
                    C24185[] c24185Arr3 = this.f21341;
                    int i3 = this.f21342;
                    this.f21342 = i3 + 1;
                    c24185Arr3[i3] = c24185;
                    break;
                }
            }
            c24185 = c24185.f78328;
        }
    }
}
