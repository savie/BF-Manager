package l;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.֫ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2049 extends C8015 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f6811;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6812;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23678 f6813;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13191 f6814;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2049(AbstractServiceC13191 abstractServiceC13191, Object obj, C23678 c23678, String str, Bundle bundle) {
        super(obj);
        this.f6814 = abstractServiceC13191;
        this.f6813 = c23678;
        this.f6812 = str;
        this.f6811 = bundle;
    }

    @Override // l.C8015
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo7060() {
        Bundle bundle = this.f6811;
        C14307 c14307 = this.f6814.f42128;
        C23678 c23678 = this.f6813;
        InterfaceC22888 interfaceC22888 = c23678.f76776;
        if (c14307.get(((C19904) interfaceC22888).f64055.getBinder()) != c23678) {
            int i = AbstractServiceC13191.f42125;
            return;
        }
        if ((m21879() & 1) != 0) {
            int i2 = AbstractServiceC13191.f42125;
        }
        try {
            ((C19904) interfaceC22888).m45832(this.f6812, null, bundle);
        } catch (RemoteException unused) {
        }
    }
}
