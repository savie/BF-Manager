package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11713 implements InterfaceC13911 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f39360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2539 f39361;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f39362;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f39363;

    @Override // l.InterfaceC13911
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo10545() {
        return C4737.m13105(this);
    }

    public C11713(C2539 c2539, ArrayList arrayList, InterfaceC2557 interfaceC2557, AbstractC20745 abstractC20745) {
        this.f39361 = c2539;
        this.f39360 = arrayList;
        this.f39362 = interfaceC2557;
        this.f39363 = abstractC20745;
    }

    @Override // l.InterfaceC13911
    public final InputStream getInputStream() throws IOException {
        ArrayList arrayList = this.f39360;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractC20745 abstractC20745 = this.f39363;
        if (zIsEmpty) {
            this.f39361.f10055.m19443(this.f39362, abstractC20745, false, (InterfaceC8978) new C13830());
        }
        InputStream inputStreamMo33970 = abstractC20745.mo33970();
        arrayList.add(inputStreamMo33970);
        return inputStreamMo33970;
    }

    @Override // l.InterfaceC13911
    public final long length() {
        return this.f39362.getSize();
    }
}
