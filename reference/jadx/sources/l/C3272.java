package l;

/* JADX INFO: renamed from: l.ۗܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public class C3272 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f12142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3272[] f12143;

    public C3272(String str, C3272... c3272Arr) {
        this.f12142 = str;
        this.f12143 = c3272Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo9752(Object obj) {
        C11948 c11948 = (C11948) obj;
        Object[] objArrM29763 = c11948.m29763();
        if (c11948.mo29765().matches(this.f12142)) {
            C3272[] c3272Arr = this.f12143;
            if (c3272Arr.length == c11948.m29763().length) {
                for (int i = 0; i < objArrM29763.length; i++) {
                    if (!c3272Arr[i].mo9752(objArrM29763[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
