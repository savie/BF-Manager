package l;

import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes.dex */
public final class C23886 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24281 f77357;

    public C23886(C24281 c24281) {
        this.f77357 = c24281;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        AbstractC17567 abstractC17567M54785;
        Type typeM18233 = c6446.m18233();
        Class clsM18232 = c6446.m18232();
        if (!Map.class.isAssignableFrom(clsM18232)) {
            return null;
        }
        Type[] typeArrM21411 = C7872.m21411(clsM18232, typeM18233);
        Type type = typeArrM21411[0];
        Type type2 = typeArrM21411[1];
        if (type == Boolean.TYPE || type == Boolean.class) {
            abstractC17567M54785 = C22854.f74251;
        } else {
            abstractC17567M54785 = c24522.m54785(C6446.m18230(type));
        }
        return new C16426(this, new C7477(c24522, abstractC17567M54785, type), new C7477(c24522, c24522.m54785(C6446.m18230(type2)), type2), this.f77357.m54297(c6446, false));
    }
}
