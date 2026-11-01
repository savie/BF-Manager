package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17493 extends AbstractC4067 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C17493 f55646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17493 f55647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f55648 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f55649;

    public C17493(AbstractC22433 abstractC22433) {
        this.f55649 = abstractC22433;
    }

    static {
        int i = AbstractC22433.f73217;
        f55647 = new C17493(C12038.f40301);
        f55646 = new C17493(AbstractC22433.of((Object) C9548.m24392()));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17493 m40758() {
        return f55647;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17493 m40759() {
        return f55646;
    }

    @Override // l.InterfaceC4981
    /* JADX INFO: renamed from: ۙ */
    public final C9548 mo13812(Integer num) {
        int iM33722 = C13884.m33722(this.f55649, new C9028(), new C21582(num), C17308.f55088, EnumC4710.f16620, EnumC11332.f38236);
        if (iM33722 == -1) {
            return null;
        }
        C9548 c9548 = (C9548) this.f55649.get(iM33722);
        if (c9548.m24405(num)) {
            return c9548;
        }
        return null;
    }

    @Override // l.InterfaceC4981
    /* JADX INFO: renamed from: ۙ */
    public final Set mo13811() {
        AbstractC22433 abstractC22433 = this.f55649;
        if (abstractC22433.isEmpty()) {
            int i = AbstractC23844.f77093;
            return C4275.f15410;
        }
        int i2 = C9548.f32245;
        return new C7098(abstractC22433, C1785.f6936);
    }

    public Object writeReplace() {
        return new C12555(this.f55649);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
