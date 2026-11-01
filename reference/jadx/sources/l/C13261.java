package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes3.dex */
public class C13261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f44035;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44036;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1265 f44037;

    public C13261() {
        this(4);
    }

    public C13261(int i) {
        this.f44035 = new Object[i * 2];
        this.f44036 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13261 mo32741(Object obj, Object obj2) {
        int i = (this.f44036 + 1) * 2;
        Object[] objArr = this.f44035;
        if (i > objArr.length) {
            this.f44035 = Arrays.copyOf(objArr, AbstractC14528.m34968(objArr.length, i));
        }
        C20296.m45807(obj, obj2);
        Object[] objArr2 = this.f44035;
        int i2 = this.f44036;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f44036 = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC6910 m32739(boolean z) {
        C1265 c1265;
        C1265 c1266;
        if (z && (c1266 = this.f44037) != null) {
            throw c1266.m4589();
        }
        C13449 c13449M32935 = C13449.m32935(this.f44036, this.f44035, this);
        if (!z || (c1265 = this.f44037) == null) {
            return c13449M32935;
        }
        throw c1265.m4589();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6910 mo32740() {
        return m32739(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC6910 mo32742() {
        return m32739(true);
    }
}
