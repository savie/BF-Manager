package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6E5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14440 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f45446;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f45447;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36013;
    }

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    public C14440(List list, HashMap map) {
        this.f45447 = list;
        this.f45446 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m34862(AbstractC1566 abstractC1566) {
        Map map = (Map) this.f45446.get(abstractC1566.mo5570());
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final String toString() {
        return "ClassTypeVarsAttr{" + this.f45447 + ", super maps: " + this.f45446 + '}';
    }
}
