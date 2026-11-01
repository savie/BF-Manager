package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C15091 implements InterfaceC2389 {
    @Override // l.InterfaceC2389
    public EnumC11563 preVisitDirectory(Object obj, InterfaceC20735 interfaceC20735) {
        C13638.requireNonNull(obj);
        C13638.requireNonNull(interfaceC20735);
        return EnumC11563.CONTINUE;
    }

    @Override // l.InterfaceC2389
    public EnumC11563 visitFile(Object obj, InterfaceC20735 interfaceC20735) {
        C13638.requireNonNull(obj);
        C13638.requireNonNull(interfaceC20735);
        return EnumC11563.CONTINUE;
    }

    @Override // l.InterfaceC2389
    public EnumC11563 visitFileFailed(Object obj, IOException iOException) throws IOException {
        C13638.requireNonNull(obj);
        throw iOException;
    }

    @Override // l.InterfaceC2389
    public EnumC11563 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        C13638.requireNonNull(obj);
        if (iOException != null) {
            throw iOException;
        }
        return EnumC11563.CONTINUE;
    }
}
