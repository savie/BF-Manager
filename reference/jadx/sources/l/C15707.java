package l;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܳ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X8Y5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15707 extends AbstractC25405 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13470 f51035;

    public C15707(C13470 c13470) {
        this.f51035 = c13470;
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Collections.singleton("img");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C15707 m37499() {
        return new C15707(new C13470(AbstractC7899.m21439()));
    }

    @Override // l.AbstractC25405
    /* JADX INFO: renamed from: ۙ */
    public final Object mo17483(C10420 c10420, InterfaceC17045 interfaceC17045, InterfaceC13864 interfaceC13864) {
        InterfaceC16299 interfaceC16299Mo15471;
        String str = (String) interfaceC13864.attributes().get("src");
        if (TextUtils.isEmpty(str) || (interfaceC16299Mo15471 = c10420.m26736().mo15471(C1330.class)) == null) {
            return null;
        }
        c10420.m26737().getClass();
        C22179 c22179M33132 = this.f51035.m33132(interfaceC13864.attributes());
        AbstractC14215.f44933.m29674(interfaceC17045, str);
        AbstractC14215.f44935.m29674(interfaceC17045, c22179M33132);
        AbstractC14215.f44934.m29674(interfaceC17045, Boolean.FALSE);
        return interfaceC16299Mo15471.mo6845(c10420, interfaceC17045);
    }
}
