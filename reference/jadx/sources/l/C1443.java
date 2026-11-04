package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1443 implements InterfaceC2605 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5057;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f5058;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f5059;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23315 f5060;

    @Override // l.InterfaceC2605
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12629 mo5195(String str, EnumC6161 enumC6161) {
        if (this.f5059 == null) {
            this.f5059 = new ArrayList(5);
        }
        C12629 c12629 = new C12629(str, enumC6161);
        this.f5059.add(c12629);
        return c12629;
    }
}
