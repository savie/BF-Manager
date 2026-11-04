package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10620 extends C21566 {
    public static final long serialVersionUID = 0;

    public C10620(C24550 c24550, final InterfaceC15976 interfaceC15976, final C17007 c17007, final C19991 c19991, C3163 c3163) {
        super(c24550, new Supplier() { // from class: l.᩷ۘ᩺
            @Override // java.util.function.Supplier
            public final Object get() {
                InterfaceC15976 interfaceC15977 = interfaceC15976;
                return c19991.m45980(interfaceC15977.mo10885() == EnumC17468.SOURCE ? "bad.source.file.header" : "bad.class.file.header", interfaceC15977, c17007);
            }
        }, c3163);
    }
}
