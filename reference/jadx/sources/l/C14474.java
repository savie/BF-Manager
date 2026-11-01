package l;

/* JADX INFO: renamed from: l.ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes4.dex */
public class C14474 implements InterfaceC23646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f47447;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47448;

    @Override // l.InterfaceC23646
    /* JADX INFO: renamed from: ۙ */
    public boolean mo5813(Object obj) {
        Object[] objArr;
        boolean z;
        C13465.m32966(obj, AbstractC11766.MATCH_INSTANCE_STR);
        int i = this.f47448;
        int i2 = 0;
        while (true) {
            objArr = this.f47447;
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
        int i3 = this.f47448;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f47448 = i3 + 1;
        return true;
    }

    public C14474(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f47447 = new Object[i];
    }

    @Override // l.InterfaceC23646
    /* JADX INFO: renamed from: ۙ */
    public Object mo5812() {
        int i = this.f47448;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f47447;
        Object obj = objArr[i2];
        C13465.m32963(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f47448--;
        return obj;
    }
}
