package l;

/* JADX INFO: renamed from: l.ܶۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4FX */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15874 {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51614;

    EnumC15874(int i) {
        this.f51614 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC15874 m37842(int i) {
        for (EnumC15874 enumC15874 : values()) {
            if (enumC15874.f51614 == i) {
                return enumC15874;
            }
        }
        return null;
    }
}
