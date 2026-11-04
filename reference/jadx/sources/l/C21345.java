package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C21345 implements InterfaceC23583 {
    @Override // l.InterfaceC23583
    public EnumC16123 preVisitDirectory(Object obj, InterfaceC8665 interfaceC8665) {
        C17359.requireNonNull(obj);
        C17359.requireNonNull(interfaceC8665);
        return EnumC16123.CONTINUE;
    }

    @Override // l.InterfaceC23583
    public EnumC16123 visitFile(Object obj, InterfaceC8665 interfaceC8665) {
        C17359.requireNonNull(obj);
        C17359.requireNonNull(interfaceC8665);
        return EnumC16123.CONTINUE;
    }

    @Override // l.InterfaceC23583
    public EnumC16123 visitFileFailed(Object obj, IOException iOException) throws IOException {
        C17359.requireNonNull(obj);
        throw iOException;
    }

    @Override // l.InterfaceC23583
    public EnumC16123 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        C17359.requireNonNull(obj);
        if (iOException != null) {
            throw iOException;
        }
        return EnumC16123.CONTINUE;
    }
}
