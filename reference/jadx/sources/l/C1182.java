package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.֨۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1182 extends AbstractC25246 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C1182 f4320;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C1182 f4321;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f4322 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f4323;

    public C1182(AbstractC1928 abstractC1928) {
        this.f4323 = abstractC1928;
    }

    static {
        int i = AbstractC1928.f6477;
        f4320 = new C1182(C4867.f16966);
        f4321 = new C1182(AbstractC1928.of((Object) C2346.m7915()));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1182 m4355() {
        return f4320;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1182 m4356() {
        return f4321;
    }

    @Override // l.InterfaceC6821
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2346 mo4358(Integer num) {
        int iM19448 = C7104.m19448(this.f4323, new C24303(), new C3484(num), C0108.f1051, EnumC8595.f28097, EnumC7850.f26143);
        if (iM19448 == -1) {
            return null;
        }
        C2346 c2346 = (C2346) this.f4323.get(iM19448);
        if (c2346.m7918(num)) {
            return c2346;
        }
        return null;
    }

    @Override // l.InterfaceC6821
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set mo4357() {
        AbstractC1928 abstractC1928 = this.f4323;
        if (abstractC1928.isEmpty()) {
            int i = AbstractC8639.f28224;
            return C13070.f41806;
        }
        int i2 = C2346.f7567;
        return new C5613(abstractC1928, C9057.f29455);
    }

    public Object writeReplace() {
        return new C10130(this.f4323);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
