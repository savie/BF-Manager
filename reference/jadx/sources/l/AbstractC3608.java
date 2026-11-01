package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZC */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3608 implements InterfaceC4314, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;

    @Override // l.InterfaceC4314
    public String getName() {
        return null;
    }

    public Object readResolve() {
        return C13488.m32998(getName());
    }
}
