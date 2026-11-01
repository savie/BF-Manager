package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܺ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16168 extends C9818 {
    @Override // l.C9818, l.InterfaceC13472
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo6552(C18485 c18485) throws C23929 {
        if (c18485.m42863() && c18485.m42858() != 206) {
            try {
                c18485.close();
            } catch (Exception unused) {
            }
            throw new C23929("The server does not support range requests");
        }
        return super.mo6552(c18485);
    }
}
