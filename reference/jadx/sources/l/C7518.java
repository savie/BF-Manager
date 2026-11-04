package l;

/* JADX INFO: renamed from: l.۟֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7518 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f24835;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f24836;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f24837;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f24838;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f24839;

    public C7518(InterfaceC12589 interfaceC12589) {
        String name = interfaceC12589.getName();
        this.f24837 = name.endsWith("/") ? C1402.m5124(1, 0, name) : name;
        this.f24836 = interfaceC12589.mo31100();
        boolean zIsDirectory = interfaceC12589.isDirectory();
        this.f24838 = zIsDirectory;
        this.f24835 = interfaceC12589.mo31098();
        this.f24839 = zIsDirectory ? -1L : interfaceC12589.length();
    }

    public C7518(C15174 c15174) {
        String strM36484 = c15174.m36484();
        this.f24837 = strM36484;
        this.f24836 = -1L;
        this.f24839 = -1L;
        this.f24838 = true;
        this.f24835 = strM36484.startsWith("$");
    }

    public C7518(C9055 c9055) {
        this.f24837 = c9055.m20655();
        this.f24839 = c9055.m24193();
        C23227 c23227M24191 = c9055.m24191();
        c23227M24191 = c23227M24191 == null ? c9055.m24190() : c23227M24191;
        this.f24836 = c23227M24191 != null ? c23227M24191.m52144() : -1L;
        long jM24192 = c9055.m24192();
        this.f24838 = C10961.m27794(jM24192, EnumC12038.FILE_ATTRIBUTE_DIRECTORY);
        this.f24835 = C10961.m27794(jM24192, EnumC12038.FILE_ATTRIBUTE_HIDDEN);
    }
}
