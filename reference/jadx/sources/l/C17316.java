package l;

/* JADX INFO: renamed from: l.ܽۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H401 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17316 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56401;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18808 f56402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7312 f56403;

    public final String toString() {
        return "javac Messager";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40667(EnumC15230 enumC15230, String str) {
        C7312 c7312 = this.f56403;
        this.f56402.m43648().getClass();
        int i = C16570.f53639[enumC15230.ordinal()];
        if (i == 1) {
            this.f56401++;
            EnumC6984 enumC6984 = EnumC6984.API;
            String string = str.toString();
            C11040 c11040 = C22843.f74058;
            c7312.m34523(enumC6984, (InterfaceC5075) null, new C11040("compiler", "proc.messager", string));
            return;
        }
        if (i == 2) {
            String string2 = str.toString();
            C25213 c25213 = C13146.f42046;
            c7312.m34531((InterfaceC5075) null, new C25213("compiler", "proc.messager", string2));
        } else if (i == 3) {
            String string3 = str.toString();
            C25213 c25214 = C13146.f42046;
            c7312.m34521((InterfaceC5075) null, new C25213("compiler", "proc.messager", string3));
        } else {
            String string4 = str.toString();
            C5821 c5821 = C15383.f50165;
            c7312.m34524((AbstractC8036) null, new C5821("compiler", "proc.messager", string4));
        }
    }
}
