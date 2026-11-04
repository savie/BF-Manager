package l;

import java.util.HashSet;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17271 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56261;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56262;

    public /* synthetic */ C17271(int i, Object obj) {
        this.f56261 = i;
        this.f56262 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f56261) {
            case 0:
                ((HashSet) this.f56262).addAll(((C24927) obj).m55566());
                break;
            case 1:
                InterfaceC11851 interfaceC11851 = (InterfaceC11851) obj;
                ((Map) this.f56262).put(interfaceC11851.mo1791(), interfaceC11851);
                break;
            default:
                C22628.m50974((C22628) this.f56262, (String) obj);
                break;
        }
    }
}
