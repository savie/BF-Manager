package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܽۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AV8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16417 implements InterfaceC11747 {
    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        if ((c13158.f43818 & EnumC3984.WriteEnumUsingToString.f14811) != 0) {
            String string = ((Enum) obj).toString();
            if ((c13158.f43818 & EnumC3984.UseSingleQuotes.f14811) != 0) {
                c13158.m32536(string);
                return;
            } else {
                c13158.m32532(string, (char) 0, false);
                return;
            }
        }
        c13158.writeInt(((Enum) obj).ordinal());
    }
}
