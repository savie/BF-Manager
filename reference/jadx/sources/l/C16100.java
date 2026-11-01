package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes4.dex */
public class C16100 extends C4146 {
    public static final long serialVersionUID = 0;

    public C16100(C22492 c22492, final InterfaceC2173 interfaceC2173, final C11948 c11948, final C23549 c23549, C4831 c4831) {
        super(c22492, new Supplier() { // from class: l.᩷ᩳۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                InterfaceC2173 interfaceC2174 = interfaceC2173;
                return c23549.m51914(interfaceC2174.mo6760() == EnumC11347.SOURCE ? "bad.source.file.header" : "bad.class.file.header", interfaceC2174, c11948);
            }
        }, c4831);
    }
}
