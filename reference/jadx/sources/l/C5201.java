package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5201 extends C17133 {
    @Override // l.C17133, l.InterfaceC23847
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo15624(C9444 c9444) throws C2218 {
        if (c9444.m24819() && c9444.m24820() != 206) {
            try {
                c9444.close();
            } catch (Exception unused) {
            }
            throw new C2218("The server does not support range requests");
        }
        return super.mo15624(c9444);
    }
}
