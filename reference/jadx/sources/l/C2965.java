package l;

/* JADX INFO: renamed from: l.ۖ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D6O1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2965 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9658(InterfaceC8743 interfaceC8743, InterfaceC8743 interfaceC8744) {
        if (interfaceC8743 == null || interfaceC8744 == null) {
            return false;
        }
        String text = interfaceC8743.getText();
        String text2 = interfaceC8744.getText();
        C23849 c23849 = new C23849(new C18870(C14483.m34972(text, text2)));
        c23849.m24869();
        InterfaceC8743 interfaceC8743NextToken = c23849.nextToken();
        if (interfaceC8743NextToken.getType() == interfaceC8743.getType() && interfaceC8743NextToken.mo23440() + 1 == text.length()) {
            InterfaceC8743 interfaceC8743NextToken2 = c23849.nextToken();
            if (interfaceC8743NextToken2.getType() == interfaceC8744.getType() && interfaceC8743NextToken2.mo23442() == text.length()) {
                if (interfaceC8743NextToken2.mo23440() + 1 == text2.length() + text.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
