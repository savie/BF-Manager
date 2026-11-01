package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7EN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14318 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f46900;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f46901;

    public C14318(String str, InterfaceC3800 interfaceC3800) {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800 == null ? C22852.get(str, new String[0]) : interfaceC3800.resolve(str);
        this.f46900 = interfaceC3800Resolve;
        try {
            this.f46901 = C5212.readAllLines(interfaceC3800Resolve, StandardCharsets.UTF_8);
        } catch (IOException unused) {
        }
    }
}
