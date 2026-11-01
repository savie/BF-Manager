package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20604 {
    BYTE(new C21309()),
    SHORT(new C18487()),
    INT(new C3646(1)),
    LONG(new C7904()),
    FLOAT(new C19193()),
    DOUBLE(new C13030(1)),
    CHAR(new C8610()),
    BOOLEAN(new C10021(0)),
    OBJECT(new C7198()),
    STRING(new C17781()),
    BOT(new C22202(1));


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Function f67133;

    EnumC20604(Function function) {
        this.f67133 = function;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 m46479(C3836 c3836) {
        return (AbstractC16579) this.f67133.apply(c3836);
    }
}
