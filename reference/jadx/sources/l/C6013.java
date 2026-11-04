package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۚ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G8XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6013 extends AbstractC25405 {
    @Override // l.AbstractC25405
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo17483(C10420 c10420, InterfaceC17045 interfaceC17045, InterfaceC13864 interfaceC13864) {
        InterfaceC16299 interfaceC16299Mo15471;
        String str = (String) interfaceC13864.attributes().get("href");
        if (TextUtils.isEmpty(str) || (interfaceC16299Mo15471 = c10420.m26736().mo15471(C2821.class)) == null) {
            return null;
        }
        AbstractC22881.f74346.m29674(interfaceC17045, str);
        return interfaceC16299Mo15471.mo6845(c10420, interfaceC17045);
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Collections.singleton(am.av);
    }
}
