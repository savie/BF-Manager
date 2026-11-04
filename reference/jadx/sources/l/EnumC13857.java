package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۬۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9I7 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13857 {
    PRIMITIVE(0),
    CONSTRUCTED(32);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43967;

    EnumC13857(int i) {
        this.f43967 = i;
    }

    public int getValue() {
        return this.f43967;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13857 m33804(byte b) {
        if ((b & UTF8.S_CS3) == 0) {
            return PRIMITIVE;
        }
        return CONSTRUCTED;
    }
}
