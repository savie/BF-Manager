package l;

/* JADX INFO: renamed from: l.ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes3.dex */
public class C6785 implements InterfaceC8276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f22613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f22614;

    @Override // l.InterfaceC8276
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo18920(Object obj) {
        Object[] objArr;
        boolean z;
        C15243.m36590(obj, AbstractC0329.MATCH_INSTANCE_STR);
        int i = this.f22614;
        int i2 = 0;
        while (true) {
            objArr = this.f22613;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f22614;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f22614 = i3 + 1;
        return true;
    }

    public C6785(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f22613 = new Object[i];
    }

    @Override // l.InterfaceC8276
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo18919() {
        int i = this.f22614;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f22613;
        Object obj = objArr[i2];
        C15243.m36587(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f22614--;
        return obj;
    }
}
