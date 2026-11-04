package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76AL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11965 extends AbstractC6968 implements InterfaceC25392 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f38516;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38517;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f38518;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f38519;

    public C11965(String str, String str2, String str3, List list) {
        this.f38517 = str;
        this.f38519 = str2;
        this.f38518 = C23900.m53401(list);
        this.f38516 = str3;
    }

    public C11965(String str, String str2, AbstractC1928 abstractC1928) {
        this.f38517 = str;
        this.f38519 = str2;
        this.f38518 = abstractC1928 == null ? AbstractC1928.of() : abstractC1928;
        this.f38516 = "V";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11965 m29941(InterfaceC4859 interfaceC4859) {
        if (interfaceC4859 instanceof C11965) {
            return (C11965) interfaceC4859;
        }
        return new C11965(interfaceC4859.mo6804(), interfaceC4859.getName(), interfaceC4859.mo6802(), interfaceC4859.mo6805());
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ */
    public final String mo6804() {
        return this.f38517;
    }

    @Override // l.InterfaceC4859
    public final String getName() {
        return this.f38519;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ */
    public final List mo6805() {
        return this.f38518;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ */
    public final String mo6802() {
        return this.f38516;
    }
}
