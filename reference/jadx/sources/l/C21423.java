package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩶ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OARH */
/* JADX INFO: loaded from: classes2.dex */
public final class C21423 extends C10234 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f68236;

    public C21423(AbstractC14709 abstractC14709, InterfaceC17693 interfaceC17693, int i) {
        super(abstractC14709, interfaceC17693, null);
        this.f68236 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f68236;
        if (i < 0 || i >= ((InterfaceC17693) m26372()).size()) {
            string = "";
        } else {
            String strMo19728 = ((InterfaceC17693) m26372()).mo19728(C4467.m14163(i, i));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo19728.toCharArray()) {
                if (c == '\t') {
                    sb.append("\\t");
                } else if (c == '\n') {
                    sb.append("\\n");
                } else if (c == '\r') {
                    sb.append("\\r");
                } else {
                    sb.append(c);
                }
            }
            string = sb.toString();
        }
        Locale.getDefault();
        return "LexerNoViableAltException('" + string + "')";
    }
}
