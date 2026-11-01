package l;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21790 extends AbstractC8075 implements InterfaceC17952 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Matrix f70577;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Boolean f70578;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f70579 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public EnumC18262 f70580;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f70581;

    @Override // l.InterfaceC17952
    public final List getChildren() {
        return this.f70579;
    }

    @Override // l.InterfaceC17952
    /* JADX INFO: renamed from: ۙ */
    public final void mo6530(C8781 c8781) throws C8116 {
        if (c8781 instanceof C9796) {
            this.f70579.add(c8781);
            return;
        }
        throw new C8116("Gradient elements cannot contain " + c8781 + " elements.");
    }
}
