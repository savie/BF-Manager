package l;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩶᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20432 extends C22444 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66238;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC21032 f66239;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f66240;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11260 f66241;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20432(AbstractServiceC21032 abstractServiceC21032, Object obj, C11260 c11260, String str, Bundle bundle) {
        super(obj);
        this.f66239 = abstractServiceC21032;
        this.f66241 = c11260;
        this.f66238 = str;
        this.f66240 = bundle;
    }

    @Override // l.C22444
    /* JADX INFO: renamed from: ۖ */
    public final void mo3032() {
        Bundle bundle = this.f66240;
        C21445 c21445 = this.f66239.f68499;
        C11260 c11260 = this.f66241;
        InterfaceC9039 interfaceC9039 = c11260.f38063;
        if (c21445.getOrDefault(((C10450) interfaceC9039).f35674.getBinder(), null) != c11260) {
            int i = AbstractServiceC21032.f68496;
            return;
        }
        if ((m49803() & 1) != 0) {
            int i2 = AbstractServiceC21032.f68496;
        }
        try {
            ((C10450) interfaceC9039).m26397(this.f66238, null, bundle);
        } catch (RemoteException unused) {
        }
    }
}
