package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۬᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OARH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13411 extends C21877 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f44371;

    public C13411(AbstractC1415 abstractC1415, InterfaceC1623 interfaceC1623, int i) {
        super(abstractC1415, interfaceC1623, null);
        this.f44371 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f44371;
        if (i < 0 || i >= ((InterfaceC1623) m48664()).size()) {
            string = "";
        } else {
            String strMo5499 = ((InterfaceC1623) m48664()).mo5499(C22043.m48958(i, i));
            StringBuilder sb = new StringBuilder();
            for (char c : strMo5499.toCharArray()) {
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
