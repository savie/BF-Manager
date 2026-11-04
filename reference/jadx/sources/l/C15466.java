package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S7EN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f50375;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f50376;

    public C15466(String str, InterfaceC24329 interfaceC24329) {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329 == null ? C14631.get(str, new String[0]) : interfaceC24329.resolve(str);
        this.f50375 = interfaceC24329Resolve;
        try {
            this.f50376 = C3445.readAllLines(interfaceC24329Resolve, StandardCharsets.UTF_8);
        } catch (IOException unused) {
        }
    }
}
