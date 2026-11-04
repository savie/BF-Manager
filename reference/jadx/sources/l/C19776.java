package l;

import org.xml.sax.SAXParseException;

/* JADX INFO: renamed from: l.ᩴۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15XV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19776 implements InterfaceC22760, InterfaceC5203 {
    @Override // l.InterfaceC5203
    /* JADX INFO: renamed from: ۙ */
    public void mo6415(CharSequence charSequence, C13406 c13406, C11228 c11228) {
        String string = charSequence.toString();
        C8450 c8450 = new C8450();
        if (c13406.m33049()) {
            c8450.m22635();
        } else {
            c8450.m22634(Integer.valueOf(c13406.m33047()));
        }
        if (c13406.m33048()) {
            c8450.m22637();
        }
        try {
            c11228.append((CharSequence) new C2484(c8450).m8343(string));
        } catch (IllegalArgumentException e) {
            if (c13406.m33048()) {
                Throwable cause = e.getCause();
                if (cause instanceof SAXParseException) {
                    SAXParseException sAXParseException = (SAXParseException) cause;
                    throw new C5949(sAXParseException.getLineNumber(), sAXParseException.getColumnNumber(), sAXParseException.getMessage());
                }
            }
            throw e;
        }
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        int iM34627 = ((C14270) c19929.m45858()).m34627();
        byte[] bArr = (byte[]) ((C14270) c19929.m45858()).m34634();
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ iM34627);
        }
    }
}
