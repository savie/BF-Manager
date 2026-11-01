package l;

import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.۠ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8015 implements InterfaceC7359, InterfaceC2149, InterfaceC3740, InterfaceC19782 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26270;

    public /* synthetic */ C8015(int i) {
        this.f26270 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21118(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21119(String str, int i, String str2, String str3, int i2) {
        return str + i + str2 + i2 + str3;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3560 mo6703(UUID uuid) {
        return C2584.m8039(uuid);
    }

    @Override // l.InterfaceC19782
    public void accept(Object obj) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f26270) {
            case 4:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new TreeMap();
    }
}
