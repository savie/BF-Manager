package l;

/* JADX INFO: renamed from: l.۬᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final class C14199 extends C21345 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22163 f44880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24329 f44881;

    public C14199(C22163 c22163, InterfaceC24329 interfaceC24329) {
        this.f44880 = c22163;
        this.f44881 = interfaceC24329;
    }

    @Override // l.C21345, l.InterfaceC23583
    public final EnumC16123 preVisitDirectory(Object obj, InterfaceC8665 interfaceC8665) {
        InterfaceC24329 interfaceC24329 = (InterfaceC24329) obj;
        InterfaceC24329 fileName = interfaceC24329.getFileName();
        C22163 c22163 = this.f44880;
        if (C22163.m50125(c22163, fileName)) {
            c22163.f71380.put(new C5777(this.f44881.relativize(interfaceC24329).toString()), interfaceC24329);
            return EnumC16123.CONTINUE;
        }
        return EnumC16123.SKIP_SUBTREE;
    }
}
