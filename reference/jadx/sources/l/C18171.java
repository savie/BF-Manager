package l;

/* JADX INFO: renamed from: l.ᩳܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6O1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18171 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42293(InterfaceC19761 interfaceC19761, InterfaceC19761 interfaceC19762) {
        if (interfaceC19761 == null || interfaceC19762 == null) {
            return false;
        }
        String text = interfaceC19761.getText();
        String text2 = interfaceC19762.getText();
        C1467 c1467 = new C1467(new C3894(C15489.m37076(text, text2)));
        c1467.m43805();
        InterfaceC19761 interfaceC19761NextToken = c1467.nextToken();
        if (interfaceC19761NextToken.getType() == interfaceC19761.getType() && interfaceC19761NextToken.mo22510() + 1 == text.length()) {
            InterfaceC19761 interfaceC19761NextToken2 = c1467.nextToken();
            if (interfaceC19761NextToken2.getType() == interfaceC19762.getType() && interfaceC19761NextToken2.mo22508() == text.length()) {
                if (interfaceC19761NextToken2.mo22510() + 1 == text2.length() + text.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
