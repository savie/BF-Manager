package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ۘ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4203 extends AbstractC5615 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f15271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13377 f15272;

    public C4203(InterfaceC1423 interfaceC1423, C12484 c12484) {
        this.f15271 = interfaceC1423;
        this.f15272 = C13377.m32876(c12484);
    }

    @Override // l.AbstractC5615
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11856() {
        this.f15272.m32877();
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sbM40152 = C17214.m40152(128, "LoaderManager{");
        sbM40152.append(Integer.toHexString(System.identityHashCode(this)));
        sbM40152.append(" in ");
        Object obj = this.f15271;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sbM40152.append(simpleName);
        sbM40152.append('{');
        sbM40152.append(Integer.toHexString(System.identityHashCode(obj)));
        sbM40152.append("}}");
        return sbM40152.toString();
    }

    @Override // l.AbstractC5615
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11857(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f15272.m32878(str, fileDescriptor, printWriter, strArr);
    }
}
