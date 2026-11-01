package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L9I7 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19615 {
    PRIMITIVE(0),
    CONSTRUCTED(32);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f62968;

    EnumC19615(int i) {
        this.f62968 = i;
    }

    public int getValue() {
        return this.f62968;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19615 m44701(byte b) {
        if ((b & UTF8.S_CS3) == 0) {
            return PRIMITIVE;
        }
        return CONSTRUCTED;
    }
}
