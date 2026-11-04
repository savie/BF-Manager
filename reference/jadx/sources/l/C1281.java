package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.֨ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281 extends AbstractC0535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f4593;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10229 f4594;

    public C1281(InterfaceC11217 interfaceC11217, C23656 c23656) {
        this.f4593 = interfaceC11217;
        this.f4594 = C10229.m26365(c23656);
    }

    @Override // l.AbstractC0535
    /* JADX INFO: renamed from: ۙ */
    public final void mo2505() {
        this.f4594.m26367();
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sbM3018 = C0703.m3018(128, "LoaderManager{");
        sbM3018.append(Integer.toHexString(System.identityHashCode(this)));
        sbM3018.append(" in ");
        Object obj = this.f4593;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sbM3018.append(simpleName);
        sbM3018.append('{');
        sbM3018.append(Integer.toHexString(System.identityHashCode(obj)));
        sbM3018.append("}}");
        return sbM3018.toString();
    }

    @Override // l.AbstractC0535
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo2506(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4594.m26366(str, fileDescriptor, printWriter, strArr);
    }
}
