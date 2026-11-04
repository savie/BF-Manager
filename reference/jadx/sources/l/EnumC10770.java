package l;

/* JADX INFO: renamed from: l.ۤۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10770 {
    lightInsertedColor(-4266306, -1706523, -5579094),
    lightRemovedColor(-2105377, -1052689, -3618616),
    lightChangedColor(-3483142, -1380099, -4666379),
    darkInsertedColor(-14072778, -14011089, -12291758),
    darkRemovedColor(-12039606, -13158601, -10129802),
    darkChangedColor(-13085328, -13616057, -12359283);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34190;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f34191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f34192;

    EnumC10770(int i, int i2, int i3) {
        this.f34190 = i;
        this.f34192 = i2;
        this.f34191 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10770 m27437(InterfaceC8966 interfaceC8966) {
        if (interfaceC8966.mo9807() == interfaceC8966.mo9796() && interfaceC8966.mo20528() == interfaceC8966.mo20522()) {
            return (EnumC10770) C3296.m10872(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC8966.mo9803() == interfaceC8966.mo9801() && interfaceC8966.mo20524() == interfaceC8966.mo20518()) {
            return (EnumC10770) C3296.m10872(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC10770) C3296.m10872(darkChangedColor, lightChangedColor);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10770 m27438(InterfaceC9711 interfaceC9711) {
        if (interfaceC9711.mo9807() == interfaceC9711.mo9796()) {
            return (EnumC10770) C3296.m10872(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC9711.mo9803() == interfaceC9711.mo9801()) {
            return (EnumC10770) C3296.m10872(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC10770) C3296.m10872(darkChangedColor, lightChangedColor);
    }
}
