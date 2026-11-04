package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.֡᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AV8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0742 implements InterfaceC10591 {
    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        if ((c5372.f18847 & EnumC1643.WriteEnumUsingToString.f5702) != 0) {
            String string = ((Enum) obj).toString();
            if ((c5372.f18847 & EnumC1643.UseSingleQuotes.f5702) != 0) {
                c5372.m16052(string);
                return;
            } else {
                c5372.m16048(string, (char) 0, false);
                return;
            }
        }
        c5372.writeInt(((Enum) obj).ordinal());
    }
}
