package l;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18900 extends AbstractC18194 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public PrintWriter f61182;

    @Override // l.AbstractC18194
    /* JADX INFO: renamed from: ܰ */
    public final String mo18528() {
        return "text-output stream";
    }

    public C18900(PrintWriter printWriter) {
        this.f61182 = new PrintWriter((Writer) printWriter, true);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ */
    public final void mo18527(String str) {
        this.f61182.println(str);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18524(String str) {
        this.f61182.print(str);
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ܰ */
    public final void mo18529(String str) {
        super.mo18529(str);
        this.f61182.flush();
    }

    @Override // l.InterfaceC10434
    public final void flush() {
        this.f61182.flush();
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo18523() {
        throw new C17344("Use EscapedPrintStreamOutput");
    }
}
