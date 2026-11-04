package l;

import android.view.MenuItem;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۙ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5256 implements InterfaceC21436, InterfaceC17544, InterfaceC22615 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18525;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18526;

    public /* synthetic */ C5256(int i, Object obj) {
        this.f18525 = i;
        this.f18526 = obj;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f18525) {
            case 1:
                C6094.m17595((C6094) this.f18526, menuItem);
                break;
            default:
                C25350.m56635((C25350) this.f18526, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        Type type = (Type) this.f18526;
        if (!(type instanceof ParameterizedType)) {
            throw new C8113("Invalid EnumSet type: " + type);
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C8113("Invalid EnumSet type: " + type);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC4115) this.f18526).mo13205((int) (i * 0.1f));
    }
}
