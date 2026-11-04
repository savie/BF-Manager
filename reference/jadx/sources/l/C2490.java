package l;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۖۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2490 extends AbstractC9201 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public PrintWriter f7987;

    @Override // l.AbstractC9201
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3882() {
        return "text-output stream";
    }

    public C2490(PrintWriter printWriter) {
        this.f7987 = new PrintWriter((Writer) printWriter, true);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۤ */
    public final void mo3881(String str) {
        this.f7987.println(str);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3879(String str) {
        this.f7987.print(str);
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3883(String str) {
        super.mo3883(str);
        this.f7987.flush();
    }

    @Override // l.InterfaceC13676
    public final void flush() {
        this.f7987.flush();
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo3876() {
        throw new C11439("Use EscapedPrintStreamOutput");
    }
}
