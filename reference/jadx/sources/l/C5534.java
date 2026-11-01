package l;

/* JADX INFO: renamed from: l.ۚᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H401 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18960;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10474 f18961;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20414 f18962;

    public final String toString() {
        return "javac Messager";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15231(EnumC23921 enumC23921, String str) {
        C20414 c20414 = this.f18962;
        this.f18961.m26570().getClass();
        int i = C2711.f10423[enumC23921.ordinal()];
        if (i == 1) {
            this.f18960++;
            EnumC0264 enumC0264 = EnumC0264.API;
            String string = str.toString();
            C5909 c5909 = C23879.f77204;
            c20414.m48193(enumC0264, (InterfaceC12260) null, new C5909("compiler", "proc.messager", string));
            return;
        }
        if (i == 2) {
            String string2 = str.toString();
            C14065 c14065 = C9768.f32836;
            c20414.m48204((InterfaceC12260) null, new C14065("compiler", "proc.messager", string2));
        } else if (i == 3) {
            String string3 = str.toString();
            C14065 c14066 = C9768.f32836;
            c20414.m48200((InterfaceC12260) null, new C14065("compiler", "proc.messager", string3));
        } else {
            String string4 = str.toString();
            C9438 c9438 = C2005.f7500;
            c20414.m48198((AbstractC8774) null, new C9438("compiler", "proc.messager", string4));
        }
    }
}
