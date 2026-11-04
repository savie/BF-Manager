package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۙܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5009 extends C21345 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22163 f17384;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18499 f17385;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f17386;

    public C5009(C22163 c22163, Set set, C18499 c18499) {
        this.f17384 = c22163;
        this.f17386 = set;
        this.f17385 = c18499;
    }

    @Override // l.C21345, l.InterfaceC23583
    public final EnumC16123 preVisitDirectory(Object obj, InterfaceC8665 interfaceC8665) {
        if (C22163.m50125(this.f17384, ((InterfaceC24329) obj).getFileName())) {
            return EnumC16123.CONTINUE;
        }
        return EnumC16123.SKIP_SUBTREE;
    }

    @Override // l.C21345, l.InterfaceC23583
    public final EnumC16123 visitFile(Object obj, InterfaceC8665 interfaceC8665) {
        InterfaceC24329 interfaceC24329 = (InterfaceC24329) obj;
        if (interfaceC8665.isRegularFile()) {
            if (this.f17386.contains(AbstractC24643.m54974(interfaceC24329.getFileName().toString()))) {
                C22163 c22163 = this.f17384;
                C2026 c2026 = c22163.f71382;
                InterfaceC24329 interfaceC243210 = c22163.f71379;
                int i = AbstractC13234.f42297;
                this.f17385.m43089(new C19947(c2026, interfaceC24329, interfaceC243210, 0));
            }
        }
        return EnumC16123.CONTINUE;
    }
}
