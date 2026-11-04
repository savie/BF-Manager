package l;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.᩶ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6MN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21357 extends AbstractC16245 {
    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7349(C14007 c14007) {
        AbstractC4534 abstractC4534M14254 = c14007.m14254();
        if (abstractC4534M14254 instanceof C14974) {
            AbstractC4534 abstractC4534M14255 = abstractC4534M14254.m14254();
            if (abstractC4534M14255 instanceof C24672) {
                C24672 c24672 = (C24672) abstractC4534M14255;
                Matcher matcher = C18373.f59869.matcher(c24672.m55016());
                if (matcher.matches()) {
                    boolean z = true;
                    String strGroup = matcher.group(1);
                    if (!C17359.equals(strGroup, "X") && !C17359.equals(strGroup, "x")) {
                        z = false;
                    }
                    c14007.m14258(new C6441(z));
                    c24672.m55017(matcher.group(2));
                }
            }
        }
        mo32343(c14007);
    }
}
