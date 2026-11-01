package l;

/* JADX INFO: renamed from: l.۫ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12214 {
    lightInsertedColor(-4266306, -1706523, -5579094),
    lightRemovedColor(-2105377, -1052689, -3618616),
    lightChangedColor(-3483142, -1380099, -4666379),
    darkInsertedColor(-14072778, -14011089, -12291758),
    darkRemovedColor(-12039606, -13158601, -10129802),
    darkChangedColor(-13085328, -13616057, -12359283);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40825;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f40826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40827;

    EnumC12214(int i, int i2, int i3) {
        this.f40826 = i;
        this.f40827 = i2;
        this.f40825 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12214 m30320(InterfaceC19759 interfaceC19759) {
        if (interfaceC19759.mo22124() == interfaceC19759.mo22126() && interfaceC19759.mo23602() == interfaceC19759.mo23600()) {
            return (EnumC12214) C20368.m45984(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC19759.mo22129() == interfaceC19759.mo22123() && interfaceC19759.mo23598() == interfaceC19759.mo23594()) {
            return (EnumC12214) C20368.m45984(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC12214) C20368.m45984(darkChangedColor, lightChangedColor);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12214 m30319(InterfaceC19053 interfaceC19053) {
        if (interfaceC19053.mo22124() == interfaceC19053.mo22126()) {
            return (EnumC12214) C20368.m45984(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC19053.mo22129() == interfaceC19053.mo22123()) {
            return (EnumC12214) C20368.m45984(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC12214) C20368.m45984(darkChangedColor, lightChangedColor);
    }
}
