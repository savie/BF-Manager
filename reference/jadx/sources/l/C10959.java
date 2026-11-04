package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۤܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10959 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        if ((c12915.m31986("local") || c12915.m31986(b.k)) && !c12915.m31988() && c12915.m31981() == 2) {
            return c12915.m31977() || c12915.m31984();
        }
        return false;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        ArrayList arrayList = new ArrayList(c12915.m31982());
        if (arrayList.size() != 2) {
            return;
        }
        if (c12915.m31986("local")) {
            try {
                C6265.m17912(c12915.m31976(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                ArrayList arrayList2 = new ArrayList(2);
                AbstractC22044 abstractC22044Mo8093 = ((InterfaceC2386) arrayList.get(0)).mo8093();
                AbstractC22044 abstractC22044Mo8094 = ((InterfaceC2386) arrayList.get(1)).mo8093();
                AbstractC22044 abstractC22044M49862 = abstractC22044Mo8093.m49862(".tmp");
                if (abstractC22044Mo8093.mo4301(abstractC22044M49862)) {
                    arrayList2.add(abstractC22044M49862.getName());
                    if (abstractC22044Mo8094.mo4301(abstractC22044Mo8093)) {
                        arrayList2.add(abstractC22044Mo8093.getName());
                        if (abstractC22044M49862.mo4301(abstractC22044Mo8094)) {
                            arrayList2.add(abstractC22044Mo8094.getName());
                            arrayList2.remove(abstractC22044M49862.getName());
                            int i = C20108.f64607;
                            C20108.m46233(abstractC22044Mo8093.mo4294(), true);
                            C20108.m46233(abstractC22044Mo8094.mo4294(), true);
                        } else if (abstractC22044Mo8093.mo4301(abstractC22044Mo8094)) {
                            arrayList2.remove(abstractC22044Mo8093.getName());
                            if (abstractC22044M49862.mo4301(abstractC22044Mo8093)) {
                                arrayList2.remove(abstractC22044M49862.getName());
                            }
                        }
                    } else if (abstractC22044M49862.mo4301(abstractC22044Mo8093)) {
                        arrayList2.remove(abstractC22044M49862.getName());
                    }
                    C22673.m51152(R.string.MT_Protector);
                } else {
                    C22673.m51152(R.string.MT_Protector);
                }
                if (!arrayList2.isEmpty()) {
                    c12915.m31983().m23209();
                    c12915.m31983().m23176((Collection) arrayList2);
                    c12915.m31973();
                }
                C6331.m18055();
                return;
            } catch (C4866 e) {
                c12915.m31979().m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (c12915.m31986(b.k)) {
            new C22148(this, c12915, (AbstractC18881) c12915.m31987().mo10174(), arrayList).m8197();
        }
    }
}
