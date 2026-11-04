package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܽ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58480;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19106 f58481;

    public C17824(InterfaceC19106 interfaceC19106, int i) {
        this.f58481 = interfaceC19106;
        this.f58480 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41668() throws EOFException {
        while (true) {
            int i = this.f58480;
            InterfaceC19106 interfaceC19106 = this.f58481;
            if (i < interfaceC19106.length()) {
                char cCharAt = interfaceC19106.charAt(this.f58480);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                    return;
                } else {
                    this.f58480++;
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41669(String str) throws EOFException {
        while (true) {
            int i = this.f58480;
            InterfaceC19106 interfaceC19106 = this.f58481;
            if (i < interfaceC19106.length()) {
                if (str.indexOf(interfaceC19106.charAt(this.f58480)) != -1) {
                    return;
                } else {
                    this.f58480++;
                }
            } else {
                throw new EOFException();
            }
        }
    }
}
