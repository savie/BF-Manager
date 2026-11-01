package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16886 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC11909 f54000;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC0597 f54001;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f54002;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f54003;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20414 f54004;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f54005;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashSet f54006;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC0657 f54007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f54008;

    public C16886(C20414 c20414, EnumC11909 enumC11909, boolean z, String str, EnumC0597 enumC0597) {
        this.f54004 = c20414;
        this.f54000 = enumC11909;
        this.f54002 = z;
        this.f54008 = str;
        this.f54001 = enumC0597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39552(InterfaceC12260 interfaceC12260, C14065 c14065) {
        C20414 c20414 = this.f54004;
        InterfaceC2173 interfaceC2173M46184 = c20414.m46184();
        if (this.f54002) {
            if (this.f54006 == null) {
                this.f54006 = new HashSet();
            }
            if (c20414.f66179 >= c20414.f66168) {
                EnumC0657 enumC0657 = this.f54007;
                if (enumC0657 == null) {
                    if (this.f54006.contains(interfaceC2173M46184)) {
                        this.f54007 = EnumC0657.ADDITIONAL_IN_FILE;
                    } else {
                        this.f54007 = EnumC0657.IN_FILE;
                    }
                    this.f54005 = interfaceC2173M46184;
                    this.f54003 = interfaceC2173M46184;
                    return;
                }
                if ((enumC0657 == EnumC0657.IN_FILE || enumC0657 == EnumC0657.ADDITIONAL_IN_FILE) && !C13638.equals(this.f54005, interfaceC2173M46184)) {
                    this.f54007 = EnumC0657.ADDITIONAL_IN_FILES;
                    this.f54003 = null;
                    return;
                }
                return;
            }
            c20414.m48194(this.f54001, interfaceC12260, c14065);
            this.f54006.add(interfaceC2173M46184);
            return;
        }
        EnumC0657 enumC0658 = this.f54007;
        if (enumC0658 == null) {
            this.f54007 = EnumC0657.IN_FILE;
            this.f54005 = interfaceC2173M46184;
            this.f54003 = interfaceC2173M46184;
        } else {
            if (enumC0658 != EnumC0657.IN_FILE || C13638.equals(this.f54005, interfaceC2173M46184)) {
                return;
            }
            this.f54007 = EnumC0657.IN_FILES;
            this.f54003 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39551() {
        EnumC0657 enumC0657 = this.f54007;
        if (enumC0657 != null) {
            InterfaceC2173 interfaceC2173 = this.f54003;
            EnumC11909 enumC11909 = this.f54000;
            String str = this.f54008;
            if (interfaceC2173 == null) {
                if (enumC11909 != null) {
                    m39550(this.f54005, enumC0657.m2986(str), enumC11909);
                } else {
                    m39550(this.f54005, enumC0657.m2986(str), new Object[0]);
                }
            } else if (enumC11909 != null) {
                m39550(this.f54005, enumC0657.m2986(str), this.f54003, enumC11909);
            } else {
                m39550(this.f54005, enumC0657.m2986(str), this.f54003);
            }
            if (this.f54002) {
                return;
            }
            m39550(this.f54005, str.concat(".recompile"), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39550(InterfaceC2173 interfaceC2173, String str, Object... objArr) {
        this.f54004.m48196(interfaceC2173, new C9438("compiler", str, objArr));
    }
}
