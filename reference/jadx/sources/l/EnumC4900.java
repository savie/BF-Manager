package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4900 {
    BYTE(new C10184()),
    SHORT(new C2727()),
    INT(new C8693(0)),
    LONG(new C7202()),
    FLOAT(new C13913()),
    DOUBLE(new C6589(1)),
    CHAR(new C12117(1)),
    BOOLEAN(new C14305(1)),
    OBJECT(new C15753(1)),
    STRING(new C1236()),
    BOT(new C9438());


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Function f17122;

    EnumC4900(Function function) {
        this.f17122 = function;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 m15043(C14764 c14764) {
        return (AbstractC22664) this.f17122.apply(c14764);
    }
}
