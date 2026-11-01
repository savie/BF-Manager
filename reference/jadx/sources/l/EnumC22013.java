package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R4FB */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22013 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f71369;

    EnumC22013(String str) {
        this.f71369 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22013 m48900(String str) throws IOException {
        EnumC22013 enumC22013 = HTTP_1_0;
        if (str.equals(enumC22013.f71369)) {
            return enumC22013;
        }
        EnumC22013 enumC22014 = HTTP_1_1;
        if (str.equals(enumC22014.f71369)) {
            return enumC22014;
        }
        EnumC22013 enumC22015 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC22015.f71369)) {
            return enumC22015;
        }
        EnumC22013 enumC22016 = HTTP_2;
        if (str.equals(enumC22016.f71369)) {
            return enumC22016;
        }
        EnumC22013 enumC22017 = SPDY_3;
        if (str.equals(enumC22017.f71369)) {
            return enumC22017;
        }
        EnumC22013 enumC22018 = QUIC;
        if (str.equals(enumC22018.f71369)) {
            return enumC22018;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f71369;
    }
}
