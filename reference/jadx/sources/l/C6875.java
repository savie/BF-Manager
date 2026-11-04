package l;

import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6875 implements InterfaceC15736 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f22833;

    public C6875(PrintWriter printWriter) {
        this.f22833 = printWriter;
    }

    @Override // l.InterfaceC15736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19138(C24047 c24047) {
        PrintWriter printWriter = this.f22833;
        printWriter.print("exports ");
        printWriter.print(c24047.f77785.f44619);
        C14769 c14769 = c24047.f77786;
        List listUnmodifiableList = c14769 == null ? null : C4681.unmodifiableList(c14769);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C1170.stream(listUnmodifiableList).map(new C14359(5)).collect(C2025.joining(", ")));
        }
    }

    @Override // l.InterfaceC15736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19135(C14349 c14349) {
        PrintWriter printWriter = this.f22833;
        printWriter.print("opens ");
        printWriter.print(c14349.f45255.f44619);
        C14769 c14769 = c14349.f45256;
        List listUnmodifiableList = c14769 == null ? null : C4681.unmodifiableList(c14769);
        if (listUnmodifiableList != null) {
            printWriter.print(" to ");
            printWriter.print((String) C1170.stream(listUnmodifiableList).map(new C14359(5)).collect(C2025.joining(", ")));
        }
    }

    @Override // l.InterfaceC15736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19136(C18079 c18079) {
        PrintWriter printWriter = this.f22833;
        printWriter.print("provides ");
        printWriter.print(c18079.f59179.f79577);
        printWriter.print(" with ");
        printWriter.print((String) C1170.stream(c18079.f59178).map(new C14359(5)).collect(C2025.joining(", ")));
    }

    @Override // l.InterfaceC15736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19134(C0180 c0180) {
        PrintWriter printWriter = this.f22833;
        printWriter.print("requires ");
        Set set = c0180.f1261;
        if (set.contains(EnumC7638.STATIC_PHASE)) {
            printWriter.print("static ");
        }
        if (set.contains(EnumC7638.TRANSITIVE)) {
            printWriter.print("transitive ");
        }
        printWriter.print(c0180.f1262.f38072);
    }

    @Override // l.InterfaceC15736
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19137(C18825 c18825) {
        PrintWriter printWriter = this.f22833;
        printWriter.print("uses ");
        printWriter.print(c18825.f61181.f79577);
    }
}
