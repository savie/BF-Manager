package l;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩺ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes.dex */
public final class C24107 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24281 f77934;

    public C24107(C24281 c24281) {
        this.f77934 = c24281;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Type typeM18233 = c6446.m18233();
        Class clsM18232 = c6446.m18232();
        if (!Collection.class.isAssignableFrom(clsM18232)) {
            return null;
        }
        Type typeM21402 = C7872.m21402(clsM18232, typeM18233);
        return new C6207(new C7477(c24522, c24522.m54785(C6446.m18230(typeM21402)), typeM21402), this.f77934.m54297(c6446, false));
    }
}
