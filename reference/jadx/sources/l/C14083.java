package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46247 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34074(C23922 c23922, InterfaceC15456 interfaceC15456) {
        Class clsMo6762 = c23922.mo6762();
        C13465.m32963((Object) clsMo6762, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        this.f46247.add(new C2792(clsMo6762, interfaceC15456));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4909 m34073() {
        C2792[] c2792Arr = (C2792[]) this.f46247.toArray(new C2792[0]);
        return new C4909((C2792[]) Arrays.copyOf(c2792Arr, c2792Arr.length));
    }
}
