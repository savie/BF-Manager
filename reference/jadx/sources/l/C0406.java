package l;

/* JADX INFO: renamed from: l.֡ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0406 extends C4511 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f1951;

    public C0406(InterfaceC17189 interfaceC17189, String str) {
        super(interfaceC17189);
        this.f1951 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return C8947.m23910(new StringBuilder(), this.f1951, " is an odexed instruction. You cannot reassemble a disassembled odex file unless it has been deodexed.");
    }
}
