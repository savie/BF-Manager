package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4FB */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4225 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f15417;

    EnumC4225(String str) {
        this.f15417 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4225 m13485(String str) throws IOException {
        EnumC4225 enumC4225 = HTTP_1_0;
        if (str.equals(enumC4225.f15417)) {
            return enumC4225;
        }
        EnumC4225 enumC4226 = HTTP_1_1;
        if (str.equals(enumC4226.f15417)) {
            return enumC4226;
        }
        EnumC4225 enumC4227 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC4227.f15417)) {
            return enumC4227;
        }
        EnumC4225 enumC4228 = HTTP_2;
        if (str.equals(enumC4228.f15417)) {
            return enumC4228;
        }
        EnumC4225 enumC4229 = SPDY_3;
        if (str.equals(enumC4229.f15417)) {
            return enumC4229;
        }
        EnumC4225 enumC42210 = QUIC;
        if (str.equals(enumC42210.f15417)) {
            return enumC42210;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15417;
    }
}
