package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19712 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f63281;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        final Set set = (Set) obj;
        if (c0309.mo12731()) {
            C0356.forEach(this.f63281.m52356(c0309), new Consumer() { // from class: l.ᩴ᩷ۤ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj2) {
                    ((AbstractC16579) obj2).mo1928(this.f61514, set);
                }
            });
            return null;
        }
        C0356.forEach(c0309.mo1943(), new Consumer() { // from class: l.۠᩷ۤ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj2) {
                ((AbstractC16579) obj2).mo1928(this.f29264, set);
            }
        });
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        c0350.f1774.mo1928(this, (Set) obj);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        return (Void) c8777.f30194.mo1928(this, (Set) obj);
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11014(C20771 c20771, Object obj) {
        Set set = (Set) obj;
        if (!set.add(c20771)) {
            return null;
        }
        c20771.mo18112().mo1928(this, set);
        c20771.f74536.mo1928(this, set);
        return null;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        Set set = (Set) obj;
        if ((c22929.f53222.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !set.add(c22929)) {
            return null;
        }
        c22929.mo18112().mo1928(this, set);
        return null;
    }

    public C19712(C23800 c23800) {
        this.f63281 = c23800;
    }
}
