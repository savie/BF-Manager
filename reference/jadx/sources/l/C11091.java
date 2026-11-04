package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11091 implements InterfaceC0817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23026 f34954;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f34955;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f34956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f34957;

    @Override // l.InterfaceC0817
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InputStream mo3286() {
        return C9765.m25437(this);
    }

    public C11091(C23026 c23026, ArrayList arrayList, InterfaceC2386 interfaceC2386, AbstractC22044 abstractC22044) {
        this.f34954 = c23026;
        this.f34957 = arrayList;
        this.f34955 = interfaceC2386;
        this.f34956 = abstractC22044;
    }

    @Override // l.InterfaceC0817
    public final InputStream getInputStream() throws IOException {
        ArrayList arrayList = this.f34957;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractC22044 abstractC22044 = this.f34956;
        if (zIsEmpty) {
            this.f34954.f74725.m12711(this.f34955, abstractC22044, false, (InterfaceC23711) new C22280());
        }
        InputStream inputStreamMo4290 = abstractC22044.mo4290();
        arrayList.add(inputStreamMo4290);
        return inputStreamMo4290;
    }

    @Override // l.InterfaceC0817
    public final long length() {
        return this.f34955.getSize();
    }
}
