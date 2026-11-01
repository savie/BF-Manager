package l;

/* JADX INFO: renamed from: l.۬ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13194 extends C22085 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f43907;

    public C13194(InterfaceC14242 interfaceC14242, String str) {
        super(interfaceC14242);
        this.f43907 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return C22697.m50267(new StringBuilder(), this.f43907, " is an odexed instruction. You cannot reassemble a disassembled odex file unless it has been deodexed.");
    }
}
