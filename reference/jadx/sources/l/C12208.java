package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5NZ */
/* JADX INFO: loaded from: classes4.dex */
public class C12208 extends AbstractC19886 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7974 f40814;

    static {
        Pattern.compile(".*[^.]\\.\\.[^.].*");
        Pattern.compile(".*\\.\\.\\.\\s+\\.\\.\\..*");
    }

    public C12208(C7974 c7974, C0917 c0917) {
        super(c0917);
        this.f40814 = c7974;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m30313() {
        return this.f40814.f26190.m39848();
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7068(InterfaceC14242 interfaceC14242) {
        return ((InterfaceC16441) interfaceC14242).m38708(1);
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7067(int i, InterfaceC14242 interfaceC14242) {
        StringBuilder sb = new StringBuilder("<missing ");
        sb.append(C17926.f57215[i]);
        sb.append(">");
        throw null;
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object mo30314(InterfaceC14242 interfaceC14242, int i, C0129 c0129) throws C4445 {
        C4445 c4445 = new C4445((InterfaceC16441) interfaceC14242);
        c4445.f15834 = i;
        throw c4445;
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo30315(C22085 c22085, String[] strArr) {
        C23805 c23805Mo21036 = ((InterfaceC16441) c22085.f71535).mo21036();
        Object obj = c22085.f71536;
        c23805Mo21036.getClass();
        InterfaceC12913 interfaceC12913 = obj instanceof C18557 ? ((C18557) obj).f59042 : null;
        c22085.f71539 = interfaceC12913;
        if (interfaceC12913 == null) {
            Object obj2 = c22085.f71536;
            int type = obj2 == null ? 0 : ((InterfaceC19969) obj2).getType();
            Object obj3 = c22085.f71536;
            c22085.f71539 = new C12125(type, obj3 != null ? ((InterfaceC19969) obj3).getText() : null);
        }
        return super.mo30315(c22085, strArr);
    }
}
