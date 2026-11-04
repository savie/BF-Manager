package l;

/* JADX INFO: renamed from: l.ܽᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17756 extends EnumC8806 {
    public /* synthetic */ C17756() {
        this("AfterDoctypeName", 53);
    }

    public C17756(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54677()) {
            c8260.m22267(this);
            c8260.f27169.f66992 = true;
            c8260.m22265();
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        if (c24448.m54671('\t', '\n', '\r', '\f', ' ')) {
            c24448.m54665();
            return;
        }
        if (c24448.m54686('>')) {
            c8260.m22265();
            c8260.m22258(EnumC8806.f28749);
            return;
        }
        if (c24448.m54670("PUBLIC")) {
            c8260.f27169.f66990 = "PUBLIC";
            c8260.m22269(EnumC8806.f28744);
        } else if (c24448.m54670("SYSTEM")) {
            c8260.f27169.f66990 = "SYSTEM";
            c8260.m22269(EnumC8806.f28693);
        } else {
            c8260.m22262(this);
            c8260.f27169.f66992 = true;
            c8260.m22258(EnumC8806.f28726);
        }
    }
}
