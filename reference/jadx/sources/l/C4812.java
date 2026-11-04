package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4812 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f16841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f16842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashSet f16843;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f16844;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC20820 f16845;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f16846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7312 f16847;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC14023 f16848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC19876 f16849;

    public C4812(C7312 c7312, EnumC20820 enumC20820, boolean z, String str, EnumC19876 enumC19876) {
        this.f16847 = c7312;
        this.f16845 = enumC20820;
        this.f16841 = z;
        this.f16846 = str;
        this.f16849 = enumC19876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14840(InterfaceC5075 interfaceC5075, C25213 c25213) {
        C7312 c7312 = this.f16847;
        InterfaceC15976 interfaceC15976M20046 = c7312.m20046();
        if (this.f16841) {
            if (this.f16843 == null) {
                this.f16843 = new HashSet();
            }
            if (c7312.f24083 >= c7312.f24082) {
                EnumC14023 enumC14023 = this.f16848;
                if (enumC14023 == null) {
                    if (this.f16843.contains(interfaceC15976M20046)) {
                        this.f16848 = EnumC14023.ADDITIONAL_IN_FILE;
                    } else {
                        this.f16848 = EnumC14023.IN_FILE;
                    }
                    this.f16844 = interfaceC15976M20046;
                    this.f16842 = interfaceC15976M20046;
                    return;
                }
                if ((enumC14023 == EnumC14023.IN_FILE || enumC14023 == EnumC14023.ADDITIONAL_IN_FILE) && !C17359.equals(this.f16844, interfaceC15976M20046)) {
                    this.f16848 = EnumC14023.ADDITIONAL_IN_FILES;
                    this.f16842 = null;
                    return;
                }
                return;
            }
            c7312.m34527(this.f16849, interfaceC5075, c25213);
            this.f16843.add(interfaceC15976M20046);
            return;
        }
        EnumC14023 enumC14024 = this.f16848;
        if (enumC14024 == null) {
            this.f16848 = EnumC14023.IN_FILE;
            this.f16844 = interfaceC15976M20046;
            this.f16842 = interfaceC15976M20046;
        } else {
            if (enumC14024 != EnumC14023.IN_FILE || C17359.equals(this.f16844, interfaceC15976M20046)) {
                return;
            }
            this.f16848 = EnumC14023.IN_FILES;
            this.f16842 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14839() {
        EnumC14023 enumC14023 = this.f16848;
        if (enumC14023 != null) {
            InterfaceC15976 interfaceC15976 = this.f16842;
            EnumC20820 enumC20820 = this.f16845;
            String str = this.f16846;
            if (interfaceC15976 == null) {
                if (enumC20820 != null) {
                    m14838(this.f16844, enumC14023.m34151(str), enumC20820);
                } else {
                    m14838(this.f16844, enumC14023.m34151(str), new Object[0]);
                }
            } else if (enumC20820 != null) {
                m14838(this.f16844, enumC14023.m34151(str), this.f16842, enumC20820);
            } else {
                m14838(this.f16844, enumC14023.m34151(str), this.f16842);
            }
            if (this.f16841) {
                return;
            }
            m14838(this.f16844, str.concat(".recompile"), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14838(InterfaceC15976 interfaceC15976, String str, Object... objArr) {
        this.f16847.m34526(interfaceC15976, new C5821("compiler", str, objArr));
    }
}
