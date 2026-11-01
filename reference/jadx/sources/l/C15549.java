package l;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P7IE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15549 extends AbstractC23310 implements Serializable {
    public static final long serialVersionUID = 1;

    public C15549(int i) {
        super(EnumC11563.TERMINATE, EnumC11563.CONTINUE);
    }

    static {
        new C15549(EnumC11563.CONTINUE, EnumC11563.TERMINATE);
    }

    @Override // l.AbstractC23310, java.io.FileFilter
    public final boolean accept(File file) {
        return C5212.isSymbolicLink(C7412.toPath(file));
    }

    @Override // l.AbstractC23310
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11563 mo37189(InterfaceC3800 interfaceC3800) {
        return m51384(C5212.isSymbolicLink(interfaceC3800));
    }
}
