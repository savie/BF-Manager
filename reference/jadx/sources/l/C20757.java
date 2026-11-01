package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes5.dex */
public final class C20757 extends AbstractC15175 {
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        int iMo21197 = c8057.mo21197();
        CharSequence charSequenceM29102 = c8057.getLine().m29102();
        if (c8057.mo21201() >= 4 || charSequenceM29102.charAt(iMo21197) != '<') {
            return null;
        }
        for (int i = 1; i <= 7; i++) {
            if (i != 7 || (!(((C17934) interfaceC18702).mo41744().mo1823() instanceof C15840) && !c8057.mo21200().mo28131())) {
                Pattern pattern = C15819.f51196[i][0];
                Pattern pattern2 = C15819.f51196[i][1];
                if (pattern.matcher(charSequenceM29102.subSequence(iMo21197, charSequenceM29102.length())).find()) {
                    C3822 c3822 = new C3822(new C15819(pattern2));
                    c3822.m11116(c8057.getIndex());
                    return c3822;
                }
            }
        }
        return null;
    }
}
