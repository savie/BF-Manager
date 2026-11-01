package l;

import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֫᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public class C2150 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final WeakReference f7819;

    public C2150(C22342 c22342) {
        this.f7819 = new WeakReference(c22342);
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            C22342 c22342 = (C22342) this.f7819.get();
            if (c22342 != null) {
                C22342.m49505(c22342);
            }
            interfaceC1423.getLifecycle().mo9172(this);
            return;
        }
        if (enumC1651 == EnumC1651.ON_RESUME) {
            C22342 c22343 = (C22342) this.f7819.get();
            if (c22343 == null) {
                interfaceC1423.getLifecycle().mo9172(this);
                return;
            }
            DialogInterfaceC19356 dialogInterfaceC19356 = c22343.f72938;
            if (!dialogInterfaceC19356.m44375()) {
                interfaceC1423.getLifecycle().mo9172(this);
                return;
            }
            dialogInterfaceC19356.m44373().setText((ActivityRecordService.m45() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector);
            ((ArrayList) c22343.f72942).clear();
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                ((ArrayList) c22343.f72942).addAll(linkedList);
            }
            c22343.f72941.notifyDataSetChanged();
        }
    }
}
