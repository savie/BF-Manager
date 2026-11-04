package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5NZ */
/* JADX INFO: loaded from: classes4.dex */
public class C13218 extends AbstractC23157 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3019 f42196;

    static {
        Pattern.compile(".*[^.]\\.\\.[^.].*");
        Pattern.compile(".*\\.\\.\\.\\s+\\.\\.\\..*");
    }

    public C13218(C3019 c3019, C14951 c14951) {
        super(c14951);
        this.f42196 = c3019;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m32752() {
        return this.f42196.f9799.m17442();
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18850(InterfaceC17189 interfaceC17189) {
        return ((InterfaceC15455) interfaceC17189).m37009(1);
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18849(int i, InterfaceC17189 interfaceC17189) {
        StringBuilder sb = new StringBuilder("<missing ");
        sb.append(C2708.f8861[i]);
        sb.append(">");
        throw null;
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo32753(InterfaceC17189 interfaceC17189, int i, C20173 c20173) throws C3765 {
        C3765 c3765 = new C3765((InterfaceC15455) interfaceC17189);
        c3765.f12886 = i;
        throw c3765;
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ᩷ */
    public String mo9001(C4511 c4511, String[] strArr) {
        C17370 c17370Mo9831 = ((InterfaceC15455) c4511.f16096).mo9831();
        Object obj = c4511.f16094;
        c17370Mo9831.getClass();
        InterfaceC21665 interfaceC21665 = obj instanceof C9730 ? ((C9730) obj).f31384 : null;
        c4511.f16097 = interfaceC21665;
        if (interfaceC21665 == null) {
            Object obj2 = c4511.f16094;
            int type = obj2 == null ? 0 : ((InterfaceC22915) obj2).getType();
            Object obj3 = c4511.f16094;
            c4511.f16097 = new C13460(type, obj3 != null ? ((InterfaceC22915) obj3).getText() : null);
        }
        return super.mo9001(c4511, strArr);
    }
}
