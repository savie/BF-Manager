package l;

/* JADX INFO: renamed from: l.ۢۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B4FX */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9365 {
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


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f31735;

    EnumC9365(int i) {
        this.f31735 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9365 m24012(int i) {
        for (EnumC9365 enumC9365 : values()) {
            if (enumC9365.f31735 == i) {
                return enumC9365;
            }
        }
        return null;
    }
}
