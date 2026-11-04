package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8900 extends C6544 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29080;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C24564 f29081;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List[] f29082;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f29083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3177 f29084;

    @Override // l.InterfaceC2605
    /* JADX INFO: renamed from: ۙ */
    public final C12629 mo5195(String str, EnumC6161 enumC6161) {
        if (this.f29083 == null) {
            this.f29083 = new ArrayList(5);
        }
        C12629 c12629 = new C12629(str, enumC6161);
        this.f29083.add(c12629);
        return c12629;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2605 m23812(int i) {
        C3177 c3177 = this.f29084;
        if (this.f29082 == null) {
            this.f29082 = new List[c3177.m10375().length];
        }
        if (i >= this.f29082.length) {
            System.err.println("WARN: parameter out-of-range in " + c3177);
            return null;
        }
        return new C2934(this, i);
    }
}
