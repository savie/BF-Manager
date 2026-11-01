package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۧۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10744 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36639;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f36640;

    public C10744(InterfaceC2916 interfaceC2916, int i) {
        this.f36640 = interfaceC2916;
        this.f36639 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27039() throws EOFException {
        while (true) {
            int i = this.f36639;
            InterfaceC2916 interfaceC2916 = this.f36640;
            if (i < interfaceC2916.length()) {
                char cCharAt = interfaceC2916.charAt(this.f36639);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                    return;
                } else {
                    this.f36639++;
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27040(String str) throws EOFException {
        while (true) {
            int i = this.f36639;
            InterfaceC2916 interfaceC2916 = this.f36640;
            if (i < interfaceC2916.length()) {
                if (str.indexOf(interfaceC2916.charAt(this.f36639)) != -1) {
                    return;
                } else {
                    this.f36639++;
                }
            } else {
                throw new EOFException();
            }
        }
    }
}
